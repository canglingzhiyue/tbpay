package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taolive.sdk.utils.y;

/* loaded from: classes6.dex */
public class nlq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-521658381);
    }

    public static DXRenderOptions a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRenderOptions) ipChange.ipc$dispatch("4683f7f0", new Object[]{context});
        }
        if (!y.a() || !y.e(context)) {
            return null;
        }
        DXRenderOptions.a aVar = new DXRenderOptions.a();
        aVar.a(DXWidgetNode.DXMeasureSpec.a(y.f(context), 1073741824));
        aVar.b(y.g(context));
        return aVar.a();
    }
}
