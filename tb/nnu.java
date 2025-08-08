package tb;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.business.getconfig.a;
import com.taobao.homepage.request.SettingNewConfigResult;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.tbmainfragment.SupportFragment;
import com.taobao.tao.tbmainfragment.l;
import com.taobao.tao.topmultitab.c;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.themis.kernel.i;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.suf;

/* loaded from: classes7.dex */
public class nnu implements mjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b.a f31599a;
    private final Activity b;
    private suf.a c;
    private final ohr d;
    private final nrr e;
    private final List<TBSwipeRefreshLayout.OnPullRefreshListener> f = new CopyOnWriteArrayList();
    private l g;
    private boolean h;
    private boolean i;
    private boolean j;

    static {
        kge.a(-853794207);
        kge.a(-338505689);
    }

    public static /* synthetic */ Activity a(nnu nnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("cf6a3e85", new Object[]{nnuVar}) : nnuVar.b;
    }

    public static /* synthetic */ void a(nnu nnuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3ba760", new Object[]{nnuVar, new Integer(i)});
        } else {
            nnuVar.a(i);
        }
    }

    public static /* synthetic */ void a(nnu nnuVar, TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfeabab", new Object[]{nnuVar, refreshState, refreshState2});
        } else {
            nnuVar.a(refreshState, refreshState2);
        }
    }

    public static /* synthetic */ void a(nnu nnuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd79b0d", new Object[]{nnuVar, str});
        } else {
            nnuVar.a(str);
        }
    }

    public static /* synthetic */ boolean a(nnu nnuVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db3be735", new Object[]{nnuVar, new Boolean(z)})).booleanValue();
        }
        nnuVar.j = z;
        return z;
    }

    public static /* synthetic */ ohr b(nnu nnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ohr) ipChange.ipc$dispatch("b9d5f0e9", new Object[]{nnuVar}) : nnuVar.d;
    }

    public static /* synthetic */ void c(nnu nnuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3945905", new Object[]{nnuVar});
        } else {
            nnuVar.k();
        }
    }

    public static /* synthetic */ boolean d(nnu nnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2175f8a", new Object[]{nnuVar})).booleanValue() : nnuVar.j;
    }

    public static /* synthetic */ nrr e(nnu nnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nrr) ipChange.ipc$dispatch("70bb2531", new Object[]{nnuVar}) : nnuVar.e;
    }

    public static /* synthetic */ boolean f(nnu nnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f1d6c8c", new Object[]{nnuVar})).booleanValue() : nnuVar.i;
    }

    public static /* synthetic */ boolean g(nnu nnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8da0730d", new Object[]{nnuVar})).booleanValue() : nnuVar.h;
    }

    public static /* synthetic */ boolean h(nnu nnuVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c23798e", new Object[]{nnuVar})).booleanValue() : nnuVar.p();
    }

    public nnu(lbo lboVar, TBSwipeRefreshLayout tBSwipeRefreshLayout, Activity activity, View view) {
        boolean isEnableToSecondFloor;
        this.b = activity;
        this.e = new nrr(view, activity, lboVar);
        this.d = new ohr(lboVar, tBSwipeRefreshLayout, activity);
        this.d.a(j());
        this.d.a(l());
        this.f31599a = f();
        b.a(this.f31599a);
        g();
        m();
        IHomeSubTabController z = c.a().z();
        if (z == null) {
            isEnableToSecondFloor = !com.taobao.android.editionswitcher.l.d(activity);
        } else {
            isEnableToSecondFloor = z.isEnableToSecondFloor();
        }
        this.h = isEnableToSecondFloor;
        e.e("PullDownUpManager", "构造函数");
    }

    @Override // tb.mjx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b.b(this.f31599a);
        h();
        n();
        this.d.a();
        this.e.a();
        e.e("PullDownUpManager", "destroy");
    }

    @Override // tb.mjx
    public void a(SettingNewConfigResult settingNewConfigResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f840da", new Object[]{this, settingNewConfigResult});
            return;
        }
        this.d.a(ohs.b(settingNewConfigResult), settingNewConfigResult.refreshConfig);
        a a2 = ohs.a(settingNewConfigResult);
        if (!a2.d()) {
            this.h = false;
            e.e("PullDownUpManager", "二楼配置不符合预期 不允许下拉二楼");
            return;
        }
        this.e.a(a2);
        this.i = true;
        e.e("PullDownUpManager", "更新二楼配置");
    }

    @Override // tb.mjx
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d.a(z);
        }
    }

    @Override // tb.mjx
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d.b();
    }

    @Override // tb.mjx
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        e.e("PullDownUpManager", "setEnableToSecondFloor： " + z);
        this.h = z;
    }

    @Override // tb.mjx
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.d.c(z);
        }
    }

    @Override // tb.mjx
    public void a(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68eb31c", new Object[]{this, onPullRefreshListener});
        } else {
            this.f.add(onPullRefreshListener);
        }
    }

    @Override // tb.mjx
    public void b(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cb93bdd", new Object[]{this, onPullRefreshListener});
        } else if (this.f.isEmpty()) {
        } else {
            this.f.remove(onPullRefreshListener);
        }
    }

    @Override // tb.mjx
    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.d.a(f);
        }
    }

    @Override // tb.mjx
    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.d.c();
    }

    @Override // tb.mjx
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e.b();
        this.d.a(false);
    }

    @Override // tb.mjx
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.d.e();
    }

    private b.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("e5f06d89", new Object[]{this}) : new b.a() { // from class: tb.nnu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                    return;
                }
                e.e("PullDownUpManager", "localeChange 更新多语言配置");
                com.alibaba.ability.localization.c.a(nnu.a(nnu.this));
                nnu.b(nnu.this).d();
            }
        };
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.c = i();
        oql.a().i().a(this.c, null);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.c == null) {
        } else {
            oql.a().i().b(this.c, null);
        }
    }

    private suf.a i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (suf.a) ipChange.ipc$dispatch("860a4375", new Object[]{this}) : new suf.a() { // from class: tb.nnu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.suf.a
            public void a(IContainerDataModel<?> iContainerDataModel, JSONObject jSONObject, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8fafb607", new Object[]{this, iContainerDataModel, jSONObject, str});
                    return;
                }
                if (StringUtils.equals("coldStart", jSONObject.getString(i.CDN_REQUEST_TYPE))) {
                    nnu.a(nnu.this, "coldStart");
                    e.e("PullDownUpManager", "OnDataProcessListener,冷启刷新完成，开始初始化下拉刷新组件");
                }
                nnu.b(nnu.this).a(false);
            }
        };
    }

    private TBSwipeRefreshLayout.OnPullRefreshListener j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout.OnPullRefreshListener) ipChange.ipc$dispatch("9840d939", new Object[]{this}) : new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: tb.nnu.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    return;
                }
                kss.a("Page_Home", 2201, "Page_Home_Show-refresh", "expo=a2141.1.refresh.1:1007.refresh.1.1");
                nnu.a(nnu.this, "pullRefresh");
                nnu.c(nnu.this);
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onPullDistance(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                    return;
                }
                nnu.a(nnu.this, i);
                if (nnu.d(nnu.this)) {
                    nnu.e(nnu.this).a(i);
                }
                c.a().a(i);
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                    return;
                }
                nnu.a(nnu.this, refreshState, refreshState2);
                if (refreshState == TBRefreshHeader.RefreshState.NONE && nnu.f(nnu.this)) {
                    nnu nnuVar = nnu.this;
                    if (!nnu.g(nnuVar) || !nnu.h(nnu.this)) {
                        z = false;
                    }
                    nnu.a(nnuVar, z);
                    nnu.b(nnu.this).b(nnu.d(nnu.this));
                }
                if (nnu.d(nnu.this)) {
                    nnu.e(nnu.this).a(refreshState, refreshState2);
                }
                c.a().a(refreshState, refreshState2);
            }
        };
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        e.e("PullDownUpManager", "请求二楼配置： " + str);
        kxd.a().a(new kxc(str));
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.f) {
            onPullRefreshListener.onPullDistance(i);
        }
    }

    private void a(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8961210", new Object[]{this, refreshState, refreshState2});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.f) {
            onPullRefreshListener.onRefreshStateChanged(refreshState, refreshState2);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.f) {
            onPullRefreshListener.onRefresh();
        }
    }

    private TBSwipeRefreshLayout.RefreshAnimationListener l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout.RefreshAnimationListener) ipChange.ipc$dispatch("1057ce97", new Object[]{this}) : new TBSwipeRefreshLayout.RefreshAnimationListener() { // from class: tb.nnu.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
            public void onRefreshCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cd6e8b1d", new Object[]{this});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
            public void onRefreshEnd() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6e6df846", new Object[]{this});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
            public void onRefreshBefore() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7bc491a2", new Object[]{this});
                    return;
                }
                c.a().r();
                e.e("PullDownUpManager", "发送下拉刷新请求");
            }
        };
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.g = o();
        SupportFragment.registerTBLifecycleCallbacks(this.g);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        l lVar = this.g;
        if (lVar == null) {
            return;
        }
        SupportFragment.unRegisterTBLifecycleCallbacks(lVar);
    }

    private l o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("c056ddd3", new Object[]{this}) : new l() { // from class: tb.nnu.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                if (str.hashCode() == -1547495758) {
                    super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a3c316b2", new Object[]{this, fragmentManager, fragment});
                    return;
                }
                super.onFragmentResumed(fragmentManager, fragment);
                if (fragment == null || !StringUtils.equals("MyTaobaoFragment", fragment.getClass().getSimpleName()) || !com.taobao.homepage.page.weexv2.a.d()) {
                    return;
                }
                e.e("PullDownUpManager", "去我淘了");
                nnu.b(nnu.this).a(false);
                nnu.this.d();
            }
        };
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController z = c.a().z();
        if (z == null) {
            e.e("PullDownUpManager", "homeSubTabController == null");
            return false;
        }
        return z.isEnableToSecondFloor();
    }
}
