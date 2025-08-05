package com.taobao.android.live.plugin.atype.flexalocal.subscribe;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.message.WVSubscribePlugin;
import com.taobao.taolive.sdk.utils.q;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f14022a;

    static {
        kge.a(-63113985);
    }

    public static void a(String str, String str2, String str3, String str4, IObserverX iObserverX) {
        try {
            a();
            f14022a.getMethod(WVSubscribePlugin.ACTION_QUERY_SUBSCRIBE, String.class, String.class, String.class, String.class, IObserverX.class).invoke(null, str, str2, str3, str4, iObserverX);
        } catch (Throwable th) {
            q.e("SubscribeX", th.getMessage());
        }
    }

    public static void a(boolean z, String str, String str2, String str3, String str4, IObserverX iObserverX) {
        try {
            a();
            f14022a.getMethod("dXTaoLiveEndRecommendSubscribe", Boolean.TYPE, String.class, String.class, String.class, String.class, IObserverX.class).invoke(null, Boolean.valueOf(z), str, str2, str3, str4, iObserverX);
        } catch (Throwable th) {
            q.e("SubscribeX", th.getMessage());
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f14022a != null) {
        } else {
            try {
                f14022a = Class.forName("com.taobao.live.live.adapterimpl.subscribe.SubscribeX");
            } catch (Throwable th) {
                q.e("SubscribeX", th.getMessage());
            }
        }
    }
}
