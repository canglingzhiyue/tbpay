package com.taobao.tao.rate.ui.commit;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.nav.Nav;
import com.taobao.android.order.bundle.helper.g;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.util.NavUrls;
import tb.kge;
import tb.tmw;

/* loaded from: classes8.dex */
public class NavRateSucessActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1816338102);
    }

    public static /* synthetic */ Object ipc$super(NavRateSucessActivity navRateSucessActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public NavRateSucessActivity() {
        ApplicationInvoker.getInstance("com.taobao.trade.rate").invoke("com.taobao.tao.rate.RateApplication", TaobaoApplication.sApplication);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        tmw.a(getClass().getName());
        Bundle bundle2 = new Bundle();
        bundle2.putString(g.IN_PARAM_ORDER_LIST_TYPE, "WAIT_TO_EVALUATE");
        Nav.from(this).withExtras(bundle2).withFlags(67108864).toUri(NavUrls.NAV_URL_ORDER_LIST[0]);
        finish();
    }
}
