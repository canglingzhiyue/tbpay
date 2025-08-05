package com.taobao.android.weex.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.module.builtin.storage.b;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.weex.inspector.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0613a {
        void a(JSONObject jSONObject);
    }

    static {
        kge.a(1310948650);
    }

    public static void a(String str, boolean z, final InterfaceC0613a interfaceC0613a) {
        com.taobao.android.weex_framework.module.builtin.storage.b c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9654db4", new Object[]{str, new Boolean(z), interfaceC0613a});
        } else if (z && (c = l.a().c()) != null) {
            final int length = str.length();
            c.b(str, new b.a() { // from class: com.taobao.android.weex.inspector.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey().substring(length));
                        jSONArray2.put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_entries, jSONArray);
                    } catch (JSONException unused) {
                    }
                    interfaceC0613a.a(jSONObject);
                }
            });
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_entries, new JSONArray());
            } catch (JSONException unused) {
            }
            interfaceC0613a.a(jSONObject);
        }
    }
}
