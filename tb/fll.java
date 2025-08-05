package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.b;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.view.feeds.d;
import java.util.List;

/* loaded from: classes5.dex */
public class fll extends flk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1111446587);
    }

    public static /* synthetic */ Object ipc$super(fll fllVar, String str, Object... objArr) {
        if (str.hashCode() == 873112184) {
            super.b((d) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fll(b bVar, fmd fmdVar, DetailDataManager detailDataManager, com.taobao.android.detail2.core.framework.view.manager.b bVar2, List<flr> list) {
        super(bVar, fmdVar, detailDataManager, bVar2, list);
    }

    @Override // tb.flk, com.taobao.android.detail2.core.framework.view.manager.ListViewManager.a
    public void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340aa278", new Object[]{this, dVar});
        } else {
            super.b(dVar);
        }
    }
}
