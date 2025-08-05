package com.alipay.android.msp.core.clients;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspWindowLoadListener;
import com.alipay.android.app.helper.Tid;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.container.MspContainerClient;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameDispatcher;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.core.model.H5PopUpWindowItem;
import com.alipay.android.msp.core.model.RpcJsonReq;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.DataBundle;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.actions.UIAction;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.helper.TidHelper;
import com.alipay.android.msp.framework.offline.OfflineRenderLogic;
import com.alipay.android.msp.framework.preload.PreloadManager;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.network.DispatchType;
import com.alipay.android.msp.plugin.engine.IBizEngine;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.ut.device.UTDevice;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public abstract class MspUIClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private MspWindowFrameStack f4507a;
    private boolean b = true;
    private MspWindowFrameDispatcher c;
    private boolean d;
    public volatile boolean hasActivityCreated;
    public final int mBizId;
    public MspBasePresenter mCurrentPresenter;
    public String mFailNotifyName;
    public Map<String, H5PopUpWindowItem> mH5PageItemMap;
    public final MspContext mMspContext;
    public final MspTradeContext mMspTradeContext;
    public MspWindowLoadListener mMspWindowLoadListener;
    public String mSuccNotifyName;

    public abstract void disposeUI();

    public abstract void doDisposeWindow();

    public abstract void onExit();

    public abstract boolean onWindowChanged(MspWindowFrame mspWindowFrame);

    public abstract void onWindowLoaded(MspContext mspContext, MspBasePresenter mspBasePresenter);

    public MspUIClient(MspContext mspContext) {
        this.mMspContext = mspContext;
        this.mMspTradeContext = mspContext instanceof MspTradeContext ? (MspTradeContext) mspContext : null;
        this.mBizId = mspContext.getBizId();
        this.f4507a = new MspWindowFrameStack(mspContext);
        this.c = new MspWindowFrameDispatcher(mspContext);
        this.mH5PageItemMap = new HashMap();
        this.d = this.mMspContext.isFromWallet();
    }

    public Map<String, H5PopUpWindowItem> getH5PageItemMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("95e1afb3", new Object[]{this}) : this.mH5PageItemMap;
    }

    public void setSuccNotifyName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8231d2e9", new Object[]{this, str});
        } else {
            this.mSuccNotifyName = str;
        }
    }

    public void setMspWindowLoadListener(MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc57f0a2", new Object[]{this, mspWindowLoadListener});
        } else {
            this.mMspWindowLoadListener = mspWindowLoadListener;
        }
    }

    public void setFailNotifyName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d612fc5", new Object[]{this, str});
        } else {
            this.mFailNotifyName = str;
        }
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue() : this.mBizId;
    }

    public MspWindowFrameDispatcher getMspWindowFrameDispatcher() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWindowFrameDispatcher) ipChange.ipc$dispatch("a7e9415e", new Object[]{this}) : this.c;
    }

    public MspBasePresenter getCurrentPresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspBasePresenter) ipChange.ipc$dispatch("e379efab", new Object[]{this}) : this.mCurrentPresenter;
    }

    public MspWindowFrameStack getFrameStack() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWindowFrameStack) ipChange.ipc$dispatch("5fbb916a", new Object[]{this}) : this.f4507a;
    }

    public JSONObject handleUiStartWithoutData(UIAction uIAction, MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb162dab", new Object[]{this, uIAction, mspContainerContext});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        if (uIAction != null && ((Boolean) uIAction.getData().get(UIAction.DataKeys.isFirstEnter, Boolean.TRUE)).booleanValue()) {
            jSONObject.put("success", (Object) Boolean.valueOf(a()));
            String a2 = a(mspContainerContext);
            String str = "";
            if (TextUtils.isEmpty(a2)) {
                LogUtil.record(1, "MspUIClient:onFirstReq", "opType empty");
                MspContainerClient mspContainerClient = mspContainerContext.getMspContainerClient();
                if (mspContainerClient != null && mspContainerClient.getMspContainerResult() != null) {
                    mspContainerClient.getMspContainerResult().setErrorCode("102");
                }
                Context context = mspContainerContext.getContext();
                if (context != null) {
                    str = LanguageHelper.localizedStringForKey("mini_app_error", context.getString(R.string.mini_app_error), new Object[0]);
                }
                ExceptionUtils.sendUiMsgWhenException(this.mBizId, new AppErrorException(ExceptionUtils.createExceptionMsg(str, 307)));
                return jSONObject;
            }
            String apdidToken = PhoneCashierMspEngine.getMspBase().getApdidToken(mspContainerContext.getContext());
            String cachedUserAgentByTypeV2 = PreloadManager.getPreloadCache().getCachedUserAgentByTypeV2(null, false, apdidToken);
            String cachedManufacturerAndModel = PreloadManager.getPreloadCache().getCachedManufacturerAndModel(false, null, false, apdidToken);
            String clientKey = MspConfig.getInstance().getClientKey();
            String vimeiAndVimsi = MspConfig.getInstance().getVimeiAndVimsi();
            if (!TextUtils.isEmpty(cachedUserAgentByTypeV2)) {
                cachedUserAgentByTypeV2 = cachedUserAgentByTypeV2.replace("(a)", clientKey).replace("(b)", vimeiAndVimsi).replace("(c)", cachedManufacturerAndModel);
            }
            RpcJsonReq rpcJsonReq = new RpcJsonReq();
            rpcJsonReq.setBp(PluginManager.getRender().getEngineParams());
            rpcJsonReq.setExternal_info(mspContainerContext.getBizData());
            rpcJsonReq.setExtinfo(new JSONObject().toJSONString());
            rpcJsonReq.setPa(MspConfig.getInstance().getPa(mspContainerContext.getContext()));
            rpcJsonReq.setUa(cachedUserAgentByTypeV2);
            rpcJsonReq.setExtok(PhoneCashierMspEngine.getMspWallet().getAlipayExtok());
            rpcJsonReq.setUtdid(UTDevice.getUtdid(mspContainerContext.getContext()));
            Tid loadTID = TidHelper.loadTID(mspContainerContext.getContext(), mspContainerContext.getBizType());
            if (loadTID != null) {
                rpcJsonReq.setTid(loadTID.getTid());
            } else {
                LogUtil.record(8, "PreCashierLogicClient:queryRendData", "tid null");
            }
            rpcJsonReq.setNew_client_key(TidStorage.getInstance().genClientKey());
            IBizEngine mspUtils = PhoneCashierMspEngine.getMspUtils();
            JSONObject executeRpc = mspUtils.executeRpc(false, a2, riy.ARRAY_START_STR + JSON.toJSONString(rpcJsonReq) + riy.ARRAY_END_STR, this.mBizId, null);
            StringBuilder sb = new StringBuilder("resp=");
            sb.append(executeRpc.toJSONString());
            LogUtil.record(1, "MspUIClient:queryRendData", sb.toString());
            String jSONString = executeRpc.toJSONString();
            if (TextUtils.isEmpty(jSONString)) {
                PrefUtils.putInt(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_ERROR_TIMES_KEY, Integer.valueOf(PrefUtils.getInt(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_ERROR_TIMES_KEY, 0).intValue() + 1));
                LogUtil.record(1, "MspUIClient:onFirstReq", "rendData empty");
                MspContainerClient mspContainerClient2 = mspContainerContext.getMspContainerClient();
                if (mspContainerClient2 != null && mspContainerClient2.getMspContainerResult() != null) {
                    mspContainerClient2.getMspContainerResult().setErrorCode("100");
                }
                Context context2 = mspContainerContext.getContext();
                if (context2 != null) {
                    str = LanguageHelper.localizedStringForKey("mini_app_error", context2.getString(R.string.mini_app_error), new Object[0]);
                }
                ExceptionUtils.sendUiMsgWhenException(this.mBizId, new AppErrorException(ExceptionUtils.createExceptionMsg(str, 307)));
                return jSONObject;
            }
            ActionsCreator.get(mspContainerContext).createUIShowAction(JSON.parseObject(jSONString), false, new StEvent());
        }
        return jSONObject;
    }

    public JSONObject handleUiStartWithoutData(UIAction uIAction, MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fafae74e", new Object[]{this, uIAction, mspTradeContext});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        if (uIAction == null) {
            return jSONObject;
        }
        DataBundle<UIAction.DataKeys, Object> data = uIAction.getData();
        if (((Boolean) data.get(UIAction.DataKeys.isFirstEnter, Boolean.TRUE)).booleanValue()) {
            PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_PRE");
            if ((!OrderInfoUtil.isSettingsRequest(mspTradeContext) && !OrderInfoUtil.isForkRequest(mspTradeContext)) || OrderInfoUtil.isSettingChannelMode(this.mBizId) || OrderInfoUtil.isSettingDeductMode(this.mBizId)) {
                if (mspTradeContext.isRenderLocal()) {
                    String analysisRenderInfo = new OfflineRenderLogic().analysisRenderInfo(mspTradeContext.getContext(), mspTradeContext.getExtendParamsMap(), mspTradeContext.getExtendParamByKey(MspGlobalDefine.EXT_RENDER_DATA));
                    mspTradeContext.setSubmitState(false);
                    ActionsCreator.get(this.mMspContext).createUIShowAction(JSON.parseObject(analysisRenderInfo), false, new StEvent());
                    jSONObject.put("success", (Object) Boolean.TRUE);
                    return jSONObject;
                }
                boolean a2 = a();
                ActionsCreator.get(mspTradeContext).createSubmitEventAction(null, mspTradeContext.getOrderInfo(), EventAction.SubmitType.FirstRequestAfterPage, 0);
                jSONObject.put("success", (Object) Boolean.valueOf(a2));
                return jSONObject;
            } else if (OrderInfoUtil.isForkRequest(mspTradeContext)) {
                try {
                    ActionsCreator.get(mspTradeContext).createEventAction(MspEventCreator.get().createMspEventWithJsonString("handleUiStartWithoutData", URLDecoder.decode(OrderInfoUtil.parseForkAction(mspTradeContext), "UTF-8")));
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                    mspTradeContext.getMspUIClient().doDisposeWindow();
                }
                jSONObject.put("success", (Object) Boolean.TRUE);
                return jSONObject;
            } else {
                jSONObject.put("success", (Object) Boolean.valueOf(a()));
            }
        } else {
            String str = "";
            String str2 = (String) data.get(UIAction.DataKeys.action, str);
            String str3 = (String) data.get(UIAction.DataKeys.data, str);
            if (!TextUtils.isEmpty(str2)) {
                str = JSON.parseObject(str2).getString("name");
            }
            ActionsCreator.get(mspTradeContext).createSubmitEventAction(str, str3, EventAction.SubmitType.CommonRequestWithoutUI, 0);
            jSONObject.put("success", (Object) Boolean.valueOf(a()));
        }
        return jSONObject;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext == null) {
            return false;
        }
        MspUIClient mspUIClient = mspContext.getMspUIClient();
        MspWindowFrame mspWindowFrame = new MspWindowFrame();
        mspWindowFrame.setStatisticEvent(new StEvent());
        mspWindowFrame.setWindowType(10);
        boolean onWindowChanged = mspUIClient.onWindowChanged(mspWindowFrame);
        LogUtil.i("MspUIClient", "startMspUIWithLoading", "res=".concat(String.valueOf(onWindowChanged)));
        return onWindowChanged;
    }

    public JSONObject handleUiShow(UIAction uIAction) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ea0188c5", new Object[]{this, uIAction});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        if (uIAction == null) {
            return jSONObject;
        }
        if (this.mMspContext == null) {
            LogUtil.i("MspUIClient", "handleUiShow", "mMspContext == null");
            return jSONObject;
        }
        DataBundle<UIAction.DataKeys, Object> data = uIAction.getData();
        JSONObject jSONObject2 = (JSONObject) data.get(UIAction.DataKeys.renderData, null);
        boolean booleanValue = ((Boolean) data.get(UIAction.DataKeys.fromSync, Boolean.FALSE)).booleanValue();
        StEvent stEvent = (StEvent) data.get(UIAction.DataKeys.statistic, new StEvent());
        if (jSONObject2 == null) {
            return jSONObject;
        }
        if (this.mMspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_PRE");
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_PARSE");
        }
        if (!this.c.parseRendDataFromUIShow(jSONObject2, booleanValue, stEvent)) {
            LogUtil.i("MspUIClient", "handleUiShow", "parseRendDataFromUIShow return false");
            MspBasePresenter currentPresenter = getCurrentPresenter();
            if (currentPresenter != null && currentPresenter.mo545getIView() != null) {
                currentPresenter.mo545getIView().removeMaskView();
            }
            this.mMspContext.onCompensating(101);
        }
        jSONObject.put("success", (Object) Boolean.TRUE);
        return jSONObject;
    }

    private String a(MspContainerContext mspContainerContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b102cab", new Object[]{this, mspContainerContext});
        }
        String str = null;
        try {
            if (PrefUtils.getInt(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_ERROR_TIMES_KEY, 0).intValue() >= 2) {
                PrefUtils.clear(PrefUtils.BIZ_OP_TYPE);
            }
            JSONObject parseObject = JSON.parseObject(PrefUtils.getString(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_OP_TYPE_KEY, ""));
            if (parseObject != null && parseObject.getJSONObject("bizOpMap") != null) {
                str = parseObject.getJSONObject("bizOpMap").getString(mspContainerContext.getBizType());
                if (!TextUtils.isEmpty(str)) {
                    LogUtil.record(2, "MspUIClient:checkOpType", "local opType=".concat(String.valueOf(str)));
                    return str;
                }
            }
            if (this.b) {
                JSONObject executeRpc = PhoneCashierMspEngine.getMspUtils().executeRpc(false, DispatchType.FETCH_CONFIG, "", this.mBizId, null);
                this.b = false;
                if (executeRpc != null && (jSONObject = executeRpc.getJSONObject("bizOpMap")) != null) {
                    str = jSONObject.getString(mspContainerContext.getBizType());
                    PrefUtils.putString(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_OP_TYPE_KEY, executeRpc.toJSONString());
                }
                if (!TextUtils.isEmpty(str)) {
                    LogUtil.record(1, "MspUIClient:checkOpType", "rpc opType=".concat(String.valueOf(str)));
                    return str;
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        LogUtil.record(1, "MspUIClient:checkOpType", "opType=".concat(String.valueOf(str)));
        return str;
    }

    public void hidePrePageLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7366573", new Object[]{this});
            return;
        }
        PluginManager.getRender().callRender("'pageloading=0'");
        LogUtil.record(4, "phonecashiermsp#flybird", "MspUIClient:hidePrePageLoading", "hidePrePageLoading");
    }

    public void showPrePageLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4b8a6e", new Object[]{this});
            return;
        }
        PluginManager.getRender().callRender("'pageloading=1'");
        LogUtil.record(4, "phonecashiermsp#flybird", "MspUIClient:showPrePageLoading", "showPrePageLoading");
    }

    public void setHasActivityCreated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937e3cec", new Object[]{this, new Boolean(z)});
        } else {
            this.hasActivityCreated = z;
        }
    }

    public boolean isMspInProcessTask() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0db951a", new Object[]{this})).booleanValue() : this.d;
    }

    public void setMspInProcessTask(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd0a4446", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }
}
