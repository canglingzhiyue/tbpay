package tb;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.b;
import tb.ojz;
import tb.ova;

/* loaded from: classes5.dex */
public abstract class pig<T extends ova> extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public b.a f32680a;
    public a b;
    public com.taobao.android.detail2.core.mainpic.a c;
    public T d;
    public boolean e;

    /* loaded from: classes5.dex */
    public interface a {
        void a(ojz.b bVar);

        void b(ojz.b bVar);

        void c(ojz.b bVar);

        void d(ojz.b bVar);
    }

    static {
        kge.a(-394020509);
    }

    public abstract void b(JSONObject jSONObject);

    public abstract void b(T t);

    public abstract void d();

    public abstract void e();

    public abstract void e(String str);

    public abstract void f(String str);

    public abstract void g();

    public abstract void g(String str);

    public abstract void h(String str);

    public pig(ViewGroup viewGroup, com.taobao.android.detail2.core.mainpic.a aVar, b.a aVar2, a aVar3) {
        super(viewGroup);
        this.f32680a = aVar2;
        this.b = aVar3;
        this.c = aVar;
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8aac93e", new Object[]{this, t});
            return;
        }
        this.d = t;
        b((pig<T>) t);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        T t = this.d;
        if (t == null) {
            return -1;
        }
        return t.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.e = true;
        e(str);
        fjt.a(fjt.TAG_MAIN_PIC, this + "active");
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        f(str);
        this.e = false;
        this.d.e = true;
        fjt.a(fjt.TAG_MAIN_PIC, this + "disActive");
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        g(str);
        fjt.a(fjt.TAG_MAIN_PIC, this + "willActive");
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        h(str);
        fjt.a(fjt.TAG_MAIN_PIC, this + "willDisActive");
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        d();
        fjt.a(fjt.TAG_MAIN_PIC, this + "supplementUTParams");
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        b(jSONObject);
        fjt.a(fjt.TAG_MAIN_PIC, this + "processMediaOperate");
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            e();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            g();
        }
    }
}
