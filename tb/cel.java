package tb;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public interface cel {

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(528064486);
        }

        public static int a(cel celVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e3461241", new Object[]{celVar})).intValue();
            }
            q.d(celVar, "this");
            return 0;
        }

        public static void a(cel celVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("857caa75", new Object[]{celVar, new Integer(i)});
            } else {
                q.d(celVar, "this");
            }
        }

        public static void b(cel celVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1c918cf", new Object[]{celVar});
            } else {
                q.d(celVar, "this");
            }
        }

        public static void c(cel celVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c04c1f50", new Object[]{celVar});
            } else {
                q.d(celVar, "this");
            }
        }

        public static void d(cel celVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aecf25d1", new Object[]{celVar});
            } else {
                q.d(celVar, "this");
            }
        }

        public static void e(cel celVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d522c52", new Object[]{celVar});
            } else {
                q.d(celVar, "this");
            }
        }
    }

    View a(Context context, Fragment fragment);

    void a();

    void a(int i);

    int b();

    void c();

    void d();

    void e();

    void f();
}
