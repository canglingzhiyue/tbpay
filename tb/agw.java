package tb;

import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public class agw implements agu, agx {
    private final String d;
    private final MergePaths f;

    /* renamed from: a  reason: collision with root package name */
    private final Path f25329a = new Path();
    private final Path b = new Path();
    private final Path c = new Path();
    private final List<agx> e = new ArrayList();

    /* renamed from: tb.agw$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25330a = new int[MergePaths.MergePathsMode.values().length];

        static {
            try {
                f25330a[MergePaths.MergePathsMode.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25330a[MergePaths.MergePathsMode.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25330a[MergePaths.MergePathsMode.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25330a[MergePaths.MergePathsMode.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25330a[MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public agw(MergePaths mergePaths) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.d = mergePaths.a();
            this.f = mergePaths;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    private void a(Path.Op op) {
        this.b.reset();
        this.f25329a.reset();
        for (int size = this.e.size() - 1; size > 0; size--) {
            agx agxVar = this.e.get(size);
            if (agxVar instanceof ago) {
                ago agoVar = (ago) agxVar;
                List<agx> b = agoVar.b();
                for (int size2 = b.size() - 1; size2 >= 0; size2--) {
                    Path d = b.get(size2).d();
                    d.transform(agoVar.c());
                    this.b.addPath(d);
                }
            } else {
                this.b.addPath(agxVar.d());
            }
        }
        agx agxVar2 = this.e.get(0);
        if (agxVar2 instanceof ago) {
            ago agoVar2 = (ago) agxVar2;
            List<agx> b2 = agoVar2.b();
            for (int i = 0; i < b2.size(); i++) {
                Path d2 = b2.get(i).d();
                d2.transform(agoVar2.c());
                this.f25329a.addPath(d2);
            }
        } else {
            this.f25329a.set(agxVar2.d());
        }
        this.c.op(this.f25329a, this.b, op);
    }

    private void b() {
        for (int i = 0; i < this.e.size(); i++) {
            this.c.addPath(this.e.get(i).d());
        }
    }

    @Override // tb.agn
    public String a() {
        return this.d;
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).a(list, list2);
        }
    }

    @Override // tb.agu
    public void a(ListIterator<agn> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            agn previous = listIterator.previous();
            if (previous instanceof agx) {
                this.e.add((agx) previous);
                listIterator.remove();
            }
        }
    }

    @Override // tb.agx
    public Path d() {
        Path.Op op;
        this.c.reset();
        if (this.f.c()) {
            return this.c;
        }
        int i = AnonymousClass1.f25330a[this.f.b().ordinal()];
        if (i != 1) {
            if (i == 2) {
                op = Path.Op.UNION;
            } else if (i == 3) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (i == 4) {
                op = Path.Op.INTERSECT;
            } else if (i == 5) {
                op = Path.Op.XOR;
            }
            a(op);
        } else {
            b();
        }
        return this.c;
    }
}
