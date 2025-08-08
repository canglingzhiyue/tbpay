package com.taobao.android.sku.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.weex.WXSDKInstance;
import com.uc.webview.export.media.MessageID;
import tb.jpx;
import tb.kge;

/* loaded from: classes6.dex */
public final class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile s f15209a;
    private volatile Object b;

    static {
        kge.a(1059085423);
    }

    public static synchronized s a() {
        synchronized (s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (s) ipChange.ipc$dispatch("4eada32d", new Object[0]);
            }
            if (f15209a == null) {
                f15209a = new s();
            }
            return f15209a;
        }
    }

    public void a(Context context) {
        if (context == null || !jpx.a(context)) {
            return;
        }
        try {
            this.b = Class.forName("com.taobao.weex.analyzer.WeexDevOptions").getDeclaredConstructor(Context.class).newInstance(context);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
    }

    public void b() {
        if (this.b == null) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod(i.b.MEASURE_ONCREATE, new Class[0]).invoke(this.b, new Object[0]);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
    }

    public void c() {
        if (this.b == null) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod("onStart", new Class[0]).invoke(this.b, new Object[0]);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
    }

    public void d() {
        if (this.b == null) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod("onResume", new Class[0]).invoke(this.b, new Object[0]);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
    }

    public void e() {
        if (this.b == null) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod("onPause", new Class[0]).invoke(this.b, new Object[0]);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
    }

    public void f() {
        if (this.b == null) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod(MessageID.onStop, new Class[0]).invoke(this.b, new Object[0]);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
    }

    public void g() {
        if (this.b == null) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod(MessageID.onDestroy, new Class[0]).invoke(this.b, new Object[0]);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
        f15209a = null;
    }

    public void a(WXSDKInstance wXSDKInstance) {
        if (this.b == null || wXSDKInstance == null) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod("onWeexRenderSuccess", WXSDKInstance.class).invoke(this.b, wXSDKInstance);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
    }

    public void a(WXSDKInstance wXSDKInstance, String str, String str2) {
        if (this.b == null) {
            return;
        }
        if (StringUtils.isEmpty(str) && StringUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.b.getClass().getDeclaredMethod("onException", WXSDKInstance.class, String.class, String.class).invoke(this.b, wXSDKInstance, str, str2);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
        }
    }

    public View a(WXSDKInstance wXSDKInstance, View view) {
        if (this.b == null || wXSDKInstance == null || view == null) {
            return null;
        }
        try {
            return (View) this.b.getClass().getDeclaredMethod("onWeexViewCreated", WXSDKInstance.class, View.class).invoke(this.b, wXSDKInstance, view);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
            return view;
        }
    }
}
