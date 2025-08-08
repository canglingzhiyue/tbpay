package com.taobao.android.riverlogger;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.m;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1581120568);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str3)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                RVLLevel parse = RVLLevel.parse(jSONObject.opt("level"));
                if (parse.value > e.a().value) {
                    return;
                }
                String optString = jSONObject.optString("event");
                if (StringUtils.isEmpty(optString)) {
                    return;
                }
                d dVar = new d(parse, str, System.currentTimeMillis());
                dVar.j = true;
                dVar.c(optString);
                dVar.a(jSONObject.optString("id"));
                String optString2 = jSONObject.optString("parentId");
                if (StringUtils.isEmpty(optString2)) {
                    dVar.b(str2);
                } else {
                    dVar.b(optString2);
                }
                if (dVar.a(jSONObject.opt("errorCode"))) {
                    String optString3 = jSONObject.optString("errorMsg");
                    if (!StringUtils.isEmpty(optString3)) {
                        dVar.g = optString3;
                    }
                }
                Object opt = jSONObject.opt("ext");
                if (opt != null) {
                    JSONStringer jSONStringer = new JSONStringer();
                    try {
                        jSONStringer.array();
                        jSONStringer.value(opt);
                        jSONStringer.endArray();
                        String jSONStringer2 = jSONStringer.toString();
                        dVar.i = jSONStringer2.substring(1, jSONStringer2.length() - 1);
                    } catch (JSONException unused) {
                    }
                }
                e.a(dVar);
            } catch (JSONException unused2) {
                d dVar2 = new d(RVLLevel.Info, str, System.currentTimeMillis());
                dVar2.i = str3;
                e.a(dVar2);
            }
        }
    }

    public static void a(String str, String str2, final h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da5fe69", new Object[]{str, str2, hVar});
        } else if (str2 == null || str2.length() == 0) {
            if (hVar == null) {
                return;
            }
            hVar.a(false, "Invalid connectId");
        } else {
            final m a2 = a(str, hVar);
            if (a2 == null) {
                return;
            }
            a2.a(true);
            e.a(RVLLevel.Info, com.taobao.android.riverlogger.inspector.g.RVLModuleName).a("openRemote", a2.c()).a("server", (Object) str).a("connectId", (Object) str2).a();
            a2.a(str2, new h() { // from class: com.taobao.android.riverlogger.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.riverlogger.h
                public void a(boolean z, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str3});
                        return;
                    }
                    if (z) {
                        com.taobao.android.riverlogger.inspector.e.a(m.this);
                    }
                    h hVar2 = hVar;
                    if (hVar2 == null) {
                        return;
                    }
                    hVar2.a(z, str3);
                }
            });
        }
    }

    public static void b(String str, String str2, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b154292a", new Object[]{str, str2, hVar});
        } else if (str2 == null || str2.length() == 0) {
            if (hVar == null) {
                return;
            }
            hVar.a(false, "Invalid sessionId");
        } else {
            m a2 = a(str, hVar);
            if (a2 == null) {
                return;
            }
            a2.b(str2);
            a2.a(hVar);
            e.a(RVLLevel.Info, com.taobao.android.riverlogger.inspector.g.RVLModuleName).a("openRemote", a2.c()).a("server", (Object) str).a("sessionId", (Object) str2).a();
            com.taobao.android.riverlogger.inspector.e.a(a2);
        }
    }

    private static m a(String str, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("6a438737", new Object[]{str, hVar});
        }
        if (str == null) {
            if (hVar != null) {
                hVar.a(false, "Invalid server");
            }
            return null;
        } else if (str.startsWith("ws://") || str.startsWith("wss://")) {
            return new m(str);
        } else {
            if (hVar != null) {
                hVar.a(false, "WebSocket can only be created with ws or wss schemes");
            }
            return null;
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            com.taobao.android.riverlogger.inspector.e.a("user close");
        }
    }
}
