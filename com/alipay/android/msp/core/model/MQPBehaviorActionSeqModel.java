package com.alipay.android.msp.core.model;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class MQPBehaviorActionSeqModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String trace = "";
    private String uid = "";
    private String scene_name = "";
    private String act_type = "";
    private String act_name = "";
    private String act_params = "";
    private String page_id = "";
    private String page_name = "";
    private String service_stack = "";
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

    public String getScene_name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb7d6125", new Object[]{this}) : this.scene_name;
    }

    public void setScene_name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b184af1", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.scene_name = str;
    }

    public String getAct_type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e25f0edc", new Object[]{this}) : this.act_type;
    }

    public void setAct_type(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f460271a", new Object[]{this, str});
        } else {
            this.act_type = str;
        }
    }

    public String getAct_name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a83102b", new Object[]{this}) : this.act_name;
    }

    public void setAct_name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90bc4fab", new Object[]{this, str});
        } else {
            this.act_name = str;
        }
    }

    public String getAct_params() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("78ce08d0", new Object[]{this}) : this.act_params;
    }

    public void setAct_params(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17dc98a6", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.act_params = str;
    }

    public String getPage_id() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7af84184", new Object[]{this}) : this.page_id;
    }

    public void setPage_id(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1377da", new Object[]{this, str});
        } else {
            this.page_id = str;
        }
    }

    public String getPage_name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ecb8094", new Object[]{this}) : this.page_name;
    }

    public void setPage_name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce24dca", new Object[]{this, str});
        } else {
            this.page_name = str;
        }
    }

    public String getService_stack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("819e6f31", new Object[]{this}) : this.service_stack;
    }

    public void setService_stack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cf58cd", new Object[]{this, str});
        } else {
            this.service_stack = str;
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
        return "MQPBehaviorActionSeqModel{trace='" + this.trace + "', uid='" + this.uid + "', scene_name='" + this.scene_name + "', act_type='" + this.act_type + "', act_name='" + this.act_name + "', act_params='" + this.act_params + "', page_id='" + this.page_id + "', page_name='" + this.page_name + "', service_stack='" + this.service_stack + "', time='" + this.time + "', hh='" + this.hh + "', ds='" + this.ds + "', ext='" + this.ext + "'}";
    }
}
