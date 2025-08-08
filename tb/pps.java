package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.windvane.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class pps implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-55496296);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("doSwitchRequest");
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public boolean a(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("77d86ebd", new Object[]{this, str, str2, wVCallBackContext})).booleanValue() : a(str2, wVCallBackContext);
    }

    private boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        if (StringUtils.isEmpty(str)) {
            rVar.a("errorMessage", "params is empty");
            wVCallBackContext.error(rVar);
            return false;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSONObject.parseObject(str);
        } catch (Exception e) {
            lap.a("Bridge", "doSwitchRequest", "parse params exception:" + e.getMessage());
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            rVar.a("errorMessage", "params is empty");
            wVCallBackContext.error(rVar);
            return false;
        }
        String string = jSONObject.getString(ParamsConstants.Key.PARAM_SCENE_CODE);
        ghp a2 = ghp.a(jSONObject.getJSONObject("targetVersion"));
        if (a2 == null || StringUtils.isEmpty(a2.c)) {
            rVar.a("errorMessage", "versionCode is null");
            wVCallBackContext.error(rVar);
            return false;
        }
        ((ghm) ghi.a(ghm.class)).doChangeVersion(ghj.a().a(string).a(a2), new gho(com.taobao.android.editionswitcher.core.b.TRIGGER_REQUEST));
        wVCallBackContext.success();
        return true;
    }
}
