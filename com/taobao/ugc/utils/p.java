package com.taobao.ugc.utils;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import tb.kge;

/* loaded from: classes9.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Stack<a>> f23225a;

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23226a;
        public long b;

        static {
            kge.a(1371768123);
        }

        public a(String str, long j) {
            this.f23226a = str;
            this.b = j;
        }
    }

    static {
        kge.a(-862037604);
        f23225a = new HashMap();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        Stack<a> stack = f23225a.get(str);
        if (stack == null) {
            stack = new Stack<>();
            f23225a.put(str, stack);
        }
        stack.push(new a(str, SystemClock.elapsedRealtime()));
    }

    public static void b(String str) {
        a pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        Stack<a> stack = f23225a.get(str);
        if (stack == null || stack.isEmpty() || (pop = stack.pop()) == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - pop.b;
        String str2 = str + " cost:" + elapsedRealtime + "ms";
        HashMap hashMap = new HashMap();
        hashMap.put("cost", String.valueOf(elapsedRealtime));
        n.b("TimeCost-" + str, hashMap);
    }
}
