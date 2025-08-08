package com.mobile.auth;

import mtopsdk.common.util.StringUtils;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.util.Locale;
import tb.tof;

/* loaded from: classes4.dex */
public class O0000OOo {
    private static final String O000000o = "O0000OOo";
    private final int[] O00000Oo = {1732584193, -271733879, -1732584194, 271733878, -1009589776};
    private int[] O00000o0 = new int[5];
    private int[] O00000o = new int[80];

    private int O000000o(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private int O000000o(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int O000000o(byte[] bArr, int i) {
        try {
            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    private void O000000o() {
        for (int i = 16; i <= 79; i++) {
            try {
                this.O00000o[i] = O000000o(((this.O00000o[i - 3] ^ this.O00000o[i - 8]) ^ this.O00000o[i - 14]) ^ this.O00000o[i - 16], 1);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return;
                }
            }
        }
        int[] iArr = new int[5];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = this.O00000o0[i2];
        }
        for (int i3 = 0; i3 <= 19; i3++) {
            iArr[4] = iArr[3];
            iArr[3] = iArr[2];
            iArr[2] = O000000o(iArr[1], 30);
            iArr[1] = iArr[0];
            iArr[0] = O000000o(iArr[0], 5) + O000000o(iArr[1], iArr[2], iArr[3]) + iArr[4] + this.O00000o[i3] + 1518500249;
        }
        for (int i4 = 20; i4 <= 39; i4++) {
            iArr[4] = iArr[3];
            iArr[3] = iArr[2];
            iArr[2] = O000000o(iArr[1], 30);
            iArr[1] = iArr[0];
            iArr[0] = O000000o(iArr[0], 5) + O00000Oo(iArr[1], iArr[2], iArr[3]) + iArr[4] + this.O00000o[i4] + 1859775393;
        }
        for (int i5 = 40; i5 <= 59; i5++) {
            iArr[4] = iArr[3];
            iArr[3] = iArr[2];
            iArr[2] = O000000o(iArr[1], 30);
            iArr[1] = iArr[0];
            iArr[0] = (((O000000o(iArr[0], 5) + O00000o0(iArr[1], iArr[2], iArr[3])) + iArr[4]) + this.O00000o[i5]) - 1894007588;
        }
        for (int i6 = 60; i6 <= 79; i6++) {
            iArr[4] = iArr[3];
            iArr[3] = iArr[2];
            iArr[2] = O000000o(iArr[1], 30);
            iArr[1] = iArr[0];
            iArr[0] = (((O000000o(iArr[0], 5) + O00000Oo(iArr[1], iArr[2], iArr[3])) + iArr[4]) + this.O00000o[i6]) - 899497514;
        }
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int[] iArr2 = this.O00000o0;
            iArr2[i7] = iArr2[i7] + iArr[i7];
        }
        for (int i8 = 0; i8 < this.O00000o.length; i8++) {
            this.O00000o[i8] = 0;
        }
    }

    private void O000000o(int i, byte[] bArr, int i2) {
        try {
            bArr[i2] = (byte) (i >>> 24);
            bArr[i2 + 1] = (byte) (i >>> 16);
            bArr[i2 + 2] = (byte) (i >>> 8);
            bArr[i2 + 3] = (byte) i;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static byte[] O000000o(String str, String str2) {
        try {
            if (StringUtils.isEmpty(str2)) {
                O000000o.O000000o(O000000o, "when getHmacSHA1,the key is null");
                return null;
            }
            byte[] bArr = new byte[64];
            byte[] bArr2 = new byte[64];
            byte[] bArr3 = new byte[64];
            int length = str2.length();
            O0000OOo o0000OOo = new O0000OOo();
            if (str2.length() > 64) {
                byte[] O000000o2 = o0000OOo.O000000o(O0000Oo.O00000Oo(str2));
                length = O000000o2.length;
                for (int i = 0; i < length; i++) {
                    bArr3[i] = O000000o2[i];
                }
            } else {
                byte[] O00000Oo = O0000Oo.O00000Oo(str2);
                for (int i2 = 0; i2 < O00000Oo.length; i2++) {
                    bArr3[i2] = O00000Oo[i2];
                }
            }
            while (length < 64) {
                bArr3[length] = 0;
                length++;
            }
            for (int i3 = 0; i3 < 64; i3++) {
                bArr[i3] = (byte) (bArr3[i3] ^ tof.LF_FIFO);
                bArr2[i3] = (byte) (bArr3[i3] ^ 92);
            }
            return o0000OOo.O000000o(O000000o(bArr2, o0000OOo.O000000o(O000000o(bArr, O0000Oo.O00000Oo(str)))));
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

    private static byte[] O000000o(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = bArr[i];
            }
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr3[bArr.length + i2] = bArr2[i2];
            }
            return bArr3;
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

    private int O00000Oo(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    public static String O00000Oo(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder("");
            if (bArr != null && bArr.length > 0) {
                for (byte b : bArr) {
                    String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.CHINA);
                    if (upperCase.length() < 2) {
                        sb.append(0);
                    }
                    sb.append(upperCase);
                }
                return sb.toString();
            }
            return null;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c A[Catch: Throwable -> 0x0089, LOOP:0: B:10:0x002a->B:11:0x002c, LOOP_END, TryCatch #1 {Throwable -> 0x0089, blocks: (B:2:0x0000, B:4:0x0009, B:5:0x000d, B:9:0x001c, B:11:0x002c, B:12:0x0034, B:7:0x0012, B:8:0x0015), top: B:23:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] O00000o(byte[] r15) {
        /*
            r14 = this;
            int r0 = r15.length     // Catch: java.lang.Throwable -> L89
            int r1 = r0 % 64
            r2 = 63
            r3 = 56
            if (r1 >= r3) goto L10
            int r2 = 55 - r1
            int r1 = r0 - r1
        Ld:
            int r1 = r1 + 64
            goto L1c
        L10:
            if (r1 != r3) goto L15
            int r1 = r0 + 8
            goto Ld
        L15:
            int r2 = r2 - r1
            int r2 = r2 + r3
            int r4 = r0 + 64
            int r4 = r4 - r1
            int r1 = r4 + 64
        L1c:
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L89
            r4 = 0
            java.lang.System.arraycopy(r15, r4, r1, r4, r0)     // Catch: java.lang.Throwable -> L89
            int r15 = r0 + 1
            r5 = -128(0xffffffffffffff80, float:NaN)
            r1[r0] = r5     // Catch: java.lang.Throwable -> L89
            r5 = r15
            r15 = 0
        L2a:
            if (r15 >= r2) goto L34
            int r6 = r5 + 1
            r1[r5] = r4     // Catch: java.lang.Throwable -> L89
            int r15 = r15 + 1
            r5 = r6
            goto L2a
        L34:
            long r6 = (long) r0     // Catch: java.lang.Throwable -> L89
            r15 = 3
            long r6 = r6 << r15
            r8 = 255(0xff, double:1.26E-321)
            long r10 = r6 & r8
            int r15 = (int) r10     // Catch: java.lang.Throwable -> L89
            byte r15 = (byte) r15     // Catch: java.lang.Throwable -> L89
            r0 = 8
            long r10 = r6 >> r0
            long r10 = r10 & r8
            int r0 = (int) r10     // Catch: java.lang.Throwable -> L89
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L89
            r2 = 16
            long r10 = r6 >> r2
            long r10 = r10 & r8
            int r2 = (int) r10     // Catch: java.lang.Throwable -> L89
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L89
            r4 = 24
            long r10 = r6 >> r4
            long r10 = r10 & r8
            int r4 = (int) r10     // Catch: java.lang.Throwable -> L89
            byte r4 = (byte) r4     // Catch: java.lang.Throwable -> L89
            r10 = 32
            long r10 = r6 >> r10
            long r10 = r10 & r8
            int r11 = (int) r10     // Catch: java.lang.Throwable -> L89
            byte r10 = (byte) r11     // Catch: java.lang.Throwable -> L89
            r11 = 40
            long r11 = r6 >> r11
            long r11 = r11 & r8
            int r12 = (int) r11     // Catch: java.lang.Throwable -> L89
            byte r11 = (byte) r12     // Catch: java.lang.Throwable -> L89
            r12 = 48
            long r12 = r6 >> r12
            long r8 = r8 & r12
            int r9 = (int) r8     // Catch: java.lang.Throwable -> L89
            byte r8 = (byte) r9     // Catch: java.lang.Throwable -> L89
            long r6 = r6 >> r3
            int r3 = (int) r6     // Catch: java.lang.Throwable -> L89
            byte r3 = (byte) r3     // Catch: java.lang.Throwable -> L89
            int r6 = r5 + 1
            r1[r5] = r3     // Catch: java.lang.Throwable -> L89
            int r3 = r6 + 1
            r1[r6] = r8     // Catch: java.lang.Throwable -> L89
            int r5 = r3 + 1
            r1[r3] = r11     // Catch: java.lang.Throwable -> L89
            int r3 = r5 + 1
            r1[r5] = r10     // Catch: java.lang.Throwable -> L89
            int r5 = r3 + 1
            r1[r3] = r4     // Catch: java.lang.Throwable -> L89
            int r3 = r5 + 1
            r1[r5] = r2     // Catch: java.lang.Throwable -> L89
            int r2 = r3 + 1
            r1[r3] = r0     // Catch: java.lang.Throwable -> L89
            r1[r2] = r15     // Catch: java.lang.Throwable -> L89
            return r1
        L89:
            r15 = move-exception
            r0 = 0
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r15)     // Catch: java.lang.Throwable -> L8f
            return r0
        L8f:
            r15 = move-exception
            com.mobile.auth.gatewayauth.ExceptionProcessor.processException(r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O0000OOo.O00000o(byte[]):byte[]");
    }

    private int O00000o0(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    private int O00000o0(byte[] bArr) {
        try {
            System.arraycopy(this.O00000Oo, 0, this.O00000o0, 0, this.O00000Oo.length);
            byte[] O00000o = O00000o(bArr);
            int length = O00000o.length / 64;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < 16; i2++) {
                    this.O00000o[i2] = O000000o(O00000o, (i << 6) + (i2 << 2));
                }
                O000000o();
            }
            return 20;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return -1;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return -1;
            }
        }
    }

    public byte[] O000000o(byte[] bArr) {
        try {
            O00000o0(bArr);
            byte[] bArr2 = new byte[20];
            for (int i = 0; i < this.O00000o0.length; i++) {
                O000000o(this.O00000o0[i], bArr2, i << 2);
            }
            return bArr2;
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
