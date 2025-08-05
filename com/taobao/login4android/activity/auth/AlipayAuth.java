package com.taobao.login4android.activity.auth;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.ApiReferer;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.model.LoginType;
import com.ali.user.mobile.utils.BundleUtil;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.open.core.AliMemberSDK;
import com.ali.user.open.oauth.OauthService;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import com.taobao.android.sns4android.alipay2.b;
import com.taobao.android.sns4android.alipay2.d;
import com.taobao.android.sns4android.c;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class AlipayAuth {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REPEAT_CLICK_GAP = 3000;
    public static long mLastClickTime;

    static {
        kge.a(1887652983);
    }

    public static void alipayAuth(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff1c12b", new Object[]{activity});
        } else if (activity == null || activity.isFinishing()) {
            LoginTLogAdapter.e("AlipayAuth", "return case fragment is not active or is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - mLastClickTime < 3000) {
                UserTrackAdapter.sendUT("ClickFastReturn");
                LoginTLogAdapter.e("login.LoginStatus", "click too fast ,return");
                return;
            }
            mLastClickTime = currentTimeMillis;
            c.a(SNSPlatform.PLATFORM_ALIPAY, activity);
        }
    }

    public static void onAlipayLoginClick(BaseFragment baseFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e0e998", new Object[]{baseFragment});
        } else {
            onAlipayLoginClick(baseFragment, false);
        }
    }

    public static void onAlipayLoginClick(BaseFragment baseFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743cfc3c", new Object[]{baseFragment, new Boolean(z)});
        } else if (baseFragment == null || !baseFragment.isActivityAvaiable() || !baseFragment.isActive()) {
            LoginTLogAdapter.e("AlipayAuth", "return case fragment is not active or is null");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - mLastClickTime < 3000) {
                UserTrackAdapter.sendUT("ClickFastReturn");
                LoginTLogAdapter.e("login.LoginStatus", "click too fast ,return");
                return;
            }
            mLastClickTime = currentTimeMillis;
            HashMap hashMap = new HashMap();
            hashMap.put(UTConstant.PageName.UT_KEY_PAGE_NAME, baseFragment.getPageName());
            hashMap.put("alipayInstalled", "true");
            if (z) {
                c.a(SNSPlatform.PLATFORM_ALIPAYHK, baseFragment.getBaseActivity(), hashMap);
            } else if (LoginSwitch.isInABTestRegion("alipay_sso3", 10000)) {
                LoginParam loginParam = new LoginParam();
                loginParam.sdkTraceId = ApiReferer.generateTraceId(LoginType.LocalLoginType.ASO_LOGIN, baseFragment.getPageName());
                loginParam.utPageName = baseFragment.getPageName();
                loginParam.loginSourceType = LoginType.LocalLoginType.ASO_LOGIN;
                loginParam.alipayInstalled = true;
                d.b(loginParam);
                b.a(baseFragment.getActivity());
            } else {
                c.a(SNSPlatform.PLATFORM_ALIPAY, baseFragment.getBaseActivity(), hashMap);
            }
        }
    }

    public static void showAlipay(BaseFragment baseFragment, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7917305", new Object[]{baseFragment, textView, view});
        } else {
            showAlipayInner(baseFragment, textView, null, view, true);
        }
    }

    public static void showAlipay(BaseFragment baseFragment, TextView textView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a9da06f", new Object[]{baseFragment, textView, view, new Boolean(z)});
        } else {
            showAlipayInner(baseFragment, textView, null, view, z);
        }
    }

    public static void showAlipayInner(final BaseFragment baseFragment, final View view, final View view2, final View view3, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ed6901", new Object[]{baseFragment, view, view2, view3, new Boolean(z)});
        } else if (baseFragment == null || view == null) {
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Boolean>() { // from class: com.taobao.login4android.activity.auth.AlipayAuth.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Boolean, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Boolean doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, bool});
                    } else {
                        a(bool);
                    }
                }

                public Boolean a(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("978dc706", new Object[]{this, objArr}) : Boolean.valueOf(AlipayAuth.isSupportAlipay(BaseFragment.this.getBaseActivity()));
                }

                public void a(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                    } else if (!BaseFragment.this.isActivityAvaiable()) {
                    } else {
                        if (bool.booleanValue()) {
                            View view4 = view;
                            if ((view4 instanceof TextView) && z) {
                                ((TextView) view4).setText(R.string.ali_user_alipay_quick_login);
                                Drawable drawable = BaseFragment.this.getResources().getDrawable(R.drawable.aliuser_alipay);
                                drawable.setBounds(0, 0, 50, 50);
                                ((TextView) view).setCompoundDrawables(drawable, null, null, null);
                            }
                            try {
                                view.setVisibility(0);
                                if (view2 != null) {
                                    view2.setVisibility(0);
                                }
                                if (BaseFragment.this.needAdaptElder && (view instanceof TextView)) {
                                    ElderUtil.scaleTextSize((TextView) view);
                                }
                                if (view3 == null) {
                                    return;
                                }
                                view3.setVisibility(0);
                                return;
                            } catch (Throwable th) {
                                th.printStackTrace();
                                return;
                            }
                        }
                        view.setVisibility(8);
                        View view5 = view2;
                        if (view5 != null) {
                            view5.setVisibility(8);
                        }
                        View view6 = view3;
                        if (view6 == null) {
                            return;
                        }
                        view6.setVisibility(8);
                    }
                }
            }, new Object[0]);
        }
    }

    public static boolean isSupportAlipay(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c005cc", new Object[]{activity})).booleanValue();
        }
        if (AliMemberSDK.getService(OauthService.class) == null) {
            return false;
        }
        return ((OauthService) AliMemberSDK.getService(OauthService.class)).isAppAuthSurpport(activity, "alipay");
    }

    public static void supportAlipay(final Activity activity, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a09cc3", new Object[]{activity, commonCallback});
        } else if (commonCallback == null || activity == null) {
        } else {
            new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Boolean>() { // from class: com.taobao.login4android.activity.auth.AlipayAuth.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Boolean, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Boolean doInBackground(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                }

                @Override // android.os.AsyncTask
                public /* synthetic */ void onPostExecute(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b105c779", new Object[]{this, bool});
                    } else {
                        a(bool);
                    }
                }

                public Boolean a(Object[] objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("978dc706", new Object[]{this, objArr}) : Boolean.valueOf(AlipayAuth.isSupportAlipay(activity));
                }

                public void a(Boolean bool) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                    } else if (bool.booleanValue()) {
                        commonCallback.onSuccess();
                    } else {
                        commonCallback.onFail(-1, "not support alipay");
                    }
                }
            }, new Object[0]);
        }
    }

    public static void supportAlipayHK(Activity activity, final CommonCallback commonCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a61a06", new Object[]{activity, commonCallback});
        } else if (commonCallback == null || activity == null) {
        } else {
            if (!LoginSwitch.isInABTestRegion("showAlipayHK", 10000)) {
                commonCallback.onFail(-1, "not support alipayHK");
            } else {
                new CoordinatorWrapper().execute(new AsyncTask<Object, Void, Boolean>() { // from class: com.taobao.login4android.activity.auth.AlipayAuth.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // android.os.AsyncTask
                    public /* synthetic */ Boolean doInBackground(Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
                    }

                    @Override // android.os.AsyncTask
                    public /* synthetic */ void onPostExecute(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b105c779", new Object[]{this, bool});
                        } else {
                            a(bool);
                        }
                    }

                    public Boolean a(Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (Boolean) ipChange2.ipc$dispatch("978dc706", new Object[]{this, objArr}) : Boolean.valueOf(BundleUtil.isAppInstalled(DataProviderFactory.getApplicationContext(), SNSPlatform.PLATFORM_ALIPAYHK.getPackageName()));
                    }

                    public void a(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                        } else if (bool.booleanValue()) {
                            CommonCallback.this.onSuccess();
                        } else {
                            CommonCallback.this.onFail(-1, "not support alipayHK");
                        }
                    }
                }, new Object[0]);
            }
        }
    }
}
