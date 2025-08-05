package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.k;
import java.util.HashSet;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public class coi implements coo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26353a = "BaseFaceDetector";
    private final HashSet<Integer> b = new HashSet<>();
    private k c;

    static {
        kge.a(1719913027);
        kge.a(-1070175459);
    }

    public final void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c05ee71d", new Object[]{this, kVar});
        } else {
            this.c = kVar;
        }
    }

    public final k c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("d462c2a1", new Object[]{this}) : this.c;
    }

    @Override // tb.coo
    public void b(k prepareResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2737a6de", new Object[]{this, prepareResultCallback});
            return;
        }
        q.c(prepareResultCallback, "prepareResultCallback");
        this.c = prepareResultCallback;
    }

    @Override // tb.coo
    public void c(k prepareResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e10669f", new Object[]{this, prepareResultCallback});
            return;
        }
        q.c(prepareResultCallback, "prepareResultCallback");
        if (!q.a(this.c, prepareResultCallback)) {
            return;
        }
        this.c = null;
    }

    @Override // tb.coo
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        String str = this.f26353a;
        cot.a(cok.SCENE, str, "Preparing model " + i);
        this.b.add(Integer.valueOf(i));
    }

    @Override // tb.coo
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        String str = this.f26353a;
        cot.a(cok.SCENE, str, "releaseModel " + i);
        this.b.remove(Integer.valueOf(i));
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b.isEmpty();
    }

    @Override // tb.coo
    public cpa a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpa) ipChange.ipc$dispatch("435a89ec", new Object[]{this, bitmap});
        }
        q.c(bitmap, "bitmap");
        return new cpa(-1, "");
    }
}
