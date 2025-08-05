package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.exception.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ggt extends ggu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Object f28326a;

    static {
        kge.a(1834953008);
    }

    public static /* synthetic */ Object ipc$super(ggt ggtVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ggt(Object obj, short s) {
        this.f28326a = obj;
        this.c = s;
    }

    @Override // tb.ggu
    public Object f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5dd0ace5", new Object[]{this}) : this.f28326a;
    }

    @Override // tb.ggu
    public ggu b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggu) ipChange.ipc$dispatch("16b6ad88", new Object[]{this});
        }
        ggt ggtVar = new ggt(this.f28326a, this.c);
        ggtVar.b = this.b;
        if (this.f28326a != null) {
            short s = this.c;
            if (s == 8) {
                Object obj = this.f28326a;
                if (obj instanceof JSONArray) {
                    ggtVar.f28326a = ((JSONArray) obj).clone();
                } else {
                    ggtVar.f28326a = obj;
                }
            } else if (s == 9) {
                Object obj2 = this.f28326a;
                if (obj2 instanceof JSONObject) {
                    ggtVar.f28326a = ((JSONObject) obj2).clone();
                } else {
                    ggtVar.f28326a = obj2;
                }
            } else {
                ggtVar.f28326a = this.f28326a;
            }
        }
        return ggtVar;
    }

    @Override // tb.ggu
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        try {
            if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    a((List) obj, jSONArray);
                    this.f28326a = jSONArray;
                    return;
                } else if (obj instanceof Map) {
                    JSONObject jSONObject = new JSONObject();
                    a((Map) obj, jSONObject);
                    this.f28326a = jSONObject;
                    return;
                } else {
                    this.f28326a = obj;
                    return;
                }
            }
            this.f28326a = obj;
        } catch (Exception e) {
            a.b(e);
        }
    }

    private void a(Map<String, Object> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0fa073", new Object[]{this, map, jSONObject});
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                JSONObject jSONObject2 = new JSONObject();
                a((Map) value, jSONObject2);
                jSONObject.put(key, (Object) jSONObject2);
            } else if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                a((List) value, jSONArray);
                jSONObject.put(key, (Object) jSONArray);
            } else {
                jSONObject.put(key, value);
            }
        }
    }

    private void a(List<Object> list, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55f5e81", new Object[]{this, list, jSONArray});
            return;
        }
        for (Object obj : list) {
            if (obj instanceof Map) {
                JSONObject jSONObject = new JSONObject();
                a((Map) obj, jSONObject);
                jSONArray.add(jSONObject);
            } else {
                jSONArray.add(obj);
            }
        }
    }
}
