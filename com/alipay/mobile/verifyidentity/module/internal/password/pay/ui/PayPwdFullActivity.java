package com.alipay.mobile.verifyidentity.module.internal.password.pay.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.ui.APRelativeLayout;
import com.alipay.mobile.verifyidentity.ui.APScrollView;
import com.alipay.mobile.verifyidentity.ui.APTitleBar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class PayPwdFullActivity extends PayPwdCommonActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5911a = "PayPwdFullActivity";
    private APTitleBar b;
    private TextView c;

    public static /* synthetic */ Object ipc$super(PayPwdFullActivity payPwdFullActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode != 2133689546) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onStart();
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

    @Override // com.alipay.mobile.verifyidentity.module.internal.password.pay.ui.AbsPayPwdActivity, com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        VerifyLogCat.i(f5911a, i.b.MEASURE_ONCREATE);
        if (this.mIsLogicInterrupted || getIntent() == null || getIntent().getExtras() == null) {
            return;
        }
        setContentView(R.layout.activity_paypwd_full_internal_aomen);
        this.pageStyle = "full";
        this.mRoot = findViewById(R.id.paypwd_bg);
        this.mWrapper = (APScrollView) findViewById(R.id.pwd_wrapper);
        this.b = (APTitleBar) findViewById(R.id.auth_titleBar);
        this.c = (TextView) findViewById(R.id.form_title);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.keyboard_layout);
        this.mRoot.setVisibility(0);
        initViewHeight();
        ((APRelativeLayout) findViewById(R.id.pwd_titlebar)).setVisibility(8);
        if (getIntent() != null && getIntent().getExtras() != null) {
            String string = getIntent().getExtras().getString("title");
            if (!StringUtils.isEmpty(string)) {
                this.b.setTitleText(string);
            }
            if (this.c != null) {
                String string2 = getIntent().getExtras().getString("footRemark");
                if (StringUtils.isEmpty(string2)) {
                    this.c.setVisibility(4);
                } else {
                    this.c.setText(string2);
                    this.c.setVisibility(0);
                }
            }
        }
        initSubtitle(true);
        initKeyBoard(linearLayout);
        initInput();
        initProgress();
        if (!this.isIpay) {
            initContent();
        }
        initGoOther();
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (isDialogShowing()) {
            return;
        }
        showKeyBoardDelay(200L);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        notifyCancel("102");
        writePwdBehavorLog("UC-MobileIC-20190606-2", "USER_CLICK_BACK", "wallet_macao");
    }

    public void initViewHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484d0be3", new Object[]{this});
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.mViewHeight = (displayMetrics.heightPixels - this.b.getHeight()) - rect.top;
        String str = f5911a;
        VerifyLogCat.i(str, "mViewHeight: " + this.mViewHeight);
    }
}
