package com.taobao.android.searchbaseframe.chitu;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(954777484);
    }

    public static boolean a(imn imnVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edf4cad2", new Object[]{imnVar})).booleanValue() : b("enableChituSE", imnVar);
    }

    public static String a(String str, imn imnVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e460f708", new Object[]{str, imnVar});
        }
        String string = imnVar.j().a().getString("config", "");
        if (string.equals("")) {
            return "";
        }
        try {
            jSONObject = new JSONObject(string);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        return optJSONObject == null ? "" : optJSONObject.optString("val");
    }

    public static boolean b(String str, imn imnVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42c808dd", new Object[]{str, imnVar})).booleanValue();
        }
        String string = imnVar.j().a().getString("config", "");
        if (string.equals("")) {
            return false;
        }
        try {
            jSONObject = new JSONObject(string);
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = new JSONObject();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        return optJSONObject != null && "true".equals(optJSONObject.optString("val"));
    }
}
