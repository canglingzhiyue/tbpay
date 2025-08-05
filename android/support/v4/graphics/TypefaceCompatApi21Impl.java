package android.support.v4.graphics;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* loaded from: classes2.dex */
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {
    private static final String TAG = "TypefaceCompatApi21Impl";

    private File getFile(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    @Override // android.support.v4.graphics.TypefaceCompatBaseImpl, android.support.v4.graphics.TypefaceCompat.TypefaceCompatImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r4, android.os.CancellationSignal r5, android.support.v4.provider.FontsContractCompat.FontInfo[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            if (r0 > 0) goto L5
            return r1
        L5:
            android.support.v4.provider.FontsContractCompat$FontInfo r6 = r3.findBestInfo(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.getUri()     // Catch: java.io.IOException -> L76
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch: java.io.IOException -> L76
            java.io.File r6 = r3.getFile(r5)     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L2e
            boolean r7 = r6.canRead()     // Catch: java.lang.Throwable -> L5f
            if (r7 != 0) goto L24
            goto L2e
        L24:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L2d
            r5.close()     // Catch: java.io.IOException -> L76
        L2d:
            return r4
        L2e:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5f
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L5f
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5f
            android.graphics.Typeface r4 = super.createFromInputStream(r4, r6)     // Catch: java.lang.Throwable -> L47
            r6.close()     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L43
            r5.close()     // Catch: java.io.IOException -> L76
        L43:
            return r4
        L44:
            r4 = move-exception
            r7 = r1
            goto L4d
        L47:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L49
        L49:
            r7 = move-exception
            r2 = r7
            r7 = r4
            r4 = r2
        L4d:
            if (r7 == 0) goto L58
            r6.close()     // Catch: java.lang.Throwable -> L53
            goto L5b
        L53:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.lang.Throwable -> L5f
            goto L5b
        L58:
            r6.close()     // Catch: java.lang.Throwable -> L5f
        L5b:
            throw r4     // Catch: java.lang.Throwable -> L5f
        L5c:
            r4 = move-exception
            r6 = r1
            goto L65
        L5f:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L61
        L61:
            r6 = move-exception
            r2 = r6
            r6 = r4
            r4 = r2
        L65:
            if (r5 == 0) goto L75
            if (r6 == 0) goto L72
            r5.close()     // Catch: java.lang.Throwable -> L6d
            goto L75
        L6d:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.io.IOException -> L76
            goto L75
        L72:
            r5.close()     // Catch: java.io.IOException -> L76
        L75:
            throw r4     // Catch: java.io.IOException -> L76
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.graphics.TypefaceCompatApi21Impl.createFromFontInfo(android.content.Context, android.os.CancellationSignal, android.support.v4.provider.FontsContractCompat$FontInfo[], int):android.graphics.Typeface");
    }
}
