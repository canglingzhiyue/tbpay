package tb;

import com.alibaba.fastjson2.time.DateTimeFormatter;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class aaj {

    /* renamed from: a  reason: collision with root package name */
    public final String f25183a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    protected final boolean e;
    protected final boolean f;
    public final boolean g;
    public final Locale h;
    protected final boolean i;
    protected final boolean j;
    DateTimeFormatter k;

    static {
        kge.a(-829834432);
    }

    public aaj(String str) {
        this(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aaj(java.lang.String r6, java.util.Locale r7) {
        /*
            r5 = this;
            r5.<init>()
            if (r6 == 0) goto Ld
            java.lang.String r0 = "aa"
            java.lang.String r1 = "a"
            java.lang.String r6 = r6.replaceAll(r0, r1)
        Ld:
            r5.f25183a = r6
            r5.h = r7
            java.lang.String r7 = "yyyy-MM-dd HH:mm:ss"
            boolean r7 = r7.equals(r6)
            r5.i = r7
            java.lang.String r7 = "yyyy-MM-dd HH:mm"
            boolean r7 = r7.equals(r6)
            r5.j = r7
            r7 = 1
            r0 = 0
            if (r6 == 0) goto L9b
            int r1 = r6.hashCode()
            r2 = -1074095546(0xffffffffbffa9a46, float:-1.957833)
            r3 = 2
            r4 = -1
            if (r1 == r2) goto L52
            r2 = -288020395(0xffffffffeed52855, float:-3.2984533E28)
            if (r1 == r2) goto L47
            r2 = 2095190916(0x7ce21384, float:9.390839E36)
            if (r1 == r2) goto L3d
            goto L5c
        L3d:
            java.lang.String r1 = "iso8601"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 1
            goto L5d
        L47:
            java.lang.String r1 = "unixtime"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 0
            goto L5d
        L52:
            java.lang.String r1 = "millis"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L5c
            r1 = 2
            goto L5d
        L5c:
            r1 = -1
        L5d:
            if (r1 == 0) goto L98
            if (r1 == r7) goto L95
            if (r1 == r3) goto L9c
            r1 = 100
            int r1 = r6.indexOf(r1)
            if (r1 == r4) goto L6d
            r1 = 1
            goto L6e
        L6d:
            r1 = 0
        L6e:
            r2 = 72
            int r2 = r6.indexOf(r2)
            if (r2 != r4) goto L90
            r2 = 104(0x68, float:1.46E-43)
            int r2 = r6.indexOf(r2)
            if (r2 != r4) goto L90
            r2 = 75
            int r2 = r6.indexOf(r2)
            if (r2 != r4) goto L90
            r2 = 107(0x6b, float:1.5E-43)
            int r2 = r6.indexOf(r2)
            if (r2 == r4) goto L8f
            goto L90
        L8f:
            r7 = 0
        L90:
            r3 = r7
            r2 = r1
            r7 = 0
            r1 = 0
            goto L9f
        L95:
            r7 = 0
            r1 = 1
            goto L9d
        L98:
            r7 = 0
            r0 = 1
            goto L9c
        L9b:
            r7 = 0
        L9c:
            r1 = 0
        L9d:
            r2 = 0
            r3 = 0
        L9f:
            r5.b = r0
            r5.c = r7
            r5.d = r1
            r5.e = r2
            r5.f = r3
            java.lang.String r7 = "yyyyMMddHHmmssSSSZ"
            boolean r6 = r7.equals(r6)
            r5.g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.aaj.<init>(java.lang.String, java.util.Locale):void");
    }

    public DateTimeFormatter a() {
        String str;
        if (this.k == null && (str = this.f25183a) != null && !this.c && !this.d && !this.b) {
            Locale locale = this.h;
            this.k = locale == null ? DateTimeFormatter.e(str) : DateTimeFormatter.a(str, locale);
        }
        return this.k;
    }

    public DateTimeFormatter a(Locale locale) {
        Locale locale2;
        if (this.f25183a == null || this.c || this.d || this.b) {
            return null;
        }
        if (this.k != null && ((this.h == null && (locale == null || locale == Locale.getDefault())) || ((locale2 = this.h) != null && locale2.equals(locale)))) {
            return this.k;
        }
        DateTimeFormatter e = (locale == null && (locale = this.h) == null) ? DateTimeFormatter.e(this.f25183a) : DateTimeFormatter.a(this.f25183a, locale);
        this.k = e;
        return e;
    }
}
