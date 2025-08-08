package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.e;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mpo;

/* loaded from: classes7.dex */
public class mor implements mpo.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_LAST_LAUNCH_SESSION = "last_launch_session";

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31173a;

    public mor(boolean z) {
        this.f31173a = z;
    }

    @Override // tb.mpo.a
    public String a(File file, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e8673d7", new Object[]{this, file, str});
        }
        if (!file.getName().startsWith("startup")) {
            return str;
        }
        String a2 = a();
        if (StringUtils.isEmpty(a2)) {
            return str;
        }
        String name = file.getName();
        if (!name.endsWith(a2 + ".json")) {
            return str;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
            if (jSONObject3 != null && (jSONObject = jSONObject3.getJSONObject("properties")) != null) {
                jSONObject.put("processKilled", this.f31173a);
            }
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : e.a().b().getSharedPreferences("apm", 0).getString(KEY_LAST_LAUNCH_SESSION, "");
    }
}
