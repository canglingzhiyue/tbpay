package com.alipay.mobile.security.bio.api;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioParameter implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 111;
    private Bundle bundle;
    private String headImageUrl;
    private String protocol;
    private String remoteURL;
    private Map<String, String> extProperty = new HashMap();
    private boolean autoClose = true;
    public boolean isValidate = false;

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

    public String getRemoteURL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d2394446", new Object[]{this}) : this.remoteURL;
    }

    public void setRemoteURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72d0058", new Object[]{this, str});
        } else {
            this.remoteURL = str;
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

    public Bundle getBundle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("673e5703", new Object[]{this}) : this.bundle;
    }

    public void setBundle(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb69b0e9", new Object[]{this, bundle});
        } else {
            this.bundle = bundle;
        }
    }
}
