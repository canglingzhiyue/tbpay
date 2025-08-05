package com.taobao.android.fluid.devtools;

import android.view.ViewGroup;
import com.taobao.android.fluid.core.FluidService;

/* loaded from: classes5.dex */
public interface IDevToolsService extends FluidService {
    public static final String SERVICE_NAME = "IDevToolsService";

    void attachDevToolsEntry(ViewGroup viewGroup);

    void showException(Throwable th);

    void showObserverProfiler(String str, String str2, long j);

    void showServiceProfiler(String str, String str2, long j);

    void traceBeginSection(String str);

    void traceEndSection(String str);
}
