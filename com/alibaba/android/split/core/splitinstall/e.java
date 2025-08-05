package com.alibaba.android.split.core.splitinstall;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import tb.bgu;
import tb.kge;

/* loaded from: classes.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final bgu f2464a;
    private final Context b;
    private final String c;

    static {
        kge.a(611795732);
        f2464a = (bgu) com.alibaba.android.split.a.b(bgu.class, "SplitInstallInfoProvider");
    }

    public e(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public final Set a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (String str : b()) {
            if (!a(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private final Set b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        com.alibaba.android.split.o a2 = com.alibaba.android.split.p.a();
        if (a2 != null) {
            synchronized (a2.a()) {
                hashSet.addAll(a2.a());
            }
        }
        return hashSet;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str.startsWith("config.") || str.contains(".config.");
    }
}
