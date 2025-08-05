package com.taobao.themis.kernel.metaInfo.manifest;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public final class TabBarItem implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private transient String badgeText;
    private String iconNormal;
    private String iconSelected;
    private String pageId;
    private QueryPass queryPass;

    static {
        kge.a(-1428384143);
        kge.a(1028243835);
    }

    public final String getPageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this}) : this.pageId;
    }

    public final void setPageId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
        } else {
            this.pageId = str;
        }
    }

    public final String getIconNormal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92f9fe03", new Object[]{this}) : this.iconNormal;
    }

    public final void setIconNormal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432f49d3", new Object[]{this, str});
        } else {
            this.iconNormal = str;
        }
    }

    public final String getIconSelected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c72008f", new Object[]{this}) : this.iconSelected;
    }

    public final void setIconSelected(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c85c7", new Object[]{this, str});
        } else {
            this.iconSelected = str;
        }
    }

    public final QueryPass getQueryPass() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryPass) ipChange.ipc$dispatch("41878722", new Object[]{this}) : this.queryPass;
    }

    public final void setQueryPass(QueryPass queryPass) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda3a314", new Object[]{this, queryPass});
        } else {
            this.queryPass = queryPass;
        }
    }

    public final String getBadgeText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c5b70a7f", new Object[]{this}) : this.badgeText;
    }

    public final void setBadgeText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7368013f", new Object[]{this, str});
        } else {
            this.badgeText = str;
        }
    }
}
