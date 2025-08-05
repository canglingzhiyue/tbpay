package tb;

import android.os.Build;

/* loaded from: classes4.dex */
public class cyj {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26600a = "RootKeyUtil";
    private byte[] b = null;

    private cyj() {
    }

    public static cyj a(String str, String str2, String str3, String str4) {
        cyj cyjVar = new cyj();
        cyjVar.b(str, str2, str3, str4);
        return cyjVar;
    }

    private void a(String str, String str2, String str3, byte[] bArr) {
        if (Build.VERSION.SDK_INT < 26) {
            cyl.a(f26600a, "initRootKey: sha1");
            this.b = cyg.a(str, str2, str3, bArr, false);
            return;
        }
        cyl.a(f26600a, "initRootKey: sha256");
        this.b = cyg.a(str, str2, str3, bArr, true);
    }

    private void b(String str, String str2, String str3, String str4) {
        a(str, str2, str3, cyi.a(str4));
    }

    public byte[] a() {
        return (byte[]) this.b.clone();
    }
}
