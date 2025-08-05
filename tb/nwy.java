package tb;

import android.app.Activity;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import com.taobao.search.sf.widgets.list.floatbar.l;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nwy extends nwz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1994461804);
    }

    public static /* synthetic */ Object ipc$super(nwy nwyVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 66974264) {
            super.onRenderSuccess((p) objArr[0]);
            return null;
        } else if (hashCode != 855112085) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroyed((MUSDKInstance) objArr[0]);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwy(Activity activity, ium parent, iru<? extends a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
        q.c(bean, "bean");
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
            return;
        }
        super.onRenderSuccess(pVar);
        postScopeEvent(new l.c(), "childPageWidget");
    }

    @Override // com.taobao.android.xsearchplugin.muise.o, com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            return;
        }
        super.onDestroyed(mUSDKInstance);
        postScopeEvent(new l.d(), "childPageWidget");
    }
}
