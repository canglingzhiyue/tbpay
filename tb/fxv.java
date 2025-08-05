package tb;

import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class fxv implements fyy<Integer, WeakReference<View>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final fxy<fxw, fym> f28198a;
    private final float b;
    private final boolean c;

    static {
        kge.a(-506716656);
        kge.a(-64242879);
    }

    @Override // tb.fza
    public boolean a(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("425c17fd", new Object[]{this, num, weakReference, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.fzc
    public /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2, String str, Map map) {
        return a((Integer) obj, (WeakReference) obj2, str, (Map<Integer, WeakReference<View>>) map);
    }

    public fxv(fxy<fxw, fym> fxyVar, float f, boolean z) {
        this.f28198a = fxyVar;
        this.b = Math.min(f, 1.0f);
        this.c = z;
    }

    @Override // tb.fzb
    public void b(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2587cb3a", new Object[]{this, num, weakReference, str});
        } else {
            this.f28198a.a((fxy<fxw, fym>) new fxw(num.intValue(), System.nanoTime(), weakReference), str);
        }
    }

    @Override // tb.fzb
    public void a(List<Pair<Integer, WeakReference<View>>> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<Integer, WeakReference<View>> pair : list) {
            if (pair.first != null && pair.second != null) {
                arrayList.add(new fxw(((Integer) pair.first).intValue(), System.nanoTime(), (WeakReference) pair.second));
            }
        }
        this.f28198a.a(arrayList, str);
    }

    public boolean a(Integer num, WeakReference<View> weakReference, String str, Map<Integer, WeakReference<View>> map) {
        fxy<fxw, fym> fxyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f445b270", new Object[]{this, num, weakReference, str, map})).booleanValue();
        }
        View view = weakReference.get();
        if (view == null) {
            return false;
        }
        boolean a2 = fzh.a(view, this.b);
        if (this.c && !a2 && (fxyVar = this.f28198a) != null) {
            fxyVar.b(new fxw(num.intValue(), -1L, weakReference), str);
        }
        return a2;
    }

    @Override // tb.fyz
    public void c(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b37e7b", new Object[]{this, num, weakReference, str});
        } else {
            this.f28198a.b(new fxw(num.intValue(), -1L, weakReference), str);
        }
    }
}
