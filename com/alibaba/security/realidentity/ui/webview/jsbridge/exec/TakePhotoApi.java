package com.alibaba.security.realidentity.ui.webview.jsbridge.exec;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.alibaba.security.realidentity.h;
import com.alibaba.security.realidentity.i3;
import com.alibaba.security.realidentity.service.track.model.CommonTrackResult;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.activity.RPTakePhotoActivity;
import com.alibaba.security.realidentity.ui.entity.ImageData;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mtop.wvplugin.a;
import com.taobao.search.common.util.k;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ado;

@JSTopic(topic = "takePhoto,rpTakePhoto")
/* loaded from: classes3.dex */
public class TakePhotoApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOW_MEMORY = "LOW_MEMORY";
    public static final String TAG = "TakePhotoApi";

    public TakePhotoApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ void access$000(TakePhotoApi takePhotoApi, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5166c7eb", new Object[]{takePhotoApi, intent});
        } else {
            takePhotoApi.onActivityResult(intent);
        }
    }

    private String formatUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdc78937", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || str.startsWith(k.HTTP_PREFIX)) {
            return str;
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            return "http:" + str;
        }
        return k.HTTP_PREFIX + str;
    }

    public static /* synthetic */ Object ipc$super(TakePhotoApi takePhotoApi, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private void listenBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9e2241", new Object[]{this});
            return;
        }
        final h a2 = h.a(this.mContext);
        final String apiFilterName = getApiFilterName();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(apiFilterName);
        a2.a(new BroadcastReceiver() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.exec.TakePhotoApi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (!apiFilterName.equals(intent.getAction())) {
                } else {
                    TakePhotoApi.access$000(TakePhotoApi.this, intent);
                    a2.a(this);
                }
            }
        }, intentFilter);
    }

    private void onActivityResult(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915ee08f", new Object[]{this, intent});
        } else if (intent.getIntExtra(a.RESULT_KEY, -1) != -1) {
            callbackUnknowError(this.mWVCallbackContext, "takePhoto activity result is not ok");
            trackExceptionLog("takePhoto activity result is not ok");
            collectLog(TrackLog.createTakePhotoFinishLog(new CommonTrackResult(-1, "takePhoto activity result is not ok"), false));
        } else {
            String stringExtra = intent.getStringExtra("errorMsg");
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(BaseJsExecutor.NAME_IMAGE_LIST);
            int[] intArrayExtra = intent.getIntArrayExtra(BaseJsExecutor.NAME_TYPE_ARRAY);
            if (intent.getBooleanExtra(BaseJsExecutor.NAME_CANCEL, false)) {
                callbackUnknowError(this.mWVCallbackContext, "takePhoto imageList is null by user cancel");
            } else if (parcelableArrayListExtra == null) {
                callbackUnknowError(this.mWVCallbackContext, "takePhoto imageList is null");
                trackExceptionLog("takePhoto imageList is null");
                collectLog(TrackLog.createTakePhotoFinishLog(new CommonTrackResult(-1, "takePhoto imageList is null"), false));
            } else {
                WVResultWrapper wVResultWrapper = new WVResultWrapper();
                i3 a2 = i3.a();
                for (int i = 0; i < parcelableArrayListExtra.size(); i++) {
                    ImageData imageData = (ImageData) parcelableArrayListExtra.get(i);
                    Pair<String, String> a3 = a2.a(this.mContext, imageData.b());
                    String a4 = imageData.a();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(BaseJsExecutor.NAME_PHOTO_TYPE, String.valueOf(imageData.d()));
                        if (!StringUtils.isEmpty(a4)) {
                            jSONObject.put(BaseJsExecutor.NAME_GESTURE_URL, a4);
                        }
                        if (a3 != null && !"0".equals(a3.first)) {
                            jSONObject.put(BaseJsExecutor.NAME_PHOTO_ID, a3.first);
                            jSONObject.put(BaseJsExecutor.NAME_URL_PHOTO, a3.second);
                            jSONObject.put(BaseJsExecutor.NAME_PHOTO_SOURCE, imageData.c());
                            wVResultWrapper.addData(BaseJsExecutor.NAME_CALLBACKPHOTO_ + imageData.d(), jSONObject);
                            collectLog(TrackLog.createTakePhotoFinishLog(new CommonTrackResult(), true));
                        } else {
                            jSONObject.put("errorMsg", LOW_MEMORY);
                            wVResultWrapper.addData(BaseJsExecutor.NAME_CALLBACKPHOTO_ + imageData.d(), jSONObject);
                            this.mWVCallbackContext.error(wVResultWrapper);
                            collectLog(TrackLog.createTakePhotoFinishLog(new CommonTrackResult(-1, LOW_MEMORY), false));
                            return;
                        }
                    } catch (JSONException e) {
                        trackExceptionLog("TakePhotoApi onActivityResult data assemble  error", e);
                        callbackUnknowError(this.mWVCallbackContext, "TakePhotoApi onActivityResult data assemble error");
                        collectLog(TrackLog.createTakePhotoFinishLog(new CommonTrackResult(-1, "TakePhotoApi onActivityResult data assemble error"), false));
                        return;
                    }
                }
                if (intArrayExtra.length != parcelableArrayListExtra.size()) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        int i3 = intArrayExtra[i2];
                        if (i3 >= 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put(BaseJsExecutor.NAME_TAKE_PHOTO_TYPE, i3);
                                jSONObject2.put("errorMsg", stringExtra);
                            } catch (JSONException e2) {
                                com.alibaba.security.realidentity.a.a(TAG, e2);
                            }
                            wVResultWrapper.addData(BaseJsExecutor.NAME_CALLBACKPHOTO_ + i3, jSONObject2);
                            break;
                        }
                        i2++;
                    }
                }
                if (intArrayExtra.length == parcelableArrayListExtra.size()) {
                    wVResultWrapper.setSuccess();
                    this.mWVCallbackContext.success(wVResultWrapper);
                    finishJsBridge(wVResultWrapper, true);
                    return;
                }
                this.mWVCallbackContext.error(wVResultWrapper);
                finishJsBridge(wVResultWrapper, false);
            }
        }
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        if (com.alibaba.security.realidentity.a.a()) {
            String str2 = TAG;
            com.alibaba.security.realidentity.a.a(str2, "TakePhotoApi execute params: " + str);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray(BaseJsExecutor.NAME_TAKE_PHOTO_TYPE);
            JSONArray jSONArray2 = jSONObject.getJSONArray(BaseJsExecutor.NAME_GESTURE_URL_ARRAY);
            String optString = jSONObject.optString(BaseJsExecutor.NAME_USE_ALBUM, "0");
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < jSONArray.length(); i++) {
                iArr[i] = jSONArray.getInt(i);
            }
            String[] strArr = new String[jSONArray2.length()];
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                strArr[i2] = formatUrl(jSONArray2.getString(i2));
            }
            collectLog(TrackLog.createTakePhotoStartLog());
            if (length <= 0) {
                return false;
            }
            Intent intent = new Intent();
            intent.setClass(this.mContext, RPTakePhotoActivity.class);
            intent.putExtra(BaseJsExecutor.NAME_USE_ALBUM, StringUtils.equals(optString, "1"));
            intent.putExtra(BaseJsExecutor.NAME_URL_ARRAY, strArr);
            intent.putExtra("token", this.mRPBizConfig.getBasicsConfig().verifyToken);
            intent.putExtra(BaseJsExecutor.NAME_TYPE_ARRAY, iArr);
            intent.putExtra(BaseJsExecutor.NAME_USE_LOSSLESS_IMAGE, this.mRPBizConfig.getDegradeConfig().isUseLosslessCertImage);
            startActivity(intent, true);
            return true;
        } catch (JSONException e) {
            if (com.alibaba.security.realidentity.a.a()) {
                com.alibaba.security.realidentity.a.a(TAG, "TakePhotoApi parse params error", e);
            }
            trackExceptionLog("TakePhotoApi parse params error", e);
            callbackUnknowError(jsCallbackAdapter);
            return false;
        }
    }

    public String getApiFilterName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ee0da532", new Object[]{this}) : toString();
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : "takePhoto";
    }

    public void startActivity(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8301f", new Object[]{this, intent, new Boolean(z)});
            return;
        }
        intent.putExtra(BaseJsExecutor.NAME_FILTER_NAME, getApiFilterName());
        intent.setFlags(268435456);
        this.mContext.startActivity(intent);
        if (!z) {
            return;
        }
        listenBroadcast();
    }
}
