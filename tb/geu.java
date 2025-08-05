package tb;

import android.content.pm.PackageManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.f;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.p;
import java.util.Map;

/* loaded from: classes.dex */
public class geu extends ggw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(467509660);
    }

    @Override // tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "env";
    }

    @Override // tb.ghe
    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        if (gfxVarArr == null || gfxVarArr.length == 0) {
            return gfx.e();
        }
        gfx gfxVar2 = gfxVarArr[0];
        if (!gfxVar2.k()) {
            return gfx.e();
        }
        String i2 = gfxVar2.i();
        if (i2.equals("platform")) {
            return gfx.a("Android");
        }
        if (i2.equals("isDarkMode")) {
            if (!DXDarkModeCenter.b() || !DXDarkModeCenter.a(dXRuntimeContext)) {
                z = false;
            }
            return gfx.a(z);
        } else if (i2.equals(f.IS_ELDER)) {
            return gfx.a(p.a());
        } else {
            if (i2.equals("platformdetail")) {
                return gfx.a("-1");
            }
            if (i2.equals("platformmodel")) {
                return gfx.a(Build.MODEL);
            }
            if (i2.equals("osversion")) {
                return gfx.a(Build.VERSION.INCREMENTAL);
            }
            if (i2.equals("appversion")) {
                if (dXRuntimeContext == null) {
                    return gfx.e();
                }
                if (dXRuntimeContext.m() == null) {
                    return gfx.e();
                }
                String str = null;
                try {
                    str = dXRuntimeContext.m().getPackageManager().getPackageInfo(dXRuntimeContext.m().getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                }
                return str == null ? gfx.e() : gfx.a(str);
            } else if (i2.equals("sdkversion")) {
                return gfx.a("4.1.27.18");
            } else {
                if (i2.equals("systemtime")) {
                    return gfx.a(String.valueOf(System.currentTimeMillis()));
                }
                if (i2.equals("deviceLevel")) {
                    return new get().execute(dXRuntimeContext, gfxVar, i, gfxVarArr, map);
                }
                if (i2.equals("isrtl")) {
                    if (Build.VERSION.SDK_INT >= 17 && DinamicXEngine.i().getResources().getConfiguration().getLayoutDirection() == 1) {
                        return gfx.a(true);
                    }
                    return gfx.a(false);
                }
                return gfx.e();
            }
        }
    }
}
