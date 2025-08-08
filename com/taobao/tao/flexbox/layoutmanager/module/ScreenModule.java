package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.view.Window;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import tb.kge;

/* loaded from: classes8.dex */
public class ScreenModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(774614258);
        kge.a(-818961104);
    }

    public static void setAlwaysOn(g.c cVar) {
        boolean booleanValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe9ca88", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject) || !(booleanValue = ((JSONObject) cVar.b).getBooleanValue("on")) || !(cVar.a() instanceof Activity)) {
        } else {
            ((Activity) cVar.a()).findViewById(16908290).setKeepScreenOn(booleanValue);
        }
    }

    public static void setBrightness(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95a6d65", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            float floatValue = ((JSONObject) cVar.b).getFloatValue("brightness");
            if (!(cVar.a() instanceof Activity)) {
                return;
            }
            Window window = ((Activity) cVar.a()).getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = floatValue;
            window.setAttributes(attributes);
        }
    }

    public static void setOrientation(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5dce90a", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            String string = ((JSONObject) cVar.b).getString("orientation");
            if (StringUtils.isEmpty(string) || !(cVar.a() instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) cVar.a();
            if (string.contains("landscape")) {
                activity.setRequestedOrientation(0);
            } else if ("portrait".equalsIgnoreCase(string)) {
                activity.setRequestedOrientation(1);
            } else if ("portraitUpsideDown".equalsIgnoreCase(string)) {
                activity.setRequestedOrientation(9);
            }
            cVar.c.a(cVar, jSONObject);
        }
    }
}
