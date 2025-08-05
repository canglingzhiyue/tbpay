package com.taobao.android.ultron.datamodel.imp;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONException;
import tb.jnt;
import tb.jnw;
import tb.jny;
import tb.joa;
import tb.jpr;
import tb.jpu;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends jnt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f15775a;
    private Context b;
    private boolean c;

    static {
        kge.a(-1723670037);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public d(jnw jnwVar) {
        if (jnwVar == null) {
            return;
        }
        this.b = jnwVar.C();
        jny s = jnwVar.s();
        if (s instanceof b) {
            this.f15775a = (b) s;
        } else {
            this.f15775a = new b(jnwVar.t());
        }
        this.f15775a.a(jnwVar.C());
        this.f15775a.c(jnwVar.q());
        this.f15775a.d(jnwVar.r());
        this.c = jnwVar.J();
    }

    @Override // tb.jnt
    public void a(JSONObject jSONObject, jnt.a aVar, joa.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("552e0102", new Object[]{this, jSONObject, aVar, aVar2});
            return;
        }
        if (this.f15775a.e()) {
            this.f15775a.C();
        }
        this.f15775a.a(true);
        ParseResponseHelper parseResponseHelper = new ParseResponseHelper(this.f15775a);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        parseResponseHelper.d(jSONObject2);
        if (parseResponseHelper.a(i.FEATURE_CONTAINER_CACHE)) {
            parseResponseHelper.a(this.b, this.f15775a.h(), jSONObject2, true, true);
        }
        parseResponseHelper.a(jSONObject);
        byte[] a2 = aVar == null ? null : aVar.a();
        if (parseResponseHelper.a()) {
            aVar2.a(a(jSONObject, a2), this.f15775a, parseResponseHelper.b());
        } else {
            aVar2.a(a(jSONObject, a2), true, (Map<String, ? extends Object>) parseResponseHelper.b());
        }
        new HashMap().put("isSuccess", Boolean.valueOf(parseResponseHelper.a()));
    }

    private MtopResponse a(JSONObject jSONObject, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("e3c9faec", new Object[]{this, jSONObject, bArr});
        }
        MtopResponse mtopResponse = new MtopResponse();
        String str = null;
        if (this.c || bArr == null) {
            str = a(jSONObject);
        }
        if (bArr != null) {
            mtopResponse.setBytedata(bArr);
        } else {
            mtopResponse.setBytedata(str.getBytes());
        }
        try {
            if (this.c) {
                mtopResponse.setDataJsonObject(new org.json.JSONObject(str));
            }
        } catch (JSONException e) {
            jpr.a(jpu.a(this.f15775a.h()).c("LocalDataDataRequest").b(e.getMessage()));
        }
        return mtopResponse;
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject}) : jSONObject == null ? "" : jSONObject.toJSONString();
    }
}
