package com.taobao.login4android.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.base.ui.BaseActivity;
import com.ali.user.mobile.login.model.LoginConstant;
import com.ali.user.mobile.utils.ElderUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.BaseQrLoginFragment;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoQrLoginFragment extends BaseQrLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView moreMenuTV;
    public TextView otherLoginTV;
    public View refreshLL;
    public TextView scanTV;
    public TextView tipTextView;

    static {
        kge.a(812296525);
    }

    public static /* synthetic */ Object ipc$super(TaobaoQrLoginFragment taobaoQrLoginFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode != -1180824595) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.initViews((View) objArr[0]);
            return null;
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.support.v4.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.login4android.qrcode.BaseQrLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_qrlogin_tb;
    }

    @Override // com.taobao.login4android.qrcode.BaseQrLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.qrMargin = 0;
        super.initViews(view);
        this.scanTV = (TextView) view.findViewById(R.id.aliuser_scan_tip_tv);
        setNormalTip(R.string.aliuser_qr_tip2, true);
        this.refreshLL = view.findViewById(R.id.aliuser_qr_refresh);
        try {
            ((BaseActivity) getActivity()).getSupportActionBar().a("");
            ((BaseActivity) getActivity()).setNavigationCloseIcon();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.moreMenuTV = (TextView) view.findViewById(R.id.aliuser_login_menu);
        this.otherLoginTV = (TextView) view.findViewById(R.id.aliuser_login_other_login);
        this.tipTextView = (TextView) view.findViewById(R.id.qr_login_reg_tip_tv);
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.aliuser_qr_tip));
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.aliuser_edittext_bg_color_normal)), 5, 8, 33);
        this.tipTextView.setText(spannableString);
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.tipTextView);
        }
        setOnClickListener(this.otherLoginTV, this.moreMenuTV);
    }

    @Override // com.taobao.login4android.qrcode.BaseQrLoginFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.aliuser_login_menu) {
            addControl("more");
            showBottomMenuForFirstPage();
        } else if (id == R.id.aliuser_login_other_login) {
            addControl("otherid");
            Intent intent = new Intent();
            intent.putExtra(LoginConstant.LAUNCH_PASS_QR_FRAGMENT, true);
            this.mUserLoginActivity.openLoginPageFromQrLogin(intent);
        } else {
            super.onClick(view);
        }
    }

    @Override // com.taobao.login4android.qrcode.BaseQrLoginFragment
    public void showRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb52ea5", new Object[]{this});
            return;
        }
        if (this.mQrCodeView != null) {
            this.mQrCodeView.setIcon(R.drawable.aliuser_refresh_icon);
            this.mQrCodeView.setText(R.string.passport_ott_refresh_qr_code);
            this.mQrCodeView.showPrompt(true);
            this.mQrCodeView.setSuccessVisible(8);
            this.mQrCodeView.setEnabled(true);
            this.mQrCodeView.requestFocus();
        }
        setNormalTip(R.string.aliuser_qr_tip2, true);
    }

    @Override // com.taobao.login4android.qrcode.BaseQrLoginFragment
    public void showReGenQrCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("437fac75", new Object[]{this});
            return;
        }
        if (this.mQrCodeView != null) {
            this.mQrCodeView.setIcon(getRefreshIcon());
            this.mQrCodeView.setText(R.string.passport_ott_re_gen_qr_code);
            this.mQrCodeView.setSuccessVisible(8);
            this.mQrCodeView.showPrompt(true);
            this.mQrCodeView.setEnabled(true);
        }
        setNormalTip(R.string.aliuser_qr_tip2, true);
    }

    public void setNormalTip(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54a9216a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        this.scanTV.setText(i);
        setScanDrawable(z);
    }

    @Override // com.taobao.login4android.qrcode.BaseQrLoginFragment
    public int getRefreshIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8b99a38", new Object[]{this})).intValue() : R.drawable.aliuser_refresh_icon;
    }

    @Override // com.taobao.login4android.qrcode.BaseQrLoginFragment
    public void showScaned() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba83d40", new Object[]{this});
            return;
        }
        if (this.mQrCodeView != null) {
            this.mQrCodeView.showPrompt(false);
            this.mQrCodeView.setText(R.string.aliuser_scan_success_tip);
            this.mQrCodeView.setTextVisible(0);
            this.mQrCodeView.setSuccessVisible(0);
            this.mQrCodeView.setEnabled(false);
            this.mQrCodeView.setBackground(null);
        }
        setNormalTip(R.string.aliuser_qr_scaned_tip, false);
    }

    public void setScanDrawable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72de2190", new Object[]{this, new Boolean(z)});
        } else if (z) {
            Drawable drawable = getResources().getDrawable(R.drawable.aliuser_scan_logo);
            drawable.setBounds(0, 0, 39, 36);
            this.scanTV.setCompoundDrawables(null, null, drawable, null);
        } else {
            this.scanTV.setCompoundDrawables(null, null, null, null);
        }
    }
}
