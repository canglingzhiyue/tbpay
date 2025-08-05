package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import tb.iru;
import tb.iuh;
import tb.iuj;

/* loaded from: classes6.dex */
public abstract class irr<V extends View, IV extends iuj, IP extends iuh, MODEL extends iru<? extends a<? extends BaseSearchResult, ?>>, BEAN> extends iun<V, IV, IP, MODEL, BEAN> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1925775032);
    }

    public irr(Activity activity, ium iumVar, MODEL model, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, model, viewGroup, iurVar);
    }

    public irq I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (irq) ipChange.ipc$dispatch("565e98ce", new Object[]{this}) : new irq(getActivity(), this, (iru) getModel());
    }
}
