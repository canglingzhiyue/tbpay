package com.alibaba.ariver.kernel.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class LangResourceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1930373073);
    }

    public static String getString(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88a0c8f7", new Object[]{context, new Integer(i)});
        }
        if (context != null) {
            return context.getString(i);
        }
        return a(i);
    }

    public static String getString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{new Integer(i)}) : a(i);
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        Activity activity = rVEnvironmentService.getTopActivity().get();
        String str = null;
        try {
            if (activity != null) {
                str = activity.getString(i);
            } else {
                str = rVEnvironmentService.getApplicationContext().getString(i);
            }
        } catch (Resources.NotFoundException e) {
            e.printStackTrace();
        }
        return str;
    }
}
