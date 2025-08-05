package anetwork.channel.monitor;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class BWEstimator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private long sum_ = 0;
    private long initial_window_ms_ = 2000;
    private long noninitial_window_ms_ = 1000;
    private long prev_time_ms_ = -1;
    private double uncertainty_scale_ = 10.0d;
    private double uncertainty_symmetry_cap_ = mto.a.GEO_NOT_SUPPORT;
    private double estimate_floor_ = 20.0d;
    private long current_window_ms_ = 0;
    private double bitrate_actual_kpbs_ = -1.0d;
    private double bitrate_estimate_kbps_ = -1.0d;
    private double bitrate_estimate_var_ = 50.0d;
    private int quality_level_ = 2;
    private int updateCount = 0;
    private final int ONE_WINDOW_MIN_BYTES = 20480;
    private final int ONE_WINDOW_MIN_COUNT = 4;

    static {
        kge.a(-1750113272);
    }

    public void update(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84901550", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        long j3 = this.noninitial_window_ms_;
        if (this.bitrate_estimate_kbps_ < mto.a.GEO_NOT_SUPPORT) {
            j3 = this.initial_window_ms_;
        }
        double updateWindow = updateWindow(j, j2, j3);
        if (updateWindow < mto.a.GEO_NOT_SUPPORT) {
            return;
        }
        this.bitrate_actual_kpbs_ = updateWindow;
        double d = this.bitrate_estimate_kbps_;
        if (d < mto.a.GEO_NOT_SUPPORT) {
            this.bitrate_estimate_kbps_ = updateWindow;
            return;
        }
        double abs = (this.uncertainty_scale_ * Math.abs(d - updateWindow)) / (this.bitrate_estimate_kbps_ + Math.min(updateWindow, this.uncertainty_symmetry_cap_));
        double d2 = abs * abs;
        double d3 = this.bitrate_estimate_var_ + 5.0d;
        double d4 = (this.bitrate_estimate_kbps_ * d2) + (updateWindow * d3);
        double d5 = d2 + d3;
        this.bitrate_estimate_kbps_ = d4 / d5;
        this.bitrate_estimate_kbps_ = Math.max(this.bitrate_estimate_kbps_, this.estimate_floor_);
        this.bitrate_estimate_var_ = (d2 * d3) / d5;
        updateQualityLevel();
    }

    public double actual() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d119b703", new Object[]{this})).doubleValue() : this.bitrate_actual_kpbs_;
    }

    public double prediction() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a67ad84", new Object[]{this})).doubleValue() : this.bitrate_estimate_kbps_;
    }

    public int getQualityLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9af3335", new Object[]{this})).intValue() : this.quality_level_;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[Catch: all -> 0x00a0, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x0010, B:9:0x003a, B:11:0x0042, B:14:0x0049, B:16:0x0054, B:17:0x0065, B:19:0x0069, B:24:0x007b, B:26:0x0089, B:28:0x008e, B:23:0x0075, B:31:0x0092), top: B:38:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized double updateWindow(long r16, long r18, long r20) {
        /*
            r15 = this;
            r1 = r15
            r2 = r16
            r4 = r18
            r6 = r20
            monitor-enter(r15)
            com.android.alibaba.ip.runtime.IpChange r0 = anetwork.channel.monitor.BWEstimator.$ipChange     // Catch: java.lang.Throwable -> La0
            boolean r8 = r0 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: java.lang.Throwable -> La0
            r9 = 4
            r10 = 1
            if (r8 == 0) goto L3a
            java.lang.String r8 = "c7c52412"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> La0
            r11 = 0
            r9[r11] = r1     // Catch: java.lang.Throwable -> La0
            java.lang.Long r11 = new java.lang.Long     // Catch: java.lang.Throwable -> La0
            r11.<init>(r2)     // Catch: java.lang.Throwable -> La0
            r9[r10] = r11     // Catch: java.lang.Throwable -> La0
            r2 = 2
            java.lang.Long r3 = new java.lang.Long     // Catch: java.lang.Throwable -> La0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La0
            r9[r2] = r3     // Catch: java.lang.Throwable -> La0
            r2 = 3
            java.lang.Long r3 = new java.lang.Long     // Catch: java.lang.Throwable -> La0
            r3.<init>(r6)     // Catch: java.lang.Throwable -> La0
            r9[r2] = r3     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r0.ipc$dispatch(r8, r9)     // Catch: java.lang.Throwable -> La0
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> La0
            double r2 = r0.doubleValue()     // Catch: java.lang.Throwable -> La0
            monitor-exit(r15)
            return r2
        L3a:
            long r13 = r1.prev_time_ms_     // Catch: java.lang.Throwable -> La0
            r11 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 < 0) goto L92
            long r13 = r1.prev_time_ms_     // Catch: java.lang.Throwable -> La0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L49
            goto L92
        L49:
            long r13 = r1.prev_time_ms_     // Catch: java.lang.Throwable -> La0
            long r13 = r2 - r13
            long r11 = r1.current_window_ms_     // Catch: java.lang.Throwable -> La0
            long r13 = r13 + r11
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 >= 0) goto L65
            long r6 = r1.sum_     // Catch: java.lang.Throwable -> La0
            long r6 = r6 + r4
            r1.sum_ = r6     // Catch: java.lang.Throwable -> La0
            r1.prev_time_ms_ = r2     // Catch: java.lang.Throwable -> La0
            r1.current_window_ms_ = r13     // Catch: java.lang.Throwable -> La0
            int r0 = r1.updateCount     // Catch: java.lang.Throwable -> La0
            int r0 = r0 + r10
            r1.updateCount = r0     // Catch: java.lang.Throwable -> La0
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L90
        L65:
            int r0 = r1.updateCount     // Catch: java.lang.Throwable -> La0
            if (r0 >= r9) goto L75
            long r8 = r1.sum_     // Catch: java.lang.Throwable -> La0
            r11 = 20480(0x5000, double:1.01185E-319)
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 < 0) goto L72
            goto L75
        L72:
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L7b
        L75:
            long r8 = r1.sum_     // Catch: java.lang.Throwable -> La0
            double r8 = (double) r8     // Catch: java.lang.Throwable -> La0
            double r11 = (double) r6     // Catch: java.lang.Throwable -> La0
            double r11 = r8 / r11
        L7b:
            r1.sum_ = r4     // Catch: java.lang.Throwable -> La0
            r1.prev_time_ms_ = r2     // Catch: java.lang.Throwable -> La0
            r1.updateCount = r10     // Catch: java.lang.Throwable -> La0
            r2 = 2
            long r2 = r2 * r6
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 >= 0) goto L8c
            long r2 = r13 - r6
            goto L8e
        L8c:
            r2 = 0
        L8e:
            r1.current_window_ms_ = r2     // Catch: java.lang.Throwable -> La0
        L90:
            monitor-exit(r15)
            return r11
        L92:
            r1.prev_time_ms_ = r2     // Catch: java.lang.Throwable -> La0
            r1.sum_ = r4     // Catch: java.lang.Throwable -> La0
            r2 = 0
            r1.current_window_ms_ = r2     // Catch: java.lang.Throwable -> La0
            r1.updateCount = r10     // Catch: java.lang.Throwable -> La0
            monitor-exit(r15)
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r2
        La0:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.monitor.BWEstimator.updateWindow(long, long, long):double");
    }

    private void updateQualityLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8a96b5", new Object[]{this});
            return;
        }
        this.quality_level_ = Math.max(calculateQualityLevel(this.bitrate_actual_kpbs_), calculateQualityLevel(this.bitrate_estimate_kbps_));
        GlobalAppRuntimeInfo.setGlobalNetworkQuality(this.quality_level_);
    }

    private int calculateQualityLevel(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41b0c31f", new Object[]{this, new Double(d)})).intValue();
        }
        if (d >= AwcnConfig.getRobustSpeedThreshold()) {
            return 3;
        }
        return d < AwcnConfig.getPoorSpeedThreshold() ? 1 : 2;
    }
}
