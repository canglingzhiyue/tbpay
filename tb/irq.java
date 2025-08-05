package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;

/* loaded from: classes6.dex */
public class irq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity c;
    public ium d;
    public iru<? extends a<? extends BaseSearchResult, ?>> e;
    public ViewGroup f;
    public iur g;

    static {
        kge.a(970291026);
    }

    public irq(Activity activity, ium iumVar, iru<? extends a<? extends BaseSearchResult, ?>> iruVar) {
        this.c = activity;
        this.d = iumVar;
        this.e = iruVar;
    }

    public irq a(iur iurVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irq) ipChange.ipc$dispatch("a0cfd28c", new Object[]{this, iurVar});
        }
        this.g = iurVar;
        return this;
    }

    public irq a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (irq) ipChange.ipc$dispatch("2329b097", new Object[]{this, viewGroup});
        }
        this.f = viewGroup;
        return this;
    }
}
