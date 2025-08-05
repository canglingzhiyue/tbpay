package com.uc.webview.internal.setup.verify;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: com.uc.webview.internal.setup.verify.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1044a extends Exception {
        public C1044a(String str) {
            super(str);
        }

        public C1044a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f23982a;

        public b(X509Certificate x509Certificate, byte[] bArr) {
            super(x509Certificate);
            this.f23982a = bArr;
        }

        @Override // com.uc.webview.internal.setup.verify.a.c, java.security.cert.Certificate
        public final byte[] getEncoded() throws CertificateEncodingException {
            return this.f23982a;
        }
    }

    /* loaded from: classes9.dex */
    static class c extends X509Certificate {

        /* renamed from: a  reason: collision with root package name */
        private final X509Certificate f23983a;

        public c(X509Certificate x509Certificate) {
            this.f23983a = x509Certificate;
        }

        @Override // java.security.cert.X509Certificate
        public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
            this.f23983a.checkValidity();
        }

        @Override // java.security.cert.X509Certificate
        public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
            this.f23983a.checkValidity(date);
        }

        @Override // java.security.cert.X509Certificate
        public int getBasicConstraints() {
            return this.f23983a.getBasicConstraints();
        }

        @Override // java.security.cert.X509Extension
        public Set<String> getCriticalExtensionOIDs() {
            return this.f23983a.getCriticalExtensionOIDs();
        }

        @Override // java.security.cert.Certificate
        public byte[] getEncoded() throws CertificateEncodingException {
            return this.f23983a.getEncoded();
        }

        @Override // java.security.cert.X509Extension
        public byte[] getExtensionValue(String str) {
            return this.f23983a.getExtensionValue(str);
        }

        @Override // java.security.cert.X509Certificate
        public Principal getIssuerDN() {
            return this.f23983a.getIssuerDN();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getIssuerUniqueID() {
            return this.f23983a.getIssuerUniqueID();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getKeyUsage() {
            return this.f23983a.getKeyUsage();
        }

        @Override // java.security.cert.X509Extension
        public Set<String> getNonCriticalExtensionOIDs() {
            return this.f23983a.getNonCriticalExtensionOIDs();
        }

        @Override // java.security.cert.X509Certificate
        public Date getNotAfter() {
            return this.f23983a.getNotAfter();
        }

        @Override // java.security.cert.X509Certificate
        public Date getNotBefore() {
            return this.f23983a.getNotBefore();
        }

        @Override // java.security.cert.Certificate
        public PublicKey getPublicKey() {
            return this.f23983a.getPublicKey();
        }

        @Override // java.security.cert.X509Certificate
        public BigInteger getSerialNumber() {
            return this.f23983a.getSerialNumber();
        }

        @Override // java.security.cert.X509Certificate
        public String getSigAlgName() {
            return this.f23983a.getSigAlgName();
        }

        @Override // java.security.cert.X509Certificate
        public String getSigAlgOID() {
            return this.f23983a.getSigAlgOID();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getSigAlgParams() {
            return this.f23983a.getSigAlgParams();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getSignature() {
            return this.f23983a.getSignature();
        }

        @Override // java.security.cert.X509Certificate
        public Principal getSubjectDN() {
            return this.f23983a.getSubjectDN();
        }

        @Override // java.security.cert.X509Certificate
        public boolean[] getSubjectUniqueID() {
            return this.f23983a.getSubjectUniqueID();
        }

        @Override // java.security.cert.X509Certificate
        public byte[] getTBSCertificate() throws CertificateEncodingException {
            return this.f23983a.getTBSCertificate();
        }

        @Override // java.security.cert.X509Certificate
        public int getVersion() {
            return this.f23983a.getVersion();
        }

        @Override // java.security.cert.X509Extension
        public boolean hasUnsupportedCriticalExtension() {
            return this.f23983a.hasUnsupportedCriticalExtension();
        }

        @Override // java.security.cert.Certificate
        public String toString() {
            return this.f23983a.toString();
        }

        @Override // java.security.cert.Certificate
        public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            this.f23983a.verify(publicKey);
        }

        @Override // java.security.cert.Certificate
        public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
            this.f23983a.verify(publicKey, str);
        }
    }

    private static int a(int i) {
        if (i != 513) {
            if (i == 514) {
                return 2;
            }
            if (i == 769) {
                return 1;
            }
            if (i == 770) {
                return 2;
            }
            switch (i) {
                case 257:
                case com.taobao.global.setting.data.c.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                    return 1;
                case 258:
                case 260:
                    return 2;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
            }
        }
        return 1;
    }

    private static long a(ByteBuffer byteBuffer, int i) throws C1044a {
        if (!e.a(byteBuffer, i)) {
            ByteBuffer a2 = a(byteBuffer, i, byteBuffer.capacity());
            long b2 = e.b(a2);
            long j = i;
            if (b2 < j) {
                if (e.c(a2) + b2 != j) {
                    throw new C1044a("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                return b2;
            }
            throw new C1044a("ZIP Central Directory offset out of range: " + b2 + ". ZIP End of Central Directory offset: " + i);
        }
        throw new C1044a("ZIP64 APK not supported");
    }

    private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
            }
            int capacity = byteBuffer.capacity();
            if (i2 > byteBuffer.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + i2 + " > " + capacity);
            }
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            try {
                byteBuffer.position(0);
                byteBuffer.limit(i2);
                byteBuffer.position(i);
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                return slice;
            } finally {
                byteBuffer.position(0);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
            }
        }
        throw new IllegalArgumentException("start: ".concat(String.valueOf(i)));
    }

    private static Map<Integer, byte[]> a(int[] iArr, ByteBuffer[] byteBufferArr) throws DigestException {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= 3) {
                break;
            }
            i3 += ((byteBufferArr[i2].remaining() + 1048576) - 1) / 1048576;
            i2++;
        }
        HashMap hashMap = new HashMap(i3);
        for (int i4 : iArr) {
            byte[] bArr = new byte[(c(i4) * i3) + 5];
            bArr[0] = 90;
            a(i3, bArr);
            hashMap.put(Integer.valueOf(i4), bArr);
        }
        byte[] bArr2 = new byte[5];
        bArr2[0] = -91;
        int i5 = 0;
        int i6 = 0;
        for (i = 3; i5 < i; i = 3) {
            ByteBuffer byteBuffer = byteBufferArr[i5];
            while (byteBuffer.hasRemaining()) {
                ByteBuffer b2 = b(byteBuffer, Math.min(byteBuffer.remaining(), 1048576));
                for (int i7 : iArr) {
                    String b3 = b(i7);
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(b3);
                        b2.clear();
                        a(b2.remaining(), bArr2);
                        messageDigest.update(bArr2);
                        messageDigest.update(b2);
                        int c2 = c(i7);
                        int digest = messageDigest.digest((byte[]) hashMap.get(Integer.valueOf(i7)), (i6 * c2) + 5, c2);
                        if (digest != c2) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                    } catch (NoSuchAlgorithmException e) {
                        throw new RuntimeException(b3 + " digest not supported", e);
                    }
                }
                i6++;
            }
            i5++;
        }
        HashMap hashMap2 = new HashMap(iArr.length);
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            byte[] bArr3 = (byte[]) entry.getValue();
            String b4 = b(intValue);
            try {
                hashMap2.put(Integer.valueOf(intValue), MessageDigest.getInstance(b4).digest(bArr3));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(b4 + " digest not supported", e2);
            }
        }
        return hashMap2;
    }

    private static void a(int i, byte[] bArr) {
        bArr[1] = (byte) i;
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) (i >>> 16);
        bArr[4] = (byte) (i >>> 24);
    }

    private static void a(Map<Integer, byte[]> map, ByteBuffer byteBuffer, int i, int i2, int i3) throws SecurityException {
        int intValue;
        if (!map.isEmpty()) {
            ByteBuffer a2 = a(byteBuffer, 0, i);
            ByteBuffer a3 = a(byteBuffer, i2, i3);
            byte[] bArr = new byte[byteBuffer.capacity() - i3];
            byteBuffer.position(i3);
            byteBuffer.get(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.order(byteBuffer.order());
            long j = i;
            e.d(wrap);
            int position = wrap.position() + 16;
            if (j < 0 || j > 4294967295L) {
                throw new IllegalArgumentException("uint32 value of out range: ".concat(String.valueOf(j)));
            }
            wrap.putInt(wrap.position() + position, (int) j);
            int[] iArr = new int[map.size()];
            int i4 = 0;
            for (Integer num : map.keySet()) {
                iArr[i4] = num.intValue();
                i4++;
            }
            try {
                Map<Integer, byte[]> a4 = a(iArr, new ByteBuffer[]{a2, a3, wrap});
                for (Map.Entry<Integer, byte[]> entry : map.entrySet()) {
                    if (!MessageDigest.isEqual(entry.getValue(), a4.get(Integer.valueOf(entry.getKey().intValue())))) {
                        throw new SecurityException(b(intValue) + " digest of contents did not verify");
                    }
                }
                return;
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        }
        throw new SecurityException("No digests provided");
    }

    public static boolean a(String str) throws IOException {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
            try {
                long length = randomAccessFile.length();
                if (length > 2147483647L) {
                    randomAccessFile.close();
                    return false;
                }
                try {
                    MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, length);
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    int a2 = (int) a(map, b(map));
                    e(a(map, c(map, a2), a2));
                    randomAccessFile.close();
                    return true;
                } catch (IOException e) {
                    if (!(e.getCause() instanceof OutOfMemoryError)) {
                        throw new IOException("Failed to memory-map APK", e);
                    }
                    randomAccessFile.close();
                    return false;
                }
            } catch (C1044a unused) {
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (C1044a unused2) {
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184 A[Catch: SignatureException -> 0x02a9, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02ab, InvalidKeyException -> 0x02ad, InvalidKeySpecException -> 0x02af, NoSuchAlgorithmException -> 0x02b1, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x02ab, blocks: (B:81:0x016e, B:83:0x0184, B:84:0x0187), top: B:150:0x016e }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] a(java.nio.ByteBuffer r22, java.util.Map<java.lang.Integer, byte[]> r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.verify.a.a(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static X509Certificate[][] a(RandomAccessFile randomAccessFile) throws C1044a, SecurityException, IOException {
        long length = randomAccessFile.length();
        if (length > 2147483647L) {
            throw new IOException("File too large: " + randomAccessFile.length() + " bytes");
        }
        try {
            MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, length);
            map.load();
            return a(map);
        } catch (IOException e) {
            if (!(e.getCause() instanceof OutOfMemoryError)) {
                throw new IOException("Failed to memory-map APK", e);
            }
            throw new C1044a("Failed to memory-map APK", e);
        }
    }

    public static X509Certificate[][] a(ByteBuffer byteBuffer) throws C1044a, SecurityException {
        ByteBuffer slice = byteBuffer.slice();
        slice.order(ByteOrder.LITTLE_ENDIAN);
        int b2 = b(slice);
        int a2 = (int) a(slice, b2);
        int c2 = c(slice, a2);
        return a(slice, e(a(slice, c2, a2)), c2, a2, b2);
    }

    private static X509Certificate[][] a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer c2 = c(byteBuffer2);
                int i4 = 0;
                while (c2.hasRemaining()) {
                    i4++;
                    try {
                        arrayList.add(a(c(c2), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i4 + " block", e);
                    }
                }
                if (i4 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                a(hashMap, byteBuffer, i, i2, i3);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }

    private static int b(ByteBuffer byteBuffer) throws C1044a {
        int a2 = e.a(byteBuffer);
        if (a2 != -1) {
            return a2;
        }
        throw new C1044a("Not an APK file: ZIP End of Central Directory record not found");
    }

    private static String b(int i) {
        if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i)));
            }
            return "SHA-512";
        }
        return "SHA-256";
    }

    private static ByteBuffer b(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
    }

    public static X509Certificate[][] b(String str) throws C1044a, SecurityException, IOException {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(str, "r");
        } catch (Throwable th) {
            th = th;
        }
        try {
            X509Certificate[][] a2 = a(randomAccessFile);
            randomAccessFile.close();
            return a2;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    private static int c(int i) {
        if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown content digest algorthm: ".concat(String.valueOf(i)));
            }
            return 64;
        }
        return 32;
    }

    private static int c(ByteBuffer byteBuffer, int i) throws C1044a {
        f(byteBuffer);
        if (i >= 32) {
            if (byteBuffer.getLong(i - 16) != 2334950737559900225L || byteBuffer.getLong(i - 8) != 3617552046287187010L) {
                throw new C1044a("No APK Signing Block before ZIP Central Directory");
            }
            long j = byteBuffer.getLong(i - 24);
            if (j < 24 || j > 2147483639) {
                throw new C1044a("APK Signing Block size out of range: ".concat(String.valueOf(j)));
            }
            int i2 = (int) j;
            int i3 = i - (i2 + 8);
            if (i3 < 0) {
                throw new C1044a("APK Signing Block offset out of range: ".concat(String.valueOf(i3)));
            }
            long j2 = byteBuffer.getLong(i3);
            if (j2 == i2) {
                return i3;
            }
            throw new C1044a("APK Signing Block sizes in header and footer do not match: " + j2 + " vs " + i2);
        }
        throw new C1044a("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(i)));
    }

    private static ByteBuffer c(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return b(byteBuffer, i);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    private static byte[] d(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
        }
        throw new IOException("Negative length");
    }

    private static ByteBuffer e(ByteBuffer byteBuffer) throws C1044a {
        f(byteBuffer);
        ByteBuffer a2 = a(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i = 0;
        while (a2.hasRemaining()) {
            i++;
            if (a2.remaining() < 8) {
                throw new C1044a("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i)));
            }
            long j = a2.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new C1044a("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int position = a2.position() + i2;
            if (i2 > a2.remaining()) {
                throw new C1044a("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a2.remaining());
            } else if (a2.getInt() == 1896449818) {
                return b(a2, i2 - 4);
            } else {
                a2.position(position);
            }
        }
        throw new C1044a("No APK Signature Scheme v2 block in APK Signing Block");
    }

    private static void f(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            return;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }
}
