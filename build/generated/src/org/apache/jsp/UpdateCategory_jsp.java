package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Header.jspf");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <body>         \n");
      out.write("        ");
      out.write('\n');
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"UserControl\">Products Page</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExampleDefault\" aria-controls=\"navbarsExampleDefault\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                    Accounts\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"Signup.jsp\">Add Accounts</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"ShowAccountControl\">Accounts Management</a>\n");
      out.write("                </div>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                    Categories\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"AddCategories.jsp\">Add Categories</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"ShowCategoriesControl\">Categories Management</a>\n");
      out.write("                </div>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\n");
      out.write("                    Products\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"AddProducts.jsp\">Add Products</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"ShowProductsControl\">Products Management</a>\n");
      out.write("                </div>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <form action=\"SearchControl\" method=\"post\" class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <div class=\"input-group input-group-sm\">\n");
      out.write("                <input name=\"txt\" type=\"text\" class=\"form-control\" aria-label=\"Small\" aria-describedby=\"inputGroup-sizing-sm\" placeholder=\"Search...\">\n");
      out.write("                <div class=\"input-group-append\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-secondary btn-number\">\n");
      out.write("                        <i class=\"fa fa-search\"></i>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"btn btn-success btn-sm ml-3\" href=\"Cart.jsp\">\n");
      out.write("                <i class=\"fa fa-shopping-cart\"></i> Cart\n");
      out.write("                <span class=\"badge badge-light\"></span>\n");
      out.write("            </a>\n");
      out.write("        </form>\n");
      out.write("        <a class=\"btn btn-success btn-sm ml-3\" href=\"LogoutControl\">\n");
      out.write("            <i class=\"fa fa-sign-out\"></i> Logout\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <a class=\"btn btn-success btn-sm ml-3\" href=\"Signup.jsp\">\n");
      out.write("            <i class=\"fa fa-upload\"></i> Sign up\n");
      out.write("\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("        <div id=\"login\">\n");
      out.write("            <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${CatID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div id=\"login-row\" class=\"row justify-content-center align-items-center\">\n");
      out.write("                    <div id=\"login-column\" class=\"col-md-6\">\n");
      out.write("                        <div id=\"login-box\" class=\"col-md-12\">\n");
      out.write("                            <form id=\"login-form\" class=\"form\" action=\"UpdateCategoryControl\" method=\"post\">\n");
      out.write("                                <h3 class=\"text-center text-info\">Update category</h3>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label  class=\"text-info\">Category Name:</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"catNameUpdate\" placeholder=\"Enter Product Name\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label  class=\"text-info\">Description</label><br>\n");
      out.write("                                    <input type=\"text\" name=\"catMemoUpdate\" placeholder=\"Enter Description\" class=\"form-control\" required>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"submit\" value=\"Submit\" />\n");
      out.write("                            </form>\n");
      out.write("                            <br>\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"UserControl\" role=\"button\">Home</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Electronic Shopping Site</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"Scripts/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Scripts/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <footer class=\"text-light\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-lg-4 col-xl-3\">\n");
      out.write("                    <h5>About</h5>\n");
      out.write("                    <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                    <p class=\"mb-0\">\n");
      out.write("                        Over 10 years of selling electronics. Serve you is our pleasure.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                    <h5>Informations</h5>\n");
      out.write("                    <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"\">Link 1</a></li>\n");
      out.write("                        <li><a href=\"\">Link 2</a></li>\n");
      out.write("                        <li><a href=\"\">Link 3</a></li>\n");
      out.write("                        <li><a href=\"\">Link 4</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto\">\n");
      out.write("                    <h5>Others links</h5>\n");
      out.write("                    <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"\">Link 1</a></li>\n");
      out.write("                        <li><a href=\"\">Link 2</a></li>\n");
      out.write("                        <li><a href=\"\">Link 3</a></li>\n");
      out.write("                        <li><a href=\"\">Link 4</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-lg-3 col-xl-3\">\n");
      out.write("                    <h5>Contact</h5>\n");
      out.write("                    <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><i class=\"fa fa-home mr-2\"></i> My company</li>\n");
      out.write("                        <li><i class=\"fa fa-envelope mr-2\"></i> email@example.com</li>\n");
      out.write("                        <li><i class=\"fa fa-phone mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                        <li><i class=\"fa fa-print mr-2\"></i> + 33 12 14 15 16</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 copyright mt-3\">\n");
      out.write("                    <p class=\"float-left\">\n");
      out.write("                        <a href=\"#\">Back to top</a>\n");
      out.write("                    </p>\n");
      out.write("                    <p class=\"text-right text-muted\">created with <i class=\"fa fa-heart\"></i> by <a href=\"https://t-php.fr/43-theme-ecommerce-bootstrap-4.html\"><i>t-php</i></a> | <span>v. 1.0</span></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${TTDN == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    ");
        if (true) {
          _jspx_page_context.forward("Login.jsp");
          return true;
        }
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
