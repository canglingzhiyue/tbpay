package com.alibaba.appmonitor.event;

import com.alibaba.appmonitor.pool.ReuseJSONArray;
import com.alibaba.appmonitor.pool.ReuseJSONObject;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.aqc;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f2879a = 0;
    public int b = 0;
    public Map<String, String> c;
    public Map<String, Integer> d;

    static {
        kge.a(-1984808205);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1275793840) {
            super.clean();
            return null;
        } else if (hashCode == 1889499016) {
            return super.a();
        } else {
            if (hashCode != 2013839273) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.c((Long) objArr[0]);
            return null;
        }
    }

    public synchronized void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
            return;
        }
        this.f2879a++;
        super.c(l);
    }

    public synchronized void b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{this, l});
            return;
        }
        this.b++;
        super.c(l);
    }

    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (aqc.d(str)) {
        } else {
            if (this.c == null) {
                this.c = new HashMap();
            }
            if (this.d == null) {
                this.d = new HashMap();
            }
            if (aqc.c(str2)) {
                int i = 100;
                if (str2.length() <= 100) {
                    i = str2.length();
                }
                this.c.put(str, str2.substring(0, i));
            }
            if (!this.d.containsKey(str)) {
                this.d.put(str, 1);
            } else {
                this.d.put(str, Integer.valueOf(this.d.get(str).intValue() + 1));
            }
        }
    }

    @Override // com.alibaba.appmonitor.event.d
    public synchronized JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject a2 = super.a();
        a2.put("successCount", (Object) Integer.valueOf(this.f2879a));
        a2.put("failCount", (Object) Integer.valueOf(this.b));
        if (this.d != null) {
            JSONArray jSONArray = (JSONArray) com.alibaba.appmonitor.pool.a.a().a(ReuseJSONArray.class, new Object[0]);
            for (Map.Entry<String, Integer> entry : this.d.entrySet()) {
                JSONObject jSONObject = (JSONObject) com.alibaba.appmonitor.pool.a.a().a(ReuseJSONObject.class, new Object[0]);
                String key = entry.getKey();
                jSONObject.put("errorCode", (Object) key);
                jSONObject.put("errorCount", (Object) entry.getValue());
                if (this.c.containsKey(key)) {
                    jSONObject.put("errorMsg", (Object) this.c.get(key));
                }
                jSONArray.add(jSONObject);
            }
            a2.put(com.taobao.android.weex_framework.util.a.ATOM_errors, (Object) jSONArray);
        }
        return a2;
    }

    @Override // com.alibaba.appmonitor.event.d, com.alibaba.appmonitor.pool.b
    public synchronized void clean() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[]{this});
            return;
        }
        super.clean();
        this.f2879a = 0;
        this.b = 0;
        if (this.c != null) {
            this.c.clear();
        }
        if (this.d != null) {
            this.d.clear();
        }
    }
}
