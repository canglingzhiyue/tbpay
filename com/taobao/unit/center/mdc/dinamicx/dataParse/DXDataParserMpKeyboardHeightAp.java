package com.taobao.unit.center.mdc.dinamicx.dataParse;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.util.KeyboardStateHelper;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.g;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import kotlin.text.n;
import tb.fut;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001c\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpKeyboardHeightAp;", "Lcom/taobao/android/dinamicx/expression/parser/IDXDataParser;", "()V", "DEFAULT_HEIGHT_AP", "", "NAME", "", "keyboardHelper", "Lcom/taobao/message/lab/comfrm/util/KeyboardStateHelper;", "screenHeight", "", d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, "getScreenWidth", "()I", "screenWidth$delegate", "Lkotlin/Lazy;", "statusBarHeight", "evalWithArgs", "", "operationList", "", "runtimeParam", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "getScreenHeight", "aty", "Landroid/app/Activity;", WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT, "isKeyboardShow", "", "biz", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class DXDataParserMpKeyboardHeightAp implements fut {
    public static final /* synthetic */ k[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DEFAULT_HEIGHT_AP = 300.0f;
    public static final DXDataParserMpKeyboardHeightAp INSTANCE;
    public static final String NAME = "mpKeyboardHeightAp";
    private static final KeyboardStateHelper keyboardHelper;
    private static int screenHeight;
    private static final kotlin.d screenWidth$delegate;
    private static int statusBarHeight;

    private final int getScreenWidth() {
        IpChange ipChange = $ipChange;
        return ((Number) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("43d49fe", new Object[]{this}) : screenWidth$delegate.getValue())).intValue();
    }

    static {
        kge.a(-652959388);
        kge.a(1343895002);
        $$delegatedProperties = new k[]{t.a(new PropertyReference1Impl(t.b(DXDataParserMpKeyboardHeightAp.class), d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, "getScreenWidth()I"))};
        INSTANCE = new DXDataParserMpKeyboardHeightAp();
        screenWidth$delegate = e.a(DXDataParserMpKeyboardHeightAp$screenWidth$2.INSTANCE);
        keyboardHelper = new KeyboardStateHelper();
        statusBarHeight = -1;
        screenHeight = -1;
    }

    private DXDataParserMpKeyboardHeightAp() {
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context context = null;
        String obj = (objArr == null || (a2 = g.a(objArr, 0)) == null) ? null : a2.toString();
        int i = 40;
        if (q.a((Object) obj, (Object) "inputRowSpacing")) {
            if (dXRuntimeContext != null) {
                context = dXRuntimeContext.m();
            }
            if (!DisplayUtil.isLargeScreen((Activity) context)) {
                i = 26;
            }
            return Integer.valueOf(i);
        } else if (!q.a((Object) obj, (Object) "inputColumnSpacing")) {
            if (isKeyboardShow(dXRuntimeContext, obj)) {
                Logger.e(NAME, "isKeyboardShow");
                return 0;
            }
            Logger.e(NAME, "isKeyboardHide");
            int intSharedPreference = SharedPreferencesUtil.getIntSharedPreference("Preference_KeyBoardHeight", 0);
            if (intSharedPreference <= 0) {
                return Float.valueOf((float) DEFAULT_HEIGHT_AP);
            }
            if (!DisplayUtil.isLargeScreen((Activity) (dXRuntimeContext != null ? dXRuntimeContext.m() : null))) {
                return Float.valueOf((intSharedPreference * 375.0f) / getScreenWidth());
            }
            if (dXRuntimeContext != null) {
                context = dXRuntimeContext.m();
            }
            return Integer.valueOf(DisplayUtil.px2DesignScaleAp((Activity) context, intSharedPreference));
        } else {
            if (!DisplayUtil.isLargeScreen((Activity) (dXRuntimeContext != null ? dXRuntimeContext.m() : null))) {
                return 23;
            }
            Context m = dXRuntimeContext != null ? dXRuntimeContext.m() : null;
            if (!(m instanceof Activity)) {
                m = null;
            }
            Activity activity = (Activity) m;
            if (activity == null) {
                return 40;
            }
            Activity activity2 = activity;
            int designWindowWidth = DisplayUtil.getDesignWindowWidth(activity2);
            int ap2DesignScalePx = DisplayUtil.ap2DesignScalePx(activity2, 70.0f);
            int ap2DesignScalePx2 = designWindowWidth - (DisplayUtil.ap2DesignScalePx(activity2, 20.0f) * 2);
            int i2 = (ap2DesignScalePx2 - (ap2DesignScalePx * 4)) / 3;
            int px2DesignScaleAp = DisplayUtil.px2DesignScaleAp(activity2, i2);
            String str = "screenWidth:" + designWindowWidth;
            String str2 = "itemWidth:" + ap2DesignScalePx;
            String str3 = "displayWidth:" + ap2DesignScalePx2;
            String str4 = "columnWidth:" + i2;
            String str5 = "columnWidthAp:" + px2DesignScaleAp;
            if (px2DesignScaleAp <= 0 || px2DesignScaleAp > 200) {
                px2DesignScaleAp = 80;
            }
            return Integer.valueOf(px2DesignScaleAp);
        }
    }

    private final boolean isKeyboardShow(DXRuntimeContext dXRuntimeContext, String str) {
        WidgetRenderImpl.RenderConfig renderConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6ab9e54", new Object[]{this, dXRuntimeContext, str})).booleanValue();
        }
        Context context = null;
        if (ComponentFrmModule.sFixInputAndroid13) {
            KeyboardStateHelper keyboardStateHelper = keyboardHelper;
            if (dXRuntimeContext != null) {
                context = dXRuntimeContext.m();
            }
            return keyboardStateHelper.isKeyboardShow((Activity) context);
        } else if (q.a((Object) str, (Object) "msgInput") || q.a((Object) str, (Object) "bizDetailInput")) {
            KeyboardStateHelper keyboardStateHelper2 = keyboardHelper;
            if (dXRuntimeContext != null) {
                context = dXRuntimeContext.m();
            }
            return keyboardStateHelper2.isKeyboardShow((Activity) context);
        } else {
            Context m = dXRuntimeContext != null ? dXRuntimeContext.m() : null;
            if (!(m instanceof Activity)) {
                m = null;
            }
            Activity activity = (Activity) m;
            if (activity == null) {
                return false;
            }
            ba b = dXRuntimeContext.b();
            if (!(b instanceof DXWidgetInstance.MPUserContext)) {
                b = null;
            }
            DXWidgetInstance.MPUserContext mPUserContext = (DXWidgetInstance.MPUserContext) b;
            int i = (mPUserContext == null || (renderConfig = mPUserContext.getRenderConfig()) == null) ? 0 : renderConfig.matchParentPaddingTop;
            DXRootView s = dXRuntimeContext.s();
            q.a((Object) s, "runtimeParam.rootView");
            ViewParent parent = s.getParent();
            if (parent == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.View");
            }
            int height = ((View) parent).getHeight() + i;
            int screenHeight2 = getScreenHeight(activity);
            int statusBarHeight2 = getStatusBarHeight(activity);
            int i2 = (screenHeight2 - statusBarHeight2) - height;
            int dip2px = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 62.75f);
            if ((Build.VERSION.SDK_INT >= 19 ? l.d((Context) activity) : false) && n.a(Build.BRAND, "samsung", true)) {
                dip2px = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 70.0f);
            }
            if (i2 > dip2px) {
                Logger.e(NAME, "HEIGHT_THRESHOLD|screenHeight|" + screenHeight2 + "|statusBarHeight|" + statusBarHeight2 + "|displayHeight|" + height + "|heightThreshold|" + dip2px);
            }
            return i2 > dip2px;
        }
    }

    private final int getStatusBarHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9070b1e", new Object[]{this, activity})).intValue();
        }
        if (statusBarHeight < 0) {
            statusBarHeight = DisplayUtil.getStatusBarHeight(activity);
        }
        return statusBarHeight;
    }

    private final int getScreenHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47208a75", new Object[]{this, activity})).intValue();
        }
        Window window = activity.getWindow();
        q.a((Object) window, "aty.window");
        View decorView = window.getDecorView();
        q.a((Object) decorView, "aty.window.decorView");
        View rootView = decorView.getRootView();
        q.a((Object) rootView, "aty.window.decorView.rootView");
        int height = rootView.getHeight();
        screenHeight = height;
        return height;
    }
}
