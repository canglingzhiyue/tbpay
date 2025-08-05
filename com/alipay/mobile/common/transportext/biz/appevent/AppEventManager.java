package com.alipay.mobile.common.transportext.biz.appevent;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.util.LogUtilAmnet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class AppEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<EventInterface> f5659a = new ArrayList(2);
    private static volatile boolean b = false;
    private static volatile EventInterface c = new EventInterface() { // from class: com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onSeceenOnEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70f150c6", new Object[]{this});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onSeceenOnEvent();
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onSeceenOffEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("25ed782e", new Object[]{this});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onSeceenOffEvent();
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onAppResumeEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7efc9c52", new Object[]{this});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onAppResumeEvent();
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onSyncInitChanged(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e64f75d4", new Object[]{this, map});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onSyncInitChanged(map);
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        @Override // com.alipay.mobile.common.transportext.biz.appevent.AppEventManager.EventInterface
        public void onAppLeaveEvent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("abfccd8c", new Object[]{this});
            } else if (a()) {
                for (EventInterface eventInterface : (EventInterface[]) AppEventManager.access$000().toArray(new EventInterface[AppEventManager.access$000().size()])) {
                    try {
                        eventInterface.onAppLeaveEvent();
                    } catch (Exception e) {
                        LogCatUtil.warn("amnet_AppEventManager", e);
                    }
                }
            }
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !AppEventManager.access$000().isEmpty();
        }
    };

    /* loaded from: classes3.dex */
    public interface EventInterface {
        void onAppLeaveEvent();

        void onAppResumeEvent();

        void onSeceenOffEvent();

        void onSeceenOnEvent();

        void onSyncInitChanged(Map<String, String> map);
    }

    public static /* synthetic */ List access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("54cf0df0", new Object[0]) : f5659a;
    }

    public static void register(EventInterface eventInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a05c57", new Object[]{eventInterface});
            return;
        }
        f5659a.add(eventInterface);
        if (b) {
            return;
        }
        init();
    }

    public static void unregister(EventInterface eventInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f029e", new Object[]{eventInterface});
        } else {
            f5659a.remove(eventInterface);
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (b) {
        } else {
            b = true;
            LogUtilAmnet.i("amnet_AppEventManager", "init: [ AppEventManager ] ");
            AmnetScreenOnOffReceiver.start();
        }
    }

    public static EventInterface getListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventInterface) ipChange.ipc$dispatch("5645b0e2", new Object[0]) : c;
    }
}
