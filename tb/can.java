package tb;

import com.alibaba.android.split.a;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.utils.io.i;
import java.io.File;

/* loaded from: classes3.dex */
public class can {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bgu f26236a = (bgu) a.b(bgu.class, i.TAG);

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        File file = null;
        try {
            if (new File(str).exists()) {
                file = k.a().b().b(str2);
                bgu bguVar = f26236a;
                bguVar.d("IOUtils rename from:" + str + " to :" + file.getAbsolutePath(), new Object[0]);
                if (!new File(str).renameTo(file)) {
                    bgu bguVar2 = f26236a;
                    bguVar2.d("IOUtils rename from:" + str + " to :" + file.getAbsolutePath() + " failed", new Object[0]);
                    if (!a(new File(str), file)) {
                        bgu bguVar3 = f26236a;
                        bguVar3.d("IOUtils copy from:" + str + " to :" + file.getAbsolutePath() + " failed", new Object[0]);
                        return "";
                    }
                }
            }
            return file.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static boolean a(java.io.File r6, java.io.File r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.can.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "a3abf71a"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L5a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L5a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L5a
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L54
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L55
        L30:
            int r5 = r1.read(r0)     // Catch: java.lang.Throwable -> L55
            if (r5 <= 0) goto L3a
            r4.write(r0, r3, r5)     // Catch: java.lang.Throwable -> L55
            goto L30
        L3a:
            r1.close()     // Catch: java.io.IOException -> L3e
            goto L42
        L3e:
            r7 = move-exception
            r7.printStackTrace()
        L42:
            r4.close()     // Catch: java.io.IOException -> L46
            goto L4a
        L46:
            r7 = move-exception
            r7.printStackTrace()
        L4a:
            r6.delete()
            return r2
        L4e:
            r6 = move-exception
            goto L52
        L50:
            r6 = move-exception
            r4 = r0
        L52:
            r0 = r1
            goto L7a
        L54:
            r4 = r0
        L55:
            r0 = r1
            goto L5b
        L57:
            r6 = move-exception
            r4 = r0
            goto L7a
        L5a:
            r4 = r0
        L5b:
            boolean r6 = r7.exists()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L64
            r7.delete()     // Catch: java.lang.Throwable -> L79
        L64:
            if (r0 == 0) goto L6e
            r0.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r6 = move-exception
            r6.printStackTrace()
        L6e:
            if (r4 == 0) goto L78
            r4.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r6 = move-exception
            r6.printStackTrace()
        L78:
            return r3
        L79:
            r6 = move-exception
        L7a:
            if (r0 == 0) goto L84
            r0.close()     // Catch: java.io.IOException -> L80
            goto L84
        L80:
            r7 = move-exception
            r7.printStackTrace()
        L84:
            if (r4 == 0) goto L8e
            r4.close()     // Catch: java.io.IOException -> L8a
            goto L8e
        L8a:
            r7 = move-exception
            r7.printStackTrace()
        L8e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.can.a(java.io.File, java.io.File):boolean");
    }
}
