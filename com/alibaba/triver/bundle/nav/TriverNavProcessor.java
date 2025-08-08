package com.alibaba.triver.bundle.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.android.triver.base.api.a;
import com.alibaba.triver.base.taobao.TriverRemoteManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.log.TLog;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.kernel.TMSTBOpenStart;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import com.taobao.themis.taobao.impl.TBTMSSDK;
import com.taobao.themis.taobao.impl.TMS;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import java.io.Serializable;
import mtopsdk.common.util.SymbolExpUtil;
import tb.kge;
import tb.qpo;
import tb.qpt;

/* loaded from: classes3.dex */
public class TriverNavProcessor implements com.taobao.android.nav.e, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TriverNavProcessor";

    static {
        kge.a(-1560232822);
        kge.a(-719787762);
        kge.a(1028243835);
    }

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : TAG;
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        try {
            return triverHook(dVar, intent);
        } catch (Throwable th) {
            Log.e(TAG, th.getMessage());
            return true;
        }
    }

    public boolean triverHook(com.taobao.android.nav.d dVar, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f756ded", new Object[]{this, dVar, intent})).booleanValue();
        }
        final Context a2 = dVar.a();
        if (intent != null && intent.getData() != null) {
            qpo.d(a2);
            v b = t.b(a2, "enableAsyncInitTask");
            IExecutorService iExecutorService = (IExecutorService) qpt.b(IExecutorService.class);
            if (iExecutorService != null && b.b()) {
                iExecutorService.getExecutor(ExecutorType.NORMAL).execute(new Runnable() { // from class: com.alibaba.triver.bundle.nav.TriverNavProcessor.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TBTMSSDK.initTBTMS(a2);
                        }
                    }
                });
            } else {
                TBTMSSDK.initTBTMS(a2);
            }
            if (com.taobao.themis.taobao.utils.b.a(intent) || (data = intent.getData()) == null || !data.isHierarchical() || (b.a(data) && intent.getBooleanExtra("disableHook", false))) {
                return true;
            }
            if (data.toString().startsWith("tbopen://") && a.a()) {
                return true;
            }
            if (windmillJumpToTRiver(a2, data)) {
                return false;
            }
            if (TMSSwitchUtils.isEnterTMS(a2, data)) {
                return jumpThemis(intent, dVar);
            }
            if (b.a(data)) {
                if (b.a(data.toString())) {
                    if (!b.b(data.toString())) {
                        String b2 = a.b();
                        Nav.from(a2).toUri(b2 + "&debugUrl=" + Uri.encode(data.toString()));
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("widgetPreviewUrl", data.toString());
                        Nav.from(a2).withExtras(bundle).toUri("http://alibaba.miniapp.widget.preview");
                    }
                    return false;
                }
                if (a.c(com.alibaba.triver.kit.api.common.e.c(data))) {
                    intent.setData(data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
                }
                jumpTriverAndCheckRemote(a2, intent);
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public boolean triverHook(Context context, Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc07567", new Object[]{this, context, intent})).booleanValue();
        }
        if (intent != null && intent.getData() != null) {
            TBTMSSDK.initTBTMS(context);
            if (com.taobao.themis.taobao.utils.b.a(intent) || (data = intent.getData()) == null || !data.isHierarchical() || (b.a(data) && intent.getBooleanExtra("disableHook", false))) {
                return true;
            }
            if (data.toString().startsWith("tbopen://") && a.a()) {
                return true;
            }
            if (windmillJumpToTRiver(context, data)) {
                return false;
            }
            if (TMSSwitchUtils.isEnterTMS(context, data)) {
                return jumpThemis(data, context);
            }
            if (b.a(data)) {
                if (b.a(data.toString())) {
                    if (!b.b(data.toString())) {
                        String b = a.b();
                        Nav.from(context).toUri(b + "&debugUrl=" + Uri.encode(data.toString()));
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("widgetPreviewUrl", data.toString());
                        Nav.from(context).withExtras(bundle).toUri("http://alibaba.miniapp.widget.preview");
                    }
                    return false;
                }
                if (a.c(com.alibaba.triver.kit.api.common.e.c(data))) {
                    intent.setData(data.buildUpon().appendQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY, "fullscreen").build());
                }
                jumpTriverAndCheckRemote(context, intent);
                return false;
            }
        }
        return true;
    }

    private static boolean jumpThemis(Intent intent, com.taobao.android.nav.d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b85efa6", new Object[]{intent, dVar})).booleanValue() : !TMS.startApp(intent, dVar, null);
    }

    private static boolean jumpThemis(Uri uri, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f305d740", new Object[]{uri, context})).booleanValue() : !TMS.INSTANCE.startApp(uri, context);
    }

    public static void jumpTriverAndCheckRemote(final Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e33b61", new Object[]{context, intent});
            return;
        }
        final boolean z = !TriverRemoteManager.getInstance().hasInstalled(ITriverRemoteProxy.DependenceMode.TRIVER_ONLY);
        if (z) {
            intent.putExtra("showRemoteLoading", true);
            s.f18233a.d().a("TRIVER_remote_start", SystemClock.uptimeMillis());
        }
        TriverRemoteManager.getInstance().installWithRemoUI("NAV", intent.getData().toString(), ITriverRemoteProxy.DependenceMode.TRIVER_ONLY, context, new ITriverRemoteProxy.a() { // from class: com.alibaba.triver.bundle.nav.TriverNavProcessor.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
            public void a() {
                try {
                    if (z) {
                        s.f18233a.d().a("TRIVER_remote_end", SystemClock.uptimeMillis());
                    }
                    Class.forName("com.alibaba.triver.bundle.nav.TriverNavProcessorImpl").getDeclaredMethod("triverHook", Context.class, Intent.class).invoke(null, context, intent);
                } catch (Throwable th) {
                    TLog.loge("Triver", TriverNavProcessor.TAG, th);
                }
            }

            @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                if (b.e(intent.getData()) || TMSTBOpenStart.a()) {
                    Nav.from(context).toUri("http://m.taobao.com/index.htm");
                }
                TLog.loge("Triver", TriverNavProcessor.TAG, str);
            }
        });
    }

    private static boolean windmillJumpToTRiver(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d54726f", new Object[]{context, uri})).booleanValue();
        }
        try {
            if (uri.getQueryParameterNames().contains("_wml_code") && !uri.getQueryParameterNames().contains("processByTRiver")) {
                String decodeWML = decodeWML(context, uri);
                String queryParameter = uri.getQueryParameter(i.APP_ID);
                if (!StringUtils.isEmpty(queryParameter)) {
                    decodeWML = queryParameter;
                }
                if (a.a(decodeWML) && !StringUtils.isEmpty(decodeWML)) {
                    Uri.Builder appendQueryParameter = Uri.parse("https://m.duanqu.com").buildUpon().appendQueryParameter(i.APP_ID, decodeWML);
                    for (String str : uri.getQueryParameterNames()) {
                        if (!"_wml_code".equals(str)) {
                            appendQueryParameter.appendQueryParameter(str, uri.getQueryParameter(str));
                        }
                    }
                    appendQueryParameter.appendQueryParameter("processByTRiver", "true");
                    Nav.from(context).toUri(appendQueryParameter.build());
                    return true;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }

    private static String decodeWML(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14b76a92", new Object[]{context, uri});
        }
        try {
            return SecurityGuardManager.getInstance(context.getApplicationContext()).getStaticDataEncryptComp().staticSafeDecrypt(16, "rap_code_key", uri.getQueryParameter("_wml_code")).split(SymbolExpUtil.SYMBOL_VERTICALBAR)[0];
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
