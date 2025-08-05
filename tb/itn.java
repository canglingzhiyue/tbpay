package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;

/* loaded from: classes6.dex */
public abstract class itn extends ius<MuiseBean, FrameLayout, iru<? extends a<? extends BaseSearchResult, ?>>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean F;

    static {
        kge.a(-2084618943);
    }

    public itn(Activity activity, ium iumVar, iru<? extends a<? extends BaseSearchResult, ?>> iruVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, iruVar, viewGroup, iurVar);
        this.F = true;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }
}
