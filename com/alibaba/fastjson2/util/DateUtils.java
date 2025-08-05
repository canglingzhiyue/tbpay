package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.reader.cq;
import com.alibaba.fastjson2.time.DateTimeException;
import com.alibaba.fastjson2.time.DateTimeFormatter;
import com.alibaba.wireless.security.SecExceptionCode;
import com.huawei.hms.framework.common.ExceptionCode;
import com.taobao.artc.api.AConstants;
import com.taobao.tao.shop.common.ShopConstants;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.Date;
import tb.fwk;
import tb.fxb;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class DateUtils {
    public static final int MAX_VALUE = 999999999;
    public static final int MIN_VALUE = -999999999;

    /* renamed from: a  reason: collision with root package name */
    static DateTimeFormatter f3026a;
    static DateTimeFormatter b;
    static DateTimeFormatter c;
    static DateTimeFormatter d;
    static final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.fastjson2.util.DateUtils$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3027a = new int[DateTimeFormatPattern.values().length];

        static {
            try {
                f3027a[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3027a[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3027a[DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3027a[DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3027a[DateTimeFormatPattern.DATE_FORMAT_10_DASH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3027a[DateTimeFormatPattern.DATE_FORMAT_10_SLASH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum DateTimeFormatPattern {
        DATE_FORMAT_10_DASH("yyyy-MM-dd", 10),
        DATE_FORMAT_10_SLASH("yyyy/MM/dd", 10),
        DATE_FORMAT_10_DOT("dd.MM.yyyy", 10),
        DATE_TIME_FORMAT_19_DASH("yyyy-MM-dd HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_DASH_T("yyyy-MM-dd'T'HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_SLASH("yyyy/MM/dd HH:mm:ss", 19),
        DATE_TIME_FORMAT_19_DOT("dd.MM.yyyy HH:mm:ss", 19);
        
        public final int length;
        public final String pattern;

        DateTimeFormatPattern(String str, int i) {
            this.pattern = str;
            this.length = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final String[] f3028a;

        static {
            kge.a(1784373827);
            f3028a = new String[1024];
        }
    }

    static {
        kge.a(1222928536);
        long currentTimeMillis = System.currentTimeMillis();
        com.alibaba.fastjson2.time.e eVar = com.alibaba.fastjson2.time.e.b;
        long a2 = d.a(currentTimeMillis, 1000L);
        e = (int) d.a(a2 + (eVar.equals(com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID) ? a(a2) : eVar.a(com.alibaba.fastjson2.time.a.a(currentTimeMillis))), 86400L);
    }

    public static int a(char c2, char c3) {
        char c4 = '1';
        if (c2 == '0') {
            switch (c3) {
                case '0':
                    c3 = '2';
                    break;
                case '1':
                    c3 = '3';
                    break;
                case '2':
                    c3 = '4';
                    break;
                case '3':
                    c3 = '5';
                    break;
                case '4':
                    c3 = '6';
                    break;
                case '5':
                    c3 = '7';
                    break;
                case '6':
                    c3 = '8';
                    break;
                case '7':
                    c3 = '9';
                    break;
                case '8':
                    c3 = '0';
                    c4 = '2';
                    break;
                case '9':
                    c3 = '1';
                    c4 = '2';
                    break;
                default:
                    c4 = c2;
                    break;
            }
        } else {
            if (c2 == '1') {
                switch (c3) {
                    case '0':
                        c3 = '2';
                        c4 = '2';
                        break;
                    case '1':
                        c3 = '3';
                        c4 = '2';
                        break;
                    case '2':
                        c3 = '4';
                        c4 = '2';
                        break;
                }
            }
            c4 = c2;
        }
        return (c4 << 16) | c3;
    }

    public static int a(char c2, char c3, char c4) {
        if (c2 == 'A') {
            if (c3 == 'p' && c4 == 'r') {
                return 4;
            }
            return (c3 == 'u' && c4 == 'g') ? 8 : 0;
        } else if (c2 == 'D') {
            return (c3 == 'e' && c4 == 'c') ? 12 : 0;
        } else if (c2 == 'F') {
            return (c3 == 'e' && c4 == 'b') ? 2 : 0;
        } else if (c2 == 'J') {
            if (c3 == 'a' && c4 == 'n') {
                return 1;
            }
            if (c3 != 'u') {
                return 0;
            }
            if (c4 == 'n') {
                return 6;
            }
            return c4 == 'l' ? 7 : 0;
        } else if (c2 == 'S') {
            return (c3 == 'e' && c4 == 'p') ? 9 : 0;
        } else {
            switch (c2) {
                case 'M':
                    if (c3 != 'a') {
                        return 0;
                    }
                    if (c4 == 'r') {
                        return 3;
                    }
                    return c4 == 'y' ? 5 : 0;
                case 'N':
                    return (c3 == 'o' && c4 == 'v') ? 11 : 0;
                case 'O':
                    return (c3 == 'c' && c4 == 't') ? 10 : 0;
                default:
                    return 0;
            }
        }
    }

    public static int a(long j) {
        if (j < 684900000) {
            if (j >= 671598000) {
                return 32400;
            }
            if (j < 653450400) {
                if (j >= 640148400) {
                    return 32400;
                }
                if (j < 622000800) {
                    if (j >= 608698800) {
                        return 32400;
                    }
                    if (j < 589946400) {
                        if (j >= 577249200) {
                            return 32400;
                        }
                        if (j < 558496800) {
                            if (j >= 545194800) {
                                return 32400;
                            }
                            if (j < 527047200) {
                                if (j >= 515559600) {
                                    return 32400;
                                }
                                if (j < -649987200) {
                                    if (j >= -652316400) {
                                        return 32400;
                                    }
                                    if (j < -670636800) {
                                        if (j >= -683852400) {
                                            return 32400;
                                        }
                                        if (j < -699580800) {
                                            if (j >= -716857200) {
                                                return 32400;
                                            }
                                            if (j < -733795200) {
                                                if (j >= -745801200) {
                                                    return 32400;
                                                }
                                                if (j < -767836800) {
                                                    if (j >= -881017200) {
                                                        return 32400;
                                                    }
                                                    if (j < -888796800) {
                                                        if (j >= -908838000) {
                                                            return 32400;
                                                        }
                                                        if (j < -922060800) {
                                                            if (j >= -933634800) {
                                                                return 32400;
                                                            }
                                                            if (j < -1585872000) {
                                                                if (j >= -1600642800) {
                                                                    return 32400;
                                                                }
                                                                if (j < -2177452800L) {
                                                                    return 29143;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 28800;
    }

    public static long a(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = true;
        long j = (i * fwk.DEFAULT_EXPIRED_TIME) + (((i + 3) / 4) - ((i + 99) / 100)) + ((i + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i2 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i3 - 1);
        if (i2 > 2) {
            j--;
            if ((i & 3) != 0 || (i % 100 == 0 && i % 400 != 0)) {
                z = false;
            }
            if (!z) {
                j--;
            }
        }
        return ((j - 719528) * 86400) + (i4 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) + (i5 * 60) + i6;
    }

    public static long a(com.alibaba.fastjson2.time.c cVar, com.alibaba.fastjson2.time.e eVar) {
        return a(eVar, cVar.f3021a.f3020a, cVar.f3021a.b, cVar.f3021a.c, cVar.b.f3022a, cVar.b.b, cVar.b.c, cVar.b.d);
    }

    public static long a(com.alibaba.fastjson2.time.e eVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        com.alibaba.fastjson2.time.e eVar2 = eVar == null ? com.alibaba.fastjson2.time.e.b : eVar;
        long j = (i * fwk.DEFAULT_EXPIRED_TIME) + (((i + 3) / 4) - ((i + 99) / 100)) + ((i + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i2 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i3 - 1);
        int i8 = 0;
        if (i2 > 2) {
            j--;
            if (!((i & 3) == 0 && (i % 100 != 0 || i % 400 == 0))) {
                j--;
            }
        }
        long j2 = ((j - 719528) * 86400) + (i4 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) + (i5 * 60) + i6;
        if (com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID.equals(eVar2)) {
            i8 = j2 >= 684900000 ? 28800 : a(j2);
        } else if (eVar2 != com.alibaba.fastjson2.time.e.c && !com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC.equals(eVar2.e)) {
            Calendar calendar = Calendar.getInstance(eVar2.d);
            calendar.set(i, i2 - 1, i3, i4, i5, i6);
            calendar.set(14, i7 / 1000000);
            return calendar.getTimeInMillis();
        }
        long j3 = (j2 - i8) * 1000;
        return i7 != 0 ? j3 + (i7 / 1000000) : j3;
    }

    public static long a(String str, com.alibaba.fastjson2.time.e eVar) {
        if (str == null) {
            return 0L;
        }
        char[] charArray = str.toCharArray();
        return a(charArray, 0, charArray.length, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static long a(java.lang.String r25, com.alibaba.fastjson2.time.e r26, com.alibaba.fastjson2.util.DateUtils.DateTimeFormatPattern r27) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.a(java.lang.String, com.alibaba.fastjson2.time.e, com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern):long");
    }

    public static long a(char[] cArr, int i, int i2, com.alibaba.fastjson2.time.e eVar) {
        com.alibaba.fastjson2.time.c f;
        char c2;
        com.alibaba.fastjson2.time.e eVar2 = eVar;
        if (cArr == null || i2 == 0) {
            return 0L;
        }
        if (i2 == 4 && cArr[i] == 'n' && cArr[i + 1] == 'u' && cArr[i + 2] == 'l' && cArr[i + 3] == 'l') {
            return 0L;
        }
        char c3 = cArr[i];
        if (c3 == '\"' && cArr[i2 - 1] == '\"') {
            JSONReader a2 = JSONReader.a(cArr, i, i2);
            try {
                long time = ((Date) cq.INSTANCE.a(a2, (Type) null, (Object) null, 0L)).getTime();
                if (a2 == null) {
                    return time;
                }
                a2.close();
                return time;
            } catch (Throwable th) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else if (i2 == 19) {
            return b(cArr, i, eVar2);
        } else {
            if (i2 > 19 || (i2 == 16 && ((c2 = cArr[i + 10]) == '+' || c2 == '-'))) {
                com.alibaba.fastjson2.time.f b2 = b(cArr, i, i2, eVar);
                if (b2 != null) {
                    return b2.c();
                }
                String str = new String(cArr, i, i2 - i);
                throw new DateTimeException("illegal input " + str, str, 0);
            } else if ((c3 == '-' || (c3 >= '0' && c3 <= '9')) && d.a(cArr, i, i2)) {
                long c4 = TypeUtils.c(cArr, i, i2);
                if (i2 == 8 && c4 >= 19700101 && c4 <= 21000101) {
                    f = com.alibaba.fastjson2.time.c.a(a(cArr, 0), com.alibaba.fastjson2.time.d.MIN);
                } else if (i2 == 12 && c4 >= 197001010000L && c4 <= 210001010000L) {
                    f = e(cArr, 0);
                } else if (i2 != 14 || c4 < 19700101000000L || c4 > 21000101000000L) {
                    return c4;
                } else {
                    f = f(cArr, 0);
                }
                return com.alibaba.fastjson2.time.f.b(f, eVar2).c();
            } else {
                if (cArr[i2 - 1] == 'Z') {
                    eVar2 = com.alibaba.fastjson2.time.e.c;
                }
                com.alibaba.fastjson2.time.c a3 = a(cArr, i, i2);
                if (a3 == null && cArr[i] == '0' && cArr[i + 1] == '0' && cArr[i + 2] == '0' && cArr[i + 3] == '0' && cArr[i + 4] == '-' && cArr[i + 5] == '0' && cArr[i + 6] == '0' && cArr[i + 7] == '-' && cArr[i + 8] == '0' && cArr[i + 9] == '0') {
                    a3 = com.alibaba.fastjson2.time.c.a(1970, 1, 1, 0, 0, 0);
                }
                if (a3 != null) {
                    long b3 = com.alibaba.fastjson2.time.f.b(a3, eVar2).b();
                    int i3 = a3.b.d;
                    return (b3 >= 0 || i3 <= 0) ? (i3 / 1000000) + (b3 * 1000) : (((b3 + 1) * 1000) + (i3 / 1000000)) - 1000;
                }
                String str2 = new String(cArr, i, i2 - i);
                throw new DateTimeException("illegal input " + str2, str2, 0);
            }
        }
    }

    public static com.alibaba.fastjson2.time.b a(char[] cArr, int i) {
        char c2;
        int i2;
        int i3;
        int i4;
        if (i + 8 > cArr.length) {
            return null;
        }
        char c3 = cArr[i];
        char c4 = cArr[i + 1];
        char c5 = cArr[i + 2];
        char c6 = cArr[i + 3];
        char c7 = cArr[i + 4];
        char c8 = cArr[i + 5];
        char c9 = cArr[i + 6];
        char c10 = cArr[i + 7];
        if (c7 != '-' || c9 != '-') {
            if (c4 == '/' && c6 == '/') {
                c2 = c5;
                c4 = c8;
                c5 = c9;
                c9 = '0';
                c8 = c3;
                c3 = c7;
                c7 = '0';
            } else if (c4 == '-' && c8 == '-') {
                int a2 = a(c5, c6, c7);
                if (a2 <= 0) {
                    return null;
                }
                c7 = (char) ((a2 / 10) + 48);
                c8 = (char) ((a2 % 10) + 48);
                c2 = c3;
                c5 = c9;
                c3 = '2';
                c4 = '0';
            } else {
                c2 = c10;
                c10 = c6;
            }
            if (c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9' && c10 >= '0' && c10 <= '9') {
                i2 = ((c3 - '0') * 1000) + ((c4 - '0') * 100) + ((c5 - '0') * 10) + (c10 - '0');
                if (c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9') {
                    i3 = ((c7 - '0') * 10) + (c8 - '0');
                    if (c9 >= '0' && c9 <= '9' && c2 >= '0' && c2 <= '9') {
                        i4 = ((c9 - '0') * 10) + (c2 - '0');
                        if (i2 == 0 || i3 != 0 || i4 != 0) {
                            return com.alibaba.fastjson2.time.b.a(i2, i3, i4);
                        }
                        return null;
                    }
                }
            }
            return null;
        }
        c2 = c10;
        c10 = c6;
        c7 = '0';
        c9 = '0';
        if (c3 >= '0') {
            i2 = ((c3 - '0') * 1000) + ((c4 - '0') * 100) + ((c5 - '0') * 10) + (c10 - '0');
            if (c7 >= '0') {
                i3 = ((c7 - '0') * 10) + (c8 - '0');
                if (c9 >= '0') {
                    i4 = ((c9 - '0') * 10) + (c2 - '0');
                    if (i2 == 0) {
                    }
                    return com.alibaba.fastjson2.time.b.a(i2, i3, i4);
                }
            }
        }
        return null;
    }

    public static com.alibaba.fastjson2.time.c a(char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9, char c10, char c11, char c12, char c13, char c14, char c15) {
        if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
            return null;
        }
        int i = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
        if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
            return null;
        }
        int i2 = ((c6 - '0') * 10) + (c7 - '0');
        if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
            return null;
        }
        int i3 = ((c8 - '0') * 10) + (c9 - '0');
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
            return null;
        }
        int i4 = ((c10 - '0') * 10) + (c11 - '0');
        if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            return null;
        }
        int i5 = ((c12 - '0') * 10) + (c13 - '0');
        if (c14 < '0' || c14 > '9' || c15 < '0' || c15 > '9') {
            return null;
        }
        int i6 = ((c14 - '0') * 10) + (c15 - '0');
        if ((i == 0 && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) || i4 > 24 || i5 > 60 || i6 > 60) {
            return null;
        }
        return com.alibaba.fastjson2.time.c.a(i, i2, i3, i4, i5, i6, 0);
    }

    public static com.alibaba.fastjson2.time.c a(char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9, char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18, char c19, char c20, char c21, char c22, char c23, char c24) {
        if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
            int i = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c6 >= '0' && c6 <= '9' && c7 >= '0' && c7 <= '9') {
                int i2 = ((c6 - '0') * 10) + (c7 - '0');
                if (c8 >= '0' && c8 <= '9' && c9 >= '0' && c9 <= '9') {
                    int i3 = ((c8 - '0') * 10) + (c9 - '0');
                    if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                        int i4 = ((c10 - '0') * 10) + (c11 - '0');
                        if (c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
                            int i5 = ((c12 - '0') * 10) + (c13 - '0');
                            if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
                                int i6 = ((c14 - '0') * 10) + (c15 - '0');
                                if (c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9' && c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9' && c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9' && c24 >= '0' && c24 <= '9') {
                                    return com.alibaba.fastjson2.time.c.a(i, i2, i3, i4, i5, i6, (c24 - '0') + ((c16 - '0') * 100000000) + ((c17 - '0') * ExceptionCode.CRASH_EXCEPTION) + ((c18 - '0') * 1000000) + ((c19 - '0') * 100000) + ((c20 - '0') * 10000) + ((c21 - '0') * 1000) + ((c22 - '0') * 100) + ((c23 - '0') * 10));
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r4.equals("") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.c a(java.lang.String r4, int r5, int r6) {
        /*
            r0 = 0
            if (r4 == 0) goto L79
            if (r6 != 0) goto L7
            goto L79
        L7:
            char[] r1 = new char[r6]
            int r2 = r5 + r6
            r3 = 0
            r4.getChars(r5, r2, r1, r3)
            com.alibaba.fastjson2.time.c r6 = a(r1, r5, r6)
            if (r6 != 0) goto L78
            r6 = -1
            int r1 = r4.hashCode()
            switch(r1) {
                case -2035181974: goto L63;
                case -2035179184: goto L59;
                case -1328438272: goto L4f;
                case -1173940224: goto L45;
                case 0: goto L3c;
                case 3392903: goto L32;
                case 86814033: goto L28;
                case 1333954784: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L6d
        L1e:
            java.lang.String r1 = "0000-00-00"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6d
            r3 = 7
            goto L6e
        L28:
            java.lang.String r1 = "0000年00月00日"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6d
            r3 = 4
            goto L6e
        L32:
            java.lang.String r1 = "null"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6d
            r3 = 1
            goto L6e
        L3c:
            java.lang.String r1 = ""
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6d
            goto L6e
        L45:
            java.lang.String r1 = "00000000"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6d
            r3 = 2
            goto L6e
        L4f:
            java.lang.String r1 = "000000000000"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6d
            r3 = 3
            goto L6e
        L59:
            java.lang.String r1 = "0000-00-0"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6d
            r3 = 6
            goto L6e
        L63:
            java.lang.String r1 = "0000-0-00"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L6d
            r3 = 5
            goto L6e
        L6d:
            r3 = -1
        L6e:
            switch(r3) {
                case 0: goto L77;
                case 1: goto L77;
                case 2: goto L77;
                case 3: goto L77;
                case 4: goto L77;
                case 5: goto L77;
                case 6: goto L77;
                case 7: goto L77;
                default: goto L71;
            }
        L71:
            com.alibaba.fastjson2.time.DateTimeException r6 = new com.alibaba.fastjson2.time.DateTimeException
            r6.<init>(r4, r4, r5)
            throw r6
        L77:
            return r0
        L78:
            return r6
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.a(java.lang.String, int, int):com.alibaba.fastjson2.time.c");
    }

    public static com.alibaba.fastjson2.time.c a(byte[] bArr, int i, int i2) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        if (bArr == null || i2 == 0 || i2 < 21 || i2 > 29) {
            return null;
        }
        char c11 = (char) bArr[i];
        char c12 = (char) bArr[i + 1];
        char c13 = (char) bArr[i + 2];
        char c14 = (char) bArr[i + 3];
        char c15 = (char) bArr[i + 4];
        char c16 = (char) bArr[i + 5];
        char c17 = (char) bArr[i + 6];
        char c18 = (char) bArr[i + 7];
        char c19 = (char) bArr[i + 8];
        char c20 = (char) bArr[i + 9];
        char c21 = (char) bArr[i + 10];
        char c22 = (char) bArr[i + 11];
        char c23 = (char) bArr[i + 12];
        char c24 = (char) bArr[i + 13];
        char c25 = (char) bArr[i + 14];
        char c26 = (char) bArr[i + 15];
        char c27 = (char) bArr[i + 16];
        char c28 = (char) bArr[i + 17];
        char c29 = (char) bArr[i + 18];
        char c30 = (char) bArr[i + 19];
        switch (i2) {
            case 21:
                c2 = (char) bArr[i + 20];
                c3 = '0';
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                break;
            case 22:
                char c31 = (char) bArr[i + 20];
                c5 = (char) bArr[i + 21];
                c2 = c31;
                c3 = '0';
                c4 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                break;
            case 23:
                char c32 = (char) bArr[i + 20];
                c5 = (char) bArr[i + 21];
                c6 = (char) bArr[i + 22];
                c2 = c32;
                c3 = '0';
                c4 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                break;
            case 24:
                char c33 = (char) bArr[i + 20];
                c5 = (char) bArr[i + 21];
                c6 = (char) bArr[i + 22];
                c7 = (char) bArr[i + 23];
                c2 = c33;
                c3 = '0';
                c4 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                break;
            case 25:
                char c34 = (char) bArr[i + 20];
                c5 = (char) bArr[i + 21];
                c6 = (char) bArr[i + 22];
                c7 = (char) bArr[i + 23];
                c8 = (char) bArr[i + 24];
                c2 = c34;
                c3 = '0';
                c4 = '0';
                c9 = '0';
                c10 = '0';
                break;
            case 26:
                char c35 = (char) bArr[i + 20];
                c5 = (char) bArr[i + 21];
                c6 = (char) bArr[i + 22];
                c7 = (char) bArr[i + 23];
                c8 = (char) bArr[i + 24];
                c9 = (char) bArr[i + 25];
                c2 = c35;
                c3 = '0';
                c4 = '0';
                c10 = '0';
                break;
            case 27:
                char c36 = (char) bArr[i + 20];
                c5 = (char) bArr[i + 21];
                c6 = (char) bArr[i + 22];
                c7 = (char) bArr[i + 23];
                c8 = (char) bArr[i + 24];
                c9 = (char) bArr[i + 25];
                c2 = c36;
                c3 = '0';
                c10 = '0';
                c4 = (char) bArr[i + 26];
                break;
            case 28:
                char c37 = (char) bArr[i + 20];
                c5 = (char) bArr[i + 21];
                c6 = (char) bArr[i + 22];
                char c38 = (char) bArr[i + 23];
                char c39 = (char) bArr[i + 24];
                char c40 = (char) bArr[i + 25];
                char c41 = (char) bArr[i + 26];
                c3 = (char) bArr[i + 27];
                c2 = c37;
                c4 = c41;
                c10 = '0';
                c9 = c40;
                c8 = c39;
                c7 = c38;
                break;
            default:
                c2 = (char) bArr[i + 20];
                char c42 = (char) bArr[i + 21];
                char c43 = (char) bArr[i + 22];
                char c44 = (char) bArr[i + 23];
                char c45 = (char) bArr[i + 24];
                char c46 = (char) bArr[i + 25];
                char c47 = (char) bArr[i + 26];
                c3 = (char) bArr[i + 27];
                c10 = (char) bArr[i + 28];
                c5 = c42;
                c4 = c47;
                c9 = c46;
                c8 = c45;
                c7 = c44;
                c6 = c43;
                break;
        }
        if (c15 != '-' || c18 != '-') {
            return null;
        }
        if ((c21 != ' ' && c21 != 'T') || c24 != ':' || c27 != ':' || c30 != '.') {
            return null;
        }
        return a(c11, c12, c13, c14, c16, c17, c19, c20, c22, c23, c25, c26, c28, c29, c2, c5, c6, c7, c8, c9, c4, c3, c10);
    }

    public static com.alibaba.fastjson2.time.c a(char[] cArr, int i, int i2) {
        com.alibaba.fastjson2.time.b a2;
        if (cArr == null || i2 == 0) {
            return null;
        }
        switch (i2) {
            case 4:
                if (cArr[i] == 'n' && cArr[i + 1] == 'u' && cArr[i + 2] == 'l' && cArr[i + 3] == 'l') {
                    return null;
                }
                String str = new String(cArr, i, i2);
                throw new DateTimeException("illegal input " + str, str, 0);
            case 5:
            case 6:
            case 7:
            case 13:
            case 15:
            default:
                return b(cArr, i, i2);
            case 8:
                a2 = a(cArr, i);
                if (a2 == null) {
                    return null;
                }
                break;
            case 9:
                a2 = b(cArr, i);
                if (a2 == null) {
                    return null;
                }
                break;
            case 10:
                a2 = c(cArr, i);
                if (a2 == null) {
                    return null;
                }
                break;
            case 11:
                a2 = d(cArr, i);
                if (a2 == null) {
                    return null;
                }
                break;
            case 12:
                return e(cArr, i);
            case 14:
                return f(cArr, i);
            case 16:
                return g(cArr, i);
            case 17:
                return h(cArr, i);
            case 18:
                return i(cArr, i);
            case 19:
                return j(cArr, i);
            case 20:
                return k(cArr, i);
        }
        return com.alibaba.fastjson2.time.c.a(a2, com.alibaba.fastjson2.time.d.MIN);
    }

    public static com.alibaba.fastjson2.time.d a(String str, int i) {
        if (i + 6 > str.length()) {
            return null;
        }
        char charAt = str.charAt(i);
        char charAt2 = str.charAt(i + 1);
        char charAt3 = str.charAt(i + 2);
        char charAt4 = str.charAt(i + 3);
        char charAt5 = str.charAt(i + 4);
        char charAt6 = str.charAt(i + 5);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            int i2 = ((charAt - '0') * 10) + (charAt2 - '0');
            if (charAt3 >= '0' && charAt3 <= '9' && charAt4 >= '0' && charAt4 <= '9') {
                int i3 = ((charAt3 - '0') * 10) + (charAt4 - '0');
                if (charAt5 >= '0' && charAt5 <= '9' && charAt6 >= '0' && charAt6 <= '9') {
                    return com.alibaba.fastjson2.time.d.a(i2, i3, ((charAt5 - '0') * 10) + (charAt6 - '0'));
                }
            }
        }
        return null;
    }

    public static com.alibaba.fastjson2.time.d a(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            return null;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        byte b4 = bArr[i + 2];
        byte b5 = bArr[i + 3];
        byte b6 = bArr[i + 4];
        byte b7 = bArr[i + 5];
        byte b8 = bArr[i + 6];
        byte b9 = bArr[i + 7];
        if (b4 == 58 && b7 == 58 && b2 >= 48 && b2 <= 57 && b3 >= 48 && b3 <= 57) {
            int i2 = ((b2 - 48) * 10) + (b3 - 48);
            if (b5 >= 48 && b5 <= 57 && b6 >= 48 && b6 <= 57) {
                int i3 = ((b5 - 48) * 10) + (b6 - 48);
                if (b8 >= 48 && b8 <= 57 && b9 >= 48 && b9 <= 57) {
                    return com.alibaba.fastjson2.time.d.a(i2, i3, ((b8 - 48) * 10) + (b9 - 48));
                }
            }
        }
        return null;
    }

    public static com.alibaba.fastjson2.time.f a(String str) {
        return b(str, com.alibaba.fastjson2.time.e.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x042d, code lost:
        if (r15 != 'Z') goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x075e, code lost:
        if (r6 != 'Z') goto L673;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x07d3, code lost:
        if (r15 != 'Z') goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0847, code lost:
        if (r5 != 'Z') goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x08c0, code lost:
        if (r5 != 'Z') goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x093b, code lost:
        if (r5 != 'Z') goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x09e7, code lost:
        if (r5 != 'Z') goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0bc6, code lost:
        if (r8 != 'Z') goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x0d1d, code lost:
        if (r0[r9 + 28] == 32) goto L461;
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0723 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0819 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0892 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x090d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x09b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0b98 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0c65 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0c67  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0cf1  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0d20  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0d26  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x0dba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.f a(byte[] r69, int r70, int r71, com.alibaba.fastjson2.time.e r72) {
        /*
            Method dump skipped, instructions count: 3574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.a(byte[], int, int, com.alibaba.fastjson2.time.e):com.alibaba.fastjson2.time.f");
    }

    static com.alibaba.fastjson2.time.f a(byte[] bArr, int i, com.alibaba.fastjson2.time.e eVar) {
        if (i + 16 > bArr.length) {
            String str = new String(bArr, i, bArr.length - i);
            throw new DateTimeException("illegal input " + str, str, 0);
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        int i2 = i + 10;
        char c12 = (char) bArr[i2];
        char c13 = (char) bArr[i + 13];
        if (c6 != '-' || c9 != '-' || ((c12 != '+' && c12 != '-') || c13 != ':')) {
            String str2 = new String(bArr, i, 16);
            throw new DateTimeException("illegal input " + str2, str2, 0);
        } else if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
            String str3 = new String(bArr, i, 16);
            throw new DateTimeException("illegal input " + str3, str3, 0);
        } else {
            int i3 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c7 < '0' || c7 > '9' || c8 < '0' || c8 > '9') {
                String str4 = new String(bArr, i, 16);
                throw new DateTimeException("illegal input " + str4, str4, 0);
            }
            int i4 = ((c7 - '0') * 10) + (c8 - '0');
            if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                return com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.c.a(com.alibaba.fastjson2.time.b.a(i3, i4, ((c10 - '0') * 10) + (c11 - '0')), com.alibaba.fastjson2.time.d.MIN), c(new String(bArr, i2, 6), eVar));
            }
            String str5 = new String(bArr, i, 16);
            throw new DateTimeException("illegal input " + str5, str5, 0);
        }
    }

    static com.alibaba.fastjson2.time.f a(char[] cArr, int i, com.alibaba.fastjson2.time.e eVar) {
        if (i + 16 > cArr.length) {
            String str = new String(cArr, i, cArr.length - i);
            throw new DateTimeException("illegal input " + str, str, 0);
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        int i2 = i + 10;
        char c12 = cArr[i2];
        char c13 = cArr[i + 13];
        if (c6 != '-' || c9 != '-' || ((c12 != '+' && c12 != '-') || c13 != ':')) {
            String str2 = new String(cArr, i, 16);
            throw new DateTimeException("illegal input " + str2, str2, 0);
        } else if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
            String str3 = new String(cArr, i, 16);
            throw new DateTimeException("illegal input " + str3, str3, 0);
        } else {
            int i3 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c7 < '0' || c7 > '9' || c8 < '0' || c8 > '9') {
                String str4 = new String(cArr, i, 16);
                throw new DateTimeException("illegal input " + str4, str4, 0);
            }
            int i4 = ((c7 - '0') * 10) + (c8 - '0');
            if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                return com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.c.a(com.alibaba.fastjson2.time.b.a(i3, i4, ((c10 - '0') * 10) + (c11 - '0')), com.alibaba.fastjson2.time.d.MIN), c(new String(cArr, i2, 6), eVar));
            }
            String str5 = new String(cArr, i, 16);
            throw new DateTimeException("illegal input " + str5, str5, 0);
        }
    }

    public static String a(int i, int i2, int i3) {
        char[] cArr = new char[10];
        int i4 = i / 1000;
        int i5 = d.DIGITS_K[i - (i4 * 1000)];
        cArr[0] = (char) ((byte) (i4 + 48));
        cArr[1] = (char) ((byte) (i5 >> 16));
        cArr[2] = (char) ((byte) (i5 >> 8));
        cArr[3] = (char) ((byte) i5);
        cArr[4] = '-';
        int i6 = 7;
        if (i2 < 10) {
            cArr[5] = (char) (i2 + 48);
            cArr[6] = '-';
        } else {
            int i7 = d.DIGITS_K[i2];
            cArr[5] = (char) ((byte) (i7 >> 8));
            cArr[6] = (char) ((byte) i7);
            cArr[7] = '-';
            i6 = 8;
        }
        int i8 = d.DIGITS_K[i3];
        cArr[i6] = (char) ((byte) (i8 >> 8));
        cArr[i6 + 1] = (char) ((byte) i8);
        return new String(cArr, 0, i6 + 2);
    }

    static String a(int i, int i2, int i3, int i4, int i5, int i6, DateTimeFormatPattern dateTimeFormatPattern) {
        int i7 = (i / 1000) + 48;
        int i8 = ((i / 100) % 10) + 48;
        int i9 = ((i / 10) % 10) + 48;
        int i10 = (i % 10) + 48;
        int i11 = (i2 / 10) + 48;
        int i12 = (i2 % 10) + 48;
        int i13 = (i3 / 10) + 48;
        int i14 = (i3 % 10) + 48;
        int i15 = (i4 / 10) + 48;
        int i16 = (i4 % 10) + 48;
        int i17 = (i5 / 10) + 48;
        int i18 = (i5 % 10) + 48;
        int i19 = (i6 / 10) + 48;
        int i20 = (i6 % 10) + 48;
        char[] cArr = new char[19];
        char c2 = ' ';
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
            cArr[0] = (char) i13;
            cArr[1] = (char) i14;
            cArr[2] = '.';
            cArr[3] = (char) i11;
            cArr[4] = (char) i12;
            cArr[5] = '.';
            cArr[6] = (char) i7;
            cArr[7] = (char) i8;
            cArr[8] = (char) i9;
            cArr[9] = (char) i10;
            cArr[10] = ' ';
        } else {
            if (dateTimeFormatPattern != DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH) {
                c2 = 'T';
            }
            char c3 = dateTimeFormatPattern == DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH ? fxb.DIR : '-';
            cArr[0] = (char) i7;
            cArr[1] = (char) i8;
            cArr[2] = (char) i9;
            cArr[3] = (char) i10;
            cArr[4] = c3;
            cArr[5] = (char) i11;
            cArr[6] = (char) i12;
            cArr[7] = c3;
            cArr[8] = (char) i13;
            cArr[9] = (char) i14;
            cArr[10] = c2;
        }
        cArr[11] = (char) i15;
        cArr[12] = (char) i16;
        cArr[13] = riy.CONDITION_IF_MIDDLE;
        cArr[14] = (char) i17;
        cArr[15] = (char) i18;
        cArr[16] = riy.CONDITION_IF_MIDDLE;
        cArr[17] = (char) i19;
        cArr[18] = (char) i20;
        return new String(cArr);
    }

    public static String a(int i, int i2, int i3, DateTimeFormatPattern dateTimeFormatPattern) {
        int i4 = (i / 1000) + 48;
        int i5 = ((i / 100) % 10) + 48;
        int i6 = ((i / 10) % 10) + 48;
        int i7 = (i % 10) + 48;
        int i8 = (i2 / 10) + 48;
        int i9 = (i2 % 10) + 48;
        int i10 = (i3 / 10) + 48;
        int i11 = (i3 % 10) + 48;
        char[] cArr = new char[10];
        if (dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            cArr[0] = (char) i10;
            cArr[1] = (char) i11;
            cArr[2] = '.';
            cArr[3] = (char) i8;
            cArr[4] = (char) i9;
            cArr[5] = '.';
            cArr[6] = (char) i4;
            cArr[7] = (char) i5;
            cArr[8] = (char) i6;
            cArr[9] = (char) i7;
        } else {
            char c2 = dateTimeFormatPattern == DateTimeFormatPattern.DATE_FORMAT_10_DASH ? '-' : fxb.DIR;
            cArr[0] = (char) i4;
            cArr[1] = (char) i5;
            cArr[2] = (char) i6;
            cArr[3] = (char) i7;
            cArr[4] = c2;
            cArr[5] = (char) i8;
            cArr[6] = (char) i9;
            cArr[7] = c2;
            cArr[8] = (char) i10;
            cArr[9] = (char) i11;
        }
        return new String(cArr);
    }

    public static String a(long j, com.alibaba.fastjson2.time.e eVar) {
        long a2;
        long j2;
        String str;
        com.alibaba.fastjson2.time.e eVar2 = eVar == null ? com.alibaba.fastjson2.time.e.b : eVar;
        long a3 = d.a(d.a(j, 1000L) + (com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID.equals(eVar2) ? a(a2) : eVar2.a(com.alibaba.fastjson2.time.a.a(j))), 86400L);
        int i = (int) ((a3 - e) + 128);
        String[] strArr = a.f3028a;
        if (i < 0 || i >= strArr.length || (str = strArr[i]) == null) {
            long j3 = (a3 + 719528) - 60;
            if (j3 < 0) {
                long j4 = ((j3 + 1) / 146097) - 1;
                j2 = j4 * 400;
                j3 += (-j4) * 146097;
            } else {
                j2 = 0;
            }
            long j5 = ((j3 * 400) + 591) / 146097;
            long j6 = j3 - ((((j5 * 365) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
            if (j6 < 0) {
                j5--;
                j6 = j3 - ((((365 * j5) + (j5 / 4)) - (j5 / 100)) + (j5 / 400));
            }
            int i2 = (int) j6;
            int i3 = ((i2 * 5) + 2) / 153;
            int i4 = ((i3 + 2) % 12) + 1;
            int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
            long j7 = j5 + j2 + (i3 / 10);
            if (j7 < -999999999 || j7 > 999999999) {
                throw new DateTimeException("Invalid year " + j7);
            }
            int i6 = (int) j7;
            String str2 = new String(new char[]{(char) ((i6 / 1000) + 48), (char) (((i6 / 100) % 10) + 48), (char) (((i6 / 10) % 10) + 48), (char) ((i6 % 10) + 48), '-', (char) ((i4 / 10) + 48), (char) ((i4 % 10) + 48), '-', (char) ((i5 / 10) + 48), (char) ((i5 % 10) + 48)});
            if (i >= 0 && i < strArr.length) {
                strArr[i] = str2;
            }
            return str2;
        }
        return str;
    }

    public static String a(long j, boolean z, com.alibaba.fastjson2.time.e eVar) {
        long j2;
        int i;
        long a2 = d.a(j, 1000L);
        int a3 = com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID.equals(eVar) ? a(a2) : eVar.a(com.alibaba.fastjson2.time.a.a(j));
        long j3 = a2 + a3;
        long a4 = d.a(j3, 86400L);
        int b2 = (int) d.b(j3, 86400L);
        long j4 = (a4 + 719528) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j2 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j2 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        }
        int i2 = (int) j7;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        long j8 = j6 + j2 + (i3 / 10);
        if (j8 < -999999999 || j8 > 999999999) {
            throw new DateTimeException("Invalid year " + j8);
        }
        int i6 = (int) j8;
        long j9 = b2;
        if (j9 < 0 || j9 > 86399) {
            throw new DateTimeException("Invalid secondOfDay " + j9);
        }
        int i7 = (int) (j9 / 3600);
        long j10 = j9 - (i7 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
        int i8 = (int) (j10 / 60);
        int i9 = (int) (j10 - (i8 * 60));
        int b3 = (int) d.b(j, 1000L);
        if (b3 == 0) {
            i = 0;
        } else {
            if (b3 >= 10) {
                if (b3 % 100 == 0) {
                    i = 2;
                } else if (b3 % 10 == 0) {
                    i = 3;
                }
            }
            i = 4;
        }
        int i10 = i + 19;
        int i11 = (z ? a3 == 0 ? 1 : 6 : 0) + i10;
        int i12 = a3;
        int i13 = i;
        char[] cArr = new char[i11];
        cArr[0] = (char) ((i6 / 1000) + 48);
        cArr[1] = (char) (((i6 / 100) % 10) + 48);
        cArr[2] = (char) (((i6 / 10) % 10) + 48);
        cArr[3] = (char) ((i6 % 10) + 48);
        cArr[4] = '-';
        cArr[5] = (char) ((i4 / 10) + 48);
        cArr[6] = (char) ((i4 % 10) + 48);
        cArr[7] = '-';
        cArr[8] = (char) ((i5 / 10) + 48);
        cArr[9] = (char) ((i5 % 10) + 48);
        cArr[10] = ' ';
        cArr[11] = (char) ((i7 / 10) + 48);
        cArr[12] = (char) ((i7 % 10) + 48);
        cArr[13] = riy.CONDITION_IF_MIDDLE;
        cArr[14] = (char) ((i8 / 10) + 48);
        cArr[15] = (char) ((i8 % 10) + 48);
        cArr[16] = riy.CONDITION_IF_MIDDLE;
        cArr[17] = (char) ((i9 / 10) + 48);
        cArr[18] = (char) ((i9 % 10) + 48);
        if (i13 > 0) {
            cArr[19] = '.';
            int i14 = 20;
            for (int i15 = 20; i15 < i11; i15++) {
                cArr[i15] = '0';
            }
            int i16 = b3;
            if (i16 < 10) {
                i14 = 22;
            } else if (i16 % 100 == 0) {
                i16 /= 100;
            } else if (i16 % 10 == 0) {
                i16 /= 10;
            }
            d.b(cArr, i14, i16);
        }
        if (z) {
            int i17 = i12 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
            if (i12 == 0) {
                cArr[i10] = 'Z';
            } else {
                int abs = Math.abs(i17);
                if (i17 >= 0) {
                    cArr[i10] = '+';
                } else {
                    cArr[i10] = '-';
                }
                if (abs < 10) {
                    cArr[i13 + 20] = '0';
                    cArr[i13 + 21] = (char) (abs + 48);
                } else {
                    cArr[i13 + 20] = (char) ((abs / 10) + 48);
                    cArr[i13 + 21] = (char) ((abs % 10) + 48);
                }
                cArr[i13 + 22] = riy.CONDITION_IF_MIDDLE;
                int i18 = (i12 - (i17 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
                if (i18 < 0) {
                    i18 = -i18;
                }
                if (i18 < 10) {
                    cArr[i13 + 23] = '0';
                    cArr[i13 + 24] = (char) (i18 + 48);
                } else {
                    cArr[i13 + 23] = (char) ((i18 / 10) + 48);
                    cArr[i13 + 24] = (char) ((i18 % 10) + 48);
                }
            }
        }
        return new String(cArr);
    }

    public static String a(com.alibaba.fastjson2.time.b bVar) {
        if (bVar == null) {
            return null;
        }
        int i = bVar.f3020a;
        short s = bVar.b;
        short s2 = bVar.c;
        return new String(new char[]{(char) ((i / 1000) + 48), (char) (((i / 100) % 10) + 48), (char) (((i / 10) % 10) + 48), (char) ((i % 10) + 48), '-', (char) ((s / 10) + 48), (char) ((s % 10) + 48), '-', (char) ((s2 / 10) + 48), (char) ((s2 % 10) + 48)});
    }

    public static String a(com.alibaba.fastjson2.time.c cVar) {
        if (cVar == null) {
            return null;
        }
        return a(cVar.f3021a.f3020a, cVar.f3021a.b, cVar.f3021a.c, cVar.b.f3022a, cVar.b.b, cVar.b.c, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
    }

    public static String a(com.alibaba.fastjson2.time.c cVar, String str) {
        if (cVar == null) {
            return null;
        }
        int i = cVar.f3021a.f3020a;
        short s = cVar.f3021a.b;
        short s2 = cVar.f3021a.c;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -657196083:
                if (str.equals("yyyy-MMM-dd")) {
                    c2 = 7;
                    break;
                }
                break;
            case -159776256:
                if (str.equals("yyyy-MM-dd")) {
                    c2 = 3;
                    break;
                }
                break;
            case -102516032:
                if (str.equals("yyyy/MM/dd")) {
                    c2 = 4;
                    break;
                }
                break;
            case -5183123:
                if (str.equals("yyyy-M-dd")) {
                    c2 = 6;
                    break;
                }
                break;
            case 1333195168:
                if (str.equals("yyyy-MM-dd HH:mm:ss")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1798231098:
                if (str.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1834843604:
                if (str.equals("yyyy-MM-ddTHH:mm:ss")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1900521056:
                if (str.equals("dd.MM.yyyy")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return a(i, s, s2, cVar.b.f3022a, cVar.b.b, cVar.b.c, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
            case 1:
            case 2:
                return a(i, s, s2, cVar.b.f3022a, cVar.b.b, cVar.b.c, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T);
            case 3:
                return a(i, s, s2, DateTimeFormatPattern.DATE_FORMAT_10_DASH);
            case 4:
                return a(i, s, s2, DateTimeFormatPattern.DATE_FORMAT_10_SLASH);
            case 5:
                return a(i, s, s2, DateTimeFormatPattern.DATE_FORMAT_10_DOT);
            case 6:
                return a(i, s, s2);
            case 7:
                return b(i, s, s2);
            default:
                return DateTimeFormatter.e(str).a(cVar);
        }
    }

    public static String a(com.alibaba.fastjson2.time.d dVar) {
        if (dVar == null) {
            return null;
        }
        int i = d.DIGITS_K[dVar.f3022a];
        int i2 = d.DIGITS_K[dVar.b];
        int i3 = d.DIGITS_K[dVar.c];
        return new String(new char[]{(char) ((byte) (i >> 8)), (char) ((byte) i), (char) ((byte) (i2 >> 8)), (char) ((byte) i2), (char) ((byte) (i3 >> 8)), (char) ((byte) i3)});
    }

    public static String a(Date date, com.alibaba.fastjson2.time.e eVar) {
        long j;
        if (date == null) {
            return null;
        }
        long time = date.getTime();
        com.alibaba.fastjson2.time.e eVar2 = eVar == null ? com.alibaba.fastjson2.time.e.b : eVar;
        long a2 = d.a(time, 1000L);
        long a3 = a2 + ((!com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID.equals(eVar2) || a2 <= 684900000) ? eVar2.a(com.alibaba.fastjson2.time.a.a(time)) : 28800);
        long a4 = d.a(a3, 86400L);
        int b2 = (int) d.b(a3, 86400L);
        long j2 = (a4 + 719528) - 60;
        if (j2 < 0) {
            long j3 = ((j2 + 1) / 146097) - 1;
            j = j3 * 400;
            j2 += (-j3) * 146097;
        } else {
            j = 0;
        }
        long j4 = ((j2 * 400) + 591) / 146097;
        long j5 = j2 - ((((j4 * 365) + (j4 / 4)) - (j4 / 100)) + (j4 / 400));
        if (j5 < 0) {
            j4--;
            j5 = j2 - ((((365 * j4) + (j4 / 4)) - (j4 / 100)) + (j4 / 400));
        }
        int i = (int) j5;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j6 = j4 + j + (i2 / 10);
        if (j6 < -999999999 || j6 > 999999999) {
            throw new JSONException("Invalid year " + j6);
        }
        int i5 = (int) j6;
        long j7 = b2;
        if (j7 < 0 || j7 > 86399) {
            throw new JSONException("Invalid secondOfDay " + j7);
        }
        int i6 = (int) (j7 / 3600);
        long j8 = j7 - (i6 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT);
        int i7 = (int) (j8 / 60);
        int i8 = (int) (j8 - (i7 * 60));
        return new String(new char[]{(char) ((i5 / 1000) + 48), (char) (((i5 / 100) % 10) + 48), (char) (((i5 / 10) % 10) + 48), (char) ((i5 % 10) + 48), '-', (char) ((i3 / 10) + 48), (char) ((i3 % 10) + 48), '-', (char) ((i4 / 10) + 48), (char) ((i4 % 10) + 48), ' ', (char) ((i6 / 10) + 48), (char) ((i6 % 10) + 48), riy.CONDITION_IF_MIDDLE, (char) ((i7 / 10) + 48), (char) ((i7 % 10) + 48), riy.CONDITION_IF_MIDDLE, (char) ((i8 / 10) + 48), (char) ((i8 % 10) + 48)});
    }

    public static Date a(String str, String str2, com.alibaba.fastjson2.time.e eVar) {
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str2 == null || str2.isEmpty()) {
            long a2 = a(str, eVar);
            if (a2 != 0) {
                return new Date(a2);
            }
            return null;
        }
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -1074095546:
                if (str2.equals("millis")) {
                    c2 = '\t';
                    break;
                }
                break;
            case -347789785:
                if (str2.equals("yyyyMMddHHmmssSSSZ")) {
                    c2 = 7;
                    break;
                }
                break;
            case -288020395:
                if (str2.equals("unixtime")) {
                    c2 = '\n';
                    break;
                }
                break;
            case -276306848:
                if (str2.equals("yyyyMMdd")) {
                    c2 = 6;
                    break;
                }
                break;
            case -159776256:
                if (str2.equals("yyyy-MM-dd")) {
                    c2 = 4;
                    break;
                }
                break;
            case -102516032:
                if (str2.equals("yyyy/MM/dd")) {
                    c2 = 5;
                    break;
                }
                break;
            case 311496928:
                if (str2.equals("yyyy/MM/dd HH:mm:ss")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1333195168:
                if (str2.equals("yyyy-MM-dd HH:mm:ss")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1397504320:
                if (str2.equals("dd.MM.yyyy HH:mm:ss")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1798231098:
                if (str2.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                    c2 = 0;
                    break;
                }
                break;
            case 2095190916:
                if (str2.equals("iso8601")) {
                    c2 = '\b';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return new Date(a(str, eVar, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T));
            case 1:
                return new Date(d(str, eVar));
            case 2:
                return new Date(a(str, eVar, DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
            case 3:
                return new Date(a(str, eVar, DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
            case 4:
                return new Date(b(str, eVar, DateTimeFormatPattern.DATE_FORMAT_10_DASH));
            case 5:
                return new Date(b(str, eVar, DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
            case 6:
                return new Date(e(str, eVar));
            case 7:
            case '\b':
                long a3 = a(str, com.alibaba.fastjson2.time.e.b);
                if (a3 != 0) {
                    return new Date(a3);
                }
                return null;
            case '\t':
                return new Date(Long.parseLong(str));
            case '\n':
                return new Date(Long.parseLong(str) * 1000);
            default:
                if (eVar == null) {
                    eVar = com.alibaba.fastjson2.time.e.b;
                }
                return new Date(a(DateTimeFormatter.e(str2).b(str), eVar));
        }
    }

    static long b(String str, com.alibaba.fastjson2.time.e eVar, DateTimeFormatPattern dateTimeFormatPattern) {
        if (str == null || "null".equals(str)) {
            return 0L;
        }
        if (dateTimeFormatPattern.length != 10) {
            throw new UnsupportedOperationException();
        }
        if (str.length() != 10) {
            throw new DateTimeException("illegal input " + str, str, 0);
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char charAt3 = str.charAt(2);
        char charAt4 = str.charAt(3);
        char charAt5 = str.charAt(4);
        char charAt6 = str.charAt(5);
        char charAt7 = str.charAt(6);
        char charAt8 = str.charAt(7);
        char charAt9 = str.charAt(8);
        char charAt10 = str.charAt(9);
        int i = AnonymousClass1.f3027a[dateTimeFormatPattern.ordinal()];
        if (i != 5) {
            if (i != 6) {
                throw new DateTimeException("illegal input", str, 0);
            }
            if (charAt5 != '/' || charAt8 != '/') {
                throw new DateTimeException("illegal input", str, 0);
            }
        } else if (charAt5 != '-' || charAt8 != '-') {
            throw new DateTimeException("illegal input", str, 0);
        }
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || charAt3 < '0' || charAt3 > '9' || charAt4 < '0' || charAt4 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i2 = ((charAt - '0') * 1000) + ((charAt2 - '0') * 100) + ((charAt3 - '0') * 10) + (charAt4 - '0');
        if (charAt6 < '0' || charAt6 > '9' || charAt7 < '0' || charAt7 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i3 = (charAt7 - '0') + ((charAt6 - '0') * 10);
        if ((i3 == 0 && i2 != 0) || i3 > 12) {
            throw new DateTimeException("illegal input", str, 0);
        }
        if (charAt9 < '0' || charAt9 > '9' || charAt10 < '0' || charAt10 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i4 = ((charAt9 - '0') * 10) + (charAt10 - '0');
        int i5 = 31;
        if (i3 == 2) {
            i5 = (i2 & 3) == 0 && (i2 % 100 != 0 || i2 % 400 == 0) ? 29 : 28;
        } else if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) {
            i5 = 30;
        }
        if ((i4 == 0 && i2 != 0) || i4 > i5) {
            throw new DateTimeException("illegal input", str, 0);
        }
        if (i2 == 0 && i3 == 0 && i4 == 0) {
            i2 = 1970;
            i4 = 1;
            i3 = 1;
        }
        long j = (i2 * fwk.DEFAULT_EXPIRED_TIME) + (((i2 + 3) / 4) - ((i2 + 99) / 100)) + ((i2 + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i3 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i4 - 1);
        if (i3 > 2) {
            j--;
            if (!((i2 & 3) == 0 && (i2 % 100 != 0 || i2 % 400 == 0))) {
                j--;
            }
        }
        long j2 = (j - 719528) * 86400;
        return (j2 - ((!eVar.equals(com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID) || j2 < 684900000) ? (eVar == com.alibaba.fastjson2.time.e.c || com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC.equals(eVar.e)) ? 0 : eVar.a(com.alibaba.fastjson2.time.c.a(com.alibaba.fastjson2.time.b.a(i2, i3, i4), com.alibaba.fastjson2.time.d.MIN)) : 28800)) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
        if (r10 == ':') goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(byte[] r24, int r25, com.alibaba.fastjson2.time.e r26) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.b(byte[], int, com.alibaba.fastjson2.time.e):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
        if (r10 == ':') goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long b(char[] r31, int r32, com.alibaba.fastjson2.time.e r33) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.b(char[], int, com.alibaba.fastjson2.time.e):long");
    }

    public static com.alibaba.fastjson2.time.b b(byte[] bArr, int i) {
        char c2;
        int i2;
        int i3;
        int i4;
        if (i + 8 > bArr.length) {
            return null;
        }
        char c3 = (char) bArr[i];
        char c4 = (char) bArr[i + 1];
        char c5 = (char) bArr[i + 2];
        char c6 = (char) bArr[i + 3];
        char c7 = (char) bArr[i + 4];
        char c8 = (char) bArr[i + 5];
        char c9 = (char) bArr[i + 6];
        char c10 = (char) bArr[i + 7];
        if (c7 != '-' || c9 != '-') {
            if (c4 == '/' && c6 == '/') {
                c2 = c5;
                c4 = c8;
                c5 = c9;
                c9 = '0';
                c8 = c3;
                c3 = c7;
                c7 = '0';
            } else if (c4 == '-' && c8 == '-') {
                int a2 = a(c5, c6, c7);
                if (a2 <= 0) {
                    return null;
                }
                c7 = (char) ((a2 / 10) + 48);
                c8 = (char) ((a2 % 10) + 48);
                c2 = c3;
                c5 = c9;
                c3 = '2';
                c4 = '0';
            } else {
                c2 = c10;
                c10 = c6;
            }
            if (c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9' && c10 >= '0' && c10 <= '9') {
                i2 = ((c3 - '0') * 1000) + ((c4 - '0') * 100) + ((c5 - '0') * 10) + (c10 - '0');
                if (c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9') {
                    i3 = ((c7 - '0') * 10) + (c8 - '0');
                    if (c9 >= '0' && c9 <= '9' && c2 >= '0' && c2 <= '9') {
                        i4 = ((c9 - '0') * 10) + (c2 - '0');
                        if (i2 == 0 || i3 != 0 || i4 != 0) {
                            return com.alibaba.fastjson2.time.b.a(i2, i3, i4);
                        }
                        return null;
                    }
                }
            }
            return null;
        }
        c2 = c10;
        c10 = c6;
        c7 = '0';
        c9 = '0';
        if (c3 >= '0') {
            i2 = ((c3 - '0') * 1000) + ((c4 - '0') * 100) + ((c5 - '0') * 10) + (c10 - '0');
            if (c7 >= '0') {
                i3 = ((c7 - '0') * 10) + (c8 - '0');
                if (c9 >= '0') {
                    i4 = ((c9 - '0') * 10) + (c2 - '0');
                    if (i2 == 0) {
                    }
                    return com.alibaba.fastjson2.time.b.a(i2, i3, i4);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.b b(char[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.b(char[], int):com.alibaba.fastjson2.time.b");
    }

    public static com.alibaba.fastjson2.time.c b(char[] cArr, int i, int i2) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        if (cArr == null || i2 == 0 || i2 < 21 || i2 > 29) {
            return null;
        }
        char c10 = cArr[i];
        char c11 = cArr[i + 1];
        char c12 = cArr[i + 2];
        char c13 = cArr[i + 3];
        char c14 = cArr[i + 4];
        char c15 = cArr[i + 5];
        char c16 = cArr[i + 6];
        char c17 = cArr[i + 7];
        char c18 = cArr[i + 8];
        char c19 = cArr[i + 9];
        char c20 = cArr[i + 10];
        char c21 = cArr[i + 11];
        char c22 = cArr[i + 12];
        char c23 = cArr[i + 13];
        char c24 = cArr[i + 14];
        char c25 = cArr[i + 15];
        char c26 = cArr[i + 16];
        char c27 = cArr[i + 17];
        char c28 = cArr[i + 18];
        char c29 = cArr[i + 19];
        char c30 = '0';
        switch (i2) {
            case 21:
                c2 = cArr[i + 20];
                c3 = '0';
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                break;
            case 22:
                char c31 = cArr[i + 20];
                c3 = cArr[i + 21];
                c2 = c31;
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                break;
            case 23:
                char c32 = cArr[i + 20];
                c3 = cArr[i + 21];
                c4 = cArr[i + 22];
                c2 = c32;
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                break;
            case 24:
                char c33 = cArr[i + 20];
                c3 = cArr[i + 21];
                c4 = cArr[i + 22];
                c5 = cArr[i + 23];
                c2 = c33;
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                break;
            case 25:
                char c34 = cArr[i + 20];
                c3 = cArr[i + 21];
                c4 = cArr[i + 22];
                c5 = cArr[i + 23];
                char c35 = cArr[i + 24];
                c2 = c34;
                c30 = c35;
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                break;
            case 26:
                char c36 = cArr[i + 20];
                c3 = cArr[i + 21];
                c4 = cArr[i + 22];
                c5 = cArr[i + 23];
                char c37 = cArr[i + 24];
                c7 = cArr[i + 25];
                c2 = c36;
                c30 = c37;
                c6 = '0';
                c8 = '0';
                c9 = '0';
                break;
            case 27:
                char c38 = cArr[i + 20];
                c3 = cArr[i + 21];
                c4 = cArr[i + 22];
                c5 = cArr[i + 23];
                char c39 = cArr[i + 24];
                c7 = cArr[i + 25];
                c8 = cArr[i + 26];
                c2 = c38;
                c30 = c39;
                c6 = '0';
                c9 = '0';
                break;
            case 28:
                char c40 = cArr[i + 20];
                c3 = cArr[i + 21];
                c4 = cArr[i + 22];
                c5 = cArr[i + 23];
                char c41 = cArr[i + 24];
                c7 = cArr[i + 25];
                c8 = cArr[i + 26];
                c9 = cArr[i + 27];
                c2 = c40;
                c30 = c41;
                c6 = '0';
                break;
            default:
                char c42 = cArr[i + 20];
                c3 = cArr[i + 21];
                char c43 = cArr[i + 22];
                char c44 = cArr[i + 23];
                char c45 = cArr[i + 24];
                char c46 = cArr[i + 25];
                char c47 = cArr[i + 26];
                char c48 = cArr[i + 27];
                char c49 = cArr[i + 28];
                c2 = c42;
                c4 = c43;
                c30 = c45;
                c5 = c44;
                c7 = c46;
                c6 = c49;
                c9 = c48;
                c8 = c47;
                break;
        }
        if (c14 != '-' || c17 != '-') {
            return null;
        }
        if ((c20 != ' ' && c20 != 'T') || c23 != ':' || c26 != ':' || c29 != '.') {
            return null;
        }
        return a(c10, c11, c12, c13, c15, c16, c18, c19, c21, c22, c24, c25, c27, c28, c2, c3, c4, c5, c30, c7, c8, c9, c6);
    }

    static com.alibaba.fastjson2.time.f b(String str) {
        if (str.endsWith(" CST")) {
            DateTimeFormatter dateTimeFormatter = c;
            if (dateTimeFormatter == null) {
                dateTimeFormatter = DateTimeFormatter.e("EEEE, dd-MMM-yyyy HH:mm:ss");
                c = dateTimeFormatter;
            }
            return com.alibaba.fastjson2.time.f.a(dateTimeFormatter.b(str.substring(0, str.length() - 4)), com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID);
        }
        DateTimeFormatter dateTimeFormatter2 = b;
        if (dateTimeFormatter2 == null) {
            dateTimeFormatter2 = DateTimeFormatter.e("EEEE, dd-MMM-yyyy HH:mm:ss zzz");
            b = dateTimeFormatter2;
        }
        return dateTimeFormatter2.c(str);
    }

    public static com.alibaba.fastjson2.time.f b(String str, com.alibaba.fastjson2.time.e eVar) {
        if (str == null || str.length() == 0) {
            return null;
        }
        char[] charArray = str.toCharArray();
        com.alibaba.fastjson2.time.f b2 = b(charArray, 0, charArray.length, eVar);
        if (b2 != null) {
            return b2;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            if (hashCode != 3392903) {
                if (hashCode == 1333954784 && str.equals("0000-00-00")) {
                    c2 = 2;
                }
            } else if (str.equals("null")) {
                c2 = 0;
            }
        } else if (str.equals("0")) {
            c2 = 1;
        }
        if (c2 != 0 && c2 != 1 && c2 != 2) {
            throw new DateTimeException(str, str, 0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x032b, code lost:
        if (r1 != 'Z') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x039f, code lost:
        if (r15 != 'Z') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x06f6, code lost:
        if (r1 != 'Z') goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0768, code lost:
        if (r7 != 'Z') goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x07e4, code lost:
        if (r6 != 'Z') goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0862, code lost:
        if (r6 != 'Z') goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x08e0, code lost:
        if (r6 != 'Z') goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0996, code lost:
        if (r6 != 'Z') goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0b80, code lost:
        if (r9 != 'Z') goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x0cd2, code lost:
        if (r0[r9 + 28] == ' ') goto L431;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x073a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x07b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0834 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x08b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0968 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a5e  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0b52 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0c17 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0ca5  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0cd5  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0d59  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x0d93  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.f b(char[] r61, int r62, int r63, com.alibaba.fastjson2.time.e r64) {
        /*
            Method dump skipped, instructions count: 3568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.b(char[], int, int, com.alibaba.fastjson2.time.e):com.alibaba.fastjson2.time.f");
    }

    public static String b(int i, int i2, int i3) {
        char[] cArr = new char[11];
        int i4 = i / 1000;
        int i5 = d.DIGITS_K[i - (i4 * 1000)];
        cArr[0] = (char) ((byte) (i4 + 48));
        cArr[1] = (char) ((byte) (i5 >> 16));
        cArr[2] = (char) ((byte) (i5 >> 8));
        cArr[3] = (char) ((byte) i5);
        cArr[4] = '-';
        char c2 = 'c';
        char c3 = 'A';
        char c4 = 'u';
        switch (i2) {
            case 1:
                c2 = 'n';
                c3 = 'J';
                c4 = 'a';
                break;
            case 2:
                c3 = 'F';
                c2 = 'b';
                c4 = 'e';
                break;
            case 3:
                c2 = 'r';
                c3 = 'M';
                c4 = 'a';
                break;
            case 4:
                c2 = 'r';
                c4 = 'p';
                break;
            case 5:
                c2 = 'y';
                c3 = 'M';
                c4 = 'a';
                break;
            case 6:
                c2 = 'n';
                c3 = 'J';
                break;
            case 7:
                c2 = 'l';
                c3 = 'J';
                break;
            case 8:
                c2 = 'g';
                break;
            case 9:
                c3 = 'S';
                c2 = 'p';
                c4 = 'e';
                break;
            case 10:
                c3 = 'O';
                c2 = 't';
                c4 = 'c';
                break;
            case 11:
                c3 = 'N';
                c2 = 'v';
                c4 = 'o';
                break;
            case 12:
                c3 = com.taobao.tao.image.d.LEVEL_D;
                c4 = 'e';
                break;
            default:
                throw new JSONException("illegal month " + i2);
        }
        cArr[5] = c3;
        cArr[6] = c4;
        cArr[7] = c2;
        cArr[8] = '-';
        int i6 = d.DIGITS_K[i3];
        cArr[9] = (char) ((byte) (i6 >> 8));
        cArr[10] = (char) ((byte) i6);
        return new String(cArr);
    }

    public static String b(com.alibaba.fastjson2.time.c cVar) {
        if (cVar == null) {
            return null;
        }
        int i = cVar.f3021a.f3020a;
        short s = cVar.f3021a.b;
        short s2 = cVar.f3021a.c;
        byte b2 = cVar.b.f3022a;
        byte b3 = cVar.b.b;
        byte b4 = cVar.b.c;
        int i2 = cVar.b.d;
        int i3 = i2 / 1000;
        int i4 = i3 / 1000;
        int i5 = i2 - (i3 * 1000);
        int i6 = d.DIGITS_K[i4];
        int i7 = d.DIGITS_K[i3 - (i4 * 1000)];
        int i8 = d.DIGITS_K[i5];
        return new String(new char[]{(char) ((i / 1000) + 48), (char) (((i / 100) % 10) + 48), (char) (((i / 10) % 10) + 48), (char) ((i % 10) + 48), '-', (char) ((s / 10) + 48), (char) ((s % 10) + 48), '-', (char) ((s2 / 10) + 48), (char) ((s2 % 10) + 48), ' ', (char) ((b2 / 10) + 48), (char) ((b2 % 10) + 48), riy.CONDITION_IF_MIDDLE, (char) ((b3 / 10) + 48), (char) ((b3 % 10) + 48), riy.CONDITION_IF_MIDDLE, (char) ((b4 / 10) + 48), (char) ((b4 % 10) + 48), '.', (char) ((byte) (i6 >> 16)), (char) ((byte) (i6 >> 8)), (char) ((byte) i6), (char) ((byte) (i7 >> 16)), (char) ((byte) (i7 >> 8)), (char) ((byte) i7), (char) ((byte) (i8 >> 16)), (char) ((byte) (i8 >> 8)), (char) ((byte) i8)});
    }

    public static String b(com.alibaba.fastjson2.time.d dVar) {
        if (dVar == null) {
            return null;
        }
        int i = d.DIGITS_K[dVar.f3022a];
        int i2 = d.DIGITS_K[dVar.b];
        int i3 = d.DIGITS_K[dVar.c];
        return new String(new char[]{(char) ((byte) (i >> 8)), (char) ((byte) i), riy.CONDITION_IF_MIDDLE, (char) ((byte) (i2 >> 8)), (char) ((byte) i2), riy.CONDITION_IF_MIDDLE, (char) ((byte) (i3 >> 8)), (char) ((byte) i3)});
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.b c(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.c(byte[], int):com.alibaba.fastjson2.time.b");
    }

    public static com.alibaba.fastjson2.time.b c(char[] cArr, int i) {
        int a2;
        char c2;
        if (i + 10 > cArr.length) {
            return null;
        }
        char c3 = cArr[i];
        char c4 = cArr[i + 1];
        char c5 = cArr[i + 2];
        char c6 = cArr[i + 3];
        char c7 = cArr[i + 4];
        char c8 = cArr[i + 5];
        char c9 = cArr[i + 6];
        char c10 = cArr[i + 7];
        char c11 = cArr[i + 8];
        char c12 = cArr[i + 9];
        if ((c7 != '-' || c10 != '-') && (c7 != '/' || c10 != '/')) {
            if ((c5 == '.' && c8 == '.') || (c5 == '-' && c8 == '-')) {
                c8 = c6;
                c2 = '0';
                c6 = c12;
                c12 = c4;
                c4 = c10;
                c10 = c3;
                c3 = c9;
                c9 = c7;
            } else if (c5 == '/' && c8 == '/') {
                c8 = c3;
                c3 = c9;
                c2 = '0';
                c9 = c4;
                c4 = c10;
                c10 = c6;
                c6 = c12;
                c12 = c7;
            } else if ((c7 == 24180 && c9 == 26376 && c12 == 26085) || (c7 == 45380 && c9 == 50900 && c12 == 51068)) {
                c9 = c8;
                c12 = c11;
                c8 = '0';
            } else if ((c7 == 24180 && c10 == 26376 && c12 == 26085) || (c7 == 45380 && c10 == 50900 && c12 == 51068)) {
                c12 = c11;
                c10 = '0';
            } else if (c4 != ' ' || c8 != ' ' || (a2 = a(c5, c6, c7)) <= 0) {
                return null;
            } else {
                c2 = '0';
                c6 = c12;
                c12 = c3;
                c8 = (char) ((a2 / 10) + 48);
                c3 = c9;
                c9 = (char) ((a2 % 10) + 48);
                c4 = c10;
                c10 = '0';
            }
            if (c3 >= c2 || c3 > '9' || c4 < c2 || c4 > '9' || c11 < c2 || c11 > '9' || c6 < c2 || c6 > '9') {
                return null;
            }
            int i2 = ((c3 - c2) * 1000) + ((c4 - c2) * 100) + ((c11 - c2) * 10) + (c6 - c2);
            if (c8 < c2 || c8 > '9' || c9 < c2 || c9 > '9') {
                return null;
            }
            int i3 = ((c8 - c2) * 10) + (c9 - c2);
            if (c10 < c2 || c10 > '9' || c12 < c2 || c12 > '9') {
                return null;
            }
            int i4 = ((c10 - c2) * 10) + (c12 - c2);
            if (i2 != 0 || i3 != 0 || i4 != 0) {
                return com.alibaba.fastjson2.time.b.a(i2, i3, i4);
            }
            return null;
        }
        c10 = c11;
        c11 = c5;
        c2 = '0';
        return c3 >= c2 ? null : null;
    }

    public static com.alibaba.fastjson2.time.e c(String str, com.alibaba.fastjson2.time.e eVar) {
        int indexOf;
        int indexOf2;
        char charAt;
        if (str == null) {
            return eVar != null ? eVar : com.alibaba.fastjson2.time.e.b;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 47664) {
            if (hashCode != 67044) {
                if (hashCode == 1277108071 && str.equals(com.alibaba.fastjson2.time.e.OFFSET_8_ZONE_ID_NAME)) {
                    c2 = 1;
                }
            } else if (str.equals("CST")) {
                c2 = 2;
            }
        } else if (str.equals("000")) {
            c2 = 0;
        }
        if (c2 == 0) {
            return com.alibaba.fastjson2.time.e.c;
        }
        if (c2 == 1) {
            return com.alibaba.fastjson2.time.e.OFFSET_8_ZONE_ID;
        }
        if (c2 == 2) {
            return com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID;
        }
        if ((str.length() <= 0 || (((charAt = str.charAt(0)) != '+' && charAt != '-') || str.charAt(str.length() - 1) == ']')) && (indexOf = str.indexOf(91)) > 0 && (indexOf2 = str.indexOf(93, indexOf)) > 0) {
            str = str.substring(indexOf + 1, indexOf2);
        }
        return com.alibaba.fastjson2.time.e.a(str);
    }

    public static long d(String str, com.alibaba.fastjson2.time.e eVar) {
        if (str == null) {
            return 0L;
        }
        if (str.length() != 19) {
            throw new DateTimeException("illegal input " + str, str, 0);
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char charAt3 = str.charAt(2);
        char charAt4 = str.charAt(3);
        char charAt5 = str.charAt(4);
        char charAt6 = str.charAt(5);
        char charAt7 = str.charAt(6);
        char charAt8 = str.charAt(7);
        char charAt9 = str.charAt(8);
        char charAt10 = str.charAt(9);
        char charAt11 = str.charAt(10);
        char charAt12 = str.charAt(11);
        char charAt13 = str.charAt(12);
        char charAt14 = str.charAt(13);
        char charAt15 = str.charAt(14);
        char charAt16 = str.charAt(15);
        char charAt17 = str.charAt(16);
        char charAt18 = str.charAt(17);
        char charAt19 = str.charAt(18);
        if (charAt5 != '-' || charAt8 != '-' || charAt11 != ' ' || charAt14 != ':' || charAt17 != ':') {
            throw new DateTimeException("illegal input", str, 0);
        }
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || charAt3 < '0' || charAt3 > '9' || charAt4 < '0' || charAt4 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i = ((charAt - '0') * 1000) + ((charAt2 - '0') * 100) + ((charAt3 - '0') * 10) + (charAt4 - '0');
        if (charAt6 < '0' || charAt6 > '9' || charAt7 < '0' || charAt7 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i2 = ((charAt6 - '0') * 10) + (charAt7 - '0');
        if ((i2 == 0 && i != 0) || i2 > 12) {
            throw new DateTimeException("illegal input", str, 0);
        }
        if (charAt9 < '0' || charAt9 > '9' || charAt10 < '0' || charAt10 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i3 = (charAt10 - '0') + ((charAt9 - '0') * 10);
        int i4 = 31;
        if (i2 == 2) {
            i4 = (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0) ? 29 : 28;
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i4 = 30;
        }
        if ((i3 == 0 && i != 0) || i3 > i4) {
            throw new DateTimeException("illegal input", str, 0);
        }
        if (charAt12 < '0' || charAt12 > '9' || charAt13 < '0' || charAt13 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i5 = ((charAt12 - '0') * 10) + (charAt13 - '0');
        if (charAt15 < '0' || charAt15 > '9' || charAt16 < '0' || charAt16 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i6 = ((charAt15 - '0') * 10) + (charAt16 - '0');
        if (charAt18 < '0' || charAt18 > '9' || charAt19 < '0' || charAt19 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i7 = ((charAt18 - '0') * 10) + (charAt19 - '0');
        if (i == 0 && i2 == 0 && i3 == 0) {
            i = 1970;
            i3 = 1;
            i2 = 1;
        }
        long j = (i * fwk.DEFAULT_EXPIRED_TIME) + (((i + 3) / 4) - ((i + 99) / 100)) + ((i + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i2 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i3 - 1);
        if (i2 > 2) {
            j--;
            if (!((i & 3) == 0 && (i % 100 != 0 || i % 400 == 0))) {
                j--;
            }
        }
        long j2 = ((j - 719528) * 86400) + (i5 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) + (i6 * 60) + i7;
        com.alibaba.fastjson2.time.e eVar2 = eVar == null ? com.alibaba.fastjson2.time.e.b : eVar;
        return (j2 - ((!com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID.equals(eVar2) || j2 < 684900000) ? (eVar2 == com.alibaba.fastjson2.time.e.c || com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC.equals(eVar2.e)) ? 0 : eVar2.a(com.alibaba.fastjson2.time.c.a(com.alibaba.fastjson2.time.b.a(i, i2, i3), com.alibaba.fastjson2.time.d.a(i5, i6, i7, 0))) : 28800)) * 1000;
    }

    public static com.alibaba.fastjson2.time.b d(byte[] bArr, int i) {
        int a2;
        char c2;
        char c3;
        if (i + 10 > bArr.length) {
            return null;
        }
        char c4 = (char) bArr[i];
        char c5 = (char) bArr[i + 1];
        char c6 = (char) bArr[i + 2];
        char c7 = (char) bArr[i + 3];
        char c8 = (char) bArr[i + 4];
        char c9 = (char) bArr[i + 5];
        char c10 = (char) bArr[i + 6];
        char c11 = (char) bArr[i + 7];
        char c12 = (char) bArr[i + 8];
        char c13 = (char) bArr[i + 9];
        if ((c8 == '-' && c11 == '-') || (c8 == '/' && c11 == '/')) {
            c11 = c5;
            c2 = c10;
            c5 = c13;
            c10 = c4;
            c13 = c7;
            c4 = c9;
            c7 = c12;
            c12 = c6;
        } else {
            if ((c6 == '.' && c9 == '.') || (c6 == '-' && c9 == '-')) {
                c2 = c8;
                c3 = c7;
                c7 = c4;
            } else if (c6 != '/' || c9 != '/') {
                if (c5 == ' ' && c9 == ' ' && (a2 = a(c6, c7, c8)) > 0) {
                    c2 = (char) ((a2 % 10) + 48);
                    c7 = '0';
                    c3 = (char) ((a2 / 10) + 48);
                    c5 = c4;
                }
                return null;
            } else {
                c2 = c5;
                c5 = c8;
            }
            c4 = c3;
        }
        if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9' && c13 >= '0' && c13 <= '9') {
            int i2 = ((c10 - '0') * 1000) + ((c11 - '0') * 100) + ((c12 - '0') * 10) + (c13 - '0');
            if (c4 >= '0' && c4 <= '9' && c2 >= '0' && c2 <= '9') {
                int i3 = ((c4 - '0') * 10) + (c2 - '0');
                if (c7 >= '0' && c7 <= '9' && c5 >= '0' && c5 <= '9') {
                    int i4 = ((c7 - '0') * 10) + (c5 - '0');
                    if (i2 != 0 || i3 != 0 || i4 != 0) {
                        return com.alibaba.fastjson2.time.b.a(i2, i3, i4);
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static com.alibaba.fastjson2.time.b d(char[] cArr, int i) {
        int a2;
        if (i + 11 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        if ((c6 != 24180 || c9 != 26376 || c12 != 26085) && ((c6 != '-' || c9 != '-' || c12 != 'Z') && (c6 != 45380 || c9 != 50900 || c12 != 51068))) {
            if (c4 == ' ' && c8 == ' ' && (a2 = a(c5, c6, c7)) > 0) {
                c7 = (char) ((a2 / 10) + 48);
                c8 = (char) ((a2 % 10) + 48);
                c4 = c11;
                c11 = c3;
                c3 = c10;
                c10 = c2;
                c2 = c9;
            }
            return null;
        }
        c12 = c5;
        if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c12 >= '0' && c12 <= '9') {
            int i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c12 - '0');
            if (c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9') {
                int i3 = ((c7 - '0') * 10) + (c8 - '0');
                if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                    int i4 = ((c10 - '0') * 10) + (c11 - '0');
                    if (i2 != 0 || i3 != 0 || i4 != 0) {
                        return com.alibaba.fastjson2.time.b.a(i2, i3, i4);
                    }
                    return null;
                }
            }
        }
        return null;
    }

    static long e(String str, com.alibaba.fastjson2.time.e eVar) {
        if (str == null || "null".equals(str)) {
            return 0L;
        }
        if (str.length() != 8) {
            throw new DateTimeException("illegal input " + str, str, 0);
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char charAt3 = str.charAt(2);
        char charAt4 = str.charAt(3);
        char charAt5 = str.charAt(4);
        char charAt6 = str.charAt(5);
        char charAt7 = str.charAt(6);
        char charAt8 = str.charAt(7);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || charAt3 < '0' || charAt3 > '9' || charAt4 < '0' || charAt4 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i = ((charAt - '0') * 1000) + ((charAt2 - '0') * 100) + ((charAt3 - '0') * 10) + (charAt4 - '0');
        if (charAt5 < '0' || charAt5 > '9' || charAt6 < '0' || charAt6 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i2 = ((charAt5 - '0') * 10) + (charAt6 - '0');
        if ((i2 == 0 && i != 0) || i2 > 12) {
            throw new DateTimeException("illegal input", str, 0);
        }
        if (charAt7 < '0' || charAt7 > '9' || charAt8 < '0' || charAt8 > '9') {
            throw new DateTimeException("illegal input", str, 0);
        }
        int i3 = ((charAt7 - '0') * 10) + (charAt8 - '0');
        int i4 = 31;
        if (i2 == 2) {
            i4 = (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0) ? 29 : 28;
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i4 = 30;
        }
        if ((i3 == 0 && i != 0) || i3 > i4) {
            throw new DateTimeException("illegal input", str, 0);
        }
        if (i == 0 && i2 == 0 && i3 == 0) {
            i = 1970;
            i3 = 1;
            i2 = 1;
        }
        long j = (i * fwk.DEFAULT_EXPIRED_TIME) + (((i + 3) / 4) - ((i + 99) / 100)) + ((i + SecExceptionCode.SEC_ERROR_STA_UNKNOWN_ERROR) / 400) + (((i2 * 367) + AConstants.ArtcErrorAudioDeviceStartPlayoutError) / 12) + (i3 - 1);
        if (i2 > 2) {
            j--;
            if (!((i & 3) == 0 && (i % 100 != 0 || i % 400 == 0))) {
                j--;
            }
        }
        long j2 = (j - 719528) * 86400;
        return (j2 - ((!eVar.equals(com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID) || j2 < 684900000) ? (eVar == com.alibaba.fastjson2.time.e.c || com.taobao.android.weex_framework.util.a.ATOM_EXT_UTC.equals(eVar.e)) ? 0 : eVar.a(com.alibaba.fastjson2.time.c.a(com.alibaba.fastjson2.time.b.a(i, i2, i3), com.alibaba.fastjson2.time.d.MIN)) : 28800)) * 1000;
    }

    public static com.alibaba.fastjson2.time.b e(byte[] bArr, int i) {
        int a2;
        if (i + 11 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        if (c6 != '-' || c9 != '-' || c12 != 'Z') {
            if (c4 == ' ' && c8 == ' ' && (a2 = a(c5, c6, c7)) > 0) {
                c7 = (char) ((a2 / 10) + 48);
                c8 = (char) ((a2 % 10) + 48);
                c4 = c11;
                c11 = c3;
                c3 = c10;
                c10 = c2;
                c2 = c9;
            }
            return null;
        }
        c12 = c5;
        if (c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c12 >= '0' && c12 <= '9') {
            int i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c12 - '0');
            if (c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9') {
                int i3 = ((c7 - '0') * 10) + (c8 - '0');
                if (c10 >= '0' && c10 <= '9' && c11 >= '0' && c11 <= '9') {
                    int i4 = ((c10 - '0') * 10) + (c11 - '0');
                    if (i2 != 0 || i3 != 0 || i4 != 0) {
                        return com.alibaba.fastjson2.time.b.a(i2, i3, i4);
                    }
                    return null;
                }
            }
        }
        return null;
    }

    public static com.alibaba.fastjson2.time.c e(char[] cArr, int i) {
        char[] cArr2;
        int i2 = i + 12;
        if (i2 > cArr.length) {
            String str = new String(cArr, i, cArr.length - i);
            throw new DateTimeException("illegal input " + str, str, 0);
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        if (c2 < '0') {
            cArr2 = cArr;
        } else if (c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
            int i3 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
                String str2 = new String(cArr, i, i2);
                throw new DateTimeException("illegal input " + str2, str2, 0);
            }
            int i4 = ((c6 - '0') * 10) + (c7 - '0');
            if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
                String str3 = new String(cArr, i, i2);
                throw new DateTimeException("illegal input " + str3, str3, 0);
            }
            int i5 = ((c8 - '0') * 10) + (c9 - '0');
            if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
                String str4 = new String(cArr, i, i2);
                throw new DateTimeException("illegal input " + str4, str4, 0);
            }
            int i6 = ((c10 - '0') * 10) + (c11 - '0');
            if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
                String str5 = new String(cArr, i, i2);
                throw new DateTimeException("illegal input " + str5, str5, 0);
            }
            int i7 = ((c12 - '0') * 10) + (c13 - '0');
            if (i3 != 0 || i4 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
                return com.alibaba.fastjson2.time.c.a(i3, i4, i5, i6, i7, 0);
            }
            return null;
        } else {
            cArr2 = cArr;
        }
        String str6 = new String(cArr2, i, i2);
        throw new DateTimeException("illegal input " + str6, str6, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        if (r1 == ':') goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long f(java.lang.String r23, com.alibaba.fastjson2.time.e r24) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.f(java.lang.String, com.alibaba.fastjson2.time.e):long");
    }

    public static com.alibaba.fastjson2.time.c f(byte[] bArr, int i) {
        byte[] bArr2;
        int i2 = i + 12;
        if (i2 > bArr.length) {
            String str = new String(bArr, i, bArr.length - i);
            throw new DateTimeException("illegal input " + str, str, 0);
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        if (c2 < '0') {
            bArr2 = bArr;
        } else if (c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
            int i3 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
            if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
                String str2 = new String(bArr, i, i2);
                throw new DateTimeException("illegal input " + str2, str2, 0);
            }
            int i4 = ((c6 - '0') * 10) + (c7 - '0');
            if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
                String str3 = new String(bArr, i, i2);
                throw new DateTimeException("illegal input " + str3, str3, 0);
            }
            int i5 = ((c8 - '0') * 10) + (c9 - '0');
            if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
                String str4 = new String(bArr, i, i2);
                throw new DateTimeException("illegal input " + str4, str4, 0);
            }
            int i6 = ((c10 - '0') * 10) + (c11 - '0');
            if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
                String str5 = new String(bArr, i, i2);
                throw new DateTimeException("illegal input " + str5, str5, 0);
            }
            int i7 = ((c12 - '0') * 10) + (c13 - '0');
            if (i3 != 0 || i4 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
                return com.alibaba.fastjson2.time.c.a(i3, i4, i5, i6, i7, 0);
            }
            return null;
        } else {
            bArr2 = bArr;
        }
        String str6 = new String(bArr2, i, i2);
        throw new DateTimeException("illegal input " + str6, str6, 0);
    }

    public static com.alibaba.fastjson2.time.c f(char[] cArr, int i) {
        if (i + 14 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
            return null;
        }
        int i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
        if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
            return null;
        }
        int i3 = ((c6 - '0') * 10) + (c7 - '0');
        if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
            return null;
        }
        int i4 = ((c8 - '0') * 10) + (c9 - '0');
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
            return null;
        }
        int i5 = ((c10 - '0') * 10) + (c11 - '0');
        if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            return null;
        }
        int i6 = ((c12 - '0') * 10) + (c13 - '0');
        if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
            return com.alibaba.fastjson2.time.c.a(i2, i3, i4, i5, i6, ((c14 - '0') * 10) + (c15 - '0'));
        }
        return null;
    }

    public static com.alibaba.fastjson2.time.c g(byte[] bArr, int i) {
        if (i + 14 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        if (c2 < '0' || c2 > '9' || c3 < '0' || c3 > '9' || c4 < '0' || c4 > '9' || c5 < '0' || c5 > '9') {
            return null;
        }
        int i2 = ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0');
        if (c6 < '0' || c6 > '9' || c7 < '0' || c7 > '9') {
            return null;
        }
        int i3 = ((c6 - '0') * 10) + (c7 - '0');
        if (c8 < '0' || c8 > '9' || c9 < '0' || c9 > '9') {
            return null;
        }
        int i4 = ((c8 - '0') * 10) + (c9 - '0');
        if (c10 < '0' || c10 > '9' || c11 < '0' || c11 > '9') {
            return null;
        }
        int i5 = ((c10 - '0') * 10) + (c11 - '0');
        if (c12 < '0' || c12 > '9' || c13 < '0' || c13 > '9') {
            return null;
        }
        int i6 = ((c12 - '0') * 10) + (c13 - '0');
        if (c14 >= '0' && c14 <= '9' && c15 >= '0' && c15 <= '9') {
            return com.alibaba.fastjson2.time.c.a(i2, i3, i4, i5, i6, ((c14 - '0') * 10) + (c15 - '0'));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r12 == ' ') goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.c g(char[] r24, int r25) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.g(char[], int):com.alibaba.fastjson2.time.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0122, code lost:
        if (r12 == 32) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0230 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.c h(byte[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.h(byte[], int):com.alibaba.fastjson2.time.c");
    }

    public static com.alibaba.fastjson2.time.c h(char[] cArr, int i) {
        int i2;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i + 17 > cArr.length) {
            String str = new String(cArr, i, cArr.length - i);
            throw new DateTimeException("illegal input " + str, str, 0);
        }
        char c3 = cArr[i];
        char c4 = cArr[i + 1];
        char c5 = cArr[i + 2];
        char c6 = cArr[i + 3];
        char c7 = cArr[i + 4];
        char c8 = cArr[i + 5];
        char c9 = cArr[i + 6];
        char c10 = cArr[i + 7];
        char c11 = cArr[i + 8];
        char c12 = cArr[i + 9];
        char c13 = cArr[i + 10];
        char c14 = cArr[i + 11];
        char c15 = cArr[i + 12];
        char c16 = cArr[i + 13];
        char c17 = cArr[i + 14];
        char c18 = cArr[i + 15];
        char c19 = cArr[i + 16];
        char c20 = '-';
        if (c7 == '-' && c10 == '-') {
            if ((c13 == 'T' || c13 == ' ') && c16 == ':' && c19 == 'Z') {
                c10 = c4;
                c7 = c8;
                c8 = c9;
                c16 = c18;
                c9 = c3;
                c4 = c12;
                c19 = '0';
                c2 = '0';
                c18 = '0';
                i2 = 0;
                if (c9 >= c2 && c9 <= '9' && c10 >= c2 && c10 <= '9' && c5 >= c2 && c5 <= '9' && c6 >= c2 && c6 <= '9') {
                    i3 = ((c9 - c2) * 1000) + ((c10 - c2) * 100) + ((c5 - c2) * 10) + (c6 - c2);
                    if (c7 >= c2 && c7 <= '9' && c8 >= c2 && c8 <= '9') {
                        i4 = ((c7 - c2) * 10) + (c8 - c2);
                        if (c11 >= c2 && c11 <= '9' && c4 >= c2 && c4 <= '9') {
                            i5 = ((c11 - c2) * 10) + (c4 - c2);
                            if (c14 >= c2 && c14 <= '9' && c15 >= c2 && c15 <= '9') {
                                i6 = ((c14 - c2) * 10) + (c15 - c2);
                                if (c17 >= c2 && c17 <= '9' && c16 >= c2 && c16 <= '9') {
                                    i7 = ((c17 - c2) * 10) + (c16 - c2);
                                    if (c18 >= c2 && c18 <= '9' && c19 >= c2 && c19 <= '9') {
                                        return com.alibaba.fastjson2.time.c.a(i3, i4, i5, i6, i7, ((c18 - c2) * 10) + (c19 - c2), i2);
                                    }
                                }
                            }
                        }
                    }
                }
                return null;
            }
            c20 = '-';
        }
        if (c7 == c20 && c9 == c20 && ((c11 == ' ' || c11 == 'T') && c14 == ':' && c17 == ':')) {
            c17 = c15;
            c9 = c3;
            c14 = c12;
            c2 = '0';
            c7 = '0';
            c11 = '0';
            i2 = 0;
            c15 = c13;
            c10 = c4;
            c4 = c10;
        } else {
            char c21 = ' ';
            if (c5 == ' ' && c9 == ' ' && c14 == ' ') {
                if (c17 == ':') {
                    int a2 = a(c6, c7, c8);
                    if (a2 <= 0) {
                        return null;
                    }
                    c7 = (char) ((a2 / 10) + 48);
                    c8 = (char) ((a2 % 10) + 48);
                    c9 = c10;
                    c10 = c11;
                    c17 = c18;
                    c6 = c13;
                    c14 = c15;
                    c11 = c3;
                    c5 = c12;
                    c2 = '0';
                    c18 = '0';
                    i2 = 0;
                    c15 = c16;
                    c16 = c19;
                    c19 = '0';
                } else {
                    c21 = ' ';
                }
            }
            if (c4 == c21 && c8 == c21 && c13 == c21) {
                if (c15 == ':' && c17 == ':') {
                    int a3 = a(c5, c6, c7);
                    if (a3 <= 0) {
                        return null;
                    }
                    c7 = (char) ((a3 / 10) + 48);
                    c8 = (char) ((a3 % 10) + 48);
                    c5 = c11;
                    c15 = c14;
                    c4 = c3;
                    c6 = c12;
                    c2 = '0';
                    c17 = '0';
                    c11 = '0';
                    c14 = '0';
                    i2 = 0;
                } else {
                    c21 = ' ';
                }
            }
            if (c4 == c21 && c8 == c21 && c13 == c21) {
                if (c15 == ':' && c18 == ':') {
                    int a4 = a(c5, c6, c7);
                    if (a4 <= 0) {
                        return null;
                    }
                    c7 = (char) ((a4 / 10) + 48);
                    c8 = (char) ((a4 % 10) + 48);
                    c5 = c11;
                    c15 = c14;
                    c4 = c3;
                    c6 = c12;
                    c2 = '0';
                    c11 = '0';
                    c18 = '0';
                    c14 = '0';
                    i2 = 0;
                    c16 = c17;
                    c17 = c16;
                } else {
                    c21 = ' ';
                }
            }
            if (c4 == c21 && c8 == c21 && c13 == c21) {
                if (c16 == ':' && c18 == ':') {
                    int a5 = a(c5, c6, c7);
                    if (a5 <= 0) {
                        return null;
                    }
                    c7 = (char) ((a5 / 10) + 48);
                    c8 = (char) ((a5 % 10) + 48);
                    c16 = c17;
                    c5 = c11;
                    c4 = c3;
                    c6 = c12;
                    c2 = '0';
                    c17 = '0';
                    c11 = '0';
                    c18 = '0';
                    i2 = 0;
                } else {
                    c21 = ' ';
                }
            }
            if (c5 != c21 || c9 != c21 || c14 != c21 || c16 != ':' || c18 != ':') {
                if (c17 >= '0' && c17 <= '9' && c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9') {
                    i2 = 1000000 * (((c17 - '0') * 100) + ((c18 - '0') * 10) + (c19 - '0'));
                    c19 = c16;
                    c4 = c10;
                    c17 = c13;
                    c16 = c14;
                    c18 = c15;
                    c15 = c12;
                    c10 = c4;
                    c2 = '0';
                    c14 = c11;
                    c11 = c9;
                    c9 = c3;
                }
                return null;
            }
            int a6 = a(c6, c7, c8);
            if (a6 <= 0) {
                return null;
            }
            c7 = (char) ((a6 / 10) + 48);
            c8 = (char) ((a6 % 10) + 48);
            c16 = c17;
            c9 = c10;
            c10 = c11;
            c6 = c13;
            c11 = c3;
            c5 = c12;
            c2 = '0';
            c17 = '0';
            c18 = '0';
            c14 = '0';
            i2 = 0;
        }
        if (c9 >= c2) {
            i3 = ((c9 - c2) * 1000) + ((c10 - c2) * 100) + ((c5 - c2) * 10) + (c6 - c2);
            if (c7 >= c2) {
                i4 = ((c7 - c2) * 10) + (c8 - c2);
                if (c11 >= c2) {
                    i5 = ((c11 - c2) * 10) + (c4 - c2);
                    if (c14 >= c2) {
                        i6 = ((c14 - c2) * 10) + (c15 - c2);
                        if (c17 >= c2) {
                            i7 = ((c17 - c2) * 10) + (c16 - c2);
                            if (c18 >= c2) {
                                return com.alibaba.fastjson2.time.c.a(i3, i4, i5, i6, i7, ((c18 - c2) * 10) + (c19 - c2), i2);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static com.alibaba.fastjson2.time.c i(byte[] bArr, int i) {
        byte b2;
        String str;
        byte b3;
        String str2;
        String str3;
        char c2;
        char c3;
        char c4;
        char c5;
        int i2;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        if (i + 17 > bArr.length) {
            String str4 = new String(bArr, i, bArr.length - i);
            throw new DateTimeException("illegal input " + str4, str4, 0);
        }
        byte b4 = bArr[i];
        byte b5 = bArr[i + 1];
        byte b6 = bArr[i + 2];
        byte b7 = bArr[i + 3];
        byte b8 = bArr[i + 4];
        byte b9 = bArr[i + 5];
        byte b10 = bArr[i + 6];
        byte b11 = bArr[i + 7];
        byte b12 = bArr[i + 8];
        byte b13 = bArr[i + 9];
        byte b14 = bArr[i + 10];
        byte b15 = bArr[i + 11];
        byte b16 = bArr[i + 12];
        byte b17 = bArr[i + 13];
        byte b18 = bArr[i + 14];
        byte b19 = bArr[i + 15];
        byte b20 = bArr[i + 16];
        if (b8 != 45 || b11 != 45 || ((b14 != 84 && b14 != 32) || b17 != 58 || b20 != 90)) {
            if (b8 == 45 && b10 == 45 && ((b12 == 32 || b12 == 84) && b15 == 58 && b18 == 58)) {
                c11 = (char) b4;
                char c20 = (char) b5;
                char c21 = (char) b6;
                c7 = (char) b9;
                c15 = (char) b11;
                char c22 = (char) b14;
                c3 = (char) b16;
                c4 = (char) b17;
                c13 = (char) b20;
                str3 = "illegal input ";
                c5 = '0';
                c14 = '0';
                i2 = 0;
                c16 = (char) b19;
                c10 = c22;
                c9 = (char) b13;
                c2 = (char) b7;
                c6 = c21;
                c12 = c20;
                c8 = '0';
            } else if (b8 == -27 && b9 == -71 && b10 == -76 && b13 == -26 && b14 == -100 && b15 == -120 && b18 == -26 && b19 == -105 && b20 == -91) {
                char c23 = (char) b4;
                char c24 = (char) b6;
                c14 = (char) b11;
                c7 = (char) b12;
                char c25 = (char) b16;
                c15 = (char) b17;
                c2 = (char) b7;
                str3 = "illegal input ";
                c9 = '0';
                c10 = '0';
                c16 = '0';
                c13 = '0';
                c3 = '0';
                c4 = '0';
                i2 = 0;
                c12 = (char) b5;
                c11 = c23;
                c5 = '0';
                c6 = c24;
                c8 = c25;
            } else if (b6 == 32 && b10 == 32 && b15 == 32 && b18 == 58) {
                c11 = (char) b11;
                char c26 = (char) b12;
                char c27 = (char) b13;
                char c28 = (char) b14;
                int a2 = a((char) b7, (char) b8, (char) b9);
                if (a2 <= 0) {
                    String str5 = new String(bArr, i, 17);
                    throw new DateTimeException("illegal input " + str5, str5, 0);
                }
                char c29 = (char) ((a2 / 10) + 48);
                c8 = (char) b4;
                c3 = (char) b19;
                c4 = (char) b20;
                str3 = "illegal input ";
                c16 = '0';
                c13 = '0';
                i2 = 0;
                c9 = (char) b16;
                c5 = '0';
                c15 = (char) b5;
                c12 = c26;
                c6 = c27;
                c7 = (char) ((a2 % 10) + 48);
                c2 = c28;
                c10 = (char) b17;
                c14 = c29;
            } else {
                if (b5 == 32 && b9 == 32 && b14 == 32 && b16 == 58 && b18 == 58) {
                    c17 = (char) b4;
                    int a3 = a((char) b6, (char) b7, (char) b8);
                    if (a3 <= 0) {
                        String str6 = new String(bArr, i, 17);
                        throw new DateTimeException("illegal input " + str6, str6, 0);
                    }
                    c18 = (char) ((a3 / 10) + 48);
                    c7 = (char) ((a3 % 10) + 48);
                    c11 = (char) b10;
                    c12 = (char) b11;
                    c6 = (char) b12;
                    c2 = (char) b13;
                    c19 = (char) b15;
                    c4 = (char) b17;
                    c16 = (char) b19;
                    c13 = (char) b20;
                    str3 = "illegal input ";
                    c9 = '0';
                    c3 = '0';
                } else {
                    byte b21 = 32;
                    if (b5 != 32 || b9 != 32 || b14 != 32) {
                        b2 = b20;
                        str = "illegal input ";
                    } else if (b16 == 58 && b19 == 58) {
                        c17 = (char) b4;
                        int a4 = a((char) b6, (char) b7, (char) b8);
                        if (a4 <= 0) {
                            String str7 = new String(bArr, i, 17);
                            throw new DateTimeException("illegal input " + str7, str7, 0);
                        }
                        c18 = (char) ((a4 / 10) + 48);
                        c7 = (char) ((a4 % 10) + 48);
                        c11 = (char) b10;
                        c12 = (char) b11;
                        c6 = (char) b12;
                        c2 = (char) b13;
                        c19 = (char) b15;
                        c3 = (char) b17;
                        c4 = (char) b18;
                        c13 = (char) b20;
                        str3 = "illegal input ";
                        c9 = '0';
                        c16 = '0';
                    } else {
                        b2 = b20;
                        str = "illegal input ";
                        b21 = 32;
                    }
                    if (b5 != b21 || b9 != b21 || b14 != b21) {
                        b3 = b2;
                        str2 = str;
                    } else if (b17 == 58 && b19 == 58) {
                        char c30 = (char) b4;
                        int a5 = a((char) b6, (char) b7, (char) b8);
                        if (a5 <= 0) {
                            String str8 = new String(bArr, i, 17);
                            throw new DateTimeException(str + str8, str8, 0);
                        }
                        c7 = (char) ((a5 % 10) + 48);
                        char c31 = (char) b10;
                        char c32 = (char) b11;
                        c6 = (char) b12;
                        c2 = (char) b13;
                        char c33 = (char) b15;
                        c4 = (char) b18;
                        c13 = (char) b2;
                        str3 = str;
                        c16 = '0';
                        c3 = '0';
                        i2 = 0;
                        c10 = (char) b16;
                        c9 = c33;
                        c5 = '0';
                        c15 = c30;
                        c11 = c31;
                        c8 = '0';
                        c14 = (char) ((a5 / 10) + 48);
                        c12 = c32;
                    } else {
                        b3 = b2;
                        str2 = str;
                        b21 = 32;
                    }
                    if (b6 == b21 && b10 == b21 && b15 == b21 && b17 == 58 && b19 == 58) {
                        char c34 = (char) b4;
                        char c35 = (char) b5;
                        int a6 = a((char) b7, (char) b8, (char) b9);
                        if (a6 <= 0) {
                            String str9 = new String(bArr, i, 17);
                            throw new DateTimeException(str2 + str9, str9, 0);
                        }
                        c14 = (char) ((a6 / 10) + 48);
                        c7 = (char) ((a6 % 10) + 48);
                        char c36 = (char) b11;
                        char c37 = (char) b12;
                        char c38 = (char) b14;
                        c4 = (char) b18;
                        c13 = (char) b3;
                        str3 = str2;
                        c9 = '0';
                        c16 = '0';
                        c3 = '0';
                        i2 = 0;
                        c10 = (char) b16;
                        c5 = '0';
                        c8 = c34;
                        c11 = c36;
                        c12 = c37;
                        c6 = (char) b13;
                        c2 = c38;
                        c15 = c35;
                    } else {
                        byte b22 = b3;
                        str3 = str2;
                        char c39 = (char) b4;
                        char c40 = (char) b5;
                        char c41 = (char) b6;
                        c2 = (char) b7;
                        char c42 = (char) b8;
                        char c43 = (char) b9;
                        char c44 = (char) b10;
                        char c45 = (char) b11;
                        char c46 = (char) b12;
                        char c47 = (char) b13;
                        c3 = (char) b14;
                        c4 = (char) b15;
                        char c48 = (char) b16;
                        char c49 = (char) b17;
                        c5 = '0';
                        if (b18 < 48 || b18 > 57 || b19 < 48 || b19 > 57 || b22 < 48 || b22 > 57) {
                            return null;
                        }
                        i2 = (((b18 - 48) * 100) + ((b19 - 48) * 10) + (b22 - 48)) * 1000000;
                        c6 = c41;
                        c7 = c43;
                        c8 = c44;
                        c9 = c46;
                        c10 = c47;
                        c11 = c39;
                        c12 = c40;
                        c13 = c49;
                        c14 = c42;
                        c15 = c45;
                        c16 = c48;
                    }
                }
                i2 = 0;
                c14 = c18;
                c10 = c19;
                c8 = '0';
                c15 = c17;
            }
            if (c11 >= c5 || c11 > '9' || c12 < c5 || c12 > '9' || c6 < c5 || c6 > '9' || c2 < c5 || c2 > '9') {
                String str10 = new String(bArr, i, 17);
                throw new DateTimeException(str3 + str10, str10, 0);
            }
            int i3 = ((c11 - c5) * 1000) + ((c12 - c5) * 100) + ((c6 - c5) * 10) + (c2 - c5);
            if (c14 < c5 || c14 > '9' || c7 < c5 || c7 > '9') {
                String str11 = new String(bArr, i, 17);
                throw new DateTimeException(str3 + str11, str11, 0);
            }
            int i4 = ((c14 - c5) * 10) + (c7 - c5);
            if (c8 < c5 || c8 > '9' || c15 < c5 || c15 > '9') {
                String str12 = new String(bArr, i, 17);
                throw new DateTimeException(str3 + str12, str12, 0);
            }
            int i5 = ((c8 - c5) * 10) + (c15 - c5);
            if (c9 < c5 || c9 > '9' || c10 < c5 || c10 > '9') {
                String str13 = new String(bArr, i, 17);
                throw new DateTimeException(str3 + str13, str13, 0);
            }
            int i6 = ((c9 - c5) * 10) + (c10 - c5);
            if (c3 < c5 || c3 > '9' || c4 < c5 || c4 > '9') {
                String str14 = new String(bArr, i, 17);
                throw new DateTimeException(str3 + str14, str14, 0);
            }
            int i7 = ((c3 - c5) * 10) + (c4 - c5);
            if (c16 >= c5 && c16 <= '9' && c13 >= c5 && c13 <= '9') {
                return com.alibaba.fastjson2.time.c.a(i3, i4, i5, i6, i7, ((c16 - c5) * 10) + (c13 - c5), i2);
            }
            String str15 = new String(bArr, i, 17);
            throw new DateTimeException(str3 + str15, str15, 0);
        }
        char c50 = (char) b4;
        char c51 = (char) b5;
        char c52 = (char) b6;
        char c53 = (char) b7;
        c14 = (char) b9;
        c7 = (char) b10;
        char c54 = (char) b12;
        c15 = (char) b13;
        c9 = (char) b15;
        c10 = (char) b16;
        c4 = (char) b19;
        c3 = (char) b18;
        str3 = "illegal input ";
        c16 = '0';
        c13 = '0';
        i2 = 0;
        c6 = c52;
        c8 = c54;
        c2 = c53;
        c12 = c51;
        c11 = c50;
        c5 = '0';
        if (c11 >= c5) {
        }
        String str102 = new String(bArr, i, 17);
        throw new DateTimeException(str3 + str102, str102, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0408  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.c i(char[] r29, int r30) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.i(char[], int):com.alibaba.fastjson2.time.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson2.time.c j(byte[] r29, int r30) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.DateUtils.j(byte[], int):com.alibaba.fastjson2.time.c");
    }

    public static com.alibaba.fastjson2.time.c j(char[] cArr, int i) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        if (i + 19 > cArr.length) {
            return null;
        }
        char c12 = cArr[i];
        char c13 = cArr[i + 1];
        char c14 = cArr[i + 2];
        char c15 = cArr[i + 3];
        char c16 = cArr[i + 4];
        char c17 = cArr[i + 5];
        char c18 = cArr[i + 6];
        char c19 = cArr[i + 7];
        char c20 = cArr[i + 8];
        char c21 = cArr[i + 9];
        char c22 = cArr[i + 10];
        char c23 = cArr[i + 11];
        char c24 = cArr[i + 12];
        char c25 = cArr[i + 13];
        char c26 = cArr[i + 14];
        char c27 = cArr[i + 15];
        char c28 = cArr[i + 16];
        char c29 = cArr[i + 17];
        char c30 = cArr[i + 18];
        if ((c16 == '-' && c19 == '-' && ((c22 == ' ' || c22 == 'T') && c25 == ':' && c28 == ':')) || (c16 == '/' && c19 == '/' && ((c22 == ' ' || c22 == 'T') && c25 == ':' && c28 == ':'))) {
            c7 = c12;
            c8 = c13;
            c9 = c14;
            c10 = c15;
            c5 = c17;
            c6 = c18;
            c11 = c20;
            c4 = c21;
        } else if (c14 == '/' && c17 == '/' && ((c22 == ' ' || c22 == 'T') && c25 == ':' && c28 == ':')) {
            c11 = c12;
            c4 = c13;
            c5 = c15;
            c6 = c16;
            c7 = c18;
            c8 = c19;
            c9 = c20;
            c10 = c21;
        } else if (c13 != ' ' || c17 != ' ' || c22 != ' ' || c25 != ':' || c28 != ':') {
            return null;
        } else {
            int a2 = a(c14, c15, c16);
            if (a2 > 0) {
                c3 = (char) ((a2 % 10) + 48);
                c2 = (char) ((a2 / 10) + 48);
            } else {
                c2 = '0';
                c3 = '0';
            }
            c4 = c12;
            c5 = c2;
            c6 = c3;
            c7 = c18;
            c8 = c19;
            c9 = c20;
            c10 = c21;
            c11 = '0';
        }
        return a(c7, c8, c9, c10, c5, c6, c11, c4, c23, c24, c26, c27, c29, c30);
    }

    public static com.alibaba.fastjson2.time.c k(byte[] bArr, int i) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        if (i + 19 > bArr.length) {
            return null;
        }
        char c9 = (char) bArr[i];
        char c10 = (char) bArr[i + 1];
        char c11 = (char) bArr[i + 2];
        char c12 = (char) bArr[i + 3];
        char c13 = (char) bArr[i + 4];
        char c14 = (char) bArr[i + 5];
        char c15 = (char) bArr[i + 7];
        char c16 = (char) bArr[i + 9];
        char c17 = (char) bArr[i + 10];
        char c18 = (char) bArr[i + 11];
        char c19 = (char) bArr[i + 12];
        char c20 = (char) bArr[i + 13];
        char c21 = (char) bArr[i + 14];
        char c22 = (char) bArr[i + 15];
        char c23 = (char) bArr[i + 6];
        char c24 = (char) bArr[i + 16];
        char c25 = (char) bArr[i + 8];
        char c26 = (char) bArr[i + 17];
        char c27 = (char) bArr[i + 18];
        if (c13 != '-' || c15 != '-' || ((c17 != ' ' && c17 != 'T') || c20 != ':' || c24 != ':')) {
            char c28 = fxb.DIR;
            if (c13 == '/' && c15 == '/') {
                if ((c17 != ' ' && c17 != 'T') || c20 != ':' || c24 != ':') {
                    c28 = fxb.DIR;
                }
            }
            if (c11 == c28 && c14 == c28 && ((c17 == ' ' || c17 == 'T') && c20 == ':' && c24 == ':')) {
                c5 = c10;
                c4 = c16;
                c6 = c23;
                c7 = c25;
                c23 = c13;
                c25 = c9;
                c8 = c12;
            } else if (c10 != ' ' || c14 != ' ' || c17 != ' ' || c20 != ':' || c24 != ':') {
                return null;
            } else {
                int a2 = a(c11, c12, c13);
                if (a2 > 0) {
                    c3 = (char) ((a2 % 10) + 48);
                    c2 = (char) ((a2 / 10) + 48);
                } else {
                    c2 = '0';
                    c3 = '0';
                }
                c4 = c16;
                c5 = c9;
                c6 = c23;
                c7 = c25;
                c25 = '0';
                c8 = c2;
                c23 = c3;
            }
            return a(c6, c15, c7, c4, c8, c23, c25, c5, c18, c19, c21, c22, c26, c27);
        }
        c15 = c10;
        c4 = c12;
        c5 = c16;
        c6 = c9;
        c7 = c11;
        c8 = c14;
        return a(c6, c15, c7, c4, c8, c23, c25, c5, c18, c19, c21, c22, c26, c27);
    }

    public static com.alibaba.fastjson2.time.c k(char[] cArr, int i) {
        char c2;
        int i2 = i + 19;
        if (i2 > cArr.length) {
            return null;
        }
        char c3 = cArr[i];
        char c4 = cArr[i + 1];
        char c5 = cArr[i + 2];
        char c6 = cArr[i + 3];
        char c7 = cArr[i + 4];
        char c8 = cArr[i + 5];
        char c9 = cArr[i + 6];
        char c10 = cArr[i + 7];
        char c11 = cArr[i + 8];
        char c12 = cArr[i + 9];
        char c13 = cArr[i + 10];
        char c14 = cArr[i + 11];
        char c15 = cArr[i + 12];
        char c16 = cArr[i + 13];
        char c17 = cArr[i + 14];
        char c18 = cArr[i + 15];
        char c19 = cArr[i + 16];
        char c20 = cArr[i + 17];
        char c21 = cArr[i + 18];
        char c22 = cArr[i2];
        if (c5 != ' ' || c9 != ' ' || c14 != ' ' || c17 != ':' || c20 != ':') {
            return null;
        }
        int a2 = a(c6, c7, c8);
        char c23 = '0';
        if (a2 > 0) {
            c2 = (char) ((a2 % 10) + 48);
            c23 = (char) ((a2 / 10) + 48);
        } else {
            c2 = '0';
        }
        return a(c10, c11, c12, c13, c23, c2, c3, c4, c15, c16, c18, c19, c21, c22);
    }

    public static com.alibaba.fastjson2.time.c l(byte[] bArr, int i) {
        char c2;
        int i2 = i + 19;
        if (i2 > bArr.length) {
            return null;
        }
        char c3 = (char) bArr[i];
        char c4 = (char) bArr[i + 1];
        char c5 = (char) bArr[i + 2];
        char c6 = (char) bArr[i + 3];
        char c7 = (char) bArr[i + 4];
        char c8 = (char) bArr[i + 5];
        char c9 = (char) bArr[i + 6];
        char c10 = (char) bArr[i + 7];
        char c11 = (char) bArr[i + 8];
        char c12 = (char) bArr[i + 9];
        char c13 = (char) bArr[i + 10];
        char c14 = (char) bArr[i + 11];
        char c15 = (char) bArr[i + 12];
        char c16 = (char) bArr[i + 13];
        char c17 = (char) bArr[i + 14];
        char c18 = (char) bArr[i + 15];
        char c19 = (char) bArr[i + 16];
        char c20 = (char) bArr[i + 17];
        char c21 = (char) bArr[i + 18];
        char c22 = (char) bArr[i2];
        if (c5 != ' ' || c9 != ' ' || c14 != ' ' || c17 != ':' || c20 != ':') {
            return null;
        }
        int a2 = a(c6, c7, c8);
        char c23 = '0';
        if (a2 > 0) {
            c2 = (char) ((a2 % 10) + 48);
            c23 = (char) ((a2 / 10) + 48);
        } else {
            c2 = '0';
        }
        return a(c10, c11, c12, c13, c23, c2, c3, c4, c15, c16, c18, c19, c21, c22);
    }

    public static com.alibaba.fastjson2.time.c l(char[] cArr, int i) {
        if (i + 26 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        char c16 = cArr[i + 14];
        char c17 = cArr[i + 15];
        char c18 = cArr[i + 16];
        char c19 = cArr[i + 17];
        char c20 = cArr[i + 18];
        char c21 = cArr[i + 19];
        char c22 = cArr[i + 20];
        char c23 = cArr[i + 21];
        char c24 = cArr[i + 22];
        char c25 = cArr[i + 23];
        char c26 = cArr[i + 24];
        char c27 = cArr[i + 25];
        if (c6 != '-' || c9 != '-') {
            return null;
        }
        if ((c12 != ' ' && c12 != 'T') || c15 != ':' || c18 != ':' || c21 != '.') {
            return null;
        }
        return a(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, '0', '0', '0');
    }

    public static com.alibaba.fastjson2.time.c m(byte[] bArr, int i) {
        if (i + 26 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        char c16 = (char) bArr[i + 14];
        char c17 = (char) bArr[i + 15];
        char c18 = (char) bArr[i + 16];
        char c19 = (char) bArr[i + 17];
        char c20 = (char) bArr[i + 18];
        char c21 = (char) bArr[i + 19];
        char c22 = (char) bArr[i + 20];
        char c23 = (char) bArr[i + 21];
        char c24 = (char) bArr[i + 22];
        char c25 = (char) bArr[i + 23];
        char c26 = (char) bArr[i + 24];
        char c27 = (char) bArr[i + 25];
        if (c6 != '-' || c9 != '-') {
            return null;
        }
        if ((c12 != ' ' && c12 != 'T') || c15 != ':' || c18 != ':' || c21 != '.') {
            return null;
        }
        return a(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, '0', '0', '0');
    }

    public static com.alibaba.fastjson2.time.c m(char[] cArr, int i) {
        if (i + 27 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        char c16 = cArr[i + 14];
        char c17 = cArr[i + 15];
        char c18 = cArr[i + 16];
        char c19 = cArr[i + 17];
        char c20 = cArr[i + 18];
        char c21 = cArr[i + 19];
        char c22 = cArr[i + 20];
        char c23 = cArr[i + 21];
        char c24 = cArr[i + 22];
        char c25 = cArr[i + 23];
        char c26 = cArr[i + 24];
        char c27 = cArr[i + 25];
        char c28 = cArr[i + 26];
        if (c6 != '-' || c9 != '-') {
            return null;
        }
        if ((c12 != ' ' && c12 != 'T') || c15 != ':' || c18 != ':' || c21 != '.') {
            return null;
        }
        return a(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, '0', '0');
    }

    public static com.alibaba.fastjson2.time.c n(byte[] bArr, int i) {
        if (i + 27 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        char c16 = (char) bArr[i + 14];
        char c17 = (char) bArr[i + 15];
        char c18 = (char) bArr[i + 16];
        char c19 = (char) bArr[i + 17];
        char c20 = (char) bArr[i + 18];
        char c21 = (char) bArr[i + 19];
        char c22 = (char) bArr[i + 20];
        char c23 = (char) bArr[i + 21];
        char c24 = (char) bArr[i + 22];
        char c25 = (char) bArr[i + 23];
        char c26 = (char) bArr[i + 24];
        char c27 = (char) bArr[i + 25];
        char c28 = (char) bArr[i + 26];
        if (c6 != '-' || c9 != '-') {
            return null;
        }
        if ((c12 != ' ' && c12 != 'T') || c15 != ':' || c18 != ':' || c21 != '.') {
            return null;
        }
        return a(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, '0', '0');
    }

    public static com.alibaba.fastjson2.time.c n(char[] cArr, int i) {
        if (i + 28 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        char c16 = cArr[i + 14];
        char c17 = cArr[i + 15];
        char c18 = cArr[i + 16];
        char c19 = cArr[i + 17];
        char c20 = cArr[i + 18];
        char c21 = cArr[i + 19];
        char c22 = cArr[i + 20];
        char c23 = cArr[i + 21];
        char c24 = cArr[i + 22];
        char c25 = cArr[i + 23];
        char c26 = cArr[i + 24];
        char c27 = cArr[i + 25];
        char c28 = cArr[i + 26];
        char c29 = cArr[i + 27];
        if (c6 != '-' || c9 != '-') {
            return null;
        }
        if ((c12 != ' ' && c12 != 'T') || c15 != ':' || c18 != ':' || c21 != '.') {
            return null;
        }
        return a(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, c29, '0');
    }

    public static com.alibaba.fastjson2.time.c o(byte[] bArr, int i) {
        if (i + 28 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        char c16 = (char) bArr[i + 14];
        char c17 = (char) bArr[i + 15];
        char c18 = (char) bArr[i + 16];
        char c19 = (char) bArr[i + 17];
        char c20 = (char) bArr[i + 18];
        char c21 = (char) bArr[i + 19];
        char c22 = (char) bArr[i + 20];
        char c23 = (char) bArr[i + 21];
        char c24 = (char) bArr[i + 22];
        char c25 = (char) bArr[i + 23];
        char c26 = (char) bArr[i + 24];
        char c27 = (char) bArr[i + 25];
        char c28 = (char) bArr[i + 26];
        char c29 = (char) bArr[i + 27];
        if (c6 != '-' || c9 != '-') {
            return null;
        }
        if ((c12 != ' ' && c12 != 'T') || c15 != ':' || c18 != ':' || c21 != '.') {
            return null;
        }
        return a(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, c29, '0');
    }

    public static com.alibaba.fastjson2.time.c o(char[] cArr, int i) {
        if (i + 29 > cArr.length) {
            return null;
        }
        char c2 = cArr[i];
        char c3 = cArr[i + 1];
        char c4 = cArr[i + 2];
        char c5 = cArr[i + 3];
        char c6 = cArr[i + 4];
        char c7 = cArr[i + 5];
        char c8 = cArr[i + 6];
        char c9 = cArr[i + 7];
        char c10 = cArr[i + 8];
        char c11 = cArr[i + 9];
        char c12 = cArr[i + 10];
        char c13 = cArr[i + 11];
        char c14 = cArr[i + 12];
        char c15 = cArr[i + 13];
        char c16 = cArr[i + 14];
        char c17 = cArr[i + 15];
        char c18 = cArr[i + 16];
        char c19 = cArr[i + 17];
        char c20 = cArr[i + 18];
        char c21 = cArr[i + 19];
        char c22 = cArr[i + 20];
        char c23 = cArr[i + 21];
        char c24 = cArr[i + 22];
        char c25 = cArr[i + 23];
        char c26 = cArr[i + 24];
        char c27 = cArr[i + 25];
        char c28 = cArr[i + 26];
        char c29 = cArr[i + 27];
        char c30 = cArr[i + 28];
        if (c6 != '-' || c9 != '-') {
            return null;
        }
        if ((c12 != ' ' && c12 != 'T') || c15 != ':' || c18 != ':' || c21 != '.') {
            return null;
        }
        return a(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, c29, c30);
    }

    public static com.alibaba.fastjson2.time.c p(byte[] bArr, int i) {
        if (i + 29 > bArr.length) {
            return null;
        }
        char c2 = (char) bArr[i];
        char c3 = (char) bArr[i + 1];
        char c4 = (char) bArr[i + 2];
        char c5 = (char) bArr[i + 3];
        char c6 = (char) bArr[i + 4];
        char c7 = (char) bArr[i + 5];
        char c8 = (char) bArr[i + 6];
        char c9 = (char) bArr[i + 7];
        char c10 = (char) bArr[i + 8];
        char c11 = (char) bArr[i + 9];
        char c12 = (char) bArr[i + 10];
        char c13 = (char) bArr[i + 11];
        char c14 = (char) bArr[i + 12];
        char c15 = (char) bArr[i + 13];
        char c16 = (char) bArr[i + 14];
        char c17 = (char) bArr[i + 15];
        char c18 = (char) bArr[i + 16];
        char c19 = (char) bArr[i + 17];
        char c20 = (char) bArr[i + 18];
        char c21 = (char) bArr[i + 19];
        char c22 = (char) bArr[i + 20];
        char c23 = (char) bArr[i + 21];
        char c24 = (char) bArr[i + 22];
        char c25 = (char) bArr[i + 23];
        char c26 = (char) bArr[i + 24];
        char c27 = (char) bArr[i + 25];
        char c28 = (char) bArr[i + 26];
        char c29 = (char) bArr[i + 27];
        char c30 = (char) bArr[i + 28];
        if (c6 != '-' || c9 != '-') {
            return null;
        }
        if ((c12 != ' ' && c12 != 'T') || c15 != ':' || c18 != ':' || c21 != '.') {
            return null;
        }
        return a(c2, c3, c4, c5, c7, c8, c10, c11, c13, c14, c16, c17, c19, c20, c22, c23, c24, c25, c26, c27, c28, c29, c30);
    }
}
