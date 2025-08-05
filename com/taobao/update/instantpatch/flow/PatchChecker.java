package com.taobao.update.instantpatch.flow;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import android.util.Pair;
import com.android.alibaba.ip.common.IPatchVerifier;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.instantpatch.InstantPatchUpdater;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
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
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import tb.bgu;
import tb.jhy;
import tb.kge;
import tb.rge;
import tb.rgf;
import tb.rgk;

/* loaded from: classes9.dex */
public class PatchChecker implements IPatchVerifier {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rge f23433a = rgf.getLog(PatchChecker.class, (rge) null);

    static {
        kge.a(-1902540711);
        kge.a(881269490);
    }

    @Override // com.android.alibaba.ip.common.IPatchVerifier
    public boolean authenticate(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33649157", new Object[]{this, file})).booleanValue();
        }
        ArrayList<X509Certificate> arrayList = new ArrayList<>();
        Signature[] a2 = a();
        if (a2 != null) {
            for (Signature signature : a2) {
                X509Certificate a3 = a(signature);
                if (a3 != null) {
                    arrayList.add(a3);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            try {
                if (!a(ApkSignatureSchemeV2Verifier.verify(file.getAbsolutePath()), arrayList)) {
                    return false;
                }
                this.f23433a.w("patch verify success");
                return true;
            } catch (ApkSignatureSchemeV2Verifier.SignatureNotFoundException e) {
                e.printStackTrace();
                this.f23433a.w("patch verify failed");
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                this.f23433a.w("patch verify failed");
                return false;
            }
        }
        return false;
    }

    private boolean a(X509Certificate[][] x509CertificateArr, ArrayList<X509Certificate> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db1c783f", new Object[]{this, x509CertificateArr, arrayList})).booleanValue();
        }
        if (x509CertificateArr == null || x509CertificateArr.length == 0 || x509CertificateArr[0].length == 0) {
            return false;
        }
        if (arrayList.isEmpty()) {
            this.f23433a.w("No certificates found for app.");
            return false;
        }
        Iterator<X509Certificate> it = arrayList.iterator();
        while (it.hasNext()) {
            X509Certificate next = it.next();
            boolean z = false;
            for (X509Certificate[] x509CertificateArr2 : x509CertificateArr) {
                if (((ApkSignatureSchemeV2Verifier.VerbatimX509Certificate) x509CertificateArr2[0]).getWrapped().equals(next)) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    private final Signature[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Signature[]) ipChange.ipc$dispatch("9d45ee20", new Object[]{this});
        }
        try {
            return InstantPatchUpdater.instance().getContext().getPackageManager().getPackageInfo(InstantPatchUpdater.instance().getContext().getPackageName(), 64).signatures;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static X509Certificate a(Signature signature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (X509Certificate) ipChange.ipc$dispatch("f23e7c62", new Object[]{signature});
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e) {
            Log.e(bgu.MODULE, "Cannot decode certificate.", e);
            return null;
        }
    }

    /* loaded from: classes9.dex */
    public static class ApkSignatureSchemeV2Verifier {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int SF_ATTRIBUTE_ANDROID_APK_SIGNED_ID = 2;
        public static final String SF_ATTRIBUTE_ANDROID_APK_SIGNED_NAME = "X-Android-APK-Signed";

        static {
            kge.a(-729456738);
        }

        private static boolean a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
            }
            if (i != 513 && i != 514 && i != 769) {
                switch (i) {
                    case 257:
                    case 258:
                    case com.taobao.global.setting.data.c.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                    case 260:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }

        public static X509Certificate[][] verify(String str) throws SignatureNotFoundException, SecurityException, IOException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (X509Certificate[][]) ipChange.ipc$dispatch("cd5e7cf3", new Object[]{str}) : a(new RandomAccessFile(str, "r"));
        }

        private static X509Certificate[][] a(RandomAccessFile randomAccessFile) throws SignatureNotFoundException, SecurityException, IOException {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (X509Certificate[][]) ipChange.ipc$dispatch("9466daa5", new Object[]{randomAccessFile}) : a(randomAccessFile.getFD(), b(randomAccessFile));
        }

        /* loaded from: classes9.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final ByteBuffer f23434a;
            private final long b;
            private final long c;
            private final long d;
            private final ByteBuffer e;

            static {
                kge.a(1042518752);
            }

            public static /* synthetic */ ByteBuffer a(a aVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ByteBuffer) ipChange.ipc$dispatch("a3d63ddf", new Object[]{aVar}) : aVar.f23434a;
            }

            private a(ByteBuffer byteBuffer, long j, long j2, long j3, ByteBuffer byteBuffer2) {
                this.f23434a = byteBuffer;
                this.b = j;
                this.c = j2;
                this.d = j3;
                this.e = byteBuffer2;
            }
        }

