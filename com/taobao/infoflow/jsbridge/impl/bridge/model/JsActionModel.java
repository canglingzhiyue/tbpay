package com.taobao.infoflow.jsbridge.impl.bridge.model;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.ldf;

/* loaded from: classes7.dex */
public class JsActionModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JsActionModel";
    private String mAction;
    private String mBusinessId;
    private String mMethod;
    private JSONObject mParam;

    static {
        kge.a(1562971856);
        kge.a(1028243835);
    }

    public String getBusinessId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this}) : this.mBusinessId;
    }

    public void setBusinessId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9e0dce", new Object[]{this, str});
        } else {
            this.mBusinessId = str;
        }
    }

    public String getAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e81f414d", new Object[]{this}) : this.mAction;
    }

    public void setAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72d5c9", new Object[]{this, str});
        } else {
            this.mAction = str;
        }
    }

    public JSONObject getParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ed69b2fe", new Object[]{this}) : this.mParam;
    }

    public void setParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6d4cde", new Object[]{this, jSONObject});
        } else {
            this.mParam = jSONObject;
        }
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.mMethod;
    }

    public void setMethod(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
        } else {
            this.mMethod = str;
        }
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.mBusinessId)) {
            ldf.d(TAG, "businessId 为空，不符合协议约定");
            return false;
        } else if (!StringUtils.isEmpty(this.mAction)) {
            return true;
        } else {
            ldf.d(TAG, "action 为空，不符合协议约定");
            return false;
        }
    }
}
