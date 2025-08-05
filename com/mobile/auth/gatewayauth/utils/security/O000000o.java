package com.mobile.auth.gatewayauth.utils.security;

import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.taobao.tao.image.d;
import java.io.ByteArrayOutputStream;
import tb.crd;
import tb.fxb;
import tb.gbx;
import tb.tof;

/* loaded from: classes4.dex */
public class O000000o {
    private static char[] O000000o = {'A', 'B', 'C', d.LEVEL_D, d.LEVEL_E, 'F', 'G', 'H', d.LEVEL_I, 'J', 'K', d.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', d.LEVEL_V, d.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', fxb.DIR};
    private static byte[] O00000Oo = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, tof.LF_BLK, tof.LF_DIR, tof.LF_FIFO, tof.LF_CONTIG, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, gbx.OP_IS_NOT, gbx.OP_CALL_FUNC, gbx.OP_ASSIGN, gbx.OP_MINIFY_CALL_FUNC, 48, tof.LF_LINK, tof.LF_SYMLINK, tof.LF_CHR, -1, -1, -1, -1, -1};

    public static String O000000o(byte[] bArr) {
        String str;
        try {
            StringBuffer stringBuffer = new StringBuffer();
            int length = bArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                int i3 = bArr[i] & 255;
                if (i2 == length) {
                    stringBuffer.append(O000000o[i3 >>> 2]);
                    stringBuffer.append(O000000o[(i3 & 3) << 4]);
                    str = "==";
                } else {
                    int i4 = i2 + 1;
                    int i5 = bArr[i2] & 255;
                    if (i4 == length) {
                        stringBuffer.append(O000000o[i3 >>> 2]);
                        stringBuffer.append(O000000o[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                        stringBuffer.append(O000000o[(i5 & 15) << 2]);
                        str = "=";
                    } else {
                        int i6 = i4 + 1;
                        int i7 = bArr[i4] & 255;
                        stringBuffer.append(O000000o[i3 >>> 2]);
                        stringBuffer.append(O000000o[((i3 & 3) << 4) | ((i5 & 240) >>> 4)]);
                        stringBuffer.append(O000000o[((i5 & 15) << 2) | ((i7 & crd.DETECT_WIDTH) >>> 6)]);
                        stringBuffer.append(O000000o[i7 & 63]);
                        i = i6;
                    }
                }
                stringBuffer.append(str);
                break;
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static byte[] O000000o(String str) {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4;
        byte b4;
        try {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
            int i5 = 0;
            while (i5 < length) {
                while (true) {
                    i = i5 + 1;
                    b = O00000Oo[bytes[i5]];
                    if (i >= length || b != -1) {
                        break;
                    }
                    i5 = i;
                }
                if (b == -1) {
                    break;
                }
                while (true) {
                    i2 = i + 1;
                    b2 = O00000Oo[bytes[i]];
                    if (i2 >= length || b2 != -1) {
                        break;
                    }
                    i = i2;
                }
                if (b2 == -1) {
                    break;
                }
                byteArrayOutputStream.write((b << 2) | ((b2 & 48) >>> 4));
                while (true) {
                    i3 = i2 + 1;
                    byte b5 = bytes[i2];
                    if (b5 != 61) {
                        b3 = O00000Oo[b5];
                        if (i3 >= length || b3 != -1) {
                            break;
                        }
                        i2 = i3;
                    } else {
                        return byteArrayOutputStream.toByteArray();
                    }
                }
                if (b3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(((b2 & 15) << 4) | ((b3 & 60) >>> 2));
                while (true) {
                    i4 = i3 + 1;
                    byte b6 = bytes[i3];
                    if (b6 != 61) {
                        b4 = O00000Oo[b6];
                        if (i4 >= length || b4 != -1) {
                            break;
                        }
                        i3 = i4;
                    } else {
                        return byteArrayOutputStream.toByteArray();
                    }
                }
                if (b4 == -1) {
                    break;
                }
                byteArrayOutputStream.write(b4 | ((b3 & 3) << 6));
                i5 = i4;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }
}
