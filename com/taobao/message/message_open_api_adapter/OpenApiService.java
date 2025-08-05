package com.taobao.message.message_open_api_adapter;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.kit.util.IdentifierUtil;
import com.taobao.message.lab.comfrm.inner2.ExecuteService;
import com.taobao.message.lab.comfrm.util.Observer;
import com.taobao.message.message_open_api.CallService;
import com.taobao.message.message_open_api.core.CallException;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class OpenApiService implements ExecuteService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OpenApiService";
    private Map<String, Object> mActionContext;
    private Context mContext;

    static {
        kge.a(-39671284);
        kge.a(814587937);
    }

    public OpenApiService(Context context) {
        this.mContext = context;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.ExecuteService
    public void switchContext(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885e0863", new Object[]{this, map});
        } else {
            this.mActionContext = map;
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.ExecuteService
    public String execute(String str, final Observer<Object> observer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cd0b0d6", new Object[]{this, str, observer});
        }
        final Map<String, Object> map = this.mActionContext;
        JSONObject jSONObject = null;
        try {
            jSONObject = JSON.parseObject(str);
        } catch (Exception unused) {
        }
        if (jSONObject == null) {
            return "";
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final String string = jSONObject.getString("api");
        if (!jSONObject.containsKey("data")) {
            jSONObject.put("data", (Object) new JSONObject());
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (!jSONObject2.containsKey("identifier")) {
            jSONObject2.put("identifier", (Object) IdentifierUtil.getCurrentIdentifier());
        }
        if (!jSONObject.containsKey("ext")) {
            jSONObject.put("ext", (Object) new JSONObject());
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
        if (jSONObject.containsKey("identity")) {
            jSONObject3.put("subscribeTag", (Object) jSONObject.getString("identity"));
        }
        jSONObject3.put("channelTag", (Object) "AURA-handler");
        CallService.INSTANCE.call(this.mContext, string, jSONObject2, null, jSONObject3, new IObserver<Object>() { // from class: com.taobao.message.message_open_api_adapter.OpenApiService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.kit.core.IObserver
            public void onNext(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                    return;
                }
                if (ApplicationUtil.isDebug()) {
                    TLog.loge(OpenApiService.TAG, " openApi " + string + " onNext ");
                }
                Observer observer2 = observer;
                if (observer2 == null) {
                    return;
                }
                observer2.onData(obj);
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onError(Throwable th) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                    return;
                }
                if (ApplicationUtil.isDebug()) {
                    TLog.loge(OpenApiService.TAG, " openApi " + string + " onError " + Log.getStackTraceString(th));
                }
                Observer observer2 = observer;
                if (observer2 != null) {
                    if (th instanceof CallException) {
                        CallException callException = (CallException) th;
                        observer2.onError(callException.errCode, callException.errMsg, callException);
                    } else {
                        observer2.onError("1", th.toString(), th);
                    }
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("api", (Object) string);
                jSONObject4.put("time", (Object) Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                jSONObject4.put("channel", (Object) "aura");
                Map map2 = map;
                if (map2 != null) {
                    jSONObject4.put("bizParmas", (Object) ((JSONObject) map2.get("bizParmas")));
                }
                if (th instanceof CallException) {
                    CallException callException2 = (CallException) th;
                    AppMonitor.Alarm.commitFail(Constants.MONITOR_MODULE, Constants.MONITOR_POINT_RATE, jSONObject4.toJSONString(), callException2.errCode, callException2.errMsg);
                    return;
                }
                AppMonitor.Alarm.commitFail(Constants.MONITOR_MODULE, Constants.MONITOR_POINT_RATE, jSONObject4.toJSONString(), "1", th.getLocalizedMessage());
            }

            @Override // com.taobao.message.kit.core.IObserver
            public void onComplete() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    return;
                }
                if (ApplicationUtil.isDebug()) {
                    TLog.loge(OpenApiService.TAG, " openApi " + string + " onComplete");
                }
                Observer observer2 = observer;
                if (observer2 != null) {
                    observer2.onComplete();
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("api", (Object) string);
                jSONObject4.put("time", (Object) Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                jSONObject4.put("channel", (Object) "aura");
                Map map2 = map;
                if (map2 != null) {
                    jSONObject4.put("bizParams", (Object) ((JSONObject) map2.get("bizParams")));
                }
                AppMonitor.Alarm.commitSuccess(Constants.MONITOR_MODULE, Constants.MONITOR_POINT_RATE, jSONObject4.toJSONString());
            }
        });
        return "";
    }
}
