package com.taobao.android.livehome.plugin.atype.flexalocal.business.simple;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.BaseDetailBusiness;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taolive.room.utils.aw;
import tb.kge;
import tb.sqt;

/* loaded from: classes6.dex */
public class a extends BaseDetailBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(735313413);
    }

    public a(IRemoteBaseListener iRemoteBaseListener) {
        super(iRemoteBaseListener);
    }

    public void a(JSONArray jSONArray, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdaea6a", new Object[]{this, jSONArray, sqtVar});
            return;
        }
        SimpleQuerySafeRequest simpleQuerySafeRequest = new SimpleQuerySafeRequest();
        simpleQuerySafeRequest.setNeedRecommend(true);
        simpleQuerySafeRequest.setEntryLiveSource("newslide");
        JSONObject jSONObject = new JSONObject();
        if (jSONArray != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(aw.CHANNEL_EXP_INFO, (Object) jSONArray);
            jSONObject.put("tppParam", (Object) jSONObject2);
        }
        simpleQuerySafeRequest.setTransParams(jSONObject.toJSONString());
        a(0, simpleQuerySafeRequest, SimpleQuerySafeResponse.class);
        k.a("requestStart", "firstRequest", simpleQuerySafeRequest.API_NAME, simpleQuerySafeRequest.VERSION, sqtVar);
    }
}
