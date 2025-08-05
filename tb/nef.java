package tb;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.f;
import com.taobao.pha.core.model.ManifestModel;

/* loaded from: classes.dex */
public class nef implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31381a;

    static {
        kge.a(-293464381);
        kge.a(-464442597);
        f31381a = nef.class.getSimpleName();
    }

    @Override // com.taobao.pha.core.f
    public void a(AppController appController, String str, JSONObject jSONObject) {
        ManifestModel u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb016330", new Object[]{this, appController, str, jSONObject});
            return;
        }
        char c = 65535;
        if (str.hashCode() == 1684195556 && str.equals("pageappear")) {
            c = 0;
        }
        if (c != 0 || (u = appController.u()) == null || !u.enablePopLayer) {
            return;
        }
        String string = jSONObject.getString("pageUrl");
        String string2 = jSONObject.getString("pageId");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            ngr.b(f31381a, "PopLayer param is null.");
            return;
        }
        Intent intent = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, "PHA_" + string2);
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, string);
        LocalBroadcastManager.getInstance(appController.C()).sendBroadcast(intent);
    }
}
