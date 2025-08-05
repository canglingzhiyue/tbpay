package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jry {

    /* renamed from: a  reason: collision with root package name */
    public final c f29748a;
    public final b b;
    public final d c;

    /* loaded from: classes6.dex */
    public interface b {
        void a(jrz jrzVar);
    }

    /* loaded from: classes6.dex */
    public interface c {
        View a();
    }

    /* loaded from: classes6.dex */
    public interface d {
        boolean a(jsl jslVar);
    }

    static {
        kge.a(-1702855592);
    }

    private jry(c cVar, b bVar, d dVar) {
        this.f29748a = cVar;
        this.b = bVar;
        this.c = dVar;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private c f29749a;
        private b b;
        private d c;

        static {
            kge.a(1148287791);
        }

        public a a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("363b05b0", new Object[]{this, cVar});
            }
            this.f29749a = cVar;
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("47b7ff2f", new Object[]{this, bVar});
            }
            this.b = bVar;
            return this;
        }

        public jry a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jry) ipChange.ipc$dispatch("f068f0d", new Object[]{this});
            }
            if (this.f29749a == null) {
                this.f29749a = new c() { // from class: tb.jry.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jry.c
                    public View a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (View) ipChange2.ipc$dispatch("195fbaaa", new Object[]{this});
                        }
                        return null;
                    }
                };
            }
            if (this.c == null) {
                this.c = new d() { // from class: tb.jry.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.jry.d
                    public boolean a(jsl jslVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("effd47b9", new Object[]{this, jslVar})).booleanValue();
                        }
                        return false;
                    }
                };
            }
            return new jry(this.f29749a, this.b, this.c);
        }
    }
}
