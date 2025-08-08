package com.taobao.message.lab.comfrm.inner2;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.config.EventHandlerItem;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.config.UserTrackItemInfo;
import com.taobao.message.lab.comfrm.inner2.event.EventHandleRuntime;
import com.taobao.message.lab.comfrm.render.SlotInstance;
import com.taobao.message.lab.comfrm.render.ViewDynamicInfo;
import com.taobao.message.lab.comfrm.support.ut.UserTrack;
import com.taobao.message.lab.comfrm.util.BeanUtil;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class LayoutProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2013510275);
    }

    public static void processLayout(LayoutInfo layoutInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbfb2bcb", new Object[]{layoutInfo});
        } else if (layoutInfo.children != null) {
            for (SlotInstance slotInstance : layoutInfo.children.values()) {
                if (slotInstance.type.equals("layout")) {
                    LayoutInfo layoutInfo2 = (LayoutInfo) JSON.parseObject(slotInstance.data, LayoutInfo.class);
                    slotInstance.dataObject = layoutInfo2;
                    if (layoutInfo2 != null) {
                        processLayout(layoutInfo2);
                    }
                } else if (slotInstance.type.equals("layoutList")) {
                    List<LayoutInfo> parseArray = JSON.parseArray(slotInstance.data, LayoutInfo.class);
                    slotInstance.dataObject = parseArray;
                    if (parseArray != null) {
                        for (LayoutInfo layoutInfo3 : parseArray) {
                            processLayout(layoutInfo3);
                        }
                    }
                } else if (slotInstance.type.equals("dynamic")) {
                    ViewDynamicInfo viewDynamicInfo = (ViewDynamicInfo) JSON.parseObject(slotInstance.data, ViewDynamicInfo.class);
                    slotInstance.dataObject = viewDynamicInfo;
                    if (viewDynamicInfo != null && viewDynamicInfo.pool != null) {
                        for (LayoutInfo layoutInfo4 : viewDynamicInfo.pool.values()) {
                            processLayout(layoutInfo4);
                        }
                    }
                }
            }
        }
    }

    public static Action buildEventAction(EventHandlerItem eventHandlerItem, Object obj, int[] iArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("f8268fef", new Object[]{eventHandlerItem, obj, iArr, map});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : eventHandlerItem.data.entrySet()) {
            Object bindData = bindData(entry.getValue(), obj, iArr, Object.class, false);
            if (bindData != null) {
                hashMap.put(entry.getKey(), bindData);
            }
        }
        return new Action.Build(eventHandlerItem.type).data(hashMap).context(map).build();
    }

    public static Action buildEventAction(EventHandlerItem eventHandlerItem, Map<String, Object> map, int[] iArr, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Action) ipChange.ipc$dispatch("d16833d8", new Object[]{eventHandlerItem, map, iArr, map2});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : eventHandlerItem.data.entrySet()) {
            Object obj = map.get(entry.getKey());
            if (obj != null) {
                hashMap.put(entry.getKey(), obj);
            }
        }
        return new Action.Build(eventHandlerItem.type).data(hashMap).context(map2).build();
    }

    public static EventHandleRuntime buildEventRuntime(EventHandlerItem eventHandlerItem, Object obj, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventHandleRuntime) ipChange.ipc$dispatch("60a8b222", new Object[]{eventHandlerItem, obj, iArr});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : eventHandlerItem.data.entrySet()) {
            Object bindData = bindData(entry.getValue(), obj, iArr, Object.class, false);
            if (bindData != null) {
                hashMap.put(entry.getKey(), bindData);
            }
        }
        EventHandleRuntime eventHandleRuntime = new EventHandleRuntime();
        eventHandleRuntime.type = eventHandlerItem.type;
        eventHandleRuntime.runtimeType = eventHandlerItem.runtimeType;
        eventHandleRuntime.enable = eventHandlerItem.enable;
        eventHandleRuntime.data = hashMap;
        if (eventHandlerItem.next != null && !eventHandlerItem.next.isEmpty()) {
            eventHandleRuntime.next = new HashMap(eventHandlerItem.next.size());
            for (Map.Entry<String, List<EventHandlerItem>> entry2 : eventHandlerItem.next.entrySet()) {
                ArrayList arrayList = new ArrayList(entry2.getValue().size());
                eventHandleRuntime.next.put(entry2.getKey(), arrayList);
                for (EventHandlerItem eventHandlerItem2 : entry2.getValue()) {
                    arrayList.add(buildEventRuntime(eventHandlerItem2, obj, iArr));
                }
            }
        }
        return eventHandleRuntime;
    }

    public static ViewObject buildViewObject(LayoutInfo layoutInfo, Object obj, int[] iArr, boolean z) {
        ViewDynamicInfo viewDynamicInfo;
        ArrayList arrayList;
        int[] copyOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewObject) ipChange.ipc$dispatch("c0b236f5", new Object[]{layoutInfo, obj, iArr, new Boolean(z)});
        }
        ViewObject viewObject = new ViewObject();
        viewObject.indexs = iArr;
        viewObject.info = layoutInfo;
        if (obj instanceof SharedState) {
            viewObject.diff = ((SharedState) obj).getDiff();
        }
        if (layoutInfo.uniqueId != null) {
            Object bindData = bindData(layoutInfo.uniqueId, obj, iArr, Object.class, z);
            if (bindData instanceof String) {
                viewObject.uniqueId = (String) bindData;
            }
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : layoutInfo.data.entrySet()) {
            Object bindData2 = bindData(entry.getValue(), obj, iArr, Object.class, z);
            if (bindData2 != null) {
                jSONObject.put(entry.getKey(), bindData2);
            }
        }
        viewObject.data = jSONObject;
        if (layoutInfo.children != null && !layoutInfo.children.isEmpty()) {
            for (Map.Entry<String, SlotInstance> entry2 : layoutInfo.children.entrySet()) {
                if (entry2.getValue().type.equals("layout")) {
                    LayoutInfo layoutInfo2 = (LayoutInfo) entry2.getValue().dataObject;
                    if (layoutInfo2 != null) {
                        viewObject.children.put(entry2.getKey(), buildViewObject(layoutInfo2, obj, iArr, z));
                    }
                } else if (entry2.getValue().type.equals("layoutList")) {
                    List<LayoutInfo> list = (List) entry2.getValue().dataObject;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (LayoutInfo layoutInfo3 : list) {
                            arrayList2.add(buildViewObject(layoutInfo3, obj, iArr, z));
                        }
                        viewObject.children.put(entry2.getKey(), arrayList2);
                    }
                } else if (entry2.getValue().type.equals("dynamic") && (viewDynamicInfo = (ViewDynamicInfo) entry2.getValue().dataObject) != null) {
                    List list2 = (List) bindData(viewDynamicInfo.dynamicData, obj, iArr, List.class, z);
                    if (list2 != null) {
                        arrayList = new ArrayList(list2.size());
                        for (int i = 0; i < list2.size(); i++) {
                            if (iArr == null) {
                                copyOf = new int[]{i};
                            } else {
                                copyOf = Arrays.copyOf(iArr, iArr.length + 1);
                                copyOf[iArr.length] = i;
                            }
                            String str = (String) bindData(viewDynamicInfo.dynamicType, obj, copyOf, String.class, z);
                            if (str != null) {
                                arrayList.add(buildViewObject(viewDynamicInfo.pool.get(str), obj, copyOf, z));
                            } else {
                                arrayList.add(new ViewObject());
                            }
                        }
                    } else {
                        arrayList = new ArrayList(0);
                    }
                    viewObject.children.put(entry2.getKey(), arrayList);
                }
            }
        }
        return viewObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static <T> T bindData(String str, Object obj, int[] iArr, Class<T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("fcef8d9", new Object[]{str, obj, iArr, cls, new Boolean(z)});
        }
        String str2 = str;
        if (iArr != null) {
            try {
                if (iArr.length > 9 && ApplicationUtil.isDebug()) {
                    throw new RuntimeException("not support");
                }
                String str3 = str;
                for (int i = 0; i < iArr.length; i++) {
                    try {
                        str3 = str3.replace("#" + i, String.valueOf(iArr[i]));
                    } catch (Throwable th) {
                        th = th;
                        str = (T) str3;
                        Logger.e("LayoutProtocol", th.toString() + "|" + str);
                        if (ApplicationUtil.isDebug()) {
                            throw new RuntimeException(str, th);
                        }
                        return null;
                    }
                }
                str2 = (T) str3;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (str2.startsWith("${")) {
            String substring = str2.substring(2, str2.length() - 1);
            if (z && substring.startsWith("jsRuntimeData.")) {
                substring = substring.replaceFirst("jsRuntimeData.", "runtimeData.");
            }
            T t = (T) BeanUtil.get(obj, substring);
            if (!cls.isInstance(t)) {
                return null;
            }
            return t;
        } else if (str2.startsWith("@query{")) {
            String[] split = str2.substring(7, str2.length() - 1).split(",");
            if (split.length > 0) {
                Object[] objArr = new Object[split.length];
                new StringBuilder();
                for (int i2 = 0; i2 < split.length; i2++) {
                    objArr[i2] = bindData(split[i2], obj, null, Object.class, z);
                }
                T t2 = (T) objArr[0];
                for (int i3 = 1; i3 < objArr.length; i3++) {
                    if (!(objArr[i3] instanceof String) || (t2 = (T) BeanUtil.getRaw(t2, String.valueOf(objArr[i3]))) == null) {
                        return null;
                    }
                }
                if (cls.isInstance(t2)) {
                    return t2;
                }
            }
            return null;
        } else if (str2.startsWith("@parseJSON{")) {
            String[] split2 = str2.substring(11, str2.length() - 1).split(",");
            if (split2.length > 0) {
                Object[] objArr2 = new Object[split2.length];
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < split2.length; i4++) {
                    objArr2[i4] = bindData(split2[i4], obj, null, Object.class, z);
                    if (i4 > 0) {
                        if (i4 > 1) {
                            sb.append('.');
                        }
                        sb.append(objArr2[i4]);
                    }
                }
                Object obj2 = objArr2[0];
                if (obj2 != null && (obj2 instanceof String)) {
                    if (((String) obj2).startsWith(riy.BLOCK_START_STR)) {
                        obj2 = JSONObject.parseObject((String) obj2);
                    } else if (((String) obj2).startsWith(riy.ARRAY_START_STR)) {
                        obj2 = JSONObject.parseArray((String) obj2);
                    }
                }
                T t3 = (T) BeanUtil.get(obj2, sb.toString());
                if (cls.isInstance(t3)) {
                    return t3;
                }
            }
            return null;
        } else {
            if (str2.startsWith(riy.BLOCK_START_STR)) {
                try {
                    ?? r0 = (T) new JSONObject();
                    JSONObject parseObject = JSONObject.parseObject(str2);
                    for (String str4 : parseObject.keySet()) {
                        r0.put(str4, bindData(parseObject.getString(str4), obj, iArr, Object.class, z));
                    }
                    return r0;
                } catch (Exception unused) {
                }
            }
            if (!cls.isInstance(str2)) {
                return null;
            }
            return (T) str2;
        }
    }

    public static UserTrack bindUserTrack(ViewObject viewObject, Event event, Object obj, LayoutInfo layoutInfo, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserTrack) ipChange.ipc$dispatch("5110ce9e", new Object[]{viewObject, event, obj, layoutInfo, new Boolean(z)});
        }
        UserTrack userTrack = null;
        UserTrackItemInfo userTrackItemInfo = (viewObject.info.userTrack == null || viewObject.info.userTrack.actions == null) ? null : viewObject.info.userTrack.actions.get(event.getName());
        if (userTrackItemInfo == null && viewObject.info.renderTemplate != null && "widget.message.common.itemwrapper".equals(viewObject.info.renderTemplate.name) && viewObject.children != null) {
            Object obj2 = viewObject.children.get("content");
            if ((obj2 instanceof ViewObject) && viewObject.info.userTrack != null && viewObject.info.userTrack.actions != null) {
                userTrackItemInfo = ((ViewObject) obj2).info.userTrack.actions.get(event.getName());
            }
        }
        if (userTrackItemInfo != null) {
            userTrack = new UserTrack();
            if (layoutInfo.userTrack != null) {
                userTrack.pageName = (String) bindData(layoutInfo.userTrack.pageName, obj, viewObject.indexs, String.class, z);
                userTrack.spmB = (String) bindData(layoutInfo.userTrack.spmB, obj, viewObject.indexs, String.class, z);
            }
            userTrack.name = userTrackItemInfo.name;
            userTrack.spmC = userTrackItemInfo.spmC;
            userTrack.spmD = userTrackItemInfo.spmD;
            userTrack.eventId = userTrackItemInfo.eventId;
            if (StringUtils.isEmpty(userTrackItemInfo.actionName)) {
                userTrack.actionName = event.getName();
            } else {
                userTrack.actionName = userTrackItemInfo.actionName;
            }
            if (userTrackItemInfo.args != null && !userTrackItemInfo.args.isEmpty()) {
                HashMap hashMap = new HashMap(userTrackItemInfo.args.size());
                for (Map.Entry<String, String> entry : userTrackItemInfo.args.entrySet()) {
                    Object bindData = bindData(entry.getValue(), obj, viewObject.indexs, Object.class, z);
                    if (bindData != null) {
                        hashMap.put(entry.getKey(), bindData);
                    }
                }
                userTrack.args = hashMap;
            }
            userTrack.indexs = viewObject.indexs;
        }
        return userTrack;
    }

    public static EventHandleRuntime buildEventRuntimeWithExpressionMap(EventHandlerItem eventHandlerItem, Map<String, Object> map, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventHandleRuntime) ipChange.ipc$dispatch("1f65653f", new Object[]{eventHandlerItem, map, iArr});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : eventHandlerItem.data.entrySet()) {
            Object obj = map.get(replaceIndex(entry.getValue(), iArr));
            if (obj != null) {
                hashMap.put(entry.getKey(), obj);
            }
        }
        EventHandleRuntime eventHandleRuntime = new EventHandleRuntime();
        eventHandleRuntime.type = eventHandlerItem.type;
        eventHandleRuntime.runtimeType = eventHandlerItem.runtimeType;
        eventHandleRuntime.enable = eventHandlerItem.enable;
        eventHandleRuntime.data = hashMap;
        if (eventHandlerItem.next != null && !eventHandlerItem.next.isEmpty()) {
            eventHandleRuntime.next = new HashMap(eventHandlerItem.next.size());
            for (Map.Entry<String, List<EventHandlerItem>> entry2 : eventHandlerItem.next.entrySet()) {
                ArrayList arrayList = new ArrayList(entry2.getValue().size());
                eventHandleRuntime.next.put(entry2.getKey(), arrayList);
                for (EventHandlerItem eventHandlerItem2 : entry2.getValue()) {
                    arrayList.add(buildEventRuntimeWithExpressionMap(eventHandlerItem2, map, iArr));
                }
            }
        }
        return eventHandleRuntime;
    }

    public static Map<String, Object> buildWithExpressionMap(ViewObject viewObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a24902b9", new Object[]{viewObject, obj});
        }
        HashMap hashMap = new HashMap();
        if (viewObject.info.eventHandler == null) {
            return hashMap;
        }
        for (List<EventHandlerItem> list : viewObject.info.eventHandler.values()) {
            for (EventHandlerItem eventHandlerItem : list) {
                if (eventHandlerItem.data != null && eventHandlerItem.data.size() != 0) {
                    for (Map.Entry<String, Object> entry : buildEventRuntime(eventHandlerItem, obj, viewObject.indexs).data.entrySet()) {
                        hashMap.put(replaceIndex(eventHandlerItem.data.get(entry.getKey()), viewObject.indexs), entry.getValue());
                    }
                }
            }
        }
        return hashMap;
    }

    private static String replaceIndex(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32c6463", new Object[]{str, iArr});
        }
        if (iArr != null) {
            for (int i = 0; i < iArr.length; i++) {
                str = str.replace("#" + i, String.valueOf(iArr[i]));
            }
        }
        return str;
    }
}
