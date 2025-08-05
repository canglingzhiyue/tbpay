package tb;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.content.e;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ieg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FLOATING_BARRAGE = "globalBarrage";

    /* renamed from: a  reason: collision with root package name */
    private DetailCoreActivity f28963a;
    private List<iel> c;
    private boolean b = false;
    private FragmentManager.OnBackStackChangedListener d = new FragmentManager.OnBackStackChangedListener() { // from class: tb.ieg.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2062519", new Object[]{this});
                return;
            }
            ieg iegVar = ieg.this;
            if (ieg.a(iegVar).b.i.getBackStackEntryCount() == 0) {
                z = true;
            }
            iegVar.a(z);
        }
    };
    private e e = new e() { // from class: tb.ieg.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            } else if (ieg.b(ieg.this)) {
                for (iel ielVar : ieg.c(ieg.this)) {
                    ielVar.a(i, f, i2);
                }
            }
        }
    };

    static {
        kge.a(-1202373232);
    }

    public static /* synthetic */ DetailCoreActivity a(ieg iegVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("a05f78f8", new Object[]{iegVar}) : iegVar.f28963a;
    }

    public static /* synthetic */ boolean b(ieg iegVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc03e6b2", new Object[]{iegVar})).booleanValue() : iegVar.h();
    }

    public static /* synthetic */ List c(ieg iegVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cd6f0138", new Object[]{iegVar}) : iegVar.c;
    }

    public ieg(Context context) {
        if (context instanceof DetailCoreActivity) {
            this.f28963a = (DetailCoreActivity) context;
        }
        e();
        d();
        emu.a("com.taobao.android.detail.core.standard.mainscreen.barrage.BarrageController");
    }

    public void a(JSONObject jSONObject) {
        DetailCoreActivity detailCoreActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (detailCoreActivity = this.f28963a) != null) {
            FrameLayout frameLayout = (FrameLayout) detailCoreActivity.findViewById(R.id.float_view_layout);
            this.c = a(this.f28963a, jSONObject);
            for (iel ielVar : this.c) {
                ielVar.a(frameLayout, jSONObject);
            }
        }
    }

    private List<iel> a(DetailCoreActivity detailCoreActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ae299a4a", new Object[]{this, detailCoreActivity, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        if (iei.a(jSONObject)) {
            arrayList.add(new iej(detailCoreActivity, detailCoreActivity.d.d()));
        }
        return arrayList;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        dya f = f();
        if (f == null || f.y() == null) {
            return;
        }
        f.y().a(this.e);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        dya f = f();
        if (f == null || f.i == null) {
            return;
        }
        f.i.addOnBackStackChangedListener(this.d);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (h()) {
            for (iel ielVar : this.c) {
                ielVar.a();
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (h()) {
            for (iel ielVar : this.c) {
                ielVar.b();
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (h()) {
            for (iel ielVar : this.c) {
                ielVar.a(z);
            }
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (this.b != z && h()) {
            this.b = z;
            for (iel ielVar : this.c) {
                ielVar.b(this.b);
            }
        }
    }

    private dya f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dya) ipChange.ipc$dispatch("357c270d", new Object[]{this});
        }
        DetailCoreActivity detailCoreActivity = this.f28963a;
        if (detailCoreActivity != null && detailCoreActivity.b != null) {
            return this.f28963a.b;
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            g();
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        dya f = f();
        if (f == null) {
            return;
        }
        if (f.i != null) {
            f.i.removeOnBackStackChangedListener(this.d);
        }
        if (f.i != null) {
            f.y().b(this.e);
        }
        if (!h()) {
            return;
        }
        for (iel ielVar : this.c) {
            ielVar.c();
        }
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c45d761", new Object[]{this, cVar});
            return;
        }
        JSONObject a2 = cVar.f10055a.a();
        g();
        e();
        d();
        a(a2);
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        List<iel> list = this.c;
        return list != null && list.size() > 0;
    }
}
