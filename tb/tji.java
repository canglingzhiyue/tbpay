package tb;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.interact.pop.BootImageBigPopView;
import com.taobao.bootimage.interact.pop.e;
import com.taobao.bootimage.linked.h;
import com.taobao.utils.Global;

/* loaded from: classes7.dex */
public class tji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BootImageBigPopView f34149a;
    private final tiq b;
    private String c = "searchText";

    static {
        kge.a(2142863035);
    }

    public static /* synthetic */ tiq a(tji tjiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tiq) ipChange.ipc$dispatch("4fc99485", new Object[]{tjiVar}) : tjiVar.b;
    }

    public tji(tiq tiqVar) {
        this.b = tiqVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f34149a = BootImageBigPopView.preBuildBigLottie(Global.getApplication(), this.b.d().b(), h.b("").b(), this.c, this.b.d().e());
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        BootImageBigPopView bootImageBigPopView = this.f34149a;
        return bootImageBigPopView != null && !bootImageBigPopView.isShowing();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f34149a.show(new e() { // from class: tb.tji.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.bootimage.interact.pop.e
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                stv.a("BigPopManager", "showBigPopLottie onEnd:");
                tji.a(tji.this).a().c(2001);
            }
        })) {
        } else {
            this.b.b().e();
            if (this.b.b().d() != null) {
                this.b.b().d().setVisibility(8);
            }
            this.b.b().b().animate().alpha(0.0f).setDuration(80L).start();
            ((FrameLayout) this.b.b().b().getParent()).addView(this.f34149a);
        }
    }
}
