package com.taobao.android.dinamicx;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u0015"}, d2 = {"Lcom/taobao/android/dinamicx/DXAutoSizeImpl;", "Lcom/taobao/android/dinamicx/IDXAutoSizeInterface;", "()V", "getScalingRatio", "", "activity", "Landroid/app/Activity;", "getScreenType", "", "ctx", "Landroid/content/Context;", "getScreenWidth", "", "context", "forceReset", "", "getWindowType", "getWindowWidth", "isFoldDevice", "isPortraitLayout", "isTablet", "TBDinamicX_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class l implements bg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public l() {
        com.taobao.android.autosize.h.a().c(AnonymousClass1.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "changeType", "", com.taobao.tao.flexbox.layoutmanager.player.videodecide.c.ARRAY_KEY_CONFIGURATION, "Landroid/content/res/Configuration;", "onScreenChanged"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.taobao.android.dinamicx.l$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static final class AnonymousClass1 implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            OnScreenChangedListener.CC.$default$onActivityChanged(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public final void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                return;
            }
            kotlin.jvm.internal.q.d(configuration, "configuration");
            DinamicXEngine.a(true);
        }
    }

    @Override // com.taobao.android.dinamicx.bg
    public boolean b(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, ctx})).booleanValue();
        }
        kotlin.jvm.internal.q.d(ctx, "ctx");
        return com.taobao.android.autosize.h.a().b(ctx);
    }

    @Override // com.taobao.android.dinamicx.bg
    public boolean a(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, ctx})).booleanValue();
        }
        kotlin.jvm.internal.q.d(ctx, "ctx");
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return com.taobao.android.autosize.l.d(ctx);
    }

    @Override // com.taobao.android.dinamicx.bg
    public boolean c(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, ctx})).booleanValue();
        }
        kotlin.jvm.internal.q.d(ctx, "ctx");
        return com.taobao.android.autosize.l.b(ctx);
    }

    @Override // com.taobao.android.dinamicx.bg
    public int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{this, activity})).intValue();
        }
        kotlin.jvm.internal.q.d(activity, "activity");
        return com.taobao.android.autosize.i.a(activity).width();
    }

    @Override // com.taobao.android.dinamicx.bg
    public String d(Context ctx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c344f03", new Object[]{this, ctx});
        }
        kotlin.jvm.internal.q.d(ctx, "ctx");
        return com.taobao.android.autosize.h.a().d(ctx).toString();
    }

    @Override // com.taobao.android.dinamicx.bg
    public String b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92892385", new Object[]{this, activity});
        }
        kotlin.jvm.internal.q.d(activity, "activity");
        return com.taobao.android.autosize.h.a().b(activity).toString();
    }

    @Override // com.taobao.android.dinamicx.bg
    public float c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("792c472c", new Object[]{this, activity})).floatValue();
        }
        kotlin.jvm.internal.q.d(activity, "activity");
        return com.taobao.android.autosize.h.a().a(activity);
    }

    @Override // com.taobao.android.dinamicx.bg
    public int a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258fda67", new Object[]{this, context, new Boolean(z)})).intValue();
        }
        kotlin.jvm.internal.q.d(context, "context");
        return com.taobao.android.autosize.f.a(context, z);
    }
}
