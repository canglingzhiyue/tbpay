package tb;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public final class amg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "MegabilityKit";
    public static final String TAG_IMG = "ImageAbility";

    static {
        kge.a(-1225462838);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static final int a(java.lang.String r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.amg.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L19
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "f3a64c25"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
        L19:
            r0 = -1
            if (r3 != 0) goto L1d
            return r0
        L1d:
            r1 = 0
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L39
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L39
            int r0 = r2.available()     // Catch: java.lang.Throwable -> L30
            r2.close()     // Catch: java.io.IOException -> L3e
            goto L3e
        L2d:
            r3 = move-exception
            r1 = r2
            goto L33
        L30:
            r1 = r2
            goto L39
        L32:
            r3 = move-exception
        L33:
            if (r1 == 0) goto L38
            r1.close()     // Catch: java.io.IOException -> L38
        L38:
            throw r3
        L39:
            if (r1 == 0) goto L3e
            r1.close()     // Catch: java.io.IOException -> L3e
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.amg.a(java.lang.String):int");
    }

    public static final String a(String str, Integer num, BitmapFactory.Options options) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ec9239d", new Object[]{str, num, options});
        }
        q.d(options, "options");
        try {
            bitmap = BitmapFactory.decodeFile(str, options);
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (num != null) {
                int intValue = num.intValue();
                int i = 100;
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                while (byteArrayOutputStream.size() > intValue && i > 0) {
                    byteArrayOutputStream.reset();
                    i -= 10;
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                }
            } else {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream);
            }
            bitmap.recycle();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable th) {
            TLog.loge(MODULE_NAME, "ImageAbility", "base64 error = " + th);
            return null;
        }
    }
}
