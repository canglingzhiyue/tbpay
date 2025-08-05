package com.taobao.tao.topmultitab;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.home.component.utils.j;
import com.taobao.tao.Globals;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.view.HomeViewPager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.ldf;
import tb.sqg;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final com.taobao.tao.topmultitab.protocol.c f21154a;
    private final List<String> b = new CopyOnWriteArrayList();
    private boolean c;

    static {
        kge.a(-1186199171);
    }

    public d(com.taobao.tao.topmultitab.protocol.c cVar) {
        this.f21154a = cVar;
        this.b.add("campaign");
        this.b.add(c.HOME_TAB_ID_HOUR_DELIVERY);
    }

    public void a(JSONObject jSONObject, HomeViewPager homeViewPager, com.taobao.tao.topmultitab.view.a aVar, ConcurrentMap<String, IHomeSubTabController> concurrentMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b9db1a8", new Object[]{this, jSONObject, homeViewPager, aVar, concurrentMap});
        } else if (!a(jSONObject, homeViewPager, aVar)) {
        } else {
            ldf.d("TabChangeObserver", "updateHomeTabs");
            List<JSONObject> a2 = aVar.a();
            List<JSONObject> b = sqg.b(jSONObject);
            if (c(a2, b)) {
                a(a2, b, concurrentMap);
                List<JSONObject> a3 = a(jSONObject);
                a(a3);
                a(a2, a3, homeViewPager, aVar);
            } else {
                com.taobao.android.home.component.utils.e.e("TabChangeObserver", "tab类型没有变化");
                Map<Integer, String> b2 = b(a2, b);
                if (!b2.isEmpty()) {
                    a(b2, homeViewPager, aVar, b);
                }
            }
            this.c = l.d(Globals.getApplication());
        }
    }

    private boolean a(JSONObject jSONObject, HomeViewPager homeViewPager, com.taobao.tao.topmultitab.view.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c846a48a", new Object[]{this, jSONObject, homeViewPager, aVar})).booleanValue();
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "tabItems == null");
            return false;
        } else if (homeViewPager == null) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "viewPager == null");
            return false;
        } else if (aVar != null) {
            return true;
        } else {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "viewPagerAdapter == null");
            return false;
        }
    }

    private void a(List<JSONObject> list, List<JSONObject> list2, ConcurrentMap<String, IHomeSubTabController> concurrentMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f15f6c", new Object[]{this, list, list2, concurrentMap});
        } else if (list.size() < list2.size()) {
            a(list2, concurrentMap);
        } else if (list.size() > list2.size()) {
            b(list2, concurrentMap);
        } else {
            a(list2, list);
        }
    }

    private List<JSONObject> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3f6755bf", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : new TreeMap(jSONObject).entrySet()) {
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            if (d(jSONObject2)) {
                arrayList.add(jSONObject2);
            }
        }
        return arrayList;
    }

    private void a(List<JSONObject> list, List<JSONObject> list2, HomeViewPager homeViewPager, com.taobao.tao.topmultitab.view.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca090c8", new Object[]{this, list, list2, homeViewPager, aVar});
        } else if (!c(list, list2)) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "tab没有变化，不需要重新设置adapter");
        } else {
            d(list, list2);
            a(aVar, list2, homeViewPager, false);
            aVar.a(aVar.b);
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "tab变化了，选中默认type：" + aVar.b);
            c.a().g(aVar.b);
            e.a(list2);
        }
    }

    private void d(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42875ecd", new Object[]{this, list, list2});
            return;
        }
        if (c.a().c("campaign") != null || !j.a("fixSearchBarDataEnable", true)) {
            z = false;
        }
        if (list.isEmpty() || !z) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "首次创建 不需要处理");
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            String a2 = com.taobao.tao.topmultitab.view.a.a(list2.get(i));
            if (TextUtils.equals("campaign", a2)) {
                a(a2);
                b(a2);
                com.taobao.android.home.component.utils.e.e("TabChangeObserver", "tab变化了，其中还有会场，需要重新创建会场");
                return;
            }
        }
    }

    private void a(Map<Integer, String> map, HomeViewPager homeViewPager, com.taobao.tao.topmultitab.view.a aVar, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e9f6ecc", new Object[]{this, map, homeViewPager, aVar, list});
            return;
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            int intValue = entry.getKey().intValue();
            int y = c.a().y();
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "重建tab,类型是: " + value + "当前的index: " + y + "重建的index是：" + intValue);
            if (y == intValue) {
                a(value, aVar, list, y);
            } else {
                a(value, homeViewPager, aVar, list, y);
            }
        }
    }

    private void a(List<JSONObject> list, ConcurrentMap<String, IHomeSubTabController> concurrentMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbd88fb", new Object[]{this, list, concurrentMap});
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = com.taobao.tao.topmultitab.view.a.a(list.get(i));
            if (!TextUtils.isEmpty(a2) && !concurrentMap.containsKey(a2)) {
                com.taobao.android.home.component.utils.e.e("TabChangeObserver", "准备注册新的tab: " + a2);
                b(a2);
            }
        }
    }

    private void b(List<JSONObject> list, ConcurrentMap<String, IHomeSubTabController> concurrentMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("455191fc", new Object[]{this, list, concurrentMap});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : new TreeMap(concurrentMap).entrySet()) {
            arrayList.add(entry.getKey());
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = com.taobao.tao.topmultitab.view.a.a(list.get(i));
            if (!TextUtils.isEmpty(a2) && concurrentMap.containsKey(a2)) {
                arrayList.remove(a2);
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str = (String) arrayList.get(i2);
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "准备销毁老的tab: " + str);
            a(str);
        }
    }

    private void a(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = com.taobao.tao.topmultitab.view.a.a(list.get(i));
            String a3 = com.taobao.tao.topmultitab.view.a.a(list2.get(i));
            if (!TextUtils.equals(a2, a3)) {
                com.taobao.android.home.component.utils.e.e("TabChangeObserver", "准备替换新的tab: " + a2);
                b(a2);
                a(a3);
            }
        }
    }

    private void a(String str, com.taobao.tao.topmultitab.view.a aVar, List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ecd038", new Object[]{this, str, aVar, list, new Integer(i)});
            return;
        }
        IHomeSubTabController c = c.a().c(str);
        if (c == null) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "通知页面刷新失败，homeSubTabController == null");
            return;
        }
        aVar.b(list);
        c.a().a(i, c.a().a(c), "reload");
        a(c, i);
        c.notifyRefreshPage();
        com.taobao.android.home.component.utils.e.e("TabChangeObserver", "通知页面刷新");
    }

    private void a(IHomeSubTabController iHomeSubTabController, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d81baa", new Object[]{this, iHomeSubTabController, new Integer(i)});
            return;
        }
        c.a().Y();
        c.a().a(iHomeSubTabController, i);
        c.a().f(iHomeSubTabController);
    }

    private void a(String str, HomeViewPager homeViewPager, com.taobao.tao.topmultitab.view.a aVar, List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("688c2b82", new Object[]{this, str, homeViewPager, aVar, list, new Integer(i)});
        } else if (list.size() < i) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "当前的index大于新的list的大小");
        } else {
            a(str);
            b(str);
            JSONObject jSONObject = list.get(i);
            a(aVar, list, homeViewPager, true);
            String a2 = com.taobao.tao.topmultitab.view.a.a(jSONObject);
            aVar.a(a2);
            e.a(jSONObject);
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "重建controller,通知viewPagerAdapter更新数据,当前选中的type是：" + a2);
        }
    }

    private void a(com.taobao.tao.topmultitab.view.a aVar, List<JSONObject> list, HomeViewPager homeViewPager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91dd03db", new Object[]{this, aVar, list, homeViewPager, new Boolean(z)});
            return;
        }
        aVar.a(list, z);
        homeViewPager.setAdapter(aVar);
        com.taobao.android.home.component.utils.e.e("TabChangeObserver", "重新设置viewPagerAdapter");
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || !this.b.contains(str)) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "不是动态创建的容器，不销毁");
        } else {
            IHomeSubTabController c = c.a().c(str);
            if (c == null) {
                return;
            }
            c.onDestroy();
            c.a().d(str);
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "销毁controller,类型是" + str);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || !this.b.contains(str)) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "不是动态创建的容器，不重建");
        } else {
            IHomeSubTabController c = c(str);
            if (c == null) {
                return;
            }
            c.a().a(str, c);
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "注册controller,类型是" + str);
        }
    }

    private Map<Integer, String> b(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e9acac0", new Object[]{this, list, list2});
        }
        HashMap hashMap = new HashMap();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (!TextUtils.equals(c(list2.get(i)), c(list.get(i)))) {
                hashMap.put(Integer.valueOf(i), com.taobao.tao.topmultitab.view.a.a(list2.get(i)));
            }
        }
        com.taobao.android.home.component.utils.e.e("TabChangeObserver", "md5改变的容器type有: " + hashMap.size() + "个");
        return hashMap;
    }

    private String c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6871249a", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "item == null");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
        if (jSONObject2 == null) {
            com.taobao.android.home.component.utils.e.e("TabChangeObserver", "content == null");
            return null;
        }
        String string = jSONObject2.getString("dynamicTabVersionMd5");
        com.taobao.android.home.component.utils.e.e("TabChangeObserver", "tabBar3VersionMd5: " + string);
        return string;
    }

    private IHomeSubTabController c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("92a9bfc5", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -139919088) {
            if (hashCode == 1463130501 && str.equals(c.HOME_TAB_ID_HOUR_DELIVERY)) {
                c = 1;
            }
        } else if (str.equals("campaign")) {
            c = 0;
        }
        if (c == 0) {
            return new com.taobao.infoflow.a(this.f21154a, "campaign");
        }
        if (c == 1) {
            return new com.taobao.android.detail.industry.hourlydelivery.c(this.f21154a);
        }
        return null;
    }

    private boolean c(List<JSONObject> list, List<JSONObject> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2edf8b50", new Object[]{this, list, list2})).booleanValue();
        }
        if (list.size() != list2.size()) {
            return true;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (!TextUtils.equals(com.taobao.tao.topmultitab.view.a.a(list2.get(i)), com.taobao.tao.topmultitab.view.a.a(list.get(i)))) {
                return true;
            }
        }
        return list.size() == list2.size() && l.d(Globals.getApplication()) != this.c;
    }

    private boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{this, jSONObject})).booleanValue() : c.a().b(com.taobao.tao.topmultitab.view.a.a(jSONObject)) != null;
    }

    private void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        for (JSONObject jSONObject : list) {
            String a2 = com.taobao.tao.topmultitab.view.a.a(jSONObject);
            JSONObject e = e(jSONObject);
            if (!TextUtils.isEmpty(a2)) {
                com.taobao.homepage.utils.c.a(a2, e);
            }
        }
    }

    private JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(c.ATTR_EX_CONTENT);
        if (jSONObject2 == null) {
            return null;
        }
        return jSONObject2.getJSONObject(c.ATTR_SUB_CONTAINER_PARAMS);
    }
}
