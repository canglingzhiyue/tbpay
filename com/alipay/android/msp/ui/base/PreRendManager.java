package com.alipay.android.msp.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.util.Pair;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.render.api.ICashierRender;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.callback.IRenderCallback;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.dynfun.NativeTplRuntimeManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspByPassProcessor;
import com.alipay.android.msp.framework.helper.MspExperimentHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.RenderConfig;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.birdnest.api.BirdNestEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public class PreRendManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CONTEXT_NULL = 1;
    public static final int ERROR_EXCEPTION = 5;
    public static final int ERROR_TPL_DUP = 3;
    public static final int ERROR_TPL_ID_NULL = 2;
    public static final int ERROR_TPL_NOT_ENABLE = 4;
    public static final String SOURCE_BIZ = "biz";
    public static final String SOURCE_EVENT = "event";
    public static final String SOURCE_NET = "network";
    private static volatile PreRendManager c;
    public Boolean degradeDestroyFb = null;

    /* renamed from: a  reason: collision with root package name */
    private final LruCache<String, Pair<PreparedResult, View>> f4958a = new LruCache<String, Pair<PreparedResult, View>>(5) { // from class: com.alipay.android.msp.ui.base.PreRendManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
            if (str.hashCode() == -877389389) {
                super.entryRemoved(((Boolean) objArr[0]).booleanValue(), objArr[1], objArr[2], objArr[3]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public int a(String str, Pair<PreparedResult, View> pair) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd278cde", new Object[]{this, str, pair})).intValue();
            }
            return 1;
        }

        @Override // android.util.LruCache
        public /* synthetic */ void entryRemoved(boolean z, String str, Pair<PreparedResult, View> pair, Pair<PreparedResult, View> pair2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbb419b3", new Object[]{this, new Boolean(z), str, pair, pair2});
            } else {
                a(z, str, pair, pair2);
            }
        }

        @Override // android.util.LruCache
        public /* synthetic */ int sizeOf(String str, Pair<PreparedResult, View> pair) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("33c6036a", new Object[]{this, str, pair})).intValue() : a(str, pair);
        }

        public void a(boolean z, String str, Pair<PreparedResult, View> pair, Pair<PreparedResult, View> pair2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6d233e8", new Object[]{this, new Boolean(z), str, pair, pair2});
                return;
            }
            super.entryRemoved(z, str, pair, pair2);
            LogUtil.record(1, "PreRendManager:entryRemoved", " key=".concat(String.valueOf(str)));
        }
    };
    private final Object b = new Object();

    /* loaded from: classes3.dex */
    public interface OnTplPreRendListener {
        void onTplPreRendFail(int i);

        void onTplPreRendSuccess(String str);
    }

    public static /* synthetic */ Object a(PreRendManager preRendManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f2a5dd19", new Object[]{preRendManager}) : preRendManager.b;
    }

    public static /* synthetic */ void a(PreRendManager preRendManager, String str, Context context, int i, OnTplPreRendListener onTplPreRendListener, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86ba5504", new Object[]{preRendManager, str, context, new Integer(i), onTplPreRendListener, str2});
        } else {
            preRendManager.a(str, context, i, onTplPreRendListener, str2);
        }
    }

    private PreparedResult a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreparedResult) ipChange.ipc$dispatch("8f93d340", new Object[]{this, str});
        }
        Pair<PreparedResult, View> pair = this.f4958a.get(str);
        if (pair != null) {
            return pair.first;
        }
        return null;
    }

    private View b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8b9126f5", new Object[]{this, str});
        }
        Pair<PreparedResult, View> pair = this.f4958a.get(str);
        if (pair != null) {
            return pair.second;
        }
        return null;
    }

    private void a(String str, PreparedResult preparedResult, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f778e6", new Object[]{this, str, preparedResult, view});
            return;
        }
        if (a(str) != null) {
            a(str, true);
        }
        this.f4958a.put(str, new Pair<>(preparedResult, view));
    }

    private PreRendManager() {
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.ui.base.PreRendManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PluginManager.getRender().registerPreRenderResultClearHandler(new ICashierRender.PreRenderResultClearHandler() { // from class: com.alipay.android.msp.ui.base.PreRendManager.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.render.api.ICashierRender.PreRenderResultClearHandler
                        public void clearResultsWithTplId(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("eab6f02d", new Object[]{this, str});
                                return;
                            }
                            LogUtil.record(2, "PreRendManager:PreRenderResultClearHandler", "clearing any result with tplId = ".concat(String.valueOf(str)));
                            synchronized (PreRendManager.a(PreRendManager.this)) {
                                PreRendManager.a(PreRendManager.this, str);
                            }
                        }
                    });
                }
            }
        });
    }

    public static PreRendManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRendManager) ipChange.ipc$dispatch("ab02ffe3", new Object[0]);
        }
        if (c == null) {
            synchronized (PreRendManager.class) {
                if (c == null) {
                    c = new PreRendManager();
                }
            }
        }
        return c;
    }

    @Deprecated
    public void preRendTpl(final Context context, final int i, final String str, final OnTplPreRendListener onTplPreRendListener, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496438f6", new Object[]{this, context, new Integer(i), str, onTplPreRendListener, str2});
        } else if (context == null) {
            if (onTplPreRendListener == null) {
                return;
            }
            onTplPreRendListener.onTplPreRendFail(1);
        } else {
            if (this.degradeDestroyFb == null) {
                this.degradeDestroyFb = Boolean.valueOf(DrmManager.getInstance(context).isDegrade("DEGRADE_FB_LEAK_FIX", false, context));
            }
            if (MspByPassProcessor.isUpdateSceneEnabled("scene2")) {
                MspByPassProcessor.getInstance().triggerByPassProcess(LogItem.TemplateUpdateScene.CashierPreLoad);
            }
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
            if (mspContextByBizId instanceof MspTradeContext) {
                MspTradeContext mspTradeContext = (MspTradeContext) mspContextByBizId;
                Map<String, String> orderInfoMap = mspTradeContext.getOrderInfoMap();
                final String str3 = orderInfoMap.get("biz_type");
                String str4 = orderInfoMap.get(OrderInfoUtil.BIZ_SUB_TYPE_KEY);
                final String bizType = TradeCollector.getBizType(i);
                LogUtil.record(4, "PreRendManager:preRendTpl", "bizId=" + i + " bizType=" + str3 + " bizSubTyp=" + str4 + " action=" + str + " bizTypeFromOrder=" + bizType);
                NativeDynFunManager.processWithFallbackAsync(mspTradeContext.getBizId(), DynConstants.DynFunNames.F_TPL_PRELOAD, new Object[]{str, str3, str4, bizType}, new NativeDynFunManager.FallbackFunction<Void>() { // from class: com.alipay.android.msp.ui.base.PreRendManager.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.FallbackFunction
                    public Void call() {
                        String str5;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Void) ipChange2.ipc$dispatch("b898ca78", new Object[]{this});
                        }
                        if ((!TextUtils.isEmpty(str) && str.contains(MspFlybirdDefine.FLYBIRD_ACTION_CASHIER_PAY)) || str.contains("/card/signFinish")) {
                            str5 = MspFlybirdDefine.FLYBIRD_RESULT_TPL;
                        } else if (TextUtils.isEmpty(str) && TextUtils.equals(bizType, "pay_and_deduct")) {
                            str5 = MspFlybirdDefine.MDEDUCT_PAY_AND_SIGN_ID;
                        } else if ((TextUtils.isEmpty(str) && TextUtils.equals(str3, "switch_channel")) || (!TextUtils.isEmpty(str) && str.contains("/cashier/switchChannel"))) {
                            str5 = MspFlybirdDefine.CASHIER_CHANNEL_LOGO_TPL;
                        } else if ((!TextUtils.isEmpty(str) || TextUtils.equals(str3, "query_limit") || TextUtils.equals(str3, "switch_channel") || TextUtils.equals(bizType, "bindcardapp") || TextUtils.equals(bizType, MspEventTypes.ACTION_STRING_FORK) || TextUtils.equals(bizType, "confirm_goods")) && (TextUtils.isEmpty(str) || !str.contains("/cashier/main"))) {
                            str5 = (TextUtils.equals(bizType, "bindcardapp") || (!TextUtils.isEmpty(str) && (str.contains("/card/init") || str.contains("/frontpay/newCard")))) ? MspFlybirdDefine.CASHIER_CARD_NO_UNIFY_TPL : "";
                        } else {
                            str5 = MspFlybirdDefine.FLYBIRD_HOME_TPL;
                        }
                        String str6 = str5;
                        if (TextUtils.isEmpty(str6)) {
                            return null;
                        }
                        PreRendManager.this.doPreloadTpl(context, str6, i, onTplPreRendListener, str2);
                        return null;
                    }
                }, new NativeDynFunManager.ResultCallbackFunction<String>() { // from class: com.alipay.android.msp.ui.base.PreRendManager.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.framework.dynfun.NativeDynFunManager.ResultCallbackFunction
                    public void onResult(String str5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cfd30c6d", new Object[]{this, str5});
                        } else if (TextUtils.isEmpty(str5)) {
                        } else {
                            PreRendManager.this.doPreloadTpl(context, str5, i, onTplPreRendListener, str2);
                        }
                    }
                });
            }
            if (mspContextByBizId != null) {
                return;
            }
            doPreloadTpl(context, MspFlybirdDefine.BIZ_APP_COLLECT_ID, i, onTplPreRendListener, str2);
        }
    }

    public void doPreloadTpl(final Context context, final String str, final int i, final OnTplPreRendListener onTplPreRendListener, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1330610", new Object[]{this, context, str, new Integer(i), onTplPreRendListener, str2});
        } else if (context == null) {
            LogUtil.record(4, "PreRendManager:doPreloadTpl", "context=null");
            if (onTplPreRendListener == null) {
                return;
            }
            onTplPreRendListener.onTplPreRendFail(1);
        } else if (TextUtils.isEmpty(str)) {
            LogUtil.record(4, "PreRendManager:doPreloadTpl", "context=" + context + " tplId=" + str);
            if (onTplPreRendListener == null) {
                return;
            }
            onTplPreRendListener.onTplPreRendFail(2);
        } else {
            View b = b(str);
            if (b != null && PluginManager.getRender().getFbContextFromView(b) != null) {
                LogUtil.record(4, "PreRendManager:doPreloadTpl", "getFbContextFromView not null");
                if (onTplPreRendListener == null) {
                    return;
                }
                onTplPreRendListener.onTplPreRendFail(3);
                return;
            }
            LogUtil.record(4, "PreRendManager:doPreloadTpl", "try doPreloadTpl");
            if (TextUtils.equals(MspFlybirdDefine.BIZ_APP_COLLECT_ID, str) && !TaskHelper.isMainThread()) {
                a(str, context, i, onTplPreRendListener, str2);
            } else {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.ui.base.PreRendManager.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            PreRendManager.a(PreRendManager.this, str, context, i, onTplPreRendListener, str2);
                        }
                    }
                });
            }
        }
    }

    private void a(final String str, Context context, final int i, OnTplPreRendListener onTplPreRendListener, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13764e73", new Object[]{this, str, context, new Integer(i), onTplPreRendListener, str2});
        } else if (!needPreloadTpl(str, context)) {
            if (onTplPreRendListener == null) {
                return;
            }
            onTplPreRendListener.onTplPreRendFail(4);
        } else {
            EventLogUtil.logPayEvent("1010824", "targetTpl", str, "channel", str2);
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Object preloadView = PluginManager.getRender().preloadView(context, i, str, "", "{\"isPrerender\":true}", null, null, new IRenderCallback() { // from class: com.alipay.android.msp.ui.base.PreRendManager.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.core.callback.IRenderCallback
                    public void onEvent(Object obj, String str3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("9d9ed8a8", new Object[]{this, obj, str3});
                        } else {
                            onAsyncEvent(null, obj, str3);
                        }
                    }

                    @Override // com.alipay.android.msp.core.callback.IRenderCallback
                    public void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str3) {
                        BirdNestEngine.Params params;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ea659cdf", new Object[]{this, iTemplateClickCallback, obj, str3});
                            return;
                        }
                        EventAction createMspEventWithJsonString = MspEventCreator.get().createMspEventWithJsonString("PreRendManager.IRenderCallback.onAsyncEvent", str3);
                        if (createMspEventWithJsonString != null) {
                            createMspEventWithJsonString.setSender(obj);
                            createMspEventWithJsonString.setEventFrom("submit");
                            if (iTemplateClickCallback != null) {
                                createMspEventWithJsonString.setTemplateClickCallback(iTemplateClickCallback);
                            }
                        }
                        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                        LogUtil.record(2, "PreRendManager:onAsyncEvent", "mspContext=".concat(String.valueOf(mspContextByBizId)));
                        if (mspContextByBizId != null) {
                            ActionsCreator.get(mspContextByBizId).createEventAction(createMspEventWithJsonString);
                        } else if (TextUtils.equals(str, MspFlybirdDefine.BIZ_APP_COLLECT_ID)) {
                            if ((obj instanceof FBDocument) && (params = ((FBDocument) obj).param) != null) {
                                int i2 = -1;
                                try {
                                    i2 = Integer.parseInt(params.businessId);
                                } catch (Throwable th) {
                                    LogUtil.printExceptionStackTrace(th);
                                }
                                MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(i2);
                                if (mspContextByBizId2 != null) {
                                    ActionsCreator.get(mspContextByBizId2).createEventAction(createMspEventWithJsonString);
                                    return;
                                }
                            }
                            Map<Integer, MspContext> mspContextMap = MspContextManager.getInstance().getMspContextMap();
                            for (Integer num : mspContextMap.keySet()) {
                                MspContext mspContext = mspContextMap.get(num);
                                if (mspContext instanceof MspContainerContext) {
                                    MspContainerContext mspContainerContext = (MspContainerContext) mspContext;
                                    if (mspContainerContext.isBizAppCollectMoneyPage) {
                                        LogUtil.record(2, "PreRendManager:onEvent", "mspContainerContext=".concat(String.valueOf(mspContainerContext)));
                                        ActionsCreator.get(mspContainerContext).createEventAction(createMspEventWithJsonString);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }, new RenderConfig(true));
                if (preloadView == null) {
                    return;
                }
                if (onTplPreRendListener != null) {
                    onTplPreRendListener.onTplPreRendSuccess(str);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                View generateView = PluginManager.getRender().generateView(context, i, preloadView);
                long elapsedRealtime3 = SystemClock.elapsedRealtime();
                LogUtil.record(1, "PreRendManager:doPreloadTpl", "preload: " + str + " allTime : " + (elapsedRealtime3 - elapsedRealtime) + " preTime=" + (elapsedRealtime2 - elapsedRealtime) + " genViewTime=" + (elapsedRealtime3 - elapsedRealtime2));
                if (generateView == null) {
                    return;
                }
                a(str, preloadView instanceof PreparedResult ? (PreparedResult) preloadView : null, generateView);
                LogUtil.record(1, "PreRendManager:doPreloadTpl", "preLoadView notNull  mapSize=" + this.f4958a.size());
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                if (onTplPreRendListener == null) {
                    return;
                }
                onTplPreRendListener.onTplPreRendFail(5);
            }
        }
    }

    public Pair<PreparedResult, View> getPreloadedTpl(MspContext mspContext, String str, String str2) {
        BirdNestEngine.Params params;
        MspContext mspContextByBizId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("6c9c61c0", new Object[]{this, mspContext, str, str2});
        }
        LogUtil.record(1, "PreRendManager:getPreloadedTpl", " tplId:".concat(String.valueOf(str)));
        Context context = mspContext.getContext();
        LogUtil.record(1, "PreRendManager:getPreloadedTpl", " use fb deploy");
        synchronized (this.b) {
            LogUtil.record(1, "PreRendManager:getPreloadedTpl", " mapSize=" + this.f4958a.size() + " ContextViewMapSize=" + this.f4958a.size());
            View b = b(str);
            PreparedResult a2 = a(str);
            if (b != null) {
                Template template = a2 == null ? null : a2.mRenderedTpl;
                if (context == null || template == null) {
                    template = PluginManager.getRender().getLocalTemplate(str);
                }
                boolean z = !PluginManager.getRender().needUpdateLocalTpl(template, PluginManager.getRender().getServerTemplate(str, str2));
                LogUtil.record(4, "PreRendManager:canUsePreloadedResult", "fb deploy canuse:".concat(String.valueOf(z)));
                if (z) {
                    FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(b);
                    if (fbContextFromView instanceof FBDocument) {
                        FBDocument fBDocument = (FBDocument) fbContextFromView;
                        if (fBDocument.getContext() != context && !TextUtils.equals(str, MspFlybirdDefine.BIZ_APP_COLLECT_ID)) {
                            LogUtil.record(4, "PreRendManager:getPreloadedTpl", "document.getContext()" + fBDocument.getContext() + " context=" + context);
                            return null;
                        } else if (!TextUtils.equals(str, MspFlybirdDefine.BIZ_APP_COLLECT_ID) && (params = fBDocument.param) != null && (mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(Integer.parseInt(params.businessId))) != mspContext) {
                            LogUtil.record(4, "PreRendManager:getPreloadedTpl", "bizmspContext" + mspContextByBizId + " mspContext=" + mspContext);
                            return null;
                        }
                    }
                    a(str, false);
                    return new Pair<>(a2, b);
                }
            }
            LogUtil.record(1, "PreRendManager:getPreloadedTpl", "fb deploy getFbContextFromView null");
            a(str, true);
            return null;
        }
    }

    public void removeContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72793f92", new Object[]{this});
            return;
        }
        if (!Boolean.TRUE.equals(this.degradeDestroyFb)) {
            try {
                for (Map.Entry<String, Pair<PreparedResult, View>> entry : this.f4958a.snapshot().entrySet()) {
                    a(entry.getKey(), true);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "FBDestroy", th.getMessage());
            }
        }
        this.f4958a.evictAll();
        LogUtil.record(1, "PreRendManager:removeContext", "");
        if (!NativeTplRuntimeManager.drmEnabled()) {
            return;
        }
        NativeTplRuntimeManager.garbageRemoval(-1);
        NativeDynFunManager.garbageRemoval(-1);
    }

    private void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (!Boolean.TRUE.equals(this.degradeDestroyFb) && z) {
            try {
                View b = b(str);
                if (b != null) {
                    PluginManager.getRender().destroyView(b);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                Object obj = StatisticCollector.GLOBAL_AGENT;
                StatisticCollector.addError(obj, ErrorType.DEFAULT, "FBDestroy", "tplId: " + str + ", " + th.getMessage());
            }
        }
        this.f4958a.remove(str);
        LogUtil.record(1, "PreRendManager:removeContextTpl", " tpl=" + str + " mapSize=" + this.f4958a);
    }

    public boolean needPreloadTpl(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50bb0de", new Object[]{this, str, context})).booleanValue();
        }
        if (context == null) {
            context = GlobalHelper.getInstance().getContext();
        }
        if (!TextUtils.isEmpty(str) && context != null) {
            if (str.contains("bizapp-collect-money")) {
                try {
                    boolean isDegrade = DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_PREREND_BIZAPP_COLLECT_MONEY, false, context);
                    LogUtil.record(2, "PreRendManager:needPreloadTpl", "tplId=bizapp-collect-money needDegradBizapp=".concat(String.valueOf(isDegrade)));
                    return !isDegrade;
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            try {
                JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey("prerenderTpl");
                if (drmValueFromKey != null && str.startsWith("QUICKPAY@")) {
                    String substring = str.substring(9);
                    String string = drmValueFromKey.getString(substring);
                    if (!TextUtils.isEmpty(string)) {
                        boolean procGraySwitchWithRate = DrmManager.getInstance(context).procGraySwitchWithRate(context, Integer.parseInt(string));
                        LogUtil.record(2, "PreRendManager:needPreloadTpl", "tplId=" + substring + " needPreRend=" + procGraySwitchWithRate);
                        return procGraySwitchWithRate;
                    }
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        return false;
    }

    public void appendPreloadStat(final String str, int i, final boolean z, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3068963", new Object[]{this, str, new Integer(i), new Boolean(z), context});
            return;
        }
        final MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (mspContextByBizId == null) {
            return;
        }
        if (MspExperimentHelper.isGray(FastStartActivityHelper.CONFIG_KEY)) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.ui.base.PreRendManager.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean needPreloadTpl = PreRendManager.this.needPreloadTpl(str, context);
                    StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                    String str2 = str;
                    StringBuilder sb = new StringBuilder();
                    String str3 = "T";
                    sb.append(needPreloadTpl ? str3 : UTConstant.Args.UT_SUCCESS_F);
                    sb.append("|");
                    if (!z) {
                        str3 = UTConstant.Args.UT_SUCCESS_F;
                    }
                    sb.append(str3);
                    statisticInfo.addEvent(new StEvent(str2, "preRend", sb.toString()));
                }
            });
            return;
        }
        boolean needPreloadTpl = needPreloadTpl(str, context);
        StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
        StringBuilder sb = new StringBuilder();
        String str2 = "T";
        sb.append(needPreloadTpl ? str2 : UTConstant.Args.UT_SUCCESS_F);
        sb.append("|");
        if (!z) {
            str2 = UTConstant.Args.UT_SUCCESS_F;
        }
        sb.append(str2);
        statisticInfo.addEvent(new StEvent(str, "preRend", sb.toString()));
    }

    public void tplInfoNotify(Context context, String str, Bundle bundle) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76148fb0", new Object[]{this, context, str, bundle});
        } else if (context == null) {
            LogUtil.record(8, "MspWindowClient::tplInfoNotify", "context is null");
        } else if (DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_TPL_NOTIFY_UPDATE, false, context)) {
        } else {
            boolean isDegrade = DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_TPL_NOTIFY_UPDATE_LOG_CUT, false, context);
            StatisticInfo statisticInfo = null;
            if (isDegrade) {
                statisticInfo = new StatisticInfo(-1);
                statisticInfo.updateAttr(Vector.Trade, "bizType", "default");
            }
            try {
                TplNotifyProcessor.a(str, bundle, statisticInfo);
                if (statisticInfo == null) {
                    return;
                }
                statisticInfo.onStatisticEnd();
            } catch (Throwable th2) {
                if (!isDegrade) {
                    try {
                        StatisticInfo statisticInfo2 = new StatisticInfo(-1);
                        try {
                            statisticInfo2.updateAttr(Vector.Trade, "bizType", "default");
                            statisticInfo = statisticInfo2;
                        } catch (Throwable th3) {
                            statisticInfo = statisticInfo2;
                            th = th3;
                            if (statisticInfo != null) {
                                statisticInfo.onStatisticEnd();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                statisticInfo.addError("np", ErrorCode.DEFAULT_TPL_UPDATE_NOTIFY_EX, th2);
                LogUtil.record(8, "MspWindowClient::tplInfoNotify", "接收通知时发生异常");
                LogUtil.printExceptionStackTrace(th2);
                if (statisticInfo == null) {
                    return;
                }
                statisticInfo.onStatisticEnd();
            }
        }
    }

    public static /* synthetic */ void a(PreRendManager preRendManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6f20c3", new Object[]{preRendManager, str});
        } else {
            preRendManager.a(str, true);
        }
    }
}
