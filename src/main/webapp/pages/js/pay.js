function checkAll() {
    payButton = document.getElementById("pay");
    var comment = document.getElementById("comment");
    var money = document.getElementById("money");
    var sources = document.getElementById("sources");
    var spanCheck = document.getElementById("error");
    if (comment.value.length == 0 | money.value.length == 0 | sources.value == 'dis' | comment.value.length < 5 | comment.value.length > 95 | (money.value).match(/^[-\+]?\d+/) === null | parseInt(money.value) < 0 | sources.value == 'dis') {
        payButton.disabled = true;
        spanCheck.innerHTML = "Input all fields correctly!";
    }
    else {
        payButton.disabled = false;
        spanCheck.innerHTML = "";
    }
}
function checkComment() {
    var payButton = document.getElementById("pay");
    var comment = document.getElementById("comment");
    var spanCheck = document.getElementById("error");

    if (comment.value.length < 5 || comment.value.length > 95) {
        payButton.disabled = true;
        spanCheck.innerHTML = "Comment is too small or very large!";
    }
    else {
        spanCheck.innerHTML = "";
        checkAll();

    }
}
function checkMoney() {
    payButton = document.getElementById("pay");
    var money = document.getElementById("money");
    var moneyCheck = document.getElementById("moneyError");
    if ((money.value).match(/^[-\+]?\d+/) === null | parseInt(money.value) < 0) {
        payButton.disabled = true;
        moneyCheck.innerHTML = "Input the the correct amount of money!";
    }
    else {
        moneyCheck.innerHTML = "";
        checkAll();
    }
}
function checkSources() {
    payButton = document.getElementById("pay");
    var sources = document.getElementById("sources");
    var Check = document.getElementById("error");
    if (sources.value == 'dis') {
        payButton.disabled = true;
        Check.innerHTML = "Choose! 'What we pay for?'!";
    }
    else {
        Check.innerHTML = "";
        checkAll();
    }
}
