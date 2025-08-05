package com.taobao.monitor.impl.common;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.trace.m;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTIVITY_FPS_DISPATCHER = "ACTIVITY_FPS_DISPATCHER";
    public static final String ACTIVITY_LIFECYCLE_DISPATCHER = "ACTIVITY_LIFECYCLE_DISPATCHER";
    public static final String ACTIVITY_SCROLL_HITCH_RATE_V2_DISPATCHER = "ACTIVITY_SCROLL_HITCH_RATE_V2_DISPATCHER";
    public static final String APPLICATION_BACKGROUND_CHANGED_DISPATCHER = "APPLICATION_BACKGROUND_CHANGED_DISPATCHER";
    public static final String APPLICATION_LOW_MEMORY_DISPATCHER = "APPLICATION_LOW_MEMORY_DISPATCHER";
    public static final String BATTERY_DISPATCHER = "BATTERY_DISPATCHER";
    public static final String CLOCKED_MEMORY_DISPATCHER = "CLOCKED_MEMORY_DISPATCHER";
    public static final String CUSTOM_PAGE_LIFECYCLE_DISPATCHER = "CUSTOM_PAGE_LIFECYCLE_DISPATCHER";
    public static final String FRAGMENT_LIFECYCLE_DISPATCHER = "FRAGMENT_LIFECYCLE_DISPATCHER";
    public static final String FRAGMENT_LIFECYCLE_FUNCTION_DISPATCHER = "FRAGMENT_LIFECYCLE_FUNCTION_DISPATCHER";
    public static final String IMAGE_STAGE_DISPATCHER = "IMAGE_STAGE_DISPATCHER";
    public static final String LOOPER_HEAVY_MSG_DISPATCHER = "LOOPER_HEAVY_MSG_DISPATCHER";
    public static final String NETWORK_STAGE_DISPATCHER = "NETWORK_STAGE_DISPATCHER";
    public static final String PAGE_FIRST_FRAME_DISPATCHER = "PAGE_FIRST_FRAME_DISPATCHER";
    public static final String PAGE_LEAVE_DISPATCHER = "PAGE_LEAVE_DISPATCHER";
    public static final String PAGE_RENDER_DISPATCHER = "PAGE_RENDER_DISPATCHER";
    public static final String WINDOW_EVENT_DISPATCHER = "WINDOW_EVENT_DISPATCHER";

    /* renamed from: a  reason: collision with root package name */
    private static final a f18151a = new a();

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ee08dc19", new Object[0]) : f18151a;
    }

    public static m a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("386f9167", new Object[]{str}) : com.taobao.monitor.impl.trace.f.a(str);
    }
}
