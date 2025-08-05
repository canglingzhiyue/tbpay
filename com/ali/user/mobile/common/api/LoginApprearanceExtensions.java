package com.ali.user.mobile.common.api;

import com.ali.user.mobile.app.dataprovider.BooleanOrangeResult;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.ui.widget.WidgetExtension;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class LoginApprearanceExtensions extends WidgetExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Class mABHelper;
    public Class mDialogHelper;
    public Class mNavHelper;
    public Class mScaleHelper;
    public Class mUccHelper;
    public boolean needCountryModule = true;
    public boolean needRegister = true;
    public boolean needToolbar = true;
    public boolean needDarkStatusBarMode = true;

    /* loaded from: classes2.dex */
    public interface AsoLoginCallback {
        void onNeedSwitch(String str, DataCallback<Boolean> dataCallback);
    }

    static {
        kge.a(1417550608);
    }

    public int getActivityEnterAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2d9fb6b", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int getActivityExitAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("680f7f7b", new Object[]{this})).intValue();
        }
        return 0;
    }

    public Class getUccHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("152cdba1", new Object[]{this}) : this.mUccHelper;
    }

    public void setUccHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44843ad5", new Object[]{this, cls});
        } else {
            this.mUccHelper = cls;
        }
    }

    public void setNavHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccaf4c87", new Object[]{this, cls});
        } else {
            this.mNavHelper = cls;
        }
    }

    public Class getNavHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("535fcbaf", new Object[]{this}) : this.mNavHelper;
    }

    public Class getABHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("aed3339", new Object[]{this}) : this.mABHelper;
    }

    public void setABHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82f504a5", new Object[]{this, cls});
        } else {
            this.mABHelper = cls;
        }
    }

    public Class getScaleHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("9369ce96", new Object[]{this}) : this.mScaleHelper;
    }

    public boolean needRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bdc5564", new Object[]{this})).booleanValue();
        }
        BooleanOrangeResult needRegister = DataProviderFactory.getOrangeConfig().needRegister();
        return needRegister.orangeExist ? needRegister.value : this.needRegister;
    }

    public boolean needCountryModule() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e6857b37", new Object[]{this})).booleanValue() : this.needCountryModule;
    }

    public boolean isNeedToolbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2365186", new Object[]{this})).booleanValue() : this.needToolbar;
    }

    public boolean isNeedDarkStatusBarMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c86840b9", new Object[]{this})).booleanValue() : this.needDarkStatusBarMode;
    }

    public void setNeedDarkStatusBarMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499121f7", new Object[]{this, new Boolean(z)});
        } else {
            this.needDarkStatusBarMode = z;
        }
    }

    public void setDialogHelper(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe37effe", new Object[]{this, cls});
        } else {
            this.mDialogHelper = cls;
        }
    }

    public Class getDialogHelper() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("27235ec0", new Object[]{this}) : this.mDialogHelper;
    }

    /* loaded from: classes2.dex */
    public static class AsoLoginFlow {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static AsoLoginCallback mAsoLoginCallback;

        static {
            kge.a(1215317870);
        }

        public static void setAsoLoginCallback(AsoLoginCallback asoLoginCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2137764", new Object[]{asoLoginCallback});
            } else {
                mAsoLoginCallback = asoLoginCallback;
            }
        }

        public static AsoLoginCallback getAsoLoginCallback() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AsoLoginCallback) ipChange.ipc$dispatch("f66ad412", new Object[0]) : mAsoLoginCallback;
        }
    }
}
