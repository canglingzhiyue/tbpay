package com.alipay.bis.common.service.facade.gw.model.common.BisJson;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BisBehavToken {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String apdid;
    public String appid;
    @Deprecated
    public String behid;
    public String bizid;
    public String token;
    public String uid;
    @Deprecated
    public int type = 0;
    @Deprecated
    public int sampleMode = 0;
    public String verifyid = "";
    @Deprecated
    public String vtoken = "";
    public String apdidToken = "";

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

    public String getUid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea2ce1f", new Object[]{this}) : this.uid;
    }

    public void setUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d89f", new Object[]{this, str});
        } else {
            this.uid = str;
        }
    }

    public String getApdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a23faff", new Object[]{this}) : this.apdid;
    }

    public void setApdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e733fabf", new Object[]{this, str});
        } else {
            this.apdid = str;
        }
    }

    public String getAppid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da36ad73", new Object[]{this}) : this.appid;
    }

    public void setAppid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197796cb", new Object[]{this, str});
        } else {
            this.appid = str;
        }
    }

    public String getBehid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4df03a8f", new Object[]{this}) : this.behid;
    }

    public void setBehid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cefad2f", new Object[]{this, str});
        } else {
            this.behid = str;
        }
    }

    public String getBizid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("16cd7a41", new Object[]{this}) : this.bizid;
    }

    public void setBizid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fba63bd", new Object[]{this, str});
        } else {
            this.bizid = str;
        }
    }

    public String getVerifyid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fee4d86f", new Object[]{this}) : this.verifyid;
    }

    public void setVerifyid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68938fe7", new Object[]{this, str});
        } else {
            this.verifyid = str;
        }
    }

    public String getVtoken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3855c660", new Object[]{this}) : this.vtoken;
    }

    public void setVtoken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720cf316", new Object[]{this, str});
        } else {
            this.vtoken = str;
        }
    }

    public String getApdidToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this}) : this.apdidToken;
    }

    public void setApdidToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586b583c", new Object[]{this, str});
        } else {
            this.apdidToken = str;
        }
    }
}
