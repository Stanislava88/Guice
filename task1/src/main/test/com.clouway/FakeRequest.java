package com.clouway;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.Part;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Kristiyan Petkov  <kristiqn.l.petkov@gmail.com> on 31.05.16.
 */
public class FakeRequest implements HttpServletRequest {
  private Map<String, String> parameters = new HashMap<String, String>();
  private Map<String, Object> attributes = new HashMap<String, Object>();
  private HttpSession session;

  public FakeRequest(FakeHttpSession session) {
    this.session = session;
  }

  public FakeRequest() {
  }

  public Object getAttribute(String s) {
    return attributes.get(s);
  }


  public void setAttribute(String s, Object o) {
    attributes.put(s,o);
  }

  public void setSession(HttpSession session){
    this.session=session;
  }

  public void setParameter(String link, String value){
  parameters.put(link, value);
  }

  public HttpSession getSession() {
    return session;
  }

  public String getAuthType() {
    return null;
  }

  public Cookie[] getCookies() {
    return new Cookie[0];
  }

  public long getDateHeader(String s) {
    return 0;
  }

  public String getHeader(String s) {
    return null;
  }

  public Enumeration<String> getHeaders(String s) {
    return null;
  }

  public Enumeration<String> getHeaderNames() {
    return null;
  }

  public int getIntHeader(String s) {
    return 0;
  }

  public String getMethod() {
    return null;
  }

  public String getPathInfo() {
    return null;
  }

  public String getPathTranslated() {
    return null;
  }

  public String getContextPath() {
    return null;
  }

  public String getQueryString() {
    return null;
  }

  public String getRemoteUser() {
    return null;
  }

  public boolean isUserInRole(String s) {
    return false;
  }

  public Principal getUserPrincipal() {
    return null;
  }

  public String getRequestedSessionId() {
    return null;
  }

  public String getRequestURI() {
    return null;
  }

  public StringBuffer getRequestURL() {
    return null;
  }

  public String getServletPath() {
    return null;
  }

  public HttpSession getSession(boolean b) {
    return null;
  }


  public String changeSessionId() {
    return null;
  }

  public boolean isRequestedSessionIdValid() {
    return false;
  }

  public boolean isRequestedSessionIdFromCookie() {
    return false;
  }

  public boolean isRequestedSessionIdFromURL() {
    return false;
  }

  public boolean isRequestedSessionIdFromUrl() {
    return false;
  }

  public boolean authenticate(HttpServletResponse httpServletResponse) throws IOException, ServletException {
    return false;
  }

  public void login(String s, String s1) throws ServletException {

  }

  public void logout() throws ServletException {

  }

  public Collection<Part> getParts() throws IOException, ServletException {
    return null;
  }

  public Part getPart(String s) throws IOException, ServletException {
    return null;
  }

  public <T extends HttpUpgradeHandler> T upgrade(Class<T> aClass) throws IOException, ServletException {
    return null;
  }



  public Enumeration<String> getAttributeNames() {
    return null;
  }

  public String getCharacterEncoding() {
    return null;
  }

  public void setCharacterEncoding(String s) throws UnsupportedEncodingException {

  }

  public int getContentLength() {
    return 0;
  }

  public long getContentLengthLong() {
    return 0;
  }

  public String getContentType() {
    return null;
  }

  public ServletInputStream getInputStream() throws IOException {
    return null;
  }

  public String getParameter(String s) {
    return parameters.get(s);
  }

  public Enumeration<String> getParameterNames() {
    return null;
  }

  public String[] getParameterValues(String s) {
    return new String[0];
  }

  public Map<String, String[]> getParameterMap() {
    return null;
  }

  public String getProtocol() {
    return null;
  }

  public String getScheme() {
    return null;
  }

  public String getServerName() {
    return null;
  }

  public int getServerPort() {
    return 0;
  }

  public BufferedReader getReader() throws IOException {
    return null;
  }

  public String getRemoteAddr() {
    return null;
  }

  public String getRemoteHost() {
    return null;
  }


  public void removeAttribute(String s) {

  }

  public Locale getLocale() {
    return null;
  }

  public Enumeration<Locale> getLocales() {
    return null;
  }

  public boolean isSecure() {
    return false;
  }

  public RequestDispatcher getRequestDispatcher(String s) {
    return null;
  }

  public String getRealPath(String s) {
    return null;
  }

  public int getRemotePort() {
    return 0;
  }

  public String getLocalName() {
    return null;
  }

  public String getLocalAddr() {
    return null;
  }

  public int getLocalPort() {
    return 0;
  }

  public ServletContext getServletContext() {
    return null;
  }

  public AsyncContext startAsync() throws IllegalStateException {
    return null;
  }

  public AsyncContext startAsync(ServletRequest servletRequest, ServletResponse servletResponse) throws IllegalStateException {
    return null;
  }

  public boolean isAsyncStarted() {
    return false;
  }

  public boolean isAsyncSupported() {
    return false;
  }

  public AsyncContext getAsyncContext() {
    return null;
  }

  public DispatcherType getDispatcherType() {
    return null;
  }
}
