package com.alibaba.security.realidentity.ui.webview.jsbridge.exec;

import com.alibaba.security.realidentity.b;
import com.alibaba.security.realidentity.s3;
import com.alibaba.security.realidentity.service.sensor.model.SensorInfo;
import com.alibaba.security.realidentity.u4;
import com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor;
import com.alibaba.security.realidentity.ui.webview.jsbridge.JsCallbackAdapter;
import com.alibaba.security.realidentity.ui.webview.jsbridge.annotation.JSTopic;
import com.alibaba.security.realidentity.ui.webview.jsbridge.entity.WVResultWrapper;
import com.alibaba.security.realidentity.y3;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

@JSTopic(topic = "rpGetSensor")
/* loaded from: classes3.dex */
public class GetSensorInfoApi extends BaseJsExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_KEY_SENSOR_INFO = "sensorInfo";
    public static final String TAG = "GetSensorInfoApi";

    public GetSensorInfoApi(u4 u4Var) {
        super(u4Var);
    }

    public static /* synthetic */ void access$000(GetSensorInfoApi getSensorInfoApi, float f, JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4993b2", new Object[]{getSensorInfoApi, new Float(f), jsCallbackAdapter});
        } else {
            getSensorInfoApi.constructJsCallback(f, jsCallbackAdapter);
        }
    }

    private void constructJsCallback(float f, JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8775e4dd", new Object[]{this, new Float(f), jsCallbackAdapter});
            return;
        }
        SensorInfo sensorInfo = new SensorInfo(f);
        WVResultWrapper wVResultWrapper = new WVResultWrapper();
        wVResultWrapper.addData(NAME_KEY_SENSOR_INFO, b.a(sensorInfo));
        wVResultWrapper.setSuccess();
        jsCallbackAdapter.success(wVResultWrapper);
        finishJsBridge(wVResultWrapper, true);
    }

    public static /* synthetic */ Object ipc$super(GetSensorInfoApi getSensorInfoApi, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public boolean execute(String str, final JsCallbackAdapter jsCallbackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d162c2f", new Object[]{this, str, jsCallbackAdapter})).booleanValue();
        }
        if (this.mContext == null) {
            constructJsCallback(-1.0f, jsCallbackAdapter);
            return true;
        }
        new s3(this.mContext).a(new y3() { // from class: com.alibaba.security.realidentity.ui.webview.jsbridge.exec.GetSensorInfoApi.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.security.realidentity.y3
            public void onIlluminanceChangedListener(float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("35571687", new Object[]{this, new Float(f)});
                } else {
                    GetSensorInfoApi.access$000(GetSensorInfoApi.this, f, jsCallbackAdapter);
                }
            }
        });
        return true;
    }

    @Override // com.alibaba.security.realidentity.ui.webview.jsbridge.BaseJsExecutor
    public String getTrackMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("145b9fe3", new Object[]{this}) : "rpGetSensor";
    }
}
