package com.alibaba.wireless.aliprivacyext.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class b implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String[] permissions;
    private String sceneCode;

    public String[] getPermissions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("ecbd9164", new Object[]{this}) : this.permissions;
    }

    public String getSceneCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8fb44f6", new Object[]{this}) : this.sceneCode;
    }

    public void setPermissions(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73d72436", new Object[]{this, strArr});
        } else {
            this.permissions = strArr;
        }
    }

    public void setSceneCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98ab15a8", new Object[]{this, str});
        } else {
            this.sceneCode = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AuthData{sceneCode='" + this.sceneCode + "', permissions=" + Arrays.toString(this.permissions) + '}';
    }
}
