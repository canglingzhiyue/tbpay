package tb;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.e;
import com.taobao.android.tschedule.parser.a;

/* loaded from: classes6.dex */
public class jlb extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SUB_INDEX = 7;
    public String b;

    static {
        kge.a(1546251845);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    public jlb(String str) {
        this.f29616a = str;
        try {
            this.b = str.substring(7);
        } catch (Throwable unused) {
        }
    }

    public static jlb b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlb) ipChange.ipc$dispatch("e2617e88", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@kvExt")) {
            return null;
        }
        return new jlb(str);
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
        a.InterfaceC0607a c = aVar.c(this.b);
        if (c != null && d != null) {
            try {
                JSONObject a2 = c.a(e.b(), d);
                if (a2 != null) {
                    return JSON.toJSONString(a2);
                }
                return null;
            } catch (Throwable th) {
                jkq.a(jku.TAG, "parse ext kv error", th);
            }
        }
        return null;
    }
}
