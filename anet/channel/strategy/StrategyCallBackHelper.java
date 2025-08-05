package anet.channel.strategy;

import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class StrategyCallBackHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static long MAX_SIZE = 0;
    private static final String TAG = "awcn.StrategyCallBackHelper";
    private static ConcurrentHashMap<String, CopyOnWriteArrayList<IStrategyCallBackListener>> listeners;

    /* loaded from: classes2.dex */
    public interface IStrategyCallBackListener {
        void onReceiveStrategyCallBack(String str);
    }

    public static /* synthetic */ ConcurrentHashMap access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("6789008f", new Object[0]) : listeners;
    }

    public static /* synthetic */ ConcurrentHashMap access$002(ConcurrentHashMap concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("b5c27e7d", new Object[]{concurrentHashMap});
        }
        listeners = concurrentHashMap;
        return concurrentHashMap;
    }

    public static /* synthetic */ long access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1bc42ac", new Object[0])).longValue() : MAX_SIZE;
    }

    static {
        kge.a(184381059);
        listeners = new ConcurrentHashMap<>();
        MAX_SIZE = 16L;
    }

    public static void registerStrategyCallBack(final IStrategyCallBackListener iStrategyCallBackListener, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f6f227", new Object[]{iStrategyCallBackListener, str});
        } else {
            ThreadPoolExecutorFactory.submitRequestMonitorTask(new Runnable() { // from class: anet.channel.strategy.StrategyCallBackHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (str != null && !str.isEmpty() && iStrategyCallBackListener != null) {
                            if (StrategyCallBackHelper.access$000() == null) {
                                StrategyCallBackHelper.access$002(new ConcurrentHashMap());
                            }
                            if (StrategyCallBackHelper.access$000().size() > StrategyCallBackHelper.access$100()) {
                                ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt]  not allow registerStrategyCallBack!", null, DataReceiveMonitor.CB_LISTENER, iStrategyCallBackListener, "host", str);
                                return;
                            }
                            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) StrategyCallBackHelper.access$000().get(str);
                            if (copyOnWriteArrayList == null) {
                                copyOnWriteArrayList = new CopyOnWriteArrayList();
                            }
                            if (copyOnWriteArrayList.size() > StrategyCallBackHelper.access$100() / 2 || copyOnWriteArrayList.contains(iStrategyCallBackListener)) {
                                ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt] not need registerStrategyCallBack!", null, DataReceiveMonitor.CB_LISTENER, iStrategyCallBackListener, "host", str, "size", Integer.valueOf(StrategyCallBackHelper.access$000().size()), "list size", Integer.valueOf(copyOnWriteArrayList.size()));
                                return;
                            }
                            copyOnWriteArrayList.add(iStrategyCallBackListener);
                            StrategyCallBackHelper.access$000().remove(str);
                            StrategyCallBackHelper.access$000().put(str, copyOnWriteArrayList);
                            ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt] registerStrategyCallBack success!", null, DataReceiveMonitor.CB_LISTENER, iStrategyCallBackListener, "host", str, "size", Integer.valueOf(StrategyCallBackHelper.access$000().size()), "list size", Integer.valueOf(copyOnWriteArrayList.size()));
                            return;
                        }
                        ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt] registerStrategyCallBack! host null", null, DataReceiveMonitor.CB_LISTENER, iStrategyCallBackListener);
                    } catch (Throwable th) {
                        ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt] registerStrategyCallBack error=" + th.toString(), null, new Object[0]);
                    }
                }
            });
        }
    }

    public static void notifyStrategyCallBack(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99516e32", new Object[]{str});
        } else if (!AwcnConfig.isOrangeOptEnable()) {
            ALog.e(TAG, "[strategy listener opt] not need notifyStrategyCallBack! isOrangeOptEnable is false", null, new Object[0]);
        } else {
            ThreadPoolExecutorFactory.submitRequestMonitorTask(new Runnable() { // from class: anet.channel.strategy.StrategyCallBackHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (str != null && !str.isEmpty() && StrategyCallBackHelper.access$000() != null) {
                            ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt] notifyStrategyCallBack!", null, "host", str);
                            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) StrategyCallBackHelper.access$000().get(str);
                            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                                Iterator it = copyOnWriteArrayList.iterator();
                                while (it.hasNext()) {
                                    ((IStrategyCallBackListener) it.next()).onReceiveStrategyCallBack(str);
                                }
                                StrategyCallBackHelper.access$000().remove(str);
                                return;
                            }
                            ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt] not need notifyStrategyCallBack! maybe already callback！", null, "host", str);
                            return;
                        }
                        ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt] not need notifyStrategyCallBack! host or listeners null", null, new Object[0]);
                    } catch (Throwable th) {
                        ALog.e(StrategyCallBackHelper.TAG, "[strategy listener opt] notifyStrategyCallBack error=" + th.toString(), null, new Object[0]);
                    }
                }
            });
        }
    }
}
