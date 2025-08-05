package com.taobao.android.shop.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.weex.WXSDKInstance;
import com.uc.webview.export.media.MessageID;
import tb.kge;

/* loaded from: classes6.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15116a;
    private Object b;

    static {
        kge.a(-1502206352);
        f15116a = true;
    }

    public h(Context context) {
        if (context != null && f15116a) {
            try {
                this.b = Class.forName("com.taobao.weex.analyzer.WeexDevOptions").getDeclaredConstructor(Context.class).newInstance(context);
            } catch (Exception unused) {
                f15116a = false;
            }
        }
    }

    public void a(MotionEvent motionEvent) {
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod("onReceiveTouchEvent", MotionEvent.class).invoke(this.b, motionEvent);
        } catch (Exception unused) {
        }
    }

    public void a() {
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod(i.b.MEASURE_ONCREATE, new Class[0]).invoke(this.b, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void b() {
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod("onStart", new Class[0]).invoke(this.b, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void c() {
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod("onResume", new Class[0]).invoke(this.b, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void d() {
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod("onPause", new Class[0]).invoke(this.b, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void e() {
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod(MessageID.onStop, new Class[0]).invoke(this.b, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void f() {
        Object obj = this.b;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod(MessageID.onDestroy, new Class[0]).invoke(this.b, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void a(WXSDKInstance wXSDKInstance) {
        Object obj = this.b;
        if (obj != null && wXSDKInstance != null) {
            try {
                obj.getClass().getDeclaredMethod("onWeexRenderSuccess", WXSDKInstance.class).invoke(this.b, wXSDKInstance);
            } catch (Exception unused) {
            }
        }
    }

    public void a(WXSDKInstance wXSDKInstance, String str, String str2) {
        if (this.b == null) {
            return;
        }
        if ("WX_ERR_RELOAD_PAGE".equals(str) && str2.contains("jsc reboot")) {
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod("onException", WXSDKInstance.class, String.class, String.class).invoke(this.b, wXSDKInstance, str, str2);
        } catch (Exception unused) {
        }
    }

    public View a(WXSDKInstance wXSDKInstance, View view) {
        Object obj = this.b;
        if (obj == null || wXSDKInstance == null || view == null) {
            return null;
        }
        try {
            return (View) obj.getClass().getDeclaredMethod("onWeexViewCreated", WXSDKInstance.class, View.class).invoke(this.b, wXSDKInstance, view);
        } catch (Exception unused) {
            return view;
        }
    }
}
