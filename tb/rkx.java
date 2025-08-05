package tb;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.tmall.android.dai.d;
import com.tmall.android.dai.internal.util.NetworkUtil;
import com.tmall.android.dai.internal.util.h;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rkx implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f33217a;
    private int b;
    private int c;

    static {
        kge.a(1266695106);
        kge.a(1914895581);
    }

    private String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : "android";
    }

    public rkx(Context context) {
        this.f33217a = context;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window);
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            this.b = displayMetrics.widthPixels;
            this.c = displayMetrics.heightPixels;
        }
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        com.taobao.mrt.utils.a.b("DeviceInfoTask", "params:" + map);
        HashMap hashMap = new HashMap();
        if (map != null) {
            String str = map.get("method_name");
            if ("get_model".equalsIgnoreCase(str)) {
                b = a();
            } else if ("get_os_name".equalsIgnoreCase(str)) {
                b = g();
            } else if ("get_os_version".equalsIgnoreCase(str)) {
                b = f();
            } else if (ErrorCode.NORMAL_GET_APP_VERSION.equalsIgnoreCase(str)) {
                b = e();
            } else if ("get_screen_width".equalsIgnoreCase(str)) {
                b = d();
            } else if ("get_screen_height".equalsIgnoreCase(str)) {
                b = c();
            } else {
                b = "get_net_status".equalsIgnoreCase(str) ? b() : "";
            }
            hashMap.put("info", b);
        }
        return hashMap;
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : Build.MODEL;
    }

    private String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : NetworkUtil.a(this.f33217a).value_name();
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        return this.b + "";
    }

    private String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        return this.c + "";
    }

    private String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : h.a(this.f33217a);
    }

    private String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : Build.VERSION.RELEASE;
    }
}
