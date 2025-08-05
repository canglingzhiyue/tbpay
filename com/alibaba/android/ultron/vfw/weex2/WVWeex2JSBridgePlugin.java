package com.alibaba.android.ultron.vfw.weex2;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import tb.kge;

/* loaded from: classes2.dex */
public class WVWeex2JSBridgePlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_ACTION_DOWNGRADE = "downgrade";
    private static final String KEY_ACTION_UPDATEHEIGHT = "updateHeight";
    private final IDMComponent mComponent;
    private final FrameLayout mRootView;

    static {
        kge.a(-1986425705);
    }

    public WVWeex2JSBridgePlugin(FrameLayout frameLayout, IDMComponent iDMComponent) {
        this.mRootView = frameLayout;
        this.mComponent = iDMComponent;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("downgrade".equals(str)) {
            i.a(this.mRootView, this.mComponent);
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if (!KEY_ACTION_UPDATEHEIGHT.equals(str) || !i.a(this.mRootView, this.mComponent, str2)) {
            return false;
        } else {
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        }
    }
}
