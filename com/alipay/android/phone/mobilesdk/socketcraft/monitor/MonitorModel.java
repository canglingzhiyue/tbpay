package com.alipay.android.phone.mobilesdk.socketcraft.monitor;

import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class MonitorModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> itemMap = new HashMap();
    public String logTitle;

    public MonitorModel() {
        this.itemMap.put(MonitorItemConstants.KEY_VER, "17");
    }

    public MonitorModel appendAppId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("8ed21b4f", new Object[]{this, str});
        }
        this.itemMap.put(MonitorItemConstants.KEY_APP_ID, str);
        return this;
    }

    public MonitorModel appendUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("42cae162", new Object[]{this, str});
        }
        this.itemMap.put(MonitorItemConstants.KEY_URL, str);
        return this;
    }

    public MonitorModel appendResult(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("9b19a52", new Object[]{this, new Boolean(z)});
        }
        this.itemMap.put("RESULT", z ? "T" : UTConstant.Args.UT_SUCCESS_F);
        return this;
    }

    public MonitorModel appendAllTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("12542041", new Object[]{this, str});
        }
        this.itemMap.put("ALL_TIME", str);
        return this;
    }

    public MonitorModel appendCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("6e567b14", new Object[]{this, str});
        }
        this.itemMap.put(MonitorItemConstants.KEY_CODE, str);
        return this;
    }

    public MonitorModel appendErrMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("7149a1c3", new Object[]{this, str});
        }
        this.itemMap.put(MonitorItemConstants.KEY_ERR_MSG, str);
        return this;
    }

    public MonitorModel appendLiveTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("9f10d300", new Object[]{this, str});
        }
        this.itemMap.put(MonitorItemConstants.KEY_LIVE_TIME, str);
        return this;
    }

    public MonitorModel appendUpMsgCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("15d3c870", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this;
        }
        this.itemMap.put(MonitorItemConstants.KEY_UPC, str);
        return this;
    }

    public MonitorModel appendDownMsgCount(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("c6223e37", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this;
        }
        this.itemMap.put(MonitorItemConstants.KEY_DOWNC, str);
        return this;
    }

    public MonitorModel appendUpMsgLens(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("1fe62037", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this;
        }
        this.itemMap.put(MonitorItemConstants.KEY_UPMSG, str);
        return this;
    }

    public MonitorModel appendDownMsgLens(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("469e5590", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return this;
        }
        this.itemMap.put(MonitorItemConstants.KEY_DOWNMSG, str);
        return this;
    }

    public MonitorModel appendDnsTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("7c690dc9", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && !"-1".equals(str)) {
            this.itemMap.put("DNS_TIME", str);
        }
        return this;
    }

    public MonitorModel appendTcpTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("5975f681", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && !"-1".equals(str)) {
            this.itemMap.put("TCP_TIME", str);
        }
        return this;
    }

    public MonitorModel appendSSLTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("77c13b6c", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && !"-1".equals(str)) {
            this.itemMap.put("SSL_TIME", str);
        }
        return this;
    }

    public MonitorModel appendWsHsTime(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("e7c6b9db", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && !"-1".equals(str)) {
            this.itemMap.put(MonitorItemConstants.KEY_WS_HS_TIME, str);
        }
        return this;
    }

    public MonitorModel appendTargetHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorModel) ipChange.ipc$dispatch("580d580", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && !"null".equals(str)) {
            this.itemMap.put("TARGET_HOST", str);
        }
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MonitorModel{logTitle='" + this.logTitle + "', itemMap=" + this.itemMap + '}';
    }
}
