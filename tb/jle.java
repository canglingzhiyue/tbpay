package tb;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.parser.a;
import java.util.List;

/* loaded from: classes6.dex */
public class jle extends jku {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-350127393);
    }

    @Override // tb.jku
    public /* synthetic */ Object a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c58f0dc1", new Object[]{this, aVar}) : b(aVar);
    }

    public jle(String str) {
        this.f29616a = str;
    }

    public static jle b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jle) ipChange.ipc$dispatch("e2617ee5", new Object[]{str, objArr});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith("@foreachIntent")) {
            return null;
        }
        return new jle(str);
    }

    public JSONObject b(a aVar) {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60e1210", new Object[]{this, aVar});
        }
        try {
            Intent d = aVar.d();
            if (d != null && (extras = d.getExtras()) != null && !extras.isEmpty()) {
                JSONObject jSONObject = new JSONObject();
                List<String> a2 = aVar.a();
                for (String str : extras.keySet()) {
                    if (a2 == null || !a2.contains(str)) {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            jSONObject.put(str, (Object) obj.toString());
                        }
                    }
                }
                return jSONObject;
            }
            return null;
        } catch (Throwable th) {
            jkq.a(jku.TAG, "foreachQueryIntent error", th);
            return null;
        }
    }
}
