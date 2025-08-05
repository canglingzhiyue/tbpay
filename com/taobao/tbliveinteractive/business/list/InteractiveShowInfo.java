package com.taobao.tbliveinteractive.business.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class InteractiveShowInfo implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String actionUrl;
    public String extraParams;
    public String iconAction;
    public String iconViewStyle;
    public boolean isNeedShow = false;
    public boolean isNotifying = false;
    public String notificationViewParams;
    public String viewParams;

    static {
        kge.a(-830977135);
        kge.a(-540945145);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "InteractiveShowInfo{isNeedShow=" + this.isNeedShow + ", isNotifying=" + this.isNotifying + ", notificationViewParams=" + this.notificationViewParams + ", viewParams='" + this.viewParams + "', extraParams=" + this.extraParams + ", iconAction='" + this.iconAction + "', actionUrl='" + this.actionUrl + "', iconViewStyle='" + this.iconViewStyle + "'}";
    }
}
