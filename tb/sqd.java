package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.windvane.b;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class sqd implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1619938944);
        kge.a(-1531379759);
    }

    @Override // com.taobao.tao.homepage.windvane.b
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : Collections.singletonList("scrollToPosition");
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
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject("popParam");
            IHomeSubTabController z = c.a().z();
            if (z == null) {
                wVCallBackContext.error();
                return false;
            }
            wVCallBackContext.success();
            String string = jSONObject.getString("index");
            int parseInt = TextUtils.isEmpty(string) ? 0 : Integer.parseInt(string);
            if (TextUtils.equals(jSONObject.getString("area"), "infoFlow")) {
                return z.smoothScrollToPositionFromInfoFlow(parseInt);
            }
            return false;
        } catch (Exception unused) {
            lap.a("Bridge", "scrollToItem", "params parse exception");
            wVCallBackContext.error();
            return false;
        }
    }
}
