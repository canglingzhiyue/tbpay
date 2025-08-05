package com.taobao.android.lightvane.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightvane.fragment.LVWebViewFragment;
import com.taobao.taobao.R;
import tb.gwo;
import tb.kge;

/* loaded from: classes5.dex */
public class LVWebViewActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-219317656);
    }

    public static /* synthetic */ Object ipc$super(LVWebViewActivity lVWebViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.lv_webview_acitivty);
        Intent intent = getIntent();
        if (intent == null) {
            gwo.a(6, "LVWebViewActivity", "intent is null!!");
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("url");
        if (TextUtils.isEmpty(stringExtra)) {
            gwo.a(6, "LVWebViewActivity", "url is null!!");
            finish();
            return;
        }
        a(getSupportActionBar(), (Toolbar) findViewById(R.id.lv_toolbar));
        Fragment a2 = a(intent);
        Bundle arguments = a2.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("url", stringExtra);
        a2.setArguments(arguments);
        getSupportFragmentManager().beginTransaction().replace(R.id.web_container, a2).commitAllowingStateLoss();
    }

    private void a(ActionBar actionBar, Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d0d8d", new Object[]{this, actionBar, toolbar});
            return;
        }
        if (actionBar != null) {
            actionBar.e();
        }
        toolbar.setVisibility(8);
    }

    public Fragment a(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Fragment) ipChange.ipc$dispatch("6787f187", new Object[]{this, intent}) : new LVWebViewFragment();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.web_container);
            if ((findFragmentById instanceof LVWebViewFragment) && ((LVWebViewFragment) findFragmentById).onBackPressed()) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            return false;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
