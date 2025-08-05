package com.taobao.leftsdk.triver;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;

/* loaded from: classes7.dex */
public interface StepCountBridgeApi {
    void tbCheckManufacturerPermission(App app, BridgeCallback bridgeCallback);

    void tbCheckSensorPermission(App app, BridgeCallback bridgeCallback);

    void tbGetDailySteps(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback);

    void tbGetStepsHistory(@BindingNode(App.class) App app, @BindingParam(name = {"startTime"}) String str, @BindingParam(name = {"endTime"}) String str2, @BindingCallback BridgeCallback bridgeCallback);

    void tbGetStepsStatus(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback);

    void tbRequestManufacturerPermission(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback);

    void tbRequestSensorPermission(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback);

    void tbSetStepCountStatus(@BindingNode(App.class) App app, @BindingParam(name = {"status"}) boolean z, @BindingCallback BridgeCallback bridgeCallback);

    void tbSupportStepCount(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback);
}
