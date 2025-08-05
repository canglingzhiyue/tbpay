package com.etao.feimagesearch.capture.dynamic;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.capture.dynamic.msg.h;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.capture.scan.j;
import com.etao.feimagesearch.intelli.ClientModelType;
import com.etao.feimagesearch.mnn.autodetect.b;
import com.etao.feimagesearch.mnn.autodetect.d;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.e;
import com.etao.feimagesearch.util.ao;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.cot;
import tb.cou;
import tb.cox;
import tb.coy;
import tb.cpe;
import tb.cpk;
import tb.cpl;
import tb.cqe;
import tb.csu;
import tb.ctf;
import tb.fkj;
import tb.kge;
import tb.rul;

/* loaded from: classes3.dex */
public final class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final C0208a Companion;
    public static final int EVENT_HIDE_ALL_TIPS = 5;
    public static final int EVENT_HINT_MOVE = 1;
    public static final int EVENT_NO_SILENT_STATUS = 4;
    public static final String TAG = "_scancode_SmartDetectFlow";

    /* renamed from: a  reason: collision with root package name */
    private long f6511a;
    private final long b;
    private final csu c;
    private final String d;
    private final String e;
    private final long f;
    private volatile boolean g;
    private float h;
    private SparseArray<String> i;
    private final Handler j;
    private String k;
    private final Activity l;
    private final cpk m;
    private final j n;
    private final CaptureManager o;
    private String p;

    /* loaded from: classes3.dex */
    public static final class b extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, msg});
                return;
            }
            q.c(msg, "msg");
            int i = msg.what;
            if (i == 1) {
                a aVar = a.this;
                a.a(aVar, a.a(aVar), 1000L, TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (i == 4) {
                a aVar2 = a.this;
                a.a(aVar2, a.b(aVar2), 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (i != 5) {
            } else {
                a.a(a.this, "", 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f6513a;
        public final /* synthetic */ IrpParamModel b;

        public c(Context context, IrpParamModel irpParamModel) {
            this.f6513a = context;
            this.b = irpParamModel;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ao.a();
            cou.a(this.f6513a, this.b);
        }
    }

    static {
        kge.a(-917348398);
        kge.a(723994726);
        Companion = new C0208a(null);
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public a(Activity context, cpk paiPresenter, j scancodeBizManager) {
        q.c(context, "context");
        q.c(paiPresenter, "paiPresenter");
        q.c(scancodeBizManager, "scancodeBizManager");
        this.l = context;
        this.m = paiPresenter;
        this.n = scancodeBizManager;
        cpl h = this.m.h();
        q.a((Object) h, "paiPresenter.view");
        this.o = h.j();
        this.f6511a = System.currentTimeMillis();
        this.b = com.etao.feimagesearch.config.b.bn();
        this.c = new csu();
        this.f = com.etao.feimagesearch.config.b.dT();
        this.p = "baseline";
        this.h = com.etao.feimagesearch.config.b.cl();
        this.i = b.C0231b.a();
        this.c.a();
        this.d = C0208a.a(Companion);
        C0208a c0208a = Companion;
        cpl h2 = this.m.h();
        q.a((Object) h2, "paiPresenter.view");
        CaptureManager j = h2.j();
        q.a((Object) j, "paiPresenter.view.manager");
        this.e = c0208a.a(j);
        String dM = com.etao.feimagesearch.config.b.dM();
        q.a((Object) dM, "ConfigModel.getSmartLensBackTipConfig()");
        List b2 = n.b((CharSequence) dM, new String[]{":"}, false, 0, 6, (Object) null);
        if (!b2.isEmpty()) {
            this.p = (String) b2.get(0);
        }
        a(this.e, 0L, TipShowMsg.TipShowType.TEXT_TYPE);
        this.j = new b(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("793d5be2", new Object[]{aVar}) : aVar.d;
    }

    public static final /* synthetic */ void a(a aVar, String str, long j, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418867d8", new Object[]{aVar, str, new Long(j), tipShowType});
        } else {
            aVar.a(str, j, tipShowType);
        }
    }

    public static final /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f79e5fc1", new Object[]{aVar}) : aVar.e;
    }

    public final cpk h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpk) ipChange.ipc$dispatch("44dedcd9", new Object[]{this}) : this.m;
    }

    /* renamed from: com.etao.feimagesearch.capture.dynamic.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0208a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1246899354);
        }

        private C0208a() {
        }

        public /* synthetic */ C0208a(o oVar) {
            this();
        }

        public static final /* synthetic */ String a(C0208a c0208a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bcac859f", new Object[]{c0208a}) : c0208a.a();
        }

        public final String a(CaptureManager captureManager) {
            String a2;
            String a3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8ad94e42", new Object[]{this, captureManager});
            }
            q.c(captureManager, "captureManager");
            JSONObject cI = com.etao.feimagesearch.config.b.cI();
            q.a((Object) cI, "ConfigModel.getCaptureTipsConfig()");
            if (com.etao.feimagesearch.config.b.N()) {
                if (captureManager.j()) {
                    a3 = com.taobao.android.searchbaseframe.util.a.a(cI, "takePhotoTabMergeHintLowDevice", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19038));
                } else {
                    a3 = com.taobao.android.searchbaseframe.util.a.a(cI, "takePhotoHint", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19042));
                }
                q.a((Object) a3, "if (captureManager.isEna…42)\n          )\n        }");
                return a3;
            }
            if (captureManager.j()) {
                a2 = com.taobao.android.searchbaseframe.util.a.a(cI, "detectScanMergeHint", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19034));
            } else {
                a2 = com.taobao.android.searchbaseframe.util.a.a(cI, "autoDetectHint", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19056));
            }
            q.a((Object) a2, "if (captureManager.isEna…56)\n          )\n        }");
            return a2;
        }

        private final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
            }
            JSONObject cI = com.etao.feimagesearch.config.b.cI();
            q.a((Object) cI, "ConfigModel.getCaptureTipsConfig()");
            String a2 = com.taobao.android.searchbaseframe.util.a.a(cI, "deviceMoveHint", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19037));
            q.a((Object) a2, "FastJsonParseUtil.parseS…app_1007_1_19037)\n      )");
            return a2;
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c.b();
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!k()) {
        } else {
            l();
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!k()) {
        } else {
            l();
            this.j.sendEmptyMessage(1);
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.m.c(false);
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.m.c(true);
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void a(PhotoFrom.Values photoFrom, ctf algoInfo, Bitmap bitmap, List<RectF> multiParts, HashMap<String, String> extraInfoMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d016b289", new Object[]{this, photoFrom, algoInfo, bitmap, multiParts, extraInfoMap});
            return;
        }
        q.c(photoFrom, "photoFrom");
        q.c(algoInfo, "algoInfo");
        q.c(bitmap, "bitmap");
        q.c(multiParts, "multiParts");
        q.c(extraInfoMap, "extraInfoMap");
        cot.c(TAG, "onObjectDetect " + this.g);
        HashMap<String, String> hashMap = extraInfoMap;
        cpl h = this.m.h();
        q.a((Object) h, "paiPresenter.view");
        com.etao.feimagesearch.model.b h2 = h.h();
        q.a((Object) h2, "paiPresenter.view.pageModel");
        a(this.l, photoFrom, bitmap, multiParts, algoInfo, hashMap, h2);
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void a(com.etao.feimagesearch.mnn.autodetect.b result, rul<? super Boolean, t> processEnd) {
        Set<Integer> a2;
        Set<Integer> a3;
        Set<Integer> a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add3f5aa", new Object[]{this, result, processEnd});
            return;
        }
        q.c(result, "result");
        q.c(processEnd, "processEnd");
        cpl h = this.m.h();
        q.a((Object) h, "paiPresenter.view");
        d dVar = h.j().Q;
        if (dVar != null) {
            dVar.a(result.q());
        }
        if (result.j() == 3 || result.j() == 6) {
            String str = this.p;
            switch (str.hashCode()) {
                case 110251487:
                    if (str.equals("test1")) {
                        a(result.a(this.i), result.j(), 0L, TipShowMsg.TipShowType.TEXT_TYPE);
                        break;
                    }
                    break;
                case 110251488:
                    if (str.equals("test2")) {
                        cpl h2 = this.m.h();
                        q.a((Object) h2, "paiPresenter.view");
                        CaptureManager j = h2.j();
                        q.a((Object) j, "paiPresenter.view.manager");
                        j.y().a(new h());
                        break;
                    }
                    break;
            }
        } else {
            String a5 = result.a(this.i);
            if (!TextUtils.isEmpty(a5)) {
                a(a5, result.j(), 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            } else {
                a(this.e, 0L, TipShowMsg.TipShowType.TEXT_TYPE);
            }
        }
        String i = result.i();
        if (i != null) {
            switch (i.hashCode()) {
                case 1906701455:
                    if (i.equals(com.etao.feimagesearch.mnn.c.NEW_ALGORITHM_CODE)) {
                        if (com.etao.feimagesearch.config.b.de()) {
                            processEnd.mo2421invoke(true);
                            return;
                        }
                        Activity activity = this.l;
                        PhotoFrom.Values values = PhotoFrom.Values.AUTO_DETECT;
                        Bitmap a6 = result.a();
                        List<RectF> f = result.f();
                        String ch = com.etao.feimagesearch.config.b.ch();
                        q.a((Object) ch, "ConfigModel.getTrustTerminalAlgoConfig()");
                        ctf ctfVar = new ctf("plt_smart_camera", ch);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put(ClientModelType.KEY_CLIENT_MODEL_TYPE, ClientModelType.MNN.getType());
                        String l = result.l();
                        if (l != null) {
                            linkedHashMap.put(com.etao.feimagesearch.mnn.b.EXTRA_INFO_KEY, l);
                        }
                        cpl h3 = this.m.h();
                        q.a((Object) h3, "paiPresenter.view");
                        com.etao.feimagesearch.model.b h4 = h3.h();
                        q.a((Object) h4, "paiPresenter.view.pageModel");
                        a(activity, values, a6, f, ctfVar, linkedHashMap, h4);
                        processEnd.mo2421invoke(true);
                        return;
                    }
                    break;
                case 1906701456:
                    if (i.equals(com.etao.feimagesearch.mnn.c.INVALID_RESULT_CODE)) {
                        d dVar2 = this.o.Q;
                        if (dVar2 != null && (a2 = dVar2.a()) != null) {
                            a2.add(0);
                        }
                        cpl h5 = this.m.h();
                        q.a((Object) h5, "paiPresenter.view");
                        h5.j().d(false);
                        cpl h6 = this.m.h();
                        q.a((Object) h6, "paiPresenter.view");
                        CaptureManager j2 = h6.j();
                        q.a((Object) j2, "paiPresenter.view.manager");
                        cqe S = j2.S();
                        if (S != null) {
                            S.a(result.a(this.h), 1);
                        }
                        processEnd.mo2421invoke(true);
                        coy.a("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "0");
                        return;
                    }
                    break;
                case 1906701457:
                    if (i.equals(com.etao.feimagesearch.mnn.c.OLD_ALGORITHM_CODE)) {
                        d dVar3 = this.o.Q;
                        if (dVar3 != null && (a3 = dVar3.a()) != null) {
                            a3.add(1);
                        }
                        cpl h7 = this.m.h();
                        q.a((Object) h7, "paiPresenter.view");
                        CaptureManager j3 = h7.j();
                        q.a((Object) j3, "paiPresenter.view.manager");
                        Point a7 = result.a(j3.R());
                        if (a7 == null) {
                            return;
                        }
                        cpl h8 = this.m.h();
                        q.a((Object) h8, "paiPresenter.view");
                        CaptureManager j4 = h8.j();
                        q.a((Object) j4, "paiPresenter.view.manager");
                        cqe S2 = j4.S();
                        if (S2 != null) {
                            S2.a(a7);
                        }
                        processEnd.mo2421invoke(true);
                        coy.a("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "1");
                        return;
                    }
                    break;
                case 1906701458:
                    if (i.equals("A00003")) {
                        d dVar4 = this.o.Q;
                        if (dVar4 != null && (a4 = dVar4.a()) != null) {
                            a4.add(4);
                        }
                        j jVar = this.n;
                        Bitmap a8 = result.a();
                        cpl h9 = this.m.h();
                        q.a((Object) h9, "paiPresenter.view");
                        CaptureManager j5 = h9.j();
                        q.a((Object) j5, "paiPresenter.view.manager");
                        jVar.a(a8, j5.R(), this.f, new SmartDetectFlow$onDetectResultCall$2(this, processEnd));
                        coy.a("Page_PhotoSearchTake", "actionTrigger", LogContext.LOCAL_STORAGE_ACTIONID, "4");
                        return;
                    }
                    break;
            }
        }
        processEnd.mo2421invoke(true);
    }

    private final void a(Context context, PhotoFrom.Values values, Bitmap bitmap, List<RectF> list, ctf ctfVar, Map<String, String> map, com.etao.feimagesearch.model.b bVar) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d662efaf", new Object[]{this, context, values, bitmap, list, ctfVar, map, bVar});
        } else if (this.g) {
        } else {
            cpl h = this.m.h();
            q.a((Object) h, "paiPresenter.view");
            if (!h.j().t()) {
                return;
            }
            com.etao.feimagesearch.newresult.perf.a.H();
            this.c.c();
            cox.a("AutoDetect", new String[0]);
            cot.a("AutoDetect", "onObjectDetect", JSON.toJSONString(map));
            cox.a("AutoDetectMultiObject", "count", String.valueOf(list != null ? list.size() : 0));
            map.put(cpe.KEY_EXTRA_VERIFY, values.getValue());
            k.f("自动识别", "触发跳转", new Object[0]);
            IrpParamModel irpParamModel = new IrpParamModel(bVar);
            irpParamModel.addExtraParam(com.etao.feimagesearch.model.d.KEY_FORCE_NEW_IRP, "true");
            PhotoFrom.Values values2 = values;
            irpParamModel.setPhotoFrom(values2);
            irpParamModel.updateSessionId();
            int i3 = -1;
            if (values == PhotoFrom.Values.AUTO_DETECT) {
                if (com.etao.feimagesearch.config.b.av()) {
                    if (a(bitmap, values, this.n)) {
                        i3 = bitmap.hashCode();
                        i2 = 1;
                    }
                    cot.c("_scancode_", "token is " + i3);
                }
                cpl h2 = this.m.h();
                q.a((Object) h2, "paiPresenter.view");
                CaptureManager j = h2.j();
                q.a((Object) j, "paiPresenter.view.manager");
                if (!j.U() || !fkj.a().a(bitmap)) {
                    i = i2;
                } else {
                    i3 = bitmap.hashCode();
                    i = i2 | 16;
                }
            } else {
                i = 0;
            }
            com.etao.feimagesearch.pipline.d.a(bitmap, values2, list, ctfVar, bVar, irpParamModel.getSessionId(), map, this.o.a(bVar), Integer.valueOf(i3), i);
            this.j.post(new c(context, irpParamModel));
            this.c.d();
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        l();
        this.j.sendEmptyMessage(4);
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        cot.c(TAG, "release");
        this.g = true;
    }

    private final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f6511a <= this.b) {
            return false;
        }
        this.f6511a = currentTimeMillis;
        return true;
    }

    private final boolean a(Bitmap bitmap, PhotoFrom.Values values, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3d73c59", new Object[]{this, bitmap, values, jVar})).booleanValue();
        }
        if (this.m.h() == null) {
            return false;
        }
        jVar.a(bitmap, this.m.h().l(), values, 0L, ScanFromEnum.SYS_CAMERA.getScanFrom(), true);
        return true;
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.j.removeMessages(1);
        this.j.removeMessages(4);
    }

    private final void a(String str, long j, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd84f442", new Object[]{this, str, new Long(j), tipShowType});
        } else {
            a(str, -1, j, tipShowType);
        }
    }

    private final void a(String str, int i, long j, TipShowMsg.TipShowType tipShowType) {
        Set<Integer> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85e55a1", new Object[]{this, str, new Integer(i), new Long(j), tipShowType});
        } else if (this.g) {
        } else {
            cpl h = this.m.h();
            q.a((Object) h, "paiPresenter.view");
            CaptureManager j2 = h.j();
            q.a((Object) j2, "paiPresenter.view.manager");
            if (j2.h() || q.a((Object) this.k, (Object) str)) {
                return;
            }
            cpl h2 = this.m.h();
            q.a((Object) h2, "paiPresenter.view");
            CaptureManager j3 = h2.j();
            q.a((Object) j3, "paiPresenter.view.manager");
            if (!j3.y().i()) {
                return;
            }
            this.k = str;
            TipShowMsg tipShowMsg = new TipShowMsg(str, Long.valueOf(j), cpe.a.SCENE_AUTO_DETECT, tipShowType);
            cpl h3 = this.m.h();
            q.a((Object) h3, "paiPresenter.view");
            CaptureManager j4 = h3.j();
            q.a((Object) j4, "paiPresenter.view.manager");
            j4.y().a(tipShowMsg);
            if (i < 0) {
                return;
            }
            d dVar = this.o.Q;
            if (dVar != null && (b2 = dVar.b()) != null) {
                b2.add(Integer.valueOf(i));
            }
            coy.c("Page_PhotoSearchTake", "tipExpose", "tipID", String.valueOf(i));
        }
    }
}
