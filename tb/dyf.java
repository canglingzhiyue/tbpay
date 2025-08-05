package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.i;
import com.taobao.android.detail.core.aura.widget.AliDetailAuraRecyclerView;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature;
import com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeatureRV;
import com.taobao.android.detail.core.performance.a;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.ultronengine.DetailRecyclerView;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.b;
import com.taobao.android.trade.event.f;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes4.dex */
public class dyf extends dxz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DetailMainController";
    private ehb k;
    private int l;

    static {
        kge.a(1147434912);
    }

    public static /* synthetic */ Object ipc$super(dyf dyfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -955963047) {
            super.a((List) objArr[0]);
            return null;
        } else if (hashCode != -414738562) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((epe) objArr[0]);
            return null;
        }
    }

    public dyf(Activity activity) {
        super(activity);
        this.l = -1;
        if (n() && (this.f27080a instanceof DetailCoreActivity)) {
            r();
        } else {
            i.b(this.f27080a);
        }
        emu.a("com.taobao.android.detail.core.detail.controller.DetailMainController");
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.i = ((DetailCoreActivity) this.f27080a).G();
        if (this.i == null) {
            throw new NullPointerException("AURA模式下，AliDetailAuraController对象不能为NULL");
        }
        this.j = this.i.a();
        s();
        e();
        if (eip.p) {
            eit.a(new Runnable() { // from class: tb.dyf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.a(dyf.this.f27080a);
                    }
                }
            });
            com.taobao.android.detail.core.utils.i.c(a.a(TAG), "Spindle埋点异步enterAuraPageUserTracker");
            return;
        }
        i.a(this.f27080a);
        com.taobao.android.detail.core.utils.i.c(a.a(TAG), "Spindle埋点同步enterAuraPageUserTracker");
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else if (n() && (this.f27080a instanceof DetailCoreActivity)) {
            if (this.h == null) {
                return;
            }
            this.h.i();
            this.h = null;
        } else {
            if (this.j != null) {
                this.j.g();
                this.j = null;
            }
            if (this.i == null) {
                return;
            }
            this.i.g();
            this.i = null;
        }
    }

    private void s() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        long a2 = c.a();
        int b = ecl.b(this.f27080a);
        final PullToRefreshFeatureRV pullToRefreshFeatureRV = new PullToRefreshFeatureRV(this.f27080a);
        if (a2 > 512000 && b >= 2) {
            z = true;
        }
        pullToRefreshFeatureRV.enablePullDownToRefresh(z, null);
        pullToRefreshFeatureRV.setDownRefreshBackgroundColor(this.f27080a.getResources().getColor(R.color.detail_e));
        pullToRefreshFeatureRV.setPullDownRefreshTips(new String[]{"下拉查看更多精彩", "释放查看更多精彩"});
        pullToRefreshFeatureRV.setIconTextInvisible();
        pullToRefreshFeatureRV.setOnPullToRefreshListener(new PullToRefreshFeature.a() { // from class: tb.dyf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    pullToRefreshFeatureRV.onPullRefreshComplete(240);
                }
            }
        });
        if (god.h) {
            try {
                if (this.i.c().findFeature(PullToRefreshFeatureRV.class) != null) {
                    this.i.c().removeFeature(PullToRefreshFeatureRV.class);
                    com.taobao.android.detail.core.utils.i.d(j.a(TAG), "下拉刷新移除多余feature");
                    ecg.e(this.f27080a);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                com.taobao.android.detail.core.utils.i.a(j.a(TAG), "下拉刷新移除多余feature异常", th);
            }
        }
        if (((this.f27080a instanceof com.taobao.android.detail.core.detail.activity.c) && ((com.taobao.android.detail.core.detail.activity.c) this.f27080a).J_()) || this.i.c().findFeature(pullToRefreshFeatureRV.getClass()) != null) {
            return;
        }
        this.i.c().addFeature(pullToRefreshFeatureRV);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
            return;
        }
        super.a(epeVar);
        if (!(epeVar instanceof ehb)) {
            return;
        }
        this.k = (ehb) epeVar;
    }

    @Override // tb.dxz
    public void a(List<b> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        super.a(list);
        if (n() && this.i != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.i.e();
            h.l(this.f27080a, SystemClock.uptimeMillis() - uptimeMillis);
        } else if (this.h != null && this.h.a()) {
            this.l = this.h.f();
        } else if (this.c == null) {
        } else {
            while (true) {
                if (i >= this.f.size()) {
                    break;
                }
                b bVar = this.f.get(i);
                if (!TextUtils.isEmpty(bVar.mLocatorId) && bVar.mLocatorId.toLowerCase().contains(RateNode.TAG)) {
                    this.l = i;
                    break;
                }
                i++;
            }
            int i2 = this.l;
            if (i2 == -1) {
                return;
            }
            this.l = i2 + this.b.getFeatureSize();
        }
    }

    public int q() {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
        }
        if (n() && this.i != null) {
            dxw f = this.i.f();
            if (f == null) {
                return -1;
            }
            int a2 = f.a("BybtEvaluation");
            if (a2 == -1) {
                a2 = f.a("TeMaiEvaluation");
            }
            if (a2 == -1) {
                a2 = f.a("DetailCommentDefault");
            }
            if (a2 == -1) {
                a2 = f.a("commentSectionV3");
            }
            return a2 == -1 ? f.a("detail3Comment") : a2;
        } else if (this.l == -1) {
            return -1;
        } else {
            DetailRecyclerView o = o();
            int i = 0;
            for (int i2 = 0; i2 < this.l; i2++) {
                if (o != null) {
                    num = o.getObservedChildren().get(Integer.valueOf(i2));
                } else {
                    num = this.b.mObservedChilds.get(Integer.valueOf(i2));
                }
                if (num != null) {
                    i += num.intValue();
                }
            }
            return i;
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        ehb ehbVar = this.k;
        if (ehbVar == null) {
            return null;
        }
        return ehbVar.mLocatorId;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public com.taobao.android.trade.locator.callback.a a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("29902195", new Object[]{this, str});
        }
        com.taobao.android.detail.core.utils.i.d(TAG, "locator id " + str);
        if (n() && this.j != null) {
            return d(str);
        }
        if (this.h != null && this.h.a()) {
            return c(str);
        }
        if (!TextUtils.isEmpty(str) && this.c != null) {
            for (final int i2 = 0; i2 < this.c.getCount(); i2++) {
                if (str.equals(((b) this.c.getItem(i2)).mLocatorId)) {
                    edj edjVar = new edj();
                    edjVar.f27209a = false;
                    f.a(this.f27080a).a(edjVar);
                    final int featureSize = this.b.getFeatureSize();
                    if (((DetailCoreActivity) this.f27080a).c) {
                        i = ecr.b(this.f27080a);
                    }
                    final int actionBarHeight = i + ((DetailCoreActivity) this.f27080a).r().getActionBarHeight();
                    try {
                        this.b.setSelectionFromTop(i2 + featureSize, actionBarHeight);
                    } catch (Throwable unused) {
                        this.b.setSelection(i2 + featureSize);
                        this.b.smoothScrollBy(-actionBarHeight, 10);
                    }
                    this.g.postDelayed(new Runnable() { // from class: tb.dyf.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            edj edjVar2 = new edj();
                            edjVar2.f27209a = true;
                            f.a(dyf.this.f27080a).a(edjVar2);
                            int i3 = 0;
                            int i4 = 0;
                            for (int i5 = 0; i5 < dyf.this.c.getCount() + featureSize; i5++) {
                                Integer num = dyf.this.b.mObservedChilds.get(Integer.valueOf(i5));
                                if (num != null) {
                                    i3 += num.intValue();
                                    if (i5 < i2 + featureSize) {
                                        i4 += num.intValue();
                                    }
                                }
                            }
                            int height = (dyf.this.b.getHeight() - actionBarHeight) - (i3 - i4);
                            if (height > 0) {
                                com.taobao.android.detail.core.utils.i.d(dyf.TAG, "locator diff y " + height);
                                edk edkVar = new edk();
                                edkVar.f27210a = height;
                                f.a(dyf.this.f27080a).a(edkVar);
                            }
                            com.taobao.android.detail.core.utils.i.d(dyf.TAG, "locator compute list height " + i3 + " item top " + i4);
                        }
                    }, 16L);
                    return null;
                }
            }
        }
        return null;
    }

    private String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ebe234", new Object[]{this, iDMComponent});
        }
        if (iDMComponent != null && iDMComponent.getFields() != null) {
            return iDMComponent.getFields().getString("locatorId");
        }
        return null;
    }

    private com.taobao.android.trade.locator.callback.a c(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("e1131917", new Object[]{this, str});
        }
        if (this.h == null) {
            return null;
        }
        final DetailRecyclerView e = this.h.e();
        bnv k = this.h.c().k();
        if (k != null && k.f() != null) {
            final List<IDMComponent> f = k.f();
            if (!TextUtils.isEmpty(str) && f != null) {
                for (final int i2 = 0; i2 < f.size(); i2++) {
                    IDMComponent iDMComponent = f.get(i2);
                    if (a(iDMComponent) != null && str.contains(a(iDMComponent))) {
                        edj edjVar = new edj();
                        edjVar.f27209a = false;
                        f.a(this.f27080a).a(edjVar);
                        final int headerViewsCount = e.getHeaderViewsCount();
                        if (((DetailCoreActivity) this.f27080a).c) {
                            i = ecr.b(this.f27080a);
                        }
                        final int actionBarHeight = i + ((DetailCoreActivity) this.f27080a).r().getActionBarHeight();
                        ((LinearLayoutManager) e.getLayoutManager()).scrollToPositionWithOffset(i2 + headerViewsCount, actionBarHeight);
                        this.g.postDelayed(new Runnable() { // from class: tb.dyf.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                edj edjVar2 = new edj();
                                edjVar2.f27209a = true;
                                f.a(dyf.this.f27080a).a(edjVar2);
                                int i3 = 0;
                                int i4 = 0;
                                for (int i5 = 0; i5 < f.size() + headerViewsCount; i5++) {
                                    try {
                                        Integer num = e.mObservedChilds.get(Integer.valueOf(i5));
                                        if (num != null) {
                                            i3 += num.intValue();
                                            if (i5 < i2 + headerViewsCount) {
                                                i4 += num.intValue();
                                            }
                                        }
                                    } catch (Throwable th) {
                                        com.taobao.android.detail.core.utils.i.a(dyf.TAG, "getChildContainerUltron", th);
                                    }
                                }
                                int height = (e.getHeight() - actionBarHeight) - (i3 - i4);
                                if (height > 0) {
                                    com.taobao.android.detail.core.utils.i.d(dyf.TAG, "locator diff y " + height);
                                    edk edkVar = new edk();
                                    edkVar.f27210a = height;
                                    f.a(dyf.this.f27080a).a(edkVar);
                                }
                                com.taobao.android.detail.core.utils.i.d(dyf.TAG, "locator compute list height " + i3 + " item top " + i4);
                            }
                        }, 16L);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    private com.taobao.android.trade.locator.callback.a d(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("bcd494d8", new Object[]{this, str});
        }
        if (this.j == null) {
            return null;
        }
        edj edjVar = new edj();
        edjVar.f27209a = false;
        f.a(this.f27080a).a(edjVar);
        AliDetailAuraRecyclerView c = this.i.c();
        int headerViewsCount = c.getHeaderViewsCount();
        if (((DetailCoreActivity) this.f27080a).c) {
            i = ecr.b(this.f27080a);
        }
        ((LinearLayoutManager) c.getLayoutManager()).scrollToPositionWithOffset(this.j.a(str) + headerViewsCount, i + ((DetailCoreActivity) this.f27080a).r().getActionBarHeight());
        edjVar.f27209a = true;
        f.a(this.f27080a).a(edjVar);
        return null;
    }
}
