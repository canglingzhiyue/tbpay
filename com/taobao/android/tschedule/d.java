package com.taobao.android.tschedule;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<a> f15660a;

    /* loaded from: classes6.dex */
    public interface a {
        void a(String str, String str2);
    }

    static {
        kge.a(1297898893);
        f15660a = new CopyOnWriteArrayList();
    }

    public static boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("33cc13f1", new Object[]{aVar})).booleanValue() : f15660a.add(aVar);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        for (a aVar : f15660a) {
            aVar.a(str, str2);
        }
    }
}
