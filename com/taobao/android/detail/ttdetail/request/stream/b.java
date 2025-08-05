package com.taobao.android.detail.ttdetail.request.stream;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<byte[]> f10802a = Collections.synchronizedList(new ArrayList());

    static {
        kge.a(-1812528125);
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else if (bArr == null) {
        } else {
            this.f10802a.add(bArr);
        }
    }

    public List<byte[]> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.f10802a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f10802a.clear();
        }
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject jSONObject = null;
        if (this.f10802a.isEmpty()) {
            return null;
        }
        for (int i = 0; i < this.f10802a.size(); i++) {
            JSONObject f = g.f(JSON.parseObject(new String(this.f10802a.get(i))));
            if (f != null) {
                jSONObject = a(jSONObject, f);
            }
        }
        return jSONObject;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return jSONObject2;
        }
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof JSONObject) {
                a(jSONObject, key, (JSONObject) value);
            } else if (value instanceof JSONArray) {
                a(jSONObject, key, (JSONArray) value);
            } else if (value != null) {
                jSONObject.put(key, value);
            }
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e253647a", new Object[]{this, jSONObject, str, jSONArray});
            return;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(str);
        if (jSONArray2 != null) {
            JSONArray jSONArray3 = new JSONArray();
            for (int i = 0; i < jSONArray.size(); i++) {
                if ((jSONArray.get(i) instanceof JSONObject) && (jSONArray2.get(i) instanceof JSONObject)) {
                    jSONArray3.add(a((JSONObject) jSONArray2.get(i), (JSONObject) jSONArray.get(i)));
                } else if (jSONArray.get(i) != null) {
                    jSONArray3.add(jSONArray.get(i));
                }
            }
            if (jSONArray2.size() > jSONArray.size()) {
                for (int size = jSONArray.size(); size < jSONArray2.size(); size++) {
                    jSONArray3.add(jSONArray2.get(size));
                }
            }
            jSONObject.put(str, (Object) jSONArray3);
            return;
        }
        jSONObject.put(str, (Object) jSONArray);
    }

    private void a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("644a19de", new Object[]{this, jSONObject, str, jSONObject2});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(str);
        if (jSONObject3 != null) {
            jSONObject.put(str, (Object) a(jSONObject3, jSONObject2));
        } else {
            jSONObject.put(str, (Object) jSONObject2);
        }
    }
}
