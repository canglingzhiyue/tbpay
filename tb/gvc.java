package tb;

import android.content.Context;
import com.alibaba.ha.bizerrorreporter.c;
import com.alibaba.ha.bizerrorreporter.e;
import com.alibaba.ha.bizerrorreporter.module.AggregationType;
import com.alibaba.ha.bizerrorreporter.module.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class gvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, String str, Throwable th) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d01c0b", new Object[]{context, str, th});
            return;
        }
        a aVar = new a();
        aVar.f3119a = "LAUNCHER_ERROR";
        aVar.b = AggregationType.CONTENT;
        aVar.c = String.valueOf(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("：");
        if (th != null) {
            str2 = th.getMessage() + "，" + th.getCause();
        } else {
            str2 = "nothing";
        }
        sb.append(str2);
        aVar.d = sb.toString();
        aVar.j = "https://launcher.taobao.com/exception/" + str;
        aVar.k = th;
        aVar.l = Thread.currentThread();
        aVar.e = c._VERSION;
        HashMap hashMap = new HashMap(2);
        hashMap.put("name", str);
        hashMap.put("launch", "next launch");
        aVar.i = hashMap;
        e.a().a(context, aVar);
    }
}
