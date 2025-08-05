package com.alipay.android.app.render.birdnest.service.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.birdnest.BirdNestBuilder;
import com.alipay.android.app.render.birdnest.event.EventHandlerWrapper;
import com.alipay.android.app.render.birdnest.event.TElementEventHandler;
import com.alipay.android.app.render.birdnest.provider.CashierDevicePropProvider;
import com.alipay.android.app.render.birdnest.provider.CashierEmbedTemplateProvider;
import com.alipay.android.app.render.birdnest.provider.CashierEmojiProvider;
import com.alipay.android.app.render.birdnest.provider.CashierIdProvider;
import com.alipay.android.app.render.birdnest.provider.CashierResourceProvider;
import com.alipay.android.app.render.birdnest.provider.CashierSettingProvider;
import com.alipay.android.app.render.birdnest.provider.CashierTemplateTransport;
import com.alipay.android.app.render.birdnest.provider.CashierUiVideoProvider;
import com.alipay.android.app.render.birdnest.provider.CashierUiWidgetProvider;
import com.alipay.android.app.render.birdnest.service.BirdNestService;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.app.template.ITemplateDisposable;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBClickCallBack;
import com.flybird.FBDocument;
import com.flybird.session.standalone.model.PrepareResult;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class BirdNestSDKService extends BirdNestService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BirdNestEngine engine;
    private BirdNestEngine.LogTracer2 mBatchLogTracer;
    private BirdNestEngine.TemplateTransport transport = null;
    private BirdNestEngine.DevicePropProvider devicePropProvider = null;
    private BirdNestEngine.EmbedTemplateProvider embedTemplateProvider = null;
    private BirdNestEngine.ResourceProvider resourceProvider = null;
    private BirdNestEngine.IdProvider idProvider = null;
    private BirdNestEngine.SettingProvider settingProvider = null;
    private BirdNestEngine.UiWidgetProvider uiWidgetProvider = null;
    private BirdNestEngine.UiVideoProvider uiVideoProvider = null;
    private BirdNestEngine.EmojiProvider emojiProvider = null;

    public static /* synthetic */ Object ipc$super(BirdNestSDKService birdNestSDKService, String str, Object... objArr) {
        if (str.hashCode() == -653542958) {
            super.initialize((ICashierProvider) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.android.app.render.birdnest.service.BirdNestService
    public PrepareResult buildPrepareResult(BirdNestBuilder birdNestBuilder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrepareResult) ipChange.ipc$dispatch("925062db", new Object[]{this, birdNestBuilder});
        }
        return null;
    }

    @Override // com.alipay.android.app.render.birdnest.service.BirdNestService
    public void initialize(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d90bb9d2", new Object[]{this, iCashierProvider});
            return;
        }
        super.initialize(iCashierProvider);
        Context context = iCashierProvider.getContext();
        BirdNestEngine.init(context);
        try {
            this.engine = BirdNestEngine.create(new BirdNestEngine.Config(false, context, createTransport(), createEmbedTemplateProvider(), createResourceProvider(), createIdProvider(), createSettingProvider(), createLogTracer(), createUiWidgetProvider(), createUiVideoProvider(), createDevicePropProvider(), createEmojiProvider(), null));
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
        }
    }

    public BirdNestEngine getEngine() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BirdNestEngine) ipChange.ipc$dispatch("66fb5877", new Object[]{this}) : this.engine;
    }

    public BirdNestEngine.LogTracer2 createLogTracer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.LogTracer2) ipChange.ipc$dispatch("29168f57", new Object[]{this});
        }
        if (this.mBatchLogTracer == null) {
            this.mBatchLogTracer = new BirdNestEngine.LogTracer2() { // from class: com.alipay.android.app.render.birdnest.service.impl.BirdNestSDKService.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
                public void addCoreSampleLog(int i, long j, long j2, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b0cb276", new Object[]{this, new Integer(i), new Long(j), new Long(j2), str, str2});
                    }
                }

                @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
                public void addEventLog(String str, String str2, Map<String, String> map, Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("79292006", new Object[]{this, str, str2, map, map2});
                    }
                }

                @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
                public void addViewLog(Object obj, String str, String str2, Map<String, String> map, Map<String, String> map2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("159fcbd5", new Object[]{this, obj, str, str2, map, map2});
                    }
                }

                @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2
                public void flushCoreSampleLog() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("95053cbe", new Object[]{this});
                    }
                }

                @Override // com.alipay.birdnest.api.BirdNestEngine.LogTracer2, com.alipay.birdnest.api.BirdNestEngine.LogTracer
                public void trace(int i, int i2, String str, String str2, String str3, String str4, String str5, Map<String, String> map, Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("463bc02e", new Object[]{this, new Integer(i), new Integer(i2), str, str2, str3, str4, str5, map, th});
                    }
                }
            };
        }
        return this.mBatchLogTracer;
    }

    @Override // com.alipay.android.app.render.birdnest.service.BirdNestService
    public List<JSONObject> releaseResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1ecadc20", new Object[]{this, new Integer(i)});
        }
        if (i > 0) {
            this.engine.clearCachedElement(i, true);
        }
        return new ArrayList();
    }

    @Override // com.alipay.android.app.render.birdnest.service.BirdNestService
    public boolean onBackPressed(View view) {
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53902393", new Object[]{this, view})).booleanValue();
        }
        if (view == null || (tag = view.getTag(this.engine.getTagId())) == null) {
            return false;
        }
        if (tag instanceof ITemplateDisposable) {
            ITemplateDisposable iTemplateDisposable = (ITemplateDisposable) tag;
            return iTemplateDisposable.hiddenKeyboardService(false) || iTemplateDisposable.onKey(view, 4, null);
        } else if (!(tag instanceof FBDocument)) {
            return false;
        } else {
            FBDocument fBDocument = (FBDocument) tag;
            return fBDocument.hiddenKeyboardService(((Activity) view.getContext()).getWindow().getDecorView(), false) || fBDocument.mo650getBodyView().onKey(view, 4, null);
        }
    }

    private BirdNestEngine.TemplateTransport createTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.TemplateTransport) ipChange.ipc$dispatch("9ec5e97", new Object[]{this});
        }
        if (this.transport == null) {
            this.transport = new CashierTemplateTransport();
        }
        return this.transport;
    }

    private BirdNestEngine.EmbedTemplateProvider createEmbedTemplateProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.EmbedTemplateProvider) ipChange.ipc$dispatch("ee014107", new Object[]{this});
        }
        if (this.embedTemplateProvider == null) {
            this.embedTemplateProvider = new CashierEmbedTemplateProvider(this.mProvider);
        }
        return this.embedTemplateProvider;
    }

    private BirdNestEngine.ResourceProvider createResourceProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.ResourceProvider) ipChange.ipc$dispatch("13bae8ff", new Object[]{this});
        }
        if (this.resourceProvider == null) {
            this.resourceProvider = new CashierResourceProvider(this.mProvider);
        }
        return this.resourceProvider;
    }

    private BirdNestEngine.IdProvider createIdProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.IdProvider) ipChange.ipc$dispatch("e4c5c21f", new Object[]{this});
        }
        if (this.idProvider == null) {
            this.idProvider = new CashierIdProvider(this.mProvider);
        }
        return this.idProvider;
    }

    private BirdNestEngine.SettingProvider createSettingProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.SettingProvider) ipChange.ipc$dispatch("b4bbf9cd", new Object[]{this});
        }
        if (this.settingProvider == null) {
            this.settingProvider = new CashierSettingProvider(this.mProvider);
        }
        return this.settingProvider;
    }

    private BirdNestEngine.UiWidgetProvider createUiWidgetProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.UiWidgetProvider) ipChange.ipc$dispatch("ed9c1b3f", new Object[]{this});
        }
        if (this.uiWidgetProvider == null) {
            this.uiWidgetProvider = new CashierUiWidgetProvider(this.mProvider);
        }
        return this.uiWidgetProvider;
    }

    private BirdNestEngine.UiVideoProvider createUiVideoProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.UiVideoProvider) ipChange.ipc$dispatch("fc17185f", new Object[]{this});
        }
        if (this.uiVideoProvider == null) {
            this.uiVideoProvider = new CashierUiVideoProvider();
        }
        return this.uiVideoProvider;
    }

    private BirdNestEngine.EmojiProvider createEmojiProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.EmojiProvider) ipChange.ipc$dispatch("1a5ac921", new Object[]{this});
        }
        if (this.emojiProvider == null) {
            this.emojiProvider = new CashierEmojiProvider(this.mProvider);
        }
        return this.emojiProvider;
    }

    @Override // com.alipay.android.app.render.birdnest.service.BirdNestService
    public FBContext buildFBContext(BirdNestBuilder birdNestBuilder) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (FBContext) ipChange.ipc$dispatch("8e50c529", new Object[]{this, birdNestBuilder});
        }
        BirdNestEngine.Params params = new BirdNestEngine.Params();
        params.tid = birdNestBuilder.tplId;
        params.tplHtml = birdNestBuilder.tplHtml;
        params.tplJson = birdNestBuilder.tplJson;
        params.varJson = birdNestBuilder.data;
        if (birdNestBuilder.mCallbackProxy != null) {
            params.dtmEventListener = new EventHandlerWrapper(getEventHandler(birdNestBuilder));
        }
        LogUtils.record(2, "BirdNestSDKService::buildFBContext", "将构建的 FBContext: tplId: " + birdNestBuilder.tplId + " resClient: " + birdNestBuilder.resourceClient);
        params.actionBarHeight = birdNestBuilder.actionBarHeight;
        params.businessId = birdNestBuilder.businessId;
        params.context = birdNestBuilder.context;
        params.paramView = null;
        params.reuse = false;
        params.factory = birdNestBuilder.factory;
        params.jsPluginFactory = null;
        params.callback = birdNestBuilder.callback;
        params.keyboardService = birdNestBuilder.mKeyboardService;
        params.passwordService = birdNestBuilder.mPasswordService;
        params.bundleName = birdNestBuilder.bundleName;
        params.appParams = birdNestBuilder.appParams;
        params.eventTarget = birdNestBuilder.eventTarget;
        params.eventBridge = birdNestBuilder.eventBridge;
        params.resourceClient = birdNestBuilder.resourceClient;
        params.contextResources = birdNestBuilder.contextResources;
        params.jsDebugger = birdNestBuilder.jsDebugger;
        params.devicePropProvider = createDevicePropProvider();
        if (birdNestBuilder.displayHeight > 0 && birdNestBuilder.displayWidth > 0) {
            params.initialWinHeight = birdNestBuilder.displayHeight;
            params.initialWinWidth = birdNestBuilder.displayWidth;
        }
        String str = params.tplHtml;
        if (TextUtils.isEmpty(str) || TextUtils.equals("{}", str)) {
            str = params.tplJson;
        } else {
            i = 0;
        }
        return this.engine.generateFBContext(params, str, i);
    }

    private BirdNestEngine.DevicePropProvider createDevicePropProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine.DevicePropProvider) ipChange.ipc$dispatch("9b69355f", new Object[]{this});
        }
        if (this.devicePropProvider == null) {
            this.devicePropProvider = new CashierDevicePropProvider(this.mProvider);
        }
        return this.devicePropProvider;
    }

    private TElementEventHandler getEventHandler(final BirdNestBuilder birdNestBuilder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TElementEventHandler) ipChange.ipc$dispatch("789a0af6", new Object[]{this, birdNestBuilder}) : new TElementEventHandler() { // from class: com.alipay.android.app.render.birdnest.service.impl.BirdNestSDKService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.render.birdnest.event.TElementEventHandler
            public boolean onEvent(TElementEventHandler.EventType eventType, String str, com.alibaba.fastjson.JSONObject jSONObject, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("ce6e46ce", new Object[]{this, eventType, str, jSONObject, obj})).booleanValue();
                }
                if (birdNestBuilder.mCallbackProxy != null) {
                    birdNestBuilder.mCallbackProxy.onEvent(obj, jSONObject.toString());
                }
                return true;
            }

            @Override // com.alipay.android.app.render.birdnest.event.TElementEventHandler
            public boolean onAsyncEvent(TElementEventHandler.EventType eventType, String str, ITemplateClickCallback iTemplateClickCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("9de164b9", new Object[]{this, eventType, str, iTemplateClickCallback})).booleanValue();
                }
                if (birdNestBuilder.mCallbackProxy != null) {
                    if (iTemplateClickCallback instanceof FBClickCallBack) {
                        birdNestBuilder.mCallbackProxy.onAsyncEvent(iTemplateClickCallback, ((FBClickCallBack) iTemplateClickCallback).getDocument(), str);
                    } else {
                        birdNestBuilder.mCallbackProxy.onAsyncEvent(iTemplateClickCallback, null, str);
                    }
                }
                return true;
            }

            @Override // com.alipay.android.app.render.birdnest.event.TElementEventHandler
            public String onGetCustomAttr(Object obj, String str) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("8229915a", new Object[]{this, obj, str}) : birdNestBuilder.mCallbackProxy != null ? birdNestBuilder.mCallbackProxy.onGetCustomAttr(obj, str) : "";
            }
        };
    }
}
