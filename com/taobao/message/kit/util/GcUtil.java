package com.taobao.message.kit.util;

import android.os.Build;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/kit/util/GcUtil;", "", "()V", "beginRecords", "", "", "Lcom/taobao/message/kit/util/Record;", "pages", "Lcom/taobao/monitor/procedure/IPage;", "beginRecord", "", "page", "endRecord", "pageSession", "getCurrentBlockingGcRecord", "record", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class GcUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final GcUtil INSTANCE;
    private static final Map<String, Record> beginRecords;
    private static final Map<String, IPage> pages;

    static {
        kge.a(-2017233289);
        INSTANCE = new GcUtil();
        pages = new LinkedHashMap();
        beginRecords = new LinkedHashMap();
    }

    private GcUtil() {
    }

    @JvmStatic
    public static final void beginRecord(IPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c1921c", new Object[]{page});
            return;
        }
        q.c(page, "page");
        Map<String, IPage> map = pages;
        String c = page.c();
        q.a((Object) c, "page.pageSession");
        map.put(c, page);
        Map<String, Record> map2 = beginRecords;
        String c2 = page.c();
        q.a((Object) c2, "page.pageSession");
        map2.put(c2, INSTANCE.getCurrentBlockingGcRecord());
    }

    @JvmStatic
    public static final void endRecord(String pageSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80173a9d", new Object[]{pageSession});
            return;
        }
        q.c(pageSession, "pageSession");
        pages.remove(pageSession);
        beginRecords.remove(pageSession);
    }

    @JvmStatic
    public static final void endRecord(IPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dae1ace", new Object[]{page});
            return;
        }
        q.c(page, "page");
        String c = page.c();
        q.a((Object) c, "page.pageSession");
        endRecord(c);
    }

    @JvmStatic
    public static final void record(IPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428d8d13", new Object[]{page});
            return;
        }
        q.c(page, "page");
        String c = page.c();
        q.a((Object) c, "page.pageSession");
        record(c);
    }

    @JvmStatic
    public static final void record(String pageSession) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfa2422", new Object[]{pageSession});
            return;
        }
        q.c(pageSession, "pageSession");
        IPage iPage = pages.get(pageSession);
        if (iPage == null) {
            return;
        }
        TraceUtil.beginSection("gcRecord");
        Record record = beginRecords.get(pageSession);
        if (record == null) {
            record = new Record();
        }
        beginRecords.put(pageSession, record);
        Record currentBlockingGcRecord = INSTANCE.getCurrentBlockingGcRecord();
        iPage.g().a("page-blocking-gc-count", Integer.valueOf(currentBlockingGcRecord.getBlockingGcCount() - record.getBlockingGcCount()));
        iPage.g().a("page-blocking-gc-time", Long.valueOf(currentBlockingGcRecord.getBlockingGcTime() - record.getBlockingGcTime()));
        TraceUtil.endTrace();
    }

    private final Record getCurrentBlockingGcRecord() {
        Long e;
        Integer d;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Record) ipChange.ipc$dispatch("f1571d6f", new Object[]{this});
        }
        Record record = new Record();
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                String runtimeStat = Debug.getRuntimeStat("art.gc.blocking-gc-count");
                if (runtimeStat != null && (d = n.d(runtimeStat)) != null) {
                    i = d.intValue();
                }
                record.setBlockingGcCount(i);
                String runtimeStat2 = Debug.getRuntimeStat("art.gc.blocking-gc-time");
                record.setBlockingGcTime((runtimeStat2 == null || (e = n.e(runtimeStat2)) == null) ? 0L : e.longValue());
            }
        } catch (Throwable unused) {
        }
        return record;
    }
}
