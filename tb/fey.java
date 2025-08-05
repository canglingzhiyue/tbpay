package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.container.b;
import com.taobao.android.detail.core.detail.widget.container.c;
import tb.dyd;

/* loaded from: classes5.dex */
public class fey implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dyd f27879a;
    private Activity b;
    private egy c;

    static {
        kge.a(130145598);
        kge.a(1760784470);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 101;
    }

    public fey() {
        emu.a("com.taobao.android.detail.wrapper.ext.windvane.H5DescCreator");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public void a(Activity activity, dyd dydVar, egy egyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32343154", new Object[]{this, activity, dydVar, egyVar});
            return;
        }
        this.f27879a = dydVar;
        this.b = activity;
        this.c = egyVar;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.b
    public c a(String str, NestedScrollContainer.a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("27352caf", new Object[]{this, str, aVar, cVar});
        }
        fex fexVar = new fex(this.b);
        fexVar.a(this.c);
        fexVar.a(aVar, cVar);
        this.f27879a.a(new a(fexVar));
        return fexVar;
    }

    /* loaded from: classes5.dex */
    public static class a implements dyd.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public fex f27880a;

        static {
            kge.a(340476297);
            kge.a(-1343344462);
        }

        public a(fex fexVar) {
            this.f27880a = fexVar;
        }

        @Override // tb.dyd.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f27880a.a(true);
            }
        }
    }
}
