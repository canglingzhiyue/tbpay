package com.taobao.interact.core.h5;

import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f17594a;
    public boolean b;
    public boolean c;
    public double d;
    public String e;

    static {
        kge.a(-1464506036);
    }

    public static a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c1f96bbe", new Object[]{jSONObject});
        }
        a aVar = new a();
        aVar.f17594a = jSONObject.optString("resourceurl");
        aVar.b = jSONObject.optInt("remote", 0) == 1;
        if (jSONObject.optInt("loop", 0) != 1) {
            z = false;
        }
        aVar.c = z;
        aVar.d = jSONObject.optDouble(Constant.PROP_TTS_VOLUME);
        aVar.e = jSONObject.optString("identifier");
        return aVar;
    }
}
