package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.mytaobao.newsetting.business.model.PaySettingItem;
import com.taobao.mytaobao.ut.c;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mvo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TRACK_CLICK = "onClick";
    public static final String EVENT_TYPE_H5 = "h5";
    public static final String EVENT_TYPE_H5_KEY = "openUrl";
    public static final String EVENT_TYPE_NATIVE = "native";
    public static final String EVENT_TYPE_NATIVE_KEY = "nativeConfig";
    public static final String PACKAGE_INFO = "com.taobao.taobao";

    static {
        kge.a(1401190896);
    }

    public static void a(Context context, List<PaySettingItem.SettingsEvent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{context, list});
        } else if (list != null || list.size() > 0) {
            for (PaySettingItem.SettingsEvent settingsEvent : list) {
                if (settingsEvent != null && "onClick".equalsIgnoreCase(settingsEvent.track)) {
                    a(settingsEvent.userTrack);
                    if ("h5".equals(settingsEvent.type)) {
                        b(context, settingsEvent.data);
                    } else if ("native".equals(settingsEvent.type)) {
                        a(context, settingsEvent.data);
                    }
                }
            }
        }
    }

    private static void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{context, jSONObject});
        } else if (context != null && jSONObject != null && jSONObject.containsKey("nativeConfig")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("nativeConfig");
            String string = jSONObject2.getString("url");
            int i = -1;
            try {
                i = Integer.parseInt(jSONObject2.getString("requestCode"));
            } catch (Exception unused) {
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("data");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Intent intent = new Intent(string);
            intent.setPackage("com.taobao.taobao");
            if (jSONObject3 != null) {
                for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty(entry.getKey())) {
                        intent.putExtra(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
            }
            if ((context instanceof Activity) && i >= 0) {
                ((Activity) context).startActivityForResult(intent, i);
            } else {
                context.startActivity(intent);
            }
        }
    }

    private static void b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104666d1", new Object[]{context, jSONObject});
        } else if (context == null || jSONObject == null || !jSONObject.containsKey("openUrl")) {
        } else {
            String string = jSONObject.getJSONObject("openUrl").getString("url");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Nav.from(context).toUri(string);
        }
    }

    private static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (jSONObject == null) {
        } else {
            b(jSONObject);
        }
    }

    public static String a(int i, List<PaySettingItem> list) {
        JSONObject jSONObject;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cce35394", new Object[]{new Integer(i), list});
        }
        if (list != null && list.size() > 0) {
            for (PaySettingItem paySettingItem : list) {
                if (paySettingItem != null && paySettingItem.event != null) {
                    for (PaySettingItem.SettingsEvent settingsEvent : paySettingItem.event) {
                        if ("native".equals(settingsEvent.type) && settingsEvent.data != null && settingsEvent.data.containsKey("nativeConfig") && (jSONObject = settingsEvent.data.getJSONObject("nativeConfig")) != null && jSONObject.containsKey("requestCode")) {
                            try {
                                i2 = Integer.parseInt(jSONObject.getString("requestCode"));
                            } catch (Exception unused) {
                                i2 = 0;
                            }
                            if (i == i2) {
                                return jSONObject.getString("resultUrl");
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private static void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("params")) != null && !jSONObject2.isEmpty()) {
            String string = jSONObject2.getString("pageName");
            String string2 = jSONObject2.getString("controlName");
            String string3 = jSONObject2.getString("spm");
            String string4 = jSONObject2.getString("scm");
            String string5 = jSONObject2.getString("extra");
            JSONObject jSONObject3 = jSONObject2.getJSONObject(aw.PARAM_EXTEND);
            HashMap hashMap = new HashMap();
            if (jSONObject3 != null) {
                for (String str : jSONObject3.keySet()) {
                    if (!TextUtils.isEmpty(str)) {
                        String string6 = jSONObject3.getString(str);
                        if (!TextUtils.isEmpty(string6)) {
                            hashMap.put(str, string6);
                        }
                    }
                }
            }
            c.a(string, string2, string3, string4, string5, hashMap);
        }
    }
}
