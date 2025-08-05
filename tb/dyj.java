package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.fragment.desc.DescNativeController;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.container.b;
import com.taobao.android.detail.core.detail.widget.container.c;
import com.taobao.android.detail.core.open.h;
import com.taobao.android.detail.core.open.n;
import tb.dyd;

/* loaded from: classes4.dex */
public class dyj implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dyd f27104a;
    private Activity b;
    private egy c;

    static {
        kge.a(-702759094);
        kge.a(1760784470);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 100;
    }

    public static /* synthetic */ Activity a(dyj dyjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("f882da45", new Object[]{dyjVar}) : dyjVar.b;
    }

    public static /* synthetic */ dyd b(dyj dyjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dyd) ipChange.ipc$dispatch("57815ab3", new Object[]{dyjVar}) : dyjVar.f27104a;
    }

    public static /* synthetic */ egy c(dyj dyjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (egy) ipChange.ipc$dispatch("3f23646a", new Object[]{dyjVar}) : dyjVar.c;
    }

    public dyj() {
        emu.a("com.taobao.android.detail.core.detail.controller.NativeDescCreator");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public void a(Activity activity, dyd dydVar, egy egyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32343154", new Object[]{this, activity, dydVar, egyVar});
            return;
        }
        this.f27104a = dydVar;
        this.b = activity;
        this.c = egyVar;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.c.d != null && this.c.d.size() > 0;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public c a(final String str, final NestedScrollContainer.a aVar, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("27352caf", new Object[]{this, str, aVar, cVar});
        }
        DescNativeController descNativeController = new DescNativeController(this.b);
        descNativeController.a((epe) this.c);
        descNativeController.b(str);
        descNativeController.a(aVar, cVar);
        descNativeController.a(new dyd.a() { // from class: tb.dyj.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.dyd.a
            public boolean a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
                }
                try {
                    b a2 = ((h) n.a(dyj.a(dyj.this))).a(101);
                    if (a2 != null) {
                        a2.a(dyj.a(dyj.this), dyj.b(dyj.this), dyj.c(dyj.this));
                        if (a2.a()) {
                            dyj.b(dyj.this).a(a2, a2.a(str, aVar, cVar));
                            dyj.b(dyj.this).e();
                            dyj.b(dyj.this).a();
                            ecg.e(dyj.a(dyj.this), dyj.c(dyj.this).c);
                        }
                        return true;
                    }
                } catch (Exception unused) {
                }
                return false;
            }
        });
        return descNativeController;
    }
}
