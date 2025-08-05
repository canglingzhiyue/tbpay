package tb;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import java.util.ArrayList;
import java.util.List;
import tb.ahg;

/* loaded from: classes2.dex */
public class ahf implements agn, ahg.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f25337a;
    private final boolean b;
    private final List<ahg.a> c = new ArrayList();
    private final ShapeTrimPath.Type d;
    private final ahg<?, Float> e;
    private final ahg<?, Float> f;
    private final ahg<?, Float> g;

    public ahf(a aVar, ShapeTrimPath shapeTrimPath) {
        this.f25337a = shapeTrimPath.a();
        this.b = shapeTrimPath.f();
        this.d = shapeTrimPath.b();
        this.e = shapeTrimPath.d().a();
        this.f = shapeTrimPath.c().a();
        this.g = shapeTrimPath.e().a();
        aVar.a(this.e);
        aVar.a(this.f);
        aVar.a(this.g);
        this.e.a(this);
        this.f.a(this);
        this.g.a(this);
    }

    @Override // tb.agn
    public String a() {
        return this.f25337a;
    }

    @Override // tb.agn
    public void a(List<agn> list, List<agn> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ahg.a aVar) {
        this.c.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ShapeTrimPath.Type b() {
        return this.d;
    }

    public ahg<?, Float> c() {
        return this.e;
    }

    public ahg<?, Float> d() {
        return this.f;
    }

    public ahg<?, Float> e() {
        return this.g;
    }

    public boolean f() {
        return this.b;
    }

    @Override // tb.ahg.a
    public void onValueChanged() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).onValueChanged();
        }
    }
}
