package com.alipay.mobile.security.zim.biz;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.biometrics.ui.widget.LoadingProgressDialog;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioDetectorBuilder;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.api.BioProgressCallback;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.impl.AsyncUploadService;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.workspace.Env;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.api.ZimProgressCallback;
import com.alipay.mobile.security.zim.gw.BaseGwService;
import com.alipay.mobile.security.zim.gw.GwListener;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ZimPlatform extends ZIMFacade implements BioProgressCallback, GwListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_RESULT = "result";
    public static final String KEY_RET_CODE = "retCode";
    public static final String KEY_SUB_CODE = "subCode";
    public static final String KEY_SUB_MSG = "subMsg";
    public static final String KYE_REMOTESERVER = "remoteServer";
    public static final String REASON_0 = "0";
    private static WeakReference<ZimPlatform> j;

    /* renamed from: a  reason: collision with root package name */
    private Context f5845a;
    private ZIMCallback b;
    private Map<String, String> d;
    private String e;
    private BaseGwService f;
    private BioDetector g;
    private LoadingProgressDialog h;
    private BioServiceManager i;
    private ZimMessageChannel l;
    public static final String RESULT_TRUE = Boolean.TRUE.toString();
    public static final String RESULT_FALSE = Boolean.FALSE.toString();
    private String c = "";
    private BioParameter k = new BioParameter();
    private boolean m = false;
    private long n = -1;

    public static /* synthetic */ Object ipc$super(ZimPlatform zimPlatform, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ LoadingProgressDialog a(ZimPlatform zimPlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoadingProgressDialog) ipChange.ipc$dispatch("a1c8f319", new Object[]{zimPlatform}) : zimPlatform.h;
    }

    public static /* synthetic */ Context b(ZimPlatform zimPlatform) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("dd733005", new Object[]{zimPlatform}) : zimPlatform.f5845a;
    }

    public ZimPlatform(Context context) {
        this.f5845a = context;
        try {
            Constructor<?> constructor = Class.forName(Env.getProtocolFormat(context) != 2 ? "com.alipay.mobile.security.zim.gw.JsonGwService" : "com.alipay.mobile.security.zim.gw.PbGwService").getConstructor(GwListener.class);
            constructor.setAccessible(true);
            this.f = (BaseGwService) constructor.newInstance(this);
        } catch (Throwable th) {
            BioLog.e(th);
            ZIMResponse zIMResponse = new ZIMResponse();
            zIMResponse.subCode = ZcodeConstants.ZCODE_PROGURD_ERROR;
            zIMResponse.msg = ZcodeConstants.getMessage(zIMResponse.subCode);
            zIMResponse.code = 1001;
            zIMResponse.extInfo.put(ZIMFacade.KEY_BIO_ACTION, String.valueOf(206));
            a(zIMResponse);
        }
    }

    private void a(Context context, String str, ZimMessageChannel zimMessageChannel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a879020", new Object[]{this, context, str, zimMessageChannel});
            return;
        }
        if (!this.m) {
            a();
        }
        this.g = BioDetectorBuilder.create(context, new MicroModule(str));
        this.i = BioServiceManager.getCurrentInstance();
        AsyncUploadService.getInstance(this.f5845a);
        ApSecurityService apSecurityService = (ApSecurityService) this.i.getBioService(ApSecurityService.class);
        if (apSecurityService == null) {
            BioLog.i("BioTransfer.buildBioParameter(): null == ApSecurityService");
        } else {
            BioLog.i("BioTransfer.buildBioParameter(): ApSecurityService.init()");
            apSecurityService.init(this.f5845a);
        }
        this.l = zimMessageChannel;
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public ZimInitGwResponse parse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZimInitGwResponse) ipChange.ipc$dispatch("30030e95", new Object[]{this, str});
        }
        ZimInitGwResponse zimInitGwResponse = null;
        if (!StringUtils.isEmpty(str)) {
            zimInitGwResponse = this.f.convert(str);
        }
        BioLog.d("parse(): response=" + zimInitGwResponse);
        return zimInitGwResponse;
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void verify(String str, Map<String, String> map, ZIMCallback zIMCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79e71b26", new Object[]{this, str, map, zIMCallback});
        } else {
            verify(str, map, (ZimMessageChannel) null, zIMCallback);
        }
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void verify(String str, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1265d31a", new Object[]{this, str, map, zimMessageChannel, zIMCallback});
            return;
        }
        ZimInitGwResponse zimInitGwResponse = null;
        if (map != null) {
            if (map.containsKey(ZIMFacade.KEY_INIT_RESP)) {
                zimInitGwResponse = parse(map.remove(ZIMFacade.KEY_INIT_RESP));
            }
            if (zimInitGwResponse == null) {
                if (map.containsKey(ZIMFacade.KEY_INIT_RESP_OLD)) {
                    zimInitGwResponse = parse(map.remove(ZIMFacade.KEY_INIT_RESP_OLD));
                }
            } else {
                map.remove(ZIMFacade.KEY_INIT_RESP_OLD);
            }
        }
        verify(str, zimInitGwResponse, map, zimMessageChannel, zIMCallback);
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void verify(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZIMCallback zIMCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e99c279", new Object[]{this, str, zimInitGwResponse, map, zIMCallback});
        } else {
            verify(str, zimInitGwResponse, map, null, zIMCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void verify(java.lang.String r8, com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse r9, java.util.Map<java.lang.String, java.lang.String> r10, com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel r11, com.alipay.mobile.security.zim.api.ZIMCallback r12) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.zim.biz.ZimPlatform.verify(java.lang.String, com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse, java.util.Map, com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel, com.alipay.mobile.security.zim.api.ZIMCallback):void");
    }

    private RecordProcessor a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecordProcessor) ipChange.ipc$dispatch("4aa80338", new Object[]{this, str});
        }
        RecordProcessor recordProcessor = RecordProcessor.getInstance();
        if (recordProcessor == null) {
            recordProcessor = RecordProcessor.createInstance(this.f5845a);
        }
        recordProcessor.zimInit(str);
        return recordProcessor;
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void init(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZIMCallback zIMCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5954fd90", new Object[]{this, str, zimInitGwResponse, map, zIMCallback});
        } else {
            init(str, zimInitGwResponse, map, null, zIMCallback);
        }
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void init(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7d68f0", new Object[]{this, str, zimInitGwResponse, map, zimMessageChannel, zIMCallback});
            return;
        }
        this.m = true;
        verify(str, zimInitGwResponse, map, zimMessageChannel, zIMCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Override // com.alipay.mobile.security.bio.api.BioCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResult(com.alipay.mobile.security.bio.api.BioResponse r10) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.zim.biz.ZimPlatform.onResult(com.alipay.mobile.security.bio.api.BioResponse):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:15|(1:19)|20|(1:24)|25|(2:29|(17:31|32|(2:34|(1:36)(2:82|(1:84)(1:85)))(2:86|(1:88)(1:89))|37|(1:41)|42|(1:46)|47|48|49|(1:51)|52|(6:56|(1:58)|59|(1:61)|62|(1:64))|65|(1:67)(1:79)|68|69))|90|32|(0)(0)|37|(2:39|41)|42|(2:44|46)|47|48|49|(0)|52|(7:54|56|(0)|59|(0)|62|(0))|65|(0)(0)|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02ed, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02ee, code lost:
        com.alipay.mobile.security.bio.utils.BioLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0246 A[Catch: Throwable -> 0x02ed, TryCatch #0 {Throwable -> 0x02ed, blocks: (B:58:0x023d, B:60:0x0246, B:61:0x024e, B:63:0x0252, B:65:0x025a, B:67:0x0262, B:68:0x026b, B:70:0x0273, B:71:0x027c, B:73:0x0284, B:74:0x028f, B:76:0x0297, B:78:0x02a4, B:77:0x029e), top: B:96:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0262 A[Catch: Throwable -> 0x02ed, TryCatch #0 {Throwable -> 0x02ed, blocks: (B:58:0x023d, B:60:0x0246, B:61:0x024e, B:63:0x0252, B:65:0x025a, B:67:0x0262, B:68:0x026b, B:70:0x0273, B:71:0x027c, B:73:0x0284, B:74:0x028f, B:76:0x0297, B:78:0x02a4, B:77:0x029e), top: B:96:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0273 A[Catch: Throwable -> 0x02ed, TryCatch #0 {Throwable -> 0x02ed, blocks: (B:58:0x023d, B:60:0x0246, B:61:0x024e, B:63:0x0252, B:65:0x025a, B:67:0x0262, B:68:0x026b, B:70:0x0273, B:71:0x027c, B:73:0x0284, B:74:0x028f, B:76:0x0297, B:78:0x02a4, B:77:0x029e), top: B:96:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0284 A[Catch: Throwable -> 0x02ed, TryCatch #0 {Throwable -> 0x02ed, blocks: (B:58:0x023d, B:60:0x0246, B:61:0x024e, B:63:0x0252, B:65:0x025a, B:67:0x0262, B:68:0x026b, B:70:0x0273, B:71:0x027c, B:73:0x0284, B:74:0x028f, B:76:0x0297, B:78:0x02a4, B:77:0x029e), top: B:96:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0297 A[Catch: Throwable -> 0x02ed, TryCatch #0 {Throwable -> 0x02ed, blocks: (B:58:0x023d, B:60:0x0246, B:61:0x024e, B:63:0x0252, B:65:0x025a, B:67:0x0262, B:68:0x026b, B:70:0x0273, B:71:0x027c, B:73:0x0284, B:74:0x028f, B:76:0x0297, B:78:0x02a4, B:77:0x029e), top: B:96:0x023d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029e A[Catch: Throwable -> 0x02ed, TryCatch #0 {Throwable -> 0x02ed, blocks: (B:58:0x023d, B:60:0x0246, B:61:0x024e, B:63:0x0252, B:65:0x025a, B:67:0x0262, B:68:0x026b, B:70:0x0273, B:71:0x027c, B:73:0x0284, B:74:0x028f, B:76:0x0297, B:78:0x02a4, B:77:0x029e), top: B:96:0x023d }] */
    @Override // com.alipay.mobile.security.zim.gw.GwListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInit(com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse r15) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.zim.biz.ZimPlatform.onInit(com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse):void");
    }

    private void a(BioParameter bioParameter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53560323", new Object[]{this, bioParameter});
            return;
        }
        try {
            if (!this.m) {
                BioLog.d(ZIMFacade.TAG, "ZimPlatform.auth()");
                this.g.auth(bioParameter, this);
                return;
            }
            String init = this.g.init(bioParameter, this);
            ZIMResponse zIMResponse = new ZIMResponse();
            if (!StringUtils.isEmpty(init)) {
                zIMResponse.code = 100;
                zIMResponse.singleTag = init;
            } else {
                zIMResponse.code = 200;
            }
            this.b.response(zIMResponse);
            BioLog.d(ZIMFacade.TAG, "ZimPlatform.init():tag is" + init);
        } catch (Throwable th) {
            BioLog.e(th);
            ZIMResponse zIMResponse2 = new ZIMResponse();
            zIMResponse2.code = 1001;
            zIMResponse2.reason = "" + th;
            zIMResponse2.extInfo.put(ZIMFacade.KEY_BIO_ACTION, String.valueOf(206));
            zIMResponse2.subCode = ZcodeConstants.ZCODE_AUTH_BIO_ERROR;
            zIMResponse2.msg = ZcodeConstants.getMessage(zIMResponse2.subCode);
            b(zIMResponse2);
            a(zIMResponse2);
        }
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void retry(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b86f39", new Object[]{this, str});
            return;
        }
        BioLog.i(ZIMFacade.TAG, "ZIMFacade.retry(): " + str);
        command(4099);
        ((ZimRecordService) this.i.getBioService(ZimRecordService.class)).retry();
        this.k.addExtProperty(BioDetector.EXT_KEY_RETRY_UI_TYPE, str);
        a(this.k);
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
            return;
        }
        BioLog.i(ZIMFacade.TAG, "ZIMFacade.retry()");
        command(4099);
        ((ZimRecordService) this.i.getBioService(ZimRecordService.class)).retry();
        a(this.k);
    }

    @Override // com.alipay.mobile.security.bio.api.BioProgressCallback
    public boolean onFaceDetected(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4cbe4", new Object[]{this, map})).booleanValue();
        }
        if (this.b instanceof ZimProgressCallback) {
            if (!StringUtils.isEmpty(this.e)) {
                map.put(ZIMFacade.KEY_FACE_PAY_INFO, this.e);
            }
            ((ZimProgressCallback) this.b).onFaceDetected(map);
        }
        return true;
    }

    private boolean a(ZIMResponse zIMResponse) {
        MonitorLogService monitorLogService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("243e481b", new Object[]{this, zIMResponse})).booleanValue();
        }
        BioLog.w(new RuntimeException("doCallZimCallback(): zimResponse=" + zIMResponse + ", mZIMCallback=" + this.b));
        boolean response = this.b.response(zIMResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("doCallZimCallback(): bRet=");
        sb.append(response);
        BioLog.w(sb.toString());
        RecordProcessor recordProcessor = RecordProcessor.getInstance();
        if (recordProcessor != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("subCode", zIMResponse.subCode);
            if (this.n > 0) {
                hashMap.put("elapsedTime", "" + (System.currentTimeMillis() - this.n));
            }
            recordProcessor.record(RecordProcessor.h, hashMap);
        }
        BioServiceManager bioServiceManager = this.i;
        if (bioServiceManager != null && (monitorLogService = (MonitorLogService) bioServiceManager.getBioService(MonitorLogService.class)) != null) {
            monitorLogService.trigUpload();
        }
        if (response) {
            destroy();
        }
        return response;
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        BioLog.e(ZIMFacade.TAG, "ZimPlatform.destroy()");
        WeakReference<ZimPlatform> weakReference = j;
        if (weakReference != null && weakReference.get() == this) {
            j = null;
            RecordProcessor recordProcessor = RecordProcessor.getInstance();
            if (recordProcessor != null) {
                if (recordProcessor.destroyable()) {
                    recordProcessor.destroy();
                } else {
                    recordProcessor.a();
                }
            }
        }
        BioDetector bioDetector = this.g;
        if (bioDetector != null) {
            bioDetector.destroy();
        }
        BaseGwService baseGwService = this.f;
        if (baseGwService != null) {
            baseGwService.destroy();
        }
        this.f5845a = null;
        this.i = null;
        this.l = null;
    }

    private void b(ZIMResponse zIMResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b178f998", new Object[]{this, zIMResponse});
            return;
        }
        HashMap hashMap = new HashMap(2);
        if (zIMResponse != null) {
            int i = zIMResponse.code;
            if (i == 100 || i == 1000) {
                hashMap.put("result", RESULT_TRUE);
            } else {
                hashMap.put("result", RESULT_FALSE);
            }
            hashMap.put("message", "" + zIMResponse.reason);
            hashMap.put("retCode", "" + zIMResponse.code);
            hashMap.put("subCode", zIMResponse.subCode);
            hashMap.put(KEY_SUB_MSG, zIMResponse.msg);
        } else {
            hashMap.put("result", RESULT_FALSE);
            hashMap.put("message", "0");
            hashMap.put("retCode", "0");
            hashMap.put("subCode", "");
            hashMap.put(KEY_SUB_MSG, "");
        }
        RecordProcessor.getInstance().record(RecordProcessor.g, hashMap);
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMFacade
    public void command(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c476f1", new Object[]{this, new Integer(i)});
            return;
        }
        BioDetector bioDetector = this.g;
        if (bioDetector == null) {
            return;
        }
        bioDetector.command(i);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        Context context = this.f5845a;
        if (context == null || !(context instanceof Activity) || ((Activity) context).isFinishing()) {
            return;
        }
        this.h = new LoadingProgressDialog(this.f5845a);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        LoadingProgressDialog loadingProgressDialog = this.h;
        if (loadingProgressDialog == null || loadingProgressDialog.isShowing()) {
            return;
        }
        ((Activity) this.f5845a).runOnUiThread(new Runnable() { // from class: com.alipay.mobile.security.zim.biz.ZimPlatform.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ZimPlatform.b(ZimPlatform.this) == null || ((Activity) ZimPlatform.b(ZimPlatform.this)).isFinishing()) {
                } else {
                    ZimPlatform.a(ZimPlatform.this).show();
                }
            }
        });
    }
}
