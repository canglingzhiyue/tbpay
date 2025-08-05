package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jky extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String b;

    public static /* synthetic */ Object ipc$super(jky jkyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    static {
        kge.a(-466817303);
        b = "TSMarketUaExpression";
    }

    private jky(String str) {
        this.f29616a = str;
    }

    public static jky b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jky) ipChange.ipc$dispatch("e2617d90", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@hcUA")) {
            return null;
        }
        return new jky(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            String a2 = a();
            String str = b;
            jkq.a(str, "parse hcUA params = " + a2);
            return a2;
        } catch (Throwable th) {
            jkq.a(b, "parse hcUA params error", th);
            return null;
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        String h = android.taobao.windvane.config.a.a().h();
        String i = android.taobao.windvane.config.a.a().i();
        String str = "Prefetch/Nav";
        if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(i)) {
            str = str + " AliApp(" + h + "/" + i + riy.BRACKET_END_STR;
        }
        if (!str.contains("TTID/") && !TextUtils.isEmpty(android.taobao.windvane.config.a.a().b())) {
            str = str + " TTID/" + android.taobao.windvane.config.a.a().b();
        }
        return str + " WindVane/8.3.0";
    }
}
