package com.taobao.tao.welcome;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes8.dex */
public class LinkWelcome extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_INNER = "com.taobao.taobao.inner.action";

    static {
        kge.a(2013359419);
    }

    public static /* synthetic */ Object ipc$super(LinkWelcome linkWelcome, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 188604040) {
            super.onStop();
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

    public LinkWelcome() {
        com.taobao.android.launcher.bootstrap.tao.f.a("null", "com.taobao.tao.welcome.LinkWelcome");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_Welcome_Adaptor);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        super.onCreate(bundle);
        setContentView(R.layout.linkwelcome);
        Intent intent = getIntent();
        if (intent == null) {
            Nav.from(this).disableTransition().withFlags(67108864).toUri("http://m.taobao.com/index.htm");
            return;
        }
        intent.setAction(ACTION_INNER);
        intent.setFlags(67174400);
        startActivity(intent);
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        finish();
    }
}
