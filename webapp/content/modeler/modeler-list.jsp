<%@page contentType="text/html;charset=UTF-8"%>
<%@include file="/taglibs.jsp"%>
<%pageContext.setAttribute("currentHeader", "bpm-console");%>
<%pageContext.setAttribute("currentMenu", "process");%>
<!doctype html>
<html lang="en">

  <head>
    <%@include file="/common/meta.jsp"%>
    <title>模型</title>
    <%@include file="/common/s.jsp"%>
  </head>

  <body>
    <%@include file="/header/bpm-console.jsp"%>

    <div class="row-fluid">
	<%@include file="/menu/bpm-console.jsp"%>

	<!-- start of main -->
    <section id="m-main" class="span10" style="float:right">

<a href="modeler!open.do" class="btn">新建模型</a>
      <article class="m-widget">
        <header class="header">
		  <h4 class="title">列表</h4>
		</header>
		<div class="content">
  <table id="demoGrid" class="m-table table-hover">
    <thead>
      <tr>
        <th width="10" class="m-table-check"><input type="checkbox" name="checkAll" onchange="toggleSelectedItems(this.checked)"></th>
        <th class="sorting" name="id">id</th>
        <th class="sorting" name="name">key</th>
        <th class="sorting" name="name">name</th>
        <th class="sorting" name="name">version</th>
        <th class="sorting" name="name">category</th>
        <th class="sorting" name="name">createTime</th>
        <th class="sorting" name="name">lastUpdateTime</th>
        <th class="sorting" name="name">deploymentId</th>
        <th class="sorting" name="name">metaInfo</th>
        <th width="170">&nbsp;</th>
      </tr>
    </thead>

    <tbody>
      <s:iterator value="models" var="item">
      <tr>
        <td><input type="checkbox" class="selectedItem" name="selectedItem" value="${item.id}"></td>
	    <td>${item.id}</td>
	    <td>${item.key}</td>
	    <td>${item.name}</td>
	    <td>${item.version}</td>
	    <td>${item.category}</td>
	    <td>${item.createTime}</td>
	    <td>${item.lastUpdateTime}</td>
	    <td>${item.deploymentId}</td>
	    <td>${item.metaInfo}</td>
        <td>
		  <a href="modeler!open.do?id=${item.id}">编辑</a>
		  <a href="modeler!removeModeler.do?id=${item.id}">删除</a>
		  <a href="modeler!deploy.do?id=${item.id}">发布</a>
        </td>
      </tr>
      </s:iterator>
    </tbody>
  </table>
        </div>
      </article>

    </section>
	<!-- end of main -->
	</div>

  </body>

</html>
