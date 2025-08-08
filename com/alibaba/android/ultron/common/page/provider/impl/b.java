package com.alibaba.android.ultron.common.page.provider.impl;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.common.page.provider.a;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.android.ultron.vfw.dataloader.d;
import com.alibaba.android.ultron.vfw.dataloader.f;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bii;
import tb.bij;
import tb.bik;
import tb.bim;
import tb.bin;
import tb.bnv;
import tb.bor;
import tb.bou;
import tb.boz;
import tb.jnw;
import tb.kge;

/* loaded from: classes2.dex */
public class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TemplateInfo e;
    private String f;
    private jnw g;
    private Map<String, Integer> h;
    private bin i;
    private a.InterfaceC0085a j;
    private bor k;
    private String l;
    private String m;

    static {
        kge.a(-1683105234);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 93762283) {
            super.d();
            return null;
        } else if (hashCode != 133829641) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Context) objArr[0], (String) objArr[1], (String) objArr[2], (JSONObject) objArr[3], (Map) objArr[4]);
            return null;
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.impl.a
    public boz e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boz) ipChange.ipc$dispatch("2dc9766d", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ a.InterfaceC0085a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.InterfaceC0085a) ipChange.ipc$dispatch("99ce8017", new Object[]{bVar}) : bVar.j;
    }

    public static /* synthetic */ void a(b bVar, a.InterfaceC0085a interfaceC0085a, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1a47e1", new Object[]{bVar, interfaceC0085a, jSONObject});
        } else {
            bVar.a(interfaceC0085a, jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    @Override // com.alibaba.android.ultron.common.page.provider.impl.a, com.alibaba.android.ultron.common.page.provider.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r4, java.lang.String r5, java.lang.String r6, com.alibaba.fastjson.JSONObject r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.ultron.common.page.provider.impl.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L21
            r1 = 6
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            r4 = 3
            r1[r4] = r6
            r4 = 4
            r1[r4] = r7
            r4 = 5
            r1[r4] = r8
            java.lang.String r4 = "7fa1409"
            r0.ipc$dispatch(r4, r1)
            return
        L21:
            super.a(r4, r5, r6, r7, r8)
            r3.g()
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r3.h = r4
            r4 = 0
            java.lang.String r5 = tb.bip.a.r     // Catch: java.lang.Exception -> L6d
            com.alibaba.fastjson.JSONObject r5 = r7.getJSONObject(r5)     // Catch: java.lang.Exception -> L6d
            java.lang.String r6 = tb.bip.a.s     // Catch: java.lang.Exception -> L6d
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = tb.bip.a.t     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = tb.bip.a.u     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = r5.getString(r1)     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = tb.bip.a.e     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Exception -> L68
            r3.f = r1     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = tb.bip.a.o     // Catch: java.lang.Exception -> L68
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r1)     // Catch: java.lang.Exception -> L68
            if (r5 == 0) goto L73
            java.lang.String r1 = tb.bip.a.p     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Exception -> L68
            r3.l = r1     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = tb.bip.a.q     // Catch: java.lang.Exception -> L68
            java.lang.String r5 = r5.getString(r1)     // Catch: java.lang.Exception -> L68
            r3.m = r5     // Catch: java.lang.Exception -> L68
            goto L73
        L68:
            r5 = move-exception
            goto L70
        L6a:
            r5 = move-exception
            r0 = r4
            goto L70
        L6d:
            r5 = move-exception
            r6 = r4
            r0 = r6
        L70:
            r5.printStackTrace()
        L73:
            boolean r5 = android.text.StringUtils.isEmpty(r6)
            if (r5 != 0) goto La2
            com.alibaba.android.ultron.engine.template.TemplateInfo r5 = new com.alibaba.android.ultron.engine.template.TemplateInfo
            r5.<init>()
            r3.e = r5
            com.alibaba.android.ultron.engine.template.TemplateInfo r5 = r3.e
            r5.setUrl(r6)
            com.alibaba.android.ultron.vfw.dataloader.c r5 = new com.alibaba.android.ultron.vfw.dataloader.c
            r5.<init>()
            java.lang.String r6 = "dataLoaderTypeClient"
            r5.a(r6)
            com.alibaba.android.ultron.engine.template.TemplateInfo r6 = r3.e
            r5.a(r6)
            r5.d(r0)
            r5.e(r4)
            r5.a(r2)
            com.alibaba.android.ultron.vfw.instance.d r4 = r3.f2534a
            r4.a(r5)
        La2:
            com.alibaba.android.ultron.vfw.instance.d r4 = r3.f2534a
            android.content.Context r4 = r4.a()
            java.lang.String r5 = tb.bip.a.r
            com.alibaba.fastjson.JSONObject r5 = r7.getJSONObject(r5)
            java.lang.String r6 = tb.bip.a.j
            com.alibaba.fastjson.JSONObject r5 = r5.getJSONObject(r6)
            tb.jnw r4 = tb.biu.a(r4, r5, r8)
            r3.g = r4
            tb.bin r4 = new tb.bin
            r4.<init>()
            r3.i = r4
            r3.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.common.page.provider.impl.b.a(android.content.Context, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, java.util.Map):void");
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.f2534a.a(new d.InterfaceC0100d() { // from class: com.alibaba.android.ultron.common.page.provider.impl.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.instance.d.InterfaceC0100d
            public void a(com.alibaba.android.ultron.vfw.dataloader.d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5ead625", new Object[]{this, dVar});
                } else if (b.a(b.this) == null) {
                } else {
                    b.a(b.this).a(new bik());
                }
            }

            @Override // com.alibaba.android.ultron.vfw.instance.d.InterfaceC0100d
            public void a(UltronError ultronError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f64095d", new Object[]{this, ultronError});
                } else if (b.a(b.this) == null) {
                } else {
                    bim bimVar = new bim();
                    bimVar.a(ultronError.code);
                    bimVar.b(ultronError.getMessage());
                    b.a(b.this).a(ultronError.code, ultronError.getMessage(), bimVar);
                }
            }
        });
        if (this.k != null) {
            return;
        }
        this.k = new bor(new d.c() { // from class: com.alibaba.android.ultron.common.page.provider.impl.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private bou b;

            @Override // com.alibaba.android.ultron.vfw.instance.d.c
            public void a(List<IDMComponent> list, bnv bnvVar, com.taobao.android.ultron.datamodel.imp.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar});
                    return;
                }
                if (this.b == null) {
                    this.b = new bou(bVar);
                }
                this.b.a(list, bnvVar, bVar);
            }
        });
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.f2534a.a(bij.DX_PARSER_WALLETGETSCROLLED, new bij(this.h));
        this.f2534a.a(bii.DX_EVENT_WALLETSCROLLED, new bii(this.h));
    }

    @Override // com.alibaba.android.ultron.common.page.provider.a
    public void a(Context context, JSONObject jSONObject, JSONObject jSONObject2, final a.InterfaceC0085a interfaceC0085a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feade92b", new Object[]{this, context, jSONObject, jSONObject2, interfaceC0085a});
        } else if (this.e == null) {
            interfaceC0085a.a("-1", "template info is invalid, please check your dataSource config", new bim(-1, "-1", "-1", "template info is invalid, please check your dataSource config"));
        } else {
            jnw jnwVar = this.g;
            if (jnwVar == null) {
                interfaceC0085a.a("-1", "mRequestBuilder is null, please init first", new bim(-1, "-1", "-1", "mRequestBuilder is null, please init first"));
                return;
            }
            bin binVar = this.i;
            if (binVar == null) {
                interfaceC0085a.a("-1", "mCommonPageRequester is null, please init first", new bim(-1, "-1", "-1", "mCommonPageRequester is null, please init first"));
                return;
            }
            this.j = interfaceC0085a;
            binVar.a(jnwVar, new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.common.page.provider.impl.UltronCommonClientEngineDataProvider$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        errorCallback(mtopResponse, true);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    JSONObject jSONObject3 = null;
                    org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    if (dataJsonObject != null) {
                        jSONObject3 = JSON.parseObject(dataJsonObject.toString());
                    }
                    b bVar = b.this;
                    if (b.$ipChange) {
                        b.a(b.this, interfaceC0085a, jSONObject3);
                        return;
                    }
                    if (jSONObject3 != null) {
                        String string = jSONObject3.getString("errorCode");
                        String string2 = jSONObject3.getString("errorMsg");
                        mtopResponse.setRetCode(string);
                        mtopResponse.setRetMsg(string2);
                    }
                    errorCallback(mtopResponse, false);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        errorCallback(mtopResponse, true);
                    }
                }

                private void errorCallback(MtopResponse mtopResponse, boolean z) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e36d66bb", new Object[]{this, mtopResponse, new Boolean(z)});
                        return;
                    }
                    bim bimVar = new bim(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    bimVar.a(z);
                    interfaceC0085a.a(String.valueOf(mtopResponse.getResponseCode()), mtopResponse.getRetMsg(), bimVar);
                    HashMap hashMap = new HashMap();
                    hashMap.put("errorCode", mtopResponse.getRetCode());
                    hashMap.put("errorMsg", mtopResponse.getRetMsg());
                    hashMap.put("pageName", b.this.c);
                    b bVar = b.this;
                    hashMap.put("spm-url", b.$ipChange);
                    b bVar2 = b.this;
                    if (b.$ipChange == null) {
                        str = "UltronCommonPage";
                    } else {
                        b bVar3 = b.this;
                        str = b.$ipChange;
                    }
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, "", "", "", hashMap).build());
                }
            });
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            return StringUtils.isEmpty(jSONObject.getString("errorCode"));
        }
        return false;
    }

    private void a(a.InterfaceC0085a interfaceC0085a, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a4ef2d", new Object[]{this, interfaceC0085a, jSONObject});
            return;
        }
        try {
            d.a aVar = new d.a();
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2.put("initialState", (Object) jSONObject);
            }
            aVar.c = jSONObject2;
            aVar.f2693a = jSONObject;
            com.alibaba.android.ultron.vfw.dataloader.d a2 = com.alibaba.android.ultron.vfw.dataloader.d.a("initial", aVar);
            a2.a(this.k);
            this.f2534a.a(a2, (f) null);
        } catch (Exception e) {
            interfaceC0085a.a("-1", e.getMessage(), null);
        }
    }

    @Override // com.alibaba.android.ultron.common.page.provider.impl.a, com.alibaba.android.ultron.common.page.provider.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        bin binVar = this.i;
        if (binVar == null) {
            return;
        }
        binVar.a();
    }
}
