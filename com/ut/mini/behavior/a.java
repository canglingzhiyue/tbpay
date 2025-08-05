package com.ut.mini.behavior;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import com.ut.mini.h;
import com.ut.mini.i;
import java.util.ArrayList;
import java.util.Map;
import tb.apr;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24078a;

    static {
        kge.a(-1721119208);
        f24078a = false;
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (f24078a) {
        } else {
            f24078a = true;
            apr.b("UTBehavior", "init");
            com.ut.mini.behavior.config.b.initConfig();
            ArrayList arrayList = new ArrayList();
            arrayList.add(com.ut.mini.behavior.module.a.UT_TAG);
            final int[] iArr = {-1};
            com.ut.mini.module.plugin.d.getInstance().registerPlugin(new com.ut.mini.module.plugin.a() { // from class: com.ut.mini.behavior.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ut.mini.module.plugin.a
                public String getPluginName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("fd12a725", new Object[]{this}) : "UTModule";
                }

                @Override // com.ut.mini.module.plugin.a
                public int[] getAttentionEventIds() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (int[]) ipChange2.ipc$dispatch("873e4cb7", new Object[]{this}) : iArr;
                }

                @Override // com.ut.mini.module.plugin.a
                public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
                    }
                    try {
                        return com.ut.mini.behavior.module.a.getInstance().makeTag(map);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }, false, arrayList, null);
            com.ut.mini.module.plugin.d.getInstance().registerPlugin(new com.ut.mini.module.plugin.a() { // from class: com.ut.mini.behavior.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ut.mini.module.plugin.a
                public String getPluginName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("fd12a725", new Object[]{this}) : "UTTrigger";
                }

                @Override // com.ut.mini.module.plugin.a
                public int[] getAttentionEventIds() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (int[]) ipChange2.ipc$dispatch("873e4cb7", new Object[]{this}) : iArr;
                }

                @Override // com.ut.mini.module.plugin.a
                public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
                    }
                    try {
                        c.getInstance().a(map);
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            }, false, null, null);
            com.ut.mini.module.trackerlistener.b.getInstance().registerListener(new com.ut.mini.module.trackerlistener.a() { // from class: com.ut.mini.behavior.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ut.mini.module.trackerlistener.a
                public String trackerListenerName() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1d8246a2", new Object[]{this}) : "UTTrigger";
                }

                @Override // com.ut.mini.module.trackerlistener.a
                public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
                        return;
                    }
                    h eventByKey = i.getInstance().getEventByKey(i.getInstance().getKeyForObject(obj));
                    eventByKey.setEventId(2001);
                    eventByKey.setContext(obj);
                    eventByKey.setPageName(str);
                    i.getInstance().beginEvent(eventByKey);
                }

                @Override // com.ut.mini.module.trackerlistener.a
                public void updatePageName(UTTracker uTTracker, Object obj, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
                        return;
                    }
                    h eventByKey = i.getInstance().getEventByKey(i.getInstance().getKeyForObject(obj));
                    eventByKey.setPageName(str);
                    i.getInstance().updateEventPageName(eventByKey);
                }

                @Override // com.ut.mini.module.trackerlistener.a
                public void updatePageProperties(UTTracker uTTracker, Object obj, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8d74df5d", new Object[]{this, uTTracker, obj, map});
                        return;
                    }
                    h eventByKey = i.getInstance().getEventByKey(i.getInstance().getKeyForObject(obj));
                    eventByKey.updateProperties(map);
                    i.getInstance().updateEvent(eventByKey);
                }

                @Override // com.ut.mini.module.trackerlistener.a
                public void pageDisAppear(UTTracker uTTracker, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
                        return;
                    }
                    h eventByKey = i.getInstance().getEventByKey(i.getInstance().getKeyForObject(obj));
                    eventByKey.setToLog(false);
                    eventByKey.setToTrigger(false);
                    i.getInstance().endEvent(eventByKey);
                }

                @Override // com.ut.mini.module.trackerlistener.a
                public void beginEvent(h hVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ca353937", new Object[]{this, hVar});
                    } else if (hVar == null) {
                    } else {
                        c.getInstance().a(hVar);
                    }
                }

                @Override // com.ut.mini.module.trackerlistener.a
                public void updateEventPageName(h hVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9d04b23d", new Object[]{this, hVar});
                    } else if (hVar == null) {
                    } else {
                        c.getInstance().a(hVar);
                    }
                }

                @Override // com.ut.mini.module.trackerlistener.a
                public void updateEvent(h hVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("816a9957", new Object[]{this, hVar});
                    } else if (hVar == null) {
                    } else {
                        c.getInstance().a(hVar);
                    }
                }

                @Override // com.ut.mini.module.trackerlistener.a
                public void endEvent(h hVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("63e15369", new Object[]{this, hVar});
                    } else if (hVar == null || hVar.getToLog() || !hVar.getToTrigger()) {
                    } else {
                        c.getInstance().a(hVar);
                    }
                }
            });
        }
    }
}
