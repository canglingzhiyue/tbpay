package tb;

import android.content.Context;
import com.alibaba.ability.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public interface alt {
    WeakReference<Context> a();

    alt a(Context context);

    void a(Object obj);

    void a(WeakReference<Context> weakReference);

    void a(alu aluVar);

    Object b();

    alu c();

    String d();

    String e();

    Context f();

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1392083950);
        }

        public static Context a(alt altVar) {
            Context context;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("23d20a87", new Object[]{altVar});
            }
            WeakReference<Context> a2 = altVar.a();
            return (a2 == null || (context = a2.get()) == null) ? e.d() : context;
        }

        public static alt a(alt altVar, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (alt) ipChange.ipc$dispatch("f384e1c4", new Object[]{altVar, context});
            }
            if (context != null) {
                altVar.a(new WeakReference<>(context));
            }
            return altVar;
        }

        public static alt a(alt altVar, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (alt) ipChange.ipc$dispatch("303998f2", new Object[]{altVar, obj});
            }
            altVar.a(obj);
            return altVar;
        }

        public static <T> T b(alt altVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("4d036a22", new Object[]{altVar});
            }
            T t = (T) altVar.b();
            if (t instanceof Object) {
                return t;
            }
            return null;
        }
    }
}
