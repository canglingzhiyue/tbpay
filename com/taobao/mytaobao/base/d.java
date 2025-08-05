package com.taobao.mytaobao.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.o;
import com.taobao.mytaobao.basement.weex.f;
import com.taobao.mytaobao.homepage.MyTaobaoFragment;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.mtz;
import tb.mxo;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u0004\u0018\u00010#J\n\u0010$\u001a\u0004\u0018\u00010%H&J\u0012\u0010&\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010(H&J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H&J\u0012\u0010,\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010.H&J&\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010.H&J\b\u00104\u001a\u00020\u001cH&J\b\u00105\u001a\u00020\u001cH&J\b\u00106\u001a\u00020\u001cH&J\b\u00107\u001a\u00020\u001cH&J\b\u00108\u001a\u00020\u001cH&J\b\u00109\u001a\u00020\u001cH&J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020#H&J\u0006\u0010<\u001a\u00020\u001cJ\u0018\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@H&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006A"}, d2 = {"Lcom/taobao/mytaobao/base/AbsMtbBizProxy;", "", "mtbFragment", "Lcom/taobao/mytaobao/homepage/MyTaobaoFragment;", "(Lcom/taobao/mytaobao/homepage/MyTaobaoFragment;)V", "containerView", "Landroid/view/ViewGroup;", "getContainerView", "()Landroid/view/ViewGroup;", "setContainerView", "(Landroid/view/ViewGroup;)V", "mBasementAndSecScreenChangeHandler", "Lcom/taobao/mytaobao/basement/BasementAndSecScreenChangeHandler;", "getMBasementAndSecScreenChangeHandler", "()Lcom/taobao/mytaobao/basement/BasementAndSecScreenChangeHandler;", "mRecyclerView", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "getMRecyclerView", "()Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "setMRecyclerView", "(Lcom/taobao/mytaobao/view/MTPtrRecyclerView;)V", "getMtbFragment", "()Lcom/taobao/mytaobao/homepage/MyTaobaoFragment;", "weexInstanceLoadHelper", "Lcom/taobao/mytaobao/basement/weex/WeexInstanceLoadHelper;", "getWeexInstanceLoadHelper", "()Lcom/taobao/mytaobao/basement/weex/WeexInstanceLoadHelper;", "addAPMProperty", "", "key", "", "value", "calculateBasementHeight", "", "getActivity", "Landroid/app/Activity;", "getIBasementManager", "Lcom/taobao/mytaobao/base/IBasementManager;", "handleLoginAction", "action", "Lcom/taobao/login4android/broadcast/LoginAction;", "onAttach", "ctx", "Landroid/content/Context;", i.b.MEASURE_ONCREATE, "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", MessageID.onDestroy, "onDestroyView", "onPause", "onResume", "onStart", MessageID.onStop, "preloadMtb", "aty", "scrollToBottom", "scrollToTop", "behavior", "smoothScroll", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final f f18301a;
    private final com.taobao.mytaobao.basement.a b;
    private ViewGroup c;
    private MTPtrRecyclerView d;
    private final MyTaobaoFragment e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            MTPtrRecyclerView e = d.this.e();
            if (e == null) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = e.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager == null) {
                return;
            }
            e.smoothScrollToPosition(linearLayoutManager.findLastVisibleItemPosition());
        }
    }

    static {
        kge.a(-1372737248);
    }

    public abstract View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public abstract void a(Activity activity);

    public abstract void a(Context context);

    public abstract void a(Bundle bundle);

    public abstract void a(LoginAction loginAction);

    public abstract void a(String str, boolean z);

    public abstract void d();

    public abstract void f();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public d(MyTaobaoFragment mtbFragment) {
        q.c(mtbFragment, "mtbFragment");
        this.e = mtbFragment;
        this.f18301a = new f();
        this.b = new com.taobao.mytaobao.basement.a();
    }

    public final MyTaobaoFragment A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MyTaobaoFragment) ipChange.ipc$dispatch("b2f8d110", new Object[]{this}) : this.e;
    }

    public final f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("338ce123", new Object[]{this}) : this.f18301a;
    }

    public final com.taobao.mytaobao.basement.a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.basement.a) ipChange.ipc$dispatch("f6f51c99", new Object[]{this}) : this.b;
    }

    public final void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.c = viewGroup;
        }
    }

    public final ViewGroup c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6e13476b", new Object[]{this}) : this.c;
    }

    public final void a(MTPtrRecyclerView mTPtrRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7e4274", new Object[]{this, mTPtrRecyclerView});
        } else {
            this.d = mTPtrRecyclerView;
        }
    }

    public final MTPtrRecyclerView e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTPtrRecyclerView) ipChange.ipc$dispatch("b9d909b6", new Object[]{this}) : this.d;
    }

    public final Activity m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("3792a4b4", new Object[]{this}) : this.e.getActivity();
    }

    public final int n() {
        int g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        ViewGroup viewGroup = this.c;
        int height = viewGroup != null ? viewGroup.getHeight() : 0;
        if (height != 0 && (g = mxo.g()) != 0) {
            return height - g;
        }
        return 0;
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            mtz.a(new a());
        }
    }

    public final void a(String key, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, key, str});
            return;
        }
        q.c(key, "key");
        if (str == null) {
            return;
        }
        try {
            IPage a2 = o.f18229a.a(this.e);
            q.a((Object) a2, "PageManagerProxy.PROXY.g…FragmentPage(mtbFragment)");
            a2.g().a(key, str);
        } catch (Throwable unused) {
        }
    }
}
