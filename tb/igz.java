package tb;

import android.content.Context;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.k;
import com.alibaba.android.split.u;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class igz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(Class<?> cls);
    }

    public static void a(Context context, String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b8a96b", new Object[]{context, str, str2, aVar});
            return;
        }
        u a2 = k.a();
        try {
            if (a2 == null) {
                ihc.a("SplitLoaderCompat is null", new Object[0]);
            } else if (a2.b().c(str).exists() && (h.a(context).a().contains(str) || a2.a(context, false, str))) {
                aVar.a(Class.forName(str2));
                return;
            }
        } catch (Exception e) {
            ihc.a(e.getMessage(), new Object[0]);
            e.printStackTrace();
        }
        aVar.a();
    }
}
