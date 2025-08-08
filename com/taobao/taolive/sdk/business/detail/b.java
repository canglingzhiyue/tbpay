package com.taobao.taolive.sdk.business.detail;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.u;
import tb.kge;
import tb.pmd;
import tb.poj;

/* loaded from: classes8.dex */
public class b extends com.taobao.taolive.sdk.business.b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(424675541);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public b(d dVar) {
        super(dVar);
    }

    public void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8859e18", new Object[]{this, aVar, str});
        } else if ("1".equals(str)) {
            RecommendLiveDetailRequest recommendLiveDetailRequest = new RecommendLiveDetailRequest();
            recommendLiveDetailRequest.liveId = aVar.b();
            recommendLiveDetailRequest.creatorId = aVar.d();
            recommendLiveDetailRequest.liveSource = aVar.g();
            recommendLiveDetailRequest.extendJson = aVar.h();
            recommendLiveDetailRequest.timeMovingItemId = aVar.e();
            recommendLiveDetailRequest.sjsdItemId = aVar.f();
            a(1, recommendLiveDetailRequest, LiveDetailResponse.class);
        } else {
            LiveDetailRequest liveDetailRequest = new LiveDetailRequest();
            liveDetailRequest.liveId = aVar.b();
            liveDetailRequest.creatorId = aVar.d();
            liveDetailRequest.liveSource = aVar.g();
            liveDetailRequest.extendJson = aVar.h();
            liveDetailRequest.timeMovingItemId = aVar.e();
            liveDetailRequest.sjsdItemId = aVar.f();
            liveDetailRequest.transParams = aVar.k();
            liveDetailRequest.productType = aVar.c();
            liveDetailRequest.entryLiveSource = aVar.p().get("entryLiveSource");
            if (aVar.l() == LiveEmbedType.SHOP_CARD) {
                liveDetailRequest.setAPI_NAME("mtop.tblive.live.detail.query.room");
                liveDetailRequest.setVERSION("1.0");
            } else if (liveDetailRequest.liveId == null && l.d(aVar.o())) {
                liveDetailRequest.setAPI_NAME(u.aw());
                liveDetailRequest.setVERSION("1.0");
            } else {
                liveDetailRequest.setAPI_NAME("mtop.tblive.live.detail.query");
                liveDetailRequest.setVERSION("4.0");
            }
            a(liveDetailRequest);
            liveDetailRequest.itemHoldType = aVar.n();
            liveDetailRequest.holdItemIds = aVar.m();
            liveDetailRequest.useLiveFandom = aVar.i();
            liveDetailRequest.forceFandom = aVar.j();
            liveDetailRequest.keyPointId = aVar.a();
            liveDetailRequest.tcpContext = aVar.f21798a;
            liveDetailRequest.outParam = aVar.b;
            if (liveDetailRequest.extendJson == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("sjsdParams", (Object) aVar.q());
                jSONObject.put("needProcSjsd", (Object) aVar.r());
                liveDetailRequest.extendJson = JSONObject.toJSONString(jSONObject);
            } else {
                JSONObject parseObject = JSONObject.parseObject(liveDetailRequest.extendJson);
                parseObject.put("sjsdParams", (Object) aVar.q());
                parseObject.put("needProcSjsd", (Object) aVar.r());
                liveDetailRequest.extendJson = JSONObject.toJSONString(parseObject);
            }
            a(1, liveDetailRequest, LiveDetailResponse.class);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        NetResponse netResponse2 = new NetResponse();
        netResponse2.setRetCode("onSuccess Error");
        netResponse2.setRetMsg("onSuccess Error");
        onError(i, netResponse2, obj);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.b.onError(i, netResponse, obj);
        poj n = pmd.a().n();
        if (n == null) {
            return;
        }
        String str = "onError";
        String retCode = netResponse != null ? netResponse.getRetCode() : str;
        if (netResponse != null) {
            str = netResponse.getRetMsg();
        }
        n.a("Page_Immersion", "firstTimeGet", retCode, str);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.b.onSystemError(i, netResponse, obj);
        poj n = pmd.a().n();
        if (n == null) {
            return;
        }
        String str = "onSystemError";
        String retCode = netResponse != null ? netResponse.getRetCode() : str;
        if (netResponse != null) {
            str = netResponse.getRetMsg();
        }
        n.a("Page_Immersion", "firstTimeGet", retCode, str);
    }

    private void a(LiveDetailRequest liveDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4da93d", new Object[]{this, liveDetailRequest});
        } else if (liveDetailRequest == null) {
        } else {
            if (l.d(pmd.a().d().a("tblive", "enableGoodsMultiTabContainerV2", "true"))) {
                q.b("LiveDetailBusiness", "enableGoodsMultiTabContainerV2 true");
                try {
                    if (StringUtils.isEmpty(liveDetailRequest.extendJson)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("supportItemH5", (Object) "1");
                        liveDetailRequest.extendJson = JSONObject.toJSONString(jSONObject);
                        return;
                    }
                    JSONObject parseObject = JSONObject.parseObject(liveDetailRequest.extendJson);
                    parseObject.put("supportItemH5", (Object) "1");
                    liveDetailRequest.extendJson = JSONObject.toJSONString(parseObject);
                    return;
                } catch (Throwable th) {
                    q.b("LiveDetailBusiness", "add supportItemH5 error = " + th.getMessage());
                    return;
                }
            }
            q.b("LiveDetailBusiness", "enableGoodsMultiTabContainerV2 false");
        }
    }
}
