/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2016-11-22 10:59:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/nik/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384357662000L));
    _jspx_dependants.put("file:/C:/Users/nik/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1476002715500L));
    _jspx_dependants.put("/pages/css/style.css", Long.valueOf(1479375152370L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>MEGAPROJECT</title>\n");
      out.write("    <style>\n");
      out.write("    ");
      out.write("@import url(https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,700);\n");
      out.write("@import url(https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css);\n");
      out.write("@import url(https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css);\n");
      out.write("* {\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("html {\n");
      out.write("  background: url(https://dl.dropboxusercontent.com/u/159328383/background.jpg) no-repeat center center fixed;\n");
      out.write("  -webkit-background-size: cover;\n");
      out.write("  -moz-background-size: cover;\n");
      out.write("  -o-background-size: cover;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  background: transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body, input, button {\n");
      out.write("  font-family: 'Source Sans Pro', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login {\n");
      out.write("  padding: 15px;\n");
      out.write("  width: 400px;\n");
      out.write("  min-height: 400px;\n");
      out.write("  margin: 2% auto 0 auto;\n");
      out.write("}\n");
      out.write(".login .heading {\n");
      out.write("  text-align: center;\n");
      out.write("  margin-top: 1%;\n");
      out.write("}\n");
      out.write(".login .heading h2 {\n");
      out.write("  font-size: 3em;\n");
      out.write("  font-weight: 300;\n");
      out.write("  color: rgba(255, 255, 255, 0.7);\n");
      out.write("  display: inline-block;\n");
      out.write("  padding-bottom: 5px;\n");
      out.write("  text-shadow: 1px 1px 3px #23203b;\n");
      out.write("}\n");
      out.write(".login form .input-group {\n");
      out.write("  border-bottom: 1px solid rgba(255, 255, 255, 0.1);\n");
      out.write("  border-top: 1px solid rgba(255, 255, 255, 0.1);\n");
      out.write("}\n");
      out.write(".login form .input-group:last-of-type {\n");
      out.write("  border-top: none;\n");
      out.write("}\n");
      out.write(".login form .input-group span {\n");
      out.write("  background: transparent;\n");
      out.write("  min-width: 53px;\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write(".login form .input-group span i {\n");
      out.write("  font-size: 1.5em;\n");
      out.write("  color: rgba(255, 255, 255, 0.2);\n");
      out.write("}\n");
      out.write(".login form input.form-control {\n");
      out.write("  display: block;\n");
      out.write("  width: auto;\n");
      out.write("  height: auto;\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  box-shadow: none;\n");
      out.write("  background: none;\n");
      out.write("  border-radius: 0px;\n");
      out.write("  padding: 10px;\n");
      out.write("  font-size: 1.6em;\n");
      out.write("  width: 100%;\n");
      out.write("  background: transparent;\n");
      out.write("  color: #c2b8b1;\n");
      out.write("}\n");
      out.write(".login form input.form-control:focus {\n");
      out.write("  border: none;\n");
      out.write("}\n");
      out.write(".login form button {\n");
      out.write("  margin-top: 20px;\n");
      out.write("  background: #27AE60;\n");
      out.write("  border: none;\n");
      out.write("  font-size: 1.6em;\n");
      out.write("  font-weight: 300;\n");
      out.write("  padding: 5px 0;\n");
      out.write("  width: 100%;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  color: #b3eecc;\n");
      out.write("  border-bottom: 4px solid #1e8449;\n");
      out.write("}\n");
      out.write(".login form button:hover {\n");
      out.write("  background: #30b166;\n");
      out.write("  -webkit-animation: hop 1s;\n");
      out.write("  animation: hop 1s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".float {\n");
      out.write("  display: inline-block;\n");
      out.write("  -webkit-transition-duration: 0.3s;\n");
      out.write("  transition-duration: 0.3s;\n");
      out.write("  -webkit-transition-property: transform;\n");
      out.write("  transition-property: transform;\n");
      out.write("  -webkit-transform: translateZ(0);\n");
      out.write("  transform: translateZ(0);\n");
      out.write("  box-shadow: 0 0 1px transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".float:hover, .float:focus, .float:active {\n");
      out.write("  -webkit-transform: translateY(-3px);\n");
      out.write("  transform: translateY(-3px);\n");
      out.write("}\n");
      out.write(".error{\n");
      out.write("  color: rgba(255, 26, 28, 0.95);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".success{\n");
      out.write("  color: rgba(94, 255, 110, 0.95);\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Large Devices, Wide Screens */\n");
      out.write("@media only screen and (max-width: 1200px) {\n");
      out.write("  .login {\n");
      out.write("    width: 600px;\n");
      out.write("    font-size: 2em;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("@media only screen and (max-width: 1100px) {\n");
      out.write("  .login {\n");
      out.write("    margin-top: 2%;\n");
      out.write("    width: 600px;\n");
      out.write("    font-size: 1.7em;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/* Medium Devices, Desktops */\n");
      out.write("@media only screen and (max-width: 992px) {\n");
      out.write("  .login {\n");
      out.write("    margin-top: 1%;\n");
      out.write("    width: 550px;\n");
      out.write("    font-size: 1.7em;\n");
      out.write("    min-height: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/* Small Devices, Tablets */\n");
      out.write("@media only screen and (max-width: 768px) {\n");
      out.write("  .login {\n");
      out.write("    margin-top: 0;\n");
      out.write("    width: 500px;\n");
      out.write("    font-size: 1.3em;\n");
      out.write("    min-height: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/* Extra Small Devices, Phones */\n");
      out.write("@media only screen and (max-width: 480px) {\n");
      out.write("  .login {\n");
      out.write("    margin-top: 0;\n");
      out.write("    width: 400px;\n");
      out.write("    font-size: 1em;\n");
      out.write("    min-height: 0;\n");
      out.write("  }\n");
      out.write("  .login h2 {\n");
      out.write("    margin-top: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/* Custom, iPhone Retina */\n");
      out.write("@media only screen and (max-width: 320px) {\n");
      out.write("  .login {\n");
      out.write("    margin-top: 0;\n");
      out.write("    width: 200px;\n");
      out.write("    font-size: 0.7em;\n");
      out.write("    min-height: 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"login\" >\n");
      out.write("    <h1>Megaproject Payments</h1>\n");
      out.write("    <div class=\"heading\">\n");
      out.write("        <h2>Sign in</h2>\n");
      out.write("        <p>\n");
      out.write("            <span class=\"success\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${success}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("            <div class=\"input-group input-group-lg\">\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Username\" name=\"login\" id=\"login\">\n");
      out.write("            </div>\n");
      out.write("            <span class=\"error\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("\n");
      out.write("            <div class=\"input-group input-group-lg\">\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\n");
      out.write("                <input type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"password\" id=\"password\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"float\">Ok</button>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <button type=\"submit\" class=\"float\">Clean</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/signup\">\n");
      out.write("            <button type=\"submit\" class=\"float\">Sign Up</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
    // /pages/login.jsp(24,8) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/j_spring_security_check");
    // /pages/login.jsp(24,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("loginUrl");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
