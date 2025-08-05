package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Field f15814a;
    private static final Field b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    static {
        /*
            r0 = -1612686198(0xffffffff9fe05c8a, float:-9.502078E-20)
            tb.kge.a(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r3 = "getDeclaredField"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L74
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Throwable -> L74
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L74
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L74
            r3 = 23
            if (r0 <= r3) goto L30
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = "threadLocals"
            r6[r7] = r8     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r2.invoke(r5, r6)     // Catch: java.lang.Throwable -> L74
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L74
            goto L3e
        L30:
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L74
            java.lang.String r8 = "localValues"
            r6[r7] = r8     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r2.invoke(r5, r6)     // Catch: java.lang.Throwable -> L74
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L74
        L3e:
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L6d
            if (r0 <= r3) goto L52
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "inheritableThreadLocals"
            r3[r7] = r6     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L6d
            goto L60
        L52:
            java.lang.Class<java.lang.Thread> r0 = java.lang.Thread.class
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "inheritableValues"
            r3[r7] = r6     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L6d
        L60:
            r1 = r0
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L6d
            com.taobao.android.virtual_thread.g.f15814a = r5
            com.taobao.android.virtual_thread.g.b = r1
            return
        L69:
            r0 = move-exception
            r2 = r1
            r1 = r5
            goto L7f
        L6d:
            r0 = move-exception
            r2 = r1
            r1 = r5
            goto L76
        L71:
            r0 = move-exception
            r2 = r1
            goto L7f
        L74:
            r0 = move-exception
            r2 = r1
        L76:
            tb.jrk.a(r0)     // Catch: java.lang.Throwable -> L7e
            com.taobao.android.virtual_thread.g.f15814a = r1
            com.taobao.android.virtual_thread.g.b = r2
            return
        L7e:
            r0 = move-exception
        L7f:
            com.taobao.android.virtual_thread.g.f15814a = r1
            com.taobao.android.virtual_thread.g.b = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.virtual_thread.g.<clinit>():void");
    }

    public static void a(Thread thread, Thread thread2) {
        Object obj;
        Object obj2;
        synchronized (g.class) {
            try {
                if (f15814a != null && (obj2 = f15814a.get(thread)) != null) {
                    f15814a.set(thread2, obj2);
                }
                if (b != null && (obj = b.get(thread)) != null) {
                    b.set(thread2, obj);
                }
            }
        }
    }

    public static void b(Thread thread, Thread thread2) {
        Object obj;
        Object obj2;
        synchronized (g.class) {
            try {
                if (f15814a != null && (obj2 = f15814a.get(thread2)) != null) {
                    f15814a.set(thread, obj2);
                    f15814a.set(thread2, null);
                }
                if (b != null && (obj = b.get(thread2)) != null) {
                    b.set(thread, obj);
                    b.set(thread2, null);
                }
            }
        }
    }
}
