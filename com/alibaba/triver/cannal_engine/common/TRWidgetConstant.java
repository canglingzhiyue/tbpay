package com.alibaba.triver.cannal_engine.common;

import tb.kge;

/* loaded from: classes3.dex */
public class TRWidgetConstant {
    public static final String CAMERA_FRAME_DETECT_ERROR = "CAMERA_FRAME_DETECT_ERROR";
    public static final a CL_APPX_LOAD_ERROR;
    public static final a CL_APPX_MINIVERSION_ERROR;
    public static final a CL_CONTEXT_ERROR;
    public static final a CL_ENGINE_MNN_FAILED;
    public static final a CL_ENGINE_RENDER_FAILED;
    public static final a CL_ENV_INIT_ERROR;
    public static final a CL_INVALID_RUNTIME_TYPE;
    public static final a CL_INVALID_URL;
    public static final a CL_JSFM_LOAD_ERROR;
    public static final a CL_JS_ENGINE_INIT_FAIL;
    public static final a CL_PAGE_ERROR;
    public static final a CL_PAGE_JS_LOAD_ERROR;
    public static final a CL_REACTOR_INIT_FAIL;
    public static final a CL_REMOTE_DOWNLOAD_FAILED;
    public static final a CL_RENDER_CONTAINER_EMPTY;
    public static final a CL_SCENE_NOT_FOUND;
    public static final a CL_TRIVER_INITING;
    public static final a CL_UNI_COM_CREATE_FAIL;
    public static final String NATIVE_PERMISSION_DENIED = "NATIVE_PERMISSION_DENIED";
    public static final String WEEX_WIDGET_RENDER_ERROR = "renderError";
    public static final String WEEX_WIDGET_RENDER_START = "renderStart";
    public static final String WEEX_WIDGET_RENDER_SUCCESS = "renderSuccess";
    public static final String WIDGET_API_FAIL = "WIDGET_API_FAIL";
    public static final String WIDGET_CLOUD_FUNC_FAIL = "WIDGET_CLOUD_FUNC_FAIL";
    public static final String WIDGET_CONTAINER_ERR = "WIDGET_CONTAINER_ERR";
    public static final String WIDGET_MTOP_FAIL = "WIDGET_MTOP_FAIL";
    public static final String WIDGET_OFFLINE_ERROR_CODE = "AI_CODE_3003";
    public static final String WIDGET_TYPE_JS_ERROR = "RV_WIDGET_JS_ERROR";

    /* loaded from: classes3.dex */
    public enum WidgetRenderMode {
        surface,
        texture
    }

    /* loaded from: classes3.dex */
    public enum WidgetState {
        INITING,
        RENDERING,
        SUCCESS,
        FAILED
    }

    static {
        kge.a(-1632502883);
        CL_TRIVER_INITING = new a("CL_TRIVER_INITING", "Triver初始化中");
        CL_INVALID_URL = new a("CL_INVALID_URL", "无效的Url");
        CL_ENV_INIT_ERROR = new a("CL_ENV_INIT_ERROR", "环境初始化异常");
        CL_CONTEXT_ERROR = new a("CL_CONTEXT_ERROR", "Context 异常");
        CL_RENDER_CONTAINER_EMPTY = new a("CL_RENDER_CONTAINER_EMPTY", "渲染容器异常");
        CL_JS_ENGINE_INIT_FAIL = new a("CL_JS_ENGINE_INIT_FAIL", "JSEngine初始化失败");
        CL_REACTOR_INIT_FAIL = new a("CL_REACTOR_INIT_FAIL", "Reactor初始化失败");
        CL_APPX_LOAD_ERROR = new a("CL_APPX_LOAD_ERROR", "卡片Appx加载失败");
        CL_PAGE_JS_LOAD_ERROR = new a("CL_PAGE_JS_LOAD_ERROR", "PageJS加载失败");
        CL_UNI_COM_CREATE_FAIL = new a("CL_UNI_COM_CREATE_FAIL", "unicorn实例创建失败");
        CL_JSFM_LOAD_ERROR = new a("CL_JSFM_LOAD_ERROR", "小部件jsFramwork加载失败");
        CL_SCENE_NOT_FOUND = new a("CL_SCENE_NOT_FOUND", "Scene  not found");
        CL_INVALID_RUNTIME_TYPE = new a("CL_INVALID_RUNTIME_TYPE", "无效的runtime type");
        CL_APPX_MINIVERSION_ERROR = new a("CL_APPX_MINIVERSION_ERROR", "当前框架版本不符合最低版本要求");
        CL_PAGE_ERROR = new a("CL_PAGE_ERROR", "页面错误，需要降级", "default", "bizError");
        CL_ENGINE_RENDER_FAILED = new a("CL_ENGINE_RENDER_FAILED", "小部件引擎渲染失败", "default", "engineError");
        CL_ENGINE_MNN_FAILED = new a("CL_ENGINE_MNN_FAILED", "小部件底层加载MNNPlugin失败", "default", "engineError");
        CL_REMOTE_DOWNLOAD_FAILED = new a("CL_REMOTE_DOWNLOAD_FAILED", "小部件远程化加载失败", "default", "containerError");
    }
}
