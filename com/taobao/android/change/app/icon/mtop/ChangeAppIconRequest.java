package com.taobao.android.change.app.icon.mtop;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.ChangeAppIconJSModel;
import tb.kge;

/* loaded from: classes4.dex */
public class ChangeAppIconRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String changeType;
    public int enableLaunchers;
    public String errorMsg;
    public boolean killed;
    public String status;
    public String targetIcon;
    public String deviceBrand = Build.BRAND;
    public String deviceModel = Build.MODEL;
    public String osVersion = Build.VERSION.RELEASE;

    static {
        kge.a(-1243903568);
    }

    public ChangeAppIconRequest(String str, String str2, int i) {
        this.targetIcon = str;
        this.status = str2;
        this.enableLaunchers = i;
    }

    public void setChangeType(ChangeAppIconJSModel changeAppIconJSModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41060a76", new Object[]{this, changeAppIconJSModel});
        } else if (changeAppIconJSModel == null) {
        } else {
            this.changeType = changeAppIconJSModel.changeType;
        }
    }

    public void setKilled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e5570e", new Object[]{this, new Boolean(z)});
        } else {
            this.killed = z;
        }
    }

    public void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ChangeAppIconInfos{status=" + this.status + ", targetIcon='" + this.targetIcon + "', enableLaunchers=" + this.enableLaunchers + ", changeType=" + this.changeType + ", killed=" + this.killed + ", errorMsg='" + this.errorMsg + "', deviceBrand='" + this.deviceBrand + "', deviceModel='" + this.deviceModel + "', osVersion='" + this.osVersion + "'}";
    }
}
