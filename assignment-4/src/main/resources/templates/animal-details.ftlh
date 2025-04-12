<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
          integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
          crossorigin="anonymous"></script>
  <title>Dog Details</title>

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
  <div class="card">
    <h5 class="card-header">${dog.name}</h5>

    <div class="card-body">
            <span style="float:right">
                <a href="/dogs/update-form/${dog.dogId}" class="btn btn-primary">Edit Dog</a>
            </span>
      <h5 class="card-title">ID: ${dog.dogId}</h5>
      <p class="card-text">Name: ${dog.name}</p>
      <p class="card-text">Breed: ${dog.breed}</p>
      <p class="card-text">Age: ${dog.age}</p>
      <p class="card-text">Description: ${dog.description}</p>

      <a href="/dogs/delete/${dog.dogId}" class="btn btn-danger">Delete Dog</a>
      <a href="/dogs/all" class="btn btn-primary">Go back</a>
    </div>
  </div>
</div>
</body>
</html>
