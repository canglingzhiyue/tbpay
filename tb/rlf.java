package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.themis.kernel.i;
import com.tmall.android.dai.d;
import com.tmall.android.dai.internal.util.a;
import com.tmall.android.dai.internal.util.b;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rlf implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RESULT_FAILURE = "0";
    public static final String RESULT_SUCCESS = "1";

    static {
        kge.a(1365175017);
        kge.a(1914895581);
    }

    @Override // com.tmall.android.dai.d
    public Map<String, String> onTask(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        String str = map.get("syncType");
        final String str2 = map.get("url");
        final int parseInt = Integer.parseInt(map.get("timeout")) * 1000;
        final JSONObject parseObject = JSON.parseObject(map.get(PushConstants.PARAMS));
        final String str3 = map.get("apiVersion");
        final int parseInt2 = Integer.parseInt(map.get("methodType"));
        HashMap hashMap = new HashMap();
        hashMap.put("success", "1");
        if (map.get(i.CDN_REQUEST_TYPE).equals("1")) {
            if (str.equals("1")) {
                b.b().a(new Runnable() { // from class: tb.rlf.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            rld.a(str2, str3, parseInt, parseObject, parseInt2);
                        }
                    }
                });
                return hashMap;
            }
            return rld.a(str2, str3, parseInt, parseObject, parseInt2);
        }
        a.a("DAI", 19999, "Net_Request_Only_Support_Mtop", str2, null, null);
        hashMap.put("success", "0");
        return hashMap;
    }
}
