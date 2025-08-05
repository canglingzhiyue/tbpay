package tb;

import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class shq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<ski> b;
    private eyx c;
    private FrameLayout d;
    private BarrageFloatingView e;

    /* renamed from: a  reason: collision with root package name */
    private boolean f33585a = false;
    private BarrageFloatingView.BARRAGE_TYPE f = null;

    static {
        kge.a(1037860617);
    }

    public shq(eyx eyxVar, FrameLayout frameLayout) {
        this.c = eyxVar;
        this.d = frameLayout;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && this.d != null) {
            this.b = b(jSONObject);
            for (ski skiVar : this.b) {
                skiVar.a(this.d, jSONObject);
            }
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.e == null || !BarrageFloatingView.BARRAGE_TYPE.INSIDE.equals(this.f)) {
        } else {
            this.e.b(i);
        }
    }

    private List<ski> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cca20740", new Object[]{this, jSONObject});
        }
        ArrayList arrayList = new ArrayList();
        if (sjg.a(jSONObject)) {
            this.e = new BarrageFloatingView(this.c);
            this.e.a(this.f);
            arrayList.add(this.e);
        }
        return arrayList;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (f()) {
            for (ski skiVar : this.b) {
                skiVar.a();
            }
        }
    }

    public void a(BarrageFloatingView.BARRAGE_TYPE barrage_type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b04b34", new Object[]{this, barrage_type});
        } else {
            this.f = barrage_type;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (f()) {
            for (ski skiVar : this.b) {
                skiVar.b();
            }
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.f33585a != z && f()) {
            this.f33585a = z;
            for (ski skiVar : this.b) {
                skiVar.a(this.f33585a);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            e();
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (f()) {
            for (ski skiVar : this.b) {
                skiVar.c();
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        JSONObject a2 = this.c.a().a();
        e();
        a(a2);
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        List<ski> list = this.b;
        return list != null && list.size() > 0;
    }
}
