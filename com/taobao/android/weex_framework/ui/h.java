package com.taobao.android.weex_framework.ui;

import android.content.Context;
import android.view.View;
import com.taobao.android.weex.WeexExternalEventCheckException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.tbq;
import tb.xmp;

/* loaded from: classes6.dex */
public interface h {

    /* loaded from: classes6.dex */
    public interface a {
        void a(boolean z, String str);
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(double d, double d2, String str, JSONObject jSONObject);
    }

    /* loaded from: classes6.dex */
    public interface c {
    }

    HashMap<String, String> a(int i);

    void a();

    void a(float f, float f2);

    void a(int i, int i2);

    void a(Context context);

    void a(com.taobao.android.weex.n nVar) throws WeexExternalEventCheckException;

    void a(b bVar);

    void a(String str, Object obj);

    void a(tbq tbqVar);

    void a(xmp xmpVar);

    void a(boolean z, com.taobao.android.weex_framework.ui.c cVar, a aVar);

    HashMap<String, String> b(int i);

    Map<String, String> c(int i);

    View d();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    String k();

    void l();

    void m();

    void n();

    void o();

    void p();

    void q();

    void r();

    void t();

    void u();

    void v();

    void w();
}
