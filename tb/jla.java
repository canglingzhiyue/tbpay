package tb;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jla extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 5;
    public String b;

    static {
        kge.a(392109818);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    private jla(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(5);
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse TSExtExpression error", th);
        }
    }

    public static jla b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jla) ipChange.ipc$dispatch("e2617e69", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@ext")) {
            return null;
        }
        return new jla(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        if (StringUtils.isEmpty(this.b)) {
            return null;
        }
        Intent d = aVar.d();
        a.b d2 = aVar.d(this.b);
        if (d2 != null && d != null) {
            try {
                return d2.b(e.b(), d);
            } catch (Throwable th) {
                jkq.a(jku.TAG, "parse ext error", th);
            }
        }
        return null;
    }
}
