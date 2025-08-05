package com.alipay.android.msp.ui.views;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.app.FragmentActivity;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.ActivityResultManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class AbsActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Resources.Theme mY;
    private int mZ;

    public static /* synthetic */ Object ipc$super(AbsActivity absActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -801135301:
                super.onUserLeaveHint();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 712753272:
                return super.getContentResolver();
            case 978076981:
                super.setTheme(((Number) objArr[0]).intValue());
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
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
        GlobalHelper.getInstance().init(this);
        super.onCreate(bundle);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this}) : PhoneCashierMspEngine.getMspBase().getResources(this);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources.Theme) ipChange.ipc$dispatch("7642b746", new Object[]{this});
        }
        if (this.mY == null) {
            this.mY = getResources().newTheme();
            Resources.Theme theme = getApplicationContext().getTheme();
            if (theme != null) {
                this.mY.setTo(theme);
            }
            this.mY.applyStyle(this.mZ, true);
        }
        return this.mY;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4c4535", new Object[]{this, new Integer(i)});
            return;
        }
        super.setTheme(i);
        this.mZ = i;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AssetManager) ipChange.ipc$dispatch("7b0fb283", new Object[]{this}) : getApplicationContext().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClassLoader) ipChange.ipc$dispatch("8d8cecd6", new Object[]{this}) : getClass().getClassLoader();
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03fa53b", new Object[]{this});
        } else {
            super.onUserLeaveHint();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ActivityResultManager.handleActivityDestroy(this);
        super.onDestroy();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ContentResolver getContentResolver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentResolver) ipChange.ipc$dispatch("2a7bc078", new Object[]{this});
        }
        ContentResolver contentResolver = super.getContentResolver();
        ContentResolvers.a(contentResolver);
        return contentResolver;
    }

    /* loaded from: classes3.dex */
    public static final class ContentResolvers {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static Field f4989a;

        private ContentResolvers() {
        }

        static {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    Field declaredField = ContentResolver.class.getDeclaredField("mTargetSdkVersion");
                    f4989a = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
        }

        public static /* synthetic */ void a(ContentResolver contentResolver) {
            if (f4989a != null) {
                if (!(Process.myUid() / 100000 == 999)) {
                    return;
                }
                try {
                    f4989a.setInt(contentResolver, 23);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        ActivityResultManager.handleActivityResult(this, i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }
}
