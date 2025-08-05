package com.ali.user.mobile.login.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.model.CommonCallback;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserContainer extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE = "actionType";
    public static final String TAG = "login.container";
    public static String TYPE_FINGER;
    public static CommonCallback callback;
    public FragmentManager mFragmentManager;

    public static /* synthetic */ Object ipc$super(AliUserContainer aliUserContainer, String str, Object... objArr) {
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

    static {
        kge.a(1455037029);
        TYPE_FINGER = "finger";
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.activityIsTranslucent = true;
        this.mFragmentManager = getSupportFragmentManager();
        super.onCreate(bundle);
        setContentView(R.layout.aliuser_activity_frame_content);
    }

    @Override // com.ali.user.mobile.base.ui.BaseActivity
    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
        } else {
            openFragmentByConfig(getIntent());
        }
    }

    private void openFragmentByConfig(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a946817", new Object[]{this, intent});
            return;
        }
        String str = null;
        if (intent != null) {
            try {
                str = intent.getStringExtra("actionType");
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (!TYPE_FINGER.equals(str)) {
            return;
        }
        FingerPrintDialog fingerPrintDialog = new FingerPrintDialog(callback);
        fingerPrintDialog.setArguments(intent.getExtras());
        fingerPrintDialog.show(this.mFragmentManager, "finger");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        try {
            if (isFinishing()) {
                return;
            }
            finish();
            overridePendingTransition(0, 0);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
