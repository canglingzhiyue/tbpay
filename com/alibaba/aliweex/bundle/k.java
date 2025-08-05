package com.alibaba.aliweex.bundle;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.weex.RenderContainer;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.component.NestedContainer;
import java.util.Map;

/* loaded from: classes2.dex */
public interface k {

    /* loaded from: classes2.dex */
    public interface c {
        String a();

        void a(String str, String str2);

        String b();

        String c();

        String d();
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a();

        void a(Context context, View view);

        void a(boolean z, String str);
    }

    /* loaded from: classes2.dex */
    public interface e {
        NestedContainer a(WXSDKInstance wXSDKInstance);

        void a();

        void a(int i, int i2, Intent intent);

        void a(Menu menu);

        void a(ViewGroup viewGroup, Map<String, Object> map, String str, String str2, String str3, String str4, String str5);

        void a(RenderContainer renderContainer);

        void a(String str, String str2);

        void a(String str, String str2, Map<String, Object> map, String str3);

        void a(String str, Map<String, Object> map);

        void a(Map<String, Object> map, String str, String str2, String str3);

        void b();

        void b(String str, String str2);

        WXSDKInstance c();

        void d();

        void e();

        void f();

        void g();

        void h();

        boolean i();

        boolean j();

        String k();

        String l();

        String m();

        String n();
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a(WXSDKInstance wXSDKInstance);

        void a(String str);

        void b();

        void b(WXSDKInstance wXSDKInstance);

        void b(String str);

        void c();

        void c(String str);

        void d();
    }

    /* loaded from: classes2.dex */
    public interface g {
        Handler a();

        void a(WXSDKInstance wXSDKInstance, View view);

        void a(String str);
    }
}
