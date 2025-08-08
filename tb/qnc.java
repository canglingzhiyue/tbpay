package tb;

import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes8.dex */
public class qnc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(114157158);
    }

    public static int a(Context context) {
        if (context == null) {
            return 0;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            int i = displayMetrics.heightPixels > displayMetrics.widthPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels;
            int height = windowManager.getDefaultDisplay().getHeight();
            int width = windowManager.getDefaultDisplay().getWidth();
            if (height > width) {
                width = height;
            }
            return (int) ((i - width) / displayMetrics.density);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        if (str.contains("&" + str2 + "=")) {
            return str;
        }
        if (str.contains("?" + str2 + "=")) {
            return str;
        }
        if (str.contains("?")) {
            return str + "&" + str2 + "=" + str3;
        }
        return str + "?" + str2 + "=" + str3;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (parse != null && parse2 != null && StringUtils.equals(parse.getHost(), parse2.getHost())) {
                return true;
            }
        }
        return false;
    }
}
