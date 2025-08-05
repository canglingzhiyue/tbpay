package com.taobao.collection.common;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-890064429);
    }

    public static String a(Code code, SwitchOption switchOption) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d73c6fd4", new Object[]{code, switchOption});
        }
        StringBuffer stringBuffer = new StringBuffer(50);
        if (code == null) {
            stringBuffer.append("c=[null]");
        } else {
            stringBuffer.append("c=[");
            stringBuffer.append(code.getModuleToken() + ":" + code.getExt());
            stringBuffer.append(riy.ARRAY_END_STR);
        }
        stringBuffer.append(";");
        if (switchOption == null) {
            stringBuffer.append("so=[null]");
        } else {
            stringBuffer.append("so=[");
            stringBuffer.append(switchOption.getType() + ":" + switchOption.getInterval() + ":" + switchOption.getIsOpen());
            stringBuffer.append(riy.ARRAY_END_STR);
        }
        return stringBuffer.toString();
    }
}
