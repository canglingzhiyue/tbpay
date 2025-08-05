package com.taobao.android.live.plugin.atype.flexalocal.projectscreen;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import tb.ddw;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TAOLIVEPROJECTSCREENACTION = -5824305943662705981L;
    public static final String EVENT_DEVICE_LIST_REFRESH = "deviceListRefresh";
    public static final String EVENT_JUMP_NETWORK_SETTINGS = "jumpLocalNetwork";
    public static final String EVENT_OPEN_HELP = "openProjectHelp";
    public static final String EVENT_PROJECT_DEVICE_SELECTED = "projectDeviceSelected";
    public static final String EVENT_PROJECT_SCREEN_REFRESH = "playRefresh";
    public static final String EVENT_STOP_PROJECT_SCREEN = "stopPlay";
    public static final String EVENT_SWITCH_DEVICE = "changeDeviceList";

    static {
        kge.a(516736071);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length == 0 || dXRuntimeContext == null) {
        } else {
            ddw.a().a((String) objArr[0], objArr.length > 1 ? objArr[1] : null);
        }
    }
}
