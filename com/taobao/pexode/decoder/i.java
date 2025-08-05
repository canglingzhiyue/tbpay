package com.taobao.pexode.decoder;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.pexode.entity.RewindableStream;
import com.taobao.pexode.exception.PexodeException;
import java.util.Random;
import tb.kge;
import tb.neb;
import tb.nec;
import tb.qol;

/* loaded from: classes.dex */
public class i implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean b;
    private static final boolean c;
    private static final boolean d;
    private static final boolean e;

    /* renamed from: a  reason: collision with root package name */
    private Context f18701a;

    @Override // com.taobao.pexode.decoder.d
    public boolean canDecodeIncrementally(nec necVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bac5b18", new Object[]{this, necVar})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-1966278469);
        kge.a(59738730);
        boolean z = true;
        b = Build.VERSION.SDK_INT >= 14;
        c = Build.VERSION.SDK_INT > 17;
        d = Build.VERSION.SDK_INT == 28;
        if (Build.VERSION.SDK_INT < 31) {
            z = false;
        }
        e = z;
    }

    @Override // com.taobao.pexode.decoder.d
    public void prepare(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eda217a", new Object[]{this, context});
        } else {
            this.f18701a = context;
        }
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean isSupported(nec necVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb701393", new Object[]{this, necVar})).booleanValue() : necVar != null && ((b && necVar.a(neb.WEBP)) || necVar.a(neb.JPEG) || necVar.a(neb.PNG) || necVar.a(neb.PNG_A) || ((c && necVar.a(neb.WEBP_A)) || necVar.a(neb.BMP) || ((com.taobao.pexode.d.f18687a && d && necVar.a(neb.HEIF)) || (com.taobao.pexode.d.b && e && necVar.a(neb.AVIF)))));
    }

    @Override // com.taobao.pexode.decoder.d
    public boolean acceptInputType(int i, nec necVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2fcc7314", new Object[]{this, new Integer(i), necVar, new Boolean(z)})).booleanValue() : (!com.taobao.pexode.d.c || Build.VERSION.SDK_INT != 28 || (!neb.WEBP_A.a(necVar) && !neb.WEBP.a(necVar))) ? !(i == 2 && Build.VERSION.SDK_INT == 19) && (i != 3 || (!z && (!neb.WEBP.a(necVar) || c))) : i == 1;
    }

    @Override // com.taobao.pexode.decoder.d
    public nec detectMimeType(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nec) ipChange.ipc$dispatch("b308357b", new Object[]{this, bArr});
        }
        if (b && neb.WEBP.a(bArr)) {
            return neb.WEBP;
        }
        if (neb.JPEG.a(bArr)) {
            return neb.JPEG;
        }
        if (neb.PNG.a(bArr)) {
            return neb.PNG;
        }
        if (neb.PNG_A.a(bArr)) {
            return neb.PNG_A;
        }
        if (c && neb.WEBP_A.a(bArr)) {
            return neb.WEBP_A;
        }
        if (neb.BMP.a(bArr)) {
            return neb.BMP;
        }
        if (com.taobao.pexode.d.f18687a && d && neb.HEIF.a(bArr)) {
            return neb.HEIF;
        }
        if (com.taobao.pexode.d.b && e && neb.AVIF.a(bArr)) {
            return neb.AVIF;
        }
        return null;
    }

    private static void a(RewindableStream rewindableStream, PexodeOptions pexodeOptions) throws PexodeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ba0ef8", new Object[]{rewindableStream, pexodeOptions});
            return;
        }
        if (rewindableStream.getInputType() == 2 && Build.VERSION.SDK_INT == 19) {
            if (!pexodeOptions.justDecodeBounds) {
                qol.f(com.taobao.pexode.d.TAG, "maybe leak when system decoding with fd, back to input stream type!", new Object[0]);
            }
            rewindableStream.back2StreamType();
        }
        if (rewindableStream.getInputType() != 3) {
            return;
        }
        if (pexodeOptions.enableAshmem) {
            qol.g(com.taobao.pexode.d.TAG, "cannot use ashmem when system decoding with input stream(justBounds=%b), disabled already!", Boolean.valueOf(pexodeOptions.justDecodeBounds));
            pexodeOptions.enableAshmem = false;
        }
        if (!neb.WEBP.a(pexodeOptions.outMimeType) || c) {
            return;
        }
        qol.h(com.taobao.pexode.d.TAG, "maybe error black image when system decoding webp with input stream(justBounds=%b)!", Boolean.valueOf(pexodeOptions.justDecodeBounds));
    }

    public static void a(BitmapFactory.Options options, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf27ce", new Object[]{options, new Boolean(z)});
            return;
        }
        options.inMutable = true;
        if (options.inJustDecodeBounds) {
            return;
        }
        options.inPurgeable = z;
        options.inInputShareable = z;
    }

    private static BitmapFactory.Options a(PexodeOptions pexodeOptions) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (BitmapFactory.Options) ipChange.ipc$dispatch("67a5abdd", new Object[]{pexodeOptions});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = pexodeOptions.justDecodeBounds;
        if (!com.taobao.pexode.c.a().f18681a) {
            options.inBitmap = pexodeOptions.inBitmap;
        }
        if (pexodeOptions.isSizeAvailable()) {
            options.outWidth = pexodeOptions.outWidth;
            options.outHeight = pexodeOptions.outHeight;
        }
        if (pexodeOptions.outMimeType != null) {
            options.outMimeType = pexodeOptions.outMimeType.toString();
        }
        options.inSampleSize = pexodeOptions.sampleSize;
        options.inDither = true;
        options.inPreferredConfig = PexodeOptions.CONFIG;
        if (!com.taobao.pexode.c.a().b && pexodeOptions.enableAshmem) {
            z = true;
        }
        a(options, z);
        com.taobao.pexode.c.a(pexodeOptions, options);
        return options;
    }

    private static void a(PexodeOptions pexodeOptions, BitmapFactory.Options options) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74cb395", new Object[]{pexodeOptions, options});
            return;
        }
        pexodeOptions.outWidth = options.outWidth;
        pexodeOptions.outHeight = options.outHeight;
        com.taobao.pexode.c.a(pexodeOptions, (BitmapFactory.Options) null);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(random.nextInt(52)));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:6|(1:105)(1:10)|11|(1:13)(1:104)|14|15|16|(1:102)(1:26)|(5:30|(1:32)(1:100)|33|(1:35)(1:99)|(3:37|(1:39)(1:97)|(10:41|42|43|(1:45)|47|(5:74|75|(1:(2:78|(3:80|(1:82)(1:87)|83)(1:88))(1:89))(1:90)|84|85)|(2:54|55)|59|(1:(1:(2:70|(1:72)))(2:64|(1:66)))|73)(1:96))(1:98))|101|95|(1:50)|74|75|(0)(0)|84|85|(2:54|55)|59|(0)|73) */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015d, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015e, code lost:
        tb.qol.h(com.taobao.pexode.d.TAG, "SystemDecoder type=%d, error=%s", java.lang.Integer.valueOf(r13.getInputType()), r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:62:0x0114, B:65:0x011c, B:67:0x0120, B:69:0x0124, B:71:0x012c, B:76:0x0159, B:72:0x0135, B:73:0x013c, B:75:0x0148), top: B:102:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    @Override // com.taobao.pexode.decoder.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.pexode.e decode(com.taobao.pexode.entity.RewindableStream r13, com.taobao.pexode.PexodeOptions r14, com.taobao.pexode.common.b r15) throws com.taobao.pexode.exception.PexodeException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.pexode.decoder.i.decode(com.taobao.pexode.entity.RewindableStream, com.taobao.pexode.PexodeOptions, com.taobao.pexode.common.b):com.taobao.pexode.e");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SystemDecoder@" + Integer.toHexString(hashCode());
    }
}
