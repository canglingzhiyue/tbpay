package anet.channel.strategy.dispatch;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class HttpDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.HttpDispatcher";
    private AmdcTaskExecutor executor;
    private Set<String> initHosts;
    private volatile boolean isEnable;
    private AtomicBoolean isInitHostsFilled;
    private CopyOnWriteArraySet<IDispatchEventListener> listeners;
    private Set<String> uniqueIdSet;

    /* loaded from: classes.dex */
    public interface IDispatchEventListener {
        void onEvent(DispatchEvent dispatchEvent);
    }

    /* loaded from: classes.dex */
    public static class Singleton {
        public static HttpDispatcher instance;

        static {
            kge.a(1009361710);
            instance = new HttpDispatcher();
        }

        private Singleton() {
        }
    }

    static {
        kge.a(-978040921);
    }

    public static HttpDispatcher getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpDispatcher) ipChange.ipc$dispatch("f2da787c", new Object[0]) : Singleton.instance;
    }

    private HttpDispatcher() {
        this.listeners = new CopyOnWriteArraySet<>();
        this.executor = new AmdcTaskExecutor();
        this.isEnable = true;
        this.uniqueIdSet = Collections.newSetFromMap(new ConcurrentHashMap());
        this.initHosts = new TreeSet();
        this.isInitHostsFilled = new AtomicBoolean();
        fillInitHosts();
    }

    public void sendAmdcRequest(boolean z, Set<String> set, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f2515", new Object[]{this, new Boolean(z), set, new Integer(i)});
        } else {
            sendAmdcRequest(z, set, i, false, false);
        }
    }

    public void sendAmdcRequest(boolean z, Set<String> set, int i, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f508e55", new Object[]{this, new Boolean(z), set, new Integer(i), new Boolean(z2), new Boolean(z3)});
        } else if (!this.isEnable || set == null || set.isEmpty()) {
            ALog.e(TAG, "invalid parameter", null, new Object[0]);
        } else {
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!AmdcRuntimeInfo.isAllowAmdcRequest(next)) {
                    ALog.e(TAG, "Not allow to send send amdc request.", null, "host", next);
                    it.remove();
                }
            }
            if (set.isEmpty()) {
                return;
            }
            if (ALog.isPrintLog(2)) {
                ALog.i(TAG, "sendAmdcRequest isVpnProxyChange=" + z2, null, "hosts", set.toString());
            }
            ALog.e(TAG, "[ap] sendAmdcRequest amdc start!!!", null, "isForceSend", Boolean.valueOf(z3), "isVpnProxyChange", Boolean.valueOf(z2));
            HashMap hashMap = new HashMap();
            hashMap.put("hosts", set);
            hashMap.put(DispatchConstants.CONFIG_VERSION, String.valueOf(i));
            this.executor.addTask(z, hashMap, z2, z3);
        }
    }

    public void addListener(IDispatchEventListener iDispatchEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226bfe03", new Object[]{this, iDispatchEventListener});
        } else {
            this.listeners.add(iDispatchEventListener);
        }
    }

    public void removeListener(IDispatchEventListener iDispatchEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64dd326", new Object[]{this, iDispatchEventListener});
        } else {
            this.listeners.remove(iDispatchEventListener);
        }
    }

    public void fireEvent(DispatchEvent dispatchEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52ec9d2", new Object[]{this, dispatchEvent});
            return;
        }
        Iterator<IDispatchEventListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEvent(dispatchEvent);
            } catch (Exception unused) {
            }
        }
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.isEnable = z;
        }
    }

    public synchronized void addHosts(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ac3e22", new Object[]{this, list});
            return;
        }
        if (list != null) {
            this.initHosts.addAll(list);
            this.uniqueIdSet.clear();
        }
    }

    public static void setInitHosts(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafdc351", new Object[]{list});
        } else if (list == null) {
        } else {
            DispatchConstants.initHostArray = (String[]) list.toArray(new String[0]);
        }
    }

    public synchronized void clearInitHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191a1e4c", new Object[]{this});
        } else {
            this.initHosts.clear();
        }
    }

    public synchronized Set<String> getInitHosts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("22c61edb", new Object[]{this});
        }
        if (this.initHosts == null || this.initHosts.isEmpty() || (this.initHosts.size() == 1 && this.initHosts.contains(DispatchConstants.getAmdcServerDomain()))) {
            AwcnConfig.setAmdcPresetHosts("[\"guide-acs.m.taobao.com\",\"trade-acs.m.taobao.com\",\"gw.alicdn.com\",\"heic.alicdn.com\",\"ilce.alicdn.com\",\"ark-ssr.m.taobao.com\",\"wh-ssr-base-biz5-guide.taobao.com\",\"pages-fast.m.taobao.com\",\"pages-g.m.taobao.com\",\"wh-ssr-base-trade1.taobao.com\",\"web.m.taobao.com\",\"meta.m.taobao.com\",\"dinamicx.alibabausercontent.com\",\"ossgw.alicdn.com\",\"zres.alicdn.com\",\"g.alicdn.com\",\"img.alicdn.com\",\"tbm-auth.alicdn.com\",\"pingjia.alicdn.com\",\"livenging.alicdn.com\",\"liveng-rtclive.taobao.com\",\"livecb-rtclive.taobao.com\",\"livecb.alicdn.com\",\"livecb-artp.alicdn.com\",\"liveng-artp.alicdn.com\",\"liveng-artp.alicdn.com\",\"liveng-bfrtc.alibabausercontent.com\",\"livecb-bfrtc.alibabausercontent.com\",\"liveca-bfrtc.alibabausercontent.com\",\"cloud.video.taobao.com\",\"video-zb.cloudvideocdn.taobao.com\",\"video-sh.cloudvideocdn.taobao.com\",\"alimama.cloudvideocdn.taobao.com\",\"mamasearchad.cloudvideocdn.taobao.com\",\"ai.alimebot.taobao.com\",\"zconfig.alibabausercontent.com\",\"miniapp-package-zcache.taobao.com\"]");
        }
        fillInitHosts();
        return new HashSet(this.initHosts);
    }

    private void fillInitHosts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d155adf", new Object[]{this});
        } else if (this.isInitHostsFilled.get() || GlobalAppRuntimeInfo.getContext() == null || !this.isInitHostsFilled.compareAndSet(false, true)) {
        } else {
            this.initHosts.add(DispatchConstants.getAmdcServerDomain());
            if (!GlobalAppRuntimeInfo.isTargetProcess()) {
                return;
            }
            this.initHosts.addAll(Arrays.asList(DispatchConstants.initHostArray));
        }
    }

    public boolean isInitHostsChanged(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdeded38", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean contains = this.uniqueIdSet.contains(str);
        if (!contains) {
            this.uniqueIdSet.add(str);
        }
        return !contains;
    }

    public void switchENV() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d16ee920", new Object[]{this});
            return;
        }
        this.uniqueIdSet.clear();
        this.initHosts.clear();
        this.isInitHostsFilled.set(false);
    }
}
