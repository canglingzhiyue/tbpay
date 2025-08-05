package com.taobao.android.weex_framework.module.builtin;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.MUSAppMonitor;
import tb.jug;
import tb.kge;

/* loaded from: classes6.dex */
public final class WXAppMonitorModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS;
    public static final String NAME = "MUSAppMonitor";

    public static /* synthetic */ Object ipc$super(WXAppMonitorModule wXAppMonitorModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1816786567);
        METHODS = new String[]{"commitCustomError", "commitCustomPerf"};
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -1563722095) {
            if (hashCode == -1240515744 && str2.equals("commitCustomError")) {
                c = 0;
            }
        } else if (str2.equals("commitCustomPerf")) {
            c = 1;
        }
        if (c == 0) {
            commitCustomError(weexValueArr);
            return null;
        } else if (c != 1) {
            return null;
        } else {
            commitCustomPerf(weexValueArr);
            return null;
        }
    }

    private void commitCustomError(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e891883e", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        String stringValueOrNull2 = getArg(weexValueArr, 1).toStringValueOrNull();
        jug jugVar = (jug) getWeexInstance().getExtend(jug.class);
        if (jugVar == null) {
            return;
        }
        MUSAppMonitor.f(jugVar.a(), stringValueOrNull, stringValueOrNull2);
    }

    private void commitCustomPerf(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f37066f", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        float floatValue = getArg(weexValueArr, 1).toFloatValue();
        jug jugVar = (jug) getWeexInstance().getExtend(jug.class);
        if (jugVar == null) {
            return;
        }
        jugVar.b().a(stringValueOrNull, Math.round(floatValue));
    }
}
