package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import java.io.Serializable;
import tb.kge;
import tb.oeb;
import tb.oec;

/* loaded from: classes8.dex */
public class NotifyModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-371840497);
        kge.a(-818961104);
    }

    private static boolean checkNotifyValid(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6129272", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof ab.c) {
            return ((ab.c) obj).isAlive();
        }
        return !(obj instanceof Activity) || !((Activity) obj).isFinishing();
    }

    public static void postNotify(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("362db66f", new Object[]{cVar});
        } else if (cVar.b instanceof JSONObject) {
            String string = ((JSONObject) cVar.b).getString("name");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Intent intent = new Intent(string);
            JSONObject jSONObject = ((JSONObject) cVar.b).getJSONObject("args");
            if (oec.a(((JSONObject) cVar.b).get("appear"), false) && !checkNotifyValid(cVar.f19938a.g())) {
                return;
            }
            if (jSONObject != null && jSONObject.keySet() != null) {
                for (String str : jSONObject.keySet()) {
                    putIntentExtra(intent, str, jSONObject.get(str));
                }
            }
            if (cVar == null) {
                return;
            }
            if (cVar.f19938a != null) {
                cVar.f19938a.k().a(intent);
            } else {
                LocalBroadcastManager.getInstance(ab.a()).sendBroadcast(intent);
            }
        }
    }

    private static void putIntentExtra(Intent intent, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939caf", new Object[]{intent, str, obj});
        } else if (obj == null) {
        } else {
            if (obj instanceof Integer) {
                intent.putExtra(str, ((Integer) obj).intValue());
            } else if (obj instanceof Float) {
                intent.putExtra(str, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                intent.putExtra(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                intent.putExtra(str, ((Long) obj).longValue());
            } else if (obj instanceof Short) {
                intent.putExtra(str, ((Short) obj).shortValue());
            } else if (obj instanceof String) {
                intent.putExtra(str, (String) obj);
            } else if (obj instanceof CharSequence) {
                intent.putExtra(str, (CharSequence) obj);
            } else if (obj instanceof Character) {
                intent.putExtra(str, ((Character) obj).charValue());
            } else if (obj instanceof Boolean) {
                intent.putExtra(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                intent.putExtra(str, ((Byte) obj).byteValue());
            } else if (oeb.S() && (obj instanceof Serializable)) {
                intent.putExtra(str, (Serializable) obj);
            } else {
                intent.putExtra(str, obj.toString());
            }
        }
    }

    public static void onNotify(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e410650", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            String string = ((JSONObject) cVar.b).getString("name");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            cVar.f19938a.k().a(string, cVar);
        }
    }

    public static void offNotify(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2724c0", new Object[]{cVar});
        } else if (!(cVar.b instanceof JSONObject)) {
        } else {
            String string = ((JSONObject) cVar.b).getString("name");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            cVar.f19938a.k().b(string, cVar);
        }
    }
}
