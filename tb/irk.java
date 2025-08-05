package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* loaded from: classes8.dex */
public class irk extends qmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-744408154);
    }

    @Override // tb.qmn
    public DXRootView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("fb6cf46d", new Object[]{this, context, str}) : pfx.a().a(context, str);
    }

    @Override // tb.qmn
    public void a(DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66865031", new Object[]{this, dXRootView, jSONObject, str});
        } else {
            pfx.a().a(dXRootView, jSONObject, null);
        }
    }
}
