package tb;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.j;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ahn {

    /* renamed from: a  reason: collision with root package name */
    private final List<ahg<j, Path>> f25343a;
    private final List<ahg<Integer, Integer>> b;
    private final List<Mask> c;

    public ahn(List<Mask> list) {
        this.c = list;
        this.f25343a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f25343a.add(list.get(i).b().a());
            this.b.add(list.get(i).c().a());
        }
    }

    public List<Mask> a() {
        return this.c;
    }

    public List<ahg<j, Path>> b() {
        return this.f25343a;
    }

    public List<ahg<Integer, Integer>> c() {
        return this.b;
    }
}
