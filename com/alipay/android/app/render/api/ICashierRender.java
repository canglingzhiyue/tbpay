package com.alipay.android.app.render.api;

import android.content.Context;
import android.view.View;
import com.alipay.android.app.cctemplate.api.ITplProvider;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.render.api.callback.ICashierRenderCallback;
import com.alipay.android.app.render.api.result.MspPrepareResult;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.app.render.api.result.RenderStatistic;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.session.standalone.model.CreateEngineOptions;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;
import org.json.JSONObject;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public interface ICashierRender {

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: classes3.dex */
    public interface PreRenderResultClearHandler {
        void clearResultsWithTplId(String str);
    }

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: classes3.dex */
    public enum TemplateLoadStatus {
        SUCCESS,
        FAILED
    }

    @Deprecated
    int callExecuteJs(View view, String str);

    void callOnreload(View view);

    void callRender(String str);

    void destroy(Context context, int i);

    void destroyView(View view);

    @Deprecated
    String executeJsWithResult(View view, String str);

    View generateView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback);

    View generateView(PreparedResult preparedResult);

    View generateViewWithPrepareResult(MspPrepareResult mspPrepareResult);

    String getEngineParams();

    String getEngineVersion();

    FBContext getFBContext(View view);

    FBPluginFactory getFBPluginFactory();

    TemplateKeyboardService getKeyBoardService();

    Template getLocalTemplate(String str);

    Template getServerTemplate(String str, String str2);

    ITplProvider getTplProvider();

    boolean needUpdateLocalTpl(Template template, Template template2);

    Template notifyTplUpdate(String str, String str2);

    Template notifyTplUpdate(String str, String str2, boolean z, LogItem.TemplateUpdateScene templateUpdateScene);

    boolean onBackPressed(View view);

    @Deprecated
    PreparedResult preloadView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback);

    @Deprecated
    PreparedResult preloadView(Context context, String str, String str2, String str3, Map<String, Object> map, ICashierRenderCallback iCashierRenderCallback, RenderParams renderParams, Map<String, String> map2);

    MspPrepareResult preloadViewNew(Context context, String str, String str2, String str3, JSONObject jSONObject, ICashierRenderCallback iCashierRenderCallback, RenderParams renderParams, Map<String, String> map, CreateEngineOptions createEngineOptions);

    void registerPreRenderResultClearHandler(PreRenderResultClearHandler preRenderResultClearHandler);

    boolean safeCallExecuteJs(View view, String str);

    void safeCallExecuteJsWithResult(View view, String str, FBContext.JsExecCallback jsExecCallback);

    void sendRenderEventReportForDecider(Template template, boolean z, long j);

    void setFBPluginFactory(FBPluginFactory fBPluginFactory);

    void setIsGenContextDelay(boolean z);

    void setKeyBoardService(TemplateKeyboardService templateKeyboardService);

    void setTplProvider(ITplProvider iTplProvider);

    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
    /* loaded from: classes3.dex */
    public class RenderParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static final ITemplateLoadStatusCallback b = new ITemplateLoadStatusCallback() { // from class: com.alipay.android.app.render.api.ICashierRender.RenderParams.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.android.app.render.api.ITemplateLoadStatusCallback
            public final boolean onNewBnDeployAskingUserShouldContinue() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("761ff92d", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // com.alipay.android.app.render.api.ITemplateLoadStatusCallback
            public final void onTemplateLoadResult(TemplateLoadStatus templateLoadStatus) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f31a0b21", new Object[]{this, templateLoadStatus});
                    return;
                }
                LogUtils.record(1, "TemplateLoadStatusCallback:onTemplateLoadResult", "status: " + templateLoadStatus);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private RenderStatistic f4356a;
        public int displayHeight;
        public int displayWidth;
        public boolean isPreRender;
        public ITemplateLoadStatusCallback mStatusCallback;
        public boolean onPadAdaptMode;
        public boolean tplDownloadSync;
        public LogItem.TemplateUpdateScene updateScene;

        public RenderParams(boolean z) {
            this(z, false);
        }

        public RenderParams(boolean z, boolean z2) {
            this(z, z2, LogItem.TemplateUpdateScene.Unset);
        }

        public RenderParams(boolean z, boolean z2, LogItem.TemplateUpdateScene templateUpdateScene) {
            this.isPreRender = false;
            this.tplDownloadSync = false;
            this.onPadAdaptMode = false;
            this.displayHeight = -1;
            this.displayWidth = -1;
            this.updateScene = LogItem.TemplateUpdateScene.Unset;
            this.f4356a = new RenderStatistic();
            this.isPreRender = z;
            this.mStatusCallback = b;
            this.tplDownloadSync = z2;
            this.updateScene = templateUpdateScene;
        }

        public RenderParams setTemplateLoadStatusCallback(ITemplateLoadStatusCallback iTemplateLoadStatusCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderParams) ipChange.ipc$dispatch("d8bc7b94", new Object[]{this, iTemplateLoadStatusCallback});
            }
            if (iTemplateLoadStatusCallback == null) {
                this.mStatusCallback = b;
            } else {
                this.mStatusCallback = iTemplateLoadStatusCallback;
            }
            return this;
        }

        public void setRenderStatistic(RenderStatistic renderStatistic) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9d31efd", new Object[]{this, renderStatistic});
            } else if (renderStatistic == null) {
                this.f4356a = new RenderStatistic();
            } else {
                this.f4356a = renderStatistic;
            }
        }

        public void setOnPadAdaptMode(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("515429fa", new Object[]{this, new Boolean(z)});
            } else {
                this.onPadAdaptMode = z;
            }
        }

        public void setDisplayHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cef5475", new Object[]{this, new Integer(i)});
            } else {
                this.displayHeight = i;
            }
        }

        public void setDisplayWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63a3fb76", new Object[]{this, new Integer(i)});
            } else {
                this.displayWidth = i;
            }
        }

        public RenderStatistic getRenderStatistic() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RenderStatistic) ipChange.ipc$dispatch("c4840e29", new Object[]{this}) : this.f4356a;
        }
    }
}
