package tb;

import com.airbnb.lottie.model.DocumentData;
import java.util.List;

/* loaded from: classes2.dex */
public class ahu extends ahm<DocumentData> {
    public ahu(List<akm<DocumentData>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.ahg
    /* renamed from: b */
    public DocumentData a(akm<DocumentData> akmVar, float f) {
        Object obj;
        if (this.c != null) {
            obj = this.c.a(akmVar.f, akmVar.g == null ? Float.MAX_VALUE : akmVar.g.floatValue(), akmVar.f25395a, akmVar.b == null ? akmVar.f25395a : akmVar.b, f, e(), h());
        } else {
            obj = (f != 1.0f || akmVar.b == null) ? akmVar.f25395a : akmVar.b;
        }
        return (DocumentData) obj;
    }

    public void b(final ako<String> akoVar) {
        final akn aknVar = new akn();
        final DocumentData documentData = new DocumentData();
        super.a(new ako<DocumentData>() { // from class: tb.ahu.1
            @Override // tb.ako
            /* renamed from: b */
            public DocumentData a(akn<DocumentData> aknVar2) {
                aknVar.a(aknVar2.a(), aknVar2.b(), aknVar2.c().f1748a, aknVar2.d().f1748a, aknVar2.e(), aknVar2.f(), aknVar2.g());
                String str = (String) akoVar.a(aknVar);
                DocumentData d = aknVar2.f() == 1.0f ? aknVar2.d() : aknVar2.c();
                documentData.a(str, d.b, d.c, d.d, d.e, d.f, d.g, d.h, d.i, d.j, d.k);
                return documentData;
            }
        });
    }
}
