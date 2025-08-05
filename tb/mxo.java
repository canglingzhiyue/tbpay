package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes7.dex */
public class mxo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSISTANT_SWITCH_ENABLE = "assistant_switch_enable";
    public static final String CART_SWITCH_NAME = "mtb_setting_cart_sake_enable";
    public static final String JSON_SHAREDPREFERENCES = "json_sharedpreferences";
    public static final String OCR_SWITCH_NAME = "mtb_setting_ocr_enable";
    public static final String SKIN_BROADCAST_ACTION = "HomePassParamsUpdate";

    /* renamed from: a  reason: collision with root package name */
    private static int f31312a;

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        return true;
    }

    static {
        kge.a(330864140);
        f31312a = 0;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        int i = f31312a;
        if (i > 0) {
            return i;
        }
        int statusBarHeight = SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
        f31312a = statusBarHeight;
        return statusBarHeight;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : f() + DensityUtil.dip2px(Globals.getApplication(), 48.0f);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : Globals.getApplication().getSharedPreferences(JSON_SHAREDPREFERENCES, 0).getString(str, null);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str == null) {
        } else {
            SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences(JSON_SHAREDPREFERENCES, 0).edit();
            if (str2 == null) {
                edit.remove(str);
            } else {
                edit.putString(str, str2);
            }
            edit.commit();
        }
    }
}
