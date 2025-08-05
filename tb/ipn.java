package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.muise.m;
import com.taobao.android.xsearchplugin.weex.weex.h;
import tb.jvm;

/* loaded from: classes7.dex */
public class ipn extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1772022080);
    }

    public static /* synthetic */ Object ipc$super(ipn ipnVar, String str, Object... objArr) {
        if (str.hashCode() == 548609891) {
            super.c((p) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.xsearchplugin.muise.m, com.taobao.android.xsearchplugin.muise.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.m, com.taobao.android.xsearchplugin.muise.a
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public ipn(Activity activity, imn imnVar, iru<?> iruVar, g gVar, h hVar) {
        super(activity, imnVar, iruVar, gVar, hVar);
    }

    @Override // com.taobao.android.xsearchplugin.muise.m, com.taobao.android.xsearchplugin.muise.a
    public void c(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b31f63", new Object[]{this, pVar});
            return;
        }
        super.c(pVar);
        pVar.addInstanceEnv("tb2021", "true");
    }

    @Override // com.taobao.android.xsearchplugin.muise.m, com.taobao.android.xsearchplugin.muise.a
    public TemplateBean a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TemplateBean) ipChange.ipc$dispatch("27bcb6cf", new Object[]{this, muiseBean}) : ipl.g().b();
    }

    @Override // com.taobao.android.xsearchplugin.muise.m, com.taobao.android.xsearchplugin.muise.a
    public jvm.c c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("35966272", new Object[]{this, str}) : ipl.g().d();
    }
}
