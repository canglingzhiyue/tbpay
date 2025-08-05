package com.taobao.android.riverlogger.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements com.taobao.android.riverlogger.f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f14913a;
    public static final d instance;

    static {
        kge.a(2013363679);
        kge.a(-1791990569);
        instance = new d();
        f14913a = new AtomicBoolean(true);
    }

    @Override // com.taobao.android.riverlogger.f
    public RVLLevel a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("bc18a397", new Object[]{this});
        }
        if (e.a() != null) {
            return RVLLevel.Verbose;
        }
        return RVLLevel.Off;
    }

    @Override // com.taobao.android.riverlogger.f
    public void a(com.taobao.android.riverlogger.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f250d9", new Object[]{this, dVar});
            return;
        }
        c a2 = e.a();
        if (a2 == null) {
            return;
        }
        if (f14913a.compareAndSet(true, false)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("level", "Error");
                jSONObject.put("module", "LOGGER/CLIENT_RESTART_MARK");
                jSONObject.put("time", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            a2.a("Dev.log", (String) null, jSONObject, MessagePriority.Normal, (h) null);
        }
        if (dVar.j) {
            a2.a("Dev.log", (String) null, "{\"level\":\"" + dVar.f14902a.toString() + "\",\"module\":\"" + dVar.b + "\"," + dVar.a().substring(1), MessagePriority.Low, (h) null);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("level", dVar.f14902a.toString());
            jSONObject2.put("module", dVar.b);
            jSONObject2.put("time", System.currentTimeMillis());
            jSONObject2.put("ext", dVar.a());
        } catch (JSONException unused2) {
        }
        a2.a("Dev.log", (String) null, jSONObject2, MessagePriority.Low, (h) null);
    }
}
