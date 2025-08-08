package tb;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jlh extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 8;
    public String b;

    static {
        kge.a(1041805139);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    private jlh(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(8);
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse TSIntentExpression error", th);
        }
    }

    public static jlh b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlh) ipChange.ipc$dispatch("e2617f42", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@intent.")) {
            return null;
        }
        return new jlh(str);
    }

    public String b(a aVar) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c78bb0", new Object[]{this, aVar});
        }
        try {
            Intent d = aVar.d();
            if (!StringUtils.isEmpty(this.b) && d != null && (extras = d.getExtras()) != null) {
                return extras.getString(this.b);
            }
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parse intent params error", th);
        }
        return null;
    }
}
