package com.huawei.hms.opendevice;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.huawei.hms.aaid.encrypt.PushEncrypter;
import com.huawei.hms.aaid.utils.PushPreferences;
import com.huawei.hms.support.log.HMSLog;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends PushPreferences {
    private static final String c = "i";
    private Context b;

    private i(Context context) {
        super(context, "push_client_self_info");
        this.b = context;
    }

    public static i a(Context context) {
        return new i(context);
    }

    public String a(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            return PushEncrypter.decrypter(this.b, getString(str));
        } catch (Exception e) {
            String str2 = c;
            HMSLog.e(str2, "getSecureData" + e.getMessage());
            return "";
        }
    }

    public void a() {
        Map<String, ?> all = getAll();
        if (all.isEmpty() || all.keySet().isEmpty()) {
            return;
        }
        for (String str : all.keySet()) {
            if (!"push_kit_auto_init_enabled".equals(str) && !"_proxy_init".equals(str)) {
                removeKey(str);
            }
        }
    }

    public boolean a(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            return saveString(str, PushEncrypter.encrypter(this.b, str2));
        } catch (Exception e) {
            String str3 = c;
            HMSLog.e(str3, "saveSecureData" + e.getMessage());
            return false;
        }
    }

    public String b(String str) {
        try {
            return StringUtils.isEmpty(str) ? a("token_info_v2") : a(str);
        } catch (Exception e) {
            String str2 = c;
            HMSLog.e(str2, "getSecureData" + e.getMessage());
            return "";
        }
    }

    public boolean b(String str, String str2) {
        try {
            return StringUtils.isEmpty(str) ? a("token_info_v2", str2) : a(str, str2);
        } catch (Exception e) {
            String str3 = c;
            HMSLog.e(str3, "saveSecureData" + e.getMessage());
            return false;
        }
    }

    public boolean c(String str) {
        try {
            return StringUtils.isEmpty(str) ? removeKey("token_info_v2") : removeKey(str);
        } catch (Exception e) {
            String str2 = c;
            HMSLog.e(str2, "removeToken" + e.getMessage());
            return false;
        }
    }
}
