package com.alipay.android.msp.ui.birdnest.render.api;

import android.content.Context;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.msp.plugin.ITemplatePlugin;
import com.alipay.android.msp.ui.birdnest.render.ext.TplProvider;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TemplatePlugin implements ITemplatePlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TemplateService mService = new TemplateService(new TplProvider());

    @Override // com.alipay.android.msp.plugin.ITemplatePlugin
    public void preload(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fcb7b8", new Object[]{this, context});
        } else {
            this.mService.preLoad(context);
        }
    }
}
