package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.DebugFrameLayout;
import com.taobao.android.xsearchplugin.debugger.protocal.b;
import com.taobao.search.musie.q;
import tb.isu;
import tb.isv;

/* loaded from: classes8.dex */
public class nwz extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static final class a implements DebugFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.searchbaseframe.uikit.DebugFrameLayout.a
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            nwz nwzVar = nwz.this;
            nwzVar.postEvent(new b(nwzVar));
        }
    }

    static {
        kge.a(200805968);
    }

    public static /* synthetic */ Object ipc$super(nwz nwzVar, String str, Object... objArr) {
        if (str.hashCode() == 1213786409) {
            super.onEventMainThread((isu.e) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o, tb.ius
    public /* synthetic */ FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : s();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwz(Activity activity, ium parent, iru<? extends com.taobao.android.searchbaseframe.datasource.impl.a<? extends BaseSearchResult, ?>> model, TemplateBean bean, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, bean, viewGroup, iurVar);
        kotlin.jvm.internal.q.c(activity, "activity");
        kotlin.jvm.internal.q.c(parent, "parent");
        kotlin.jvm.internal.q.c(model, "model");
        kotlin.jvm.internal.q.c(bean, "bean");
    }

    @Override // com.taobao.search.musie.q, com.taobao.android.xsearchplugin.muise.o
    public FrameLayout s() {
        DebugFrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("d9f7991f", new Object[]{this});
        }
        iml a2 = c().a();
        kotlin.jvm.internal.q.a((Object) a2, "c().constant()");
        if (a2.c()) {
            DebugFrameLayout debugFrameLayout = new DebugFrameLayout(getActivity());
            debugFrameLayout.setDebugClickListener(new a());
            frameLayout = debugFrameLayout;
        } else {
            frameLayout = new FrameLayout(getActivity());
        }
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.taobao.search.musie.q
    public void onEventMainThread(isv.b before) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0c64ab", new Object[]{this, before});
            return;
        }
        kotlin.jvm.internal.q.c(before, "before");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "research", String.valueOf(before.a()));
        com.taobao.android.xsearchplugin.muise.a mMuiseRenderer = this.f16263a;
        kotlin.jvm.internal.q.a((Object) mMuiseRenderer, "mMuiseRenderer");
        mMuiseRenderer.e().sendInstanceMessage("MUISE", "requestStart", jSONObject);
    }

    @Override // com.taobao.android.xsearchplugin.muise.o
    public void onEventMainThread(isu.e scrollStart) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4858e929", new Object[]{this, scrollStart});
            return;
        }
        kotlin.jvm.internal.q.c(scrollStart, "scrollStart");
        super.onEventMainThread(scrollStart);
        com.taobao.android.xsearchplugin.muise.a mMuiseRenderer = this.f16263a;
        kotlin.jvm.internal.q.a((Object) mMuiseRenderer, "mMuiseRenderer");
        mMuiseRenderer.e().sendInstanceMessage("MUISE", "pageStartScroll", null);
    }
}
