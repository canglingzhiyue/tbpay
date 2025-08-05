package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.mytaobao.pagev2.dataservice.a;
import com.taobao.mytaobao.ultron.b;

/* loaded from: classes7.dex */
public class mwd extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SKINSWITCH = -7288660920866700495L;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31295a;

    static {
        kge.a(506408449);
    }

    public static /* synthetic */ Object ipc$super(mwd mwdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mwd(boolean z) {
        this.f31295a = z;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return false;
        }
        String str = null;
        if (objArr.length > 0 && (objArr[0] instanceof String)) {
            str = (String) objArr[0];
        }
        String str2 = b.a().d;
        if (objArr.length > 1 && (objArr[1] instanceof String)) {
            if (this.f31295a) {
                z = a.b();
            } else {
                z = str2 != null && str2.equalsIgnoreCase((String) objArr[1]);
            }
            if (!z) {
                return false;
            }
            return Boolean.valueOf(a(str));
        }
        return Boolean.valueOf(a(str));
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        if ("useSkin".equalsIgnoreCase(str)) {
            return mxw.b();
        }
        return !mxw.b();
    }
}
