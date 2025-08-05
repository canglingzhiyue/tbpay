package com.alipay.android.msp.framework.dataplatform;

import com.alipay.android.msp.plugin.engine.IDataCollectorEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class DataCollector implements IDataCollectorEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public void addErrorNode(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("517c6082", new Object[]{this, str, str2, str3, str4, str5});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public void addErrorNode(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426f2dcc", new Object[]{this, str, str2, str3, str4, str5, str6});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public boolean addFlowNode(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("907b334f", new Object[]{this, str, str2, str3, str4, str5, str6, strArr})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public boolean addFlowNode(String str, String str2, String str3, String str4, String str5, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e8896d9", new Object[]{this, str, str2, str3, str4, str5, strArr})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public Object getAvailableWorker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5deeb0ba", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public String newInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("538ec63a", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public String newInstance(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f109b730", new Object[]{this, str, str2});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public void registerJSApi(String str, IDataCollectorEngine.IJSApi iJSApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e940e9cb", new Object[]{this, str, iJSApi});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public void sessionEnd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72efb780", new Object[]{this, str, str2});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.IDataCollectorEngine
    public boolean setSectionNode(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b30a69f", new Object[]{this, str, str2, str3, map})).booleanValue();
        }
        return false;
    }
}
