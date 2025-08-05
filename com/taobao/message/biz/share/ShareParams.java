package com.taobao.message.biz.share;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.biz.contacts.Contacts;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class ShareParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<Contacts> contacts;
    private String shareRemark;
    private String shareUrl;

    static {
        kge.a(-194894690);
    }

    public ShareParams(List<Contacts> list, String str) {
        this.contacts = list;
        this.shareUrl = str;
    }

    public List<Contacts> getContacts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ff466277", new Object[]{this}) : this.contacts;
    }

    public void setContacts(List<Contacts> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2965cd", new Object[]{this, list});
        } else {
            this.contacts = list;
        }
    }

    public String getShareUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("732de433", new Object[]{this}) : this.shareUrl;
    }

    public void setShareUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6bfca3", new Object[]{this, str});
        } else {
            this.shareUrl = str;
        }
    }

    public String getShareRemark() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab50fb90", new Object[]{this}) : this.shareRemark;
    }

    public void setShareRemark(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d685a54e", new Object[]{this, str});
        } else {
            this.shareRemark = str;
        }
    }
}
