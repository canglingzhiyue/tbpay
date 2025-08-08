package tb;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.l;
import com.ut.device.UTDevice;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class isa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1204724536);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "result is empty";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("status");
            if (optJSONObject == null) {
                return "数据解析失败";
            }
            if (!optJSONObject.optString("code").equals("ok")) {
                return "网络请求失败";
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("deviceService");
            return optJSONObject2.optBoolean("result") ? b(optJSONObject2.optString("resultSign")) ? "success" : "安全校验失败" : "设备未注册";
        } catch (Exception unused) {
            return ExceptionUtils.ERROR_MSG_DATA_ERROR;
        }
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        return str.equals(l.a(l.a("CHITU_FLY_WITH_YOU") + UTDevice.getUtdid(imo.c())));
    }
}
