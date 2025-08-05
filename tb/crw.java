package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.b;
import com.etao.feimagesearch.regionedit.a;
import com.etao.feimagesearch.regionedit.e;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class crw implements crz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f26482a;
    private final b b;

    static {
        kge.a(-1319043108);
        kge.a(931782646);
    }

    @Override // tb.crz
    public void a(e selectedObjectRegion, List<e> totalObjects, e selfDefinedObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e084e6d7", new Object[]{this, selectedObjectRegion, totalObjects, selfDefinedObject});
            return;
        }
        q.c(selectedObjectRegion, "selectedObjectRegion");
        q.c(totalObjects, "totalObjects");
        q.c(selfDefinedObject, "selfDefinedObject");
    }

    public boolean a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("25edca5c", new Object[]{this, new Float(f), new Float(f2), new Float(f3)})).booleanValue() : f >= f2 && f <= f3;
    }

    @Override // tb.crz
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public crw(b bVar) {
        this.b = bVar;
    }

    public final a f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b3f48bbf", new Object[]{this}) : this.f26482a;
    }

    public final b g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d02e25ee", new Object[]{this}) : this.b;
    }

    @Override // tb.crz
    public void a(a editView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebb22ba", new Object[]{this, editView});
            return;
        }
        q.c(editView, "editView");
        this.f26482a = editView;
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue();
        }
        a aVar = this.f26482a;
        if (aVar == null) {
            return 0.0f;
        }
        return aVar.getImageView().getWidth() * aVar.getImageView().getScaleX();
    }

    public float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue();
        }
        a aVar = this.f26482a;
        if (aVar == null) {
            return 0.0f;
        }
        return aVar.getImageView().getHeight() * aVar.getImageView().getScaleY();
    }

    public boolean a(cry pos, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0dd15b2", new Object[]{this, pos, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        q.c(pos, "pos");
        return a(pos.e(), f, f3) && a(pos.f(), f2, f4);
    }

    public void a(RectF dest, RectF src) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd78a", new Object[]{this, dest, src});
            return;
        }
        q.c(dest, "dest");
        q.c(src, "src");
        a aVar = this.f26482a;
        if (aVar == null) {
            return;
        }
        dest.set(src);
        dest.left *= aVar.getImageView().getScaleX();
        dest.top *= aVar.getImageView().getScaleY();
        dest.right = dest.left + (aVar.getImageView().getScaleX() * src.width());
        dest.bottom = dest.top + (aVar.getImageView().getScaleY() * src.height());
        dest.offset(j(), k());
    }

    public boolean a(cry cryVar) {
        a aVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e4032cb2", new Object[]{this, cryVar})).booleanValue() : (cryVar == null || (aVar = this.f26482a) == null || cryVar.i() < ((float) aVar.getTouchSlop())) ? false : true;
    }

    public float j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[]{this})).floatValue();
        }
        a aVar = this.f26482a;
        if (aVar == null) {
            return 0.0f;
        }
        return aVar.getImageView().getLeft() + aVar.getImageView().getTranslationX();
    }

    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95762", new Object[]{this})).floatValue();
        }
        a aVar = this.f26482a;
        if (aVar == null) {
            return 0.0f;
        }
        return aVar.getImageView().getTop() + aVar.getImageView().getTranslationY();
    }

    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee3", new Object[]{this})).floatValue();
        }
        a aVar = this.f26482a;
        if (aVar == null) {
            return 0.0f;
        }
        return aVar.getImageView().getTop();
    }

    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158664", new Object[]{this})).floatValue();
        }
        a aVar = this.f26482a;
        if (aVar == null) {
            return 0.0f;
        }
        return aVar.getImageView().getBottom();
    }

    public float n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de5", new Object[]{this})).floatValue();
        }
        a aVar = this.f26482a;
        if (aVar == null) {
            return 0.0f;
        }
        return aVar.getImageView().getLeft();
    }
}
