package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;

/* loaded from: classes9.dex */
public interface qqb {

    /* loaded from: classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1217175021);
        }

        public static /* synthetic */ boolean a(qqb qqbVar, boolean z, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("117acf25", new Object[]{qqbVar, new Boolean(z), new Integer(i), obj})).booleanValue();
            }
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popPage");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return qqbVar.a(z);
        }
    }

    /* loaded from: classes9.dex */
    public interface b {
        void a();
    }

    void a();

    boolean a(int i);

    boolean a(ITMSPage iTMSPage);

    boolean a(boolean z);

    ITMSPage b(int i);

    void b();

    boolean b(ITMSPage iTMSPage);

    ITMSPage c();

    boolean c(ITMSPage iTMSPage);

    int d();

    int d(ITMSPage iTMSPage);
}
