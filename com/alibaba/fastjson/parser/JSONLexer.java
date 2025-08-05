package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson2.util.c;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.image.d;
import com.taobao.tao.shop.common.ShopConstants;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import tb.fxb;
import tb.kge;

/* loaded from: classes.dex */
public final class JSONLexer {
    public static final char[] CA;
    public static final int END = 4;
    public static final char EOI = 26;
    static final int[] IA;
    public static final int NOT_MATCH = -1;
    public static final int NOT_MATCH_NAME = -2;
    public static final int UNKNOWN = 0;
    private static boolean V6 = false;
    public static final int VALUE = 3;
    protected static final int[] digits;
    public static final boolean[] firstIdentifierFlags;
    public static final boolean[] identifierFlags;
    private static final ThreadLocal<char[]> sbufLocal;
    protected int bp;
    public Calendar calendar;
    protected char ch;
    public boolean disableCircularReferenceDetect;
    protected int eofPos;
    protected boolean exp;
    public int features;
    protected long fieldHash;
    protected boolean hasSpecial;
    protected boolean isDouble;
    protected final int len;
    public Locale locale;
    public int matchStat;
    protected int np;
    protected int pos;
    protected char[] sbuf;
    protected int sp;
    protected String stringDefaultValue;
    protected final String text;
    public TimeZone timeZone;
    protected int token;

    static {
        int i;
        kge.a(399420030);
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
        } catch (Exception unused) {
            i = -1;
        }
        char c = 0;
        V6 = i >= 23;
        sbufLocal = new ThreadLocal<>();
        digits = new int[103];
        for (int i2 = 48; i2 <= 57; i2++) {
            digits[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            digits[i3] = (i3 - 97) + 10;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            digits[i4] = (i4 - 65) + 10;
        }
        CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        int[] iArr = new int[256];
        IA = iArr;
        Arrays.fill(iArr, -1);
        int length = CA.length;
        for (int i5 = 0; i5 < length; i5++) {
            IA[CA[i5]] = i5;
        }
        IA[61] = 0;
        firstIdentifierFlags = new boolean[256];
        char c2 = 0;
        while (true) {
            boolean[] zArr = firstIdentifierFlags;
            if (c2 >= zArr.length) {
                break;
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                zArr[c2] = true;
            } else if (c2 >= 'a' && c2 <= 'z') {
                firstIdentifierFlags[c2] = true;
            } else if (c2 == '_') {
                firstIdentifierFlags[c2] = true;
            }
            c2 = (char) (c2 + 1);
        }
        identifierFlags = new boolean[256];
        while (true) {
            boolean[] zArr2 = identifierFlags;
            if (c < zArr2.length) {
                if (c >= 'A' && c <= 'Z') {
                    zArr2[c] = true;
                } else if (c >= 'a' && c <= 'z') {
                    identifierFlags[c] = true;
                } else if (c == '_') {
                    identifierFlags[c] = true;
                } else if (c >= '0' && c <= '9') {
                    identifierFlags[c] = true;
                }
                c = (char) (c + 1);
            } else {
                return;
            }
        }
    }

