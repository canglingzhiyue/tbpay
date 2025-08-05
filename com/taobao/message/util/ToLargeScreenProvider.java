package com.taobao.message.util;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v4.app.Fragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.autosize.d;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.message.kit.provider.IToLargeScreenProvider;
import com.taobao.message.uikit.util.ObserverScreenListener;
import com.taobao.message.uikit.util.ObserverScreenManager;
import tb.gbg;
import tb.kge;

/* loaded from: classes7.dex */
public class ToLargeScreenProvider implements IToLargeScreenProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    private static OnScreenChangedListener mOnScreenChangedListener;

    static {
        kge.a(-1452655061);
        kge.a(-1090531362);
        TAG = "ToLargeScreenProvider";
        mOnScreenChangedListener = new OnScreenChangedListener() { // from class: com.taobao.message.util.ToLargeScreenProvider.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                    return;
                }
                try {
                    ObserverScreenManager.getInstance().notifyObserver(configuration.toString());
                } catch (Throwable unused) {
                }
            }
        };
        h.a().c(mOnScreenChangedListener);
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public boolean isLargeScreen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe5b6e48", new Object[]{this, context})).booleanValue();
        }
        return l.b(context) || (Build.VERSION.SDK_INT >= 19 ? l.d(context) : false);
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public String isOpenHeaderStr(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e908ef7", new Object[]{this, activity});
        }
        if (!isLargeScreen(activity)) {
            return "0";
        }
        WindowType b = h.a().b(activity);
        return (b == WindowType.MEDIUM || b == WindowType.LARGE || b == WindowType.MAX) ? "1" : "0";
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public Boolean isOpenHeader(Activity activity) {
        WindowType b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("38753e97", new Object[]{this, activity});
        }
        if (isLargeScreen(activity) && ((b = h.a().b(activity)) == WindowType.MEDIUM || b == WindowType.LARGE || b == WindowType.MAX)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public void startActivityRoute(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47dae9a6", new Object[]{this, context, intent});
            return;
        }
        if (intent != null) {
            intent.putExtra("stdPopModal", false);
            intent.putExtra("stdPopEnablePadActTransition", false);
        }
        d.a(context, intent);
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public void startActivityForResultRoute(Activity activity, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a901d859", new Object[]{this, activity, intent, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 16) {
            if (intent != null) {
                intent.putExtra("stdPopModal", false);
                intent.putExtra("stdPopEnablePadActTransition", false);
            }
            d.a(activity, intent, i);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public void startActivityForResultRoute(Fragment fragment, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683f9ccf", new Object[]{this, fragment, intent, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 16) {
            if (intent != null) {
                intent.putExtra("stdPopModal", false);
                intent.putExtra("stdPopEnablePadActTransition", false);
            }
            d.a(fragment, intent, i);
        } else {
            fragment.startActivityForResult(intent, i);
        }
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public void autoSetRequestedOrientation(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4082ae", new Object[]{this, activity});
            return;
        }
        try {
            if (activity.getPackageManager().getActivityInfo(new ComponentName(activity.getPackageName(), activity.getLocalClassName()), 1).screenOrientation != 1 || !l.b(activity.getApplicationContext())) {
                return;
            }
            activity.setRequestedOrientation(-1);
        } catch (Throwable unused) {
        }
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public void registerOnScreenChangedObserver(ObserverScreenListener observerScreenListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a6b93d7", new Object[]{this, observerScreenListener});
        } else {
            ObserverScreenManager.getInstance().add(observerScreenListener);
        }
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public void unRegisterOnScreenChangedObserver(ObserverScreenListener observerScreenListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4619b3e", new Object[]{this, observerScreenListener});
        } else {
            ObserverScreenManager.getInstance().remove(observerScreenListener);
        }
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public int ap2DesignScalePx(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b84a0f23", new Object[]{this, context, new Float(f)})).intValue();
        }
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext != null && isLargeScreen(context)) {
            return gbg.a(activityFromContext, f);
        }
        return gbg.b(context, f);
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public int getDesignWindowWidth(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90a76df2", new Object[]{this, context})).intValue() : gbg.b(getActivityFromContext(context));
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public int getMaxWindowWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14fe5d6c", new Object[]{this, context})).intValue();
        }
        Activity activityFromContext = getActivityFromContext(context);
        if (isLargeScreen(context)) {
            return gbg.b(activityFromContext);
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public int px2DesignScaleAp(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9376f63", new Object[]{this, context, new Float(f)})).intValue();
        }
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext != null && isLargeScreen(context)) {
            return gbg.b(activityFromContext, f);
        }
        return gbg.c(context, f);
    }

    @Override // com.taobao.message.kit.provider.IToLargeScreenProvider
    public Activity getActivityFromContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("16e9b907", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof Application) && !(context instanceof Service)) {
            while (context != null && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
        }
        return null;
    }
}
