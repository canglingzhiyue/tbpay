package com.alipay.mobile.security.faceauth.api.sample;

import com.alipay.mobile.security.faceauth.api.AntDetectParameter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AntSampleFaceParameter extends AntDetectParameter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String appName = "";

    public String getAppName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this}) : this.appName;
    }

    public void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.appName = str;
        }
    }

    public AntSampleFaceParameter() {
        setAction(65536);
    }

    public void clone(AntDetectParameter antDetectParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69807d8e", new Object[]{this, antDetectParameter});
            return;
        }
        setAction(antDetectParameter.getAction());
        setAppID(antDetectParameter.getAppID());
        setExtJson(antDetectParameter.getExtJson());
        setApdid(antDetectParameter.getApdid());
        setTag(antDetectParameter.getTag());
        setRemoteUrl(antDetectParameter.getRemoteUrl());
        setAutoClose(antDetectParameter.isAutoClose());
        setScene(antDetectParameter.getScene());
        setEnableNavPage(antDetectParameter.enableNavPage());
        setEnablePrePoseAlert(antDetectParameter.enablePrePoseAlert());
        setProtocol(antDetectParameter.getProtocol());
        for (Map.Entry<String, String> entry : antDetectParameter.getExtProperty().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                addExtProperty(key.toString(), value.toString());
            }
        }
    }
}
