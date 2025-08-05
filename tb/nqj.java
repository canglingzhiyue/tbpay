package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.e;

/* loaded from: classes7.dex */
public abstract class nqj<BEAN extends ActivateTypedBean, MODEL extends e> extends itd<BEAN, MODEL> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public BEAN h;

    static {
        kge.a(-731634310);
    }

    @Override // tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "BaseActivateCellWidget";
    }

    public abstract void a(int i, BEAN bean);

    @Override // tb.itd
    public /* synthetic */ void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
        } else {
            b(i, (int) ((ActivateTypedBean) obj));
        }
    }

    public nqj(View view, Activity activity, ium iumVar, MODEL model) {
        super(view, activity, iumVar, ListStyle.LIST, 0, model);
    }

    public void b(int i, BEAN bean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb930ca1", new Object[]{this, new Integer(i), bean});
            return;
        }
        try {
            this.h = bean;
            a(i, (int) bean);
        } catch (Throwable th) {
            k.a("BaseActivateCellWidget", "render error", th);
        }
    }
}