        private static a b(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ae53be4f", new Object[]{randomAccessFile});
            }
            Pair<ByteBuffer, Long> c = c(randomAccessFile);
            ByteBuffer byteBuffer = (ByteBuffer) c.first;
            long longValue = ((Long) c.second).longValue();
            if (rgk.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile, longValue)) {
                throw new SignatureNotFoundException("ZIP64 APK not supported");
            }
            long a2 = a(byteBuffer, longValue);
            Pair<ByteBuffer, Long> a3 = a(randomAccessFile, a2);
            return new a(c((ByteBuffer) a3.first), ((Long) a3.second).longValue(), a2, longValue, byteBuffer);
        }

        private static X509Certificate[][] a(FileDescriptor fileDescriptor, a aVar) throws SecurityException {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (X509Certificate[][]) ipChange.ipc$dispatch("5a27b6e7", new Object[]{fileDescriptor, aVar});
            }
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                try {
                    ByteBuffer a2 = a(a.a(aVar));
                    while (a2.hasRemaining()) {
                        i++;
                        try {
                            arrayList.add(a(a(a2), hashMap, certificateFactory));
                        } catch (IOException | SecurityException | BufferUnderflowException e) {
                            throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                        }
                    }
                    if (i <= 0) {
                        throw new SecurityException("No signers found");
                    }
                    if (hashMap.isEmpty()) {
                        throw new SecurityException("No content digests found");
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                } catch (IOException e2) {
                    throw new SecurityException("Failed to read list of signers", e2);
                }
            } catch (CertificateException e3) {
                throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
            }
        }

        private static X509Certificate[] a(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) throws SecurityException, IOException {
            int b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (X509Certificate[]) ipChange.ipc$dispatch("212efb5", new Object[]{byteBuffer, map, certificateFactory});
            }
            ByteBuffer a2 = a(byteBuffer);
            ByteBuffer a3 = a(byteBuffer);
            byte[] b2 = b(byteBuffer);
            ArrayList arrayList = new ArrayList();
            byte[] bArr = null;
            int i = -1;
            int i2 = 0;
            while (a3.hasRemaining()) {
                i2++;
                try {
                    ByteBuffer a4 = a(a3);
                    if (a4.remaining() < 8) {
                        throw new SecurityException("Signature record too short");
                    }
                    int i3 = a4.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (a(i3) && (i == -1 || a(i3, i) > 0)) {
                        bArr = b(a4);
                        i = i3;
                    }
                } catch (IOException | BufferUnderflowException e) {
                    throw new SecurityException("Failed to parse signature record #" + i2, e);
                }
            }
            if (i == -1) {
                if (i2 == 0) {
                    throw new SecurityException("No signatures found");
                }
                throw new SecurityException("No supported signatures found");
            }
            String d = d(i);
            Pair<String, ? extends AlgorithmParameterSpec> e2 = e(i);
            String str = (String) e2.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) e2.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(d).generatePublic(new X509EncodedKeySpec(b2));
                java.security.Signature signature = java.security.Signature.getInstance(str);
                signature.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    signature.setParameter(algorithmParameterSpec);
                }
                signature.update(a2);
                if (!signature.verify(bArr)) {
                    throw new SecurityException(str + " signature did not verify");
                }
                a2.clear();
                ByteBuffer a5 = a(a2);
                ArrayList arrayList2 = new ArrayList();
                byte[] bArr2 = null;
                int i4 = 0;
                while (a5.hasRemaining()) {
                    i4++;
                    try {
                        ByteBuffer a6 = a(a5);
                        if (a6.remaining() < 8) {
                            throw new IOException("Record too short");
                        }
                        int i5 = a6.getInt();
                        arrayList2.add(Integer.valueOf(i5));
                        if (i5 == i) {
                            bArr2 = b(a6);
                        }
                    } catch (IOException | BufferUnderflowException e3) {
                        throw new IOException("Failed to parse digest record #" + i4, e3);
                    }
                }
                if (!arrayList.equals(arrayList2)) {
                    throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                }
                byte[] put = map.put(Integer.valueOf(b(i)), bArr2);
                if (put != null && !MessageDigest.isEqual(put, bArr2)) {
                    throw new SecurityException(c(b) + " contents digest does not match the digest specified by a preceding signer");
                }
                ByteBuffer a7 = a(a2);
                ArrayList arrayList3 = new ArrayList();
                int i6 = 0;
                while (a7.hasRemaining()) {
                    i6++;
                    byte[] b3 = b(a7);
                    try {
                        arrayList3.add(new VerbatimX509Certificate((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b3)), b3));
                    } catch (CertificateException e4) {
                        throw new SecurityException("Failed to decode certificate #" + i6, e4);
                    }
                }
                if (arrayList3.isEmpty()) {
                    throw new SecurityException("No certificates listed");
                }
                if (!Arrays.equals(b2, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                    throw new SecurityException("Public key mismatch between certificate and signature record");
                }
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e5) {
                throw new SecurityException("Failed to verify " + str + " signature", e5);
            }
        }

        private static Pair<ByteBuffer, Long> c(RandomAccessFile randomAccessFile) throws IOException, SignatureNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("b1ec5a4", new Object[]{randomAccessFile});
            }
            Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord = rgk.findZipEndOfCentralDirectoryRecord(randomAccessFile);
            if (findZipEndOfCentralDirectoryRecord == null) {
                throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
            }
            return findZipEndOfCentralDirectoryRecord;
        }

        private static long a(ByteBuffer byteBuffer, long j) throws SignatureNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7f34e9ef", new Object[]{byteBuffer, new Long(j)})).longValue();
            }
            long zipEocdCentralDirectoryOffset = rgk.getZipEocdCentralDirectoryOffset(byteBuffer);
            if (zipEocdCentralDirectoryOffset > j) {
                throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + zipEocdCentralDirectoryOffset + ". ZIP End of Central Directory offset: " + j);
            } else if (rgk.getZipEocdCentralDirectorySizeBytes(byteBuffer) + zipEocdCentralDirectoryOffset != j) {
                throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
            } else {
                return zipEocdCentralDirectoryOffset;
            }
        }

        private static int a(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : b(b(i), b(i2));
        }

        private static int b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90f78dfc", new Object[]{new Integer(i), new Integer(i2)})).intValue();
            }
            if (i == 1) {
                if (i2 == 1) {
                    return 0;
                }
                if (i2 == 2) {
                    return -1;
                }
                throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i2);
            } else if (i != 2) {
                throw new IllegalArgumentException("Unknown digestAlgorithm1: " + i);
            } else if (i2 == 1) {
                return 1;
            } else {
                if (i2 == 2) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown digestAlgorithm2: " + i2);
            }
        }

        private static int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
            }
            if (i != 513) {
                if (i == 514) {
                    return 2;
                }
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case com.taobao.global.setting.data.c.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                            break;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
                    }
                }
            }
            return 1;
        }

        private static String c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{new Integer(i)});
            }
            if (i == 1) {
                return "SHA-256";
            }
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i);
        }

        private static String d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6ef97628", new Object[]{new Integer(i)});
            }
            if (i == 513 || i == 514) {
                return "EC";
            }
            if (i == 769) {
                return "DSA";
            }
            switch (i) {
                case 257:
                case 258:
                case com.taobao.global.setting.data.c.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                case 260:
                    return jhy.KEY_ALGORITHM;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
            }
        }

        private static Pair<String, ? extends AlgorithmParameterSpec> e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("faa030a1", new Object[]{new Integer(i)});
            }
            if (i == 513) {
                return Pair.create("SHA256withECDSA", null);
            }
            if (i == 514) {
                return Pair.create("SHA512withECDSA", null);
            }
            if (i != 769) {
                switch (i) {
                    case 257:
                        return Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    case 258:
                        return Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    case com.taobao.global.setting.data.c.ERROR_MTOP_SERVICE_EXCEPTION /* 259 */:
                        return Pair.create("SHA256withRSA", null);
                    case 260:
                        return Pair.create("SHA512withRSA", null);
                    default:
                        throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i));
                }
            }
            return Pair.create("SHA256withDSA", null);
        }

        private static ByteBuffer a(ByteBuffer byteBuffer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("bd53e2ca", new Object[]{byteBuffer, new Integer(i), new Integer(i2)});
            }
            if (i < 0) {
                throw new IllegalArgumentException("start: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("end < start: " + i2 + " < " + i);
            } else {
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
        }

        private static ByteBuffer a(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("9c6a727b", new Object[]{byteBuffer, new Integer(i)});
            }
            if (i < 0) {
                throw new IllegalArgumentException("size: " + i);
            }
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

        private static ByteBuffer a(ByteBuffer byteBuffer) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("9b5aa8aa", new Object[]{byteBuffer});
            }
            if (byteBuffer.remaining() < 4) {
                throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
            }
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            }
            if (i > byteBuffer.remaining()) {
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
            }
            return a(byteBuffer, i);
        }

        private static byte[] b(ByteBuffer byteBuffer) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("b88584d5", new Object[]{byteBuffer});
            }
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IOException("Negative length");
            }
            if (i > byteBuffer.remaining()) {
                throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
            }
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }

        private static Pair<ByteBuffer, Long> a(RandomAccessFile randomAccessFile, long j) throws IOException, SignatureNotFoundException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("c0060bb6", new Object[]{randomAccessFile, new Long(j)});
            }
            if (j < 32) {
                throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
            }
            ByteBuffer allocate = ByteBuffer.allocate(24);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(j - allocate.capacity());
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
                throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
            }
            long j2 = allocate.getLong(0);
            if (j2 < allocate.capacity() || j2 > 2147483639) {
                throw new SignatureNotFoundException("APK Signing Block size out of range: " + j2);
            }
            int i = (int) (8 + j2);
            long j3 = j - i;
            if (j3 < 0) {
                throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j3);
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i);
            allocate2.order(ByteOrder.LITTLE_ENDIAN);
            randomAccessFile.seek(j3);
            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
            long j4 = allocate2.getLong(0);
            if (j4 != j2) {
                throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
            }
            return Pair.create(allocate2, Long.valueOf(j3));
        }

        private static ByteBuffer c(ByteBuffer byteBuffer) throws SignatureNotFoundException {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return (ByteBuffer) ipChange.ipc$dispatch("e49c3e8", new Object[]{byteBuffer});
            }
            d(byteBuffer);
            ByteBuffer a2 = a(byteBuffer, 8, byteBuffer.capacity() - 24);
            while (a2.hasRemaining()) {
                i++;
                if (a2.remaining() < 8) {
                    throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
                }
                long j = a2.getLong();
                if (j < 4 || j > 2147483647L) {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
                }
                int i2 = (int) j;
                int position = a2.position() + i2;
                if (i2 > a2.remaining()) {
                    throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a2.remaining());
                } else if (a2.getInt() == 1896449818) {
                    return a(a2, i2 - 4);
                } else {
                    a2.position(position);
                }
            }
            throw new SignatureNotFoundException("No APK Signature Scheme v2 block in APK Signing Block");
        }

        private static void d(ByteBuffer byteBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f0c346", new Object[]{byteBuffer});
            } else if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
        }

        /* loaded from: classes9.dex */
        public static class SignatureNotFoundException extends Exception {
            private static final long serialVersionUID = 1;

            static {
                kge.a(-1981864018);
            }

            public SignatureNotFoundException(String str) {
                super(str);
            }

            public SignatureNotFoundException(String str, Throwable th) {
                super(str, th);
            }
        }

        /* loaded from: classes9.dex */
        public static class VerbatimX509Certificate extends WrappedX509Certificate {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private byte[] encodedVerbatim;

            static {
                kge.a(491633653);
            }

            public VerbatimX509Certificate(X509Certificate x509Certificate, byte[] bArr) {
                super(x509Certificate);
                this.encodedVerbatim = bArr;
            }

            @Override // com.taobao.update.instantpatch.flow.PatchChecker.ApkSignatureSchemeV2Verifier.WrappedX509Certificate, java.security.cert.Certificate
            public byte[] getEncoded() throws CertificateEncodingException {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("466b135e", new Object[]{this}) : this.encodedVerbatim;
            }
        }

        /* loaded from: classes9.dex */
        public static class WrappedX509Certificate extends X509Certificate {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final X509Certificate wrapped;

            static {
                kge.a(1632477394);
            }

            public WrappedX509Certificate(X509Certificate x509Certificate) {
                this.wrapped = x509Certificate;
            }

            public X509Certificate getWrapped() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (X509Certificate) ipChange.ipc$dispatch("304c4607", new Object[]{this}) : this.wrapped;
            }

            @Override // java.security.cert.X509Extension
            public Set<String> getCriticalExtensionOIDs() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("cbd68f29", new Object[]{this}) : this.wrapped.getCriticalExtensionOIDs();
            }

            @Override // java.security.cert.X509Extension
            public byte[] getExtensionValue(String str) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("1561e204", new Object[]{this, str}) : this.wrapped.getExtensionValue(str);
            }

            @Override // java.security.cert.X509Extension
            public Set<String> getNonCriticalExtensionOIDs() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("861c6bc8", new Object[]{this}) : this.wrapped.getNonCriticalExtensionOIDs();
            }

            @Override // java.security.cert.X509Extension
            public boolean hasUnsupportedCriticalExtension() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("10e67b70", new Object[]{this})).booleanValue() : this.wrapped.hasUnsupportedCriticalExtension();
            }

            @Override // java.security.cert.X509Certificate
            public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4483bfe1", new Object[]{this});
                } else {
                    this.wrapped.checkValidity();
                }
            }

            @Override // java.security.cert.X509Certificate
            public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("768f11c2", new Object[]{this, date});
                } else {
                    this.wrapped.checkValidity(date);
                }
            }

            @Override // java.security.cert.X509Certificate
            public int getVersion() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue() : this.wrapped.getVersion();
            }

            @Override // java.security.cert.X509Certificate
            public BigInteger getSerialNumber() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (BigInteger) ipChange.ipc$dispatch("bcc235b3", new Object[]{this}) : this.wrapped.getSerialNumber();
            }

            @Override // java.security.cert.X509Certificate
            public Principal getIssuerDN() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Principal) ipChange.ipc$dispatch("27657125", new Object[]{this}) : this.wrapped.getIssuerDN();
            }

            @Override // java.security.cert.X509Certificate
            public Principal getSubjectDN() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Principal) ipChange.ipc$dispatch("9f4b62c", new Object[]{this}) : this.wrapped.getSubjectDN();
            }

            @Override // java.security.cert.X509Certificate
            public Date getNotBefore() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Date) ipChange.ipc$dispatch("77c28ad4", new Object[]{this}) : this.wrapped.getNotBefore();
            }

            @Override // java.security.cert.X509Certificate
            public Date getNotAfter() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Date) ipChange.ipc$dispatch("17613f31", new Object[]{this}) : this.wrapped.getNotAfter();
            }

            @Override // java.security.cert.X509Certificate
            public byte[] getTBSCertificate() throws CertificateEncodingException {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("8a1fe4ae", new Object[]{this}) : this.wrapped.getTBSCertificate();
            }

            @Override // java.security.cert.X509Certificate
            public byte[] getSignature() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("c1eff474", new Object[]{this}) : this.wrapped.getSignature();
            }

            @Override // java.security.cert.X509Certificate
            public String getSigAlgName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d763524d", new Object[]{this}) : this.wrapped.getSigAlgName();
            }

            @Override // java.security.cert.X509Certificate
            public String getSigAlgOID() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c84ec290", new Object[]{this}) : this.wrapped.getSigAlgOID();
            }

            @Override // java.security.cert.X509Certificate
            public byte[] getSigAlgParams() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("13a63aaf", new Object[]{this}) : this.wrapped.getSigAlgParams();
            }

            @Override // java.security.cert.X509Certificate
            public boolean[] getIssuerUniqueID() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (boolean[]) ipChange.ipc$dispatch("e5fc2b3", new Object[]{this}) : this.wrapped.getIssuerUniqueID();
            }

            @Override // java.security.cert.X509Certificate
            public boolean[] getSubjectUniqueID() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (boolean[]) ipChange.ipc$dispatch("28e992cc", new Object[]{this}) : this.wrapped.getSubjectUniqueID();
            }

            @Override // java.security.cert.X509Certificate
            public boolean[] getKeyUsage() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (boolean[]) ipChange.ipc$dispatch("e25af856", new Object[]{this}) : this.wrapped.getKeyUsage();
            }

            @Override // java.security.cert.X509Certificate
            public int getBasicConstraints() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("db861e18", new Object[]{this})).intValue() : this.wrapped.getBasicConstraints();
            }

            @Override // java.security.cert.Certificate
            public byte[] getEncoded() throws CertificateEncodingException {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("466b135e", new Object[]{this}) : this.wrapped.getEncoded();
            }

            @Override // java.security.cert.Certificate
            public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2f2c83ad", new Object[]{this, publicKey});
                } else {
                    this.wrapped.verify(publicKey);
                }
            }

            @Override // java.security.cert.Certificate
            public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("eb1afc37", new Object[]{this, publicKey, str});
                } else {
                    this.wrapped.verify(publicKey, str);
                }
            }

            @Override // java.security.cert.Certificate
            public String toString() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.wrapped.toString();
            }

            @Override // java.security.cert.Certificate
            public PublicKey getPublicKey() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (PublicKey) ipChange.ipc$dispatch("73b184a4", new Object[]{this}) : this.wrapped.getPublicKey();
            }
        }
    }
}
