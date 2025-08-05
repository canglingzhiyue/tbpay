package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes.dex */
public class kwd extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_NAVEXTHEIGHT = -8921102620643851301L;

    static {
        kge.a(-391796139);
    }

    public static /* synthetic */ Object ipc$super(kwd kwdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        int statusBarHeight = Build.VERSION.SDK_INT >= 19 ? SystemBarDecorator.getStatusBarHeight(Globals.getApplication()) : 0;
        if (objArr == null || objArr.length == 0) {
            float a2 = a(dXRuntimeContext.m(), statusBarHeight);
            return a2 + "np";
        } else if (!(objArr[0] instanceof String)) {
            float a3 = a(dXRuntimeContext.m(), statusBarHeight);
            return a3 + "np";
        } else {
            float a4 = a(dXRuntimeContext.m(), statusBarHeight + (fpr.a(g.a(), 48.0f) - fpr.a(Globals.getApplication(), (String) objArr[0], 0)));
            return a4 + "np";
        }
    }

    private float a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a93", new Object[]{this, context, new Integer(i)})).floatValue() : (i / context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
