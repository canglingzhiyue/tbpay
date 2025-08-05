package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class mvv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_COLORPARSE = 8562985172480150788L;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Boolean> f31290a;

    static {
        kge.a(-68041402);
        f31290a = new HashMap();
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2 && (objArr[0] instanceof String) && (objArr[1] instanceof String)) {
            try {
                String str = String.valueOf(objArr[0]) + String.valueOf(objArr[1]);
                if (TextUtils.equals("LightColor", String.valueOf(objArr[0]))) {
                    String valueOf = String.valueOf(objArr[1]);
                    if (f31290a.containsKey(str)) {
                        return f31290a.get(str);
                    }
                    boolean a2 = mxh.a(Color.parseColor(valueOf));
                    f31290a.put(str, Boolean.valueOf(a2));
                    return Boolean.valueOf(a2);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
