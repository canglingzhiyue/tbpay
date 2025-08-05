package com.taobao.tao.topmultitab.protocol;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import java.util.List;
import java.util.Map;
import tb.llh;

/* loaded from: classes.dex */
public interface c {
    View a(String str);

    Map<String, Integer> a(String str, String str2);

    void a(IHomeSubTabController iHomeSubTabController);

    void a(IHomeSubTabController iHomeSubTabController, View view);

    void a(IHomeSubTabController iHomeSubTabController, JSONObject jSONObject);

    void a(IHomeSubTabController iHomeSubTabController, String str);

    void a(IHomeSubTabController iHomeSubTabController, Map<String, String> map);

    void a(IHomeSubTabController iHomeSubTabController, boolean z);

    void a(llh llhVar);

    boolean a(View view, ViewGroup.LayoutParams layoutParams);

    int b();

    List<String> b(String str);

    void b(IHomeSubTabController iHomeSubTabController);

    void b(IHomeSubTabController iHomeSubTabController, String str);

    void b(IHomeSubTabController iHomeSubTabController, boolean z);

    Context c();

    void c(IHomeSubTabController iHomeSubTabController, boolean z);

    boolean c(IHomeSubTabController iHomeSubTabController);

    JSONObject d(IHomeSubTabController iHomeSubTabController);

    String d();

    void d(IHomeSubTabController iHomeSubTabController, boolean z);

    int e(IHomeSubTabController iHomeSubTabController);

    String e();

    JSONObject f(IHomeSubTabController iHomeSubTabController);

    boolean f();

    JSONObject g(IHomeSubTabController iHomeSubTabController);

    String g();

    int h(IHomeSubTabController iHomeSubTabController);

    JSONObject h();

    JSONObject i(IHomeSubTabController iHomeSubTabController);

    float j(IHomeSubTabController iHomeSubTabController);

    Fragment j();

    void k(IHomeSubTabController iHomeSubTabController);

    boolean k();

    boolean l();
}
