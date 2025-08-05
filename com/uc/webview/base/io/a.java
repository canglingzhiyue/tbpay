package com.uc.webview.base.io;

import android.text.TextUtils;
import com.uc.webview.base.Log;
import com.uc.webview.base.a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* loaded from: classes9.dex */
public final class a {
    private static final String d = "a";

    /* renamed from: a  reason: collision with root package name */
    public final File f23785a;
    public final InterfaceC1034a b;
    private final long e;
    private final com.uc.webview.base.io.b f;
    private c g = null;
    public d c = null;

    /* renamed from: com.uc.webview.base.io.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public interface InterfaceC1034a {
        String a(String str);

        String b(String str);
    }

    /* loaded from: classes9.dex */
    public static class b implements InterfaceC1034a {
        @Override // com.uc.webview.base.io.a.InterfaceC1034a
        public final String a(String str) {
            return a.c.a(str);
        }

        @Override // com.uc.webview.base.io.a.InterfaceC1034a
        public final String b(String str) {
            return a.c.b(str);
        }
    }

    /* loaded from: classes9.dex */
    class c {

        /* renamed from: a  reason: collision with root package name */
        final InputStream f23786a;
        final BufferedReader b;

        public c(File file) throws Exception {
            this.f23786a = new FileInputStream(file);
            this.b = new BufferedReader(new InputStreamReader(this.f23786a), 1024);
        }

        public final String a() {
            try {
                return this.b.readLine();
            } catch (Throwable th) {
                Log.w(a.d, "readLine failed", th);
                return null;
            }
        }
    }

    /* loaded from: classes9.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        final OutputStream f23787a;
        final BufferedWriter b;
        private long d;

        public d(File file, boolean z) throws Exception {
            this.f23787a = new FileOutputStream(file, z);
            this.b = new BufferedWriter(new OutputStreamWriter(this.f23787a), 1024);
            try {
                this.d = file.length();
            } catch (Throwable unused) {
            }
        }

        public final boolean a(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                this.b.write(str);
                this.b.newLine();
                this.d += str.length();
                if (this.d < a.this.e) {
                    return true;
                }
                Log.w(a.d, "write file reach max limit, length:" + this.d);
                return false;
            } catch (Throwable th) {
                Log.w(a.d, "writeLine failed", th);
                return false;
            }
        }
    }

    public a(File file, long j, InterfaceC1034a interfaceC1034a) {
        this.f23785a = file;
        this.e = j;
        this.f = new com.uc.webview.base.io.b(this.f23785a, true);
        this.b = interfaceC1034a;
        com.uc.webview.base.io.b bVar = this.f;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final boolean a() {
        try {
            if (!this.f23785a.exists()) {
                return false;
            }
            long length = this.f23785a.length();
            if (length <= 0) {
                return false;
            }
            return length <= this.e;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String b() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("path=");
            sb.append(this.f23785a.getAbsolutePath());
            sb.append(", exists=");
            sb.append(this.f23785a.exists());
            if (this.f23785a.exists()) {
                sb.append(", length=");
                sb.append(this.f23785a.length());
            }
            if (this.e != Long.MAX_VALUE) {
                sb.append(", maxSize=");
                sb.append(this.e);
            }
            return sb.toString();
        } catch (Throwable th) {
            return th.toString();
        }
    }

    public final String c() throws Exception {
        if (this.g == null) {
            this.g = new c(this.f23785a);
        }
        String a2 = this.g.a();
        InterfaceC1034a interfaceC1034a = this.b;
        return (interfaceC1034a == null || a2 == null) ? a2 : interfaceC1034a.b(a2);
    }

    public final void d() {
        c cVar = this.g;
        if (cVar != null) {
            com.uc.webview.base.io.d.a(cVar.b);
            com.uc.webview.base.io.d.a(cVar.f23786a);
            this.g = null;
        }
        d dVar = this.c;
        if (dVar != null) {
            com.uc.webview.base.io.d.a(dVar.b);
            com.uc.webview.base.io.d.a(dVar.f23787a);
            this.c = null;
        }
        com.uc.webview.base.io.b bVar = this.f;
        if (bVar != null) {
            bVar.b();
        }
    }
}
