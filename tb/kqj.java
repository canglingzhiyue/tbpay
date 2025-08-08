package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.utils.Global;

/* loaded from: classes7.dex */
public class kqj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return a(jSONObject.getString("advImpTracking")) || b(jSONObject.getString("advClickTracking")) || c(jSONObject.getString("advEventTracking"));
        }
        lch.a("MunionTrackUtil", "argsJson is empty");
        return false;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            lch.a("MunionTrackUtil", "impJsonStr is empty");
            return false;
        }
        AlimamaAdvertising.instance().buildTanxImpTracking(Global.getApplication(), str).a("tb_splash").a();
        return true;
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            lch.a("MunionTrackUtil", "clickJsonStr is empty");
            return false;
        }
        AlimamaAdvertising.instance().buildTanxClickTracking(Global.getApplication(), str).a("tb_splash").a();
        return true;
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            lch.a("MunionTrackUtil", "interactJsonStr is empty");
            return false;
        }
        AlimamaAdvertising.instance().buildTanxEventTracking(Global.getApplication(), str).a("tb_splash").a();
        return true;
    }
}
