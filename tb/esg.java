package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.getredpacket.GetPacketRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class esg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27527a;

    static {
        kge.a(386249849);
    }

    public void a(final c cVar, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8f8742", new Object[]{this, cVar, objArr});
        } else if (cVar == null || objArr == null || objArr.length < 4) {
            his.b("GetRedPacket", "getRedPacket | params empty, context=" + cVar);
        } else {
            if (objArr[3] instanceof String) {
                this.f27527a = (String) objArr[3];
            }
            if (objArr.length >= 5 && (objArr[4] instanceof String)) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("bizCode", (String) objArr[4]);
                hit.a(cVar, hashMap);
                if (a.a().j() != null) {
                    a.a().j().a("goodslist_redPacket", hashMap);
                }
            }
            GetPacketRequest getPacketRequest = new GetPacketRequest();
            getPacketRequest.liveId = cVar.g();
            getPacketRequest.anchorId = cVar.m();
            getPacketRequest.liveSource = cVar.v();
            getPacketRequest.entryLiveSource = cVar.u();
            getPacketRequest.spmCnt = cVar.L();
            getPacketRequest.spmUrl = cVar.o();
            getPacketRequest.entrySpm = cVar.M();
            if (objArr[2] instanceof JSONObject) {
                getPacketRequest.transParams = (JSONObject) objArr[2];
                getPacketRequest.asac = getPacketRequest.transParams.getString("asac");
            }
            new com.taobao.android.live.plugin.atype.flexalocal.good.business.getredpacket.a(new d() { // from class: tb.esg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    if (!TextUtils.isEmpty(esg.this.f27527a) && esg.this.f27527a.contains("refreshTopRights")) {
                        his.b("GetRedPacket", "onSuccess | refreshTopRights.");
                        ddw.a().a("com.taobao.taolive.room.gl.refresh.topright", null, c.a(cVar));
                    }
                    if (!TextUtils.isEmpty(esg.this.f27527a) && esg.this.f27527a.contains("refreshGoodsList")) {
                        his.b("GetRedPacket", "onSuccess | refreshGoodsList.");
                        ddw.a().a("com.taobao.taolive.room.gl.refresh.showinglist", null, c.a(cVar));
                    }
                    if (netResponse == null || netResponse.getDataJsonObject() == null) {
                        return;
                    }
                    org.json.JSONObject dataJsonObject = netResponse.getDataJsonObject();
                    String optString = dataJsonObject.optString("msgInfo");
                    boolean optBoolean = dataJsonObject.optBoolean("msgCode");
                    his.b("GetRedPacket", "onSuccess | success=" + optBoolean + "    msgInfo=" + optString);
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    hix.a(cVar.f(), optString);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    his.b("GetRedPacket", "onError.");
                    hix.a(cVar.f(), "活动太火爆了，请稍后再试");
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    his.b("GetRedPacket", "onSystemError.");
                    hix.a(cVar.f(), "活动太火爆了，请稍后再试");
                }
            }).a(getPacketRequest);
        }
    }
}
