package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;

/* loaded from: classes4.dex */
public abstract class dzv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DrawableFactory";

    static {
        kge.a(-9125030);
        emu.a("com.taobao.android.detail.core.detail.kit.view.factory.impl.DrawableFactory");
    }

    public static void a(String str, Context context, int i, c.a aVar, dzv dzvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9911c147", new Object[]{str, context, new Integer(i), aVar, dzvVar});
        } else if (dzvVar != null) {
        } else {
            i.d("DrawableFactory", "DrawableFactory starts loading FILL-RESOLUTION image.");
            c b = epj.b();
            if (b == null) {
                return;
            }
            b.a(str, context, i, aVar);
        }
    }

    public static void a(String str, Context context, c.a aVar, dzv dzvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31df48fe", new Object[]{str, context, aVar, dzvVar});
        } else {
            a(str, context, -1, aVar, dzvVar);
        }
    }
}
