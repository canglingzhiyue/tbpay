package com.taobao.android.detail.core.detail.controller.callback;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.open.DetailBusinessDetector;
import com.taobao.android.detail.core.open.ProtocolType;
import com.taobao.android.detail.core.open.h;
import com.taobao.android.detail.core.open.o;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.performance.preload.f;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.TradeNode;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.detail.ttdetail.utils.g;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.zcache.n;
import com.ut.share.utils.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.MtopStatistics;
import tb.dwk;
import tb.dya;
import tb.dyl;
import tb.eap;
import tb.eca;
import tb.ecb;
import tb.ecg;
import tb.ecu;
import tb.eip;
import tb.eiq;
import tb.emu;
import tb.emy;
import tb.enh;
import tb.epj;
import tb.epn;
import tb.epp;
import tb.eps;
import tb.ept;
import tb.epu;
import tb.epv;
import tb.eqb;
import tb.eqc;
import tb.god;
import tb.jqm;
import tb.kge;
import tb.oqd;

/* loaded from: classes4.dex */
public class e implements o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASS_NAME = "com.taobao.android.detail.core.detail.controller.callback.ainRequestListener";
    private long c;
    private String d;
    private DetailCoreActivity f;
    private c g;
    private dwk k;
    private boolean b = false;
    private boolean e = false;
    private ProtocolType h = ProtocolType.TYPE_UNKNOWN;

    /* renamed from: a  reason: collision with root package name */
    public Handler f9453a = new Handler(Looper.getMainLooper());
    private a i = new a();
    private com.taobao.android.detail.core.detail.controller.callback.a j = new com.taobao.android.detail.core.detail.controller.callback.b();
    private d l = new d();

    /* loaded from: classes4.dex */
    public interface b extends c {
        void a(JSONObject jSONObject);

        void a(String str);
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(MtopResponse mtopResponse);

        void a(enh enhVar);
    }

    static {
        kge.a(-1608562406);
        kge.a(-1333121806);
    }

    public static /* synthetic */ JSONObject a(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a4dd2a0c", new Object[]{eVar, jSONObject}) : eVar.a(jSONObject);
    }

    public static /* synthetic */ enh a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enh) ipChange.ipc$dispatch("b908b879", new Object[]{eVar, str}) : eVar.c(str);
    }

    public static /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bfac84", new Object[]{eVar});
        } else {
            eVar.b();
        }
    }

    public static /* synthetic */ void a(e eVar, Executor executor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc575e5c", new Object[]{eVar, executor, str});
        } else {
            eVar.a(executor, str);
        }
    }

    public static /* synthetic */ void a(e eVar, MtopResponse mtopResponse, String str, enh enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b20f04", new Object[]{eVar, mtopResponse, str, enhVar});
        } else {
            eVar.a(mtopResponse, str, enhVar);
        }
    }

    public static /* synthetic */ void b(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18af66ad", new Object[]{eVar, jSONObject});
        } else {
            eVar.c(jSONObject);
        }
    }

    public static /* synthetic */ boolean b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8eef34a7", new Object[]{eVar})).booleanValue() : eVar.a();
    }

    public static /* synthetic */ DetailCoreActivity c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("feb35c4d", new Object[]{eVar}) : eVar.f;
    }

    public static /* synthetic */ void c(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37699e6e", new Object[]{eVar, jSONObject});
        } else {
            eVar.b(jSONObject);
        }
    }

    public static /* synthetic */ String d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff3eddf", new Object[]{eVar}) : eVar.f();
    }

    public static /* synthetic */ enh d(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (enh) ipChange.ipc$dispatch("edde9078", new Object[]{eVar, jSONObject}) : eVar.h(jSONObject);
    }

    public static /* synthetic */ c e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ec9b3d7d", new Object[]{eVar}) : eVar.g;
    }

    public e(DetailCoreActivity detailCoreActivity, String str, c cVar) {
        this.f = detailCoreActivity;
        this.d = str;
        this.g = cVar;
        if (eip.l) {
            DetailCoreActivity detailCoreActivity2 = this.f;
            com.taobao.android.detail.core.aura.utils.b.a(detailCoreActivity2, detailCoreActivity2.aT());
            DetailCoreActivity detailCoreActivity3 = this.f;
            com.taobao.android.detail.core.aura.utils.b.a(detailCoreActivity3, detailCoreActivity3.aV());
            i.c(com.taobao.android.detail.core.performance.a.a("MainRequestListener"), "MainRequestListener前置异步加载AURA配置");
        }
        emu.a("com.taobao.android.detail.core.detail.controller.callback.MainRequestListener");
    }

    public void a(com.taobao.android.detail.core.detail.controller.callback.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bddb08", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        DetailCoreActivity detailCoreActivity = this.f;
        if (detailCoreActivity == null || detailCoreActivity.isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && this.f.isDestroyed();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f.j();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f;
        if (detailCoreActivity == null) {
            return;
        }
        detailCoreActivity.i();
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", Boolean.valueOf(z));
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
        epu.a("stage", WXExceptionConfig.KEY_BIZ, "onMtopFinished", null, hashMap);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
        epu.a("stage", WXExceptionConfig.KEY_BIZ, "start executing doInBackground()", null, hashMap);
    }

    private void a(Executor executor, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573472f8", new Object[]{this, executor, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "no id";
        }
        hashMap.put("executor id", str);
        hashMap.put("executor info", executor != null ? executor.toString() : "no info");
        epu.a("exception", WXExceptionConfig.KEY_BIZ, "Async Task not executed", null, hashMap);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONArray = jSONObject2.getJSONArray("apiStack")) == null || (jSONObject3 = jSONArray.getJSONObject(0)) == null) {
            return null;
        }
        JSONObject jSONObject7 = jSONObject3.getJSONObject("data");
        if (jSONObject7 == null) {
            jSONObject7 = jSONObject3.getJSONObject("value");
        }
        if (jSONObject7 != null && (jSONObject4 = jSONObject7.getJSONObject("global")) != null && (jSONObject5 = jSONObject4.getJSONObject("data")) != null && (jSONObject6 = jSONObject5.getJSONObject(SkuCoreNode.TAG)) != null) {
            return jSONObject6.getJSONObject("skuItem");
        }
        return null;
    }

    private void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("skuV3ClientCache")) == null) {
        } else {
            n.a(Arrays.asList(jSONObject2.getString("cacheName"), jSONObject2.getString("cacheUrl")));
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("skuClientCache")) == null) {
        } else {
            n.a(Arrays.asList(jSONObject2.getString("cacheName"), jSONObject2.getString("cacheUrl")));
        }
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        c cVar = this.g;
        if (!(cVar instanceof b)) {
            return;
        }
        ((b) cVar).a(jSONObject);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        c cVar = this.g;
        if (!(cVar instanceof b)) {
            return;
        }
        ((b) cVar).a(str);
    }

    private enh f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("2e243184", new Object[]{this, jSONObject});
        }
        d();
        i.d(j.a("MainRequestListener"), "子线程数据解析start");
        enh enhVar = null;
        this.f9453a.removeCallbacks(this.i);
        try {
            this.c = SystemClock.uptimeMillis();
            eqc.a(this.f, "mProcessData", "数据解析总时间");
            com.taobao.android.detail.datasdk.model.datamodel.node.b.f10050a = this.d;
            enhVar = g(jSONObject);
        } catch (Throwable th) {
            i.a(j.a("MainRequestListener"), "子线程数据解析异常:", th);
            DetailCoreActivity detailCoreActivity = this.f;
            ecb.a(detailCoreActivity, detailCoreActivity.F(), th.toString());
        }
        i.d(j.a("MainRequestListener"), "子线程数据解析end");
        return enhVar;
    }

    private enh b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("7d1b8cb4", new Object[]{this, str});
        }
        d();
        i.d(j.a("MainRequestListener"), "子线程数据解析start");
        enh enhVar = null;
        this.f9453a.removeCallbacks(this.i);
        try {
            this.c = SystemClock.uptimeMillis();
            eqc.a(this.f, "mProcessData", "数据解析总时间");
            com.taobao.android.detail.datasdk.model.datamodel.node.b.f10050a = this.d;
            eqc.a(this.f, "parseObject", "ultronProtocolJudge之前准备数据");
            JSONObject parseObject = JSONObject.parseObject(str);
            eqc.b(this.f, "parseObject");
            i.d(j.a("MainRequestListener"), "子线程数据解析 t1");
            enhVar = g(parseObject);
        } catch (Throwable th) {
            i.a(j.a("MainRequestListener"), "Main structure building error:", th);
            i.a("DetailTime", "子线程数据解析异常", th);
            DetailCoreActivity detailCoreActivity = this.f;
            ecb.a(detailCoreActivity, detailCoreActivity.F(), th.toString());
        }
        i.d(j.a("MainRequestListener"), "子线程数据解析end");
        return enhVar;
    }

    private enh g(JSONObject jSONObject) {
        ITrackAdapter j;
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("c8c4f405", new Object[]{this, jSONObject});
        }
        enh enhVar = null;
        try {
            emy emyVar = new emy(this.f);
            eqc.a(this.f, "isUltron", "判断是否奥创协议");
            boolean a2 = emyVar.a((Object) jSONObject);
            eqc.b(this.f, "isUltron");
            String a3 = j.a("MainRequestListener");
            i.d(a3, "是否新奥创协议:" + a2);
            if (a2) {
                epp.c("MainRequestListener", "新奥创协议");
                ecu.L = "ultron";
                this.f.D().a(com.taobao.android.detail.core.ultronengine.c.STAGE_PROCESS_DATA);
                enhVar = a(this.f, emyVar, jSONObject);
                if (enhVar != null && enhVar.c != null && enhVar.c.f27459a != null && enhVar.c.f27459a.f10055a != null) {
                    com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = enhVar.c.f27459a.f10055a;
                    if (eqb.f(bVar).isDetail3HeaderPic) {
                        enhVar.d = g.a(bVar.a(), new JSONObject());
                        enhVar.f = jSONObject.hashCode();
                        z2 = true;
                    }
                    com.taobao.android.detail.ttdetail.utils.d.d(bVar.a());
                }
                enhVar.e = z2;
                this.j.a(this.f, enhVar);
                this.f.D().b(com.taobao.android.detail.core.ultronengine.c.STAGE_PROCESS_DATA);
            } else {
                epp.c("MainRequestListener", "老详情协议");
                ecu.L = "default";
                this.f.a(false);
                JSONObject e = com.taobao.android.sku.utils.g.e(jSONObject);
                String str = this.f.f9411a.f27180a;
                String b2 = d.b(e);
                if (!TextUtils.isEmpty(b2)) {
                    str = b2;
                } else if (TextUtils.isEmpty(str)) {
                    str = "emptyItemId";
                }
                String a4 = this.l.a(this.f, e, str);
                StringBuilder sb = !TextUtils.isEmpty(a4) ? new StringBuilder(a4) : new StringBuilder();
                enh a5 = a(emyVar, jSONObject, sb);
                try {
                    String sb2 = sb.toString();
                    if ((a5 != null) && !TextUtils.isEmpty(sb2)) {
                        a(sb2);
                    } else {
                        DetailCoreActivity detailCoreActivity = this.f;
                        if (emy.b(jSONObject)) {
                            z = false;
                        }
                        ecg.a(detailCoreActivity, str, z, d.c(e), (String) null);
                    }
                    enhVar = a5;
                } catch (Throwable th) {
                    th = th;
                    enhVar = a5;
                    i.a(j.a("MainRequestListener"), "Main structure building error:", th);
                    i.a("DetailTime", "子线程数据解析异常", th);
                    DetailCoreActivity detailCoreActivity2 = this.f;
                    ecb.a(detailCoreActivity2, detailCoreActivity2.F(), th.toString());
                    return enhVar;
                }
            }
            if (enhVar != null && enhVar.b != null && enhVar.b.b != null && enhVar.b.b.f10055a != null) {
                com.taobao.android.detail.datasdk.model.datamodel.node.b bVar2 = enhVar.b.b.f10055a;
                String k = bVar2.k();
                if (!TextUtils.isEmpty(k) && (j = epj.j()) != null) {
                    j.activateServerTest(k, this.f);
                }
                FeatureNode f = eqb.f(bVar2);
                if (f != null) {
                    s.b(f.enablePadLayout);
                }
                if (!bVar2.n()) {
                    e(jSONObject);
                }
            }
            if (epv.c && enhVar != null && enhVar.b != null && enhVar.b.f27460a != null) {
                a((List<com.taobao.android.detail.datasdk.model.viewmodel.main.b>) enhVar.b.f27460a);
            }
            epu.b("protocol", ecu.L);
            epu.b("dinamicV3Enable", ecu.r + "");
        } catch (Throwable th2) {
            th = th2;
        }
        return enhVar;
    }

    private void e(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("prefetchNewbuySku3Zcache") { // from class: com.taobao.android.detail.core.detail.controller.callback.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        JSONObject a2 = e.a(e.this, jSONObject);
                        e.b(e.this, a2);
                        e.c(e.this, a2);
                    } catch (Throwable th) {
                        i.a("NewbuySku3Zcache", "prefetchZcacheError", th);
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:11|(1:13)|14|(2:18|(2:20|(2:22|23)))|24|(6:25|26|(1:170)(1:32)|33|(1:35)|36)|(2:38|(1:40)(6:41|(1:43)(1:110)|44|45|46|47))(10:111|(15:113|(1:115)(1:162)|116|(3:118|(1:120)|121)(2:156|(2:158|(1:160))(1:161))|122|123|124|125|(3:127|(3:129|(1:131)|132)|133)(2:149|(1:151))|134|(3:136|(1:138)(1:140)|139)|141|(1:143)(1:148)|144|145)(5:163|(1:165)|166|(1:168)|169)|146|(6:59|(1:61)|62|(2:66|(2:68|(1:70))(2:71|(2:73|(1:75))))|76|(6:78|(1:80)(2:87|(1:89)(1:90))|81|(1:83)|84|(1:86))(2:91|(1:93)))|94|(1:96)(1:106)|97|(1:103)|104|105)|51|52|(2:54|55)(8:57|(0)|94|(0)(0)|97|(3:99|101|103)|104|105)) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03f8, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03f9, code lost:
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03fc, code lost:
        com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.j.a("MainRequestListener"), "Main structure building error:", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cf A[Catch: Throwable -> 0x03fb, TRY_ENTER, TryCatch #0 {Throwable -> 0x03fb, blocks: (B:7:0x0034, B:10:0x003f, B:12:0x0050, B:15:0x0059, B:17:0x005f, B:19:0x006b, B:21:0x007e, B:23:0x008a, B:114:0x02cf, B:116:0x02d7, B:117:0x02e0, B:119:0x02e6, B:121:0x02ec, B:123:0x02f4, B:125:0x02fd, B:126:0x0304, B:128:0x030c, B:130:0x0315, B:131:0x031a, B:133:0x031e, B:140:0x033d, B:142:0x0357, B:143:0x035e, B:145:0x0367, B:136:0x0334, B:146:0x036f, B:148:0x0379, B:149:0x0382, B:153:0x0391, B:155:0x03e4, B:157:0x03e8, B:159:0x03ec), top: B:167:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.enh a(final android.content.Context r17, tb.emy r18, com.alibaba.fastjson.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 1039
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.controller.callback.e.a(android.content.Context, tb.emy, com.alibaba.fastjson.JSONObject):tb.enh");
    }

    private void a(Context context, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, dwk dwkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cf432", new Object[]{this, context, bVar, dwkVar});
            return;
        }
        if (jqm.a()) {
            a(context, "当前页面是AURA渲染");
        }
        if (!eip.l) {
            DetailCoreActivity detailCoreActivity = this.f;
            com.taobao.android.detail.core.aura.utils.b.a(detailCoreActivity, detailCoreActivity.aT());
            i.c(com.taobao.android.detail.core.performance.a.a("MainRequestListener"), "initAuraMode后置异步加载AURA配置");
        }
        if (!eip.R) {
            dwkVar.a().a(bVar);
        }
        i.d(j.a("MainRequestListener"), "MainRequestListener.initAuraMode");
    }

    private void a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            this.f9453a.post(new Runnable() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(context, str, 0).show();
                    }
                }
            });
        }
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar, List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7038252", new Object[]{this, cVar, list});
            return;
        }
        if (cVar != null && list != null && ecu.K != null && ecu.K.indexOf("/") > 0) {
            try {
                String str = ecu.K;
                int intValue = Integer.valueOf(str.substring(str.indexOf("/") + 1, ecu.K.length())).intValue();
                int intValue2 = Integer.valueOf(ecu.K.substring(0, ecu.K.indexOf("/"))).intValue();
                if (intValue == 0) {
                    return;
                }
                com.taobao.android.detail.datasdk.protocol.adapter.core.d c2 = epj.c();
                if (TextUtils.isEmpty(c2.e()) || Long.valueOf(c2.e()).longValue() % intValue > intValue2) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                HashMap hashMap = new HashMap();
                for (com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar : list) {
                    if (bVar != null && bVar.dmComponent != null) {
                        jSONArray.add(bVar.dmComponent.getType());
                    }
                }
                hashMap.put("itemId", cVar.i());
                hashMap.put("category", cVar.f().get("detail_categoryid"));
                hashMap.put("bizCode", cVar.f().get("aliBizCode"));
                hashMap.put("componentList", jSONArray.toJSONString());
                eps.a("Page_Detail", "component_info", hashMap);
            } catch (Throwable unused) {
            }
        }
    }

    private enh a(emy emyVar, JSONObject jSONObject, StringBuilder sb) {
        enh a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("40b13265", new Object[]{this, emyVar, jSONObject, sb});
        }
        enh enhVar = null;
        try {
            i.d(j.a("MainRequestListener"), "detailProcess t1");
            this.h = ProtocolType.TYPE_DEFAULT;
            com.taobao.android.detail.datasdk.model.datamodel.node.b a3 = emyVar.a(jSONObject);
            if (a3 == null) {
                return null;
            }
            d(a3.a());
            TradeNode e = eqb.e(a3);
            if (e != null && !TextUtils.isEmpty(e.degradeUrl) && !TextUtils.isEmpty(sb)) {
                e.degradeUrl = sb.toString();
            }
            this.f.c(a3.m());
            i.d(j.a("MainRequestListener"), "detailProcess t2");
            h hVar = (h) com.taobao.android.detail.core.open.n.a(this.f);
            if (hVar != null) {
                hVar.a(this.h);
            }
            String str = "mainDetail";
            if (hVar != null && hVar.h() != null) {
                DetailBusinessDetector h = hVar.h();
                if (h.detect(a3, this.f)) {
                    str = h.getClass().getSimpleName();
                    h.reCustomizeDetail(hVar, this.f);
                    if (!h.isDefaultDetailApi()) {
                        this.e = true;
                        this.f.y().a(false);
                        return null;
                    }
                }
            }
            epu.b("bizName", str);
            ept.a(str);
            i.d(j.a("MainRequestListener"), "detailProcess t3");
            if (!TextUtils.isEmpty(sb)) {
                a2 = new enh(null);
                if (e != null) {
                    try {
                        if (!TextUtils.isEmpty(e.degradeUrl)) {
                            sb.replace(0, sb.length(), e.degradeUrl);
                        }
                    } catch (Throwable th) {
                        enhVar = a2;
                        th = th;
                        i.a(j.a("MainRequestListener"), "Main structure building error:", th);
                        return enhVar;
                    }
                }
            } else {
                a2 = emyVar.a(a3);
            }
            enh enhVar2 = a2;
            i.d(j.a("MainRequestListener"), "detailProcess t4");
            ecb.a(this.f, a3, eca.TYPE_DETAIL_1);
            eqc.b(this.f, "mProcessData");
            eqc.a(this.f, "mThreadSwitch", "线程切换");
            i.d(j.a("MainRequestListener"), "detailProcess end");
            return enhVar2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean a(enh enhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e72cc59d", new Object[]{this, enhVar})).booleanValue();
        }
        if (enhVar != null && enhVar.b != null && enhVar.b.b != null && enhVar.b.b.f10055a != null) {
            return enhVar.b.b.f10055a.m();
        }
        return false;
    }

    private void a(MtopResponse mtopResponse, String str, enh enhVar) {
        String str2;
        dwk dwkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eae140e8", new Object[]{this, mtopResponse, str, enhVar});
            return;
        }
        i.d(j.a("MainRequestListener"), "internalOnPostExecute start");
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null) {
            com.taobao.android.detail.core.perf.b.a((Context) this.f, "isPreFetch", String.valueOf(mtopStat.isPrefetch));
        }
        DetailCoreActivity detailCoreActivity = this.f;
        if (detailCoreActivity != null && enhVar != null) {
            detailCoreActivity.a(enhVar.d);
            this.f.a(enhVar.f);
            this.f.a(enhVar.e);
        }
        if (eip.R && (dwkVar = this.k) != null && dwkVar.a() != null && a(enhVar)) {
            this.k.a().a(enhVar.b.b.f10055a);
        }
        DetailCoreActivity detailCoreActivity2 = this.f;
        if (detailCoreActivity2 != null) {
            detailCoreActivity2.a(str);
        }
        if (this.e) {
            this.e = false;
        } else if (a()) {
        } else {
            c cVar = this.g;
            try {
                eqc.b(this.f, "mThreadSwitch");
            } catch (Throwable th) {
                i.a("MainRequestListener", "MainRequestListener onPostExecute exception :", th);
                if (cVar != null) {
                    cVar.a(mtopResponse);
                }
                a(this.f, this.h, enhVar, th);
                String str3 = this.f.f9411a != null ? this.f.f9411a.f27180a : "";
                if (ProtocolType.TYPE_ULTRON != this.h) {
                    str2 = eca.TYPE_DETAIL_1;
                } else {
                    str2 = !this.f.F() ? eca.TYPE_DETAIL2 : eca.TYPE_DETAIL_AURA;
                }
                eca.a(this.f, str3, th.toString(), str2);
            }
            if (cVar == null) {
                return;
            }
            if (enhVar == null) {
                i.a("MainRequestListener", "detailMainStructure == null");
                cVar.a(mtopResponse);
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                this.f.y().b(uptimeMillis);
                cVar.a(enhVar);
                com.taobao.android.detail.core.utils.h.f(this.f, SystemClock.uptimeMillis() - uptimeMillis);
            }
            i.d(j.a("MainRequestListener"), "internalOnPostExecute t1");
            b();
            c();
            i.d(j.a("MainRequestListener"), "internalOnPostExecute end");
        }
    }

    public void a(JSONObject jSONObject, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1339f3", new Object[]{this, jSONObject, str, map});
        } else {
            a(new MtopResponse(), jSONObject, str, map);
        }
    }

    @Override // com.taobao.android.detail.core.open.o
    public void a(MtopResponse mtopResponse, JSONObject jSONObject, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eea9678", new Object[]{this, mtopResponse, jSONObject, str, map});
        } else if (a()) {
        } else {
            if (com.taobao.android.detail.core.performance.e.b(this.f.f9411a.q) && !dyl.a(this.f).a(map)) {
                ecg.a();
                return;
            }
            this.j.a(this.f);
            b(str, map);
            try {
                this.f.D().b("mtopTime");
            } catch (Throwable th) {
                i.a("MainRequestListener", "onSuccess perf", th);
            }
            a(true);
            if (i(jSONObject)) {
                return;
            }
            a(mtopResponse, jSONObject, str);
        }
    }

    private boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        try {
            return i(JSONObject.parseObject(str));
        } catch (Exception e) {
            i.a("MainRequestListener", "checkDegrade", e);
            return false;
        }
    }

    private boolean i(final JSONObject jSONObject) {
        final boolean z;
        final boolean z2;
        DetailCoreActivity detailCoreActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfbe084", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null || jSONObject.getJSONObject("data") == null || jSONObject.getJSONObject("data").getJSONObject("feature") == null) {
            z = false;
            z2 = false;
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject("feature");
            z2 = Boolean.parseBoolean(jSONObject2.getString("degradeToErrorPage"));
            z = Boolean.parseBoolean(jSONObject2.getString("degradeToBaseDetail"));
        }
        if ((!z && !z2) || (detailCoreActivity = this.f) == null || detailCoreActivity.y() == null || this.f.A() == null) {
            return false;
        }
        this.f.A().post(new Runnable() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                e.a(e.this);
                if (e.b(e.this)) {
                    return;
                }
                if (z2) {
                    MtopResponse mtopResponse = new MtopResponse();
                    mtopResponse.setRetCode(ErrorConstant.ERRCODE_SYSTEM_ERROR);
                    e.c(e.this).y().a(mtopResponse);
                    ecg.a(e.d(e.this));
                } else if (!z) {
                } else {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("data").getJSONObject("trade");
                    String str = null;
                    if (jSONObject3 != null) {
                        str = jSONObject3.getString(Constants.WEIBO_REDIRECTURL_KEY);
                    }
                    String d = e.d(e.this);
                    if (TextUtils.isEmpty(str)) {
                        str = god.q + d;
                    }
                    ecg.b(d);
                    e.c(e.this).y().a(d, str, "degradeToBaseDetail降级");
                }
            }
        });
        return true;
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        String str = this.f.f9411a != null ? this.f.f9411a.f27180a : "";
        return str == null ? "" : str;
    }

    @Override // com.taobao.android.detail.core.open.d
    @Deprecated
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (a()) {
        } else {
            if (com.taobao.android.detail.core.performance.e.b(this.f.f9411a.q) && !dyl.a(this.f).a(map)) {
                ecg.a();
                return;
            }
            this.j.a(this.f);
            b(str, map);
            try {
                this.f.D().b("mtopTime");
            } catch (Throwable th) {
                i.a("MainRequestListener", "onSuccess perf", th);
            }
            MtopResponse mtopResponse = new MtopResponse();
            a(true);
            if (d(str)) {
                return;
            }
            DetailCoreActivity detailCoreActivity = this.f;
            if (detailCoreActivity != null && detailCoreActivity.k() && eiq.g) {
                a(mtopResponse, str);
            } else if (eip.q) {
                b(mtopResponse, str);
            } else {
                c(mtopResponse, str);
            }
        }
    }

    private void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f;
        if (detailCoreActivity == null || detailCoreActivity.y() == null || this.f.y().a() == null) {
            return;
        }
        this.f.y().a().a(str);
    }

    private enh c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("7dc83853", new Object[]{this, str});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        enh b2 = b(str);
        com.taobao.android.detail.core.utils.h.g(this.f, SystemClock.uptimeMillis() - uptimeMillis);
        return b2;
    }

    private enh h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("6365b686", new Object[]{this, jSONObject});
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        enh f = f(jSONObject);
        com.taobao.android.detail.core.utils.h.g(this.f, SystemClock.uptimeMillis() - uptimeMillis);
        return f;
    }

    private void a(final MtopResponse mtopResponse, final JSONObject jSONObject, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0051d6d", new Object[]{this, mtopResponse, jSONObject, str});
            return;
        }
        final long[] jArr = new long[1];
        f.a(new Runnable() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                i.c(l.a("MainRequestListener"), "预加载模式下 ParserResponseExecutorService 执行解析数据");
                final enh d = e.d(e.this, jSONObject);
                jArr[0] = SystemClock.uptimeMillis();
                e.this.f9453a.post(new Runnable() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.6.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long uptimeMillis = SystemClock.uptimeMillis() - jArr[0];
                        com.taobao.android.detail.core.utils.h.s(e.c(e.this), uptimeMillis);
                        String a2 = l.a("MainRequestListener");
                        i.c(a2, "预加载模式下 ParserResponseExecutorService后 主线程渲染数据, 子线程切主线程耗时: " + uptimeMillis);
                        e.a(e.this, mtopResponse, str, d);
                    }
                });
            }
        });
    }

    private void a(final MtopResponse mtopResponse, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dca6b7", new Object[]{this, mtopResponse, str});
            return;
        }
        final long[] jArr = new long[1];
        f.a(new Runnable() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                i.c(l.a("MainRequestListener"), "预加载模式下 ParserResponseExecutorService 执行解析数据");
                final enh a2 = e.a(e.this, str);
                jArr[0] = SystemClock.uptimeMillis();
                e.this.f9453a.post(new Runnable() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.7.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long uptimeMillis = SystemClock.uptimeMillis() - jArr[0];
                        com.taobao.android.detail.core.utils.h.s(e.c(e.this), uptimeMillis);
                        String a3 = l.a("MainRequestListener");
                        i.c(a3, "预加载模式下 ParserResponseExecutorService后 主线程渲染数据, 子线程切主线程耗时: " + uptimeMillis);
                        e.a(e.this, mtopResponse, str, a2);
                    }
                });
            }
        });
    }

    private void b(final MtopResponse mtopResponse, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c70afb8", new Object[]{this, mtopResponse, str});
            return;
        }
        final long[] jArr = new long[1];
        Coordinator.TaggedRunnable taggedRunnable = new Coordinator.TaggedRunnable(" detail process mtop response") { // from class: com.taobao.android.detail.core.detail.controller.callback.e.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                i.c(com.taobao.android.detail.core.performance.b.a("MainRequestListener"), "start async thread to handle internalDoInBackground");
                final enh a2 = e.a(e.this, str);
                jArr[0] = SystemClock.uptimeMillis();
                e.c(e.this).runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.8.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        long uptimeMillis = SystemClock.uptimeMillis() - jArr[0];
                        com.taobao.android.detail.core.utils.h.s(e.c(e.this), uptimeMillis);
                        String a3 = j.a("MainRequestListener");
                        i.c(a3, "子线程切主线程耗时: " + uptimeMillis);
                        e.a(e.this, mtopResponse, str, a2);
                    }
                });
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Coordinator.postTask(taggedRunnable);
        } else {
            taggedRunnable.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.detail.core.detail.controller.callback.e$2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(final mtopsdk.mtop.domain.MtopResponse r8, final java.lang.String r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.detail.controller.callback.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            r1[r2] = r8
            r8 = 2
            r1[r8] = r9
            java.lang.String r8 = "8204b8b9"
            r0.ipc$dispatch(r8, r1)
            return
        L18:
            com.taobao.android.detail.datasdk.protocol.adapter.optional.b r0 = tb.epj.h()     // Catch: java.lang.Throwable -> L48
            com.taobao.android.detail.core.detail.activity.DetailCoreActivity r1 = r7.f     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = com.ta.utdid2.device.UTDevice.getUtdid(r1)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L48
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L48
            java.lang.String r4 = "android_detail"
            java.lang.String r5 = "tb_async_task"
            java.lang.String r6 = "0"
            java.lang.String r0 = r0.a(r4, r5, r6)     // Catch: java.lang.Throwable -> L48
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L48
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L48
            int r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Throwable -> L48
            r4 = 100000(0x186a0, float:1.4013E-40)
            int r1 = r1 % r4
            if (r1 >= r0) goto L48
            r0 = 1
            goto L49
        L48:
            r0 = 0
        L49:
            r4 = 5000(0x1388, double:2.4703E-320)
            if (r0 == 0) goto L6b
            com.taobao.android.detail.core.detail.controller.callback.e$9 r0 = new com.taobao.android.detail.core.detail.controller.callback.e$9
            r0.<init>()
            java.util.concurrent.Executor r9 = com.taobao.android.detail.core.async.TBAsyncTask.THREAD_POOL_EXECUTOR
            mtopsdk.mtop.domain.MtopResponse[] r1 = new mtopsdk.mtop.domain.MtopResponse[r2]
            r1[r3] = r8
            r0.a(r9, r1)
            android.os.Handler r8 = r7.f9453a
            com.taobao.android.detail.core.detail.controller.callback.e$a r9 = r7.i
            java.util.concurrent.Executor r0 = com.taobao.android.detail.core.async.TBAsyncTask.THREAD_POOL_EXECUTOR
            java.lang.String r1 = "TB_AsyncTask"
            java.lang.Runnable r9 = r9.a(r0, r1)
            r8.postDelayed(r9, r4)
            return
        L6b:
            com.taobao.android.detail.core.detail.controller.callback.e$2 r0 = new com.taobao.android.detail.core.detail.controller.callback.e$2
            r0.<init>()
            java.util.concurrent.Executor r9 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            mtopsdk.mtop.domain.MtopResponse[] r1 = new mtopsdk.mtop.domain.MtopResponse[r2]
            r1[r3] = r8
            r0.executeOnExecutor(r9, r1)
            android.os.Handler r8 = r7.f9453a
            com.taobao.android.detail.core.detail.controller.callback.e$a r9 = r7.i
            java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
            java.lang.String r1 = "Sys_AsyncTask"
            java.lang.Runnable r9 = r9.a(r0, r1)
            r8.postDelayed(r9, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.detail.controller.callback.e.c(mtopsdk.mtop.domain.MtopResponse, java.lang.String):void");
    }

    @Override // com.taobao.android.detail.core.open.d
    public void a(final int i, final String str, final String str2, final MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7d33790", new Object[]{this, new Integer(i), str, str2, mtopStatistics});
            return;
        }
        dyl a2 = dyl.a(this.f);
        if (god.u && a2 != null) {
            a2.a("main");
        }
        e();
        com.taobao.android.detail.core.perf.c.b(this.f, oqd.MTOP_STAGE_NETWORKREQUEST);
        a(false);
        DetailCoreActivity detailCoreActivity = this.f;
        if (detailCoreActivity != null && detailCoreActivity.A() != null) {
            this.f.A().post(new Runnable() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    e.a(e.this);
                    if (e.b(e.this)) {
                        return;
                    }
                    c e = e.e(e.this);
                    if (e == null) {
                        i.a("MainRequestListener", "listener == null");
                        return;
                    }
                    MtopResponse mtopResponse = new MtopResponse();
                    mtopResponse.setRetCode(str);
                    mtopResponse.setRetMsg(str2);
                    mtopResponse.setResponseCode(i);
                    mtopResponse.setMtopStat(mtopStatistics);
                    e.a(mtopResponse);
                }
            });
        }
        try {
            UnifyLog.EventType eventType = UnifyLog.EventType.NET;
            UnifyLog.a("detail2", CLASS_NAME, "onFailure", "", "", eventType, "errorMsg: " + str2 + ", errCode: " + str);
        } catch (Throwable th) {
            i.a("TaobaoRequestImpl", "", th);
        }
        b(i, str, str2);
    }

    private void e() {
        dya y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f;
        if (detailCoreActivity == null || detailCoreActivity.f9411a == null || (y = this.f.y()) == null || !y.c()) {
            return;
        }
        long j = this.f.f9411a.w;
        long j2 = y.y;
        com.taobao.android.detail.core.utils.h.e(this.f, j2 - j, SystemClock.uptimeMillis() - j2);
    }

    private void b(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88798c4e", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        DetailCoreActivity detailCoreActivity = this.f;
        if (detailCoreActivity == null || detailCoreActivity.y() == null || this.f.y().a() == null) {
            return;
        }
        this.f.y().a().b(str2);
    }

    @Deprecated
    private void a(Activity activity, ProtocolType protocolType, enh enhVar, Throwable th) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02982ad", new Object[]{this, activity, protocolType, enhVar, th});
            return;
        }
        epn.a("Page_Detail", "Detail_Exception_Downgrade", (String) null, 1.0d);
        if (enhVar == null || enhVar.b == null) {
            return;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = enhVar.b.b;
        boolean z2 = (cVar != null) & (cVar.i() != null);
        if (cVar.e() == null) {
            z = false;
        }
        if (!z2 || !z) {
            return;
        }
        if (protocolType == ProtocolType.TYPE_ULTRON) {
            ecg.b(activity, cVar.i(), th);
        } else {
            ecg.a(activity, cVar.i(), th);
        }
    }

    private void a(List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list) {
        final com.taobao.android.detail.core.open.g a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null && list.size() != 0 && (a2 = com.taobao.android.detail.core.open.n.a(this.f)) != null) {
            com.taobao.android.detail.core.async.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b> u = this.f.y().u();
            int i = this.f.getResources().getDisplayMetrics().widthPixels;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 != 0) {
                    final com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar = list.get(i2);
                    u.a(i, bVar, new Callable<eap>() { // from class: com.taobao.android.detail.core.detail.controller.callback.e.11
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r0v2, types: [tb.eap, java.lang.Object] */
                        @Override // java.util.concurrent.Callable
                        public /* synthetic */ eap call() throws Exception {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
                        }

                        public eap a() throws Exception {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                return (eap) ipChange2.ipc$dispatch("f04084a", new Object[]{this});
                            }
                            com.taobao.android.detail.core.detail.kit.view.holder.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b> a3 = a2.a(e.c(e.this), bVar);
                            if (!(a3 instanceof eap)) {
                                return null;
                            }
                            eap eapVar = (eap) a3;
                            if (!eapVar.h() || a3.a((com.taobao.android.detail.core.detail.kit.view.holder.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b>) bVar, (ViewGroup) null) == null) {
                                return null;
                            }
                            a3.b(bVar);
                            return eapVar;
                        }
                    });
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String b;
        private Executor c;

        static {
            kge.a(1266097608);
            kge.a(-1390502639);
        }

        public a() {
        }

        public Runnable a(Executor executor, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Runnable) ipChange.ipc$dispatch("34ec9f9c", new Object[]{this, executor, str});
            }
            this.b = str;
            this.c = executor;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.a(e.this, this.c, this.b);
            }
        }
    }
}
