package com.taobao.accs.connection.state;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class TimeMeter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_HB_RECOVER = "hb_recover";
    public static final String TAG_HB_RESCHEDULE = "hb_reschedule";
    public static final String TAG_MSG_RESCHEDULE_HB = "msg_reschedule_hb";
    public static final String TAG_ONLINE_MONITOR = "online_monitor";
    public static final String TAG_RESTART_SERVICE = "restart_service";

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Long> f8219a;

    /* loaded from: classes.dex */
    public @interface TimeMeterTags {
    }

    static {
        kge.a(581594871);
        f8219a = new ConcurrentHashMap<>();
    }

    private static void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{str, new Long(j)});
        } else if (j <= 0) {
            ALog.e("TimeMeter", "record() illegalArguments", new Object[0]);
        } else {
            f8219a.put(str, Long.valueOf(SystemClock.elapsedRealtime() + j));
        }
    }

    public static boolean a(String str, long j) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123b0d6", new Object[]{str, new Long(j)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            ALog.e("TimeMeter", "isTimeOut() illegalArguments", new Object[0]);
            return false;
        }
        synchronized (TimeMeter.class) {
            Long l = f8219a.get(str);
            if (l != null) {
                if (SystemClock.elapsedRealtime() <= l.longValue()) {
                    z = false;
                }
                if (z) {
                    b(str, j);
                }
                return z;
            }
            b(str, j);
            return true;
        }
    }
}
