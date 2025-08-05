package com.taobao.tao.infoflow.multitab.protocol;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.shc;

/* loaded from: classes8.dex */
public interface IMultiTabPerformanceListener {
    public static final String ON_CONTAINER_INIT_END = "containerInitE";
    public static final String ON_CONTAINER_INIT_START = "containerInitS";
    public static final String ON_ENGINE_INIT_END = "engineInitE";
    public static final String ON_ENGINE_INIT_START = "engineInitS";
    public static final String ON_FCP_END = "fcpRenderE";
    public static final String ON_FSP_END = "fspRenderE";
    public static final String ON_RENDER_START = "renderS";
    public static final String ON_REQUEST_END = "mainDocRequestE";
    public static final String ON_REQUEST_START = "mainDocRequestS";
    public static final String ON_ROUTE_END = "routeE";
    public static final String ON_ROUTE_START = "routeS";
    public static final String ON_TAB_CREATE = "onTabCreate";
    public static final String TAB_SCROLL_SELECT = "tabScrollSelect";
    public static final String TAB_SELECT = "tabSelected";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface OnStage {
    }

    void a();

    void a(String str);

    void a(String str, int i);

    void a(String str, long j, String str2);

    void a(boolean z);

    void b(String str);

    void b(String str, int i);

    void b(String str, long j);

    void b(String str, long j, String str2);

    shc c(String str);
}
