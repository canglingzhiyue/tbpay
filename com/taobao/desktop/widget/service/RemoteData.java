package com.taobao.desktop.widget.service;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class RemoteData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String changeWidgetId;
    public String typeId;

    static {
        kge.a(-1547612561);
        kge.a(1028243835);
    }

    public String getChangeWidgetId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec6a64d4", new Object[]{this}) : this.changeWidgetId;
    }

    public void setChangeWidgetId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1ae5722", new Object[]{this, str});
        } else {
            this.changeWidgetId = str;
        }
    }

    public String getTypeId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c732aee", new Object[]{this}) : this.typeId;
    }

    public void setTypeId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219c2048", new Object[]{this, str});
        } else {
            this.typeId = str;
        }
    }
}
