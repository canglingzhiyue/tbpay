package com.taobao.search;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.r;
import com.taobao.tao.util.NavUrls;
import java.util.Set;
import kotlin.jvm.internal.q;
import org.android.agoo.common.AgooConstants;
import tb.kge;
import tb.noa;

/* loaded from: classes4.dex */
public final class MainSearchRouteActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2059161437);
    }

    public static /* synthetic */ Object ipc$super(MainSearchRouteActivity mainSearchRouteActivity, String str, Object... objArr) {
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        SearchSdk.Companion.b();
        super.onCreate(bundle);
        Intent intent = getIntent();
        Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            finish();
            return;
        }
        String queryParameter = data.getQueryParameter("q");
        String queryParameter2 = data.getQueryParameter(noa.KEY_POP_UP);
        Uri.Builder buildUpon = Uri.parse(StringUtils.isEmpty(queryParameter) ? NavUrls.NAV_URL_SEARCH_HOME : "https://s.m.taobao.com/h5").buildUpon();
        Set<String> queryKeys = data.getQueryParameterNames();
        q.a((Object) queryKeys, "queryKeys");
        if (true ^ queryKeys.isEmpty()) {
            for (String str : queryKeys) {
                if (!StringUtils.isEmpty(str)) {
                    String queryParameter3 = data.getQueryParameter(str);
                    if (!StringUtils.isEmpty(queryParameter3)) {
                        buildUpon.appendQueryParameter(str, queryParameter3);
                    }
                }
            }
        }
        if (StringUtils.equals(queryParameter2, "true") && r.bI()) {
            buildUpon.appendQueryParameter(noa.KEY_G_POP_UP, "true");
            Nav withAction = Nav.from(this).withAction(AgooConstants.MESSAGE_POPUP);
            Intent intent2 = getIntent();
            q.a((Object) intent2, "intent");
            withAction.withExtras(intent2.getExtras()).disableTransition().toUri(buildUpon.build());
            finish();
            overridePendingTransition(0, 0);
            return;
        }
        Nav.from(this).toUri(buildUpon.build());
        finish();
    }
}
