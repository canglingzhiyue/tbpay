package com.alipay.mobile.security.faceauth.api.login;

import com.alipay.mobile.security.faceauth.api.AntDetectParameter;
import com.alipay.mobile.security.faceauth.api.AntDetector;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class AntFaceLoginParameter extends AntDetectParameter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 2;
    private String headImageUrl = "";

    public AntFaceLoginParameter() {
        setAction(AntDetector.ACTION_ID_LOGIN);
    }

    public String getHeadImageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("770442af", new Object[]{this}) : this.headImageUrl;
    }

    public void setHeadImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa2287a7", new Object[]{this, str});
        } else {
            this.headImageUrl = str;
        }
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
