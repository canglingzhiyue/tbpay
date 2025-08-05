package com.taobao.android.riverlogger.inspector;

import android.os.AsyncTask;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.inspector.o;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEV_VERIFY = "Dev.verify";
    private static final String[] b;
    private String g;
    private final AtomicInteger d = new AtomicInteger(1);
    private final ConcurrentHashMap<String, ArrayList<l>> e = new ConcurrentHashMap<>();
    public final Set<String> f = new CopyOnWriteArraySet();

    /* renamed from: a  reason: collision with root package name */
    public boolean f14907a = false;
    private ConcurrentHashMap<Integer, h> h = new ConcurrentHashMap<>();
    private final String c = com.taobao.android.riverlogger.e.a("RVL_Channel");

    public abstract void a(String str, MessagePriority messagePriority);

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd93c71", new Object[]{cVar, jSONObject, hVar});
        } else {
            cVar.a(jSONObject, hVar);
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f5283c", new Object[]{cVar, new Boolean(z), jSONObject});
        } else {
            cVar.a(z, jSONObject);
        }
    }

    public static /* synthetic */ boolean a(byte[] bArr, String str, String str2, Date date) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d5863ea8", new Object[]{bArr, str, str2, date})).booleanValue() : b(bArr, str, str2, date);
    }

    public static /* synthetic */ String c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e21eccc", new Object[]{cVar}) : cVar.g;
    }

    public static /* synthetic */ ConcurrentHashMap d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("759d55f1", new Object[]{cVar}) : cVar.e;
    }

    static {
        kge.a(-1524097243);
        b = new String[]{"result", "error"};
    }

    private static boolean b(byte[] bArr, String str, String str2, Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e63c0b69", new Object[]{bArr, str, str2, date})).booleanValue();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.UK);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        String str3 = " " + str + "-" + str2;
        String format = simpleDateFormat.format(date);
        if (j.a((format + str3).getBytes(), bArr)) {
            return true;
        }
        String format2 = simpleDateFormat.format(new Date());
        if (format.contentEquals(format2)) {
            return false;
        }
        return j.a((format2 + str3).getBytes(), bArr);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.g == null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public ArrayList<l> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("7153230c", new Object[]{this, str}) : this.e.get(str);
    }

    public Set<String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : this.f;
    }

    public void a(final String str, final com.taobao.android.riverlogger.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fd8f9f", new Object[]{this, str, hVar});
            return;
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append((char) (random.nextInt(95) + 32));
        }
        final String sb2 = sb.toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("clientToken", sb2);
        } catch (JSONException unused) {
        }
        final Date date = new Date();
        a(DEV_VERIFY, (String) null, jSONObject, MessagePriority.Normal, new h() { // from class: com.taobao.android.riverlogger.inspector.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.riverlogger.inspector.h
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject2});
                    return;
                }
                JSONObject optJSONObject = jSONObject2.optJSONObject("error");
                String str2 = "Server connect failed, try again";
                int i2 = 1001;
                if (optJSONObject == null) {
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("result");
                    if (optJSONObject2 != null && c.a(Base64.decode(optJSONObject2.optString("token").getBytes(), 0), sb2, str, date)) {
                        str2 = null;
                        i2 = 0;
                    }
                } else {
                    i2 = optJSONObject.optInt("code", 0);
                    str2 = optJSONObject.optString("message");
                }
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, g.RVLModuleName).a("verify", str).a(i2, str2).a();
                com.taobao.android.riverlogger.h hVar2 = hVar;
                if (i2 != 0) {
                    z = false;
                }
                hVar2.a(z, str2);
            }
        });
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f14907a = true;
        f();
        h();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f14907a = false;
        h();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            e.b();
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        if (this.f.size() > 0) {
            e.b();
        }
        for (String str : this.e.keySet()) {
            e.b(str);
        }
    }

    public void a(String str, String str2, JSONObject jSONObject, MessagePriority messagePriority, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c213a6e9", new Object[]{this, str, str2, jSONObject, messagePriority, hVar});
        } else {
            a(str, str2, jSONObject == null ? null : jSONObject.toString(), messagePriority, hVar);
        }
    }

    public void a(String str, String str2, String str3, MessagePriority messagePriority, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072a6d", new Object[]{this, str, str2, str3, messagePriority, hVar});
        } else if (str == null) {
        } else {
            String str4 = this.g;
            if (str4 != null && (str2 == null || !str4.contentEquals(str2))) {
                return;
            }
            if (str3 == null) {
                str3 = "{}";
            }
            StringBuilder sb = new StringBuilder(str3.length() + 64);
            sb.append("{\"");
            sb.append("method");
            sb.append("\":\"");
            sb.append(str);
            sb.append('\"');
            if (hVar != null) {
                int g = g();
                sb.append(",\"");
                sb.append("id");
                sb.append("\":");
                sb.append(g);
                this.h.put(Integer.valueOf(g), hVar);
            }
            if (str2 != null) {
                sb.append(",\"");
                sb.append("sessionId");
                sb.append("\":\"");
                sb.append(str2);
                sb.append('\"');
            }
            sb.append(",\"");
            sb.append("params");
            sb.append("\":");
            sb.append(str3);
            sb.append('}');
            a(sb.toString(), messagePriority);
        }
    }

    public void a(int i, String str, JSONObject jSONObject, MessagePriority messagePriority) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796682db", new Object[]{this, new Integer(i), str, jSONObject, messagePriority});
            return;
        }
        try {
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
                jSONObject2.put("result", new JSONObject());
            } else {
                jSONObject2 = new JSONObject(jSONObject, b);
            }
            jSONObject2.put("id", i);
            if (str != null) {
                jSONObject2.put("sessionId", str);
            }
            a(jSONObject2.toString(), messagePriority);
        } catch (JSONException unused) {
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            a.a(this);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        com.taobao.android.riverlogger.e.a(RVLLevel.Info, g.RVLModuleName).a("close").a("reason", (Object) str).a();
        e.b(this);
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.d.getAndIncrement();
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        ConcurrentHashMap<Integer, h> concurrentHashMap = this.h;
        this.h = new ConcurrentHashMap<>();
        JSONObject a2 = g.a(i, str);
        for (h hVar : concurrentHashMap.values()) {
            hVar.a(a2);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        try {
            a(new JSONObject(str));
        } catch (JSONException unused) {
        }
    }

    public void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32861656", new Object[]{this, jSONObject});
            return;
        }
        final int optInt = jSONObject.optInt("id", -1);
        final String optString = jSONObject.optString("method");
        if (optInt >= 0) {
            if (optString.length() > 0) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.riverlogger.inspector.c.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        final String optString2 = jSONObject.optString("sessionId", null);
                        JSONObject optJSONObject = jSONObject.optJSONObject("params");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        JSONObject jSONObject2 = optJSONObject;
                        if (c.c(c.this) != null && (optString2 == null || !c.c(c.this).contentEquals(optString2))) {
                            return;
                        }
                        if (optString.startsWith("Dev.")) {
                            if (optString.contentEquals("Dev.configPlugins")) {
                                c.a(c.this, jSONObject2, new h() { // from class: com.taobao.android.riverlogger.inspector.c.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // com.taobao.android.riverlogger.inspector.h
                                    public void a(JSONObject jSONObject3) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("32861656", new Object[]{this, jSONObject3});
                                        } else {
                                            c.this.a(optInt, optString2, jSONObject3, MessagePriority.Normal);
                                        }
                                    }
                                });
                                return;
                            } else if (optString.contentEquals("Dev.enable")) {
                                c.a(c.this, true, jSONObject2);
                                c.this.a(optInt, optString2, (JSONObject) null, MessagePriority.Normal);
                                return;
                            } else if (optString.contentEquals("Dev.disable")) {
                                c.a(c.this, false, jSONObject2);
                                c.this.a(optInt, optString2, (JSONObject) null, MessagePriority.Normal);
                                return;
                            }
                        }
                        c a2 = e.a();
                        if (a2 == null) {
                            return;
                        }
                        a2.a(optString, optInt, optString2, jSONObject2, c.this);
                    }
                });
                return;
            }
            final h hVar = this.h.get(Integer.valueOf(optInt));
            if (hVar == null) {
                return;
            }
            this.h.remove(Integer.valueOf(optInt));
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.riverlogger.inspector.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        hVar.a(jSONObject);
                    }
                }
            });
        } else if (!optString.contentEquals("Dev.closeDebug")) {
        } else {
            c("server close");
        }
    }

    private void a(JSONObject jSONObject, final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3d891b", new Object[]{this, jSONObject, hVar});
            return;
        }
        final String optString = jSONObject.optString("scene");
        if (optString.isEmpty()) {
            hVar.a(g.a(1001, "scene is not a valid string"));
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("plugins");
        if (optJSONArray == null) {
            hVar.a(null);
            return;
        }
        final ArrayList arrayList = new ArrayList(optJSONArray.length());
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                hVar.a(g.a(1002, "invalid plugin"));
                return;
            }
            String optString2 = optJSONObject.optString("id");
            String optString3 = optJSONObject.optString("url");
            if (optString2.isEmpty() || optString3.isEmpty()) {
                hVar.a(g.a(1002, "invalid plugin"));
                return;
            }
            arrayList.add(new l(optString2, optString3));
        }
        if (arrayList.size() == 0) {
            if (this.e.remove(optString) != null) {
                e.b(optString);
            }
            hVar.a(null);
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final l lVar = (l) it.next();
            o.a(lVar.b, new o.a() { // from class: com.taobao.android.riverlogger.inspector.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.inspector.o.a
                public void a(boolean z, o oVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ec5abca", new Object[]{this, new Boolean(z), oVar});
                    } else if (z) {
                        lVar.c = oVar.b;
                        if (atomicInteger.decrementAndGet() != 0) {
                            return;
                        }
                        c.d(c.this).put(optString, arrayList);
                        e.b(optString);
                        hVar.a(null);
                    } else {
                        int intValue = atomicInteger.intValue();
                        if (intValue < 0) {
                            return;
                        }
                        while (!atomicInteger.compareAndSet(intValue, -1)) {
                            intValue = atomicInteger.intValue();
                            if (intValue < 0) {
                                return;
                            }
                        }
                        hVar.a(g.a(1003, String.format("download \"%s\" failed: %s", lVar.b, oVar.c)));
                    }
                }
            });
        }
    }

    private void a(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab1df9d2", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("targets");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return;
        }
        int length = optJSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(optJSONArray.optString(i));
        }
        int size = this.f.size();
        if (z) {
            this.f.addAll(arrayList);
        } else {
            this.f.removeAll(arrayList);
        }
        if (size == this.f.size()) {
            return;
        }
        i();
    }

    public void a(String str, int i, String str2, JSONObject jSONObject, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a84cb96d", new Object[]{this, str, new Integer(i), str2, jSONObject, cVar});
        } else {
            a.a(str, i, str2, jSONObject);
        }
    }
}
