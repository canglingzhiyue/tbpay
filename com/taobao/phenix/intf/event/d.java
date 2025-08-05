package com.taobao.phenix.intf.event;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public com.taobao.phenix.intf.c ticket;
    public String url;

    static {
        kge.a(299840297);
    }

    public d(com.taobao.phenix.intf.c cVar) {
        this.ticket = cVar;
    }

    public d(String str, com.taobao.phenix.intf.c cVar) {
        this.url = str;
        this.ticket = cVar;
    }

    public com.taobao.phenix.intf.c getTicket() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.intf.c) ipChange.ipc$dispatch("b7944dc5", new Object[]{this}) : this.ticket;
    }

    public void setTicket(com.taobao.phenix.intf.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57611f2d", new Object[]{this, cVar});
        } else {
            this.ticket = cVar;
        }
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
