package com.taobao.weex.ui;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.bridge.Invoker;
import com.taobao.weex.ui.SimpleComponentHolder;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes9.dex */
public class ExternalLoaderComponentHolder implements IFComponentHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SimpleComponentHolder";
    private Class mClass;
    private final IExternalComponentGetter mClzGetter;
    private Map<String, Invoker> mMethodInvokers;
    private Map<String, Invoker> mPropertyInvokers;
    private final String mType;

    static {
        kge.a(-1819820789);
        kge.a(-591276564);
    }

    @Override // com.taobao.weex.ui.IFComponentHolder
    public void loadIfNonLazy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c57745", new Object[]{this});
        }
    }

    public ExternalLoaderComponentHolder(String str, IExternalComponentGetter iExternalComponentGetter) {
        this.mClzGetter = iExternalComponentGetter;
        this.mType = str;
    }

    private synchronized boolean generate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("665bd780", new Object[]{this})).booleanValue();
        } else if (this.mClass == null) {
            return false;
        } else {
            Pair<Map<String, Invoker>, Map<String, Invoker>> methods = SimpleComponentHolder.getMethods(this.mClass);
            this.mPropertyInvokers = (Map) methods.first;
            this.mMethodInvokers = (Map) methods.second;
            return true;
        }
    }

    @Override // com.taobao.weex.ui.ComponentCreator
    public synchronized WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData});
        }
        if (this.mClass == null) {
            this.mClass = this.mClzGetter.getExternalComponentClass(this.mType, wXSDKInstance);
        }
        WXComponent createInstance = new SimpleComponentHolder.ClazzComponentCreator(this.mClass).createInstance(wXSDKInstance, wXVContainer, basicComponentData);
        createInstance.bindHolder(this);
        return createInstance;
    }

    @Override // com.taobao.weex.ui.IFComponentHolder
    public synchronized Invoker getPropertyInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Invoker) ipChange.ipc$dispatch("780b1bd6", new Object[]{this, str});
        } else if (this.mPropertyInvokers == null && !generate()) {
            return null;
        } else {
            return this.mPropertyInvokers.get(str);
        }
    }

    @Override // com.taobao.weex.bridge.JavascriptInvokable
    public Invoker getMethodInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Invoker) ipChange.ipc$dispatch("2dffba62", new Object[]{this, str});
        }
        if (this.mMethodInvokers == null && !generate()) {
            return null;
        }
        return this.mMethodInvokers.get(str);
    }

    @Override // com.taobao.weex.bridge.JavascriptInvokable
    public synchronized String[] getMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("427e6712", new Object[]{this});
        } else if (this.mMethodInvokers == null && !generate()) {
            return new String[0];
        } else {
            Set<String> keySet = this.mMethodInvokers.keySet();
            return (String[]) keySet.toArray(new String[keySet.size()]);
        }
    }
}
