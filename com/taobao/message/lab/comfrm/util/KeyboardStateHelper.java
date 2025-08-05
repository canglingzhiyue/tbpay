package com.taobao.message.lab.comfrm.util;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.message.container.dynamic.widget.CustomInsetsFrameLayout;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/taobao/message/lab/comfrm/util/KeyboardStateHelper;", "", "()V", "lastHeightDelta", "", "screenHeight", "statusBarHeight", "getRootViewHeight", "aty", "Landroid/app/Activity;", WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT, "isKeyboardShow", "", "message_comfrm_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class KeyboardStateHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int statusBarHeight = -1;
    private int screenHeight = -1;
    private int lastHeightDelta = -1;

    static {
        kge.a(-1547705315);
    }

    private final int getStatusBarHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9070b1e", new Object[]{this, activity})).intValue();
        }
        if (this.statusBarHeight < 0) {
            this.statusBarHeight = DisplayUtil.getStatusBarHeight(activity);
        }
        return this.statusBarHeight;
    }

    private final int getRootViewHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73832730", new Object[]{this, activity})).intValue();
        }
        Window window = activity.getWindow();
        q.b(window, "aty.window");
        View decorView = window.getDecorView();
        q.b(decorView, "aty.window.decorView");
        View rootView = decorView.getRootView();
        q.b(rootView, "aty.window.decorView.rootView");
        this.screenHeight = rootView.getHeight();
        return this.screenHeight;
    }

    public final boolean isKeyboardShow(Activity activity) {
        int height;
        int height2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa7f70eb", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        int dip2px = DisplayUtil.dip2px(Globals.getApplication(), 62.75f);
        if (activity instanceof ICustomInsetsContainer) {
            CustomInsetsFrameLayout customInsetsFrameLayout = ((ICustomInsetsContainer) activity).getCustomInsetsFrameLayout();
            if (customInsetsFrameLayout != null) {
                if (customInsetsFrameLayout.getInsets()[3] > dip2px) {
                    Logger.e("tbKbDebug", " inserts bottom=" + customInsetsFrameLayout.getInsets()[3] + ",大于阈值，键盘判定开");
                    return true;
                }
                height2 = customInsetsFrameLayout.getHeight() - customInsetsFrameLayout.getInsets()[3];
            } else {
                View findViewById = activity.findViewById(16908290);
                q.b(findViewById, "aty.findViewById<View>(android.R.id.content)");
                height2 = findViewById.getHeight();
            }
            int rootViewHeight = getRootViewHeight(activity);
            if (height2 <= 0 || rootViewHeight <= 0) {
                return false;
            }
            int statusBarHeight = getStatusBarHeight(activity);
            int i = (rootViewHeight - statusBarHeight) - height2;
            if (this.lastHeightDelta != i) {
                Logger.e("tbKbDebug", "heightDelta=" + i + ",screenHeight=" + rootViewHeight + ",statusBarHeight=" + statusBarHeight + ",displayHeight=" + height2);
                Log.e("tbKbDebug", "heightDelta=" + i + ",screenHeight=" + rootViewHeight + ",statusBarHeight=" + statusBarHeight + ",displayHeight=" + height2);
                this.lastHeightDelta = i;
            }
            return i > dip2px;
        }
        if (TBMainHost.fromActivity(activity) != null) {
            View findViewById2 = activity.findViewById(16908290);
            q.b(findViewById2, "aty.findViewById<View>(android.R.id.content)");
            height = findViewById2.getHeight();
        } else {
            Rect rect = new Rect();
            Window window = activity.getWindow();
            q.b(window, "aty.window");
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            height = rect.height();
        }
        return (getRootViewHeight(activity) - getStatusBarHeight(activity)) - height > dip2px;
    }
}
