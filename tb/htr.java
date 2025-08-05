package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.data.a;
import com.taobao.android.meta.data.b;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public class htr extends iue<htp, htt> implements hto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private htq f28778a;

    static {
        kge.a(-100301555);
        kge.a(-403309776);
    }

    @Override // tb.iuh
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
        if (r6 == null) goto L46;
     */
    @Override // tb.hto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.htr.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r11
            java.lang.String r2 = "56c6c68"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            java.lang.Object r0 = r11.getWidget()
            tb.htt r0 = (tb.htt) r0
            java.lang.String r1 = "widget"
            kotlin.jvm.internal.q.a(r0, r1)
            java.lang.Object r0 = r0.getModel()
            tb.iru r0 = (tb.iru) r0
            java.lang.String r1 = "widget.model"
            kotlin.jvm.internal.q.a(r0, r1)
            com.taobao.android.searchbaseframe.datasource.impl.a r0 = r0.d()
            com.taobao.android.meta.data.b r0 = (com.taobao.android.meta.data.b) r0
            com.taobao.android.searchbaseframe.datasource.result.SearchResult r0 = r0.getTotalSearchResult()
            com.taobao.android.meta.data.MetaResult r0 = (com.taobao.android.meta.data.MetaResult) r0
            r1 = 2
            if (r0 == 0) goto L77
            r4 = 0
            com.taobao.android.meta.structure.state.MetaState r4 = (com.taobao.android.meta.structure.state.MetaState) r4
            int r5 = r0.comboSize()
            r6 = r4
            r4 = 0
            r7 = 0
        L43:
            if (r4 >= r5) goto L71
            com.taobao.android.meta.data.a r8 = r0.getCombo(r4)
            if (r8 != 0) goto L4e
            kotlin.jvm.internal.q.a()
        L4e:
            com.taobao.android.meta.structure.state.MetaState r9 = r8.k()
            int[] r10 = tb.hts.$EnumSwitchMapping$0
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r3) goto L62
            if (r9 == r1) goto L5f
            goto L64
        L5f:
            com.taobao.android.meta.structure.state.MetaState r6 = com.taobao.android.meta.structure.state.MetaState.LOAD_MORE_ERROR
            goto L64
        L62:
            com.taobao.android.meta.structure.state.MetaState r6 = com.taobao.android.meta.structure.state.MetaState.LOADING_MORE
        L64:
            if (r6 != 0) goto L71
            boolean r8 = r8.e()
            if (r8 == 0) goto L6e
            int r7 = r7 + 1
        L6e:
            int r4 = r4 + 1
            goto L43
        L71:
            if (r7 != r5) goto L75
            com.taobao.android.meta.structure.state.MetaState r6 = com.taobao.android.meta.structure.state.MetaState.LIST_FINISHED
        L75:
            if (r6 != 0) goto L79
        L77:
            com.taobao.android.meta.structure.state.MetaState r6 = com.taobao.android.meta.structure.state.MetaState.DEFAULT
        L79:
            com.taobao.android.meta.structure.state.MetaState r0 = com.taobao.android.meta.structure.state.MetaState.DEFAULT
            if (r6 != r0) goto L87
            java.lang.Object r0 = r11.getIView()
            tb.htp r0 = (tb.htp) r0
            r0.a(r2)
            return
        L87:
            java.lang.Object r0 = r11.getIView()
            tb.htp r0 = (tb.htp) r0
            r0.a(r3)
            int[] r0 = tb.hts.$EnumSwitchMapping$1
            int r2 = r6.ordinal()
            r0 = r0[r2]
            if (r0 == r3) goto Lb4
            if (r0 == r1) goto Laa
            r1 = 3
            if (r0 == r1) goto La0
            goto La9
        La0:
            java.lang.Object r0 = r11.getIView()
            tb.htp r0 = (tb.htp) r0
            r0.cY_()
        La9:
            return
        Laa:
            java.lang.Object r0 = r11.getIView()
            tb.htp r0 = (tb.htp) r0
            r0.a()
            return
        Lb4:
            java.lang.Object r0 = r11.getIView()
            tb.htp r0 = (tb.htp) r0
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.htr.a():void");
    }

    @Override // tb.hto
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        htq htqVar = this.f28778a;
        if (htqVar == null) {
            return;
        }
        htqVar.a();
    }

    @Override // tb.hto
    public void a(htq callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eca3f3d3", new Object[]{this, callback});
            return;
        }
        q.c(callback, "callback");
        this.f28778a = callback;
    }

    @Override // tb.hto
    public b<? extends a, ? extends MetaResult<? extends a>> as_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ad3a873d", new Object[]{this});
        }
        htt widget = getWidget();
        q.a((Object) widget, "widget");
        iru iruVar = (iru) widget.getModel();
        q.a((Object) iruVar, "widget.model");
        return (b) iruVar.d();
    }

    @Override // tb.hto
    public hte k_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hte) ipChange.ipc$dispatch("b0661892", new Object[]{this});
        }
        htt widget = getWidget();
        q.a((Object) widget, "widget");
        hte a2 = ((iru) widget.getModel()).a();
        q.a((Object) a2, "widget.model.getMetaConfig()");
        return a2;
    }
}
