package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class fur extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1901218679);
    }

    public static /* synthetic */ Object ipc$super(fur furVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object f = dXRuntimeContext.f();
        if (objArr != null && objArr.length != 0) {
            if (objArr.length > 1) {
                return null;
            }
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer((String) obj, dmp.DELIMITER, false);
            while (stringTokenizer.hasMoreTokens()) {
                f = a(dXRuntimeContext, f, stringTokenizer.nextToken());
            }
        }
        return f;
    }

    private Object a(DXRuntimeContext dXRuntimeContext, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f5243d13", new Object[]{this, dXRuntimeContext, obj, str});
        }
        if (obj != null && str != null) {
            return fuj.a(dXRuntimeContext, obj, str);
        }
        return null;
    }
}
