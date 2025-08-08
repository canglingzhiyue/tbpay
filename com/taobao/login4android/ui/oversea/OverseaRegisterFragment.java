package com.taobao.login4android.ui.oversea;

import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.login.ui.LoginClickAction;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.navigation.NavigatorManager;
import com.ali.user.mobile.register.ui.AliUserRegisterActivity;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.activity.auth.AlipayAuth;
import com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class OverseaRegisterFragment extends TaobaoTwoStepMobileRegFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View mBackBtn;
    public View mHelpTV;
    public TextView mRegTitle;
    public View mTopRectangle;

    static {
        kge.a(-1365151619);
    }

    public static /* synthetic */ Object ipc$super(OverseaRegisterFragment overseaRegisterFragment, String str, Object... objArr) {
        if (str.hashCode() == -1180824595) {
            super.initViews((View) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ TextView access$000(OverseaRegisterFragment overseaRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("54c62801", new Object[]{overseaRegisterFragment}) : overseaRegisterFragment.snsTextView;
    }

    public static /* synthetic */ TextView access$100(OverseaRegisterFragment overseaRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("53ecb760", new Object[]{overseaRegisterFragment}) : overseaRegisterFragment.mAlipay;
    }

    public static /* synthetic */ View access$200(OverseaRegisterFragment overseaRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cd448acd", new Object[]{overseaRegisterFragment}) : overseaRegisterFragment.mAlipayLL;
    }

    public static /* synthetic */ TextView access$300(OverseaRegisterFragment overseaRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5239d61e", new Object[]{overseaRegisterFragment}) : overseaRegisterFragment.snsTextView;
    }

    public static /* synthetic */ TextView access$400(OverseaRegisterFragment overseaRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("5160657d", new Object[]{overseaRegisterFragment}) : overseaRegisterFragment.mAlipayHK;
    }

    public static /* synthetic */ View access$500(OverseaRegisterFragment overseaRegisterFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9e2852aa", new Object[]{overseaRegisterFragment}) : overseaRegisterFragment.mAlipayHKLL;
    }

    @Override // com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment, com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_two_step_mobile_register_oversea;
    }

    @Override // com.taobao.login4android.ui.TaobaoTwoStepMobileRegFragment, com.ali.user.mobile.register.ui.AliUserTwoStepMobileRegisterFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        String regBgImage = UserLoginActivity.getRegBgImage(this.mFireAppLaunchRes);
        int i = 8;
        if (!StringUtils.isEmpty(regBgImage)) {
            if (this.mWelcomeTV != null) {
                this.mWelcomeTV.setVisibility(8);
            }
            if (this.mTitleTV != null) {
                float dimension = getResources().getDimension(R.dimen.aliuser_space_30);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mTitleTV.getLayoutParams();
                layoutParams.setMargins(0, (int) dimension, 0, 0);
                this.mTitleTV.setLayoutParams(layoutParams);
            }
            this.mTopRectangle = view.findViewById(R.id.aliuser_top_rectangle);
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = getActivity().getWindow();
                window.addFlags(Integer.MIN_VALUE);
                window.clearFlags(67108864);
                window.setStatusBarColor(0);
            }
            View view2 = this.mTopRectangle;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            getActivity().getWindow().getDecorView().setSystemUiVisibility(1280);
            if (getSupportActionBar() != null) {
                getSupportActionBar().e();
            }
            this.mBackBtn = view.findViewById(R.id.aliuser_custom_back);
            View view3 = this.mBackBtn;
            if (view3 != null) {
                view3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view4) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view4});
                        } else {
                            OverseaRegisterFragment.this.onBackPressed();
                        }
                    }
                });
            }
            this.mHelpTV = view.findViewById(R.id.aliuser_custom_help);
            View view4 = this.mHelpTV;
            if (view4 != null) {
                view4.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view5) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                        } else {
                            AliUserRegisterActivity.goRegHelp(OverseaRegisterFragment.this.getActivity());
                        }
                    }
                });
            }
            this.mRegTitle = (TextView) view.findViewById(R.id.aliuser_register_tips_title);
            TextView textView = this.mRegTitle;
            if (textView != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) textView.getLayoutParams();
                layoutParams2.setMargins(0, 36, 0, 0);
                this.mRegTitle.setLayoutParams(layoutParams2);
                this.mRegTitle.setTextSize(25.0f);
            }
            this.mTopRectangle.setBackgroundColor(getResources().getColor(R.color.aliuser_oversea_color));
            ImageUtil.updateBackground(this.mTopRectangle, regBgImage);
            TextView textView2 = (TextView) view.findViewById(R.id.aliuser_reg_func_menu);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else if (getSupportActionBar() != null) {
            getSupportActionBar().d();
        }
        this.snsTextView = (TextView) view.findViewById(R.id.aliuser_sns_hint_tv);
        boolean supportGoogleFB = UserLoginActivity.supportGoogleFB();
        TextView textView3 = this.snsTextView;
        if (supportGoogleFB) {
            i = 0;
        }
        textView3.setVisibility(i);
        this.mSnsLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_ll);
        this.mAlipayHK = (TextView) view.findViewById(R.id.ali_user_login_alipayhk_login_tv);
        this.mAlipayHKLL = view.findViewById(R.id.aliuser_sns_alipayhk_ll);
        this.mAlipayHK.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                } else {
                    OverseaRegisterFragment.this.addCheckAction(LoginClickAction.ACTION_ALIPAYHK_LOGIN);
                }
            }
        });
        this.mAlipay = (TextView) view.findViewById(R.id.ali_user_login_alipay_login_tv);
        this.mAlipayLL = view.findViewById(R.id.aliuser_sns_alipay_ll);
        this.mAlipay.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                } else {
                    OverseaRegisterFragment.this.addCheckAction(LoginClickAction.ACTION_ALIPAY);
                }
            }
        });
        AlipayAuth.supportAlipay(getActivity(), new CommonCallback() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i2, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i2), str});
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    return;
                }
                OverseaRegisterFragment.access$000(OverseaRegisterFragment.this).setVisibility(0);
                OverseaRegisterFragment.access$100(OverseaRegisterFragment.this).setVisibility(0);
                OverseaRegisterFragment.access$200(OverseaRegisterFragment.this).setVisibility(0);
            }
        });
        AlipayAuth.supportAlipayHK(getActivity(), new CommonCallback() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onFail(int i2, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("efca37e9", new Object[]{this, new Integer(i2), str});
                }
            }

            @Override // com.ali.user.mobile.model.CommonCallback
            public void onSuccess() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                } else if (!LanguageUtil.isHK()) {
                } else {
                    OverseaRegisterFragment.access$300(OverseaRegisterFragment.this).setVisibility(0);
                    OverseaRegisterFragment.access$400(OverseaRegisterFragment.this).setVisibility(0);
                    OverseaRegisterFragment.access$500(OverseaRegisterFragment.this).setVisibility(0);
                }
            }
        });
        if (!UserLoginActivity.displayOversea(this.mFireAppLaunchRes)) {
            return;
        }
        if (LanguageUtil.isChineseLanguage()) {
            this.mMobileET.setBackgroundResource(R.drawable.aliuser_edittext_bg_tb);
        } else {
            this.mMobileET.setBackgroundResource(R.drawable.aliuser_edittext_square_bg);
        }
        if (this.toEmailTV != null) {
            this.toEmailTV.setVisibility(0);
            this.toEmailTV.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("isRegState", true);
                    NavigatorManager.getInstance().navToEmailRegPage(OverseaRegisterFragment.this.getActivity(), bundle);
                }
            });
        }
        if (!UserLoginActivity.supportGoogleFB()) {
            return;
        }
        this.mSnsLL.setVisibility(0);
        this.mGgLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_gg_ll);
        this.mFbLL = (LinearLayout) view.findViewById(R.id.aliuser_sns_fb_ll);
        this.mGoogle = (TextView) view.findViewById(R.id.aliuser_recommend_google);
        if (this.mGoogle != null) {
            if (this.mGgLL != null) {
                this.mGgLL.setVisibility(0);
            }
            this.mGoogle.setVisibility(0);
            this.mGoogle.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                    } else {
                        OverseaRegisterFragment.this.addCheckAction(LoginClickAction.ACTION_GOOGLE_LOGIN);
                    }
                }
            });
        }
        this.mFacebook = (TextView) view.findViewById(R.id.aliuser_recommend_facebook);
        if (this.mFacebook == null) {
            return;
        }
        if (this.mFbLL != null) {
            this.mFbLL.setVisibility(0);
        }
        this.mFacebook.setVisibility(0);
        this.mFacebook.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.oversea.OverseaRegisterFragment.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view5});
                } else {
                    OverseaRegisterFragment.this.addCheckAction(LoginClickAction.ACTION_FACEBOOK_LOGIN);
                }
            }
        });
    }
}
