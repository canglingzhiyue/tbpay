package com.alipay.mobile.security.faceauth.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class AntDetectParameter implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 111;
    private int appID;
    private String protocol;
    private int action = 0;
    private String extJson = "";
    private String tag = "";
    private String remoteUrl = "";
    private boolean autoClose = true;
    private String apdid = "";
    private int scene = 0;
    public Map<String, String> extProperty = new HashMap();
    private boolean enableNavPage = true;
    private boolean enablePrePoseAlert = true;

    public String getRemoteUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e923c046", new Object[]{this}) : this.remoteUrl;
    }

    public void setRemoteUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd920458", new Object[]{this, str});
        } else {
            this.remoteUrl = str;
        }
    }

    public int getAction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c8fafa6", new Object[]{this})).intValue() : this.action;
    }

    public void setAction(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcc2d24", new Object[]{this, new Integer(i)});
        } else {
            this.action = i;
        }
    }

    public String getExtJson() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1db89666", new Object[]{this}) : this.extJson;
    }

    public void setExtJson(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05dbf38", new Object[]{this, str});
        } else {
            this.extJson = str;
        }
    }

    public String getTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("54a5a515", new Object[]{this}) : this.tag;
    }

    public void setTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9be069", new Object[]{this, str});
        } else {
            this.tag = str;
        }
    }

    public int getAppID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("44fe96c0", new Object[]{this})).intValue() : this.appID;
    }

    public void setAppID(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f903e2", new Object[]{this, new Integer(i)});
        } else {
            this.appID = i;
        }
    }

    public boolean isAutoClose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("232c348a", new Object[]{this})).booleanValue() : this.autoClose;
    }

    public void setAutoClose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523dbc46", new Object[]{this, new Boolean(z)});
        } else {
            this.autoClose = z;
        }
    }

    public String getApdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a23faff", new Object[]{this}) : this.apdid;
    }

    public void setApdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e733fabf", new Object[]{this, str});
        } else {
            this.apdid = str;
        }
    }

    public int getScene() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("666ee850", new Object[]{this})).intValue() : this.scene;
    }

    public void setScene(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9592e452", new Object[]{this, new Integer(i)});
        } else {
            this.scene = i;
        }
    }

    public void addExtProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6f4d0", new Object[]{this, str, str2});
        } else {
            this.extProperty.put(str, str2);
        }
    }

    public Map<String, String> getExtProperty() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ecd485c", new Object[]{this}) : this.extProperty;
    }

    public boolean enableNavPage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6729445a", new Object[]{this})).booleanValue() : this.enableNavPage;
    }

    public void setEnableNavPage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2887dd40", new Object[]{this, new Boolean(z)});
        } else {
            this.enableNavPage = z;
        }
    }

    public boolean enablePrePoseAlert() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d46bc16", new Object[]{this})).booleanValue() : this.enablePrePoseAlert;
    }

    public void setEnablePrePoseAlert(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c1c640", new Object[]{this, new Boolean(z)});
        } else {
            this.enablePrePoseAlert = z;
        }
    }

    public String getProtocol() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("98ee17ab", new Object[]{this}) : this.protocol;
    }

    public void setProtocol(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2382b", new Object[]{this, str});
        } else {
            this.protocol = str;
        }
    }
}
