package com.alipay.android.msp.core.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class MQPBehaviorRecordModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String trace = "";
    private String uid = "";
    private String utdid = "";
    private String trade_no = "";
    private String scene_name = "";
    private String features = "";
    private String rule_id = "";
    private String result = "";
    private String ver = "";
    private String time = "";
    private String hh = "";
    private String ds = "";
    private String ext = "";

    public String getTrace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("afd36ca", new Object[]{this}) : this.trace;
    }

    public void setTrace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1823854", new Object[]{this, str});
        } else {
            this.trace = str;
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
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.uid = str;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : this.utdid;
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.utdid = str;
    }

    public String getTrade_no() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d9fe647", new Object[]{this}) : this.trade_no;
    }

    public void setTrade_no(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113a3d0f", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.trade_no = str;
    }

    public String getScene_name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb7d6125", new Object[]{this}) : this.scene_name;
    }

    public void setScene_name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b184af1", new Object[]{this, str});
        } else {
            this.scene_name = str;
        }
    }

    public String getFeatures() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43b42b26", new Object[]{this}) : this.features;
    }

    public void setFeatures(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdae9410", new Object[]{this, str});
        } else {
            this.features = str;
        }
    }

    public String getRule_id() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e02e3ef1", new Object[]{this}) : this.rule_id;
    }

    public void setRule_id(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9d280d", new Object[]{this, str});
        } else {
            this.rule_id = str;
        }
    }

    public String getResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this}) : this.result;
    }

    public void setResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
        } else {
            this.result = str;
        }
    }

    public String getVer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d2e2cac", new Object[]{this}) : this.ver;
    }

    public void setVer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57244bb2", new Object[]{this, str});
        } else {
            this.ver = str;
        }
    }

    public String getTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75382b96", new Object[]{this}) : this.time;
    }

    public void setTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64c87a0", new Object[]{this, str});
        } else {
            this.time = str;
        }
    }

    public String getHh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("51c5a9c3", new Object[]{this}) : this.hh;
    }

    public void setHh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7ce213", new Object[]{this, str});
        } else {
            this.hh = str;
        }
    }

    public String getDs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0be4994", new Object[]{this}) : this.ds;
    }

    public void setDs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b983c62", new Object[]{this, str});
        } else {
            this.ds = str;
        }
    }

    public String getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fcd84ee", new Object[]{this}) : this.ext;
    }

    public void setExt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86ffbb0", new Object[]{this, str});
        } else {
            this.ext = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MQPBehaviorRecordModel{trace='" + this.trace + "', uid='" + this.uid + "', utdid='" + this.utdid + "', trade_no='" + this.trade_no + "', scene_name='" + this.scene_name + "', features='" + this.features + "', rule_id='" + this.rule_id + "', result='" + this.result + "', ver='" + this.ver + "', time='" + this.time + "', hh='" + this.hh + "', ds='" + this.ds + "', ext='" + this.ext + "'}";
    }
}
