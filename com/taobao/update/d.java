package com.taobao.update;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.update.framework.UpdateRuntime;
import tb.kge;
import tb.reu;
import tb.rfy;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1381948314);
    }

    public boolean initSafemode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70f2b86b", new Object[]{this})).booleanValue();
        }
        if (UpdateRuntime.processName.equals(Globals.getApplication().getPackageName())) {
            return false;
        }
        if (UpdateRuntime.processName.endsWith(":safemode")) {
            a();
        }
        return true;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String ttid = TaoPackageInfo.getTTID();
        String group = a.getGroup(ttid);
        UpdateRuntime.init(Globals.getApplication(), ttid, a.getAppDispName(), group);
        rfy.getInstance().init(Globals.getApplication(), group, ttid, false, new reu());
    }
}
