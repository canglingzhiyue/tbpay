package tb;

import android.app.Activity;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.meta.structure.state.MetaState;
import com.taobao.android.meta.structure.state.b;
import com.taobao.android.meta.structure.state.c;
import com.taobao.android.meta.structure.state.d;
import kotlin.jvm.internal.q;

/* loaded from: classes6.dex */
public class htv extends htn<FrameLayout, c, b, iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>>, hte> implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(421267570);
        kge.a(-146797288);
    }

    public static /* synthetic */ Object ipc$super(htv htvVar, String str, Object... objArr) {
        if (str.hashCode() == -336807415) {
            return super.onCreateView();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "MetaPageStateWidget";
    }

    @Override // tb.iun
    public /* synthetic */ iuh d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuh) ipChange.ipc$dispatch("261b13ff", new Object[]{this}) : e();
    }

    @Override // tb.iun
    public /* synthetic */ iuj f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iuj) ipChange.ipc$dispatch("357e5efb", new Object[]{this}) : g();
    }

    @Override // tb.iun, tb.ius
    public /* synthetic */ View onCreateView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this}) : b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htv(Activity activity, ium parent, iru<? extends com.taobao.android.meta.data.b<com.taobao.android.meta.data.a, MetaResult<com.taobao.android.meta.data.a>>> model, ViewGroup viewGroup, iur iurVar) {
        super(activity, parent, model, viewGroup, iurVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(model, "model");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        c iView = (c) J();
        q.a((Object) iView, "iView");
        iView.b().setPadding(0, i, 0, 0);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            ((c) J()).a(z);
        }
    }

    /* loaded from: classes6.dex */
    public static final class a implements OnApplyWindowInsetsListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // android.support.v4.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (WindowInsetsCompat) ipChange.ipc$dispatch("eac8c0", new Object[]{this, view, windowInsetsCompat}) : ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
        }
    }

    public FrameLayout b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("cec35b50", new Object[]{this});
        }
        FrameLayout it = (FrameLayout) super.onCreateView();
        ViewCompat.setOnApplyWindowInsetsListener(it, a.INSTANCE);
        q.a((Object) it, "it");
        q.a((Object) it, "super.onCreateView().let…\n            it\n        }");
        return it;
    }

    @Override // com.taobao.android.meta.structure.state.a
    public void a(MetaState state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56669f5e", new Object[]{this, state});
            return;
        }
        q.c(state, "state");
        ((c) J()).a(state);
    }

    public b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("83607f6c", new Object[]{this}) : new htu();
    }

    public c g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("6e54cc0d", new Object[]{this});
        }
        ise<hte, ? extends c> g = a().g();
        if (g == null) {
            q.a();
        }
        return g.a(a());
    }
}
