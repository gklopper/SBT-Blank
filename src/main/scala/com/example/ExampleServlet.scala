package com.example

import org.scalatra.ScalatraServlet

class ExampleServlet extends ScalatraServlet {

  get("/hello") {

    contentType = "text/html; charset=UTF-8"

    <html>
      <head>
        <title>Hello</title>
      </head>
      <body>
        <h1>Hello World</h1>
      </body>
    </html>
  }

}
