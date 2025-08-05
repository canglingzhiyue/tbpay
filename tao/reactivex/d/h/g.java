package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.jdz;
import tb.kge;
import tb.kgk;
import tb.muz;
import tb.nam;
import tb.riy;

/* loaded from: classes9.dex */
public enum g {
    COMPLETE;

    /* loaded from: classes9.dex */
    public static final class a implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final jdz f25147a;

        static {
            kge.a(-597529291);
            kge.a(1028243835);
        }

        public a(jdz jdzVar) {
            this.f25147a = jdzVar;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "NotificationLite.Disposable[" + this.f25147a + riy.ARRAY_END_STR;
        }
    }

    /* loaded from: classes9.dex */
    public static final class b implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f25148a;

        static {
            kge.a(-597529290);
            kge.a(1028243835);
        }

        public b(Throwable th) {
            this.f25148a = th;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return kgk.a(this.f25148a, ((b) obj).f25148a);
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.f25148a.hashCode();
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "NotificationLite.Error[" + this.f25148a + riy.ARRAY_END_STR;
        }
    }

    /* loaded from: classes9.dex */
    public static final class c implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final nam f25149a;

        static {
            kge.a(-597529289);
            kge.a(1028243835);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "NotificationLite.Subscription[" + this.f25149a + riy.ARRAY_END_STR;
        }
    }

    public static Object a() {
        return COMPLETE;
    }

    public static <T> Object a(T t) {
        return t;
    }

    public static Object a(Throwable th) {
        return new b(th);
    }

    public static Object a(jdz jdzVar) {
        return new a(jdzVar);
    }

    public static <T> boolean a(Object obj, tao.reactivex.j<? super T> jVar) {
        if (obj == COMPLETE) {
            jVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            jVar.onError(((b) obj).f25148a);
            return true;
        } else if (obj instanceof a) {
            jVar.onSubscribe(((a) obj).f25147a);
            return false;
        } else {
            jVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean a(Object obj, muz<? super T> muzVar) {
        if (obj == COMPLETE) {
            muzVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            muzVar.onError(((b) obj).f25148a);
            return true;
        } else if (obj instanceof c) {
            muzVar.onSubscribe(((c) obj).f25149a);
            return false;
        } else {
            muzVar.onNext(obj);
            return false;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
