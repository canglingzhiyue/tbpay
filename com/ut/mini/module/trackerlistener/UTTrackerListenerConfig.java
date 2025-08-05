package com.ut.mini.module.trackerlistener;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class UTTrackerListenerConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> close;
    private List<String> open;
    private String other;

    static {
        kge.a(-582558497);
        kge.a(1028243835);
    }

    public List<String> getOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f40a4820", new Object[]{this}) : this.open;
    }

    public void setOpen(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c59b44", new Object[]{this, list});
        } else {
            this.open = list;
        }
    }

    public List<String> getClose() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ef430f5e", new Object[]{this}) : this.close;
    }

    public void setClose(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da54b2e", new Object[]{this, list});
        } else {
            this.close = list;
        }
    }

    public String getOther() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5757c5df", new Object[]{this}) : this.other;
    }

    public void setOther(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40798bdf", new Object[]{this, str});
        } else {
            this.other = str;
        }
    }
}
