package anet.channel.monitor;

import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class BandWidthListenerHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BandWidthListenerHelp";
    private static volatile BandWidthListenerHelper instance;
    private Map<INetworkQualityChangeListener, QualityChangeFilter> qualityListeners = new ConcurrentHashMap();
    private QualityChangeFilter defaultFilter = new QualityChangeFilter();

    static {
        kge.a(1557508127);
    }

    private BandWidthListenerHelper() {
    }

    public static BandWidthListenerHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BandWidthListenerHelper) ipChange.ipc$dispatch("3df107f4", new Object[0]);
        }
        if (instance == null) {
            synchronized (BandWidthListenerHelper.class) {
                if (instance == null) {
                    instance = new BandWidthListenerHelper();
                }
            }
        }
        return instance;
    }

    public void addQualityChangeListener(INetworkQualityChangeListener iNetworkQualityChangeListener, QualityChangeFilter qualityChangeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c8c5aa", new Object[]{this, iNetworkQualityChangeListener, qualityChangeFilter});
        } else if (iNetworkQualityChangeListener == null) {
            ALog.e(TAG, "listener is null", null, new Object[0]);
        } else if (qualityChangeFilter == null) {
            this.defaultFilter.filterAddTime = System.currentTimeMillis();
            this.qualityListeners.put(iNetworkQualityChangeListener, this.defaultFilter);
        } else {
            qualityChangeFilter.filterAddTime = System.currentTimeMillis();
            this.qualityListeners.put(iNetworkQualityChangeListener, qualityChangeFilter);
        }
    }

    public void removeQualityChangeListener(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3857eab", new Object[]{this, iNetworkQualityChangeListener});
        } else {
            this.qualityListeners.remove(iNetworkQualityChangeListener);
        }
    }

    public void onNetworkSpeedValueNotify(double d) {
        boolean detectNetSpeedSlow;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5db315", new Object[]{this, new Double(d)});
            return;
        }
        for (Map.Entry<INetworkQualityChangeListener, QualityChangeFilter> entry : this.qualityListeners.entrySet()) {
            INetworkQualityChangeListener key = entry.getKey();
            QualityChangeFilter value = entry.getValue();
            if (key != null && value != null && !value.checkShouldDelay() && value.isNetSpeedSlow() != (detectNetSpeedSlow = value.detectNetSpeedSlow(d))) {
                value.setNetSpeedSlow(detectNetSpeedSlow);
                key.onNetworkQualityChanged(detectNetSpeedSlow ? NetworkSpeed.Slow : NetworkSpeed.Fast);
            }
        }
    }
}
