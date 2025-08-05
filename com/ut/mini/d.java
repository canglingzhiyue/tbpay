package com.ut.mini;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.l;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import tb.apr;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class d implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, String> b;
    private static d f;

    /* renamed from: a  reason: collision with root package name */
    private boolean f24105a = false;
    private BlockingQueue<Map<String, String>> c = new LinkedBlockingQueue();
    private HashSet<Integer> d = new HashSet<>();
    private boolean e = false;
    private Map<String, String> g = new TreeMap(new Comparator<String>() { // from class: com.ut.mini.d.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public /* synthetic */ int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, str, str2})).intValue() : a(str, str2);
        }

        public int a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
        }
    });

    public static /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdceccb", new Object[]{dVar});
        } else {
            dVar.d();
        }
    }

    static {
        kge.a(2008044767);
        kge.a(-1390502639);
        b = new HashMap();
        f = new d();
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2e6256cb", new Object[0]) : f;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!this.f24105a) {
            this.f24105a = true;
            aqe.a().a(a());
            l.addPageChangerListener(new a());
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.f24105a) {
            this.f24105a = false;
            try {
                this.c.clear();
                this.d.clear();
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        int i = 0;
        while (true) {
            if (!this.f24105a && i <= 0) {
                return;
            }
            try {
                if (this.e) {
                    apr.b("RepeatExposureQueueMgr", "------");
                    apr.b("RepeatExposureQueueMgr", "take mQueueCache size", Integer.valueOf(this.c.size()));
                    apr.b("RepeatExposureQueueMgr", "mExposureSet size", Integer.valueOf(this.d.size()));
                }
                Map<String, String> take = this.c.take();
                if (this.e) {
                    long currentTimeMillis = System.currentTimeMillis();
                    b2 = b(take);
                    apr.b("RepeatExposureQueueMgr", "getMapHashCode cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } else {
                    b2 = b(take);
                }
                if (b2 == 0) {
                    apr.b("RepeatExposureQueueMgr", "clear ExposureSet");
                    this.d.clear();
                } else if (this.d.contains(Integer.valueOf(b2))) {
                    apr.b("RepeatExposureQueueMgr", "repeat Exposure");
                } else {
                    this.d.add(Integer.valueOf(b2));
                    apr.b("RepeatExposureQueueMgr", "send Exposure");
                    UTAnalytics.getInstance().transferLog(take);
                }
                i = this.c.size();
                if (this.e) {
                    apr.b("RepeatExposureQueueMgr", "isRunning", Boolean.valueOf(this.f24105a), "mQueueCache size", Integer.valueOf(i));
                }
            } catch (Throwable th) {
                apr.b("", th);
            }
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!this.f24105a || map == null || map.isEmpty()) {
        } else {
            this.c.add(map);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.f24105a) {
        } else {
            this.c.add(b);
        }
    }

    private synchronized int b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41e3e86f", new Object[]{this, map})).intValue();
        }
        if (map != null && !map.isEmpty()) {
            this.g.putAll(map);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : this.g.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    sb.append(key);
                }
                String value = entry.getValue();
                if (!TextUtils.isEmpty(value)) {
                    sb.append(value);
                }
            }
            this.g.clear();
            return sb.toString().hashCode();
        }
        return 0;
    }

    /* loaded from: classes.dex */
    public static class a implements l.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2037352270);
            kge.a(786836730);
        }

        @Override // com.ut.mini.l.a
        public void onPageAppear(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7330a6", new Object[]{this, obj});
            } else {
                d.a(d.a());
            }
        }

        @Override // com.ut.mini.l.a
        public void onPageDisAppear(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4c99138", new Object[]{this, obj});
            } else {
                d.a(d.a());
            }
        }
    }
}
