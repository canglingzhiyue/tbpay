package com.taobao.android.voiceassistant.pop;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.login4android.api.Login;
import com.taobao.tbpoplayer.view.PopCustomNativeBaseView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import tb.jru;
import tb.jrw;
import tb.jsb;
import tb.jss;
import tb.jst;
import tb.kge;
import tb.mxf;

/* loaded from: classes.dex */
public class VoiceAssistantNativePop extends PopCustomNativeBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SETTING_SP_NAME = "TAO_GENERAL_SETTING_SP";
    private static final String VIRTUAL_ASSISTANT_KEY = "VIRTUAL_ASSISTANT_KEY";
    public Object realNativePop;
    public FrameLayout shellFrameLayout;

    static {
        kge.a(-1736862240);
    }

    public static /* synthetic */ Object ipc$super(VoiceAssistantNativePop voiceAssistantNativePop, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775111991:
                super.hide();
                return null;
            case -934439597:
                super.close((OnePopModule.OnePopLoseReasonCode) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3]);
                return null;
            case -483678593:
                super.close();
                return null;
            case -340027132:
                super.show();
                return null;
            case 988548963:
                super.onActivityPaused();
                return null;
            case 1889590256:
                super.onActivityResumed();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(VoiceAssistantNativePop voiceAssistantNativePop, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fe0413e", new Object[]{voiceAssistantNativePop, context});
        } else {
            voiceAssistantNativePop.addRealView(context);
        }
    }

    public VoiceAssistantNativePop(Context context) {
        super(context);
        this.shellFrameLayout = null;
        this.realNativePop = null;
    }

    private void installRemoteAndAddRealView(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccfb34f3", new Object[]{this, context});
        } else if (jst.a()) {
            addRealView(context);
        } else {
            jst.a(new jss() { // from class: com.taobao.android.voiceassistant.pop.VoiceAssistantNativePop.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jss
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (!jru.a()) {
                        jru.b();
                    }
                    VoiceAssistantNativePop.access$000(VoiceAssistantNativePop.this, context);
                }
            });
        }
    }

    private void addRealView(Context context) {
        try {
            Class<?> cls = Class.forName("com.taobao.android.voiceassistant.pop.VoiceAssistantRealNativePop");
            Constructor<?> constructor = cls.getConstructor(Context.class);
            constructor.setAccessible(true);
            this.realNativePop = constructor.newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod(mxf.initView, Context.class);
            declaredMethod.setAccessible(true);
            View view = (View) declaredMethod.invoke(this.realNativePop, context);
            if (!(this.realNativePop instanceof PopCustomNativeBaseView)) {
                return;
            }
            ((PopCustomNativeBaseView) this.realNativePop).addView(view, new FrameLayout.LayoutParams(-1, -1));
            if (this.shellFrameLayout == null) {
                return;
            }
            this.shellFrameLayout.addView((PopCustomNativeBaseView) this.realNativePop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.tbpoplayer.view.PopCustomNativeBaseView
    public View initView(Context context) {
        jrw jrwVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fe1492ae", new Object[]{this, context});
        }
        if (!(context instanceof Activity)) {
            Log.e("caoxi", "VoiceAssistantNativePop context is not Activity");
            return null;
        }
        if (!isMyTaoSwitchOpen(context) || !isElderHome() || !Login.checkSessionValid()) {
            z = false;
        }
        Log.e("caoxi", "isOpen " + z);
        if (!z) {
            Log.e("caoxi", "VoiceAssistantNativePop context not open");
            return null;
        }
        if (context instanceof jrw) {
            jrwVar = (jrw) context;
        } else {
            jrwVar = jsb.a.DEFAULT;
        }
        if (!jrwVar.bO_().e) {
            Log.e("caoxi", "appearance not enabled");
            return null;
        }
        this.shellFrameLayout = new FrameLayout(context);
        this.shellFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        installRemoteAndAddRealView(context);
        displayMe();
        return this.shellFrameLayout;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void hide() {
        super.hide();
        if (this.realNativePop == null) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.taobao.android.voiceassistant.pop.VoiceAssistantRealNativePop").getDeclaredMethod("hide", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.realNativePop, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isMyTaoSwitchOpen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("127ed55b", new Object[]{context})).booleanValue();
        }
        boolean z = context.getSharedPreferences(SETTING_SP_NAME, 0).getBoolean("VIRTUAL_ASSISTANT_KEY", true);
        Log.e("caoxi", "isMyTaoSwitchOpen " + z);
        return z;
    }

    public static boolean isElderHome() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5178e50a", new Object[0])).booleanValue();
        }
        boolean equals = "1".equals(TBRevisionSwitchManager.i().c("elderHome"));
        Log.e("caoxi", "isElderHome " + equals);
        return equals;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void show() {
        if (this.realNativePop == null) {
            return;
        }
        if (!isDisplaying()) {
            displayMe();
        }
        super.show();
        try {
            Method declaredMethod = Class.forName("com.taobao.android.voiceassistant.pop.VoiceAssistantRealNativePop").getDeclaredMethod("show", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.realNativePop, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("caoxi", "VoiceAssistantNativePop show exception " + e);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityResumed() {
        super.onActivityResumed();
        if (this.realNativePop == null) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.taobao.android.voiceassistant.pop.VoiceAssistantRealNativePop").getDeclaredMethod("onActivityResumed", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.realNativePop, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityPaused() {
        super.onActivityPaused();
        if (this.realNativePop == null) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.taobao.android.voiceassistant.pop.VoiceAssistantRealNativePop").getDeclaredMethod("onActivityPaused", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.realNativePop, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void close(OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str, String str2, String str3) {
        super.close(onePopLoseReasonCode, str, str2, str3);
        if (this.realNativePop == null) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.taobao.android.voiceassistant.pop.VoiceAssistantRealNativePop").getDeclaredMethod("close", OnePopModule.OnePopLoseReasonCode.class, String.class, String.class, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.realNativePop, onePopLoseReasonCode, str, str2, str3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void close() {
        super.close();
        if (this.realNativePop == null) {
            return;
        }
        try {
            Method declaredMethod = Class.forName("com.taobao.android.voiceassistant.pop.VoiceAssistantRealNativePop").getDeclaredMethod("close", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.realNativePop, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
