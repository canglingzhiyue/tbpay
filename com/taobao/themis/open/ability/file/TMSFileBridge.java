package com.taobao.themis.open.ability.file;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.utils.ApPathType;
import com.taobao.themis.utils.io.c;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.toh;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J&\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u001c\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J&\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J&\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/open/ability/file/TMSFileBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", com.alibaba.alibity.container.file.a.API_GET_FILE_INFO, "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "path", "", "digestAlgorithm", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getSavedFileInfo", "getSavedFileList", "onFinalized", "onInitialized", "removeSavedFile", "saveFile", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSFileBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    static {
        kge.a(1146776448);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getFileInfo(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apFilePath"}) String path, @BindingParam(name = {"digestAlgorithm"}) String digestAlgorithm, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1a96f24", new Object[]{this, apiContext, path, digestAlgorithm, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(path, "path");
        q.d(digestAlgorithm, "digestAlgorithm");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        if (!(c instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSFileBridge", "access failed! instance is not a TMSInstance");
            return;
        }
        b.INSTANCE.e(c, path, digestAlgorithm, bridgeCallback);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void saveFile(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apFilePath"}) String path, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e89a85b5", new Object[]{this, apiContext, path, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        if (!(c instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSFileBridge", "saveFile, access failed! instance is not a TMSInstance");
            return;
        }
        if (toh.a(path, c) != ApPathType.AP_PATH_TYPE_TEMP) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSFileBridge", "saveFile, only temp path is allowed to be saved");
        }
        b.INSTANCE.d(c, path, "https://usr/saved/", bridgeCallback);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getSavedFileInfo(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apFilePath"}) String path, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b307d3", new Object[]{this, apiContext, path, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        if (!(c instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSFileBridge", "getSavedFileInfo, access failed! instance is not a TMSInstance");
            return;
        }
        if (path.length() == 0) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileBridge", "getSavedFileInfo, param is invalid! path is empty!");
        } else if (c.a(path)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            TMSLogger.d("TMSFileBridge", "getSavedFileInfo, param is invalid! path contains relative parent!");
        } else {
            ApPathType a2 = toh.a(path, c);
            if (a2 != ApPathType.AP_PATH_TYPE_USR && a2 != ApPathType.AP_PATH_TYPE_TEMP) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
                TMSLogger.d("TMSFileBridge", "getSavedFileInfo, param is invalid! only handle usr/tmp path");
                return;
            }
            String a3 = toh.a(o.e(c), path, a2);
            String str = a3;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (z) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileBridge", "getSavedFileInfo, access failed! convert to local path error!");
                return;
            }
            File file = new File(a3);
            long b = com.taobao.themis.utils.io.a.b(file);
            long c2 = com.taobao.themis.utils.io.a.c(file);
            if (b == 0 || c2 == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
                TMSLogger.d("TMSFileBridge", "getSavedFileInfo, access failed! file size or create time is zero!");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) "success", (String) true);
            jSONObject2.put((JSONObject) "size", (String) Long.valueOf(b));
            jSONObject2.put((JSONObject) "createTime", (String) Long.valueOf(c2));
            t tVar = t.INSTANCE;
            bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
        }
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void getSavedFileList(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("303e632d", new Object[]{this, apiContext, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        if (!(c instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSFileBridge", "access failed! instance is not a TMSInstance");
            return;
        }
        b.INSTANCE.c(c, "https://usr/saved/", bridgeCallback);
    }

    @ThreadType(ExecutorType.IO)
    @APIMethod
    public final void removeSavedFile(@BindingApiContext ApiContext apiContext, @BindingParam(name = {"apFilePath"}) String path, @BindingCallback BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b86430f", new Object[]{this, apiContext, path, bridgeCallback});
            return;
        }
        q.d(apiContext, "apiContext");
        q.d(path, "path");
        q.d(bridgeCallback, "bridgeCallback");
        f c = apiContext.c();
        if (!(c instanceof f)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSFileBridge", "access failed! instance is not a TMSInstance");
            return;
        }
        ApPathType a2 = toh.a(path, c);
        if (a2 != ApPathType.AP_PATH_TYPE_USR && a2 != ApPathType.AP_PATH_TYPE_TEMP) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.FORBIDDEN_ERROR);
            TMSLogger.d("TMSFileBridge", "param is invalid! only handle usr/tmp path");
        }
        b.INSTANCE.d(c, path, bridgeCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/open/ability/file/TMSFileBridge$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1569065272);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
