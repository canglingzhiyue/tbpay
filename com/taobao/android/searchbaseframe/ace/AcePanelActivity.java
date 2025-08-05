package com.taobao.android.searchbaseframe.ace;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.t;
import com.taobao.taobao.R;
import tb.imp;
import tb.kge;

/* loaded from: classes6.dex */
public class AcePanelActivity extends Activity implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1300110966);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(AcePanelActivity acePanelActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
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
        super.onCreate(bundle);
        imp.a().a(this);
        setContentView(R.layout.libsf_activity_ace_panel);
        findViewById(R.id.btn_refresh).setOnClickListener(this);
        findViewById(R.id.btn_back).setOnClickListener(this);
        ((FrameLayout) findViewById(R.id.fl_panel_container)).addView(a.a(this));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        t.a(a.a(this));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.btn_refresh) {
            a.a();
        } else if (view.getId() != R.id.btn_back) {
        } else {
            finish();
        }
    }
}
