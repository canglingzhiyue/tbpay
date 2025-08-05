package com.taobao.tbreachflow.shortcuts.config;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class ShortcutConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String abTestModule;
    private String disableToast;
    private String iconId;
    private String iconUrl;
    private String longTitle;
    private String shortTitle;
    private String targetUrl;

    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : (!TextUtils.isEmpty(this.shortTitle) || !TextUtils.isEmpty(this.longTitle)) && !TextUtils.isEmpty(this.disableToast) && !TextUtils.isEmpty(this.iconUrl) && !TextUtils.isEmpty(this.targetUrl);
    }

    public String getShortTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3ba3af07", new Object[]{this}) : this.shortTitle;
    }

    public void setShortTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbbb94f", new Object[]{this, str});
        } else {
            this.shortTitle = str;
        }
    }

    public String getLongTitle() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97749433", new Object[]{this}) : this.longTitle;
    }

    public void setLongTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95bae0b", new Object[]{this, str});
        } else {
            this.longTitle = str;
        }
    }

    public String getIconId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c52806cf", new Object[]{this}) : this.iconId;
    }

    public void setIconId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f82c087", new Object[]{this, str});
        } else {
            this.iconId = str;
        }
    }

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

    public String getAbTestModule() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e0dfb704", new Object[]{this}) : this.abTestModule;
    }

    public void setAbTestModule(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb59df2", new Object[]{this, str});
        } else {
            this.abTestModule = str;
        }
    }

    public String getTargetUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1e2c891", new Object[]{this}) : this.targetUrl;
    }

    public void setTargetUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecb4056d", new Object[]{this, str});
        } else {
            this.targetUrl = str;
        }
    }
}
