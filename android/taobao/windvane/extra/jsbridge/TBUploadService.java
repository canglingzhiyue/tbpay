package android.taobao.windvane.extra.jsbridge;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.file.b;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.api.WVCamera;
import android.taobao.windvane.jsbridge.api.d;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.monitor.a;
import android.taobao.windvane.thread.WVThreadPool;
import android.taobao.windvane.util.MimeTypeEnum;
import android.taobao.windvane.util.h;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.e;
import com.uploader.export.i;
import com.uploader.export.j;
import com.uploader.export.l;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mtopsdk.mtop.upload.FileUploadBaseListener;
import mtopsdk.mtop.upload.FileUploadMgr;
import mtopsdk.mtop.upload.domain.UploadFileInfo;
import org.json.JSONArray;
import tb.ado;
import tb.kge;

/* loaded from: classes2.dex */
public class TBUploadService extends d implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LAST_PIC = "\"isLastPic\":\"true\"";
    private static final String MUTI_SELECTION = "\"mutipleSelection\":\"1\"";
    private static final int NOTIFY_ERROR = 2003;
    private static final int NOTIFY_FINISH = 2002;
    private static final int NOTIFY_START = 2001;
    private static final String TAG = "TBUploadService";
    private int currentCount = 0;
    private WVCallBackContext mCallback;
    private Handler mHandler;
    private JSONArray multiPictureResult;

    static {
        kge.a(-1247744628);
        kge.a(-1043440182);
    }

    public static /* synthetic */ Object ipc$super(TBUploadService tBUploadService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(TBUploadService tBUploadService, WVCamera.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb10c78", new Object[]{tBUploadService, aVar});
        } else {
            tBUploadService.doMtopUpload(aVar);
        }
    }

    public static /* synthetic */ Handler access$100(TBUploadService tBUploadService) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("39b52b8b", new Object[]{tBUploadService}) : tBUploadService.mHandler;
    }

    public TBUploadService() {
        this.mHandler = null;
        this.mHandler = new Handler(Looper.getMainLooper(), this);
    }

    @Override // android.taobao.windvane.jsbridge.api.d
    public void doUpload(final WVCamera.a aVar, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2197057c", new Object[]{this, aVar, wVCallBackContext});
        } else if (aVar == null) {
            m.b(TAG, "UploadParams is null.");
            wVCallBackContext.error(new r());
        } else {
            this.mCallback = wVCallBackContext;
            try {
                String url = wVCallBackContext.getWebview().getUrl();
                a.commitOffMonitor(url, "TBUploadService bizCode:" + aVar.e, aVar.d);
            } catch (Throwable unused) {
            }
            if ("2.0".equals(aVar.d)) {
                if (android.taobao.windvane.d.f1580a != null) {
                    android.taobao.windvane.d.f1580a.getLoginInfo(null);
                }
                WVThreadPool.getInstance().execute(new Runnable() { // from class: android.taobao.windvane.extra.jsbridge.TBUploadService.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TBUploadService.access$000(TBUploadService.this, aVar);
                        }
                    }
                });
                return;
            }
            r rVar = new r();
            rVar.a("msg", "1.0 will not supported, please use 2.0");
            wVCallBackContext.error(rVar);
        }
    }

    private void doMtopUpload(final WVCamera.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ce94a57", new Object[]{this, aVar});
            return;
        }
        try {
            final File createTempFile = File.createTempFile("windvane", "." + MimeTypeEnum.JPG.getSuffix(), android.taobao.windvane.cache.a.a().b(true));
            aVar.r = createTempFile.getAbsolutePath();
            if (!b.a(new File(aVar.f1637a), createTempFile)) {
                r rVar = new r();
                rVar.a("errorInfo", "Failed to copy file!");
                this.mCallback.error(rVar);
                return;
            }
            final r rVar2 = new r();
            try {
                l.a().uploadAsync(new i() { // from class: android.taobao.windvane.extra.jsbridge.TBUploadService.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.uploader.export.i
                    public String getFileType() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("105a7e2d", new Object[]{this}) : ".jpg";
                    }

                    @Override // com.uploader.export.i
                    public String getBizType() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9c07dca2", new Object[]{this}) : aVar.e;
                    }

                    @Override // com.uploader.export.i
                    public String getFilePath() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("1bcb7a22", new Object[]{this}) : createTempFile.getAbsolutePath();
                    }

                    @Override // com.uploader.export.i
                    public Map<String, String> getMetaInfo() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (Map) ipChange2.ipc$dispatch("8d01c005", new Object[]{this});
                        }
                        if (aVar.g == null) {
                            return null;
                        }
                        HashMap hashMap = new HashMap();
                        Iterator<String> keys = aVar.g.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, aVar.g.optString(next));
                        }
                        return hashMap;
                    }
                }, new com.uploader.export.d() { // from class: android.taobao.windvane.extra.jsbridge.TBUploadService.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.uploader.export.d
                    public void onCancel(i iVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("227e67e0", new Object[]{this, iVar});
                        }
                    }

                    @Override // com.uploader.export.d
                    public void onPause(i iVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("88a48f02", new Object[]{this, iVar});
                        }
                    }

                    @Override // com.uploader.export.d
                    public void onResume(i iVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cc5b564d", new Object[]{this, iVar});
                        }
                    }

                    @Override // com.uploader.export.d
                    public void onStart(i iVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("93ee4d16", new Object[]{this, iVar});
                        }
                    }

                    @Override // com.uploader.export.d
                    public void onWait(i iVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("1be90445", new Object[]{this, iVar});
                        }
                    }

                    @Override // com.uploader.export.d
                    public void onSuccess(i iVar, e eVar) {
                        Bitmap a2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e0ea4aef", new Object[]{this, iVar, eVar});
                            return;
                        }
                        m.c(TBUploadService.TAG, "upload success");
                        rVar2.b();
                        rVar2.a("url", aVar.b);
                        rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, aVar.f1637a);
                        String b = eVar.b();
                        rVar2.a("resourceURL", b);
                        rVar2.a("isLastPic", String.valueOf(aVar.l));
                        rVar2.a("mutipleSelection", aVar.j);
                        rVar2.a("tempFilePath", aVar.r);
                        rVar2.a("selectSize", Integer.valueOf(aVar.s));
                        rVar2.a("identifier", aVar.h);
                        if (aVar.p && (a2 = h.a(aVar.f1637a, 1024)) != null) {
                            rVar2.a("base64Data", ado.b(a2));
                        }
                        int lastIndexOf = b.lastIndexOf("/") + 1;
                        if (lastIndexOf != 0) {
                            rVar2.a(com.etao.feimagesearch.util.h.KEY_TFS_KEY, b.substring(lastIndexOf));
                        }
                        if (aVar.l) {
                            rVar2.a("images", aVar.o);
                        }
                        Message.obtain(TBUploadService.access$100(TBUploadService.this), 2002, rVar2).sendToTarget();
                    }

                    @Override // com.uploader.export.d
                    public void onFailure(i iVar, j jVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("b751f291", new Object[]{this, iVar, jVar});
                            return;
                        }
                        m.c(TBUploadService.TAG, "upload failed");
                        rVar2.a("subCode", jVar.b);
                        rVar2.a("errorCode", jVar.f24058a);
                        rVar2.a("errorMsg", jVar.c);
                        rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, aVar.f1637a);
                        rVar2.a("tempFilePath", aVar.r);
                        rVar2.a("selectSize", Integer.valueOf(aVar.s));
                        rVar2.a("identifier", aVar.h);
                        Message.obtain(TBUploadService.access$100(TBUploadService.this), 2003, rVar2).sendToTarget();
                    }

                    @Override // com.uploader.export.d
                    public void onProgress(i iVar, int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("43b04c96", new Object[]{this, iVar, new Integer(i)});
                            return;
                        }
                        String valueOf = String.valueOf(i);
                        m.e(TBUploadService.TAG, "uploadFile onProgress " + valueOf);
                    }
                }, this.mHandler);
                m.c(TAG, "do aus upload " + aVar.f1637a);
            } catch (Throwable th) {
                m.d(TAG, "try aus upload error : " + th.getMessage());
                try {
                    UploadFileInfo uploadFileInfo = new UploadFileInfo();
                    uploadFileInfo.setFilePath(createTempFile.getAbsolutePath());
                    uploadFileInfo.setBizCode(aVar.e);
                    uploadFileInfo.setPrivateData(aVar.f);
                    rVar2.a("identifier", aVar.h);
                    rVar2.a("isLastPic", String.valueOf(aVar.l));
                    rVar2.a("mutipleSelection", aVar.j);
                    FileUploadMgr.getInstance().addTask(uploadFileInfo, new FileUploadBaseListener() { // from class: android.taobao.windvane.extra.jsbridge.TBUploadService.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
                        public void onProgress(int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                            }
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
                        public void onStart() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7f2d84ca", new Object[]{this});
                                return;
                            }
                            rVar2.a("");
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2001, rVar2).sendToTarget();
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadListener
                        public void onError(String str, String str2) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
                                return;
                            }
                            if (m.a()) {
                                m.d(TBUploadService.TAG, "mtop upload file error. code: " + str + ";msg: " + str2);
                            }
                            rVar2.a("errorCode", str);
                            rVar2.a("errorMsg", str2);
                            rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, aVar.f1637a);
                            rVar2.a("tempFilePath", aVar.r);
                            rVar2.a("selectSize", Integer.valueOf(aVar.s));
                            rVar2.a("identifier", aVar.h);
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2003, rVar2).sendToTarget();
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadBaseListener, mtopsdk.mtop.upload.FileUploadListener
                        public void onFinish(UploadFileInfo uploadFileInfo2, String str) {
                            Bitmap a2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("57d514e0", new Object[]{this, uploadFileInfo2, str});
                                return;
                            }
                            rVar2.b();
                            rVar2.a("url", aVar.b);
                            rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, aVar.f1637a);
                            rVar2.a("resourceURL", str);
                            rVar2.a("tempFilePath", aVar.r);
                            rVar2.a("selectSize", Integer.valueOf(aVar.s));
                            rVar2.a("identifier", aVar.h);
                            if (aVar.p && (a2 = h.a(aVar.f1637a, 1024)) != null) {
                                rVar2.a("base64Data", ado.b(a2));
                            }
                            int lastIndexOf = str.lastIndexOf("/") + 1;
                            if (lastIndexOf != 0) {
                                rVar2.a(com.etao.feimagesearch.util.h.KEY_TFS_KEY, str.substring(lastIndexOf));
                            }
                            if (aVar.l) {
                                rVar2.a("images", aVar.o);
                            }
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2002, rVar2).sendToTarget();
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadListener
                        public void onFinish(String str) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("99807463", new Object[]{this, str});
                                return;
                            }
                            rVar2.b();
                            rVar2.a("url", aVar.b);
                            rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, aVar.f1637a);
                            rVar2.a("resourceURL", str);
                            int lastIndexOf = str.lastIndexOf("/") + 1;
                            if (lastIndexOf != 0) {
                                rVar2.a(com.etao.feimagesearch.util.h.KEY_TFS_KEY, str.substring(lastIndexOf));
                            }
                            if (aVar.l) {
                                rVar2.a("images", aVar.o);
                            }
                            rVar2.a("tempFilePath", aVar.r);
                            rVar2.a("selectSize", Integer.valueOf(aVar.s));
                            rVar2.a("identifier", aVar.h);
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2002, rVar2).sendToTarget();
                        }

                        @Override // mtopsdk.mtop.upload.FileUploadBaseListener
                        public void onError(String str, String str2, String str3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
                                return;
                            }
                            if (m.a()) {
                                m.d(TBUploadService.TAG, "mtop upload file error. code: " + str2 + ";msg: " + str3 + ";type: " + str);
                            }
                            rVar2.a("errorType", str);
                            rVar2.a("errorCode", str2);
                            rVar2.a("errorMsg", str3);
                            rVar2.a(com.taobao.tao.flexbox.layoutmanager.container.a.CONFIG_LOCAL_PATH, aVar.f1637a);
                            rVar2.a("tempFilePath", aVar.r);
                            rVar2.a("selectSize", Integer.valueOf(aVar.s));
                            rVar2.a("identifier", aVar.h);
                            Message.obtain(TBUploadService.access$100(TBUploadService.this), 2003, rVar2).sendToTarget();
                        }
                    }, aVar.n);
                    m.c(TAG, "do mtop upload " + aVar.f1637a);
                } catch (Throwable th2) {
                    m.e(TAG, "mtop sdk not exist." + th2.getMessage());
                }
            }
        } catch (IOException e) {
            m.e(TAG, android.taobao.windvane.util.a.a(e));
        }
    }

    @Override // android.taobao.windvane.jsbridge.api.d
    public void resetMultiPictureResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c33741b8", new Object[]{this});
            return;
        }
        this.multiPictureResult = null;
        this.currentCount = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0162 A[Catch: JSONException -> 0x0166, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0166, blocks: (B:73:0x0151, B:75:0x0162), top: B:104:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0182  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleMessage(android.os.Message r26) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.jsbridge.TBUploadService.handleMessage(android.os.Message):boolean");
    }
}
