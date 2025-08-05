package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public class fum extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1711953687);
    }

    public static /* synthetic */ Object ipc$super(fum fumVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object a2 = a(dXRuntimeContext);
        if (objArr == null || objArr.length == 0) {
            return a2;
        }
        if (objArr.length > 1) {
            return null;
        }
        Object obj = objArr[0];
        if (obj instanceof String) {
            return a((String) obj, a2, dXRuntimeContext);
        }
        return null;
    }

    public Object a(String str, Object obj, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b7c35a93", new Object[]{this, str, obj, dXRuntimeContext});
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, dmp.DELIMITER, false);
        while (stringTokenizer.hasMoreTokens()) {
            obj = a(dXRuntimeContext, obj, stringTokenizer.nextToken());
        }
        return obj;
    }

    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext != null) {
            return dXRuntimeContext.e();
        }
        return null;
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
