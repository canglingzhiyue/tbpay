package tb;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class ejh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, ejg> f27343a = new ConcurrentHashMap<>();
    private eji b = new eji(this);

    static {
        kge.a(-1736293128);
        emu.a("com.taobao.android.detail.core.standard.base.lifecycle.ComponentLifecycleCenter");
    }

    public ejh() {
        emu.a("com.taobao.android.detail.core.standard.base.lifecycle.ComponentLifecycleCenter");
    }

    public static eji i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eji) ipChange.ipc$dispatch("d201664a", new Object[]{context});
        }
        ejh j = j(context);
        if (j != null) {
            return j.b;
        }
        return null;
    }

    public static ejh j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ejh) ipChange.ipc$dispatch("e5a939ac", new Object[]{context});
        }
        if (context == null || !(context instanceof DetailCoreActivity)) {
            return null;
        }
        return ((DetailCoreActivity) context).aW();
    }

    public ejg a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ejg) ipChange.ipc$dispatch("837a40fa", new Object[]{this, context, str});
        }
        if (context instanceof Activity) {
            return this.f27343a.get(str);
        }
        return null;
    }

    public Enumeration<ejg> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Enumeration) ipChange.ipc$dispatch("15d2f10a", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            return this.f27343a.elements();
        }
        return null;
    }

    public void a(Activity activity, ejg ejgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a2d252", new Object[]{this, activity, ejgVar, str});
        } else if (activity == null) {
        } else {
            this.f27343a.put(str, ejgVar);
            ejf.a("ComponentLifecycleCenter", "registViewLifecycleHolder|activiy:" + activity.hashCode() + "|" + this.f27343a.size());
        }
    }

    public void b(Activity activity, ejg ejgVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4dd83d3", new Object[]{this, activity, ejgVar, str});
        } else if (activity == null) {
        } else {
            this.f27343a.remove(str);
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!(context instanceof Activity)) {
        } else {
            try {
                if (!this.f27343a.isEmpty()) {
                    ejf.a("ComponentLifecycleCenter", "clearViewLifecycleHolder|activiy:" + context.hashCode() + "|" + this.f27343a.size());
                    this.f27343a.clear();
                }
                if (this.b == null) {
                    return;
                }
                this.b.a(context);
                this.b = null;
            } catch (Exception e) {
                ejf.c("ComponentLifecycleCenter", "clearViewLifecycleHolder exception: " + e.getMessage());
            }
        }
    }

    public static void c(Context context) {
        Enumeration<ejg> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        ejh j = j(context);
        if (j == null || (a2 = j.a(context)) == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                a2.nextElement().a();
            } catch (Throwable th) {
                ejf.c("ComponentLifecycleCenter", "dispatchLightoffShow exception: " + th.getMessage());
                return;
            }
        }
    }

    public static void d(Context context) {
        Enumeration<ejg> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        ejh j = j(context);
        if (j == null || (a2 = j.a(context)) == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                a2.nextElement().b();
            } catch (Throwable th) {
                ejf.c("ComponentLifecycleCenter", "dispatchLightoffClose exception: " + th.getMessage());
                return;
            }
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else {
            a(context, 2);
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
        } else {
            a(context, 3);
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2296a1a", new Object[]{context});
        } else {
            a(context, 4);
        }
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2d615b9", new Object[]{context});
        } else {
            a(context, 5);
        }
    }

    private static void a(Context context, int i) {
        Enumeration<ejg> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
            return;
        }
        ejh j = j(context);
        if (j == null || (a2 = j.a(context)) == null) {
            return;
        }
        while (a2.hasMoreElements()) {
            try {
                ejg nextElement = a2.nextElement();
                if (2 == i) {
                    nextElement.e();
                } else if (5 == i) {
                    nextElement.h();
                } else if (3 == i) {
                    nextElement.f();
                } else if (4 == i) {
                    nextElement.g();
                }
            } catch (Throwable th) {
                ejf.c("ComponentLifecycleCenter", "dispatchPageLifecycle exception: " + th.getMessage());
                return;
            }
        }
    }

    public static void a(AURAGlobalData aURAGlobalData, q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e95cb1", new Object[]{aURAGlobalData, qVar, str});
            return;
        }
        eji i = i(qVar.e());
        if (i == null) {
            return;
        }
        i.a(aURAGlobalData, qVar, str);
    }

    public static void b(AURAGlobalData aURAGlobalData, q qVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fec10", new Object[]{aURAGlobalData, qVar, str});
            return;
        }
        eji i = i(qVar.e());
        if (i == null) {
            return;
        }
        i.b(aURAGlobalData, qVar, str);
    }

    public static void a(q qVar, AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b751c88", new Object[]{qVar, aURARenderComponent, view});
            return;
        }
        eji i = i(qVar.e());
        if (i == null) {
            return;
        }
        i.a(qVar, aURARenderComponent, view);
    }

    public static void b(q qVar, AURARenderComponent aURARenderComponent, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4f1b249", new Object[]{qVar, aURARenderComponent, view});
            return;
        }
        eji i = i(qVar.e());
        if (i == null) {
            return;
        }
        i.b(qVar, aURARenderComponent, view);
    }

    public static void a(boolean z, RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888c0da9", new Object[]{new Boolean(z), recyclerView, new Integer(i)});
            return;
        }
        eji i2 = i(recyclerView.getContext());
        if (i2 == null) {
            return;
        }
        i2.a(z, recyclerView, i);
    }

    public static void a(boolean z, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f61a7a", new Object[]{new Boolean(z), recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        eji i3 = i(recyclerView.getContext());
        if (i3 == null) {
            return;
        }
        i3.a(z, recyclerView, i, i2);
    }

    public static void a(Context context, ekk ekkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79195c2b", new Object[]{context, ekkVar});
            return;
        }
        eji i = i(context);
        if (i == null) {
            return;
        }
        i.a(context, ekkVar);
    }

    public static void a(RecyclerView recyclerView, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9e40dc", new Object[]{recyclerView, view, new Integer(i), new Integer(i2)});
            return;
        }
        eji i3 = i(recyclerView.getContext());
        if (i3 == null) {
            return;
        }
        i3.a(recyclerView, view, i, i2);
    }

    public static void b(RecyclerView recyclerView, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cdc8fb", new Object[]{recyclerView, view, new Integer(i), new Integer(i2)});
            return;
        }
        eji i3 = i(recyclerView.getContext());
        if (i3 == null) {
            return;
        }
        i3.b(recyclerView, view, i, i2);
    }
}
