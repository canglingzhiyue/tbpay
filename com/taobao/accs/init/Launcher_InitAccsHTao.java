package com.taobao.accs.init;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.a;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes.dex */
public class Launcher_InitAccsHTao extends Launcher_InitAccs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1668055174);
    }

    public static /* synthetic */ Object ipc$super(Launcher_InitAccsHTao launcher_InitAccsHTao, String str, Object... objArr) {
        if (str.hashCode() == -572845173) {
            super.init((Application) objArr[0], (HashMap) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.accs.init.Launcher_InitAccs
    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        defaultAppkey = "";
        super.init(application, hashMap);
        a.b = "com.taobao.taobao.TaobaoIntentService";
    }
}
