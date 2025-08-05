package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taolive.sdk.utils.y;

/* loaded from: classes8.dex */
public class pku extends qmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1547010388);
    }

    @Override // tb.qmn
    public DXRootView a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("fb6cf46d", new Object[]{this, context, str}) : pkt.c().a(context, str);
    }

    @Override // tb.qmn
    public void a(DXRootView dXRootView, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66865031", new Object[]{this, dXRootView, jSONObject, str});
            return;
        }
        Context context = dXRootView.getContext();
        DXRenderOptions dXRenderOptions = null;
        if (y.a() && y.e(context)) {
            DXRenderOptions.a aVar = new DXRenderOptions.a();
            aVar.a(DXWidgetNode.DXMeasureSpec.a(y.f(context), 1073741824));
            dXRenderOptions = aVar.a();
        }
        pkt.c().a(dXRootView, jSONObject, dXRenderOptions);
    }
}
