package com.etao.feimagesearch.newresult.base;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.perf.IrpAvaRecord;
import com.taobao.monitor.procedure.s;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.cog;
import tb.coy;
import tb.cpe;
import tb.cqm;
import tb.crh;
import tb.igi;
import tb.kge;
import tb.nnh;
import tb.nqh;
import tb.pqq;

/* loaded from: classes3.dex */
public final class e extends com.etao.feimagesearch.newresult.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String IRP_PAGE_NAME = "Page_PhotoSearchResult";

    /* renamed from: a  reason: collision with root package name */
    private h f6818a;
    private cqm b;
    private IrpDatasource c;
    private com.etao.feimagesearch.pipline.a d;
    private boolean e;
    private long f;
    private Map<String, String> g;

    static {
        kge.a(-695478174);
        Companion = new a(null);
    }

    @JvmStatic
    public static final Map<String, String> a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{intent}) : Companion.a(intent);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ IrpDatasource a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpDatasource) ipChange.ipc$dispatch("2956ba13", new Object[]{eVar});
        }
        IrpDatasource irpDatasource = eVar.c;
        if (irpDatasource == null) {
            q.b("irpDatasource");
        }
        return irpDatasource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cog activityAdapter, Map<String, String> intentParams) {
        super(activityAdapter);
        q.c(activityAdapter, "activityAdapter");
        q.c(intentParams, "intentParams");
        this.g = intentParams;
        this.f = -1L;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-658886358);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final Map<String, String> a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{this, intent});
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (intent == null) {
                return linkedHashMap;
            }
            a aVar = this;
            if (aVar.a(intent, linkedHashMap) || aVar.b(intent, linkedHashMap)) {
                return linkedHashMap;
            }
            Map<String, String> a2 = com.taobao.android.searchbaseframe.util.f.a(intent);
            q.a((Object) a2, "ParamParseUtil.parseParamsFromIntent(intent)");
            return a2;
        }

        private final boolean a(Intent intent, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c40430c4", new Object[]{this, intent, map})).booleanValue();
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            q.a((Object) extras, "intent.extras ?: return false");
            Parcelable parcelable = extras.getParcelable("android.intent.extra.STREAM");
            if (!(parcelable instanceof Uri)) {
                return false;
            }
            String obj = parcelable.toString();
            map.put("pssource", com.etao.feimagesearch.model.d.PSSOURCE_SYSTEM_ALBUM);
            map.put(com.etao.feimagesearch.model.d.KEY_PIC_URL, obj);
            map.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, PhotoFrom.Values.SYSTEM_ALBUM.getValue());
            return true;
        }

        private final boolean b(Intent intent, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("86f09a23", new Object[]{this, intent, map})).booleanValue();
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            q.a((Object) extras, "intent.extras ?: return false");
            Bundle bundle = extras.getBundle(com.etao.feimagesearch.model.d.EXTRA_KEY_BUNDLE_PARAM);
            if (bundle == null) {
                return false;
            }
            q.a((Object) bundle, "extras.getBundle(ModelCo…LE_PARAM) ?: return false");
            String string = bundle.getString(com.etao.feimagesearch.model.d.EXTRA_KEY_PIC_URI);
            map.put("pssource", bundle.getString("pssource"));
            map.put(com.etao.feimagesearch.model.d.KEY_PIC_URL, string);
            String string2 = bundle.getString(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM);
            if (StringUtils.isEmpty(string2)) {
                map.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, PhotoFrom.Values.PREVIEW.getValue());
            } else {
                map.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, string2);
            }
            return true;
        }
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void a(Bundle bundle, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216c10e8", new Object[]{this, bundle, new Boolean(z)});
            return;
        }
        com.taobao.search.common.util.f.a(k().a());
        TLogTracker.a("Default", this.g);
        this.e = z;
        a(this.g);
        l();
        m();
        i();
        p();
    }

    private final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        this.f = com.taobao.android.searchbaseframe.util.g.a(map.get("sessionId"), -1L);
        com.etao.feimagesearch.pipline.a a2 = com.etao.feimagesearch.pipline.d.a(Long.valueOf(this.f));
        String str = "";
        if (a2 == null) {
            this.f = SystemClock.elapsedRealtime();
            if (g.Companion.a().d()) {
                List<ActivateBean> c = new nqh(null).c();
                map.put("queryFromMainSearch", !c.isEmpty() ? c.get(0).keyword : str);
            }
            a2 = com.etao.feimagesearch.pipline.d.a(Long.valueOf(com.etao.feimagesearch.pipline.d.a(this.f, map)));
            if (a2 == null) {
                q.a();
            }
        }
        this.d = a2;
        IrpDatasource b2 = com.etao.feimagesearch.pipline.d.b(Long.valueOf(this.f));
        if (b2 == null) {
            b2 = IrpDatasource.Companion.a(map);
        }
        this.c = b2;
        IrpDatasource irpDatasource = this.c;
        if (irpDatasource == null) {
            q.b("irpDatasource");
        }
        if (!irpDatasource.o()) {
            com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(String.valueOf(k().a().hashCode()));
        }
        IrpDatasource irpDatasource2 = this.c;
        if (irpDatasource2 == null) {
            q.b("irpDatasource");
        }
        String r = irpDatasource2.r();
        IrpDatasource irpDatasource3 = this.c;
        if (irpDatasource3 == null) {
            q.b("irpDatasource");
        }
        String value = irpDatasource3.a().getValue();
        IrpDatasource irpDatasource4 = this.c;
        if (irpDatasource4 == null) {
            q.b("irpDatasource");
        }
        String str2 = irpDatasource4.d().get("autotaksid");
        if (str2 != null) {
            str = str2;
        }
        com.etao.feimagesearch.newresult.perf.a.a(r, value, str, nnh.Companion.a(k().a()));
        if (k().a() instanceof com.etao.feimagesearch.result.b) {
            Activity a3 = k().a();
            if (a3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.result.IrpActivityInterface");
            }
            IrpAvaRecord e = ((com.etao.feimagesearch.result.b) a3).e();
            IrpDatasource irpDatasource5 = this.c;
            if (irpDatasource5 == null) {
                q.b("irpDatasource");
            }
            String r2 = irpDatasource5.r();
            IrpDatasource irpDatasource6 = this.c;
            if (irpDatasource6 == null) {
                q.b("irpDatasource");
            }
            String value2 = irpDatasource6.a().getValue();
            IrpDatasource irpDatasource7 = this.c;
            if (irpDatasource7 == null) {
                q.b("irpDatasource");
            }
            e.a(r2, value2, String.valueOf(irpDatasource7.u()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = map.get("entryUtparam");
        if (!StringUtils.isEmpty(str3)) {
            linkedHashMap.put("entryUtparam", str3);
        }
        String str4 = map.get(pqq.KEY_ENTRY_SCM);
        if (!StringUtils.isEmpty(str4)) {
            linkedHashMap.put(pqq.KEY_ENTRY_SCM, str4);
        }
        String str5 = map.get("entrySpm");
        if (!StringUtils.isEmpty(str5)) {
            linkedHashMap.put("entrySpm", str5);
        }
        if (!(!linkedHashMap.isEmpty())) {
            return;
        }
        String jSONString = JSON.toJSONString(linkedHashMap);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageUtparam(k().a(), jSONString);
        UTAnalytics uTAnalytics2 = UTAnalytics.getInstance();
        q.a((Object) uTAnalytics2, "UTAnalytics.getInstance()");
        uTAnalytics2.getDefaultTracker().updatePageProperties(k().a(), linkedHashMap);
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        IrpDatasource irpDatasource = this.c;
        if (irpDatasource == null) {
            q.b("irpDatasource");
        }
        String str = irpDatasource.d().get("spm-cnt");
        if (str == null) {
            str = "";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (StringUtils.isEmpty(str)) {
            str = "a2141.7690630";
        }
        linkedHashMap.put("spm-cnt", str);
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        uTAnalytics.getDefaultTracker().updatePageProperties(k().a(), linkedHashMap);
        cog k = k();
        IrpDatasource irpDatasource2 = this.c;
        if (irpDatasource2 == null) {
            q.b("irpDatasource");
        }
        this.b = new cqm(k, irpDatasource2);
        if (com.etao.feimagesearch.config.b.bj()) {
            o();
        }
        IrpDatasource irpDatasource3 = this.c;
        if (irpDatasource3 == null) {
            q.b("irpDatasource");
        }
        String r = irpDatasource3.r();
        IrpDatasource irpDatasource4 = this.c;
        if (irpDatasource4 == null) {
            q.b("irpDatasource");
        }
        String value = irpDatasource4.a().getValue();
        if (!StringUtils.isEmpty(r)) {
            return;
        }
        String str2 = "unknown";
        if (!q.a((Object) str2, (Object) value)) {
            return;
        }
        IrpAvaRecord irpAvaRecord = new IrpAvaRecord();
        Intent b2 = k().b();
        q.a((Object) b2, "activityAdapter.intent");
        String dataString = b2.getDataString();
        if (dataString != null) {
            str2 = dataString;
        }
        q.a((Object) str2, "activityAdapter.intent.dataString ?: \"unknown\"");
        irpAvaRecord.b(IrpAvaRecord.AvaType.AVA_TYPE_ILLEGAL_SOURCE, str2, "");
    }

    /* loaded from: classes3.dex */
    public static final class b implements igi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.igi
        public ViewGroup b(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("6c2325ac", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            return null;
        }

        public b() {
        }

        @Override // tb.igi
        public ViewGroup a(View widgetView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f6a8ff6b", new Object[]{this, widgetView});
            }
            q.c(widgetView, "widgetView");
            e.this.k().a().setContentView(widgetView);
            return null;
        }
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        Activity a2 = k().a();
        q.a((Object) a2, "activityAdapter.activity");
        cqm cqmVar = this.b;
        if (cqmVar == null) {
            q.b("mTracker");
        }
        IrpDatasource irpDatasource = this.c;
        if (irpDatasource == null) {
            q.b("irpDatasource");
        }
        this.f6818a = new h(a2, cqmVar, this, irpDatasource, new b());
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        IrpDatasource irpDatasource = this.c;
        if (irpDatasource == null) {
            q.b("irpDatasource");
        }
        hashMap.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, irpDatasource.a().getValue());
        IrpDatasource irpDatasource2 = this.c;
        if (irpDatasource2 == null) {
            q.b("irpDatasource");
        }
        hashMap.put("pssource", irpDatasource2.r());
        String[] noPicValidKeys = com.etao.feimagesearch.config.b.bf();
        q.a((Object) noPicValidKeys, "noPicValidKeys");
        if (true ^ (noPicValidKeys.length == 0)) {
            for (String str : noPicValidKeys) {
                if (!StringUtils.isEmpty(str)) {
                    IrpDatasource irpDatasource3 = this.c;
                    if (irpDatasource3 == null) {
                        q.b("irpDatasource");
                    }
                    String str2 = irpDatasource3.d().get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!StringUtils.isEmpty(str2)) {
                        hashMap.put(str, str2);
                    }
                }
            }
        }
        cqm cqmVar = this.b;
        if (cqmVar == null) {
            q.b("mTracker");
        }
        cqmVar.a(hashMap);
    }

    private final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IrpDatasource irpDatasource = this.c;
        if (irpDatasource == null) {
            q.b("irpDatasource");
        }
        String r = irpDatasource.r();
        if (r != null) {
            linkedHashMap.put("pssource", r);
        }
        IrpDatasource irpDatasource2 = this.c;
        if (irpDatasource2 == null) {
            q.b("irpDatasource");
        }
        String value = irpDatasource2.a().getValue();
        q.a((Object) value, "irpDatasource.photoFrom.value");
        linkedHashMap.put(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, value);
        IrpDatasource irpDatasource3 = this.c;
        if (irpDatasource3 == null) {
            q.b("irpDatasource");
        }
        String str = irpDatasource3.d().get(cpe.KEY_EXTRA_VERIFY);
        if (str != null) {
            linkedHashMap.put(cpe.KEY_EXTRA_VERIFY, str);
        }
        UTAnalytics uTAnalytics = UTAnalytics.getInstance();
        q.a((Object) uTAnalytics, "UTAnalytics.getInstance()");
        String prePageSpm = uTAnalytics.getDefaultTracker().getPageSpmUrl(k().a());
        String str2 = prePageSpm;
        if (StringUtils.isEmpty(str2)) {
            linkedHashMap.put("prePage", "unknown");
        } else {
            q.a((Object) prePageSpm, "prePageSpm");
            List b2 = n.b((CharSequence) str2, new String[]{"."}, false, 0, 6, (Object) null);
            if (b2.size() >= 4) {
                linkedHashMap.put("prePage", ((String) b2.get(0)) + '.' + ((String) b2.get(1)) + '.' + ((String) b2.get(2)));
            } else {
                linkedHashMap.put("prePage", prePageSpm);
            }
        }
        coy.b("Page_PhotoSearchResult", "IrpInit", linkedHashMap);
        com.taobao.monitor.procedure.g b3 = s.f18233a.b(k().a());
        IrpDatasource irpDatasource4 = this.c;
        if (irpDatasource4 == null) {
            q.b("irpDatasource");
        }
        b3.a(com.etao.feimagesearch.model.d.KEY_PHOTO_FROM, irpDatasource4.a().getValue());
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        f h = hVar.h();
        com.etao.feimagesearch.pipline.a aVar = this.d;
        if (aVar == null) {
            q.b("irpPipLine");
        }
        h.a(aVar);
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            TLogTracker.a();
        }
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        cqm cqmVar = this.b;
        if (cqmVar == null) {
            q.b("mTracker");
        }
        cqmVar.a();
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        hVar.c();
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        hVar.d();
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TLogTracker.b();
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        hVar.e();
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TLogTracker.c();
        if (this.b == null) {
            q.b("mTracker");
        }
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        hVar.f();
        com.etao.feimagesearch.pipline.a aVar = this.d;
        if (aVar == null) {
            q.b("irpPipLine");
        }
        aVar.c();
        IrpDatasource irpDatasource = this.c;
        if (irpDatasource == null) {
            q.b("irpDatasource");
        }
        if (irpDatasource.z()) {
            crh.Companion.a();
        }
        com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.b(String.valueOf(k().a().hashCode()));
        g.Companion.b();
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        if (!hVar.ee_()) {
            return;
        }
        h hVar2 = this.f6818a;
        if (hVar2 == null) {
            q.b("mIrpWidget");
        }
        hVar2.a(new IrpV2Controller$finish$1(this));
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        return hVar.m().r();
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        IrpDatasource irpDatasource = this.c;
        if (irpDatasource == null) {
            q.b("irpDatasource");
        }
        return com.taobao.android.searchbaseframe.util.g.a(irpDatasource.d().get(com.etao.feimagesearch.quicksearch.b.FOREGROUND_KEY), false);
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public com.etao.feimagesearch.newresult.base.b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.newresult.base.b) ipChange.ipc$dispatch("7ea94fdb", new Object[]{this});
        }
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        return hVar.h();
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue() : k().a(i, keyEvent);
    }

    @Override // com.etao.feimagesearch.newresult.base.a
    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        h hVar = this.f6818a;
        if (hVar == null) {
            q.b("mIrpWidget");
        }
        hVar.a(num);
    }
}
