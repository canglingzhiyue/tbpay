package com.taobao.interact.core.h5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.h;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.zoloz.toyger.blob.BlobManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.publish.service.AspectRatio;
import com.taobao.interact.publish.service.BitmapSize;
import com.taobao.interact.publish.service.IServiceCallBack;
import com.taobao.interact.publish.service.Image;
import com.taobao.interact.publish.service.PublishConfig;
import com.taobao.interact.publish.service.Ratio;
import com.taobao.interact.publish.service.c;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.scancode.gateway.util.i;
import java.io.File;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes7.dex */
public class WVInteractsdkCamera extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_WRITE_WV_IMAGE_MAX = 640;
    private static final String INTERACT_ACTION = "takePhotoInteract";
    private static final String TAG = "WVInteractsdkCamera";
    private static final String TAKEPHOTO_EVENT_NAME = "WVPhoto.Event.takePhotoSuccess";
    private PublishConfig.a mBuilder;
    private WVCallBackContext mCallback;
    private ThreadPoolExecutor mExecutorService;
    private b mJSONParams;
    private IntentFilter mIntentFilter = new IntentFilter();
    private BroadcastReceiver mBackReceiver = new BroadcastReceiver() { // from class: com.taobao.interact.core.h5.WVInteractsdkCamera.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (WVInteractsdkCamera.access$000(WVInteractsdkCamera.this) == null) {
            } else {
                r rVar = new r();
                rVar.a("errorMsg", "PHOTO_CANCEL");
                WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).error(rVar);
            }
        }
    };
    private BroadcastReceiver mErrorReceiver = new BroadcastReceiver() { // from class: com.taobao.interact.core.h5.WVInteractsdkCamera.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            TLog.loge(WVInteractsdkCamera.TAG, "error receiver");
            if (WVInteractsdkCamera.access$000(WVInteractsdkCamera.this) == null || intent == null) {
                return;
            }
            String a2 = d.a(intent.getStringExtra("errorCode"), intent.getStringExtra("errorMsg"));
            WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).error(a2);
            TLog.loge(WVInteractsdkCamera.TAG, "error = " + a2);
        }
    };

    static {
        kge.a(-283658766);
    }

    public static /* synthetic */ Object ipc$super(WVInteractsdkCamera wVInteractsdkCamera, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != 1743254097) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1], objArr[2]);
            return null;
        }
    }

    public static /* synthetic */ WVCallBackContext access$000(WVInteractsdkCamera wVInteractsdkCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("d079431b", new Object[]{wVInteractsdkCamera}) : wVInteractsdkCamera.mCallback;
    }

    public static /* synthetic */ void access$100(WVInteractsdkCamera wVInteractsdkCamera, List list) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1539b5c8", new Object[]{wVInteractsdkCamera, list});
        } else {
            wVInteractsdkCamera.multiImageLogic(list);
        }
    }

    public static /* synthetic */ b access$200(WVInteractsdkCamera wVInteractsdkCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4717373d", new Object[]{wVInteractsdkCamera}) : wVInteractsdkCamera.mJSONParams;
    }

    public static /* synthetic */ void access$300(WVInteractsdkCamera wVInteractsdkCamera, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19cf1f86", new Object[]{wVInteractsdkCamera, list});
        } else {
            wVInteractsdkCamera.packageDataToH5(list);
        }
    }

    public static /* synthetic */ String access$400(WVInteractsdkCamera wVInteractsdkCamera, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fb011b18", new Object[]{wVInteractsdkCamera, str, str2}) : wVInteractsdkCamera.writeFile2WVCache(str, str2);
    }

    public static /* synthetic */ Context access$500(WVInteractsdkCamera wVInteractsdkCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7df6584b", new Object[]{wVInteractsdkCamera}) : wVInteractsdkCamera.mContext;
    }

    public static /* synthetic */ IWVWebView access$600(WVInteractsdkCamera wVInteractsdkCamera) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IWVWebView) ipChange.ipc$dispatch("5afef2c8", new Object[]{wVInteractsdkCamera}) : wVInteractsdkCamera.mWebView;
    }

    public WVInteractsdkCamera() {
        this.mIntentFilter.addAction("com.taobao.interact.publish.action.BACK");
        this.mExecutorService = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new ThreadFactory() { // from class: com.taobao.interact.core.h5.WVInteractsdkCamera.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "TaopaiImageUploadThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.mExecutorService.allowCoreThreadTimeOut(true);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e7f251", new Object[]{this, context, iWVWebView, obj});
            return;
        }
        super.initialize(context, iWVWebView, obj);
        LocalBroadcastManager.getInstance(context).registerReceiver(this.mBackReceiver, this.mIntentFilter);
        LocalBroadcastManager.getInstance(context).registerReceiver(this.mErrorReceiver, new IntentFilter("com.taobao.interact.publish.action.error"));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        this.mCallback = wVCallBackContext;
        if (!INTERACT_ACTION.equals(str)) {
            return false;
        }
        try {
            takePhotoInteract(str2);
        } catch (RemoteException e) {
            e.printStackTrace();
            Log.e("Taopai", "Windvane " + str + ", error " + e.getMessage());
            wVCallBackContext.error(d.a("", e.getMessage()));
        }
        return true;
    }

    private void takePhotoInteract(String str) throws RemoteException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9151912", new Object[]{this, str});
            return;
        }
        try {
            TLog.loge(TAG, "takePhotoInteract = " + str);
            this.mJSONParams = b.a(new JSONObject(str));
            this.mBuilder = new PublishConfig.a();
            this.mBuilder.e(this.mJSONParams.c).d(this.mJSONParams.d).g(this.mJSONParams.q).c(this.mJSONParams.f).f(this.mJSONParams.e).b(this.mJSONParams.f17595a).a(this.mJSONParams.b).a(this.mJSONParams.o).b(this.mJSONParams.j).a(this.mJSONParams.i).b(this.mJSONParams.h).c(this.mJSONParams.g).c(this.mJSONParams.l).d(this.mJSONParams.m).g(this.mJSONParams.n).e(false).a(new BitmapSize(this.mJSONParams.s, this.mJSONParams.t)).d(this.mJSONParams.p).a(Ratio.parseRatio(stringParseRatio(this.mJSONParams.u))).h(this.mJSONParams.z).i(this.mJSONParams.A).j(this.mJSONParams.B).e(this.mJSONParams.C);
            if (this.mJSONParams.v != 0 && this.mJSONParams.w != 0) {
                this.mBuilder.a(new AspectRatio(this.mJSONParams.v, this.mJSONParams.w));
            }
            com.taobao.interact.publish.service.b bVar = new com.taobao.interact.publish.service.b(this.mContext, this.mBuilder.a());
            try {
                String str2 = this.mJSONParams.o;
                if (str2.equalsIgnoreCase("both")) {
                    bVar.a();
                } else if (str2.equalsIgnoreCase(i.SOURCE_TYPE_PHOTO)) {
                    bVar.b();
                } else if (str2.equalsIgnoreCase(BlobManager.BLOB_ELEM_TYPE_CAMERA)) {
                    bVar.c();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
                this.mCallback.error(d.a("", e.getMessage()));
                Log.e("Taopai", "Windvane  parse params error " + e.getMessage());
            }
            bVar.a(new IServiceCallBack.Stub() { // from class: com.taobao.interact.core.h5.WVInteractsdkCamera.4
                @Override // com.taobao.interact.publish.service.IServiceCallBack
                public void onResult(List<Image> list) throws RemoteException {
                    if (list == null || list.isEmpty()) {
                        WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).error(d.a("", "无有效结果"));
                        return;
                    }
                    try {
                        WVInteractsdkCamera.access$100(WVInteractsdkCamera.this, list);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        } catch (JSONException e2) {
            this.mCallback.error(d.a("", e2.getMessage()));
            e2.printStackTrace();
            Log.e("Taopai", "Windvane json error " + e2.getMessage());
        }
    }

    private Ratio stringParseRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ratio) ipChange.ipc$dispatch("1ab20080", new Object[]{this, str});
        }
        if ("1".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_FREE;
        }
        if ("2".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_3x4;
        }
        if ("3".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_4x3;
        }
        if ("4".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_9x16;
        }
        if ("5".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_16x9;
        }
        if ("6".equalsIgnoreCase(str)) {
            return Ratio.CROP_RATIO_1x1;
        }
        return Ratio.CROP_RATIO_1x1;
    }

    private void multiImageLogic(final List<Image> list) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56025254", new Object[]{this, list});
        } else {
            this.mExecutorService.execute(new Runnable() { // from class: com.taobao.interact.core.h5.WVInteractsdkCamera.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).b) {
                        WVInteractsdkCamera.access$300(WVInteractsdkCamera.this, list);
                    } else {
                        a();
                    }
                }

                private void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    try {
                        JSONArray jSONArray = new JSONArray();
                        JSONArray jSONArray2 = new JSONArray();
                        JSONArray jSONArray3 = new JSONArray();
                        JSONArray jSONArray4 = new JSONArray();
                        for (Image image : list) {
                            JSONObject jSONObject = new JSONObject();
                            String path = image.getPath();
                            jSONObject.putOpt(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, path);
                            c.a a2 = com.taobao.interact.publish.service.c.a(path);
                            jSONObject.putOpt("width", Integer.valueOf(a2.f17619a));
                            jSONObject.putOpt("height", Integer.valueOf(a2.b));
                            jSONArray2.put(path);
                            String str = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis();
                            String access$400 = WVInteractsdkCamera.access$400(WVInteractsdkCamera.this, path, str);
                            jSONObject.putOpt("url", str);
                            jSONObject.putOpt("wvcachepath", access$400);
                            jSONArray3.put(str);
                            jSONArray.put(jSONObject);
                        }
                        r rVar = new r();
                        rVar.b();
                        rVar.a("images", jSONArray);
                        WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).fireEvent(WVInteractsdkCamera.TAKEPHOTO_EVENT_NAME, rVar.d());
                        if (WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).f17595a) {
                            WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).r = jSONArray2;
                            WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).x = jSONArray3;
                            WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).y = jSONArray4;
                            WVInteractsdkUpload wVInteractsdkUpload = new WVInteractsdkUpload();
                            wVInteractsdkUpload.initialize(WVInteractsdkCamera.access$500(WVInteractsdkCamera.this), WVInteractsdkCamera.access$600(WVInteractsdkCamera.this));
                            try {
                                wVInteractsdkUpload.uploadFiles(WVInteractsdkCamera.access$200(WVInteractsdkCamera.this), WVInteractsdkCamera.access$000(WVInteractsdkCamera.this));
                            } catch (RemoteException e) {
                                e.printStackTrace();
                                WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).error(e.getMessage());
                            }
                        } else if (!WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).n && WVInteractsdkCamera.access$200(WVInteractsdkCamera.this).D == 0) {
                            r rVar2 = new r();
                            rVar2.b();
                            JSONObject optJSONObject = jSONArray.optJSONObject(0);
                            rVar2.a("url", optJSONObject.optString("url"));
                            rVar2.a("watermarks", optJSONObject.optJSONArray("watermarks"));
                            rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, optJSONObject.optString("wvcachepath"));
                            WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).success(rVar2);
                        } else {
                            WVInteractsdkCamera.access$000(WVInteractsdkCamera.this).success(rVar);
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            });
        }
    }

    private void packageDataToH5(List<Image> list) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27079d50", new Object[]{this, list});
            return;
        }
        r rVar = new r();
        rVar.b();
        JSONArray jSONArray = new JSONArray();
        for (Image image : list) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mediaType", image.getMediaType());
                jSONObject.put("resourceURL", image.getResourceUrl());
                jSONObject.put(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, image.getPath());
                jSONObject.put("coverURL", image.getCoverUrl());
                jSONObject.put("coverPath", image.getCoverPath());
                jSONObject.put("width", image.getWidth());
                jSONObject.put("height", image.getHeight());
                jSONObject.put("duration", image.getDuration());
                jSONObject.put("fileId", image.getFileId());
                String str = "success data = " + jSONArray.toString();
                if (TextUtils.isEmpty(image.getResourceUrl())) {
                    z = false;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jSONArray.put(jSONObject);
        }
        rVar.a("medias", jSONArray);
        if (this.mJSONParams.f17595a && !z) {
            try {
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                for (Image image2 : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    String path = image2.getPath();
                    jSONObject2.putOpt(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, path);
                    c.a a2 = com.taobao.interact.publish.service.c.a(path);
                    jSONObject2.putOpt("width", Integer.valueOf(a2.f17619a));
                    jSONObject2.putOpt("height", Integer.valueOf(a2.b));
                    jSONArray2.put(path);
                    String str2 = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + System.currentTimeMillis();
                    String writeFile2WVCache = writeFile2WVCache(path, str2);
                    jSONObject2.putOpt("url", str2);
                    jSONObject2.putOpt("wvcachepath", writeFile2WVCache);
                    jSONArray3.put(str2);
                }
                this.mJSONParams.r = jSONArray2;
                this.mJSONParams.x = jSONArray3;
                WVInteractsdkUpload wVInteractsdkUpload = new WVInteractsdkUpload();
                wVInteractsdkUpload.initialize(this.mContext, this.mWebView);
                try {
                    wVInteractsdkUpload.uploadFiles(this.mJSONParams, this.mCallback);
                    return;
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    this.mCallback.error(e2.getMessage());
                    return;
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
                return;
            }
        }
        this.mCallback.success(rVar);
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mBackReceiver);
            LocalBroadcastManager.getInstance(this.mContext).unregisterReceiver(this.mErrorReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String writeFile2WVCache(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2ed2f9", new Object[]{this, str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Bitmap a2 = h.a(str, 640);
        byte[] a3 = h.a(a2, Bitmap.CompressFormat.JPEG);
        if (a2 != null && !a2.isRecycled()) {
            a2.recycle();
        }
        if (a3 == null || a3.length == 0) {
            return "";
        }
        android.taobao.windvane.cache.c cVar = new android.taobao.windvane.cache.c();
        cVar.c = android.taobao.windvane.util.d.a(str2);
        cVar.d = "image/jpeg";
        cVar.f1551a = System.currentTimeMillis() + android.taobao.windvane.cache.d.DEFAULT_MAX_AGE;
        android.taobao.windvane.cache.a.a().a(cVar, a3);
        return android.taobao.windvane.cache.a.a().a(true) + File.separator + android.taobao.windvane.util.d.a(str2);
    }
}
