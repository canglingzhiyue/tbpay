package com.taobao.message.lab.comfrm.inner2;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.inner2.config.TransformerInfo;
import com.taobao.message.lab.comfrm.inner2.config.TransformerItem;
import com.taobao.message.lab.comfrm.inner2.js.JSFacade;
import com.taobao.message.lab.comfrm.inner2.js.JSIImpl;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.support.model.Func1;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes7.dex */
public class JSTransformDispatcher implements Transformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mApplication;
    private String mClassNamespace;
    private String mContaienrKey;
    private final String mFile;
    private volatile JSFacade mJSFacade;
    private final List<TransformerItem> mJSFuncNameList;
    private IResourceManager mResourceManager;
    private final ExecutorService mTrans;
    private Dependecy mTransformItemDependecy;
    private Action mTransformingAction;
    private SharedState mTransformingState;
    private final boolean mUseRemote;
    private Plugin plugin;
    private volatile boolean isLoadFile = false;
    private boolean mAvailable = true;

    static {
        kge.a(498195849);
        kge.a(1437606424);
    }

    public static /* synthetic */ SharedState access$000(JSTransformDispatcher jSTransformDispatcher) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedState) ipChange.ipc$dispatch("16685add", new Object[]{jSTransformDispatcher}) : jSTransformDispatcher.mTransformingState;
    }

    public static /* synthetic */ boolean access$100(JSTransformDispatcher jSTransformDispatcher) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e61222c2", new Object[]{jSTransformDispatcher})).booleanValue() : jSTransformDispatcher.mUseRemote;
    }

    public static /* synthetic */ String access$200(JSTransformDispatcher jSTransformDispatcher) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95b54401", new Object[]{jSTransformDispatcher}) : jSTransformDispatcher.mClassNamespace;
    }

    public static /* synthetic */ Action access$300(JSTransformDispatcher jSTransformDispatcher) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Action) ipChange.ipc$dispatch("14ca887d", new Object[]{jSTransformDispatcher}) : jSTransformDispatcher.mTransformingAction;
    }

    public static /* synthetic */ Plugin access$400(JSTransformDispatcher jSTransformDispatcher) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Plugin) ipChange.ipc$dispatch("d3a4635e", new Object[]{jSTransformDispatcher}) : jSTransformDispatcher.plugin;
    }

    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue();
        }
        return this.mAvailable && !(this.mJSFacade != null ? this.mJSFacade.isDemote() : false);
    }

    public JSTransformDispatcher(Context context, String str, TransformerInfo transformerInfo, IResourceManager iResourceManager, ExecutorService executorService, boolean z, Plugin plugin, String str2) {
        this.mApplication = context;
        this.mContaienrKey = str;
        this.mJSFuncNameList = transformerInfo.jsTransformerList;
        this.mResourceManager = iResourceManager;
        this.mUseRemote = z;
        this.mTrans = executorService;
        this.mClassNamespace = str2;
        this.mFile = transformerInfo.jsFile;
        this.plugin = plugin;
    }

    public boolean hasInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bb429e55", new Object[]{this})).booleanValue() : this.isLoadFile || StringUtils.isEmpty(this.mFile);
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            checkAndInitFramework();
        }
    }

    private synchronized void checkAndInitFramework() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb49e066", new Object[]{this});
            return;
        }
        if (!this.isLoadFile) {
            long currentTimeMillis = System.currentTimeMillis();
            String fetchResource = this.mResourceManager.fetchResource(this.mFile);
            Logger.e(Constants.Monitor.POINT_JSTRANSFORME_TIME, "time|" + (System.currentTimeMillis() - currentTimeMillis));
            if (!StringUtils.isEmpty(fetchResource)) {
                this.mJSFacade = new JSIImpl();
                JSFacade jSFacade = this.mJSFacade;
                Context context = this.mApplication;
                jSFacade.initJS(context, "state|" + this.mContaienrKey, this.mTrans);
                if (ApplicationUtil.isDebug()) {
                    String fetchResource2 = this.mResourceManager.fetchResource("jsiRemoteInspect");
                    if (!StringUtils.isEmpty(fetchResource2)) {
                        this.mJSFacade.startRemoteInspect(fetchResource2);
                    }
                }
                this.mJSFacade.executeJS2String(fetchResource, this.mFile);
                this.mJSFacade.registerObjectFunc("__mp_getProp__", new Func1<String, Object>() { // from class: com.taobao.message.lab.comfrm.inner2.JSTransformDispatcher.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Func1
                    public Object call(String str) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("9eb2e8a3", new Object[]{this, str}) : JSTransformDispatcher.access$000(JSTransformDispatcher.this).getProp(str, Object.class, null);
                    }
                });
                this.mJSFacade.registerObjectFunc("__mp_getRuntimeData__", new Func1<String, Object>() { // from class: com.taobao.message.lab.comfrm.inner2.JSTransformDispatcher.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Func1
                    public Object call(String str) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("9eb2e8a3", new Object[]{this, str}) : JSTransformDispatcher.access$000(JSTransformDispatcher.this).getRuntimeData(str, Object.class, null);
                    }
                });
                this.mJSFacade.registerObjectFunc("__mp_getOriginalData__", new Func1<String, Object>() { // from class: com.taobao.message.lab.comfrm.inner2.JSTransformDispatcher.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Func1
                    public Object call(String str) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("9eb2e8a3", new Object[]{this, str}) : JSTransformDispatcher.access$000(JSTransformDispatcher.this).getOriginData(str, Object.class, null);
                    }
                });
                this.mJSFacade.registerObjectFunc("__mp_getJsRuntimeData__", new Func1<String, Object>() { // from class: com.taobao.message.lab.comfrm.inner2.JSTransformDispatcher.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Func1
                    public Object call(String str) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("9eb2e8a3", new Object[]{this, str}) : JSTransformDispatcher.access$000(JSTransformDispatcher.this).getJsRuntimeData(str, Object.class, null);
                    }
                });
                this.mJSFacade.registerDelayListFunc("__mp_splitPart__", new Func1<String, List>() { // from class: com.taobao.message.lab.comfrm.inner2.JSTransformDispatcher.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Func1
                    public List call(String str) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (List) ipChange2.ipc$dispatch("87b94bf8", new Object[]{this, str}) : ((SplitTransformer) ClassPool.instance().getInstance(str, SplitTransformer.class, (String) null, JSTransformDispatcher.access$100(JSTransformDispatcher.this), JSTransformDispatcher.access$200(JSTransformDispatcher.this))).transform(JSTransformDispatcher.access$300(JSTransformDispatcher.this), JSTransformDispatcher.access$000(JSTransformDispatcher.this), JSTransformDispatcher.access$000(JSTransformDispatcher.this).getDiff(), null);
                    }
                });
                this.mJSFacade.registerObjectFunc("__mp_onJSTransformerStart__", new Func1<String, Object>() { // from class: com.taobao.message.lab.comfrm.inner2.JSTransformDispatcher.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Func1
                    public Object call(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("9eb2e8a3", new Object[]{this, str});
                        }
                        TransformerItem transformerItem = (TransformerItem) JSONObject.parseObject(str).getObject("transformerItem", TransformerItem.class);
                        if (JSTransformDispatcher.access$400(JSTransformDispatcher.this) == null) {
                            return null;
                        }
                        JSTransformDispatcher.access$400(JSTransformDispatcher.this).onJSTransformerStart(JSTransformDispatcher.access$300(JSTransformDispatcher.this), transformerItem);
                        return null;
                    }
                });
                this.mJSFacade.registerObjectFunc("__mp_onJSTransformerEnd__", new Func1<String, Object>() { // from class: com.taobao.message.lab.comfrm.inner2.JSTransformDispatcher.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Func1
                    public Object call(String str) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ipChange2.ipc$dispatch("9eb2e8a3", new Object[]{this, str});
                        }
                        TransformerItem transformerItem = (TransformerItem) JSONObject.parseObject(str).getObject("transformerItem", TransformerItem.class);
                        if (JSTransformDispatcher.access$400(JSTransformDispatcher.this) == null) {
                            return null;
                        }
                        JSTransformDispatcher.access$400(JSTransformDispatcher.this).onJSTransformerEnd(JSTransformDispatcher.access$300(JSTransformDispatcher.this), transformerItem, new Dependecy());
                        return null;
                    }
                });
                this.isLoadFile = true;
            }
        }
    }

    private String getCode(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58c2ba9a", new Object[]{this, jSONObject});
        }
        String jSONString = JSON.toJSONString(jSONObject, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString);
        StringBuilder sb = new StringBuilder(17 + jSONString.length() + 1 + 2);
        sb.append("__mp_transform__(");
        sb.append(jSONString);
        sb.append(riy.BRACKET_END_STR);
        return sb.toString();
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Transformer
    public SharedState transform(Action action, SharedState sharedState) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedState) ipChange.ipc$dispatch("e602685c", new Object[]{this, action, sharedState});
        }
        List<TransformerItem> list = this.mJSFuncNameList;
        if (list == null || list.isEmpty() || this.mJSFacade == null) {
            return sharedState;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject json = action.toJSON();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", (Object) json);
        jSONObject.put("sharedState", (Object) new HashMap());
        jSONObject.put("transformerList", (Object) ((JSONArray) JSON.toJSON(this.mJSFuncNameList)));
        try {
            str = getCode(jSONObject);
        } catch (OutOfMemoryError e) {
            Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg("JSTransformDispatcher BuildJSState OutOfMemoryError. Retry.").ext(Constants.Monitor.POINT_JSTRANSFORME_TIME, Constants.Monitor.POINT_JSTRANSFORME_TIME).build());
            AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "transformOOM", "allOOM", 1.0d);
            System.gc();
            try {
                String code = getCode(jSONObject);
                AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "transformOOM", "retrySuccess", 1.0d);
                str = code;
            } catch (OutOfMemoryError unused) {
                Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg("JSTransformDispatcher BuildJSState OutOfMemoryError. Not Available.").ext(Constants.Monitor.POINT_JSTRANSFORME_TIME, Constants.Monitor.POINT_JSTRANSFORME_TIME).build());
                AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "transformOOM", "demote", 1.0d);
                if (ApplicationUtil.isDebug()) {
                    throw e;
                }
                this.mAvailable = false;
                return sharedState;
            }
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        Logger.e(Constants.Monitor.POINT_JSTRANSFORME_TIME, "buildJSState|size|" + uptimeMillis2 + "|length|" + str.length());
        this.mTransformingAction = action;
        this.mTransformingState = sharedState;
        JSONObject jSONObject2 = null;
        try {
            JSFacade jSFacade = this.mJSFacade;
            String executeJS2String = jSFacade.executeJS2String(str, "action." + action.getName());
            this.mTransformingAction = null;
            this.mTransformingState = null;
            if (executeJS2String != null) {
                try {
                    jSONObject2 = JSON.parseObject(executeJS2String);
                } catch (Exception e2) {
                    Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg("JSTransformDispatcher executeJS2String parse error").ext(Constants.Monitor.POINT_JSTRANSFORME_TIME, Constants.Monitor.POINT_JSTRANSFORME_TIME).build());
                    if (ApplicationUtil.isDebug()) {
                        throw e2;
                    }
                }
                SharedState updateJsRuntimeData = (jSONObject2 == null || jSONObject2.isEmpty()) ? sharedState : sharedState.updateJsRuntimeData(jSONObject2);
                long uptimeMillis3 = SystemClock.uptimeMillis() - uptimeMillis;
                Logger.e(Constants.Monitor.POINT_JSTRANSFORME_TIME, "updateJsTime|" + uptimeMillis3);
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("successCount", "1");
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue(Constants.Monitor.JSSTATE_BUILD_TIME, uptimeMillis2);
                create2.setValue(Constants.Monitor.EXECUTE_TIME, uptimeMillis3);
                AppMonitor.Stat.commit(Constants.Monitor.MODULE_MONITOR, Constants.Monitor.POINT_JSTRANSFORME_TIME, create, create2);
                return updateJsRuntimeData;
            }
            DimensionValueSet create3 = DimensionValueSet.create();
            create3.setValue("successCount", "0");
            MeasureValueSet create4 = MeasureValueSet.create();
            create4.setValue(Constants.Monitor.JSSTATE_BUILD_TIME, mto.a.GEO_NOT_SUPPORT);
            create4.setValue(Constants.Monitor.EXECUTE_TIME, mto.a.GEO_NOT_SUPPORT);
            AppMonitor.Stat.commit(Constants.Monitor.MODULE_MONITOR, Constants.Monitor.POINT_JSTRANSFORME_TIME, create3, create4);
            if ("1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "executeJSDemote", "1"))) {
                this.mAvailable = false;
            }
            return sharedState;
        } catch (Throwable th) {
            this.mTransformingAction = null;
            this.mTransformingState = null;
            throw th;
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else if (this.mJSFacade == null) {
        } else {
            this.mJSFacade.destory();
            this.mResourceManager = null;
            this.mTransformingAction = null;
            this.mTransformingState = null;
            this.mTransformItemDependecy = null;
            this.plugin = null;
        }
    }
}
