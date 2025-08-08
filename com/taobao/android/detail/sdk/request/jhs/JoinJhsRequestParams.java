package com.taobao.android.detail.sdk.request.jhs;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class JoinJhsRequestParams extends DetailVRequestParams implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_ACTION = "action";
    private transient String action;
    public String exParams = constructExParams();
    public String itemNumId;

    static {
        kge.a(-1810119356);
        kge.a(1028243835);
    }

    public JoinJhsRequestParams(String str, String str2) {
        this.itemNumId = str;
        this.action = str2;
        tpc.a("com.taobao.android.detail.sdk.request.jhs.JoinJhsRequestParams");
    }

    private String constructExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65ce17e9", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.action)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", this.action);
        return JSONObject.toJSONString(hashMap);
    }
}
