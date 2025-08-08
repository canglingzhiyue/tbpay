package tb;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.scancode.common.object.ScancodeType;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.scancode.gateway.util.j;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.MaType;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes8.dex */
public class oxy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ScancodeLog";

    /* renamed from: a  reason: collision with root package name */
    private static final String f32475a;

    static {
        kge.a(450431500);
        f32475a = Boolean.FALSE.toString();
    }

    public static boolean a(Context context, String str, css cssVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5b71bb", new Object[]{context, str, cssVar})).booleanValue();
        }
        Bundle bundle = new Bundle();
        bundle.putString("target_url", str);
        bundle.putString("comeFromType", "scan");
        return j.a(context, cssVar).a(bundle).a("http://m.taobao.com/scancode/browser");
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_scancode_client", "use_old_qr_nav", f32475a));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_anti_fraud_request", ""));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : "enable".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("image_search", "enable_barcode_qrcode_old_logic", "disable"));
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue() : StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_unify_history_processor", ""));
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_express_history", ""));
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_unknown_code_history", ""));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : !StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_old_uc_webview", ""));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : !StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_omit_outer_http_code", ""));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enable_qr_text_dialog", ""));
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "enableScanUtLogMapParam", ""));
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "createScanMtopBuilderInNewWay", ""));
    }

    private static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : StringUtils.isEmpty(OrangeConfig.getInstance().getConfig("image_search", "getScanTtidInNewWay", ""));
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (i()) {
            MtopConfig mtopConfig = Mtop.instance(Mtop.Id.INNER, context).getMtopConfig();
            if (mtopConfig != null) {
                return mtopConfig.ttid;
            }
            return TaoHelper.getTTID();
        }
        return TaoHelper.getTTID();
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    str = String.format(str, objArr);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        Log.e(TAG, str);
    }

    public static void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(obj, map);
            a(map == null ? "empty property" : map.toString(), new Object[0]);
        } catch (Throwable unused) {
        }
    }

    public static ScancodeType a(MaResult maResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScancodeType) ipChange.ipc$dispatch("227e2311", new Object[]{maResult});
        }
        if (maResult == null) {
            return null;
        }
        if (MaType.PRODUCT == maResult.getType()) {
            return ScancodeType.PRODUCT;
        }
        if (MaType.MEDICINE == maResult.getType()) {
            return ScancodeType.MEDICINE;
        }
        if (MaType.EXPRESS == maResult.getType()) {
            return ScancodeType.EXPRESS;
        }
        if (MaType.TB_ANTI_FAKE == maResult.getType()) {
            return ScancodeType.ANTI_FAKE;
        }
        if (MaType.GEN3 == maResult.getType()) {
            return ScancodeType.GEN3;
        }
        if (MaType.QR == maResult.getType()) {
            return ScancodeType.QR;
        }
        if (MaType.TB_4G == maResult.getType()) {
            return ScancodeType.TB_4G;
        }
        if (MaType.DM != maResult.getType()) {
            return null;
        }
        return ScancodeType.DM;
    }
}
