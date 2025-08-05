package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.Globals;
import com.taobao.tao.infoflow.multitab.e;
import tb.qzl;

/* loaded from: classes7.dex */
public class tgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f34083a;
    private oqk b;
    private qzl.a c;

    static {
        kge.a(1605148852);
    }

    public static /* synthetic */ boolean a(tgu tguVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68bb3a", new Object[]{tguVar})).booleanValue() : tguVar.i();
    }

    public static /* synthetic */ FrameLayout b(tgu tguVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("1da7ecc2", new Object[]{tguVar}) : tguVar.f34083a;
    }

    public tgu(FrameLayout frameLayout) {
        this.f34083a = frameLayout;
        d();
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        e();
        c();
        h();
        ldf.d("MultiTabContainerObserver", "destroy");
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.f34083a.removeAllViews();
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
            this.f34083a.addView(view);
            ldf.d("MultiTabContainerObserver", "添加分类tab视图到容器中");
        }
        if (this.f34083a.getVisibility() != 8) {
            return;
        }
        this.f34083a.setVisibility(0);
        ldf.d("MultiTabContainerObserver", "设置分类tab容器可见");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = f();
        oql.a().o().a(this.c, (String) null);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c == null) {
        } else {
            oql.a().o().b(this.c, (String) null);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.b = g();
        oql.a().a(this.b);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            oql.a().b(this.b);
        }
    }

    private qzl.a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qzl.a) ipChange.ipc$dispatch("dd506519", new Object[]{this}) : new qzl.a() { // from class: tb.tgu.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.qzl.a
            public void a(JSONObject jSONObject, IContainerDataModel<?> iContainerDataModel, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("96bbefbd", new Object[]{this, jSONObject, iContainerDataModel, str});
                } else if (tgu.a(tgu.this)) {
                    ldf.d("MultiTabContainerObserver", "数据回来了，当前没有添加过分类tab");
                } else if (e.a(iContainerDataModel) != null) {
                    tgu.b(tgu.this).setVisibility(0);
                } else {
                    tgu.b(tgu.this).setVisibility(8);
                    ldf.d("MultiTabContainerObserver", "没有对应的数据设置分类tab容器隐藏");
                }
            }
        };
    }

    private oqk g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oqk) ipChange.ipc$dispatch("3d32afaf", new Object[]{this}) : new oqk() { // from class: tb.tgu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.oqk
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                } else if (tgu.a(tgu.this)) {
                    ldf.d("MultiTabContainerObserver", "没有分类tab");
                } else if (!l.d(Globals.getApplication())) {
                    tgu.b(tgu.this).setVisibility(0);
                } else {
                    tgu.b(tgu.this).setVisibility(8);
                    ldf.d("MultiTabContainerObserver", "切到海外设置分类tab容器隐藏");
                }
            }
        };
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.f34083a.removeAllViews();
        this.f34083a.setVisibility(8);
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        FrameLayout frameLayout = this.f34083a;
        return frameLayout == null || frameLayout.getChildCount() == 0;
    }
}
