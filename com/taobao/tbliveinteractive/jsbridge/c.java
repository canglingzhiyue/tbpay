package com.taobao.tbliveinteractive.jsbridge;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.webview.IWVWebView;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public interface c {
    Map a(Uri uri);

    JSONObject a(Context context);

    void a();

    void a(IWVWebView iWVWebView);

    void a(g gVar);

    void a(g gVar, Map<String, String> map);

    boolean a(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView);

    boolean a(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView, com.alibaba.fastjson.JSONObject jSONObject);

    @Deprecated
    boolean a(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView, Map<String, String> map);

    boolean a(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView, Map<String, String> map, g gVar);

    boolean a(com.taobao.tbliveinteractive.e eVar, Map<String, String> map);

    boolean a(Map<String, String> map);

    String b();

    void b(g gVar, Map<String, Object> map);

    boolean b(com.taobao.tbliveinteractive.e eVar, IWVWebView iWVWebView);

    boolean b(com.taobao.tbliveinteractive.e eVar, Map<String, String> map);

    boolean b(Map<String, String> map);

    boolean c();

    boolean c(Map<String, String> map);

    boolean d();

    boolean d(Map<String, String> map);

    boolean e();

    boolean e(Map<String, String> map);

    String f();

    boolean f(Map<String, String> map);

    boolean g();

    boolean g(Map<String, String> map);

    boolean h();

    boolean h(Map<String, String> map);

    String i();

    boolean i(Map<String, String> map);

    boolean j();

    boolean j(Map<String, String> map);

    String k();

    boolean k(Map<String, String> map);

    String l();

    boolean l(Map<String, String> map);

    long m();

    boolean m(Map<String, String> map);

    boolean n();

    boolean n(Map<String, String> map);

    boolean o();

    boolean o(Map<String, String> map);

    boolean p();

    boolean p(Map<String, String> map);

    boolean q(Map<String, String> map);

    boolean r(Map<String, String> map);

    boolean s(Map<String, String> map);

    boolean t(Map<String, String> map);

    boolean u(Map<String, String> map);

    boolean v(Map<String, String> map);
}
