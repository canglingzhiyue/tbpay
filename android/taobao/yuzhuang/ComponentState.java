package android.taobao.yuzhuang;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class ComponentState implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1775567347);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (hasRecovered(application)) {
        } else {
            a.a(application, hashMap);
            a.a(application);
        }
    }

    public static boolean hasRecovered(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("412bca3c", new Object[]{context})).booleanValue() : a.b(context);
    }
}
