package com.ut.mini;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Long, a> f24129a;
    private static Map<Long, Map<String, String>> b;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f24130a = 0;
        public ArrayList<Integer> b;
        public ArrayList<String> c;

        static {
            kge.a(-1770070070);
        }
    }

    static {
        kge.a(522300485);
        f24129a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
    }

    public static synchronized void a(Activity activity, ArrayList<Integer> arrayList, ArrayList<String> arrayList2) {
        synchronized (m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("916deb7a", new Object[]{activity, arrayList, arrayList2});
            } else if (activity == null) {
            } else {
                try {
                    long b2 = o.b();
                    a aVar = new a();
                    aVar.f24130a = activity.hashCode();
                    if (arrayList != null) {
                        aVar.b = new ArrayList<>(arrayList);
                    } else {
                        aVar.b = null;
                    }
                    if (arrayList2 != null) {
                        aVar.c = new ArrayList<>(arrayList2);
                    } else {
                        aVar.c = null;
                    }
                    f24129a.put(Long.valueOf(b2), aVar);
                    a(l.getInstance().c(activity));
                    a(b2);
                } catch (Exception e) {
                    apr.b("UTPagePropertiesHelper", e, new Object[0]);
                }
            }
        }
    }

    public static synchronized void a(Object obj) {
        String str;
        synchronized (m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6251244", new Object[]{obj});
                return;
            }
            try {
                long b2 = o.b();
                a aVar = f24129a.get(Long.valueOf(b2));
                if (aVar != null && aVar.b != null && aVar.c != null) {
                    Activity activity = null;
                    if (obj instanceof Activity) {
                        activity = (Activity) obj;
                    }
                    if (activity != null && aVar.f24130a == activity.hashCode()) {
                        Map<String, String> c = l.getInstance().c(activity);
                        if (c == null) {
                            b.remove(Long.valueOf(b2));
                            return;
                        }
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        Iterator<String> it = aVar.c.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (c.containsKey(next) && (str = c.get(next)) != null) {
                                concurrentHashMap.put(next, str);
                            }
                        }
                        b.put(Long.valueOf(b2), concurrentHashMap);
                    }
                }
            } catch (Exception e) {
                apr.b("UTPagePropertiesHelper", e, new Object[0]);
            }
        }
    }

    public static synchronized void a(int i, Map<String, String> map) {
        synchronized (m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fc93e8a", new Object[]{new Integer(i), map});
                return;
            }
            try {
                long b2 = o.b();
                a aVar = f24129a.get(Long.valueOf(b2));
                if (aVar != null && aVar.b != null && aVar.c != null && aVar.b.contains(Integer.valueOf(i))) {
                    Map<String, String> map2 = b.get(Long.valueOf(b2));
                    if (map2 == null) {
                        return;
                    }
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        String key = entry.getKey();
                        if (!map.containsKey(key)) {
                            map.put(key, entry.getValue());
                        }
                    }
                }
            } catch (Exception e) {
                apr.b("UTPagePropertiesHelper", e, new Object[0]);
            }
        }
    }

    private static synchronized void a(long j) {
        synchronized (m.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
                return;
            }
            try {
                if (f24129a.size() > 20) {
                    long j2 = j - 10;
                    Iterator<Map.Entry<Long, a>> it = f24129a.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getKey().longValue() < j2) {
                            it.remove();
                        }
                    }
                }
                if (b.size() > 20) {
                    long j3 = j - 10;
                    Iterator<Map.Entry<Long, Map<String, String>>> it2 = b.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getKey().longValue() < j3) {
                            it2.remove();
                        }
                    }
                }
            } catch (Exception e) {
                apr.b("UTPagePropertiesHelper", e, new Object[0]);
            }
        }
    }
}
