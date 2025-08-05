package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.Globals;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes7.dex */
public class mwa extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_STATUSBARHEIGHT = -2517623531547489759L;

    /* renamed from: a  reason: collision with root package name */
    private static String f31293a;

    static {
        kge.a(1284508882);
        f31293a = null;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (Build.VERSION.SDK_INT >= 19) {
            if (f31293a == null) {
                int statusBarHeight = SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
                f31293a = gbg.c(Globals.getApplication(), statusBarHeight) + "ap";
                String str = "statusBarHeightAp = " + f31293a;
            }
            return f31293a;
        }
        return 0;
    }
}
