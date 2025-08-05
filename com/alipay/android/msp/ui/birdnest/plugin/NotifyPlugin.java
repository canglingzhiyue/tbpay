package com.alipay.android.msp.ui.birdnest.plugin;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.mobile.beehive.eventbus.EventBusManager;
import com.alipay.mobile.beehive.eventbus.IEventSubscriber;
import com.alipay.mobile.beehive.eventbus.ThreadMode;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NotifyPlugin extends AbsFBPlugin implements IEventSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBizId;
    private String mCallbackName;
    private FBPluginCtx mPluginCtx;

    public static /* synthetic */ Object ipc$super(NotifyPlugin notifyPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public NotifyPlugin(FBPluginCtx fBPluginCtx, int i) {
        LogUtil.record(4, "NotifyPlugin", "NotifyPlugin_oncreate");
        this.mBizId = i;
        this.mPluginCtx = fBPluginCtx;
        EventBusManager.getInstance().post(Integer.valueOf(this.mBizId), MspGlobalDefine.EVENT_PLUGIN_ONLOAD_BROADCAST);
        registerEventBus();
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context}) : new View(context);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        if (str.equals("src")) {
            try {
                LogUtil.record(1, "updateAttr_src", str2);
                JSONObject parseObject = JSONObject.parseObject(str2);
                if (parseObject.containsKey("finishPlugin")) {
                    if (parseObject.getBoolean("finishPlugin").booleanValue()) {
                        unregisterEventBus();
                    } else {
                        this.mCallbackName = parseObject.getJSONObject("callbacks").getString("onNotify");
                        LogUtil.record(1, "mNotifyName", this.mCallbackName);
                    }
                } else {
                    this.mCallbackName = parseObject.getJSONObject("callbacks").getString("onNotify");
                    LogUtil.record(1, "mNotifyName", this.mCallbackName);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return true;
    }

    private void registerEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23964d50", new Object[]{this});
            return;
        }
        EventBusManager.getInstance().register(this, ThreadMode.CURRENT, MspGlobalDefine.EVENT_CONTAINER_FINISH);
        EventBusManager.getInstance().register(this, ThreadMode.UI, MspGlobalDefine.EVENT_NOTIFY_TPL);
    }

    private void unregisterEventBus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e1569", new Object[]{this});
        } else {
            EventBusManager.getInstance().unregister(this);
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        unregisterEventBus();
    }

    @Override // com.alipay.mobile.beehive.eventbus.IEventSubscriber
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (TextUtils.equals(MspGlobalDefine.EVENT_NOTIFY_TPL, str)) {
            LogUtil.record(2, "NotifyPlugin:onEvent", "name=" + str + " object=" + obj);
            JSONObject jSONObject = (JSONObject) obj;
            if (TextUtils.isEmpty(this.mCallbackName)) {
                return;
            }
            String str2 = this.mCallbackName + "&&" + this.mCallbackName + "('" + Utils.toJsJsonString(jSONObject.toString()) + "')";
            LogUtil.record(2, "NotifyPlugin", "nativeExecuteJs:jsInstruction = ".concat(String.valueOf(str2)));
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
            if (mspContextByBizId != null && mspContextByBizId.isUseSafeJsExecute()) {
                this.mPluginCtx.safeExecuteJs(str2);
            } else {
                LogUtil.record(2, "NotifyPlugin", "nativeExecuteJs:result =".concat(String.valueOf(this.mPluginCtx.nativeExecuteJs(str2))));
            }
            LogUtil.record(2, "checkEbank", "Js exec" + System.currentTimeMillis());
        } else if (!TextUtils.equals(MspGlobalDefine.EVENT_CONTAINER_FINISH, str) || ((Integer) obj).intValue() != this.mBizId) {
        } else {
            unregisterEventBus();
        }
    }
}
