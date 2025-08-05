package com.taobao.android.live.plugin.proxy.ir;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.e;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "IRProxyX";

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, IRProxy> f14112a = new HashMap();

    /* renamed from: com.taobao.android.live.plugin.proxy.ir.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0542a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f14113a;

        static {
            kge.a(1166220612);
            f14113a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("bf5fc391", new Object[0]) : f14113a;
        }
    }

    static {
        kge.a(-2058377172);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("bf5fc391", new Object[0]) : C0542a.a();
    }

    public void a(String str, IRProxy iRProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329acea3", new Object[]{this, str, iRProxy});
        } else if (TextUtils.isEmpty(str) || iRProxy == null || this.f14112a.containsKey(str)) {
        } else {
            e.c("<IRProxyX> [addIRProxy] key:" + str + "; irProxy:" + iRProxy + " add success");
            this.f14112a.put(str, iRProxy);
        }
    }

    public IRProxy a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRProxy) ipChange.ipc$dispatch("1c2e0437", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            e.c("<IRProxyX> [getIRProxy] empty key");
            return null;
        } else if (this.f14112a.get(str) == null) {
            e.c("<IRProxyX> [getIRProxy] key:" + str + "; irProxy is null");
            return null;
        } else {
            e.c("<IRProxyX> [getIRProxy] key:" + str + "; irProxy:" + this.f14112a.get(str) + " get success");
            return this.f14112a.get(str);
        }
    }
}
