package com.taobao.taolive.room.ui.growth;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ai;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1464777593);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc30e1e7", new Object[]{aVar, str});
        } else {
            ai.a(aVar, str, (HashMap<String, String>) new HashMap());
        }
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6cc19b", new Object[]{aVar});
        } else {
            ai.a(aVar, "appointment-close", new String[0]);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589ede46", new Object[]{aVar, str});
        } else {
            ai.a(aVar, str, new String[0]);
        }
    }
}
