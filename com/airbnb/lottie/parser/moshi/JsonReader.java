package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.ByteString;
import okio.d;
import okio.f;
import tb.akh;

/* loaded from: classes2.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] g = new String[128];

    /* renamed from: a  reason: collision with root package name */
    int f1786a;
    int[] b = new int[32];
    String[] c = new String[32];
    int[] d = new int[32];
    boolean e;
    boolean f;

    /* loaded from: classes2.dex */
    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final String[] f1787a;
        final f b;

        private a(String[] strArr, f fVar) {
            this.f1787a = strArr;
            this.b = fVar;
        }

        public static a a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                okio.b bVar = new okio.b();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.b(bVar, strArr[i]);
                    bVar.g();
                    byteStringArr[i] = bVar.l();
                }
                return new a((String[]) strArr.clone(), f.a(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            g[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader a(d dVar) {
        return new b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(okio.c r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.g
            r1 = 34
            r7.e(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.b(r8, r4, r3)
        L2e:
            r7.b(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.b(r8, r4, r2)
        L3b:
            r7.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.b(okio.c, java.lang.String):void");
    }

    public abstract int a(a aVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JsonEncodingException a(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + n());
    }

    public abstract void a() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        int i2 = this.f1786a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                akh.c("Nesting too deep at " + n());
                return;
            }
            this.b = Arrays.copyOf(iArr, iArr.length << 1);
            String[] strArr = this.c;
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
            int[] iArr2 = this.d;
            this.d = Arrays.copyOf(iArr2, iArr2.length << 1);
        }
        int[] iArr3 = this.b;
        int i3 = this.f1786a;
        this.f1786a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void b() throws IOException;

    public abstract void c() throws IOException;

    public abstract void d() throws IOException;

    public abstract boolean e() throws IOException;

    public abstract Token f() throws IOException;

    public abstract String g() throws IOException;

    public abstract void h() throws IOException;

    public abstract String i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract double k() throws IOException;

    public abstract int l() throws IOException;

    public abstract void m() throws IOException;

    public final String n() {
        return com.airbnb.lottie.parser.moshi.a.a(this.f1786a, this.b, this.c, this.d);
    }
}
