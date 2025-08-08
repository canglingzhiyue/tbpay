package com.alipay.android.msp.core.context;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspWindowLoadListener;
import com.alipay.android.app.birdnest.api.MspWindowLoadPoint;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.container.MspContainerClient;
import com.alipay.android.msp.container.MspContainerResult;
import com.alipay.android.msp.core.MspNetHandler;
import com.alipay.android.msp.core.callback.MspContextFinishCallback;
import com.alipay.android.msp.core.clients.MspLogicClient;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.component.JsExceptionReceiver;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.storecenter.ActionStoreCenter;
import com.alipay.android.msp.drivers.stores.storecenter.StoreCenter;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.encrypt.EncryptUtil;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.offline.OfflineRenderLogic;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class MspContainerContext extends MspContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIRD_NEST_CREATE_ERROR = 1;
    public static final int BIRD_NEST_DOCUMENT_NULL = 3;
    public static final int BIRD_NEST_GENERATE_ERROR = 2;
    public static final int FORCE_IN_ANIM_BOTTOM = 2;
    public static final int FORCE_IN_ANIM_FADE = 1;
    public static final int FORCE_IN_ANIM_NOT_SPECIFIED = 0;
    public static final int FORCE_IN_ANIM_RIGHT = 3;
    public static final int PAGE_DATA_EMPTY = 0;
    private static Set<MspContainerContext> q = Collections.synchronizedSet(new HashSet());
    private String A;
    private boolean B;
    private MspContainerClient C;
    private boolean D;
    private String E;
    private boolean F;
    private boolean G;
    private MspExtSceneManager H;
    private final MspContextFinishCallback I;
    private boolean J;
    private int K;
    private String n;
    private String o;
    private String r;
    private JSONObject s;
    private MspWindowClient t;
    private MspLogicClient u;
    private String v;
    private org.json.JSONObject w;
    private org.json.JSONObject x;
    private String y;
    private final String z;

    public static /* synthetic */ Object ipc$super(MspContainerContext mspContainerContext, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1275533431) {
            super.onCompensating(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -980350570) {
            super.exit(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode != 34512165) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onRendFrameSuccess();
            return null;
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void reportExtPaySuccessOnlyOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe504dc", new Object[]{this});
        }
    }

    public static /* synthetic */ MspExtSceneManager a(MspContainerContext mspContainerContext, MspExtSceneManager mspExtSceneManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("eba13c97", new Object[]{mspContainerContext, mspExtSceneManager});
        }
        mspContainerContext.H = mspExtSceneManager;
        return mspExtSceneManager;
    }

    public static /* synthetic */ void a(MspContainerContext mspContainerContext, MspContainerPresenter mspContainerPresenter, MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292eba3", new Object[]{mspContainerContext, mspContainerPresenter, mspWindowLoadListener});
        } else {
            mspContainerContext.a(mspContainerPresenter, mspWindowLoadListener);
        }
    }

    public static /* synthetic */ boolean a(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b736e499", new Object[]{mspContainerContext})).booleanValue() : mspContainerContext.F;
    }

    public static /* synthetic */ boolean a(MspContainerContext mspContainerContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fa660e3", new Object[]{mspContainerContext, new Boolean(z)})).booleanValue();
        }
        mspContainerContext.D = z;
        return z;
    }

    public static /* synthetic */ JSONObject b(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("89362f54", new Object[]{mspContainerContext}) : mspContainerContext.s;
    }

    public static /* synthetic */ boolean b(MspContainerContext mspContainerContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2335e524", new Object[]{mspContainerContext, new Boolean(z)})).booleanValue();
        }
        mspContainerContext.F = z;
        return z;
    }

    public static /* synthetic */ String c(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8961f12d", new Object[]{mspContainerContext}) : mspContainerContext.o;
    }

    public static /* synthetic */ void d(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f23372", new Object[]{mspContainerContext});
        } else {
            mspContainerContext.c();
        }
    }

    public static /* synthetic */ MspLogicClient e(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspLogicClient) ipChange.ipc$dispatch("dd7853da", new Object[]{mspContainerContext}) : mspContainerContext.u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
        if (r10 == 1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
        if (r10 == 2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ad, code lost:
        r3.K = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
        r3.K = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        r3.K = 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MspContainerContext(int r4, com.alibaba.fastjson.JSONObject r5, java.lang.String r6, java.lang.String r7, android.content.Context r8, boolean r9, android.os.Bundle r10, android.os.Bundle r11, java.lang.String r12, boolean r13, com.alipay.android.msp.core.callback.MspContextFinishCallback r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.context.MspContainerContext.<init>(int, com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.String, android.content.Context, boolean, android.os.Bundle, android.os.Bundle, java.lang.String, boolean, com.alipay.android.msp.core.callback.MspContextFinishCallback, java.lang.String):void");
    }

    public MspContainerContext(int i, String str, String str2, boolean z, Context context, MspContextFinishCallback mspContextFinishCallback) {
        this.A = null;
        this.D = false;
        this.F = false;
        this.J = true;
        this.K = 0;
        a();
        this.g = i;
        a(z);
        this.v = str;
        this.r = str2;
        this.z = str2;
        this.b = context;
        this.l = MspContext.CONTEXT_TYPE_RENDER;
        this.I = mspContextFinishCallback;
        this.G = true;
        this.d = new MspNetHandler(this);
        this.u = new MspLogicClient(this);
        this.t = new MspWindowClient(this);
        this.e = new ActionStoreCenter(this);
        MspContextManager.getInstance().addMspContext(i, this);
        GlobalHelper.getInstance().init(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InvokeActionPlugin.registerRenderLocalInvokeFamily(this);
        InvokeActionPlugin.registerRenderBnInvokeFamily(this);
        EventLogUtil.logPayEvent("103627", HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "content_type", "render");
        onContextCreated();
    }

    public MspContainerContext(int i, JSONObject jSONObject, String str, boolean z, Context context, MspContextFinishCallback mspContextFinishCallback) {
        this(i, jSONObject, null, null, context, z, null, null, str, true, mspContextFinishCallback, MspContext.CONTEXT_TYPE_RENDER);
        this.r = str;
    }

    public boolean showRenderLoading() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d75832d4", new Object[]{this})).booleanValue() : this.J;
    }

    public int forceInAnim() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dd924f9b", new Object[]{this})).intValue() : this.K;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public String getApLinkToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dd8b99bf", new Object[]{this}) : this.A;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void updateTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cea32cd", new Object[]{this, str});
        } else {
            this.E = str;
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this}) : this.E;
    }

    public void startGenerateView(final MspContainerPresenter mspContainerPresenter, final MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af7e6b5", new Object[]{this, mspContainerPresenter, mspWindowLoadListener});
        } else if (TaskHelper.isMainThread()) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContainerContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspContainerContext.a(MspContainerContext.this, mspContainerPresenter, mspWindowLoadListener);
                    }
                }
            });
        } else {
            a(mspContainerPresenter, mspWindowLoadListener);
        }
    }

    private void a(MspContainerPresenter mspContainerPresenter, MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5aea70", new Object[]{this, mspContainerPresenter, mspWindowLoadListener});
            return;
        }
        try {
            if (this.s == null) {
                LogUtil.record(4, "onWindowLoadFail", "PAGE_DATA_EMPTY，loadListener".concat(String.valueOf(mspWindowLoadListener)));
                Bundle bundle = new Bundle();
                bundle.putInt("mspBizId", this.g);
                mspWindowLoadListener.onWindowLoadFail(0, bundle);
                return;
            }
            setMspWindowLoadListener(mspWindowLoadListener);
            this.t.setPresenter(this, mspContainerPresenter);
            JsExceptionReceiver.registerReceiver();
            mspContainerPresenter.registerInvokePlugin(this);
            if (mspWindowLoadListener instanceof MspWindowLoadPoint) {
                ((MspWindowLoadPoint) mspWindowLoadListener).beforeCreateView(this.g);
            }
            StEvent stEvent = new StEvent("initial", "container", "render");
            ActionsCreator.get(this).createUIShowAction(this.s, false, stEvent);
            getStatisticInfo().addEvent(stEvent);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void setMspWindowLoadListener(MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc57f0a2", new Object[]{this, mspWindowLoadListener});
        } else {
            this.t.setMspWindowLoadListener(mspWindowLoadListener);
        }
    }

    public MspContainerClient getMspContainerClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContainerClient) ipChange.ipc$dispatch("5d8c89a4", new Object[]{this}) : this.C;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this}) : this.r;
    }

    public String getBizData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c78d2232", new Object[]{this}) : this.v;
    }

    public void startRend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fac9b2", new Object[]{this});
            return;
        }
        if (this.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_PRE");
        }
        this.s = new OfflineRenderLogic().analysisResultPageInfo(getContext(), new HashMap(), this.s);
        JSONObject jSONObject = this.s;
        if (jSONObject == null) {
            BroadcastUtil.sendRendPageResultToSource(this.o, getContext(), this.g);
            return;
        }
        final String string = jSONObject.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID);
        if (!StringUtils.equals(string, MspFlybirdDefine.FLYBIRD_RESULT_TPL) && !StringUtils.equals(string, MspFlybirdDefine.DEFAULT_RESULT_TPL_ID) && !StringUtils.equals(string, MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL)) {
            LogUtil.record(4, "EncryptUtil:verifyTplData", "return true : degrade or not result  tplId = ".concat(String.valueOf(string)));
            c();
            return;
        }
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContainerContext.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MspContainerContext.a(MspContainerContext.this, string);
                MspContainerContext mspContainerContext = MspContainerContext.this;
                if (MspContainerContext.a(mspContainerContext, MspContainerContext.b(mspContainerContext), MspContainerContext.this.getContext())) {
                    MspContainerContext.d(MspContainerContext.this);
                    return;
                }
                BroadcastUtil.sendRendPageResultToSource(MspContainerContext.c(MspContainerContext.this), MspContainerContext.this.getContext(), MspContainerContext.this.g);
                MspContainerContext.this.exit(0);
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        try {
            if (this.B) {
                HashSet<MspContainerContext> hashSet = new HashSet();
                for (MspContainerContext mspContainerContext : q) {
                    if (mspContainerContext != null && StringUtils.equals(this.y, mspContainerContext.y) && mspContainerContext.B) {
                        hashSet.add(mspContainerContext);
                    }
                }
                for (MspContainerContext mspContainerContext2 : hashSet) {
                    if (mspContainerContext2 != null) {
                        mspContainerContext2.exit(0);
                    }
                }
                q.add(this);
            }
            this.t.setSuccNotifyName(this.n);
            this.t.setFailNotifyName(this.o);
            this.t.startContainerPage();
            StEvent stEvent = new StEvent("initial", "container", "render");
            ActionsCreator.get(this).createUIShowAction(this.s, false, stEvent);
            getStatisticInfo().addEvent(stEvent);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else if (context == null) {
        } else {
            this.b = context;
        }
    }

    public MspContainerResult startContainer(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerResult) ipChange.ipc$dispatch("cce16b3d", new Object[]{this, jSONObject});
        }
        if (this.C == null) {
            this.C = new MspContainerClient(this);
        }
        return this.C.startContainer(jSONObject);
    }

    public String getStatsBizType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8d886db5", new Object[]{this}) : StringUtils.isEmpty(this.z) ? "render" : this.z;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspBasePresenter getMspBasePresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspBasePresenter) ipChange.ipc$dispatch("69a95869", new Object[]{this}) : this.t.getCurrentPresenter();
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void exit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab88c8fe", new Object[]{this, new Integer(i)});
        } else {
            exit(i, false);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void exit(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5910996", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        super.exit(i, z);
        synchronized (this) {
            if (isExit()) {
                return;
            }
            this.f = true;
            getStatisticInfo().updateAttr(Vector.Trade, "bizType", StringUtils.isEmpty(this.z) ? "render" : this.z);
            LogUtil.record(2, "MspContainerContext:exit", "this=".concat(String.valueOf(this)));
            MspWindowClient mspWindowClient = this.t;
            if (mspWindowClient != null) {
                mspWindowClient.onExit();
            }
            MspContextFinishCallback mspContextFinishCallback = this.I;
            if (mspContextFinishCallback != null) {
                mspContextFinishCallback.onMspContextFinish();
            }
            if (this.C == null) {
                getStatisticInfo().updateResult("6001", getCurrentWinTpName());
            }
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContainerContext.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (MspContainerContext.e(MspContainerContext.this) != null) {
                        MspContainerContext.e(MspContainerContext.this).onExit();
                    }
                    MspContainerContext.this.getStatisticInfo().onStatisticEnd();
                }
            }, 600L);
            if (this.b != null && DrmManager.getInstance(this.b).isGray(DrmKey.GRAY_DELAY_THREAD_RUNNABLE, false, this.b)) {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 600L, TaskHelper.ThreadName.UI_CONTEXT);
            } else {
                TaskHelper.execute(monitorRunnable, 600L);
            }
            if (!this.B) {
                return;
            }
            q.remove(this);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public StoreCenter getStoreCenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StoreCenter) ipChange.ipc$dispatch("550b9278", new Object[]{this}) : this.e;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspWindowFrameStack getWindowStack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWindowFrameStack) ipChange.ipc$dispatch("b53eb85b", new Object[]{this}) : this.t.getFrameStack();
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspUIClient getMspUIClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspUIClient) ipChange.ipc$dispatch("52f9383d", new Object[]{this}) : this.t;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspLogicClient getMspLogicClient() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspLogicClient) ipChange.ipc$dispatch("220bab2f", new Object[]{this}) : this.u;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void onCompensating(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f8e789", new Object[]{this, new Integer(i)});
            return;
        }
        super.onCompensating(i);
        if (i != 101 || !this.G) {
            return;
        }
        PrefUtils.putInt(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_ERROR_TIMES_KEY, Integer.valueOf(PrefUtils.getInt(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_ERROR_TIMES_KEY, 0).intValue() + 1));
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public boolean getGrayOnPadAdaptMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1f3e32d5", new Object[]{this})).booleanValue() : this.D;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public boolean getGrayUnifiedReadPadConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3135251", new Object[]{this})).booleanValue() : this.F;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspExtSceneManager getMspExtSceneManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspExtSceneManager) ipChange.ipc$dispatch("fd7b3373", new Object[]{this}) : this.H;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void onRendFrameSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e9d25", new Object[]{this});
            return;
        }
        super.onRendFrameSuccess();
        MspContainerClient mspContainerClient = this.C;
        if (mspContainerClient == null || mspContainerClient.getMspContainerResult() == null) {
            return;
        }
        this.C.getMspContainerResult().setErrorCode("0");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("<MspContainerContext with bizId: %s>", Integer.valueOf(this.g));
    }

    public static void fillStartupParams(MspWindowFrame mspWindowFrame, MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492e52b0", new Object[]{mspWindowFrame, mspContainerContext});
        } else if (mspWindowFrame == null || mspContainerContext == null) {
        } else {
            mspWindowFrame.setStartupParams(mspContainerContext.x);
        }
    }

    public static void fillSceneParams(MspWindowFrame mspWindowFrame, MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57da0cc1", new Object[]{mspWindowFrame, mspContainerContext});
        } else if (mspWindowFrame == null || mspContainerContext == null) {
        } else {
            mspWindowFrame.setSceneParams(mspContainerContext.w);
        }
    }

    private static org.json.JSONObject a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("a01125a", new Object[]{bundle});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (bundle == null) {
            return jSONObject;
        }
        Set<String> hashSet = new HashSet<>();
        try {
            hashSet = bundle.keySet();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (hashSet != null && hashSet.size() > 0) {
            for (String str : hashSet) {
                if (str instanceof String) {
                    try {
                        String str2 = str;
                        Object obj = bundle.get(str2);
                        jSONObject.put(str2, obj == null ? "" : String.valueOf(obj));
                    } catch (Throwable th2) {
                        LogUtil.printExceptionStackTrace(th2);
                    }
                }
            }
        }
        return jSONObject;
    }

    public static /* synthetic */ void a(MspContainerContext mspContainerContext, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb5f31f", new Object[]{mspContainerContext, str});
        } else if (mspContainerContext.s == null) {
        } else {
            if ((!StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_RESULT_TPL) && !StringUtils.equals(str, MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL)) || (jSONObject = mspContainerContext.s.getJSONObject("data")) == null) {
                return;
            }
            String string = jSONObject.getString("tradeNo");
            if (!StringUtils.isEmpty(string)) {
                mspContainerContext.updateTradeNo(string);
                mspContainerContext.getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", string);
            }
            LogUtil.record(2, "MspContainerContext.startRend", "is result page, tplId=" + str + ", tradeNo=" + string);
        }
    }

    public static /* synthetic */ boolean a(MspContainerContext mspContainerContext, JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18358f31", new Object[]{mspContainerContext, jSONObject, context})).booleanValue();
        }
        boolean verifyTplData = EncryptUtil.verifyTplData(jSONObject, context, mspContainerContext.g);
        LogUtil.record(1, "MspContainerContext:needGoOnRend", "isVerified : ".concat(String.valueOf(verifyTplData)));
        if (verifyTplData) {
            return true;
        }
        mspContainerContext.getStatisticInfo().addError(ErrorType.DEFAULT, "verifyFail:wontRend", "");
        return false;
    }
}
