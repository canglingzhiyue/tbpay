package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.capture.scan.ScanFromEnum;
import com.etao.feimagesearch.capture.scan.j;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.model.d;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.structure.capture.e;
import com.etao.feimagesearch.util.ao;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cpe;

/* loaded from: classes3.dex */
public final class cpj implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int EVENT_HIDE_ALL_TIPS = 5;
    public static final int EVENT_HINT_MOVE = 1;
    public static final int EVENT_NO_SILENT_STATUS = 4;
    public static final int EVENT_TO_IRP = 3;
    public static final String TAG = "_scancode_ImageDetectV2Flow";

    /* renamed from: a  reason: collision with root package name */
    private long f26400a;
    private final long b;
    private final csu c;
    private final String d;
    private final String e;
    private volatile boolean f;
    private final Handler g;
    private String h;
    private final Context i;
    private final cpk j;
    private final j k;

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
                cpj cpjVar = cpj.this;
                cpj.a(cpjVar, cpj.a(cpjVar), 1000L, "center", TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (i == 3) {
                if (!(msg.obj instanceof Runnable)) {
                    return;
                }
                Object obj = msg.obj;
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Runnable");
                }
                ((Runnable) obj).run();
            } else if (i == 4) {
                cpj cpjVar2 = cpj.this;
                cpj.a(cpjVar2, cpj.b(cpjVar2), 0L, "center", TipShowMsg.TipShowType.TEXT_TYPE);
            } else if (i != 5) {
            } else {
                cpj.a(cpj.this, "", 0L, "center", TipShowMsg.TipShowType.TEXT_TYPE);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f26402a;
        public final /* synthetic */ IrpParamModel b;

        public c(Context context, IrpParamModel irpParamModel) {
            this.f26402a = context;
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
            cou.a(this.f26402a, this.b);
        }
    }

    static {
        kge.a(23819264);
        kge.a(723994726);
        Companion = new a(null);
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void a(com.etao.feimagesearch.mnn.autodetect.b result, rul<? super Boolean, t> processEnd) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("add3f5aa", new Object[]{this, result, processEnd});
            return;
        }
        q.c(result, "result");
        q.c(processEnd, "processEnd");
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

    public cpj(Context context, cpk paiPresenter, j scancodeBizManager) {
        q.c(context, "context");
        q.c(paiPresenter, "paiPresenter");
        q.c(scancodeBizManager, "scancodeBizManager");
        this.i = context;
        this.j = paiPresenter;
        this.k = scancodeBizManager;
        this.f26400a = System.currentTimeMillis();
        this.b = com.etao.feimagesearch.config.b.bn();
        this.c = new csu();
        this.c.a();
        this.d = a.a(Companion);
        a aVar = Companion;
        cpl h = this.j.h();
        q.a((Object) h, "paiPresenter.view");
        CaptureManager j = h.j();
        q.a((Object) j, "paiPresenter.view.manager");
        this.e = aVar.a(j);
        this.g = new b(Looper.getMainLooper());
    }

    public static final /* synthetic */ String a(cpj cpjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6f9a21e5", new Object[]{cpjVar}) : cpjVar.d;
    }

    public static final /* synthetic */ void a(cpj cpjVar, String str, long j, String str2, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5d7a76b", new Object[]{cpjVar, str, new Long(j), str2, tipShowType});
        } else {
            cpjVar.a(str, j, str2, tipShowType);
        }
    }

    public static final /* synthetic */ String b(cpj cpjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7046cd84", new Object[]{cpjVar}) : cpjVar.e;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1774559416);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8eefd6e2", new Object[]{aVar}) : aVar.a();
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
            this.g.sendEmptyMessage(1);
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.j.c(false);
        }
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.j.c(true);
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
        cot.c(TAG, "onObjectDetect " + this.f);
        if (this.f) {
            return;
        }
        cpl h = this.j.h();
        q.a((Object) h, "paiPresenter.view");
        if (!h.j().t()) {
            return;
        }
        com.etao.feimagesearch.newresult.perf.a.H();
        this.c.c();
        cox.a("AutoDetect", new String[0]);
        cot.a("AutoDetect", "onObjectDetect", JSON.toJSONString(extraInfoMap));
        cox.a("AutoDetectMultiObject", "count", String.valueOf(multiParts.size()));
        HashMap<String, String> hashMap = extraInfoMap;
        hashMap.put(cpe.KEY_EXTRA_VERIFY, photoFrom.getValue());
        Context context = this.i;
        cpl h2 = this.j.h();
        q.a((Object) h2, "paiPresenter.view");
        com.etao.feimagesearch.model.b h3 = h2.h();
        q.a((Object) h3, "paiPresenter.view.pageModel");
        a(context, photoFrom, bitmap, multiParts, algoInfo, hashMap, h3);
        this.c.d();
    }

    private final void a(Context context, PhotoFrom.Values values, Bitmap bitmap, List<RectF> list, ctf ctfVar, Map<String, String> map, com.etao.feimagesearch.model.b bVar) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d662efaf", new Object[]{this, context, values, bitmap, list, ctfVar, map, bVar});
            return;
        }
        IrpParamModel irpParamModel = new IrpParamModel(bVar);
        irpParamModel.addExtraParam(d.KEY_FORCE_NEW_IRP, "true");
        PhotoFrom.Values values2 = values;
        irpParamModel.setPhotoFrom(values2);
        irpParamModel.updateSessionId();
        int i3 = -1;
        if (values == PhotoFrom.Values.AUTO_DETECT) {
            if (com.etao.feimagesearch.config.b.av()) {
                if (a(bitmap, values, this.k)) {
                    i3 = bitmap.hashCode();
                    i2 = 1;
                }
                cot.c("_scancode_", "token is " + i3);
            }
            cpl h = this.j.h();
            q.a((Object) h, "paiPresenter.view");
            CaptureManager j = h.j();
            q.a((Object) j, "paiPresenter.view.manager");
            if (j.U() && fkj.a().a(bitmap)) {
                i2 |= 16;
                i3 = bitmap.hashCode();
            }
            cpl h2 = this.j.h();
            q.a((Object) h2, "paiPresenter.view");
            CaptureManager j2 = h2.j();
            q.a((Object) j2, "paiPresenter.view.manager");
            if (j2.V()) {
                com.etao.feimagesearch.mnn.featureextract.c.INSTANCE.a(new com.etao.feimagesearch.mnn.featureextract.a(bitmap));
                i3 = bitmap.hashCode();
                i = i2 | 261;
            } else {
                i = i2;
            }
        } else {
            i = 0;
        }
        com.etao.feimagesearch.pipline.d.a(bitmap, values2, list, ctfVar, bVar, irpParamModel.getSessionId(), map, null, Integer.valueOf(i3), i);
        new Handler(Looper.getMainLooper()).post(new c(context, irpParamModel));
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        l();
        this.g.sendEmptyMessage(4);
    }

    @Override // com.etao.feimagesearch.structure.capture.e
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        cot.c(TAG, "release");
        this.f = true;
    }

    private final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f26400a <= this.b) {
            return false;
        }
        this.f26400a = currentTimeMillis;
        return true;
    }

    private final boolean a(Bitmap bitmap, PhotoFrom.Values values, j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3d73c59", new Object[]{this, bitmap, values, jVar})).booleanValue();
        }
        if (this.j.h() == null) {
            return false;
        }
        jVar.a(bitmap, this.j.h().l(), values, 0L, ScanFromEnum.SYS_CAMERA.getScanFrom(), true);
        return true;
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.g.removeMessages(1);
        this.g.removeMessages(3);
        this.g.removeMessages(4);
    }

    private final void a(String str, long j, String str2, TipShowMsg.TipShowType tipShowType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33efeeb8", new Object[]{this, str, new Long(j), str2, tipShowType});
        } else if (this.f) {
        } else {
            cpl h = this.j.h();
            q.a((Object) h, "paiPresenter.view");
            CaptureManager j2 = h.j();
            q.a((Object) j2, "paiPresenter.view.manager");
            if (j2.h() || q.a((Object) this.h, (Object) str)) {
                return;
            }
            cpl h2 = this.j.h();
            q.a((Object) h2, "paiPresenter.view");
            CaptureManager j3 = h2.j();
            q.a((Object) j3, "paiPresenter.view.manager");
            if (!j3.y().i()) {
                return;
            }
            this.h = str;
            TipShowMsg tipShowMsg = new TipShowMsg(str, Long.valueOf(j), cpe.a.SCENE_AUTO_DETECT, tipShowType);
            cpl h3 = this.j.h();
            q.a((Object) h3, "paiPresenter.view");
            CaptureManager j4 = h3.j();
            q.a((Object) j4, "paiPresenter.view.manager");
            j4.y().a(tipShowMsg);
        }
    }
}
