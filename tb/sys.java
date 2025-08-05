package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.a;
import com.taobao.android.detail.ttdetail.communication.c;
import java.util.List;

/* loaded from: classes5.dex */
public class sys {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1922878817);
    }

    public static void a(Context context, List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{context, list});
            return;
        }
        for (a aVar : list) {
            if ((aVar instanceof h) && "user_track".equals(((h) aVar).b())) {
                c.a(context, aVar);
            }
        }
    }
}
