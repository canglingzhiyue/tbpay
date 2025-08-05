package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.ttdetail.inside.b;
import com.taobao.android.detail.ttdetail.inside.c;

/* loaded from: classes4.dex */
public class egm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1054408595);
    }

    /* loaded from: classes4.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private egl f27292a;

        static {
            kge.a(280313729);
            kge.a(-1527675036);
        }

        public static /* synthetic */ egl a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (egl) ipChange.ipc$dispatch("bf390dec", new Object[]{aVar}) : aVar.f27292a;
        }

        public a(egl eglVar) {
            this.f27292a = eglVar;
        }

        @Override // com.taobao.android.detail.ttdetail.inside.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            egl eglVar = this.f27292a;
            if (eglVar == null) {
                return;
            }
            eglVar.a();
        }

        @Override // com.taobao.android.detail.ttdetail.inside.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            egl eglVar = this.f27292a;
            if (eglVar == null) {
                return;
            }
            eglVar.b();
        }

        @Override // com.taobao.android.detail.ttdetail.inside.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            egl eglVar = this.f27292a;
            if (eglVar == null) {
                return;
            }
            eglVar.c();
        }

        @Override // com.taobao.android.detail.ttdetail.inside.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            egl eglVar = this.f27292a;
            if (eglVar == null) {
                return;
            }
            eglVar.d();
        }

        @Override // com.taobao.android.detail.ttdetail.inside.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            egl eglVar = this.f27292a;
            if (eglVar == null) {
                return;
            }
            eglVar.e();
        }

        @Override // com.taobao.android.detail.ttdetail.inside.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            egl eglVar = this.f27292a;
            if (eglVar == null) {
                return;
            }
            eglVar.f();
        }

        @Override // com.taobao.android.detail.ttdetail.inside.b
        public void a(float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
                return;
            }
            egl eglVar = this.f27292a;
            if (eglVar == null) {
                return;
            }
            eglVar.a(f, i);
        }
    }

    public static void a(String str, egl eglVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b66858", new Object[]{str, eglVar});
            return;
        }
        i.d("InsideLifecycleRegistrar", "registerInsideLifecycleObserver : " + str);
        if (str == null) {
            return;
        }
        c.a(str, new a(eglVar));
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        i.d("InsideLifecycleRegistrar", "unregisterInsideLifecycleObserver : " + str);
        c.b(str);
    }

    public static egl b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (egl) ipChange.ipc$dispatch("7d1b72e9", new Object[]{str});
        }
        b a2 = c.a(str);
        if (a2 == null) {
            return null;
        }
        if (a2 instanceof a) {
            return a.a((a) a2);
        }
        i.d("InsideLifecycleRegistrar", "getInsideLifecycleObserver : " + str + " error, you should registerInsideLifecycleObserver first");
        return null;
    }
}
