package com.taobao.android.tracker.page.page.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class ConfData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String intercept;
    private String rule;

    static {
        kge.a(-730771767);
        kge.a(1028243835);
    }

    public String getIntercept() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("33d9c6d", new Object[]{this}) : this.intercept;
    }

    public void setIntercept(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b3ad11", new Object[]{this, str});
        } else {
            this.intercept = str;
        }
    }

    public String getRule() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2b8aac7", new Object[]{this}) : this.rule;
    }

    public void setRule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8dbee8f", new Object[]{this, str});
        } else {
            this.rule = str;
        }
    }
}
