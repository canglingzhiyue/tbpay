package tb;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.homepage.business.getconfig.DefaultRefreshConfig;
import com.taobao.homepage.business.getconfig.RefreshConfig;
import com.taobao.homepage.view.widgets.bgcontainer.c;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView;

/* loaded from: classes7.dex */
public class ohr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TBSwipeRefreshLayout f32069a;
    private final lbo b;
    private final Activity c;
    private final ohq d = new ohq();
    private TBSwipeRefreshLayout.OnPullRefreshListener e;
    private TBSwipeRefreshLayout.RefreshAnimationListener f;
    private boolean g;
    private FrameLayout h;

    static {
        kge.a(-1689615962);
    }

    public static /* synthetic */ TBSwipeRefreshLayout.OnPullRefreshListener a(ohr ohrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout.OnPullRefreshListener) ipChange.ipc$dispatch("4362136b", new Object[]{ohrVar}) : ohrVar.e;
    }

    public static /* synthetic */ void a(ohr ohrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bac835", new Object[]{ohrVar, new Boolean(z)});
        } else {
            ohrVar.d(z);
        }
    }

    public static /* synthetic */ TBSwipeRefreshLayout b(ohr ohrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout) ipChange.ipc$dispatch("a778b8b1", new Object[]{ohrVar}) : ohrVar.f32069a;
    }

    public static /* synthetic */ lbo c(ohr ohrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbo) ipChange.ipc$dispatch("a321614c", new Object[]{ohrVar}) : ohrVar.b;
    }

    public static /* synthetic */ ohq d(ohr ohrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ohq) ipChange.ipc$dispatch("8ac4ab8c", new Object[]{ohrVar}) : ohrVar.d;
    }

    public static /* synthetic */ TBSwipeRefreshLayout.RefreshAnimationListener e(ohr ohrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout.RefreshAnimationListener) ipChange.ipc$dispatch("38e18427", new Object[]{ohrVar}) : ohrVar.f;
    }

    public ohr(lbo lboVar, TBSwipeRefreshLayout tBSwipeRefreshLayout, Activity activity) {
        this.b = lboVar;
        this.f32069a = tBSwipeRefreshLayout;
        this.c = activity;
        f();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f32069a.setOnPullRefreshListener(null);
        this.f32069a.setRefreshAnimationListener(null);
        this.e = null;
        this.f = null;
    }

    public void a(JSONObject jSONObject, RefreshConfig refreshConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97e0d2", new Object[]{this, jSONObject, refreshConfig});
            return;
        }
        a(refreshConfig);
        FrameLayout j = j();
        this.d.a(this.c, j, jSONObject);
        this.f32069a.getRefresHeader().setSecondFloorView(j);
        this.f32069a.getRefresHeader().switchStyle(TBRefreshHeader.RefreshHeaderStyle.DARK);
        this.f32069a.setDistanceToSecondFloor(ohs.a(jSONObject) + 80);
        this.f32069a.setAnimateToBottomDuration(600);
        e.e("SwipeRefreshLayoutController", "服务端数据回来了");
    }

    public void a(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68eb31c", new Object[]{this, onPullRefreshListener});
        } else {
            this.e = onPullRefreshListener;
        }
    }

    public void a(TBSwipeRefreshLayout.RefreshAnimationListener refreshAnimationListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2223530c", new Object[]{this, refreshAnimationListener});
        } else {
            this.f = refreshAnimationListener;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        e.e("SwipeRefreshLayoutController", "setRefreshing: " + z);
        this.f32069a.setRefreshing(z, true);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        boolean isRefreshing = this.f32069a.isRefreshing();
        e.e("SwipeRefreshLayoutController", "isRefreshing: " + isRefreshing);
        return isRefreshing;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        e.e("SwipeRefreshLayoutController", "setEnableToSecondFloor: " + z);
        this.f32069a.enableSecondFloor(z);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        e.e("SwipeRefreshLayoutController", "setEnablePullRefresh: " + z);
        this.f32069a.enablePullRefresh(z);
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        TBRefreshHeader refresHeader = this.f32069a.getRefresHeader();
        if (refresHeader == null) {
            return;
        }
        e.e("SwipeRefreshLayoutController", "setRefreshHeaderAlpha: " + f);
        refresHeader.setAlpha(f);
    }

    public float c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.f32069a.getDistanceToSecondFloor();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(new DefaultRefreshConfig());
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f32069a.getRefreshOffset();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        e.e("SwipeRefreshLayoutController", "初始化下拉刷新");
        a(new DefaultRefreshConfig());
        c(true);
        this.f32069a.setOnPullRefreshListener(h());
        this.f32069a.setRefreshAnimationListener(i());
    }

    private void a(RefreshConfig refreshConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f3e9b2", new Object[]{this, refreshConfig});
        } else if (!refreshConfig.valid()) {
        } else {
            this.f32069a.setRefreshOffset(refreshConfig.pullRefreshHeight.intValue());
            int g = g();
            this.f32069a.setCustomRefreshHeight(g);
            e.e("SwipeRefreshLayoutController", "setCustomRefreshHeight: " + g);
            this.f32069a.getRefresHeader().setRefreshTips(new String[]{refreshConfig.pullToRefreshText, refreshConfig.releaseToRefreshText, refreshConfig.refreshingText, refreshConfig.refreshFinishedText});
            this.f32069a.getRefresHeader().setRefreshTipColor(refreshConfig.parsePullTextColor.intValue());
            ((RefreshHeadView) this.f32069a.getRefresHeader().getRefreshView()).setRefreshViewColor(refreshConfig.parsePullTextColor.intValue());
            ((TBOldRefreshHeader) this.f32069a.getRefresHeader()).setRefreshTipSize(refreshConfig.pullTextSize.intValue());
            this.f32069a.getRefresHeader().setBackgroundColor(0);
            a(0.0f);
        }
    }

    private int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        ohv e = this.b.e();
        if (e == null) {
            return DensityUtil.px2dip(Globals.getApplication(), DensityUtil.dip2px(Globals.getApplication(), 77.0f) + sfm.STATUS_HEIGHT_PX);
        }
        return DensityUtil.px2dip(Globals.getApplication(), e.i());
    }

    private TBSwipeRefreshLayout.OnPullRefreshListener h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout.OnPullRefreshListener) ipChange.ipc$dispatch("285f22fb", new Object[]{this}) : new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: tb.ohr.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                } else if (ohr.a(ohr.this) == null) {
                } else {
                    ohr.a(ohr.this).onRefresh();
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onPullDistance(int i) {
                IpChange ipChange2 = $ipChange;
                boolean z = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                    return;
                }
                if (ohr.a(ohr.this) != null) {
                    ohr.a(ohr.this).onPullDistance(i);
                }
                float min = Math.min(1.0f, i / (ohr.b(ohr.this).getHeaderViewHeight() - ohr.b(ohr.this).getRefreshOffset()));
                ohv e = ohr.c(ohr.this).e();
                if (e != null) {
                    e.a(1.0f - min);
                }
                c d = ohr.c(ohr.this).d();
                if (d != null && i >= 0) {
                    d.a(i, min);
                }
                ohr ohrVar = ohr.this;
                if (i <= 0) {
                    z = false;
                }
                ohr.a(ohrVar, z);
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                    return;
                }
                if (refreshState == TBRefreshHeader.RefreshState.NONE) {
                    ohr.this.a(1.0f);
                }
                if (ohr.a(ohr.this) != null) {
                    ohr.a(ohr.this).onRefreshStateChanged(refreshState, refreshState2);
                }
                ohr.d(ohr.this).a(refreshState, refreshState2);
            }
        };
    }

    private TBSwipeRefreshLayout.RefreshAnimationListener i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBSwipeRefreshLayout.RefreshAnimationListener) ipChange.ipc$dispatch("5f55b914", new Object[]{this}) : new TBSwipeRefreshLayout.RefreshAnimationListener() { // from class: tb.ohr.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
            public void onRefreshBefore() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7bc491a2", new Object[]{this});
                } else if (ohr.e(ohr.this) == null) {
                } else {
                    ohr.e(ohr.this).onRefreshBefore();
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
            public void onRefreshEnd() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6e6df846", new Object[]{this});
                } else if (ohr.e(ohr.this) == null) {
                } else {
                    ohr.e(ohr.this).onRefreshEnd();
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
            public void onRefreshCancel() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cd6e8b1d", new Object[]{this});
                } else if (ohr.e(ohr.this) == null) {
                } else {
                    ohr.e(ohr.this).onRefreshCancel();
                }
            }
        };
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (this.g == z) {
        } else {
            this.g = z;
            TBRefreshHeader refresHeader = this.f32069a.getRefresHeader();
            if (z) {
                i = g();
            }
            float f = i;
            if (refresHeader.getTranslationY() == f) {
                return;
            }
            refresHeader.setTranslationY(f);
        }
    }

    private FrameLayout j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("10455a48", new Object[]{this});
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(this.c);
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout2.setVisibility(4);
        this.h = frameLayout2;
        return this.h;
    }
}
