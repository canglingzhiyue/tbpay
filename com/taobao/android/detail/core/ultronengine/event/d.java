package com.taobao.android.detail.core.ultronengine.event;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dwv;
import tb.ecu;
import tb.emu;
import tb.jpx;
import tb.kge;

/* loaded from: classes4.dex */
public class d extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "shopRecommend";

    /* renamed from: a */
    public static Map<String, String> f9926a;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject a(d dVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ea96f403", new Object[]{dVar, mtopResponse}) : dVar.a(mtopResponse);
    }

    public static /* synthetic */ void a(d dVar, e eVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23efbaef", new Object[]{dVar, eVar, str, str2, jSONObject});
        } else {
            dVar.a(eVar, str, str2, jSONObject);
        }
    }

    public static /* synthetic */ void a(d dVar, e eVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9c6e12", new Object[]{dVar, eVar, mtopResponse});
        } else {
            dVar.b(eVar, mtopResponse);
        }
    }

    public static /* synthetic */ void b(d dVar, e eVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9717593", new Object[]{dVar, eVar, mtopResponse});
        } else {
            dVar.a(eVar, mtopResponse);
        }
    }

    public d() {
        emu.a("com.taobao.android.detail.core.ultronengine.event.ShopRecommendSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(final e eVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        final JSONObject c = c();
        if (c == null) {
            return;
        }
        final boolean containsKey = c.containsKey("secondRequest");
        if (ecu.O && containsKey) {
            a(eVar, "", "", c.getJSONObject("secondRequest"));
            return;
        }
        JSONObject jSONObject2 = c.getJSONObject("firstRequest");
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("data")) != null) {
            jSONObject.putAll(f9926a);
        }
        a(jSONObject2, new IRemoteBaseListener() { // from class: com.taobao.android.detail.core.ultronengine.event.ShopRecommendSubscriber$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                UnifyLog.d("ShopRecommendSubscriber", "first onError: " + mtopResponse.getRetMsg());
                d.a(d.this, eVar, mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    Coordinator.postTask(new Coordinator.TaggedRunnable("process shop recommend response") { // from class: com.taobao.android.detail.core.ultronengine.event.ShopRecommendSubscriber$1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                if (!containsKey) {
                                    d.b(d.this, eVar, mtopResponse);
                                    return;
                                }
                                JSONObject a2 = d.a(d.this, mtopResponse);
                                JSONObject jSONObject3 = null;
                                JSONObject jSONObject4 = a2 == null ? null : a2.getJSONObject("data");
                                if (jSONObject4 != null) {
                                    jSONObject3 = jSONObject4.getJSONObject(dwv.KEY_RECOMMEND_ID_INFO);
                                }
                                if (jSONObject3 == null) {
                                    return;
                                }
                                d.a(d.this, eVar, jSONObject3.getString(dwv.KEY_RECOMMEND_IDS), jSONObject3.getString(dwv.KEY_SMART_FLAG), c.getJSONObject("secondRequest"));
                            } catch (Throwable th) {
                                UnifyLog.d("ShopRecommendSubscriber", "process onSuccess error", th.getMessage());
                            }
                        }
                    });
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                UnifyLog.d("ShopRecommendSubscriber", "first onError: " + mtopResponse.getRetMsg());
                d.a(d.this, eVar, mtopResponse);
            }
        });
    }

    private void a(final e eVar, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32a0539", new Object[]{this, eVar, str, str2, jSONObject});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject("params");
        jSONObject2.put(dwv.KEY_RECOMMEND_ITEM_ID, (Object) str);
        jSONObject2.put("flag", (Object) str2);
        jSONObject2.putAll(f9926a);
        jSONObject.getJSONObject("data").put("params", (Object) jSONObject2.toJSONString());
        a(jSONObject, new IRemoteBaseListener() { // from class: com.taobao.android.detail.core.ultronengine.event.ShopRecommendSubscriber$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                UnifyLog.d("ShopRecommendSubscriber", "second onError: " + mtopResponse.getRetMsg());
                d.a(d.this, eVar, mtopResponse);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    d.b(d.this, eVar, mtopResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                UnifyLog.d("ShopRecommendSubscriber", "second onError: " + mtopResponse.getRetMsg());
                d.a(d.this, eVar, mtopResponse);
            }
        });
    }

    private void a(e eVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b2b008", new Object[]{this, eVar, mtopResponse});
            return;
        }
        UnifyLog.d("ShopRecommendSubscriber", "processRequestSuccess: " + mtopResponse.getApi());
        JSONObject fields = b().getFields();
        JSONObject a2 = a(mtopResponse);
        try {
            boolean isEmpty = true ^ a2.getJSONObject("data").getJSONArray("result").isEmpty();
            if (!StringUtils.isEmpty(a2.getJSONObject("data").getString("text"))) {
                z = isEmpty;
            }
        } catch (Exception unused) {
        }
        com.alibaba.android.ultron.vfw.instance.b h = eVar.h();
        if (eVar.d() != null && (h instanceof com.alibaba.android.ultron.vfw.instance.d)) {
            com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) h;
            if (dVar.y() != null && dVar.y().s()) {
                this.g = eVar.d();
            }
        }
        if (!z) {
            UnifyLog.d("ShopRecommendSubscriber", "请求成功，数据校验失败");
            a(fields.getJSONObject("next").getJSONArray("fail"), (Object) mtopResponse);
            return;
        }
        UnifyLog.d("ShopRecommendSubscriber", "请求成功，数据校验成功");
        a(fields.getJSONObject("next").getJSONArray("success"), (Object) a2);
    }

    private void b(e eVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a615e7", new Object[]{this, eVar, mtopResponse});
            return;
        }
        UnifyLog.d("ShopRecommendSubscriber", "processRequestFail: " + mtopResponse.getApi());
        com.taobao.android.ultron.common.model.b b = b();
        com.alibaba.android.ultron.vfw.instance.b h = eVar.h();
        if (eVar.d() != null && (h instanceof com.alibaba.android.ultron.vfw.instance.d)) {
            com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) h;
            if (dVar.y() != null && dVar.y().s()) {
                this.g = eVar.d();
            }
        }
        a(b.getFields().getJSONObject("next").getJSONArray("fail"), (Object) mtopResponse);
        if (!jpx.a(this.d)) {
            return;
        }
        Context context = this.d;
        Toast.makeText(context, "mtopFail:" + mtopResponse.getApi(), 0).show();
    }

    private void a(JSONObject jSONObject, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d6bcee", new Object[]{this, jSONObject, iRemoteBaseListener});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        boolean equals = "true".equals(jSONObject.getString("usePost"));
        String string = jSONObject.getString("apiMethod");
        String string2 = jSONObject.getString("apiVersion");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 != null) {
            jSONObject3.putAll(jSONObject2);
        }
        mtopRequest.setData(jSONObject3.toJSONString());
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2)) {
            UnifyLog.d("ShopRecommendSubscriber", "error: apiMethod or apiVersion is null");
            return;
        }
        mtopRequest.setApiName(string);
        mtopRequest.setVersion(string2);
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(equals ? MethodEnum.POST : MethodEnum.GET);
        build.mo1337addListener((MtopListener) iRemoteBaseListener);
        UnifyLog.d("ShopRecommendSubscriber", "start execute: " + string);
        build.startRequest();
    }

    private JSONObject a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afae854d", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata()));
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        kge.a(-795335931);
        HashMap hashMap = new HashMap();
        f9926a = hashMap;
        hashMap.put("detail_v", "3.3.2");
        f9926a.put("ttid", "2016@taobao_android_7.7.2");
    }
}
