package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.augecore.data.GroupData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class kay {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public CopyOnWriteArrayList<String> f29931a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private CopyOnWriteArrayList<HashMap> g;
    private CopyOnWriteArrayList<HashMap> h;
    private Map<String, String> i;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static kay f29941a = new kay();

        public static /* synthetic */ kay a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (kay) ipChange.ipc$dispatch("f06c39b", new Object[0]) : f29941a;
        }
    }

    public static /* synthetic */ void a(kay kayVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ba6215", new Object[]{kayVar});
        } else {
            kayVar.c();
        }
    }

    public static /* synthetic */ void a(kay kayVar, String str, List list, String str2, kaz kazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d63d66", new Object[]{kayVar, str, list, str2, kazVar});
        } else {
            kayVar.a(str, list, str2, kazVar);
        }
    }

    public static /* synthetic */ void a(kay kayVar, String str, List list, List list2, kaz kazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9cf2d8d", new Object[]{kayVar, str, list, list2, kazVar});
        } else {
            kayVar.a(str, list, list2, kazVar);
        }
    }

    public static /* synthetic */ Map b(kay kayVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2fe9bc4b", new Object[]{kayVar}) : kayVar.i;
    }

    public static kay a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kay) ipChange.ipc$dispatch("f06c39b", new Object[0]) : a.a();
    }

    private kay() {
        this.b = "groupId";
        this.c = "configGetListner";
        this.d = "token";
        this.e = "bizCode";
        this.f = "crowdListIn";
        this.f29931a = new CopyOnWriteArrayList<>();
        this.g = new CopyOnWriteArrayList<>();
        this.h = new CopyOnWriteArrayList<>();
        this.i = new ConcurrentHashMap();
    }

    public boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{this, str, str2, str3})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            kbd.a(kaw.LOG_TAG, "bizCode或者crowdId为空了");
            return false;
        }
        kbc.b(str);
        Map<String, String> map = this.i;
        if (map == null || map.size() == 0) {
            if (!b()) {
                Coordinator.execute(new Runnable() { // from class: tb.kay.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            kay.a(kay.this);
                        }
                    }
                });
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str2, "false");
            kbe.a(kbe.SYN_CHECK_SUCCESS, str, hashMap);
            return false;
        } else if (this.i.containsKey(str2)) {
            Coordinator.execute(new Runnable() { // from class: tb.kay.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Set<Map.Entry> entrySet = kay.b(kay.this).entrySet();
                    if (entrySet.size() <= 0) {
                        return;
                    }
                    for (Map.Entry entry : entrySet) {
                        if (kbc.a((String) entry.getValue())) {
                            kay.a(kay.this);
                        }
                    }
                }
            });
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str2, "true");
            kbe.a(kbe.SYN_CHECK_SUCCESS, str, hashMap2);
            return true;
        } else {
            Coordinator.execute(new Runnable() { // from class: tb.kay.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!kbc.a(kbc.a())) {
                    } else {
                        kay.a(kay.this);
                    }
                }
            });
            HashMap hashMap3 = new HashMap();
            hashMap3.put(str2, "false");
            kbe.a(kbe.SYN_CHECK_SUCCESS, str, hashMap3);
            return false;
        }
    }

    public List<String> a(String str, final List<String> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1f4ad67a", new Object[]{this, str, list, str2});
        }
        final ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0 && !TextUtils.isEmpty(str2)) {
            kbc.b(str);
            Map<String, String> map = this.i;
            if (map == null || map.size() == 0) {
                Coordinator.execute(new Runnable() { // from class: tb.kay.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            kay.a(kay.this);
                        }
                    }
                });
                kbe.a(kbe.SYN_CHECK_SUCCESS, str, list, arrayList);
            } else {
                final Set<String> keySet = this.i.keySet();
                for (String str3 : list) {
                    for (String str4 : keySet) {
                        if (TextUtils.equals(str3, str4)) {
                            arrayList.add(str3);
                        }
                    }
                }
                Coordinator.execute(new Runnable() { // from class: tb.kay.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (arrayList.size() != list.size()) {
                            if (!kbc.a(kbc.a())) {
                                return;
                            }
                            kay.a(kay.this);
                        } else {
                            for (String str5 : keySet) {
                                if (kbc.a((String) kay.b(kay.this).get(str5))) {
                                    kay.a(kay.this);
                                }
                            }
                        }
                    }
                });
                kbe.a(kbe.SYN_CHECK_SUCCESS, str, list, arrayList);
                return arrayList;
            }
        }
        return arrayList;
    }

    public void a(String str, String str2, kaz kazVar, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6173fb52", new Object[]{this, str, str2, kazVar, str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || kazVar == null || TextUtils.isEmpty(str3)) {
            kbd.a(kaw.LOG_TAG, "groupId或者configGetListner空了");
        } else {
            kbc.b(str);
            List<GroupData> b = kax.b(kbb.GROUP_DATA);
            String a2 = kbc.a();
            if (!b()) {
                kbd.a(kaw.LOG_TAG, "本地数据为空，需要请求接口获取数据");
                b(str, str2, kazVar, str3);
                return;
            }
            Iterator<GroupData> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                GroupData next = it.next();
                String crowd = next.getCrowd();
                String expireTime = next.getExpireTime();
                if (TextUtils.equals(crowd, str2)) {
                    if (kbc.a(expireTime)) {
                        kbd.a(kaw.LOG_TAG, "请求GroupId在本地人群里面，但是数据过期，需要重新请求接口");
                        b(str, str2, kazVar, str3);
                    } else {
                        kazVar.a(true);
                        HashMap hashMap = new HashMap();
                        hashMap.put(str2, "true");
                        kbe.a(kbe.ASYN_CHECK_SUCCESS, str, hashMap);
                        kbd.a(kaw.LOG_TAG, "请求GroupId在本地人群里面,返回结果：true");
                    }
                }
            }
            if (z) {
                return;
            }
            if (kbc.a(a2)) {
                kbd.a(kaw.LOG_TAG, "人群不在本地，但是数据过期，需要重新请求接口");
                b(str, str2, kazVar, str3);
                return;
            }
            kazVar.a(false);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str2, "false");
            kbe.a(kbe.ASYN_CHECK_SUCCESS, str, hashMap2);
        }
    }

    public void a(String str, List<String> list, kaz kazVar, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535d039", new Object[]{this, str, list, kazVar, str2});
        } else if (kazVar == null) {
            kbd.a(kaw.LOG_TAG, "configGetListner 空了");
        } else if (TextUtils.isEmpty(str) || list == null || list.size() == 0 || TextUtils.isEmpty(str2)) {
            kazVar.a((List<String>) null);
            kbd.a(kaw.LOG_TAG, "传入的人群id集合  空了");
        } else {
            kbc.b(str);
            ArrayList arrayList = new ArrayList();
            if (!b()) {
                kbd.a(kaw.LOG_TAG, "本地数据为空，需要请求接口");
                b(str, list, kazVar, str2);
                return;
            }
            List<GroupData> b = kax.b(kbb.GROUP_DATA);
            String a2 = kbc.a();
            for (String str3 : list) {
                if (a(str3, b)) {
                    if (b(str3, b)) {
                        b(str, list, kazVar, str2);
                        kbd.a(kaw.LOG_TAG, "本地数据过期，需要请求接口，重新拉取数据");
                        z = true;
                    } else {
                        arrayList.add(str3);
                    }
                } else if (kbc.a(a2)) {
                    b(str, list, kazVar, str2);
                    z = true;
                }
            }
            if (z) {
                return;
            }
            kazVar.a(arrayList);
            kbe.a(kbe.ASYN_CHECK_SUCCESS, str, list, arrayList);
        }
    }

    private void b(final String str, final String str2, final kaz kazVar, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d357713", new Object[]{this, str, str2, kazVar, str3});
        } else if (kbb.a().b) {
            HashMap hashMap = new HashMap();
            hashMap.put("groupId", str2);
            hashMap.put("configGetListner", kazVar);
            hashMap.put("token", str3);
            hashMap.put("bizCode", str);
            this.g.add(hashMap);
        } else {
            kbb.a().a(new kba() { // from class: tb.kay.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kba
                public void a(List<GroupData> list, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str4});
                        return;
                    }
                    kay.a(kay.this, str, list, str2, kazVar);
                    kay.this.a(list);
                }
            });
        }
    }

    private void b(final String str, final List<String> list, final kaz kazVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52f5483a", new Object[]{this, str, list, kazVar, str2});
        } else if (kbb.a().b) {
            HashMap hashMap = new HashMap();
            hashMap.put("crowdListIn", list);
            hashMap.put("configGetListner", kazVar);
            hashMap.put("token", str2);
            hashMap.put("bizCode", str);
            this.h.add(hashMap);
        } else {
            kbb.a().a(new kba() { // from class: tb.kay.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kba
                public void a(List<GroupData> list2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c6e0ee3", new Object[]{this, list2, str3});
                        return;
                    }
                    kay.a(kay.this, str, list2, list, kazVar);
                    kay.this.a(list2);
                }
            });
        }
    }

    public void a(List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        if (this.f29931a.size() > 0) {
            kbb.a().a(new kba() { // from class: tb.kay.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kba
                public void a(List<GroupData> list2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c6e0ee3", new Object[]{this, list2, str});
                    } else {
                        kay.this.f29931a.clear();
                    }
                }
            });
        }
        Iterator<HashMap> it = this.g.iterator();
        while (it.hasNext()) {
            HashMap next = it.next();
            if (next != null) {
                String str = (String) next.get("groupId");
                next.get("token");
                a((String) next.get("bizCode"), list, str, (kaz) next.get("configGetListner"));
            }
        }
        this.g.clear();
        Iterator<HashMap> it2 = this.h.iterator();
        while (it2.hasNext()) {
            HashMap next2 = it2.next();
            if (next2 != null) {
                List<String> list2 = (List) next2.get("crowdListIn");
                next2.get("token");
                a((String) next2.get("bizCode"), list, list2, (kaz) next2.get("configGetListner"));
            }
        }
        this.h.clear();
    }

    private static boolean a(String str, List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1aa3527", new Object[]{str, list})).booleanValue();
        }
        for (GroupData groupData : list) {
            if (groupData != null && TextUtils.equals(groupData.getCrowd(), str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(String str, List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aab2c68", new Object[]{str, list})).booleanValue();
        }
        for (GroupData groupData : list) {
            if (groupData != null) {
                String expireTime = groupData.getExpireTime();
                if (TextUtils.equals(groupData.getCrowd(), str) && kbc.a(expireTime)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static List<String> a(List<GroupData> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66db90bd", new Object[]{list, list2});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0 && list2 != null && list2.size() != 0) {
            for (String str : list2) {
                for (GroupData groupData : list) {
                    String crowd = groupData.getCrowd();
                    if (crowd != null && TextUtils.equals(crowd, str)) {
                        arrayList.add(crowd);
                    }
                }
            }
        }
        return arrayList;
    }

    public void a(List<GroupData> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        kax.a(kbb.GROUP_DATA, list);
        kax.a(kbb.GROUP_DATA_EXPIRE_TIME, str);
    }

    public static boolean b(List<GroupData> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f0628", new Object[]{list, str})).booleanValue();
        }
        if (list == null || list.size() == 0 || str == null) {
            return false;
        }
        for (GroupData groupData : list) {
            if (groupData != null && TextUtils.equals(str, groupData.getCrowd())) {
                return true;
            }
        }
        return false;
    }

    private void a(String str, List<GroupData> list, String str2, kaz kazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df05139", new Object[]{this, str, list, str2, kazVar});
            return;
        }
        boolean b = b(list, str2);
        kazVar.a(b);
        HashMap hashMap = new HashMap();
        hashMap.put(str2, b + "");
        kbe.a(kbe.ASYN_CHECK_SUCCESS, str, hashMap);
    }

    private void a(String str, List<GroupData> list, List<String> list2, kaz kazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f21a20", new Object[]{this, str, list, list2, kazVar});
            return;
        }
        List<String> a2 = a(list, list2);
        kazVar.a(a2);
        kbe.a(kbe.ASYN_CHECK_SUCCESS, str, list2, a2);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            kbb.a().a(new kba() { // from class: tb.kay.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.kba
                public void a(List<GroupData> list, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
                    } else {
                        kay.a().a(list);
                    }
                }
            });
        }
    }

    public void b(List<GroupData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        Map<String, String> map = this.i;
        if (map == null) {
            return;
        }
        map.clear();
        if (list == null) {
            return;
        }
        for (GroupData groupData : list) {
            if (groupData != null) {
                this.i.put(groupData.getCrowd(), groupData.getExpireTime());
            }
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!kbc.a(kax.b(kbb.GROUP_DATA_EXPIRE_TIME, "0"))) {
            return true;
        }
        kbd.a(kaw.LOG_TAG, "对比外层过期时间，过期，重新拉取数据");
        return false;
    }
}
