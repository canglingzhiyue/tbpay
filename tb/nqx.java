package tb;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.muise.a;
import com.taobao.android.xsearchplugin.weex.weex.h;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.searchdoor.sf.widgets.b;
import kotlin.jvm.internal.q;
import tb.jvm;

/* loaded from: classes7.dex */
public final class nqx extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f31674a;

    static {
        kge.a(1997188796);
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public void c(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20b31f63", new Object[]{this, pVar});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nqx(Activity activity, imn imnVar, g gVar, h hVar, b searchDoorHelper) {
        super(activity, imnVar, gVar, hVar);
        q.c(searchDoorHelper, "searchDoorHelper");
        this.f31674a = searchDoorHelper;
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public TemplateBean a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("27bcb6cf", new Object[]{this, muiseBean});
        }
        b bVar = this.f31674a;
        if (muiseBean == null) {
            q.a();
        }
        return bVar.a(muiseBean.type);
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Activity activity = a();
        q.a((Object) activity, "activity");
        Intent intent = activity.getIntent();
        if (intent != null && intent.getData() != null) {
            a(intent.getData().toString());
        }
        b(SearchDoorActivity.PAGE_NAME);
    }

    @Override // com.taobao.android.xsearchplugin.muise.a
    public jvm.c c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("35966272", new Object[]{this, str}) : this.f31674a.b(str);
    }
}
