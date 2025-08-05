package anet.channel.util;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.fulltrace.IFullTraceAnalysisV3;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;

/* loaded from: classes.dex */
public class AppLifecycle {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.AppLifeCycle";
    public static volatile long lastEnterBackgroundTime;
    private static CopyOnWriteArraySet<AppLifecycleListener> listeners;

    /* loaded from: classes.dex */
    public interface AppLifecycleListener {
        void background();

        void forground();
    }

    public static /* synthetic */ CopyOnWriteArraySet access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("5205e0b2", new Object[0]) : listeners;
    }

    private AppLifecycle() {
    }

    public static void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[0]);
            return;
        }
        GlobalAppRuntimeInfo.setBackground(false);
        notifyListener(true);
    }

    public static void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[0]);
            return;
        }
        GlobalAppRuntimeInfo.setBackground(true);
        lastEnterBackgroundTime = System.currentTimeMillis();
        notifyListener(false);
    }

    static {
        kge.a(-994481513);
        listeners = new CopyOnWriteArraySet<>();
        lastEnterBackgroundTime = 0L;
    }

    public static void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[0]);
            return;
        }
        ALog.e(TAG, "registerApmEventListener", null, new Object[0]);
        registerApmEventListener();
    }

    public static void registerLifecycleListener(AppLifecycleListener appLifecycleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb75b35", new Object[]{appLifecycleListener});
        } else if (appLifecycleListener == null) {
        } else {
            listeners.add(appLifecycleListener);
        }
    }

    public static void unregisterLifecycleListener(AppLifecycleListener appLifecycleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3da50d8e", new Object[]{appLifecycleListener});
        } else {
            listeners.remove(appLifecycleListener);
        }
    }

    public static void registerApmEventListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca62b7ba", new Object[0]);
            return;
        }
        try {
            c.a(new a.b() { // from class: anet.channel.util.AppLifecycle.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.application.common.IApmEventListener
                public void onEvent(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                    } else if (i == 1) {
                        AppLifecycle.onBackground();
                    } else if (i == 2) {
                        AppLifecycle.onForeground();
                    } else if (i == 50) {
                    }
                }
            });
        } catch (Exception e) {
            ALog.e(TAG, "registerApmEventListener exception. e=" + e.toString(), null, e, new Object[0]);
        }
    }

    private static void notifyListener(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c054230", new Object[]{new Boolean(z)});
            return;
        }
        String str = "foreground";
        ALog.e(TAG, "notifyListener", null, str, Boolean.valueOf(z));
        IFullTraceAnalysisV3 v3Instance = AnalysisFactory.getV3Instance();
        if (!z) {
            str = "background";
        }
        v3Instance.recordAppStatus("Lifecycle", str);
        ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.util.AppLifecycle.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Iterator it = AppLifecycle.access$000().iterator();
                while (it.hasNext()) {
                    AppLifecycleListener appLifecycleListener = (AppLifecycleListener) it.next();
                    try {
                        if (z) {
                            appLifecycleListener.forground();
                        } else {
                            appLifecycleListener.background();
                        }
                    } catch (Exception e) {
                        ALog.e(AppLifecycle.TAG, "notifyListener exception. e=" + e.toString(), null, e, new Object[0]);
                    }
                }
            }
        });
    }
}
