package com.taobao.linkmanager.afc.xbs;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.xbs.e;
import tb.kge;
import tb.kog;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1091242185);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ((e) kog.a().g).h();
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "TBPluginCompoment === hideTips :隐藏");
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (activity == null) {
        } else {
            ((e) kog.a().g).c(activity);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "TBPluginCompoment === showTips :展示");
        }
    }
}
