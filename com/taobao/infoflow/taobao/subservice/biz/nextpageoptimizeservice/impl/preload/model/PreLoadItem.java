package com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class PreLoadItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String url;

    static {
        kge.a(18076559);
        kge.a(1028243835);
    }

    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : this.url;
    }

    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.url = str;
        }
    }
}
