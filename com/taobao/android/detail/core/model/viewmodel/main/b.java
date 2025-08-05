package com.taobao.android.detail.core.model.viewmodel.main;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.async.AsyncQueryData;
import com.taobao.android.detail.core.request.async.AsyncQueryRequestClient;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.c;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ecg;
import tb.epj;
import tb.epo;
import tb.epz;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends c implements com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String K_LATITUDE = "latitude";
    public static final String K_LONGITUDE = "longitude";

    /* renamed from: a  reason: collision with root package name */
    public AsyncQueryData f9763a;
    public WeakReference<com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData>> b;
    private boolean m;

    static {
        kge.a(-522353065);
        kge.a(1595456606);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.model.viewmodel.main.c, com.taobao.android.detail.datasdk.model.viewmodel.main.b
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.core.model.viewmodel.main.DinamicAsyncViewModel";
    }

    public static /* synthetic */ void a(b bVar, AsyncQueryData asyncQueryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d839bc", new Object[]{bVar, asyncQueryData});
        } else {
            bVar.b(asyncQueryData);
        }
    }

    public static /* synthetic */ void a(b bVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4b75a1c", new Object[]{bVar, mtopResponse});
        } else {
            bVar.b(mtopResponse);
        }
    }

    public static /* synthetic */ void b(b bVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94778dbb", new Object[]{bVar, mtopResponse});
        } else {
            bVar.c(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.c
    public /* synthetic */ void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
        } else {
            a((AsyncQueryData) obj);
        }
    }

    public b(ComponentModel componentModel, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(componentModel, bVar);
    }

    public b(IDMComponent iDMComponent, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        super(iDMComponent, bVar);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = new WeakReference<>(b(context));
        a(this.mNodeBundle, this.j, this);
    }

    public void a(Context context, com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a6fafd", new Object[]{this, context, aVar});
            return;
        }
        this.b = new WeakReference<>(aVar);
        AsyncQueryData asyncQueryData = this.f9763a;
        if (asyncQueryData == null) {
            a(this.mNodeBundle, this.j, this);
        } else if (aVar == null) {
        } else {
            aVar.onSuccess(asyncQueryData);
        }
    }

    private com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData> b(final Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.trade.boost.request.mtop.a) ipChange.ipc$dispatch("8a032dcc", new Object[]{this, context}) : new com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData>() { // from class: com.taobao.android.detail.core.model.viewmodel.main.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onSuccess(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                } else {
                    a((AsyncQueryData) obj);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                } else {
                    b.this.a(context, mtopResponse);
                }
            }

            public void a(AsyncQueryData asyncQueryData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("610cc30b", new Object[]{this, asyncQueryData});
                } else {
                    b.this.a(context, asyncQueryData);
                }
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else {
                    b.this.b(context, mtopResponse);
                }
            }
        };
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, JSONObject jSONObject, com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efdc816f", new Object[]{this, bVar, jSONObject, aVar});
        } else if (bVar != null && jSONObject != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("version");
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (jSONObject2 != null) {
                for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    } else if (value instanceof JSONObject) {
                        hashMap.put(entry.getKey(), JSON.toJSONString(entry.getValue()));
                    }
                }
            }
            if (jSONObject.containsKey("location")) {
                com.taobao.android.detail.datasdk.protocol.adapter.optional.c k = epj.k();
                c.a aVar2 = new c.a();
                if (k == null) {
                    aVar2.b = "0";
                    aVar2.f10067a = "0";
                } else {
                    c.a a2 = k.a(epo.a());
                    aVar2.b = a2.b;
                    aVar2.f10067a = a2.f10067a;
                }
                if (aVar2.f10067a != null) {
                    hashMap.put("longitude", aVar2.f10067a);
                }
                if (aVar2.b != null) {
                    hashMap.put("latitude", aVar2.b);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("requestParam", hashMap);
            hashMap2.put("ultronRequestNode", jSONObject);
            ecg.c((Context) null, "startFetchAsyncData", this.d != null ? this.d.f9766a : "", hashMap2);
            a(string, string2, hashMap, aVar);
        }
    }

    private void a(String str, String str2, HashMap<String, String> hashMap, com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbae7c6", new Object[]{this, str, str2, hashMap, aVar});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        new AsyncQueryRequestClient(str, str2).execute(new com.taobao.android.detail.core.request.async.a(hashMap), aVar, epj.a().getTTID());
    }

    public void a(AsyncQueryData asyncQueryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("610cc30b", new Object[]{this, asyncQueryData});
        } else if (this.j != null && this.j.containsKey("nextRequest")) {
            b(this.j, asyncQueryData);
        } else {
            b(asyncQueryData);
        }
    }

    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
        } else {
            b(mtopResponse);
        }
    }

    @Override // com.taobao.android.trade.boost.request.mtop.a
    public void onSystemFailure(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            c(mtopResponse);
        }
    }

    private void b(AsyncQueryData asyncQueryData) {
        com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData> aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3c4b2a", new Object[]{this, asyncQueryData});
            return;
        }
        this.f9763a = asyncQueryData;
        WeakReference<com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData>> weakReference = this.b;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.onSuccess(asyncQueryData);
    }

    private void b(MtopResponse mtopResponse) {
        com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData> aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743cc56e", new Object[]{this, mtopResponse});
            return;
        }
        WeakReference<com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData>> weakReference = this.b;
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            return;
        }
        aVar.onFailure(mtopResponse);
    }

    private void c(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3dbcaf", new Object[]{this, mtopResponse});
        } else {
            a(mtopResponse);
        }
    }

    public void a(Context context, AsyncQueryData asyncQueryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608b4e13", new Object[]{this, context, asyncQueryData});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("asyncQueryData", asyncQueryData);
        JSONObject a2 = a((JSONObject) asyncQueryData);
        hashMap.put("root", a2);
        if (asyncQueryData.size() > 0) {
            if (this.component != null) {
                this.component.mapping.put("data", (Object) a2);
                if (this.e != null) {
                    for (Map.Entry<String, Object> entry : this.e.entrySet()) {
                        entry.setValue(epz.a(a2, entry.getValue()));
                    }
                    this.component.mapping.put("event", (Object) this.e);
                    hashMap.put("eventNode", this.e);
                }
                if (this.f != null) {
                    for (Map.Entry<String, Object> entry2 : this.f.entrySet()) {
                        entry2.setValue(epz.a(a2, entry2.getValue()));
                    }
                    this.component.mapping.put("track", (Object) this.f);
                    hashMap.put("trackNode", this.f);
                }
            } else if (this.dmComponent != null && this.i != null) {
                this.i.put("data", (Object) a2);
                this.i = (JSONObject) this.i.clone();
                if (this.e != null) {
                    for (Map.Entry<String, Object> entry3 : this.e.entrySet()) {
                        entry3.setValue(epz.a(a2, entry3.getValue()));
                    }
                    this.i.put("event", (Object) this.e);
                    hashMap.put("eventNode", this.e);
                }
                if (this.f != null) {
                    for (Map.Entry<String, Object> entry4 : this.f.entrySet()) {
                        entry4.setValue(epz.a(a2, entry4.getValue()));
                    }
                    this.i.put("track", (Object) this.f);
                    hashMap.put("trackNode", this.f);
                }
            }
            ecg.c(context, "fetchAsyncDataSuccess", this.d != null ? this.d.f9766a : "", hashMap);
        }
        a(true);
    }

    public void a(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dae8c825", new Object[]{this, context, mtopResponse});
        } else if (mtopResponse == null) {
        } else {
            ecg.a(context, "fetchAsyncDataFail", this.d != null ? this.d.f9766a : "", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), (Map<String, Object>) null);
            ecg.l(context, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    public void b(Context context, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5949cc04", new Object[]{this, context, mtopResponse});
        } else if (mtopResponse == null) {
        } else {
            ecg.a(context, "fetchAsyncDataFail", this.d != null ? this.d.f9766a : "", mtopResponse.getRetCode(), mtopResponse.getRetMsg(), (Map<String, Object>) null);
            ecg.l(context, mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    private void b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        try {
            jSONObject3 = (JSONObject) com.taobao.android.detail.core.utils.j.a(jSONObject2, JSONObject.parseObject(jSONObject.getJSONObject("nextRequest").toJSONString().replace("@async", "$")));
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("AsyncError", "request error" + e);
            jSONObject3 = null;
        }
        a(this.mNodeBundle, jSONObject3, new com.taobao.android.trade.boost.request.mtop.a<AsyncQueryData>() { // from class: com.taobao.android.detail.core.model.viewmodel.main.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1cc110e", new Object[]{this, mtopResponse});
                } else {
                    a(mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.c
            public /* synthetic */ void onSuccess(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                } else {
                    a((AsyncQueryData) obj);
                }
            }

            public void a(AsyncQueryData asyncQueryData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("610cc30b", new Object[]{this, asyncQueryData});
                } else {
                    b.a(b.this, asyncQueryData);
                }
            }

            public void a(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                } else {
                    b.a(b.this, mtopResponse);
                }
            }

            @Override // com.taobao.android.trade.boost.request.mtop.a
            public void onSystemFailure(MtopResponse mtopResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
                } else {
                    b.b(b.this, mtopResponse);
                }
            }
        });
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.m;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }
}
