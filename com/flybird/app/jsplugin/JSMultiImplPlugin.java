package com.flybird.app.jsplugin;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface JSMultiImplPlugin {
    String getPluginDomain();

    String[] getPluginMethods();

    JSONObject handlePluginInvoke(String str, JSONObject jSONObject, Object obj);
}
