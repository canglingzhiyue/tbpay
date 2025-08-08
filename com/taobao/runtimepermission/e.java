package com.taobao.runtimepermission;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.a;
import com.taobao.taobao.R;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, String> f18988a = new HashMap<>();

    public e() {
        this.f18988a.put("android.permission.READ_CONTACTS", b.a(R.string.taobao_app_1040_1_23514));
        this.f18988a.put(com.taobao.speech.util.e.CAMERA, b.a(R.string.taobao_app_1040_1_23512));
        this.f18988a.put("android.permission.READ_PHONE_STATE", b.a(R.string.taobao_app_1040_1_23511));
        this.f18988a.put("android.permission.WRITE_EXTERNAL_STORAGE", b.a(R.string.taobao_app_1040_1_23510));
        this.f18988a.put("android.permission.ACCESS_COARSE_LOCATION", b.a(R.string.taobao_app_1040_1_23519));
        this.f18988a.put(a.ACCESS_FINE_LOCATION, b.a(R.string.taobao_app_1040_1_23519));
        this.f18988a.put("android.permission.RECORD_AUDIO", b.a(R.string.taobao_app_1040_1_23518));
        this.f18988a.put("android.permission.READ_EXTERNAL_STORAGE", b.a(R.string.taobao_app_1040_1_23510));
        this.f18988a.put("android.permission.WRITE_MEDIA_STORAGE", b.a(R.string.taobao_app_1040_1_23510));
        this.f18988a.put("android.permission.GET_ACCOUNTS", b.a(R.string.taobao_app_1040_1_23509));
    }

    public String a(Context context, String[] strArr, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efbd22f7", new Object[]{this, context, strArr, str});
        }
        if (!"com.taobao.taobao".equals(context.getPackageName()) || !StringUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArr) {
            if (str3 != null && (str2 = this.f18988a.get(str3)) != null && sb.indexOf(str2) < 0) {
                if (sb.length() != 0) {
                    sb.append("\n");
                }
                sb.append(str2);
            }
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        return str;
    }
}
