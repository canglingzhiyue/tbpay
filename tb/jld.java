package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class jld extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(820228103);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    public jld(String str) {
        this.f29616a = str;
    }

    public static jld b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jld) ipChange.ipc$dispatch("e2617ec6", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@foreachEncodeQuery")) {
            return null;
        }
        return new jld(str);
    }

    public JSONObject b(a aVar) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60e1210", new Object[]{this, aVar});
        }
        try {
            Uri b = aVar.b();
            if (b != null && (queryParameterNames = b.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                List<String> a2 = aVar.a();
                for (String str : queryParameterNames) {
                    if (a2 == null || !a2.contains(str)) {
                        jSONObject.put(str, (Object) b.getQueryParameter(str));
                    }
                }
                return jSONObject;
            }
            return null;
        } catch (Throwable th) {
            jkq.a(jku.TAG, "parseUrlParams error", th);
            return null;
        }
    }
}
