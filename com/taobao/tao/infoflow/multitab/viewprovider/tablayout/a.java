package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import tb.ksi;

/* loaded from: classes8.dex */
public interface a extends ksi {
    public static final String KEY = "ITabLayoutProtocol";

    /* renamed from: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0864a {
        void a();

        void l_(int i);
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a(int i, JSONObject jSONObject, boolean z);

        void b(int i, JSONObject jSONObject);
    }

    /* loaded from: classes8.dex */
    public interface c {
        void b();
    }

    /* loaded from: classes8.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface e {
        void a(int i);
    }

    View a(String str);

    void a(int i, int i2);

    void a(JSONObject jSONObject);

    void a(b bVar);

    void a(String str, d dVar);

    void b(String str);

    boolean b();

    int[] c(String str);

    void e();
}
