package com.uc.webview.internal.setup.component;

import mtopsdk.common.util.StringUtils;
import com.uc.webview.internal.setup.component.j;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/* loaded from: classes9.dex */
final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    protected final q f23908a;
    protected j.a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(q qVar) {
        this.f23908a = qVar;
    }

    private boolean a(i iVar, File file) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            for (String str : this.f23908a.j) {
                File file2 = new File(file, str);
                if (!file2.exists()) {
                    l.d(this.f23908a.f23933a, "file not exists - %s", file2.getAbsolutePath());
                    return false;
                }
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    while (true) {
                        try {
                            int read = fileInputStream2.read(bArr);
                            if (read > 0) {
                                messageDigest.update(bArr, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    fileInputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            l.a(this.f23908a.f23933a, "MD5, want: %s, got: %s", iVar.g, bigInteger);
            return bigInteger != null && bigInteger.startsWith(iVar.g);
        } catch (Throwable th3) {
            l.a(5, this.f23908a.f23933a, "MD5 exception", th3);
            return false;
        }
    }

    @Override // com.uc.webview.internal.setup.component.k
    public final int a(File file) {
        if (!file.exists()) {
            l.c(this.f23908a.f23933a, "file not exists - %s", file.getAbsolutePath());
            return -201;
        } else if (!file.isDirectory()) {
            return -118;
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return -200;
            }
            if (this.f23908a.j == null) {
                return -118;
            }
            for (String str : this.f23908a.j) {
                File file2 = new File(file, str);
                if (!file2.exists()) {
                    l.c(this.f23908a.f23933a, "file not exists - %s", file2.getAbsolutePath());
                    return -201;
                }
            }
            return -118;
        }
    }

    @Override // com.uc.webview.internal.setup.component.k
    public final p a() {
        return new p(-118, -9);
    }

    @Override // com.uc.webview.internal.setup.component.k
    public final p a(i iVar) {
        int a2 = a(iVar.f23911a);
        if (p.a(a2) && !StringUtils.isEmpty(iVar.g) && this.f23908a.j != null && this.f23908a.j.length > 0 && !a(iVar, iVar.f23911a)) {
            a2 = -250;
        }
        return new p(a2, -10);
    }

    @Override // com.uc.webview.internal.setup.component.k
    public final void a(j.a aVar) {
        this.b = aVar;
    }
}
