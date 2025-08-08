package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jlo extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 8;
    private static String c;
    public String b;

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    static {
        kge.a(-1237858448);
        c = "TSXStateExpression";
    }

    private jlo(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(8);
        } catch (Throwable th) {
            jkq.a(c, "parse TSXStateExpression error", th);
        }
    }

    public static jlo b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlo) ipChange.ipc$dispatch("e261801b", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@xstate.")) {
            return null;
        }
        return new jlo(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            if (StringUtils.isEmpty(this.b)) {
                return null;
            }
            String a2 = mtopsdk.xstate.a.a(this.b);
            String str = c;
            jkq.a(str, "parse xstate params = " + a2);
            return a2;
        } catch (Throwable th) {
            jkq.a(c, "parse xstate params error", th);
            return null;
        }
    }
}
