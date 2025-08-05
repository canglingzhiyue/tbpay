package com.etao.feimagesearch.capture.dynamic.msg;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes3.dex */
public final class g extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f6570a;

    static {
        kge.a(1378359547);
    }

    public g() {
        this(false, 1, null);
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "ScreenshotSearchFloatBarStateChange";
    }

    public g(boolean z) {
        this.f6570a = z;
    }

    public /* synthetic */ g(boolean z, int i, o oVar) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // com.etao.feimagesearch.capture.dynamic.msg.b
    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "isOpen", (String) Boolean.valueOf(this.f6570a));
        return jSONObject;
    }
}
