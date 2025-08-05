package com.taobao.login4android.ui;

import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.ui.AliFingerLoginFragment;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.activity.auth.QrScan;
import com.taobao.login4android.uti.PrivacyUtil;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoFingerLoginFragment extends AliFingerLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View mQrDividerView;
    public TextView mQrLoginTV;

    static {
        kge.a(48330373);
    }

    public static /* synthetic */ Object ipc$super(TaobaoFingerLoginFragment taobaoFingerLoginFragment, String str, Object... objArr) {
        if (str.hashCode() == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.ali.user.mobile.login.ui.AliFingerLoginFragment, com.ali.user.mobile.login.ui.BaseHistoryFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mQrLoginTV = (TextView) view.findViewById(R.id.aliuser_qrlogin_tv);
        this.mQrDividerView = view.findViewById(R.id.aliuser_qrlogin_divider);
        TextView textView = this.mQrLoginTV;
        if (textView == null) {
            return;
        }
        setOnClickListener(textView);
        QrScan.showQrScan(this.mUserLoginActivity, this.mQrLoginTV, this.mQrDividerView);
    }

    @Override // com.ali.user.mobile.login.ui.AliFingerLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_finger_fragment_tb;
    }

    @Override // com.ali.user.mobile.login.ui.AliFingerLoginFragment
    public void showAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81098ae", new Object[]{this});
        } else {
            AlipayAuth.showAlipay(this, this.mAlipayLoginTV, null);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void goAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a781a0d9", new Object[]{this});
            return;
        }
        LoginParam loginParam = new LoginParam();
        loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, getPageName());
        loginParam.utPageName = getPageName();
        loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
        loginParam.source = this.mSource;
        HashMap hashMap = new HashMap();
        hashMap.put("sdkTraceId", loginParam.sdkTraceId + "");
        UserTrackAdapter.control(getPageName(), UTConstant.CustomEvent.UT_LOGIN_ACTION, "", LoginType.LocalLoginType.ASO_LOGIN, hashMap);
        AlipayAuth.onAlipayLoginClick(this);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void addMoreMenus(BottomMenuFragment bottomMenuFragment, List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d59413", new Object[]{this, bottomMenuFragment, list});
        } else {
            PrivacyUtil.addMoreMenus(bottomMenuFragment, list, this);
        }
    }
}
