package com.taobao.android.fluid.framework.devtools;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.devtools.IDevToolsService;
import tb.kge;

/* loaded from: classes5.dex */
public class DevToolsNoOpService implements IDevToolsService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1480322573);
        kge.a(-1482446761);
    }

    @Override // com.taobao.android.fluid.devtools.IDevToolsService
    public void attachDevToolsEntry(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ef2e4d", new Object[]{this, viewGroup});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.devtools.IDevToolsService
    public void showException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9883c", new Object[]{this, th});
        }
    }

    @Override // com.taobao.android.fluid.devtools.IDevToolsService
    public void showObserverProfiler(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ecf318d", new Object[]{this, str, str2, new Long(j)});
        }
    }

    @Override // com.taobao.android.fluid.devtools.IDevToolsService
    public void showServiceProfiler(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13b31828", new Object[]{this, str, str2, new Long(j)});
        }
    }

    @Override // com.taobao.android.fluid.devtools.IDevToolsService
    public void traceBeginSection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14046fb2", new Object[]{this, str});
        }
    }

    @Override // com.taobao.android.fluid.devtools.IDevToolsService
    public void traceEndSection(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f0daa00", new Object[]{this, str});
        }
    }
}
