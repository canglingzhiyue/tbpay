package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ryy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33430a;
    private final List<String> b = new CopyOnWriteArrayList();

    static {
        kge.a(1816584593);
    }

    public static ryy a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ryy) ipChange.ipc$dispatch("ddc83a9e", new Object[]{jSONObject});
        }
        ryy ryyVar = new ryy();
        try {
            ryyVar.f33430a = jSONObject.getString("ab");
            JSONArray optJSONArray = jSONObject.optJSONArray("api");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String string = optJSONArray.getString(i);
                    if (!StringUtils.isEmpty(string)) {
                        ryyVar.b.add(string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return ryyVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f33430a;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.b.contains(str);
    }
}
