package com.taobao.android.launch.turbo.profile;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gsv;
import tb.kge;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f13017a;

    static {
        kge.a(-224640612);
    }

    private h(Context context) {
        this.f13017a = context;
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        gsv.a("ProfileLoader", "Decide profile name for sdk int: " + i);
        if (i >= 31) {
            return "primaryS.prof";
        }
        if (i >= 28) {
            return "primary.prof";
        }
        if (i >= 27) {
            return "primary81.prof";
        }
        if (i >= 26) {
            return "primary80.prof";
        }
        if (i >= 24) {
            return "primary7.prof";
        }
        gsv.a("ProfileLoader", "Unsupported sdk int: " + i);
        return null;
    }

    private static int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue();
        }
        gsv.a("ProfileLoader", "Decide profile source for sdk int: " + i);
        return i <= 27 ? 1 : 0;
    }

    private e a(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("6e50bfde", new Object[]{this, str, new Integer(i), new Integer(i2)});
        }
        String a2 = a(i2);
        if (a2 == null) {
            return null;
        }
        int b = b(i2);
        gsv.a("ProfileLoader", "Decided profile name for sdk int: " + i2 + " is " + a2 + " from " + b);
        return a(str, i, a2, b);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private com.taobao.android.launch.turbo.profile.e a(java.lang.String r12, int r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.launch.turbo.profile.h.a(java.lang.String, int, java.lang.String, int):com.taobao.android.launch.turbo.profile.e");
    }

    public static e a(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("5ea395d6", new Object[]{context, str, new Integer(i), new Integer(i2)}) : new h(context).a(str, i, i2);
    }
}
