package anet.channel.monitor.caton;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.CatonFgTotalStatistic;
import anet.channel.statist.CatonTotalStatistic;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes2.dex */
public class CatonStatHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FG_COMMIT = "fg";
    public static final String TAG = "awcn.CatonStatHelper";
    public static final int TIMER = 100;
    public static AtomicInteger catonCount;
    public static String curEndTime;
    public static String curStartTime;
    public static volatile ScheduledExecutorService executorService;
    public static AtomicInteger fgCatonCount;
    public static String fgEndTime;
    public static String fgStartTime;
    public static volatile ScheduledFuture<?> future;
    public static AtomicBoolean isFgNetworkChange;
    public static AtomicBoolean isNetworkChange;

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : getCurTime();
    }

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            forward(str);
        }
    }

    static {
        kge.a(2119385609);
        curStartTime = null;
        curEndTime = null;
        isNetworkChange = new AtomicBoolean(false);
        catonCount = new AtomicInteger(0);
        executorService = null;
        future = null;
        fgStartTime = null;
        fgEndTime = null;
        isFgNetworkChange = new AtomicBoolean(false);
        fgCatonCount = new AtomicInteger(0);
    }

    public static void updateNetworkChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b71f318", new Object[]{new Boolean(z)});
            return;
        }
        isNetworkChange.set(z);
        isFgNetworkChange.set(z);
    }

    public static void updateCatonCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225ec28a", new Object[0]);
            return;
        }
        catonCount.incrementAndGet();
        fgCatonCount.incrementAndGet();
    }

    public static synchronized void commitCatonStat() {
        synchronized (CatonStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cdf8839", new Object[0]);
                return;
            }
            String curTime = getCurTime();
            curStartTime = curTime;
            fgStartTime = curTime;
            if (executorService == null) {
                executorService = Executors.newSingleThreadScheduledExecutor();
            }
            future = executorService.scheduleAtFixedRate(new Runnable() { // from class: anet.channel.monitor.caton.CatonStatHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    CatonStatHelper.curEndTime = CatonStatHelper.access$000();
                    CatonTotalStatistic catonTotalStatistic = new CatonTotalStatistic(CatonStatHelper.curStartTime, CatonStatHelper.curEndTime, CatonStatHelper.isNetworkChange.get(), CatonStatHelper.catonCount.get());
                    ALog.e(CatonStatHelper.TAG, "commitCatonStat ", null, new Object[0]);
                    AppMonitor.getInstance().commitStat(catonTotalStatistic);
                    CatonStatHelper.access$100(CatonStatHelper.curEndTime);
                }
            }, 100L, 100L, TimeUnit.SECONDS);
        }
    }

    public static synchronized void commitFgCatonStat() {
        synchronized (CatonStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11c94eb8", new Object[0]);
                return;
            }
            fgEndTime = getCurTime();
            CatonFgTotalStatistic catonFgTotalStatistic = new CatonFgTotalStatistic("fg", fgStartTime, fgEndTime, isFgNetworkChange.get(), fgCatonCount.get(), diffTime(fgStartTime, fgEndTime));
            ALog.e(TAG, "commitFgCatonStat ", null, new Object[0]);
            AppMonitor.getInstance().commitStat(catonFgTotalStatistic);
            fgForward();
        }
    }

    public static synchronized void shutdownThread() {
        synchronized (CatonStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("450aec87", new Object[0]);
                return;
            }
            if (executorService != null && future != null) {
                future.cancel(true);
                executorService.shutdown();
                executorService = null;
            }
        }
    }

    private static void fgForward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68ff54b", new Object[0]);
            return;
        }
        isFgNetworkChange.set(false);
        fgCatonCount.set(0);
        fgStartTime = null;
        fgEndTime = null;
    }

    private static void forward(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d03b96", new Object[]{str});
            return;
        }
        isNetworkChange.set(false);
        catonCount.set(0);
        curStartTime = str;
        curEndTime = null;
    }

    private static String getCurTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8f2d5a62", new Object[0]) : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    private static synchronized double diffTime(String str, String str2) {
        synchronized (CatonStatHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7329b07b", new Object[]{str, str2})).doubleValue();
            }
            double d = -1.0d;
            if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
                return -1.0d;
            }
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                d = (simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime()) / 60000.0d;
            } catch (ParseException e) {
                ALog.e(TAG, "diffTime parse fail, e " + e.toString(), null, new Object[0]);
            } catch (Exception e2) {
                ALog.e(TAG, "diffTime fail, e " + e2.toString(), null, new Object[0]);
            }
            return d;
        }
    }
}
