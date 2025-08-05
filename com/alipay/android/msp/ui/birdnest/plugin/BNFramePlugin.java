package com.alipay.android.msp.ui.birdnest.plugin;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.alipay.android.app.birdnest.api.OnFrameTplEventListener;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* loaded from: classes3.dex */
public class BNFramePlugin extends AbsFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MQPBNFRAME_RENDER_SUCCESS = "MQPBNFRAME_RENDER_SUCCESS";
    private static final String MQP_PAGE_CLICK_CLOSE = "MQP_PAGE_CLICK_CLOSE";
    private static final FBContext.JsExecOptions i = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(60000);
    private boolean alignToTop;
    private RelativeLayout b;
    private View c;
    private Context d;
    private int e;
    private FBPluginCtx f;
    private int g;
    private boolean h = false;

    public static /* synthetic */ Object ipc$super(BNFramePlugin bNFramePlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b82b7695", new Object[]{bNFramePlugin})).intValue() : bNFramePlugin.g;
    }

    public static /* synthetic */ View a(BNFramePlugin bNFramePlugin, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4bf0e732", new Object[]{bNFramePlugin, view});
        }
        bNFramePlugin.c = view;
        return view;
    }

    public static /* synthetic */ boolean a(BNFramePlugin bNFramePlugin, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d441076", new Object[]{bNFramePlugin, new Boolean(z)})).booleanValue();
        }
        bNFramePlugin.h = z;
        return z;
    }

    public static /* synthetic */ boolean access$400(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("254aa5f3", new Object[]{bNFramePlugin})).booleanValue() : bNFramePlugin.alignToTop;
    }

    public static /* synthetic */ RelativeLayout access$500(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("c152aa5e", new Object[]{bNFramePlugin}) : bNFramePlugin.b;
    }

    public static /* synthetic */ FBPluginCtx access$600(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBPluginCtx) ipChange.ipc$dispatch("859bdc76", new Object[]{bNFramePlugin}) : bNFramePlugin.f;
    }

    public static /* synthetic */ void b(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c69e641", new Object[]{bNFramePlugin});
        } else {
            bNFramePlugin.a();
        }
    }

    public static /* synthetic */ boolean c(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0a855e4", new Object[]{bNFramePlugin})).booleanValue() : bNFramePlugin.h;
    }

    public static /* synthetic */ View d(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("14a49c01", new Object[]{bNFramePlugin}) : bNFramePlugin.c;
    }

    public BNFramePlugin(Context context, FBPluginCtx fBPluginCtx, int i2) {
        this.alignToTop = true;
        LogUtil.record(1, "BNFramePlugin", "BNFramePlugin_onCreate");
        this.d = context;
        this.e = i2;
        this.f = fBPluginCtx;
        try {
            this.alignToTop = DrmManager.getInstance(context).isGray("degrade_bnframe_update_rect10596", false, context);
        } catch (Throwable th) {
            LogUtil.record(2, "BNFramePlugin:init", "error on alignToTop");
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        this.b = new RelativeLayout(context);
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean updateAttr(java.lang.String r11, final java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.birdnest.plugin.BNFramePlugin.updateAttr(java.lang.String, java.lang.String):boolean");
    }

    private FBContext a(MspContext mspContext) {
        MspWindowClient mspWindowClient;
        MspWindowFrame currentWindowFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBContext) ipChange.ipc$dispatch("f2f772cc", new Object[]{this, mspContext});
        }
        if (mspContext == null || (mspWindowClient = (MspWindowClient) mspContext.getMspUIClient()) == null || (currentWindowFrame = mspWindowClient.getCurrentWindowFrame()) == null) {
            return null;
        }
        FBDocument fBDocument = currentWindowFrame.getFBDocument();
        return fBDocument == null ? PluginManager.getRender().getFbContextFromView(currentWindowFrame.getContentView()) : fBDocument;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            super.finalize();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.g);
        if (mspContextByBizId != null) {
            MspWindowClient mspWindowClient = (MspWindowClient) mspContextByBizId.getMspUIClient();
            if (mspWindowClient != null) {
                mspWindowClient.setOnFrameTplEventListener(new OnFrameTplEventListener() { // from class: com.alipay.android.msp.ui.birdnest.plugin.BNFramePlugin.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.app.birdnest.api.OnFrameTplEventListener
                    public boolean onInterceptTplEvent(Object obj, String str, EventAction.MspEvent mspEvent) {
                        MspWindowClient mspWindowClient2;
                        MspWindowFrame currentWindowFrame;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a565d675", new Object[]{this, obj, str, mspEvent})).booleanValue();
                        }
                        if (mspEvent == null) {
                            LogUtil.record(8, "BNFramePlugin:onInterceptTplEvent", "mspEvent null");
                            return false;
                        }
                        MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(BNFramePlugin.a(BNFramePlugin.this));
                        if (mspContextByBizId2 != null && (obj instanceof FBDocument) && (mspWindowClient2 = (MspWindowClient) mspContextByBizId2.getMspUIClient()) != null && (currentWindowFrame = mspWindowClient2.getCurrentWindowFrame()) != null && currentWindowFrame.getFBDocument() == null) {
                            currentWindowFrame.setFBDocument((FBDocument) obj);
                        }
                        if (!TextUtils.equals(mspEvent.getActionName(), MspFlybirdDefine.FLYBIRD_FRAME_EVENT)) {
                            return false;
                        }
                        try {
                            String str2 = "onFramePluginEvent&&onFramePluginEvent('" + Utils.toJsJsonString(mspEvent.getActionParamsJson().toJSONString()) + "')";
                            LogUtil.record(2, "BNFramePlugin", "event:jsInstruction = ".concat(String.valueOf(str2)));
                            if (mspContextByBizId2 == null || !mspContextByBizId2.isUseSafeJsExecute()) {
                                LogUtil.record(2, "BNFramePlugin", "event:result = ".concat(String.valueOf(BNFramePlugin.access$600(BNFramePlugin.this).nativeExecuteJs(str2))));
                            } else {
                                BNFramePlugin.access$600(BNFramePlugin.this).safeExecuteJs(str2);
                            }
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                        return true;
                    }
                });
                return;
            } else {
                LogUtil.record(8, "BNFramePlugin:onBeforeLoad", "mspWindowClient null");
                return;
            }
        }
        LogUtil.record(8, "BNFramePlugin:onBeforeLoad", "mspContext null");
    }
}