    public JSONLexer(String str) {
        this(str, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONLexer(String str, int i) {
        this.features = JSON.DEFAULT_PARSER_FEATURE;
        boolean z = false;
        this.exp = false;
        this.isDouble = false;
        this.timeZone = JSON.defaultTimeZone;
        this.locale = JSON.defaultLocale;
        String str2 = null;
        this.calendar = null;
        this.matchStat = 0;
        this.sbuf = sbufLocal.get();
        if (this.sbuf == null) {
            this.sbuf = new char[512];
        }
        this.features = i;
        this.text = str;
        this.len = this.text.length();
        this.bp = -1;
        int i2 = this.bp + 1;
        this.bp = i2;
        this.ch = i2 >= this.len ? EOI : this.text.charAt(i2);
        if (this.ch == 65279) {
            next();
        }
        this.stringDefaultValue = (Feature.InitStringFieldAsEmpty.mask & i) != 0 ? "" : str2;
        this.disableCircularReferenceDetect = (Feature.DisableCircularReferenceDetect.mask & i) != 0 ? true : z;
    }

    public JSONLexer(char[] cArr, int i) {
        this(cArr, i, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONLexer(char[] cArr, int i, int i2) {
        this(new String(cArr, 0, i), i2);
    }

    static boolean checkDate(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        if (c >= '1' && c <= '3' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            if (c5 == '0') {
                if (c6 < '1' || c6 > '9') {
                    return false;
                }
            } else if (c5 != '1' || (c6 != '0' && c6 != '1' && c6 != '2')) {
                return false;
            }
            if (i == 48) {
                return i2 >= 49 && i2 <= 57;
            } else if (i != 49 && i != 50) {
                return i == 51 && (i2 == 48 || i2 == 49);
            } else if (i2 >= 48 && i2 <= 57) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001d, code lost:
        if (r5 <= '4') goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean checkTime(char r4, char r5, char r6, char r7, char r8, char r9) {
        /*
            r0 = 57
            r1 = 0
            r2 = 48
            if (r4 != r2) goto Lc
            if (r5 < r2) goto Lb
            if (r5 <= r0) goto L20
        Lb:
            return r1
        Lc:
            r3 = 49
            if (r4 != r3) goto L15
            if (r5 < r2) goto L14
            if (r5 <= r0) goto L20
        L14:
            return r1
        L15:
            r3 = 50
            if (r4 != r3) goto L42
            if (r5 < r2) goto L42
            r4 = 52
            if (r5 <= r4) goto L20
            goto L42
        L20:
            r4 = 53
            r5 = 54
            if (r6 < r2) goto L2d
            if (r6 > r4) goto L2d
            if (r7 < r2) goto L2c
            if (r7 <= r0) goto L32
        L2c:
            return r1
        L2d:
            if (r6 != r5) goto L42
            if (r7 == r2) goto L32
            return r1
        L32:
            if (r8 < r2) goto L3b
            if (r8 > r4) goto L3b
            if (r9 < r2) goto L3a
            if (r9 <= r0) goto L40
        L3a:
            return r1
        L3b:
            if (r8 != r5) goto L42
            if (r9 == r2) goto L40
            return r1
        L40:
            r4 = 1
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.checkTime(char, char, char, char, char, char):boolean");
    }

    public static final byte[] decodeFast(String str, int i, int i2) {
        int i3;
        int i4 = 0;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        while (i < i5 && IA[str.charAt(i)] < 0) {
            i++;
        }
        while (i5 > 0 && IA[str.charAt(i5)] < 0) {
            i5--;
        }
        int i6 = str.charAt(i5) == '=' ? str.charAt(i5 + (-1)) == '=' ? 2 : 1 : 0;
        int i7 = (i5 - i) + 1;
        if (i2 > 76) {
            i3 = (str.charAt(76) == '\r' ? i7 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i8 = (((i7 - i3) * 6) >> 3) - i6;
        byte[] bArr = new byte[i8];
        int i9 = (i8 / 3) * 3;
        int i10 = i;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            int i13 = i10 + 1;
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int i17 = (IA[str.charAt(i10)] << 18) | (IA[str.charAt(i13)] << 12) | (IA[str.charAt(i14)] << 6) | IA[str.charAt(i15)];
            int i18 = i11 + 1;
            bArr[i11] = (byte) (i17 >> 16);
            int i19 = i18 + 1;
            bArr[i18] = (byte) (i17 >> 8);
            int i20 = i19 + 1;
            bArr[i19] = (byte) i17;
            if (i3 <= 0 || (i12 = i12 + 1) != 19) {
                i10 = i16;
            } else {
                i10 = i16 + 2;
                i12 = 0;
            }
            i11 = i20;
        }
        if (i11 < i8) {
            int i21 = 0;
            while (i10 <= i5 - i6) {
                i4 |= IA[str.charAt(i10)] << (18 - (i21 * 6));
                i21++;
                i10++;
            }
            int i22 = 16;
            while (i11 < i8) {
                bArr[i11] = (byte) (i4 >> i22);
                i22 -= 8;
                i11++;
            }
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int matchFieldHash(long r17) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.matchFieldHash(long):int");
    }

    private static String readString(char[] cArr, int i) {
        int i2;
        char[] cArr2 = new char[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            char c = cArr[i3];
            if (c != '\\') {
                cArr2[i4] = c;
                i4++;
            } else {
                i3++;
                char c2 = cArr[i3];
                if (c2 == '\"') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\"';
                } else if (c2 != '\'') {
                    if (c2 != 'F') {
                        if (c2 == '\\') {
                            i2 = i4 + 1;
                            cArr2[i4] = '\\';
                        } else if (c2 == 'b') {
                            i2 = i4 + 1;
                            cArr2[i4] = '\b';
                        } else if (c2 != 'f') {
                            if (c2 == 'n') {
                                i2 = i4 + 1;
                                cArr2[i4] = '\n';
                            } else if (c2 == 'r') {
                                i2 = i4 + 1;
                                cArr2[i4] = '\r';
                            } else if (c2 != 'x') {
                                switch (c2) {
                                    case '/':
                                        i2 = i4 + 1;
                                        cArr2[i4] = fxb.DIR;
                                        break;
                                    case '0':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 0;
                                        break;
                                    case '1':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 1;
                                        break;
                                    case '2':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 2;
                                        break;
                                    case '3':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 3;
                                        break;
                                    case '4':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 4;
                                        break;
                                    case '5':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 5;
                                        break;
                                    case '6':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 6;
                                        break;
                                    case '7':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 7;
                                        break;
                                    default:
                                        switch (c2) {
                                            case 't':
                                                i2 = i4 + 1;
                                                cArr2[i4] = '\t';
                                                break;
                                            case 'u':
                                                i2 = i4 + 1;
                                                int i5 = i3 + 1;
                                                int i6 = i5 + 1;
                                                int i7 = i6 + 1;
                                                i3 = i7 + 1;
                                                cArr2[i4] = (char) Integer.parseInt(new String(new char[]{cArr[i5], cArr[i6], cArr[i7], cArr[i3]}), 16);
                                                break;
                                            case 'v':
                                                i2 = i4 + 1;
                                                cArr2[i4] = 11;
                                                break;
                                            default:
                                                throw new JSONException("unclosed.str.lit");
                                        }
                                }
                            } else {
                                i2 = i4 + 1;
                                int[] iArr = digits;
                                int i8 = i3 + 1;
                                i3 = i8 + 1;
                                cArr2[i4] = (char) ((iArr[cArr[i8]] << 4) + iArr[cArr[i3]]);
                            }
                        }
                    }
                    i2 = i4 + 1;
                    cArr2[i4] = '\f';
                } else {
                    i2 = i4 + 1;
                    cArr2[i4] = '\'';
                }
                i4 = i2;
            }
            i3++;
        }
        return new String(cArr2, 0, i4);
    }

    private void scanIdent() {
        this.np = this.bp - 1;
        this.hasSpecial = false;
        do {
            this.sp++;
            next();
        } while (Character.isLetterOrDigit(this.ch));
        String stringVal = stringVal();
        this.token = stringVal.equals("null") ? 8 : stringVal.equals("true") ? 6 : stringVal.equals("false") ? 7 : stringVal.equals("new") ? 9 : stringVal.equals("undefined") ? 23 : stringVal.equals(a.ATOM_Set) ? 21 : stringVal.equals("TreeSet") ? 22 : 18;
    }

    private void setCalendar(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        this.calendar = Calendar.getInstance(this.timeZone, this.locale);
        this.calendar.set(1, ((c - '0') * 1000) + ((c2 - '0') * 100) + ((c3 - '0') * 10) + (c4 - '0'));
        this.calendar.set(2, (((c5 - '0') * 10) + (c6 - '0')) - 1);
        this.calendar.set(5, ((c7 - '0') * 10) + (c8 - '0'));
    }

    private final String subString(int i, int i2) {
        char[] cArr = this.sbuf;
        if (i2 < cArr.length) {
            this.text.getChars(i, i + i2, cArr, 0);
            return new String(this.sbuf, 0, i2);
        }
        char[] cArr2 = new char[i2];
        this.text.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    public byte[] bytesValue() {
        return decodeFast(this.text, this.np + 1, this.sp);
    }

    protected char charAt(int i) {
        return i >= this.len ? EOI : this.text.charAt(i);
    }

    public void close() {
        char[] cArr = this.sbuf;
        if (cArr.length <= 8196) {
            sbufLocal.set(cArr);
        }
        this.sbuf = null;
    }

    public final void config(Feature feature, boolean z) {
        this.features = z ? this.features | feature.mask : this.features & (~feature.mask);
        if (feature == Feature.InitStringFieldAsEmpty) {
            this.stringDefaultValue = z ? "" : null;
        }
        this.disableCircularReferenceDetect = (this.features & Feature.DisableCircularReferenceDetect.mask) != 0;
    }

    public final Number decimalValue(boolean z) {
        char[] cArr;
        boolean z2;
        int i = (this.np + this.sp) - 1;
        char charAt = i >= this.len ? EOI : this.text.charAt(i);
        try {
            if (charAt == 'F') {
                return Float.valueOf(Float.parseFloat(numberString()));
            }
            if (charAt == 'D') {
                return Double.valueOf(Double.parseDouble(numberString()));
            }
            if (z) {
                return decimalValue();
            }
            char charAt2 = this.text.charAt((this.np + this.sp) - 1);
            int i2 = this.sp;
            if (charAt2 == 'L' || charAt2 == 'S' || charAt2 == 'B' || charAt2 == 'F' || charAt2 == 'D') {
                i2--;
            }
            int i3 = this.np;
            int i4 = 0;
            if (i2 < this.sbuf.length) {
                this.text.getChars(i3, i3 + i2, this.sbuf, 0);
                cArr = this.sbuf;
            } else {
                char[] cArr2 = new char[i2];
                this.text.getChars(i3, i3 + i2, cArr2, 0);
                cArr = cArr2;
            }
            if (i2 > 9 || this.exp) {
                return Double.valueOf(Double.parseDouble(new String(cArr, 0, i2)));
            }
            char c = cArr[0];
            int i5 = 2;
            if (c == '-') {
                c = cArr[1];
                z2 = true;
            } else if (c == '+') {
                c = cArr[1];
                z2 = false;
            } else {
                z2 = false;
                i5 = 1;
            }
            int i6 = c - '0';
            while (i5 < i2) {
                char c2 = cArr[i5];
                if (c2 == '.') {
                    i4 = 1;
                } else {
                    i6 = (i6 * 10) + (c2 - '0');
                    if (i4 != 0) {
                        i4 *= 10;
                    }
                }
                i5++;
            }
            double d = i6 / i4;
            if (z2) {
                d = -d;
            }
            return Double.valueOf(d);
        } catch (NumberFormatException e) {
            throw new JSONException(e.getMessage() + ", " + info());
        }
    }

    public final BigDecimal decimalValue() {
        char charAt = this.text.charAt((this.np + this.sp) - 1);
        int i = this.sp;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        int i2 = this.np;
        char[] cArr = this.sbuf;
        if (i < cArr.length) {
            this.text.getChars(i2, i2 + i, cArr, 0);
            return new BigDecimal(this.sbuf, 0, i);
        }
        char[] cArr2 = new char[i];
        this.text.getChars(i2, i + i2, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("pos ");
        sb.append(this.bp);
        sb.append(", json : ");
        sb.append(this.len < 65536 ? this.text : this.text.substring(0, 65536));
        return sb.toString();
    }

    public final int intValue() {
        boolean z;
        int i;
        int i2 = this.np;
        int i3 = this.sp + i2;
        int i4 = 0;
        if ((i2 >= this.len ? EOI : this.text.charAt(i2)) == '-') {
            i2++;
            z = true;
            i = Integer.MIN_VALUE;
        } else {
            z = false;
            i = -2147483647;
        }
        if (i2 < i3) {
            i4 = -((i2 >= this.len ? EOI : this.text.charAt(i2)) - '0');
            i2++;
        }
        while (i2 < i3) {
            int i5 = i2 + 1;
            char charAt = i2 >= this.len ? EOI : this.text.charAt(i2);
            if (charAt == 'L' || charAt == 'S' || charAt == 'B') {
                i2 = i5;
                break;
            }
            int i6 = charAt - '0';
            if (i4 < -214748364) {
                throw new NumberFormatException(numberString());
            }
            int i7 = i4 * 10;
            if (i7 < i + i6) {
                throw new NumberFormatException(numberString());
            }
            i4 = i7 - i6;
            i2 = i5;
        }
        if (z) {
            if (i2 <= this.np + 1) {
                throw new NumberFormatException(numberString());
            }
            return i4;
        }
        return -i4;
    }

    public final Number integerValue() throws NumberFormatException {
        char c;
        long j;
        boolean z;
        long j2;
        int i = this.np;
        int i2 = this.sp + i;
        int i3 = i2 - 1;
        char charAt = i3 >= this.len ? EOI : this.text.charAt(i3);
        if (charAt == 'B') {
            i2--;
            c = 'B';
        } else if (charAt == 'L') {
            i2--;
            c = d.LEVEL_L;
        } else if (charAt != 'S') {
            c = ' ';
        } else {
            i2--;
            c = 'S';
        }
        int i4 = this.np;
        if ((i4 >= this.len ? EOI : this.text.charAt(i4)) == '-') {
            j = Long.MIN_VALUE;
            i++;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        if (i < i2) {
            j2 = -((i >= this.len ? EOI : this.text.charAt(i)) - '0');
            i++;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i5 = i + 1;
            int charAt2 = (i >= this.len ? EOI : this.text.charAt(i)) - '0';
            if (j2 < -922337203685477580L) {
                return new BigInteger(numberString());
            }
            long j3 = j2 * 10;
            long j4 = charAt2;
            if (j3 < j + j4) {
                return new BigInteger(numberString());
            }
            j2 = j3 - j4;
            i = i5;
        }
        if (!z) {
            long j5 = -j2;
            return (j5 > 2147483647L || c == 'L') ? Long.valueOf(j5) : c == 'S' ? Short.valueOf((short) j5) : c == 'B' ? Byte.valueOf((byte) j5) : Integer.valueOf((int) j5);
        } else if (i <= this.np + 1) {
            throw new NumberFormatException(numberString());
        } else {
            return (j2 < -2147483648L || c == 'L') ? Long.valueOf(j2) : c == 'S' ? Short.valueOf((short) j2) : c == 'B' ? Byte.valueOf((byte) j2) : Integer.valueOf((int) j2);
        }
    }

    public final boolean isBlankInput() {
        int i = 0;
        while (true) {
            char charAt = charAt(i);
            boolean z = true;
            if (charAt != 26) {
                if (charAt > ' ' || (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t' && charAt != '\f' && charAt != '\b')) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                i++;
            } else {
                return true;
            }
        }
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.mask & this.features) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005d -> B:8:0x0026). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long longValue() throws java.lang.NumberFormatException {
        /*
            r13 = this;
            int r0 = r13.np
            int r1 = r13.sp
            int r1 = r1 + r0
            char r2 = r13.charAt(r0)
            r3 = 1
            r4 = 45
            if (r2 != r4) goto L14
            r4 = -9223372036854775808
            int r0 = r0 + 1
            r2 = 1
            goto L1a
        L14:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 0
        L1a:
            if (r0 >= r1) goto L28
            int r6 = r0 + 1
            char r0 = r13.charAt(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            long r7 = (long) r0
        L26:
            r0 = r6
            goto L2a
        L28:
            r7 = 0
        L2a:
            if (r0 >= r1) goto L74
            int r6 = r0 + 1
            int r9 = r13.len
            if (r0 < r9) goto L35
            r0 = 26
            goto L3b
        L35:
            java.lang.String r9 = r13.text
            char r0 = r9.charAt(r0)
        L3b:
            r9 = 76
            if (r0 == r9) goto L73
            r9 = 83
            if (r0 == r9) goto L73
            r9 = 66
            if (r0 == r9) goto L73
            int r0 = r0 + (-48)
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L69
            r9 = 10
            long r7 = r7 * r9
            long r9 = (long) r0
            long r11 = r4 + r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L5f
            long r7 = r7 - r9
            goto L26
        L5f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L73:
            r0 = r6
        L74:
            if (r2 == 0) goto L86
            int r1 = r13.np
            int r1 = r1 + r3
            if (r0 <= r1) goto L7c
            return r7
        L7c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L86:
            long r0 = -r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.longValue():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean matchField(long r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.matchField(long):boolean");
    }

    public char next() {
        int i = this.bp + 1;
        this.bp = i;
        char charAt = i >= this.len ? EOI : this.text.charAt(i);
        this.ch = charAt;
        return charAt;
    }

    public final void nextIdent() {
        while (true) {
            char c = this.ch;
            if (!(c <= ' ' && (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b'))) {
                break;
            }
            next();
        }
        char c2 = this.ch;
        if (c2 == '_' || Character.isLetter(c2)) {
            scanIdent();
        } else {
            nextToken();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        scanNumber();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x010b, code lost:
        scanIdent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010e, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nextToken() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.nextToken():void");
    }

    public final void nextToken(int i) {
        this.sp = 0;
        while (true) {
            if (i != 2) {
                char c = EOI;
                if (i == 4) {
                    char c2 = this.ch;
                    if (c2 == '\"') {
                        this.pos = this.bp;
                        scanString();
                        return;
                    } else if (c2 >= '0' && c2 <= '9') {
                        this.pos = this.bp;
                        scanNumber();
                        return;
                    } else if (this.ch == '{') {
                        this.token = 12;
                        int i2 = this.bp + 1;
                        this.bp = i2;
                        if (i2 < this.len) {
                            c = this.text.charAt(i2);
                        }
                        this.ch = c;
                        return;
                    }
                } else if (i == 12) {
                    char c3 = this.ch;
                    if (c3 == '{') {
                        this.token = 12;
                        int i3 = this.bp + 1;
                        this.bp = i3;
                        if (i3 < this.len) {
                            c = this.text.charAt(i3);
                        }
                        this.ch = c;
                        return;
                    } else if (c3 == '[') {
                        this.token = 14;
                        int i4 = this.bp + 1;
                        this.bp = i4;
                        if (i4 < this.len) {
                            c = this.text.charAt(i4);
                        }
                        this.ch = c;
                        return;
                    }
                } else if (i == 18) {
                    nextIdent();
                    return;
                } else {
                    if (i != 20) {
                        switch (i) {
                            case 14:
                                char c4 = this.ch;
                                if (c4 == '[') {
                                    this.token = 14;
                                    next();
                                    return;
                                } else if (c4 == '{') {
                                    this.token = 12;
                                    next();
                                    return;
                                }
                                break;
                            case 15:
                                if (this.ch == ']') {
                                    this.token = 15;
                                    next();
                                    return;
                                }
                                break;
                            case 16:
                                char c5 = this.ch;
                                if (c5 == ',') {
                                    this.token = 16;
                                    int i5 = this.bp + 1;
                                    this.bp = i5;
                                    if (i5 < this.len) {
                                        c = this.text.charAt(i5);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == '}') {
                                    this.token = 13;
                                    int i6 = this.bp + 1;
                                    this.bp = i6;
                                    if (i6 < this.len) {
                                        c = this.text.charAt(i6);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == ']') {
                                    this.token = 15;
                                    int i7 = this.bp + 1;
                                    this.bp = i7;
                                    if (i7 < this.len) {
                                        c = this.text.charAt(i7);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == 26) {
                                    this.token = 20;
                                    return;
                                }
                                break;
                        }
                    }
                    if (this.ch == 26) {
                        this.token = 20;
                        return;
                    }
                }
            } else {
                char c6 = this.ch;
                if (c6 >= '0' && c6 <= '9') {
                    this.pos = this.bp;
                    scanNumber();
                    return;
                }
                char c7 = this.ch;
                if (c7 == '\"') {
                    this.pos = this.bp;
                    scanString();
                    return;
                } else if (c7 == '[') {
                    this.token = 14;
                    next();
                    return;
                } else if (c7 == '{') {
                    this.token = 12;
                    next();
                    return;
                }
            }
            char c8 = this.ch;
            if (c8 != ' ' && c8 != '\n' && c8 != '\r' && c8 != '\t' && c8 != '\f' && c8 != '\b') {
                nextToken();
                return;
            }
            next();
        }
    }

    public final void nextTokenWithChar(char c) {
        this.sp = 0;
        while (true) {
            char c2 = this.ch;
            if (c2 == c) {
                int i = this.bp + 1;
                this.bp = i;
                this.ch = i >= this.len ? EOI : this.text.charAt(i);
                nextToken();
                return;
            } else if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != '\f' && c2 != '\b') {
                throw new JSONException("not match " + c + " - " + this.ch);
            } else {
                next();
            }
        }
    }

    public final String numberString() {
        char charAt = this.text.charAt((this.np + this.sp) - 1);
        int i = this.sp;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        return subString(this.np, i);
    }

    public boolean scanBoolean() {
        boolean z = false;
        int i = 1;
        if (this.text.startsWith("false", this.bp)) {
            i = 5;
        } else if (this.text.startsWith("true", this.bp)) {
            z = true;
            i = 4;
        } else {
            char c = this.ch;
            if (c == '1') {
                z = true;
            } else if (c != '0') {
                this.matchStat = -1;
                return false;
            }
        }
        this.bp += i;
        this.ch = charAt(this.bp);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
        if (r13 >= r12.len) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0114, code lost:
        r7 = r12.text.charAt(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
        if (r13 >= r12.len) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0146, code lost:
        if (r13 >= r12.len) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean scanFieldBoolean(long r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldBoolean(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0108, code lost:
        if (r14 >= r13.len) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010b, code lost:
        r5 = r13.text.charAt(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012b, code lost:
        if (r14 >= r13.len) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0143, code lost:
        if (r14 >= r13.len) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Date scanFieldDate(long r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldDate(long):java.util.Date");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00b7 -> B:53:0x00b8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double scanFieldDouble(long r18) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldDouble(long):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x01f9, code lost:
        r2 = r3;
        r18.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01fc, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
        r18.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0107, code lost:
        if (r3 >= r18.len) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0109, code lost:
        r3 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010c, code lost:
        r3 = r18.text.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0112, code lost:
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0120, code lost:
        if (r3 >= r18.len) goto L72;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0112 -> B:85:0x0114). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double[] scanFieldDoubleArray(long r19) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldDoubleArray(long):double[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0194, code lost:
        r11 = r10 + 1;
        r1 = r19.bp + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x019b, code lost:
        if (r1 < r19.len) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x019d, code lost:
        r1 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a0, code lost:
        r1 = r19.text.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a7, code lost:
        if (r4 == r9.length) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a9, code lost:
        r10 = new double[r4];
        r12 = 0;
        java.lang.System.arraycopy(r9, 0, r10, 0, r4);
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01b1, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b3, code lost:
        if (r8 < r5.length) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b5, code lost:
        r5 = new double[(r5.length * 3) / 2];
        java.lang.System.arraycopy(r9, r12, r5, r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01bf, code lost:
        r4 = r8 + 1;
        r5[r8] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01c3, code lost:
        if (r1 != ',') goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c5, code lost:
        r2 = r11 + 1;
        r1 = r19.bp + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01cc, code lost:
        if (r1 >= r19.len) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ce, code lost:
        r19.text.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01d3, code lost:
        r8 = r4;
        r3 = null;
        r4 = r2;
        r2 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01db, code lost:
        if (r1 != ']') goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01dd, code lost:
        r8 = r11 + 1;
        r1 = r19.bp + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e4, code lost:
        if (r1 < r19.len) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e6, code lost:
        r1 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01e9, code lost:
        r1 = r19.text.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f0, code lost:
        if (r4 == r5.length) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01f2, code lost:
        r9 = new double[r4];
        java.lang.System.arraycopy(r5, 0, r9, 0, r4);
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01f9, code lost:
        if (r1 != ',') goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01fb, code lost:
        r19.bp += r8 - 1;
        next();
        r19.matchStat = 3;
        r19.token = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020b, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0210, code lost:
        if (r1 != '}') goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0212, code lost:
        r9 = r8 + 1;
        r1 = charAt(r19.bp + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x021b, code lost:
        if (r1 != ',') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021d, code lost:
        r19.token = 16;
        r1 = r19.bp;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0222, code lost:
        r19.bp = r1 + (r9 - r2);
        next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x022a, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x022b, code lost:
        if (r1 != ']') goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x022d, code lost:
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x022f, code lost:
        r19.token = r1;
        r1 = r19.bp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0234, code lost:
        if (r1 != '}') goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0236, code lost:
        r1 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x023b, code lost:
        if (r1 != 26) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x023d, code lost:
        r19.bp += r9 - 1;
        r19.token = 20;
        r19.ch = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0249, code lost:
        r19.matchStat = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x024c, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x024d, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0253, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0254, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x025a, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x025b, code lost:
        r8 = r4;
        r4 = r11;
        r2 = 16;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x026b, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0271, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double[][] scanFieldDoubleArray2(long r20) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldDoubleArray2(long):double[][]");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ad -> B:51:0x00b2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float scanFieldFloat(long r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldFloat(long):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x01f9, code lost:
        r5 = r3;
        r18.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01fc, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
        r18.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d3, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0107, code lost:
        if (r3 >= r18.len) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0109, code lost:
        r3 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x010c, code lost:
        r3 = r18.text.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0112, code lost:
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0120, code lost:
        if (r3 >= r18.len) goto L72;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0112 -> B:85:0x0114). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[] scanFieldFloatArray(long r19) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldFloatArray(long):float[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x018f, code lost:
        r11 = r10 + 1;
        r1 = r19.bp + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0196, code lost:
        if (r1 < r19.len) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0198, code lost:
        r1 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x019b, code lost:
        r1 = r19.text.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01a2, code lost:
        if (r3 == r9.length) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a4, code lost:
        r10 = new float[r3];
        r12 = 0;
        java.lang.System.arraycopy(r9, 0, r10, 0, r3);
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01ac, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ae, code lost:
        if (r8 < r5.length) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b0, code lost:
        r5 = new float[(r5.length * 3) / 2];
        java.lang.System.arraycopy(r9, r12, r5, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01ba, code lost:
        r3 = r8 + 1;
        r5[r8] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01be, code lost:
        if (r1 != ',') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c0, code lost:
        r4 = r11 + 1;
        r1 = r19.bp + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c7, code lost:
        if (r1 >= r19.len) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c9, code lost:
        r19.text.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ce, code lost:
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01d1, code lost:
        if (r1 != ']') goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d3, code lost:
        r8 = r11 + 1;
        r1 = r19.bp + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01da, code lost:
        if (r1 < r19.len) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01dc, code lost:
        r1 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01df, code lost:
        r1 = r19.text.charAt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e6, code lost:
        if (r3 == r5.length) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01e8, code lost:
        r9 = new float[r3];
        java.lang.System.arraycopy(r5, 0, r9, 0, r3);
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ef, code lost:
        if (r1 != ',') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01f1, code lost:
        r19.bp += r8 - 1;
        next();
        r19.matchStat = 3;
        r19.token = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0201, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0206, code lost:
        if (r1 != '}') goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0208, code lost:
        r9 = r8 + 1;
        r1 = charAt(r19.bp + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0211, code lost:
        if (r1 != ',') goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0213, code lost:
        r19.token = 16;
        r1 = r19.bp;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0218, code lost:
        r19.bp = r1 + (r9 - r2);
        next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0220, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0221, code lost:
        if (r1 != ']') goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0223, code lost:
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0225, code lost:
        r19.token = r1;
        r1 = r19.bp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022a, code lost:
        if (r1 != '}') goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x022c, code lost:
        r1 = 13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0231, code lost:
        if (r1 != 26) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0233, code lost:
        r19.bp += r9 - 1;
        r19.token = 20;
        r19.ch = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023f, code lost:
        r19.matchStat = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0242, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0243, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0249, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x024a, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0250, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0251, code lost:
        r8 = r3;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0261, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0267, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e2, code lost:
        r19.matchStat = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float[][] scanFieldFloatArray2(long r20) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldFloatArray2(long):float[][]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x014f, code lost:
        if (r13 >= r11.len) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x011a, code lost:
        if (r13 >= r11.len) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011d, code lost:
        r2 = r11.text.charAt(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013b, code lost:
        if (r13 >= r11.len) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int scanFieldInt(long r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldInt(long):int");
    }

    public final int[] scanFieldIntArray(long j) {
        int[] iArr;
        int i;
        boolean z;
        int[] iArr2;
        int i2;
        int i3;
        char charAt;
        int i4;
        int i5;
        char charAt2;
        int i6;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        int[] iArr3 = null;
        if (matchFieldHash == 0) {
            return null;
        }
        int i7 = matchFieldHash + 1;
        int i8 = this.bp + matchFieldHash;
        if ((i8 >= this.len ? EOI : this.text.charAt(i8)) != '[') {
            this.matchStat = -1;
            return null;
        }
        int i9 = i7 + 1;
        int i10 = this.bp + i7;
        char charAt3 = i10 >= this.len ? EOI : this.text.charAt(i10);
        int[] iArr4 = new int[16];
        if (charAt3 != ']') {
            iArr = iArr4;
            int i11 = 0;
            while (true) {
                if (charAt3 == '-') {
                    i = i9 + 1;
                    int i12 = this.bp + i9;
                    charAt3 = i12 >= this.len ? EOI : this.text.charAt(i12);
                    z = true;
                } else {
                    i = i9;
                    z = false;
                }
                if (charAt3 < '0') {
                    iArr2 = iArr3;
                    i2 = -1;
                    break;
                } else if (charAt3 > '9') {
                    i2 = -1;
                    iArr2 = null;
                    break;
                } else {
                    int i13 = charAt3 - '0';
                    while (true) {
                        i3 = i + 1;
                        int i14 = this.bp + i;
                        charAt = i14 >= this.len ? EOI : this.text.charAt(i14);
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i13 = (i13 * 10) + (charAt - '0');
                        i = i3;
                    }
                    if (i11 >= iArr.length) {
                        int[] iArr5 = new int[(iArr.length * 3) / 2];
                        System.arraycopy(iArr, 0, iArr5, 0, i11);
                        iArr = iArr5;
                    }
                    i4 = i11 + 1;
                    if (z) {
                        i13 = -i13;
                    }
                    iArr[i11] = i13;
                    if (charAt == ',') {
                        i9 = i3 + 1;
                        int i15 = this.bp + i3;
                        charAt3 = i15 >= this.len ? EOI : this.text.charAt(i15);
                        i11 = i4;
                    } else if (charAt == ']') {
                        i5 = i3 + 1;
                        int i16 = this.bp + i3;
                        charAt2 = i16 >= this.len ? EOI : this.text.charAt(i16);
                    } else {
                        i11 = i4;
                        charAt3 = charAt;
                        i9 = i3;
                    }
                    iArr3 = null;
                }
            }
            this.matchStat = i2;
            return iArr2;
        }
        int i17 = i9 + 1;
        int i18 = this.bp + i9;
        charAt2 = i18 >= this.len ? EOI : this.text.charAt(i18);
        i5 = i17;
        i4 = 0;
        iArr = iArr4;
        if (i4 != iArr.length) {
            int[] iArr6 = new int[i4];
            System.arraycopy(iArr, 0, iArr6, 0, i4);
            iArr = iArr6;
        }
        if (charAt2 == ',') {
            this.bp += i5 - 1;
            next();
            this.matchStat = 3;
            this.token = 16;
            return iArr;
        } else if (charAt2 != '}') {
            this.matchStat = -1;
            return null;
        } else {
            int i19 = i5 + 1;
            char charAt4 = charAt(this.bp + i5);
            if (charAt4 == ',') {
                this.token = 16;
            } else {
                if (charAt4 == ']') {
                    i6 = 15;
                } else if (charAt4 != '}') {
                    if (charAt4 != 26) {
                        this.matchStat = -1;
                        return null;
                    }
                    this.bp += i19 - 1;
                    this.token = 20;
                    this.ch = EOI;
                    this.matchStat = 4;
                    return iArr;
                } else {
                    i6 = 13;
                }
                this.token = i6;
            }
            this.bp += i19 - 1;
            next();
            this.matchStat = 4;
            return iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f4, code lost:
        if (r2 >= r18.len) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f6, code lost:
        r7 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f9, code lost:
        r7 = r18.text.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0118, code lost:
        if (r2 >= r18.len) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012f, code lost:
        if (r2 >= r18.len) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long scanFieldLong(long r19) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldLong(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r2.indexOf(92) != (-1)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String scanFieldString(long r11) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldString(long):java.lang.String");
    }

    public long scanFieldSymbol(long j) {
        int i;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0L;
        }
        int i2 = matchFieldHash + 1;
        int i3 = this.bp + matchFieldHash;
        int i4 = this.len;
        char c = EOI;
        if ((i3 >= i4 ? EOI : this.text.charAt(i3)) != '\"') {
            this.matchStat = -1;
            return 0L;
        }
        long j2 = c.MAGIC_HASH_CODE;
        while (true) {
            int i5 = i2 + 1;
            int i6 = this.bp + i2;
            char charAt = i6 >= this.len ? EOI : this.text.charAt(i6);
            if (charAt == '\"') {
                int i7 = i5 + 1;
                int i8 = this.bp + i5;
                char charAt2 = i8 >= this.len ? EOI : this.text.charAt(i8);
                if (charAt2 == ',') {
                    this.bp += i7 - 1;
                    int i9 = this.bp + 1;
                    this.bp = i9;
                    if (i9 < this.len) {
                        c = this.text.charAt(i9);
                    }
                    this.ch = c;
                    this.matchStat = 3;
                    return j2;
                } else if (charAt2 != '}') {
                    this.matchStat = -1;
                    return 0L;
                } else {
                    int i10 = i7 + 1;
                    int i11 = this.bp + i7;
                    char charAt3 = i11 >= this.len ? EOI : this.text.charAt(i11);
                    if (charAt3 == ',') {
                        i = 16;
                    } else if (charAt3 == ']') {
                        i = 15;
                    } else if (charAt3 != '}') {
                        if (charAt3 != 26) {
                            this.matchStat = -1;
                            return 0L;
                        }
                        this.token = 20;
                        this.bp += i10 - 1;
                        this.ch = EOI;
                        this.matchStat = 4;
                        return j2;
                    } else {
                        i = 13;
                    }
                    this.token = i;
                    this.bp += i10 - 1;
                    next();
                    this.matchStat = 4;
                    return j2;
                }
            }
            j2 = (j2 ^ charAt) * c.MAGIC_PRIME;
            if (charAt == '\\') {
                this.matchStat = -1;
                return 0L;
            }
            i2 = i5;
        }
    }

    public boolean scanISO8601DateIfMatch(boolean z) {
        return scanISO8601DateIfMatch(z, this.len - this.bp);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0224 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean scanISO8601DateIfMatch(boolean r36, int r37) {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanISO8601DateIfMatch(boolean, int):boolean");
    }

    public final long scanLongValue() {
        long j;
        boolean z;
        this.np = 0;
        if (this.ch == '-') {
            j = Long.MIN_VALUE;
            this.np++;
            int i = this.bp + 1;
            this.bp = i;
            if (i >= this.len) {
                throw new JSONException("syntax error, " + info());
            }
            this.ch = this.text.charAt(i);
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        long j2 = 0;
        while (true) {
            char c = this.ch;
            if (c < '0' || c > '9') {
                break;
            }
            int i2 = c - '0';
            if (j2 < -922337203685477580L) {
                throw new JSONException("error long value, " + j2 + ", " + info());
            }
            long j3 = j2 * 10;
            long j4 = i2;
            if (j3 < j + j4) {
                throw new JSONException("error long value, " + j3 + ", " + info());
            }
            j2 = j3 - j4;
            this.np++;
            int i3 = this.bp + 1;
            this.bp = i3;
            this.ch = i3 >= this.len ? EOI : this.text.charAt(i3);
        }
        return !z ? -j2 : j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r0 >= r9.len) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e7, code lost:
        if (r0 >= r9.len) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e9, code lost:
        r0 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r0 >= r9.len) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ec, code lost:
        r0 = r9.text.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f2, code lost:
        r9.ch = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
        if (r0 >= r9.len) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0025, code lost:
        r9.ch = r9.text.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        r9.ch = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:6:0x001c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00ec -> B:61:0x00f2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0106 -> B:59:0x00e9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void scanNumber() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanNumber():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x014a, code lost:
        if (r2 >= r17.len) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
        r2 = com.alibaba.fastjson.parser.JSONLexer.EOI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
        r2 = r17.text.charAt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0155, code lost:
        r17.ch = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0169, code lost:
        if (r2 >= r17.len) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0205 A[Catch: NumberFormatException -> 0x024b, TryCatch #0 {NumberFormatException -> 0x024b, blocks: (B:114:0x01f3, B:120:0x0201, B:122:0x0205, B:128:0x0216, B:125:0x020d, B:127:0x0214, B:131:0x021d, B:134:0x0223, B:136:0x0228, B:139:0x022e, B:119:0x01fc, B:141:0x0233, B:143:0x023d, B:144:0x0242), top: B:149:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021d A[Catch: NumberFormatException -> 0x024b, TryCatch #0 {NumberFormatException -> 0x024b, blocks: (B:114:0x01f3, B:120:0x0201, B:122:0x0205, B:128:0x0216, B:125:0x020d, B:127:0x0214, B:131:0x021d, B:134:0x0223, B:136:0x0228, B:139:0x022e, B:119:0x01fc, B:141:0x0233, B:143:0x023d, B:144:0x0242), top: B:149:0x01ef }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0228 A[Catch: NumberFormatException -> 0x024b, TryCatch #0 {NumberFormatException -> 0x024b, blocks: (B:114:0x01f3, B:120:0x0201, B:122:0x0205, B:128:0x0216, B:125:0x020d, B:127:0x0214, B:131:0x021d, B:134:0x0223, B:136:0x0228, B:139:0x022e, B:119:0x01fc, B:141:0x0233, B:143:0x023d, B:144:0x0242), top: B:149:0x01ef }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0102 -> B:45:0x00e5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x014f -> B:73:0x0155). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0169 -> B:71:0x014c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number scanNumberValue() {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanNumberValue():java.lang.Number");
    }

    public final void scanString() {
        char c = this.ch;
        int i = this.bp + 1;
        int indexOf = this.text.indexOf(c, i);
        if (indexOf == -1) {
            throw new JSONException("unclosed str, " + info());
        }
        int i2 = indexOf - i;
        char[] sub_chars = sub_chars(this.bp + 1, i2);
        boolean z = false;
        while (i2 > 0 && sub_chars[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && sub_chars[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int indexOf2 = this.text.indexOf(c, indexOf + 1);
            int i5 = (indexOf2 - indexOf) + i2;
            if (i5 >= sub_chars.length) {
                int length = (sub_chars.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(sub_chars, 0, cArr, 0, sub_chars.length);
                sub_chars = cArr;
            }
            this.text.getChars(indexOf, indexOf2, sub_chars, i2);
            indexOf = indexOf2;
            i2 = i5;
            z = true;
        }
        if (!z) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (sub_chars[i6] == '\\') {
                    z = true;
                }
            }
        }
        this.sbuf = sub_chars;
        this.sp = i2;
        this.np = this.bp;
        this.hasSpecial = z;
        this.bp = indexOf + 1;
        int i7 = this.bp;
        this.ch = i7 >= this.len ? EOI : this.text.charAt(i7);
        this.token = 4;
    }

    public String scanStringValue(char c) {
        String str;
        int i = this.bp + 1;
        int indexOf = this.text.indexOf(c, i);
        if (indexOf == -1) {
            throw new JSONException("unclosed str, " + info());
        }
        if (V6) {
            str = this.text.substring(i, indexOf);
        } else {
            int i2 = indexOf - i;
            str = new String(sub_chars(this.bp + 1, i2), 0, i2);
        }
        if (str.indexOf(92) != -1) {
            while (true) {
                int i3 = 0;
                for (int i4 = indexOf - 1; i4 >= 0 && this.text.charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                indexOf = this.text.indexOf(c, indexOf + 1);
            }
            int i5 = indexOf - i;
            str = readString(sub_chars(this.bp + 1, i5), i5);
        }
        this.bp = indexOf + 1;
        int i6 = this.bp;
        this.ch = i6 >= this.len ? EOI : this.text.charAt(i6);
        return str;
    }

    public final String scanSymbol(SymbolTable symbolTable) {
        char c;
        while (true) {
            c = this.ch;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t' && c != '\f' && c != '\b') {
                break;
            }
            next();
        }
        if (c == '\"') {
            return scanSymbol(symbolTable, '\"');
        }
        if (c == '\'') {
            return scanSymbol(symbolTable, '\'');
        }
        if (c == '}') {
            next();
            this.token = 13;
            return null;
        } else if (c == ',') {
            next();
            this.token = 16;
            return null;
        } else if (c != 26) {
            return scanSymbolUnQuoted(symbolTable);
        } else {
            this.token = 20;
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String scanSymbol(com.alibaba.fastjson.parser.SymbolTable r11, char r12) {
        /*
            r10 = this;
            int r0 = r10.bp
            r1 = 1
            int r0 = r0 + r1
            java.lang.String r2 = r10.text
            int r2 = r2.indexOf(r12, r0)
            r3 = -1
            if (r2 == r3) goto L97
            int r0 = r2 - r0
            int r3 = r10.bp
            int r3 = r3 + r1
            char[] r3 = r10.sub_chars(r3, r0)
            r4 = 0
            r5 = r2
            r2 = 0
        L19:
            r6 = 92
            if (r0 <= 0) goto L5b
            int r7 = r0 + (-1)
            char r7 = r3[r7]
            if (r7 != r6) goto L5b
            int r7 = r0 + (-2)
            r8 = 1
        L26:
            if (r7 < 0) goto L31
            char r9 = r3[r7]
            if (r9 != r6) goto L31
            int r8 = r8 + 1
            int r7 = r7 + (-1)
            goto L26
        L31:
            int r8 = r8 % 2
            if (r8 == 0) goto L5b
            java.lang.String r2 = r10.text
            int r6 = r5 + 1
            int r2 = r2.indexOf(r12, r6)
            int r6 = r2 - r5
            int r6 = r6 + r0
            int r7 = r3.length
            if (r6 < r7) goto L52
            int r7 = r3.length
            int r7 = r7 * 3
            int r7 = r7 / 2
            if (r7 >= r6) goto L4b
            r7 = r6
        L4b:
            char[] r7 = new char[r7]
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r4, r7, r4, r8)
            r3 = r7
        L52:
            java.lang.String r7 = r10.text
            r7.getChars(r5, r2, r3, r0)
            r5 = r2
            r0 = r6
            r2 = 1
            goto L19
        L5b:
            if (r2 != 0) goto L7e
            r12 = 0
            r7 = 0
        L5f:
            if (r12 >= r0) goto L6c
            char r8 = r3[r12]
            int r7 = r7 * 31
            int r7 = r7 + r8
            if (r8 != r6) goto L69
            r2 = 1
        L69:
            int r12 = r12 + 1
            goto L5f
        L6c:
            if (r2 == 0) goto L6f
            goto L7e
        L6f:
            r12 = 20
            if (r0 >= r12) goto L78
            java.lang.String r11 = r11.addSymbol(r3, r4, r0, r7)
            goto L82
        L78:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r3, r4, r0)
            goto L82
        L7e:
            java.lang.String r11 = readString(r3, r0)
        L82:
            int r5 = r5 + r1
            r10.bp = r5
            int r12 = r10.bp
            int r0 = r10.len
            if (r12 < r0) goto L8e
            r12 = 26
            goto L94
        L8e:
            java.lang.String r0 = r10.text
            char r12 = r0.charAt(r12)
        L94:
            r10.ch = r12
            return r11
        L97:
            com.alibaba.fastjson.JSONException r11 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "unclosed str, "
            r12.append(r0)
            java.lang.String r0 = r10.info()
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanSymbol(com.alibaba.fastjson.parser.SymbolTable, char):java.lang.String");
    }

    public final String scanSymbolUnQuoted(SymbolTable symbolTable) {
        int i = this.ch;
        boolean[] zArr = firstIdentifierFlags;
        if (!(i >= zArr.length || zArr[i])) {
            throw new JSONException("illegal identifier : " + this.ch + ", " + info());
        }
        this.np = this.bp;
        this.sp = 1;
        while (true) {
            char next = next();
            boolean[] zArr2 = identifierFlags;
            if (next < zArr2.length && !zArr2[next]) {
                break;
            }
            i = (i * 31) + next;
            this.sp++;
        }
        this.ch = charAt(this.bp);
        this.token = 18;
        if (this.sp == 4 && this.text.startsWith("null", this.np)) {
            return null;
        }
        return symbolTable.addSymbol(this.text, this.np, this.sp, i);
    }

    protected void setTime(char c, char c2, char c3, char c4, char c5, char c6) {
        this.calendar.set(11, ((c - '0') * 10) + (c2 - '0'));
        this.calendar.set(12, ((c3 - '0') * 10) + (c4 - '0'));
        this.calendar.set(13, ((c5 - '0') * 10) + (c6 - '0'));
    }

    protected void setTimeZone(char c, char c2, char c3) {
        int i = (((c2 - '0') * 10) + (c3 - '0')) * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT * 1000;
        if (c == '-') {
            i = -i;
        }
        if (this.calendar.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length <= 0) {
                return;
            }
            this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
        }
    }

    protected void skipComment() {
        next();
        char c = this.ch;
        if (c == '/') {
            do {
                next();
            } while (this.ch != '\n');
            next();
            return;
        }
        if (c != '*') {
            throw new JSONException("invalid comment");
        }
        while (true) {
            next();
            while (true) {
                char c2 = this.ch;
                if (c2 == 26) {
                    return;
                }
                if (c2 == '*') {
                    next();
                    if (this.ch == '/') {
                        next();
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void skipWhitespace() {
        while (true) {
            char c = this.ch;
            if (c <= '/') {
                if (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b') {
                    next();
                } else if (c != '/') {
                    return;
                } else {
                    skipComment();
                }
            } else {
                return;
            }
        }
    }

    public final String stringVal() {
        return this.hasSpecial ? readString(this.sbuf, this.sp) : subString(this.np + 1, this.sp);
    }

    final char[] sub_chars(int i, int i2) {
        char[] cArr = this.sbuf;
        if (i2 < cArr.length) {
            this.text.getChars(i, i2 + i, cArr, 0);
            return this.sbuf;
        }
        char[] cArr2 = new char[i2];
        this.sbuf = cArr2;
        this.text.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    public final int token() {
        return this.token;
    }
}
