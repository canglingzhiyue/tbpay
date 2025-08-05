package com.alipay.android.msp.core.model;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RpcJsonReq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String dM;
    private String dN;
    private String dO;
    private String external_info;
    private String extinfo;
    private String pa;
    private String tid;
    private String ua;
    private String utdid;

    public String getBp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8c9e735", new Object[]{this}) : this.dM;
    }

    public void setBp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50052e1", new Object[]{this, str});
        } else {
            this.dM = str;
        }
    }

    public String getExternal_info() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11dc9d8d", new Object[]{this}) : this.external_info;
    }

    public void setExternal_info(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e56f5f1", new Object[]{this, str});
        } else {
            this.external_info = str;
        }
    }

    public String getExtinfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1e517680", new Object[]{this}) : this.extinfo;
    }

    public void setExtinfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e0e25e", new Object[]{this, str});
        } else {
            this.extinfo = str;
        }
    }

    public String getPa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f5aa5972", new Object[]{this}) : this.pa;
    }

    public void setPa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("142e2844", new Object[]{this, str});
        } else {
            this.pa = str;
        }
    }

    public String getUa() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("68a257b7", new Object[]{this}) : this.ua;
    }

    public void setUa(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f29f", new Object[]{this, str});
        } else {
            this.ua = str;
        }
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : this.utdid;
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.utdid = str;
        }
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this}) : this.tid;
    }

    public void setTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30138b9e", new Object[]{this, str});
        } else {
            this.tid = str;
        }
    }

    public String getNew_client_key() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d1ea6219", new Object[]{this}) : this.dN;
    }

    public void setNew_client_key(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2e027d", new Object[]{this, str});
        } else {
            this.dN = str;
        }
    }

    public String getExtok() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5df64f52", new Object[]{this}) : this.dO;
    }

    public void setExtok(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dac30cc", new Object[]{this, str});
        } else {
            this.dO = str;
        }
    }
}
