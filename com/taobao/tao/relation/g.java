package com.taobao.tao.relation;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.unit.center.mdc.dinamicx.constants.DinamicxNativeConfig;

/* loaded from: classes8.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f21013a = "g";

    public static String a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f592e79", new Object[]{str, str2, new Integer(i)});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(0);
        stringBuffer.append("_");
        stringBuffer.append("U");
        stringBuffer.append("_");
        stringBuffer.append(str);
        stringBuffer.append("_");
        stringBuffer.append(str2);
        if (i > 0) {
            stringBuffer.append("_");
            stringBuffer.append(i);
        }
        return stringBuffer.toString();
    }

    public static void b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fca26", new Object[]{str, str2, new Integer(i)});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("targetId", str);
        bundle.putString(DinamicxNativeConfig.TARGETTYPE, str2);
        bundle.putInt("bizType", i);
        bundle.putString("entityType", "U");
        Nav.from(DaifuApplication.getApplication()).withExtras(bundle).toUri("http://tb.cn/n/im/chat");
    }
}
