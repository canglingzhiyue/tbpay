package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class MonitorError {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String errorCode;
    public String errorMsg;
    public Map<String, Object> extInfo;
    public String module;
    public String point;
    public long timeStamp;
    public String traceId;
    public String userId;

    static {
        kge.a(-1595932281);
    }

    private MonitorError() {
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MonitorErrorParam{userId='" + this.userId + "', module='" + this.module + "', point='" + this.point + "', errorCode='" + this.errorCode + "', errorMsg='" + this.errorMsg + "', traceId='" + this.traceId + "'}";
    }

    /* loaded from: classes7.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private MonitorError monitorErrorParam = new MonitorError();

        static {
            kge.a(1108107614);
        }

        public Builder(String str, String str2, String str3, String str4) {
            MonitorError monitorError = this.monitorErrorParam;
            monitorError.module = str;
            monitorError.point = str2;
            monitorError.errorCode = str3;
            monitorError.errorMsg = str4;
        }

        public Builder userId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("c680f1f0", new Object[]{this, str});
            }
            this.monitorErrorParam.userId = str;
            return this;
        }

        public Builder traceId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("b3f445b6", new Object[]{this, str});
            }
            this.monitorErrorParam.traceId = str;
            return this;
        }

        public Builder extInfo(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("30c48ff8", new Object[]{this, map});
            }
            this.monitorErrorParam.extInfo = map;
            return this;
        }

        public MonitorError build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MonitorError) ipChange.ipc$dispatch("a5a6f009", new Object[]{this});
            }
            this.monitorErrorParam.timeStamp = System.currentTimeMillis();
            return this.monitorErrorParam;
        }
    }
}
