package com.zoloz.android.phone.zdoc.ui;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, SpecialUiTypeInfo> f24760a;
    private static String b;

    static {
        kge.a(-2112737036);
        f24760a = null;
        b = null;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            a(context, false);
        }
    }

    public static void a(Context context, boolean z) {
        HashMap<String, SpecialUiTypeInfo> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{context, new Boolean(z)});
        } else if (!z && (hashMap = f24760a) != null && !hashMap.isEmpty()) {
        } else {
            byte[] assetsData = FileUtil.getAssetsData(context.getApplicationContext().getResources(), "special_ui_type.json");
            String str = assetsData != null ? new String(assetsData) : "";
            if (!TextUtils.isEmpty(str)) {
                f24760a = (HashMap) JSON.parseObject(str, new TypeReference<HashMap<String, SpecialUiTypeInfo>>() { // from class: com.zoloz.android.phone.zdoc.ui.a.1
                }, new Feature[0]);
            }
            if (f24760a != null) {
                return;
            }
            f24760a = new HashMap<>();
        }
    }

    public static int a(Context context, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26f226e9", new Object[]{context, new Integer(i), str, new Integer(i2)})).intValue();
        }
        int b2 = b(context, "layout_manual_" + i, "layout");
        if (b2 == 0) {
            b2 = a(context, a(str, i2));
        }
        if (b2 == 0) {
            b2 = a(context, String.valueOf(i));
        }
        return b2 == 0 ? R.layout.layout_manual_stand_frame : b2;
    }

    private static String a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{str, new Integer(i)});
        }
        return str + "_" + i;
    }

    public static int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{context, str})).intValue();
        }
        a(context);
        SpecialUiTypeInfo specialUiTypeInfo = f24760a.get(str);
        if (specialUiTypeInfo == null) {
            return 0;
        }
        return b(context, specialUiTypeInfo.getLayout(), "layout");
    }

    public static String b(Context context, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c09542b", new Object[]{context, new Integer(i), str, new Integer(i2)});
        }
        a(context);
        SpecialUiTypeInfo specialUiTypeInfo = f24760a.get(a(str, i2));
        if (specialUiTypeInfo == null) {
            specialUiTypeInfo = f24760a.get(Integer.valueOf(i));
        }
        if (specialUiTypeInfo == null) {
            return a(context, "main_message_", String.valueOf(i));
        }
        return b(context, specialUiTypeInfo.getTestResId());
    }

    public static String c(Context context, int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7cacfec", new Object[]{context, new Integer(i), str, new Integer(i2)});
        }
        String str2 = "zdoc_capture_";
        if (i != 0 && i == 1) {
            str2 = "zdoc_confirm_";
        }
        String b2 = b(context, str2 + str + "_" + i2);
        if (!TextUtils.isEmpty(b2)) {
            return b2;
        }
        if (i == 0) {
            return context.getResources().getString(R.string.zdoc_capture);
        }
        return i == 1 ? context.getResources().getString(R.string.zdoc_confirm) : b2;
    }

    private static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        return b(context, str + str2);
    }

    private static String b(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1da50fb7", new Object[]{context, str}) : c(context, str);
    }

    private static String c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b6487b8", new Object[]{context, str});
        }
        try {
            return context.getResources().getString(b(context, str, "string"));
        } catch (Exception e) {
            BioLog.e(e);
            return "";
        }
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31400281", new Object[]{context}) : context == null ? "" : context.getResources().getString(R.string.zdoc_processing);
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context}) : context == null ? "" : context.getResources().getString(R.string.zdoc_success);
    }

    private static int b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bbd7186", new Object[]{context, str, str2})).intValue();
        }
        String str3 = b;
        if (TextUtils.isEmpty(str3)) {
            str3 = context.getPackageName();
        }
        return context.getResources().getIdentifier(str, str2, str3);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        HashMap<String, SpecialUiTypeInfo> hashMap = f24760a;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }
}
