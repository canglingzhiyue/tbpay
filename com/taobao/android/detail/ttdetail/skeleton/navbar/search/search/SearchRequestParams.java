package com.taobao.android.detail.ttdetail.skeleton.navbar.search.search;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes5.dex */
public class SearchRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String appId;
    public Params params;

    /* loaded from: classes5.dex */
    public static class Params implements Serializable {
        public String area;
        public String itemId;
        public String nick;
        public String shopId;
        public String ttid;
        public String userId;
        public String utdid;

        static {
            kge.a(1421129901);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(-132379779);
        kge.a(395113271);
    }

    public String getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("63f8f7fd", new Object[]{this}) : JSONObject.toJSONString(this.params);
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("add28f54", new Object[]{this}) : JSONObject.toJSONString(this);
    }
}
