/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2016-11-13 22:18:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/nik/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384357662000L));
    _jspx_dependants.put("/pages/css/table.css", Long.valueOf(1479073991140L));
    _jspx_dependants.put("file:/C:/Users/nik/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1476002715500L));
    _jspx_dependants.put("/pages/css/admin.css", Long.valueOf(1479036811107L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Administration Page</title>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("    ");
      out.write("@import url(//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);\r\n");
      out.write("\r\n");
      out.write("@import url(http://fonts.googleapis.com/css?family=Titillium+Web:300);\r\n");
      out.write(".fa-2x {\r\n");
      out.write("    font-size: 2em;\r\n");
      out.write("}\r\n");
      out.write(".fa {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: table-cell;\r\n");
      out.write("    width: 60px;\r\n");
      out.write("    height: 36px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".main-menu:hover,nav.main-menu.expanded {\r\n");
      out.write("    width:250px;\r\n");
      out.write("    overflow:visible;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu {\r\n");
      out.write("    background: url(https://dl.dropboxusercontent.com/u/159328383/background.jpg) no-repeat center center fixed;\r\n");
      out.write("    border-right:1px solid #e5e5e5;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    top:0;\r\n");
      out.write("    bottom:0;\r\n");
      out.write("    height:100%;\r\n");
      out.write("    left:0;\r\n");
      out.write("    width:60px;\r\n");
      out.write("    overflow:hidden;\r\n");
      out.write("    -webkit-transition:width .05s linear;\r\n");
      out.write("    transition:width .05s linear;\r\n");
      out.write("    -webkit-transform:translateZ(0) scale(1,1);\r\n");
      out.write("    z-index:1000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu>ul {\r\n");
      out.write("    margin:7px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu li {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    display:block;\r\n");
      out.write("    width:250px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu li>a {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    display:table;\r\n");
      out.write("    border-collapse:collapse;\r\n");
      out.write("    border-spacing:0;\r\n");
      out.write("    color:#999;\r\n");
      out.write("    font-family: arial;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    text-decoration:none;\r\n");
      out.write("    -webkit-transform:translateZ(0) scale(1,1);\r\n");
      out.write("    -webkit-transition:all .1s linear;\r\n");
      out.write("    transition:all .1s linear;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu .nav-icon {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    display:table-cell;\r\n");
      out.write("    width:60px;\r\n");
      out.write("    height:36px;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    vertical-align:middle;\r\n");
      out.write("    font-size:18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu .nav-text {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    display:table-cell;\r\n");
      out.write("    vertical-align:middle;\r\n");
      out.write("    width:190px;\r\n");
      out.write("    font-family: 'Titillium Web', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu>ul.logout {\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    left:0;\r\n");
      out.write("    bottom:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".no-touch .scrollable.hover {\r\n");
      out.write("    overflow-y:hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".no-touch .scrollable.hover:hover {\r\n");
      out.write("    overflow-y:auto;\r\n");
      out.write("    overflow:visible;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover,a:focus {\r\n");
      out.write("    text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav {\r\n");
      out.write("    -webkit-user-select:none;\r\n");
      out.write("    -moz-user-select:none;\r\n");
      out.write("    -ms-user-select:none;\r\n");
      out.write("    -o-user-select:none;\r\n");
      out.write("    user-select:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav ul,nav li {\r\n");
      out.write("    outline:0;\r\n");
      out.write("    margin:0;\r\n");
      out.write("    padding:0;\r\n");
      out.write("}\r\n");
      out.write(".main-menu li:hover>a,nav.main-menu li.active>a,.dropdown-menu>li>a:hover,.dropdown-menu>li>a:focus,.dropdown-menu>.active>a,.dropdown-menu>.active>a:hover,.dropdown-menu>.active>a:focus,.no-touch .dashboard-page nav.dashboard-menu ul li:hover a,.dashboard-page nav.dashboard-menu ul li.active a {\r\n");
      out.write("    color:#fff;\r\n");
      out.write("    background-color:#5fa2db;\r\n");
      out.write("}\r\n");
      out.write(".area {\r\n");
      out.write("    float: left;\r\n");
      out.write("    background: #e2e2e2;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("}\r\n");
      out.write("@font-face {\r\n");
      out.write("    font-family: 'Titillium Web';\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    src: local('Titillium WebLight'), local('TitilliumWeb-Light'), url(http://themes.googleusercontent.com/static/fonts/titilliumweb/v2/anMUvcNT0H1YN4FII8wpr24bNCNEoFTpS2BTjF6FB5E.woff) format('woff');\r\n");
      out.write("}\r\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        ");
      out.write("@charset \"UTF-8\";\n");
      out.write("@import url(http://fonts.googleapis.com/css?family=Open+Sans:300,400,700);\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  box-sizing: border-box;\n");
      out.write("  height: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("*, *:before, *:after {\n");
      out.write("  box-sizing: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background-color: #211f23;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  *zoom: 1;\n");
      out.write("  filter: progid:DXImageTransform.Microsoft.gradient(gradientType=1, startColorstr='#FF53455B', endColorstr='#FF201E22');\n");
      out.write("  background-image: url('data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz4gPHN2ZyB2ZXJzaW9uPSIxLjEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PGRlZnM+PHJhZGlhbEdyYWRpZW50IGlkPSJncmFkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgY3g9IjUwJSIgY3k9IjAlIiByPSI3MCUiPjxzdG9wIG9mZnNldD0iMCUiIHN0b3AtY29sb3I9IiM1MzQ1NWIiLz48c3RvcCBvZmZzZXQ9IjcwJSIgc3RvcC1jb2xvcj0iIzIwMWUyMiIvPjwvcmFkaWFsR3JhZGllbnQ+PC9kZWZzPjxyZWN0IHg9IjAiIHk9IjAiIHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIGZpbGw9InVybCgjZ3JhZCkiIC8+PC9zdmc+IA==');\n");
      out.write("  background-size: 100%;\n");
      out.write("  background-image: -moz-radial-gradient(circle at top, #53455b 0%, #201e22 70%);\n");
      out.write("  background-image: -webkit-radial-gradient(circle at top, #53455b 0%, #201e22 70%);\n");
      out.write("  background-image: radial-gradient(circle at top, #53455b 0%, #201e22 70%);\n");
      out.write("  font-family: 'Open Sans', sans-serif;\n");
      out.write("  font-weight: 300;\n");
      out.write("  line-height: 1.42em;\n");
      out.write("  color:#A7A1AE;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login {\n");
      out.write("  padding: 15px;\n");
      out.write("  width: 1150px;\n");
      out.write("  min-height: 500px;\n");
      out.write("  margin: 2% auto 0 auto;\n");
      out.write("}\n");
      out.write(".login .heading {\n");
      out.write("  text-align: center;\n");
      out.write("  margin-top: 1%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  font-size:5em;\n");
      out.write("  font-weight: 300;\n");
      out.write("  line-height:1em;\n");
      out.write("  text-align: center;\n");
      out.write("  color: #4DC3FA;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("  font-size:1em;\n");
      out.write("  font-weight: 300;\n");
      out.write("  text-align: center;\n");
      out.write("  display: block;\n");
      out.write("  line-height:1em;\n");
      out.write("  padding-bottom: 2em;\n");
      out.write("  color: #FB667A;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 a {\n");
      out.write("  font-weight: 700;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("  color: #FB667A;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".blue { color: #185875; }\n");
      out.write(".yellow { color: #FFF842; }\n");
      out.write("\n");
      out.write(".container th h1 {\n");
      out.write("  font-weight: bold;\n");
      out.write("  font-size: 1em;\n");
      out.write("  text-align: left;\n");
      out.write("  color: #185875;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container td {\n");
      out.write("  font-weight: normal;\n");
      out.write("  font-size: 1em;\n");
      out.write("  -webkit-box-shadow: 0 2px 2px -2px #0E1119;\n");
      out.write("  -moz-box-shadow: 0 2px 2px -2px #0E1119;\n");
      out.write("  box-shadow: 0 2px 2px -2px #0E1119;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  text-align: left;\n");
      out.write("  overflow: hidden;\n");
      out.write("  width: 100%;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  display: table;\n");
      out.write("  padding: 0 0 8em 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container td, .container th {\n");
      out.write("  padding-bottom: 2%;\n");
      out.write("  padding-top: 2%;\n");
      out.write("  padding-left:2%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Background-color of the odd rows */\n");
      out.write(".container tr:nth-child(odd) {\n");
      out.write("  background-color: rgba(50, 60, 80, 0.25);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Background-color of the even rows */\n");
      out.write(".container tr:nth-child(even) {\n");
      out.write("  background-color: rgba(44, 52, 70, 0.41);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container th {\n");
      out.write("  background-color: rgba(31, 39, 57, 0.31);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container td:first-child { color: #FB667A; }\n");
      out.write("\n");
      out.write(".container tr:hover {\n");
      out.write("  background-color: #464A52;\n");
      out.write("  -webkit-box-shadow: 0 6px 6px -6px #0E1119;\n");
      out.write("  -moz-box-shadow: 0 6px 6px -6px #0E1119;\n");
      out.write("  box-shadow: 0 6px 6px -6px #0E1119;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container td:hover {\n");
      out.write("  background-color: #FFF842;\n");
      out.write("  color: #403E10;\n");
      out.write("  font-weight: bold;\n");
      out.write("\n");
      out.write("  box-shadow: #7F7C21 -1px 1px, #7F7C21 0px 2px, #7F7C21 -3px 3px, #7F7C21 -4px 4px, #7F7C21 -5px 5px, #7F7C21 -6px 6px;\n");
      out.write("  transform: translate3d(6px, -6px, 0);\n");
      out.write("\n");
      out.write("  transition-delay: 0s;\n");
      out.write("  transition-duration: 0.4s;\n");
      out.write("  transition-property: all;\n");
      out.write("  transition-timing-function: line;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (max-width: 800px) {\n");
      out.write("  .container td:nth-child(4),\n");
      out.write("  .container th:nth-child(4) { display: none; }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button {\n");
      out.write("  color: #aaa;\n");
      out.write("  cursor: pointer;\n");
      out.write("  vertical-align: middle;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".edit:hover {\n");
      out.write("  color: #0a79df;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@import url('http://fonts.googleapis.com/css?family=Lato');\n");
      out.write("\n");
      out.write("\n");
      out.write(".control {\n");
      out.write("  display: block;\n");
      out.write("  width: auto;\n");
      out.write("  height: auto;\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  box-shadow: none;\n");
      out.write("  background: none;\n");
      out.write("  border-radius: 0px;\n");
      out.write("  padding: 10px;\n");
      out.write("  font-weight: normal;\n");
      out.write("  font-size: 1em;\n");
      out.write("  width: 100%;\n");
      out.write("  background: transparent;\n");
      out.write("  color: #c2b8b1;\n");
      out.write("}");
      out.write("\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"login\" >\n");
      out.write("    <div class=\"heading\" >\n");
      out.write("        <h1>Administration<span class=\"yellow\"> Page</span></h1>\n");
      out.write("        <nav class=\"main-menu\">\n");
      out.write("    <ul>\n");
      out.write("        <li>\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin\">\n");
      out.write("                <i class=\"fa fa-home fa-2x\"></i>\n");
      out.write("                <span class=\"nav-text\">\n");
      out.write("                            Admin page\n");
      out.write("                        </span>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("        </li>\n");
      out.write("        <li class=\"has-subnav\">\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/home?admin=true\">\n");
      out.write("                <i class=\"fa fa-laptop fa-2x\"></i>\n");
      out.write("                <span class=\"nav-text\">\n");
      out.write("                            Home\n");
      out.write("                        </span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"logout\">\n");
      out.write("        <li>\n");
      out.write("            ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logoutUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <i class=\"fa fa-power-off fa-2x\"></i>\n");
      out.write("                <span class=\"nav-text\">\n");
      out.write("                            Logout\n");
      out.write("                        </span>\n");
      out.write("            </a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table class=\"container\">\n");
      out.write("    <thead>\n");
      out.write("    <tr>\n");
      out.write("        <th>Admin</th>\n");
      out.write("        <th >Login</th>\n");
      out.write("        <th >Name</th>\n");
      out.write("        <th >Surname</th>\n");
      out.write("        <th >Email</th>\n");
      out.write("        <th >Bank Account</th>\n");
      out.write("        <th >Role</th>\n");
      out.write("        <th ></th>\n");
      out.write("    </tr>\n");
      out.write("    </thead>\n");
      out.write("\n");
      out.write("    <tbody>\n");
      out.write("    ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /pages/admin.jsp(51,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/logout");
    // /pages/admin.jsp(51,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("logoutUrl");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /pages/admin.jsp(79,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("List");
    // /pages/admin.jsp(79,4) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/pages/admin.jsp(79,4) '${userList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${userList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /pages/admin.jsp(80,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/pages/admin.jsp(80,4) '${List}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${List}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /pages/admin.jsp(80,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("u");
    // /pages/admin.jsp(80,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <form action=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/admin/add\">\n");
          out.write("        <tr>\n");
          out.write("            <td >\n");
          out.write("\n");
          out.write("                <input type=\"checkbox\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"admin\">\n");
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td >\n");
          out.write("                <input type=\"input\" class=\"control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.login}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" placeholder=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.login}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"login\">\n");
          out.write("            </td >\n");
          out.write("            <td >\n");
          out.write("                <input type=\"input\" class=\"control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" placeholder=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"name\">\n");
          out.write("            </td>\n");
          out.write("            <td >\n");
          out.write("                <input type=\"input\" class=\"control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.surname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" placeholder=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.surname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"surname\">\n");
          out.write("            </td>\n");
          out.write("            <td >\n");
          out.write("                <input type=\"input\" class=\"control\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" placeholder=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"email\">\n");
          out.write("            </td>\n");
          out.write("            <td >\n");
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td >\n");
          out.write("\n");
          out.write("            </td>\n");
          out.write("            <td >\n");
          out.write("                <button type=\"input\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\" name=\"id\">Save</button>\n");
          out.write("            </td>\n");
          out.write("        </tr>\n");
          out.write("        </form>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
