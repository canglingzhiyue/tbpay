package com.taobao.taolive.adapterimpl.follow.newfollow;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.phg;
import tb.pmt;
import tb.pmu;
import tb.pmv;
import tb.pmw;
import tb.pmx;
import tb.pmy;
import tb.pna;
import tb.pnb;
import tb.poy;

/* loaded from: classes8.dex */
public class a implements pmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Boolean> f21366a;
    private List<pmx> b = new CopyOnWriteArrayList();

    public static /* synthetic */ void a(a aVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9854b4a", new Object[]{aVar, str, new Boolean(z)});
        } else {
            aVar.a(str, z);
        }
    }

    static {
        kge.a(1134494988);
        kge.a(-966474448);
        f21366a = new HashMap();
    }

    @Override // tb.pmu
    public void a(pmx pmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9eb42dd", new Object[]{this, pmxVar});
        } else if (pmxVar == null || this.b.contains(pmxVar)) {
        } else {
            this.b.add(pmxVar);
        }
    }

    @Override // tb.pmu
    public void b(pmx pmxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86e495e", new Object[]{this, pmxVar});
        } else if (pmxVar == null) {
        } else {
            this.b.remove(pmxVar);
        }
    }

    @Override // tb.pmu
    public void a(final pmt pmtVar, final pmv pmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b35618", new Object[]{this, pmtVar, pmvVar});
            return;
        }
        new b(new d() { // from class: com.taobao.taolive.adapterimpl.follow.newfollow.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (!(netBaseOutDo instanceof FollowResponse)) {
                } else {
                    FollowResponseData mo1437getData = ((FollowResponse) netBaseOutDo).mo1437getData();
                    pmy pmyVar = new pmy();
                    pmyVar.f32766a = mo1437getData.toastMsg;
                    pmv pmvVar2 = pmvVar;
                    if (pmvVar2 != null) {
                        pmvVar2.a(pmyVar);
                    }
                    a.this.a(pmtVar, true);
                    a.a(a.this, pmtVar.f32764a, true);
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                String retCode = netResponse != null ? netResponse.getRetCode() : "10086";
                String retMsg = netResponse != null ? netResponse.getRetMsg() : "服务出错了";
                pmv pmvVar2 = pmvVar;
                if (pmvVar2 == null) {
                    return;
                }
                pmvVar2.a(retCode, retMsg);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    onError(i, netResponse, obj);
                }
            }
        }).a(0, b(pmtVar), FollowResponse.class);
        HashMap hashMap = new HashMap();
        hashMap.put("is_follow", "follow");
        phg.a().a("attention_test", (Map<String, String>) hashMap);
    }

    @Override // tb.pmu
    public void b(final pmt pmtVar, final pmv pmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764c4b99", new Object[]{this, pmtVar, pmvVar});
            return;
        }
        b bVar = new b(new d() { // from class: com.taobao.taolive.adapterimpl.follow.newfollow.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (!(netBaseOutDo instanceof FollowResponse)) {
                } else {
                    FollowResponseData mo1437getData = ((FollowResponse) netBaseOutDo).mo1437getData();
                    pnb pnbVar = new pnb();
                    pnbVar.f32768a = mo1437getData.toastMsg;
                    pmv pmvVar2 = pmvVar;
                    if (pmvVar2 != null) {
                        pmvVar2.a(pnbVar);
                    }
                    a.this.a(pmtVar, false);
                    a.a(a.this, pmtVar.f32764a, false);
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                String retCode = netResponse != null ? netResponse.getRetCode() : "10086";
                String retMsg = netResponse != null ? netResponse.getRetMsg() : "服务出错了";
                pmv pmvVar2 = pmvVar;
                if (pmvVar2 == null) {
                    return;
                }
                pmvVar2.a(retCode, retMsg);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    onError(i, netResponse, obj);
                }
            }
        });
        CancelFollowRequest cancelFollowRequest = new CancelFollowRequest();
        cancelFollowRequest.accountId = pmtVar.f32764a;
        cancelFollowRequest.contentId = pmtVar.c;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> f = poy.f(n.a());
        if (f != null) {
            Set<String> keySet = f.keySet();
            if (keySet != null && keySet.size() > 0) {
                for (String str : keySet) {
                    jSONObject.put(str, (Object) f.get(str));
                }
            }
            if (StringUtils.isEmpty(cancelFollowRequest.contentId) && f.containsKey("contentId")) {
                cancelFollowRequest.contentId = f.get("contentId");
            }
        }
        a(cancelFollowRequest.accountId, cancelFollowRequest.contentId, f, jSONObject);
        cancelFollowRequest.extraFlag = JSON.toJSONString(jSONObject);
        bVar.a(0, cancelFollowRequest, FollowResponse.class);
        HashMap hashMap = new HashMap();
        hashMap.put("is_follow", c.MSG_UNFOLLOWED);
        phg.a().a("attention_test", (Map<String, String>) hashMap);
    }

    @Override // tb.pmu
    public boolean a(pmt pmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9e97165", new Object[]{this, pmtVar})).booleanValue();
        }
        if (!f21366a.containsKey(pmtVar.f32764a)) {
            return false;
        }
        return f21366a.get(pmtVar.f32764a).booleanValue();
    }

    @Override // tb.pmu
    public void a(pmt pmtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43456d93", new Object[]{this, pmtVar, new Boolean(z)});
        } else {
            f21366a.put(pmtVar.f32764a, Boolean.valueOf(z));
        }
    }

    @Override // tb.pmu
    public void c(final pmt pmtVar, final pmv pmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e5411a", new Object[]{this, pmtVar, pmvVar});
            return;
        }
        b bVar = new b(new d() { // from class: com.taobao.taolive.adapterimpl.follow.newfollow.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (!(netBaseOutDo instanceof QueryFollowResponse)) {
                } else {
                    QueryFollowResponseData mo1437getData = ((QueryFollowResponse) netBaseOutDo).mo1437getData();
                    pna pnaVar = new pna();
                    pnaVar.f32767a = mo1437getData.follow;
                    pmv pmvVar2 = pmvVar;
                    if (pmvVar2 != null) {
                        pmvVar2.a(pnaVar);
                    }
                    a.this.a(pmtVar, mo1437getData.follow);
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                String retCode = netResponse != null ? netResponse.getRetCode() : "10086";
                String retMsg = netResponse != null ? netResponse.getRetMsg() : "服务出错了";
                pmv pmvVar2 = pmvVar;
                if (pmvVar2 == null) {
                    return;
                }
                pmvVar2.a(retCode, retMsg);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    onError(i, netResponse, obj);
                }
            }
        });
        QueryFollowRequest queryFollowRequest = new QueryFollowRequest();
        queryFollowRequest.targetUserIdStr = pmtVar.f32764a;
        bVar.a(0, queryFollowRequest, QueryFollowResponse.class);
    }

    @Override // tb.pmu
    public void d(pmt pmtVar, pmv pmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7e369b", new Object[]{this, pmtVar, pmvVar});
        } else if (f21366a.containsKey(pmtVar.f32764a) && pmvVar != null) {
            pna pnaVar = new pna();
            pnaVar.f32767a = f21366a.get(pmtVar.f32764a).booleanValue();
            pmvVar.a(pnaVar);
        } else {
            c(pmtVar, pmvVar);
        }
    }

    @Override // tb.pmu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            f21366a.clear();
        }
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        pmw pmwVar = new pmw();
        pmwVar.f32765a = str;
        pmwVar.b = z;
        for (pmx pmxVar : this.b) {
            pmxVar.onFollowChange(pmwVar);
        }
    }

    public static AddFollowRequest b(pmt pmtVar) {
        Set<String> keySet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AddFollowRequest) ipChange.ipc$dispatch("5696287e", new Object[]{pmtVar});
        }
        AddFollowRequest addFollowRequest = new AddFollowRequest();
        addFollowRequest.accountId = pmtVar.f32764a;
        addFollowRequest.contentId = pmtVar.c;
        addFollowRequest.spmUrl = pmtVar.d;
        addFollowRequest.clickId = pmtVar.e;
        addFollowRequest.liveSource = pmtVar.f;
        addFollowRequest.ad = pmtVar.g;
        addFollowRequest.entryLiveSource = pmtVar.h;
        addFollowRequest.entrySpm = pmtVar.i;
        addFollowRequest.kandianId = pmtVar.j;
        addFollowRequest.watchId = pmtVar.k;
        addFollowRequest.pvId = pmtVar.l;
        addFollowRequest.originPage = pmtVar.m;
        addFollowRequest.spmCnt = pmtVar.n;
        addFollowRequest.appKey = pmtVar.o;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("followSource", (Object) pmtVar.p);
        jSONObject.put("originPage", (Object) pmtVar.m);
        Map<String, String> f = poy.f(n.a());
        if (f != null && (keySet = f.keySet()) != null && keySet.size() > 0) {
            for (String str : keySet) {
                jSONObject.put(str, (Object) f.get(str));
            }
        }
        a(addFollowRequest.accountId, addFollowRequest.contentId, f, jSONObject);
        addFollowRequest.extraFlag = JSON.toJSONString(jSONObject);
        return addFollowRequest;
    }

    private static void a(String str, String str2, Map<String, String> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b274c987", new Object[]{str, str2, map, jSONObject});
        } else if (!u.aP()) {
        } else {
            String str3 = map.get("accountId");
            String str4 = map.get("contentId");
            if (!StringUtils.isEmpty(str) && !str.equals(str3)) {
                jSONObject.put("accountId", (Object) str);
            }
            if (StringUtils.isEmpty(str2) || str2.equals(str4)) {
                return;
            }
            jSONObject.put("contentId", (Object) str2);
        }
    }
}
