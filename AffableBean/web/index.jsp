<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : index
    Created on : 28 janv. 2016, 13:04:56
    Author     : Vu Jean-Luc
--%>

<sql:query var="categories" dataSource="jdbc/affablebean">
    SELECT * FROM category
</sql:query>
    
            <div id="indexLeftColumn">
                <div id="welcomeText">
                    <p>[ welcome text ]</p>
                    
                    <!testto access context parameters >
                    categoryImagePath: ${initParam.categoryImagePath}
                    productImagePath: ${initParam.productImagePath}
                </div>
            </div>
            <div id="indexRightColumn">
                <c:forEach var="category" items="${categories.rows}">
                    <div class="categoryBox">
                        <a href="category?${category.id}">
                            <span class="categoryLabelText">${category.name}</span>
                            <img
                            src="${initParam.categoryImagePath}${category.name}.jpg"
                                alt="${category.name}">
                        </a>
                    </div>
                </c:forEach>
            </div>