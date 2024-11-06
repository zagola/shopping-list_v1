var fetch_list = function(data) {
    $("#shoppinglist").html("");
    for (let i = 0; i < data.length; i++) {
            let text = data[i]["item"]
            let id = data[i]["id"]

            $("#shoppinglist").append(
                `<div id=\"${id}\" class=\"is-primary notification\">` +
                `    ${text}` +
                `    <button class=\"delete is-large\"></button>` +
                `</div>`);
        }
    console.log(data);
}

var add_done = function(){
    $.getJSON("/get", fetch_list);
}

var add_item = function() {
    var newItem = $("#newItem").val();
    $.post({
    url: "/add",
    data: JSON.stringify({item : newItem}),
    contentType: 'application/json; charset=utf-8'
    }).done(add_done);
}

var document_ready = function() {
    $("#add").click(add_item);
}

$.getJSON("/get", fetch_list);
$(document).ready(document_ready);
