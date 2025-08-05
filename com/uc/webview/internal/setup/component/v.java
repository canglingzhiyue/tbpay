package com.uc.webview.internal.setup.component;

import com.uc.webview.internal.setup.component.j;
import tb.riy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class v {
    static final /* synthetic */ boolean i = !v.class.desiredAssertionStatus();

    /* renamed from: a  reason: collision with root package name */
    final String f23938a;
    final String b;
    final boolean c;
    final boolean d;
    final o e;
    final o f;
    final String g;
    final String h;

    private v(String str, boolean z, o oVar, o oVar2, String str2, String str3) {
        if (i || !oVar.f23929a.f.equals(oVar2.f23929a.f)) {
            this.f23938a = str;
            this.b = str;
            this.c = z;
            this.d = true;
            this.e = oVar;
            this.f = oVar2;
            this.g = str2;
            this.h = str3;
            return;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(String str, j.a aVar, int i2, int i3, String str2, String str3) {
        i iVar;
        q qVar;
        boolean z;
        q qVar2;
        if (i2 == 1) {
            qVar = r.f23934a[i2];
            iVar = null;
            z = false;
        } else if (!i && i2 != 100) {
            throw new AssertionError();
        } else {
            q qVar3 = new q("U4CoreLite", i2);
            i iVar2 = new i(qVar3, "U4PatchBase0-5.12.6.0-240927172644");
            iVar2.b = com.uc.webview.internal.setup.m.f23979a;
            iVar = iVar2;
            qVar = qVar3;
            z = true;
        }
        String str4 = r.f23934a[1].g;
        String substring = str4.substring(0, str4.lastIndexOf(47));
        if (i3 == 101) {
            qVar2 = new q("U4PatchOnFull", i3, 1, "U4Patch${ARCH}1", substring);
        } else if (!i && i3 != 109) {
            throw new AssertionError();
        } else {
            qVar2 = new q("U4PatchOnLite", i3, 1, "U4Patch${ARCH}0", substring);
        }
        return new v(str, z, new o(aVar, qVar, iVar), new o(aVar, qVar2), str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return (this.e.b == null || this.f.b == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.uc.webview.internal.setup.component.j.a r8) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.component.v.a(com.uc.webview.internal.setup.component.j$a):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        return (!a() || this.e.b.b == null || this.f.b.b == null) ? false : true;
    }

    public String toString() {
        return "{old: " + this.e + ", patch: " + this.f + riy.BLOCK_END_STR;
    }
}
