package com.alipay.android.msp.debug;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.scheme.MspSchemeActivity;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.IRender;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRenderImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class UpdateTplDebugUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final MspSchemeActivity.MspSchemeHandler f4561a = new MspSchemeActivity.MspSchemeHandler() { // from class: com.alipay.android.msp.debug.UpdateTplDebugUtil.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
        public String getName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : "UpdateTplDebugUtil";
        }

        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
        public boolean shouldHandle(Intent intent) {
            Uri data;
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("86262e83", new Object[]{this, intent})).booleanValue() : intent != null && (data = intent.getData()) != null && "alipay".equals(data.getScheme()) && "processpaymentresult".equals(data.getHost());
        }

        @Override // com.alipay.android.msp.biz.scheme.MspSchemeActivity.MspSchemeHandler
        public void handle(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f96ac96c", new Object[]{this, intent});
                return;
            }
            Uri data = intent != null ? intent.getData() : null;
            LogUtil.record(2, "UpdateTplDebugUtil", "sc result uri ".concat(String.valueOf(data)));
            if (data == null) {
                return;
            }
            final String queryParameter = data.getQueryParameter(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID);
            JSONObject parseObject = JSONObject.parseObject(data.getQueryParameter("tpl"));
            LogUtil.record(2, "UpdateTplDebugUtil", "tplid:".concat(String.valueOf(queryParameter)));
            LogUtil.record(2, "UpdateTplDebugUtil", "tpl:".concat(String.valueOf(parseObject)));
            IRender render = PluginManager.getRender();
            if (!(render instanceof MspRenderImpl)) {
                LogUtil.record(8, "UpdateTplDebugUtil", "render is ".concat(String.valueOf(render)));
                return;
            }
            MspRenderImpl mspRenderImpl = (MspRenderImpl) render;
            try {
                LogUtil.record(2, "UpdateTplDebugUtil", "notifyTplUpdate");
                mspRenderImpl.notifyTplUpdate(queryParameter, parseObject.toJSONString());
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.debug.UpdateTplDebugUtil.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Context context = GlobalHelper.getInstance().getContext();
                        Toast.makeText(context, "模板加载成功。tplid:" + queryParameter, 0).show();
                    }
                });
            } catch (Throwable unused) {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.debug.UpdateTplDebugUtil.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(GlobalHelper.getInstance().getContext(), "模板加载失败!", 0).show();
                        }
                    }
                });
            }
        }
    };

    public static void registerDebugHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd4e341", new Object[0]);
            return;
        }
        LogUtil.record(2, "UpdateTplDebugUtil", "registerDebugHandler isDebug" + GlobalConstant.DEBUG);
        if (!GlobalConstant.DEBUG) {
            return;
        }
        MspSchemeActivity.registerHandler(f4561a);
    }
}
