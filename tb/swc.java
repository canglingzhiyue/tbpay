package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.prefork.a;

/* loaded from: classes7.dex */
public class swc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1892719545);
    }

    public static Context a(Context context) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a75aa358", new Object[]{context});
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof fpz) {
            context2 = ((fpz) context).a();
        } else if (context instanceof a) {
            context2 = ((a) context).a();
        } else {
            ldf.d("ConStringUtils", "getRealActivityContext in else, activityContext is null");
            context2 = null;
        }
        if (!(context2 instanceof Activity)) {
            return null;
        }
        return context2;
    }
}
