package com.etao.feimagesearch.mnn;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.utils.MnnUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.com;
import tb.cot;
import tb.cox;
import tb.coy;
import tb.cuk;
import tb.kge;

/* loaded from: classes3.dex */
public class BaseMnnRunUnit<INPUT, OUTPUT> implements com.etao.feimagesearch.mnn.e<INPUT, OUTPUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    public static final String KEY_BUCKET_ID = "bucketId";
    public static final String KEY_ERROR_CODE = "errorCode";
    public static final String KEY_ERROR_MSG = "errorMsg";
    public static final String KEY_EXTRA_INFO = "extraInfo";
    public static final String KEY_TASK_CID = "taskCid";
    public static final String KEY_TASK_NAME = "taskName";
    public static final String MONITOR_POINT_PREPARE_FAIL = "prepareFailed";
    public static final String MONITOR_POINT_PREPARE_SUCCESS = "prepareSuccess";
    public static final String VALUE_FAIL = "fail";
    public static final String VALUE_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    private String f6733a;
    private volatile MNNCVExecutor b;
    private String c;
    private String d;
    private String e;
    private String f;
    private volatile boolean g;
    private boolean h;
    private final HashSet<String> i;
    private BaseUnitStatus j;
    private final CopyOnWriteArrayList<WeakReference<com.etao.feimagesearch.mnn.k>> k;
    private final Handler l;
    private boolean m;
    private final String o;
    private volatile boolean p;

    /* loaded from: classes3.dex */
    public enum BaseUnitStatus {
        EMPTY(0),
        ExecutorCreated(1),
        Preparing(2),
        PrepareSuccess(3),
        Destroying(4);
        
        private final int status;

        BaseUnitStatus(int i) {
            this.status = i;
        }

        public final int getStatus() {
            return this.status;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ com.etao.feimagesearch.mnn.k b;
        public final /* synthetic */ String c;

        public a(com.etao.feimagesearch.mnn.k kVar, String str) {
            this.b = kVar;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseMnnRunUnit.a(BaseMnnRunUnit.this, this.b, this.c);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (!StringUtils.isEmpty(BaseMnnRunUnit.e(BaseMnnRunUnit.this))) {
                BaseMnnRunUnit baseMnnRunUnit = BaseMnnRunUnit.this;
                if (!BaseMnnRunUnit.b(baseMnnRunUnit, BaseMnnRunUnit.e(baseMnnRunUnit))) {
                    String a2 = MnnUtils.a(BaseMnnRunUnit.a(BaseMnnRunUnit.this), BaseMnnRunUnit.e(BaseMnnRunUnit.this));
                    q.a((Object) a2, "MnnUtils.getModelCacheDi…(taskName, latestTaskCid)");
                    linkedHashSet.add(a2);
                }
            }
            if (!StringUtils.isEmpty(BaseMnnRunUnit.f(BaseMnnRunUnit.this))) {
                BaseMnnRunUnit baseMnnRunUnit2 = BaseMnnRunUnit.this;
                if (!BaseMnnRunUnit.b(baseMnnRunUnit2, BaseMnnRunUnit.e(baseMnnRunUnit2))) {
                    String a3 = MnnUtils.a(BaseMnnRunUnit.a(BaseMnnRunUnit.this), BaseMnnRunUnit.f(BaseMnnRunUnit.this));
                    q.a((Object) a3, "MnnUtils.getModelCacheDi…(taskName, cachedTaskCid)");
                    linkedHashSet.add(a3);
                }
            }
            String c = BaseMnnRunUnit.c(BaseMnnRunUnit.this);
            cot.a("AutoDetect", c, "clearCacheFiles: cachedTaskCid=" + BaseMnnRunUnit.f(BaseMnnRunUnit.this) + ", latestTaskCid=" + BaseMnnRunUnit.e(BaseMnnRunUnit.this));
            if (linkedHashSet.size() <= 0) {
                return;
            }
            com.taobao.android.mnncv.d.a().a(BaseMnnRunUnit.a(BaseMnnRunUnit.this), linkedHashSet);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public d(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseMnnRunUnit.a(BaseMnnRunUnit.this, this.b);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements MNNCVExecutor.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ long b;
        public final /* synthetic */ com.etao.feimagesearch.mnn.k c;

        public e(long j, com.etao.feimagesearch.mnn.k kVar) {
            this.b = j;
            this.c = kVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.a
        public final void onResult(final MRTRuntimeException mRTRuntimeException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis() - this.b;
            BaseMnnRunUnit.a(BaseMnnRunUnit.this, new Runnable() { // from class: com.etao.feimagesearch.mnn.BaseMnnRunUnit.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BaseMnnRunUnit.a(BaseMnnRunUnit.this, mRTRuntimeException, e.this.c, currentTimeMillis);
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements com.taobao.android.mnncv.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MNNCVExecutor f6739a;
        public final /* synthetic */ BaseMnnRunUnit b;

        public f(MNNCVExecutor mNNCVExecutor, BaseMnnRunUnit baseMnnRunUnit) {
            this.f6739a = mNNCVExecutor;
            this.b = baseMnnRunUnit;
        }

        @Override // com.taobao.android.mnncv.c
        public final void onCompletion(String str, MRTRuntimeException mRTRuntimeException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2de5f2e6", new Object[]{this, str, mRTRuntimeException});
                return;
            }
            if (str != null) {
                String c = BaseMnnRunUnit.c(this.b);
                cot.a("AutoDetect", c, "preload success, " + str);
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "MnnPreload", 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.a(this.b), BaseMnnRunUnit.KEY_TASK_CID, this.b.b(), "result", "success");
            }
            if (mRTRuntimeException != null) {
                String c2 = BaseMnnRunUnit.c(this.b);
                cot.a("AutoDetect", c2, "preload failed " + BaseMnnRunUnit.a(this.b) + ", errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + mRTRuntimeException.getMessage());
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "MnnPreload", 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.a(this.b), BaseMnnRunUnit.KEY_TASK_CID, this.b.b(), "result", "fail", "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage());
            }
            this.f6739a.a();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public static final class a implements MNNCVExecutor.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.taobao.android.mnncv.MNNCVExecutor.c
            public final void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                String c = BaseMnnRunUnit.c(BaseMnnRunUnit.this);
                cot.a("AutoDetect", c, "Save Error : " + str);
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "saveModelError", 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.a(BaseMnnRunUnit.this), BaseMnnRunUnit.KEY_TASK_CID, BaseMnnRunUnit.e(BaseMnnRunUnit.this));
                com.taobao.android.mnncv.d.a().a(BaseMnnRunUnit.a(BaseMnnRunUnit.this), new HashSet(3));
            }
        }

        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String c = BaseMnnRunUnit.c(BaseMnnRunUnit.this);
                cot.a("AutoDetect", c, "justSaveLocalAlgoModel: latestTaskCid: " + BaseMnnRunUnit.e(BaseMnnRunUnit.this));
                boolean a2 = com.taobao.android.mnncv.d.a().a(BaseMnnRunUnit.a(BaseMnnRunUnit.this), new a());
                MRTTaskDescription b = com.taobao.android.mnncv.d.a().b(BaseMnnRunUnit.a(BaseMnnRunUnit.this));
                String c2 = BaseMnnRunUnit.c(BaseMnnRunUnit.this);
                cot.a("AutoDetect", c2, "justSaveLocalAlgoModel " + BaseMnnRunUnit.a(BaseMnnRunUnit.this) + ", result: " + a2 + ", tmpDescription=" + b.name);
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseMnnRunUnit.b(BaseMnnRunUnit.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ MNNCVExecutor.b c;

        public i(boolean z, MNNCVExecutor.b bVar) {
            this.b = z;
            this.c = bVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public final void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (this.b) {
                if (mRTRuntimeException != null) {
                    coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, Companion.AlgoAction.RESET_ACTION.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.a(BaseMnnRunUnit.this), BaseMnnRunUnit.KEY_TASK_CID, BaseMnnRunUnit.this.b(), "result", "fail", "extraInfo", "", "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage());
                }
                if (map != null) {
                    coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, Companion.AlgoAction.RESET_ACTION.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.a(BaseMnnRunUnit.this), BaseMnnRunUnit.KEY_TASK_CID, BaseMnnRunUnit.this.b(), "result", "success", "extraInfo", com.etao.feimagesearch.mnn.utils.a.a(map));
                }
            }
            this.c.onResult(mRTRuntimeException, map);
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements MNNCVExecutor.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MNNCVExecutor f6744a;
        public final /* synthetic */ BaseMnnRunUnit b;

        public j(MNNCVExecutor mNNCVExecutor, BaseMnnRunUnit baseMnnRunUnit) {
            this.f6744a = mNNCVExecutor;
            this.b = baseMnnRunUnit;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.a
        public final void onResult(MRTRuntimeException mRTRuntimeException) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b72e6cf", new Object[]{this, mRTRuntimeException});
                return;
            }
            if (mRTRuntimeException == null) {
                BaseMnnRunUnit.a(this.b, true);
            }
            this.f6744a.a();
        }
    }

    /* loaded from: classes3.dex */
    public static final class k implements MNNCVExecutor.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Companion.AlgoAction b;
        public final /* synthetic */ MNNCVExecutor.b c;

        public k(Companion.AlgoAction algoAction, MNNCVExecutor.b bVar) {
            this.b = algoAction;
            this.c = bVar;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.b
        public final void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (mRTRuntimeException != null) {
                String a2 = BaseMnnRunUnit.a(BaseMnnRunUnit.this);
                cot.a("AutoDetect", a2, "sendAction exception = " + mRTRuntimeException);
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, this.b.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.a(BaseMnnRunUnit.this), BaseMnnRunUnit.KEY_TASK_CID, BaseMnnRunUnit.this.b(), "result", "fail", "extraInfo", "", "errorCode", String.valueOf(mRTRuntimeException.errorCode), "errorMsg", mRTRuntimeException.getMessage(), "curTab", String.valueOf(com.etao.feimagesearch.nn.f.Companion.a().a()));
            }
            if (map != null) {
                String extraInfo = com.etao.feimagesearch.mnn.utils.a.a(map);
                if (q.a((Object) "plt_autodetect", (Object) BaseMnnRunUnit.a(BaseMnnRunUnit.this))) {
                    com.etao.feimagesearch.mnn.b a3 = com.etao.feimagesearch.mnn.b.Companion.a();
                    q.a((Object) extraInfo, "extraInfo");
                    a3.a(extraInfo);
                }
                String a4 = BaseMnnRunUnit.a(BaseMnnRunUnit.this);
                cot.a("AutoDetect", a4, "sendAction extraInfo = " + extraInfo);
                coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, this.b.getUtEventName(), 19999, BaseMnnRunUnit.KEY_TASK_NAME, BaseMnnRunUnit.a(BaseMnnRunUnit.this), BaseMnnRunUnit.KEY_TASK_CID, BaseMnnRunUnit.this.b(), "result", "success", "extraInfo", extraInfo, "curTab", String.valueOf(com.etao.feimagesearch.nn.f.Companion.a().a()));
            }
            MNNCVExecutor.b bVar = this.c;
            if (bVar == null) {
                return;
            }
            bVar.onResult(mRTRuntimeException, map);
        }
    }

    static {
        kge.a(-1141700572);
        kge.a(750658170);
        Companion = new Companion(null);
    }

    @Override // com.etao.feimagesearch.mnn.e
    public void a(INPUT input, Object obj, com.etao.feimagesearch.mnn.d<OUTPUT> callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6cb33c", new Object[]{this, input, obj, callback});
        } else {
            q.c(callback, "callback");
        }
    }

    public void a(HashMap<String, Object> args) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, args});
        } else {
            q.c(args, "args");
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* loaded from: classes3.dex */
        public enum AlgoAction {
            INIT_ACTION("init", "algoInitialize"),
            RESET_ACTION(DMComponent.RESET, "algoReset"),
            DESTROY_ACTION("destroy", "algoDestroy");
            
            private final String action;
            private final String utEventName;

            AlgoAction(String str, String str2) {
                this.action = str;
                this.utEventName = str2;
            }

            public final String getAction() {
                return this.action;
            }

            public final String getUtEventName() {
                return this.utEventName;
            }
        }

        static {
            kge.a(998381164);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public BaseMnnRunUnit(String taskName) {
        q.c(taskName, "taskName");
        this.o = taskName;
        this.f6733a = "BaseMnnRunUnit_";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.i = new HashSet<>();
        this.j = BaseUnitStatus.EMPTY;
        this.k = new CopyOnWriteArrayList<>();
        this.l = new Handler(Looper.getMainLooper());
        String str = this.f6733a;
        this.f6733a = str + this.o;
        cot.a("AutoDetect", this.f6733a, "Starting");
        cox.a(this.o, MONITOR_POINT_PREPARE_SUCCESS, p.a(HiAnalyticsConstant.BI_KEY_COST_TIME), p.b(KEY_TASK_CID, "bucketId"));
        cox.a(this.o, MONITOR_POINT_PREPARE_FAIL, p.a(HiAnalyticsConstant.BI_KEY_COST_TIME), p.b(KEY_TASK_CID, "errorCode", "errorMsg", "bucketId"));
    }

    public static final /* synthetic */ String a(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b26480cb", new Object[]{baseMnnRunUnit}) : baseMnnRunUnit.o;
    }

    public static final /* synthetic */ void a(BaseMnnRunUnit baseMnnRunUnit, com.etao.feimagesearch.mnn.k kVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7915b4", new Object[]{baseMnnRunUnit, kVar, str});
        } else {
            baseMnnRunUnit.b(kVar, str);
        }
    }

    public static final /* synthetic */ void a(BaseMnnRunUnit baseMnnRunUnit, MRTRuntimeException mRTRuntimeException, com.etao.feimagesearch.mnn.k kVar, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f257a112", new Object[]{baseMnnRunUnit, mRTRuntimeException, kVar, new Long(j2)});
        } else {
            baseMnnRunUnit.a(mRTRuntimeException, kVar, j2);
        }
    }

    public static final /* synthetic */ void a(BaseMnnRunUnit baseMnnRunUnit, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bc6a73", new Object[]{baseMnnRunUnit, runnable});
        } else {
            baseMnnRunUnit.a(runnable);
        }
    }

    public static final /* synthetic */ void a(BaseMnnRunUnit baseMnnRunUnit, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eec22ff", new Object[]{baseMnnRunUnit, str});
        } else {
            baseMnnRunUnit.f(str);
        }
    }

    public static final /* synthetic */ void a(BaseMnnRunUnit baseMnnRunUnit, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d66f4ff", new Object[]{baseMnnRunUnit, new Boolean(z)});
        } else {
            baseMnnRunUnit.m = z;
        }
    }

    public static final /* synthetic */ void b(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fccdee54", new Object[]{baseMnnRunUnit});
        } else {
            baseMnnRunUnit.d();
        }
    }

    public static final /* synthetic */ boolean b(BaseMnnRunUnit baseMnnRunUnit, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a91bab22", new Object[]{baseMnnRunUnit, str})).booleanValue() : baseMnnRunUnit.e(str);
    }

    public static final /* synthetic */ String c(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4de370cd", new Object[]{baseMnnRunUnit}) : baseMnnRunUnit.f6733a;
    }

    public static final /* synthetic */ String e(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e96260cf", new Object[]{baseMnnRunUnit}) : baseMnnRunUnit.e;
    }

    public static final /* synthetic */ String f(BaseMnnRunUnit baseMnnRunUnit) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3721d8d0", new Object[]{baseMnnRunUnit}) : baseMnnRunUnit.f;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.c = str;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        q.c(str, "<set-?>");
        this.d = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.taobao.android.mnncv.MNNCVExecutor a() {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.mnn.BaseMnnRunUnit.a():com.taobao.android.mnncv.MNNCVExecutor");
    }

    private final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (!com.a() || !q.a((Object) "plt_autodetect", (Object) this.o)) {
        } else {
            cuk.a(com.b(), str, 0);
        }
    }

    private final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        String ct = com.etao.feimagesearch.config.b.ct();
        if (ct == null) {
            ct = "";
        }
        return q.a((Object) "plt_autodetect", (Object) this.o) && n.b((CharSequence) ct, (CharSequence) str, false, 2, (Object) null);
    }

    private final void a(Companion.AlgoAction algoAction, MNNCVExecutor.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc16fbb6", new Object[]{this, algoAction, bVar});
            return;
        }
        String str = this.f6733a;
        cot.a("AutoDetect", str, "sendAction " + algoAction);
        Vector vector = new Vector(2);
        vector.add(algoAction.getAction());
        HashMap<String, Object> hashMap = new HashMap<>(5);
        HashMap<String, Object> hashMap2 = hashMap;
        hashMap2.put(com.etao.feimagesearch.mnn.utils.a.f, vector);
        if (com.etao.feimagesearch.config.b.cJ() && !StringUtils.isEmpty(this.c) && q.a((Object) this.o, (Object) "plt_autodetect")) {
            hashMap2.put(com.etao.feimagesearch.mnn.utils.a.g, com.etao.feimagesearch.mnn.j.Companion.a().b(this.o, this.c));
        }
        a(hashMap);
        MNNCVExecutor mNNCVExecutor = this.b;
        if (mNNCVExecutor == null) {
            return;
        }
        mNNCVExecutor.a(hashMap2, new k(algoAction, bVar));
    }

    public final void a(HashMap<String, Object> args, boolean z, MNNCVExecutor.b callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877b9c29", new Object[]{this, args, new Boolean(z), callback});
            return;
        }
        q.c(args, "args");
        q.c(callback, "callback");
        if (!this.h) {
            this.h = true;
            coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "algoBeginSendData", 19999, KEY_TASK_NAME, this.o, KEY_TASK_CID, this.c);
        }
        a(args);
        if (z) {
            cot.a("AutoDetect", this.f6733a, "processByMnnExecutor with reset");
            if (args.containsKey(com.etao.feimagesearch.mnn.utils.a.f) && (args.get(com.etao.feimagesearch.mnn.utils.a.f) instanceof Vector)) {
                try {
                    Object obj = args.get(com.etao.feimagesearch.mnn.utils.a.f);
                    if (obj == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.util.Vector<kotlin.String>");
                    }
                    ((Vector) obj).add(Companion.AlgoAction.RESET_ACTION.getAction());
                } catch (ClassCastException unused) {
                    Vector vector = new Vector(2);
                    vector.add(Companion.AlgoAction.RESET_ACTION.getAction());
                    args.put(com.etao.feimagesearch.mnn.utils.a.f, vector);
                }
            } else {
                Vector vector2 = new Vector(2);
                vector2.add(Companion.AlgoAction.RESET_ACTION.getAction());
                args.put(com.etao.feimagesearch.mnn.utils.a.f, vector2);
            }
        }
        try {
            if (!this.g) {
                callback.onResult(new MRTRuntimeException(-10003, "not prepared"), null);
                return;
            }
            MNNCVExecutor mNNCVExecutor = this.b;
            if (mNNCVExecutor != null) {
                mNNCVExecutor.a(args, new i(z, callback));
            } else {
                callback.onResult(new MRTRuntimeException(-10001, "executor is null"), null);
            }
        } catch (Exception unused2) {
            callback.onResult(new MRTRuntimeException(-10002, "send data failed"), null);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (e()) {
            d();
        } else {
            this.l.post(new h());
        }
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            cot.a("AutoDetect", this.f6733a, "preload ");
            MNNCVExecutor mNNCVExecutor = new MNNCVExecutor(this.o);
            mNNCVExecutor.a(new f(mNNCVExecutor, this));
        } catch (Exception unused) {
        }
    }

    private final boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : q.a(Looper.getMainLooper(), Looper.myLooper());
    }

    @Override // com.etao.feimagesearch.mnn.e
    public void a(com.etao.feimagesearch.mnn.k callback, String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322563a7", new Object[]{this, callback, activityHashCode});
            return;
        }
        q.c(callback, "callback");
        q.c(activityHashCode, "activityHashCode");
        this.p = com.etao.feimagesearch.config.b.t();
        a(new a(callback, activityHashCode));
    }

    private final void b(com.etao.feimagesearch.mnn.k kVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf601528", new Object[]{this, kVar, str});
            return;
        }
        this.i.add(str);
        String str2 = this.f6733a;
        cot.a("AutoDetect", str2, "build count = " + this.i.size() + " prepareSuccess " + this.g + " status = " + this.j);
        MNNCVExecutor a2 = a();
        if (this.g) {
            cot.a("AutoDetect", this.f6733a, "doBuild onPrepareSuccess");
            kVar.a();
        } else if (this.j == BaseUnitStatus.Preparing) {
            String str3 = this.f6733a;
            cot.a("AutoDetect", str3, "doBuild Preparing " + this.g);
            this.k.add(new WeakReference<>(kVar));
        } else {
            cot.a("AutoDetect", this.f6733a, "doBuild prepareWithCallback");
            this.j = BaseUnitStatus.Preparing;
            a2.a(new e(System.currentTimeMillis(), kVar));
        }
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if ((!q.a((Object) "plt_autodetect", (Object) this.o)) || !com.etao.feimagesearch.config.b.cu()) {
        } else {
            cot.a("AutoDetect", this.f6733a, "saveLocalAlgoModelWithCreateNewExecutor");
            MNNCVExecutor mNNCVExecutor = new MNNCVExecutor(this.o);
            mNNCVExecutor.a(new j(mNNCVExecutor, this));
        }
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if ((!q.a((Object) "plt_autodetect", (Object) this.o)) || !com.etao.feimagesearch.config.b.cu()) {
        } else {
            this.m = false;
            VExecutors.defaultSharedThreadPool().execute(new g());
        }
    }

    private final void a(MRTRuntimeException mRTRuntimeException, com.etao.feimagesearch.mnn.k kVar, long j2) {
        com.etao.feimagesearch.mnn.k kVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55060605", new Object[]{this, mRTRuntimeException, kVar, new Long(j2)});
            return;
        }
        String str = this.f6733a;
        cot.a("AutoDetect", str, "notifyListeners exception=" + mRTRuntimeException);
        if (mRTRuntimeException != null) {
            String str2 = this.f6733a;
            cot.a("AutoDetect", str2, "onBuildResult: " + mRTRuntimeException.errorCode + ' ' + mRTRuntimeException.getMessage());
            this.j = BaseUnitStatus.ExecutorCreated;
            this.g = false;
            String valueOf = String.valueOf(mRTRuntimeException.errorCode);
            String message = mRTRuntimeException.getMessage();
            if (message == null) {
                message = "";
            }
            a(valueOf, message, j2);
            int i2 = mRTRuntimeException.errorCode;
            String message2 = mRTRuntimeException.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            kVar.a(i2, message2);
        } else {
            cot.a("AutoDetect", this.f6733a, "onBuildResult success");
            if (!StringUtils.isEmpty(this.c)) {
                com.etao.feimagesearch.mnn.j.Companion.a().a(this.o, this.c);
            }
            a(j2);
            if (this.b == null) {
                cot.a("AutoDetect", this.f6733a, "mnncvExecutor == null");
                return;
            }
            this.j = BaseUnitStatus.PrepareSuccess;
            this.g = true;
            kVar.a();
            a(Companion.AlgoAction.INIT_ACTION, (MNNCVExecutor.b) null);
        }
        if (this.k.isEmpty()) {
            return;
        }
        Iterator<WeakReference<com.etao.feimagesearch.mnn.k>> it = this.k.iterator();
        q.a((Object) it, "prepareResultListenerList.iterator()");
        cot.a("AutoDetect", this.f6733a, "notify prepareResultListener");
        while (it.hasNext()) {
            WeakReference<com.etao.feimagesearch.mnn.k> next = it.next();
            if (next != null && (kVar2 = next.get()) != null) {
                if (mRTRuntimeException != null) {
                    int i3 = mRTRuntimeException.errorCode;
                    String message3 = mRTRuntimeException.getMessage();
                    if (message3 == null) {
                        message3 = "";
                    }
                    kVar2.a(i3, message3);
                } else {
                    kVar2.a();
                }
            }
        }
        this.k.clear();
    }

    private final void a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Double.valueOf(j2));
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put(KEY_TASK_CID, this.c);
        hashMap2.put("bucketId", this.d);
        cox.a(this.o, MONITOR_POINT_PREPARE_SUCCESS, hashMap, hashMap2);
    }

    private final void a(String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Double.valueOf(j2));
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put(KEY_TASK_CID, this.c);
        hashMap2.put("errorCode", str);
        hashMap2.put("errorMsg", str2);
        hashMap2.put("bucketId", this.d);
        cox.a(this.o, MONITOR_POINT_PREPARE_FAIL, hashMap, hashMap2);
    }

    @Override // com.etao.feimagesearch.mnn.e
    public void a(String activityHashCode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, activityHashCode});
            return;
        }
        q.c(activityHashCode, "activityHashCode");
        String str = this.f6733a;
        cot.c(str, "destroy " + activityHashCode);
        if (this.g) {
            a(Companion.AlgoAction.DESTROY_ACTION, new c());
        }
        a(new d(activityHashCode));
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.g;
    }

    private final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (this.p) {
            com.etao.feimagesearch.mnn.g.a(runnable);
        } else {
            this.l.post(runnable);
        }
    }

    private final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        this.i.remove(str);
        int size = this.i.size();
        String str2 = this.f6733a;
        cot.a("AutoDetect", str2, "doRealDestroy: prepareSuccess = " + this.g + ", counter = " + size + ' ' + str);
        if (size > 0 && com.etao.feimagesearch.config.b.bo()) {
            return;
        }
        this.k.clear();
        this.j = BaseUnitStatus.Destroying;
        MNNCVExecutor mNNCVExecutor = this.b;
        if (mNNCVExecutor != null) {
            mNNCVExecutor.a();
        }
        this.b = null;
        this.j = BaseUnitStatus.EMPTY;
        this.g = false;
        this.h = false;
        if (this.m) {
            g();
        }
        coy.a(com.etao.feimagesearch.structure.capture.a.f6987a, "destroyExecutor", 19999, KEY_TASK_NAME, this.o);
        cot.a("AutoDetect", this.f6733a, "destroyExecutor");
        h();
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (!com.etao.feimagesearch.config.b.cv() || !q.a((Object) "plt_autodetect", (Object) this.o)) {
        } else {
            com.taobao.mrt.thread.a.a().a(new b(), 1000);
        }
    }

    private final boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue();
        }
        if (str == null || StringUtils.isEmpty(str) || !com.etao.feimagesearch.config.b.cs()) {
            return false;
        }
        return q.a((Object) "plt_autodetect", (Object) str) || q.a((Object) "plt_smart_camera", (Object) str);
    }
}
