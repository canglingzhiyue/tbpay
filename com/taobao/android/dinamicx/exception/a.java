package com.taobao.android.dinamicx.exception;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import tb.fqi;
import tb.fuw;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11864a;

    static {
        kge.a(839195274);
        f11864a = false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static java.lang.String a(java.lang.Throwable r3) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.dinamicx.exception.a.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "1003a7b3"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L15:
            if (r3 != 0) goto L1a
            java.lang.String r3 = ""
            return r3
        L1a:
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L54
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L54
            r3.printStackTrace(r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L3b
            r2.close()     // Catch: java.io.IOException -> L33
            r1.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r0 = move-exception
            b(r0)
        L37:
            return r3
        L38:
            r3 = move-exception
            r0 = r2
            goto L41
        L3b:
            r0 = r2
            goto L54
        L3d:
            r3 = move-exception
            goto L41
        L3f:
            r3 = move-exception
            r1 = r0
        L41:
            if (r0 == 0) goto L49
            r0.close()     // Catch: java.io.IOException -> L47
            goto L49
        L47:
            r0 = move-exception
            goto L4f
        L49:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L47
            goto L52
        L4f:
            b(r0)
        L52:
            throw r3
        L53:
            r1 = r0
        L54:
            if (r0 == 0) goto L5c
            r0.close()     // Catch: java.io.IOException -> L5a
            goto L5c
        L5a:
            r3 = move-exception
            goto L62
        L5c:
            if (r1 == 0) goto L65
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L65
        L62:
            b(r3)
        L65:
            java.lang.String r3 = "DXExceptionUtil getStackTrace Exception"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.exception.a.a(java.lang.Throwable):java.lang.String");
    }

    public static void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd742bac", new Object[]{th});
        } else {
            a(th, true);
        }
    }

    public static void c(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4d7ecb", new Object[]{th});
        } else {
            a(th, true);
        }
    }

    public static void a(Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c0ebe7", new Object[]{th, new Boolean(z)});
        } else if (!DinamicXEngine.j() || th == null || bx.k()) {
        } else {
            fuw.b(a(th));
            if (z && fqi.z()) {
                throw new RuntimeException(th);
            }
        }
    }

    public static void d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("126d1ea", new Object[]{th});
        } else if (!DinamicXEngine.j() || bx.k()) {
        } else {
            th.printStackTrace();
            throw new RuntimeException(th);
        }
    }
}
