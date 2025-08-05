package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.ali.user.open.ucc.UccResultCode;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.ah;
import com.xiaomi.push.bm;
import com.xiaomi.push.bn;
import com.xiaomi.push.bo;
import com.xiaomi.push.bp;
import com.xiaomi.push.bq;
import com.xiaomi.push.bt;
import com.xiaomi.push.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f24278a;

    /* renamed from: a  reason: collision with other field name */
    private static volatile a f10a;

    /* renamed from: a  reason: collision with other field name */
    private Context f11a;

    /* renamed from: a  reason: collision with other field name */
    private Config f12a;

    /* renamed from: a  reason: collision with other field name */
    private IEventProcessor f13a;

    /* renamed from: a  reason: collision with other field name */
    private IPerfProcessor f14a;

    /* renamed from: a  reason: collision with other field name */
    private String f15a;

    /* renamed from: a  reason: collision with other field name */
    private ExecutorService f17a = Executors.newSingleThreadExecutor();

    /* renamed from: a  reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f16a = new HashMap<>();
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> b = new HashMap<>();

    static {
        f24278a = j.m2117a() ? 30 : 10;
    }

    private a(Context context) {
        this.f11a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap = this.b;
        if (hashMap != null) {
            int i = 0;
            for (String str : hashMap.keySet()) {
                ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.b.get(str);
                i += arrayList != null ? arrayList.size() : 0;
            }
            return i;
        }
        return 0;
    }

    public static a a(Context context) {
        if (f10a == null) {
            synchronized (a.class) {
                if (f10a == null) {
                    f10a = new a(context);
                }
            }
        }
        return f10a;
    }

    private void a(ah.a aVar, int i) {
        ah.a(this.f11a).b(aVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap = this.f16a;
        int i = 0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                HashMap<String, com.xiaomi.clientreport.data.a> hashMap2 = this.f16a.get(str);
                if (hashMap2 != null) {
                    for (String str2 : hashMap2.keySet()) {
                        com.xiaomi.clientreport.data.a aVar = hashMap2.get(str2);
                        if (aVar instanceof PerfClientReport) {
                            i = (int) (i + ((PerfClientReport) aVar).perfCounts);
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(EventClientReport eventClientReport) {
        IEventProcessor iEventProcessor = this.f13a;
        if (iEventProcessor != null) {
            iEventProcessor.mo1629a(eventClientReport);
            if (a() < 10) {
                a(new d(this), f24278a);
                return;
            }
            d();
            ah.a(this.f11a).m1699a("100888");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PerfClientReport perfClientReport) {
        IPerfProcessor iPerfProcessor = this.f14a;
        if (iPerfProcessor != null) {
            iPerfProcessor.mo1629a(perfClientReport);
            if (b() < 10) {
                a(new f(this), f24278a);
                return;
            }
            e();
            ah.a(this.f11a).m1699a("100889");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f13a.b();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("we: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f14a.b();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("wp: " + e.getMessage());
        }
    }

    private void f() {
        if (!a(this.f11a).m1626a().isEventUploadSwitchOpen()) {
            return;
        }
        bn bnVar = new bn(this.f11a);
        int eventUploadFrequency = (int) a(this.f11a).m1626a().getEventUploadFrequency();
        int i = UccResultCode.NO_ACTION_BIND_FAILED;
        if (eventUploadFrequency >= 1800) {
            i = eventUploadFrequency;
        }
        if (System.currentTimeMillis() - bt.a(this.f11a).a("sp_client_report_status", "event_last_upload_time", 0L) > i * 1000) {
            ah.a(this.f11a).a(new h(this, bnVar), 10);
        }
        synchronized (a.class) {
            if (!ah.a(this.f11a).a((ah.a) bnVar, i)) {
                ah.a(this.f11a).m1699a("100886");
                ah.a(this.f11a).a((ah.a) bnVar, i);
            }
        }
    }

    private void g() {
        if (!a(this.f11a).m1626a().isPerfUploadSwitchOpen()) {
            return;
        }
        bo boVar = new bo(this.f11a);
        int perfUploadFrequency = (int) a(this.f11a).m1626a().getPerfUploadFrequency();
        int i = UccResultCode.NO_ACTION_BIND_FAILED;
        if (perfUploadFrequency >= 1800) {
            i = perfUploadFrequency;
        }
        if (System.currentTimeMillis() - bt.a(this.f11a).a("sp_client_report_status", "perf_last_upload_time", 0L) > i * 1000) {
            ah.a(this.f11a).a(new i(this, boVar), 15);
        }
        synchronized (a.class) {
            if (!ah.a(this.f11a).a((ah.a) boVar, i)) {
                ah.a(this.f11a).m1699a("100887");
                ah.a(this.f11a).a((ah.a) boVar, i);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized Config m1626a() {
        if (this.f12a == null) {
            this.f12a = Config.defaultConfig(this.f11a);
        }
        return this.f12a;
    }

    public EventClientReport a(int i, String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.eventContent = str;
        eventClientReport.eventTime = System.currentTimeMillis();
        eventClientReport.eventType = i;
        eventClientReport.eventId = bm.a(6);
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = "E100004";
        eventClientReport.setAppPackageName(this.f11a.getPackageName());
        eventClientReport.setSdkVersion(this.f15a);
        return eventClientReport;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1627a() {
        a(this.f11a).f();
        a(this.f11a).g();
    }

    public void a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f12a = config;
        this.f13a = iEventProcessor;
        this.f14a = iPerfProcessor;
        this.f13a.setEventMap(this.b);
        this.f14a.setPerfMap(this.f16a);
    }

    public void a(EventClientReport eventClientReport) {
        if (m1626a().isEventUploadSwitchOpen()) {
            this.f17a.execute(new b(this, eventClientReport));
        }
    }

    public void a(PerfClientReport perfClientReport) {
        if (m1626a().isPerfUploadSwitchOpen()) {
            this.f17a.execute(new c(this, perfClientReport));
        }
    }

    public void a(String str) {
        this.f15a = str;
    }

    public void a(boolean z, boolean z2, long j, long j2) {
        Config config = this.f12a;
        if (config != null) {
            if (z == config.isEventUploadSwitchOpen() && z2 == this.f12a.isPerfUploadSwitchOpen() && j == this.f12a.getEventUploadFrequency() && j2 == this.f12a.getPerfUploadFrequency()) {
                return;
            }
            long eventUploadFrequency = this.f12a.getEventUploadFrequency();
            long perfUploadFrequency = this.f12a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(bq.a(this.f11a)).setEventEncrypted(this.f12a.isEventEncrypted()).setEventUploadSwitchOpen(z).setEventUploadFrequency(j).setPerfUploadSwitchOpen(z2).setPerfUploadFrequency(j2).build(this.f11a);
            this.f12a = build;
            if (!this.f12a.isEventUploadSwitchOpen()) {
                ah.a(this.f11a).m1699a("100886");
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                com.xiaomi.channel.commonutils.logger.b.c(this.f11a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                f();
            }
            if (!this.f12a.isPerfUploadSwitchOpen()) {
                ah.a(this.f11a).m1699a("100887");
            } else if (perfUploadFrequency == build.getPerfUploadFrequency()) {
            } else {
                com.xiaomi.channel.commonutils.logger.b.c(this.f11a.getPackageName() + " reset perf job " + build.getPerfUploadFrequency());
                g();
            }
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m1628b() {
        if (m1626a().isEventUploadSwitchOpen()) {
            bp bpVar = new bp();
            bpVar.a(this.f11a);
            bpVar.a(this.f13a);
            this.f17a.execute(bpVar);
        }
    }

    public void c() {
        if (m1626a().isPerfUploadSwitchOpen()) {
            bp bpVar = new bp();
            bpVar.a(this.f14a);
            bpVar.a(this.f11a);
            this.f17a.execute(bpVar);
        }
    }
}
