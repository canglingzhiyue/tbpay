package com.taobao.android.weex;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f15864a;
    public String b;
    public String c;
    public WeexInstanceInternalMode d;
    public WeexRenderType e;
    public JSONObject f;
    public com.taobao.android.weex.config.b g;
    public WeexInstanceImpl h;
    public WeexInstanceImpl i;
    public int j;
    public boolean k = false;
    public jvb l = null;

    static {
        kge.a(-307336863);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    public g(Context context, String str, String str2, WeexInstanceInternalMode weexInstanceInternalMode, WeexRenderType weexRenderType) {
        this.f15864a = context;
        this.b = str;
        this.c = str2;
        this.d = weexInstanceInternalMode;
        this.e = weexRenderType;
    }
}
