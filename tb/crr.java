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
public final class crr extends cru {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f26478a;
    private int b;

    static {
        kge.a(-1431385655);
    }

    public static /* synthetic */ Object ipc$super(crr crrVar, String str, Object... objArr) {
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
        return 5;
    }

    public crr(b bVar) {
        super(bVar);
        this.b = g.a(17.0f);
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
        cry cryVar = fingerArray.get(0);
        q.a((Object) cryVar, "fingerArray[0]");
        return a(cryVar, selectedObjectRegion);
    }

    private final boolean a(cry cryVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7f507b4", new Object[]{this, cryVar, eVar})).booleanValue();
        }
        RectF i = eVar.i();
        if (i == null) {
            return false;
        }
        a(crx.a(), i);
        RectF a2 = crx.a();
        if (a(cryVar, a2.left - this.b, a2.top - this.b, a2.left + this.b, a2.top + this.b)) {
            this.f26478a = 1;
            return true;
        } else if (a(cryVar, a2.right - this.b, a2.top - this.b, a2.right + this.b, a2.top + this.b)) {
            this.f26478a = 2;
            return true;
        } else if (a(cryVar, a2.left - this.b, a2.bottom - this.b, a2.left + this.b, a2.bottom + this.b)) {
            this.f26478a = 3;
            return true;
        } else if (!a(cryVar, a2.right - this.b, a2.bottom - this.b, a2.right + this.b, a2.bottom + this.b)) {
            return false;
        } else {
            this.f26478a = 4;
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
        cox.a("itemBoxCornerAdjust", new String[0]);
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
        int i = this.f26478a;
        if (i == 1) {
            a(cryVar, selectedObjectRegion, crv.c(), crv.a());
        } else if (i == 2) {
            a(cryVar, selectedObjectRegion, crv.d(), crv.a());
        } else if (i == 3) {
            a(cryVar, selectedObjectRegion, crv.c(), crv.b());
        } else if (i == 4) {
            a(cryVar, selectedObjectRegion, crv.d(), crv.b());
        }
        return true;
    }
}
