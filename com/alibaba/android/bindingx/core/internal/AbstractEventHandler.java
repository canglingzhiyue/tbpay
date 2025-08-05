package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.bindingx.core.BindingXJSFunctionRegister;
import com.alibaba.android.bindingx.core.BindingXPropertyInterceptor;
import com.alibaba.android.bindingx.core.d;
import com.alibaba.android.bindingx.core.i;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public abstract class AbstractEventHandler implements com.alibaba.android.bindingx.core.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile Map<String, List<k>> f2232a;
    public volatile Map<String, l> b;
    public d.a c;
    public String e;
    public String f;
    public String g;
    public WeakReference<Context> h;
    public com.alibaba.android.bindingx.core.i i;
    public com.alibaba.android.bindingx.core.g j;
    public volatile l k;
    public Object[] l;
    public Map<String, Object> m;
    public final Map<String, Object> d = new HashMap(64);
    private Cache<String, j> n = new Cache<>(16);

    static {
        kge.a(-1801247505);
        kge.a(-913448860);
    }

    public abstract void a(String str, Map<String, Object> map);

    @Override // com.alibaba.android.bindingx.core.e
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        }
    }

    public abstract void d(Map<String, Object> map);

    public AbstractEventHandler(Context context, com.alibaba.android.bindingx.core.i iVar, Object... objArr) {
        this.h = new WeakReference<>(context);
        this.i = iVar;
        this.e = (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof String)) ? null : (String) objArr[0];
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map == null || map.isEmpty()) {
            this.m = Collections.emptyMap();
        } else {
            this.m = map;
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void a(String str, Map<String, Object> map, l lVar, List<Map<String, Object>> list, d.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d9171", new Object[]{this, str, map, lVar, list, aVar});
            return;
        }
        d();
        a(str, list);
        this.c = aVar;
        this.k = lVar;
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
        e();
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.n.clear();
        BindingXPropertyInterceptor.getInstance().clearCallbacks();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Map<String, m> jSFunctions = BindingXJSFunctionRegister.getInstance().getJSFunctions();
        if (jSFunctions == null || jSFunctions.isEmpty()) {
            return;
        }
        this.d.putAll(jSFunctions);
    }

    private void a(String str, List<Map<String, Object>> list) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        if (this.f2232a == null) {
            this.f2232a = new HashMap();
        }
        for (Map<String, Object> map2 : list) {
            String a2 = w.a(map2, BindingXConstants.KEY_ELEMENT);
            String a3 = w.a(map2, "instanceId");
            String a4 = w.a(map2, "property");
            l b = w.b(map2, "expression");
            Object obj = map2.get("config");
            if (obj != null && (obj instanceof Map)) {
                try {
                    map = w.a(new JSONObject((Map) obj));
                } catch (Exception e) {
                    com.alibaba.android.bindingx.core.h.a("parse config failed", e);
                }
                if (!TextUtils.isEmpty(a2) || TextUtils.isEmpty(a4) || b == null) {
                    com.alibaba.android.bindingx.core.h.d("skip illegal binding args[" + a2 + "," + a4 + "," + b + riy.ARRAY_END_STR);
                } else {
                    k kVar = new k(a2, a3, b, a4, str, map);
                    List<k> list2 = this.f2232a.get(a2);
                    if (list2 == null) {
                        ArrayList arrayList = new ArrayList(4);
                        this.f2232a.put(a2, arrayList);
                        arrayList.add(kVar);
                    } else if (!list2.contains(kVar)) {
                        list2.add(kVar);
                    }
                }
            }
            map = null;
            if (!TextUtils.isEmpty(a2)) {
            }
            com.alibaba.android.bindingx.core.h.d("skip illegal binding args[" + a2 + "," + a4 + "," + b + riy.ARRAY_END_STR);
        }
    }

    public boolean a(l lVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e227bf61", new Object[]{this, lVar, map})).booleanValue();
        }
        if (l.a(lVar)) {
            j a2 = j.a(lVar);
            if (a2 == null) {
                return false;
            }
            try {
                z = ((Boolean) a2.a(map)).booleanValue();
            } catch (Exception e) {
                com.alibaba.android.bindingx.core.h.a("evaluateExitExpression failed. ", e);
            }
        }
        if (z) {
            d();
            try {
                d(map);
            } catch (Exception e2) {
                com.alibaba.android.bindingx.core.h.a("execute exit expression failed: ", e2);
            }
            com.alibaba.android.bindingx.core.h.b("exit = true,consume finished");
        }
        return z;
    }

    @Override // com.alibaba.android.bindingx.core.f
    public void c(Map<String, l> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public void a(String str, l lVar, Map<String, Object> map) {
        j a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0e53d3", new Object[]{this, str, lVar, map});
        } else if (!l.a(lVar) || (a2 = j.a(lVar)) == null) {
        } else {
            try {
                z = ((Boolean) a2.a(map)).booleanValue();
            } catch (Exception e) {
                com.alibaba.android.bindingx.core.h.a("evaluate interceptor [" + str + "] expression failed. ", e);
            }
            if (!z) {
                return;
            }
            a(str, map);
        }
    }

    private void e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{this, map});
        } else if (this.b != null && !this.b.isEmpty()) {
            for (Map.Entry<String, l> entry : this.b.entrySet()) {
                String key = entry.getKey();
                l value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    a(key, value, map);
                }
            }
        }
    }

    public void a(Map<String, List<k>> map, Map<String, Object> map2, String str) throws IllegalArgumentException, JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25c7392", new Object[]{this, map, map2, str});
            return;
        }
        e(map2);
        if (map == null) {
            com.alibaba.android.bindingx.core.h.d("expression args is null");
        } else if (map.isEmpty()) {
            com.alibaba.android.bindingx.core.h.d("no expression need consumed");
        } else {
            if (com.alibaba.android.bindingx.core.h.f2229a) {
                com.alibaba.android.bindingx.core.h.b(String.format(Locale.getDefault(), "consume expression with %d tasks. event type is %s", Integer.valueOf(map.size()), str));
            }
            c(map, map2, str);
        }
    }

    private void c(Map<String, List<k>> map, Map<String, Object> map2, String str) throws JSONException {
        Map<String, Object> map3 = map2;
        IpChange ipChange = $ipChange;
        int i = 2;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcd1d694", new Object[]{this, map, map3, str});
            return;
        }
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList(map.values());
        int i2 = 0;
        while (i2 < arrayList.size()) {
            List list = (List) arrayList.get(i2);
            int i3 = 0;
            while (i3 < list.size()) {
                k kVar = (k) list.get(i3);
                if (!str.equals(kVar.e)) {
                    com.alibaba.android.bindingx.core.h.b("skip expression with wrong event type.[expected:" + str + ",found:" + kVar.e + riy.ARRAY_END_STR);
                } else {
                    linkedList.clear();
                    Object[] objArr = this.l;
                    if (objArr != null && objArr.length > 0) {
                        Collections.addAll(linkedList, objArr);
                    }
                    String str2 = TextUtils.isEmpty(kVar.b) ? this.e : kVar.b;
                    if (!TextUtils.isEmpty(str2)) {
                        linkedList.add(str2);
                    }
                    l lVar = kVar.c;
                    if (l.a(lVar)) {
                        j jVar = this.n.get(lVar.b);
                        if (jVar == null) {
                            jVar = j.a(lVar);
                            if (jVar != null) {
                                if (!TextUtils.isEmpty(lVar.b)) {
                                    this.n.put(lVar.b, jVar);
                                }
                            }
                        }
                        Object a2 = jVar.a(map3);
                        if (a2 == null) {
                            com.alibaba.android.bindingx.core.h.d("failed to execute expression,expression result is null");
                        } else if (((a2 instanceof Double) && Double.isNaN(((Double) a2).doubleValue())) || ((a2 instanceof Float) && Float.isNaN(((Float) a2).floatValue()))) {
                            com.alibaba.android.bindingx.core.h.d("failed to execute expression,expression result is NaN");
                        } else {
                            View a3 = this.i.b().a(kVar.f2241a, linkedList.toArray());
                            BindingXPropertyInterceptor bindingXPropertyInterceptor = BindingXPropertyInterceptor.getInstance();
                            String str3 = kVar.d;
                            i.b a4 = this.i.a();
                            Map<String, Object> map4 = kVar.f;
                            Object[] objArr2 = new Object[i];
                            objArr2[0] = kVar.f2241a;
                            objArr2[1] = str2;
                            bindingXPropertyInterceptor.performIntercept(a3, str3, a2, a4, map4, objArr2);
                            if (a3 == null) {
                                com.alibaba.android.bindingx.core.h.d("failed to execute expression,target view not found.[ref:" + kVar.f2241a + riy.ARRAY_END_STR);
                            } else {
                                this.i.c().a(a3, kVar.d, a2, this.i.a(), kVar.f, kVar.f2241a, str2);
                                i3++;
                                map3 = map2;
                                i = 2;
                            }
                        }
                    }
                }
                i3++;
                map3 = map2;
                i = 2;
            }
            i2++;
            map3 = map2;
            i = 2;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.alibaba.android.bindingx.core.h.b("all expression are cleared");
        if (this.f2232a != null) {
            this.f2232a.clear();
            this.f2232a = null;
        }
        this.k = null;
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else {
            this.l = objArr;
        }
    }

    @Override // com.alibaba.android.bindingx.core.e
    public void a(com.alibaba.android.bindingx.core.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a97787", new Object[]{this, gVar});
        } else {
            this.j = gVar;
        }
    }

    /* loaded from: classes2.dex */
    public static class Cache<K, V> extends LinkedHashMap<K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int maxSize;

        static {
            kge.a(1391831917);
        }

        public Cache(int i) {
            super(4, 0.75f, true);
            this.maxSize = Math.max(i, 4);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > this.maxSize;
        }
    }
}
