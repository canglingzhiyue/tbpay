package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class jlf extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(907282325);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    public jlf(String str) {
        this.f29616a = str;
    }

    public static jlf b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jlf) ipChange.ipc$dispatch("e2617f04", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@foreachQuery")) {
            return null;
        }
        return new jlf(str);
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
                        String queryParameter = b.getQueryParameter(str);
                        if (!StringUtils.isEmpty(queryParameter)) {
                            String encode = Uri.encode(queryParameter);
                            jkq.a(jku.TAG, "origin value = " + queryParameter + "; encode value = " + encode);
                            jSONObject.put(str, (Object) encode);
                        }
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
