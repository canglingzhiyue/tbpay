package com.taobao.cameralink.miniapp.skincamera.biz;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.dycontainer.BaseWVApiPlugin;
import com.taobao.android.artry.dycontainer.WebViewContainer;
import com.taobao.cameralink.miniapp.MiniAppContainerView;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public WeakReference<Activity> f16908a;
    public WeakReference<MiniAppContainerView> b;
    public com.taobao.android.artry.dycontainer.b c;
    public FrameLayout d;
    private WebViewContainer e;
    private String f = "";

    static {
        kge.a(-1014330111);
    }

    public static /* synthetic */ void lambda$TX06kN_MMaCaZJqJefLRyFZPP7M(a aVar) {
        aVar.c();
    }

    public static /* synthetic */ void lambda$qHJINQvzifcSz5gLWCE58UlQGcM(a aVar) {
        aVar.b();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = this.f;
            }
            this.f = str;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.biz.-$$Lambda$a$TX06kN_MMaCaZJqJefLRyFZPP7M
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.lambda$TX06kN_MMaCaZJqJefLRyFZPP7M(a.this);
                }
            });
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            Activity activity = this.f16908a.get();
            if (activity == null) {
                return;
            }
            this.d = new FrameLayout(activity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            this.b.get().addView(this.d, layoutParams);
            this.e = new WebViewContainer(activity);
            this.b.get().addView(this.e.a(), layoutParams);
            this.e.a(this.f, null);
            this.e.a(this.c);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.biz.-$$Lambda$a$qHJINQvzifcSz5gLWCE58UlQGcM
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.lambda$qHJINQvzifcSz5gLWCE58UlQGcM(a.this);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            if (this.e == null) {
                return;
            }
            this.b.get().removeAllViews();
            this.e.e();
            this.e = null;
            this.d = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(String str, JSONObject jSONObject) {
        String jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject2 = "";
        } else {
            try {
                jSONObject2 = jSONObject.toString();
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        BaseWVApiPlugin.fireWVEventSafety(str, jSONObject2, this.e.b());
    }
}
