package com.taobao.android.dinamicx.expression.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXRichTextLinkEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String link;

    static {
        kge.a(-1737247478);
    }

    public DXRichTextLinkEvent(long j) {
        super(j);
    }

    public String getLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c509bc89", new Object[]{this}) : this.link;
    }

    public void setLink(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ad150d", new Object[]{this, str});
        } else {
            this.link = str;
        }
    }
}
