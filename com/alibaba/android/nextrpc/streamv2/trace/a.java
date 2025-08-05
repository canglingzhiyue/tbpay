package com.alibaba.android.nextrpc.streamv2.trace;

import android.os.Trace;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.bfv;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/alibaba/android/nextrpc/streamv2/trace/TraceUtil;", "", "()V", "traceMap", "", "Lcom/alibaba/android/nextrpc/streamv2/trace/TraceName;", "", "beginSection", "", "traceName", "endSection", "nextrpc-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a INSTANCE = new a();

    /* renamed from: a  reason: collision with root package name */
    private static final Map<TraceName, Long> f2403a = new LinkedHashMap();

    private a() {
    }

    public final void a(TraceName traceName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7328bc26", new Object[]{this, traceName});
            return;
        }
        q.d(traceName, "traceName");
        if (!bfv.a()) {
            return;
        }
        Trace.beginSection(traceName.name());
        f2403a.put(traceName, Long.valueOf(System.currentTimeMillis()));
    }

    public final void b(TraceName traceName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83de88e7", new Object[]{this, traceName});
            return;
        }
        q.d(traceName, "traceName");
        if (!bfv.a()) {
            return;
        }
        Trace.endSection();
        StringBuilder sb = new StringBuilder();
        sb.append(traceName);
        sb.append(", time=");
        long currentTimeMillis = System.currentTimeMillis();
        Long l = f2403a.get(traceName);
        sb.append(currentTimeMillis - (l != null ? l.longValue() : 0L));
        UnifyLog.d("NextRPC", sb.toString(), new Object[0]);
    }
}
