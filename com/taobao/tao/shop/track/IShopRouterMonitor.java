package com.taobao.tao.shop.track;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.kge;

/* loaded from: classes8.dex */
public interface IShopRouterMonitor {
    public static final int MONITOR_EVENT_DOWNLOAD_CACHE_FAIL = 1005;
    public static final int MONITOR_EVENT_DOWNLOAD_CACHE_SUCC = 1004;
    public static final int MONITOR_EVENT_MTOP_PROCESS_BEGIN = 1002;
    public static final int MONITOR_EVENT_MTOP_PROCESS_FAIL = 1007;
    public static final int MONITOR_EVENT_MTOP_PROCESS_FINISH = 1003;
    public static final int MONITOR_EVENT_MTOP_PROCESS_SUCC = 1006;
    public static final int MONITOR_EVENT_NEED_PROCESS_HIT_CACHE = 1000;
    public static final int MONITOR_EVENT_NEED_PROCESS_TOTAL = 1001;

    /* loaded from: classes8.dex */
    public @interface MonitorEvent {
    }

    void a(int i, MonitorException monitorException);

    /* loaded from: classes8.dex */
    public static class MonitorException extends Exception {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String errorCode;
        private final String errorMsg;
        private Map<String, String> errorParam;

        static {
            kge.a(-2014903222);
        }

        public MonitorException(String str, String str2) {
            this.errorParam = null;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 0) {
                    str = "-" + parseLong;
                }
            } catch (Exception unused) {
                str = "-999";
            }
            if ("The store was not found".equals(str2)) {
                str = "-10901";
            } else if (ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG.equals(str2)) {
                str = "-10902";
            }
            this.errorCode = str;
            this.errorMsg = str2;
        }

        public MonitorException(String str, String str2, Map<String, String> map) {
            this(str, str2);
            this.errorParam = map;
        }

        public String getErrorCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this}) : this.errorCode;
        }

        public String getErrorMsg() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this}) : this.errorMsg;
        }

        public Map<String, String> getErrorParam() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("fd82b117", new Object[]{this}) : this.errorParam;
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Throwable) ipChange.ipc$dispatch("6c8bc0b1", new Object[]{this});
            }
            return this;
        }
    }
}
