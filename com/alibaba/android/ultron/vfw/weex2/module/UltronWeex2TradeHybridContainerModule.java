package com.alibaba.android.ultron.vfw.weex2.module;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import tb.jqg;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronWeex2TradeHybridContainerModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TradeHybridContainer";
    private static final String TAG = "UltronWeex2TradeHybridContainerModule";

    static {
        kge.a(-623938713);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2TradeHybridContainerModule ultronWeex2TradeHybridContainerModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public UltronWeex2TradeHybridContainerModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    private UltronWeex2DialogFragment getCurrentWeexContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("9be21b8c", new Object[]{this});
        }
        try {
            p ultronWeex2TradeHybridContainerModule = getInstance();
            if (ultronWeex2TradeHybridContainerModule == null) {
                jqg.a(TAG, "getCurrentWeexContainer:", "instance is null");
                return null;
            }
            Context uIContext = ultronWeex2TradeHybridContainerModule.getUIContext();
            if (!(uIContext instanceof FragmentActivity)) {
                jqg.a(TAG, "getCurrentWeexContainer:", "context is not a FragmentActivity");
                return null;
            }
            Fragment findFragmentByTag = ((FragmentActivity) uIContext).getSupportFragmentManager().findFragmentByTag(UltronWeex2DialogFragment.FRAGMENT_TAG);
            if (findFragmentByTag instanceof UltronWeex2DialogFragment) {
                return (UltronWeex2DialogFragment) findFragmentByTag;
            }
            jqg.a(TAG, "getCurrentWeexContainer:", "fragment is not a UltronWeex2DialogFragment");
            return null;
        } catch (Throwable unused) {
            jqg.a(TAG, "getCurrentWeexContainer:", "get UltronWeex2DialogFragment exception.");
            return null;
        }
    }

    @MUSMethod(uiThread = true)
    public void whiteMonitorDone(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ea5316", new Object[]{this, jSONObject});
            return;
        }
        UltronWeex2DialogFragment currentWeexContainer = getCurrentWeexContainer();
        if (currentWeexContainer == null) {
            jqg.a(TAG, "whiteMonitorDone:", "fragment is null");
            return;
        }
        d whiteScreenMonitor = currentWeexContainer.getWhiteScreenMonitor();
        boolean booleanValue = jSONObject.getBooleanValue("success");
        whiteScreenMonitor.a(booleanValue);
        if (booleanValue) {
            return;
        }
        whiteScreenMonitor.a(jSONObject.getString("message"));
    }

    @MUSMethod(uiThread = true)
    public void whiteMonitorMark(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61dc32ab", new Object[]{this, jSONObject});
            return;
        }
        UltronWeex2DialogFragment currentWeexContainer = getCurrentWeexContainer();
        if (currentWeexContainer == null) {
            jqg.a(TAG, "whiteMonitorMark:", "fragment is null");
            return;
        }
        d whiteScreenMonitor = currentWeexContainer.getWhiteScreenMonitor();
        for (int i = 1; i <= 5; i++) {
            String str = c.TAG + i;
            String str2 = Repeat.D + i;
            String string = jSONObject.getString(str);
            String string2 = jSONObject.getString(str2);
            if (string != null) {
                whiteScreenMonitor.a(str, string);
            }
            if (string2 != null) {
                whiteScreenMonitor.b(str2, string2);
            }
        }
    }
}
