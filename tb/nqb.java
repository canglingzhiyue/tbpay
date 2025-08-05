package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.e;

/* loaded from: classes7.dex */
public class nqb<MODEL extends e> extends nqy<MODEL, ActivateTypedBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1811852297);
    }

    public static /* synthetic */ Object ipc$super(nqb nqbVar, String str, Object... objArr) {
        if (str.hashCode() == -603323580) {
            super.a((itd) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.isz, android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, itdVar, new Integer(i)});
        } else {
            a(itdVar, i);
        }
    }

    public nqb(Activity activity, ium iumVar, MODEL model) {
        super(npz.a().c(), ListStyle.LIST, activity, iumVar, model);
    }

    @Override // tb.isz
    public void a(itd itdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc0a0344", new Object[]{this, itdVar, new Integer(i)});
        } else {
            super.a(itdVar, i);
        }
    }
}
