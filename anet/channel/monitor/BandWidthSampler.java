package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class BandWidthSampler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FAST = 5;
    public static final int SLOW = 1;
    private static final String TAG = "awcn.BandWidthSampler";
    private static volatile boolean isNetworkMeterStarted;
    public static long mKalmanDataSize;
    public static long mKalmanTimeUsed;
    public static int mReceivedDataCount;
    public static long mReceivedRequestFinishedTimePre;
    public static long mReceivedRequestStartTimePre;
    public static long mSpeedKalmanCount;
    public static double speed;
    public static double speedPre;
    public static double speedPrePre;
    public static double speedThreshold;
    private int currentNetworkSpeed;
    private NetWorkKalmanFilter mNetWorkKalmanFilter;
    private int mSinceLastNotification;

    /* loaded from: classes.dex */
    public static class StaticHolder {
        public static BandWidthSampler instance;

        static {
            kge.a(427615699);
            instance = new BandWidthSampler();
        }
    }

    public static /* synthetic */ NetWorkKalmanFilter access$100(BandWidthSampler bandWidthSampler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetWorkKalmanFilter) ipChange.ipc$dispatch("98b072b1", new Object[]{bandWidthSampler}) : bandWidthSampler.mNetWorkKalmanFilter;
    }

    public static /* synthetic */ int access$200(BandWidthSampler bandWidthSampler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c3f84f0", new Object[]{bandWidthSampler})).intValue() : bandWidthSampler.mSinceLastNotification;
    }

    public static /* synthetic */ int access$202(BandWidthSampler bandWidthSampler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0f3129b", new Object[]{bandWidthSampler, new Integer(i)})).intValue();
        }
        bandWidthSampler.mSinceLastNotification = i;
        return i;
    }

    public static /* synthetic */ int access$208(BandWidthSampler bandWidthSampler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33a2cfe8", new Object[]{bandWidthSampler})).intValue();
        }
        int i = bandWidthSampler.mSinceLastNotification;
        bandWidthSampler.mSinceLastNotification = i + 1;
        return i;
    }

    public static /* synthetic */ int access$302(BandWidthSampler bandWidthSampler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("166d38dc", new Object[]{bandWidthSampler, new Integer(i)})).intValue();
        }
        bandWidthSampler.currentNetworkSpeed = i;
        return i;
    }

    static {
        kge.a(-1136164853);
        isNetworkMeterStarted = false;
        mReceivedDataCount = 0;
        mReceivedRequestStartTimePre = 0L;
        mReceivedRequestFinishedTimePre = 0L;
        mKalmanTimeUsed = 0L;
        mKalmanDataSize = 0L;
        mSpeedKalmanCount = 0L;
        speedPrePre = mto.a.GEO_NOT_SUPPORT;
        speedPre = mto.a.GEO_NOT_SUPPORT;
        speed = mto.a.GEO_NOT_SUPPORT;
        speedThreshold = 40.0d;
    }

    public static BandWidthSampler getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BandWidthSampler) ipChange.ipc$dispatch("b18dd498", new Object[0]) : StaticHolder.instance;
    }

    private BandWidthSampler() {
        this.currentNetworkSpeed = 5;
        this.mSinceLastNotification = 0;
        this.mNetWorkKalmanFilter = new NetWorkKalmanFilter();
        NetworkStatusHelper.addStatusChangeListener(new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: anet.channel.monitor.BandWidthSampler.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
            public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                    return;
                }
                BandWidthSampler.access$100(BandWidthSampler.this).ResetKalmanParams();
                BandWidthSampler.mSpeedKalmanCount = 0L;
                BandWidthSampler.this.startNetworkMeter();
            }
        });
    }

    public int getNetworkSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1387ca29", new Object[]{this})).intValue();
        }
        if (NetworkStatusHelper.getStatus() != NetworkStatusHelper.NetworkStatus.G2) {
            return this.currentNetworkSpeed;
        }
        return 1;
    }

    public double getNetSpeedValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c422db26", new Object[]{this})).doubleValue() : speed;
    }

    public synchronized void startNetworkMeter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8a184", new Object[]{this});
            return;
        }
        try {
            ALog.i(TAG, "[startNetworkMeter]", null, "NetworkStatus", NetworkStatusHelper.getStatus());
            if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
                isNetworkMeterStarted = false;
            } else {
                isNetworkMeterStarted = true;
            }
        } catch (Exception e) {
            ALog.w(TAG, "startNetworkMeter fail.", null, e, new Object[0]);
        }
    }

    public void stopNetworkMeter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27e8a524", new Object[]{this});
        } else {
            isNetworkMeterStarted = false;
        }
    }

    public void onDataReceived(final long j, final long j2, final long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a005f3", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
        } else if (!isNetworkMeterStarted) {
        } else {
            if (ALog.isPrintLog(1)) {
                ALog.d(TAG, Constants.KEY_DATA_RECEIVED_TIME, null, "mRequestStartTime", Long.valueOf(j), "mRequestFinishedTime", Long.valueOf(j2), "mRequestDataSize", Long.valueOf(j3));
            }
            if (j3 <= 3000 || j >= j2) {
                return;
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.monitor.BandWidthSampler.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    long j4;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BandWidthSampler.mReceivedDataCount++;
                    BandWidthSampler.mKalmanDataSize += j3;
                    if (BandWidthSampler.mReceivedDataCount == 1) {
                        BandWidthSampler.mKalmanTimeUsed = j2 - j;
                    }
                    if (BandWidthSampler.mReceivedDataCount >= 2 && BandWidthSampler.mReceivedDataCount <= 3) {
                        if (j >= BandWidthSampler.mReceivedRequestFinishedTimePre) {
                            j4 = BandWidthSampler.mKalmanTimeUsed + (j2 - j);
                        } else if (j < BandWidthSampler.mReceivedRequestFinishedTimePre && j2 >= BandWidthSampler.mReceivedRequestFinishedTimePre) {
                            long j5 = BandWidthSampler.mKalmanTimeUsed + (j2 - j);
                            BandWidthSampler.mKalmanTimeUsed = j5;
                            j4 = j5 - (BandWidthSampler.mReceivedRequestFinishedTimePre - j);
                        }
                        BandWidthSampler.mKalmanTimeUsed = j4;
                    }
                    BandWidthSampler.mReceivedRequestStartTimePre = j;
                    BandWidthSampler.mReceivedRequestFinishedTimePre = j2;
                    if (BandWidthSampler.mReceivedDataCount != 3) {
                        return;
                    }
                    BandWidthSampler.speed = (long) BandWidthSampler.access$100(BandWidthSampler.this).addMeasurement(BandWidthSampler.mKalmanDataSize, BandWidthSampler.mKalmanTimeUsed);
                    BandWidthSampler.mSpeedKalmanCount++;
                    BandWidthSampler.access$208(BandWidthSampler.this);
                    if (BandWidthSampler.mSpeedKalmanCount > 30) {
                        BandWidthSampler.access$100(BandWidthSampler.this).ResetKalmanParams();
                        BandWidthSampler.mSpeedKalmanCount = 3L;
                    }
                    double d = (BandWidthSampler.speed * 0.68d) + (BandWidthSampler.speedPre * 0.27d) + (BandWidthSampler.speedPrePre * 0.05d);
                    BandWidthSampler.speedPrePre = BandWidthSampler.speedPre;
                    BandWidthSampler.speedPre = BandWidthSampler.speed;
                    if (BandWidthSampler.speed < BandWidthSampler.speedPrePre * 0.65d || BandWidthSampler.speed > BandWidthSampler.speedPrePre * 2.0d) {
                        BandWidthSampler.speed = d;
                    }
                    int i = 5;
                    if (ALog.isPrintLog(1)) {
                        ALog.d(BandWidthSampler.TAG, "NetworkSpeed", null, "mKalmanDataSize", Long.valueOf(BandWidthSampler.mKalmanDataSize), "mKalmanTimeUsed", Long.valueOf(BandWidthSampler.mKalmanTimeUsed), "speed", Double.valueOf(BandWidthSampler.speed), "mSpeedKalmanCount", Long.valueOf(BandWidthSampler.mSpeedKalmanCount));
                    }
                    if (BandWidthSampler.access$200(BandWidthSampler.this) > 5 || BandWidthSampler.mSpeedKalmanCount == 2) {
                        BandWidthListenerHelper.getInstance().onNetworkSpeedValueNotify(BandWidthSampler.speed);
                        BandWidthSampler.access$202(BandWidthSampler.this, 0);
                        BandWidthSampler bandWidthSampler = BandWidthSampler.this;
                        if (BandWidthSampler.speed < BandWidthSampler.speedThreshold) {
                            i = 1;
                        }
                        BandWidthSampler.access$302(bandWidthSampler, i);
                        ALog.i(BandWidthSampler.TAG, "NetworkSpeed notification!", null, "Send Network quality notification.");
                    }
                    BandWidthSampler.mKalmanTimeUsed = 0L;
                    BandWidthSampler.mKalmanDataSize = 0L;
                    BandWidthSampler.mReceivedDataCount = 0;
                }
            });
        }
    }
}
