package com.taobao.android.change.app.icon.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.Constrant;
import tb.kge;

/* loaded from: classes4.dex */
public class ChangeAppIconJSModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String changeType;
    public String crash;
    public String iconName;

    static {
        kge.a(-1950039400);
    }

    public boolean isBackgroud() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fbaef6d", new Object[]{this})).booleanValue() : StringUtils.equals(this.changeType, Constrant.ChangeType.BG);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ChangeAppIconJSModel{iconName='" + this.iconName + "', crash='" + this.crash + "', changeType='" + this.changeType + "'}";
    }
}
