package com.taobao.android.cash.activity;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.weex.WXSDKInstance;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f9309a;

    static {
        kge.a(-768214461);
    }

    public b(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.f9309a = Class.forName("com.taobao.weex.analyzer.WeexDevOptions").getDeclaredConstructor(Context.class).newInstance(context);
        } catch (Exception unused) {
        }
    }

    public void a() {
        Object obj = this.f9309a;
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getDeclaredMethod(i.b.MEASURE_ONCREATE, new Class[0]).invoke(this.f9309a, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public void a(WXSDKInstance wXSDKInstance) {
        Object obj = this.f9309a;
        if (obj != null && wXSDKInstance != null) {
            try {
                obj.getClass().getDeclaredMethod("onWeexRenderSuccess", WXSDKInstance.class).invoke(this.f9309a, wXSDKInstance);
            } catch (Exception unused) {
            }
        }
    }

    public void a(WXSDKInstance wXSDKInstance, String str, String str2) {
        if (this.f9309a == null) {
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            this.f9309a.getClass().getDeclaredMethod("onException", WXSDKInstance.class, String.class, String.class).invoke(this.f9309a, wXSDKInstance, str, str2);
        } catch (Exception unused) {
        }
    }

    public View a(WXSDKInstance wXSDKInstance, View view) {
        Object obj = this.f9309a;
        if (obj == null || wXSDKInstance == null || view == null) {
            return null;
        }
        try {
            return (View) obj.getClass().getDeclaredMethod("onWeexViewCreated", WXSDKInstance.class, View.class).invoke(this.f9309a, wXSDKInstance, view);
        } catch (Exception unused) {
            return view;
        }
    }
}
