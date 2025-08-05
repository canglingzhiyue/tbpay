package com.taobao.leftsdk.triver;

import android.os.Bundle;
import com.alibaba.android.split.core.splitinstall.h;
import com.alibaba.android.split.core.splitinstall.j;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.Remote;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.bhc;
import tb.bhf;

/* loaded from: classes7.dex */
public class TBStepCountBridgeExtension implements BridgeExtension, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBStepCountExtension";
    private StepCountBridgeApi stepCountBridgeApiInstance;

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.extension.Extension
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.kernel.api.security.Guard
    public Permission permit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Permission) ipChange.ipc$dispatch("edbd77f9", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ StepCountBridgeApi access$002(TBStepCountBridgeExtension tBStepCountBridgeExtension, StepCountBridgeApi stepCountBridgeApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StepCountBridgeApi) ipChange.ipc$dispatch("ece38137", new Object[]{tBStepCountBridgeExtension, stepCountBridgeApi});
        }
        tBStepCountBridgeExtension.stepCountBridgeApiInstance = stepCountBridgeApi;
        return stepCountBridgeApi;
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbSupportStepCount(@BindingNode(App.class) final App app, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e261df", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi == null) {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbSupportStepCount(app, bridgeCallback);
                    }
                }
            }).a()).a());
        } else {
            stepCountBridgeApi.tbSupportStepCount(app, bridgeCallback);
        }
    }

    private void errorCallBack(@BindingNode(App.class) App app, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48f5094", new Object[]{this, app, bridgeCallback});
        } else if (app.getAppContext() != null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", "appContext is Null");
            bridgeCallback.sendJSONResponse(jSONObject);
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbGetStepsStatus(@BindingNode(App.class) final App app, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dab88dd0", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbGetStepsStatus(app, bridgeCallback);
        } else {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbGetStepsStatus(app, bridgeCallback);
                    }
                }
            }).a()).a());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbSetStepCountStatus(@BindingNode(App.class) final App app, @BindingParam(name = {"status"}) final boolean z, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0b14c4", new Object[]{this, app, new Boolean(z), bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbSetStepCountStatus(app, z, bridgeCallback);
        } else {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbSetStepCountStatus(app, z, bridgeCallback);
                    }
                }
            }).a()).a());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbGetStepsHistory(@BindingNode(App.class) final App app, @BindingParam(name = {"startTime"}) final String str, @BindingParam(name = {"endTime"}) final String str2, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684a54f8", new Object[]{this, app, str, str2, bridgeCallback});
            return;
        }
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbGetStepsHistory(app, str, str2, bridgeCallback);
        } else {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str3, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str3, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbGetStepsHistory(app, str, str2, bridgeCallback);
                    }
                }
            }).a()).a());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbRequestManufacturerPermission(@BindingNode(App.class) final App app, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a5c80", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbRequestManufacturerPermission(app, bridgeCallback);
        } else {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbRequestManufacturerPermission(app, bridgeCallback);
                    }
                }
            }).a()).a());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbRequestSensorPermission(@BindingNode(App.class) final App app, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e3f677", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbRequestSensorPermission(app, bridgeCallback);
        } else {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbRequestSensorPermission(app, bridgeCallback);
                    }
                }
            }).a()).a());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbCheckManufacturerPermission(@BindingNode(App.class) final App app, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5382ba7", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbCheckManufacturerPermission(app, bridgeCallback);
        } else {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbCheckManufacturerPermission(app, bridgeCallback);
                    }
                }
            }).a()).a());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbCheckSensorPermission(@BindingNode(App.class) final App app, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1189eede", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbCheckSensorPermission(app, bridgeCallback);
        } else {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbCheckSensorPermission(app, bridgeCallback);
                    }
                }
            }).a()).a());
        }
    }

    @Remote
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void tbGetDailySteps(@BindingNode(App.class) final App app, @BindingCallback final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283e79cb", new Object[]{this, app, bridgeCallback});
            return;
        }
        errorCallBack(app, bridgeCallback);
        StepCountBridgeApi stepCountBridgeApi = this.stepCountBridgeApiInstance;
        if (stepCountBridgeApi != null) {
            stepCountBridgeApi.tbGetDailySteps(app, bridgeCallback);
        } else {
            h.a(app.getAppContext().getContext()).a(j.a().a(bhf.a(app.getAppContext().getContext(), StepCountBridgeApi.class).a(new bhc.b<Object>() { // from class: com.taobao.leftsdk.triver.TBStepCountBridgeExtension.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bhc.b
                public void a(String str, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
                    }
                }

                @Override // tb.bhc.b
                public void a(Object obj, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1dee0410", new Object[]{this, obj, bundle});
                    } else if (obj == null || !(obj instanceof StepCountBridgeApi)) {
                    } else {
                        StepCountBridgeApi stepCountBridgeApi2 = (StepCountBridgeApi) obj;
                        TBStepCountBridgeExtension.access$002(TBStepCountBridgeExtension.this, stepCountBridgeApi2);
                        stepCountBridgeApi2.tbGetDailySteps(app, bridgeCallback);
                    }
                }
            }).a()).a());
        }
    }
}
