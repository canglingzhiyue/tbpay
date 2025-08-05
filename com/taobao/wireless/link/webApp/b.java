package com.taobao.wireless.link.webApp;

import android.content.Context;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.rkg;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f23626a;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f23627a;

        static {
            kge.a(-956222392);
            f23627a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a7f87342", new Object[0]) : f23627a;
        }
    }

    static {
        kge.a(-2121198219);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a7f87342", new Object[0]) : a.a();
    }

    private b() {
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        rkg.a(true);
        this.f23626a = context;
        q.a(WebAppJSBridge.NAME, (Class<? extends e>) WebAppJSBridge.class);
        rkg.a("WebApp", "WebAppManager === init === 初始化完成");
    }
}
