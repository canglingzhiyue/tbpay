package com.taobao.android.fluid.business.videocollection.poplayer;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PopupDialog";

    static {
        kge.a(-234928160);
    }

    public static boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{fluidContext})).booleanValue();
        }
        if (!b.b()) {
            spz.c("PopupDialog", "Native Orange开关关闭");
            return false;
        }
        Uri fluidUrl = fluidContext.getInstanceConfig().getFluidUrl();
        if (fluidUrl == null || !StringUtils.equals(fluidUrl.getQueryParameter("type"), com.taobao.android.fluid.business.globalinteraction.render.a.GUANGGUANG_COLLECTION)) {
            spz.c("PopupDialog", "当前非二跳页");
            return false;
        } else if (fluidContext.getService(INativeCollectionPoplayerService.class) == null) {
            spz.c("PopupDialog", "合集远程化服务未加载");
            return false;
        } else {
            boolean c = b.c();
            if (!c) {
                spz.c("PopupDialog", c + "--NativePopABConfig");
                return false;
            }
            spz.c("PopupDialog", "位于native合集页面");
            return true;
        }
    }

    public static boolean b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f4da19f", new Object[]{fluidContext})).booleanValue();
        }
        if (!a(fluidContext)) {
            spz.c("PopupDialog", "Native浮层关闭");
            return false;
        }
        boolean h = b.h();
        if (!h) {
            spz.c("PopupDialog", h + "--isResizeCollectionVideoOrange");
            return false;
        }
        boolean g = b.g();
        if (!g) {
            spz.c("PopupDialog", g + "--isResizeCollectionVideoABConfig");
            return false;
        }
        spz.c("PopupDialog", "使用合集浮层联动功能");
        return true;
    }
}
