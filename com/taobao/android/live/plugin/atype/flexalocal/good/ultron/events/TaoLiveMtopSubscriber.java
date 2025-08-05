package com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events;

import android.taobao.windvane.util.m;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.HashMap;
import java.util.Map;
import tb.arz;
import tb.kge;

/* loaded from: classes5.dex */
public class TaoLiveMtopSubscriber extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static final class MtopResponseData implements INetDataObject {
        static {
            kge.a(286849978);
            kge.a(-540945145);
        }

        private MtopResponseData() {
        }
    }

    static {
        kge.a(153367453);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveMtopSubscriber taoLiveMtopSubscriber, String str, Object... objArr) {
        if (str.hashCode() == -1814481661) {
            super.a((com.alibaba.android.ultron.event.base.e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.a, com.alibaba.android.ultron.event.q
    public void a(final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        super.a(eVar);
        m.c("LiveMtopApi", "handle");
        final JSONObject d = d(eVar);
        NetRequest netRequest = new NetRequest();
        String string = d.getString("inputParams");
        if (string != null) {
            netRequest.dataParams = (Map) JSONObject.parseObject(string, new TypeReference<HashMap<String, String>>(String.class, String.class) { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.TaoLiveMtopSubscriber.1
            }, new Feature[0]);
        }
        netRequest.setData(string);
        netRequest.setApiName(d.getString("api"));
        netRequest.setVersion(d.getString("v"));
        netRequest.setNeedEcode(true);
        new com.taobao.taolive.sdk.business.b(new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.ultron.events.TaoLiveMtopSubscriber.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            private JSONObject a(NetResponse netResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (JSONObject) ipChange2.ipc$dispatch("bd5230e3", new Object[]{this, netResponse});
                }
                try {
                    JSONObject jSONObject = (JSONObject) JSON.parse(netResponse.getBytedata(), new Feature[0]);
                    if (jSONObject == null || !(jSONObject.get("data") instanceof JSONObject)) {
                        return null;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    if (netResponse.getRetMsg() != null) {
                        jSONObject2.put(arz.KEY_RET_MSG, (Object) netResponse.getRetMsg());
                    }
                    return jSONObject2;
                } catch (Throwable th) {
                    m.e("LiveMtopApi", th.toString());
                    return null;
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else {
                    TaoLiveMtopSubscriber.this.a(eVar, "onSuccess", d, a(netResponse));
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    TaoLiveMtopSubscriber.this.a(eVar, "onFail", d, a(netResponse));
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    TaoLiveMtopSubscriber.this.a(eVar, "onFail", d, a(netResponse));
                }
            }
        }).a(1, netRequest, MtopResponse.class);
    }

    /* loaded from: classes5.dex */
    public static final class MtopResponse extends NetBaseOutDo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private MtopResponseData data;

        static {
            kge.a(-1318973456);
        }

        private MtopResponse() {
        }

        public void setData(MtopResponseData mtopResponseData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5891f6f4", new Object[]{this, mtopResponseData});
            } else {
                this.data = mtopResponseData;
            }
        }

        @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
        /* renamed from: getData */
        public Object mo1437getData() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : this.data;
        }
    }
}
