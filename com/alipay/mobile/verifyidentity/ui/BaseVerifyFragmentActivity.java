package com.alipay.mobile.verifyidentity.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.ui.helper.ActivityHelper;
import com.alipay.mobile.verifyidentity.ui.helper.DialogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public abstract class BaseVerifyFragmentActivity extends AdapterFragmentActivity implements ActivityResponsable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ActivityHelper f6081a;
    public MicroModuleContext mMicroModuleContext;
    public MicroModule mModule;

    public static /* synthetic */ Object ipc$super(BaseVerifyFragmentActivity baseVerifyFragmentActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.VITranslucentBaseTheme);
        super.onCreate(bundle);
        this.f6081a = new ActivityHelper(this);
        this.mModule = this.f6081a.getModule();
        this.mMicroModuleContext = this.f6081a.getMicroModuleContext();
        if (this.mModule == null) {
            if (ActivityHelper.isInWhiteList(getClass().getName())) {
                return;
            }
            this.mModule = this.f6081a.whenModuleIsNull();
            finish();
        }
        if (MicroModuleContext.getInstance().canTaskContinue(this.mModule.getTask())) {
            return;
        }
        VerifyLogCat.e(getClass().getSimpleName(), "Activity所属Task已经过期，直接销毁");
        finish();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f6081a.onResume();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.f6081a.onPause();
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.f6081a.finish();
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.f6081a.onNewIntent(intent);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void toast(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4329f88b", new Object[]{this, str, new Integer(i)});
        } else {
            this.f6081a.toast(str, i);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a6743", new Object[]{this, str});
        } else {
            this.f6081a.showProgressDialog(str);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a225aa", new Object[]{this, str, new Boolean(z), onCancelListener});
        } else {
            this.f6081a.showProgressDialog(str, z, onCancelListener);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a3426a", new Object[]{this, str, new Boolean(z), onCancelListener, new Boolean(z2)});
        } else {
            this.f6081a.showProgressDialog(str, z, onCancelListener, z2);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void dismissProgressDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afa6c806", new Object[]{this});
        } else {
            this.f6081a.dismissProgressDialog();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17008757", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2});
        } else {
            this.f6081a.alert(str, str2, str3, onClickListener, str4, onClickListener2);
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.ActivityResponsable
    public void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82bc296", new Object[]{this, str, str2, str3, onClickListener, str4, onClickListener2, bool});
        } else {
            this.f6081a.alert(str, str2, str3, onClickListener, str4, onClickListener2, bool);
        }
    }

    public boolean isDialogShowing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe93935e", new Object[]{this})).booleanValue() : this.f6081a.getDialogHelper().isDialogShowing();
    }

    public DialogHelper getDialogHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DialogHelper) ipChange.ipc$dispatch("3a7cfdc6", new Object[]{this}) : this.f6081a.getDialogHelper();
    }
}
