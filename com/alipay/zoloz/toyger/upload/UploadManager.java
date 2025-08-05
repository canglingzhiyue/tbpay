package com.alipay.zoloz.toyger.upload;

import android.content.Context;
import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavCommon;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavLog;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavToken;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisClientInfo;
import com.alipay.mobile.security.bio.config.bean.Coll;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioTaskService;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.service.local.upload.MultiMediaUploadCallback;
import com.alipay.mobile.security.bio.service.local.upload.MultiMediaUploadService;
import com.alipay.mobile.security.bio.task.SubTask;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.faceauth.InvokeType;
import com.alipay.mobile.security.faceauth.UserVerifyInfo;
import com.alipay.zoloz.toyger.ToygerBaseService;
import com.alipay.zoloz.toyger.bean.ToygerFrame;
import com.alipay.zoloz.toyger.extservice.record.TimeRecord;
import com.alipay.zoloz.toyger.extservice.record.ToygerRecordService;
import com.alipay.zoloz.toyger.face.ToygerFaceService;
import com.alipay.zoloz.toyger.interfaces.ToygerCallback;
import com.alipay.zoloz.toyger.upload.NineShootManager;
import com.alipay.zoloz.toyger.util.EnvCheck;
import com.alipay.zoloz.toyger.workspace.FaceRemoteConfig;
import com.alipay.zoloz.toyger.workspace.ToygerWorkspace;
import com.alipay.zoloz.toyger.workspace.task.ToygerBaseTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class UploadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UploadManager";

    /* renamed from: a  reason: collision with root package name */
    public ToygerWorkspace f6298a;
    private UploadChannel b;
    private Context c;
    private ToygerCallback d;
    private BioServiceManager e;
    private BioAppDescription f;
    private BioTaskService g;
    private ToygerRecordService h;
    private MultiMediaUploadService i;
    private NineShootManager j;
    private String k;
    private ToygerFaceService l;
    private Map<String, Object> m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private UploadContent s;

    public static /* synthetic */ ToygerRecordService a(UploadManager uploadManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ToygerRecordService) ipChange.ipc$dispatch("7d88dfdf", new Object[]{uploadManager}) : uploadManager.h;
    }

    public static /* synthetic */ BioAppDescription b(UploadManager uploadManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioAppDescription) ipChange.ipc$dispatch("e7bb9077", new Object[]{uploadManager}) : uploadManager.f;
    }

    public UploadManager(ToygerWorkspace toygerWorkspace, BioServiceManager bioServiceManager, ToygerCallback toygerCallback) {
        this.o = true;
        this.p = false;
        this.q = true;
        this.r = true;
        this.f6298a = toygerWorkspace;
        this.l = this.f6298a.getToygerFaceService();
        this.e = bioServiceManager;
        this.g = (BioTaskService) this.e.getBioService(BioTaskService.class);
        this.h = (ToygerRecordService) this.e.getBioService(ToygerRecordService.class);
        this.i = (MultiMediaUploadService) this.e.getBioService(MultiMediaUploadService.class);
        this.c = bioServiceManager.getBioApplicationContext();
        this.f = toygerCallback.getAppDescription();
        this.d = toygerCallback;
        this.k = getPublicKey(this.c, this.d.getRemoteConfig());
        Coll coll = this.d.getRemoteConfig().getColl();
        if (coll != null) {
            this.o = coll.isAsyncUp();
            this.p = coll.getUploadAsynData();
            this.q = coll.getUploadAsynFailData();
            this.r = coll.isEncUp();
        }
        BioLog.d("UploadManager...async:" + this.o + " enc:" + this.r);
        Map<String, String> extProperty = this.d.getAppDescription().getExtProperty();
        if (((extProperty == null || !extProperty.containsKey("meta_serializer")) ? 1 : Integer.parseInt(extProperty.get("meta_serializer"))) == 2) {
            throw new IllegalArgumentException("pb channel is not available for taobao");
        }
        this.n = 1;
        try {
            Constructor<?> constructor = Class.forName("com.alipay.zoloz.toyger.upload.UploadChannelByJson").getConstructor(BioServiceManager.class);
            constructor.setAccessible(true);
            this.b = (UploadChannel) constructor.newInstance(bioServiceManager);
        } catch (Throwable th) {
            BioLog.e(th);
        }
        this.j = new NineShootManager(this.l, toygerCallback.getRemoteConfig());
    }

    public void uploadFaceInfo(ToygerFrame toygerFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77468a15", new Object[]{this, toygerFrame});
            return;
        }
        BioLog.i("IFAATAG uploadFaceInfo");
        if (this.b != null) {
            UploadContent uploadContent = toygerFrame.uploadContent;
            BisBehavLog a2 = a(this.d.getUserVerifyInfo(), InvokeType.NORMAL);
            String bistoken = this.d.getAppDescription().getBistoken();
            TimeRecord.getInstance().setUploadStartTime(System.currentTimeMillis());
            this.b.uploadFaceInfo(uploadContent, a2, bistoken, this.r ? this.k : "");
        }
        uploadAsyncBlob(true);
        uploadIFAAContent();
        uploadNineShoot(InvokeType.MONITOR, true);
    }

    public void uploadNineShoot(InvokeType invokeType, boolean z) {
        NineShootManager nineShootManager;
        UploadContent uploadContent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769f5695", new Object[]{this, invokeType, new Boolean(z)});
        } else if (this.b == null || !this.o || (nineShootManager = this.j) == null) {
        } else {
            if (nineShootManager.isNeedUpload()) {
                uploadContent = a(z);
            } else {
                uploadContent = new UploadContent(null, null, false);
            }
            this.b.uploadNineShoot(uploadContent, a(this.d.getUserVerifyInfo(), invokeType), this.f.getBistoken(), this.r ? this.k : "");
            if (!this.j.needUploadYuv()) {
                return;
            }
            NineShootManager.CameraRawData finalRawFrame = this.j.getFinalRawFrame();
            if (!EnvCheck.isWifiNetwork(this.c) || finalRawFrame == null || finalRawFrame.data == null || finalRawFrame.data.length > 1048576) {
                return;
            }
            final int i = finalRawFrame.width;
            final int i2 = finalRawFrame.height;
            final int i3 = finalRawFrame.rotation;
            this.i.uploadAsync(finalRawFrame.data, new MultiMediaUploadCallback() { // from class: com.alipay.zoloz.toyger.upload.UploadManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.security.bio.service.local.upload.MultiMediaUploadCallback
                public void onUploadProgress(String str, int i4, long j, long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a38f5425", new Object[]{this, str, new Integer(i4), new Long(j), new Long(j2)});
                    }
                }

                @Override // com.alipay.mobile.security.bio.service.local.upload.MultiMediaUploadCallback
                public void onUploadStart(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3f73b493", new Object[]{this, str});
                        return;
                    }
                    BioLog.d("Upload Yuv original frame start, taskId = " + str);
                }

                @Override // com.alipay.mobile.security.bio.service.local.upload.MultiMediaUploadCallback
                public void onUploadFinished(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7f3516d", new Object[]{this, str, str2});
                        return;
                    }
                    BioLog.d("Upload Yuv original frame finish, taskId = " + str + ", cloudId = " + str2);
                    if (UploadManager.a(UploadManager.this) == null || UploadManager.b(UploadManager.this) == null) {
                        return;
                    }
                    String str3 = UploadManager.b(UploadManager.this).getExtProperty().get("verifyid") != null ? UploadManager.b(UploadManager.this).getExtProperty().get("verifyid") : "";
                    HashMap hashMap = new HashMap();
                    hashMap.put("zimId", str3);
                    hashMap.put("fileId", str2);
                    hashMap.put("width", i + "");
                    hashMap.put("height", i2 + "");
                    hashMap.put("rotation", i3 + "");
                    UploadManager.a(UploadManager.this).write(ToygerRecordService.RAW_CAMERA_FRAME, hashMap);
                }

                @Override // com.alipay.mobile.security.bio.service.local.upload.MultiMediaUploadCallback
                public void onUploadError(String str, int i4, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c95cebb4", new Object[]{this, str, new Integer(i4), str2});
                        return;
                    }
                    BioLog.d("Upload Yuv original frame error, taskId = " + str + ", returnCode = " + i4 + ", errMsg = " + str2);
                }
            });
        }
    }

    public void uploadAsyncBlob(boolean z) {
        UploadContent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8acbb6f5", new Object[]{this, new Boolean(z)});
        } else if (this.b == null || !this.o) {
        } else {
            if (((!z || !this.p) && (z || !this.q)) || (a2 = a()) == null) {
                return;
            }
            this.b.uploadNineShoot(a2, a(this.d.getUserVerifyInfo(), InvokeType.ASYNC_UPLOAD), this.f.getBistoken(), this.r ? this.k : "");
        }
    }

    public void uploadIFAAContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eb9e22", new Object[]{this});
            return;
        }
        BioLog.i("IFAATAG upload ifaa content");
        if (this.b == null || this.s == null || !this.o) {
            return;
        }
        BisBehavLog a2 = a(this.d.getUserVerifyInfo(), InvokeType.ASYNC_UPLOAD);
        String bistoken = this.f.getBistoken();
        BioLog.i("IFAATAG upload ifaa content handle");
        this.b.uploadNineShoot(this.s, a2, bistoken, this.r ? this.k : "");
    }

    public void setIFAAContent(byte[] bArr, byte[] bArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f3f3c5", new Object[]{this, bArr, bArr2, new Boolean(z)});
            return;
        }
        BioLog.i("IFAATAG set ifaa content");
        this.s = new UploadContent(bArr, bArr2, z);
    }

    public void setBlob(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ce0e9f", new Object[]{this, map});
            return;
        }
        BioLog.i("set blob:" + map);
        this.m = map;
    }

    public void uploadBehaviourLog(InvokeType invokeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2073327b", new Object[]{this, invokeType});
        } else if (this.b == null || !this.o) {
        } else {
            this.b.uploadBehaviourLog(a(this.d.getUserVerifyInfo(), invokeType), this.f.getBistoken(), this.r ? this.k : "");
        }
    }

    public static String getPublicKey(Context context, FaceRemoteConfig faceRemoteConfig) {
        byte[] assetsData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cd3e304", new Object[]{context, faceRemoteConfig});
        }
        try {
            BioLog.i("PublicKey:" + faceRemoteConfig.getEnv());
            if (faceRemoteConfig.getEnv() == 0) {
                assetsData = FileUtil.getAssetsData(context, "bid-log-key-public.key");
            } else {
                assetsData = FileUtil.getAssetsData(context, "bid-log-key-public_t.key");
            }
            return new String(assetsData);
        } catch (IllegalArgumentException e) {
            BioLog.e(e.toString());
            return "";
        } catch (IllegalStateException e2) {
            BioLog.e(e2.toString());
            return "";
        }
    }

    private BisBehavLog a(UserVerifyInfo userVerifyInfo, InvokeType invokeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BisBehavLog) ipChange.ipc$dispatch("641ff29a", new Object[]{this, userVerifyInfo, invokeType});
        }
        BisBehavLog bisBehavLog = new BisBehavLog();
        BisClientInfo bisClientInfo = new BisClientInfo();
        try {
            bisClientInfo.setClientVer(Runtime.getFrameworkVersion(this.c));
        } catch (Throwable unused) {
            bisClientInfo.setClientVer("version-unknown");
        }
        bisClientInfo.setModel(Build.MODEL);
        bisClientInfo.setOs("android");
        bisClientInfo.setOsVer(Build.VERSION.RELEASE);
        BisBehavToken bisBehavToken = new BisBehavToken();
        bisBehavToken.setApdid(userVerifyInfo.apdid);
        bisBehavToken.setAppid(userVerifyInfo.appid);
        ApSecurityService apSecurityService = (ApSecurityService) this.e.getBioService(ApSecurityService.class);
        if (apSecurityService != null) {
            bisBehavToken.setApdidToken(apSecurityService.getApDidToken());
        }
        bisBehavToken.setBehid(userVerifyInfo.behid);
        BioAppDescription bioAppDescription = this.f;
        if (bioAppDescription != null) {
            bisBehavToken.setToken(bioAppDescription.getBistoken());
            if (this.f.getBioAction() == 991 || this.f.getBioAction() == 992) {
                bisBehavToken.setSampleMode(302);
            } else if (this.f.getBioAction() == 992) {
                bisBehavToken.setSampleMode(303);
            } else {
                bisBehavToken.setSampleMode(0);
            }
            bisBehavToken.setType(this.f.getBioType());
            bisBehavToken.setBizid(this.f.getBistoken());
        }
        bisBehavToken.setUid(userVerifyInfo.userid);
        bisBehavToken.setVtoken(userVerifyInfo.vtoken);
        bisBehavToken.setVerifyid(userVerifyInfo.verifyid);
        BisBehavCommon bisBehavCommon = new BisBehavCommon();
        bisBehavCommon.setInvtp(invokeType.toString());
        bisBehavCommon.setTm("");
        bisBehavCommon.setRetry("" + this.d.getRetryTime());
        ArrayList arrayList = new ArrayList();
        Iterator<SubTask> it = this.g.getTasks().iterator();
        while (it.hasNext()) {
            ToygerBaseTask toygerBaseTask = (ToygerBaseTask) it.next();
            if (toygerBaseTask != null && toygerBaseTask.isHasBeHaviorInfo()) {
                arrayList.add(toygerBaseTask.getBisBehavTask());
            }
        }
        bisBehavLog.setBehavCommon(bisBehavCommon);
        bisBehavLog.setBehavTask(arrayList);
        bisBehavLog.setBehavToken(bisBehavToken);
        bisBehavLog.setClientInfo(bisClientInfo);
        BioLog.i("bisBehavLog:" + JSON.toJSONString(bisBehavLog));
        return bisBehavLog;
    }

    private UploadContent a(boolean z) {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadContent) ipChange.ipc$dispatch("d890c37a", new Object[]{this, new Boolean(z)});
        }
        UploadContent uploadContent = null;
        if (this.j != null) {
            Map<String, Object> generateMonitorBlob = this.l.generateMonitorBlob(z);
            if (generateMonitorBlob != null) {
                BioLog.i("set blob: has ext blob");
                HashMap hashMap = new HashMap();
                hashMap.put(ToygerBaseService.KEY_NINE_SHOT_BLOB, generateMonitorBlob);
                map = this.l.generateBlob(hashMap);
            } else {
                map = null;
            }
            if (map != null) {
                uploadContent = new UploadContent((byte[]) map.get("content"), (byte[]) map.get("key"), ((Boolean) map.get(ToygerBaseService.KEY_RES_9_IS_UTF8)).booleanValue());
            }
            BioLog.i("getNineShoot DONE");
        }
        return uploadContent;
    }

    private UploadContent a() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadContent) ipChange.ipc$dispatch("194c93fe", new Object[]{this});
        }
        if (this.m != null) {
            BioLog.i("set blob: has ext blob");
            HashMap hashMap = new HashMap();
            hashMap.put(ToygerBaseService.KEY_ASYNC_BLOB, this.m);
            BioLog.i("gen_AsynUploadContent");
            map = this.l.generateBlob(hashMap);
        } else {
            map = null;
        }
        if (map == null) {
            return null;
        }
        boolean booleanValue = ((Boolean) map.get(ToygerBaseService.KEY_RES_9_IS_UTF8)).booleanValue();
        BioLog.i("upload_AsynUploadContent");
        return new UploadContent((byte[]) map.get("content"), (byte[]) map.get("key"), booleanValue);
    }

    public NineShootManager getNineShootManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NineShootManager) ipChange.ipc$dispatch("7962f4f5", new Object[]{this}) : this.j;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        NineShootManager nineShootManager = this.j;
        if (nineShootManager != null) {
            nineShootManager.destroy();
        }
        this.l = null;
    }

    public int getProtocolFormat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("60e4179f", new Object[]{this})).intValue() : this.n;
    }
}
