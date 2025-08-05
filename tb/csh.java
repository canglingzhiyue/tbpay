package tb;

import android.graphics.RectF;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.b;
import com.etao.feimagesearch.regionedit.a;
import com.etao.feimagesearch.regionedit.e;
import java.util.List;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class csh extends crw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1052114875);
    }

    public static /* synthetic */ Object ipc$super(csh cshVar, String str, Object... objArr) {
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
        return 4;
    }

    public csh(b bVar) {
        super(bVar);
    }

    @Override // tb.crz
    public boolean a(SparseArray<cry> fingerArray, e selectedObjectRegion, List<e> totalObjects, e selfDefinedObject) {
        RectF i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61ac2a7e", new Object[]{this, fingerArray, selectedObjectRegion, totalObjects, selfDefinedObject})).booleanValue();
        }
        q.c(fingerArray, "fingerArray");
        q.c(selectedObjectRegion, "selectedObjectRegion");
        q.c(totalObjects, "totalObjects");
        q.c(selfDefinedObject, "selfDefinedObject");
        cry cryVar = fingerArray.get(0);
        if (!a(cryVar) || (i = selectedObjectRegion.i()) == null) {
            return false;
        }
        a(crx.a(), i);
        return crx.a().contains(cryVar.e(), cryVar.f());
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
        cox.a("itemBoxDrag", new String[0]);
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
        if (!q.a(selectedObjectRegion, selfDefinedObject)) {
            selectedObjectRegion.c();
        }
        cry cryVar = fingerArray.get(0);
        if (cryVar == null) {
            return false;
        }
        selectedObjectRegion.f().offset(cryVar.g() / h(), cryVar.h() / i());
        a(selectedObjectRegion.f());
        return true;
    }

    private final void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
            return;
        }
        if (rectF.left < 0.0f) {
            rectF.offset(-rectF.left, 0.0f);
        } else if (rectF.right > 1.0f) {
            rectF.offset(1.0f - rectF.right, 0.0f);
        }
        if (rectF.top < 0.0f) {
            rectF.offset(0.0f, -rectF.top);
        } else if (rectF.bottom <= 1.0f) {
        } else {
            rectF.offset(0.0f, 1.0f - rectF.bottom);
        }
    }
}
