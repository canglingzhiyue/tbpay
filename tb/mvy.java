package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.festival.FestivalMgr;

/* loaded from: classes7.dex */
public class mvy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MTBFESTIVAL = 4282954739673014924L;

    /* renamed from: a  reason: collision with root package name */
    private String f31292a;
    private String b;
    private String c;
    private long d;

    static {
        kge.a(939056317);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            try {
                String obj = objArr[0].toString();
                String obj2 = objArr[1].toString();
                String obj3 = objArr.length > 2 ? objArr[2].toString() : null;
                if (mxz.f31319a && this.c != null && System.currentTimeMillis() - this.d <= 1000 && StringUtils.equals(this.f31292a, obj) && StringUtils.equals(this.b, obj2)) {
                    return this.c;
                }
                String a2 = FestivalMgr.a().a(obj, obj2);
                this.f31292a = obj;
                this.b = obj2;
                this.d = System.currentTimeMillis();
                if (StringUtils.isEmpty(a2)) {
                    this.c = obj3;
                    return obj3;
                }
                this.c = a2;
                return a2;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
