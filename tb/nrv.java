package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.WeexBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.WeexActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.e;
import tb.itb;

/* loaded from: classes7.dex */
public class nrv extends nqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<itb.b, jzd> CREATOR;
    private static int l;

    @Override // tb.nqn, tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "WeexSuggestCellViewHolder";
    }

    static {
        kge.a(1603446710);
        l = j.a(41.0f);
        CREATOR = new ise<itb.b, jzd>() { // from class: tb.nrv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public jzd<WeexActivateCellBean, e> a(itb.b bVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (jzd) ipChange.ipc$dispatch("f42feb6f", new Object[]{this, bVar}) : new nrv(bVar.f29303a, bVar.b, bVar.d, bVar.c, bVar.e, (e) bVar.f);
            }
        };
    }

    public nrv(Activity activity, ium iumVar, ListStyle listStyle, ViewGroup viewGroup, int i, e eVar) {
        super(activity, iumVar, listStyle, viewGroup, i, eVar);
    }

    @Override // tb.nqn, tb.jzd
    public int a(WeexBean weexBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ce43e6e", new Object[]{this, weexBean})).intValue() : l;
    }
}
