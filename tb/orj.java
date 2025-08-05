package tb;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class orj implements NetworkStatusHelper.INetworkStatusChangeListener, nvf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArraySet<Runnable> f32320a = new CopyOnWriteArraySet<>();
    private final AtomicBoolean b = new AtomicBoolean(false);

    public static /* synthetic */ CopyOnWriteArraySet a(orj orjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArraySet) ipChange.ipc$dispatch("b332ad8", new Object[]{orjVar}) : orjVar.f32320a;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
        } else if (networkStatus.ordinal() < NetworkStatusHelper.NetworkStatus.G3.ordinal()) {
            RSoLog.c("onNetworkStatusChanged < G3, useless skip ");
        } else {
            RSoLog.c("onNetworkStatusChanged to " + networkStatus.name());
            ikq.a("TaobaoNetAvailableWatcher", new Runnable() { // from class: tb.orj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Iterator it = orj.a(orj.this).iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            });
        }
    }
}
