package tb;

import android.text.TextUtils;
import android.util.LruCache;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.template.download.c;
import com.taobao.android.dinamicx.template.download.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class fwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, JSONObject> f28155a;
    private final Map<String, Map<String, Set<Long>>> b;
    private final Map<String, Map<String, LinkedList<DXTemplateItem>>> c;
    private final com.taobao.android.dinamicx.model.b<a> d;
    private final Map<String, Set<Long>> e;
    private final LruCache<String, Integer> f;

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fwj f28157a;

        static {
            kge.a(-1584910174);
            f28157a = new fwj();
        }

        public static /* synthetic */ fwj a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fwj) ipChange.ipc$dispatch("f04ce85", new Object[0]) : f28157a;
        }
    }

    static {
        kge.a(-599783985);
    }

    private fwj() {
        this.f28155a = new ConcurrentHashMap<>();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new com.taobao.android.dinamicx.model.b<>();
        this.e = new HashMap();
        this.f = new LruCache<>(100);
    }

    public static fwj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fwj) ipChange.ipc$dispatch("f04ce85", new Object[0]) : b.a();
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (TextUtils.isEmpty(str) || jSONObject == null) {
        } else {
            this.f28155a.put(str, jSONObject);
        }
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !TextUtils.isEmpty(str) && this.f28155a.get(str) == null;
    }

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, LinkedList<DXTemplateItem>> f28156a;

        static {
            kge.a(-516952048);
        }

        private a() {
            this.f28156a = new HashMap();
        }
    }

    private void e(String str, long j, DXTemplateItem dXTemplateItem) {
        LinkedList<DXTemplateItem> linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8e3777", new Object[]{this, str, new Long(j), dXTemplateItem});
            return;
        }
        synchronized (this.d) {
            a aVar = this.d.get(j);
            if (aVar == null) {
                aVar = new a();
                this.d.put(j, aVar);
            }
            linkedList = aVar.f28156a.get(dXTemplateItem.f11925a);
            if (linkedList == null) {
                Map<String, LinkedList<DXTemplateItem>> map = this.c.get(str);
                if (map == null || map.get(dXTemplateItem.f11925a) == null) {
                    e(str, dXTemplateItem);
                }
                Map<String, LinkedList<DXTemplateItem>> map2 = this.c.get(str);
                if (map2 != null) {
                    LinkedList<DXTemplateItem> linkedList2 = map2.get(dXTemplateItem.f11925a);
                    if (linkedList2 == null) {
                        aVar.f28156a.put(dXTemplateItem.f11925a, new LinkedList<>());
                    } else {
                        aVar.f28156a.put(dXTemplateItem.f11925a, new LinkedList<>(linkedList2));
                    }
                }
            }
        }
        if (linkedList != null) {
            return;
        }
        synchronized (this.e) {
            String str2 = str + dXTemplateItem.f11925a;
            Set<Long> set = this.e.get(str2);
            if (set == null) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(j));
                this.e.put(str2, hashSet);
            } else {
                set.add(Long.valueOf(j));
            }
        }
    }

    private void e(String str, DXTemplateItem dXTemplateItem) {
        LinkedList<DXTemplateItem> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da1d65f", new Object[]{this, str, dXTemplateItem});
            return;
        }
        synchronized (this.c) {
            Map<String, LinkedList<DXTemplateItem>> map = this.c.get(str);
            if (map == null) {
                map = new HashMap<>();
                this.c.put(str, map);
            }
            if (map.get(dXTemplateItem.f11925a) == null) {
                if (fqi.au()) {
                    c = fwh.a().d(str, dXTemplateItem);
                    a(str, dXTemplateItem.f11925a, c);
                } else {
                    c = fwh.a().c(str, dXTemplateItem);
                }
                DXTemplateItem f = f(str, dXTemplateItem);
                if (f != null) {
                    a(c, f);
                }
                map.put(dXTemplateItem.f11925a, c);
            }
        }
    }

    public void a(String str, String str2, LinkedList<DXTemplateItem> linkedList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac527d4", new Object[]{this, str, str2, linkedList});
        } else if (linkedList == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            synchronized (this.b) {
                Map<String, Set<Long>> map = this.b.get(str);
                if (map == null) {
                    map = new HashMap<>();
                    this.b.put(str, map);
                }
                Set<Long> set = map.get(str2);
                if (set == null) {
                    set = new HashSet<>();
                }
                Iterator<DXTemplateItem> it = linkedList.iterator();
                while (it.hasNext()) {
                    DXTemplateItem next = it.next();
                    if (next.f) {
                        it.remove();
                        set.add(Long.valueOf(next.b));
                    }
                }
                map.put(str2, set);
            }
        }
    }

    private int a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6cdec502", new Object[]{this, num})).intValue();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private boolean f(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("542f7a1a", new Object[]{this, str, new Long(j), dXTemplateItem})).booleanValue() : j != 0 && fxb.a(str, dXTemplateItem);
    }

    private DXTemplateItem f(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("c80675df", new Object[]{this, str, dXTemplateItem});
        }
        JSONObject jSONObject = this.f28155a.get(str);
        if (jSONObject == null || jSONObject.isEmpty()) {
            return g(str, dXTemplateItem);
        }
        return a(str, dXTemplateItem, jSONObject);
    }

    private DXTemplateItem a(String str, DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("c7d1cfea", new Object[]{this, str, dXTemplateItem, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(dXTemplateItem.f11925a);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            if (DinamicXEngine.j()) {
                fuw.b("DXTemplateInfoManager", str + '|' + dXTemplateItem.f11925a + "无内置");
            }
            return null;
        }
        long longValue = jSONObject2.getLongValue("version");
        if (longValue <= 0) {
            if (DinamicXEngine.j()) {
                fuw.c("DXTemplateInfoManager", str + '|' + dXTemplateItem.f11925a + "内置索引文件版本号非数字或版本号小于1");
            }
            return null;
        }
        String string = jSONObject2.getString(fxb.DX_MAIN_TEMPLATE_NAME);
        if (TextUtils.isEmpty(string)) {
            if (DinamicXEngine.j()) {
                fuw.c("DXTemplateInfoManager", str + '|' + dXTemplateItem.f11925a + "内置索引文件缺少主模板路径");
            }
            return null;
        }
        DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
        dXTemplateItem2.f11925a = dXTemplateItem.f11925a;
        dXTemplateItem2.b = longValue;
        dXTemplateItem2.e = true;
        dXTemplateItem2.g = new f();
        dXTemplateItem2.g.f11934a = string;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("other");
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            dXTemplateItem2.g.b();
            for (String str2 : jSONObject3.keySet()) {
                dXTemplateItem2.g.b.put(str2, jSONObject3.getString(str2));
            }
        }
        return dXTemplateItem2;
    }

    private DXTemplateItem g(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("a09767fe", new Object[]{this, str, dXTemplateItem});
        }
        StringBuilder sb = new StringBuilder(fwn.a().c());
        sb.append(str);
        sb.append(fxb.DIR);
        sb.append(dXTemplateItem.f11925a);
        long a2 = fxb.a(c.d(sb.toString()));
        HashMap hashMap = null;
        if (a2 < 0) {
            return null;
        }
        DXTemplateItem dXTemplateItem2 = new DXTemplateItem();
        dXTemplateItem2.f11925a = dXTemplateItem.f11925a;
        dXTemplateItem2.b = a2;
        sb.append(fxb.DIR);
        sb.append(a2);
        String sb2 = sb.toString();
        String[] d = c.d(sb2);
        if (d != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : d) {
                hashMap2.put(str2, sb2 + fxb.DIR + str2);
            }
            String str3 = hashMap2.get(fxb.DX_MAIN_TEMPLATE_NAME);
            if (TextUtils.isEmpty(str3)) {
                return null;
            }
            hashMap2.remove(fxb.DX_MAIN_TEMPLATE_NAME);
            dXTemplateItem2.e = true;
            dXTemplateItem2.g = new f();
            f fVar = dXTemplateItem2.g;
            if (!hashMap2.isEmpty()) {
                hashMap = hashMap2;
            }
            fVar.b = hashMap;
            dXTemplateItem2.g.f11934a = str3;
        }
        return dXTemplateItem2;
    }

    public boolean a(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df0205f", new Object[]{this, str, dXTemplateItem})).booleanValue();
        }
        if (fxb.a(str, dXTemplateItem)) {
            String str2 = str + dXTemplateItem.b();
            synchronized (this.f) {
                int a2 = a(this.f.get(str2));
                if (a2 == -1) {
                    return false;
                }
                if (a2 == 0) {
                    Map<String, LinkedList<DXTemplateItem>> map = this.c.get(str);
                    if (map == null || map.get(dXTemplateItem.f11925a) == null) {
                        e(str, dXTemplateItem);
                    }
                    Map<String, LinkedList<DXTemplateItem>> map2 = this.c.get(str);
                    if (map2 != null) {
                        LinkedList<DXTemplateItem> linkedList = map2.get(dXTemplateItem.f11925a);
                        if (linkedList != null && !linkedList.isEmpty()) {
                            Iterator<DXTemplateItem> it = linkedList.iterator();
                            while (it.hasNext()) {
                                DXTemplateItem next = it.next();
                                if (next.b == dXTemplateItem.b) {
                                    if (next.e) {
                                        dXTemplateItem.e = true;
                                        this.f.put(str2, 2);
                                    } else {
                                        dXTemplateItem.e = false;
                                        this.f.put(str2, 1);
                                    }
                                    return true;
                                }
                            }
                            this.f.put(str2, -1);
                            return false;
                        }
                        this.f.put(str2, -1);
                        return false;
                    }
                    this.f.put(str2, -1);
                    return false;
                } else if (a2 == 1) {
                    dXTemplateItem.e = false;
                    return true;
                } else if (a2 == 2) {
                    dXTemplateItem.e = true;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dc8de0", new Object[]{this, str, dXTemplateItem})).booleanValue();
        }
        if (!fxb.a(str, dXTemplateItem)) {
            return false;
        }
        synchronized (this.b) {
            Map<String, Set<Long>> map = this.b.get(str);
            if (map == null) {
                return false;
            }
            Set<Long> set = map.get(dXTemplateItem.f11925a);
            if (set == null) {
                return false;
            }
            return set.contains(Long.valueOf(dXTemplateItem.b));
        }
    }

    public Set<Long> a(String str, long j, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("83c050b", new Object[]{this, str, new Long(j), str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        synchronized (this.d) {
            LinkedList<DXTemplateItem> linkedList = this.d.get(j).f28156a.get(str2);
            if (linkedList == null) {
                return null;
            }
            if (linkedList.size() == 0) {
                return null;
            }
            HashSet hashSet = new HashSet();
            Iterator<DXTemplateItem> it = linkedList.iterator();
            while (it.hasNext()) {
                DXTemplateItem next = it.next();
                if (next != null) {
                    hashSet.add(Long.valueOf(next.b));
                }
            }
            return hashSet;
        }
    }

    public DXTemplateItem a(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("9df9f2a4", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        if (f(str, j, dXTemplateItem)) {
            e(str, j, dXTemplateItem);
            synchronized (this.d) {
                LinkedList<DXTemplateItem> linkedList = this.d.get(j).f28156a.get(dXTemplateItem.f11925a);
                if (linkedList != null) {
                    if (linkedList.size() == 0) {
                        return null;
                    }
                    long j2 = -1;
                    Iterator<DXTemplateItem> descendingIterator = linkedList.descendingIterator();
                    while (descendingIterator.hasNext()) {
                        DXTemplateItem next = descendingIterator.next();
                        if (next.b != dXTemplateItem.b) {
                            if (next.e) {
                                j2 = next.b;
                            }
                            if (next.b >= dXTemplateItem.b) {
                                next = null;
                            } else if (next.b < j2) {
                                return null;
                            }
                        }
                        if (next != null && (dXTemplateItem.d == null || !dXTemplateItem.d.contains(String.valueOf(next.b)))) {
                            return next;
                        }
                    }
                }
            }
        }
        return null;
    }

    public DXTemplateItem g(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("f749dd2a", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        if (!f(str, j, dXTemplateItem)) {
            return null;
        }
        e(str, j, dXTemplateItem);
        synchronized (this.d) {
            Iterator<DXTemplateItem> descendingIterator = this.d.get(j).f28156a.get(dXTemplateItem.f11925a).descendingIterator();
            while (descendingIterator.hasNext()) {
                DXTemplateItem next = descendingIterator.next();
                if (next.e && next.b <= dXTemplateItem.b) {
                    return next;
                }
            }
            return null;
        }
    }

    public DXTemplateItem b(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("d7874465", new Object[]{this, str, new Long(j), dXTemplateItem});
        }
        if (f(str, j, dXTemplateItem)) {
            e(str, j, dXTemplateItem);
            synchronized (this.d) {
                Iterator<DXTemplateItem> descendingIterator = this.d.get(j).f28156a.get(dXTemplateItem.f11925a).descendingIterator();
                while (descendingIterator.hasNext()) {
                    DXTemplateItem next = descendingIterator.next();
                    if (next.b != dXTemplateItem.b && (!next.e || next.b >= dXTemplateItem.b)) {
                        next = null;
                    }
                    if (next != null && (dXTemplateItem.d == null || !dXTemplateItem.d.contains(String.valueOf(next.b)))) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    public void c(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc8fb5d", new Object[]{this, str, dXTemplateItem});
        } else {
            a(str, dXTemplateItem, true, false);
        }
    }

    public void a(String str, DXTemplateItem dXTemplateItem, boolean z, boolean z2) {
        LinkedList<DXTemplateItem> linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("927fd01b", new Object[]{this, str, dXTemplateItem, new Boolean(z), new Boolean(z2)});
        } else if (fxb.a(str, dXTemplateItem)) {
            synchronized (this.c) {
                Map<String, LinkedList<DXTemplateItem>> map = this.c.get(str);
                if (map == null || map.get(dXTemplateItem.f11925a) == null) {
                    e(str, dXTemplateItem);
                }
                Map<String, LinkedList<DXTemplateItem>> map2 = this.c.get(str);
                if (map2 != null) {
                    LinkedList<DXTemplateItem> linkedList2 = map2.get(dXTemplateItem.f11925a);
                    if (linkedList2 == null) {
                        map2.put(dXTemplateItem.f11925a, new LinkedList<>());
                    } else if (!z2) {
                        linkedList2.remove(dXTemplateItem);
                    } else {
                        Iterator<DXTemplateItem> it = linkedList2.iterator();
                        while (it.hasNext()) {
                            DXTemplateItem next = it.next();
                            if (next.f().equals(dXTemplateItem.f()) && next.g() == dXTemplateItem.b) {
                                it.remove();
                            }
                        }
                    }
                }
            }
            synchronized (this.f) {
                this.f.put(str + dXTemplateItem.b(), -1);
            }
            HashSet<Long> hashSet = null;
            synchronized (this.e) {
                Set<Long> set = this.e.get(str + dXTemplateItem.f11925a);
                if (set != null && !set.isEmpty()) {
                    hashSet = new HashSet(set);
                }
            }
            if (hashSet != null && !hashSet.isEmpty()) {
                synchronized (this.d) {
                    for (Long l : hashSet) {
                        a aVar = this.d.get(l.longValue());
                        if (aVar != null && (linkedList = aVar.f28156a.get(dXTemplateItem.f11925a)) != null) {
                            linkedList.remove(dXTemplateItem);
                        }
                    }
                }
            }
            if (!z) {
                return;
            }
            fwh.a().b(str, dXTemplateItem);
        }
    }

    public void c(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834bb239", new Object[]{this, str, new Long(j), dXTemplateItem});
        } else if (f(str, j, dXTemplateItem)) {
            synchronized (this.c) {
                Map<String, LinkedList<DXTemplateItem>> map = this.c.get(str);
                if (map == null || map.get(dXTemplateItem.f11925a) == null) {
                    e(str, dXTemplateItem);
                }
                Map<String, LinkedList<DXTemplateItem>> map2 = this.c.get(str);
                if (map2 != null) {
                    LinkedList<DXTemplateItem> linkedList = map2.get(dXTemplateItem.f11925a);
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                        map2.put(dXTemplateItem.f11925a, linkedList);
                    }
                    if (!a(linkedList, dXTemplateItem)) {
                        return;
                    }
                }
                synchronized (this.f) {
                    this.f.put(str + dXTemplateItem.b(), 1);
                }
                HashSet<Long> hashSet = null;
                synchronized (this.e) {
                    Set<Long> set = this.e.get(str + dXTemplateItem.f11925a);
                    if (set != null && !set.isEmpty()) {
                        hashSet = new HashSet(set);
                    }
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    return;
                }
                synchronized (this.d) {
                    for (Long l : hashSet) {
                        a aVar = this.d.get(l.longValue());
                        if (aVar != null) {
                            a(aVar.f28156a.get(dXTemplateItem.f11925a), dXTemplateItem);
                        }
                    }
                }
            }
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : fqi.D(str);
    }

    public void a(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        List<DXTemplateItem> b2 = b(str, list);
        if (b2 == null || b2.isEmpty()) {
            return;
        }
        if (!b(str)) {
            for (DXTemplateItem dXTemplateItem : b2) {
                a(str, dXTemplateItem, false, true);
            }
        }
        synchronized (this.b) {
            for (DXTemplateItem dXTemplateItem2 : b2) {
                Map<String, Set<Long>> map = this.b.get(str);
                if (map == null) {
                    map = new HashMap<>();
                    this.b.put(str, map);
                }
                Set<Long> set = map.get(dXTemplateItem2.f11925a);
                if (set == null) {
                    set = new HashSet<>();
                    map.put(dXTemplateItem2.f11925a, set);
                }
                set.add(Long.valueOf(dXTemplateItem2.b));
            }
        }
    }

    public List<DXTemplateItem> b(String str, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d997d163", new Object[]{this, str, list});
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (DXTemplateItem dXTemplateItem : list) {
            if (fxb.a(str, dXTemplateItem)) {
                arrayList.add(dXTemplateItem);
            }
        }
        return arrayList;
    }

    public synchronized int d(String str, long j, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8ecf4cb", new Object[]{this, str, new Long(j), dXTemplateItem})).intValue();
        }
        if (f(str, j, dXTemplateItem)) {
            e(str, j, dXTemplateItem);
            LinkedList<DXTemplateItem> linkedList = this.d.get(j).f28156a.get(dXTemplateItem.f11925a);
            int size = linkedList.size();
            Iterator<DXTemplateItem> descendingIterator = linkedList.descendingIterator();
            while (descendingIterator.hasNext()) {
                DXTemplateItem next = descendingIterator.next();
                if (dXTemplateItem.b == next.b) {
                    if (next.e) {
                        if (DinamicXEngine.j()) {
                            fuw.b("DXTemplateInfoManager", str + '|' + dXTemplateItem.f11925a + "内置被降级，无法再降级");
                        }
                        descendingIterator.remove();
                        return 2;
                    }
                    if (size == 1 && DinamicXEngine.j()) {
                        fuw.b("DXTemplateInfoManager", str + '|' + dXTemplateItem.f11925a + "无内置情况，无法再降级");
                    }
                    descendingIterator.remove();
                    return 1;
                }
            }
        }
        return 0;
    }

    public f d(String str, DXTemplateItem dXTemplateItem) {
        LinkedList<DXTemplateItem> linkedList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("1716d68e", new Object[]{this, str, dXTemplateItem});
        }
        if (fxb.a(str, dXTemplateItem)) {
            synchronized (this.c) {
                Map<String, LinkedList<DXTemplateItem>> map = this.c.get(str);
                if (map == null || map.get(dXTemplateItem.f11925a) == null) {
                    e(str, dXTemplateItem);
                }
                Map<String, LinkedList<DXTemplateItem>> map2 = this.c.get(str);
                if (map2 != null && (linkedList = map2.get(dXTemplateItem.f11925a)) != null) {
                    if (linkedList.size() == 0) {
                        return null;
                    }
                    Iterator<DXTemplateItem> descendingIterator = linkedList.descendingIterator();
                    while (descendingIterator.hasNext()) {
                        DXTemplateItem next = descendingIterator.next();
                        if (next.b == dXTemplateItem.b) {
                            return next.g;
                        }
                    }
                }
            }
        }
        return null;
    }

    public boolean a(LinkedList<DXTemplateItem> linkedList, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa23d6d", new Object[]{this, linkedList, dXTemplateItem})).booleanValue();
        }
        if (linkedList == null || dXTemplateItem == null) {
            return false;
        }
        long j = dXTemplateItem.b;
        int size = linkedList.size();
        if (size == 0) {
            linkedList.add(dXTemplateItem);
            return true;
        } else if (linkedList.getLast() != null && j > linkedList.getLast().b) {
            linkedList.add(dXTemplateItem);
            return true;
        } else {
            Iterator<DXTemplateItem> descendingIterator = linkedList.descendingIterator();
            descendingIterator.next();
            int i = size - 2;
            while (descendingIterator.hasNext()) {
                if (descendingIterator.next().b < j) {
                    linkedList.add(i + 1, dXTemplateItem);
                    return true;
                }
                i--;
            }
            linkedList.addFirst(dXTemplateItem);
            return true;
        }
    }
}
