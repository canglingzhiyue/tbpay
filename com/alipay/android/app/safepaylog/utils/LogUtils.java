package com.alipay.android.app.safepaylog.utils;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.umipublish.draft.DraftMediaHelper;
import tb.riy;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class LogUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEBUG = 1;
    public static final int ERROR = 8;
    public static final int INFO = 2;
    public static final int VERBOSE = 15;
    public static final int WARNING = 4;

    public static void record(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba4193f", new Object[]{new Integer(i), str, str2});
            return;
        }
        try {
            String str3 = riy.ARRAY_START_STR + str + "][" + str2 + riy.ARRAY_END_STR;
            if (i == 1) {
                a("safepaybase", str3, 1);
            } else if (i == 2) {
                a("safepaybase", str3, 2);
            } else if (i == 4) {
                a("safepaybase", str3, 4);
            } else if (i == 8) {
                a("safepaybase", str3, 8);
            } else if (i != 15) {
            } else {
                a("safepaybase", str3, 15);
            }
        } catch (Throwable th) {
            printExceptionStackTrace(th);
        }
    }

    private static void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{str, str2, new Integer(i)});
        } else if (str2 == null) {
        } else {
            try {
                if (i == 1) {
                    TLog.logd("safepaybase", str, str2);
                } else if (i == 2) {
                    TLog.logi("safepaybase", str, str2);
                } else if (i == 4) {
                    TLog.logw("safepaybase", str, str2);
                } else if (i == 8) {
                    TLog.loge("safepaybase", str, str2);
                } else if (i != 15) {
                } else {
                    TLog.logv("safepaybase", str, str2);
                }
            } catch (Throwable th) {
                printExceptionStackTrace(th);
            }
        }
    }

    public static void printExceptionStackTrace(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fab54f", new Object[]{th});
            return;
        }
        try {
            TLog.loge("safepaybase", "safepaybase", th.getMessage());
        } catch (Throwable unused) {
        }
    }
}
