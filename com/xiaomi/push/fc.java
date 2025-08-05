package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class fc {

    /* renamed from: a  reason: collision with root package name */
    private static a f24466a;

    /* renamed from: a  reason: collision with other field name */
    private static Map<String, im> f340a;

    /* loaded from: classes9.dex */
    public interface a {
        void uploader(Context context, ig igVar);
    }

    public static int a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    public static int a(Enum r1) {
        if (r1 != null) {
            if (r1 instanceof ic) {
                return r1.ordinal() + 1001;
            }
            if (r1 instanceof im) {
                return r1.ordinal() + 2001;
            }
            if (r1 instanceof fn) {
                return r1.ordinal() + 3001;
            }
        }
        return -1;
    }

    public static Config a(Context context) {
        boolean a2 = com.xiaomi.push.service.az.a(context).a(ih.PerfUploadSwitch.a(), false);
        boolean a3 = com.xiaomi.push.service.az.a(context).a(ih.EventUploadNewSwitch.a(), false);
        int a4 = com.xiaomi.push.service.az.a(context).a(ih.PerfUploadFrequency.a(), RemoteMessageConst.DEFAULT_TTL);
        return Config.getBuilder().setEventUploadSwitchOpen(a3).setEventUploadFrequency(com.xiaomi.push.service.az.a(context).a(ih.EventUploadFrequency.a(), RemoteMessageConst.DEFAULT_TTL)).setPerfUploadSwitchOpen(a2).setPerfUploadFrequency(a4).build(context);
    }

    public static EventClientReport a(Context context, String str, String str2, int i, long j, String str3) {
        EventClientReport a2 = a(str);
        a2.eventId = str2;
        a2.eventType = i;
        a2.eventTime = j;
        a2.eventContent = str3;
        return a2;
    }

    public static EventClientReport a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    public static PerfClientReport a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = 1000;
        perfClientReport.reportType = 1000;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    public static PerfClientReport a(Context context, int i, long j, long j2) {
        PerfClientReport a2 = a();
        a2.code = i;
        a2.perfCounts = j;
        a2.perfLatencies = j2;
        return a2;
    }

    public static ig a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ig igVar = new ig();
        igVar.d("category_client_report_data");
        igVar.a("push_sdk_channel");
        igVar.a(1L);
        igVar.b(str);
        igVar.a(true);
        igVar.b(System.currentTimeMillis());
        igVar.g(context.getPackageName());
        igVar.e("com.xiaomi.xmsf");
        igVar.f(com.xiaomi.push.service.ca.a());
        igVar.c("quality_support");
        return igVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static im m1918a(String str) {
        im[] values;
        if (f340a == null) {
            synchronized (im.class) {
                if (f340a == null) {
                    f340a = new HashMap();
                    for (im imVar : im.values()) {
                        f340a.put(imVar.f538a.toLowerCase(), imVar);
                    }
                }
            }
        }
        im imVar2 = f340a.get(str.toLowerCase());
        return imVar2 != null ? imVar2 : im.Invalid;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m1919a(int i) {
        return i == 1000 ? "E100000" : i == 3000 ? "E100002" : i == 2000 ? "E100001" : i == 6000 ? "E100003" : "";
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1920a(Context context) {
        ClientReportClient.updateConfig(context, a(context));
    }

    public static void a(Context context, Config config) {
        ClientReportClient.init(context, config, new fa(context), new fb(context));
    }

    private static void a(Context context, ig igVar) {
        if (m1921a(context.getApplicationContext())) {
            com.xiaomi.push.service.cb.a(context.getApplicationContext(), igVar);
            return;
        }
        a aVar = f24466a;
        if (aVar == null) {
            return;
        }
        aVar.uploader(context, igVar);
    }

    public static void a(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            for (String str : list) {
                ig a2 = a(context, str);
                if (!com.xiaomi.push.service.ca.a(a2, false)) {
                    a(context, a2);
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.d(th.getMessage());
        }
    }

    public static void a(a aVar) {
        f24466a = aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1921a(Context context) {
        return context != null && !TextUtils.isEmpty(context.getPackageName()) && "com.xiaomi.xmsf".equals(context.getPackageName());
    }
}
