package com.taobao.themis.canvas;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.themis.graphics.TMSGraphicsLibraryInit;
import com.taobao.android.themis.graphics.f;
import com.taobao.themis.kernel.adapter.ITraceAdapter;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0016J.\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0016J<\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016¨\u0006\u0014"}, d2 = {"Lcom/taobao/themis/canvas/TMSCanvasTraceAdapter;", "Lcom/taobao/themis/kernel/adapter/ITraceAdapter;", "()V", "asyncBegin", "", com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.SECTION_NAME, "", "id", "", IWXUserTrackAdapter.MONITOR_ARG, "Lkotlin/Pair;", "asyncEnd", "begin", "arg1", "arg2", "end", "flowBegin", "flowEnd", "flowStep", "generateTraceId", "themis_canvas_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSCanvasTraceAdapter implements ITraceAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-158258437);
        kge.a(-647168969);
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void end(String sectionName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f4dd2c", new Object[]{this, sectionName});
        } else {
            q.d(sectionName, "sectionName");
        }
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

    public TMSCanvasTraceAdapter() {
        TMSGraphicsLibraryInit.b();
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void begin(String sectionName, Pair<String, String> pair, Pair<String, String> pair2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17f169a", new Object[]{this, sectionName, pair, pair2});
            return;
        }
        q.d(sectionName, "sectionName");
        if (pair != null && pair2 != null) {
            pair.getFirst();
            pair.getSecond();
            pair2.getFirst();
            pair2.getSecond();
        } else if (pair != null) {
            pair.getFirst();
            pair.getSecond();
        } else if (pair2 == null) {
        } else {
            pair2.getFirst();
            pair2.getSecond();
        }
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void asyncBegin(String sectionName, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce01c393", new Object[]{this, sectionName, new Long(j), pair});
            return;
        }
        q.d(sectionName, "sectionName");
        if (pair == null) {
            return;
        }
        pair.getFirst();
        pair.getSecond();
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public void asyncEnd(String sectionName, long j, Pair<String, String> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5870bc5", new Object[]{this, sectionName, new Long(j), pair});
            return;
        }
        q.d(sectionName, "sectionName");
        if (pair == null) {
            return;
        }
        pair.getFirst();
        pair.getSecond();
    }

    @Override // com.taobao.themis.kernel.adapter.ITraceAdapter
    public long generateTraceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("898a906", new Object[]{this})).longValue() : f.a();
    }
}
