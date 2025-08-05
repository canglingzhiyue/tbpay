package com.taobao.android.detail.ttdetail.request.params;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class CustomApiRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mApiInfo;
    private String mApiName;
    private String mApiVersion;
    private String mBizTopic;
    private String mEcode;
    private String mEnableUpCompress;
    private Map<String, String> mHeaderMap = new HashMap();
    private Map<String, String> mParams;
    private String mRequestMethod;
    private String mSession;
    private String mUnitStrategy;
    private String mWua;

    static {
        kge.a(-1005773406);
        kge.a(395113271);
    }

    public CustomApiRequestParams(Map<String, String> map) {
        this.mParams = map;
        buildParams();
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("add28f54", new Object[]{this}) : this.mParams.get("data");
    }

    public String getApiName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this}) : this.mApiName;
    }

    public String getApiVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this}) : this.mApiVersion;
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.mRequestMethod;
    }

    public String getWua() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ed67eb0c", new Object[]{this}) : this.mWua;
    }

    public String getEcode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42b43e5d", new Object[]{this}) : this.mEcode;
    }

    public String getSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59f62c99", new Object[]{this}) : this.mSession;
    }

    public String getUnitStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this}) : this.mUnitStrategy;
    }

    public Map<String, String> getHeaderMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("79ac0f15", new Object[]{this}) : this.mHeaderMap;
    }

    public String getBizTopic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ebec4e7", new Object[]{this}) : this.mBizTopic;
    }

    public String getEnableUpCompress() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55578043", new Object[]{this}) : this.mEnableUpCompress;
    }

    private void buildParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f2f3c1b", new Object[]{this});
            return;
        }
        this.mApiInfo = JSON.parseObject(this.mParams.get("apiInfo"));
        JSONObject jSONObject = this.mApiInfo;
        if (jSONObject == null) {
            return;
        }
        this.mApiName = jSONObject.getString("apiName");
        this.mApiVersion = this.mApiInfo.getString("apiVersion");
        this.mRequestMethod = this.mApiInfo.getString("method");
        this.mEcode = this.mApiInfo.getString(SessionConstants.ECODE);
        this.mSession = this.mApiInfo.getString(MspGlobalDefine.SESSION);
        this.mUnitStrategy = this.mApiInfo.getString("unitStrategy");
        this.mWua = this.mApiInfo.getString("WUA");
        this.mBizTopic = this.mApiInfo.getString("topic");
        this.mEnableUpCompress = this.mApiInfo.getString("enableUpstreamCompress");
        JSONObject parseObject = JSON.parseObject(this.mApiInfo.getString("headerInfo"));
        if (parseObject == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
            this.mHeaderMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
    }
}
