package com.taobao.android.fluid.core;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b ADD_VIDEO_VIEW_TO_CONTAINER_PAUSE_ERROR;
    public static final b ADD_VIDEO_VIEW_TO_CONTAINER_RESUME_ERROR;
    public static final b ADD_VIDEO_VIEW_TO_CONTAINER_VIDEO_VIEW_IS_VALID;
    public static final b COMPLETE_PARSE_VIDEO_RES_ERROR;
    public static final b CREATE_DWINSTANCE_AFTER_DOWNLOAD_ERROR;
    public static final b CREATE_DWINSTANCE_ERROR;
    public static final b ICON_STREAM_REQUEST_VIDEO_INFO_ERROR;
    public static final b OPT_CPU_ERROR;
    public static final String PREFIX_FLUID_API = "API-";
    public static final String PREFIX_FLUID_CARD_SERVICE = "CARD-";
    public static final String PREFIX_FLUID_CONTAINER_SERVICE = "CONTAINER-";
    public static final String PREFIX_FLUID_DATA_SERVICE = "DATA-";
    public static final String PREFIX_FLUID_DEVICE_SERVICE = "DEVICE-";
    public static final String PREFIX_FLUID_FEEDS_LIST_SERVICE = "LIST-";
    public static final String PREFIX_FLUID_GLOBAL_INTERACTION_SERVICE = "INTERACTION-";
    public static final String PREFIX_FLUID_INSTANCE = "INSTANCE-";
    public static final String PREFIX_FLUID_INTELLIGENCE_SERVICE = "INTELLIGENCE-";
    public static final String PREFIX_FLUID_LIFECYCLE_SERVICE = "LIFECYCLE-";
    public static final String PREFIX_FLUID_MEDIA_SERVICE_LIVE = "LIVE-";
    public static final String PREFIX_FLUID_MEDIA_SERVICE_VIDEO = "VIDEO-";
    public static final String PREFIX_FLUID_MESSAGE_SERVICE = "MESSAGE-";
    public static final String PREFIX_FLUID_MUTE_SERVICE = "MUTE-";
    public static final String PREFIX_FLUID_PRELOAD_SERVICE = "PRELOAD-";
    public static final String PREFIX_FLUID_SCENE_CONFIG_SERVICE = "SCENE-";
    public static final String PREFIX_FLUID_SDK = "SDK-";
    public static final String PREFIX_FLUID_SERVICE = "SERVICE-";
    public static final String PREFIX_FLUID_SHARE_PLAYER_SERVICE = "SHARE-PLAYER-";
    public static final String PREFIX_FLUID_TRACK_SERVICE = "TRACK-";
    public static final String PREFIX_FLUID_VIDEO_COLLECTION_SERVICE = "COLLECTION-";
    public static final b PRELOAD_SERVICE_CREATE_PRELOAD_TASK_IS_NULL;
    public static final b PRELOAD_SERVICE_DOWNLOAD_VIDEO_ERROR;
    public static final b PRELOAD_WITH_DETAIL_ERROR;
    public static final b SERVICE_CLASS_NOT_INTERFACE;
    public static final b SERVICE_CONSTRUCTOR_ERROR;
    public static final b SERVICE_CREATE_ERROR;
    public static final b SERVICE_DESTROY_ERROR;
    public static final b SERVICE_ERROR_INSTANCE;
    public static final b SERVICE_NOT_REGISTER;
    public static final b SERVICE_REGISTER_REPEAT_ERROR;
    public static final b SERVICE_REMOTE_NEW_INSTANCE_ERROR;

    /* renamed from: a  reason: collision with root package name */
    private final String f12439a;
    private final String b;
    private final Map<String, String> c = new HashMap();

    static {
        kge.a(-1351217469);
        PRELOAD_SERVICE_CREATE_PRELOAD_TASK_IS_NULL = new b("PRELOAD-createPreloadTaskIsNull", "创建预加载任务为null");
        PRELOAD_SERVICE_DOWNLOAD_VIDEO_ERROR = new b("PRELOAD-downloadVideoError", "下载视频失败");
        CREATE_DWINSTANCE_AFTER_DOWNLOAD_ERROR = new b("PRELOAD-createDwInstanceAfterDownloadError", "创建播放器失败");
        CREATE_DWINSTANCE_ERROR = new b("PRELOAD-createDwInstanceError", "创建播放器失败");
        COMPLETE_PARSE_VIDEO_RES_ERROR = new b("PRELOAD-completeParseVideoResError", "解析播控失败");
        ICON_STREAM_REQUEST_VIDEO_INFO_ERROR = new b("PRELOAD-iconStreamRequestVideoInfoError", "小红点请求播控失败");
        PRELOAD_WITH_DETAIL_ERROR = new b("PRELOAD-preloadWithDetailError", "请求detail失败");
        ADD_VIDEO_VIEW_TO_CONTAINER_PAUSE_ERROR = new b("PRELOAD-addVideoViewToContainerPauseError", "添加view到containView错误");
        ADD_VIDEO_VIEW_TO_CONTAINER_RESUME_ERROR = new b("PRELOAD-addVideoViewToContainerResumeError", "添加view到containView错误");
        ADD_VIDEO_VIEW_TO_CONTAINER_VIDEO_VIEW_IS_VALID = new b("PRELOAD-addVideoViewToContainerVideoViewIsValid", "添加view到containView错误");
        OPT_CPU_ERROR = new b("DEVICE-optSlideCpu", "cpu提频异常");
        SERVICE_CONSTRUCTOR_ERROR = new b("SERVICE-1", "服务创建实例失败");
        SERVICE_CREATE_ERROR = new b("SERVICE-2", "服务创建失败");
        SERVICE_DESTROY_ERROR = new b("SERVICE-3", "服务销毁失败");
        SERVICE_NOT_REGISTER = new b("SERVICE-4", "服务未注册");
        SERVICE_REGISTER_REPEAT_ERROR = new b("SERVICE-5", "服务重复注册");
        SERVICE_ERROR_INSTANCE = new b("SERVICE-6", "不是指定服务类型");
        SERVICE_CLASS_NOT_INTERFACE = new b("SERVICE-7", "服务调用类不是接口");
        SERVICE_REMOTE_NEW_INSTANCE_ERROR = new b("SERVICE-8", "远程服务反射创建实例失败");
    }

    public b(String str, String str2) {
        this.f12439a = str;
        this.b = str2;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.c.put(str, str2);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            return JSON.toJSONString(this.c);
        } catch (Exception e) {
            spz.a("FluidErrorCode", "getErrorArgsString", e);
            return "";
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f12439a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FluidErrorCode{mErrorCode='" + this.f12439a + "', mErrorMsg='" + this.b + "', mErrorArgs=" + this.c + '}';
    }
}
