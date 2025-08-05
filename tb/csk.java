package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.b;
import com.etao.feimagesearch.regionedit.a;
import com.etao.feimagesearch.regionedit.e;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class csk extends csc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private float f26488a;
    private float[] b;
    private float c;
    private float d;
    private float e;

    static {
        kge.a(479010870);
    }

    public static /* synthetic */ Object ipc$super(csk cskVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.csc, tb.crz
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 3;
    }

    public csk(b bVar) {
        super(bVar);
        this.f26488a = -1.0f;
    }

    @Override // tb.csc, tb.crz
    public boolean a(SparseArray<cry> fingerArray, e selectedObjectRegion, List<e> totalObjects, e selfDefinedObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61ac2a7e", new Object[]{this, fingerArray, selectedObjectRegion, totalObjects, selfDefinedObject})).booleanValue();
        }
        q.c(fingerArray, "fingerArray");
        q.c(selectedObjectRegion, "selectedObjectRegion");
        q.c(totalObjects, "totalObjects");
        q.c(selfDefinedObject, "selfDefinedObject");
        return fingerArray.size() > 1;
    }

    @Override // tb.csc, tb.crw, tb.crz
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
        cox.a("picZoom", new String[0]);
        this.f26488a = -1.0f;
    }

    @Override // tb.csc, tb.crz
    public boolean b(SparseArray<cry> fingerArray, e selectedObjectRegion, List<e> totalObjects, e selfDefinedObject) {
        cry cryVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f037ab7f", new Object[]{this, fingerArray, selectedObjectRegion, totalObjects, selfDefinedObject})).booleanValue();
        }
        q.c(fingerArray, "fingerArray");
        q.c(selectedObjectRegion, "selectedObjectRegion");
        q.c(totalObjects, "totalObjects");
        q.c(selfDefinedObject, "selfDefinedObject");
        a f = f();
        if (f == null) {
            return false;
        }
        if (fingerArray.size() < 2) {
            this.f26488a = -1.0f;
            return true;
        }
        cry cryVar2 = fingerArray.get(0);
        if (cryVar2 == null || (cryVar = fingerArray.get(1)) == null) {
            return true;
        }
        if (this.f26488a < 0) {
            a f2 = f();
            if (f2 == null) {
                q.a();
            }
            this.f26488a = f2.getImageView().getScaleX();
            this.c = 1.0f;
            float f3 = this.f26488a;
            this.d = 3.0f / f3;
            this.e = 1.0f / f3;
            cryVar2.j();
            cryVar.j();
            this.b = a(cryVar2, cryVar);
        }
        this.c += (((float) Math.sqrt(crx.a(cryVar2.a() - cryVar.a()) + crx.a(cryVar2.b() - cryVar.b()))) - ((float) Math.sqrt(crx.a(cryVar2.c() - cryVar.c()) + crx.a(cryVar2.d() - cryVar.d())))) / ((float) Math.sqrt(crx.a(cryVar2.e() - cryVar.e()) + crx.a(cryVar2.f() - cryVar.f())));
        this.c = rwf.b(this.d, rwf.a(this.e, this.c));
        float f4 = this.f26488a * this.c;
        float[] a2 = a(cryVar2, cryVar);
        f.setImageScale(f4);
        float f5 = a2[0];
        float[] fArr = this.b;
        if (fArr == null) {
            q.a();
        }
        float f6 = (f5 - fArr[0]) * f4;
        float f7 = a2[1];
        float[] fArr2 = this.b;
        if (fArr2 == null) {
            q.a();
        }
        a(f6, (f7 - fArr2[1]) * f4, false);
        return true;
    }

    private final float[] a(cry cryVar, cry cryVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("a778986d", new Object[]{this, cryVar, cryVar2});
        }
        float j = j();
        float k = k();
        float a2 = ((cryVar.a() + cryVar2.a()) / 2.0f) - j;
        float b = ((cryVar.b() + cryVar2.b()) / 2.0f) - k;
        float[] fArr = new float[2];
        a f = f();
        if (f == null) {
            q.a();
        }
        fArr[0] = a2 / f.getImageView().getScaleX();
        a f2 = f();
        if (f2 == null) {
            q.a();
        }
        fArr[1] = b / f2.getImageView().getScaleY();
        return fArr;
    }
}
