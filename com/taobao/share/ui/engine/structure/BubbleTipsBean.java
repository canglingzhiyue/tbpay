package com.taobao.share.ui.engine.structure;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes8.dex */
public class BubbleTipsBean implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String index;
    private String text;

    static {
        kge.a(1962527493);
        kge.a(1028243835);
    }

    public String getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a3a295d", new Object[]{this}) : this.index;
    }

    public void setIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e39821", new Object[]{this, str});
        } else {
            this.index = str;
        }
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97297536", new Object[]{this}) : this.text;
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }
}
