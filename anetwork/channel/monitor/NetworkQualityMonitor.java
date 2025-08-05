package anetwork.channel.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import anet.channel.AwcnConfig;
import anet.channel.monitor.SRttMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkQualityMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_DOMAINS_COUNT = 64;
    private static final int MAX_LISTENER_COUNT = 16;
    private static NetworkQualityMonitor instance;
    private ConcurrentHashMap<String, ArrayList<DomainListenerWrapper>> domainListenerMap = new ConcurrentHashMap<>();
    private ArrayList<GlobalListenerWrapper> globalListeners = new ArrayList<>();
    private HandlerThread handlerThread = new HandlerThread("NetworkQualityMonitorThread");
    private Handler notifyHandler;

    /* loaded from: classes.dex */
    public interface IDomainNetworkQualityListener {
        void onNetworkQualityChanged(String str, int i, double d, long j);
    }

    /* loaded from: classes.dex */
    public interface IGlobalNetworkQualityListener {
        void onNetworkQualityChanged(int i, double d);
    }

    /* loaded from: classes.dex */
    private interface IListenerWrapper {
        void updateQualityLevel(int i, double d, long j);
    }

    static {
        kge.a(-761151450);
        instance = new NetworkQualityMonitor();
    }

    public static NetworkQualityMonitor getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkQualityMonitor) ipChange.ipc$dispatch("c049dacd", new Object[0]) : instance;
    }

    private NetworkQualityMonitor() {
        this.handlerThread.start();
        this.notifyHandler = new Handler(this.handlerThread.getLooper());
    }

    public static int getGlobalNetworkQuality() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e1a24164", new Object[0])).intValue() : NetworkQoSCenter.getInstance().getQualityLevel(null);
    }

    public static int getDomainNetworkQuality(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5546e58f", new Object[]{str})).intValue() : NetworkQoSCenter.getInstance().getQualityLevel(str);
    }

    public synchronized boolean registerGlobalNetworkQualityListener(IGlobalNetworkQualityListener iGlobalNetworkQualityListener) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("117a9472", new Object[]{this, iGlobalNetworkQualityListener})).booleanValue();
        } else if (iGlobalNetworkQualityListener == null) {
            return false;
        } else {
            if (this.globalListeners.size() >= 16) {
                return false;
            }
            Iterator<GlobalListenerWrapper> it = this.globalListeners.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().listener == iGlobalNetworkQualityListener) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                GlobalListenerWrapper globalListenerWrapper = new GlobalListenerWrapper(this.notifyHandler, iGlobalNetworkQualityListener);
                this.globalListeners.add(globalListenerWrapper);
                globalListenerWrapper.updateQualityLevel(getGlobalNetworkQuality(), getGlobalPredictBandWidth(), 0L);
            }
            return true;
        }
    }

    public synchronized void unregisterGlobalNetworkQualityListener(IGlobalNetworkQualityListener iGlobalNetworkQualityListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444fce47", new Object[]{this, iGlobalNetworkQualityListener});
            return;
        }
        if (iGlobalNetworkQualityListener != null) {
            Iterator<GlobalListenerWrapper> it = this.globalListeners.iterator();
            while (it.hasNext()) {
                GlobalListenerWrapper next = it.next();
                if (next.listener == iGlobalNetworkQualityListener) {
                    this.globalListeners.remove(next);
                    return;
                }
            }
        }
    }

    public synchronized boolean registerDomainNetworkQualityListener(String str, IDomainNetworkQualityListener iDomainNetworkQualityListener) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58b4581c", new Object[]{this, str, iDomainNetworkQualityListener})).booleanValue();
        } else if (str == null || iDomainNetworkQualityListener == null) {
            return false;
        } else {
            ArrayList<DomainListenerWrapper> arrayList = this.domainListenerMap.get(str);
            if (arrayList == null) {
                if (this.domainListenerMap.size() >= 64) {
                    return false;
                }
                arrayList = new ArrayList<>();
                this.domainListenerMap.put(str, arrayList);
            }
            if (arrayList.size() >= 16) {
                return false;
            }
            Iterator<DomainListenerWrapper> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().listener == iDomainNetworkQualityListener) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                DomainListenerWrapper domainListenerWrapper = new DomainListenerWrapper(this.notifyHandler, str, iDomainNetworkQualityListener);
                arrayList.add(domainListenerWrapper);
                domainListenerWrapper.updateQualityLevel(getDomainNetworkQuality(str), getDomainPredictBandwidth(str), SRttMonitor.getDomainSRtt(str));
            }
            return true;
        }
    }

    public synchronized void unregisterDomainNetworkQualityListener(String str, IDomainNetworkQualityListener iDomainNetworkQualityListener) {
        ArrayList<DomainListenerWrapper> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57a2db1", new Object[]{this, str, iDomainNetworkQualityListener});
            return;
        }
        if (str != null && iDomainNetworkQualityListener != null && (arrayList = this.domainListenerMap.get(str)) != null) {
            Iterator<DomainListenerWrapper> it = arrayList.iterator();
            while (it.hasNext()) {
                DomainListenerWrapper next = it.next();
                if (next.listener == iDomainNetworkQualityListener) {
                    arrayList.remove(next);
                    return;
                }
            }
        }
    }

    public double getGlobalCurrentBandwidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8ec77e6", new Object[]{this})).doubleValue() : NetworkQoSCenter.getInstance().getBandwidth(0, 0, null);
    }

    public double getGlobalPredictBandWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bfbe9c66", new Object[]{this})).doubleValue() : NetworkQoSCenter.getInstance().getBandwidth(0, 1, null);
    }

    public double getDomainCurrentBandwidth(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cfb68411", new Object[]{this, str})).doubleValue() : NetworkQoSCenter.getInstance().getBandwidth(1, 0, str);
    }

    public double getDomainPredictBandwidth(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b1aa0b1", new Object[]{this, str})).doubleValue() : NetworkQoSCenter.getInstance().getBandwidth(1, 1, str);
    }

    public synchronized void updateGlobalQualityLevel(int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e026553", new Object[]{this, new Integer(i), new Double(d)});
            return;
        }
        Iterator<GlobalListenerWrapper> it = this.globalListeners.iterator();
        while (it.hasNext()) {
            it.next().updateQualityLevel(i, d, 0L);
        }
    }

    public synchronized void updateDomainQualityLevel(String str, int i, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abb5b3e", new Object[]{this, str, new Integer(i), new Double(d)});
        } else if (str == null) {
        } else {
            ArrayList<DomainListenerWrapper> arrayList = this.domainListenerMap.get(str);
            if (arrayList == null) {
                return;
            }
            long domainSRtt = SRttMonitor.getDomainSRtt(str);
            Iterator<DomainListenerWrapper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().updateQualityLevel(i, d, domainSRtt);
            }
        }
    }

    public static boolean isNotifyAccepted(int i, int i2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef2ed9c5", new Object[]{new Integer(i), new Integer(i2), new Long(j), new Long(j2)})).booleanValue();
        }
        if (i == i2) {
            return false;
        }
        long j3 = j2 - j;
        return j3 < 0 || j3 >= AwcnConfig.getQualityNotifyMinInterval();
    }

    /* loaded from: classes.dex */
    public static class GlobalListenerWrapper implements IListenerWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IGlobalNetworkQualityListener listener;
        private Handler notifyHandler;
        private long preNotifyTimestamp = 0;
        private int preQualityLevel = -1;

        static {
            kge.a(1579551998);
            kge.a(286288500);
        }

        public GlobalListenerWrapper(Handler handler, IGlobalNetworkQualityListener iGlobalNetworkQualityListener) {
            this.notifyHandler = handler;
            this.listener = iGlobalNetworkQualityListener;
        }

        @Override // anetwork.channel.monitor.NetworkQualityMonitor.IListenerWrapper
        public void updateQualityLevel(final int i, final double d, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("673cdb4", new Object[]{this, new Integer(i), new Double(d), new Long(j)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!NetworkQualityMonitor.isNotifyAccepted(this.preQualityLevel, i, this.preNotifyTimestamp, currentTimeMillis)) {
                return;
            }
            if (this.listener != null) {
                this.notifyHandler.post(new Runnable() { // from class: anetwork.channel.monitor.NetworkQualityMonitor.GlobalListenerWrapper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            GlobalListenerWrapper.this.listener.onNetworkQualityChanged(i, d);
                        }
                    }
                });
            }
            this.preNotifyTimestamp = currentTimeMillis;
            this.preQualityLevel = i;
        }
    }

    /* loaded from: classes.dex */
    public static class DomainListenerWrapper implements IListenerWrapper {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String domain;
        public IDomainNetworkQualityListener listener;
        private Handler notifyHandler;
        private long preNotifyTimestamp = 0;
        private int preQualityLevel = -1;

        static {
            kge.a(-674449987);
            kge.a(286288500);
        }

        public static /* synthetic */ String access$000(DomainListenerWrapper domainListenerWrapper) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("faf76af7", new Object[]{domainListenerWrapper}) : domainListenerWrapper.domain;
        }

        public DomainListenerWrapper(Handler handler, String str, IDomainNetworkQualityListener iDomainNetworkQualityListener) {
            this.notifyHandler = handler;
            this.listener = iDomainNetworkQualityListener;
            this.domain = str;
        }

        @Override // anetwork.channel.monitor.NetworkQualityMonitor.IListenerWrapper
        public void updateQualityLevel(final int i, final double d, final long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("673cdb4", new Object[]{this, new Integer(i), new Double(d), new Long(j)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (!NetworkQualityMonitor.isNotifyAccepted(this.preQualityLevel, i, this.preNotifyTimestamp, currentTimeMillis)) {
                return;
            }
            if (this.listener != null) {
                this.notifyHandler.post(new Runnable() { // from class: anetwork.channel.monitor.NetworkQualityMonitor.DomainListenerWrapper.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            DomainListenerWrapper.this.listener.onNetworkQualityChanged(DomainListenerWrapper.access$000(DomainListenerWrapper.this), i, d, j);
                        }
                    }
                });
            }
            this.preNotifyTimestamp = currentTimeMillis;
            this.preQualityLevel = i;
        }
    }
}
