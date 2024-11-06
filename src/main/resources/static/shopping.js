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

$.getJSON("/get", fetch_list);
