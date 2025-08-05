package tb;

import android.content.Context;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class qbw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static qbw f32891a;
    private List<qbv> b;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static qbw f32893a;

        static {
            kge.a(1964096029);
            f32893a = new qbw();
        }
    }

    static {
        kge.a(-373028916);
    }

    public static /* synthetic */ List a(qbw qbwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("74553775", new Object[]{qbwVar}) : qbwVar.b;
    }

    public static /* synthetic */ void b(qbw qbwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e987ab13", new Object[]{qbwVar});
        } else {
            qbwVar.b();
        }
    }

    private qbw() {
        this.b = new ArrayList();
    }

    public static qbw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qbw) ipChange.ipc$dispatch("f098158", new Object[0]);
        }
        if (f32891a == null) {
            f32891a = a.f32893a;
        }
        return f32891a;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.add(new qbx());
        }
    }

    public void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.qbw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (qbw.a(qbw.this).isEmpty()) {
                        qbw.b(qbw.this);
                    }
                    for (qbv qbvVar : qbw.a(qbw.this)) {
                        qbvVar.a(context);
                    }
                }
            });
        }
    }
}
