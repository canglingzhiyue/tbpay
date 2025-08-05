package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static jno f29648a;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final jnp f29649a = new jnp();

        public static /* synthetic */ jnp a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jnp) ipChange.ipc$dispatch("f067ef2", new Object[0]) : f29649a;
        }
    }

    static {
        kge.a(-2087167818);
        f29648a = null;
    }

    public static jnp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnp) ipChange.ipc$dispatch("f067ef2", new Object[0]) : a.a();
    }

    public void a(jno jnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb82f4d", new Object[]{this, jnoVar});
        } else {
            f29648a = jnoVar;
        }
    }
}
