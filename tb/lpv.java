package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.login4android.api.Login;

/* loaded from: classes.dex */
public class lpv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETPARAMS = 6584495743641924598L;

    static {
        kge.a(-193239621);
    }

    public static /* synthetic */ Object ipc$super(lpv lpvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (a(objArr)) {
            return null;
        }
        String str = (String) objArr[0];
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -836030906) {
            if (hashCode == -632374500 && str.equals("subContainerId")) {
                c = 1;
            }
        } else if (str.equals("userId")) {
            c = 0;
        }
        if (c == 0) {
            return Login.getUserId();
        }
        if (c == 1) {
            return a(dXRuntimeContext);
        }
        return null;
    }

    private String a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("890a6be7", new Object[]{this, dXRuntimeContext});
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 != null) {
            return a2.a().a();
        }
        return null;
    }

    private boolean a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b63135cd", new Object[]{this, objArr})).booleanValue() : objArr == null || objArr.length == 0 || !(objArr[0] instanceof String);
    }
}
