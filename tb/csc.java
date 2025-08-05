package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.b;
import com.etao.feimagesearch.regionedit.a;
import com.etao.feimagesearch.regionedit.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public class csc extends crt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final RectF f26485a;
    private final RectF b;

    static {
        kge.a(590930238);
    }

    public static /* synthetic */ Object ipc$super(csc cscVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.crz
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 2;
    }

    public csc(b bVar) {
        super(bVar);
        this.f26485a = new RectF();
        this.b = new RectF();
    }

    @Override // tb.crz
    public boolean a(SparseArray<cry> fingerArray, e selectedObjectRegion, List<e> totalObjects, e selfDefinedObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61ac2a7e", new Object[]{this, fingerArray, selectedObjectRegion, totalObjects, selfDefinedObject})).booleanValue();
        }
        q.c(fingerArray, "fingerArray");
        q.c(selectedObjectRegion, "selectedObjectRegion");
        q.c(totalObjects, "totalObjects");
        q.c(selfDefinedObject, "selfDefinedObject");
        return a(fingerArray.get(0));
    }

    public final void a(float f, float f2, boolean z) {
        View holderView;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ee156c", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        a f3 = f();
        if (f3 == null) {
            return;
        }
        a(this.f26485a);
        this.b.set(this.f26485a);
        a(this.b, 0.3f, n(), c(), csd.$ipChange, f, z);
        float l = l();
        a f4 = f();
        if (f4 != null && (holderView = f4.getHolderView()) != null) {
            i = holderView.getTop();
        }
        a(this.b, 0.3f, rwf.a(l, i + f3.getDragTopEdgeLimit()), rwf.b(m(), f3.getDragBottomEdgeLimit()), csd.$ipChange, f2, z);
        if (this.f26485a.left != this.b.left) {
            a f5 = f();
            if (f5 == null) {
                q.a();
            }
            f3.setImageTranslationX((f5.getImageView().getTranslationX() + this.b.left) - this.f26485a.left);
        }
        if (this.f26485a.top == this.b.top) {
            return;
        }
        a f6 = f();
        if (f6 == null) {
            q.a();
        }
        f3.setImageTranslationY((f6.getImageView().getTranslationY() + this.b.top) - this.f26485a.top);
    }

    private final void a(RectF rectF, float f, float f2, float f3, csi csiVar, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4b7c12", new Object[]{this, rectF, new Float(f), new Float(f2), new Float(f3), csiVar, new Float(f4), new Boolean(z)});
            return;
        }
        if (z) {
            if (csiVar.a(rectF) + f4 > f2) {
                if (csiVar.a(rectF) < f2) {
                    f4 += csiVar.a(rectF) - f2;
                    csiVar.a(rectF, f2);
                }
                f4 *= f;
            } else if (csiVar.b(rectF) + f4 < f3) {
                if (csiVar.b(rectF) > f3) {
                    f4 += csiVar.b(rectF) - f3;
                    csiVar.b(rectF, f3);
                }
                f4 *= f;
            }
        }
        csiVar.c(rectF, f4);
    }

    private final void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
            return;
        }
        float j = j();
        float k = k();
        rectF.set(j, k, h() + j, i() + k);
    }

    @Override // tb.crw, tb.crz
    public void a(e selectedObjectRegion, List<e> totalObjects, e selfDefinedObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e084e6d7", new Object[]{this, selectedObjectRegion, totalObjects, selfDefinedObject});
            return;
        }
        q.c(selectedObjectRegion, "selectedObjectRegion");
        q.c(totalObjects, "totalObjects");
        q.c(selfDefinedObject, "selfDefinedObject");
        e();
        cox.a("picDrag", new String[0]);
    }

    @Override // tb.crz
    public boolean b(SparseArray<cry> fingerArray, e selectedObjectRegion, List<e> totalObjects, e selfDefinedObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f037ab7f", new Object[]{this, fingerArray, selectedObjectRegion, totalObjects, selfDefinedObject})).booleanValue();
        }
        q.c(fingerArray, "fingerArray");
        q.c(selectedObjectRegion, "selectedObjectRegion");
        q.c(totalObjects, "totalObjects");
        q.c(selfDefinedObject, "selfDefinedObject");
        cry cryVar = fingerArray.get(0);
        if (cryVar == null) {
            return false;
        }
        a(cryVar.g(), cryVar.h(), true);
        return true;
    }

    @Override // tb.crt
    public void e() {
        View holderView;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a f = f();
        if (f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(2);
        a((List<Animator>) arrayList, h(), c(), j(), true, f);
        float l = l();
        a f2 = f();
        if (f2 != null && (holderView = f2.getHolderView()) != null) {
            i = holderView.getTop();
        }
        a(arrayList, rwf.a(l, i + f.getDragTopEdgeLimit()), rwf.b(m(), f.getDragBottomEdgeLimit()), i(), k(), f);
        if (arrayList.isEmpty()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        a(animatorSet);
    }

    private final void a(List<Animator> list, float f, float f2, float f3, float f4, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24aece9", new Object[]{this, list, new Float(f), new Float(f2), new Float(f3), new Float(f4), aVar});
        } else {
            a(list, f4, f4 + f3, f, f2, false, aVar);
        }
    }
}
