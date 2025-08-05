package com.taobao.themis.inside.adapter;

import android.os.Build;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import com.taobao.themis.kernel.adapter.ITraceAdapter;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0016J.\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0016J<\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/inside/adapter/DefaultTraceAdapter;", "Lcom/taobao/themis/kernel/adapter/ITraceAdapter;", "()V", "traceId", "Ljava/util/concurrent/atomic/AtomicInteger;", "asyncBegin", "", b.SECTION_NAME, "", "id", "", IWXUserTrackAdapter.MONITOR_ARG, "Lkotlin/Pair;", "asyncEnd", "begin", "arg1", "arg2", "end", "flowBegin", "flowEnd", "flowStep", "generateTraceId", "themis_inside_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class DefaultTraceAdapter implements ITraceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f22425a = new AtomicInteger(0);

    static {
        kge.a(464425550);
        kge.a(-647168969);
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void flowBegin(String sectionName, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac70bd8", new Object[]{this, sectionName, new Long(j)});
        } else {
            q.d(sectionName, "sectionName");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void flowEnd(String sectionName, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834e9ee6", new Object[]{this, sectionName, new Long(j)});
        } else {
            q.d(sectionName, "sectionName");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void flowStep(String sectionName, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50723bf9", new Object[]{this, sectionName, new Long(j)});
        } else {
            q.d(sectionName, "sectionName");
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void begin(String sectionName, Pair<String, String> pair, Pair<String, String> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17f169a", new Object[]{this, sectionName, pair, pair2});
            return;
        }
        q.d(sectionName, "sectionName");
        Trace.beginSection(sectionName);
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void end(String sectionName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f4dd2c", new Object[]{this, sectionName});
            return;
        }
        q.d(sectionName, "sectionName");
        Trace.endSection();
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void asyncBegin(String sectionName, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce01c393", new Object[]{this, sectionName, new Long(j), pair});
            return;
        }
        q.d(sectionName, "sectionName");
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        Trace.beginAsyncSection(sectionName, (int) j);
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void asyncEnd(String sectionName, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5870bc5", new Object[]{this, sectionName, new Long(j), pair});
            return;
        }
        q.d(sectionName, "sectionName");
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        Trace.endAsyncSection(sectionName, (int) j);
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public long generateTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("898a906", new Object[]{this})).longValue() : this.f22425a.incrementAndGet();
    }
}
