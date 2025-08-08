package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.g;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jli extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@pageurl.";
    public static final int SUB_INDEX = 9;
    public String b;

    static {
        kge.a(-917559815);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    private jli(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(9);
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse TSPageUrlExpression error", th);
        }
    }

    public static jli b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jli) ipChange.ipc$dispatch("e2617f61", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith(PREFIX)) {
            return null;
        }
        return new jli(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        if (!StringUtils.isEmpty(this.b)) {
            return g.a(this.b);
        }
        return null;
    }
}
