package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class kue {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILTER_KEY = "scanBizParams";

    static {
        kge.a(955785604);
    }

    public static void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{intent});
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String queryParameter = data.getQueryParameter(FILTER_KEY);
        ldf.d("DebugScanChannel", "requestParams: " + queryParameter);
        if (StringUtils.isEmpty(queryParameter)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = new HashMap(2);
        hashMap.put(FILTER_KEY, queryParameter);
        jSONObject.put("bizParam", (Object) hashMap);
        oqc.a().e(jSONObject);
    }
}
