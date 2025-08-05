package com.alipay.android.app.render.birdnest.service;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.alipay.android.app.render.api.ICashierProvider;
import com.alipay.android.app.render.api.RenderEnv;
import com.alipay.android.app.render.birdnest.provider.CashierSettingProvider;
import com.alipay.android.app.safepaybase.util.ResUtils;
import com.alipay.android.app.safepaylog.utils.LogUtils;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocumentAssistor;
import com.taobao.umipublish.draft.DraftMediaHelper;
import java.util.Map;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class BirdNestManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static BirdNestService f4377a;

    public static void initFBGlobalConfig(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88c6ff3", new Object[]{iCashierProvider});
        } else if (RenderEnv.isWallet()) {
        } else {
            if (iCashierProvider != null) {
                FBDocumentAssistor.setGlobalSettingProvider(new CashierSettingProvider(iCashierProvider));
            } else {
                LogUtils.record(8, "initFBAtFirst", "ICashierProvider is null");
            }
        }
    }

    public static BirdNestService create(ICashierProvider iCashierProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestService) ipChange.ipc$dispatch("5a33d6e7", new Object[]{iCashierProvider});
        }
        if (f4377a == null) {
            if (RenderEnv.isWallet()) {
                f4377a = a();
            } else {
                f4377a = a(iCashierProvider);
            }
        }
        return f4377a;
    }

    private static BirdNestService a(ICashierProvider iCashierProvider) {
        BirdNestService birdNestService = null;
        try {
            BirdNestService birdNestService2 = (BirdNestService) Class.forName("com.alipay.android.app.render.birdnest.service.impl.BirdNestSDKService").newInstance();
            if (iCashierProvider == null) {
                try {
                    iCashierProvider = new ICashierProvider() { // from class: com.alipay.android.app.render.birdnest.service.BirdNestManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.android.app.render.api.ICashierProvider
                        public final View createWebView(Context context, String str, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, Map<String, String> map) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                return (View) ipChange.ipc$dispatch("2d726c0b", new Object[]{this, context, str, loadUrlListener, map});
                            }
                            return null;
                        }

                        @Override // com.alipay.android.app.render.api.ICashierProvider
                        public final void createWebViewAsync(Context context, String str, BirdNestEngine.UiWidgetProvider.LoadUrlListener loadUrlListener, Map<String, String> map, BirdNestEngine.UiWidgetProvider.CreateCallback createCallback) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("d91e568f", new Object[]{this, context, str, loadUrlListener, map, createCallback});
                            }
                        }

                        @Override // com.alipay.android.app.render.api.ICashierProvider
                        public final void destroyWebView(View view) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("88107f4c", new Object[]{this, view});
                            }
                        }

                        @Override // com.alipay.android.app.render.api.ICashierProvider
                        public final Object getResourceAsync(View view, String str, int i, int i2, Drawable drawable, Drawable drawable2, int i3, boolean z, BirdNestEngine.ResourceProvider.Callback callback, Bundle bundle) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                return ipChange.ipc$dispatch("8625300e", new Object[]{this, view, str, new Integer(i), new Integer(i2), drawable, drawable2, new Integer(i3), new Boolean(z), callback, bundle});
                            }
                            return null;
                        }

                        @Override // com.alipay.android.app.render.api.ICashierProvider
                        public final void loadData(View view, String str, String str2, String str3) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("8167bcd9", new Object[]{this, view, str, str2, str3});
                            }
                        }

                        @Override // com.alipay.android.app.render.api.ICashierProvider
                        public final void loadUrlWithWebView(View view, String str) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("d3512f2b", new Object[]{this, view, str});
                            }
                        }

                        @Override // com.alipay.android.app.render.api.ICashierProvider
                        public final void openWebPage(String str, Context context) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("7d82ade", new Object[]{this, str, context});
                            }
                        }

                        @Override // com.alipay.android.app.render.api.ICashierProvider
                        public final Context getContext() {
                            IpChange ipChange = $ipChange;
                            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : ResUtils.getContext();
                        }
                    };
                } catch (Throwable th) {
                    th = th;
                    birdNestService = birdNestService2;
                    StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "render", "BirdNestSDKServiceEx", th);
                    birdNestService.initialize(iCashierProvider);
                    return birdNestService;
                }
            }
            birdNestService = birdNestService2;
        } catch (Throwable th2) {
            th = th2;
        }
        birdNestService.initialize(iCashierProvider);
        return birdNestService;
    }

    private static BirdNestService a() {
        try {
            return (BirdNestService) Class.forName("com.alipay.android.app.render.birdnest.service.impl.BirdNestWalletService").newInstance();
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, "render", "BirdNestWalletServiceEx", th);
            return null;
        }
    }

    public static void resetService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3be5bed", new Object[0]);
        } else {
            f4377a = null;
        }
    }
}
