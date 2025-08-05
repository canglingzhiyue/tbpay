package com.alipay.android.msp.plugin;

import android.content.Context;
import android.view.View;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.render.api.ICashierRender;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.msp.core.callback.IRenderCallback;
import com.alipay.android.msp.ui.base.keyboard.MspKeyboardService;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface IRender {
    @Deprecated
    int callExecuteJs(View view, String str);

    @Deprecated
    String callExecuteJsWithResult(View view, String str);

    void callOnreload(View view);

    void callRender(String str);

    void callRenderReload(String str);

    void destroy(int i, int i2, Context context);

    void destroyView(View view);

    View generateView(Context context, int i, Object obj) throws Throwable;

    View generateViewWithPrepareResult(Context context, int i, Object obj) throws Throwable;

    String getEngineParams();

    String getEngineVersion();

    FBContext getFbContextFromView(View view);

    Template getLocalTemplate(String str);

    MspKeyboardService getMspKeyboardService();

    Template getServerTemplate(String str, String str2);

    boolean needUpdateLocalTpl(Template template, Template template2);

    Template notifyTplUpdate(String str, String str2) throws Throwable;

    Template notifyTplUpdate(String str, String str2, boolean z, LogItem.TemplateUpdateScene templateUpdateScene) throws Throwable;

    boolean onBackPressed(View view);

    Object preloadView(Context context, int i, String str, String str2, String str3, JSONObject jSONObject, IRenderCallback iRenderCallback) throws Throwable;

    Object preloadView(Context context, int i, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, IRenderCallback iRenderCallback, RenderConfig renderConfig) throws Throwable;

    Object preloadViewNew(Context context, int i, String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, IRenderCallback iRenderCallback, RenderConfig renderConfig) throws Throwable;

    void registerPreRenderResultClearHandler(ICashierRender.PreRenderResultClearHandler preRenderResultClearHandler);

    boolean safeCallExecuteJs(View view, String str);

    void safeCallExecuteJsWithResult(View view, String str, FBContext.JsExecCallback jsExecCallback);
}
