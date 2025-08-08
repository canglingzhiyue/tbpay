package com.ali.user.mobile.webview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.taobao.windvane.fragment.WVWebViewFragment;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.ui.WebConstant;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserWebTransparent extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mUrl;

    static {
        kge.a(681337449);
    }

    public static /* synthetic */ Object ipc$super(AliUserWebTransparent aliUserWebTransparent, String str, Object... objArr) {
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

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.activityIsTranslucent = true;
        super.onCreate(bundle);
        setContentView(R.layout.aliuser_web_trans);
        this.mViewGroup.setBackgroundColor(0);
        try {
            this.mUrl = getIntent().getStringExtra(WebConstant.WEBURL);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!StringUtils.isEmpty(this.mUrl)) {
            addWebFragment();
        } else {
            finish();
        }
    }

    private void addWebFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a80496a", new Object[]{this});
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().e();
        }
        View findViewById = findViewById(R.id.aliuser_web_rl);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.aliuser_auth_title_back_tv);
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.webview.AliUserWebTransparent.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        AliUserWebTransparent.this.onBackPressed();
                    }
                }
            });
        }
        Bundle bundle = new Bundle();
        bundle.putString("url", this.mUrl);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        WVWebViewFragment wVWebViewFragment = new WVWebViewFragment(this);
        wVWebViewFragment.setArguments(bundle);
        beginTransaction.add(R.id.browser_fragment_layout, wVWebViewFragment);
        beginTransaction.commit();
    }
}
