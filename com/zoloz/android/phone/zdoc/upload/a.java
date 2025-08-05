package com.zoloz.android.phone.zdoc.upload;

import android.content.Context;
import android.os.Build;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavCommon;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavLog;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavTask;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisBehavToken;
import com.alipay.bis.common.service.facade.gw.model.common.BisJson.BisClientInfo;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.FileUtil;
import com.alipay.mobile.security.faceauth.InvokeType;
import com.alipay.mobile.security.faceauth.UserVerifyInfo;
import com.alipay.zoloz.toyger.upload.UploadContent;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import java.lang.reflect.Constructor;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UploadChannel f24761a;
    private Context b;
    private BioAppDescription e;
    private ZdocRemoteConfig f;
    private int g;
    private String h;
    private String c = null;
    private UserVerifyInfo d = null;
    private int i = 0;

    static {
        kge.a(1984507795);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public a(Context context, BioAppDescription bioAppDescription, ZdocRemoteConfig zdocRemoteConfig) {
        this.e = null;
        this.f = null;
        this.b = context;
        this.e = bioAppDescription;
        this.f = zdocRemoteConfig;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    private BisBehavLog a(InvokeType invokeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BisBehavLog) ipChange.ipc$dispatch("700d4d06", new Object[]{this, invokeType});
        }
        BisBehavLog bisBehavLog = new BisBehavLog();
        BisClientInfo bisClientInfo = new BisClientInfo();
        bisClientInfo.clientVer = "1.0";
        bisClientInfo.model = Build.MODEL;
        bisClientInfo.os = "android";
        bisClientInfo.osVer = Build.VERSION.CODENAME;
        BisBehavToken bisBehavToken = new BisBehavToken();
        bisBehavToken.token = this.h;
        bisBehavToken.type = this.g;
        bisBehavToken.sampleMode = 300;
        bisBehavToken.apdid = this.d.apdid;
        bisBehavToken.bizid = "";
        bisBehavToken.appid = this.d.appid;
        bisBehavToken.behid = this.d.behid;
        bisBehavToken.uid = this.d.userid;
        bisBehavToken.verifyid = this.d.verifyid;
        bisBehavToken.vtoken = this.d.vtoken;
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        BisBehavCommon bisBehavCommon = new BisBehavCommon();
        bisBehavCommon.invtp = invokeType.toString();
        bisBehavCommon.retry = Integer.toString(this.i);
        bisBehavCommon.tm = simpleDateFormat.format((java.util.Date) date);
        ArrayList arrayList = new ArrayList();
        BisBehavTask bisBehavTask = new BisBehavTask();
        bisBehavTask.dur = 0;
        bisBehavTask.idx = "CommonCardActivity";
        bisBehavTask.name = "CommonCardActivity";
        bisBehavTask.quality = 0;
        arrayList.add(bisBehavTask);
        bisBehavLog.behavCommon = bisBehavCommon;
        bisBehavLog.behavTask = arrayList;
        bisBehavLog.behavToken = bisBehavToken;
        bisBehavLog.clientInfo = bisClientInfo;
        return bisBehavLog;
    }

    public void a(byte[] bArr, byte[] bArr2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e76d5e", new Object[]{this, bArr, bArr2, new Boolean(z)});
        } else {
            this.f24761a.uploadPaperInfo(new UploadContent(bArr, bArr2, z), a(InvokeType.NORMAL), this.h, this.c);
        }
    }

    public String b() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        String str3 = "";
        int env = this.f.getEnv();
        BioLog.i("public key env" + env);
        try {
            if (env == 0) {
                str2 = this.e.getExtProperty().get("public_key_prod");
                if (str2 == null) {
                    try {
                        str = new String(FileUtil.getAssetsData(this.b, "bid-log-key-public.key"));
                        return str;
                    } catch (IllegalArgumentException e) {
                        e = e;
                        str3 = str2;
                        BioLog.e(e.toString());
                        return str3;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        str3 = str2;
                        BioLog.e(e.toString());
                        return str3;
                    }
                }
                str = str2;
                return str;
            }
            str = this.e.getExtProperty().get("public_key_test");
            if (str == null) {
                try {
                    str2 = new String(FileUtil.getAssetsData(this.b, "bid-log-key-public_t.key"));
                    str = str2;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                    str3 = str;
                    BioLog.e(e.toString());
                    return str3;
                } catch (IllegalStateException e4) {
                    e = e4;
                    str3 = str;
                    BioLog.e(e.toString());
                    return str3;
                }
            }
            return str;
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (IllegalStateException e6) {
            e = e6;
        }
    }

    public void c() {
        d();
        this.h = this.d.bistoken;
        this.g = this.e.getBioType();
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        this.c = b();
        try {
            Constructor<?> constructor = Class.forName("com.zoloz.android.phone.zdoc.upload.UploadChannelByJson").getConstructor(BioServiceManager.class);
            constructor.setAccessible(true);
            this.f24761a = (UploadChannel) constructor.newInstance(currentInstance);
        } catch (Throwable th) {
            BioLog.e(th.toString());
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = new UserVerifyInfo();
        String str = "";
        this.d.apdid = this.e.getExtProperty().get("APDID") != null ? this.e.getExtProperty().get("APDID") : str;
        this.d.appid = this.e.getExtProperty().get("appid") != null ? this.e.getExtProperty().get("appid") : str;
        this.d.behid = this.e.getTag();
        this.d.sceid = this.e.getExtProperty().get("SCENE_ID") != null ? this.e.getExtProperty().get("SCENE_ID") : str;
        this.d.bistoken = this.e.getBistoken();
        this.d.userid = this.e.getExtProperty().get("userid") != null ? this.e.getExtProperty().get("userid") : str;
        this.d.vtoken = this.e.getExtProperty().get("TOKEN_ID") != null ? this.e.getExtProperty().get("TOKEN_ID") : str;
        UserVerifyInfo userVerifyInfo = this.d;
        if (this.e.getExtProperty().get("verifyid") != null) {
            str = this.e.getExtProperty().get("verifyid");
        }
        userVerifyInfo.verifyid = str;
    }
}
