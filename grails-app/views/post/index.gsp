<%--
  Created by IntelliJ IDEA.
  User: randy
  Date: 2/7/13
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>List of Posts</title>
  <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'main.css')}" />
</head>
<body>
<div>
    <ul>
        <g:each in="${posts}">
            <li>
                <img src="${resource(dir: 'images/posts', file: it.image)}" width=100 height=100>
                <h3>${it.title}</h3>
                <p>${it.description}</p>
            </li>
        </g:each>
    </ul>

    <g:form action="newPost" enctype="multipart/form-data" method='POST'>
        <fieldset class="form">
            <div class="fieldcontain ${hasErrors(bean: post, field: 'title', 'error')} ">
                <label for="title">
                    <g:message code="post.title.label" default="Title" />

                </label>
                <g:textField name="title" value=""/>
            </div>

            <div class="fieldcontain ${hasErrors(bean: post, field: 'description', 'error')} ">
                <label for="description">
                    <g:message code="post.description.label" default="Description" />

                </label>
                <g:textField name="description" value=""/>
            </div>

            <div class="fieldcontain ${hasErrors(bean: post, field: 'image', 'error')} ">
                <label for="image">
                    <g:message code="post.image.label" default="Image" />

                </label>

                <input type="file" name="image" />

            </div>

            <g:submitButton name="save" class="save" value="Save Post" />
        </fieldset>
    </g:form>
</div>

</body>
</html>