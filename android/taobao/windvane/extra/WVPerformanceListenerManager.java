package android.taobao.windvane.extra;

import android.taobao.windvane.thread.b;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes.dex */
public class WVPerformanceListenerManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile WVPerformanceListenerManager sInstance;
    private final List<IPerformanceListener> mPerformanceListeners = new CopyOnWriteArrayList();

    static {
        kge.a(-311541589);
    }

    public static /* synthetic */ List access$000(WVPerformanceListenerManager wVPerformanceListenerManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("dc67504c", new Object[]{wVPerformanceListenerManager}) : wVPerformanceListenerManager.mPerformanceListeners;
    }

    private WVPerformanceListenerManager() {
    }

    public static WVPerformanceListenerManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVPerformanceListenerManager) ipChange.ipc$dispatch("dc4436e8", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (WVPerformanceListenerManager.class) {
                if (sInstance == null) {
                    sInstance = new WVPerformanceListenerManager();
                }
            }
        }
        return sInstance;
    }

    public boolean addPerformanceListener(IPerformanceListener iPerformanceListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eaddbbf", new Object[]{this, iPerformanceListener})).booleanValue() : this.mPerformanceListeners.add(iPerformanceListener);
    }

    public boolean removePerformanceListener(IPerformanceListener iPerformanceListener) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d437fc", new Object[]{this, iPerformanceListener})).booleanValue() : this.mPerformanceListeners.remove(iPerformanceListener);
    }

    public void onWhitePageOccur(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99bd10b", new Object[]{this, map});
        } else if (this.mPerformanceListeners.size() == 0) {
        } else {
            b.a().a(new Runnable() { // from class: android.taobao.windvane.extra.WVPerformanceListenerManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        for (IPerformanceListener iPerformanceListener : WVPerformanceListenerManager.access$000(WVPerformanceListenerManager.this)) {
                            if ((iPerformanceListener.getFlag() & 1) == 1 && iPerformanceListener != null) {
                                iPerformanceListener.onPerformanceEventOccur(1, map);
                            }
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }
}
