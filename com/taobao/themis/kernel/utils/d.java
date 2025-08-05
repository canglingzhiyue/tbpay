package com.taobao.themis.kernel.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0007J0\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0007J@\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u0019\u001a\u00020\u000eH\u0007JR\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001cH\u0086\bø\u0001\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lcom/taobao/themis/kernel/utils/TMSTraceUtils;", "", "()V", "ENABLE_TRACE", "", "traceImpl", "Lcom/taobao/themis/kernel/adapter/ITraceAdapter;", "getTraceImpl", "()Lcom/taobao/themis/kernel/adapter/ITraceAdapter;", "asyncBegin", "", com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.SECTION_NAME, "", "id", "", IWXUserTrackAdapter.MONITOR_ARG, "Lkotlin/Pair;", "asyncEnd", "begin", "arg1", "arg2", "end", "flowBegin", "flowEnd", "flowStep", "generateTraceId", "trace", "func", "Lkotlin/Function0;", "themis_kernel_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean ENABLE_TRACE = false;
    public static final d INSTANCE;

    @JvmStatic
    public static final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        return 0L;
    }

    @JvmStatic
    public static final void a(String sectionName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{sectionName});
        } else {
            kotlin.jvm.internal.q.d(sectionName, "sectionName");
        }
    }

    @JvmStatic
    public static final void a(String sectionName, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{sectionName, new Long(j)});
        } else {
            kotlin.jvm.internal.q.d(sectionName, "sectionName");
        }
    }

    @JvmStatic
    public static final void a(String sectionName, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27983667", new Object[]{sectionName, new Long(j), pair});
        } else {
            kotlin.jvm.internal.q.d(sectionName, "sectionName");
        }
    }

    @JvmStatic
    public static final void a(String sectionName, Pair<String, String> pair, Pair<String, String> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55074e52", new Object[]{sectionName, pair, pair2});
        } else {
            kotlin.jvm.internal.q.d(sectionName, "sectionName");
        }
    }

    @JvmStatic
    public static final void b(String sectionName, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4009e8", new Object[]{sectionName, new Long(j), pair});
        } else {
            kotlin.jvm.internal.q.d(sectionName, "sectionName");
        }
    }

    static {
        kge.a(577726700);
        INSTANCE = new d();
    }

    private d() {
    }

    public static /* synthetic */ void a(String str, Pair pair, Pair pair2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ed648d", new Object[]{str, pair, pair2, new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            pair = null;
        }
        if ((i & 4) != 0) {
            pair2 = null;
        }
        a(str, pair, pair2);
    }

    public static /* synthetic */ void a(String str, long j, Pair pair, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eea1258", new Object[]{str, new Long(j), pair, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            pair = null;
        }
        a(str, j, pair);
    }

    public static /* synthetic */ void b(String str, long j, Pair pair, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40206537", new Object[]{str, new Long(j), pair, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            pair = null;
        }
        b(str, j, pair);
    }
}
