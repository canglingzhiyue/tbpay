package com.taobao.android.litecreator.util;

import android.os.SystemClock;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LCTrace";

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<Stack<a>> f13511a;
    private static final boolean b;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f13512a;
        public long b;
        public long c;

        static {
            kge.a(-658147623);
        }

        public a(String str, long j, long j2) {
            this.f13512a = str;
            this.b = j;
            this.c = j2;
        }
    }

    static {
        kge.a(-350406267);
        f13511a = new ThreadLocal<>();
        b = g.a();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, Long.MAX_VALUE);
        }
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
        } else if (!b) {
        } else {
            Trace.beginSection(str);
            Stack<a> stack = f13511a.get();
            if (stack == null) {
                stack = new Stack<>();
                f13511a.set(stack);
            }
            stack.push(new a(str, SystemClock.elapsedRealtime(), j));
        }
    }

    public static void a() {
        a pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!b) {
        } else {
            Trace.endSection();
            Stack<a> stack = f13511a.get();
            if (stack == null || (pop = stack.pop()) == null) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - pop.b;
            boolean a2 = au.a();
            if (elapsedRealtime <= pop.c) {
                u.b(TAG, pop.f13512a + "[mainThread:" + a2 + riy.ARRAY_END_STR + " cost " + elapsedRealtime + "ms");
                return;
            }
            u.d(TAG, pop.f13512a + "[mainThread:" + a2 + riy.ARRAY_END_STR + " cost " + elapsedRealtime + "ms, please optimize. limit=" + pop.c);
        }
    }
}
