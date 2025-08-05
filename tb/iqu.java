package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.a;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.g;
import com.taobao.android.xsearchplugin.muise.p;
import com.taobao.android.xsearchplugin.weex.weex.h;
import tb.jvm;

/* loaded from: classes7.dex */
public class iqu extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(787638327);
    }

    public static /* synthetic */ Object ipc$super(iqu iquVar, String str, Object... objArr) {
        if (str.hashCode() == 548609891) {
            super.c((com.taobao.android.weex_framework.p) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public iqu(Activity activity, imn imnVar, g gVar, h hVar, TemplateBean templateBean, iru<? extends a<? extends BaseSearchResult, ?>> iruVar) {
        super(activity, imnVar, gVar, hVar, templateBean, iruVar);
    }

    @Override // com.taobao.android.xsearchplugin.muise.p, com.taobao.android.xsearchplugin.muise.a
    public jvm.c c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("35966272", new Object[]{this, str}) : ipl.g().j();
    }

    @Override // com.taobao.android.xsearchplugin.muise.p, com.taobao.android.xsearchplugin.muise.a
    public void c(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b31f63", new Object[]{this, pVar});
            return;
        }
        super.c(pVar);
        pVar.addInstanceEnv("tb2021", "true");
    }

    @Override // com.taobao.android.xsearchplugin.muise.p, com.taobao.android.xsearchplugin.muise.a
    public TemplateBean a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("27bcb6cf", new Object[]{this, muiseBean}) : ipl.g().i();
    }
}
