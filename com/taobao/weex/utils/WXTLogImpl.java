package com.taobao.weex.utils;

import android.os.Process;
import com.alibaba.ability.impl.log.LogAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.e;
import com.taobao.weex.utils.WXLogUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class WXTLogImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WXLogUtils.LogWatcher f23539a;
    private static final int b;

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : b;
    }

    static {
        kge.a(-262022518);
        b = Process.myPid();
    }

    public static void initWXLogWatcher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6630b0", new Object[0]);
            return;
        }
        try {
            if (f23539a == null) {
                f23539a = new LogWatcherImpl();
            }
            WXLogUtils.setLogWatcher(f23539a);
            e.a().a("weex", com.taobao.tao.log.LogLevel.D);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* loaded from: classes9.dex */
    public static class LogWatcherImpl implements WXLogUtils.LogWatcher {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-637877870);
            kge.a(1952961749);
        }

        private LogWatcherImpl() {
        }

        @Override // com.taobao.weex.utils.WXLogUtils.LogWatcher
        public void onLog(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b7cbfca", new Object[]{this, str, str2, str3});
                return;
            }
            try {
                if (WXTLogImpl.a() != Process.myPid()) {
                    return;
                }
                char c = 65535;
                switch (str.hashCode()) {
                    case 118057:
                        if (str.equals("wtf")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3237038:
                        if (str.equals("info")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3641990:
                        if (str.equals(LogAbility.API_WARN)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 95458899:
                        if (str.equals("debug")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 96784904:
                        if (str.equals("error")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 351107458:
                        if (str.equals("verbose")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0 || c == 1) {
                    TLog.logi("weex", str2, str3);
                } else if (c == 2) {
                    TLog.logv("weex", str2, str3);
                } else if (c == 3) {
                    TLog.logw("weex", str2, str3);
                } else {
                    if (c == 4 || c == 5) {
                        TLog.loge("weex", str2, str3);
                    }
                    TLog.logi("weex", str2 + "-" + str, str3);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
