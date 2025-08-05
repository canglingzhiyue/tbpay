package com.taobao.android.weex_framework.module;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.util.s;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

@Deprecated
/* loaded from: classes6.dex */
public class MUSModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private p mAdapterInstance;
    private final MUSDKInstance mInstance;
    private Set<String> mModuleMethods = new HashSet();
    private final String mModuleName;

    static {
        kge.a(1065594832);
        kge.a(1028243835);
    }

    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        }
    }

    public Object onDispatchMethod(MUSModule mUSModule, String str, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8866c9be", new Object[]{this, mUSModule, str, mUSValueArr, obj});
        }
        return null;
    }

    public void onModuleCreate(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe82ab6d", new Object[]{this, mUSModule});
        }
    }

    public void onModuleDestroy(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d99b5", new Object[]{this, mUSModule});
        }
    }

    public MUSModule(String str, MUSDKInstance mUSDKInstance) {
        this.mModuleName = str;
        this.mInstance = mUSDKInstance;
        onModuleCreate(this);
    }

    public String getModuleName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8cdd20c", new Object[]{this}) : this.mModuleName;
    }

    public p getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("92f1458f", new Object[]{this});
        }
        p pVar = this.mAdapterInstance;
        return pVar != null ? pVar : this.mInstance;
    }

    public final void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            onDestroy();
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            onModuleDestroy(this);
        }
    }

    public Object dispatchMethod(String str, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("51e43020", new Object[]{this, str, mUSValueArr, obj}) : onDispatchMethod(this, str, mUSValueArr, obj);
    }

    public Object dispatchMethodToMain(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f116c87e", new Object[]{this, runnable});
        }
        if (getInstance() != null && !getInstance().isDestroyed()) {
            s.a("Inst#callModule/post", s.a());
            ((MUSDKInstance) getInstance()).postTaskToMain(runnable);
        }
        return null;
    }

    public MUSValue getArgument(MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue) ipChange.ipc$dispatch("4793a668", new Object[]{this, mUSValueArr, new Integer(i)});
        }
        if (i < mUSValueArr.length) {
            return mUSValueArr[i];
        }
        return null;
    }

    public Set<String> getMethods() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("d31d88b2", new Object[]{this}) : this.mModuleMethods;
    }

    public void setAdapterInstance(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156fe64", new Object[]{this, pVar});
        } else {
            this.mAdapterInstance = pVar;
        }
    }
}
