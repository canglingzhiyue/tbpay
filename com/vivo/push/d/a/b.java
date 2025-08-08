package com.vivo.push.d.a;

import mtopsdk.common.util.StringUtils;
import com.vivo.push.restructure.request.a.a.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class b implements com.vivo.push.restructure.request.a.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a<b> f24179a = new c();
    private String b;
    private List<com.vivo.push.d.b> c;
    private int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(com.vivo.push.restructure.request.a.a.a aVar) throws JSONException {
        this.c = new ArrayList();
        this.b = aVar.c();
        this.d = aVar.a();
        aVar.a(com.vivo.push.d.b.f24180a, this.c);
    }

    public b(String str, List<com.vivo.push.d.b> list, int i) {
        this.c = new ArrayList();
        this.b = str;
        this.d = i;
        this.c = list;
    }

    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (com.vivo.push.d.b bVar : this.c) {
            String b = bVar.b();
            if (!StringUtils.isEmpty(b)) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.d);
        aVar.a(this.c);
    }
}
