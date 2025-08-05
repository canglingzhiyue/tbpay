package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class dlc {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, dln> f26824a;
    public final dlp b;
    public final dlm c;
    public final dld d;
    public final dlt e;
    public final dlf f;

    static {
        kge.a(-1766511451);
    }

    private dlc(a aVar) {
        this.f26824a = a.a(aVar);
        this.c = a.b(aVar);
        this.b = a.c(aVar);
        this.d = a.d(aVar);
        this.f = a.e(aVar);
        this.e = a.f(aVar);
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private HashMap<String, dln> f26825a;
        private dlm b;
        private dlp c;
        private dld d;
        private dlf e;
        private dlt f;

        static {
            kge.a(1904971388);
        }

        public static /* synthetic */ HashMap a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("cbaed263", new Object[]{aVar}) : aVar.f26825a;
        }

        public static /* synthetic */ dlm b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlm) ipChange.ipc$dispatch("419abe0", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ dlp c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlp) ipChange.ipc$dispatch("8a9f66dc", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ dld d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dld) ipChange.ipc$dispatch("11252007", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ dlf e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlf) ipChange.ipc$dispatch("97aadae4", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ dlt f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlt) ipChange.ipc$dispatch("1e309735", new Object[]{aVar}) : aVar.f;
        }

        public a a(HashMap<String, dln> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d2ebf403", new Object[]{this, hashMap});
            }
            this.f26825a = hashMap;
            return this;
        }

        public a a(dlm dlmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("489da57b", new Object[]{this, dlmVar});
            }
            this.b = dlmVar;
            return this;
        }

        public a a(dlp dlpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1426b8fe", new Object[]{this, dlpVar});
            }
            this.c = dlpVar;
            return this;
        }

        public a a(dld dldVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e6026af2", new Object[]{this, dldVar});
            }
            this.d = dldVar;
            return this;
        }

        public a a(dlf dlfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c30877f4", new Object[]{this, dlfVar});
            }
            this.e = dlfVar;
            return this;
        }

        public a a(dlt dltVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ce32d302", new Object[]{this, dltVar});
            }
            this.f = dltVar;
            return this;
        }

        public dlc a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlc) ipChange.ipc$dispatch("f03bba3", new Object[]{this}) : new dlc(this);
        }
    }
}
