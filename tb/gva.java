package tb;

import android.content.Context;
import android.os.Build;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.e;
import com.taobao.android.job.core.task.d;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.application.common.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.gvb;
import tb.mto;

/* loaded from: classes5.dex */
public class gva {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<a> f28501a = new ArrayList();
    private static boolean b = false;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f28504a;
        public d b;
        public String c;

        private a() {
        }
    }

    public static /* synthetic */ void a(Context context, String str, d dVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e01ebe", new Object[]{context, str, dVar, str2});
        } else {
            b(context, str, dVar, str2);
        }
    }

    public static /* synthetic */ void b(Context context, e eVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9735e512", new Object[]{context, eVar, dVar});
        } else {
            c(context, eVar, dVar);
        }
    }

    public static void a(final Context context, final e<String, Void> eVar, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677eb111", new Object[]{context, eVar, dVar});
        } else {
            gvb.b.f28506a.submit(new Runnable() { // from class: tb.gva.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    gva.b(context, eVar, dVar);
                }
            });
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : gvj.a();
    }

    public static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            gvb.b.f28506a.submit(new Runnable() { // from class: tb.gva.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
                    if (r11 != 0) goto L25;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        r18 = this;
                        r0 = r18
                        com.android.alibaba.ip.runtime.IpChange r1 = tb.gva.AnonymousClass2.$ipChange
                        boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                        r3 = 0
                        r4 = 1
                        if (r2 == 0) goto L14
                        java.lang.Object[] r2 = new java.lang.Object[r4]
                        r2[r3] = r0
                        java.lang.String r3 = "5c510192"
                        r1.ipc$dispatch(r3, r2)
                        return
                    L14:
                        java.util.Map<java.lang.String, java.util.Set<tb.gvj$a>> r1 = tb.gvj.f28511a
                        if (r1 == 0) goto Ld6
                        java.util.Map<java.lang.String, java.util.Set<tb.gvj$a>> r1 = tb.gvj.f28511a
                        java.util.Set r1 = r1.keySet()
                        java.util.Iterator r1 = r1.iterator()
                    L22:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto Ld1
                        java.lang.Object r2 = r1.next()
                        java.lang.String r2 = (java.lang.String) r2
                        java.util.Map<java.lang.String, java.util.Set<tb.gvj$a>> r5 = tb.gvj.f28511a
                        java.lang.Object r5 = r5.get(r2)
                        java.util.Set r5 = (java.util.Set) r5
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        int r8 = r5.size()
                        java.util.Iterator r5 = r5.iterator()
                        r11 = 0
                        r13 = 0
                    L47:
                        boolean r7 = r5.hasNext()
                        if (r7 == 0) goto Lb5
                        java.lang.Object r7 = r5.next()
                        tb.gvj$a r7 = (tb.gvj.a) r7
                        boolean r15 = r7.a()
                        if (r15 == 0) goto Lb2
                        java.util.Locale r15 = java.util.Locale.ENGLISH
                        r9 = 4
                        java.lang.Object[] r9 = new java.lang.Object[r9]
                        java.lang.String r10 = r7.b
                        r9[r3] = r10
                        r16 = r1
                        r17 = r2
                        long r1 = r7.c
                        java.lang.Long r1 = java.lang.Long.valueOf(r1)
                        r9[r4] = r1
                        r1 = 2
                        long r3 = r7.d
                        java.lang.Long r3 = java.lang.Long.valueOf(r3)
                        r9[r1] = r3
                        long r3 = r7.d
                        long r1 = r7.c
                        long r3 = r3 - r1
                        java.lang.Long r1 = java.lang.Long.valueOf(r3)
                        r2 = 3
                        r9[r2] = r1
                        java.lang.String r1 = "%s#ExecutionSummary{startTime=%d, endTime=%d, duration=%d, total=1, executed=1, isMainThread=0}[]"
                        java.lang.String r1 = java.lang.String.format(r15, r1, r9)
                        r6.append(r1)
                        java.lang.String r1 = "|"
                        r6.append(r1)
                        long r1 = r7.c
                        int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                        if (r3 > 0) goto L9f
                        r1 = 0
                        int r3 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                        if (r3 != 0) goto La3
                        goto La1
                    L9f:
                        r1 = 0
                    La1:
                        long r11 = r7.c
                    La3:
                        long r3 = r7.d
                        int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
                        if (r9 >= 0) goto Lab
                        long r13 = r7.d
                    Lab:
                        r1 = r16
                        r2 = r17
                        r3 = 0
                        r4 = 1
                        goto L47
                    Lb2:
                        r17 = r2
                        goto L47
                    Lb5:
                        r16 = r1
                        r17 = r2
                        r7 = r8
                        r9 = r11
                        r11 = r13
                        com.taobao.android.job.core.task.d r1 = com.taobao.android.job.core.task.d.a(r7, r8, r9, r11)
                        android.content.Context r2 = r1
                        java.lang.String r3 = r6.toString()
                        r4 = r17
                        tb.gva.a(r2, r4, r1, r3)
                        r1 = r16
                        r3 = 0
                        r4 = 1
                        goto L22
                    Ld1:
                        java.util.Map<java.lang.String, java.util.Set<tb.gvj$a>> r1 = tb.gvj.f28511a
                        r1.clear()
                    Ld6:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tb.gva.AnonymousClass2.run():void");
                }
            });
        }
    }

    private static void c(Context context, e<String, Void> eVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ed1913", new Object[]{context, eVar, dVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        gvh.a(eVar.a(), dVar, eVar.a(sb));
        a aVar = new a();
        aVar.f28504a = eVar.a();
        aVar.b = dVar;
        aVar.c = sb.toString();
        if (f28501a.size() >= 4) {
            f28501a.add(aVar);
            for (a aVar2 : f28501a) {
                b(context, aVar2.f28504a, aVar2.b, aVar2.c);
            }
            f28501a.clear();
            b = true;
        } else if (!b) {
            f28501a.add(aVar);
        } else {
            b(context, aVar.f28504a, aVar.b, aVar.c);
        }
    }

    private static void b(Context context, String str, d dVar, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca3e435d", new Object[]{context, str, dVar, str2});
            return;
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(context);
        Request requestImpl = new RequestImpl("https://tmq-service.taobao.org/task_exec/reportPerformance");
        requestImpl.setMethod("POST");
        requestImpl.setCharset("UTF-8");
        requestImpl.setFollowRedirects(true);
        requestImpl.setRetryTime(3);
        requestImpl.addHeader("Content-Type", "application/json");
        HashMap hashMap = new HashMap(4);
        HashMap hashMap2 = new HashMap(20);
        hashMap2.put("stage_name", str);
        hashMap2.put("stage_execution_start", Long.valueOf(dVar.f13005a));
        hashMap2.put("stage_execution_end", Long.valueOf(dVar.b));
        hashMap2.put("stage_execution_node_count_total", Integer.valueOf(dVar.c));
        hashMap2.put("stage_execution_node_count_executed", Integer.valueOf(dVar.d));
        hashMap2.put("scene", "DAGRuntime");
        hashMap2.put("stage_summary", str2);
        hashMap2.put("app_process", LauncherRuntime.c);
        hashMap2.put("app_version", LauncherRuntime.e);
        hashMap2.put("app_device_model", Build.MODEL);
        hashMap2.put("app_device_brand", Build.BRAND);
        hashMap2.put("app_device_core_size", Integer.valueOf(gsm.a(mto.a.GEO_NOT_SUPPORT)));
        com.taobao.application.common.d a2 = c.a();
        hashMap2.put("app_device_score", Integer.valueOf(a2.a(com.taobao.tbdeviceevaluator.c.KEY_OLD_SCORE, 60)));
        hashMap2.put("app_status_is_full_new_install", Boolean.valueOf(a2.a("isFullNewInstall", false)));
        hashMap2.put("app_status_is_first_launch", Boolean.valueOf(a2.a("isFirstLaunch", false)));
        hashMap2.put("app_device_manufacturer", Build.MANUFACTURER);
        hashMap2.put("app_device_os", "android");
        hashMap2.put("app_package_debug", Boolean.valueOf(LauncherRuntime.l));
        hashMap2.put("app_package_tag", LauncherRuntime.f);
        hashMap.put("data_type", "launch_stage_summary");
        hashMap.put(MspGlobalDefine.APP_KEY, com.taobao.android.launcher.common.c.a("constantAppkey", ""));
        hashMap.put("data", hashMap2);
        hashMap.put("exec_id", Long.valueOf(LauncherRuntime.f13108a));
        if (LauncherRuntime.k == 1) {
            str3 = "link";
        } else {
            str3 = LauncherRuntime.k == 2 ? "link-h5" : "normal";
        }
        hashMap.put("launch_type", str3);
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry(JSON.toJSONBytes(hashMap, new SerializerFeature[0]));
        byteArrayEntry.setContentType("application/json");
        requestImpl.setBodyEntry(byteArrayEntry);
        gsl.b("DAGRuntime", "[stage:%s][getResponse] exec_id=%d", str, Long.valueOf(LauncherRuntime.f13108a));
        try {
            Response syncSend = degradableNetwork.syncSend(requestImpl, null);
            if (syncSend.getStatusCode() != 200) {
                return;
            }
            gsl.b("DAGRuntime", "[stage:%s][getResponse] id=%d", str, Long.valueOf(((JSONObject) JSON.parse(syncSend.getBytedata(), new Feature[0])).getJSONObject("resultData").getLongValue("id")));
        } catch (Throwable th) {
            gsl.b("DAGRuntime", "[stage:%s][getResponse] failed:", str, th);
        }
    }
}
