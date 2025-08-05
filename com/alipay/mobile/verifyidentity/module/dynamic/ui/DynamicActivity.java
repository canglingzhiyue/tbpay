package com.alipay.mobile.verifyidentity.module.dynamic.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.cctemplate.api.ITplProvider;
import com.alipay.android.app.render.api.CashierRenderFactory;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback;
import com.alipay.android.app.render.api.ext.BirdNestRender;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.TimeCostLog;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.dynamic.DynamicConstants;
import com.alipay.mobile.verifyidentity.module.dynamic.DynamicModule;
import com.alipay.mobile.verifyidentity.module.dynamic.helper.BankCardVerifyHelper;
import com.alipay.mobile.verifyidentity.module.dynamic.helper.ExtEventHandler;
import com.alipay.mobile.verifyidentity.module.dynamic.helper.MaskHelper;
import com.alipay.mobile.verifyidentity.module.dynamic.ui.plugin.VIFBPluginFactory;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.APRelativeLayout;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.mxf;

/* loaded from: classes3.dex */
public class DynamicActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5890a = "DynamicActivity";
    private APRelativeLayout b;
    private View c;
    private MaskHelper d;
    private BirdNestRender e = CashierRenderFactory.create();
    private Map<String, String> f = new HashMap();
    private JSONObject g = new JSONObject();
    private int h = 0;
    private long i = 0;
    private boolean j = false;
    private BroadcastReceiver k;
    private LocalBroadcastManager l;
    private View m;
    public String tplData;
    public String tplId;
    public String tplInfo;

    /* loaded from: classes3.dex */
    public class EventLog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int index = 0;
        public String params = "";
        public String result = "";
        public long start = SystemClock.elapsedRealtime();

        public EventLog() {
        }

        public void flush() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
                return;
            }
            JSONObject access$1900 = DynamicActivity.access$1900(DynamicActivity.this);
            String valueOf = String.valueOf(this.index);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) this.params);
            jSONObject.put("result", (Object) this.result);
            jSONObject.put("duration", (Object) Long.valueOf(SystemClock.elapsedRealtime() - this.start));
            access$1900.put(valueOf, (Object) jSONObject.toJSONString());
        }
    }

    public static /* synthetic */ Object ipc$super(DynamicActivity dynamicActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : f5890a;
    }

    public static /* synthetic */ MicroModule access$1000(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("d8f67bf3", new Object[]{dynamicActivity}) : dynamicActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1100(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("4c037834", new Object[]{dynamicActivity}) : dynamicActivity.mModule;
    }

    public static /* synthetic */ void access$1200(DynamicActivity dynamicActivity, String str, String str2, String str3, EventLog eventLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0d2066", new Object[]{dynamicActivity, str, str2, str3, eventLog});
        } else {
            dynamicActivity.a(str, str2, str3, eventLog);
        }
    }

    public static /* synthetic */ MicroModule access$1400(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("a52a6cf7", new Object[]{dynamicActivity}) : dynamicActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1500(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("18376938", new Object[]{dynamicActivity}) : dynamicActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$1600(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MicroModule) ipChange.ipc$dispatch("8b446579", new Object[]{dynamicActivity}) : dynamicActivity.mModule;
    }

    public static /* synthetic */ MaskHelper access$1800(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaskHelper) ipChange.ipc$dispatch("4a3280", new Object[]{dynamicActivity}) : dynamicActivity.d;
    }

    public static /* synthetic */ JSONObject access$1900(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dc54869a", new Object[]{dynamicActivity}) : dynamicActivity.g;
    }

    public static /* synthetic */ BirdNestRender access$200(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BirdNestRender) ipChange.ipc$dispatch("2a9bc763", new Object[]{dynamicActivity}) : dynamicActivity.e;
    }

    public static /* synthetic */ View access$300(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("45fb2e47", new Object[]{dynamicActivity}) : dynamicActivity.c;
    }

    public static /* synthetic */ View access$302(DynamicActivity dynamicActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe8285ad", new Object[]{dynamicActivity, view});
        }
        dynamicActivity.c = view;
        return view;
    }

    public static /* synthetic */ String access$400(DynamicActivity dynamicActivity, Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4af3cd1", new Object[]{dynamicActivity, th}) : a(th);
    }

    public static /* synthetic */ long access$602(DynamicActivity dynamicActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c21c6e", new Object[]{dynamicActivity, new Long(j)})).longValue();
        }
        dynamicActivity.i = j;
        return j;
    }

    public static /* synthetic */ Map access$700(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("242b86be", new Object[]{dynamicActivity}) : dynamicActivity.f;
    }

    public static /* synthetic */ APRelativeLayout access$800(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APRelativeLayout) ipChange.ipc$dispatch("e52773bd", new Object[]{dynamicActivity}) : dynamicActivity.b;
    }

    public static /* synthetic */ void access$900(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2a7dcb", new Object[]{dynamicActivity});
        } else {
            dynamicActivity.a();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            VerifyLogCat.d(f5890a, "null intent params");
            notifyError();
            return;
        }
        super.onCreate(bundle);
        Bundle extras = intent.getExtras();
        setContentView(R.layout.activity_dynamic);
        this.b = (APRelativeLayout) findViewById(R.id.dynamic_root);
        this.m = findViewById(R.id.keyboard_layout);
        this.tplId = extras.getString(DynamicModule.KEY_TPLID);
        this.tplInfo = extras.getString(DynamicModule.KEY_TPLINFO);
        this.tplData = extras.getString(DynamicModule.KEY_TPLDATA);
        if ("1".equalsIgnoreCase(extras.getString("VIExitFlag"))) {
            this.j = true;
        }
        String str = f5890a;
        VerifyLogCat.i(str, "[needKeepUI]: " + this.j);
        String str2 = f5890a;
        VerifyLogCat.i(str2, "[getEngineVersion]: " + this.e.getEngineVersion());
        String str3 = f5890a;
        VerifyLogCat.i(str3, "[getEngineParams]: " + this.e.getEngineParams());
        String str4 = f5890a;
        VerifyLogCat.i(str4, "[tplId]: " + this.tplId);
        String str5 = f5890a;
        VerifyLogCat.i(str5, "[tplInfo]: " + this.tplInfo);
        String str6 = f5890a;
        VerifyLogCat.i(str6, "[tplData]: " + this.tplData);
        String str7 = f5890a;
        VerifyLogCat.i(str7, "[genBundleName]: " + genBundleName("com.alipay.android.phone.securitycommon", "verifyidentitybiz"));
        this.f.put("tplId", this.tplId);
        this.f.put("tplInfo", this.tplInfo);
        this.f.put("tplData", this.tplData);
        a();
        if ("MOBILEIC@threeDomainSecure".equalsIgnoreCase(this.tplId)) {
            this.k = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent2});
                        return;
                    }
                    String action = intent2.getAction();
                    String access$000 = DynamicActivity.access$000();
                    VerifyLogCat.i(access$000, "receive action: " + action);
                    if (!ViWebViewActivity.ACTION_NAME_VI_WEB_VIEW_EXIT.equalsIgnoreCase(action)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ViWebViewActivity.KEY_DO_VERIFY, (Object) intent2.getStringExtra(ViWebViewActivity.KEY_DO_VERIFY));
                    try {
                        DynamicActivity.this.viNativeExecuteJs("onViWebViewExit", jSONObject.toJSONString());
                    } catch (Throwable unused) {
                    }
                }
            };
            this.l = LocalBroadcastManager.getInstance(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ViWebViewActivity.ACTION_NAME_VI_WEB_VIEW_EXIT);
            this.l.registerReceiver(this.k, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.SCREEN_OFF");
            registerReceiver(this.k, intentFilter2);
        }
        this.d = new MaskHelper(this);
        TimeCostLog.log(f5890a, "onCreate耗时：", elapsedRealtime);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e.setIsGenContextDelay(true);
        this.e.setTplProvider(new ITplProvider() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.cctemplate.api.ITplProvider
            public void onComplated() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9eb68e37", new Object[]{this});
                }
            }

            @Override // com.alipay.android.app.cctemplate.api.ITplProvider
            public Context getContext() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("e1727078", new Object[]{this}) : DynamicActivity.this;
            }

            @Override // com.alipay.android.app.cctemplate.api.ITplProvider
            public Resources getResources() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Resources) ipChange2.ipc$dispatch("36fe0307", new Object[]{this}) : DynamicActivity.this.getResources();
            }
        });
        this.e.setFBPluginFactory(new VIFBPluginFactory());
        this.e.setKeyBoardService(new FlybirdTemplateKeyboardService(this.m));
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    final PreparedResult preloadView = DynamicActivity.access$200(DynamicActivity.this).preloadView(DynamicActivity.this, DynamicActivity.this.tplId, DynamicActivity.this.tplInfo, DynamicActivity.this.tplData, null, new ICashierRenderCallback() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
                        public String onGetCustomAttr(Object obj, String str) {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("8229915a", new Object[]{this, obj, str}) : "";
                        }

                        @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
                        public void onEvent(String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("9589844c", new Object[]{this, str});
                                return;
                            }
                            try {
                                DynamicActivity.access$100(DynamicActivity.this, JSON.parseObject(str).getString("param"));
                            } catch (JSONException e) {
                                String access$000 = DynamicActivity.access$000();
                                VerifyLogCat.e(access$000, "json fail " + str, e);
                                DynamicActivity.this.notifyError();
                            }
                        }

                        @Override // com.alipay.android.app.render.api.callback.ICashierRenderCallback
                        public void onAsyncEvent(String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f1266b8e", new Object[]{this, str});
                            } else {
                                DynamicActivity.access$100(DynamicActivity.this, str);
                            }
                        }
                    });
                    String access$000 = DynamicActivity.access$000();
                    VerifyLogCat.i(access$000, "[result]: " + preloadView);
                    DynamicActivity.this.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.2.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                DynamicActivity.access$302(DynamicActivity.this, DynamicActivity.access$200(DynamicActivity.this).generateView(preloadView));
                            } catch (Throwable th) {
                                DynamicActivity.access$500(DynamicActivity.this, "UC-MobileIC-20181112-1", DynamicActivity.access$400(DynamicActivity.this, th));
                            }
                            if (DynamicActivity.access$300(DynamicActivity.this) != null) {
                                DynamicActivity.access$800(DynamicActivity.this).addView(DynamicActivity.access$300(DynamicActivity.this));
                                DynamicActivity.access$602(DynamicActivity.this, SystemClock.elapsedRealtime() - elapsedRealtime);
                                return;
                            }
                            DynamicActivity.access$602(DynamicActivity.this, SystemClock.elapsedRealtime() - elapsedRealtime);
                            DynamicActivity.access$700(DynamicActivity.this).put("error", "GEN_EXCEPTION");
                            DynamicActivity.this.notifyError();
                        }
                    });
                } catch (Throwable th) {
                    VerifyLogCat.e(DynamicActivity.access$000(), "鸟巢渲染失败！", th);
                    DynamicActivity.access$602(DynamicActivity.this, SystemClock.elapsedRealtime() - elapsedRealtime);
                    DynamicActivity.access$700(DynamicActivity.this).put("error", "GEN_ERROR");
                    DynamicActivity.this.notifyError();
                }
            }
        }, mxf.initView);
    }

    private void a(final String str, final String str2, String str3, final EventLog eventLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f771b411", new Object[]{this, str, str2, str3, eventLog});
            return;
        }
        if ("true".equalsIgnoreCase(str3)) {
            VerifyLogCat.i(f5890a, "本次鸟巢页面发rpc需要转菊花");
            showProgressDialog("");
        }
        this.d.addMaskView();
        AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                try {
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MICRpcRequest mICRpcRequest = new MICRpcRequest();
                    mICRpcRequest.verifyId = DynamicActivity.access$1400(DynamicActivity.this).getVerifyId();
                    mICRpcRequest.token = DynamicActivity.access$1500(DynamicActivity.this).getToken();
                    mICRpcRequest.action = str;
                    mICRpcRequest.module = DynamicActivity.access$1600(DynamicActivity.this).getModuleName();
                    mICRpcRequest.data = str2;
                    MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                    if (dispatch == null) {
                        throw new Exception();
                    }
                    String jSONString = JSON.toJSONString(dispatch);
                    String access$000 = DynamicActivity.access$000();
                    VerifyLogCat.i(access$000, "callRender json: " + jSONString);
                    DynamicActivity.access$200(DynamicActivity.this).callRender(jSONString);
                    eventLog.result = DynamicActivity.access$1700(DynamicActivity.this, dispatch);
                    eventLog.flush();
                } catch (RpcException e) {
                    VerifyLogCat.w(DynamicActivity.access$000(), "rpc got an RPC exception: ", e);
                    DynamicActivity.this.onRpcError(eventLog);
                } catch (Exception e2) {
                    VerifyLogCat.w(DynamicActivity.access$000(), "rpc got an exception: ", e2);
                    DynamicActivity.this.onRpcError(eventLog);
                } finally {
                    DynamicActivity.this.dismissProgressDialog();
                    DynamicActivity.access$1800(DynamicActivity.this).removeMaskView();
                }
            }
        }, "RPC_Dynamic");
    }

    public void doNextStep(MICRpcResponse mICRpcResponse) {
        ModuleExecuteResult defaultModuleResult;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3432528d", new Object[]{this, mICRpcResponse});
            return;
        }
        VerifyLogCat.i(f5890a, "next step");
        if (mICRpcResponse != null) {
            if (!mICRpcResponse.finish && this.mModule.getModuleName().equalsIgnoreCase(mICRpcResponse.nextStep)) {
                String str = f5890a;
                VerifyLogCat.i(str, "忽略本次RpcResponse，因为finish为false，且next step仍为：" + mICRpcResponse.nextStep);
                return;
            }
            defaultModuleResult = new ModuleExecuteResult();
            defaultModuleResult.setMICRpcResponse(mICRpcResponse);
        } else {
            defaultModuleResult = new DefaultModuleResult("1001");
        }
        notifyResult(defaultModuleResult);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            super.onPause();
        }
    }

    public void notifyResult(ModuleExecuteResult moduleExecuteResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cfa791", new Object[]{this, moduleExecuteResult});
            return;
        }
        if (this.j) {
            if (this.mModule != null) {
                this.mMicroModuleContext.notifyModuleResult(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), moduleExecuteResult);
            }
        } else if (this.mModule != null) {
            this.mMicroModuleContext.notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), moduleExecuteResult);
        } else {
            finish();
        }
        b();
    }

    public void notifyError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b87bd46", new Object[]{this});
            return;
        }
        VerifyLogCat.d(f5890a, "error");
        notifyResult(new DefaultModuleResult("2002"));
    }

    public void onRpcError(EventLog eventLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9fdf8e", new Object[]{this, eventLog});
            return;
        }
        VerifyLogCat.d(f5890a, "rpc error");
        eventLog.result = "RPC_EXCEPTION";
        eventLog.flush();
        if (this.mModule.getTask().getPluginOrProxyMode()) {
            notifyResult(new DefaultModuleResult("2003"));
        } else {
            this.e.callRender("{}");
        }
    }

    public void notifyCancel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f84574", new Object[]{this, str});
            return;
        }
        String str2 = f5890a;
        VerifyLogCat.i(str2, "cancel [subcode]: " + str);
        DefaultModuleResult defaultModuleResult = new DefaultModuleResult("1003");
        if (!TextUtils.isEmpty(str)) {
            if (defaultModuleResult.getExtInfo() == null) {
                defaultModuleResult.setExtInfo(new HashMap<>());
            }
            defaultModuleResult.getExtInfo().put("subCode", str);
        }
        notifyResult(defaultModuleResult);
    }

    public static String genBundleName(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f2604e8", new Object[]{str, str2}) : str.replace("com.alipay.", "").replace(".", "-").concat("-").concat(str2.replace("-build", ""));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.e.destroy(this, hashCode());
        LocalBroadcastManager localBroadcastManager = this.l;
        if (localBroadcastManager == null) {
            return;
        }
        localBroadcastManager.unregisterReceiver(this.k);
        unregisterReceiver(this.k);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            if (this.e.onBackPressed(this.c)) {
                VerifyLogCat.i(f5890a, "鸟巢处理了onBackPressed事件");
            } else {
                notifyCancel("102");
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void viNativeExecuteJs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec39c2f", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            final String replace = "js_function && js_function('$jsonData$');".replace("js_function", str).replace("$jsonData$", TextUtils.isEmpty(str2) ? "" : str2.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f").replace("\u2028", "\\u2028").replace("\u2029", "\\u2029"));
            runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String access$000 = DynamicActivity.access$000();
                    VerifyLogCat.i(access$000, "nativeExecuteJs: " + replace);
                    try {
                        DynamicActivity.access$200(DynamicActivity.this).callExecuteJs(DynamicActivity.access$300(DynamicActivity.this), replace);
                    } catch (Throwable th) {
                        VerifyLogCat.e(DynamicActivity.access$000(), th);
                    }
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f.put("event", this.g.toJSONString());
        String str = f5890a;
        VerifyLogCat.d(str, "extLogParams: " + this.f);
        String str2 = f5890a;
        VerifyLogCat.i(str2, "鸟巢页面渲染耗时: " + this.i);
    }

    private static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        try {
            return new String(Base64.encode(VerifyLogCat.getExceptionMsg(th).getBytes("UTF-8"), 2));
        } catch (Throwable th2) {
            VerifyLogCat.w(f5890a, "fail to build encodedExceptionMsg：", th2);
            return "-";
        }
    }

    public static /* synthetic */ void access$100(DynamicActivity dynamicActivity, String str) {
        JSONObject jSONObject;
        Resources resources;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54eb06cd", new Object[]{dynamicActivity, str});
            return;
        }
        final EventLog eventLog = new EventLog();
        int i2 = dynamicActivity.h;
        dynamicActivity.h = i2 + 1;
        eventLog.index = i2;
        eventLog.params = str;
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("eventName");
            final String string2 = parseObject.getString("actionName");
            String string3 = parseObject.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME);
            String string4 = parseObject.getString("index");
            final JSONObject jSONObject2 = parseObject.getJSONObject("params");
            String jSONString = jSONObject2 != null ? jSONObject2.toJSONString() : "";
            if (DynamicConstants.DYNAMIC_EVENT_RPC_VALIDATE.equalsIgnoreCase(string)) {
                if (!TextUtils.isEmpty(string3) && "CC_PAINTEXT_HK".equalsIgnoreCase(string3)) {
                    final String string5 = parseObject.getString("showLoading");
                    AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:100:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:109:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:88:0x0266  */
                        /* JADX WARN: Removed duplicated region for block: B:98:0x027d  */
                        /* JADX WARN: Type inference failed for: r2v11, types: [java.net.HttpURLConnection] */
                        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[]] */
                        /* JADX WARN: Type inference failed for: r2v5 */
                        /* JADX WARN: Type inference failed for: r2v7 */
                        /* JADX WARN: Type inference failed for: r2v8, types: [java.net.HttpURLConnection] */
                        /* JADX WARN: Type inference failed for: r3v13 */
                        /* JADX WARN: Type inference failed for: r3v8 */
                        /* JADX WARN: Type inference failed for: r3v9 */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void run() {
                            /*
                                Method dump skipped, instructions count: 641
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.AnonymousClass7.run():void");
                        }
                    }, "getcardinfo");
                    return;
                }
                dynamicActivity.a(string2, jSONString, parseObject.getString("showLoading"), eventLog);
            } else if (DynamicConstants.DYNAMIC_EVENT_QUIT_MODULE_WITH_RESPONSE.equalsIgnoreCase(string)) {
                try {
                    MICRpcResponse mICRpcResponse = (MICRpcResponse) JSON.parseObject(jSONString, MICRpcResponse.class);
                    eventLog.flush();
                    dynamicActivity.doNextStep(mICRpcResponse);
                } catch (JSONException e) {
                    String str2 = f5890a;
                    VerifyLogCat.e(str2, "json fail " + jSONString, e);
                    dynamicActivity.notifyError();
                }
            } else if (DynamicConstants.DYNAMIC_EVENT_QUIT_MODULE.equalsIgnoreCase(string)) {
                eventLog.flush();
                dynamicActivity.notifyCancel("102");
            } else if (DynamicConstants.DYNAMIC_EVENT_CHANGE_MODULE.equalsIgnoreCase(string)) {
                eventLog.flush();
                VIUtils.goOtherVerifyProduct(MicroModuleContext.getInstance(), dynamicActivity, dynamicActivity.mModule);
                dynamicActivity.b();
            } else if (DynamicConstants.DYNAMIC_EVENT_EXTERNAL_ACTION.equalsIgnoreCase(string)) {
                new ExtEventHandler(dynamicActivity).handle(jSONObject2, eventLog, dynamicActivity.e);
            } else if (DynamicConstants.DYNAMIC_EVENT_PROD_QUIZZES_CONFIRM.equalsIgnoreCase(string)) {
                dynamicActivity.tplId = "MOBILEIC@remindQuizzesSubmit";
                dynamicActivity.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        DynamicActivity.access$800(DynamicActivity.this).removeAllViews();
                        DynamicActivity.access$900(DynamicActivity.this);
                    }
                });
            } else {
                JSONObject jSONObject3 = null;
                if (DynamicConstants.DYNAMIC_EVENT_BANKCARD_ADD.equalsIgnoreCase(string)) {
                    try {
                        jSONObject3 = JSON.parseObject(dynamicActivity.tplData);
                    } catch (JSONException unused) {
                    }
                    new BankCardVerifyHelper(dynamicActivity.j).startAddCard(dynamicActivity.mModule, (jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject(RVConstants.EXTRA_START_PARAMS)) == null || TextUtils.isEmpty(jSONObject.getString("source"))) ? "verify" : jSONObject.getString("source"));
                } else if (DynamicConstants.DYNAMIC_EVENT_BACKCARD_VERIFY.equalsIgnoreCase(string)) {
                    try {
                        jSONObject3 = JSON.parseObject(dynamicActivity.tplData);
                    } catch (JSONException unused2) {
                    }
                    if (jSONObject3 != null) {
                        jSONObject3.put("index", (Object) string4);
                        dynamicActivity.tplData = jSONObject3.toJSONString();
                    }
                    dynamicActivity.tplId = "MOBILEIC@bankRiskCardVerify";
                    dynamicActivity.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            DynamicActivity.access$800(DynamicActivity.this).removeAllViews();
                            DynamicActivity.access$900(DynamicActivity.this);
                        }
                    });
                } else if (!DynamicConstants.DYNAMIC_EVENT_GOBACK_WITH_RETRY.equalsIgnoreCase(string)) {
                } else {
                    parseObject.getString("exitType");
                    try {
                        jSONObject3 = JSON.parseObject(dynamicActivity.tplData);
                    } catch (JSONException unused3) {
                    }
                    final boolean booleanValue = jSONObject3 != null ? jSONObject3.getBooleanValue(BioDetector.EXT_KEY_HAS_OTHERS) : false;
                    String string6 = dynamicActivity.getResources().getString(R.string.vi_cancel_alert);
                    String string7 = dynamicActivity.getResources().getString(R.string.vi_cancel_ok);
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                                return;
                            }
                            VerifyLogCat.i(DynamicActivity.access$000(), "【用户选择确认】");
                            DynamicActivity.this.notifyCancel("102");
                        }
                    };
                    if (booleanValue) {
                        resources = dynamicActivity.getResources();
                        i = R.string.vi_other_product;
                    } else {
                        resources = dynamicActivity.getResources();
                        i = R.string.vi_cancel_quit;
                    }
                    dynamicActivity.alert((String) null, string6, string7, onClickListener, resources.getString(i), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.dynamic.ui.DynamicActivity.6
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                            } else if (!booleanValue) {
                            } else {
                                MicroModuleContext microModuleContext = MicroModuleContext.getInstance();
                                DynamicActivity dynamicActivity2 = DynamicActivity.this;
                                VIUtils.goOtherVerifyProduct(microModuleContext, dynamicActivity2, DynamicActivity.access$1000(dynamicActivity2));
                            }
                        }
                    }, (Boolean) false);
                }
            }
        } catch (JSONException e2) {
            String str3 = f5890a;
            VerifyLogCat.e(str3, "json fail " + str, e2);
            dynamicActivity.notifyError();
        }
    }

    public static /* synthetic */ void access$500(DynamicActivity dynamicActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e49705b", new Object[]{dynamicActivity, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("crashInfo", str2);
        VerifyLogger.getInstance().eventBehavior(str, "", "", "", hashMap);
    }

    public static /* synthetic */ void access$1300(DynamicActivity dynamicActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd42f4", new Object[]{dynamicActivity});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("VerifySuccess", (Object) "false");
        jSONObject.put("finish", (Object) "false");
        jSONObject.put(Constants.VI_ENGINE_FAST_MODULENAME, (Object) "CC_PAINTEXT_HK");
        dynamicActivity.e.callRender(jSONObject.toJSONString());
    }

    public static /* synthetic */ String access$1700(DynamicActivity dynamicActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44f19e9a", new Object[]{dynamicActivity, mICRpcResponse});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(mICRpcResponse.success));
        jSONObject.put("verifySuccess", (Object) Boolean.valueOf(mICRpcResponse.verifySuccess));
        jSONObject.put(ModuleConstants.VI_TASK_VERIFYCODE, (Object) mICRpcResponse.verifyCode);
        jSONObject.put("verifyMessage", (Object) mICRpcResponse.verifyMessage);
        jSONObject.put("finish", (Object) Boolean.valueOf(mICRpcResponse.finish));
        jSONObject.put(MspFlybirdDefine.FLYBIRD_VIDATA_FINISH_CODE, (Object) mICRpcResponse.finishCode);
        jSONObject.put(Constants.VI_ENGINE_FAST_MODULENAME, (Object) mICRpcResponse.nextStep);
        return jSONObject.toJSONString();
    }
}
