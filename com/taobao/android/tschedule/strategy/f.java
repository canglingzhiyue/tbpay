package com.taobao.android.tschedule.strategy;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jkq;
import tb.kge;

/* loaded from: classes6.dex */
public class f implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<k>> f15671a = new ConcurrentHashMap();
    private SharedPreferences b;

    static {
        kge.a(-884914716);
        kge.a(1861214628);
    }

    @Override // com.taobao.android.tschedule.strategy.e
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.b = context.getSharedPreferences("tschedule_history", 0);
        String string = this.b.getString("history", null);
        if (string == null || string.length() <= 0) {
            return;
        }
        this.f15671a.putAll(c(string));
    }

    @Override // com.taobao.android.tschedule.strategy.e
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f15671a.containsKey(str) ? this.f15671a.size() > 1 : this.f15671a.size() > 0;
    }

    @Override // com.taobao.android.tschedule.strategy.e
    public List<k> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        if (this.f15671a.containsKey(str)) {
            return this.f15671a.get(str);
        }
        return Collections.emptyList();
    }

    @Override // com.taobao.android.tschedule.strategy.e
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        String a2 = g.a();
        k a3 = k.a(str2, str);
        if (this.f15671a.containsKey(a2)) {
            List<k> list = this.f15671a.get(a2);
            if (list != null) {
                int indexOf = list.indexOf(a3);
                if (indexOf == -1) {
                    list.add(a3);
                } else {
                    list.get(indexOf).b++;
                }
            } else {
                list = new ArrayList<>();
                list.add(a3);
            }
            this.f15671a.put(a2, list);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(a3);
            this.f15671a.put(a2, arrayList);
        }
        this.b.edit().putString("history", a(this.f15671a)).apply();
        return true;
    }

    private static Map<String, List<k>> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : ((JSONObject) JSON.parse(str)).entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArray = (JSONArray) entry.getValue();
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    arrayList.add(k.a(jSONObject.getString("path"), jSONObject.getIntValue("count"), jSONObject.getString("name")));
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    @Override // com.taobao.android.tschedule.strategy.e
    public boolean a(List<String> list) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        Iterator<String> it = this.f15671a.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!list.contains(next)) {
                jkq.a("DefaultBehaviorStorage", "recycle, remove :" + next);
                it.remove();
                if (!z) {
                    z = true;
                }
            }
        }
        if (z) {
            String a2 = a(this.f15671a);
            SharedPreferences sharedPreferences = this.b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("history", a2).apply();
            }
        }
        return true;
    }

    @Override // com.taobao.android.tschedule.strategy.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            return a(Collections.emptyList());
        }
        return false;
    }

    private static String a(Map<String, List<k>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<k>> entry : map.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArray = new JSONArray();
            for (k kVar : entry.getValue()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("count", (Object) Integer.valueOf(kVar.b));
                jSONObject2.put("name", (Object) kVar.c);
                jSONObject2.put("path", (Object) kVar.f15675a);
                jSONArray.add(jSONObject2);
            }
            jSONObject.put(key, (Object) jSONArray);
        }
        return jSONObject.toJSONString();
    }
}
