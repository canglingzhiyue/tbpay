package com.taobao.android.home.component.utils;

import android.app.Application;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bpp;
import tb.jqm;
import tb.kge;

/* loaded from: classes5.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BUCKETID = "bucketId";
    public static final String KEY_VALUE = "value";
    public static final String TAG = "ABTestTool";

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f12729a;
    private String b;
    private Application c;
    private UMLinkLogInterface d;
    private Map<String, Object> e = new ConcurrentHashMap();
    private boolean f = false;

    /* loaded from: classes5.dex */
    public static class a {
        public static final m instance;

        static {
            kge.a(-1160886475);
            instance = new m();
        }
    }

    static {
        kge.a(1723048546);
    }

    public static /* synthetic */ Application a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("b8a88308", new Object[]{mVar}) : mVar.c;
    }

    public static m a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("1a728239", new Object[0]) : a.instance;
    }

    public synchronized void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (this.f) {
        } else {
            if (application == null) {
                return;
            }
            this.d = bpp.a();
            this.c = application;
            b();
            this.f = true;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String string = this.c.getSharedPreferences("home_client_abtest", 0).getString("home_client_abtest", null);
        if (StringUtils.isEmpty(string)) {
            return;
        }
        synchronized (this) {
            this.f12729a = JSON.parseObject(string);
        }
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f12729a != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Object> entry : this.f12729a.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) value;
                    if (jSONObject.containsKey("bucketId")) {
                        sb.append(jSONObject.getString("bucketId"));
                        sb.append("_");
                    }
                }
            }
            this.b = sb.toString();
            if (StringUtils.isEmpty(this.b)) {
                return;
            }
            String str = this.b;
            this.b = str.substring(0, str.length() - 1);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        final JSONObject jSONObject2 = null;
        if (jSONObject != null && jSONObject.containsKey("clientABTest")) {
            try {
                jSONObject2 = jSONObject.getJSONObject("clientABTest");
            } catch (Exception unused) {
            }
        }
        this.e.clear();
        synchronized (this) {
            this.f12729a = jSONObject2;
        }
        c();
        Coordinator.execute(new Runnable() { // from class: com.taobao.android.home.component.utils.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (m.a(m.this) == null) {
                } else {
                    SharedPreferences.Editor edit = m.a(m.this).getSharedPreferences("home_client_abtest", 0).edit();
                    JSONObject jSONObject3 = jSONObject2;
                    edit.putString("home_client_abtest", jSONObject3 == null ? "" : JSON.toJSONString(jSONObject3));
                    edit.apply();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, T, java.lang.String] */
    public <T> T a(String str, Class<T> cls) {
        JSONObject jSONObject;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{this, str, cls});
        }
        synchronized (this) {
            if (this.f12729a != null && this.f12729a.containsKey(str)) {
                try {
                    jSONObject = this.f12729a.getJSONObject(str);
                } catch (Exception unused) {
                }
            }
            jSONObject = null;
        }
        if (jSONObject != null && jSONObject.containsKey("value") && jSONObject.containsKey("bucketId")) {
            if (this.e.containsKey(str)) {
                return (T) this.e.get(str);
            }
            ?? r0 = (T) jSONObject.getString("value");
            if (!StringUtils.isEmpty(r0)) {
                if (cls == String.class) {
                    return r0;
                }
                try {
                    if (a((Class<?>) cls)) {
                        if (cls == Boolean.class) {
                            t = (T) Boolean.valueOf(Boolean.parseBoolean(r0));
                        } else if (cls == Integer.class) {
                            t = (T) Integer.valueOf(Integer.parseInt(r0));
                        } else if (cls == Float.class) {
                            t = (T) Float.valueOf(Float.parseFloat(r0));
                        } else {
                            t = cls == Long.class ? (T) Long.valueOf(Long.parseLong(r0)) : null;
                        }
                        if (t != null) {
                            return t;
                        }
                    } else {
                        T t2 = (T) JSON.parseObject((String) r0, cls);
                        this.e.put(str, t2);
                        return t2;
                    }
                } catch (Exception e) {
                    if (jqm.a()) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return null;
    }

    public String a(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        synchronized (this) {
            if (this.f12729a != null && this.f12729a.containsKey(str)) {
                try {
                    jSONObject = this.f12729a.getJSONObject(str);
                } catch (Exception unused) {
                }
            }
            jSONObject = null;
        }
        if (jSONObject != null && jSONObject.containsKey("bucketId")) {
            return jSONObject.getString("bucketId");
        }
        return null;
    }

    private static boolean a(Class<?> cls) {
        try {
            if (cls.isPrimitive()) {
                return true;
            }
            return ((Class) cls.getField("TYPE").get(null)).isPrimitive();
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{this, str, str2, str3, str4, str5, map});
        } else if (this.d == null) {
        } else {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!StringUtils.isEmpty(this.b)) {
                hashMap.put("home_client_abtest", this.b);
            }
            this.d.commitSuccess(str, str2, str3, str4, str5, hashMap);
        }
    }
}
