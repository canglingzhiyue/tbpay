package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes2.dex */
public class bms extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "tdPlatform";

    static {
        kge.a(1038599849);
    }

    public static /* synthetic */ Object ipc$super(bms bmsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception unused) {
            return null;
        }
    }

    private Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ebd01cf8", new Object[]{this, objArr, dXRuntimeContext});
        }
        String a2 = bmo.a(objArr, 1, new Class[]{String.class});
        if (!TextUtils.isEmpty(a2)) {
            throw new RuntimeException(a2);
        }
        if ("Android".equalsIgnoreCase(((String) objArr[0]).trim())) {
            return true;
        }
        return false;
    }
}
