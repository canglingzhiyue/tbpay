package com.taobao.android.tab2liveroom.liveroom.preload;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import tb.kge;
import tb.ogg;

/* loaded from: classes6.dex */
public class TBLivePreloadModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBLivePreloadModule";
    private static boolean setPreloadConfigCalled;

    static {
        kge.a(120422117);
        kge.a(-818961104);
        setPreloadConfigCalled = false;
    }

    public static void setPreloadConfig(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a67b10f", new Object[]{cVar});
            return;
        }
        ogg.a(TAG, "setPreloadConfig start");
        if (!(cVar.b instanceof JSONObject)) {
            return;
        }
        setPreloadConfigInternal(cVar.a(), (JSONObject) cVar.b);
        setPreloadConfigCalled = true;
    }

    private static void setPreloadConfigInternal(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df4f6b5", new Object[]{context, jSONObject});
            return;
        }
        b.a().a(jSONObject);
        ogg.a(TAG, "setPreloadConfig：" + jSONObject.toJSONString());
    }

    public static void process(g.c cVar) {
        ViewGroup f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61282cc9", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            try {
                JSONObject jSONObject = (JSONObject) cVar.b;
                ogg.a(TAG, "TBLivePreloadModule.process被调用：" + jSONObject.toJSONString());
                Context a2 = cVar.a();
                if ((a2 instanceof Application) && (f = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().f()) != null) {
                    a2 = f.getContext();
                }
                if (!setPreloadConfigCalled) {
                    setPreloadConfigInternal(cVar.a(), jSONObject);
                }
                b a3 = b.a();
                if (!a3.b().a()) {
                    return;
                }
                ogg.a(TAG, "进入预加载逻辑");
                a3.a(a2, jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "enabled", (String) true);
                cVar.c.a(cVar, jSONObject2);
            } catch (Throwable th) {
                th.printStackTrace();
                ogg.a(TAG, th.getMessage());
            }
        }
    }
}
