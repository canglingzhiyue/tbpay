package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cjm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ZolozBaseH5Handler";
    public static final String ZIM_IDENTIFY_GET_META_INFO = "getMetaInfo";

    static {
        kge.a(1194629366);
    }

    public void a(JSONObject jSONObject, Context context, cjl cjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26ddcab", new Object[]{this, jSONObject, context, cjlVar});
        } else if (jSONObject == null || context == null) {
        } else {
            BioLog.i(TAG, " jsapi" + jSONObject.toJSONString());
            String string = jSONObject.getString("action");
            if (StringUtil.isNullorEmpty(string) || cjlVar == null || !ZIM_IDENTIFY_GET_META_INFO.equals(string)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("metaInfo", (Object) cjf.b(context.getApplicationContext()));
            cjlVar.a(jSONObject2);
        }
    }
}
