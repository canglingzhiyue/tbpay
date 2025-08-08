package com.taobao.weex.ui.action;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.utils.WXLogUtils;
import tb.kge;
import tb.riy;

/* loaded from: classes9.dex */
public abstract class BasicGraphicAction implements IExecutable, Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ActionTypeBatchBegin = 1;
    public static final int ActionTypeBatchEnd = 2;
    public static final int ActionTypeNormal = 0;
    public int mActionType = 0;
    private WXSDKInstance mInstance;
    private final String mRef;

    static {
        kge.a(-1104802295);
        kge.a(-1649751206);
        kge.a(-1390502639);
    }

    public BasicGraphicAction(WXSDKInstance wXSDKInstance, String str) {
        this.mInstance = wXSDKInstance;
        this.mRef = str;
    }

    public final WXSDKInstance getWXSDKIntance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WXSDKInstance) ipChange.ipc$dispatch("412990a0", new Object[]{this}) : this.mInstance;
    }

    public final String getPageId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this}) : this.mInstance.N();
    }

    public final String getRef() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fee331bc", new Object[]{this}) : this.mRef;
    }

    public void executeActionOnRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dd43c07", new Object[]{this});
        } else if (StringUtils.isEmpty(this.mInstance.N())) {
            WXLogUtils.e("[BasicGraphicAction] pageId can not be null");
            if (!WXEnvironment.isApkDebugable()) {
                return;
            }
            throw new RuntimeException(riy.ARRAY_START_STR + getClass().getName() + "] pageId can not be null");
        } else {
            WXSDKManager.getInstance().getWXRenderManager().postGraphicAction(this.mInstance.N(), this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            executeAction();
        } catch (Throwable th) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e("BasicGraphicAction", "SafeRunnable run throw expection:" + th.getMessage());
                throw th;
            }
            WXLogUtils.w("BasicGraphicAction", th);
        }
    }
}
