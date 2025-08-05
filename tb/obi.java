package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.multiapp.ShareBizAdapter;

/* loaded from: classes8.dex */
public class obi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(396490064);
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_NEED_SHOW_AVATAR = "needShowAvatar";
        public static final String KEY_TAO_LONG_COPY = "taoLongCopy";
        public static final String PIIIC_QRCODE_COLOR = "qrcodeColor";
        public static final String PIIIC_QRCODE_URL = "qrcodeUrl";
        public static final String SHARE_PANNEL_QRCODE_COLOR = "qrcodeColor_sharePannel";

        static {
            kge.a(-274880943);
        }

        public static String a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
            }
            if (i == 1) {
                return obi.a("save_step_tip1", null);
            }
            if (i == 2) {
                return obi.a("save_step_tip2", null);
            }
            if (i == 3) {
                return obi.a("save_step_tip3", null);
            }
            if (i == 4) {
                return obi.a("save_step_tip4", null);
            }
            return null;
        }

        public static String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : obi.a("save_finish_icon", null);
        }

        public static int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : obi.a("save_progress_icon_color");
        }

        public static String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : obi.a("copy_tao_password", null);
        }

        public static String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : obi.a("guide_image_url", null);
        }

        public static String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : obi.a("new_guide_image_url", null);
        }

        public static String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : obi.a("weibo_default_url", null);
        }

        public static String g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[0]) : obi.a("piiic_bottom_guide_url", "https://gw.alicdn.com/tfs/TB1o9vAlFY7gK0jSZKzXXaikpXa-1125-398.png");
        }

        public static String h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[0]) : obi.a("taoLongTitle", "https://gw.alicdn.com/imgextra/i2/O1CN01GkunJo1NgqOdANpKT_!!6000000001600-2-tps-320-54.png");
        }

        public static String i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[0]) : obi.a("taoLongIcon", null);
        }

        public static String j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[0]) : obi.a("qrcode_scan_bottom_imageurl", "https://gw.alicdn.com/imgextra/i2/O1CN01Q7fSz922ZQDoaj0bJ_!!6000000007134-2-tps-300-190.png");
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-376196183);
        }

        public static int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : obi.a("button_text_color");
        }

        public static String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : obi.a("button_background_url", null);
        }

        public static int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : obi.a("display_name_color");
        }

        public static String d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : obi.a("anti_tao_password_tip", null);
        }

        public static String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : obi.a("anti_icon_url", null);
        }

        public static String f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : obi.a("anti_hijack_title", null);
        }

        public static int g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : obi.a("anti_hijack_button_color");
        }

        public static int h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[0])).intValue() : obi.a("anti_hijack_bg_color");
        }
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : a("price_color");
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : a("title_color");
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        String a2 = a(str, null);
        if (TextUtils.isEmpty(a2) || a2.charAt(0) != '#') {
            return -1;
        }
        try {
            return Color.parseColor(a2);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        String config = OrangeConfig.getInstance().getConfig("shareui_theme", str, str2);
        if (!TextUtils.isEmpty(config)) {
            return config;
        }
        try {
            Context applicationContext = ShareBizAdapter.getInstance().getAppEnv().b().getApplicationContext();
            Resources resources = applicationContext.getResources();
            String string = resources.getString(resources.getIdentifier(str, "string", applicationContext.getPackageName()));
            return TextUtils.isEmpty(string) ? str2 : string;
        } catch (Exception unused) {
            return str2;
        }
    }
}
