package com.alibaba.android.bindingx.core;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.bindingx.core.internal.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class BindingXJSFunctionRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final BindingXJSFunctionRegister sInstance;
    private final LinkedHashMap<String, m> mJSFunctionMap = new LinkedHashMap<>(8);

    static {
        kge.a(1432394124);
        sInstance = new BindingXJSFunctionRegister();
    }

    public static BindingXJSFunctionRegister getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BindingXJSFunctionRegister) ipChange.ipc$dispatch("218c5c27", new Object[0]) : sInstance;
    }

    public void registerJSFunction(String str, m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40627f14", new Object[]{this, str, mVar});
        } else if (StringUtils.isEmpty(str) || mVar == null) {
        } else {
            this.mJSFunctionMap.put(str, mVar);
        }
    }

    public boolean unregisterJSFunction(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fe865052", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && this.mJSFunctionMap.remove(str) != null;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.mJSFunctionMap.clear();
        }
    }

    public Map<String, m> getJSFunctions() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("373e6b8", new Object[]{this}) : this.mJSFunctionMap;
    }
}
