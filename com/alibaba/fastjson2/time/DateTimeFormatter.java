package com.alibaba.fastjson2.time;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.DateUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tb.kge;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {

    /* renamed from: a  reason: collision with root package name */
    private final String f3017a;
    private final PatternType b;
    private final Locale c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum PatternType {
        P6("HHmmss"),
        P8("yyyyMMdd"),
        P8_1("yyyy-M-d"),
        P8_2("HH:mm:ss"),
        P8_3("d-M-yyyy"),
        P8_4("d.M.yyyy"),
        P8_5("yyyy/M/d"),
        P9("yyyy-M-dd"),
        P9_1("yyyy-MM-d"),
        P10("yyyy-MM-dd"),
        P10_1("yyyy/MM/dd"),
        P11("yyyy-MMM-dd"),
        P12("yyyyMMddHHmm"),
        P14("yyyyMMddHHmmss"),
        P19("yyyy-MM-dd HH:mm:ss"),
        P19_1("yyyy/MM/dd HH:mm:ss"),
        P19_2("yyyy-MM-dd'T'HH:mm:ss"),
        P19_3("dd.MM.yyyy HH:mm:ss"),
        P29("yyyy-MM-dd HH:mm:ss.SSSSSSSSS"),
        OTHER("");
        
        final String pattern;

        PatternType(String str) {
            this.pattern = str;
        }
    }

    static {
        kge.a(-1820378257);
    }

    public DateTimeFormatter(String str, Locale locale) {
        this(str, locale, null);
    }

    public DateTimeFormatter(String str, Locale locale, e eVar) {
        PatternType patternType;
        if (str != null) {
            this.f3017a = str;
            this.c = locale;
            char c = 65535;
            switch (str.hashCode()) {
                case -2126457984:
                    if (str.equals("HH:mm:ss")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1686477813:
                    if (str.equals("d.M.yyyy")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1382984699:
                    if (str.equals("yyyy-MM-dd HH:mm:ss.SSSSSSSSS")) {
                        c = 14;
                        break;
                    }
                    break;
                case -657196083:
                    if (str.equals("yyyy-MMM-dd")) {
                        c = 11;
                        break;
                    }
                    break;
                case -277261865:
                    if (str.equals("yyyy-M-d")) {
                        c = 2;
                        break;
                    }
                    break;
                case -277202221:
                    if (str.equals("yyyy/M/d")) {
                        c = 6;
                        break;
                    }
                    break;
                case -276306848:
                    if (str.equals("yyyyMMdd")) {
                        c = 1;
                        break;
                    }
                    break;
                case -159776256:
                    if (str.equals("yyyy-MM-dd")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -102516032:
                    if (str.equals("yyyy/MM/dd")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -5183123:
                    if (str.equals("yyyy-M-dd")) {
                        c = 7;
                        break;
                    }
                    break;
                case -5154076:
                    if (str.equals("yyyy-MM-d")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 311496928:
                    if (str.equals("yyyy/MM/dd HH:mm:ss")) {
                        c = 16;
                        break;
                    }
                    break;
                case 1333195168:
                    if (str.equals("yyyy-MM-dd HH:mm:ss")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1349114208:
                    if (str.equals("yyyyMMddHHmmss")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 1397504320:
                    if (str.equals("dd.MM.yyyy HH:mm:ss")) {
                        c = 19;
                        break;
                    }
                    break;
                case 1717603072:
                    if (str.equals("yyyyMMddHHmm")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 1720062281:
                    if (str.equals("d-M-yyyy")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1798231098:
                    if (str.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                        c = 18;
                        break;
                    }
                    break;
                case 1834843604:
                    if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                        c = 17;
                        break;
                    }
                    break;
                case 2131148032:
                    if (str.equals("HHmmss")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    patternType = PatternType.P6;
                    break;
                case 1:
                    patternType = PatternType.P8;
                    break;
                case 2:
                    patternType = PatternType.P8_1;
                    break;
                case 3:
                    patternType = PatternType.P8_2;
                    break;
                case 4:
                    patternType = PatternType.P8_3;
                    break;
                case 5:
                    patternType = PatternType.P8_4;
                    break;
                case 6:
                    patternType = PatternType.P8_5;
                    break;
                case 7:
                    patternType = PatternType.P9;
                    break;
                case '\b':
                    patternType = PatternType.P9_1;
                    break;
                case '\t':
                    patternType = PatternType.P10;
                    break;
                case '\n':
                    patternType = PatternType.P10_1;
                    break;
                case 11:
                    patternType = PatternType.P11;
                    break;
                case '\f':
                    patternType = PatternType.P12;
                    break;
                case '\r':
                    patternType = PatternType.P14;
                    break;
                case 14:
                    patternType = PatternType.P29;
                    break;
                case 15:
                    patternType = PatternType.P19;
                    break;
                case 16:
                    patternType = PatternType.P19_1;
                    break;
                case 17:
                case 18:
                    patternType = PatternType.P19_2;
                    break;
                case 19:
                    patternType = PatternType.P19_3;
                    break;
                default:
                    patternType = PatternType.OTHER;
                    break;
            }
            this.b = patternType;
            return;
        }
        throw new IllegalArgumentException("pattern is null");
    }

    public static DateTimeFormatter a(String str, Locale locale) {
        return new DateTimeFormatter(str, locale);
    }

    private SimpleDateFormat a(e eVar) {
        Locale locale = this.c;
        SimpleDateFormat simpleDateFormat = locale == null ? new SimpleDateFormat(this.f3017a) : new SimpleDateFormat(this.f3017a, locale);
        simpleDateFormat.setTimeZone(eVar.d);
        return simpleDateFormat;
    }

    public static DateTimeFormatter e(String str) {
        return new DateTimeFormatter(str, null);
    }

    public b a(String str) {
        byte[] bytes = str.getBytes();
        int i = AnonymousClass1.f3018a[this.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            throw new JSONException("TODO : " + this.f3017a);
                    }
                }
                return DateUtils.d(bytes, 0);
            }
            if (bytes.length == 9) {
                return DateUtils.c(bytes, 0);
            }
            if (bytes.length == 10) {
                return DateUtils.d(bytes, 0);
            }
            throw new JSONException("TODO : " + this.f3017a);
        }
        if (bytes.length == 8) {
            return DateUtils.b(bytes, 0);
        }
        if (bytes.length == 9) {
            return DateUtils.c(bytes, 0);
        }
        if (bytes.length == 10) {
            return DateUtils.d(bytes, 0);
        }
        throw new JSONException("TODO : " + this.f3017a);
    }

    public String a(c cVar) {
        throw new JSONException("TODO : " + this.f3017a);
    }

    public String a(f fVar) {
        switch (this.b) {
            case P9:
                return DateUtils.a(fVar.f3024a.f3021a.f3020a, fVar.f3024a.f3021a.b, fVar.f3024a.f3021a.c);
            case P10:
                return DateUtils.a(fVar.f3024a.f3021a);
            case P19:
                return DateUtils.a(fVar.f3024a);
            case P6:
                return DateUtils.a(fVar.f3024a.b);
            case P8_2:
                return DateUtils.b(fVar.f3024a.b);
            case P29:
                return DateUtils.b(fVar.f3024a);
            default:
                return a(e.b).format(new Date(fVar.c()));
        }
    }

    public String a(Date date) {
        int i = AnonymousClass1.f3018a[this.b.ordinal()];
        if (i != 3) {
            if (i == 4) {
                return DateUtils.a(date, e.b);
            }
            Locale locale = this.c;
            return (locale == null ? new SimpleDateFormat(this.f3017a) : new SimpleDateFormat(this.f3017a, locale)).format(date);
        }
        return DateUtils.a(date.getTime(), e.b);
    }

    public Date a(String str, e eVar) {
        try {
            return a(eVar).parse(str);
        } catch (ParseException e) {
            throw new JSONException("parse error, format " + this.f3017a, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson2.time.c b(java.lang.String r5) {
        /*
            r4 = this;
            byte[] r0 = r5.getBytes()
            int[] r1 = com.alibaba.fastjson2.time.DateTimeFormatter.AnonymousClass1.f3018a
            com.alibaba.fastjson2.time.DateTimeFormatter$PatternType r2 = r4.b
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 4
            r3 = 0
            if (r1 == r2) goto L21
            switch(r1) {
                case 14: goto L1c;
                case 15: goto L17;
                case 16: goto L21;
                case 17: goto L21;
                case 18: goto L21;
                default: goto L15;
            }
        L15:
            r0 = 0
            goto L25
        L17:
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.g(r0, r3)
            goto L25
        L1c:
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.f(r0, r3)
            goto L25
        L21:
            com.alibaba.fastjson2.time.c r0 = com.alibaba.fastjson2.util.DateUtils.k(r0, r3)
        L25:
            if (r0 != 0) goto L5f
            com.alibaba.fastjson2.time.e r0 = com.alibaba.fastjson2.time.e.b
            java.text.SimpleDateFormat r0 = r4.a(r0)
            java.util.Date r0 = r0.parse(r5)     // Catch: java.text.ParseException -> L3e
            com.alibaba.fastjson2.time.a r0 = com.alibaba.fastjson2.time.a.a(r0)     // Catch: java.text.ParseException -> L3e
            com.alibaba.fastjson2.time.e r1 = com.alibaba.fastjson2.time.e.b     // Catch: java.text.ParseException -> L3e
            com.alibaba.fastjson2.time.f r0 = com.alibaba.fastjson2.time.f.a(r0, r1)     // Catch: java.text.ParseException -> L3e
            com.alibaba.fastjson2.time.c r0 = r0.f3024a     // Catch: java.text.ParseException -> L3e
            goto L5f
        L3e:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parse error, format "
            r1.append(r2)
            java.lang.String r2 = r4.f3017a
            r1.append(r2)
            java.lang.String r2 = ", input "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L5f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.time.DateTimeFormatter.b(java.lang.String):com.alibaba.fastjson2.time.c");
    }

    public f c(String str) {
        try {
            return f.a(a.a(a(e.b).parse(str)), e.b);
        } catch (ParseException unused) {
            throw new JSONException("parse error, format " + this.f3017a + ", input " + str);
        }
    }

    public d d(String str) {
        int i = AnonymousClass1.f3018a[this.b.ordinal()];
        if (i != 1) {
            if (i == 5) {
                return DateUtils.a(str, 0);
            }
            if (i != 6) {
                throw new JSONException("TODO " + this.f3017a);
            }
        }
        return DateUtils.a(str.getBytes(), 0);
    }
}
