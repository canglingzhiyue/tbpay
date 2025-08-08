package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;

/* loaded from: classes9.dex */
public class fd {

    /* renamed from: a  reason: collision with root package name */
    private static volatile fd f24467a;

    /* renamed from: a  reason: collision with other field name */
    private Context f341a;

    private fd(Context context) {
        this.f341a = context;
    }

    public static fd a(Context context) {
        if (f24467a == null) {
            synchronized (fd.class) {
                if (f24467a == null) {
                    f24467a = new fd(context);
                }
            }
        }
        return f24467a;
    }

    private void a(com.xiaomi.clientreport.data.a aVar) {
        if (aVar instanceof PerfClientReport) {
            ClientReportClient.reportPerf(this.f341a, (PerfClientReport) aVar);
        } else if (!(aVar instanceof EventClientReport)) {
        } else {
            ClientReportClient.reportEvent(this.f341a, (EventClientReport) aVar);
        }
    }

    public void a(String str, int i, long j, long j2) {
        if (i < 0 || j2 < 0 || j <= 0) {
            return;
        }
        PerfClientReport a2 = fc.a(this.f341a, i, j, j2);
        a2.setAppPackageName(str);
        a2.setSdkVersion(BuildConfig.VERSION_NAME);
        a(a2);
    }

    public void a(String str, Intent intent, int i, String str2) {
        if (intent == null) {
            return;
        }
        a(str, fc.m1919a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i, System.currentTimeMillis(), str2);
    }

    public void a(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        a(str, fc.m1919a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
    }

    public void a(String str, String str2, String str3, int i, long j, String str4) {
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            return;
        }
        EventClientReport a2 = fc.a(this.f341a, str2, str3, i, j, str4);
        a2.setAppPackageName(str);
        a2.setSdkVersion(BuildConfig.VERSION_NAME);
        a(a2);
    }

    public void a(String str, String str2, String str3, int i, String str4) {
        a(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    public void a(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    public void b(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    public void c(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 4002, System.currentTimeMillis(), str4);
    }
}
