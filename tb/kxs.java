package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;

/* loaded from: classes5.dex */
public class kxs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NdMultiWindowUtil: ";

    static {
        kge.a(-714165127);
    }

    public static boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8b715b", new Object[]{bVar})).booleanValue();
        }
        if (bVar == null) {
            return false;
        }
        bVar.a(System.currentTimeMillis());
        return true;
    }

    public static boolean b(b bVar) {
        int m;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("135177a", new Object[]{bVar})).booleanValue() : (bVar == null || (m = bVar.n().m()) == -1 || System.currentTimeMillis() - bVar.o() >= ((long) m)) ? false : true;
    }
}
