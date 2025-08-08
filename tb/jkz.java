package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jkz extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String b;

    static {
        kge.a(-385070966);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    private jkz(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(21);
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse TSUrlExpression error", th);
        }
    }

    public static jkz b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("e2617daf", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@decodeParamsFromUrl.")) {
            return null;
        }
        return new jkz(str);
    }

    public String b(a aVar) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            Uri b = aVar.b();
            if (!StringUtils.isEmpty(this.b) && b != null && (queryParameter = b.getQueryParameter(this.b)) != null) {
                return Uri.decode(queryParameter);
            }
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse url params error", th);
        }
        return null;
    }
}
