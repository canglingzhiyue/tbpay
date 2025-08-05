package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.f;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.p;

/* loaded from: classes.dex */
public class fsf extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ISELDER = 4954175931783402831L;

    static {
        kge.a(-272317149);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : f.IS_ELDER;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext}) : Boolean.valueOf(p.a());
    }
}
