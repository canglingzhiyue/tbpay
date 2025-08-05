package com.taobao.weex.ui.animation;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.ui.action.GraphicActionAnimation;
import com.taobao.weex.ui.component.WXComponent;
import tb.kge;

/* loaded from: classes9.dex */
public class WXAnimationModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-94257180);
    }

    @JSMethod
    public void transition(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbe643a", new Object[]{this, str, str2, str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.mWXSDKInstance == null) {
        } else {
            GraphicActionAnimation graphicActionAnimation = new GraphicActionAnimation(this.mWXSDKInstance, str, str2, str3);
            WXSDKManager.getInstance().getWXRenderManager().postGraphicAction(graphicActionAnimation.getPageId(), graphicActionAnimation);
        }
    }

    /* loaded from: classes9.dex */
    public static class AnimationHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String callback;
        private WXAnimationBean wxAnimationBean;

        static {
            kge.a(-1880062608);
        }

        public void execute(WXSDKInstance wXSDKInstance, WXComponent wXComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d1db1757", new Object[]{this, wXSDKInstance, wXComponent});
            } else if (wXSDKInstance == null || wXComponent == null) {
            } else {
                GraphicActionAnimation graphicActionAnimation = new GraphicActionAnimation(wXSDKInstance, wXComponent.getRef(), this.wxAnimationBean, this.callback);
                WXSDKManager.getInstance().getWXRenderManager().postGraphicAction(graphicActionAnimation.getPageId(), graphicActionAnimation);
            }
        }

        public AnimationHolder(WXAnimationBean wXAnimationBean, String str) {
            this.wxAnimationBean = wXAnimationBean;
            this.callback = str;
        }
    }
}
