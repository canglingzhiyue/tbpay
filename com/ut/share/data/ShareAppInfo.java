package com.ut.share.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.SharePlatform;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareAppInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String name;
    private int resId;
    private SharePlatform spt;

    static {
        kge.a(840479651);
    }

    public ShareAppInfo() {
    }

    public ShareAppInfo(SharePlatform sharePlatform, String str, int i) {
        this.spt = sharePlatform;
        this.name = str;
        this.resId = i;
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.name;
    }

    public void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public SharePlatform getSpt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharePlatform) ipChange.ipc$dispatch("d7fb12fd", new Object[]{this}) : this.spt;
    }

    public void setSpt(SharePlatform sharePlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81d982b", new Object[]{this, sharePlatform});
        } else {
            this.spt = sharePlatform;
        }
    }

    public int getResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4752aa1f", new Object[]{this})).intValue() : this.resId;
    }

    public void setResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1275c63", new Object[]{this, new Integer(i)});
        } else {
            this.resId = i;
        }
    }
}
