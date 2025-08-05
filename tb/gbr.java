package tb;

import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import tb.abp;
import tb.gbp;

/* loaded from: classes5.dex */
public class gbr extends gbo<Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<b> c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface a {
        void a(b bVar);

        void a(b bVar, boolean z);
    }

    static {
        kge.a(38141965);
    }

    public static /* synthetic */ gbp.a a(gbr gbrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("30acac33", new Object[]{gbrVar}) : gbrVar.f28292a;
    }

    public static /* synthetic */ gbp.a b(gbr gbrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("b73266d2", new Object[]{gbrVar}) : gbrVar.f28292a;
    }

    public static /* synthetic */ gbp.a c(gbr gbrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("3db82171", new Object[]{gbrVar}) : gbrVar.f28292a;
    }

    public static /* synthetic */ gbp.a d(gbr gbrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbp.a) ipChange.ipc$dispatch("c43ddc10", new Object[]{gbrVar}) : gbrVar.f28292a;
    }

    public gbr(gbt gbtVar) {
        super(gbtVar);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        List<b> list = this.c;
        if (list != null && !list.isEmpty()) {
            for (b bVar : this.c) {
                bVar.b();
            }
        }
        this.c = null;
    }

    @Override // tb.gbp
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        e();
        List<gbm> a2 = a();
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        ArrayList<b> arrayList = new ArrayList();
        for (gbm gbmVar : a2) {
            Float b2 = b();
            View b3 = gbmVar.b();
            List<String> a3 = gbmVar.a();
            if (b3 != null && a3 != null && !a3.isEmpty() && b2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : gbmVar.a()) {
                    com.taobao.android.dinamicx_v4.animation.util.a a4 = com.taobao.android.dinamicx_v4.animation.util.a.a(str, Float.class);
                    if (a4 != null) {
                        arrayList2.add(a4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    gbt gbtVar = (gbt) c();
                    arrayList.add(new b(b3, gbtVar.f28297a, gbtVar.b, b2.floatValue(), arrayList2, this.b, this.f28292a == null ? null : new c()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (b bVar : arrayList) {
            bVar.c();
        }
        this.c = arrayList;
    }

    /* loaded from: classes5.dex */
    public class c implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2072817132);
            kge.a(-1718308606);
        }

        public c() {
        }

        @Override // tb.gbr.a
        public void a(b bVar) {
            gbl<Float> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33ef38c3", new Object[]{this, bVar});
            } else if (gbr.a(gbr.this) == null || (b = b(bVar)) == null) {
            } else {
                gbr.b(gbr.this).a(b);
            }
        }

        @Override // tb.gbr.a
        public void a(b bVar, boolean z) {
            gbl<Float> b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49f89271", new Object[]{this, bVar, new Boolean(z)});
            } else if (gbr.c(gbr.this) == null || (b = b(bVar)) == null) {
            } else {
                gbr.d(gbr.this).a(b, z);
            }
        }

        public gbl<Float> b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gbl) ipChange.ipc$dispatch("cd955631", new Object[]{this, bVar});
            }
            View a2 = bVar.a();
            if (a2 == null || bVar.f28293a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (com.taobao.android.dinamicx_v4.animation.util.a<Float> aVar : bVar.f28293a) {
                arrayList.add(new Pair(aVar.a(), Float.valueOf(aVar.d.a(a2))));
            }
            return new gbl<>(a2, arrayList);
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements abp.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<com.taobao.android.dinamicx_v4.animation.util.a<Float>> f28293a;
        private final WeakReference<View> b;
        private final a c;
        private List<abr> d = new ArrayList();

        static {
            kge.a(320103711);
            kge.a(1728047390);
        }

        public b(View view, float f, float f2, float f3, List<com.taobao.android.dinamicx_v4.animation.util.a<Float>> list, gbp.b<Float> bVar, a aVar) {
            this.f28293a = list;
            this.b = new WeakReference<>(view);
            this.c = aVar;
            for (com.taobao.android.dinamicx_v4.animation.util.a<Float> aVar2 : list) {
                float floatValue = bVar != null ? bVar.a(aVar2.a(), view, Float.valueOf(f3)).floatValue() : f3;
                abr abrVar = new abr(view, aVar2.d);
                abs absVar = new abs();
                absVar.b(f);
                absVar.a(f2);
                absVar.c(floatValue);
                abrVar.a(absVar);
                abrVar.a(this);
                this.d.add(abrVar);
            }
        }

        public View a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.b.get();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            List<abr> list = this.d;
            if (list != null && !list.isEmpty()) {
                for (abr abrVar : this.d) {
                    abrVar.b();
                }
            }
            this.d = null;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            List<abr> list = this.d;
            if (list == null || list.isEmpty()) {
                return;
            }
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(this);
            }
            for (abr abrVar : this.d) {
                abrVar.a();
            }
        }

        @Override // tb.abp.b
        public void a(abp abpVar, boolean z, float f, float f2) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d64f12b", new Object[]{this, abpVar, new Boolean(z), new Float(f), new Float(f2)});
                return;
            }
            List<abr> list = this.d;
            if (list == null || !(abpVar instanceof abr)) {
                return;
            }
            if (!z) {
                list.remove(abpVar);
            }
            if (!this.d.isEmpty() || (aVar = this.c) == null) {
                return;
            }
            aVar.a(this, z);
        }
    }
}
