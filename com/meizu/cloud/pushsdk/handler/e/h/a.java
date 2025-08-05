package com.meizu.cloud.pushsdk.handler.e.h;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.d.i;
import com.meizu.cloud.pushsdk.e.b.c;
import com.meizu.cloud.pushsdk.handler.e.h.b;
import java.io.File;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.joq;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f7981a = {"^MEIZU17(Pro)*$", "^MEIZU18(Pro)*$"};
    private static final String[] b = {"^.+$", "^.+$"};
    private com.meizu.cloud.pushsdk.handler.e.h.b c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static a f7982a = new a();
    }

    private a() {
    }

    public static a a() {
        return b.f7982a;
    }

    private synchronized com.meizu.cloud.pushsdk.handler.e.h.b a(Context context) {
        DebugLogger.i("PushConfig", "getPushConfigInfo start, mPushConfigInfo = " + this.c);
        com.meizu.cloud.pushsdk.handler.e.h.b bVar = this.c;
        if (bVar != null && bVar.d()) {
            DebugLogger.i("PushConfig", "getPushConfigInfo have cache and effective time, return directly");
            return this.c;
        }
        if (this.c == null) {
            com.meizu.cloud.pushsdk.handler.e.h.b b2 = b(context);
            this.c = b2;
            if (b2 != null) {
                DebugLogger.i("PushConfig", "getPushConfigInfo to load, mPushConfigInfo = " + this.c);
                return this.c;
            }
        }
        com.meizu.cloud.pushsdk.handler.e.h.b c = c(context);
        this.c = c;
        if (c != null) {
            DebugLogger.i("PushConfig", "getPushConfigInfo to network, mPushConfigInfo = " + this.c);
            return this.c;
        }
        this.c = b();
        DebugLogger.i("PushConfig", "getPushConfigInfo to default, mPushConfigInfo = " + this.c);
        return this.c;
    }

    private com.meizu.cloud.pushsdk.handler.e.h.b a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        DebugLogger.i("PushConfig", "analysis config jsonObjectValue = " + jSONObject);
        if (jSONObject == null) {
            return null;
        }
        try {
            com.meizu.cloud.pushsdk.handler.e.h.b bVar = new com.meizu.cloud.pushsdk.handler.e.h.b();
            if (jSONObject.has(joq.STAGE_NETWORK)) {
                bVar.a(jSONObject.getLong(joq.STAGE_NETWORK));
            }
            if (jSONObject.has("intervalHour")) {
                bVar.a(jSONObject.getInt("intervalHour"));
            }
            if (jSONObject.has("shieldPackage") && (jSONArray3 = jSONObject.getJSONArray("shieldPackage")) != null) {
                for (int i = 0; i < jSONArray3.length(); i++) {
                    bVar.a(jSONArray3.getString(i));
                }
            }
            if (jSONObject.has("whitePackage") && (jSONArray2 = jSONObject.getJSONArray("whitePackage")) != null) {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    bVar.b(jSONArray2.getString(i2));
                }
            }
            if (jSONObject.has("shieldConfig") && (jSONArray = jSONObject.getJSONArray("shieldConfig")) != null) {
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    if (jSONObject2 != null && jSONObject2.has("model") && jSONObject2.has("os")) {
                        bVar.a(new b.a(jSONObject2.getString("model"), jSONObject2.getString("os")));
                    }
                }
            }
            return bVar;
        } catch (Exception e) {
            DebugLogger.e("PushConfig", "analysis config error, " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    private void a(Context context, JSONObject jSONObject) {
        DebugLogger.i("PushConfig", "save local config jsonObjectValue = " + jSONObject);
        String jSONObject2 = jSONObject.toString();
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir != null) {
            com.meizu.cloud.pushsdk.notification.g.a.c(externalFilesDir.getPath() + "/push_config", jSONObject2);
        }
    }

    private boolean a(com.meizu.cloud.pushsdk.handler.e.h.b bVar) {
        if (bVar != null && bVar.a() != null) {
            String a2 = i.a("ro.product.model");
            String a3 = i.a("ro.build.display.id");
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3)) {
                for (int i = 0; i < bVar.a().size(); i++) {
                    b.a aVar = bVar.a().get(i);
                    if (aVar != null && !TextUtils.isEmpty(aVar.a()) && !TextUtils.isEmpty(aVar.b()) && a(aVar.a(), a2) && a(aVar.b(), a3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean a(com.meizu.cloud.pushsdk.handler.e.h.b bVar, String str) {
        if (!TextUtils.isEmpty(str) && bVar != null && bVar.b() != null) {
            for (int i = 0; i < bVar.b().size(); i++) {
                String str2 = bVar.b().get(i);
                if (!TextUtils.isEmpty(str2) && a(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String replace = str2.toLowerCase().replace(" ", "");
        if (lowerCase.startsWith("^") || lowerCase.endsWith("$")) {
            boolean matches = Pattern.compile(lowerCase).matcher(replace).matches();
            DebugLogger.i("PushConfig", lowerCase + " matches " + replace + " is " + matches);
            return matches;
        } else if (!lowerCase.equalsIgnoreCase(replace)) {
            return false;
        } else {
            DebugLogger.i("PushConfig", lowerCase + " equalsIgnoreCase " + replace + " is true");
            return true;
        }
    }

    private com.meizu.cloud.pushsdk.handler.e.h.b b() {
        com.meizu.cloud.pushsdk.handler.e.h.b bVar = new com.meizu.cloud.pushsdk.handler.e.h.b();
        bVar.a(System.currentTimeMillis());
        bVar.a(2);
        bVar.a("^com\\.(meizu|flyme)(\\..+)+$");
        String[] strArr = f7981a;
        String str = strArr[0];
        String[] strArr2 = b;
        bVar.a(new b.a(str, strArr2[0]));
        bVar.a(new b.a(strArr[1], strArr2[1]));
        return bVar;
    }

    private com.meizu.cloud.pushsdk.handler.e.h.b b(Context context) {
        com.meizu.cloud.pushsdk.handler.e.h.b a2 = a(d(context));
        if (a2 == null || !a2.d()) {
            return null;
        }
        return a2;
    }

    private boolean b(com.meizu.cloud.pushsdk.handler.e.h.b bVar, String str) {
        if (!TextUtils.isEmpty(str) && bVar != null && bVar.c() != null) {
            for (int i = 0; i < bVar.c().size(); i++) {
                String str2 = bVar.c().get(i);
                if (!TextUtils.isEmpty(str2) && a(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private com.meizu.cloud.pushsdk.handler.e.h.b c(Context context) {
        c c = com.meizu.cloud.pushsdk.e.a.a(PushConstants.GET_PUSH_CONFIG).a().c();
        if (c == null) {
            DebugLogger.e("PushConfig", "network request config fail");
            return null;
        }
        JSONObject jSONObject = (JSONObject) c.b();
        DebugLogger.i("PushConfig", "network request config result is:" + c.b());
        if (jSONObject != null) {
            try {
                if (jSONObject.has("code") && "200".equals(jSONObject.getString("code")) && jSONObject.has("value")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("value");
                    if (jSONObject2 == null) {
                        DebugLogger.e("PushConfig", "network request config fail");
                        return null;
                    }
                    jSONObject2.put(joq.STAGE_NETWORK, System.currentTimeMillis());
                    a(context, jSONObject2);
                    return a(jSONObject2);
                }
            } catch (Exception e) {
                DebugLogger.e("PushConfig", "network request config error, " + e.getMessage());
                e.printStackTrace();
                return null;
            }
        }
        DebugLogger.e("PushConfig", "network request config fail");
        return null;
    }

    private JSONObject d(Context context) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (externalFilesDir == null) {
            return null;
        }
        try {
            String c = com.meizu.cloud.pushsdk.notification.g.a.c(externalFilesDir.getPath() + "/push_config");
            if (!TextUtils.isEmpty(c)) {
                return new JSONObject(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean a(Context context, String str) {
        String str2;
        com.meizu.cloud.pushsdk.handler.e.h.b a2 = a(context);
        if (a2 == null) {
            str2 = "check message effective, pushConfigInfo is null";
        } else if (!b(a2, str)) {
            if (!a(a2, str) || !a(a2)) {
                return true;
            }
            DebugLogger.i("PushConfig", "check message effective, matching shield package success");
            return false;
        } else {
            str2 = "check message effective, matching white package success";
        }
        DebugLogger.i("PushConfig", str2);
        return true;
    }
}
