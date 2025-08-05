package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class cqn extends igj<ViewGroup, IrpDatasource> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(575462241);
    }

    public abstract void a();

    public abstract void el_();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqn(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
    }
}
