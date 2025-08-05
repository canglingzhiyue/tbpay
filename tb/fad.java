package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.c;
import com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature;
import com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeatureRV;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fad extends dyf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1641188311);
    }

    public static /* synthetic */ Object ipc$super(fad fadVar, String str, Object... objArr) {
        if (str.hashCode() == -798348601) {
            super.a((f) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ PullToRefreshFeature a(fad fadVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullToRefreshFeature) ipChange.ipc$dispatch("fb3a1c0d", new Object[]{fadVar}) : fadVar.d;
    }

    public static /* synthetic */ PullToRefreshFeatureRV b(fad fadVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullToRefreshFeatureRV) ipChange.ipc$dispatch("33dde58a", new Object[]{fadVar}) : fadVar.e;
    }

    public fad(Activity activity) {
        super(activity);
        s();
        emu.a("com.taobao.android.detail.wrapper.ext.TBDetailMainController");
    }

    private void s() {
        long a2;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        try {
            a2 = c.a();
            b = ecl.b(this.f27080a);
        } catch (Exception unused) {
            this.d.enablePullDownToRefresh(true, null);
        }
        if (a2 > 512000 && b >= 2) {
            this.d.enablePullDownToRefresh(true, null);
            this.d.setDownRefreshBackgroundColor(this.f27080a.getResources().getColor(R.color.detail_e));
            this.d.setPullDownRefreshTips(new String[]{"下拉查看更多精彩.", "释放查看更多精彩.", "释放查看更多精彩.", "释放查看更多精彩."});
            this.d.setIconTextInvisible();
            this.d.setOnPullToRefreshListener(new PullToRefreshFeature.a() { // from class: tb.fad.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        fad.a(fad.this).onPullRefreshComplete(240);
                    }
                }
            });
            if (!(this.f27080a instanceof com.taobao.android.detail.core.detail.activity.c) && ((com.taobao.android.detail.core.detail.activity.c) this.f27080a).J_()) {
                return;
            }
            this.b.addFeature(this.d);
        }
        this.d.enablePullDownToRefresh(false, null);
        this.d.setDownRefreshBackgroundColor(this.f27080a.getResources().getColor(R.color.detail_e));
        this.d.setPullDownRefreshTips(new String[]{"下拉查看更多精彩.", "释放查看更多精彩.", "释放查看更多精彩.", "释放查看更多精彩."});
        this.d.setIconTextInvisible();
        this.d.setOnPullToRefreshListener(new PullToRefreshFeature.a() { // from class: tb.fad.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    fad.a(fad.this).onPullRefreshComplete(240);
                }
            }
        });
        if (!(this.f27080a instanceof com.taobao.android.detail.core.detail.activity.c)) {
        }
        this.b.addFeature(this.d);
    }

    @Override // tb.dxz
    public void a(f fVar) {
        long a2;
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d06a2ac7", new Object[]{this, fVar});
        } else if (this.h == fVar) {
        } else {
            super.a(fVar);
            if (fVar == null) {
                return;
            }
            try {
                a2 = c.a();
                b = ecl.b(this.f27080a);
            } catch (Exception unused) {
                this.e.enablePullDownToRefresh(true, null);
            }
            if (a2 > 512000 && b >= 2) {
                this.e.enablePullDownToRefresh(true, null);
                this.e.setDownRefreshBackgroundColor(this.f27080a.getResources().getColor(R.color.detail_e));
                this.e.setPullDownRefreshTips(new String[]{"下拉查看更多精彩.", "释放查看更多精彩.", "释放查看更多精彩.", "释放查看更多精彩."});
                this.e.setIconTextInvisible();
                this.e.setOnPullToRefreshListener(new PullToRefreshFeature.a() { // from class: tb.fad.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            fad.b(fad.this).onPullRefreshComplete(240);
                        }
                    }
                });
                if (!(this.f27080a instanceof com.taobao.android.detail.core.detail.activity.c) && ((com.taobao.android.detail.core.detail.activity.c) this.f27080a).J_()) {
                    return;
                }
                fVar.e().addFeature(this.e);
            }
            this.e.enablePullDownToRefresh(false, null);
            this.e.setDownRefreshBackgroundColor(this.f27080a.getResources().getColor(R.color.detail_e));
            this.e.setPullDownRefreshTips(new String[]{"下拉查看更多精彩.", "释放查看更多精彩.", "释放查看更多精彩.", "释放查看更多精彩."});
            this.e.setIconTextInvisible();
            this.e.setOnPullToRefreshListener(new PullToRefreshFeature.a() { // from class: tb.fad.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.core.detail.widget.listview.features.PullToRefreshFeature.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        fad.b(fad.this).onPullRefreshComplete(240);
                    }
                }
            });
            if (!(this.f27080a instanceof com.taobao.android.detail.core.detail.activity.c)) {
            }
            fVar.e().addFeature(this.e);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        if (this.e != null) {
            this.e.enablePullDownToRefresh(false, null);
        }
        if (this.d == null) {
            return;
        }
        this.d.enablePullDownToRefresh(false, null);
    }
}
