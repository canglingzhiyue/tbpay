package com.taobao.android.nav;

import android.net.Uri;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguActivity;
import tb.kge;

/* loaded from: classes6.dex */
public class NavRouterActivity extends PanguActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(81749628);
    }

    public static /* synthetic */ Object ipc$super(NavRouterActivity navRouterActivity, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        finish();
        Uri data = getIntent().getData();
        if (data == null || !data.isHierarchical() || (a2 = a(data)) == null) {
            return;
        }
        Nav.from(this).disallowLoopback().toUri(a2);
    }

    public Uri a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("6832b116", new Object[]{this, uri});
        }
        String fragment = uri.getFragment();
        if (fragment != null && fragment.startsWith("!/")) {
            return uri.buildUpon().fragment(null).path(fragment.substring(1)).build();
        }
        return null;
    }
}
