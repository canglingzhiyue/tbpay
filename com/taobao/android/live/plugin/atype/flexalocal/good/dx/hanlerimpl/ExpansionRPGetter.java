package com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.g;
import java.util.HashMap;
import java.util.Map;
import tb.hiq;
import tb.hir;
import tb.his;
import tb.hix;
import tb.kge;
import tb.pqj;

/* loaded from: classes5.dex */
public class ExpansionRPGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes5.dex */
    public static class ExpansionRPData implements INetDataObject {
        public JSONArray expansionRedPacketList;
        public String msgInfo;
        public String result;

        static {
            kge.a(-2083832459);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes5.dex */
    public class ExpansionRPRequest implements INetDataObject {
        public String anchorId;
        public String entryLiveSource;
        public JSONObject interactJson;
        public String liveId;
        public String API_NAME = "mtop.iliad.interact.task.trigger";
        public String VERSION = "1.0";
        public boolean NEED_ECODE = true;
        public boolean NEED_SESSION = true;
        public String liveSource = "";

        static {
            kge.a(-342897436);
            kge.a(-540945145);
        }

        public ExpansionRPRequest() {
        }
    }

    static {
        kge.a(-1000352334);
    }

    public static /* synthetic */ boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{jSONObject, jSONObject2})).booleanValue() : b(jSONObject, jSONObject2);
    }

    public void a(final c cVar, Object[] objArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8f8742", new Object[]{this, cVar, objArr});
        } else if (cVar == null) {
            his.b("ExpandAwardGetter", "getExpandAward | goodLiveContext error.");
        } else if (objArr == null || objArr.length < 2) {
            his.b("ExpandAwardGetter", "getExpandAward | args error.");
        } else {
            final JSONObject jSONObject2 = null;
            if (objArr[1] instanceof JSONObject) {
                jSONObject = (JSONObject) objArr[1];
                JSONObject jSONObject3 = jSONObject.getJSONObject("nativeConfigInfos");
                if (jSONObject3 != null) {
                    jSONObject2 = jSONObject3.getJSONObject("expansionRedPacket");
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null || jSONObject2 == null) {
                his.b("ExpandAwardGetter", "getExpandAward | awardInfo error.");
                return;
            }
            cVar.L.g = true;
            new a(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    boolean z = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if ((netBaseOutDo instanceof ExpansionRPResponse) && netBaseOutDo.mo1437getData() != null) {
                        final ExpansionRPData mo1437getData = ((ExpansionRPResponse) netBaseOutDo).mo1437getData();
                        his.b("ExpandAwardGetter", "getExpansionRP | success. msg=" + mo1437getData.msgInfo + " result=" + mo1437getData.result);
                        if (!StringUtils.isEmpty(mo1437getData.msgInfo)) {
                            hix.a(cVar.f(), mo1437getData.msgInfo);
                        }
                        if (mo1437getData.expansionRedPacketList != null) {
                            for (int i2 = 0; i2 < mo1437getData.expansionRedPacketList.size(); i2++) {
                                Object obj2 = mo1437getData.expansionRedPacketList.get(i2);
                                if ((obj2 instanceof JSONObject) && ExpansionRPGetter.a((JSONObject) obj2, jSONObject2)) {
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (!z) {
                            cVar.x().b(jSONObject2);
                        }
                        cVar.K().postDelayed(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    hiq.a((LiveItem) pqj.a(mo1437getData.toString(), LiveItem.class), cVar);
                                }
                            }
                        }, hir.c());
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    if (netResponse != null) {
                        his.b("ExpandAwardGetter", "onError | code=" + netResponse.getRetCode() + " msg=" + netResponse.getRetMsg());
                    } else {
                        his.b("ExpandAwardGetter", "onError.");
                    }
                    hix.a(cVar.f(), "活动太火爆了，请稍后再试");
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    if (netResponse != null) {
                        his.b("ExpandAwardGetter", "onSystemError | code=" + netResponse.getRetCode() + " msg=" + netResponse.getRetMsg());
                    } else {
                        his.b("ExpandAwardGetter", "onSystemError.");
                    }
                    hix.a(cVar.f(), "活动太火爆了，请稍后再试");
                }
            }).a(cVar, jSONObject2, "acceler");
            if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                return;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            a(jSONObject2, hashMap);
            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("guide_expansionPacket", hashMap);
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902c638f", new Object[]{this, cVar});
        } else if (cVar == null || !cVar.L.g) {
        } else {
            his.b("ExpandAwardGetter", "hideReport | report ExpansionRP.");
            cVar.L.g = false;
            new a(new d() { // from class: com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else {
                        his.b("ExpandAwardGetter", "onSuccess.");
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        his.b("ExpandAwardGetter", "onError.");
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        his.b("ExpandAwardGetter", "onSystemError.");
                    }
                }
            }).a(cVar, (JSONObject) null, "collect");
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("525e83ad", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject != null && jSONObject2 != null) {
            String string = jSONObject.getString("acceleratorCode");
            String string2 = jSONObject2.getString("acceleratorCode");
            if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                return StringUtils.equals(string, string2);
            }
        }
        return false;
    }

    /* loaded from: classes5.dex */
    public class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1501507595);
        }

        public a(d dVar) {
            super(dVar);
        }

        public void a(c cVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3d980cb", new Object[]{this, cVar, jSONObject, str});
            } else if (cVar == null) {
                his.b("ExpandAwardGetter", "getCoupon | param is null.");
            } else {
                ExpansionRPRequest expansionRPRequest = new ExpansionRPRequest();
                expansionRPRequest.anchorId = cVar.m();
                expansionRPRequest.liveId = cVar.g();
                expansionRPRequest.interactJson = jSONObject;
                if (expansionRPRequest.interactJson == null) {
                    expansionRPRequest.interactJson = new JSONObject();
                }
                expansionRPRequest.interactJson.put("reportType", (Object) str);
                a(1, expansionRPRequest, ExpansionRPResponse.class);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class ExpansionRPResponse extends NetBaseOutDo {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ExpansionRPData data;

        static {
            kge.a(-1986952052);
        }

        @Override // com.taobao.taolive.sdk.adapter.network.NetBaseOutDo
        /* renamed from: getData */
        public ExpansionRPData mo1437getData() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExpansionRPData) ipChange.ipc$dispatch("e05d9ae9", new Object[]{this}) : this.data;
        }
    }

    public static void a(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37335efd", new Object[]{jSONObject, map});
            return;
        }
        HashMap<String, String> a2 = g.a(jSONObject);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        map.putAll(a2);
    }
}
