package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;

/* loaded from: classes9.dex */
public class bp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f24381a;

    /* renamed from: a  reason: collision with other field name */
    private com.xiaomi.clientreport.processor.c f142a;

    public void a(Context context) {
        this.f24381a = context;
    }

    public void a(com.xiaomi.clientreport.processor.c cVar) {
        this.f142a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f142a != null) {
                this.f142a.a();
            }
            com.xiaomi.channel.commonutils.logger.b.c("begin read and send perf / event");
            if (this.f142a instanceof IEventProcessor) {
                bt.a(this.f24381a).m1748a("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (!(this.f142a instanceof IPerfProcessor)) {
            } else {
                bt.a(this.f24381a).m1748a("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }
}
