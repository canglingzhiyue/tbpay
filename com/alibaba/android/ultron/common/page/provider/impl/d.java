package com.alibaba.android.ultron.common.page.provider.impl;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.common.page.provider.a;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bik;
import tb.bil;
import tb.bim;
import tb.bip;
import tb.biu;
import tb.bix;
import tb.bko;
import tb.boz;
import tb.jnw;
import tb.jny;
import tb.joc;
import tb.kge;

/* loaded from: classes2.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private jnw e;

    static {
        kge.a(-218896503);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 133829641) {
            super.a((Context) objArr[0], (String) objArr[1], (String) objArr[2], (JSONObject) objArr[3], (Map) objArr[4]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ jnw a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnw) ipChange.ipc$dispatch("8b871b19", new Object[]{dVar}) : dVar.e;
    }

    @Override // com.alibaba.android.ultron.common.page.provider.impl.a
    public boz e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (boz) ipChange.ipc$dispatch("2dc9766d", new Object[]{this}) : new bko();
    }

    @Override // com.alibaba.android.ultron.common.page.provider.impl.a, com.alibaba.android.ultron.common.page.provider.a
    public void a(Context context, String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa1409", new Object[]{this, context, str, str2, jSONObject, map});
            return;
        }
        super.a(context, str, str2, jSONObject, map);
        this.c = str2;
        this.e = biu.a(this.f2534a.a(), jSONObject.getJSONObject(bip.a.j), map);
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(Context context, JSONObject jSONObject, JSONObject jSONObject2, final a.InterfaceC0085a interfaceC0085a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feade92b", new Object[]{this, context, jSONObject, jSONObject2, interfaceC0085a});
        } else if (this.e == null) {
            interfaceC0085a.a("-1", "initial failed,mRequestBuilder is null", new bim());
        } else {
            this.f2534a.a(this.e.c(this.f2534a.b()), (Object) null, new joc() { // from class: com.alibaba.android.ultron.common.page.provider.impl.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                    String retCode;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                        return;
                    }
                    String str = "UNKNOW";
                    if (mtopResponse != null) {
                        try {
                            retCode = mtopResponse.getRetCode();
                        } catch (Exception unused) {
                            return;
                        }
                    } else {
                        retCode = str;
                    }
                    if (mtopResponse != null) {
                        str = mtopResponse.getRetMsg();
                    }
                    interfaceC0085a.a(retCode, str, new bim());
                    bix.a(d.this.c, "mtop", retCode, str, (Map<UMDimKey, Object>) null, (com.alibaba.android.umbrella.link.export.a) null);
                    bix.a(d.this.c, "mtop", d.a(d.this).e(), retCode, str, (Map<String, String>) null);
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                        return;
                    }
                    bik bikVar = new bik();
                    bikVar.a(new bim());
                    JSONObject c = jnyVar != null ? jnyVar.c() : null;
                    if (c != null) {
                        try {
                            JSONObject jSONObject3 = c.getJSONObject(bip.a.m);
                            boolean z2 = jSONObject3 != null && TextUtils.equals("true", jSONObject3.getString(bip.a.n));
                            if (jSONObject3 == null || !TextUtils.equals("true", jSONObject3.getString(bip.a.l))) {
                                z = false;
                            }
                            bikVar.a(new bil(z2, z));
                        } catch (Exception e) {
                            String message = e.getMessage();
                            bix.a(d.this.c, "dataProcess", "QUERY_END_EXCEPTION", message, (Map<UMDimKey, Object>) null, (com.alibaba.android.umbrella.link.export.a) null);
                            bix.a(d.this.c, "dataProcess", "RESPONSE_GLOBAL_PROCESS", "QUERY_END_EXCEPTION", message, (Map<String, String>) null);
                        }
                    }
                    interfaceC0085a.a(bikVar);
                    try {
                        bix.a(d.this.c, "mtop", "mRequestBuilder.getApi()", "onSuccess", (Map<UMDimKey, Object>) null, com.alibaba.android.umbrella.link.export.a.a(String.valueOf(mtopResponse.getData())));
                        bix.a(d.this.c, "mtop", d.a(d.this).e(), null);
                    } catch (Exception unused) {
                    }
                }
            }, (d.c) null);
        }
    }
}
