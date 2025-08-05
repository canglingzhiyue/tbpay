package tb;

import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes6.dex */
public class hwc extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GET_STATUS_BAR_HEIGHT = -8012456084283088572L;

    /* renamed from: a  reason: collision with root package name */
    private int f28825a = 0;
    private int b = 0;

    static {
        kge.a(-22499118);
    }

    public static /* synthetic */ Object ipc$super(hwc hwcVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        hyn.a("DXDataParserGetStatusBa", "evalWithArgs", "----");
        if (this.f28825a == 0 && Build.VERSION.SDK_INT >= 19) {
            this.b = SystemBarDecorator.getStatusBarHeight(dXRuntimeContext.m());
            this.f28825a = a(dXRuntimeContext.m(), this.b);
        }
        if (objArr != null && objArr.length == 1 && (objArr[0] instanceof String)) {
            int a2 = this.b + gbg.a(dXRuntimeContext.D(), dXRuntimeContext.m(), (String) objArr[0], 0);
            return a(dXRuntimeContext.m(), a2) + "np";
        }
        hyn.a("DXDataParserGetStatusBa", "evalWithArgs", "statusBarHeightDp = " + this.f28825a);
        return this.f28825a + "np";
    }

    private int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{this, context, new Float(f)})).intValue() : (int) (f / context.getResources().getDisplayMetrics().density);
    }
}
