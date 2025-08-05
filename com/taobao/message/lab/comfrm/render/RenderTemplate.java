package com.taobao.message.lab.comfrm.render;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class RenderTemplate {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String name;
    public Map<String, Object> renderData;
    public String renderType;

    static {
        kge.a(366115479);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RenderTemplate renderTemplate = (RenderTemplate) obj;
            String str = this.name;
            if (str != null) {
                return str.equals(renderTemplate.name);
            }
            if (renderTemplate.name == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
