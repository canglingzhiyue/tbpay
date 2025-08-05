package com.taobao.tbliveinteractive.jsbridge;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.qmo;
import tb.qnc;
import tb.qnh;

/* loaded from: classes8.dex */
public class f implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1540918010);
        kge.a(-1431965015);
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public boolean a(g gVar, com.taobao.tbliveinteractive.e eVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db80e171", new Object[]{this, gVar, eVar, str, str2})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void a(com.taobao.tbliveinteractive.e eVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e49447", new Object[]{this, eVar, hashMap});
        } else {
            qnh.a(eVar, "Show-interact", hashMap);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void a(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe4819", new Object[]{this, eVar, map});
            return;
        }
        String[] strArr = new String[map.size()];
        for (String str : map.keySet()) {
            if (strArr.length > i) {
                strArr[i] = str + "=" + map.get(str);
                i++;
            }
        }
        qnh.a(eVar, "interact", strArr);
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void a(final g gVar, final Context context, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fffa5a7", new Object[]{this, gVar, context, str, str2});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        boolean a2 = pmd.a().k().a(context, str, str2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("succ", (Object) Boolean.valueOf(a2));
                        gVar.a(jSONObject.toJSONString());
                    } catch (Error | Exception e) {
                        e.printStackTrace();
                        gVar.a();
                    }
                }
            });
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void a(final g gVar, final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a5a91d", new Object[]{this, gVar, context, str});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.tbliveinteractive.jsbridge.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Object a2 = pmd.a().k().a(context, str);
                        String str2 = a2 instanceof String ? (String) a2 : null;
                        JSONObject jSONObject = new JSONObject();
                        if (!TextUtils.isEmpty(str2)) {
                            z = true;
                        }
                        jSONObject.put("succ", (Object) Boolean.valueOf(z));
                        jSONObject.put("data", (Object) str2);
                        gVar.a(jSONObject.toJSONString());
                    } catch (Error | Exception e) {
                        e.printStackTrace();
                        gVar.a();
                    }
                }
            });
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public boolean a(final g gVar, com.taobao.tbliveinteractive.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("adbd64dd", new Object[]{this, gVar, eVar})).booleanValue();
        }
        if (eVar != null) {
            eVar.a(new com.taobao.tbliveinteractive.componentlist.c() { // from class: com.taobao.tbliveinteractive.jsbridge.f.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tbliveinteractive.componentlist.c
                public void a(JSONObject jSONObject) {
                    String jSONString;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    if (jSONObject == null) {
                        jSONString = "{}";
                    } else {
                        try {
                            jSONString = jSONObject.toJSONString();
                        } catch (Exception e) {
                            qnh.a("getComponentList_track", "errorCode=onSuccess " + e.toString());
                            gVar.b(" error onSuccessComponentListListener");
                            return;
                        }
                    }
                    gVar.a(jSONString);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    try {
                        gVar.a(netResponse.getBytedata() == null ? "{}" : new String(netResponse.getBytedata()));
                    } catch (Exception e) {
                        qnh.a("getComponentList_track", "errorCode=onSuccess " + e.toString());
                        g gVar2 = gVar;
                        gVar2.b("onSuccess" + i);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                        return;
                    }
                    try {
                        gVar.b(netResponse.getBytedata() == null ? "{}" : new String(netResponse.getBytedata()));
                        qnh.a("getComponentList_track", "errorCode=onError_" + i);
                    } catch (Exception e) {
                        qnh.a("getComponentList_track", "errorCode=onError_" + i + "_" + e.toString());
                        g gVar2 = gVar;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onError_");
                        sb.append(i);
                        gVar2.b(sb.toString());
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, obj);
                    }
                }
            }, false);
            return true;
        }
        qnh.a("getComponentList_track", "errorCode=manager is null");
        return false;
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void b(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd6e278", new Object[]{this, eVar, map});
        } else if (eVar == null || eVar.h() == null) {
        } else {
            eVar.h().h(map.get("componentName"), map);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public String c(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9176e0a9", new Object[]{this, eVar, map});
        }
        if (eVar == null || eVar.h() == null) {
            return "";
        }
        String str = map.get("name");
        return !TextUtils.isEmpty(str) ? eVar.h().d(str, map) : "";
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void d(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99881736", new Object[]{this, eVar, map});
        } else if (eVar == null || eVar.h() == null) {
        } else {
            String str = map.get("componentName");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            eVar.h().e(str, map);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void e(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c760b195", new Object[]{this, eVar, map});
        } else if (eVar == null || eVar.h() == null) {
        } else {
            String str = map.get("componentName");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            eVar.h().f(str, map);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void f(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5394bf4", new Object[]{this, eVar, map});
        } else if (eVar == null || eVar.h() == null) {
        } else {
            String str = map.get("componentName");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            eVar.h().c(str, map);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void g(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2311e653", new Object[]{this, eVar, map});
        } else if (eVar == null || eVar.h() == null) {
        } else {
            pnj m = pmd.a().m();
            m.a("interactUpdateEntranceView", "interactUpdateEntranceView " + map.get("name") + " " + map);
            eVar.h().a(map.get("name"), map);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void h(com.taobao.tbliveinteractive.e eVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ea80b2", new Object[]{this, eVar, map});
        } else if (eVar == null || eVar.h() == null) {
        } else {
            pnj m = pmd.a().m();
            m.a("interactUpdateEntranceAnimateView", "interactUpdateEntranceAnimateView " + map.get("name") + " " + map);
            eVar.h().b(map.get("name"), map);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            ddw.a().a("com.taobao.taolive.room.component.intimacy.update", str2, str);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue() : qnc.a(context);
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void a(com.taobao.tbliveinteractive.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e27dec", new Object[]{this, eVar});
        } else if (eVar == null || eVar.h() == null) {
        } else {
            eVar.h().f();
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void a(com.taobao.tbliveinteractive.e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86db297", new Object[]{this, eVar, new Integer(i)});
        } else if (eVar == null || eVar.d() == null) {
        } else {
            eVar.d().a(i);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void a(com.taobao.tbliveinteractive.e eVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742b47b3", new Object[]{this, eVar, strArr});
        } else if (eVar != null && eVar.d() != null && strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    eVar.d().a(l.a(str));
                }
            }
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void b(com.taobao.tbliveinteractive.e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c04f36", new Object[]{this, eVar, new Integer(i)});
        } else if (eVar == null || eVar.d() == null) {
        } else {
            eVar.d().b(i);
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public void b(com.taobao.tbliveinteractive.e eVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75619a92", new Object[]{this, eVar, strArr});
        } else if (eVar != null && eVar.d() != null && strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    eVar.d().b(l.a(str));
                }
            }
        }
    }

    @Override // com.taobao.tbliveinteractive.jsbridge.b
    public JSONObject a(com.taobao.tbliveinteractive.e eVar, Context context, String str) {
        qmo o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("22c26d46", new Object[]{this, eVar, context, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (eVar != null && (o = eVar.o()) != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -533971622) {
                if (hashCode != 252098227) {
                    if (hashCode == 868569800 && str.equals(ComponentGroupConfig.RIGHT_SIDE_INTERACTION_ENTRANCE)) {
                        c = 1;
                    }
                } else if (str.equals(ComponentGroupConfig.BOTTOM_GOOD_ENTRANCE)) {
                    c = 2;
                }
            } else if (str.equals(ComponentGroupConfig.TOP_INTIMACY_ENTRANCE)) {
                c = 0;
            }
            if (c == 0) {
                str = com.taobao.tbliveinteractive.view.system_component.f.TAG;
            } else if (c == 1) {
                str = com.taobao.tbliveinteractive.view.right_component.c.TAG;
            } else if (c == 2) {
                str = "goods";
            }
            View b = o.b(str);
            Rect rect = new Rect();
            if (b != null) {
                b.getGlobalVisibleRect(rect);
            }
            float f = 1.0f;
            if (context != null) {
                f = context.getResources().getDisplayMetrics().density;
            }
            jSONObject.put("x", (Object) Float.valueOf(rect.left / f));
            jSONObject.put("y", (Object) Float.valueOf(rect.top / f));
            jSONObject.put("width", (Object) Float.valueOf(rect.width() / f));
            jSONObject.put("height", (Object) Float.valueOf(rect.height() / f));
        }
        return jSONObject;
    }
}
