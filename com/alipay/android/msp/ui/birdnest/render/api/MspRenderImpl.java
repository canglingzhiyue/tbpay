package com.alipay.android.msp.ui.birdnest.render.api;

import android.content.Context;
import com.alipay.android.app.cctemplate.api.ITplTransport;
import com.alipay.android.app.crender.ext.TemplateTransport;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.ui.base.keyboard.MspKeyboardService;
import com.alipay.android.msp.ui.birdnest.render.ext.CashierProvider;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MspRenderImpl extends MspRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ICashierProvider mProvider;
    private ITplTransport mTransport;

    public MspRenderImpl() {
        this.mRender.setTplTransport(getTplTransport());
        this.mRender.setProvider(getProvider());
    }

    private ITplTransport getTplTransport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITplTransport) ipChange.ipc$dispatch("e48f352a", new Object[]{this});
        }
        this.mTransport = new TemplateTransport();
        return this.mTransport;
    }

    private ICashierProvider getProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ICashierProvider) ipChange.ipc$dispatch("2dde5263", new Object[]{this});
        }
        this.mProvider = new CashierProvider();
        return this.mProvider;
    }

    @Override // com.alipay.android.msp.ui.birdnest.render.api.MspRender
    public void setKeyboardService(MspContext mspContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc46eddf", new Object[]{this, mspContext, context});
        } else {
            this.mRender.setKeyBoardService(this.mMspKeyboardService);
        }
    }

    @Override // com.alipay.android.msp.ui.birdnest.render.api.MspRender
    public void initializeKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d173f49e", new Object[]{this});
        } else if (this.mMspKeyboardService != null) {
        } else {
            this.mMspKeyboardService = new MspKeyboardService(MspKeyboardService.BIRDNEST_RENDER);
        }
    }
}
