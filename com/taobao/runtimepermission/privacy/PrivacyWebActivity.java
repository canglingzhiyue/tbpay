package com.taobao.runtimepermission.privacy;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightvane.webview.LVWebView;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class PrivacyWebActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LVWebView f19001a;

    public static /* synthetic */ Object ipc$super(PrivacyWebActivity privacyWebActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 1893326613) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
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
        setContentView(R.layout.activity_privacy_web);
        setTitle(R.string.privacy_web_title);
        a.a(this);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        String stringExtra = getIntent().getStringExtra("url");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.privacy_container);
        this.f19001a = new LVWebView(this);
        this.f19001a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LVWebView lVWebView = this.f19001a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        lVWebView.loadUrl(stringExtra);
        linearLayout.addView(this.f19001a);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            a();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f19001a.canGoBack()) {
            this.f19001a.goBack();
        } else {
            finish();
        }
    }
}
