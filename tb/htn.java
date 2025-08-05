package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.iru;
import tb.iuh;
import tb.iuj;

/* loaded from: classes6.dex */
public abstract class htn<V extends View, IV extends iuj<?, ?>, IP extends iuh<?, ?>, MODEL extends iru<? extends a<? extends BaseSearchResult, ?>>, CONFIG extends hte> extends irr<V, IV, IP, MODEL, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1013199556);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htn(Activity activity, ium parent, MODEL baseSearchResultWrap, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, baseSearchResultWrap, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(baseSearchResultWrap, "baseSearchResultWrap");
    }

    public final CONFIG a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CONFIG) ipChange.ipc$dispatch("f05ab65", new Object[]{this});
        }
        CONFIG config = (CONFIG) ((iru) getModel()).a();
        if (config == null) {
            throw new TypeCastException("null cannot be cast to non-null type CONFIG");
        }
        return config;
    }
}
