package tb;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.container.c;
import com.taobao.android.detail.core.open.h;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.utils.g;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class dyd extends com.taobao.android.detail.core.detail.widget.container.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f27097a;
    private Activity b;
    private RelativeLayout c;
    private dyy d;
    private c e;
    private egy f;
    private NestedScrollContainer.a g;
    private b h;
    private String i;

    /* loaded from: classes4.dex */
    public interface a {
        public static final int DEFAULT = -1;
        public static final int LOADFAILED = 0;
        public static final int RENDERFAILED = 1;

        boolean a(int i);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    static {
        kge.a(-188661128);
    }

    public static /* synthetic */ Object ipc$super(dyd dydVar, String str, Object... objArr) {
        if (str.hashCode() == -414738562) {
            super.a((epe) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public com.taobao.android.trade.locator.callback.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("29902195", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public void a(Object obj, com.taobao.android.trade.locator.callback.a aVar, com.taobao.android.trade.locator.callback.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2928883", new Object[]{this, obj, aVar, bVar});
        }
    }

    public dyd(Activity activity) {
        super(activity);
        this.f27097a = true;
        this.b = activity;
        this.c = (RelativeLayout) View.inflate(this.b, R.layout.x_detail_main_down, null);
        Activity activity2 = this.b;
        if (activity2 instanceof DetailCoreActivity) {
            this.i = ((DetailCoreActivity) activity2).ab();
        } else {
            this.i = "Page_Detail";
        }
        emu.a("com.taobao.android.detail.core.detail.controller.DetailDescController");
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5172c4b", new Object[]{this, bVar});
        } else {
            this.h = bVar;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(dyy dyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61aa9d4", new Object[]{this, dyyVar});
        } else {
            this.d = dyyVar;
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        super.a(epeVar);
        if (epeVar == null) {
            return;
        }
        this.f = (egy) epeVar;
        Iterator<com.taobao.android.detail.core.detail.widget.container.b> g = ((h) n.a(this.b)).g();
        while (g.hasNext()) {
            com.taobao.android.detail.core.detail.widget.container.b next = g.next();
            next.a(this.b, this, this.f);
            if (next.a()) {
                this.e = next.a(this.i, this.g, this);
                if (this.e != null) {
                    if (!jqm.a()) {
                        UnifyLog.d("DetailDesc", "图文详情类型：" + this.e.getClass().getSimpleName());
                    }
                    a(next.b(), this.e.k());
                    com.taobao.android.detail.core.utils.h.n(this.b, SystemClock.uptimeMillis() - uptimeMillis);
                    return;
                }
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(NestedScrollContainer.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e157bdfd", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.g = aVar;
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        c cVar = this.e;
        if (cVar == null) {
            return false;
        }
        return cVar.g();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        c cVar = this.e;
        if (cVar == null) {
            return false;
        }
        return cVar.h();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue();
        }
        c cVar = this.e;
        if (cVar == null) {
            return 0.0f;
        }
        return cVar.i();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        c cVar = this.e;
        if (cVar == null) {
            return false;
        }
        return cVar.j();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(i, z);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public View k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(i, i2);
        }
        if (!this.f27097a || !l()) {
            return;
        }
        this.f27097a = false;
        b("Page_Detaill_Button_NewProductDetailSlide");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        egy egyVar = this.f;
        if (egyVar == null) {
            return null;
        }
        return egyVar.mLocatorId;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(i);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void b() {
        dya y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar != null) {
            cVar.b();
        }
        if (!g.b()) {
            return;
        }
        Activity activity = this.b;
        if (!(activity instanceof DetailCoreActivity) || (y = ((DetailCoreActivity) activity).y()) == null) {
            return;
        }
        y.e();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.a(z, z2);
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.c();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c cVar = this.e;
        if (cVar == null) {
            return;
        }
        cVar.d();
    }

    public void a(com.taobao.android.detail.core.detail.widget.container.b bVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ccf8a1", new Object[]{this, bVar, cVar});
            return;
        }
        this.e = cVar;
        if (this.e == null) {
            return;
        }
        a(bVar.b(), this.e.k());
    }

    private void a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
            return;
        }
        this.c.removeAllViews();
        dyy dyyVar = this.d;
        if (dyyVar != null) {
            dyyVar.e(i);
        }
        this.c.addView(view);
    }

    private void b(String str) {
        com.taobao.android.detail.datasdk.model.datamodel.node.c z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        Activity activity = this.b;
        if (!(activity instanceof DetailCoreActivity) || (z = ((DetailCoreActivity) activity).z()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", "a2141.7631564.newproductdetail");
        hashMap.put("item_id", z.i());
        hashMap.put("user_id", epo.g().e());
        hashMap.put("seller_id", z.h());
        eps.a(this.b, "Page_Detail", 2101, str, null, null, ect.a(hashMap));
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        View findViewById = this.b.findViewById(R.id.ll_filter);
        return findViewById != null && findViewById.getVisibility() == 0;
    }
}
