package com.ali.user.mobile.base.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.helper.IDialogHelper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.ScreenUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginEnvType;
import java.util.Map;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes2.dex */
public class BaseFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Pattern REG_EMAIL;
    public BaseActivity mAttachedActivity;
    public IDialogHelper mDialogHelper;
    public View mFragmentView;
    public Activity mHostActivity;
    public boolean isConfigureChanged = false;
    public int mCurrentScreenOrientation = 1;
    public boolean needAdaptElder = true;

    public static /* synthetic */ Object ipc$super(BaseFragment baseFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 434397186:
                super.onHiddenChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return -1;
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : "";
    }

    public void goAlipay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a781a0d9", new Object[]{this});
        }
    }

    public void goAlipay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b32d1b", new Object[]{this, new Boolean(z)});
        }
    }

    public void goFacebook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f179155", new Object[]{this});
        }
    }

    public void goGoogle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e20548", new Object[]{this});
        }
    }

    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
        }
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onScreenRotate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfd3ab6", new Object[]{this, new Integer(i)});
        }
    }

    static {
        kge.a(-982491674);
        REG_EMAIL = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (getActivity() == null || Debuggable.isDebug() || DataProviderFactory.getDataProvider().getEnvType() != LoginEnvType.ONLINE.getSdkEnvType()) {
            return;
        }
        getActivity().getWindow().addFlags(8192);
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(getLayoutContent(), (ViewGroup) null);
        this.mFragmentView = inflate;
        initViews(inflate);
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BaseActivity) {
            this.mAttachedActivity = (BaseActivity) activity;
        }
        this.mHostActivity = activity;
        if (AliUserLogin.mAppreanceExtentions == null || AliUserLogin.mAppreanceExtentions.getDialogHelper() == null) {
            return;
        }
        try {
            this.mDialogHelper = (IDialogHelper) AliUserLogin.mAppreanceExtentions.getDialogHelper().newInstance();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e46002", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onHiddenChanged(z);
        if (!this.isConfigureChanged || z) {
            return;
        }
        onScreenRotate(this.mCurrentScreenOrientation);
        this.isConfigureChanged = false;
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        this.mCurrentScreenOrientation = configuration.orientation;
        onScreenRotate(configuration.orientation);
    }

    public ActionBar getSupportActionBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActionBar) ipChange.ipc$dispatch("1292b959", new Object[]{this}) : getAppCompatActivity().getSupportActionBar();
    }

    public AppCompatActivity getAppCompatActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatActivity) ipChange.ipc$dispatch("b5cab6ac", new Object[]{this}) : this.mAttachedActivity;
    }

    public boolean isActivityAvaiable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ec97ffb", new Object[]{this})).booleanValue();
        }
        return (getActivity() != null && this.mAttachedActivity != null && (Build.VERSION.SDK_INT >= 17 ? !(this.mAttachedActivity.isFinishing() || this.mAttachedActivity.isDestroyed()) : !this.mAttachedActivity.isFinishing())) && isAdded();
    }

    public boolean isActive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue() : isActivityAvaiable();
    }

    public Activity getBaseActivity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("57c5e1cb", new Object[]{this}) : this.mAttachedActivity;
    }

    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.alert(this.mHostActivity, str, str2, str3, onClickListener, str4, onClickListener2);
    }

    public void alertList(String[] strArr, DialogInterface.OnClickListener onClickListener, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c07305", new Object[]{this, strArr, onClickListener, new Boolean(z)});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.alertList(strArr, onClickListener, z);
    }

    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else if (this.mDialogHelper == null || !isActivityAvaiable()) {
        } else {
            this.mDialogHelper.toast(getActivity(), str, i);
        }
    }

    public void showProgress(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97f3b5b", new Object[]{this, str});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.showProgressDialog(this.mHostActivity, str, true);
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else {
            showProgress("");
        }
    }

    public void dismissLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (getActivity() == null || getActivity().isFinishing()) {
        } else {
            dismissProgress();
        }
    }

    public void dismissProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c8efde", new Object[]{this});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.dismissProgressDialog();
    }

    public void dismissAlertDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ca6061", new Object[]{this});
            return;
        }
        IDialogHelper iDialogHelper = this.mDialogHelper;
        if (iDialogHelper == null) {
            return;
        }
        iDialogHelper.dismissAlertDialog();
    }

    public void addControl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a730d", new Object[]{this, str});
        } else {
            UserTrackAdapter.control(getPageName(), str);
        }
    }

    public void addControl(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efab4cd8", new Object[]{this, str, map});
        } else {
            UserTrackAdapter.control(getPageName(), str, map);
        }
    }

    public void uiShown(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa789ae", new Object[]{this, str});
        } else {
            UserTrackAdapter.UIShown(getPageName(), str);
        }
    }

    public void viewVisibleAnimate(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2ab8c", new Object[]{this, view, new Integer(i)});
            return;
        }
        view.setVisibility(0);
        createAnimator(view, 0, ScreenUtil.dip2px(getContext(), i)).start();
    }

    public void viewGoneAnimate(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18381aee", new Object[]{this, view});
            return;
        }
        ValueAnimator createAnimator = createAnimator(view, view.getHeight(), 0);
        createAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.ali.user.mobile.base.ui.BaseFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                } else {
                    view.setVisibility(8);
                }
            }
        });
        createAnimator.start();
    }

    public ValueAnimator createAnimator(final View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("30ce614c", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.ali.user.mobile.base.ui.BaseFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = intValue;
                view.setLayoutParams(layoutParams);
            }
        });
        return ofInt;
    }

    public boolean isEmailValid(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e943899f", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && REG_EMAIL.matcher(str).matches();
    }
}
