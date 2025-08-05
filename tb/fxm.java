package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.exception.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class fxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1535653816);
    }

    public static void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
        } else if (list == null) {
        } else {
            try {
                Iterator it = list.iterator();
                if (it == null) {
                    return;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof WeakReference) && ((WeakReference) next).get() == null) {
                        it.remove();
                    }
                }
            } catch (Exception e) {
                a.b(e);
            }
        }
    }
}
