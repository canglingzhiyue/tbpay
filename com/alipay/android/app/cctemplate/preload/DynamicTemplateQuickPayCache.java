package com.alipay.android.app.cctemplate.preload;

import com.alipay.android.app.base.SPTaskHelper;
import com.alipay.android.app.cctemplate.api.ITplProvider;
import com.alipay.android.app.cctemplate.api.TemplateService;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocumentAssistor;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class DynamicTemplateQuickPayCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DynamicTemplateQuickPayCache f4344a;
    private boolean b = false;

    public static DynamicTemplateQuickPayCache getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicTemplateQuickPayCache) ipChange.ipc$dispatch("a49ca74f", new Object[0]);
        }
        if (f4344a == null) {
            f4344a = new DynamicTemplateQuickPayCache();
        }
        return f4344a;
    }

    public synchronized void preLoad(final ITplProvider iTplProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af2c9f62", new Object[]{this, iTplProvider});
            return;
        }
        LogUtils.record(2, "DynamicTemplateQuickPayCache::preLoad", "start");
        if (iTplProvider == null) {
            LogUtils.record(2, "DynamicTemplateQuickPayCache::preLoad", "provider:null");
        } else if (this.b) {
            LogUtils.record(2, "DynamicTemplateQuickPayCache::preLoad", "mIsInitialized:true");
        } else {
            this.b = true;
            SPTaskHelper.execute(new Runnable() { // from class: com.alipay.android.app.cctemplate.preload.DynamicTemplateQuickPayCache.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        try {
                            DynamicTemplateQuickPayCache.a(DynamicTemplateQuickPayCache.this, iTplProvider);
                            try {
                                iTplProvider.onComplated();
                            } catch (Throwable th) {
                                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "tpl", "TplPreloadOnComplatedEx", th);
                            }
                        } catch (Throwable unused) {
                            iTplProvider.onComplated();
                        }
                    } catch (Throwable th2) {
                        StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "tpl", "TplPreloadOnComplatedEx", th2);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(DynamicTemplateQuickPayCache dynamicTemplateQuickPayCache, ITplProvider iTplProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9abc7e5", new Object[]{dynamicTemplateQuickPayCache, iTplProvider});
            return;
        }
        TemplateService templateService = new TemplateService(iTplProvider);
        FBDocumentAssistor.putAssetRes("AlipaySDK.bundle/amc.js", templateService.readAssets("amc.js", iTplProvider.getContext()));
        FBDocumentAssistor.putAssetRes("AlipaySDK.bundle/amc.css", templateService.readAssets("amc.css", iTplProvider.getContext()));
        FBDocumentAssistor.putAssetRes("AlipaySDK.bundle/amc.i18n", templateService.readAssets("amc.i18n", iTplProvider.getContext()));
    }
}
