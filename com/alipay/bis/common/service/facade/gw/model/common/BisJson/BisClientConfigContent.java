package com.alipay.bis.common.service.facade.gw.model.common.BisJson;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BisClientConfigContent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String androidcfg;
    private String env;
    private String ioscfg;
    private String runEnv;
    private int sampleMode;
    private String token;
    private int type;
    private String ui;

    public String getRunEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("386b8ca1", new Object[]{this}) : this.runEnv;
    }

    public void setRunEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74aff4f5", new Object[]{this, str});
        } else {
            this.runEnv = str;
        }
    }

    public String getUi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9cd02caf", new Object[]{this}) : this.ui;
    }

    public void setUi(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c2bca7", new Object[]{this, str});
        } else {
            this.ui = str;
        }
    }

    public String getToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a592a696", new Object[]{this}) : this.token;
    }

    public void setToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99ac208", new Object[]{this, str});
        } else {
            this.token = str;
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

    public int getSampleMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c63915d", new Object[]{this})).intValue() : this.sampleMode;
    }

    public void setSampleMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e5a84d", new Object[]{this, new Integer(i)});
        } else {
            this.sampleMode = i;
        }
    }

    public String getAndroidcfg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7f72c4e", new Object[]{this}) : this.androidcfg;
    }

    public void setAndroidcfg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd7e4e8", new Object[]{this, str});
        } else {
            this.androidcfg = str;
        }
    }

    public String getIoscfg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("133788ec", new Object[]{this}) : this.ioscfg;
    }

    public void setIoscfg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f363820a", new Object[]{this, str});
        } else {
            this.ioscfg = str;
        }
    }

    public String getEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36e8fda2", new Object[]{this}) : this.env;
    }

    public void setEnv(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c3997c", new Object[]{this, str});
        } else {
            this.env = str;
        }
    }
}
