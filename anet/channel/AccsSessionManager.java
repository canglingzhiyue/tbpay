package anet.channel;

import android.content.Intent;
import android.text.TextUtils;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;

/* loaded from: classes.dex */
public class AccsSessionManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.AccsSessionManager";
    private static CopyOnWriteArraySet<ISessionListener> listeners;
    public SessionCenter instance;
    public Set<String> lastKeys = Collections.EMPTY_SET;

    public static /* synthetic */ CopyOnWriteArraySet access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("5205e0b2", new Object[0]) : listeners;
    }

    static {
        kge.a(1138348520);
        listeners = new CopyOnWriteArraySet<>();
    }

    public AccsSessionManager(SessionCenter sessionCenter) {
        this.instance = null;
        this.instance = sessionCenter;
    }

    public synchronized void checkAndStartSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1034242a", new Object[]{this});
            return;
        }
        Collection<SessionInfo> sessionInfos = this.instance.attributeManager.getSessionInfos();
        Set<String> set = Collections.EMPTY_SET;
        if (!sessionInfos.isEmpty()) {
            set = new TreeSet<>();
        }
        for (SessionInfo sessionInfo : sessionInfos) {
            if (sessionInfo.isKeepAlive) {
                set.add(StringUtils.concatString(StrategyCenter.getInstance().getSchemeByHost(sessionInfo.host, sessionInfo.isAccs ? "https" : "http"), HttpConstant.SCHEME_SPLIT, sessionInfo.host));
            }
        }
        for (String str : this.lastKeys) {
            if (!set.contains(str)) {
                closeSessions(str, "accs check not need keepAlive");
            }
        }
        if (!isNeedCheckSession()) {
            return;
        }
        for (String str2 : set) {
            try {
                this.instance.get(str2, ConnType.TypeLevel.SPDY, 0L);
                ALog.e(TAG, "checkAndStartSession retry session s=" + str2, null, str2);
            } catch (Exception unused) {
                ALog.e(TAG, "start session failed", "host", str2);
            }
        }
        this.lastKeys = set;
    }

    public synchronized void forceCloseSession(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6a1f0c4", new Object[]{this, new Boolean(z)});
            return;
        }
        for (String str : this.lastKeys) {
            closeSessions(str, "accs forceCloseSession");
        }
        if (z) {
            checkAndStartSession();
        }
    }

    private boolean isNeedCheckSession() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("19bd82f9", new Object[]{this})).booleanValue() : (!GlobalAppRuntimeInfo.isAppBackground() || !AwcnConfig.isAccsSessionCreateForbiddenInBg()) && NetworkStatusHelper.isConnected();
    }

    private void closeSessions(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00243d0", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            ALog.d(TAG, "closeSessions", this.instance.seqNum, "host", str);
            this.instance.getSessionRequest(str).closeSessions(false, str2);
        }
    }

    public void registerListener(ISessionListener iSessionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e38643", new Object[]{this, iSessionListener});
        } else if (iSessionListener == null) {
        } else {
            listeners.add(iSessionListener);
        }
    }

    public void unregisterListener(ISessionListener iSessionListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c8fb0a", new Object[]{this, iSessionListener});
        } else {
            listeners.remove(iSessionListener);
        }
    }

    public void notifyListener(final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e15570e1", new Object[]{this, intent});
        } else {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.AccsSessionManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = AccsSessionManager.access$000().iterator();
                    while (it.hasNext()) {
                        try {
                            ((ISessionListener) it.next()).onConnectionChanged(intent);
                        } catch (Exception e) {
                            ALog.e(AccsSessionManager.TAG, "notifyListener exception.", null, e, new Object[0]);
                        }
                    }
                }
            });
        }
    }
}
