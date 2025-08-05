package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.widget.preview.b;
import com.etao.feimagesearch.regionedit.a;
import com.etao.feimagesearch.regionedit.e;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public abstract class cru extends crw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-973703288);
    }

    public cru(b bVar) {
        super(bVar);
    }

    public void a(cry fingerPos, e selectedObject, csg csgVar, csg csgVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a54a0e2", new Object[]{this, fingerPos, selectedObject, csgVar, csgVar2});
            return;
        }
        q.c(fingerPos, "fingerPos");
        q.c(selectedObject, "selectedObject");
        if (csgVar != null) {
            float g = fingerPos.g() / h();
            RectF f = selectedObject.f();
            float e = crv.e();
            a f2 = f();
            if (f2 == null) {
                q.a();
            }
            csgVar.a(f, g, e / f2.getImageView().getWidth());
        }
        if (csgVar2 == null) {
            return;
        }
        float h = fingerPos.h() / i();
        RectF f3 = selectedObject.f();
        float e2 = crv.e();
        a f4 = f();
        if (f4 == null) {
            q.a();
        }
        csgVar2.a(f3, h, e2 / f4.getImageView().getHeight());
    }
}
