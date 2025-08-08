package tb;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.android.xsearchplugin.jarvis.utils.b;

/* loaded from: classes6.dex */
public class jxn extends jxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-849998134);
    }

    @Override // tb.jxm
    public void handleResult(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("246c0a04", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("action");
        if (StringUtils.isEmpty(string)) {
            k.a("BaseJarvisKitCallback", "action is not specified");
            return;
        }
        k.e("BaseJarvisKitCallback", "action:" + string + " received");
        String string2 = jSONObject.getString(JarvisConstant.KEY_ACTION_ID);
        JSONObject jSONObject2 = null;
        try {
            jSONObject2 = jSONObject.getJSONObject("result");
        } catch (Throwable th) {
            k.a("BaseJarvisKitCallback", "parse result failed", th);
        }
        if (jSONObject2 == null) {
            k.a("BaseJarvisKitCallback", sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            return;
        }
        jxt a2 = b.a(string, this.mJarvisWidget);
        if (a2 == null) {
            k.a("BaseJarvisKitCallback", "action " + string + " doesn't have processor");
            return;
        }
        try {
            a2.processAction(this.mJarvisWidget, jSONObject2, string2);
        } catch (Throwable th2) {
            if (this.mJarvisWidget.getCore().a().c()) {
                Activity activity = this.mJarvisWidget.getActivity();
                Toast.makeText(activity, "process action " + string + " failed", 0).show();
            }
            k.a("BaseJarvisKitCallback", th2.getMessage());
        }
    }
}
