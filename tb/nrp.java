package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.e;
import tb.itb;

/* loaded from: classes7.dex */
public class nrp<MODEL extends e> extends nqy<MODEL, ActivateTypedBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(497243229);
    }

    @Override // tb.nqy, tb.isz
    public /* synthetic */ itd a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("2329b686", new Object[]{this, viewGroup}) : c(viewGroup);
    }

    public nrp(Activity activity, ium iumVar, MODEL model) {
        super(npz.a().b(), ListStyle.LIST, activity, iumVar, model);
    }

    @Override // tb.nqy
    public jzd c(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzd) ipChange.ipc$dispatch("ba8b229", new Object[]{this, viewGroup});
        }
        itb.b bVar = new itb.b();
        bVar.f29303a = d();
        bVar.f = g();
        bVar.e = f();
        bVar.d = c();
        bVar.b = e();
        bVar.c = viewGroup;
        return nrv.CREATOR.a(bVar);
    }

    @Override // tb.nqy, tb.isz
    public itd b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itd) ipChange.ipc$dispatch("9768eee5", new Object[]{this, viewGroup}) : new nrs(d(), e(), c(), viewGroup, f(), (e) g());
    }
}
