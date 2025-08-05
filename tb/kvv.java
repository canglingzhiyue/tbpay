package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.homepage.dinamic3.RecommendDxUserContext;
import com.taobao.login4android.api.Login;

/* loaded from: classes.dex */
public class kvv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETPARAMS = 6584495743641924598L;

    static {
        kge.a(624477828);
    }

    public static /* synthetic */ Object ipc$super(kvv kvvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String)) {
            return null;
        }
        String str = (String) objArr[0];
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -836030906) {
            if (hashCode != -632374500) {
                if (hashCode == 1766997507 && str.equals("mainContainerId")) {
                    c = 1;
                }
            } else if (str.equals("subContainerId")) {
                c = 2;
            }
        } else if (str.equals("userId")) {
            c = 0;
        }
        if (c == 0) {
            return Login.getUserId();
        }
        if (c == 1) {
            return oqc.a().l();
        }
        if (c != 2) {
            return null;
        }
        String a2 = a(dXRuntimeContext);
        return a2 == null ? oqc.a().m() : a2;
    }

    private String a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("890a6be7", new Object[]{this, dXRuntimeContext});
        }
        ba b = dXRuntimeContext.b();
        if (!(b instanceof RecommendDxUserContext)) {
            return null;
        }
        return ((RecommendDxUserContext) b).getStringValue("containerId");
    }
}
