package tb;

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.util.e;
import kotlin.jvm.JvmStatic;

/* loaded from: classes8.dex */
public final class nti {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nti INSTANCE;

    static {
        kge.a(-1813305450);
        INSTANCE = new nti();
    }

    private nti() {
    }

    @JvmStatic
    public static final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("class", str2);
        if (TextUtils.isEmpty(str)) {
            str = "TBSearch_Default";
        }
        e.a(str, "Code_Offline", arrayMap, (String) null);
    }
}
