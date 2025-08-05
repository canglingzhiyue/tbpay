package com.taobao.android.weex;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15863a;
        public String b;

        static {
            kge.a(960147507);
        }

        public a(boolean z, String str) {
            this.f15863a = z;
            this.b = str;
        }
    }

    static {
        kge.a(1383498094);
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("85e6d9b1", new Object[0]) : com.taobao.android.weex.a.getInstance().getEngine();
    }

    public static j c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("afb86b0c", new Object[0]) : com.taobao.android.weex.a.getInstance().getDownloader();
    }

    public static l b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("9acfa309", new Object[0]) : com.taobao.android.weex.a.getInstance().getValueFactory();
    }

    public static WeexInstance a(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, com.taobao.android.weex.config.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("270d636d", new Object[]{context, str, weexInstanceMode, weexRenderType, jSONObject, bVar}) : com.taobao.android.weex.a.getInstance().createInstance(context, str, weexInstanceMode, weexRenderType, jSONObject, bVar);
    }

    public static q b(Context context, String str, WeexInstanceMode weexInstanceMode, WeexRenderType weexRenderType, JSONObject jSONObject, com.taobao.android.weex.config.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("ae6d6e3", new Object[]{context, str, weexInstanceMode, weexRenderType, jSONObject, bVar}) : com.taobao.android.weex.a.getInstance().createInstanceAsync(context, str, weexInstanceMode, weexRenderType, jSONObject, bVar);
    }
}
