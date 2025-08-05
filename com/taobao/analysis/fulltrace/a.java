package com.taobao.analysis.fulltrace;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, List<String>> e = new HashMap();
    private static final List<String> f;

    /* renamed from: a  reason: collision with root package name */
    public String f8566a;
    public String b;
    private JSONObject h;
    public Map<String, Pair<Long, Long>> c = new HashMap();
    private boolean g = false;
    public boolean d = false;

    static {
        ArrayList arrayList = new ArrayList();
        f = arrayList;
        arrayList.add("process");
        f.add("parse");
        f.add("render");
    }

    public a(String str) {
        this.f8566a = str;
    }

    public static void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{str, list});
        } else {
            e.put(str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a() {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.analysis.fulltrace.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r2 = "56c6c6c"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            boolean r0 = r9.g
            if (r0 == 0) goto L1e
            return r3
        L1e:
            boolean r0 = r9.d
            if (r0 == 0) goto L26
            r9.a(r3)
            return r3
        L26:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = com.taobao.analysis.fulltrace.a.e
            java.lang.String r1 = r9.f8566a
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L39
            java.util.List<java.lang.String> r0 = com.taobao.analysis.fulltrace.a.f
            java.lang.String r1 = r9.f8566a
            a(r1, r0)
        L39:
            java.util.Map<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> r1 = r9.c
            int r1 = r1.size()
            int r0 = r0.size()
            if (r1 >= r0) goto L46
            return r2
        L46:
            java.util.Map<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> r0 = r9.c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r0.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L76
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L50
        L76:
            return r2
        L77:
            r9.a(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.fulltrace.a.a():boolean");
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        b();
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        List<String> list = e.get(this.f8566a);
        if (list == null) {
            list = f;
            a(this.f8566a, list);
        }
        return list.contains(str);
    }

    public JSONObject b() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ed42e657", new Object[]{this});
        }
        if (this.g && (jSONObject = this.h) != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", this.b);
            for (Map.Entry<String, Pair<Long, Long>> entry : this.c.entrySet()) {
                Pair<Long, Long> value = entry.getValue();
                if (value != null && ((Long) value.first).longValue() > 0 && ((Long) value.second).longValue() > 0) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("start", value.first);
                    jSONObject3.put("end", value.second);
                    jSONObject2.put(entry.getKey(), jSONObject3);
                }
            }
        } catch (Exception unused) {
        }
        this.h = jSONObject2;
        return this.h;
    }
}
