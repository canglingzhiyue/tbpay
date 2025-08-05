package com.alibaba.security.realidentity.ui.webview.jsbridge;

import android.content.Context;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.d;
import com.alibaba.security.realidentity.g4;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.sft;

/* loaded from: classes3.dex */
public abstract class BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSG_RET_FAILED_NO_INFO = "NO_INFO";
    public static final String MSG_RET_FAILED_UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final String NAME_AUDIT_STATUS = "auditStatus";
    public static final String NAME_CALLBACKPHOTO_ = "callBackPhoto_";
    public static final String NAME_CANCEL = "nameCancel";
    public static final String NAME_CODE = "code";
    public static final String NAME_DISPLAY = "display";
    public static final String NAME_ERROR_MSG = "errorMsg";
    public static final String NAME_EVENT_ID = "eventId";
    public static final String NAME_FILTER_NAME = "FilterName";
    public static final String NAME_GESTURE_URL = "gestureUrl";
    public static final String NAME_GESTURE_URL_ARRAY = "gestureUrlArray";
    public static final String NAME_IMAGE_LIST = "imageList";
    public static final String NAME_LIVENESSSDK_NAME = "livenessSdkName";
    public static final String NAME_LIVENESSSDK_VERSION = "livenessSdkVersion";
    public static final String NAME_LOCAL_MODEL_PATH = "localModelPath";
    public static final String NAME_MAIN_CODE = "mainCode";
    public static final String NAME_MSG = "message";
    public static final String NAME_PAGE_NAME = "pageName";
    public static final String NAME_PARAMS = "params";
    public static final String NAME_PHOTO_ID = "photoId";
    public static final String NAME_PHOTO_SOURCE = "photoSource";
    public static final String NAME_PHOTO_TYPE = "photoType";
    public static final String NAME_REMOTE_SO_MSG = "remoteSoMsg";
    public static final String NAME_REMOTE_SO_RESULT = "remoteSoResult";
    public static final String NAME_RPSDK_NAME = "rpSdkName";
    public static final String NAME_RPSDK_VERSION = "rpSdkVersion";
    public static final String NAME_SDK_NOUI = "sdkNoUI";
    public static final String NAME_SUB_CODE = "subCode";
    public static final String NAME_TAKE_PHOTO_TYPE = "takePhotoType";
    public static final String NAME_TOTAL_BYTES_EXPECTED_TOSEND = "totalBytesExpectedToSend";
    public static final String NAME_TOTAL_BYTES_SENT = "totalBytesSent";
    public static final String NAME_TYPE_ARRAY = "typeArray";
    public static final String NAME_URL_ARRAY = "urlArray";
    public static final String NAME_URL_PHOTO = "urlPhoto";
    public static final String NAME_USE_ALBUM = "useAlbum";
    public static final String NAME_USE_LOSSLESS_IMAGE = "useLosslessImage";
    public static final String NAME_VERIFY_TOKEN = "verifyToken";
    public static final String TAG = "AbsJavaScriptExecuter";
    public static final String VALUE_INPUT_PARAM_ERROR = "INPUT_PARAM_ERROR";
    public static final String VALUE_NO_PERMISSION = "NO_PERMISSION";
    public static final String VALUE_NO_PHOTO = "NO_PHOTO";
    public static final String VALUE_SUCCESS = "success";
    public long mBeginTime;
    public Context mContext;
    public String mInputParams;
    public RPBizConfig mRPBizConfig;
    public u4 mVerifyBizCapacity;
    public JsCallbackAdapter mWVCallbackContext;

    public BaseJsExecutor(u4 u4Var) {
        this.mVerifyBizCapacity = u4Var;
    }

    public WVResultWrapper callbackUnknowError(JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVResultWrapper) ipChange.ipc$dispatch("4d0a0c5e", new Object[]{this, jsCallbackAdapter});
        }
        WVResultWrapper wVResultWrapper = new WVResultWrapper();
        wVResultWrapper.addData("errorMsg", "UNKNOWN_ERROR");
        jsCallbackAdapter.error(wVResultWrapper);
        return wVResultWrapper;
    }

    public void collectLog(TrackLog trackLog) {
        RPBizConfig rPBizConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4919566e", new Object[]{this, trackLog});
            return;
        }
        u4 u4Var = this.mVerifyBizCapacity;
        if (u4Var == null || (rPBizConfig = this.mRPBizConfig) == null) {
            return;
        }
        u4Var.a(rPBizConfig.getBasicsConfig().verifyToken, trackLog);
    }

    public abstract boolean execute(String str, JsCallbackAdapter jsCallbackAdapter);

    public boolean executeRP(Context context, String str, RPBizConfig rPBizConfig, JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb257f79", new Object[]{this, context, str, rPBizConfig, jsCallbackAdapter})).booleanValue();
        }
        this.mWVCallbackContext = jsCallbackAdapter;
        this.mInputParams = str;
        this.mRPBizConfig = rPBizConfig;
        this.mBeginTime = System.currentTimeMillis();
        this.mContext = context;
        return execute(str, jsCallbackAdapter);
    }

    public void finishJsBridge(WVResultWrapper wVResultWrapper, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0d968b5", new Object[]{this, wVResultWrapper, new Boolean(z)});
        } else if (!needTrack()) {
        } else {
            TrackLog trackLog = new TrackLog();
            trackLog.setLayer(g4.a.f3423a);
            trackLog.setService("webview");
            trackLog.setMethod(getTrackMethod());
            trackLog.setParams(this.mInputParams);
            trackLog.setMsg("");
            trackLog.setRt(System.currentTimeMillis() - this.mBeginTime);
            if (wVResultWrapper != null) {
                trackLog.setResult(wVResultWrapper.toJsonString());
            } else {
                trackLog.setResult(sft.LIVE_ALGO_FAILURE_RESULT_ISNULL_ERROR);
            }
            if (!z) {
                i = -1;
            }
            trackLog.setCode(i);
            collectLog(trackLog);
        }
    }

    public abstract String getTrackMethod();

    public boolean needTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("532db860", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void setStartBeginTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4581707", new Object[]{this, new Long(j)});
            return;
        }
        RPBizConfig rPBizConfig = this.mRPBizConfig;
        if (rPBizConfig == null) {
            return;
        }
        rPBizConfig.getBasicsConfig().startBeginTime = j;
    }

    public void setVerifyToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbb774f", new Object[]{this, str});
            return;
        }
        RPBizConfig rPBizConfig = this.mRPBizConfig;
        if (rPBizConfig == null) {
            return;
        }
        rPBizConfig.getBasicsConfig().verifyToken = str;
    }

    public void trackExceptionLog(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717a537b", new Object[]{this, str, str2});
        } else {
            collectLog(TrackLog.createSdkExceptionLog(str, str2, ""));
        }
    }

    public void trackExceptionLog(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a28d9b35", new Object[]{this, str, exc});
        } else {
            collectLog(TrackLog.createSdkExceptionLog(str, d.b(exc), ""));
        }
    }

    public WVResultWrapper callbackUnknowError(JsCallbackAdapter jsCallbackAdapter, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVResultWrapper) ipChange.ipc$dispatch("e4040794", new Object[]{this, jsCallbackAdapter, str});
        }
        WVResultWrapper wVResultWrapper = new WVResultWrapper();
        wVResultWrapper.addData("errorMsg", str);
        jsCallbackAdapter.error(wVResultWrapper);
        return wVResultWrapper;
    }

    public void trackExceptionLog(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2e1e3f1", new Object[]{this, str});
        } else {
            collectLog(TrackLog.createSdkExceptionLog(str, "", ""));
        }
    }

    public void finishJsBridge(String str, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c048de", new Object[]{this, str, new Boolean(z)});
        } else if (!needTrack()) {
        } else {
            TrackLog trackLog = new TrackLog();
            trackLog.setLayer(g4.a.f3423a);
            trackLog.setService("webview");
            trackLog.setMethod(getTrackMethod());
            trackLog.setParams(this.mInputParams);
            trackLog.setMsg("");
            trackLog.setRt(System.currentTimeMillis() - this.mBeginTime);
            trackLog.setResult(str);
            if (!z) {
                i = -1;
            }
            trackLog.setCode(i);
            collectLog(trackLog);
        }
    }
}
