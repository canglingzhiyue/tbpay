package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jll extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "@utabtest.";
    public static final int SUB_INDEX = 10;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(1705684233);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    private jll(String str) {
        this.f29616a = str;
        try {
            String[] split = str.substring(10).split(".");
            if (split.length < 3) {
                return;
            }
            this.b = split[0];
            this.c = split[1];
            this.d = split[2];
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse TSUtabtestExpression error", th);
        }
    }

    public static jll b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jll) ipChange.ipc$dispatch("e2617fbe", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith(PREFIX)) {
            return null;
        }
        return new jll(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        if (!TextUtils.isEmpty(this.b) && !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d)) {
            return jmi.a(this.b, this.c, this.d);
        }
        return null;
    }
}
