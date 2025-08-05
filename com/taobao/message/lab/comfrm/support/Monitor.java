package com.taobao.message.lab.comfrm.support;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class Monitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIM_NAME = "name";
    public static final String DIM_NEED_REFRESH = "needRefresh";
    public static final String DIM__USE_DX_PREFETCH = "useDXPrefetch";
    public static final String MEA_TIME = "time";
    public static final String MODULE_COMFRM = "COMFRM";
    public static final String MONITOR_SCENE_KEY = "monitor_scene_key";
    public static final String POINT_LOAD_COMPONENT_TIME = "loadComponentTime";
    public static final String POINT_LOAD_DX_COMPONENT_RATE = "loadDXComponentRate";
    public static final String POINT_LOAD_VERTICAL_COMPONENT_RATE = "loadVerticalComponentRate";
    private static HashMap<String, String> sLoadTypes;

    static {
        kge.a(-1268810200);
        sLoadTypes = new HashMap<>();
    }

    public static void monitorLoadType(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5798cd5", new Object[]{str, str2});
        } else {
            sLoadTypes.put(str, str2);
        }
    }

    public static String getLoadType(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e785eab9", new Object[]{str}) : sLoadTypes.get(str);
    }
}
