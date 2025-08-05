package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.r;
import kotlin.collections.g;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class ntl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ntl INSTANCE;

    static {
        kge.a(1201070191);
        INSTANCE = new ntl();
    }

    private ntl() {
    }

    public final boolean a(Boolean bool, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db255473", new Object[]{this, bool, str})).booleanValue();
        }
        if (bool != null && !q.a((Object) bool, (Object) false) && !TextUtils.isEmpty(str)) {
            return k.b.a(str);
        }
        return true;
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String[] whiteList = r.av();
        q.a((Object) whiteList, "whiteList");
        if (whiteList.length == 0) {
            return false;
        }
        if (!g.a(whiteList, "allow_all_channel")) {
            return g.a(whiteList, str);
        }
        return true;
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String[] whiteList = r.au();
        q.a((Object) whiteList, "whiteList");
        if (whiteList.length == 0) {
            return false;
        }
        if (!g.a(whiteList, "allow_all_channel")) {
            return g.a(whiteList, str);
        }
        return true;
    }
}
