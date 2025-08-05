package com.taobao.android.detail.ttdetail.request.params;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.ut.device.UTDevice;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class RecommendRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mParams = new JSONObject();

    static {
        kge.a(1882591407);
        kge.a(395113271);
    }

    public static /* synthetic */ JSONObject access$000(RecommendRequestParams recommendRequestParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a48aecb7", new Object[]{recommendRequestParams}) : recommendRequestParams.mParams;
    }

    public RecommendRequestParams(JSONObject jSONObject) {
        buildParams(jSONObject);
    }

    private void buildParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b02e35", new Object[]{this, jSONObject});
            return;
        }
        this.mParams.put("bizId", (Object) "detailRecommend");
        Application a2 = f.a();
        this.mParams.put("longitude", (Object) odg.e().b(a2));
        this.mParams.put("latitude", (Object) odg.e().c(a2));
        this.mParams.put("utdid", (Object) UTDevice.getUtdid(a2));
        if (jSONObject == null) {
            return;
        }
        this.mParams.putAll(jSONObject);
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("add28f54", new Object[]{this}) : JSONObject.toJSONString(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.request.params.RecommendRequestParams.1
            {
                put("param", (Object) RecommendRequestParams.access$000(RecommendRequestParams.this).toJSONString());
            }
        });
    }
}
