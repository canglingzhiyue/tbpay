package com.taobao.android.tracker.wvplugin.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes6.dex */
public class DTData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String conf;
    private String pageId;

    static {
        kge.a(423369068);
        kge.a(1028243835);
    }

    public String getPageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this}) : this.pageId;
    }

    public void setPageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
        } else {
            this.pageId = str;
        }
    }

    public String getConf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("66c3bb9f", new Object[]{this}) : this.conf;
    }

    public void setConf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("632f8b7", new Object[]{this, str});
        } else {
            this.conf = str;
        }
    }
}
