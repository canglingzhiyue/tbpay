package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.view.feeds.a;

/* loaded from: classes5.dex */
public class fiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(331483460);
    }

    public static fiy a(b bVar, fmd fmdVar, ViewGroup viewGroup, fiy fiyVar, String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fiy) ipChange.ipc$dispatch("abfd0cd1", new Object[]{bVar, fmdVar, viewGroup, fiyVar, str, aVar});
        }
        if (fiyVar == null) {
            return "video".equals(str) ? new fja(bVar, fmdVar, viewGroup, aVar) : new fiv(fmdVar);
        } else if (!str.equals(fiyVar.a())) {
            return null;
        } else {
            return fiyVar;
        }
    }
}
