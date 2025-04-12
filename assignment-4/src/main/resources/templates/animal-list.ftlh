<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
    <title>Dog List</title>
    <link rel="stylesheet" type="text/css" href="/style.css">
</head>

<body>

<!-- Begin Nav Bar -->
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #799351;">
    <a class="navbar-brand" href="/dogs/all" style="margin: 10px;">
        <img src="/images/logo.jpg" alt="Dog Logo" width="80" height="60">
    </a>
    <ul class="nav justify-content-end">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/dogs/all">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Second</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="#">Third</a>
        </li>
    </ul>
</nav>
<!-- End Nav Bar -->

<div class="container" style="margin-top: 15px;">
    <h1>${title}</h1>

    <a href="/dogs/create-form" class="btn btn-outline-primary" style="float:right;">Create New Dog</a>

    <form action="/dogs/name" method="get" style="margin-bottom: 15px;">
        <input type="text" name="search" placeholder="Search By Name 🔍">
    </form>

    <!-- Dogs Table -->
    <table class="table table-striped rounded-3 overflow-hidden">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Breed</th>
        </tr>
        </thead>
        <tbody>
        <#list dogs as dog>
        <tr>
            <td>
                <a href="/dogs/${dog.dogId}" style="color:#000000">${dog.dogId}</a>
            </td>
            <td>${dog.name}</td>
            <td>
                <a href="/dogs/breed/${dog.breed}" style="color:#000000">${dog.breed}</a>
            </td>
        </tr>
        </#list>
        </tbody>
    </table>
</div>
</body>
</html>
