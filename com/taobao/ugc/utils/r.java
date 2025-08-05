package com.taobao.ugc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23227a;
        public int b;
        public int c;

        static {
            kge.a(-1254463510);
        }

        public a(int i, int i2, int i3) {
            this.f23227a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    static {
        kge.a(-942222811);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static com.taobao.ugc.utils.r.a a(java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.ugc.utils.r.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r6 = "9bdda293"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            com.taobao.ugc.utils.r$a r6 = (com.taobao.ugc.utils.r.a) r6
            return r6
        L15:
            r0 = 0
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            r1.setDataSource(r6)     // Catch: java.lang.Throwable -> L56
            r6 = 18
            java.lang.String r6 = r1.extractMetadata(r6)     // Catch: java.lang.Throwable -> L56
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L56
            r3 = 19
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L56
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L56
            r5 = 17
            if (r4 < r5) goto L42
            r2 = 24
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch: java.lang.Throwable -> L56
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L56
        L42:
            com.taobao.ugc.utils.r$a r4 = new com.taobao.ugc.utils.r$a     // Catch: java.lang.Throwable -> L56
            r4.<init>(r6, r3, r2)     // Catch: java.lang.Throwable -> L56
            r1.release()
            return r4
        L4b:
            r6 = move-exception
            goto L4f
        L4d:
            r6 = move-exception
            r1 = r0
        L4f:
            if (r1 == 0) goto L54
            r1.release()
        L54:
            throw r6
        L55:
            r1 = r0
        L56:
            if (r1 == 0) goto L5b
            r1.release()
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.ugc.utils.r.a(java.lang.String):com.taobao.ugc.utils.r$a");
    }
}
