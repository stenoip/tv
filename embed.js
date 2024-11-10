// embed.js
function loadStrimmChannel() {
    var strimmUrl = "strimm.com/stenovids/stenovids"; // Replace with your Strimm channel URL
    var iframe = document.createElement("iframe");
    iframe.src = strimmUrl;
    iframe.width = "800";
    iframe.height = "600";
    iframe.style.border = "none";
    document.getElementById("strimm-embed").appendChild(iframe);
}

window.onload = loadStrimmChannel;
