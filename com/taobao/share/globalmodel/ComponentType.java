package com.taobao.share.globalmodel;

import com.taobao.android.taopai.charge.api.FunIdDef;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public enum ComponentType {
    UNKNOW(0, "UNKNOW"),
    TOOL(1, FunIdDef.TOOL),
    CONTACT(2, "contact"),
    WEEX(3, "weex container"),
    CHANNEL(4, "channel"),
    CHANNEL_ITEM(5, "channelItem"),
    CONTACT_ITEM(6, "contactItem"),
    BUSINESS_VIEW(7, "businessView");
    
    public String desc;
    public int index;
    private static Map<String, ComponentType> m = new HashMap();
    private static Map<Integer, ComponentType> i = new HashMap();

    static {
        ComponentType[] values;
        for (ComponentType componentType : values()) {
            m.put(componentType.desc, componentType);
            i.put(Integer.valueOf(componentType.index), componentType);
        }
    }

    ComponentType(int i2, String str) {
        this.index = i2;
        this.desc = str;
    }

    public static ComponentType getTypeByDesc(String str) {
        ComponentType componentType = m.get(str);
        return componentType != null ? componentType : UNKNOW;
    }

    public static ComponentType getTypeByIndex(int i2) {
        ComponentType componentType = i.get(Integer.valueOf(i2));
        return componentType != null ? componentType : UNKNOW;
    }
}
