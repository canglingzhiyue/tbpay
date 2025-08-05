package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.e;

/* loaded from: classes7.dex */
public class nrq extends itd<ActivateTypedBean, e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1160559353);
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "BaseSuggestCellWidget";
    }

    public void b(int i, ActivateTypedBean activateTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb930ca1", new Object[]{this, new Integer(i), activateTypedBean});
        }
    }

    public nrq(View view, Activity activity, ium iumVar, e eVar) {
        super(view, activity, iumVar, ListStyle.LIST, 0, eVar);
    }

    @Override // tb.itd
    public void a(int i, ActivateTypedBean activateTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7393ae42", new Object[]{this, new Integer(i), activateTypedBean});
            return;
        }
        try {
            b(i, activateTypedBean);
        } catch (Throwable th) {
            k.a("BaseSuggestCellWidget", "render error", th);
        }
    }
}
