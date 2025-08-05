package com.taobao.linkmanager.afc.reduction;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes7.dex */
public class AfcReductResult implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String adid;
    private boolean autoLogin;
    private String channel;
    private boolean isGrowthWord;
    private int type;
    private String url;

    static {
        kge.a(-303244076);
        kge.a(1028243835);
    }

    public boolean isAutoLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d974257b", new Object[]{this})).booleanValue() : this.autoLogin;
    }

    public void setAutoLogin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f3e975", new Object[]{this, new Boolean(z)});
        } else {
            this.autoLogin = z;
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

    public String getChannel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this}) : this.channel;
    }

    public void setChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
        } else {
            this.channel = str;
        }
    }

    public String getAdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a4e8a85", new Object[]{this}) : this.adid;
    }

    public void setAdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4020691", new Object[]{this, str});
        } else {
            this.adid = str;
        }
    }

    public boolean isIsGrowthWord() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e60c8a90", new Object[]{this})).booleanValue() : this.isGrowthWord;
    }

    public void setIsGrowthWord(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77212190", new Object[]{this, new Boolean(z)});
        } else {
            this.isGrowthWord = z;
        }
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue() : this.type;
    }

    public void setType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e09620", new Object[]{this, new Integer(i)});
        } else {
            this.type = i;
        }
    }
}
