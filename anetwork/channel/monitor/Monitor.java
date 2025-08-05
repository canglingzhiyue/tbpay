package anetwork.channel.monitor;

import android.content.Context;
import anet.channel.monitor.BandWidthListenerHelper;
import anet.channel.monitor.BandWidthSampler;
import anet.channel.monitor.INetworkQualityChangeListener;
import anet.channel.monitor.QualityChangeFilter;
import anet.channel.util.ALog;
import anetwork.channel.monitor.speed.NetworkSpeed;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class Monitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "anet.Monitor";
    public static AtomicBoolean isInit;

    static {
        kge.a(-1218656489);
        isInit = new AtomicBoolean(false);
    }

    public static synchronized void init() {
        synchronized (Monitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
                return;
            }
            if (isInit.compareAndSet(false, true)) {
                BandWidthSampler.getInstance().startNetworkMeter();
            }
        }
    }

    @Deprecated
    public static synchronized void init(Context context) {
        synchronized (Monitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{context});
            } else {
                init();
            }
        }
    }

    public static void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[0]);
            return;
        }
        try {
            BandWidthSampler.getInstance().startNetworkMeter();
        } catch (Throwable th) {
            ALog.e(TAG, "start failed", null, th, new Object[0]);
        }
    }

    public static void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[0]);
            return;
        }
        try {
            BandWidthSampler.getInstance().stopNetworkMeter();
        } catch (Throwable th) {
            ALog.e(TAG, "stop failed", null, th, new Object[0]);
        }
    }

    @Deprecated
    public static NetworkSpeed getNetworkSpeed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkSpeed) ipChange.ipc$dispatch("25be743", new Object[0]) : NetworkSpeed.valueOfCode(getNetSpeed().getCode());
    }

    public static anet.channel.monitor.NetworkSpeed getNetSpeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (anet.channel.monitor.NetworkSpeed) ipChange.ipc$dispatch("7ae02ab", new Object[0]);
        }
        anet.channel.monitor.NetworkSpeed networkSpeed = anet.channel.monitor.NetworkSpeed.Fast;
        try {
            return anet.channel.monitor.NetworkSpeed.valueOfCode(BandWidthSampler.getInstance().getNetworkSpeed());
        } catch (Throwable th) {
            ALog.e(TAG, "getNetworkSpeed failed", null, th, new Object[0]);
            return networkSpeed;
        }
    }

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("812d53e1", new Object[]{iNetworkQualityChangeListener});
        } else {
            addListener(iNetworkQualityChangeListener, null);
        }
    }

    public static void addListener(INetworkQualityChangeListener iNetworkQualityChangeListener, QualityChangeFilter qualityChangeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cfe6c1d", new Object[]{iNetworkQualityChangeListener, qualityChangeFilter});
        } else {
            BandWidthListenerHelper.getInstance().addQualityChangeListener(iNetworkQualityChangeListener, qualityChangeFilter);
        }
    }

    public static void removeListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec63bc4", new Object[]{iNetworkQualityChangeListener});
        } else {
            BandWidthListenerHelper.getInstance().removeQualityChangeListener(iNetworkQualityChangeListener);
        }
    }

    public static double getNetSpeedValue() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c422db26", new Object[0])).doubleValue() : BandWidthSampler.getInstance().getNetSpeedValue();
    }
}
