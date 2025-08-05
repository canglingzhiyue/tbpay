package com.alibaba.fastjson2;

import anet.channel.util.ErrorConstant;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.a;
import com.alibaba.fastjson2.b;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.reader.bu;
import com.alibaba.fastjson2.reader.dh;
import com.alibaba.fastjson2.reader.di;
import com.alibaba.fastjson2.reader.dk;
import com.alibaba.fastjson2.reader.dl;
import com.alibaba.fastjson2.reader.ef;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.util.e;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.fxb;
import tb.gbx;
import tb.kge;
import tb.mto;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n extends JSONReader {
    static final byte[] m;
    static final long x;
    static final byte[] y;
    static Charset z;
    protected final byte[] A;
    protected final int B;
    protected final int C;
    protected byte D;
    protected int E;
    protected byte F;
    protected int G;
    protected byte[] H;
    protected final JSONFactory.CacheItem I;
    protected final s J;
    protected long K;
    protected int L;
    protected int M;
    protected byte N;
    protected long[] O;
    protected char[] Q;

    static {
        kge.a(132267725);
        x = e.UNSAFE.arrayBaseOffset(byte[].class);
        y = b.CC.a(com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID_NAME);
        m = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, gbx.OP_IS_NOT, gbx.OP_CALL_FUNC, gbx.OP_ASSIGN, gbx.OP_MINIFY_CALL_FUNC, 0, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 5, 0, 0, 1, 1, 1, 0, 0, 0, 9, 0, 5, 0, 0, 0, 0, 3, 2, 9, 5, 3, 3, 3, 3, 3, 3, 3, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(JSONReader.c cVar, byte[] bArr, int i, int i2) {
        super(cVar, true);
        this.A = bArr;
        this.c = i;
        this.B = i2;
        this.C = i + i2;
        this.J = cVar.x;
        this.I = JSONFactory.t[System.identityHashCode(Thread.currentThread()) & (JSONFactory.t.length - 1)];
    }

    static int a(byte[] bArr, int i, int i2) {
        return ((i2 - 68) << 16) + ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
    }

    private long a(byte[] bArr, byte b) {
        int i;
        int i2;
        if (b >= 48 && b <= 63) {
            this.c = this.c + 1;
            return ((b - 56) << 8) + (bArr[i2] & 255);
        } else if (b >= -16 && b <= 47) {
            return b;
        } else {
            if (b >= 64 && b <= 71) {
                int a2 = a(bArr, this.c, b);
                this.c += 2;
                return a2;
            } else if (b == -71) {
                int R = R();
                BigInteger af = af();
                return (R == 0 ? new BigDecimal(af) : new BigDecimal(af, R)).longValue();
            } else if (b == 72) {
                int a3 = com.alibaba.fastjson2.util.d.a(bArr, this.c);
                this.c += 4;
                return a3;
            } else if (b == 124) {
                int R2 = R();
                String str = new String(bArr, this.c, R2, StandardCharsets.UTF_16LE);
                this.c += R2;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.b(str).intValue();
            } else if (b == -68) {
                int i3 = (bArr[this.c + 1] & 255) + (bArr[this.c] << 8);
                this.c += 2;
                return i3;
            } else if (b == -67) {
                this.c = this.c + 1;
                return bArr[i];
            } else if (b == 121) {
                int R3 = R();
                String b2 = b(this.c, R3);
                this.c += R3;
                return b2.indexOf(46) == -1 ? new BigInteger(b2).intValue() : TypeUtils.b(b2).intValue();
            } else if (b == 122) {
                int R4 = R();
                String str2 = new String(bArr, this.c, R4, StandardCharsets.UTF_8);
                this.c += R4;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.b(str2).intValue();
            } else {
                switch (b) {
                    case -85:
                        long j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                        this.c += 8;
                        return e.BIG_ENDIAN ? j : Long.reverseBytes(j);
                    case -84:
                        this.c += 4;
                        return com.alibaba.fastjson2.util.d.a(bArr, this.c) * 1000;
                    case -83:
                        this.c += 4;
                        return com.alibaba.fastjson2.util.d.a(bArr, this.c) * 60 * 1000;
                    default:
                        switch (b) {
                            case -81:
                                if ((this.f2934a.p & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                                    throw new JSONException(d("long value not support input null"));
                                }
                                this.h = true;
                                return 0L;
                            case -80:
                            case -78:
                                return 0L;
                            case -79:
                            case -77:
                                return 1L;
                            case -76:
                                return Y();
                            case -75:
                                this.c--;
                                return (long) ac();
                            case -74:
                                return R();
                            case -73:
                                int a4 = com.alibaba.fastjson2.util.d.a(bArr, this.c);
                                this.c += 4;
                                return Float.intBitsToFloat(a4);
                            default:
                                if (b < 73 || b > 120) {
                                    throw e(b);
                                }
                                int i4 = b - 73;
                                String b3 = b(this.c, i4);
                                this.c += i4;
                                return b3.indexOf(46) == -1 ? new BigInteger(b3).longValue() : TypeUtils.b(b3).longValue();
                        }
                }
            }
        }
    }

    private bu a(bu buVar, Class cls, ClassLoader classLoader) {
        String aG = aG();
        Class<?> a2 = TypeUtils.a(aG);
        if (a2 == null) {
            if (classLoader == null) {
                try {
                    classLoader = a.class.getClassLoader();
                } catch (ClassNotFoundException unused) {
                }
            }
            a2 = classLoader.loadClass(aG);
        }
        return (a2 == null || cls.equals(a2)) ? buVar : a((Type) a2);
    }

    private String aW() {
        this.E = aS();
        this.G = this.c;
        if (z == null) {
            z = Charset.forName("GB18030");
            return null;
        }
        return null;
    }

    private String aX() {
        this.E = aS();
        this.G = this.c;
        return null;
    }

    private String aY() {
        int i = this.A[this.c];
        if (i >= -16 && i <= 47) {
            this.c++;
        } else if (i < 48 || i > 63) {
            i = aS();
        } else {
            this.c++;
            byte[] bArr = this.A;
            int i2 = this.c;
            this.c = i2 + 1;
            i = ((i - 56) << 8) + (bArr[i2] & 255);
        }
        this.E = i;
        this.G = this.c;
        if (this.E == 0) {
            return "";
        }
        return null;
    }

    private int b(byte[] bArr, byte b) {
        if (b < -40 || b > -17) {
            if (b >= -56 && b <= -41) {
                int i = this.c;
                this.c = i + 1;
                return ((b + 48) << 8) + (bArr[i] & 255);
            } else if (b >= -64 && b <= -57) {
                int i2 = this.c;
                this.c = i2 + 1;
                int i3 = ((b + 60) << 16) + ((bArr[i2] & 255) << 8);
                int i4 = this.c;
                this.c = i4 + 1;
                return i3 + (bArr[i4] & 255);
            } else {
                if (b != -84 && b != -83) {
                    if (b == -71) {
                        int R = R();
                        BigInteger af = af();
                        return (R == 0 ? new BigDecimal(af) : new BigDecimal(af, R)).intValue();
                    } else if (b == 124) {
                        int R2 = R();
                        String str = new String(bArr, this.c, R2, StandardCharsets.UTF_16LE);
                        this.c += R2;
                        return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.b(str).intValue();
                    } else if (b == 121) {
                        int R3 = R();
                        String b2 = b(this.c, R3);
                        this.c += R3;
                        return b2.indexOf(46) == -1 ? new BigInteger(b2).intValue() : TypeUtils.b(b2).intValue();
                    } else if (b == 122) {
                        int R4 = R();
                        String str2 = new String(bArr, this.c, R4, StandardCharsets.UTF_8);
                        this.c += R4;
                        return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.b(str2).intValue();
                    } else {
                        switch (b) {
                            case -81:
                                if ((this.f2934a.p & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                                    throw new JSONException(d("int value not support input null"));
                                }
                                this.h = true;
                                return 0;
                            case -80:
                            case -78:
                                return 0;
                            case -79:
                            case -77:
                                return 1;
                            case -76:
                                return (int) Y();
                            case -75:
                                this.c--;
                                return (int) ac();
                            case -74:
                                return R();
                            case -73:
                                int a2 = com.alibaba.fastjson2.util.d.a(bArr, this.c);
                                this.c += 4;
                                return (int) Float.intBitsToFloat(a2);
                            default:
                                switch (b) {
                                    case -68:
                                        int i5 = (bArr[this.c + 1] & 255) + (bArr[this.c] << 8);
                                        this.c += 2;
                                        return i5;
                                    case -67:
                                        int i6 = this.c;
                                        this.c = i6 + 1;
                                        return bArr[i6];
                                    case -66:
                                        long j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                        this.c += 8;
                                        if (!e.BIG_ENDIAN) {
                                            j = Long.reverseBytes(j);
                                        }
                                        return (int) j;
                                    case -65:
                                        break;
                                    default:
                                        if (b < 73 || b > 120) {
                                            throw d(b);
                                        }
                                        int i7 = b - 73;
                                        String b3 = b(this.c, i7);
                                        this.c += i7;
                                        return b3.indexOf(46) == -1 ? new BigInteger(b3).intValue() : TypeUtils.b(b3).intValue();
                                }
                        }
                    }
                }
                int a3 = com.alibaba.fastjson2.util.d.a(bArr, this.c);
                this.c += 4;
                return a3;
            }
        }
        return (b - (-40)) - 8;
    }

    private String ba() {
        byte b = this.F;
        if (b < -16 || b > 47) {
            byte b2 = this.F;
            if (b2 >= 48 && b2 <= 63) {
                byte[] bArr = this.A;
                int i = this.c;
                this.c = i + 1;
                return Integer.toString(((b2 - 56) << 8) + (bArr[i] & 255));
            }
            byte b3 = this.F;
            if (b3 >= 64 && b3 <= 71) {
                int a2 = a(this.A, this.c, this.F);
                this.c += 2;
                return Integer.toString(a2);
            }
            byte b4 = this.F;
            if (b4 >= -40 && b4 <= -17) {
                return Integer.toString((b4 - (-40)) - 8);
            }
            byte b5 = this.F;
            if (b5 >= -56 && b5 <= -41) {
                byte[] bArr2 = this.A;
                int i2 = this.c;
                this.c = i2 + 1;
                return Integer.toString(((b5 + 48) << 8) + (bArr2[i2] & 255));
            }
            byte b6 = this.F;
            if (b6 >= -64 && b6 <= -57) {
                byte[] bArr3 = this.A;
                int i3 = this.c;
                this.c = i3 + 1;
                int i4 = ((b6 + 60) << 16) + ((bArr3[i3] & 255) << 8);
                byte[] bArr4 = this.A;
                int i5 = this.c;
                this.c = i5 + 1;
                return Integer.toString(i4 + (bArr4[i5] & 255));
            }
            byte b7 = this.F;
            if (b7 == -110) {
                this.c--;
                Object aM = aM();
                if (aM != null) {
                    return a.CC.a(aM, JSONWriter.Feature.WriteThrowableClassName);
                }
                return null;
            } else if (b7 == -81) {
                return null;
            } else {
                if (b7 != 72) {
                    if (b7 == -66) {
                        long j = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                        if (!e.BIG_ENDIAN) {
                            j = Long.reverseBytes(j);
                        }
                        this.c += 8;
                        return Long.toString(j);
                    } else if (b7 != -65) {
                        switch (b7) {
                            case -85:
                                long j2 = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                this.c += 8;
                                if (!e.BIG_ENDIAN) {
                                    j2 = Long.reverseBytes(j2);
                                }
                                return DateUtils.a(j2, false, com.alibaba.fastjson2.time.e.b);
                            case -84:
                                long a3 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                                this.c += 4;
                                return DateUtils.a(a3 * 1000, false, com.alibaba.fastjson2.time.e.b);
                            case -83:
                                long a4 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                                this.c += 4;
                                return DateUtils.a(a4 * 60 * 1000, false, com.alibaba.fastjson2.time.e.b);
                            default:
                                switch (b7) {
                                    case -78:
                                        return "0.0";
                                    case -77:
                                        return "1.0";
                                    case -76:
                                        return Double.toString(Y());
                                    case -75:
                                        long j3 = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                        this.c += 8;
                                        if (!e.BIG_ENDIAN) {
                                            j3 = Long.reverseBytes(j3);
                                        }
                                        return Double.toString(Double.longBitsToDouble(j3));
                                    case -74:
                                        return Float.toString(R());
                                    case -73:
                                        int a5 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                                        this.c += 4;
                                        return Float.toString(Float.intBitsToFloat(a5));
                                    case -72:
                                    case -70:
                                        return Long.toString(Y());
                                    case -71:
                                        int R = R();
                                        BigInteger af = af();
                                        return (R == 0 ? new BigDecimal(af) : new BigDecimal(af, R)).toString();
                                    case -69:
                                        int R2 = R();
                                        byte[] bArr5 = new byte[R2];
                                        System.arraycopy(this.A, this.c, bArr5, 0, R2);
                                        this.c += R2;
                                        return new BigInteger(bArr5).toString();
                                    default:
                                        throw bf();
                                }
                        }
                    }
                }
                this.c += 4;
                return Long.toString(com.alibaba.fastjson2.util.d.a(this.A, this.c));
            }
        }
        return Byte.toString(b);
    }

    private JSONException bf() {
        throw new JSONException("readString not support type " + b.CC.a(this.F) + ", offset " + this.c + "/" + this.A.length);
    }

    private JSONException bg() {
        throw new JSONException("string value not support input " + b.CC.a(this.D) + " offset " + this.c + "/" + this.A.length);
    }

    private String bh() {
        Charset charset;
        int i;
        byte b = this.F;
        String str = null;
        if (b == 122) {
            byte b2 = this.A[this.c];
            if (b2 >= -16 && b2 <= 47) {
                this.E = b2;
                i = this.c + 1;
            } else if (b2 < 48 || b2 > 63) {
                this.E = aS();
                this.G = this.c;
                charset = StandardCharsets.UTF_8;
            } else {
                this.E = ((b2 - 56) << 8) + (this.A[this.c + 1] & 255);
                i = this.c + 2;
            }
            this.c = i;
            this.G = this.c;
            charset = StandardCharsets.UTF_8;
        } else if (b == 123) {
            this.E = aS();
            this.G = this.c;
            charset = StandardCharsets.UTF_16;
        } else if (b == 124) {
            str = aY();
            charset = StandardCharsets.UTF_16LE;
        } else if (b == 125) {
            str = aX();
            if (str != null) {
                return str;
            }
            charset = StandardCharsets.UTF_16BE;
        } else if (b != 126) {
            return ba();
        } else {
            aW();
            charset = z;
        }
        if (str != null) {
            return (this.f2934a.p & JSONReader.Feature.TrimString.mask) != 0 ? str.trim() : str;
        }
        int i2 = this.E;
        if (i2 < 0) {
            return this.J.a(-i2);
        }
        String str2 = new String(this.A, this.c, this.E, charset);
        this.c += this.E;
        return (this.f2934a.p & JSONReader.Feature.TrimString.mask) != 0 ? str2.trim() : str2;
    }

    private float bi() {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr = this.A;
        int i5 = this.c;
        this.c = i5 + 1;
        byte b = bArr[i5];
        if (b == -71) {
            int R = R();
            BigInteger af = af();
            return (R == 0 ? new BigDecimal(af) : new BigDecimal(af, R)).intValue();
        }
        if (b != 72) {
            if (b == 124) {
                int R2 = R();
                String str = new String(bArr, this.c, R2, StandardCharsets.UTF_16LE);
                this.c += R2;
                return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.b(str).intValue();
            } else if (b == 121) {
                int R3 = R();
                String str2 = new String(bArr, this.c, R3, StandardCharsets.ISO_8859_1);
                this.c += R3;
                return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.b(str2).intValue();
            } else if (b == 122) {
                int R4 = R();
                String str3 = new String(bArr, this.c, R4, StandardCharsets.UTF_8);
                this.c += R4;
                return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : TypeUtils.b(str3).intValue();
            } else {
                switch (b) {
                    case -81:
                        if ((this.f2934a.p & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                            throw new JSONException(d("long value not support input null"));
                        }
                        this.h = true;
                        return 0.0f;
                    case -80:
                    case -78:
                        return 0.0f;
                    case -79:
                    case -77:
                        return 1.0f;
                    case -76:
                        return (float) Y();
                    case -75:
                        long j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                        this.c += 8;
                        if (!e.BIG_ENDIAN) {
                            j = Long.reverseBytes(j);
                        }
                        return (float) Double.longBitsToDouble(j);
                    case -74:
                        return R();
                    default:
                        switch (b) {
                            case -68:
                                int i6 = (bArr[this.c + 1] & 255) + (bArr[this.c] << 8);
                                this.c += 2;
                                return i6;
                            case -67:
                                this.c = this.c + 1;
                                return bArr[i];
                            case -66:
                                long j2 = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                this.c += 8;
                                if (!e.BIG_ENDIAN) {
                                    j2 = Long.reverseBytes(j2);
                                }
                                return (float) j2;
                            case -65:
                                break;
                            default:
                                if (b >= -16 && b <= 47) {
                                    return b;
                                }
                                if (b >= 48 && b <= 63) {
                                    this.c = this.c + 1;
                                    return ((b - 56) << 8) + (bArr[i4] & 255);
                                } else if (b >= 64 && b <= 71) {
                                    int a2 = a(bArr, this.c, b);
                                    this.c += 2;
                                    return a2;
                                } else if (b >= -40 && b <= -17) {
                                    return (b - (-40)) - 8;
                                } else {
                                    if (b >= -56 && b <= -41) {
                                        this.c = this.c + 1;
                                        return ((b + 48) << 8) + (bArr[i3] & 255);
                                    } else if (b >= -64 && b <= -57) {
                                        int i7 = this.c;
                                        this.c = i7 + 1;
                                        int i8 = ((b + 60) << 16) + ((bArr[i7] & 255) << 8);
                                        this.c = this.c + 1;
                                        return i8 + (bArr[i2] & 255);
                                    } else if (b < 73 || b > 120) {
                                        throw c(b);
                                    } else {
                                        int i9 = b - 73;
                                        String b2 = b(this.c, i9);
                                        this.c += i9;
                                        return b2.indexOf(46) == -1 ? new BigInteger(b2).intValue() : TypeUtils.b(b2).intValue();
                                    }
                                }
                        }
                }
            }
        }
        int a3 = com.alibaba.fastjson2.util.d.a(bArr, this.c);
        this.c += 4;
        return a3;
    }

    private double bj() {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr = this.A;
        int i5 = this.c;
        this.c = i5 + 1;
        byte b = bArr[i5];
        if (b != -74) {
            if (b == -73) {
                int i6 = e.UNSAFE.getInt(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                this.c += 4;
                if (!e.BIG_ENDIAN) {
                    i6 = Integer.reverseBytes(i6);
                }
                return Float.intBitsToFloat(i6);
            } else if (b == -71) {
                int R = R();
                BigInteger af = af();
                return (R == 0 ? new BigDecimal(af) : new BigDecimal(af, R)).intValue();
            } else {
                if (b != 72) {
                    if (b == 124) {
                        int R2 = R();
                        String str = new String(bArr, this.c, R2, StandardCharsets.UTF_16LE);
                        this.c += R2;
                        return str.indexOf(46) == -1 ? new BigInteger(str).intValue() : TypeUtils.b(str).intValue();
                    } else if (b == 121) {
                        int R3 = R();
                        String str2 = new String(bArr, this.c, R3, StandardCharsets.ISO_8859_1);
                        this.c += R3;
                        return str2.indexOf(46) == -1 ? new BigInteger(str2).intValue() : TypeUtils.b(str2).intValue();
                    } else if (b == 122) {
                        int R4 = R();
                        String str3 = new String(bArr, this.c, R4, StandardCharsets.UTF_8);
                        this.c += R4;
                        return str3.indexOf(46) == -1 ? new BigInteger(str3).intValue() : TypeUtils.b(str3).intValue();
                    } else {
                        switch (b) {
                            case -81:
                                if ((this.f2934a.p & JSONReader.Feature.ErrorOnNullForPrimitives.mask) != 0) {
                                    throw new JSONException(d("long value not support input null"));
                                }
                                this.h = true;
                                return mto.a.GEO_NOT_SUPPORT;
                            case -80:
                            case -78:
                                return mto.a.GEO_NOT_SUPPORT;
                            case -79:
                            case -77:
                                return 1.0d;
                            case -76:
                                return Y();
                            default:
                                switch (b) {
                                    case -68:
                                        int i7 = (bArr[this.c + 1] & 255) + (bArr[this.c] << 8);
                                        this.c += 2;
                                        return i7;
                                    case -67:
                                        this.c = this.c + 1;
                                        return bArr[i];
                                    case -66:
                                        long j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                        this.c += 8;
                                        if (!e.BIG_ENDIAN) {
                                            j = Long.reverseBytes(j);
                                        }
                                        return j;
                                    case -65:
                                        break;
                                    default:
                                        if (b >= -16 && b <= 47) {
                                            return b;
                                        }
                                        if (b >= 48 && b <= 63) {
                                            this.c = this.c + 1;
                                            return ((b - 56) << 8) + (bArr[i4] & 255);
                                        } else if (b >= 64 && b <= 71) {
                                            int a2 = a(bArr, this.c, b);
                                            this.c += 2;
                                            return a2;
                                        } else if (b >= -40 && b <= -17) {
                                            return (b - (-40)) - 8;
                                        } else {
                                            if (b >= -56 && b <= -41) {
                                                this.c = this.c + 1;
                                                return ((b + 48) << 8) + (bArr[i3] & 255);
                                            } else if (b >= -64 && b <= -57) {
                                                int i8 = this.c;
                                                this.c = i8 + 1;
                                                int i9 = ((b + 60) << 16) + ((bArr[i8] & 255) << 8);
                                                this.c = this.c + 1;
                                                return i9 + (bArr[i2] & 255);
                                            } else if (b < 73 || b > 120) {
                                                throw c(b);
                                            } else {
                                                int i10 = b - 73;
                                                String b2 = b(this.c, i10);
                                                this.c += i10;
                                                return b2.indexOf(46) == -1 ? new BigInteger(b2).intValue() : TypeUtils.b(b2).intValue();
                                            }
                                        }
                                }
                        }
                    }
                }
                int i11 = e.UNSAFE.getInt(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                this.c += 4;
                return e.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
            }
        }
        return R();
    }

    private static JSONException c(byte b) {
        return new JSONException("name not support input : " + b.CC.a(b));
    }

    private JSONException d(byte b) {
        throw new JSONException("readInt32Value not support " + b.CC.a(b) + ", offset " + this.c + "/" + this.A.length);
    }

    static JSONException d(int i) {
        throw new JSONException("type ref not found : " + i);
    }

    private JSONException e(byte b) {
        throw new JSONException("readInt64Value not support " + b.CC.a(b) + ", offset " + this.c + "/" + this.A.length);
    }

    private com.alibaba.fastjson2.time.c e(int i) {
        com.alibaba.fastjson2.time.b au;
        if (i < 73 || i > 120) {
            throw c((byte) i);
        }
        int ak = ak();
        switch (ak) {
            case 8:
                au = au();
                if (au == null) {
                    return null;
                }
                return com.alibaba.fastjson2.time.c.a(au, com.alibaba.fastjson2.time.d.MIN);
            case 9:
                au = av();
                if (au == null) {
                    return null;
                }
                return com.alibaba.fastjson2.time.c.a(au, com.alibaba.fastjson2.time.d.MIN);
            case 10:
                au = aw();
                if (au == null) {
                    return null;
                }
                return com.alibaba.fastjson2.time.c.a(au, com.alibaba.fastjson2.time.d.MIN);
            case 11:
                au = ax();
                if (au == null) {
                    return null;
                }
                return com.alibaba.fastjson2.time.c.a(au, com.alibaba.fastjson2.time.d.MIN);
            case 12:
            case 13:
            case 14:
            case 15:
            default:
                throw new JSONException("TODO : " + ak + ", " + az());
            case 16:
                return ao();
            case 17:
                return ap();
            case 18:
                return aq();
            case 19:
                return ar();
            case 20:
                return as();
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                com.alibaba.fastjson2.time.c b = b(ak);
                if (b != null) {
                    return b;
                }
                com.alibaba.fastjson2.time.f c = c(ak);
                if (c != null) {
                    return c.f3024a;
                }
                throw new JSONException("TODO : " + ak + ", " + az());
        }
    }

    private BigDecimal f(byte b) {
        int i;
        int i2;
        int i3;
        int i4;
        if (b != 72) {
            if (b == 124) {
                int R = R();
                String str = new String(this.A, this.c, R, StandardCharsets.UTF_16LE);
                this.c += R;
                return TypeUtils.b(str);
            } else if (b == 121) {
                int R2 = R();
                String str2 = new String(this.A, this.c, R2, StandardCharsets.ISO_8859_1);
                this.c += R2;
                return TypeUtils.b(str2);
            } else if (b == 122) {
                int R3 = R();
                String str3 = new String(this.A, this.c, R3, StandardCharsets.UTF_8);
                this.c += R3;
                return TypeUtils.b(str3);
            } else {
                switch (b) {
                    case -81:
                        return null;
                    case -80:
                    case -78:
                        return BigDecimal.ZERO;
                    case -79:
                    case -77:
                        return BigDecimal.ONE;
                    case -76:
                        return BigDecimal.valueOf(Y());
                    case -75:
                        long j = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                        this.c += 8;
                        if (!e.BIG_ENDIAN) {
                            j = Long.reverseBytes(j);
                        }
                        return BigDecimal.valueOf((long) Double.longBitsToDouble(j));
                    case -74:
                        return BigDecimal.valueOf(R());
                    case -73:
                        int a2 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                        this.c += 4;
                        return BigDecimal.valueOf(Float.intBitsToFloat(a2));
                    default:
                        switch (b) {
                            case -69:
                                return new BigDecimal(af());
                            case -68:
                                int i5 = (this.A[this.c + 1] & 255) + (this.A[this.c] << 8);
                                this.c += 2;
                                return BigDecimal.valueOf(i5);
                            case -67:
                                byte[] bArr = this.A;
                                this.c = this.c + 1;
                                return BigDecimal.valueOf(bArr[i]);
                            case -66:
                                long j2 = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                this.c += 8;
                                if (!e.BIG_ENDIAN) {
                                    j2 = Long.reverseBytes(j2);
                                }
                                return BigDecimal.valueOf(j2);
                            case -65:
                                break;
                            default:
                                if (b >= -16 && b <= 47) {
                                    return BigDecimal.valueOf(b);
                                }
                                if (b >= 48 && b <= 63) {
                                    byte[] bArr2 = this.A;
                                    this.c = this.c + 1;
                                    return BigDecimal.valueOf(((b - 56) << 8) + (bArr2[i4] & 255));
                                } else if (b >= 64 && b <= 71) {
                                    int a3 = a(this.A, this.c, b);
                                    this.c += 2;
                                    return BigDecimal.valueOf(a3);
                                } else if (b >= -40 && b <= -17) {
                                    return BigDecimal.valueOf((b - (-40)) - 8);
                                } else {
                                    if (b >= -56 && b <= -41) {
                                        byte[] bArr3 = this.A;
                                        this.c = this.c + 1;
                                        return BigDecimal.valueOf(((b + 48) << 8) + (bArr3[i3] & 255));
                                    } else if (b < -64 || b > -57) {
                                        if (b < 73 || b > 120) {
                                            throw c(b);
                                        }
                                        int i6 = b - 73;
                                        String b2 = b(this.c, i6);
                                        this.c += i6;
                                        return TypeUtils.b(b2);
                                    } else {
                                        byte[] bArr4 = this.A;
                                        int i7 = this.c;
                                        this.c = i7 + 1;
                                        int i8 = ((b + 60) << 16) + ((bArr4[i7] & 255) << 8);
                                        byte[] bArr5 = this.A;
                                        this.c = this.c + 1;
                                        return BigDecimal.valueOf(i8 + (bArr5[i2] & 255));
                                    }
                                }
                        }
                }
            }
        }
        int a4 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
        this.c += 4;
        return BigDecimal.valueOf(a4);
    }

    private BigInteger g(byte b) {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr = this.A;
        if (b == -111) {
            int R = R();
            byte[] bArr2 = new byte[R];
            System.arraycopy(this.A, this.c, bArr2, 0, R);
            this.c += R;
            return new BigInteger(bArr2);
        } else if (b == -71) {
            int R2 = R();
            BigInteger af = af();
            return (R2 == 0 ? new BigDecimal(af) : new BigDecimal(af, R2)).toBigInteger();
        } else {
            if (b != 72) {
                if (b == 124) {
                    int R3 = R();
                    String str = new String(bArr, this.c, R3, StandardCharsets.UTF_16LE);
                    this.c += R3;
                    return str.indexOf(46) == -1 ? new BigInteger(str) : TypeUtils.b(str).toBigInteger();
                } else if (b == 121) {
                    int R4 = R();
                    String str2 = new String(bArr, this.c, R4, StandardCharsets.ISO_8859_1);
                    this.c += R4;
                    return str2.indexOf(46) == -1 ? new BigInteger(str2) : TypeUtils.b(str2).toBigInteger();
                } else if (b == 122) {
                    int R5 = R();
                    String str3 = new String(bArr, this.c, R5, StandardCharsets.UTF_8);
                    this.c += R5;
                    return str3.indexOf(46) == -1 ? new BigInteger(str3) : TypeUtils.b(str3).toBigInteger();
                } else {
                    switch (b) {
                        case -81:
                            return null;
                        case -80:
                        case -78:
                            return BigInteger.ZERO;
                        case -79:
                        case -77:
                            return BigInteger.ONE;
                        case -76:
                            return BigInteger.valueOf(Y());
                        case -75:
                            long j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                            this.c += 8;
                            if (!e.BIG_ENDIAN) {
                                j = Long.reverseBytes(j);
                            }
                            return BigInteger.valueOf((long) Double.longBitsToDouble(j));
                        case -74:
                            return BigInteger.valueOf(R());
                        case -73:
                            int a2 = com.alibaba.fastjson2.util.d.a(bArr, this.c);
                            this.c += 4;
                            return BigInteger.valueOf(Float.intBitsToFloat(a2));
                        default:
                            switch (b) {
                                case -68:
                                    int i5 = (bArr[this.c + 1] & 255) + (bArr[this.c] << 8);
                                    this.c += 2;
                                    return BigInteger.valueOf(i5);
                                case -67:
                                    this.c = this.c + 1;
                                    return BigInteger.valueOf(bArr[i]);
                                case -66:
                                    long j2 = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                    this.c += 8;
                                    if (!e.BIG_ENDIAN) {
                                        j2 = Long.reverseBytes(j2);
                                    }
                                    return BigInteger.valueOf(j2);
                                case -65:
                                    break;
                                default:
                                    if (b >= -16 && b <= 47) {
                                        return BigInteger.valueOf(b);
                                    }
                                    if (b >= 48 && b <= 63) {
                                        this.c = this.c + 1;
                                        return BigInteger.valueOf(((b - 56) << 8) + (bArr[i4] & 255));
                                    } else if (b >= 64 && b <= 71) {
                                        int a3 = a(bArr, this.c, b);
                                        this.c += 2;
                                        return BigInteger.valueOf(a3);
                                    } else if (b >= -40 && b <= -17) {
                                        return BigInteger.valueOf((b - (-40)) - 8);
                                    } else {
                                        if (b >= -56 && b <= -41) {
                                            this.c = this.c + 1;
                                            return BigInteger.valueOf(((b + 48) << 8) + (bArr[i3] & 255));
                                        } else if (b >= -64 && b <= -57) {
                                            int i6 = this.c;
                                            this.c = i6 + 1;
                                            int i7 = ((b + 60) << 16) + ((bArr[i6] & 255) << 8);
                                            this.c = this.c + 1;
                                            return BigInteger.valueOf(i7 + (bArr[i2] & 255));
                                        } else if (b < 73 || b > 120) {
                                            throw c(b);
                                        } else {
                                            int i8 = b - 73;
                                            String b2 = b(this.c, i8);
                                            this.c += i8;
                                            return new BigInteger(b2);
                                        }
                                    }
                            }
                    }
                }
            }
            int a4 = com.alibaba.fastjson2.util.d.a(bArr, this.c);
            this.c += 4;
            return BigInteger.valueOf(a4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x019d, code lost:
        if (r2[r18.c + 4] == 69) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b9, code lost:
        if (r2[r18.c] == 78) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0209, code lost:
        if (r2[r18.c + 4] == 101) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0237, code lost:
        if (r2[r18.c + 4] == 69) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0119, code lost:
        if (r2[r18.c + 3] == 101) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0142, code lost:
        if (r2[r18.c + 3] == 69) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
        if (r2[r18.c + 4] == 101) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016d, code lost:
        r1 = r18.c + 5;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean h(byte r19) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.h(byte):boolean");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean A() {
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean B() {
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void D() {
        this.c++;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0253 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0162 A[RETURN] */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long E() {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.E():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long F() {
        int i;
        int i2;
        int i3;
        byte[] bArr = this.A;
        int i4 = this.c;
        byte b = bArr[i4];
        this.F = b;
        if (b == 121 && (i2 = bArr[(i = i4 + 1)]) > 8 && i2 <= 63) {
            if (i2 <= 47) {
                i3 = i + 1;
            } else {
                i2 = ((i2 - 56) << 8) + (bArr[i + 1] & 255);
                i3 = i + 2;
            }
            int i5 = 0;
            long j = -3750763034362895579L;
            int i6 = i3;
            while (i5 < i2) {
                j = (j ^ bArr[i6]) * com.alibaba.fastjson2.util.c.MAGIC_PRIME;
                i5++;
                i6++;
            }
            byte b2 = bArr[i6];
            if (b2 >= 0 && b2 <= 47) {
                int i7 = i6 + 1;
                if (b2 == 0) {
                    this.L = i3;
                    this.M = i2;
                    this.N = b;
                    this.K = j;
                } else {
                    int i8 = b2 << 1;
                    int i9 = i8 + 2;
                    long[] jArr = this.O;
                    if (jArr == null) {
                        this.O = new long[Math.max(i9, 32)];
                    } else if (jArr.length < i9) {
                        this.O = Arrays.copyOf(jArr, i9 + 16);
                    }
                    this.O[i8 + 1] = (i3 << 32) + (i2 << 8) + b;
                }
                this.G = i3;
                this.E = i2;
                this.c = i7;
                return j;
            }
        }
        return be();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long G() {
        int aS;
        boolean z2;
        int i;
        long j;
        long j2;
        int i2;
        long j3;
        int i3;
        long j4;
        byte b;
        byte[] bArr = this.A;
        int i4 = this.c;
        this.c = i4 + 1;
        byte b2 = bArr[i4];
        this.F = b2;
        boolean z3 = b2 == Byte.MAX_VALUE;
        byte b3 = b2;
        if (z3) {
            byte b4 = bArr[this.c];
            this.F = b4;
            if (b4 >= -16 && b4 <= 72) {
                if (b4 <= 47) {
                    this.c++;
                    b = b4;
                } else {
                    b = R();
                }
                if (b < 0) {
                    return this.J.b(-b);
                }
                if (b == 0) {
                    this.F = this.N;
                    this.E = this.M;
                    this.G = this.L;
                    if (this.K == 0) {
                        this.K = aU();
                    }
                    return this.K;
                }
                int i5 = b << 1;
                long[] jArr = this.O;
                long j5 = jArr[i5 + 1];
                int i6 = (int) j5;
                this.F = (byte) i6;
                this.E = i6 >> 8;
                this.G = (int) (j5 >> 32);
                long j6 = jArr[i5];
                if (j6 != 0) {
                    return j6;
                }
                long aU = aU();
                this.O[i5] = aU;
                return aU;
            }
            this.c++;
            b3 = b4;
        }
        if (b3 >= 73 && b3 <= 120) {
            aS = b3 - 73;
        } else if (b3 != 121 && b3 != 122) {
            throw e();
        } else {
            aS = aS();
        }
        this.E = aS;
        this.G = this.c;
        if (aS < 0) {
            j2 = this.J.b(-aS);
            z2 = z3;
        } else {
            if (aS <= 8 && this.c + aS <= bArr.length) {
                int i7 = this.c;
                switch (aS) {
                    case 1:
                        z2 = z3;
                        i = aS;
                        j = bArr[i7];
                        break;
                    case 2:
                        z2 = z3;
                        i = aS;
                        j = e.UNSAFE.getShort(bArr, x + i7) & 65535;
                        break;
                    case 3:
                        z2 = z3;
                        i = aS;
                        j = (bArr[i7 + 2] << 16) + (e.UNSAFE.getShort(bArr, x + i7) & 65535);
                        break;
                    case 4:
                        z2 = z3;
                        j = e.UNSAFE.getInt(bArr, x + i7);
                        i = aS;
                        break;
                    case 5:
                        z2 = z3;
                        j3 = bArr[i7 + 4] << 32;
                        i3 = e.UNSAFE.getInt(bArr, x + i7);
                        j = j3 + (i3 & 4294967295L);
                        i = aS;
                        break;
                    case 6:
                        z2 = z3;
                        j3 = e.UNSAFE.getShort(bArr, (x + j4) + 4) << 32;
                        i3 = e.UNSAFE.getInt(bArr, x + i7);
                        j = j3 + (i3 & 4294967295L);
                        i = aS;
                        break;
                    case 7:
                        z2 = z3;
                        j = (e.UNSAFE.getInt(bArr, x + i7) & 4294967295L) + (bArr[i7 + 6] << 48) + ((bArr[i7 + 5] & 255) << 40) + ((bArr[i7 + 4] & 255) << 32);
                        i = aS;
                        break;
                    default:
                        z2 = z3;
                        i = aS;
                        j = e.UNSAFE.getLong(bArr, x + i7);
                        break;
                }
            } else {
                z2 = z3;
                i = aS;
                j = 0;
            }
            if (j != 0) {
                this.c += i;
                j2 = j;
                aS = i;
            } else {
                j2 = -3750763034362895579L;
                aS = i;
                for (int i8 = 0; i8 < aS; i8++) {
                    this.c = this.c + 1;
                    j2 = (bArr[i2] ^ j2) * com.alibaba.fastjson2.util.c.MAGIC_PRIME;
                }
            }
        }
        if (z2) {
            int i9 = bArr[this.c];
            if (i9 < -16 || i9 > 47) {
                i9 = R();
            } else {
                this.c++;
            }
            if (i9 == 0) {
                this.L = this.G;
                this.M = aS;
                this.N = b3;
                this.K = j2;
            } else {
                int i10 = i9 << 1;
                int i11 = i10 + 2;
                long[] jArr2 = this.O;
                if (jArr2 == null) {
                    this.O = new long[Math.max(i11, 32)];
                } else if (jArr2.length < i11) {
                    this.O = Arrays.copyOf(jArr2, i11 + 16);
                }
                long[] jArr3 = this.O;
                jArr3[i10] = j2;
                jArr3[i10 + 1] = (this.G << 32) + (aS << 8) + b3;
            }
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long H() {
        /*
            r15 = this;
            int r0 = r15.G
            r1 = 0
            r2 = 0
            r4 = r0
            r5 = r2
            r0 = 0
        L8:
            int r7 = r15.E
            r8 = 45
            r9 = 90
            r10 = 95
            r11 = 65
            r12 = 32
            if (r0 >= r7) goto L87
            byte[] r7 = r15.A
            r13 = r7[r4]
            if (r13 < 0) goto L84
            r14 = 8
            if (r0 >= r14) goto L84
            if (r0 != 0) goto L29
            int r14 = r15.G
            r7 = r7[r14]
            if (r7 != 0) goto L29
            goto L84
        L29:
            if (r13 == r10) goto L2f
            if (r13 == r8) goto L2f
            if (r13 != r12) goto L37
        L2f:
            byte[] r7 = r15.A
            int r8 = r4 + 1
            r7 = r7[r8]
            if (r7 != r13) goto L81
        L37:
            if (r13 < r11) goto L3e
            if (r13 > r9) goto L3e
            int r13 = r13 + 32
            byte r13 = (byte) r13
        L3e:
            switch(r0) {
                case 0: goto L7e;
                case 1: goto L76;
                case 2: goto L6f;
                case 3: goto L68;
                case 4: goto L60;
                case 5: goto L56;
                case 6: goto L4c;
                case 7: goto L42;
                default: goto L41;
            }
        L41:
            goto L7f
        L42:
            long r7 = (long) r13
            r9 = 56
            long r7 = r7 << r9
            r9 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            goto L7b
        L4c:
            long r7 = (long) r13
            r9 = 48
            long r7 = r7 << r9
            r9 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L7b
        L56:
            long r7 = (long) r13
            r9 = 40
            long r7 = r7 << r9
            r9 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L7b
        L60:
            long r7 = (long) r13
            long r7 = r7 << r12
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L7b
        L68:
            int r7 = r13 << 24
            long r7 = (long) r7
            r9 = 16777215(0xffffff, double:8.2890456E-317)
            goto L7b
        L6f:
            int r7 = r13 << 16
            long r7 = (long) r7
            r9 = 65535(0xffff, double:3.23786E-319)
            goto L7b
        L76:
            int r7 = r13 << 8
            long r7 = (long) r7
            r9 = 255(0xff, double:1.26E-321)
        L7b:
            long r5 = r5 & r9
            long r5 = r5 + r7
            goto L7f
        L7e:
            long r5 = (long) r13
        L7f:
            int r0 = r0 + 1
        L81:
            int r4 = r4 + 1
            goto L8
        L84:
            int r4 = r15.G
            r5 = r2
        L87:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L8c
            return r5
        L8c:
            r2 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L91:
            int r0 = r15.E
            if (r1 >= r0) goto Lb5
            byte[] r0 = r15.A
            int r5 = r4 + 1
            r0 = r0[r4]
            if (r0 < r11) goto La2
            if (r0 > r9) goto La2
            int r0 = r0 + 32
            byte r0 = (byte) r0
        La2:
            if (r0 == r10) goto Lb1
            if (r0 == r8) goto Lb1
            if (r0 == r12) goto Lb1
            long r6 = (long) r0
            long r2 = r2 ^ r6
            r6 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r2 = r2 * r6
        Lb1:
            int r1 = r1 + 1
            r4 = r5
            goto L91
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.H():long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0707  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String I() {
        /*
            Method dump skipped, instructions count: 2260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.I():java.lang.String");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String J() {
        return aG();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long L() {
        return G();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.N():void");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean O() {
        return this.A[this.c] == -111;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] P() {
        String az = az();
        byte[] bArr = new byte[az.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i << 1;
            char charAt = az.charAt(i2);
            char charAt2 = az.charAt(i2 + 1);
            char c = '0';
            int i3 = charAt - (charAt <= '9' ? '0' : '7');
            if (charAt2 > '9') {
                c = '7';
            }
            bArr[i] = (byte) ((charAt2 - c) | (i3 << 4));
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] Q() {
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if (b == -111) {
            int aS = aS();
            byte[] bArr2 = new byte[aS];
            System.arraycopy(this.A, this.c, bArr2, 0, aS);
            this.c += aS;
            return bArr2;
        }
        throw c(b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r1 <= 47) goto L5;
     */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int R() {
        /*
            r4 = this;
            byte[] r0 = r4.A
            int r1 = r4.c
            int r2 = r1 + 1
            r1 = r0[r1]
            r3 = -16
            if (r1 < r3) goto L11
            r3 = 47
            if (r1 > r3) goto L11
            goto L3e
        L11:
            r3 = 48
            if (r1 < r3) goto L25
            r3 = 63
            if (r1 > r3) goto L25
            int r1 = r1 + (-56)
            int r1 = r1 << 8
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L3e
        L25:
            r3 = 64
            if (r1 < r3) goto L34
            r3 = 71
            if (r1 > r3) goto L34
            int r1 = a(r0, r2, r1)
            int r2 = r2 + 2
            goto L3e
        L34:
            r3 = 72
            if (r1 != r3) goto L41
            int r1 = com.alibaba.fastjson2.util.d.a(r0, r2)
            int r2 = r2 + 4
        L3e:
            r4.c = r2
            return r1
        L41:
            r4.c = r2
            int r0 = r4.b(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.R():int");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean S() {
        if (this.A[this.c] == -110) {
            this.c++;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r1 <= 47) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    @Override // com.alibaba.fastjson2.JSONReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Integer T() {
        /*
            r7 = this;
            byte[] r0 = r7.A
            int r1 = r7.c
            int r2 = r1 + 1
            r1 = r0[r1]
            r3 = -81
            if (r1 != r3) goto L10
            r7.c = r2
            r0 = 0
            return r0
        L10:
            r3 = -16
            if (r1 < r3) goto L19
            r3 = 47
            if (r1 > r3) goto L19
            goto L63
        L19:
            r3 = 48
            if (r1 < r3) goto L2d
            r3 = 63
            if (r1 > r3) goto L2d
            int r1 = r1 + (-56)
            int r1 = r1 << 8
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r0
            int r2 = r2 + 1
            goto L63
        L2d:
            r3 = 64
            if (r1 < r3) goto L4a
            r3 = 71
            if (r1 > r3) goto L4a
            int r1 = r1 + (-68)
            int r1 = r1 << 16
            r3 = r0[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r1 = r1 + r3
            int r3 = r2 + 1
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r0
            int r2 = r2 + 2
            goto L63
        L4a:
            r3 = 72
            if (r1 != r3) goto L6a
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.e.UNSAFE
            long r3 = com.alibaba.fastjson2.util.e.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            int r0 = r1.getInt(r0, r3)
            boolean r1 = com.alibaba.fastjson2.util.e.BIG_ENDIAN
            if (r1 != 0) goto L60
            int r0 = java.lang.Integer.reverseBytes(r0)
        L60:
            r1 = r0
            int r2 = r2 + 4
        L63:
            r7.c = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L6a:
            r7.c = r2
            int r0 = r7.b(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.T():java.lang.Integer");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void W() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long[] X() {
        if (a((byte) -110)) {
            long F = F();
            if (F != dl.HASH_TYPE && F != dk.HASH_TYPE && F != dh.HASH_TYPE && F != di.HASH_TYPE) {
                throw new JSONException(d("not support " + aG()));
            }
        }
        int t = t();
        if (t == -1) {
            return null;
        }
        long[] jArr = new long[t];
        for (int i = 0; i < t; i++) {
            jArr[i] = Y();
        }
        return jArr;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long Y() {
        long j;
        this.h = false;
        byte[] bArr = this.A;
        int i = this.c;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= -40 && b <= -17) {
            j = (b - (-40)) - 8;
        } else if (b >= -56 && b <= -41) {
            j = ((b + 48) << 8) + (bArr[i2] & 255);
            i2++;
        } else if (b >= -64 && b <= -57) {
            j = ((b + 60) << 16) + ((bArr[i2] & 255) << 8) + (bArr[i2 + 1] & 255);
            i2 += 2;
        } else if (b == -65) {
            j = com.alibaba.fastjson2.util.d.a(bArr, i2);
            i2 += 4;
        } else if (b != -66) {
            this.c = i2;
            return a(bArr, b);
        } else {
            j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + i2);
            if (!e.BIG_ENDIAN) {
                j = Long.reverseBytes(j);
            }
            i2 += 8;
        }
        this.c = i2;
        return j;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Long Z() {
        long j;
        byte[] bArr = this.A;
        int i = this.c;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b == -81) {
            this.c = i2;
            return null;
        }
        if (b >= -40 && b <= -17) {
            j = (b - (-40)) - 8;
        } else if (b >= -56 && b <= -41) {
            j = ((b + 48) << 8) + (bArr[i2] & 255);
            i2++;
        } else if (b >= -64 && b <= -57) {
            j = ((b + 60) << 16) + ((bArr[i2] & 255) << 8) + (bArr[i2 + 1] & 255);
            i2 += 2;
        } else if (b == -65) {
            int i3 = e.UNSAFE.getInt(bArr, e.ARRAY_BYTE_BASE_OFFSET + i2);
            if (!e.BIG_ENDIAN) {
                i3 = Integer.reverseBytes(i3);
            }
            j = i3;
            i2 += 4;
        } else if (b != -66) {
            this.c = i2;
            return Long.valueOf(a(bArr, b));
        } else {
            j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + i2);
            if (!e.BIG_ENDIAN) {
                j = Long.reverseBytes(j);
            }
            i2 += 8;
        }
        this.c = i2;
        return Long.valueOf(j);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public bu a(Class cls, long j, long j2) {
        Class bm_;
        ClassLoader classLoader;
        ClassLoader contextClassLoader;
        bu a2;
        bu a3;
        Class bm_2;
        bu buVar = null;
        if (this.A[this.c] == -110) {
            this.c++;
            long F = F();
            ObjectReaderProvider objectReaderProvider = this.f2934a.w;
            if (j == F && (bm_2 = (a3 = this.f2934a.a(cls)).bm_()) != null && bm_2 == cls) {
                objectReaderProvider.a(F, a3);
                return a3;
            }
            JSONReader.a aVar = this.f2934a.u;
            if (aVar != null) {
                Class<?> a4 = aVar.a(F, cls, j2);
                if (a4 == null) {
                    a4 = aVar.a(aG(), cls, j2);
                }
                if (a4 != null && (a2 = this.f2934a.a(a4)) != null) {
                    return a2;
                }
            }
            long j3 = this.f2934a.p | j2;
            if ((JSONReader.Feature.SupportAutoType.mask & j3) == 0) {
                if ((JSONReader.Feature.ErrorOnNotSupportAutoType.mask & j3) == 0) {
                    return null;
                }
                aT();
            }
            bu a5 = objectReaderProvider.a(F);
            if (a5 != null && (bm_ = a5.bm_()) != null && (classLoader = bm_.getClassLoader()) != null && classLoader != (contextClassLoader = Thread.currentThread().getContextClassLoader())) {
                a5 = a(a5, bm_, contextClassLoader);
            }
            if (a5 == null) {
                bu a6 = objectReaderProvider.a(aG(), cls, j3);
                if (a6 == null) {
                    aT();
                }
                buVar = a6;
            } else {
                buVar = a5;
            }
            this.D = this.A[this.c];
        }
        return buVar;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void a(JSONReader.e eVar) {
        this.c = eVar.f2938a;
        this.D = (byte) eVar.b;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void a(Map map, long j) {
        Object obj;
        if (this.A[this.c] != -90) {
            throw new JSONException("object not support input " + b(this.D));
        }
        this.c++;
        while (true) {
            byte b = this.A[this.c];
            if (b == -91) {
                this.c++;
                return;
            }
            Object I = b >= 73 ? I() : aM();
            if (u()) {
                String v = v();
                if ("..".equals(v)) {
                    map.put(I, map);
                } else {
                    a(map, I, d.a(v));
                    obj = null;
                    map.put(I, obj);
                }
            } else {
                byte b2 = this.A[this.c];
                if (b2 >= 73 && b2 <= 126) {
                    obj = az();
                } else if (b2 >= -16 && b2 <= 47) {
                    this.c++;
                    obj = Integer.valueOf(b2);
                } else if (b2 == -79) {
                    this.c++;
                    obj = Boolean.TRUE;
                } else if (b2 == -80) {
                    this.c++;
                    obj = Boolean.FALSE;
                } else {
                    obj = b2 == -90 ? aI() : aM();
                }
                if (obj == null && (this.f2934a.p & JSONReader.Feature.IgnoreNullPropertyValue.mask) != 0) {
                }
                map.put(I, obj);
            }
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean a(byte b) {
        if (this.A[this.c] == b) {
            this.c++;
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean a(char c) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean a(char c, char c2, char c3, char c4, char c5) {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Date aA() {
        com.alibaba.fastjson2.time.c cVar;
        byte b = this.A[this.c];
        if (b == -87) {
            this.c++;
            byte[] bArr = this.A;
            int i = this.c;
            this.c = i + 1;
            byte[] bArr2 = this.A;
            int i2 = this.c;
            this.c = i2 + 1;
            int i3 = (bArr[i] << 8) + (bArr2[i2] & 255);
            byte[] bArr3 = this.A;
            int i4 = this.c;
            this.c = i4 + 1;
            byte b2 = bArr3[i4];
            byte[] bArr4 = this.A;
            int i5 = this.c;
            this.c = i5 + 1;
            cVar = com.alibaba.fastjson2.time.b.a(i3, b2, bArr4[i5]).a();
        } else if (b == -88) {
            this.c++;
            byte[] bArr5 = this.A;
            int i6 = this.c;
            this.c = i6 + 1;
            byte[] bArr6 = this.A;
            int i7 = this.c;
            this.c = i7 + 1;
            int i8 = (bArr5[i6] << 8) + (bArr6[i7] & 255);
            byte[] bArr7 = this.A;
            int i9 = this.c;
            this.c = i9 + 1;
            byte b3 = bArr7[i9];
            byte[] bArr8 = this.A;
            int i10 = this.c;
            this.c = i10 + 1;
            byte b4 = bArr8[i10];
            byte[] bArr9 = this.A;
            int i11 = this.c;
            this.c = i11 + 1;
            byte b5 = bArr9[i11];
            byte[] bArr10 = this.A;
            int i12 = this.c;
            this.c = i12 + 1;
            byte b6 = bArr10[i12];
            byte[] bArr11 = this.A;
            int i13 = this.c;
            this.c = i13 + 1;
            cVar = com.alibaba.fastjson2.time.c.a(i8, b3, b4, b5, b6, bArr11[i13], R());
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.a(this.f2934a.d()).b();
        }
        long a2 = DateUtils.a(az(), com.alibaba.fastjson2.time.e.b);
        if (a2 != 0) {
            return new Date(a2);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String[] aC() {
        if (a((byte) -110) && F() != ef.HASH_TYPE) {
            throw new JSONException(d("not support type " + aG()));
        }
        int t = t();
        if (t == -1) {
            return null;
        }
        String[] strArr = new String[t];
        for (int i = 0; i < t; i++) {
            strArr[i] = az();
        }
        return strArr;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public char aD() {
        int i;
        byte b = this.A[this.c];
        if (b == -112) {
            this.c++;
            i = R();
        } else if (b == 73) {
            this.c++;
            return (char) 0;
        } else if (b <= 73 || b >= 120) {
            String az = az();
            if (az != null && !az.isEmpty()) {
                return az.charAt(0);
            }
            return (char) 0;
        } else {
            this.c++;
            byte[] bArr = this.A;
            int i2 = this.c;
            this.c = i2 + 1;
            i = bArr[i2] & 255;
        }
        return (char) i;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void aE() {
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        this.D = bArr[i];
        if (this.D == -81) {
            return;
        }
        throw new JSONException("null not match, " + ((int) this.D));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean aF() {
        if (this.A[this.c] == -81) {
            this.c++;
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String aG() {
        Charset charset;
        byte b = this.F;
        int i = this.E;
        if (b == -81) {
            return null;
        }
        if (i < 0) {
            return this.J.a(-i);
        }
        if (b == 121 || (b >= 73 && b <= 120)) {
            charset = StandardCharsets.ISO_8859_1;
            if (e.ANDROID_SDK_INT < 34) {
                int i2 = this.G;
                char[] cArr = this.Q;
                if (cArr == null) {
                    cArr = JSONFactory.u.getAndSet(this.I, null);
                    this.Q = cArr;
                }
                if (cArr == null || cArr.length < i) {
                    cArr = new char[i];
                    this.Q = cArr;
                }
                for (int i3 = 0; i3 < i; i3++) {
                    cArr[i3] = (char) (this.A[i2 + i3] & 255);
                }
                return new String(cArr, 0, i);
            }
        } else if (b == 122) {
            charset = StandardCharsets.UTF_8;
        } else if (b == 123) {
            charset = StandardCharsets.UTF_16;
        } else if (b == 124) {
            charset = StandardCharsets.UTF_16LE;
        } else if (b != 125) {
            throw c(b);
        } else {
            charset = StandardCharsets.UTF_16BE;
        }
        return new String(this.A, this.G, i, charset);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Map<String, Object> aI() {
        Object obj;
        int i;
        List arrayList;
        int i2;
        List list;
        String str;
        byte[] bArr = this.A;
        long j = this.f2934a.p;
        int i3 = this.c;
        this.c = i3 + 1;
        this.D = bArr[i3];
        byte b = this.D;
        Object obj2 = null;
        if (b == -81) {
            return null;
        }
        byte b2 = -90;
        if (b < -90) {
            if (b != -110) {
                throw c(b);
            }
            return (Map) a(Map.class, 0L, 0L).a(this, (Type) null, (Object) null, 0L);
        }
        Map hashMap = (JSONReader.Feature.UseNativeObject.mask & j) != 0 ? new HashMap() : this.f2934a.s != null ? this.f2934a.s.get() : new JSONObject();
        while (true) {
            byte b3 = bArr[this.c];
            if (b3 == -91) {
                this.c++;
                return hashMap;
            }
            Object I = b3 >= 73 ? I() : aM();
            byte b4 = bArr[this.c];
            if (b4 == -109) {
                String v = v();
                if ("..".equals(v)) {
                    hashMap.put(I, hashMap);
                } else {
                    a(hashMap, I, d.a(v));
                }
                obj = obj2;
            } else {
                if (b4 >= 73 && b4 <= 126) {
                    str = az();
                } else if (b4 >= -16 && b4 <= 47) {
                    this.c++;
                    str = Integer.valueOf(b4);
                } else if (b4 == -79) {
                    this.c++;
                    str = Boolean.TRUE;
                } else if (b4 == -80) {
                    this.c++;
                    str = Boolean.FALSE;
                } else if (b4 == b2) {
                    str = aI();
                } else if (b4 == -66) {
                    this.c++;
                    long j2 = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                    this.c += 8;
                    if (!e.BIG_ENDIAN) {
                        j2 = Long.reverseBytes(j2);
                    }
                    str = Long.valueOf(j2);
                } else {
                    if (b4 < -108 || b4 > -92) {
                        obj = null;
                        if (b4 >= 48 && b4 <= 63) {
                            Integer valueOf = Integer.valueOf(((b4 - 56) << 8) + (bArr[this.c + 1] & 255));
                            this.c += 2;
                            list = valueOf;
                        } else if (b4 >= 64 && b4 <= 71) {
                            int a2 = a(bArr, this.c + 1, b4);
                            this.c += 3;
                            list = new Integer(a2);
                        } else if (b4 == 72) {
                            int a3 = com.alibaba.fastjson2.util.d.a(bArr, this.c + 1);
                            this.c += 5;
                            list = new Integer(a3);
                        } else {
                            list = aM();
                        }
                    } else {
                        this.c++;
                        if (b4 == -92) {
                            i = bArr[this.c];
                            if (i >= -16 && i <= 47) {
                                i2 = this.c + 1;
                            } else if (i < 48 || i > 63) {
                                i = aS();
                            } else {
                                i = ((i - 56) << 8) + (bArr[this.c + 1] & 255);
                                i2 = this.c + 2;
                            }
                            this.c = i2;
                        } else {
                            i = b4 + 108;
                        }
                        if (i == 0) {
                            arrayList = (JSONReader.Feature.UseNativeObject.mask & j) != 0 ? new ArrayList() : this.f2934a.t != null ? this.f2934a.t.get() : new JSONArray();
                        } else {
                            arrayList = (JSONReader.Feature.UseNativeObject.mask & j) != 0 ? new ArrayList(i) : this.f2934a.t != null ? this.f2934a.t.get() : new JSONArray(i);
                            for (int i4 = 0; i4 < i; i4++) {
                                byte b5 = bArr[this.c];
                                if (b5 == -109) {
                                    String v2 = v();
                                    if ("..".equals(v2)) {
                                        arrayList.add(arrayList);
                                    } else {
                                        arrayList.add(null);
                                        a((Collection) arrayList, i4, d.a(v2));
                                    }
                                } else {
                                    arrayList.add((b5 < 73 || b5 > 126) ? b5 == -90 ? aI() : aM() : az());
                                }
                            }
                        }
                        obj = null;
                        list = arrayList;
                    }
                    if (list == null || (JSONReader.Feature.IgnoreNullPropertyValue.mask & j) == 0) {
                        hashMap.put(I, list);
                    }
                }
                obj = obj2;
                list = str;
                if (list == null) {
                }
                hashMap.put(I, list);
            }
            obj2 = obj;
            b2 = -90;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Boolean aK() {
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if (b == -81) {
            return null;
        }
        return Boolean.valueOf(b == -79 ? true : b == -80 ? false : h(b));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean aL() {
        this.h = false;
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if (b == -79) {
            return true;
        }
        if (b != -80) {
            return h(b);
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Object aM() {
        Object I;
        Object obj;
        String str;
        com.alibaba.fastjson2.time.e c;
        int i;
        int i2;
        int i3 = this.c;
        byte[] bArr = this.A;
        String str2 = "/";
        if (i3 >= bArr.length) {
            throw new JSONException("readAny overflow : " + this.c + str2 + this.A.length);
        }
        int i4 = this.c;
        this.c = i4 + 1;
        this.D = bArr[i4];
        byte b = this.D;
        if (b == 72) {
            int a2 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
            this.c += 4;
            return new Integer(a2);
        }
        Class cls = null;
        int i5 = 0;
        boolean z2 = true;
        switch (b) {
            case -112:
                return Character.valueOf((char) R());
            case -111:
                int aS = aS();
                byte[] copyOfRange = Arrays.copyOfRange(this.A, this.c, this.c + aS);
                this.c += aS;
                return copyOfRange;
            case -110:
                boolean z3 = true;
                long F = F();
                if (this.f2934a.u != null) {
                    Class<?> a3 = this.f2934a.u.a(F, (Class<?>) null, this.f2934a.p);
                    if (a3 == null) {
                        a3 = this.f2934a.u.a(aG(), (Class<?>) null, this.f2934a.p);
                    }
                    if (a3 != null) {
                        return this.f2934a.a(a3).b(this, null, null, 0L);
                    }
                }
                if ((this.f2934a.p & JSONReader.Feature.SupportAutoType.mask) == 0) {
                    z3 = false;
                }
                if (!z3) {
                    if (x()) {
                        return aI();
                    }
                    if (w()) {
                        return aN();
                    }
                    throw new JSONException("auoType not support , offset " + this.c + str2 + this.A.length);
                }
                bu a4 = this.f2934a.a(F);
                if (a4 == null) {
                    String aG = aG();
                    bu a5 = this.f2934a.a(aG, null);
                    if (a5 == null) {
                        throw new JSONException("auoType not support : " + aG + ", offset " + this.c + str2 + this.A.length);
                    }
                    a4 = a5;
                }
                return a4.b(this, null, null, 0L);
            default:
                byte b2 = -16;
                byte b3 = 73;
                switch (b) {
                    case -90:
                        boolean z4 = (this.f2934a.p & JSONReader.Feature.SupportAutoType.mask) != 0;
                        Map map = null;
                        while (true) {
                            byte b4 = this.A[this.c];
                            if (b4 == -91) {
                                int i6 = this.c;
                                int i7 = z2 ? 1 : 0;
                                int i8 = z2 ? 1 : 0;
                                this.c = i6 + i7;
                                return map == null ? (this.f2934a.p & JSONReader.Feature.UseNativeObject.mask) != 0 ? new HashMap() : new JSONObject() : map;
                            }
                            if (!z4 || i5 != 0 || b4 < b3) {
                                I = b4 >= b3 ? I() : aM();
                            } else if (G() == bu.HASH_TYPE) {
                                bu a6 = this.f2934a.a(E());
                                if (a6 == null) {
                                    String aG2 = aG();
                                    bu a7 = this.f2934a.a(aG2, cls);
                                    if (a7 == null) {
                                        throw new JSONException("auotype not support : " + aG2 + ", offset " + this.c + str2 + this.A.length);
                                    }
                                    a6 = a7;
                                }
                                this.u = z2;
                                return a6.b(this, null, null, 0L);
                            } else {
                                I = aG();
                            }
                            if (map == null) {
                                map = (JSONReader.Feature.UseNativeObject.mask & this.f2934a.p) != 0 ? new HashMap() : this.f2934a.s != null ? this.f2934a.s.get() : new JSONObject();
                            }
                            if (u()) {
                                String v = v();
                                if ("..".equals(v)) {
                                    map.put(I, map);
                                } else {
                                    a(map, I, d.a(v));
                                    map.put(I, cls);
                                }
                                str = str2;
                            } else {
                                byte b5 = this.A[this.c];
                                if (b5 < b3 || b5 > 126) {
                                    if (b5 >= b2 && b5 <= 47) {
                                        this.c++;
                                        obj = Integer.valueOf(b5);
                                    }
                                    if (b5 == -79) {
                                        this.c++;
                                        obj = Boolean.TRUE;
                                    } else if (b5 == -80) {
                                        this.c++;
                                        obj = Boolean.FALSE;
                                    } else {
                                        obj = b5 == -90 ? aI() : aM();
                                    }
                                } else {
                                    obj = az();
                                }
                                if (obj == null) {
                                    str = str2;
                                    if ((JSONReader.Feature.IgnoreNullPropertyValue.mask & this.f2934a.p) != 0) {
                                    }
                                } else {
                                    str = str2;
                                }
                                map.put(I, obj);
                            }
                            i5++;
                            str2 = str;
                            cls = null;
                            z2 = true;
                            b2 = -16;
                            b3 = 73;
                        }
                        break;
                    case -89:
                        byte[] bArr2 = this.A;
                        int i9 = this.c;
                        this.c = i9 + 1;
                        byte b6 = bArr2[i9];
                        byte[] bArr3 = this.A;
                        int i10 = this.c;
                        this.c = i10 + 1;
                        byte b7 = bArr3[i10];
                        byte[] bArr4 = this.A;
                        int i11 = this.c;
                        this.c = i11 + 1;
                        return com.alibaba.fastjson2.time.d.a(b6, b7, bArr4[i11], R());
                    case -88:
                        byte[] bArr5 = this.A;
                        int i12 = this.c;
                        this.c = i12 + 1;
                        byte[] bArr6 = this.A;
                        int i13 = this.c;
                        this.c = i13 + 1;
                        int i14 = (bArr5[i12] << 8) + (bArr6[i13] & 255);
                        byte[] bArr7 = this.A;
                        int i15 = this.c;
                        this.c = i15 + 1;
                        byte b8 = bArr7[i15];
                        byte[] bArr8 = this.A;
                        int i16 = this.c;
                        this.c = i16 + 1;
                        byte b9 = bArr8[i16];
                        byte[] bArr9 = this.A;
                        int i17 = this.c;
                        this.c = i17 + 1;
                        byte b10 = bArr9[i17];
                        byte[] bArr10 = this.A;
                        int i18 = this.c;
                        this.c = i18 + 1;
                        byte b11 = bArr10[i18];
                        byte[] bArr11 = this.A;
                        int i19 = this.c;
                        this.c = i19 + 1;
                        return com.alibaba.fastjson2.time.c.a(i14, b8, b9, b10, b11, bArr11[i19], R());
                    case -87:
                        byte[] bArr12 = this.A;
                        int i20 = this.c;
                        this.c = i20 + 1;
                        byte[] bArr13 = this.A;
                        int i21 = this.c;
                        this.c = i21 + 1;
                        int i22 = (bArr12[i20] << 8) + (bArr13[i21] & 255);
                        byte[] bArr14 = this.A;
                        int i23 = this.c;
                        this.c = i23 + 1;
                        byte b12 = bArr14[i23];
                        byte[] bArr15 = this.A;
                        int i24 = this.c;
                        this.c = i24 + 1;
                        return com.alibaba.fastjson2.time.b.a(i22, b12, bArr15[i24]);
                    case -86:
                        byte[] bArr16 = this.A;
                        int i25 = this.c;
                        this.c = i25 + 1;
                        byte[] bArr17 = this.A;
                        int i26 = this.c;
                        this.c = i26 + 1;
                        int i27 = (bArr16[i25] << 8) + (bArr17[i26] & 255);
                        byte[] bArr18 = this.A;
                        int i28 = this.c;
                        this.c = i28 + 1;
                        byte b13 = bArr18[i28];
                        byte[] bArr19 = this.A;
                        int i29 = this.c;
                        this.c = i29 + 1;
                        byte b14 = bArr19[i29];
                        byte[] bArr20 = this.A;
                        int i30 = this.c;
                        this.c = i30 + 1;
                        byte b15 = bArr20[i30];
                        byte[] bArr21 = this.A;
                        int i31 = this.c;
                        this.c = i31 + 1;
                        byte b16 = bArr21[i31];
                        byte[] bArr22 = this.A;
                        int i32 = this.c;
                        this.c = i32 + 1;
                        byte b17 = bArr22[i32];
                        int R = R();
                        byte[] bArr23 = y;
                        if (this.c + bArr23.length < this.A.length) {
                            int i33 = 0;
                            while (true) {
                                if (i33 >= bArr23.length) {
                                    i5 = 1;
                                } else if (this.A[this.c + i33] == bArr23[i33]) {
                                    i33++;
                                }
                            }
                        }
                        if (i5 != 0) {
                            this.c += bArr23.length;
                            c = com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID;
                        } else {
                            c = DateUtils.c(az(), com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID);
                        }
                        return com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.c.a(i27, b13, b14, b15, b16, b17, R), c);
                    case -85:
                        long j = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                        this.c += 8;
                        if (!e.BIG_ENDIAN) {
                            j = Long.reverseBytes(j);
                        }
                        return new Date(j);
                    case -84:
                        this.c += 4;
                        return new Date(com.alibaba.fastjson2.util.d.a(this.A, this.c) * 1000);
                    case -83:
                        this.c += 4;
                        return new Date(com.alibaba.fastjson2.util.d.a(this.A, this.c) * 60 * 1000);
                    case -82:
                        return com.alibaba.fastjson2.time.a.a(Y(), R());
                    case -81:
                        return null;
                    case -80:
                        return false;
                    case -79:
                        return true;
                    case -78:
                        return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
                    case -77:
                        return Double.valueOf(1.0d);
                    case -76:
                        return Double.valueOf(Y());
                    case -75:
                        long j2 = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                        this.c += 8;
                        if (!e.BIG_ENDIAN) {
                            j2 = Long.reverseBytes(j2);
                        }
                        return Double.valueOf(Double.longBitsToDouble(j2));
                    case -74:
                        return Float.valueOf(R());
                    case -73:
                        int a8 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                        this.c += 4;
                        return Float.valueOf(Float.intBitsToFloat(a8));
                    case -72:
                        return BigDecimal.valueOf(Y());
                    case -71:
                        int R2 = R();
                        BigInteger af = af();
                        return R2 == 0 ? new BigDecimal(af) : new BigDecimal(af, R2);
                    case -70:
                        return BigInteger.valueOf(Y());
                    case -69:
                        int R3 = R();
                        byte[] bArr24 = new byte[R3];
                        System.arraycopy(this.A, this.c, bArr24, 0, R3);
                        this.c += R3;
                        return new BigInteger(bArr24);
                    case -68:
                        byte[] bArr25 = this.A;
                        int i34 = this.c;
                        this.c = i34 + 1;
                        byte[] bArr26 = this.A;
                        int i35 = this.c;
                        this.c = i35 + 1;
                        return Short.valueOf((short) ((bArr25[i34] << 8) + (bArr26[i35] & 255)));
                    case -67:
                        byte[] bArr27 = this.A;
                        int i36 = this.c;
                        this.c = i36 + 1;
                        return Byte.valueOf(bArr27[i36]);
                    case -66:
                        long j3 = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                        this.c += 8;
                        if (!e.BIG_ENDIAN) {
                            j3 = Long.reverseBytes(j3);
                        }
                        return Long.valueOf(j3);
                    case -65:
                        int a9 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                        this.c += 4;
                        return new Long(a9);
                    default:
                        switch (b) {
                            case 122:
                                int aS2 = aS();
                                String str3 = new String(this.A, this.c, aS2, StandardCharsets.UTF_8);
                                this.c += aS2;
                                return str3;
                            case 123:
                                int aS3 = aS();
                                String str4 = new String(this.A, this.c, aS3, StandardCharsets.UTF_16);
                                this.c += aS3;
                                return str4;
                            case 124:
                                int aS4 = aS();
                                String str5 = new String(this.A, this.c, aS4, StandardCharsets.UTF_16LE);
                                this.c += aS4;
                                return str5;
                            case 125:
                                int aS5 = aS();
                                String str6 = new String(this.A, this.c, aS5, StandardCharsets.UTF_16BE);
                                this.c += aS5;
                                return str6;
                            case 126:
                                if (z == null) {
                                    z = Charset.forName("GB18030");
                                }
                                int aS6 = aS();
                                String str7 = new String(this.A, this.c, aS6, z);
                                this.c += aS6;
                                return str7;
                            default:
                                if (b >= -16 && b <= 47) {
                                    return Integer.valueOf(b);
                                }
                                byte b18 = this.D;
                                if (b18 >= 48 && b18 <= 63) {
                                    byte[] bArr28 = this.A;
                                    int i37 = this.c;
                                    this.c = i37 + 1;
                                    return Integer.valueOf(((b18 - 56) << 8) + (bArr28[i37] & 255));
                                }
                                byte b19 = this.D;
                                if (b19 >= 64 && b19 <= 71) {
                                    int a10 = a(this.A, this.c, this.D);
                                    this.c += 2;
                                    return Integer.valueOf(a10);
                                }
                                byte b20 = this.D;
                                if (b20 >= -40 && b20 <= -17) {
                                    return Long.valueOf((b20 - (-40)) - 8);
                                }
                                byte b21 = this.D;
                                if (b21 >= -56 && b21 <= -41) {
                                    byte[] bArr29 = this.A;
                                    this.c = this.c + 1;
                                    return Long.valueOf(((b21 + 48) << 8) + (bArr29[i2] & 255));
                                }
                                byte b22 = this.D;
                                if (b22 >= -64 && b22 <= -57) {
                                    byte[] bArr30 = this.A;
                                    int i38 = this.c;
                                    this.c = i38 + 1;
                                    int i39 = ((b22 + 60) << 16) + ((bArr30[i38] & 255) << 8);
                                    byte[] bArr31 = this.A;
                                    this.c = this.c + 1;
                                    return Long.valueOf(i39 + (bArr31[i] & 255));
                                }
                                int i40 = this.D;
                                if (i40 >= -108 && i40 <= -92) {
                                    int aS7 = i40 == -92 ? aS() : i40 - ErrorConstant.ERROR_GET_PROCESS_NULL;
                                    if (aS7 == 0) {
                                        return (this.f2934a.p & JSONReader.Feature.UseNativeObject.mask) != 0 ? new ArrayList() : this.f2934a.t != null ? this.f2934a.t.get() : new JSONArray();
                                    }
                                    List arrayList = (this.f2934a.p & JSONReader.Feature.UseNativeObject.mask) != 0 ? new ArrayList(aS7) : new JSONArray(aS7);
                                    while (i5 < aS7) {
                                        if (u()) {
                                            String v2 = v();
                                            if ("..".equals(v2)) {
                                                arrayList.add(arrayList);
                                            } else {
                                                arrayList.add(null);
                                                a((Collection) arrayList, i5, d.a(v2));
                                            }
                                        } else {
                                            arrayList.add(aM());
                                        }
                                        i5++;
                                    }
                                    return arrayList;
                                }
                                int i41 = this.D;
                                if (i41 >= 73 && i41 <= 121) {
                                    this.E = i41 == 121 ? aS() : i41 - 73;
                                    int i42 = this.E;
                                    if (i42 < 0) {
                                        return this.J.a(-i42);
                                    }
                                    String b23 = b(this.c, this.E);
                                    this.c += this.E;
                                    return (this.f2934a.p & JSONReader.Feature.TrimString.mask) != 0 ? b23.trim() : b23;
                                } else if (this.D != Byte.MAX_VALUE) {
                                    throw new JSONException("not support type : " + b(this.D));
                                } else {
                                    this.E = aS();
                                    int i43 = this.E;
                                    if (i43 < 0) {
                                        return this.J.a(-i43);
                                    }
                                    throw new JSONException("not support symbol : " + this.E);
                                }
                        }
                }
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public List aN() {
        Object aM;
        Object num;
        int t = t();
        JSONArray jSONArray = new JSONArray(t);
        for (int i = 0; i < t; i++) {
            int i2 = this.A[this.c];
            if (i2 >= 73 && i2 <= 126) {
                aM = az();
            } else if (i2 >= -16 && i2 <= 47) {
                this.c++;
                aM = Integer.valueOf(i2);
            } else if (i2 == -79) {
                this.c++;
                aM = Boolean.TRUE;
            } else if (i2 == -80) {
                this.c++;
                aM = Boolean.FALSE;
            } else if (i2 == -90) {
                aM = aI();
            } else if (i2 == -66) {
                this.c++;
                long j = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                this.c += 8;
                if (!e.BIG_ENDIAN) {
                    j = Long.reverseBytes(j);
                }
                aM = Long.valueOf(j);
            } else if (i2 >= -108 && i2 <= -92) {
                this.c++;
                int aS = i2 == -92 ? aS() : i2 + 108;
                if (aS == 0) {
                    aM = (this.f2934a.p & JSONReader.Feature.UseNativeObject.mask) != 0 ? new ArrayList() : this.f2934a.t != null ? this.f2934a.t.get() : new JSONArray();
                } else {
                    List arrayList = (this.f2934a.p & JSONReader.Feature.UseNativeObject.mask) != 0 ? new ArrayList(aS) : new JSONArray(aS);
                    for (int i3 = 0; i3 < aS; i3++) {
                        if (u()) {
                            String v = v();
                            if ("..".equals(v)) {
                                arrayList.add(arrayList);
                            } else {
                                arrayList.add(null);
                                a((Collection) arrayList, i3, d.a(v));
                            }
                        } else {
                            byte b = this.A[this.c];
                            arrayList.add((b < 73 || b > 126) ? b == -90 ? aI() : aM() : az());
                        }
                    }
                    aM = arrayList;
                }
            } else if (i2 < 48 || i2 > 63) {
                if (i2 >= 64 && i2 <= 71) {
                    int a2 = a(this.A, this.c + 1, i2);
                    this.c += 3;
                    num = new Integer(a2);
                } else if (i2 == 72) {
                    int a3 = com.alibaba.fastjson2.util.d.a(this.A, this.c + 1);
                    this.c += 5;
                    num = new Integer(a3);
                } else if (i2 == -109) {
                    String v2 = v();
                    if ("..".equals(v2)) {
                        aM = jSONArray;
                    } else {
                        a((Collection) jSONArray, i, d.a(v2));
                    }
                } else {
                    aM = aM();
                }
                aM = num;
            } else {
                aM = Integer.valueOf(((i2 - 56) << 8) + (this.A[this.c + 1] & 255));
                this.c += 2;
            }
            jSONArray.add(aM);
        }
        return jSONArray;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public JSONReader.e aQ() {
        return new JSONReader.e(this.c, this.D);
    }

    public int aS() {
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if (b < -16 || b > 47) {
            if (b >= 48 && b <= 63) {
                byte[] bArr2 = this.A;
                int i2 = this.c;
                this.c = i2 + 1;
                return ((b - 56) << 8) + (bArr2[i2] & 255);
            } else if (b >= 64 && b <= 71) {
                int a2 = a(this.A, this.c, b);
                this.c += 2;
                return a2;
            } else if (b != 72) {
                throw c(b);
            } else {
                int a3 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                this.c += 4;
                if (a3 > 268435456) {
                    throw new JSONException("input length overflow");
                }
                return a3;
            }
        }
        return b;
    }

    final void aT() {
        throw new JSONException("auotype not support : " + aG());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final long aU() {
        /*
            r11 = this;
            int r0 = r11.G
            r1 = 0
            r2 = 0
            r4 = r0
            r5 = r2
            r0 = 0
        L8:
            int r7 = r11.E
            if (r0 >= r7) goto L6b
            byte[] r7 = r11.A
            r8 = r7[r4]
            if (r8 < 0) goto L68
            r9 = 8
            if (r0 >= r9) goto L68
            if (r0 != 0) goto L1f
            int r9 = r11.G
            r7 = r7[r9]
            if (r7 != 0) goto L1f
            goto L68
        L1f:
            switch(r0) {
                case 0: goto L62;
                case 1: goto L59;
                case 2: goto L52;
                case 3: goto L4b;
                case 4: goto L41;
                case 5: goto L37;
                case 6: goto L2d;
                case 7: goto L23;
                default: goto L22;
            }
        L22:
            goto L63
        L23:
            long r7 = (long) r8
            r9 = 56
            long r7 = r7 << r9
            r9 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            goto L5e
        L2d:
            long r7 = (long) r8
            r9 = 48
            long r7 = r7 << r9
            r9 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L5e
        L37:
            long r7 = (long) r8
            r9 = 40
            long r7 = r7 << r9
            r9 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L5e
        L41:
            long r7 = (long) r8
            r9 = 32
            long r7 = r7 << r9
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L5e
        L4b:
            int r7 = r8 << 24
            long r7 = (long) r7
            r9 = 16777215(0xffffff, double:8.2890456E-317)
            goto L5e
        L52:
            int r7 = r8 << 16
            long r7 = (long) r7
            r9 = 65535(0xffff, double:3.23786E-319)
            goto L5e
        L59:
            int r7 = r8 << 8
            long r7 = (long) r7
            r9 = 255(0xff, double:1.26E-321)
        L5e:
            long r5 = r5 & r9
            long r7 = r7 + r5
            r5 = r7
            goto L63
        L62:
            long r5 = (long) r8
        L63:
            int r0 = r0 + 1
            int r4 = r4 + 1
            goto L8
        L68:
            int r4 = r11.G
            r5 = r2
        L6b:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L70
            return r5
        L70:
            r2 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L75:
            int r0 = r11.E
            if (r1 >= r0) goto L8c
            byte[] r0 = r11.A
            int r5 = r4 + 1
            r0 = r0[r4]
            long r6 = (long) r0
            long r2 = r2 ^ r6
            r6 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r2 = r2 * r6
            int r1 = r1 + 1
            r4 = r5
            goto L75
        L8c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.aU():long");
    }

    public boolean aV() {
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        this.F = b;
        if (b >= 73 && b <= 120) {
            this.c += b - 73;
            return true;
        } else if (b == 121 || b == 122 || b == 123 || b == 124 || b == 125) {
            this.E = aS();
            this.c += this.E;
            return true;
        } else if (b != Byte.MAX_VALUE) {
            throw c(b);
        } else {
            byte b2 = this.A[this.c];
            if (b2 >= -16 && b2 <= 72) {
                R();
                return true;
            }
            az();
            R();
            return true;
        }
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public float aa() {
        byte[] bArr = this.A;
        int i = this.c;
        if (bArr[i] == -73) {
            int i2 = e.UNSAFE.getInt(bArr, e.ARRAY_BYTE_BASE_OFFSET + i + 1);
            this.c = i + 5;
            if (!e.BIG_ENDIAN) {
                i2 = Integer.reverseBytes(i2);
            }
            return Float.intBitsToFloat(i2);
        }
        return bi();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public double ac() {
        byte[] bArr = this.A;
        int i = this.c;
        if (bArr[i] == -75) {
            this.c = i + 9;
            return Double.longBitsToDouble((bArr[i + 8] & 255) + ((bArr[i + 7] & 255) << 8) + ((bArr[i + 6] & 255) << 16) + ((bArr[i + 5] & 255) << 24) + ((bArr[i + 4] & 255) << 32) + ((bArr[i + 3] & 255) << 40) + ((255 & bArr[i + 2]) << 48) + (bArr[i + 1] << 56));
        }
        return bj();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Number ae() {
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if (b < -16 || b > 47) {
            if (b >= 48 && b <= 63) {
                byte[] bArr2 = this.A;
                int i2 = this.c;
                this.c = i2 + 1;
                return Integer.valueOf(((b - 56) << 8) + (bArr2[i2] & 255));
            } else if (b >= 64 && b <= 71) {
                int a2 = a(this.A, this.c, b);
                this.c += 2;
                return Integer.valueOf(a2);
            } else if (b >= -40 && b <= -17) {
                return Long.valueOf((b - (-40)) - 8);
            } else {
                if (b >= -56 && b <= -41) {
                    byte[] bArr3 = this.A;
                    int i3 = this.c;
                    this.c = i3 + 1;
                    return Integer.valueOf(((b + 48) << 8) + (bArr3[i3] & 255));
                } else if (b >= -64 && b <= -57) {
                    byte[] bArr4 = this.A;
                    int i4 = this.c;
                    this.c = i4 + 1;
                    int i5 = ((b + 60) << 16) + ((bArr4[i4] & 255) << 8);
                    byte[] bArr5 = this.A;
                    int i6 = this.c;
                    this.c = i6 + 1;
                    return Integer.valueOf(i5 + (bArr5[i6] & 255));
                } else if (b == -110) {
                    throw new JSONException("not support input type : ".concat(az()));
                } else {
                    if (b == 72) {
                        int a3 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                        this.c += 4;
                        return Integer.valueOf(a3);
                    } else if (b == 121) {
                        int R = R();
                        String b2 = b(this.c, R);
                        this.c += R;
                        return TypeUtils.b(b2);
                    } else if (b == 122) {
                        int R2 = R();
                        String str = new String(this.A, this.c, R2, StandardCharsets.UTF_8);
                        this.c += R2;
                        return TypeUtils.b(str);
                    } else {
                        switch (b) {
                            case -81:
                                return null;
                            case -80:
                            case -78:
                                return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
                            case -79:
                            case -77:
                                return Double.valueOf(1.0d);
                            case -76:
                                return Double.valueOf(Y());
                            case -75:
                                long j = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                this.c += 8;
                                if (!e.BIG_ENDIAN) {
                                    j = Long.reverseBytes(j);
                                }
                                return Double.valueOf(Double.longBitsToDouble(j));
                            case -74:
                                return Float.valueOf(R());
                            case -73:
                                int a4 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                                this.c += 4;
                                return Float.valueOf(Float.intBitsToFloat(a4));
                            case -72:
                                return BigDecimal.valueOf(Y());
                            case -71:
                                int R3 = R();
                                BigInteger af = af();
                                return R3 == 0 ? new BigDecimal(af) : new BigDecimal(af, R3);
                            case -70:
                                return BigInteger.valueOf(Y());
                            case -69:
                                int R4 = R();
                                byte[] bArr6 = new byte[R4];
                                System.arraycopy(this.A, this.c, bArr6, 0, R4);
                                this.c += R4;
                                return new BigInteger(bArr6);
                            case -68:
                                int i7 = (this.A[this.c + 1] & 255) + (this.A[this.c] << 8);
                                this.c += 2;
                                return Short.valueOf((short) i7);
                            case -67:
                                byte[] bArr7 = this.A;
                                int i8 = this.c;
                                this.c = i8 + 1;
                                return Byte.valueOf(bArr7[i8]);
                            case -66:
                                long j2 = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
                                this.c += 8;
                                if (!e.BIG_ENDIAN) {
                                    j2 = Long.reverseBytes(j2);
                                }
                                return Long.valueOf(j2);
                            case -65:
                                int a5 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                                this.c += 4;
                                return Long.valueOf(a5);
                            default:
                                if (b < 73 || b > 120) {
                                    throw c(b);
                                }
                                int i9 = b - 73;
                                String b3 = b(this.c, i9);
                                this.c += i9;
                                return TypeUtils.b(b3);
                        }
                    }
                }
            }
        }
        return Integer.valueOf(b);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public BigInteger af() {
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if (b == -70) {
            return BigInteger.valueOf(Y());
        }
        if (b != -69) {
            return g(b);
        }
        int R = R();
        byte[] bArr2 = new byte[R];
        System.arraycopy(this.A, this.c, bArr2, 0, R);
        this.c += R;
        return new BigInteger(bArr2);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public BigDecimal ag() {
        BigDecimal valueOf;
        int i;
        byte[] bArr = this.A;
        int i2 = this.c;
        this.c = i2 + 1;
        byte b = bArr[i2];
        if (b != -71) {
            return b == -72 ? BigDecimal.valueOf(Y()) : f(b);
        }
        int R = R();
        if (bArr[this.c] == -70) {
            this.c++;
            return BigDecimal.valueOf(Y(), R);
        }
        if (bArr[this.c] == 72) {
            valueOf = BigDecimal.valueOf(com.alibaba.fastjson2.util.d.a(bArr, this.c + 1), R);
            i = this.c + 5;
        } else if (bArr[this.c] != -66) {
            BigInteger af = af();
            return R == 0 ? new BigDecimal(af) : new BigDecimal(af, R);
        } else {
            long j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c + 1);
            if (!e.BIG_ENDIAN) {
                j = Long.reverseBytes(j);
            }
            valueOf = BigDecimal.valueOf(j, R);
            i = this.c + 9;
        }
        this.c = i;
        return valueOf;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public UUID ah() {
        long j;
        long reverseBytes;
        long j2;
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        int i2 = 16;
        if (b == -111) {
            int aS = aS();
            if (aS != 16) {
                throw new JSONException("uuid not support " + aS);
            }
            j = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c);
            long j3 = e.UNSAFE.getLong(bArr, e.ARRAY_BYTE_BASE_OFFSET + this.c + 8);
            this.c += 16;
            if (!e.BIG_ENDIAN) {
                j = Long.reverseBytes(j);
            }
            reverseBytes = e.BIG_ENDIAN ? j3 : Long.reverseBytes(j3);
        } else if (b == -81) {
            return null;
        } else {
            int i3 = 0;
            if (b != 105) {
                if (b == 109) {
                    byte b2 = bArr[this.c + 8];
                    byte b3 = bArr[this.c + 13];
                    byte b4 = bArr[this.c + 18];
                    byte b5 = bArr[this.c + 23];
                    if (b2 != 45 || b3 != 45 || b4 != 45 || b5 != 45) {
                        throw new JSONException("Invalid UUID string:  " + new String(bArr, this.c, 36, StandardCharsets.ISO_8859_1));
                    }
                    long j4 = 0;
                    while (i3 < 8) {
                        j4 = (j4 << 4) + JSONFactory.A[bArr[this.c + i3] - 48];
                        i3++;
                    }
                    j2 = j4;
                    for (int i4 = 9; i4 < 13; i4++) {
                        j2 = (j2 << 4) + JSONFactory.A[bArr[this.c + i4] - 48];
                    }
                    for (int i5 = 14; i5 < 18; i5++) {
                        j2 = (j2 << 4) + JSONFactory.A[bArr[this.c + i5] - 48];
                    }
                    reverseBytes = 0;
                    for (int i6 = 19; i6 < 23; i6++) {
                        reverseBytes = (reverseBytes << 4) + JSONFactory.A[bArr[this.c + i6] - 48];
                    }
                    for (int i7 = 24; i7 < 36; i7++) {
                        reverseBytes = (reverseBytes << 4) + JSONFactory.A[bArr[this.c + i7] - 48];
                    }
                } else if (b != 121 && b != 122) {
                    throw c(b);
                } else {
                    int aS2 = aS();
                    if (aS2 == 32) {
                        j = 0;
                        while (i3 < 16) {
                            j = (j << 4) + JSONFactory.A[bArr[this.c + i3] - 48];
                            i3++;
                        }
                        reverseBytes = 0;
                        while (i2 < 32) {
                            reverseBytes = (reverseBytes << 4) + JSONFactory.A[bArr[this.c + i2] - 48];
                            i2++;
                        }
                    } else if (aS2 != 36) {
                        String str = new String(bArr, this.c, aS2, StandardCharsets.UTF_8);
                        this.c += aS2;
                        throw new JSONException("Invalid UUID string:  " + str);
                    } else {
                        byte b6 = bArr[this.c + 8];
                        byte b7 = bArr[this.c + 13];
                        byte b8 = bArr[this.c + 18];
                        byte b9 = bArr[this.c + 23];
                        if (b6 == 45 && b7 == 45 && b8 == 45 && b9 == 45) {
                            long j5 = 0;
                            while (i3 < 8) {
                                j5 = (j5 << 4) + JSONFactory.A[bArr[this.c + i3] - 48];
                                i3++;
                            }
                            j2 = j5;
                            for (int i8 = 9; i8 < 13; i8++) {
                                j2 = (j2 << 4) + JSONFactory.A[bArr[this.c + i8] - 48];
                            }
                            for (int i9 = 14; i9 < 18; i9++) {
                                j2 = (j2 << 4) + JSONFactory.A[bArr[this.c + i9] - 48];
                            }
                            reverseBytes = 0;
                            for (int i10 = 19; i10 < 23; i10++) {
                                reverseBytes = (reverseBytes << 4) + JSONFactory.A[bArr[this.c + i10] - 48];
                            }
                            for (int i11 = 24; i11 < 36; i11++) {
                                reverseBytes = (reverseBytes << 4) + JSONFactory.A[bArr[this.c + i11] - 48];
                            }
                        } else {
                            j = 0;
                            reverseBytes = 0;
                        }
                    }
                }
                this.c += 36;
                j = j2;
            } else {
                j = 0;
                while (i3 < 16) {
                    j = (j << 4) + JSONFactory.A[bArr[this.c + i3] - 48];
                    i3++;
                }
                reverseBytes = 0;
                while (i2 < 32) {
                    reverseBytes = (reverseBytes << 4) + JSONFactory.A[bArr[this.c + i2] - 48];
                    i2++;
                }
            }
            this.c += 32;
        }
        return new UUID(j, reverseBytes);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public com.alibaba.fastjson2.time.c ai() {
        byte b = this.A[this.c];
        if (b != -88) {
            if (b != -81) {
                return e((int) b);
            }
            this.c++;
            return null;
        }
        this.c++;
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte[] bArr2 = this.A;
        int i2 = this.c;
        this.c = i2 + 1;
        int i3 = (bArr[i] << 8) + (bArr2[i2] & 255);
        byte[] bArr3 = this.A;
        int i4 = this.c;
        this.c = i4 + 1;
        byte b2 = bArr3[i4];
        byte[] bArr4 = this.A;
        int i5 = this.c;
        this.c = i5 + 1;
        byte b3 = bArr4[i5];
        byte[] bArr5 = this.A;
        int i6 = this.c;
        this.c = i6 + 1;
        byte b4 = bArr5[i6];
        byte[] bArr6 = this.A;
        int i7 = this.c;
        this.c = i7 + 1;
        byte b5 = bArr6[i7];
        byte[] bArr7 = this.A;
        int i8 = this.c;
        this.c = i8 + 1;
        return com.alibaba.fastjson2.time.c.a(i3, b2, b3, b4, b5, bArr7[i8], R());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public com.alibaba.fastjson2.time.f aj() {
        com.alibaba.fastjson2.time.e c;
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        if (b != -66) {
            switch (b) {
                case -86:
                    byte[] bArr2 = this.A;
                    int i2 = this.c;
                    this.c = i2 + 1;
                    byte[] bArr3 = this.A;
                    int i3 = this.c;
                    this.c = i3 + 1;
                    int i4 = (bArr2[i2] << 8) + (bArr3[i3] & 255);
                    byte[] bArr4 = this.A;
                    int i5 = this.c;
                    this.c = i5 + 1;
                    byte b2 = bArr4[i5];
                    byte[] bArr5 = this.A;
                    int i6 = this.c;
                    this.c = i6 + 1;
                    byte b3 = bArr5[i6];
                    byte[] bArr6 = this.A;
                    int i7 = this.c;
                    this.c = i7 + 1;
                    byte b4 = bArr6[i7];
                    byte[] bArr7 = this.A;
                    int i8 = this.c;
                    this.c = i8 + 1;
                    byte b5 = bArr7[i8];
                    byte[] bArr8 = this.A;
                    int i9 = this.c;
                    this.c = i9 + 1;
                    com.alibaba.fastjson2.time.c a2 = com.alibaba.fastjson2.time.c.a(i4, b2, b3, b4, b5, bArr8[i9], R());
                    if (E() == -4800907791268808639L) {
                        c = com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID;
                    } else {
                        String aG = aG();
                        com.alibaba.fastjson2.time.e d = this.f2934a.d();
                        c = d.e.equals(aG) ? d : DateUtils.c(aG, com.alibaba.fastjson2.time.e.SHANGHAI_ZONE_ID);
                    }
                    return com.alibaba.fastjson2.time.f.b(a2, c);
                case -85:
                    break;
                case -84:
                    long a3 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                    this.c += 4;
                    return com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(a3, 0L), com.alibaba.fastjson2.time.e.b);
                case -83:
                    long a4 = com.alibaba.fastjson2.util.d.a(this.A, this.c);
                    this.c += 4;
                    return com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(a4 * 60, 0L), com.alibaba.fastjson2.time.e.b);
                case -82:
                    return com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(Y(), R()), com.alibaba.fastjson2.time.e.b);
                default:
                    if (b < 73 || b > 120) {
                        throw new UnsupportedOperationException();
                    }
                    this.c--;
                    return c(b - 73);
            }
        }
        long j = e.UNSAFE.getLong(this.A, e.ARRAY_BYTE_BASE_OFFSET + this.c);
        this.c += 8;
        if (!e.BIG_ENDIAN) {
            j = Long.reverseBytes(j);
        }
        return com.alibaba.fastjson2.time.f.a(com.alibaba.fastjson2.time.a.a(j), com.alibaba.fastjson2.time.e.b);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final int ak() {
        this.D = this.A[this.c];
        byte b = this.D;
        if (b < 73 || b >= 120) {
            throw new UnsupportedOperationException(b.CC.a(this.D));
        }
        return b - 73;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected com.alibaba.fastjson2.time.c am() {
        com.alibaba.fastjson2.time.c f;
        if (this.A[this.c] != 85 || (f = DateUtils.f(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 13;
        return f;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c an() {
        com.alibaba.fastjson2.time.c g;
        if (this.A[this.c] != 87 || (g = DateUtils.g(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 15;
        return g;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c ao() {
        com.alibaba.fastjson2.time.c h;
        if (this.A[this.c] != 89 || (h = DateUtils.h(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 17;
        return h;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c ap() {
        com.alibaba.fastjson2.time.c i;
        if (this.A[this.c] != 90 || (i = DateUtils.i(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 18;
        return i;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c aq() {
        com.alibaba.fastjson2.time.c j;
        if (this.A[this.c] != 91 || (j = DateUtils.j(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 19;
        return j;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c ar() {
        this.D = this.A[this.c];
        if (this.D == 92) {
            com.alibaba.fastjson2.time.c k = DateUtils.k(this.A, this.c + 1);
            if (k == null) {
                throw new JSONException("date only support string input");
            }
            this.c += 20;
            return k;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c as() {
        com.alibaba.fastjson2.time.c l;
        if (this.A[this.c] != 93 || (l = DateUtils.l(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 21;
        return l;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long at() {
        if (this.A[this.c] == 92) {
            long b = DateUtils.b(this.A, this.c + 1, this.f2934a.o);
            this.c += 20;
            return b;
        }
        throw new JSONException("date only support string input");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public com.alibaba.fastjson2.time.b au() {
        com.alibaba.fastjson2.time.b b;
        if (this.A[this.c] != 81 || (b = DateUtils.b(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 9;
        return b;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public com.alibaba.fastjson2.time.b av() {
        com.alibaba.fastjson2.time.b c;
        if (this.A[this.c] != 82 || (c = DateUtils.c(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 10;
        return c;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.b aw() {
        com.alibaba.fastjson2.time.b d;
        byte b = this.F;
        if ((b == 121 || b == 122) && this.E == 10) {
            d = DateUtils.d(this.A, this.c);
        } else if (this.A[this.c] != 83 || (d = DateUtils.d(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 11;
        return d;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.b ax() {
        com.alibaba.fastjson2.time.b e;
        byte b = this.F;
        if ((b == 121 || b == 122) && this.E == 11) {
            e = DateUtils.e(this.A, this.c);
        } else if (this.A[this.c] != 84 || (e = DateUtils.e(this.A, this.c + 1)) == null) {
            throw new JSONException("date only support string input");
        }
        this.c += 12;
        return e;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected void ay() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String az() {
        int i;
        String str;
        int i2;
        byte[] bArr = this.A;
        int i3 = this.c;
        this.c = i3 + 1;
        byte b = bArr[i3];
        this.F = b;
        if (b == -81) {
            return null;
        }
        this.G = this.c;
        if (b < 73 || b > 121) {
            return bh();
        }
        if (b == 121) {
            i = this.A[this.c];
            if (i >= -16 && i <= 47) {
                i2 = this.c + 1;
            } else if (i >= 48 && i <= 63) {
                i = ((i - 56) << 8) + (this.A[this.c + 1] & 255);
                i2 = this.c + 2;
            } else if (i < 64 || i > 71) {
                i = aS();
                this.G = this.c;
            } else {
                i = a(this.A, this.c + 1, i);
                i2 = this.c + 3;
            }
            this.c = i2;
            this.G = this.c;
        } else {
            i = b - 73;
        }
        if (i < 0) {
            return this.J.a(-i);
        }
        this.E = i;
        if (e.ANDROID_SDK_INT < 34) {
            char[] cArr = this.Q;
            if (cArr == null) {
                cArr = JSONFactory.u.getAndSet(this.I, null);
                this.Q = cArr;
            }
            if (cArr == null || cArr.length < i) {
                cArr = new char[i];
                this.Q = cArr;
            }
            for (int i4 = 0; i4 < i; i4++) {
                cArr[i4] = (char) (this.A[this.c + i4] & 255);
            }
            str = new String(cArr, 0, i);
        } else {
            str = new String(this.A, this.c, i, StandardCharsets.ISO_8859_1);
        }
        this.c += i;
        return (this.f2934a.p & JSONReader.Feature.TrimString.mask) != 0 ? str.trim() : str;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.c b(int i) {
        com.alibaba.fastjson2.time.c a2;
        this.D = this.A[this.c];
        byte b = this.D;
        if (b < 73 || b > 120) {
            throw new JSONException("date only support string input");
        }
        if (i >= 21 && i <= 29 && (a2 = DateUtils.a(this.A, this.c + 1, i)) != null) {
            this.c += i + 1;
            return a2;
        }
        throw new JSONException("illegal LocalDateTime string : " + az());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T b(Class<T> cls) {
        return (T) this.f2934a.w.a(cls, (this.f2934a.p & JSONReader.Feature.FieldBased.mask) != 0).b(this, null, null, 0L);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T b(Type type) {
        return (T) this.f2934a.w.a(type, (this.f2934a.p & JSONReader.Feature.FieldBased.mask) != 0).b(this, null, null, 0L);
    }

    public String b(byte b) {
        StringBuilder sb = new StringBuilder();
        sb.append(b.CC.a(b));
        if (z()) {
            int i = this.c;
            this.c--;
            String str = null;
            try {
                str = az();
            } catch (Throwable unused) {
            }
            if (str != null) {
                sb.append(' ');
                sb.append(str);
            }
            this.c = i;
        }
        sb.append(", offset ");
        sb.append(this.c);
        sb.append(fxb.DIR);
        sb.append(this.A.length);
        return sb.toString();
    }

    String b(int i, int i2) {
        if (e.ANDROID_SDK_INT >= 34) {
            return new String(this.A, i, i2, StandardCharsets.ISO_8859_1);
        }
        char[] cArr = this.Q;
        if (cArr == null) {
            cArr = JSONFactory.u.getAndSet(this.I, null);
            this.Q = cArr;
        }
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
            this.Q = cArr;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) (this.A[i + i3] & 255);
        }
        return new String(cArr, 0, i2);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean b() {
        return this.c >= this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long be() {
        /*
            Method dump skipped, instructions count: 832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.n.be():long");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte c() {
        return this.A[this.c];
    }

    @Override // com.alibaba.fastjson2.JSONReader
    protected final com.alibaba.fastjson2.time.f c(int i) {
        com.alibaba.fastjson2.time.f a2;
        this.D = this.A[this.c];
        byte b = this.D;
        if (b < 73 || b > 120) {
            throw new JSONException("date only support string input");
        }
        if (i >= 19 && (a2 = DateUtils.a(this.A, this.c + 1, i, this.f2934a.o)) != null) {
            this.c += i + 1;
            return a2;
        }
        throw new JSONException("illegal LocalDateTime string : " + az());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public List c(Type type) {
        if (g()) {
            return null;
        }
        if (this.A[this.c] != -110) {
            int t = t();
            JSONArray jSONArray = new JSONArray(t);
            for (int i = 0; i < t; i++) {
                jSONArray.add(b(type));
            }
            return jSONArray;
        }
        Object aM = aM();
        if (aM instanceof List) {
            return (List) aM;
        }
        if (aM instanceof Collection) {
            return new JSONArray((Collection) aM);
        }
        throw new JSONException("not support class " + aM.getClass());
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.H;
        if (bArr != null && bArr.length < 1048576) {
            JSONFactory.v.lazySet(this.I, bArr);
        }
        char[] cArr = this.Q;
        if (cArr == null || cArr.length >= 1048576) {
            return;
        }
        JSONFactory.u.lazySet(this.I, cArr);
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean d() {
        byte b = this.A[this.c];
        return (b >= -70 && b <= 72) || b == -84 || b == -83 || b == -85;
    }

    JSONException e() {
        StringBuilder sb = new StringBuilder();
        sb.append("fieldName not support input type ");
        sb.append(b.CC.a(this.F));
        if (this.F == -109) {
            sb.append(" ");
            sb.append(az());
        }
        sb.append(", offset ");
        sb.append(this.c);
        return new JSONException(sb.toString());
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public Date f() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean g() {
        if (this.A[this.c] == -81) {
            this.c++;
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean n() {
        if (this.A[this.c] != -90) {
            return false;
        }
        this.c++;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean o() {
        if (this.A[this.c] == -81 || this.A[this.c] == 73) {
            this.c++;
            return true;
        }
        return false;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean p() {
        if (this.A[this.c] != -91) {
            return false;
        }
        this.c++;
        return true;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean q() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean r() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean s() {
        throw new JSONException("UnsupportedOperation");
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int t() {
        byte[] bArr = this.A;
        int i = this.c;
        this.c = i + 1;
        byte b = bArr[i];
        this.D = b;
        if (b == -81) {
            return -1;
        }
        if (b >= -108 && b <= -93) {
            this.d = (char) (-b);
            return b - ErrorConstant.ERROR_GET_PROCESS_NULL;
        }
        if (b != -111 && b != -92) {
            throw new JSONException("array not support input " + b(b));
        }
        return R();
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean u() {
        int i = this.c;
        byte[] bArr = this.A;
        return i < bArr.length && bArr[this.c] == -109;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public String v() {
        if (this.A[this.c] != -109) {
            return null;
        }
        this.c++;
        if (z()) {
            return az();
        }
        throw new JSONException("reference not support input " + b(this.D));
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean w() {
        byte b;
        int i = this.c;
        byte[] bArr = this.A;
        return i < bArr.length && (b = bArr[this.c]) >= -108 && b <= -92;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean x() {
        return this.c < this.C && this.A[this.c] == -90;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean y() {
        byte b = this.A[this.c];
        return b >= -78 && b <= 72;
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean z() {
        int i = this.c;
        byte[] bArr = this.A;
        if (i < bArr.length) {
            byte b = bArr[this.c];
            this.D = b;
            return b >= 73;
        }
        return false;
    }
}
