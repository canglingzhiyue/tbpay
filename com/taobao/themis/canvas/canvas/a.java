package com.taobao.themis.canvas.canvas;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FCANVAS_ERROR_CREATE_EMBED_VIEW = "1002";
    public static final String FCANVAS_ERROR_DISPATCH_TOUCH_EVENT = "1004";
    public static final String FCANVAS_ERROR_ENGINE = "2006";
    public static final String FCANVAS_ERROR_INIT_CANVAS = "1003";
    public static final String FCANVAS_ERROR_JS_BINDING = "2003";
    public static final String FCANVAS_ERROR_JS_CONTEXT = "2004";
    public static final String FCANVAS_ERROR_JS_EXCEPTION = "2005";
    public static final String FCANVAS_ERROR_JS_LOGIC = "2001";
    public static final String FCANVAS_ERROR_JS_THREAD = "2002";
    public static final String FCANVAS_ERROR_LOADLIBRARY = "1001";
    public static final String FCANVAS_ERROR_LOAD_IMAGE = "1005";
    public static final String FCANVAS_ERROR_NONE = "2000";
    public static final String FCANVAS_ERROR_OPEN_GL = "2007";
    public static final String FCANVAS_ERROR_UNKNOWN = "1000";

    /* renamed from: a  reason: collision with root package name */
    private static final a f22322a;

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        }
    }

    static {
        kge.a(-977101710);
        f22322a = new a();
    }

    private a() {
    }
}
