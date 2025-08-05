package com.ap.zoloz.hummer.common;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f6457a;
    public Context b;
    public ClientConfig d;
    private TaskConfig h;
    private Map<String, Object> e = new HashMap();
    private Map<String, Object> f = new HashMap();
    private Map<Integer, Object> g = new HashMap();
    public ArrayList<Integer> c = new ArrayList<>();
    private List<Map<String, String>> i = new ArrayList();
    private Map<String, Object> j = new HashMap();
    private Map<String, Object> k = new HashMap();

    static {
        kge.a(1888868775);
    }

    public void a(ClientConfig clientConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994db6fe", new Object[]{this, clientConfig});
        } else {
            this.d = clientConfig;
        }
    }

    public void a(TaskConfig taskConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789e7b44", new Object[]{this, taskConfig});
        } else {
            this.h = taskConfig;
        }
    }

    public TaskConfig a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaskConfig) ipChange.ipc$dispatch("1adfd884", new Object[]{this}) : this.h;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j.clear();
        this.k.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i.clear();
        this.b = null;
        this.h = null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        BioLog.i("HummerContext forceQuit");
        this.i.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = null;
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        if (this.j.containsKey(str)) {
            return this.j.get(str);
        }
        if (this.e.containsKey(str)) {
            return this.e.get(str);
        }
        if (this.f.containsKey(str)) {
            return this.f.get(str);
        }
        if (!this.k.containsKey(str)) {
            return null;
        }
        return this.k.get(str);
    }

    public void a(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45199658", new Object[]{this, str, str2, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1589682499:
                if (str2.equals("argument")) {
                    c = 1;
                    break;
                }
                break;
            case -722006482:
                if (str2.equals("zStack")) {
                    c = 5;
                    break;
                }
                break;
            case -170019676:
                if (str2.equals("serverResponse")) {
                    c = 2;
                    break;
                }
                break;
            case 3029889:
                if (str2.equals("both")) {
                    c = 3;
                    break;
                }
                break;
            case 951530927:
                if (str2.equals("context")) {
                    c = 0;
                    break;
                }
                break;
            case 1447616613:
                if (str2.equals("serverConfig")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            this.f.put(str, obj);
        } else if (c == 1) {
            if (this.h == null) {
                return;
            }
            hashMap.clear();
            if (this.g.containsKey(Integer.valueOf(this.h.index))) {
                hashMap.putAll((Map) this.g.get(Integer.valueOf(this.h.index)));
            }
            hashMap.put(str, obj);
            this.g.put(Integer.valueOf(this.h.index), hashMap);
        } else if (c == 2) {
            this.e.put(str, obj);
        } else if (c != 3) {
            if (c == 4) {
                this.k.put(str, obj);
            } else if (c != 5) {
            } else {
                a(this.h.name, String.valueOf(obj));
            }
        } else {
            this.f.put(str, obj);
            if (this.h == null) {
                return;
            }
            hashMap.clear();
            if (this.g.containsKey(Integer.valueOf(this.h.index))) {
                hashMap.putAll((Map) this.g.get(Integer.valueOf(this.h.index)));
            }
            hashMap.put(str, obj);
            this.g.put(Integer.valueOf(this.h.index), hashMap);
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        TaskConfig a2 = a(c(str));
        return a2 != null && "serverTask".equals(a2.type) && !"realIdFinalize".equals(a2.name) && !"cancel".equals(a2.name);
    }

    public int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{this, str})).intValue();
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig != null && taskConfig.navigateConfig != null && this.h.navigateConfig.containsKey(str)) {
            return ((Integer) ((Map) this.h.navigateConfig.get(str)).get("index")).intValue();
        }
        return 0;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig == null) {
            return null;
        }
        return taskConfig.inputParams;
    }

    public JSONObject d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("efd4af15", new Object[]{this, str});
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig == null || !taskConfig.navigateConfig.containsKey(str)) {
            return null;
        }
        return (JSONObject) ((Map) this.h.navigateConfig.get(str)).get("outputParams");
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        this.g.remove(str);
        this.f.remove(str);
        this.e.remove(str);
        this.g.remove(str);
    }

    public HashMap<String, Object> e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e742bccf", new Object[]{this});
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig == null) {
            return null;
        }
        int i2 = taskConfig.index;
        HashMap<String, Object> hashMap = new HashMap<>();
        ArrayList arrayList = new ArrayList(this.c);
        Collections.sort(arrayList);
        if (!arrayList.contains(Integer.valueOf(i2))) {
            return null;
        }
        if (this.c.indexOf(Integer.valueOf(i2)) > 0) {
            i = ((Integer) arrayList.get(this.c.indexOf(Integer.valueOf(i2)) - 1)).intValue();
        }
        for (Map.Entry<Integer, Object> entry : this.g.entrySet()) {
            if (entry.getKey().intValue() > i && entry.getKey().intValue() <= i2) {
                hashMap.putAll((Map) entry.getValue());
            }
        }
        return hashMap;
    }

    public List<Map<String, String>> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.i;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        TaskConfig taskConfig = this.h;
        if (taskConfig == null) {
            return;
        }
        this.c.add(Integer.valueOf(taskConfig.index));
        BioLog.d(this.c.toString());
    }

    public TaskConfig a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskConfig) ipChange.ipc$dispatch("3eb10177", new Object[]{this, new Integer(i)});
        }
        ClientConfig clientConfig = this.d;
        if (clientConfig != null && clientConfig.tasks != null && this.d.tasks.size() != 0) {
            for (int i2 = 0; i2 < this.d.tasks.size(); i2++) {
                if (i == this.d.tasks.get(i2).index) {
                    return this.d.tasks.get(i2);
                }
            }
        }
        return null;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        this.i.add(hashMap);
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("subCode", str2);
        hashMap.put("currentTaskName", str);
        h.a().a("ztech_system_error", hashMap);
    }

    public void a(List<Map<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.i.clear();
        this.i.addAll(list);
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        List<Map<String, String>> list = this.i;
        String str = "";
        if (list != null && list.size() > 0) {
            List<Map<String, String>> list2 = this.i;
            Map<String, String> map = list2.get(list2.size() - 1);
            for (String str2 : map.keySet()) {
                str = map.get(str2);
            }
        }
        return str;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        ClientConfig clientConfig = this.d;
        if (clientConfig != null && clientConfig.tasks != null && this.d.tasks.size() != 0) {
            for (int i = 0; i < this.d.tasks.size(); i++) {
                if ("cancel".equals(this.d.tasks.get(i).name)) {
                    return this.d.tasks.get(i).index;
                }
            }
        }
        return 0;
    }
}
