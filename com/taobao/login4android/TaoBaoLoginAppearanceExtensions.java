package com.taobao.login4android;

import com.ali.user.mobile.common.api.LoginApprearanceExtensions;
import com.ali.user.mobile.login.ui.AliUserAlipayFragment;
import com.ali.user.mobile.login.ui.AliUserAlipayHistoryFragment;
import com.taobao.login4android.membercenter.account.MultiLogoutListFragment;
import com.taobao.login4android.ui.TaobaoFaceLoginFragment;
import com.taobao.login4android.ui.TaobaoFingerLoginFragment;
import com.taobao.login4android.ui.TaobaoOneKeyLoginFragment;
import com.taobao.login4android.ui.TaobaoOneKeyLoginHistoryFragment;
import com.taobao.login4android.ui.TaobaoOneKeyRegFragment;
import com.taobao.login4android.ui.TaobaoQrLoginFragment;
import com.taobao.login4android.ui.TaobaoQrScanFragment;
import com.taobao.login4android.ui.TaobaoRecommendLoginFragment;
import com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment;
import com.taobao.login4android.ui.TaobaoUserLoginFragment;
import com.taobao.login4android.utils.LoginSwitch;
import tb.kge;

/* loaded from: classes7.dex */
public class TaoBaoLoginAppearanceExtensions extends LoginApprearanceExtensions {
    static {
        kge.a(858013653);
    }

    public TaoBaoLoginAppearanceExtensions() {
        setUccHelper(UccH5Impl.class);
        setFullyCustomizedQrcodeFragment(TaobaoQrLoginFragment.class);
        setFullyCustomizedAlipayLoginFragment(AliUserAlipayFragment.class);
        setFullyCustomizedAlipayHistoryFragment(AliUserAlipayHistoryFragment.class);
        setFullyCustomizeLoginFragment(TaobaoUserLoginFragment.class);
        setFullyCustomizedFaceLoginFragment(TaobaoFaceLoginFragment.class);
        setFullyCustomizedScanFragment(TaobaoQrScanFragment.class);
        setFullyCustomizedOneKeyLoginFragment(TaobaoOneKeyLoginFragment.class);
        setFullyCustomizedRecommendLoginFragment(TaobaoRecommendLoginFragment.class);
        setFullyCustomizeOneKeyRegisterFragment(TaobaoOneKeyRegFragment.class);
        setFullyCustomizedTwoStepMobileRegisterFragment(TaobaoTwoStepMobileRegFragment.class);
        setFullyCustomizedOneKeyLoginHistoryFragment(TaobaoOneKeyLoginHistoryFragment.class);
        setFingerFragment(TaobaoFingerLoginFragment.class);
        setFullyCustomizeGuideFragment(MultiLogoutListFragment.class);
        setNavHelper(NavHelper.class);
        setABHelper(ABHelper.class);
        if (LoginSwitch.getSwitch("enable_custom_taobao_dialog_helper", "true")) {
            setDialogHelper(TaoBaoDialogHelper.class);
        }
    }
}
