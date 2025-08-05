package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.mytaobao.pagev2.dataservice.a;
import com.taobao.mytaobao.ultron.b;

/* loaded from: classes7.dex */
public class mwc extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_NAVISWITCH = 8678754278928656170L;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31294a;

    static {
        kge.a(400470764);
    }

    public mwc(boolean z) {
        this.f31294a = z;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean equals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (this.f31294a) {
            equals = !a.b();
        } else {
            equals = TextUtils.equals(b.a().d, "normal");
        }
        if (equals && !mxw.b()) {
            return true;
        }
        return false;
    }
}
