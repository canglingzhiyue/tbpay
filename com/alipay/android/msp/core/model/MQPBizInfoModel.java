package com.alipay.android.msp.core.model;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class MQPBizInfoModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String trace = "";
    private String uid = "";
    private String utdid = "";
    private String app_name = "";
    private String app_ver = "";
    private String ext_app = "";
    private String platform = "";
    private String sdk_type = "";
    private String sdk_ver = "";
    private String locale = "";
    private String device = "";
    private String os_ver = "";
    private String net_type = "";
    private String trade_no = "";
    private String session_id = "";
    private String out_trade_no = "";
    private String pid = "";
    private String biz_type = "";
    private String end_code = "";
    private String end_page = "";
    private String hh = "";
    private String ds = "";
    private String time = "";
    private String ext1 = "";
    private String ext2 = "";
    private String ext3 = "";

    public String getTrace() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("afd36ca", new Object[]{this}) : this.trace;
    }

    public String getUid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea2ce1f", new Object[]{this}) : this.uid;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this}) : this.utdid;
    }

    public String getApp_name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9fdc2cfa", new Object[]{this}) : this.app_name;
    }

    public String getApp_ver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("88a8920a", new Object[]{this}) : this.app_ver;
    }

    public String getExt_app() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94cfea4c", new Object[]{this}) : this.ext_app;
    }

    public String getPlatform() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("611384b0", new Object[]{this}) : this.platform;
    }

    public String getSdk_type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b6f49084", new Object[]{this}) : this.sdk_type;
    }

    public String getSdk_ver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("be4fae11", new Object[]{this}) : this.sdk_ver;
    }

    public String getLocale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3440efa9", new Object[]{this}) : this.locale;
    }

    public String getDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b1ef52d", new Object[]{this}) : this.device;
    }

    public String getOs_ver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50683bfb", new Object[]{this}) : this.os_ver;
    }

    public String getNet_type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dd0fb827", new Object[]{this}) : this.net_type;
    }

    public String getTrade_no() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2d9fe647", new Object[]{this}) : this.trade_no;
    }

    public String getSession_id() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ed493df", new Object[]{this}) : this.session_id;
    }

    public String getOut_trade_no() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d6a4d416", new Object[]{this}) : this.out_trade_no;
    }

    public String getPid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this}) : this.pid;
    }

    public String getBiz_type() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87b841d", new Object[]{this}) : this.biz_type;
    }

    public String getEnd_code() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31f10512", new Object[]{this}) : this.end_code;
    }

    public String getEnd_page() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fee3e9b0", new Object[]{this}) : this.end_page;
    }

    public String getHh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("51c5a9c3", new Object[]{this}) : this.hh;
    }

    public String getDs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f0be4994", new Object[]{this}) : this.ds;
    }

    public String getTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75382b96", new Object[]{this}) : this.time;
    }

    public String getExt1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2eac5013", new Object[]{this}) : this.ext1;
    }

    public String getExt2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5320ab2", new Object[]{this}) : this.ext2;
    }

    public String getExt3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3bb7c551", new Object[]{this}) : this.ext3;
    }

    public void setTrace(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1823854", new Object[]{this, str});
        } else {
            this.trace = str;
        }
    }

    public void setUid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d89f", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.uid = str;
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.utdid = str;
    }

    public void setApp_name(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e686ccbc", new Object[]{this, str});
        } else {
            this.app_name = str;
        }
    }

    public void setApp_ver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936d3814", new Object[]{this, str});
        } else {
            this.app_ver = str;
        }
    }

    public void setExt_app(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30e812", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.ext_app = str;
    }

    public void setPlatform(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c3a6bc6", new Object[]{this, str});
        } else {
            this.platform = str;
        }
    }

    public void setSdk_type(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27ada72", new Object[]{this, str});
        } else {
            this.sdk_type = str;
        }
    }

    public void setSdk_ver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a99ced", new Object[]{this, str});
        } else {
            this.sdk_ver = str;
        }
    }

    public void setLocale(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f386f2ed", new Object[]{this, str});
        } else {
            this.locale = str;
        }
    }

    public void setDevice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98699de9", new Object[]{this, str});
        } else {
            this.device = str;
        }
    }

    public void setOs_ver(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4930db", new Object[]{this, str});
        } else {
            this.os_ver = str;
        }
    }

    public void setNet_type(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc4a72f", new Object[]{this, str});
        } else {
            this.net_type = str;
        }
    }

    public void setTrade_no(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113a3d0f", new Object[]{this, str});
        } else {
            this.trade_no = str;
        }
    }

    public void setSession_id(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a76f77", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.session_id = str;
    }

    public void setOut_trade_no(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e942320", new Object[]{this, str});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "";
        }
        this.out_trade_no = str;
    }

    public void setPid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f52579a", new Object[]{this, str});
        } else {
            this.pid = str;
        }
    }

    public void setBiz_type(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d259f9", new Object[]{this, str});
        } else {
            this.biz_type = str;
        }
    }

    public void setEnd_code(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("970cf7a4", new Object[]{this, str});
        } else {
            this.end_code = str;
        }
    }

    public void setEnd_page(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6876a6c6", new Object[]{this, str});
        } else {
            this.end_page = str;
        }
    }

    public void setHh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7ce213", new Object[]{this, str});
        } else {
            this.hh = str;
        }
    }

    public void setDs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b983c62", new Object[]{this, str});
        } else {
            this.ds = str;
        }
    }

    public void setTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64c87a0", new Object[]{this, str});
        } else {
            this.time = str;
        }
    }

    public void setExt1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5cf2c3", new Object[]{this, str});
        } else {
            this.ext1 = str;
        }
    }

    public void setExt2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858e8c04", new Object[]{this, str});
        } else {
            this.ext2 = str;
        }
    }

    public void setExt3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc02545", new Object[]{this, str});
        } else {
            this.ext3 = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MQPBizInfoModel{trace='" + this.trace + "', uid='" + this.uid + "', utdid='" + this.utdid + "', app_name='" + this.app_name + "', app_ver='" + this.app_ver + "', ext_app='" + this.ext_app + "', platform='" + this.platform + "', sdk_type='" + this.sdk_type + "', sdk_ver='" + this.sdk_ver + "', locale='" + this.locale + "', device='" + this.device + "', os_ver='" + this.os_ver + "', net_type='" + this.net_type + "', trade_no='" + this.trade_no + "', session_id='" + this.session_id + "', out_trade_no='" + this.out_trade_no + "', pid='" + this.pid + "', biz_type='" + this.biz_type + "', end_code='" + this.end_code + "', end_page='" + this.end_page + "', hh='" + this.hh + "', ds='" + this.ds + "', time='" + this.time + "', ext1='" + this.ext1 + "', ext2='" + this.ext2 + "', ext3='" + this.ext3 + "'}";
    }
}
