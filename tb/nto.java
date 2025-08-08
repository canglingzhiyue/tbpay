package tb;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.util.j;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public final class nto {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final nto INSTANCE;
    public static final String IN_SHOP_ELDER_HIT_VALUE = "elder";

    static {
        kge.a(857740932);
        INSTANCE = new nto();
    }

    private nto() {
    }

    public final void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            boolean a2 = j.INSTANCE.a(b(intent));
            intent.putExtra(noa.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(a2));
            intent.putExtra(noa.KEY_GRAY_HAIR, String.valueOf(a2));
        }
    }

    private final boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        String stringExtra = intent.getStringExtra(noa.KEY_SHOP_SEARCH_ELDER);
        if (!StringUtils.isEmpty(stringExtra)) {
            return q.a((Object) IN_SHOP_ELDER_HIT_VALUE, (Object) stringExtra);
        }
        Uri data = intent.getData();
        if (data != null) {
            return q.a((Object) IN_SHOP_ELDER_HIT_VALUE, (Object) data.getQueryParameter(noa.KEY_SHOP_SEARCH_ELDER));
        }
        return false;
    }
}
