function startApp(){
    alert("LOGIN : root" +
        "\nPASSWORD : root" +
        "\n for admin page!")
}

function comparePasswords() {
    var error = document.getElementById('error');
    submitButton = document.getElementById('okButton');
    var pass = document.getElementById('pass');
    var repeate = document.getElementById('repeatePass');

    if (pass.value > 29) {
        submitButton.disabled = true;
        error.innerHTML = "Password should be less than 30 symbs";
    }
    else {
        if (pass.value != repeate.value) {
            submitButton.disabled = true;
            error.innerHTML = "Password mismatch!!!";
        }
        else {
            error.innerHTML = "";
            registration();
        }
    }
}

function registration() {
    var login = document.getElementById('login');
    var name = document.getElementById('name');
    var surname = document.getElementById('surname');
    var email = document.getElementById('email');
    var pass = document.getElementById('pass');
    var inputsSpan = document.getElementById('allInputs');
    submitButton = document.getElementById('okButton');

    if (login.value.length == 0 | name.value.length == 0 | surname.value.length == 0 | email.value.length == 0 | pass.value.length == 0) {
        submitButton.disabled = true;
        inputsSpan.innerHTML = "There are empty fields!";
    }
    else {
        inputsSpan.innerHTML = "";
        submitButton.disabled = false;
    }
}

function loginCheck() {
    var loginSpan = document.getElementById('loginSpan');
    var login = document.getElementById('login');
    submitButton = document.getElementById('okButton');

    if (login.value.length < 5 || login.value.length > 25) {
        submitButton.disabled = true;
        loginSpan.innerHTML = "Incorrect login length!";
    }
    else {
        loginSpan.innerHTML = "";
        registration();
    }
}

function nameCheck() {
    var name = document.getElementById('name');
    submitButton = document.getElementById('okButton');
    var nameSpan = document.getElementById('nameSpan');
    if (name.value.length < 2 || name.value.length > 28) {
        submitButton.disabled = true;
        nameSpan.innerHTML = "Incorrect name length!";
    }
    else {
        registration();
        nameSpan.innerHTML = "";
    }
}