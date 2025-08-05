package com.taobao.android.weex.module;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.b;
import com.taobao.android.weex.i;
import com.taobao.android.weex_framework.util.j;
import com.taobao.android.weex_framework.util.o;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class WeexInnerModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeexInstanceImpl mWeexInstance;

    static {
        kge.a(-413821191);
        kge.a(396540296);
    }

    public abstract WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception;

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799e073", new Object[]{this, str, iVar});
        } else {
            this.mWeexInstance = (WeexInstanceImpl) iVar.a();
        }
    }

    public WeexInstance getWeexInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("e85302a1", new Object[]{this}) : this.mWeexInstance;
    }

    public final void executeInMain(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3405ab", new Object[]{this, oVar});
        } else {
            j.b(oVar);
        }
    }

    public WeexValue getArg(WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("91c9fc01", new Object[]{this, weexValueArr, new Integer(i)});
        }
        if (i >= weexValueArr.length) {
            return WeexValueImpl.ofUndefined();
        }
        return weexValueArr[i];
    }

    public b getCallback(WeexValue[] weexValueArr, int i) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9f041934", new Object[]{this, weexValueArr, new Integer(i)}) : getArg(weexValueArr, i).toFunctionOrNull(getWeexInstance());
    }

    public void argCount(WeexValue[] weexValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4525edac", new Object[]{this, weexValueArr, new Integer(i)});
            return;
        }
        while (i < weexValueArr.length) {
            WeexValue weexValue = weexValueArr[i];
            if (weexValue.getType() == WeexValue.Type.FUNCTION) {
                this.mWeexInstance.removeCallback(weexValue.getFunctionID());
            }
            i++;
        }
    }
}
