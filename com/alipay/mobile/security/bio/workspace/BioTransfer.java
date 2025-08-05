package com.alipay.mobile.security.bio.workspace;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.bis.core.protocol.BioRuntimeDependency;
import com.alipay.mobile.security.bio.api.BioCallback;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.api.BioProgressCallback;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.bio.common.statistics.RecordExtAction;
import com.alipay.mobile.security.bio.common.statistics.RecordExtService;
import com.alipay.mobile.security.bio.config.Constant;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.runtime.BioResManager;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioAppManager;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.service.BioUploadServiceCore;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.bio.workspace.BioTransferLifecycleRegistry;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioTransfer implements BioDetector {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private BioServiceManager f5830a;
    private LocalBroadcastManager b;
    private AuthBroadCastReceiver c;
    private MicroModule e;
    private BioCallback f;
    private BioAppManager g;
    private BioDetector.BioDetectorState i;
    public Context mContext;
    public JSONObject mFcSpecialData;
    public BioParameter mIDFaceParam;
    public RecordExtService mRecordExtService;
    private ArrayList<String> d = new ArrayList<>(Arrays.asList("userid", "apdid", "scene_id", "appid", "token_id", "usernamehidden", TBSearchChiTuJSBridge.ABTEST, "verifyid"));
    public boolean isIDFaceFlag = false;
    public int fcStep = 0;
    public String fcToken = "";
    private final int h = BioTransferLifecycleRegistry.getInstance().getNextBioDetectorId();

    /* loaded from: classes3.dex */
    public class AuthBroadCastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AuthBroadCastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            BioLog.d("testvertify : AuthBroadCastReceiver");
            if (!BioTransfer.access$000(BioTransfer.this).isAtLeast(BioDetector.BioDetectorState.CREATED)) {
                return;
            }
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra(Constant.BIOLOGY_INTENT_ACTION_REV);
            BioLog.i("rev action='" + action);
            if (TextUtils.isEmpty(stringExtra)) {
                BioLog.w(new RuntimeException("why the AuthBroadCastReceiver.rev is empty?"));
                return;
            }
            BioResponse bioResponse = null;
            try {
                bioResponse = (BioResponse) JSON.parseObject(stringExtra, BioResponse.class);
            } catch (Throwable th) {
                BioLog.w(th);
            }
            if (bioResponse == null) {
                BioLog.w(new RuntimeException("Failed to parse {" + stringExtra + "} to com.alipay.mobile.security.bio.api.BioResponse"));
                return;
            }
            String tag = bioResponse.getTag();
            if (BioTransfer.access$100(BioTransfer.this) == null) {
                BioLog.w(new RuntimeException("BioAppManager in receiver is null"));
                return;
            }
            BioCallback bioCallback = BioTransfer.access$100(BioTransfer.this).getBioCallback(tag);
            if (TextUtils.equals(Constant.BIOLOGY_CALLBACK_PROGRESS_ACTION, action)) {
                BioLog.i("zolozTime", "rev progress action!");
                if (bioCallback == null) {
                    BioLog.w(new RuntimeException("Failed to getBioCallback() by " + tag));
                    return;
                } else if (bioCallback instanceof BioProgressCallback) {
                    ((BioProgressCallback) bioCallback).onFaceDetected(bioResponse.getExt());
                    return;
                } else {
                    BioLog.i("biologyCallback=" + bioCallback + ", has no method: onFaceDetected(Map<String, String>)");
                    return;
                }
            }
            BioLog.d("testvertify : " + action);
            if (bioCallback == null) {
                try {
                    if (!BioTransfer.this.isIDFaceFlag) {
                        return;
                    }
                } catch (Exception e) {
                    BioLog.e(e);
                    return;
                }
            }
            BioLog.d("testvertify : biologyCallback != null ");
            Map<String, String> ext = bioResponse.getExt();
            if (ext != null && "face".equals(ext.get("fc"))) {
                BioTransfer.this.fcStep = 1;
                BioTransfer.this.auth(BioTransfer.this.mIDFaceParam, BioTransfer.access$200(BioTransfer.this));
                return;
            }
            if (BioTransfer.this.isIDFaceFlag) {
                bioResponse.setToken(BioTransfer.this.fcToken);
                HashMap hashMap = new HashMap();
                hashMap.put("fcToken", BioTransfer.this.fcToken);
                if (BioTransfer.this.fcStep == 1) {
                    BioTransfer.this.mRecordExtService.write(RecordExtAction.RECORD_FC_FACE_CALL_BACK_BIS_SYSTEM, hashMap);
                }
                hashMap.put("param", bioResponse.toString());
                BioTransfer.this.mRecordExtService.write(RecordExtAction.RECORD_FC_CALL_BACK_VERITY_SYSTEM, hashMap);
            }
            if (BioTransfer.this.isIDFaceFlag) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("fcToken", BioTransfer.this.fcToken);
                BioTransfer.this.mRecordExtService.write(RecordExtAction.RECORD_FC_EXIT_SDK, hashMap2);
            }
            int bioAction = BioTransfer.access$100(BioTransfer.this).getBioAppDescription(tag).getBioAction();
            if (992 == bioAction || 993 == bioAction) {
                if (ext == null) {
                    ext = new HashMap<>();
                    bioResponse.setExt(ext);
                }
                ext.put("ui", bioAction + "");
            }
            bioCallback.onResult(bioResponse);
        }
    }

    public static /* synthetic */ BioDetector.BioDetectorState access$000(BioTransfer bioTransfer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioDetector.BioDetectorState) ipChange.ipc$dispatch("f99d7b30", new Object[]{bioTransfer}) : bioTransfer.i;
    }

    public static /* synthetic */ BioAppManager access$100(BioTransfer bioTransfer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioAppManager) ipChange.ipc$dispatch("19f0f77d", new Object[]{bioTransfer}) : bioTransfer.g;
    }

    public static /* synthetic */ BioCallback access$200(BioTransfer bioTransfer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioCallback) ipChange.ipc$dispatch("7477c03e", new Object[]{bioTransfer}) : bioTransfer.f;
    }

    public BioTransfer(Context context, MicroModule microModule) {
        this.i = BioDetector.BioDetectorState.DESTROYED;
        if (context == null) {
            throw new BioIllegalArgumentException();
        }
        this.i = BioDetector.BioDetectorState.INITIALIZED;
        String zimId = microModule == null ? null : microModule.getZimId();
        if (a()) {
            BioLog.d("BioTransfer:cannot create BioServiceManager, has other busy detector");
        } else {
            if (TextUtils.isEmpty(zimId)) {
                BioServiceManager.createInstance(context);
            } else {
                BioServiceManager.createInstance(context, zimId);
            }
            BioTransferLifecycleRegistry.getInstance().setLastServiceManagerOwnerDetectorId(this.h);
            BioLog.d("BioTransfer:create BioServiceManager, set detector as last user");
            this.i = BioDetector.BioDetectorState.CREATED;
        }
        this.f5830a = BioServiceManager.getCurrentInstance();
        this.mRecordExtService = (RecordExtService) this.f5830a.getBioService(RecordExtService.class);
        this.g = (BioAppManager) this.f5830a.getBioService(BioAppManager.class);
        this.b = LocalBroadcastManager.getInstance(context.getApplicationContext());
        this.c = new AuthBroadCastReceiver();
        this.b.registerReceiver(this.c, new IntentFilter(Constant.BIOLOGY_CALLBACK_ACTION));
        this.b.registerReceiver(this.c, new IntentFilter(Constant.BIOLOGY_CALLBACK_PROGRESS_ACTION));
        BioLog.i("LocalBroadcastManager.registerReceiver(mAuthBroadCastReceiver)");
        this.mContext = context.getApplicationContext();
        this.e = microModule;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        BioTransferLifecycleRegistry.getInstance().unregisterBioDetector(getId());
        super.finalize();
    }

    @Override // com.alipay.mobile.security.bio.api.BioDetector
    public int getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.h;
    }

    @Override // com.alipay.mobile.security.bio.api.BioDetector
    public BioDetector.BioDetectorState getState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioDetector.BioDetectorState) ipChange.ipc$dispatch("76f0b885", new Object[]{this}) : this.i;
    }

    @Override // com.alipay.mobile.security.bio.api.BioDetector
    public boolean isUIActive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc9a6c6f", new Object[]{this})).booleanValue();
        }
        BioTransferLifecycleRegistry.BioActivityState activityState = BioTransferLifecycleRegistry.getInstance().getActivityState(this.h);
        return activityState != null && activityState == BioTransferLifecycleRegistry.BioActivityState.RESUMED;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        BioDetector findCurrentUIActiveDetector = BioTransferLifecycleRegistry.getInstance().findCurrentUIActiveDetector();
        return (findCurrentUIActiveDetector == null || findCurrentUIActiveDetector.getId() == this.h) ? false : true;
    }

    @Override // com.alipay.mobile.security.bio.api.BioDetector
    public void auth(BioParameter bioParameter, BioCallback bioCallback) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acd1b13", new Object[]{this, bioParameter, bioCallback});
        } else if (bioParameter == null || bioCallback == null) {
            throw new BioIllegalArgumentException();
        } else {
            BioLog.d("testvertify : bio auth enter");
            if (!this.i.isAtLeast(BioDetector.BioDetectorState.CREATED)) {
                BioLog.d("BioTransfer failed: found other busy");
                BioLog.d("testvertify : bio.normal()");
                BioResponse bioResponse = new BioResponse();
                bioResponse.setResult(400);
                bioResponse.subMsg = "pre bio session is running.";
                bioResponse.subCode = "";
                bioCallback.onResult(bioResponse);
                BioLog.e("pre bio session is running. callback=" + bioCallback + ", return directly.");
                return;
            }
            if (BioResManager.getInstance().getStatus() != 5) {
                BioRuntimeDependency bioRuntimeDependency = BioResManager.getBioRuntimeDependency(this.mContext);
                if (bioRuntimeDependency != null) {
                    int init = BioResManager.getInstance().init(this.mContext, bioRuntimeDependency, null);
                    if (init == 1) {
                        BioResManager.getInstance().startDownload();
                    } else if (init == 3) {
                        z = BioResManager.getInstance().startLoading();
                    } else {
                        BioLog.d("BioTransfer failed: BioResManager status is " + init);
                    }
                }
                if (!z) {
                    BioLog.d("BioTransfer failed: failed to load resources");
                    BioResponse bioResponse2 = new BioResponse();
                    bioResponse2.setResult(400);
                    bioResponse2.subMsg = "failed to load resources";
                    bioResponse2.subCode = "";
                    bioCallback.onResult(bioResponse2);
                    BioLog.e("failed to load resources. callback=" + bioCallback + ", return directly.");
                    return;
                }
            } else {
                BioLog.d("check bio resources is prepared");
            }
            this.f = bioCallback;
            a(bioParameter.getBundle(), bioParameter);
            BioAppDescription a2 = a(bioParameter);
            BioLog.d("BioTransfer.auth(): app: " + a2);
            String put = this.g.put(a2, bioCallback);
            String remoteURL = bioParameter.getRemoteURL();
            BioLog.d("BioTransfer.auth(): remoteUrl:" + remoteURL);
            if (!TextUtils.isEmpty(remoteURL)) {
                ((BioRPCService) this.f5830a.getBioService(BioRPCService.class)).setRemoteUrl(remoteURL);
            }
            BioUploadService bioUploadService = (BioUploadService) this.f5830a.getBioService(BioUploadService.class);
            if (bioUploadService != null) {
                bioUploadService.clearUp();
            }
            a2.setDetectorId(getId());
            if (StringUtil.isNullorEmpty(this.f5830a.startBioActivity(a2, this.e))) {
                sendResponse(put, 201, "app is not installed");
            } else {
                this.i = BioDetector.BioDetectorState.STARTED;
            }
        }
    }

    @Override // com.alipay.mobile.security.bio.api.BioDetector
    public String init(BioParameter bioParameter, BioCallback bioCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8b5ab55", new Object[]{this, bioParameter, bioCallback});
        }
        if (bioParameter == null || bioCallback == null) {
            throw new BioIllegalArgumentException();
        }
        if (!this.i.isAtLeast(BioDetector.BioDetectorState.CREATED)) {
            BioResponse bioResponse = new BioResponse();
            bioResponse.setResult(400);
            bioResponse.subMsg = "pre bio session is running.";
            bioResponse.subCode = "";
            bioCallback.onResult(bioResponse);
            BioLog.e("pre bio session is running. callback=" + bioCallback + ", return directly.");
        }
        a(bioParameter.getBundle(), bioParameter);
        BioAppDescription a2 = a(bioParameter);
        BioLog.d("BioTransfer|init(): app: " + a2);
        String put = this.g.put(a2, bioCallback);
        BioLog.d("BioTransfer|init(): appTag: " + put);
        String remoteURL = bioParameter.getRemoteURL();
        BioLog.d("BioTransfer|init: remoteUrl:" + remoteURL);
        if (!TextUtils.isEmpty(remoteURL)) {
            ((BioRPCService) this.f5830a.getBioService(BioRPCService.class)).setRemoteUrl(remoteURL);
        }
        ((BioUploadService) this.f5830a.getBioService(BioUploadService.class)).clearUp();
        return put;
    }

    private BioAppDescription a(BioParameter bioParameter) {
        String str;
        Class<?> cls;
        int protocolFormat = Env.getProtocolFormat(this.mContext);
        bioParameter.addExtProperty("meta_serializer", String.valueOf(protocolFormat));
        if (bioParameter.isValidate) {
            str = protocolFormat != 2 ? "com.alipay.mobile.security.bio.workspace.JsonToBioApp" : "com.alipay.mobile.security.bio.workspace.PbToBioApp";
        } else {
            str = protocolFormat != 2 ? "com.alipay.mobile.security.bio.workspace.JsonBioParameterToBioApp" : "com.alipay.mobile.security.bio.workspace.PbBioParameterToBioApp";
            try {
                if (2 == Env.getProtocolFormat(this.mContext)) {
                    cls = Class.forName("com.alipay.mobile.security.bio.service.impl.BioUploadServiceCoreBisPb");
                } else {
                    cls = Class.forName("com.alipay.mobile.security.bio.service.impl.BioUploadServiceCoreBisJson");
                }
                BioServiceManager.getCurrentInstance().putBioService(BioUploadServiceCore.class.getName(), cls);
            } catch (Throwable th) {
                BioLog.e(th);
                return null;
            }
        }
        try {
            Constructor<?> constructor = Class.forName(str).getConstructor(Context.class, BioTransfer.class);
            constructor.setAccessible(true);
            return ((BaseBioParameterToBioApp) constructor.newInstance(this.mContext, this)).toBioApp(bioParameter);
        } catch (Throwable th2) {
            BioLog.e(th2);
            return null;
        }
    }

    private BioParameter a(Bundle bundle, BioParameter bioParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioParameter) ipChange.ipc$dispatch("cbd9721a", new Object[]{this, bundle, bioParameter});
        }
        if (bundle == null && bioParameter == null) {
            throw new BioIllegalArgumentException("paramter is null");
        }
        if (bundle == null) {
            BioLog.e("buildBioParameter failed: bundle parameter is null");
            return bioParameter;
        }
        String string = bundle.getString(BioDetector.EXT_KEY_MODULE_DATA_BUNDLE);
        BioLog.i("moduleData:" + string);
        if (TextUtils.isEmpty(string)) {
            BioLog.e("buildBioParameter failed: bundle's moduleData is null");
            return bioParameter;
        }
        JSONObject parseObject = JSONObject.parseObject(string);
        String string2 = parseObject.getString("sceneId");
        String string3 = parseObject.getString("USER_ID");
        String string4 = parseObject.getString(BioDetector.EXT_KEY_BISCFG_BUNDLE);
        String string5 = bundle.getString("TOKEN_ID");
        String string6 = bundle.getString("APDID");
        String string7 = bundle.getString("verifyid");
        String string8 = parseObject.getString("appid");
        String string9 = parseObject.getString(BioDetector.EXT_KEY_HAS_OTHERS);
        bioParameter.setHeadImageUrl(bundle != null ? bundle.getString("headurl") : null);
        BioLog.i("biscfg:" + string4);
        if (!StringUtil.isNullorEmpty(string4)) {
            bioParameter.setProtocol(string4);
        }
        if (TextUtils.isEmpty(string7)) {
            string7 = "";
        }
        bioParameter.addExtProperty("verifyid", string7);
        if (TextUtils.isEmpty(string6)) {
            string6 = "";
        }
        bioParameter.addExtProperty("APDID", string6);
        if (TextUtils.isEmpty(string2)) {
            string2 = "";
        }
        bioParameter.addExtProperty("SCENE_ID", string2);
        if (TextUtils.isEmpty(string5)) {
            string5 = "";
        }
        bioParameter.addExtProperty("TOKEN_ID", string5);
        if (TextUtils.isEmpty(string3)) {
            string3 = "";
        }
        bioParameter.addExtProperty("userid", string3);
        if (TextUtils.isEmpty(string8)) {
            string8 = "";
        }
        bioParameter.addExtProperty("appid", string8);
        if (TextUtils.isEmpty(string9)) {
            string9 = "false";
        }
        bioParameter.addExtProperty(BioDetector.EXT_KEY_HAS_OTHERS, string9);
        if (bundle.containsKey("RequestPage")) {
            String valueOf = String.valueOf(bundle.getInt("RequestPage"));
            if (TextUtils.isEmpty(valueOf)) {
                valueOf = "";
            }
            bioParameter.addExtProperty(BioDetector.EXT_KEY_PAGENUM, valueOf);
        }
        if (bundle.containsKey("RequestCardType")) {
            String string10 = bundle.getString("RequestCardType");
            if (TextUtils.isEmpty(string10)) {
                string10 = "";
            }
            bioParameter.addExtProperty(BioDetector.EXT_KEY_CARD_TYPE, string10);
        }
        if (bundle.containsKey("RequestTotalPagesNum")) {
            String valueOf2 = String.valueOf(bundle.getInt("RequestTotalPagesNum"));
            if (TextUtils.isEmpty(valueOf2)) {
                valueOf2 = "";
            }
            bioParameter.addExtProperty(BioDetector.EXT_KEY_TOTAL_PAGE_NUM, valueOf2);
        }
        BioLog.d("buildParameter return parameter with protocol " + bioParameter.getProtocol());
        return bioParameter;
    }

    public void sendResponse(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59dbee13", new Object[]{this, str, new Integer(i), str2});
        } else if (this.b == null) {
        } else {
            Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_ACTION);
            BioResponse bioResponse = new BioResponse();
            bioResponse.setSuccess(false);
            bioResponse.setResult(i);
            bioResponse.setResultMessage(str2);
            bioResponse.setTag(str);
            Bundle bundle = new Bundle();
            bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
            intent.putExtras(bundle);
            BioLog.w(new RuntimeException("" + bioResponse));
            this.b.sendBroadcast(intent);
        }
    }

    @Override // com.alipay.mobile.security.bio.api.BioDetector
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.i.isAtLeast(BioDetector.BioDetectorState.CREATED) && BioTransferLifecycleRegistry.getInstance().getLastServiceManagerOwnerDetectorId() == this.h) {
            BioServiceManager.destroyInstance();
        }
        this.i = BioDetector.BioDetectorState.DESTROYED;
        this.g = null;
        this.f = null;
        LocalBroadcastManager localBroadcastManager = this.b;
        if (localBroadcastManager == null) {
            return;
        }
        localBroadcastManager.unregisterReceiver(this.c);
    }

    @Override // com.alipay.mobile.security.bio.api.BioDetector
    public int preLoad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dd8c2a23", new Object[]{this})).intValue() : this.f5830a.preLoad();
    }

    @Override // com.alipay.mobile.security.bio.api.BioDetector
    public void command(int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c476f1", new Object[]{this, new Integer(i)});
            return;
        }
        BioLog.i("command" + i);
        if (i == 8193) {
            str = Constant.BIOLOGY_FLAG_SERVER_FAIL;
        } else if (i != 8194) {
            switch (i) {
                case 4097:
                    str = Constant.BIOLOGY_FLAG_SERVER_SUCCESS;
                    break;
                case 4098:
                    str = Constant.BIOLOGY_FLAG_SERVER_CONTINUE;
                    break;
                case 4099:
                    str = Constant.BIOLOGY_FLAG_AUTOCLOSE;
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = Constant.BIOLOGY_FLAG_SERVER_RETRY;
        }
        BioLog.w("BioTransfer.command() action=" + str);
        if (StringUtil.isNullorEmpty(str)) {
            return;
        }
        this.b.sendBroadcast(new Intent(str));
    }
}
