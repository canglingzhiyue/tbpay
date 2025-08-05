package com.taobao.android.detail.core.request.jhs;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.a;
import java.io.Serializable;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class JoinJhsRequestParams extends a implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_ACTION = "action";
    private transient String action;
    public String exParams = constructExParams();
    public String itemNumId;

    static {
        kge.a(672243529);
        kge.a(1028243835);
    }

    public JoinJhsRequestParams(String str, String str2) {
        this.itemNumId = str;
        this.action = str2;
        emu.a("com.taobao.android.detail.core.request.jhs.JoinJhsRequestParams");
    }

    private String constructExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65ce17e9", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.action)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", this.action);
        return JSONObject.toJSONString(hashMap);
    }
}
