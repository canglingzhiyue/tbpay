package com.loc;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7656a = x.c("SYmFja3Vwcw");
    public static final String b = x.c("SLmFkaXU");
    public static final String c = x.c("JIw");

    private static String a(Context context) {
        File externalFilesDir;
        if (Build.VERSION.SDK_INT >= 31 || (context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30)) {
            externalFilesDir = context.getApplicationContext().getExternalFilesDir("");
        } else {
            StorageManager storageManager = Build.VERSION.SDK_INT >= 9 ? (StorageManager) context.getSystemService(WXStorageModule.NAME) : null;
            try {
                Class<?> cls = Class.forName(x.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
                Method method = storageManager.getClass().getMethod(x.c("FZ2V0Vm9sdW1lTGlzdA"), new Class[0]);
                Method method2 = cls.getMethod(x.c("ZZ2V0UGF0aA"), new Class[0]);
                Method method3 = cls.getMethod(x.c("AaXNSZW1vdmFibGUK"), new Class[0]);
                Object invoke = method.invoke(storageManager, new Object[0]);
                int length = Array.getLength(invoke);
                for (int i = 0; i < length; i++) {
                    Object obj = Array.get(invoke, i);
                    String str = (String) method2.invoke(obj, new Object[0]);
                    if (!((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                        return str;
                    }
                }
                return null;
            } catch (Throwable unused) {
                externalFilesDir = Environment.getExternalStorageDirectory();
            }
        }
        return externalFilesDir.getAbsolutePath();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public static synchronized void a(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ak.a(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
