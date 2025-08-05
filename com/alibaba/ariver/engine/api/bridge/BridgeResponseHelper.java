package com.alibaba.ariver.engine.api.bridge;

import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.LangResourceUtil;
import com.alibaba.ariver.kernel.common.utils.RVKernelUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class BridgeResponseHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SendToNativeCallback f2897a;
    private Extension b;
    private boolean c;

    static {
        kge.a(616946847);
    }

    public static /* synthetic */ boolean access$000(BridgeResponseHelper bridgeResponseHelper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("71f18faf", new Object[]{bridgeResponseHelper})).booleanValue() : bridgeResponseHelper.c;
    }

    public BridgeResponseHelper(final SendToNativeCallback sendToNativeCallback) {
        this.f2897a = new SendToNativeCallback() { // from class: com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback
            public void onCallback(JSONObject jSONObject, boolean z) {
                SendToNativeCallback sendToNativeCallback2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("906928ef", new Object[]{this, jSONObject, new Boolean(z)});
                } else if ((BridgeResponseHelper.access$000(BridgeResponseHelper.this) && !z) || (sendToNativeCallback2 = sendToNativeCallback) == null) {
                } else {
                    sendToNativeCallback2.onCallback(jSONObject, z);
                }
            }
        };
    }

    public void setTargetExtension(Extension extension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79eee683", new Object[]{this, extension});
        } else {
            this.b = extension;
        }
    }

    public SendToNativeCallback getInnerBridgeResponse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SendToNativeCallback) ipChange.ipc$dispatch("2ba81516", new Object[]{this}) : this.f2897a;
    }

    public void executeSendBack(JSONObject jSONObject, boolean z) {
        Extension extension;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4758cf", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (this.f2897a == null) {
        } else {
            if (RVKernelUtils.isDebug() && (extension = this.b) != null && jSONObject != null) {
                jSONObject.put(RVConstants.PKG_EXT_PREFIX, (Object) extension.getClass().getName());
            }
            this.f2897a.onCallback(jSONObject, z);
        }
    }

    public void sendBridgeResult(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("876226db", new Object[]{this, str, obj});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        executeSendBack(jSONObject, false);
    }

    public void sendBridgeResult(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afcbb35b", new Object[]{this, jSONObject});
        } else {
            executeSendBack(jSONObject, false);
        }
    }

    public void sendBridgeResultWithCallbackKept(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("757134a4", new Object[]{this, str, obj});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        executeSendBack(jSONObject, true);
    }

    public void sendBridgeResultWithCallbackKept(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76fa232", new Object[]{this, jSONObject});
        } else {
            executeSendBack(jSONObject, true);
        }
    }

    public void sendSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f815e62", new Object[]{this});
        } else {
            sendBridgeResult(new JSONObject());
        }
    }

    public void sendError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1f36c6", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", (Object) str);
        jSONObject.put("errorMessage", (Object) str);
        jSONObject.put("error", (Object) Integer.valueOf(i));
        executeSendBack(jSONObject, false);
    }

    public void sendError(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258a7b10", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", (Object) str);
        jSONObject.put("errorMessage", (Object) str);
        jSONObject.put("error", (Object) Integer.valueOf(i));
        jSONObject.put(SimpleProfile.KEY_SIGNATURE, (Object) str2);
        executeSendBack(jSONObject, false);
    }

    public void sendNoRigHtToInvoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1179cd", new Object[]{this});
        } else {
            sendError(4, LangResourceUtil.getString(R.string.ariver_engine_api_forbidden_error));
        }
    }

    public void sendNoRigHtToInvoke(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93aaa57", new Object[]{this, str});
        } else {
            sendError(4, LangResourceUtil.getString(R.string.ariver_engine_api_forbidden_error), str);
        }
    }

    public void sendNotFound() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d01951e", new Object[]{this});
        } else {
            sendError(1, "not implemented");
        }
    }

    public void sendNoRigHtToInvoke4NewJSAPIPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("424531f5", new Object[]{this});
        } else {
            sendError(4, "new jsapi permission deny");
        }
    }

    public void sendNotGrantPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4b6ae7", new Object[]{this});
        } else {
            sendError(5, LangResourceUtil.getString(R.string.ariver_engine_api_authorization_error));
        }
    }

    public void sendUserNotGrantPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb23492", new Object[]{this});
        } else {
            sendError(2001, LangResourceUtil.getString(R.string.ariver_engine_api_user_not_grant));
        }
    }

    public void sendTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfd98cc0", new Object[]{this});
            return;
        }
        sendError(9, "timeout");
        this.c = true;
    }

    public void sendSilentDenyPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab20b0df", new Object[]{this});
        } else {
            sendError(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ta_send_slientdeny_permission", true) ? 2002 : 2001, "user does not allow authorization\n");
        }
    }
}
