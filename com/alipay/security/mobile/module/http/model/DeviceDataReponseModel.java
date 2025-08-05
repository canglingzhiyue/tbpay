package com.alipay.security.mobile.module.http.model;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cjw;

/* loaded from: classes3.dex */
public class DeviceDataReponseModel extends BaseResponseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ILLEGAL_REQUEST = 3;
    public static final int NETFAIL = 2;
    public static final String SERVER_STATUS_ILLEGAL = "APPKEY_ERROR";
    public static final String SERVER_STATUS_OK = "SUCCESS";
    public static final int SUCCESS = 1;
    public String agentSwitch;
    public String apdid;
    public String bugTrackSwitch;
    public String dynamicKey;
    public String lastTimeApdidGenerated;
    public String timeInterval;
    public String token;
    public String webrtcUrl;
    public String apseDegrade = "";
    public String collectConfig = "";

    public String getAgentSwitch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e326576", new Object[]{this});
        }
        String str = this.agentSwitch;
        return str == null ? "0" : str;
    }

    public boolean getLogSwitch() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fcbd786d", new Object[]{this})).booleanValue() : "1".equals(this.bugTrackSwitch);
    }

    public int getRequestResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7c66a550", new Object[]{this})).intValue() : this.success ? cjw.a(this.apdid) ? 2 : 1 : SERVER_STATUS_ILLEGAL.equals(this.resultCode) ? 3 : 2;
    }
}
