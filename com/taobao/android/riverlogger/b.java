package com.taobao.android.riverlogger;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f14899a;
    private JSONStringer b = null;

    static {
        kge.a(1659918297);
    }

    public b(RVLLevel rVLLevel, String str) {
        rVLLevel = rVLLevel == null ? RVLLevel.Verbose : rVLLevel;
        this.f14899a = new d(rVLLevel.value <= RVLLevel.Error.value ? RVLLevel.Error : rVLLevel, str == null ? "" : str, 0L);
        this.f14899a.j = true;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        a();
        super.finalize();
    }

    public b a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a18264ed", new Object[]{this, new Long(j)});
        }
        if (j > 0) {
            this.f14899a.h = j;
        }
        return this;
    }

    public b a(RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1708dad2", new Object[]{this, rVLLevel});
        }
        if (rVLLevel != null) {
            this.f14899a.f14902a = rVLLevel;
        }
        return this;
    }

    public b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("44f222d7", new Object[]{this, str});
        }
        this.f14899a.c(str);
        return this;
    }

    public b a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d17bb2cd", new Object[]{this, str, str2});
        }
        if (this.f14899a.c(str)) {
            this.f14899a.a(str2);
        }
        return this;
    }

    public b b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("462875b6", new Object[]{this, str});
        }
        this.f14899a.b(str);
        return this;
    }

    public b a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a9c85cc4", new Object[]{this, new Integer(i), str});
        }
        if (this.f14899a.a((Object) String.valueOf(i)) && str != null) {
            this.f14899a.g = str;
        }
        return this;
    }

    public b b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ebecabec", new Object[]{this, str, str2});
        }
        if (this.f14899a.a((Object) str) && str2 != null) {
            this.f14899a.g = str2;
        }
        return this;
    }

    public b a(int i, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("408613dd", new Object[]{this, new Integer(i), str, objArr});
        }
        if (this.f14899a.a((Object) String.valueOf(i)) && str != null) {
            this.f14899a.g = String.format(str, objArr);
        }
        return this;
    }

    public b a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c4a976fb", new Object[]{this, str, obj});
        }
        if (str != null && str.length() != 0) {
            try {
                c(str);
                a(obj);
            } catch (JSONException unused) {
            }
        }
        return this;
    }

    public b a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("472b2d33", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return this;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                c(next);
                a(jSONObject.get(next));
            } catch (JSONException unused) {
            }
        }
        return this;
    }

    public b a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ebcc064c", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                c(entry.getKey());
                a(entry.getValue());
            } catch (JSONException unused) {
            }
        }
        return this;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            if (this.b == null) {
                this.b = new JSONStringer().object();
            }
            if (str == null) {
                this.b.key("[null]");
            } else {
                this.b.key(str);
            }
        } catch (JSONException unused) {
        }
    }

    private void a(Object obj) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (obj == null || (obj instanceof Boolean) || obj == JSONObject.NULL || (obj instanceof Number) || (obj instanceof String) || (obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            this.b.value(obj);
        } else if (obj instanceof Character) {
            this.b.value(obj.toString());
        } else if (obj instanceof Collection) {
            this.b.array();
            for (Object obj2 : (Collection) obj) {
                a(obj2);
            }
            this.b.endArray();
        } else if (obj instanceof Map) {
            this.b.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                c((String) entry.getKey());
                a(entry.getValue());
            }
            this.b.endObject();
        } else if (obj.getClass().isArray()) {
            this.b.array();
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                a(Array.get(obj, i));
            }
            this.b.endArray();
        } else if (obj.getClass().getPackage().getName().startsWith("java.")) {
            this.b.value(obj.toString());
        } else {
            this.b.value(String.format("%s@%h", obj.getClass().getName(), obj));
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d dVar = this.f14899a;
        if (dVar == null || dVar.f14902a.value > e.a().value) {
            return;
        }
        if (this.f14899a.h <= 0) {
            this.f14899a.h = System.currentTimeMillis();
        }
        JSONStringer jSONStringer = this.b;
        if (jSONStringer != null) {
            try {
                jSONStringer.endObject();
                this.f14899a.i = this.b.toString();
            } catch (JSONException unused) {
            }
        }
        e.a(this.f14899a);
        this.f14899a = null;
    }
}
