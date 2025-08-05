package anetwork.channel.monitor;

import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.Queue;
import tb.kge;

/* loaded from: classes.dex */
public class RRPSpeedCalculator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anetwork.RRPSpeedCalculator";
    private static RRPSpeedCalculator instance;
    private final int BWE_WINDOW_MS = 5000;
    private final int BWE_WINDOW_S = 5;
    private Queue<Rx> window = new LinkedList();
    private long totalReceiveBytes = 0;
    private long windowBytes = 0;
    private long windowTimeS = 5;
    private long startTimestamp = 0;

    /* loaded from: classes.dex */
    public class Rx {
        public long bytes;
        public long tick;

        static {
            kge.a(-248034418);
        }

        public Rx(long j, long j2) {
            this.tick = j;
            this.bytes = j2;
        }
    }

    public static /* synthetic */ void access$000(RRPSpeedCalculator rRPSpeedCalculator, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e914a56", new Object[]{rRPSpeedCalculator, new Long(j)});
        } else {
            rRPSpeedCalculator.dueToReceiveData(j);
        }
    }

    private RRPSpeedCalculator() {
    }

    static {
        kge.a(-889248644);
        instance = null;
    }

    public static RRPSpeedCalculator getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RRPSpeedCalculator) ipChange.ipc$dispatch("c6725847", new Object[0]);
        }
        if (instance == null) {
            instance = new RRPSpeedCalculator();
        }
        return instance;
    }

    public synchronized void startTick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af36626", new Object[]{this});
            return;
        }
        if (this.startTimestamp == 0) {
            this.startTimestamp = System.currentTimeMillis();
        }
    }

    public void receive(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf2c661a", new Object[]{this, new Long(j)});
        } else {
            ThreadPoolExecutorFactory.submitCookieMonitor(new Runnable() { // from class: anetwork.channel.monitor.RRPSpeedCalculator.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        RRPSpeedCalculator.access$000(RRPSpeedCalculator.this, j);
                    }
                }
            });
        }
    }

    private synchronized void dueToReceiveData(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166a33bf", new Object[]{this, new Long(j)});
            return;
        }
        this.totalReceiveBytes += j;
        this.windowBytes += j;
        long currentTimeMillis = System.currentTimeMillis();
        cleanUpExpiredRx(currentTimeMillis);
        this.window.offer(new Rx(currentTimeMillis, j));
        if (currentTimeMillis - this.startTimestamp < 5000) {
            this.windowTimeS = (currentTimeMillis - this.startTimestamp) / 1000;
        } else {
            this.windowTimeS = 5L;
        }
    }

    public synchronized long getBandwidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59a840f6", new Object[]{this})).longValue();
        }
        cleanUpExpiredRx(System.currentTimeMillis());
        long j = this.window.isEmpty() ? 0L : (long) (this.windowBytes / this.windowTimeS);
        ALog.e(TAG, "[RUM] getBandwidth ", null, "bandWidth", Long.valueOf(j));
        return j;
    }

    public long getAverageSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26e0431b", new Object[]{this})).longValue() : (long) (this.totalReceiveBytes / (((float) (System.currentTimeMillis() - this.startTimestamp)) / 1000.0f));
    }

    private void cleanUpExpiredRx(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfd8f596", new Object[]{this, new Long(j)});
            return;
        }
        while (!this.window.isEmpty() && j - this.window.peek().tick >= 5000) {
            this.windowBytes -= this.window.poll().bytes;
        }
    }
}
