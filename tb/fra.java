package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class fra extends frr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(643871611);
    }

    @Override // tb.frr, tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "array_contains";
    }
}
