package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.layoutmanager.adapter.impl.s;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import tb.kge;

/* loaded from: classes5.dex */
public class FestivalModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(288732328);
        kge.a(-818961104);
    }

    public static void setFestivalStyle(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7166661", new Object[]{cVar});
        }
    }

    public static void isFestivalOn(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d214af37", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            boolean c = s.c();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFestivalOn", (Object) Boolean.valueOf(c));
            cVar.c.a(cVar, jSONObject);
        }
    }

    public static void festivalMode(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ad417d", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mode", (Object) Integer.valueOf(s.d()));
        cVar.c.a(cVar, jSONObject);
    }

    public static void getColor(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2827914b", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            jSONObject.getString("module");
            jSONObject.getString("key");
            jSONObject.getString(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("color", (Object) s.h());
            cVar.c.a(cVar, jSONObject2);
        }
    }

    public static void getText(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc713c15", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) cVar.b;
            jSONObject.getString("module");
            jSONObject.getString("key");
            String i = s.i();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", (Object) i);
            cVar.c.a(cVar, jSONObject2);
        }
    }

    public static void getFestival(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2430be2a", new Object[]{cVar});
        } else {
            cVar.c.a(cVar, s.b());
        }
    }
}
