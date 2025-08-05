package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.d;
import com.tmall.android.dai.internal.util.LogUtil;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class rlc implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1471418872);
        kge.a(1914895581);
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            String str = map.get(noa.KEY_MODEL_NAME);
            String str2 = map.get("type");
            if (str2.equals("register")) {
                gsd.a().a(gsd.a().a(new JSONObject(map.get("config_str"))));
            } else if (MiPushClient.COMMAND_UNREGISTER.equals(str2)) {
                DAI.unregisterModel(str);
                z = true;
            }
        } catch (Throwable th) {
            LogUtil.e("ModelRegisterTask", th.toString(), th);
        }
        hashMap.put("result", "" + z);
        return hashMap;
    }
}
