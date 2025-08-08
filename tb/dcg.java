package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.accs.data.AccsStreamConfig;
import com.taobao.accs.sync.queue.a;
import com.taobao.accs.sync.queue.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes.dex */
public class dcg implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, dce> f26677a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, c<dch>> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Map<String, c<dch>>> c = new ConcurrentHashMap<>();
    private final Map<String, Map<String, List<dch>>> d = new ConcurrentHashMap();
    private final Map<String, AccsStreamConfig> e = new ConcurrentHashMap();
    private Map<String, PriorityBlockingQueue<dch>> f = new ConcurrentHashMap();
    private long g;

    static {
        kge.a(-358005432);
        kge.a(1415011697);
    }

    public static /* synthetic */ Map a(dcg dcgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6a3eac45", new Object[]{dcgVar}) : dcgVar.f;
    }

    public void a(dch dchVar) {
        AccsStreamConfig accsStreamConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4dcea6f", new Object[]{this, dchVar});
            return;
        }
        String d = dchVar.d();
        String e = dchVar.e();
        if (StringUtils.isEmpty(d) || StringUtils.isEmpty(e)) {
            return;
        }
        c<dch> cVar = null;
        if (!b(d)) {
            d(dchVar);
            return;
        }
        Map<String, c<dch>> map = this.c.get(d);
        if (map == null) {
            map = new ConcurrentHashMap<>();
            this.c.put(d, map);
        } else {
            cVar = map.get(e);
        }
        Map<String, c<dch>> map2 = map;
        if (cVar == null && (accsStreamConfig = this.e.get(d)) != null) {
            cVar = new c<>(d, e, accsStreamConfig.getStartSeq(), accsStreamConfig.getSeqSnapshotInterval(), accsStreamConfig.getSyncTimeoutInMill(), accsStreamConfig.isSaveDB(), this);
            map2.put(e, cVar);
        }
        if (!b(d) || cVar == null) {
            d(dchVar);
        } else {
            cVar.a((c<dch>) dchVar);
        }
    }

    public void b(dch dchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35ff0f0", new Object[]{this, dchVar});
            return;
        }
        dce dceVar = this.f26677a.get(dchVar.d());
        if (dceVar == null) {
            dcl.a("SyncManagerImpl", "output, callback = null", new Object[0]);
            return;
        }
        final String d = dchVar.d();
        PriorityBlockingQueue<dch> priorityBlockingQueue = this.f.get(d);
        if (priorityBlockingQueue == null) {
            priorityBlockingQueue = new PriorityBlockingQueue<>(64, dcf.comparator);
            this.f.put(d, priorityBlockingQueue);
        }
        priorityBlockingQueue.offer(dchVar);
        final WeakReference weakReference = new WeakReference(dceVar);
        dci.c().execute(new Runnable() { // from class: tb.dcg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                dce dceVar2 = (dce) weakReference.get();
                if (dceVar2 == null) {
                    dcl.a("SyncManagerImpl", "output() callback was recycled", new Object[0]);
                    return;
                }
                synchronized (dceVar2.c) {
                    try {
                        dch dchVar2 = (dch) ((PriorityBlockingQueue) dcg.a(dcg.this).get(d)).poll();
                        if (dchVar2 != null) {
                            String a2 = dchVar2.a();
                            if (dchVar2.b() == null && !StringUtils.isEmpty(a2)) {
                                dchVar2.a(dceVar2.a(a2));
                            }
                            dcl.a("SyncManagerImpl", NetConfig.OUPUT_KEY, dchVar2);
                            dceVar2.a(dchVar2);
                        }
                    }
                }
            }
        });
    }

    public boolean a(String str, String str2, int i, int i2, long j, boolean z, dce dceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("124295a", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Long(j), new Boolean(z), dceVar})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || dceVar == null) {
            dcl.a("SyncManagerImpl", "SyncManager.subscribeStream(), serviceId or callback = NULL!", new Object[0]);
            return false;
        }
        dcl.a("SyncManagerImpl", "subscribeStream", "serviceId", str, "streamId", str2, "startFromSeq", Integer.valueOf(i), "snapInterval", Integer.valueOf(i2));
        this.f26677a.put(str, dceVar);
        AccsStreamConfig accsStreamConfig = new AccsStreamConfig(str);
        accsStreamConfig.setStartSeq(i);
        accsStreamConfig.setSeqSnapshotInterval(i2);
        accsStreamConfig.setSyncTimeoutInMill(j);
        accsStreamConfig.setSaveDB(z);
        this.e.put(str, accsStreamConfig);
        b(str, null);
        return true;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!StringUtils.isEmpty(str) && b(str)) {
            dcl.a("SyncManagerImpl", "unSubscribeStream", "serviceId", str);
            Map<String, c<dch>> remove = this.c.remove(str);
            if (remove != null) {
                for (c<dch> cVar : remove.values()) {
                    if (cVar != null) {
                        cVar.b();
                    }
                }
            }
            this.f26677a.remove(str);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (b(str)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.g;
            if (j > 0 && elapsedRealtime - j <= 5000) {
                return;
            }
            this.g = elapsedRealtime;
            Map<String, c<dch>> map = this.c.get(str);
            if (map != null) {
                for (c<dch> cVar : map.values()) {
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            }
            dcl.a("SyncManagerImpl", "tryToPull() ", new Object[0]);
        }
    }

    public void a(final String str, final String str2, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69987edc", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        final c<dch> cVar = this.b.get(str);
        if (cVar == null) {
            dcl.a("SyncManagerImpl", "query() executor = null", new Object[0]);
        } else {
            dci.b().execute(new Runnable() { // from class: tb.dcg.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    List<dch> a2 = cVar.a(str, str2, i, i2);
                    if (a2 == null || a2.size() <= 0) {
                        return;
                    }
                    for (dch dchVar : a2) {
                        dcf.a().b(dchVar);
                    }
                }
            });
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (!b(str)) {
            dcl.a("SyncManagerImpl", "recover() not subscribed", "serviceId", str);
            this.d.remove(str);
        } else {
            Map<String, List<dch>> map = this.d.get(str);
            if (map == null) {
                return;
            }
            for (List<dch> list : map.values()) {
                if (list != null && !list.isEmpty()) {
                    for (dch dchVar : list) {
                        a(dchVar);
                    }
                }
            }
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.f26677a.containsKey(str);
    }

    @Override // com.taobao.accs.sync.queue.a
    public boolean c(dch dchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1e2f775", new Object[]{this, dchVar})).booleanValue();
        }
        if (!b(dchVar.d())) {
            return false;
        }
        dcf.a().b(dchVar);
        return true;
    }

    @Override // com.taobao.accs.sync.queue.a
    public void b(final String str, final String str2, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed9ed9d", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        final dce dceVar = this.f26677a.get(str);
        if (dceVar == null) {
            return;
        }
        dci.c().execute(new Runnable() { // from class: tb.dcg.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    dceVar.a(str, str2, i, i2);
                }
            }
        });
    }

    @Override // com.taobao.accs.sync.queue.a
    public String a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("357f6ed2", new Object[]{this, str, obj});
        }
        dce dceVar = this.f26677a.get(str);
        if (dceVar == null) {
            return null;
        }
        return dceVar.a(obj);
    }

    @Override // com.taobao.accs.sync.queue.a
    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else {
            dcf.a().c(str, str2);
        }
    }

    private void d(dch dchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b065fdf2", new Object[]{this, dchVar});
            return;
        }
        dcl.a("SyncManagerImpl", "saveToLocal", dchVar);
        Map<String, List<dch>> map = this.d.get(dchVar.d());
        if (map == null) {
            map = new HashMap<>();
            this.d.put(dchVar.d(), map);
        }
        List<dch> list = map.get(dchVar.e());
        if (list == null) {
            list = new ArrayList<>(10);
            map.put(dchVar.e(), list);
        }
        list.add(dchVar);
    }
}
