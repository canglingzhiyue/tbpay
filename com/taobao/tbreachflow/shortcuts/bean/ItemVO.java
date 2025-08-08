package com.taobao.tbreachflow.shortcuts.bean;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class ItemVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String disableToast;
    private String iconName;
    private String iconUrl;
    private String id;
    private String linkUrl;
    private Integer rank;
    private String title;

    public String getIconUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43d20f9", new Object[]{this}) : this.iconUrl;
    }

    public void setIconUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a6a8705", new Object[]{this, str});
        } else {
            this.iconUrl = str;
        }
    }

    public String getIconName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c1f1f1f", new Object[]{this}) : this.iconName;
    }

    public void setIconName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a21f37", new Object[]{this, str});
        } else {
            this.iconName = str;
        }
    }

    public String getTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this}) : this.title;
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public String getLinkUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a02c617a", new Object[]{this}) : this.linkUrl;
    }

    public void setLinkUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6356a4", new Object[]{this, str});
        } else {
            this.linkUrl = str;
        }
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("81e05888", new Object[]{this}) : this.id;
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public String getDisableToast() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6932e784", new Object[]{this}) : this.disableToast;
    }

    public void setDisableToast(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dc87d72", new Object[]{this, str});
        } else {
            this.disableToast = str;
        }
    }

    public int getRank() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b0b181c", new Object[]{this})).intValue() : this.rank.intValue();
    }

    public void setRank(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ac206e", new Object[]{this, new Integer(i)});
        } else {
            this.rank = Integer.valueOf(i);
        }
    }

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.id) && !StringUtils.isEmpty(this.iconUrl) && !StringUtils.isEmpty(this.iconName) && !StringUtils.isEmpty(this.title) && !StringUtils.isEmpty(this.linkUrl) && !StringUtils.isEmpty(this.disableToast);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ItemVO{id='" + this.id + "', iconUrl='" + this.iconUrl + "', iconName='" + this.iconName + "', title='" + this.title + "', linkUrl='" + this.linkUrl + "', disableToast='" + this.disableToast + "', rank=" + this.rank + '}';
    }
}
