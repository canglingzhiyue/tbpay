package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.d;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.snb;
import tb.tae;

/* loaded from: classes5.dex */
public class d implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "addJhsWaiting";
    public static final String EVENT_TYPE_ALTERNATIVE = "add_jhs_waiting";

    /* renamed from: a */
    private Context f10694a;
    private eyx b;

    /* renamed from: com.taobao.android.detail.ttdetail.handler.bizhandlers.d$1 */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ JSONObject f10695a;
        public final /* synthetic */ RuntimeAbilityParam[] b;

        public AnonymousClass1(JSONObject jSONObject, RuntimeAbilityParam[] runtimeAbilityParamArr) {
            d.this = r1;
            this.f10695a = jSONObject;
            this.b = runtimeAbilityParamArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                d.b(d.this).c().a(new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor$2$1
                    {
                        put("type", "adjustState");
                        put("fields", (Object) d.AnonymousClass1.this.f10695a);
                    }
                }), this.b);
            }
        }
    }

    static {
        kge.a(941354639);
        kge.a(1967244270);
    }

    public static /* synthetic */ Context a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d5c1ed56", new Object[]{dVar}) : dVar.f10694a;
    }

    public static /* synthetic */ void a(d dVar, JSONObject jSONObject, boolean z, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa42254", new Object[]{dVar, jSONObject, new Boolean(z), runtimeAbilityParamArr});
        } else {
            dVar.a(jSONObject, z, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ eyx b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("df44a743", new Object[]{dVar}) : dVar.b;
    }

    public d(Context context, eyx eyxVar) {
        this.f10694a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        final JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null || com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr) == null) {
            return false;
        }
        a(com.taobao.android.detail.ttdetail.utils.d.b((Item) this.b.a().a(Item.class), ""), b.getString("salesSite"), new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    JSONObject jSONObject = JSONObject.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
                    d.a(d.this, b, jSONObject.getBooleanValue("btnDisable"), runtimeAbilityParamArr);
                    String string = jSONObject.getString("errorMessage");
                    if (StringUtils.isEmpty(string)) {
                        return;
                    }
                    Toast.makeText(d.a(d.this), string, 0).show();
                } catch (Throwable unused) {
                    Toast.makeText(d.a(d.this), "系统异常，请重试", 0).show();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    Toast.makeText(d.a(d.this), "系统异常，请重试", 0).show();
                }
            }
        });
        return true;
    }

    private void a(JSONObject jSONObject, boolean z, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c0e18a", new Object[]{this, jSONObject, new Boolean(z), runtimeAbilityParamArr});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(jSONObject);
        jSONObject2.put("subType", "jhsRemind");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("beReplaced", (Object) "bottomBarVO");
        jSONObject3.put("toReplace", (Object) "fields");
        jSONObject2.put("targetReplacement", (Object) jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.putAll(jSONObject2);
        jSONObject4.put("status", Boolean.valueOf(z));
        jSONObject4.put("btnTitle", jSONObject.getString("disabledTitle"));
        jSONObject2.put("payload", (Object) jSONObject4);
        this.b.b().a(new AnonymousClass1(jSONObject2, runtimeAbilityParamArr));
    }

    private void a(final String str, final String str2, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de9ae7a", new Object[]{this, str, str2, iRemoteBaseListener});
        } else {
            new snb<MtopRequestParams>(new MtopRequestParams() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
                public String toData() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("add28f54", new Object[]{this}) : new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor$3.1
                        {
                            put("detail_v", "3.3.2");
                            put("itemNumId", (Object) str);
                            put("salesSite", (Object) str2);
                        }
                    }.toJSONString();
                }
            }) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.snb
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "mtop.ju.user.collection.add";
                }

                @Override // tb.snb
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "2.0";
                }

                @Override // tb.snb
                public String c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("bd025a76", new Object[]{this}) : "UNIT_TRADE";
                }

                @Override // tb.snb
                public boolean e() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                @Override // tb.snb
                public boolean f() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
                    }
                    return true;
                }

                {
                    d.this = this;
                }

                @Override // tb.snb
                public MethodEnum d() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (MethodEnum) ipChange2.ipc$dispatch("27517117", new Object[]{this}) : MethodEnum.GET;
                }
            }.a(tae.b()).a(iRemoteBaseListener).k();
        }
    }
}
