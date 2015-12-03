<%--
  Loads file to Dropbox.
  User: Qwerty
  Date: 12/3/2015
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="//cdnjs.cloudflare.com/ajax/libs/dropbox.js/0.10.2/dropbox.min.js" />
<link rel="stylesheet" href="style.css">

<center>
    <button id="writeButton">Click to create <code>hello.txt</code> in Dropbox.</button>
</center>

<script>
    var client;
    initClient();

    /**
     * Initialize Dropbox client.
     */
    function initClient() {
        if (client.isAuthenticated()) {return;}
        client = new Dropbox.Client({key: '6v0zjx26s6pha23'});

        // Try to complete OAuth flow.
        client.authenticate({interactive: false}, function (error, client) {
            if (error) {
                alert('Error: ' + error);
            }
        });
    }

    /**
     * Write input file to Dropbox.
     * @param file - file, that should be written
     */
    function writeAFile(file) {
        if (!client.isAuthenticated()){alert('Can\'t write file! Error: authentication fail.')}
        client.writeFile('hello.txt', 'Hello, World!', function (error) {
            if (error) {
                alert('Can\'t write file! Error: ' + error);
            } else {
                alert('File\'s been written successfully!');
            }
        });
    }

    /**
     * Read file wthi the specified name from Dropbox.
     * @param fileName - specified file name
     */
    function readAFile(fileName) {
        if (!client.isAuthenticated()){alert('Can\'t read file! Error: authentication fail.')}
        client.readFile("hello_world.txt", function(error, data) {
            if (error) {
                alert('Can\'t read file! Error: ' + error);
            }
        });
    }

    document.getElementById('writeButton').onclick = function () {
        client.authenticate(function (error, client) {
            if (error) {
                alert('Error: ' + error);
            } else {
                writeToDropbox();
            }
        });
    }
</script>
