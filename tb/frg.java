package tb;

import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.NotificationManagerCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class frg extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DX_ENV = 9060459234603530L;

    static {
        kge.a(923902652);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "dx_env";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            String lowerCase = ((String) obj).toLowerCase();
            if (lowerCase.equals("platform")) {
                return "1";
            }
            if (lowerCase.equals("platformdetail")) {
                return "-1";
            }
            if (lowerCase.equals("platformmodel")) {
                return Build.MODEL;
            }
            if (lowerCase.equals("osversion")) {
                return Build.VERSION.INCREMENTAL;
            }
            if (lowerCase.equals("systemnotifyenable")) {
                try {
                    return String.valueOf(NotificationManagerCompat.from(dXRuntimeContext.m()).areNotificationsEnabled());
                } catch (Exception unused) {
                    return "false";
                }
            } else if (lowerCase.equals("appversion")) {
                if (dXRuntimeContext == null || dXRuntimeContext.m() == null) {
                    return null;
                }
                try {
                    return dXRuntimeContext.m().getPackageManager().getPackageInfo(dXRuntimeContext.m().getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    return null;
                }
            } else if (lowerCase.equals("sdkversion")) {
                return "4.1.27.18";
            } else {
                if (lowerCase.equals("systemtime")) {
                    return String.valueOf(System.currentTimeMillis());
                }
            }
        }
        return null;
    }
}
