package com.taobao.message.biz.share;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.biz.contacts.Contacts;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class ShareGoodsParams extends ShareParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String extendInfo;
    private String shareDesc;
    private String shareItemId;
    private String sharePicUrl;
    private String sharePrice;

    static {
        kge.a(-1761990556);
    }

    public ShareGoodsParams(List<Contacts> list, String str, String str2, String str3, String str4, String str5) {
        super(list, str);
        this.shareItemId = str2;
        this.sharePicUrl = str3;
        this.sharePrice = str4;
        this.shareDesc = str5;
    }

    public String getShareItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e229e842", new Object[]{this}) : this.shareItemId;
    }

    public String getSharePicUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cca42cab", new Object[]{this}) : this.sharePicUrl;
    }

    public String getSharePrice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cc031659", new Object[]{this}) : this.sharePrice;
    }

    public String getShareDesc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1881edf", new Object[]{this}) : this.shareDesc;
    }

    public String getExtendInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("915112db", new Object[]{this}) : this.extendInfo;
    }

    public void setExtendInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbacffb", new Object[]{this, str});
        } else {
            this.extendInfo = str;
        }
    }
}
