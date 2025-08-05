package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class frb extends fru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-518231942);
    }

    @Override // tb.fru, tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "array_get";
    }
}
