package com.taobao.message.chatv2.viewcenter;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chatv2.viewcenter.config.LayoutInfo;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.aura.INeedContainer;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.CommandHandler;
import com.taobao.message.lab.comfrm.inner2.EventManager;
import com.taobao.message.lab.comfrm.inner2.ExecuteService;
import com.taobao.message.lab.comfrm.inner2.PageService;
import com.taobao.message.lab.comfrm.inner2.config.EventHandlerItem;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceChangeObserver;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider;
import com.taobao.message.lab.comfrm.inner2.resource.ResourceManager;
import com.taobao.message.lab.comfrm.render.ViewQueryService;
import com.taobao.message.message_open_api_adapter.OpenApiService;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class EventServiceImpl implements IEventService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "EventServiceImpl";
    private Context context;
    private JSONArray eventHandlerConvertBlackList;
    private EventManager eventManager;
    private IResourceManager resourceManager;
    private ViewCenterProps viewCenterProps;
    private IViewCenterProvider viewCenterProvider;
    private Map<String, ActionDispatcher> actionDispatcherMap = new HashMap();
    private boolean enableEventHandlerConvertOpt = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "enableEventHandlerConvert", "1"));

    static {
        kge.a(-870221936);
        kge.a(-44671537);
    }

    public static /* synthetic */ EventManager access$000(EventServiceImpl eventServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventManager) ipChange.ipc$dispatch("cb5e7437", new Object[]{eventServiceImpl}) : eventServiceImpl.eventManager;
    }

    public static /* synthetic */ ViewCenterProps access$100(EventServiceImpl eventServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewCenterProps) ipChange.ipc$dispatch("4313d08b", new Object[]{eventServiceImpl}) : eventServiceImpl.viewCenterProps;
    }

    public static /* synthetic */ Map access$200(EventServiceImpl eventServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2cb7bb8d", new Object[]{eventServiceImpl}) : eventServiceImpl.actionDispatcherMap;
    }

    public static /* synthetic */ IViewCenterProvider access$300(EventServiceImpl eventServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IViewCenterProvider) ipChange.ipc$dispatch("19069e4f", new Object[]{eventServiceImpl}) : eventServiceImpl.viewCenterProvider;
    }

    public static /* synthetic */ boolean access$400(EventServiceImpl eventServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d7f429a", new Object[]{eventServiceImpl})).booleanValue() : eventServiceImpl.enableEventHandlerConvertOpt;
    }

    public static /* synthetic */ JSONArray access$500(EventServiceImpl eventServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("5886169", new Object[]{eventServiceImpl}) : eventServiceImpl.eventHandlerConvertBlackList;
    }

    public EventServiceImpl(ViewCenterProps viewCenterProps, Context context) {
        this.viewCenterProps = viewCenterProps;
        this.context = context;
        this.eventManager = createEventManager(context);
        String value = ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "eventHandlerConvertBlackList", null);
        if (!TextUtils.isEmpty(value)) {
            try {
                this.eventHandlerConvertBlackList = JSON.parseArray(value);
            } catch (Throwable th) {
                TLog.loge(TAG, Log.getStackTraceString(th));
            }
        }
    }

    public void setViewCenterProvider(IViewCenterProvider iViewCenterProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9891a084", new Object[]{this, iViewCenterProvider});
        } else {
            this.viewCenterProvider = iViewCenterProvider;
        }
    }

    public String getDataSource(String str) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61d81974", new Object[]{this, str});
        }
        try {
            intValue = Integer.valueOf(str).intValue();
        } catch (Exception unused) {
        }
        if (intValue >= 10000 && intValue < 11000) {
            return "im_cc";
        }
        if (intValue >= 0 && intValue < 10000) {
            return "im_cc";
        }
        if (intValue >= 11000 && intValue < 12000) {
            return "im_bc";
        }
        if (intValue >= 20000 && intValue < 30000) {
            return "imba";
        }
        return null;
    }

    @Override // com.taobao.message.chatv2.viewcenter.IEventService
    public EventDispatcher createEventDispatcher(final LayoutInfo layoutInfo, final Object obj, final ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventDispatcher) ipChange.ipc$dispatch("7e632a03", new Object[]{this, layoutInfo, obj, actionDispatcher});
        }
        if (actionDispatcher != null && layoutInfo != null) {
            Map<String, ActionDispatcher> map = this.actionDispatcherMap;
            map.put(layoutInfo.layoutId + actionDispatcher.hashCode(), actionDispatcher);
        }
        return new EventDispatcher() { // from class: com.taobao.message.chatv2.viewcenter.EventServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
                if (r3.getJSONObject("ext").containsKey(r9) != false) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
                r5 = r3.getJSONObject("ext").get(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
                if (r3.getJSONObject("ext").containsKey(r9) != false) goto L40;
             */
            @Override // com.taobao.message.lab.comfrm.core.EventDispatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void dispatch(final com.taobao.message.lab.comfrm.core.Event r13) {
                /*
                    Method dump skipped, instructions count: 393
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.chatv2.viewcenter.EventServiceImpl.AnonymousClass1.dispatch(com.taobao.message.lab.comfrm.core.Event):void");
            }
        };
    }

    @Override // com.taobao.message.chatv2.viewcenter.IEventService
    public <T> void registerService(Class<T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84aaa520", new Object[]{this, cls, t});
            return;
        }
        EventManager eventManager = this.eventManager;
        if (eventManager == null) {
            return;
        }
        eventManager.registerService(cls, t);
    }

    public void reInitEventManager(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f30fab", new Object[]{this, context});
            return;
        }
        this.context = context;
        this.eventManager.init(new ActionDispatcher() { // from class: com.taobao.message.chatv2.viewcenter.EventServiceImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
            public void dispatch(Action action) {
                ActionDispatcher actionDispatcher;
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("865d606c", new Object[]{this, action});
                    return;
                }
                Map<String, Object> context2 = action.getContext();
                Map map = (Map) context2.get("originData");
                String str = (String) context2.get("actionUniqueKey");
                if ("refresh".equals(action.getName())) {
                    Map map2 = (Map) action.getData();
                    if (map2 != null) {
                        for (String str2 : map2.keySet()) {
                            Object obj = map.get(str2);
                            if (obj == null || !obj.equals(map2.get(str2))) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        return;
                    }
                    if (ApplicationUtil.isDebug()) {
                        TLog.loge("viewcenter", "original data" + JSONObject.toJSONString(map));
                        TLog.loge("viewcenter", "refresh data" + JSONObject.toJSONString(map2));
                    }
                }
                TLog.logw("viewcenter", "refresh view:  |uni_id:" + str);
                if (TextUtils.isEmpty(str) || (actionDispatcher = (ActionDispatcher) EventServiceImpl.access$200(EventServiceImpl.this).get(str)) == null) {
                    return;
                }
                actionDispatcher.dispatch(action);
            }
        }, new CommandHandler() { // from class: com.taobao.message.chatv2.viewcenter.EventServiceImpl.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.CommandHandler
            public void handle(Command command) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("db6b56d4", new Object[]{this, command});
                    return;
                }
                Context context2 = context;
                if (!(context2 instanceof INeedContainer)) {
                    if (ApplicationUtil.isDebug()) {
                        throw new RuntimeException("没有实现INeedContainer，无法处理Command");
                    }
                    TLog.loge(EventServiceImpl.TAG, "没有实现INeedContainer，无法处理Command");
                    return;
                }
                INeedContainer iNeedContainer = (INeedContainer) context2;
                if (iNeedContainer != null) {
                    iNeedContainer.getContainer().notifyCommand(command);
                } else if (ApplicationUtil.isDebug()) {
                    throw new RuntimeException("找不到container，无法处理Command");
                } else {
                    TLog.loge(EventServiceImpl.TAG, "找不到container，无法处理Command");
                }
            }
        });
        this.eventManager.registerService(PageService.class, new PageService((Activity) context));
        this.eventManager.registerService(ExecuteService.class, new OpenApiService(context));
        this.eventManager.registerService(ViewQueryService.class, new ViewQueryService() { // from class: com.taobao.message.chatv2.viewcenter.EventServiceImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.render.ViewQueryService
            public View getView(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("c9ef8723", new Object[]{this, new Integer(i)});
                }
                View viewById = getViewById(EventServiceImpl.access$300(EventServiceImpl.this), i);
                if (viewById != null) {
                    return viewById;
                }
                Context context2 = context;
                if (context2 instanceof IViewCenterProvider) {
                    viewById = getViewById((IViewCenterProvider) context2, i);
                }
                if (viewById != null) {
                    return viewById;
                }
                Context context3 = context;
                return context3 instanceof INeedContainer ? getViewById((INeedContainer) context3, i) : viewById;
            }

            private View getViewById(IViewCenterProvider iViewCenterProvider, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("4fa4e761", new Object[]{this, iViewCenterProvider, new Integer(i)});
                }
                if (iViewCenterProvider != null && iViewCenterProvider.getViewCenterService() != null) {
                    return iViewCenterProvider.getViewCenterService().getView(i);
                }
                return null;
            }

            private View getViewById(INeedContainer iNeedContainer, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("8cf2414", new Object[]{this, iNeedContainer, new Integer(i)});
                }
                if (iNeedContainer != null && iNeedContainer.getContainer() != null && iNeedContainer.getContainer().getViewQueryService() != null) {
                    return iNeedContainer.getContainer().getViewQueryService().getView(i);
                }
                return null;
            }
        });
    }

    private EventManager createEventManager(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventManager) ipChange.ipc$dispatch("89612ecf", new Object[]{this, context});
        }
        CommandHandler commandHandler = new CommandHandler() { // from class: com.taobao.message.chatv2.viewcenter.EventServiceImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.CommandHandler
            public void handle(Command command) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("db6b56d4", new Object[]{this, command});
                    return;
                }
                Context context2 = context;
                if (!(context2 instanceof INeedContainer)) {
                    if (ApplicationUtil.isDebug()) {
                        throw new RuntimeException("没有实现INeedContainer，无法处理Command");
                    }
                    TLog.loge(EventServiceImpl.TAG, "没有实现INeedContainer，无法处理Command");
                    return;
                }
                INeedContainer iNeedContainer = (INeedContainer) context2;
                if (iNeedContainer != null) {
                    iNeedContainer.getContainer().notifyCommand(command);
                } else if (ApplicationUtil.isDebug()) {
                    throw new RuntimeException("找不到container，无法处理Command");
                } else {
                    TLog.loge(EventServiceImpl.TAG, "找不到container，无法处理Command");
                }
            }
        };
        ActionDispatcher actionDispatcher = new ActionDispatcher() { // from class: com.taobao.message.chatv2.viewcenter.EventServiceImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.core.ActionDispatcher
            public void dispatch(Action action) {
                ActionDispatcher actionDispatcher2;
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("865d606c", new Object[]{this, action});
                    return;
                }
                Map<String, Object> context2 = action.getContext();
                Map map = (Map) context2.get("originData");
                String str = (String) context2.get("actionUniqueKey");
                if ("refresh".equals(action.getName())) {
                    Map map2 = (Map) action.getData();
                    if (map2 != null) {
                        for (String str2 : map2.keySet()) {
                            Object obj = map.get(str2);
                            if (obj == null || !obj.equals(map2.get(str2))) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        return;
                    }
                    if (ApplicationUtil.isDebug()) {
                        TLog.loge("viewcenter", "original data" + JSONObject.toJSONString(map));
                        TLog.loge("viewcenter", "refresh data" + JSONObject.toJSONString(map2));
                    }
                }
                TLog.logw("viewcenter", "refresh view:  |uni_id:" + str);
                if (TextUtils.isEmpty(str) || (actionDispatcher2 = (ActionDispatcher) EventServiceImpl.access$200(EventServiceImpl.this).get(str)) == null) {
                    return;
                }
                actionDispatcher2.dispatch(action);
            }
        };
        ResourceManager resourceManager = new ResourceManager();
        resourceManager.addResourceProvider(new IResourceProvider() { // from class: com.taobao.message.chatv2.viewcenter.EventServiceImpl.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
            public void dispose() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("226c8326", new Object[]{this});
                }
            }

            @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
            public String fetchResource(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("59f10447", new Object[]{this, str});
                }
                return null;
            }

            @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceProvider
            public int getPriority() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
                }
                return 5;
            }

            @Override // com.taobao.message.lab.comfrm.inner2.resource.IResourceChangePublisher
            public void subscribeResourceChange(IResourceChangeObserver iResourceChangeObserver) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("92f0d3f5", new Object[]{this, iResourceChangeObserver});
                }
            }
        });
        String str = this.viewCenterProps.identifier;
        EventManager eventManager = new EventManager(str, "VC" + this.viewCenterProps.bizType, resourceManager, true, Collections.singletonList("script/dxCardEvent.js"), null, this.viewCenterProps.classNamespace);
        eventManager.init(actionDispatcher, commandHandler);
        eventManager.registerService(PageService.class, new PageService((Activity) context));
        eventManager.registerService(ExecuteService.class, new OpenApiService(context));
        eventManager.registerService(ViewQueryService.class, new ViewQueryService() { // from class: com.taobao.message.chatv2.viewcenter.EventServiceImpl.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.render.ViewQueryService
            public View getView(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("c9ef8723", new Object[]{this, new Integer(i)});
                }
                View viewById = getViewById(EventServiceImpl.access$300(EventServiceImpl.this), i);
                if (viewById != null) {
                    return viewById;
                }
                Context context2 = context;
                if (context2 instanceof IViewCenterProvider) {
                    viewById = getViewById((IViewCenterProvider) context2, i);
                }
                if (viewById != null) {
                    return viewById;
                }
                Context context3 = context;
                return context3 instanceof INeedContainer ? getViewById((INeedContainer) context3, i) : viewById;
            }

            private View getViewById(IViewCenterProvider iViewCenterProvider, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("4fa4e761", new Object[]{this, iViewCenterProvider, new Integer(i)});
                }
                if (iViewCenterProvider != null && iViewCenterProvider.getViewCenterService() != null) {
                    return iViewCenterProvider.getViewCenterService().getView(i);
                }
                return null;
            }

            private View getViewById(INeedContainer iNeedContainer, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (View) ipChange2.ipc$dispatch("8cf2414", new Object[]{this, iNeedContainer, new Integer(i)});
                }
                if (iNeedContainer != null && iNeedContainer.getContainer() != null && iNeedContainer.getContainer().getViewQueryService() != null) {
                    return iNeedContainer.getContainer().getViewQueryService().getView(i);
                }
                return null;
            }
        });
        this.resourceManager = resourceManager;
        return eventManager;
    }

    public static Map<String, Object> buildContextFromEventAction(Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5dbb8036", new Object[]{action});
        }
        Map<String, Object> context = action.getContext();
        HashMap hashMap = new HashMap();
        hashMap.put("originData", (Map) context.get("originData"));
        hashMap.put("actionUniqueKey", (String) context.get("actionUniqueKey"));
        return hashMap;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        EventManager eventManager = this.eventManager;
        if (eventManager != null) {
            eventManager.dispose();
        }
        IResourceManager iResourceManager = this.resourceManager;
        if (iResourceManager != null) {
            iResourceManager.dispose();
        }
        this.actionDispatcherMap.clear();
    }

    /* loaded from: classes7.dex */
    public class MyRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final ActionDispatcher actionDispatcher;
        private final Object data;
        private final Event event;
        private final List<EventHandlerItem> eventHandlerItemList;
        private final int[] finalIndexes;
        private final Object finalTplInstanceID;
        private final LayoutInfo layoutInfo;

        static {
            kge.a(-1595013475);
            kge.a(-1390502639);
        }

        public MyRunnable(List<EventHandlerItem> list, Object obj, int[] iArr, Event event, ActionDispatcher actionDispatcher, LayoutInfo layoutInfo, Object obj2) {
            this.eventHandlerItemList = list;
            this.data = obj;
            this.finalIndexes = iArr;
            this.event = event;
            this.actionDispatcher = actionDispatcher;
            this.layoutInfo = layoutInfo;
            this.finalTplInstanceID = obj2;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ff A[SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 319
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.chatv2.viewcenter.EventServiceImpl.MyRunnable.run():void");
        }
    }
}
