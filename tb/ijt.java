package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.arc;
import tb.ifz;

/* loaded from: classes4.dex */
public class ijt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AsyncViewManager";

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<Integer> f29100a;
    private static volatile ijt c;
    private jtv b;
    private int d;
    private int e;
    private a f;
    private boolean g;

    /* loaded from: classes4.dex */
    public interface a {
    }

    static {
        kge.a(-383268042);
        ArrayList<Integer> arrayList = new ArrayList<>();
        f29100a = arrayList;
        arrayList.add(Integer.valueOf(R.layout.alibuy_progressbar_layout));
    }

    public static ijt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijt) ipChange.ipc$dispatch("f05fc0b", new Object[0]);
        }
        if (c == null) {
            synchronized (ijt.class) {
                if (c == null) {
                    c = new ijt();
                }
            }
        }
        return c;
    }

    private jtv c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jtv) ipChange.ipc$dispatch("5c14de3c", new Object[]{this, context});
        }
        if (this.b == null) {
            this.b = new jtv(context);
        }
        return this.b;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (f29100a.contains(Integer.valueOf(i))) {
        } else {
            f29100a.add(Integer.valueOf(i));
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (this.g) {
        } else {
            c(context);
            this.g = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(f29100a);
        }
    }

    public void a(ArrayList<Integer> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        jtv jtvVar = this.b;
        if (jtvVar == null) {
            return;
        }
        jtvVar.a(new ArrayList<>(arrayList));
    }

    public View a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9a97f025", new Object[]{this, context, new Integer(i)}) : c(context).a(context, i, this.f);
    }

    public static View b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9a218a26", new Object[]{context, new Integer(i)});
        }
        View a2 = a().a(context, i);
        ard a3 = arc.a();
        StringBuilder sb = new StringBuilder();
        sb.append(a2 == null ? "[未命中]" : "[命中]");
        sb.append(context.getResources().getResourceEntryName(i));
        sb.append("缓存");
        a3.a(sb.toString(), arc.a.a().a("AURA/performance").b());
        if (a2 == null) {
            a2 = View.inflate(context, i, null);
        } else {
            a().c();
        }
        a().d();
        return a2;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e++;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.d++;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (this.d == 1) {
            jpt c2 = ifz.a.b(ecg.UMB_FEATURE_ASYNC_VIEW).c(this.e == 1 ? "命中缓存" : "未命中缓存");
            if (this.e != 1) {
                z = false;
            }
            ifz.a(c2.a(z).a(0.001f));
        }
        jtv jtvVar = this.b;
        if (jtvVar != null) {
            jtvVar.a();
        }
        this.g = false;
        this.e = 0;
        this.d = 0;
    }
}
