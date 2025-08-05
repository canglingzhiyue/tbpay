package com.taobao.calendar.sdk.common;

import java.security.DigestException;
import java.security.MessageDigest;
import tb.crd;
import tb.kge;

/* loaded from: classes6.dex */
public final class MD5 extends MessageDigest implements Cloneable {
    private long bytes;
    private int hA;
    private int hB;
    private int hC;
    private int hD;
    private byte[] pad;
    private int padded;

    static {
        kge.a(511317933);
        kge.a(-723128125);
    }

    public MD5() {
        super("MD5");
        this.pad = new byte[64];
        init();
    }

    private final void engineUpdate(byte[] bArr, int i) {
        int i2 = this.hB;
        int i3 = this.hC;
        int i4 = this.hD;
        int i5 = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << 24);
        int i6 = this.hA;
        int i7 = (((((i3 ^ i4) & i2) ^ i4) + i5) - 680876936) + i6;
        int i8 = ((i7 >>> 25) | (i7 << 7)) + i2;
        int i9 = i + 10;
        int i10 = (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8) | ((bArr[i9 - 4] & 255) << 16) | (bArr[i9 - 3] << 24);
        int i11 = (((((i2 ^ i3) & i8) ^ i3) + i10) - 389564586) + i4;
        int i12 = ((i11 >>> 20) | (i11 << 12)) + i8;
        int i13 = (bArr[i9 - 2] & 255) | ((bArr[i9 - 1] & 255) << 8) | ((bArr[i9] & 255) << 16) | (bArr[i9 + 1] << 24);
        int i14 = (((i8 ^ i2) & i12) ^ i2) + i13 + 606105819 + i3;
        int i15 = ((i14 >>> 15) | (i14 << 17)) + i12;
        int i16 = (bArr[i9 + 2] & 255) | ((bArr[i9 + 3] & 255) << 8) | ((bArr[i9 + 4] & 255) << 16) | (bArr[i9 + 5] << 24);
        int i17 = (((((i12 ^ i8) & i15) ^ i8) + i16) - 1044525330) + i2;
        int i18 = ((i17 >>> 10) | (i17 << 22)) + i15;
        int i19 = i9 + 10;
        int i20 = ((bArr[i19 - 3] & 255) << 8) | (bArr[i19 - 4] & 255) | ((bArr[i19 - 2] & 255) << 16) | (bArr[i19 - 1] << 24);
        int i21 = (((((i15 ^ i12) & i18) ^ i12) + i20) - 176418897) + i8;
        int i22 = ((i21 << 7) | (i21 >>> 25)) + i18;
        int i23 = ((bArr[i19 + 1] & 255) << 8) | (bArr[i19] & 255) | ((bArr[i19 + 2] & 255) << 16) | (bArr[i19 + 3] << 24);
        int i24 = (((i18 ^ i15) & i22) ^ i15) + i23 + 1200080426 + i12;
        int i25 = ((i24 << 12) | (i24 >>> 20)) + i22;
        int i26 = (bArr[i19 + 5] & 255) << 8;
        int i27 = i19 + 10;
        int i28 = i26 | (bArr[i19 + 4] & 255) | ((bArr[i27 - 4] & 255) << 16) | (bArr[i27 - 3] << 24);
        int i29 = (((((i22 ^ i18) & i25) ^ i18) + i28) - 1473231341) + i15;
        int i30 = ((i29 << 17) | (i29 >>> 15)) + i25;
        int i31 = ((bArr[i27 - 1] & 255) << 8) | (bArr[i27 - 2] & 255) | ((bArr[i27] & 255) << 16) | (bArr[i27 + 1] << 24);
        int i32 = (((((i25 ^ i22) & i30) ^ i22) + i31) - 45705983) + i18;
        int i33 = ((i32 << 22) | (i32 >>> 10)) + i30;
        int i34 = ((bArr[i27 + 3] & 255) << 8) | (bArr[i27 + 2] & 255) | ((bArr[i27 + 4] & 255) << 16) | (bArr[i27 + 5] << 24);
        int i35 = (((i30 ^ i25) & i33) ^ i25) + i34 + 1770035416 + i22;
        int i36 = ((i35 << 7) | (i35 >>> 25)) + i33;
        int i37 = i27 + 10;
        int i38 = ((bArr[i37 - 3] & 255) << 8) | (bArr[i37 - 4] & 255) | ((bArr[i37 - 2] & 255) << 16) | (bArr[i37 - 1] << 24);
        int i39 = (((((i33 ^ i30) & i36) ^ i30) + i38) - 1958414417) + i25;
        int i40 = ((i39 << 12) | (i39 >>> 20)) + i36;
        int i41 = ((bArr[i37 + 1] & 255) << 8) | (bArr[i37] & 255) | ((bArr[i37 + 2] & 255) << 16) | (bArr[i37 + 3] << 24);
        int i42 = (((((i36 ^ i33) & i40) ^ i33) + i41) - 42063) + i30;
        int i43 = ((i42 << 17) | (i42 >>> 15)) + i40;
        int i44 = (bArr[i37 + 5] & 255) << 8;
        int i45 = i37 + 10;
        int i46 = i44 | (bArr[i37 + 4] & 255) | ((bArr[i45 - 4] & 255) << 16) | (bArr[i45 - 3] << 24);
        int i47 = (((((i40 ^ i36) & i43) ^ i36) + i46) - 1990404162) + i33;
        int i48 = ((i47 << 22) | (i47 >>> 10)) + i43;
        int i49 = ((bArr[i45 - 1] & 255) << 8) | (bArr[i45 - 2] & 255) | ((bArr[i45] & 255) << 16) | (bArr[i45 + 1] << 24);
        int i50 = (((i43 ^ i40) & i48) ^ i40) + i49 + 1804603682 + i36;
        int i51 = ((i50 << 7) | (i50 >>> 25)) + i48;
        int i52 = ((bArr[i45 + 3] & 255) << 8) | (bArr[i45 + 2] & 255) | ((bArr[i45 + 4] & 255) << 16) | (bArr[i45 + 5] << 24);
        int i53 = (((((i48 ^ i43) & i51) ^ i43) + i52) - 40341101) + i40;
        int i54 = ((i53 << 12) | (i53 >>> 20)) + i51;
        int i55 = i45 + 10;
        int i56 = ((bArr[i55 - 3] & 255) << 8) | (bArr[i55 - 4] & 255) | ((bArr[i55 - 2] & 255) << 16) | (bArr[i55 - 1] << 24);
        int i57 = (((((i51 ^ i48) & i54) ^ i48) + i56) - 1502002290) + i43;
        int i58 = ((i57 << 17) | (i57 >>> 15)) + i54;
        int i59 = (bArr[i55 + 1] & 255) << 8;
        int i60 = (bArr[i55 + 3] << 24) | i59 | (bArr[i55] & 255) | ((bArr[i55 + 2] & 255) << 16);
        int i61 = (((i54 ^ i51) & i58) ^ i51) + i60 + 1236535329 + i48;
        int i62 = ((i61 << 22) | (i61 >>> 10)) + i58;
        int i63 = (((((i58 ^ i62) & i54) ^ i58) + i10) - 165796510) + i51;
        int i64 = ((i63 << 5) | (i63 >>> 27)) + i62;
        int i65 = (((((i62 ^ i64) & i58) ^ i62) + i28) - 1069501632) + i54;
        int i66 = ((i65 << 9) | (i65 >>> 23)) + i64;
        int i67 = (((i64 ^ i66) & i62) ^ i64) + i46 + 643717713 + i58;
        int i68 = ((i67 << 14) | (i67 >>> 18)) + i66;
        int i69 = (((((i66 ^ i68) & i64) ^ i66) + i5) - 373897302) + i62;
        int i70 = ((i69 << 20) | (i69 >>> 12)) + i68;
        int i71 = (((((i68 ^ i70) & i66) ^ i68) + i23) - 701558691) + i64;
        int i72 = ((i71 << 5) | (i71 >>> 27)) + i70;
        int i73 = (((i70 ^ i72) & i68) ^ i70) + i41 + 38016083 + i66;
        int i74 = ((i73 << 9) | (i73 >>> 23)) + i72;
        int i75 = (((((i72 ^ i74) & i70) ^ i72) + i60) - 660478335) + i68;
        int i76 = ((i75 << 14) | (i75 >>> 18)) + i74;
        int i77 = (((((i74 ^ i76) & i72) ^ i74) + i20) - 405537848) + i70;
        int i78 = ((i77 << 20) | (i77 >>> 12)) + i76;
        int i79 = (((i76 ^ i78) & i74) ^ i76) + i38 + 568446438 + i72;
        int i80 = ((i79 << 5) | (i79 >>> 27)) + i78;
        int i81 = (((((i78 ^ i80) & i76) ^ i78) + i56) - 1019803690) + i74;
        int i82 = ((i81 << 9) | (i81 >>> 23)) + i80;
        int i83 = (((((i80 ^ i82) & i78) ^ i80) + i16) - 187363961) + i76;
        int i84 = ((i83 << 14) | (i83 >>> 18)) + i82;
        int i85 = (((i82 ^ i84) & i80) ^ i82) + i34 + 1163531501 + i78;
        int i86 = ((i85 << 20) | (i85 >>> 12)) + i84;
        int i87 = (((((i84 ^ i86) & i82) ^ i84) + i52) - 1444681467) + i80;
        int i88 = ((i87 << 5) | (i87 >>> 27)) + i86;
        int i89 = (((((i86 ^ i88) & i84) ^ i86) + i13) - 51403784) + i82;
        int i90 = ((i89 << 9) | (i89 >>> 23)) + i88;
        int i91 = (((i88 ^ i90) & i86) ^ i88) + i31 + 1735328473 + i84;
        int i92 = ((i91 << 14) | (i91 >>> 18)) + i90;
        int i93 = (((((i90 ^ i92) & i88) ^ i90) + i49) - 1926607734) + i86;
        int i94 = ((i93 << 20) | (i93 >>> 12)) + i92;
        int i95 = ((((i92 ^ i94) ^ i90) + i23) - 378558) + i88;
        int i96 = ((i95 << 4) | (i95 >>> 28)) + i94;
        int i97 = ((((i94 ^ i96) ^ i92) + i34) - 2022574463) + i90;
        int i98 = ((i97 << 11) | (i97 >>> 21)) + i96;
        int i99 = ((i96 ^ i98) ^ i94) + i46 + 1839030562 + i92;
        int i100 = ((i99 << 16) | (i99 >>> 16)) + i98;
        int i101 = ((((i98 ^ i100) ^ i96) + i56) - 35309556) + i94;
        int i102 = ((i101 << 23) | (i101 >>> 9)) + i100;
        int i103 = ((((i100 ^ i102) ^ i98) + i10) - 1530992060) + i96;
        int i104 = ((i103 << 4) | (i103 >>> 28)) + i102;
        int i105 = ((i102 ^ i104) ^ i100) + i20 + 1272893353 + i98;
        int i106 = ((i105 << 11) | (i105 >>> 21)) + i104;
        int i107 = ((((i104 ^ i106) ^ i102) + i31) - 155497632) + i100;
        int i108 = ((i107 << 16) | (i107 >>> 16)) + i106;
        int i109 = ((((i106 ^ i108) ^ i104) + i41) - 1094730640) + i102;
        int i110 = ((i109 << 23) | (i109 >>> 9)) + i108;
        int i111 = ((i108 ^ i110) ^ i106) + i52 + 681279174 + i104;
        int i112 = ((i111 << 4) | (i111 >>> 28)) + i110;
        int i113 = ((((i110 ^ i112) ^ i108) + i5) - 358537222) + i106;
        int i114 = ((i113 << 11) | (i113 >>> 21)) + i112;
        int i115 = ((((i112 ^ i114) ^ i110) + i16) - 722521979) + i108;
        int i116 = ((i115 << 16) | (i115 >>> 16)) + i114;
        int i117 = ((i114 ^ i116) ^ i112) + i28 + 76029189 + i110;
        int i118 = ((i117 << 23) | (i117 >>> 9)) + i116;
        int i119 = ((((i116 ^ i118) ^ i114) + i38) - 640364487) + i112;
        int i120 = ((i119 << 4) | (i119 >>> 28)) + i118;
        int i121 = ((((i118 ^ i120) ^ i116) + i49) - 421815835) + i114;
        int i122 = ((i121 << 11) | (i121 >>> 21)) + i120;
        int i123 = ((i120 ^ i122) ^ i118) + i60 + 530742520 + i116;
        int i124 = ((i123 << 16) | (i123 >>> 16)) + i122;
        int i125 = ((((i122 ^ i124) ^ i120) + i13) - 995338651) + i118;
        int i126 = ((i125 << 23) | (i125 >>> 9)) + i124;
        int i127 = (((((~i122) | i126) ^ i124) + i5) - 198630844) + i120;
        int i128 = ((i127 << 6) | (i127 >>> 26)) + i126;
        int i129 = (((~i124) | i128) ^ i126) + i31 + 1126891415 + i122;
        int i130 = ((i129 >>> 22) | (i129 << 10)) + i128;
        int i131 = (((((~i126) | i130) ^ i128) + i56) - 1416354905) + i124;
        int i132 = ((i131 >>> 17) | (i131 << 15)) + i130;
        int i133 = (((((~i128) | i132) ^ i130) + i23) - 57434055) + i126;
        int i134 = ((i133 << 21) | (i133 >>> 11)) + i132;
        int i135 = (((~i130) | i134) ^ i132) + i49 + 1700485571 + i128;
        int i136 = ((i135 << 6) | (i135 >>> 26)) + i134;
        int i137 = (((((~i132) | i136) ^ i134) + i16) - 1894986606) + i130;
        int i138 = ((i137 << 10) | (i137 >>> 22)) + i136;
        int i139 = (((((~i134) | i138) ^ i136) + i41) - 1051523) + i132;
        int i140 = ((i139 << 15) | (i139 >>> 17)) + i138;
        int i141 = (((((~i136) | i140) ^ i138) + i10) - 2054922799) + i134;
        int i142 = ((i141 << 21) | (i141 >>> 11)) + i140;
        int i143 = (((~i138) | i142) ^ i140) + i34 + 1873313359 + i136;
        int i144 = ((i143 << 6) | (i143 >>> 26)) + i142;
        int i145 = (((((~i140) | i144) ^ i142) + i60) - 30611744) + i138;
        int i146 = ((i145 << 10) | (i145 >>> 22)) + i144;
        int i147 = (((((~i142) | i146) ^ i144) + i28) - 1560198380) + i140;
        int i148 = ((i147 << 15) | (i147 >>> 17)) + i146;
        int i149 = (((~i144) | i148) ^ i146) + i52 + 1309151649 + i142;
        int i150 = ((i149 << 21) | (i149 >>> 11)) + i148;
        int i151 = (((((~i146) | i150) ^ i148) + i20) - 145523070) + i144;
        int i152 = ((i151 << 6) | (i151 >>> 26)) + i150;
        int i153 = (((((~i148) | i152) ^ i150) + i46) - 1120210379) + i146;
        int i154 = ((i153 << 10) | (i153 >>> 22)) + i152;
        int i155 = (((~i150) | i154) ^ i152) + i13 + 718787259 + i148;
        int i156 = ((i155 << 15) | (i155 >>> 17)) + i154;
        int i157 = (((((~i152) | i156) ^ i154) + i38) - 343485551) + i150;
        this.hB = i2 + i156 + ((i157 << 21) | (i157 >>> 11));
        this.hC = i3 + i156;
        this.hD = i4 + i154;
        this.hA = i6 + i152;
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        MD5 md5 = (MD5) super.clone();
        md5.pad = (byte[]) this.pad.clone();
        return md5;
    }

    @Override // java.security.MessageDigestSpi
    public int engineDigest(byte[] bArr, int i, int i2) throws DigestException {
        if (i2 >= 16) {
            if (bArr.length - i < 16) {
                throw new DigestException("insufficient space in output buffer to store the digest");
            }
            byte[] bArr2 = this.pad;
            int i3 = this.padded;
            bArr2[i3] = Byte.MIN_VALUE;
            switch (i3) {
                case 56:
                    bArr2[57] = 0;
                case 57:
                    bArr2[58] = 0;
                case 58:
                    bArr2[59] = 0;
                case 59:
                    bArr2[60] = 0;
                case 60:
                    bArr2[61] = 0;
                case 61:
                    bArr2[62] = 0;
                case 62:
                    bArr2[63] = 0;
                case 63:
                    engineUpdate(bArr2, 0);
                    i3 = -1;
                    break;
            }
            switch (i3 & 7) {
                case 0:
                    i3 += 4;
                    bArr2[i3 - 3] = 0;
                    bArr2[i3 - 2] = 0;
                    bArr2[i3 - 1] = 0;
                    bArr2[i3] = 0;
                    bArr2[i3 + 1] = 0;
                    bArr2[i3 + 2] = 0;
                    bArr2[i3 + 3] = 0;
                    break;
                case 1:
                    i3 += 3;
                    bArr2[i3 - 2] = 0;
                    bArr2[i3 - 1] = 0;
                    bArr2[i3] = 0;
                    bArr2[i3 + 1] = 0;
                    bArr2[i3 + 2] = 0;
                    bArr2[i3 + 3] = 0;
                    break;
                case 2:
                    i3 += 2;
                    bArr2[i3 - 1] = 0;
                    bArr2[i3] = 0;
                    bArr2[i3 + 1] = 0;
                    bArr2[i3 + 2] = 0;
                    bArr2[i3 + 3] = 0;
                    break;
                case 3:
                    i3++;
                    bArr2[i3] = 0;
                    bArr2[i3 + 1] = 0;
                    bArr2[i3 + 2] = 0;
                    bArr2[i3 + 3] = 0;
                    break;
                case 4:
                    bArr2[i3 + 1] = 0;
                    bArr2[i3 + 2] = 0;
                    bArr2[i3 + 3] = 0;
                    break;
                case 5:
                    i3--;
                    bArr2[i3 + 2] = 0;
                    bArr2[i3 + 3] = 0;
                    break;
                case 6:
                    i3 -= 2;
                    bArr2[i3 + 3] = 0;
                    break;
                case 7:
                    i3 -= 3;
                    break;
            }
            while (true) {
                i3 += 8;
                if (i3 > 52) {
                    long j = this.bytes;
                    int i4 = ((int) j) << 3;
                    bArr2[56] = (byte) i4;
                    bArr2[57] = (byte) (i4 >>> 8);
                    bArr2[58] = (byte) (i4 >>> 16);
                    bArr2[59] = (byte) (i4 >>> 24);
                    int i5 = (int) (j >>> 29);
                    bArr2[60] = (byte) i5;
                    bArr2[61] = (byte) (i5 >>> 8);
                    bArr2[62] = (byte) (i5 >>> 16);
                    bArr2[63] = (byte) (i5 >>> 24);
                    engineUpdate(bArr2, 0);
                    int i6 = this.hA;
                    bArr[i] = (byte) i6;
                    bArr[i + 1] = (byte) (i6 >>> 8);
                    bArr[i + 2] = (byte) (i6 >>> 16);
                    bArr[i + 3] = (byte) (i6 >>> 24);
                    int i7 = this.hB;
                    bArr[i + 4] = (byte) i7;
                    bArr[i + 5] = (byte) (i7 >>> 8);
                    int i8 = i + 10;
                    bArr[i8 - 4] = (byte) (i7 >>> 16);
                    bArr[i8 - 3] = (byte) (i7 >>> 24);
                    int i9 = this.hC;
                    bArr[i8 - 2] = (byte) i9;
                    bArr[i8 - 1] = (byte) (i9 >>> 8);
                    bArr[i8] = (byte) (i9 >>> 16);
                    bArr[i8 + 1] = (byte) (i9 >>> 24);
                    int i10 = this.hD;
                    bArr[i8 + 2] = (byte) i10;
                    bArr[i8 + 3] = (byte) (i10 >>> 8);
                    bArr[i8 + 4] = (byte) (i10 >>> 16);
                    bArr[i8 + 5] = (byte) (i10 >>> 24);
                    engineReset();
                    return 16;
                }
                bArr2[i3 - 4] = 0;
                bArr2[i3 - 3] = 0;
                bArr2[i3 - 2] = 0;
                bArr2[i3 - 1] = 0;
                bArr2[i3] = 0;
                bArr2[i3 + 1] = 0;
                bArr2[i3 + 2] = 0;
                bArr2[i3 + 3] = 0;
            }
        } else {
            throw new DigestException("partial digests not returned");
        }
    }

    @Override // java.security.MessageDigestSpi
    public byte[] engineDigest() {
        try {
            byte[] bArr = new byte[16];
            engineDigest(bArr, 0, 16);
            return bArr;
        } catch (DigestException unused) {
            return null;
        }
    }

    @Override // java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 16;
    }

    @Override // java.security.MessageDigestSpi
    public void engineReset() {
        this.padded = 0;
        this.bytes = 0L;
        byte[] bArr = this.pad;
        int i = 60;
        do {
            bArr[i - 4] = 0;
            bArr[i - 3] = 0;
            bArr[i - 2] = 0;
            bArr[i - 1] = 0;
            bArr[i] = 0;
            bArr[i + 1] = 0;
            bArr[i + 2] = 0;
            bArr[i + 3] = 0;
            i -= 8;
        } while (i >= 0);
        init();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.bytes++;
        int i = this.padded;
        if (i < 63) {
            byte[] bArr = this.pad;
            this.padded = i + 1;
            bArr[i] = b;
            return;
        }
        byte[] bArr2 = this.pad;
        bArr2[63] = b;
        engineUpdate(bArr2, i);
        this.padded = 0;
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        this.bytes += i2;
        int i3 = this.padded;
        if (i3 > 0 && i3 + i2 >= 64) {
            int i4 = 64 - i3;
            System.arraycopy(bArr, i, this.pad, i3, i4);
            byte[] bArr2 = this.pad;
            this.padded = 0;
            engineUpdate(bArr2, 0);
            i += i4;
            i2 -= i4;
        }
        while (i2 >= 512) {
            engineUpdate(bArr, i);
            engineUpdate(bArr, i + 64);
            engineUpdate(bArr, i + 128);
            engineUpdate(bArr, i + crd.DETECT_WIDTH);
            engineUpdate(bArr, i + 256);
            engineUpdate(bArr, i + 320);
            engineUpdate(bArr, i + 384);
            engineUpdate(bArr, i + 448);
            i += 512;
            i2 -= 512;
        }
        while (i2 >= 64) {
            engineUpdate(bArr, i);
            i += 64;
            i2 -= 64;
        }
        if (i2 <= 0) {
            return;
        }
        System.arraycopy(bArr, i, this.pad, this.padded, i2);
        this.padded += i2;
    }

    protected void init() {
        this.hA = 1732584193;
        this.hB = -271733879;
        this.hC = -1732584194;
        this.hD = 271733878;
    }
}
