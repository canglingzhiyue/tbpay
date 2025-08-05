package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavix.d;
import java.util.Map;

/* loaded from: classes4.dex */
public class dqq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "com.taobao.android.behavir.notify";
    public static final String ACTION_V2 = "BHRNotificationName";

    static {
        kge.a(-1047195745);
    }

    public static void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        Intent intent = new Intent(ACTION);
        JSONObject jSONObject = new JSONObject(map);
        intent.putExtra("data", jSONObject);
        a(intent);
        Intent intent2 = new Intent(ACTION_V2);
        intent2.putExtra("data", jSONObject);
        a(intent2);
    }

    public static void a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b3cea7", new Object[]{map, str});
            return;
        }
        Intent intent = new Intent(str);
        intent.putExtra("data", new JSONObject(map));
        a(intent);
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(d.b());
        if (Utils.a()) {
            localBroadcastManager.sendBroadcastSync(intent);
        } else {
            localBroadcastManager.sendBroadcast(intent);
        }
    }
}
