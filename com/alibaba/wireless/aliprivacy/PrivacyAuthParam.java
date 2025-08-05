package com.alibaba.wireless.aliprivacy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes3.dex */
public class PrivacyAuthParam implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, Boolean> permissions;
    private String sceneCode;

    public String getSceneCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8fb44f6", new Object[]{this}) : this.sceneCode;
    }

    public void setSceneCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ab15a8", new Object[]{this, str});
        } else {
            this.sceneCode = str;
        }
    }

    public Map<String, Boolean> getPermissions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("961fe24a", new Object[]{this}) : this.permissions;
    }

    public void setPermissions(Map<String, Boolean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbade1c", new Object[]{this, map});
        } else {
            this.permissions = map;
        }
    }
}
