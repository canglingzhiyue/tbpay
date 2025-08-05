package tb;

import android.content.IntentFilter;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.collection.common.Code;
import com.taobao.collection.common.SwitchOption;
import com.taobao.collection.common.d;
import com.taobao.collection.impl.BeaconCollection;
import com.taobao.collection.impl.WIFICollection;
import com.taobao.collection.manager.StateReceiver;
import com.taobao.collection.manager.a;
import com.taobao.collection.manager.b;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class kgh implements a, kgg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static kgh d;

    /* renamed from: a  reason: collision with root package name */
    private int f30050a = 1;
    private Map<Integer, b> b = new HashMap();
    private Map<SwitchOption.CollectionType, kgf> c = new HashMap();

    static {
        kge.a(-1292106624);
        kge.a(1943446004);
        kge.a(-1087644858);
    }

    public static synchronized kgh b() {
        synchronized (kgh.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kgh) ipChange.ipc$dispatch("16b87d71", new Object[0]);
            }
            AppMonitor.Counter.commit("passivelocation", "CollectionManagerImpl", 1.0d);
            if (d == null) {
                d = new kgh();
            }
            return d;
        }
    }

    private kgh() {
        WIFICollection wIFICollection = new WIFICollection(this);
        BeaconCollection beaconCollection = new BeaconCollection(this);
        this.c.put(SwitchOption.CollectionType.WIFI, wIFICollection);
        this.c.put(SwitchOption.CollectionType.BEACON, beaconCollection);
        StateReceiver stateReceiver = new StateReceiver(wIFICollection, beaconCollection);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        Globals.getApplication().registerReceiver(stateReceiver, intentFilter);
    }

    @Override // com.taobao.collection.manager.a
    public synchronized int a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17f3a20a", new Object[]{this, bVar})).intValue();
        }
        int i = this.f30050a;
        this.f30050a = i + 1;
        this.b.put(Integer.valueOf(i), bVar);
        return i;
    }

    @Override // com.taobao.collection.manager.a
    public synchronized void a(int i, SwitchOption.CollectionType collectionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b57870dd", new Object[]{this, new Integer(i), collectionType});
            return;
        }
        this.b.remove(Integer.valueOf(i));
        if (collectionType != null) {
            this.c.get(collectionType).remove(i);
        }
    }

    @Override // com.taobao.collection.manager.a
    public synchronized boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return this.b.get(Integer.valueOf(i)) != null;
    }

    @Override // com.taobao.collection.manager.a
    public d a(SwitchOption.CollectionType collectionType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6c3e9c1d", new Object[]{this, collectionType});
        }
        if (this.c.containsKey(collectionType)) {
            return this.c.get(collectionType).collect();
        }
        nea.a("lbs_sdk.coll_CollectionManagerImpl", "Collection = " + collectionType.name() + " unavailable!");
        return null;
    }

    @Override // tb.kgg
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47455d9", new Object[]{this, dVar});
            return;
        }
        try {
            int moduleToken = dVar.b().getModuleToken();
            if (!this.b.containsKey(Integer.valueOf(moduleToken))) {
                return;
            }
            this.b.get(Integer.valueOf(moduleToken)).a(dVar);
        } catch (Exception e) {
            nea.a("lbs_sdk.coll_CollectionManagerImpl", "call back error!", e);
        }
    }

    @Override // com.taobao.collection.manager.a
    public void a(Code code, SwitchOption switchOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5805664c", new Object[]{this, code, switchOption});
            return;
        }
        nea.c("lbs_sdk.coll_CollectionManagerImpl", "modifiy begin " + com.taobao.collection.common.b.a(code, switchOption));
        if (!this.c.containsKey(switchOption.getType())) {
            return;
        }
        this.c.get(switchOption.getType()).modifiy(code, switchOption);
    }

    @Override // com.taobao.collection.manager.a
    public Map<Integer, b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.b;
    }
}
