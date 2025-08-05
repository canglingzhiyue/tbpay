package tb;

import android.content.Context;

/* loaded from: classes4.dex */
public class czj extends czh<czk> {

    /* renamed from: a  reason: collision with root package name */
    private Context f26616a;

    public czj(czk czkVar, Context context) {
        super(czkVar);
        this.f26616a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.czh
    public void a() {
        czr.b(this.f26616a, c().b(), c().c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.czh
    public void a(String str) {
        czr.b(this.f26616a, c().b(), c().c(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // tb.czh
    public String b() {
        return (String) czr.a(this.f26616a, c().b(), c().c(), "");
    }
}
