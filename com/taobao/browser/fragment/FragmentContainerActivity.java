package com.taobao.browser.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes6.dex */
public class FragmentContainerActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(937194971);
    }

    public static /* synthetic */ Object ipc$super(FragmentContainerActivity fragmentContainerActivity, String str, Object... objArr) {
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

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragementcontainer);
        overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
        getSupportActionBar().e();
        Bundle extras = getIntent().getExtras();
        BrowserUtil.a("FragmentContainerActivity", BrowserUtil.b, BrowserUtil.c, null, null);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        String stringExtra = getIntent().getStringExtra("fragmentClassName");
        if (stringExtra == null || stringExtra.length() <= 0) {
            return;
        }
        try {
            Fragment fragment = (Fragment) getClassLoader().loadClass(stringExtra).getConstructor(new Class[0]).newInstance(new Object[0]);
            fragment.setArguments(extras);
            beginTransaction.add(R.id.browser_fragment_layout, fragment);
            beginTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
