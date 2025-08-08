package com.taobao.message.lab.comfrm.inner2.event;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventHandler;
import com.taobao.message.lab.comfrm.inner2.ExecuteService;
import com.taobao.message.lab.comfrm.inner2.ServiceProvider;
import com.taobao.message.lab.comfrm.inner2.js.JSFacade;
import com.taobao.message.lab.comfrm.inner2.js.JSIImpl;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.support.model.Action1;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.Observer;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class JsEventHandler implements EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] DEFAULT_FILES;
    private final String mContainerKey;
    private volatile ExecuteService mExecuteService;
    private final String[] mFiles;
    private final IResourceManager mResourceManager;
    private volatile boolean isLoad = false;
    private final JSFacade mJSFacade = new JSIImpl();

    public static /* synthetic */ ExecuteService access$002(JsEventHandler jsEventHandler, ExecuteService executeService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteService) ipChange.ipc$dispatch("84732df7", new Object[]{jsEventHandler, executeService});
        }
        jsEventHandler.mExecuteService = executeService;
        return executeService;
    }

    public static /* synthetic */ JSFacade access$100(JsEventHandler jsEventHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSFacade) ipChange.ipc$dispatch("45732ba3", new Object[]{jsEventHandler}) : jsEventHandler.mJSFacade;
    }

    static {
        kge.a(-613207761);
        kge.a(778700337);
        DEFAULT_FILES = new String[]{"script/libEventHandler.js", "script/messageEvent.js"};
    }

    public JsEventHandler(String str, IResourceManager iResourceManager, List<String> list) {
        int i = 0;
        this.mContainerKey = str;
        if (list == null || list.isEmpty()) {
            this.mFiles = DEFAULT_FILES;
        } else {
            this.mFiles = new String[list.size() + 1];
            this.mFiles[0] = "script/libEventHandler.js";
            while (i < list.size()) {
                int i2 = i + 1;
                this.mFiles[i2] = list.get(i);
                i = i2;
            }
        }
        this.mResourceManager = iResourceManager;
    }

    private boolean isEmpty(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e603f99", new Object[]{this, strArr})).booleanValue() : strArr == null || strArr.length == 0;
    }

    private synchronized void checkAndInitFramework(Context context, final ActionDispatcher actionDispatcher, final CommandHandler commandHandler, ServiceProvider serviceProvider) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f708c27", new Object[]{this, context, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        if (!this.isLoad && !isEmpty(this.mFiles)) {
            String[] strArr = new String[this.mFiles.length];
            int i = 0;
            while (true) {
                if (i >= this.mFiles.length) {
                    z = true;
                    break;
                }
                String fetchResource = this.mResourceManager.fetchResource(this.mFiles[i]);
                if (StringUtils.isEmpty(fetchResource)) {
                    z = false;
                    break;
                } else {
                    strArr[i] = fetchResource;
                    i++;
                }
            }
            if (z) {
                this.mJSFacade.initJS(context, "event|" + this.mContainerKey, Schedules.getLogic());
                for (String str : strArr) {
                    this.mJSFacade.executeJS2String(str, this.mFiles[0]);
                }
                this.mJSFacade.registerStringFunc("__mp_actionDispatcher__", new Action1<String>() { // from class: com.taobao.message.lab.comfrm.inner2.event.JsEventHandler.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Action1
                    public void call(String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("41c87a6f", new Object[]{this, str2});
                        } else {
                            actionDispatcher.dispatch(Action.fromJSONString(str2));
                        }
                    }
                });
                this.mJSFacade.registerStringFunc("__mp_commandHandler__", new Action1<String>() { // from class: com.taobao.message.lab.comfrm.inner2.event.JsEventHandler.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.support.model.Action1
                    public void call(String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("41c87a6f", new Object[]{this, str2});
                        } else {
                            commandHandler.handle(Command.fromJSONString(str2));
                        }
                    }
                });
                this.mJSFacade.registerStringFunc("__mp_execute__", new AnonymousClass3(serviceProvider));
                this.isLoad = true;
            }
        }
    }

    /* renamed from: com.taobao.message.lab.comfrm.inner2.event.JsEventHandler$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public class AnonymousClass3 implements Action1<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ServiceProvider val$serviceProvider;

        public AnonymousClass3(ServiceProvider serviceProvider) {
            this.val$serviceProvider = serviceProvider;
        }

        @Override // com.taobao.message.lab.comfrm.support.model.Action1
        public void call(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41c87a6f", new Object[]{this, str});
                return;
            }
            JSONObject jSONObject = null;
            try {
                jSONObject = JSON.parseObject(str);
            } catch (Exception unused) {
            }
            if (jSONObject == null) {
                return;
            }
            ExecuteService executeService = (ExecuteService) this.val$serviceProvider.service(ExecuteService.class);
            JsEventHandler.access$002(JsEventHandler.this, executeService);
            final String string = jSONObject.getString("callbackId");
            if (executeService != null) {
                executeService.execute(jSONObject.getString("request"), new Observer<Object>() { // from class: com.taobao.message.lab.comfrm.inner2.event.JsEventHandler.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.message.lab.comfrm.util.Observer
                    public void onData(final Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7658760c", new Object[]{this, obj});
                        } else {
                            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.event.JsEventHandler.3.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (string == null) {
                                    } else {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("callbackId", (Object) string);
                                        jSONObject2.put("type", (Object) "onData");
                                        jSONObject2.put("data", obj);
                                        JSFacade access$100 = JsEventHandler.access$100(JsEventHandler.this);
                                        String format = String.format("__mp_handle_callback__(%s)", jSONObject2.toJSONString());
                                        access$100.executeJS2String(format, "callbackId." + string + ".onData");
                                    }
                                }
                            });
                        }
                    }

                    @Override // com.taobao.message.lab.comfrm.util.Observer
                    public void onComplete() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                        } else {
                            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.event.JsEventHandler.3.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (string == null) {
                                    } else {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("callbackId", (Object) string);
                                        jSONObject2.put("type", (Object) "onComplete");
                                        JSFacade access$100 = JsEventHandler.access$100(JsEventHandler.this);
                                        String format = String.format("__mp_handle_callback__(%s)", jSONObject2.toJSONString());
                                        access$100.executeJS2String(format, "callbackId." + string + ".onComplete");
                                    }
                                }
                            });
                        }
                    }

                    @Override // com.taobao.message.lab.comfrm.util.Observer
                    public void onError(final String str2, final String str3, final Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b263e360", new Object[]{this, str2, str3, obj});
                        } else {
                            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.event.JsEventHandler.3.1.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (string == null) {
                                    } else {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("callbackId", (Object) string);
                                        jSONObject2.put("type", (Object) "onError");
                                        jSONObject2.put("errCode", (Object) str2);
                                        jSONObject2.put("errMsg", (Object) str3);
                                        jSONObject2.put("data", obj);
                                        JSFacade access$100 = JsEventHandler.access$100(JsEventHandler.this);
                                        String format = String.format("__mp_handle_callback__(%s)", jSONObject2.toJSONString());
                                        access$100.executeJS2String(format, "callbackId." + string + ".onError");
                                    }
                                }
                            });
                        }
                    }
                });
            } else if (string == null) {
            } else {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("callbackId", (Object) string);
                jSONObject2.put("type", (Object) "onError");
                jSONObject2.put("error", (Object) "not find ExecuteService");
                JSFacade access$100 = JsEventHandler.access$100(JsEventHandler.this);
                String format = String.format("__mp_handle_callback__(%s)", jSONObject2.toJSONString());
                access$100.executeJS2String(format, "callbackId." + string + ".onError");
            }
        }
    }

    private String getCode(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2995039d", new Object[]{this, action});
        }
        JSONObject json = action.toJSON();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", (Object) json);
        return String.format("__mp_handle__(%s)", JSON.toJSONString(jSONObject, new PropertyFilter() { // from class: com.taobao.message.lab.comfrm.inner2.event.JsEventHandler.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.fastjson.serializer.PropertyFilter
            public boolean apply(Object obj, String str, Object obj2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("12c7643b", new Object[]{this, obj, str, obj2})).booleanValue() : !(obj instanceof ViewObject) || !str.equals("info");
            }
        }, SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteNonStringKeyAsString));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.EventHandler
    public void handle(Action action, ActionDispatcher actionDispatcher, CommandHandler commandHandler, ServiceProvider serviceProvider) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b707af03", new Object[]{this, action, actionDispatcher, commandHandler, serviceProvider});
            return;
        }
        checkAndInitFramework(ApplicationUtil.getApplication(), actionDispatcher, commandHandler, serviceProvider);
        try {
            str = getCode(action);
        } catch (OutOfMemoryError unused) {
            Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg("JsEventHandler OutOfMemoryError. Retry.").build());
            AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "JsEventHandlerOOM", "allOOM", 1.0d);
            System.gc();
            try {
                String code = getCode(action);
                AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "JsEventHandlerOOM", "retrySuccess", 1.0d);
                str = code;
            } catch (OutOfMemoryError e) {
                Logger.ftl(new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg("JsEventHandlerOOM OutOfMemoryError. Not Available.").build());
                AppMonitor.Counter.commit(Constants.Monitor.MODULE_MONITOR, "JsEventHandlerOOM", "demote", 1.0d);
                if (ApplicationUtil.isDebug()) {
                    throw e;
                }
                return;
            }
        }
        if (this.mExecuteService != null) {
            this.mExecuteService.switchContext(action.getContext());
        }
        try {
            JSFacade jSFacade = this.mJSFacade;
            jSFacade.executeJS2String(str, "eventHandler." + action.getName());
        } finally {
            if (this.mExecuteService != null) {
                this.mExecuteService.switchContext(null);
            }
        }
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        JSFacade jSFacade = this.mJSFacade;
        if (jSFacade == null) {
            return;
        }
        jSFacade.executeJS2String("__mp_handle_dispose__()", "__mp_handle_dispose__");
        this.mJSFacade.destory();
    }

    /* loaded from: classes7.dex */
    public static final class EmptyAction implements Action1<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-997995058);
            kge.a(1771183651);
        }

        @Override // com.taobao.message.lab.comfrm.support.model.Action1
        public void call(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41c87a6f", new Object[]{this, str});
            }
        }

        private EmptyAction() {
        }
    }
}
