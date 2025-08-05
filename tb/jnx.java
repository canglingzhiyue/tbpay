package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jnx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FEATURES = "features";

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f29652a = new ConcurrentHashMap<>();

    /* loaded from: classes6.dex */
    public interface a {
        String a();
    }

    static {
        kge.a(-1621465805);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !jSONObject.isEmpty()) {
            try {
                for (Object obj : jSONObject.values()) {
                    if (obj instanceof JSONObject) {
                        b((JSONObject) obj);
                    }
                }
            } catch (Exception e) {
                UnifyLog.d("DataFeatureParser", e.toString());
            }
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09a25c7", new Object[]{this, aVar});
        } else if (aVar == null || TextUtils.isEmpty(aVar.a())) {
        } else {
            this.f29652a.put(aVar.a(), aVar);
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("features")) {
            try {
                Set<String> keySet = jSONObject.getJSONObject("features").keySet();
                if (keySet != null && !keySet.isEmpty()) {
                    for (String str : keySet) {
                        this.f29652a.get(str);
                    }
                }
            } catch (Exception e) {
                UnifyLog.d("DataFeatureParser", e.toString());
            }
        }
    }
}
