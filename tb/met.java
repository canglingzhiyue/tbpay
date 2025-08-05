package tb;

import android.app.Activity;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class met extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVIPADSCREENSIZE = 6916119436215133091L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && objArr != null && objArr.length != 0 && (objArr[0] instanceof String) && (dXRuntimeContext.m() instanceof Activity)) {
            String str = (String) objArr[0];
            if (pro.e(str)) {
                return null;
            }
            if ("width".equals(str)) {
                return Float.valueOf(gbg.a(dXRuntimeContext.m(), h.a().a(dXRuntimeContext.m())));
            }
            if ("height".equals(str)) {
                h.a().e(dXRuntimeContext.m());
                if (sdt.i(dXRuntimeContext.m())) {
                    if (Build.VERSION.SDK_INT >= 23 && sdt.a(dXRuntimeContext.m(), ((Activity) dXRuntimeContext.m()).getWindow().getDecorView().getRootWindowInsets())) {
                        e = sdt.f(dXRuntimeContext.m()) + sdt.h(dXRuntimeContext.m());
                    }
                    e = sdt.f(dXRuntimeContext.m());
                } else {
                    if (sdt.g(dXRuntimeContext.m())) {
                        e = sdt.e(dXRuntimeContext.m());
                    }
                    e = sdt.f(dXRuntimeContext.m());
                }
                return Float.valueOf(gbg.a(dXRuntimeContext.m(), e));
            }
        }
        return null;
    }
}
