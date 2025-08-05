package com.taobao.android.layoutmanager.module;

import android.content.Intent;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.b;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.h;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.jsbridge.p;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.CleanAnnotation;
import java.util.WeakHashMap;
import tb.kge;
import tb.ogg;

@CleanAnnotation(name = "clean")
/* loaded from: classes5.dex */
public class WindvaneModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WindvaneModule";
    private static WeakHashMap<ab, p> pluginManagerMap;

    public static /* synthetic */ WeakHashMap access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakHashMap) ipChange.ipc$dispatch("fff6ea32", new Object[0]) : pluginManagerMap;
    }

    static {
        kge.a(1752831834);
        kge.a(-818961104);
        pluginManagerMap = new WeakHashMap<>();
    }

    public static void postNotify(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362db66f", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            WVStandardEventCenter.postNotificationToJS(jSONObject.getString("name"), jSONObject.getString("args"));
        }
    }

    public static void call(final g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f41648ba", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            String string = jSONObject.containsKey("pluginName") ? jSONObject.getString("pluginName") : null;
            String string2 = jSONObject.containsKey(FluidException.METHOD_NAME) ? jSONObject.getString(FluidException.METHOD_NAME) : null;
            JSONObject jSONObject2 = jSONObject.containsKey("params") ? jSONObject.getJSONObject("params") : null;
            final h hVar = new h();
            hVar.d = string;
            hVar.e = string2;
            final p pVar = new p(cVar.a(), null);
            IJsApiFailedCallBack iJsApiFailedCallBack = new IJsApiFailedCallBack() { // from class: com.taobao.android.layoutmanager.module.WindvaneModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
                public void fail(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("534fc72f", new Object[]{this, str});
                        return;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", (Object) "FAILURE");
                    jSONObject3.put("result", (Object) str);
                    g.c.this.c.a(g.c.this, jSONObject3);
                    Object a2 = pVar.a(hVar.d);
                    if (a2 instanceof e) {
                        ((e) a2).onDestroy();
                    }
                    WindvaneModule.access$000().remove(g.c.this.f19938a);
                }
            };
            b bVar = new b() { // from class: com.taobao.android.layoutmanager.module.WindvaneModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.jsbridge.b
                public void a(String str) {
                    Object obj;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    try {
                        obj = JSON.parseObject(str);
                    } catch (Exception e) {
                        ogg.a(WindvaneModule.TAG, e.getMessage());
                        obj = str;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", (Object) "SUCCESS");
                    jSONObject3.put("result", obj);
                    g.c.this.c.a(g.c.this, jSONObject3);
                }

                @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
                public void succeed(String str) {
                    Object obj;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5b77b53", new Object[]{this, str});
                        return;
                    }
                    try {
                        obj = JSON.parseObject(str);
                    } catch (Exception e) {
                        ogg.a(WindvaneModule.TAG, e.getMessage());
                        obj = str;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", (Object) "SUCCESS");
                    jSONObject3.put("result", obj);
                    g.c.this.c.a(g.c.this, jSONObject3);
                    Object a2 = pVar.a(hVar.d);
                    if (a2 instanceof e) {
                        ((e) a2).onDestroy();
                    }
                    WindvaneModule.access$000().remove(g.c.this.f19938a);
                }
            };
            if (jSONObject2 != null) {
                try {
                    hVar.f = jSONObject2.toJSONString();
                } catch (Throwable th) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", (Object) "FAILURE");
                    jSONObject3.put("result", (Object) ("call windvane failed :" + th.getMessage()));
                    cVar.c.a(cVar, jSONObject3);
                    Object a2 = pVar.a(hVar.d);
                    if (a2 instanceof e) {
                        ((e) a2).onDestroy();
                    }
                    pluginManagerMap.remove(cVar.f19938a);
                    return;
                }
            }
            l.b().a(pVar, hVar, iJsApiFailedCallBack, bVar);
            pluginManagerMap.put(cVar.f19938a, pVar);
        }
    }

    public static void onActivityResult(ab abVar, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0874876", new Object[]{abVar, new Integer(i), new Integer(i2), intent});
            return;
        }
        p pVar = pluginManagerMap.get(abVar);
        if (pVar == null) {
            return;
        }
        pVar.a(i, i2, intent);
    }

    public static void clean(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f1097", new Object[]{abVar});
        } else {
            pluginManagerMap.remove(abVar);
        }
    }
}
