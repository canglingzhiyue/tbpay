package tb;

import android.graphics.RectF;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.b;
import com.etao.feimagesearch.regionedit.a;
import com.etao.feimagesearch.regionedit.e;
import com.etao.feimagesearch.util.g;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class crs extends cru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f26479a;
    private int b;

    static {
        kge.a(1022499617);
    }

    public static /* synthetic */ Object ipc$super(crs crsVar, String str, Object... objArr) {
        if (str.hashCode() == -528161065) {
            super.a((e) objArr[0], (List) objArr[1], (e) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.crz
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 6;
    }

    public crs(b bVar) {
        super(bVar);
        this.f26479a = g.a(10.0f);
    }

    private final boolean a(cry cryVar, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2077e1c3", new Object[]{this, cryVar, rectF})).booleanValue();
        }
        if (a(cryVar, rectF.left, rectF.top - this.f26479a, rectF.right, rectF.top + this.f26479a)) {
            this.b = 1;
            return true;
        } else if (a(cryVar, rectF.left - this.f26479a, rectF.top, rectF.left + this.f26479a, rectF.bottom)) {
            this.b = 2;
            return true;
        } else if (a(cryVar, rectF.left, rectF.bottom - this.f26479a, rectF.right, rectF.bottom + this.f26479a)) {
            this.b = 4;
            return true;
        } else if (!a(cryVar, rectF.right - this.f26479a, rectF.top, rectF.right + this.f26479a, rectF.bottom)) {
            return false;
        } else {
            this.b = 3;
            return true;
        }
    }

    @Override // tb.crw, tb.crz
    public void a(e selectedObjectRegion, List<e> totalObjects, e selfDefinedObject) {
        a f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e084e6d7", new Object[]{this, selectedObjectRegion, totalObjects, selfDefinedObject});
            return;
        }
        q.c(selectedObjectRegion, "selectedObjectRegion");
        q.c(totalObjects, "totalObjects");
        q.c(selfDefinedObject, "selfDefinedObject");
        super.a(selectedObjectRegion, totalObjects, selfDefinedObject);
        if ((!q.a(selectedObjectRegion, selfDefinedObject)) && (f = f()) != null) {
            f.setSelfDefinedSelected();
        }
        b g = g();
        if (g != null) {
            g.b(selfDefinedObject.f(), null);
        }
        cox.a("itemBoxEdgeAdjust", new String[0]);
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
        if (fingerArray.size() != 1 || !a(fingerArray.get(0))) {
            return false;
        }
        a(crx.a(), selectedObjectRegion.i());
        cry cryVar = fingerArray.get(0);
        q.a((Object) cryVar, "fingerArray[0]");
        return a(cryVar, crx.a());
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
        if (!q.a(selectedObjectRegion, selfDefinedObject)) {
            selectedObjectRegion.c();
        }
        int i = this.b;
        if (i == 1) {
            a(cryVar, selectedObjectRegion, (csg) null, crv.a());
        } else if (i == 2) {
            a(cryVar, selectedObjectRegion, crv.c(), (csg) null);
        } else if (i == 3) {
            a(cryVar, selectedObjectRegion, crv.d(), (csg) null);
        } else if (i == 4) {
            a(cryVar, selectedObjectRegion, (csg) null, crv.b());
        }
        return true;
    }
}
