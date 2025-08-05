package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jlk extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 5;
    public String b;

    static {
        kge.a(708841672);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    private jlk(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(5);
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse TSUrlExpression error", th);
        }
    }

    public static jlk b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlk) ipChange.ipc$dispatch("e2617f9f", new Object[]{str, objArr});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("@url.")) {
            return null;
        }
        return new jlk(str);
    }

    public String b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            Uri b = aVar.b();
            if (!TextUtils.isEmpty(this.b) && b != null) {
                return b.getQueryParameter(this.b);
            }
            return null;
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse url params error", th);
            return null;
        }
    }
}
