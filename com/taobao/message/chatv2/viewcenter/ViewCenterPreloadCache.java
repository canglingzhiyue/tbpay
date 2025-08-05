package com.taobao.message.chatv2.viewcenter;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.render.WidgetInterface;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class ViewCenterPreloadCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, WidgetInterface> widgetInterfaceCache;

    static {
        kge.a(-281798712);
        widgetInterfaceCache = new HashMap();
    }

    public static void addItemCache(String str, WidgetInterface widgetInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3303fe40", new Object[]{str, widgetInterface});
        } else {
            widgetInterfaceCache.put(str, widgetInterface);
        }
    }

    public static WidgetInterface getWidgetInterface(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WidgetInterface) ipChange.ipc$dispatch("57e1c587", new Object[]{str}) : widgetInterfaceCache.get(str);
    }

    public static void removeWidgetInterface(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15efb602", new Object[]{str});
        } else {
            widgetInterfaceCache.remove(str);
        }
    }

    public static void addItemCache(String str, String str2, WidgetInterface widgetInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11af32ca", new Object[]{str, str2, widgetInterface});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Map<String, WidgetInterface> map = widgetInterfaceCache;
            map.put(str + str2, widgetInterface);
        }
    }

    public static WidgetInterface getWidgetInterface(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetInterface) ipChange.ipc$dispatch("b7b061fd", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, WidgetInterface> map = widgetInterfaceCache;
        return map.get(str + str2);
    }

    public static void removeWidgetInterface(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c8234c", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            Map<String, WidgetInterface> map = widgetInterfaceCache;
            map.remove(str + str2);
        }
    }

    public static void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
        } else {
            widgetInterfaceCache.clear();
        }
    }
}
