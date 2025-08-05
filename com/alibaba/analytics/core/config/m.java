package com.alibaba.analytics.core.config;

import android.text.TextUtils;
import com.alibaba.analytics.core.config.f;
import com.alibaba.analytics.core.model.LogField;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.apr;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public class m implements f.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "gProp";
    private static m e;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, a> f2063a = new HashMap();
    private List<String> b = new ArrayList();
    private List<String> c = new ArrayList();
    private Map<String, List<String>> d = new HashMap();

    static {
        kge.a(-321637022);
        kge.a(-2114741388);
        e = null;
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("afc32e13", new Object[0]);
        }
        if (e == null) {
            e = new m();
        }
        return e;
    }

    private m() {
    }

    @Override // com.alibaba.analytics.core.config.f.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            b(str2);
        } catch (Exception unused) {
        }
    }

    private synchronized void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        apr.b("UTGlobalPropConfigListener", "parseConfig", str);
        this.f2063a.clear();
        this.c.clear();
        this.d.clear();
        this.b.clear();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (Map.Entry entry : ((HashMap) JSONObject.parseObject(str, Map.class)).entrySet()) {
                    String str2 = (String) entry.getKey();
                    if (!aqc.e(str2) && !c(str2)) {
                        Map map = (Map) entry.getValue();
                        if (map != null) {
                            a aVar = new a();
                            try {
                                aVar.b = (List) map.get("eidin");
                                if (aVar.b != null) {
                                    for (String str3 : aVar.b) {
                                        if (!"*".equalsIgnoreCase(str3) && !this.b.contains(str3)) {
                                            this.b.add(str3);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                aVar.b = null;
                            }
                            try {
                                aVar.f2064a = (List) map.get("eidnin");
                                if (aVar.f2064a != null) {
                                    for (String str4 : aVar.f2064a) {
                                        if (!"*".equalsIgnoreCase(str4) && !this.b.contains(str4)) {
                                            this.b.add(str4);
                                        }
                                    }
                                }
                            } catch (Exception unused2) {
                                aVar.f2064a = null;
                            }
                            if (aVar.b != null && aVar.b.size() > 0) {
                                if (!aVar.b.contains("*")) {
                                    this.c.add(str2);
                                }
                            } else if (aVar.f2064a != null && aVar.f2064a.size() > 0 && aVar.f2064a.contains("*")) {
                                this.c.add(str2);
                            }
                            if (aVar.b != null || aVar.f2064a != null) {
                                this.f2063a.put(str2, aVar);
                                apr.b("UTGlobalPropConfigListener", "key", str2, "globalPropItem.eidin", aVar.b, "globalPropItem.eidnin", aVar.f2064a);
                            }
                        }
                    }
                    return;
                }
            } catch (Exception e2) {
                apr.b("UTGlobalPropConfigListener", e2, new Object[0]);
            }
        }
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Map<String, a> map = this.f2063a;
        if (map == null || map.size() <= 0) {
            apr.b("UTGlobalPropConfigListener", "mBlackGlobalPropItemMap is null");
            return;
        }
        for (String str : this.b) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, a> entry : this.f2063a.entrySet()) {
                String key = entry.getKey();
                if (aqc.e(key) || c(key)) {
                    return;
                }
                if (!b(key, str)) {
                    arrayList.add(key);
                }
            }
            this.d.put(str, arrayList);
        }
        this.d.put("other", this.c);
        apr.b("UTGlobalPropConfigListener", "mBlackGlobalPropItemMap", this.d);
    }

    public synchronized List<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        } else if ("65501".equalsIgnoreCase(str) || "65502".equalsIgnoreCase(str) || "65503".equalsIgnoreCase(str)) {
            return null;
        } else {
            try {
                if (this.b.contains(str)) {
                    return this.d.get(str);
                }
                return this.d.get("other");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public boolean b(String str, String str2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue();
        }
        Map<String, a> map = this.f2063a;
        if (map == null) {
            return true;
        }
        try {
            if (map.containsKey(str) && (aVar = this.f2063a.get(str)) != null) {
                return aVar.a(str2);
            }
            return true;
        } catch (Exception unused) {
        }
        return true;
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        for (LogField logField : LogField.values()) {
            if (logField.toString().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<String> f2064a;
        public List<String> b;

        static {
            kge.a(-2125413030);
        }

        private a() {
            this.f2064a = null;
            this.b = null;
        }

        public boolean a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !b(str) && c(str);
        }

        private boolean b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
            }
            List<String> list = this.f2064a;
            if (list == null) {
                return false;
            }
            return list.contains("*") || this.f2064a.contains(str);
        }

        private boolean c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
            }
            List<String> list = this.b;
            return list == null || list.contains("*") || this.b.contains(str);
        }
    }
}
