package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.qmt;
import tb.qmu;

/* loaded from: classes8.dex */
public abstract class qmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(462797377);
    }

    public abstract DXRootView a(Context context, String str);

    public abstract void a(DXRootView dXRootView, JSONObject jSONObject, String str);

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(qmv.DX_EVENT_TAOLIVEINTERACTCLICK, new qmv());
        dinamicXEngine.a(qmu.DXTLCOMPONENTPROGRESS_TLCOMPONENTPROGRESS, new qmu.a());
        dinamicXEngine.a(qmt.DXLIVESCROLLTEXTVIEW_LIVESCROLLTEXTVIEW, new qmt.a());
    }
}
