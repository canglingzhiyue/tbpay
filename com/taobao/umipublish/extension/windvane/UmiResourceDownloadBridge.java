package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.loading.c;
import com.taobao.android.litecreator.sdk.framework.container.loading.d;
import com.taobao.android.litecreator.util.k;
import com.taobao.android.litecreator.util.l;
import com.taobao.android.litecreator.util.n;
import com.taobao.android.litecreator.util.u;
import com.taobao.tao.flexbox.layoutmanager.container.a;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.hfj;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;

/* loaded from: classes9.dex */
public class UmiResourceDownloadBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_DOWNLOAD_RESOURCE = "downResource";
    private static final String DEFAULT_SUFFIX = ".mp4";
    public static final String PLUGIN_NAME = "XGCResourceDownloadBridge";
    private static final String TAG = "XGCResourceDownloadBridge";
    private static Map<String, String> sDownloadedCache;
    private c mProgressDialog;

    public static /* synthetic */ Object ipc$super(UmiResourceDownloadBridge umiResourceDownloadBridge, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(UmiResourceDownloadBridge umiResourceDownloadBridge, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f118cb76", new Object[]{umiResourceDownloadBridge, new Integer(i)});
        } else {
            umiResourceDownloadBridge.updateDialogProgress(i);
        }
    }

    public static /* synthetic */ void access$100(UmiResourceDownloadBridge umiResourceDownloadBridge, String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3983f", new Object[]{umiResourceDownloadBridge, str, str2, wVCallBackContext});
        } else {
            umiResourceDownloadBridge.onDownloadFailed(str, str2, wVCallBackContext);
        }
    }

    public static /* synthetic */ Map access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e220286e", new Object[0]) : sDownloadedCache;
    }

    public static /* synthetic */ void access$300(UmiResourceDownloadBridge umiResourceDownloadBridge, String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236af7c1", new Object[]{umiResourceDownloadBridge, str, str2, wVCallBackContext});
        } else {
            umiResourceDownloadBridge.onDownloadSuccess(str, str2, wVCallBackContext);
        }
    }

    static {
        kge.a(-470948007);
        sDownloadedCache = new HashMap();
    }

    private void initLoadingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fe9cfb", new Object[]{this});
        } else if (this.mProgressDialog != null) {
        } else {
            this.mProgressDialog = new c(this.mContext, null);
        }
    }

    private void showProgressDialog(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839aadb7", new Object[]{this, runnable});
            return;
        }
        initLoadingDialog();
        this.mProgressDialog.show();
        this.mProgressDialog.a(b.a(R.string.gg_pub_downloading_please_wait));
        this.mProgressDialog.a(true);
        c cVar = this.mProgressDialog;
        cVar.a(new d(cVar) { // from class: com.taobao.umipublish.extension.windvane.UmiResourceDownloadBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 92838762) {
                    super.c();
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // com.taobao.android.litecreator.sdk.framework.container.loading.d, com.taobao.android.litecreator.sdk.framework.container.loading.a
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                super.c();
                Runnable runnable2 = runnable;
                if (runnable2 == null) {
                    return;
                }
                runnable2.run();
            }
        });
    }

    public void hideProcessingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fb09a4", new Object[]{this});
            return;
        }
        c cVar = this.mProgressDialog;
        if (cVar == null) {
            return;
        }
        cVar.dismiss();
    }

    private void updateDialogProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3acf95e", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressDialog.a(i);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        u.b("XGCResourceDownloadBridge", "onDestroy.");
        this.mProgressDialog = null;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!StringUtils.equals(str, ACTION_DOWNLOAD_RESOURCE)) {
            return false;
        }
        downloadResource(str2, wVCallBackContext);
        return true;
    }

    private void downloadResource(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38447884", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        if (parseObject == null || !parseObject.containsKey("url")) {
            u.d("XGCResourceDownloadBridge", "downloadResource.error: invalid params");
            wVCallBackContext.error();
            return;
        }
        String string = parseObject.getString(Constants.Name.SUFFIX);
        if (StringUtils.isEmpty(string)) {
            string = ".mp4";
        }
        downloadResourceWithURL(parseObject.getString("url"), string, wVCallBackContext);
    }

    private void downloadResourceWithURL(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ed808b", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        String str3 = sDownloadedCache.get(str);
        if (!StringUtils.isEmpty(str3) && k.a(str3)) {
            onDownloadSuccess(str, str3, wVCallBackContext);
            return;
        }
        final int a2 = com.taobao.downloader.b.a().a(buildDownloadRequest(str, str2), new kml() { // from class: com.taobao.umipublish.extension.windvane.UmiResourceDownloadBridge.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.kml
            public void onDownloadStateChange(String str4, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str4, new Boolean(z)});
                }
            }

            @Override // tb.kml
            public void onNetworkLimit(int i, kmq kmqVar, kml.a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                }
            }

            @Override // tb.kml
            public void onDownloadProgress(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                } else {
                    UmiResourceDownloadBridge.access$000(UmiResourceDownloadBridge.this, i);
                }
            }

            @Override // tb.kml
            public void onDownloadError(String str4, int i, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str4, new Integer(i), str5});
                    return;
                }
                u.d("XGCResourceDownloadBridge", "downloadResource.onDownloadError. errorCode:" + i + ", errorMsg:" + str5);
                UmiResourceDownloadBridge.access$100(UmiResourceDownloadBridge.this, String.valueOf(i), str5, wVCallBackContext);
            }

            @Override // tb.kml
            public void onDownloadFinish(String str4, String str5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str4, str5});
                    return;
                }
                u.b("XGCResourceDownloadBridge", "downloadResource.onDownloadFinish. url:" + str4 + ", filePath:" + str5);
                UmiResourceDownloadBridge.access$200().put(str4, str5);
                UmiResourceDownloadBridge.access$300(UmiResourceDownloadBridge.this, str4, str5, wVCallBackContext);
            }

            @Override // tb.kml
            public void onFinish(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                    return;
                }
                u.b("XGCResourceDownloadBridge", "downloadResource.onFinish. b:" + z);
            }
        });
        showProgressDialog(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiResourceDownloadBridge.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.downloader.b.a().a(a2);
                UmiResourceDownloadBridge.access$100(UmiResourceDownloadBridge.this, "-1", "canceled_by_user", wVCallBackContext);
            }
        });
    }

    private void onDownloadSuccess(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a176654", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        hideProcessingDialog();
        r rVar = new r("HY_SUCCESS");
        rVar.a("remoteUrl", str);
        rVar.a(a.CONFIG_LOCAL_PATH, str2);
        wVCallBackContext.success(rVar);
    }

    private void onDownloadFailed(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07c0e7c", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        hfj.a(this.mContext, b.a(R.string.gg_pub_download_failed_retry));
        hideProcessingDialog();
        r rVar = new r("HY_FAILED");
        rVar.a("errorCode", str);
        rVar.a("errorMsg", str2);
        wVCallBackContext.error(rVar);
    }

    private kmm buildDownloadRequest(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmm) ipChange.ipc$dispatch("bfb07867", new Object[]{this, str, str2});
        }
        kmm kmmVar = new kmm();
        kmmVar.b.h = getDownloadStoreDir(this.mContext);
        kmmVar.b.f30169a = "guangguang";
        kmo kmoVar = new kmo();
        kmoVar.f30167a = str;
        kmoVar.d = l.a() + str2;
        kmmVar.f30166a.add(kmoVar);
        return kmmVar;
    }

    public static String getDownloadStoreDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee66c429", new Object[]{context});
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            return null;
        }
        String str = externalFilesDir.getAbsolutePath() + n.LC_TEMP_DIR;
        File file = new File(str);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return str;
    }
}
