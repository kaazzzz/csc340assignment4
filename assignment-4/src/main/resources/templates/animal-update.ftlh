<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
          crossorigin="anonymous"></script>
  <title>Update Dog</title>
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

<div class="container" style="margin-top: 15px;">
  <h1>${title}</h1>
  <form id="update-dog" action="/dogs/update-form/${dog.dogId}" method="post">
    <input type="text" id="dogId" name="dogId" value="${dog.dogId}" readonly class="form-control mb-3"/>

    <input type="text" id="name" name="name" value="${dog.name}" placeholder="Name" class="form-control mb-3"/>

    <input type="text" id="breed" name="breed" value="${dog.breed}" placeholder="Breed" class="form-control mb-3"/>

    <input type="number" step="0.1" id="age" name="age" value="${dog.age}" placeholder="Age" class="form-control mb-3"/>

    <textarea id="description" name="description" placeholder="Description" rows="4" class="form-control mb-3">${dog.description}</textarea>

    <button type="submit" class="btn btn-primary">Save</button>
    <a href="/dogs/${dog.dogId}" class="btn btn-outline-danger">Cancel</a>
  </form>
</div>

</body>
</html>
