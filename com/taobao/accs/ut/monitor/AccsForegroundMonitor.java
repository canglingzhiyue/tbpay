package com.taobao.accs.ut.monitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import anet.channel.Constants;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.utils.c;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

@Monitor(module = "accs", monitorPoint = "foreground")
/* loaded from: classes.dex */
public class AccsForegroundMonitor extends BaseMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AccsForegroundMonitor";
    private static final AtomicLong connectedTimeInMill;
    private static volatile Integer dayOfYear;
    private static final AtomicBoolean initialized;
    private static SharedPreferences mSP;
    private static final AtomicLong onlineTotalTimeInMill;
    @Dimension
    public String keepAlive;
    @Measure
    public long onlineTime;
    @Dimension
    public String process = c.a();

    static {
        kge.a(-265792982);
        connectedTimeInMill = new AtomicLong();
        onlineTotalTimeInMill = new AtomicLong();
        dayOfYear = null;
        initialized = new AtomicBoolean();
    }

    private AccsForegroundMonitor() {
    }

    public static void online(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b450bae", new Object[]{context});
            return;
        }
        if (!initialized.getAndSet(true)) {
            report(context, null);
        }
        connectedTimeInMill.set(SystemClock.elapsedRealtime());
        ALog.e(TAG, "online", "connectedTimeInMill", Long.valueOf(connectedTimeInMill.get()));
    }

    public static void offline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e77e8ea", new Object[0]);
            return;
        }
        ALog.e(TAG, "offline", new Object[0]);
        connectedTimeInMill.set(0L);
        onlineTotalTimeInMill.set(getSp(GlobalClientInfo.getContext()).getLong("online", 0L));
    }

    public static void refreshOnlineTime(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3bd2e06", new Object[]{context});
        } else if (connectedTimeInMill.get() <= 0) {
            online(context);
        } else if (!TimeMeter.a(TimeMeter.TAG_ONLINE_MONITOR, Constants.RECV_TIMEOUT)) {
        } else {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - connectedTimeInMill.get()) + onlineTotalTimeInMill.get();
            ALog.e(TAG, "refreshOnlineTime save", "time", Long.valueOf(elapsedRealtime));
            getSp(context).edit().putLong("online", elapsedRealtime).apply();
            int curDay = getCurDay();
            if (dayOfYear != null && dayOfYear.intValue() != curDay) {
                ALog.e(TAG, "DAY_OF_YEAR changed", new Object[0]);
                report(context, Long.valueOf(elapsedRealtime));
                online(context);
                onlineTotalTimeInMill.set(0L);
            }
            dayOfYear = Integer.valueOf(curDay);
        }
    }

    private static int getCurDay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("25a09fac", new Object[0])).intValue() : Calendar.getInstance().get(6);
    }

    private static void report(Context context, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc7ec2ac", new Object[]{context, l});
            return;
        }
        if (l == null) {
            l = Long.valueOf(getSp(context).getLong("online", 0L));
        }
        ALog.e(TAG, "report", "onlineTime", l);
        if (l.longValue() <= 0) {
            return;
        }
        AccsForegroundMonitor accsForegroundMonitor = new AccsForegroundMonitor();
        accsForegroundMonitor.keepAlive = String.valueOf(UtilityImpl.isAppKeepAlive());
        accsForegroundMonitor.onlineTime = l.longValue();
        AppMonitor.getInstance().commitStat(accsForegroundMonitor);
        getSp(context).edit().remove("online").apply();
    }

    private static SharedPreferences getSp(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("cca12b02", new Object[]{context});
        }
        if (mSP == null) {
            String a2 = c.a();
            int indexOf = a2.indexOf(":");
            String substring = indexOf > 0 ? a2.substring(indexOf) : "main";
            mSP = context.getSharedPreferences("accs_process_record_" + substring, 0);
        }
        return mSP;
    }
}
