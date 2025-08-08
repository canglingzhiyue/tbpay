package com.alipay.android.msp.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBResourceClient;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.api.ImageLoader;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.taobao.share.ui.engine.friend.a;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes3.dex */
public class ResUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final FBContext.JsExecOptions loadImgExecOpts = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(10000);

    public static /* synthetic */ FBContext.JsExecOptions access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBContext.JsExecOptions) ipChange.ipc$dispatch("e3a05a5", new Object[0]) : loadImgExecOpts;
    }

    public static /* synthetic */ void access$100(FBDocument fBDocument, View view, String str, String str2, String str3, boolean z, BirdNestEngine.ResourceProvider.Callback callback, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf15eb7", new Object[]{fBDocument, view, str, str2, str3, new Boolean(z), callback, new Boolean(z2)});
        } else {
            loadImageImpl(fBDocument, view, str, str2, str3, z, callback, z2);
        }
    }

    public static Drawable getDrawableId(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("da5535be", new Object[]{context, str});
        }
        try {
            int indexOf = str.indexOf("/");
            if (indexOf == -1) {
                return null;
            }
            String substring = str.substring(0, indexOf);
            if (StringUtils.isEmpty(substring)) {
                substring = context.getPackageName();
            }
            String substring2 = str.substring(indexOf + 1);
            if (StringUtils.isEmpty(substring2) || StringUtils.isEmpty(substring)) {
                return null;
            }
            int indexOf2 = substring2.indexOf(".");
            if (indexOf2 >= 0) {
                substring2 = substring2.substring(0, indexOf2);
            }
            int resourceId = getResourceId(substring2, a.CONTACTS_INFO_NOT_EMPTY_STATUS, substring);
            if (resourceId != 0 && resourceId != -1) {
                LogUtil.record(1, "ResUtils:getDrawableId", str + ResponseProtocolType.COMMENT + resourceId);
                return context.getResources().getDrawable(resourceId);
            }
            LogUtil.record(1, "ResUtils:getDrawableId", "failed to load ".concat(String.valueOf(str)));
            return null;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public static int getResourceId(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e7817", new Object[]{str, str2, str3})).intValue();
        }
        try {
            if (GlobalSdkConstant.getSdkType()) {
                if (StringUtils.isEmpty(str3)) {
                    str3 = GlobalHelper.getInstance().getContext().getPackageName();
                }
                Resources resources = PhoneCashierMspEngine.getMspBase().getResources(null);
                if (resources.getIdentifier(str, str2, str3) > 0) {
                    return -1;
                }
                return resources.getIdentifier(str, str2, GlobalHelper.getInstance().getContext().getPackageName());
            }
            if (StringUtils.isEmpty(str3)) {
                str3 = "com.alipay.android.app";
            }
            return PhoneCashierMspEngine.getMspBase().getResources(null).getIdentifier(str, str2, str3);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return -1;
        }
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2dip(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64b9c813", new Object[]{context, new Float(f)})).intValue() : (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static void loadImageImpl(final FBDocument fBDocument, View view, final String str, String str2, String str3, boolean z, final BirdNestEngine.ResourceProvider.Callback callback, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfde13", new Object[]{fBDocument, view, str, str2, str3, new Boolean(z), callback, new Boolean(z2)});
            return;
        }
        int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
        String str4 = fBDocument.param.bundleName;
        BirdNestEngine engine = fBDocument.getEngine();
        ImageLoader.ILayoutListener iLayoutListener = new ImageLoader.ILayoutListener() { // from class: com.alipay.android.msp.utils.ResUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.birdnest.api.ImageLoader.ILayoutListener
            public void requestLayout(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7d3b00", new Object[]{this, new Integer(i), new Integer(i2)});
                }
            }
        };
        FBResourceClient fBResourceClient = fBDocument.param.resourceClient;
        BirdNestEngine.ResourceProvider.Callback callback2 = new BirdNestEngine.ResourceProvider.Callback() { // from class: com.alipay.android.msp.utils.ResUtils.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
            public void onLoadSuccess(int i, int i2, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a1462621", new Object[]{this, new Integer(i), new Integer(i2), obj});
                    return;
                }
                String str5 = "document.onImgLoaded && typeof document.onImgLoaded === 'function' && document.onImgLoaded(true,\"" + str + "\");";
                if (z2) {
                    fBDocument.safeExecuteJs(str5, ResUtils.access$000(), null);
                } else {
                    fBDocument.executeJs(str5);
                }
                BirdNestEngine.ResourceProvider.Callback callback3 = callback;
                if (callback3 == null) {
                    return;
                }
                callback3.onLoadSuccess(i, i2, obj);
            }

            @Override // com.alipay.birdnest.api.BirdNestEngine.ResourceProvider.Callback
            public void onLoadFailure(int i, int i2, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4bc2b2a8", new Object[]{this, new Integer(i), new Integer(i2), obj});
                    return;
                }
                String str5 = "document.onImgLoaded && typeof document.onImgLoaded === 'function' && document.onImgLoaded(false,\"" + str + "\");";
                if (z2) {
                    fBDocument.safeExecuteJs(str5, ResUtils.access$000(), null);
                } else {
                    fBDocument.executeJs(str5);
                }
                BirdNestEngine.ResourceProvider.Callback callback3 = callback;
                if (callback3 == null) {
                    return;
                }
                callback3.onLoadFailure(i, i2, obj);
            }
        };
        Bundle bundle = new Bundle();
        bundle.putString("bizid", "BirdNest@" + fBDocument.getTid());
        fBDocument.getEngine().getImageLoader().loadImage(engine, view, str, str4, iArr, z, str2, str3, -1, false, iLayoutListener, fBResourceClient, callback2, bundle);
    }

    public static void loadImage(final FBDocument fBDocument, final View view, final String str, final String str2, final String str3, boolean z, final BirdNestEngine.ResourceProvider.Callback callback, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251569d3", new Object[]{fBDocument, view, str, str2, str3, new Boolean(z), callback, new Boolean(z2)});
            return;
        }
        StringBuilder sb = new StringBuilder("doc: ");
        Object obj = "null";
        sb.append(fBDocument == null ? obj : Integer.valueOf(fBDocument.hashCode()));
        sb.append(" url: ");
        sb.append(StringUtils.isEmpty(str) ? obj : str);
        sb.append(" imageView: ");
        Object obj2 = obj;
        if (view != null) {
            obj2 = Integer.valueOf(view.hashCode());
        }
        sb.append(obj2);
        LogUtil.record(2, "ResUtils:loadImage", sb.toString());
        if (fBDocument == null || StringUtils.isEmpty(str) || view == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                loadImageImpl(fBDocument, view, str, str2, str3, z, callback, z2);
                return;
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return;
            }
        }
        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.utils.ResUtils.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ResUtils.access$100(FBDocument.this, view, str, str2, str3, false, callback, z2);
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
            }
        });
    }

    public static void loadImage(FBDocument fBDocument, View view, String str, String str2, String str3, BirdNestEngine.ResourceProvider.Callback callback, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793741ed", new Object[]{fBDocument, view, str, str2, str3, callback, new Boolean(z)});
        } else {
            loadImage(fBDocument, view, str, str2, str3, false, null, z);
        }
    }

    public static void loadImage(FBDocument fBDocument, View view, String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4843bf27", new Object[]{fBDocument, view, str, str2, str3, new Boolean(z)});
        } else {
            loadImage(fBDocument, view, str, str2, str3, null, z);
        }
    }
}
