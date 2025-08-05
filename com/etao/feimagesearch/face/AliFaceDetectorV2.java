package com.etao.feimagesearch.face;

import android.graphics.Bitmap;
import com.alibaba.security.ccrc.enums.InitState;
import com.alibaba.security.ccrc.enums.Mode;
import com.alibaba.security.ccrc.interfaces.OnCcrcCallback;
import com.alibaba.security.ccrc.interfaces.OnDetectRiskListener;
import com.alibaba.security.ccrc.model.InitResult;
import com.alibaba.security.ccrc.model.Label;
import com.alibaba.security.ccrc.service.CcrcContext;
import com.alibaba.security.ccrc.service.CcrcDetectResult;
import com.alibaba.security.ccrc.service.CcrcService;
import com.alibaba.security.wukong.model.BitmapImageSample;
import com.alibaba.security.wukong.model.meta.BitmapImage;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.k;
import com.etao.feimagesearch.nn.f;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.q;
import tb.coi;
import tb.cok;
import tb.com;
import tb.cot;
import tb.coy;
import tb.cpa;
import tb.cuk;
import tb.kge;
import tb.riy;

/* loaded from: classes3.dex */
public final class AliFaceDetectorV2 extends coi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final AliFaceDetectorV2 INSTANCE;
    public static final String KEY_COST_TIME = "costTime";

    /* renamed from: a  reason: collision with root package name */
    private static CcrcService f6665a;
    private static final ConcurrentHashMap<String, a> b;
    private static Status c;
    private static String d;
    private static final long e;
    private static final c f;

    /* loaded from: classes3.dex */
    public enum Status {
        NOT_PREPARED,
        PREPARING,
        PREPARE_SUCCESS
    }

    /* loaded from: classes3.dex */
    public static final class b implements OnDetectRiskListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6667a;

        public b(String str) {
            this.f6667a = str;
        }

        @Override // com.alibaba.security.ccrc.interfaces.OnDetectRiskListener
        public final void onDetectResult(CcrcDetectResult ccrcDetectResult) {
            Object obj;
            CountDownLatch a2;
            CountDownLatch a3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ef0f7da", new Object[]{this, ccrcDetectResult});
            } else if (ccrcDetectResult == null) {
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                cot.a(cok.SCENE, "AliFaceDetectorV2", "onDetectResult: pid=" + this.f6667a + ", sampleId = " + ccrcDetectResult.sampleID);
                String str = ccrcDetectResult.sampleID;
                if (str == null) {
                    return;
                }
                a aVar = (a) AliFaceDetectorV2.b(AliFaceDetectorV2.INSTANCE).get(str);
                if (aVar != null) {
                    obj = Long.valueOf(Math.abs(currentTimeMillis - aVar.c()));
                } else {
                    AliFaceDetectorV2 aliFaceDetectorV2 = AliFaceDetectorV2.INSTANCE;
                    cot.a(cok.SCENE, "AliFaceDetectorV2", "record not exit, pid=" + this.f6667a + ", sampleId = " + ccrcDetectResult.sampleID);
                    obj = -1;
                }
                if (!ccrcDetectResult.success) {
                    cot.a(cok.SCENE, "AliFaceDetectorV2", "detect not success, pid=" + this.f6667a + ", sampleId = " + ccrcDetectResult.sampleID + ", costTime=" + obj);
                    if (aVar == null || (a2 = aVar.a()) == null) {
                        return;
                    }
                    a2.countDown();
                    return;
                }
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "callDetectFaceSuccessV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, this.f6667a, "sampleID", ccrcDetectResult.sampleID, "costTime", obj.toString());
                if (ccrcDetectResult.labels == null) {
                    cot.a(cok.SCENE, "AliFaceDetectorV2", "labels is null ");
                    if (aVar == null || (a3 = aVar.a()) == null) {
                        return;
                    }
                } else {
                    Iterator<Label> it = ccrcDetectResult.labels.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Label next = it.next();
                        cot.a(cok.SCENE, "AliFaceDetectorV2", "pid=" + this.f6667a + ", sampleId = " + ccrcDetectResult.sampleID + ", labelName=" + next.name + ", labelValue=" + next.value);
                        if (q.a((Object) "hasFace", (Object) next.name)) {
                            if (aVar != null) {
                                aVar.a(1);
                            }
                            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "hasFaceV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, this.f6667a, "sampleID", ccrcDetectResult.sampleID, "costTime", obj.toString());
                            cot.a(cok.SCENE, "AliFaceDetectorV2", "hasFace=true, costTime=" + obj);
                            if (com.a()) {
                                cuk.a().b(com.b(), "人脸!!", 1);
                            }
                        }
                    }
                    if (aVar == null) {
                        return;
                    }
                    if (aVar.b() != 1) {
                        aVar.a(0);
                    }
                    a3 = aVar.a();
                }
                a3.countDown();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public static final class a implements OnCcrcCallback {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6668a;
            public final /* synthetic */ long b;
            public final /* synthetic */ CcrcService c;

            public a(String str, long j, CcrcService ccrcService) {
                this.f6668a = str;
                this.b = j;
                this.c = ccrcService;
            }

            @Override // com.alibaba.security.ccrc.interfaces.OnCcrcCallback
            public final void onInit(InitState initState, InitResult initResult) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fe7d6f63", new Object[]{this, initState, initResult});
                    return;
                }
                cot.a(cok.SCENE, "AliFaceDetectorV2", "onInit: initState=" + initState + ", result=" + initResult);
                if (!(initState == InitState.INIT_SUCCESS || initState == InitState.INITED)) {
                    cot.a("AutoDetect", "AliFaceDetectorV2", "init failed pid=" + this.f6668a);
                    AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, "");
                    AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, Status.NOT_PREPARED);
                    k f = AliFaceDetectorV2.f(AliFaceDetectorV2.INSTANCE);
                    if (f != null) {
                        f.a(-1, "init failed pid=" + this.f6668a);
                    }
                    AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, (k) null);
                    return;
                }
                long abs = Math.abs(System.currentTimeMillis() - this.b);
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "prepareFaceModelSuccessV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, this.f6668a, "costTime", String.valueOf(abs));
                cot.a(cok.SCENE, "AliFaceDetectorV2", "初始化成功 pid=" + this.f6668a + ", costTime=" + abs);
                if (AliFaceDetectorV2.d(AliFaceDetectorV2.INSTANCE) == Status.NOT_PREPARED) {
                    cot.a(cok.SCENE, "AliFaceDetectorV2", "prepareModel: curStatus is Status.NOT_PREPARED, cancelled");
                    return;
                }
                AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, Status.PREPARE_SUCCESS);
                k f2 = AliFaceDetectorV2.f(AliFaceDetectorV2.INSTANCE);
                if (f2 != null) {
                    f2.a();
                }
                AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, (k) null);
                AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, this.c, this.f6668a);
            }
        }

        @Override // com.etao.feimagesearch.nn.f.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cot.a(cok.SCENE, "AliFaceDetectorV2", "prepareModel: onMNNReady");
            if (AliFaceDetectorV2.d(AliFaceDetectorV2.INSTANCE) == Status.NOT_PREPARED && AliFaceDetectorV2.e(AliFaceDetectorV2.INSTANCE)) {
                return;
            }
            AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, CcrcService.getService("ccrc_taobao_pailitao_content_risk_control"));
            CcrcService a2 = AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE);
            if (a2 == null) {
                cot.a(cok.SCENE, "AliFaceDetectorV2", "prepareModel: no mCcrcService");
                return;
            }
            AliFaceDetectorV2 aliFaceDetectorV2 = AliFaceDetectorV2.INSTANCE;
            String uuid = UUID.randomUUID().toString();
            q.a((Object) uuid, "UUID.randomUUID().toString()");
            AliFaceDetectorV2.a(aliFaceDetectorV2, uuid);
            String c = AliFaceDetectorV2.c(AliFaceDetectorV2.INSTANCE);
            CcrcService.Config build = new CcrcService.Config.Builder().setPid(AliFaceDetectorV2.c(AliFaceDetectorV2.INSTANCE)).setExtras(null).setMode(Mode.LOCAL).build();
            cot.a(cok.SCENE, "AliFaceDetectorV2", "try to activate pid=" + c);
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "prepareFaceModelV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, c);
            a2.activate(build, new a(c, System.currentTimeMillis(), a2));
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CcrcService f6669a;

        public d(CcrcService ccrcService) {
            this.f6669a = ccrcService;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f6669a.deActivate();
            AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, (CcrcService) null);
            AliFaceDetectorV2.a(AliFaceDetectorV2.INSTANCE, "");
        }
    }

    public static /* synthetic */ Object ipc$super(AliFaceDetectorV2 aliFaceDetectorV2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474194533) {
            super.a(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -1445565382) {
            super.b(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode != 657958622) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.b((k) objArr[0]);
            return null;
        }
    }

    static {
        kge.a(-832081542);
        INSTANCE = new AliFaceDetectorV2();
        b = new ConcurrentHashMap<>();
        c = Status.NOT_PREPARED;
        d = "";
        e = com.etao.feimagesearch.config.b.bV();
        f = new c();
        cot.a(cok.SCENE, "AliFaceDetectorV2", "create instance");
        String c2 = com.c();
        if (c2 != null) {
            cot.a(cok.SCENE, "AliFaceDetectorV2", "init ccrc context ttid=" + c2);
            CcrcContext.init(com.b(), c2);
        }
    }

    private AliFaceDetectorV2() {
    }

    public static final /* synthetic */ CcrcService a(AliFaceDetectorV2 aliFaceDetectorV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CcrcService) ipChange.ipc$dispatch("234d94b6", new Object[]{aliFaceDetectorV2}) : f6665a;
    }

    public static final /* synthetic */ void a(AliFaceDetectorV2 aliFaceDetectorV2, CcrcService ccrcService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3bfc28", new Object[]{aliFaceDetectorV2, ccrcService});
        } else {
            f6665a = ccrcService;
        }
    }

    public static final /* synthetic */ void a(AliFaceDetectorV2 aliFaceDetectorV2, CcrcService ccrcService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81196bf2", new Object[]{aliFaceDetectorV2, ccrcService, str});
        } else {
            aliFaceDetectorV2.a(ccrcService, str);
        }
    }

    public static final /* synthetic */ void a(AliFaceDetectorV2 aliFaceDetectorV2, Status status) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ffc5d12", new Object[]{aliFaceDetectorV2, status});
        } else {
            c = status;
        }
    }

    public static final /* synthetic */ void a(AliFaceDetectorV2 aliFaceDetectorV2, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ebdb54", new Object[]{aliFaceDetectorV2, kVar});
        } else {
            aliFaceDetectorV2.a(kVar);
        }
    }

    public static final /* synthetic */ void a(AliFaceDetectorV2 aliFaceDetectorV2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8e9ae9", new Object[]{aliFaceDetectorV2, str});
        } else {
            d = str;
        }
    }

    public static final /* synthetic */ ConcurrentHashMap b(AliFaceDetectorV2 aliFaceDetectorV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("fd3140e8", new Object[]{aliFaceDetectorV2}) : b;
    }

    public static final /* synthetic */ String c(AliFaceDetectorV2 aliFaceDetectorV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9a182a3", new Object[]{aliFaceDetectorV2}) : d;
    }

    public static final /* synthetic */ Status d(AliFaceDetectorV2 aliFaceDetectorV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Status) ipChange.ipc$dispatch("c77268d", new Object[]{aliFaceDetectorV2}) : c;
    }

    public static final /* synthetic */ boolean e(AliFaceDetectorV2 aliFaceDetectorV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("509f345f", new Object[]{aliFaceDetectorV2})).booleanValue() : aliFaceDetectorV2.a();
    }

    public static final /* synthetic */ k f(AliFaceDetectorV2 aliFaceDetectorV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("31fa1151", new Object[]{aliFaceDetectorV2}) : aliFaceDetectorV2.c();
    }

    @Override // tb.coi, tb.coo
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        cot.a(cok.SCENE, "AliFaceDetectorV2", "prepareModel: activityHashCode=" + i + ", curStatus=" + c);
        if (!com.etao.feimagesearch.config.b.R()) {
            cot.a(cok.SCENE, "AliFaceDetectorV2", "face detection not enabled");
            return;
        }
        super.a(i);
        if (c != Status.NOT_PREPARED) {
            cot.a(cok.SCENE, "AliFaceDetectorV2", "curStatus=" + c + " return");
            return;
        }
        c = Status.PREPARING;
        f.Companion.a().a("", f);
    }

    private final void a(CcrcService ccrcService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad5c389", new Object[]{this, ccrcService, str});
        } else {
            ccrcService.setRiskCallback(new b(str));
        }
    }

    @Override // tb.coi, tb.coo
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        cot.a(cok.SCENE, "AliFaceDetectorV2", "call releaseModel: activityHashCode=" + i + ", pid=" + d);
        if (!com.etao.feimagesearch.config.b.R()) {
            return;
        }
        super.b(i);
        if (a()) {
            c = Status.NOT_PREPARED;
            b.clear();
            cot.a(cok.SCENE, "AliFaceDetectorV2", "do deActivate, pid=" + d);
            f.Companion.a().a(f);
            CcrcService ccrcService = f6665a;
            if (ccrcService != null) {
                if (com.etao.feimagesearch.config.b.bb()) {
                    VExecutors.defaultSharedThreadPool().submit(new d(ccrcService));
                } else {
                    ccrcService.deActivate();
                    f6665a = null;
                    d = "";
                }
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "releaseFaceModelSuccessV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, d);
            }
            a((k) null);
            return;
        }
        cot.a(cok.SCENE, "AliFaceDetectorV2", "cannot do release, pid=" + d);
    }

    @Override // tb.coi, tb.coo
    public cpa a(Bitmap bitmap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cpa) ipChange.ipc$dispatch("435a89ec", new Object[]{this, bitmap});
        }
        q.c(bitmap, "bitmap");
        cot.a(cok.SCENE, "AliFaceDetectorV2", "call detectFace, pid=" + d);
        String uuid = UUID.randomUUID().toString();
        q.a((Object) uuid, "UUID.randomUUID().toString()");
        if (c != Status.PREPARE_SUCCESS) {
            cot.a("AutoDetect", "AliFaceDetectorV2", "detectFace: curStatus = " + c + ", pid=" + d);
            return new cpa(-1, uuid);
        }
        CcrcService ccrcService = f6665a;
        if (ccrcService != null) {
            try {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                BitmapImage bitmapImage = new BitmapImage(bitmap);
                try {
                    b.put(uuid, new a(countDownLatch, -1, System.currentTimeMillis()));
                    BitmapImageSample bitmapImageSample = new BitmapImageSample(uuid, bitmapImage);
                    str = "AliFaceDetectorV2";
                    try {
                        cot.a(cok.SCENE, str, "do detect, pid=" + d + ", sampleID=" + uuid);
                        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "callDetectFaceV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, d, "sampleID", uuid);
                        bitmapImageSample.detect(ccrcService);
                        boolean await = countDownLatch.await(e, TimeUnit.MILLISECONDS);
                        if (!await) {
                            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "timeoutAliFaceDetectorV2", 19999, MspDBHelper.BizEntry.COLUMN_NAME_PID, d, "sampleID", uuid);
                            if (com.a()) {
                                cuk.a().b(com.b(), "人脸检测超时", 1);
                            }
                        }
                        a remove = b.remove(uuid);
                        cot.a(cok.SCENE, str, "waitResult: " + await + ", result=" + remove + ", pid=" + d + ", sampleID=" + uuid);
                        return new cpa(remove != null ? remove.b() : -1, uuid);
                    } catch (Exception e2) {
                        e = e2;
                        cot.a("AutoDetect", str, cot.a("detectFace: pid=" + d + ", sampleID=" + uuid + ' ', e));
                        b.remove(uuid);
                        return new cpa(-1, uuid);
                    }
                } catch (Exception e3) {
                    e = e3;
                    str = "AliFaceDetectorV2";
                }
            } catch (Exception e4) {
                e = e4;
                str = "AliFaceDetectorV2";
            }
        } else {
            cot.a("AutoDetect", "AliFaceDetectorV2", "detectFace: no mCcrcService, pid=" + d);
            return new cpa(-1, uuid);
        }
    }

    @Override // tb.coi, tb.coo
    public void b(k prepareResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2737a6de", new Object[]{this, prepareResultCallback});
            return;
        }
        q.c(prepareResultCallback, "prepareResultCallback");
        if (c == Status.PREPARE_SUCCESS) {
            prepareResultCallback.a();
        } else {
            super.b(prepareResultCallback);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f6666a;
        private int b;
        private final long c;

        static {
            kge.a(855214503);
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!q.a(this.f6666a, aVar.f6666a) || this.b != aVar.b || this.c != aVar.c) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            CountDownLatch countDownLatch = this.f6666a;
            if (countDownLatch != null) {
                i = countDownLatch.hashCode();
            }
            long j = this.c;
            return (((i * 31) + this.b) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "FaceDetectResult(countDownLatch=" + this.f6666a + ", detectNum=" + this.b + ", beginTime=" + this.c + riy.BRACKET_END_STR;
        }

        public a(CountDownLatch countDownLatch, int i, long j) {
            q.c(countDownLatch, "countDownLatch");
            this.f6666a = countDownLatch;
            this.b = i;
            this.c = j;
        }

        public final CountDownLatch a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (CountDownLatch) ipChange.ipc$dispatch("6c892b4e", new Object[]{this}) : this.f6666a;
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
        }

        public final long c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.c;
        }
    }
}
