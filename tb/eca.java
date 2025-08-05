package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class eca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERR_MESSAGE_SHOW_COMMON_DIALOG_FAIL = "显示通用弹窗失败";
    public static final String KEY_SHOW_COMMON_DIALOG_FAIL = "showCommonDialogFail";
    public static final String KEY_SHOW_COMMON_DIALOG_POINT = "CommonDialog";
    public static final String TYPE_DETAIL2 = "Detail2.0";
    public static final String TYPE_DETAIL_1 = "Detail1.0";
    public static final String TYPE_DETAIL_AURA = "AuraDetail";
    public static final String TYPE_H5 = "H5";
    public static final String TYPE_UNKNOW = "Unkonw";

    static {
        kge.a(113980325);
        emu.a("com.taobao.android.detail.core.detail.profile.RenderMonitor");
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", ecg.g(context).f27185a);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "renderDetail", "downgrade", hashMap, "90001", str);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "renderDetail", "downgrade", hashMap, ecb.ERR_GETDETAIL_TIME_OUT, str2);
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = ecg.g(context).f27185a;
        }
        hashMap.put("itemId", str);
        hashMap.put("pageType", str3);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "renderDetail", "renderPage", hashMap, ecb.ERR_GETDETAIL_NETWORK, str2);
    }

    public static void b(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773e7c9d", new Object[]{context, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = ecg.g(context).f27185a;
        }
        hashMap.put("itemId", str);
        hashMap.put("pageType", str3);
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "renderDetail", "renderBottomBar", hashMap, ecb.ERR_GETDETAIL_NETWORK, str2);
    }

    public static void a(Context context, String str, Map<String, Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b99c525", new Object[]{context, str, map, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageType", str2);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        ecg.a(context, ecg.PERFORMANCE_BIZ_NAME, "renderDetail", "renderDxComponent", hashMap, ecb.ERR_GETDETAIL_NETWORK, str);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79908c52", new Object[]{context, str, str2, str3, str4, str5});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str3);
        hashMap.put("errorMsg", str5);
        hashMap.put("popId", str2);
        hashMap.put("renderType", str4);
        ecg.a(context, KEY_SHOW_COMMON_DIALOG_POINT, "renderDetail", "renderCommonDialog", hashMap, "showCommonDialogFail", str5);
    }

    public static void a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6fc7488", new Object[]{context, str, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("floatType", str);
        hashMap.put("itemId", str3);
        hashMap.put("popId", str2);
        hashMap.put("renderType", str4);
        ecg.e(context, KEY_SHOW_COMMON_DIALOG_POINT, "renderDetail", "renderCommonDialog", hashMap);
    }
}
