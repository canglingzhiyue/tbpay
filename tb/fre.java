package tb;

import android.graphics.Color;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;

/* loaded from: classes.dex */
public class fre extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_COLORMAP = 1756245084560162885L;

    static {
        kge.a(145829174);
    }

    public static /* synthetic */ Object ipc$super(fre freVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "colorMap";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2 && objArr.length % 2 != 1 && DXDarkModeCenter.b()) {
            HashMap hashMap = new HashMap(5);
            for (int i = 0; i < objArr.length / 2; i++) {
                int i2 = i << 1;
                if (objArr[i2] instanceof String) {
                    int i3 = i2 + 1;
                    if (objArr[i3] instanceof String) {
                        hashMap.put((String) objArr[i2], Integer.valueOf(a((String) objArr[i3])));
                    }
                }
                return null;
            }
            if (hashMap.size() > 0) {
                return hashMap;
            }
        }
        return null;
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            Log.e("ParserLinearGradient", str + "parse Color failed. color miss");
            return -12303292;
        }
    }
}
