package tb;

import android.content.Context;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class bhc<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f25895a;
    private final Bundle b;
    private final WeakReference<Context> c;
    private String d;

    /* loaded from: classes2.dex */
    public interface b<F> {
        void a(F f, Bundle bundle);

        void a(String str, Bundle bundle);
    }

    static {
        kge.a(29858760);
    }

    public abstract String c();

    public abstract b<T> f();

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f25895a;
    }

    public WeakReference<Context> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("16766937", new Object[]{this}) : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public Bundle e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("fa69e430", new Object[]{this}) : this.b;
    }

    public bhc(Context context, String str, Bundle bundle) {
        this.c = new WeakReference<>(context);
        this.f25895a = str;
        this.b = bundle;
    }

    /* loaded from: classes2.dex */
    public static abstract class a<R extends bhc, B extends a<R, B, T>, T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f25896a;
        public final String b;
        public Bundle c;

        static {
            kge.a(1240104078);
        }

        public abstract R b();

        public abstract void c();

        public abstract B d();

        public a(Context context, String str) {
            this.f25896a = context;
            this.b = str;
        }

        public B a(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (B) ipChange.ipc$dispatch("84406c0", new Object[]{this, bundle});
            }
            this.c = bundle;
            return d();
        }

        public final R a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (R) ipChange.ipc$dispatch("f02c3e1", new Object[]{this});
            }
            c();
            return b();
        }
    }
}
