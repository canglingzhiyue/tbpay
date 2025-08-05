package com.alipay.mobile.verifyidentity.module.zface;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMFacadeBuilder;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannelCallback;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity;
import com.alipay.mobile.verifyidentity.module.nopwd.NoPwdBaseChecker;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.mobile.verifyidentity.module.zface.proxy.ZIMFacadeProxy;
import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cpe;
import tb.riy;

/* loaded from: classes3.dex */
public class ZFaceChecker extends NoPwdBaseChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5939a = "ZFaceChecker";
    private static long j = 1000;
    private static List<String> l = Collections.synchronizedList(new ArrayList());
    private ZIMFacade b;
    private String c;
    private final int d;
    private AtomicBoolean e;
    private AtomicBoolean f;
    private ZimMessageChannelCallback g;
    private ZimMessageChannelCallback h;
    private long i;
    private BroadcastReceiver k;
    private ZIMFacadeProxy m;

    public static /* synthetic */ Object ipc$super(ZFaceChecker zFaceChecker, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ FingerprintCheckActivity access$000(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("7fa1a737", new Object[]{zFaceChecker}) : zFaceChecker.hostActivity;
    }

    public static /* synthetic */ DataHelper access$100(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("1f215afe", new Object[]{zFaceChecker}) : zFaceChecker.mDataHelper;
    }

    public static /* synthetic */ ZimMessageChannelCallback access$1002(ZFaceChecker zFaceChecker, ZimMessageChannelCallback zimMessageChannelCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZimMessageChannelCallback) ipChange.ipc$dispatch("1ee56e1a", new Object[]{zFaceChecker, zimMessageChannelCallback});
        }
        zFaceChecker.g = zimMessageChannelCallback;
        return zimMessageChannelCallback;
    }

    public static /* synthetic */ DataHelper access$1300(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("af5b6bed", new Object[]{zFaceChecker}) : zFaceChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$1400(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("cb94bf4c", new Object[]{zFaceChecker}) : zFaceChecker.mDataHelper;
    }

    public static /* synthetic */ int access$1500(ZFaceChecker zFaceChecker, ZIMResponse zIMResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("be5229c5", new Object[]{zFaceChecker, zIMResponse})).intValue() : a(zIMResponse);
    }

    public static /* synthetic */ String access$1600(ZFaceChecker zFaceChecker, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("311622e1", new Object[]{zFaceChecker, new Integer(i)}) : zFaceChecker.getString(i);
    }

    public static /* synthetic */ DataHelper access$1700(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("2040b969", new Object[]{zFaceChecker}) : zFaceChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$1800(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("3c7a0cc8", new Object[]{zFaceChecker}) : zFaceChecker.mDataHelper;
    }

    public static /* synthetic */ DataHelper access$200(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("3b5aae5d", new Object[]{zFaceChecker}) : zFaceChecker.mDataHelper;
    }

    public static /* synthetic */ String access$2000(ZFaceChecker zFaceChecker, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("272cd47a", new Object[]{zFaceChecker, new Integer(i)}) : zFaceChecker.getString(i);
    }

    public static /* synthetic */ void access$2200(ZFaceChecker zFaceChecker, String str, ZIMResponse zIMResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623186f8", new Object[]{zFaceChecker, str, zIMResponse});
        } else {
            zFaceChecker.a(str, zIMResponse);
        }
    }

    public static /* synthetic */ DataHelper access$2300(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("1a4c846e", new Object[]{zFaceChecker}) : zFaceChecker.mDataHelper;
    }

    public static /* synthetic */ List access$2400() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d9b2c09e", new Object[0]) : l;
    }

    public static /* synthetic */ BroadcastReceiver access$2500(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("df511ff9", new Object[]{zFaceChecker}) : zFaceChecker.k;
    }

    public static /* synthetic */ FingerprintCheckActivity access$300(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("9de070d4", new Object[]{zFaceChecker}) : zFaceChecker.hostActivity;
    }

    public static /* synthetic */ FingerprintCheckActivity access$400(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FingerprintCheckActivity) ipChange.ipc$dispatch("a7f55eb3", new Object[]{zFaceChecker}) : zFaceChecker.hostActivity;
    }

    public static /* synthetic */ String access$500() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c2ab464", new Object[0]) : f5939a;
    }

    public static /* synthetic */ AtomicBoolean access$600(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("243f0a35", new Object[]{zFaceChecker}) : zFaceChecker.e;
    }

    public static /* synthetic */ long access$702(ZFaceChecker zFaceChecker, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b6e02c0", new Object[]{zFaceChecker, new Long(j2)})).longValue();
        }
        zFaceChecker.i = j2;
        return j2;
    }

    public static /* synthetic */ DataHelper access$800(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DataHelper) ipChange.ipc$dispatch("e4b2a297", new Object[]{zFaceChecker}) : zFaceChecker.mDataHelper;
    }

    public static /* synthetic */ ZimMessageChannelCallback access$902(ZFaceChecker zFaceChecker, ZimMessageChannelCallback zimMessageChannelCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ZimMessageChannelCallback) ipChange.ipc$dispatch("cf7cb640", new Object[]{zFaceChecker, zimMessageChannelCallback});
        }
        zFaceChecker.h = zimMessageChannelCallback;
        return zimMessageChannelCallback;
    }

    public ZFaceChecker(FingerprintCheckActivity fingerprintCheckActivity, DataHelper dataHelper) {
        super(fingerprintCheckActivity, dataHelper);
        this.d = 1200;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicBoolean(false);
        dataHelper.zFaceChecker = this;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("action", "face_start");
            this.mDataHelper.logBehavior("asafs", "UC-MobileIC-160201-02", hashMap);
            if (!this.mDataHelper.isPoPMode()) {
                VerifyLogCat.i(f5939a, "非PoP模式，不注册");
            } else {
                final String verifyId = getVerifyId();
                this.k = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            return;
                        }
                        VerifyLogCat.i(ZFaceChecker.access$500(), "收到收银台退出广播：KExitMiniPayViewNotification");
                        if (intent != null) {
                            try {
                                if (intent.getBooleanExtra("hasMultiCashier", false)) {
                                    VerifyLogCat.i(ZFaceChecker.access$500(), "收银台还有实例存在，本次退出广播忽略");
                                    return;
                                }
                            } catch (Throwable th) {
                                VerifyLogCat.w(ZFaceChecker.access$500(), "清理结果记录list异常", th);
                                return;
                            }
                        }
                        ZFaceChecker.access$2400().remove(verifyId);
                        String access$500 = ZFaceChecker.access$500();
                        VerifyLogCat.i(access$500, "清理了2D人脸重入标：" + verifyId);
                        LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).unregisterReceiver(ZFaceChecker.access$2500(ZFaceChecker.this));
                        VerifyLogCat.i(ZFaceChecker.access$500(), "清理完成");
                    }
                };
                LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).registerReceiver(this.k, new IntentFilter("KExitMiniPayViewNotification"));
            }
            VerifyLogCat.i(f5939a, "启动佐罗人脸");
            ZIMFacade.install(this.hostActivity);
            this.b = ZIMFacadeBuilder.create(this.hostActivity);
            JSONObject parseObject = JSON.parseObject(this.mDataHelper.challenge);
            this.c = parseObject.getString("zimId");
            HashMap hashMap2 = new HashMap();
            for (String str : parseObject.keySet()) {
                hashMap2.put(str, parseObject.getString(str));
            }
            if (this.mDataHelper.isPoPMode()) {
                VerifyLogCat.i(f5939a, "收银台场景，告之佐罗人脸用传入的Context启动Activity");
                hashMap2.put(BioDetector.EXT_KEY_USE_CONTEXT, "true");
            }
            if (this.mDataHelper.multiBio && this.mDataHelper.hasNextBio()) {
                JSONObject jSONObject = new JSONObject();
                String nextBioType = this.mDataHelper.getNextBioType();
                String string = getResources().getString(R.string.go_pwd_pay);
                if (DataHelper.FP_TYPE_VALUE.equalsIgnoreCase(nextBioType)) {
                    string = getResources().getString(R.string.go_fp_pay);
                } else if (DataHelper.FACEID_TYPE_VALUE.equalsIgnoreCase(nextBioType)) {
                    string = getResources().getString(R.string.go_faceid_pay);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("returnCode", (Object) 300);
                jSONObject2.put("title", (Object) getResources().getString(R.string.vi_zface_detect_over_max_time));
                jSONObject2.put("rightButtonText", (Object) string);
                jSONObject.put("limitAlert", (Object) jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("title", (Object) getResources().getString(R.string.vi_zface_detect_operation_error_text));
                jSONObject3.put("leftButtonText", (Object) string);
                jSONObject.put("failAlert", (Object) jSONObject3);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("returnCode", (Object) 100);
                jSONObject4.put("title", (Object) getResources().getString(R.string.vi_zface_detect_camera_unconnect_title));
                jSONObject4.put("rightButtonText", (Object) string);
                jSONObject.put("cameraNoPermissionAlert", (Object) jSONObject4);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("title", (Object) getResources().getString(R.string.vi_zface_detect_operation_error_text));
                jSONObject5.put("rightButtonText", (Object) string);
                jSONObject.put("failNoRetryAlert", (Object) jSONObject5);
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("returnCode", (Object) 300);
                jSONObject6.put("title", (Object) getResources().getString(R.string.vi_zface_detect_timeout_error_title_payscene));
                jSONObject6.put("leftButtonText", (Object) string);
                jSONObject.put("timeoutAlert", (Object) jSONObject6);
                JSONObject jSONObject7 = new JSONObject();
                jSONObject7.put("returnCode", (Object) 300);
                jSONObject7.put("title", (Object) getResources().getString(R.string.vi_zface_detect_close_title));
                jSONObject7.put("leftButtonText", (Object) string);
                jSONObject.put("exitAlert", (Object) jSONObject7);
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("returnCode", (Object) 300);
                jSONObject8.put("rightButtonText", (Object) string);
                jSONObject.put("windowAlert", (Object) jSONObject8);
                hashMap2.put("facetipsLocalConfig", jSONObject.toJSONString());
                String str2 = f5939a;
                VerifyLogCat.i(str2, "jsonParams :" + jSONObject.toJSONString());
            }
            this.m = new ZIMFacadeProxy(this.b);
            this.m.verify(this.c, hashMap2, new ZimMessageChannel() { // from class: com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel
                public void onAction(Bundle bundle, ZimMessageChannelCallback zimMessageChannelCallback) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9b399c2d", new Object[]{this, bundle, zimMessageChannelCallback});
                        return;
                    }
                    VerifyLogCat.i(ZFaceChecker.access$500(), "2D人脸本地【成功】，开始提交服务端校验");
                    ZFaceChecker.access$600(ZFaceChecker.this).set(true);
                    ZFaceChecker.access$702(ZFaceChecker.this, SystemClock.elapsedRealtime());
                    if (ZFaceChecker.access$800(ZFaceChecker.this).isPoPMode()) {
                        ZFaceChecker.access$902(ZFaceChecker.this, zimMessageChannelCallback);
                    } else {
                        ZFaceChecker.access$1002(ZFaceChecker.this, zimMessageChannelCallback);
                    }
                    ZFaceChecker.access$1100(ZFaceChecker.this, true, "", bundle != null ? bundle.getString("requestData") : "", 100, "");
                    ZFaceChecker.this.updateVerifyStatus("end");
                    ZFaceChecker.this.checkByServer();
                    ZFaceChecker.access$1200(ZFaceChecker.this);
                    ZFaceChecker.this.notifyZFaceSucOnPoP();
                }
            }, new ZIMCallback() { // from class: com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.security.zim.api.ZIMCallback
                public boolean response(ZIMResponse zIMResponse) {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("60fd2bfb", new Object[]{this, zIMResponse})).booleanValue();
                    }
                    int i2 = zIMResponse.code;
                    String str3 = zIMResponse.subCode;
                    ZFaceChecker.access$1300(ZFaceChecker.this).logFaceBehavior(String.valueOf(i2), cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID, DataHelper.ZFACE_TYPE_VALUE, zIMResponse.subCode);
                    if (ZFaceChecker.access$1400(ZFaceChecker.this).isPoPMode() && ZFaceChecker.access$600(ZFaceChecker.this).get()) {
                        VerifyLogCat.i(ZFaceChecker.access$500(), "2D人脸【收银台场景，本地已成功，忽略后面的回调】");
                        return true;
                    }
                    ZFaceChecker.access$1200(ZFaceChecker.this);
                    if (i2 == 1000 && ZFaceChecker.access$600(ZFaceChecker.this).get()) {
                        return true;
                    }
                    String str4 = "";
                    if (1003 == i2 || 1005 == i2) {
                        VerifyLogCat.i(ZFaceChecker.access$500(), "2D人脸【取消】");
                        if (100 == ZFaceChecker.access$1500(ZFaceChecker.this, zIMResponse)) {
                            VerifyLogCat.i(ZFaceChecker.access$500(), "2D人脸【无权限】");
                            str4 = ZFaceChecker.access$1600(ZFaceChecker.this, R.string.zface_no_permission_pwd_tip);
                            ZFaceChecker.access$1700(ZFaceChecker.this).proVerifyResult = "NO_PERMISSION";
                            i = 100;
                        } else if (300 != ZFaceChecker.access$1500(ZFaceChecker.this, zIMResponse)) {
                            ZFaceChecker.access$1900(ZFaceChecker.this, zIMResponse);
                            return true;
                        } else {
                            VerifyLogCat.i(ZFaceChecker.access$500(), "2D人脸【用户在人脸里选择切密码】");
                            ZFaceChecker.access$1800(ZFaceChecker.this).proVerifyResult = "ZFACE_TO_PWD";
                            if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeFaceBackgroudAction)) && !TextUtils.isEmpty(str3) && "Z1009".equalsIgnoreCase(str3)) {
                                VerifyLogCat.i(ZFaceChecker.access$500(), "收银台场景2D人脸压后台");
                                return true;
                            }
                        }
                    } else {
                        String access$500 = ZFaceChecker.access$500();
                        VerifyLogCat.i(access$500, "2D人脸本地返回失败, 转密码[" + i2 + riy.ARRAY_END_STR);
                        i = 1200;
                        String access$2000 = ZFaceChecker.access$2000(ZFaceChecker.this, R.string.zface_failed_pwd_tip);
                        if (2006 == i2 && 400 == ZFaceChecker.access$1500(ZFaceChecker.this, zIMResponse)) {
                            VerifyLogCat.i(ZFaceChecker.access$500(), "失败原因是2D人脸已处于运行中，当前不可调用");
                        } else {
                            str4 = access$2000;
                        }
                    }
                    if (ZFaceChecker.access$2100(ZFaceChecker.this, "FAIL_TO_BIO", i)) {
                        return true;
                    }
                    ZFaceChecker.access$2200(ZFaceChecker.this, str4, zIMResponse);
                    return true;
                }
            });
        } catch (Throwable th) {
            VerifyLogCat.e(f5939a, "2D人脸本地校验出现异常", th);
            if (this.mDataHelper.multiBio && this.mDataHelper.hasNextBio()) {
                String nextBioType2 = this.mDataHelper.getNextBioType();
                DataHelper dataHelper = this.mDataHelper;
                dataHelper.mulitiSourceTo = "zface2" + nextBioType2;
                this.mDataHelper.logMultiBioBehavior("ZFACE_EXCEPTION", "zface", nextBioType2);
                this.mDataHelper.parseNextBio();
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ZFaceChecker.access$000(ZFaceChecker.this).handleBio();
                        }
                    }
                });
                z = true;
            }
            if (z) {
                return;
            }
            a("", null);
        }
    }

    private static int a(ZIMResponse zIMResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("243e480a", new Object[]{zIMResponse})).intValue();
        }
        try {
            String str = zIMResponse.extInfo.get(ZIMFacade.KEY_BIO_ACTION);
            String str2 = f5939a;
            VerifyLogCat.i(str2, "zimAction：" + str);
            return Integer.valueOf(str).intValue();
        } catch (Throwable th) {
            VerifyLogCat.e(f5939a, th);
            return 0;
        }
    }

    private void a(String str, ZIMResponse zIMResponse) {
        String str2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc31abe1", new Object[]{this, str, zIMResponse});
            return;
        }
        if (zIMResponse != null) {
            i = zIMResponse.code;
            str2 = zIMResponse.msg;
        } else {
            str2 = "";
            i = -1;
        }
        goToPwd(str, zIMResponse, "", i, str2);
    }

    public void shutDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f20d3fd", new Object[]{this});
            return;
        }
        try {
            VerifyLogCat.i(f5939a, "shutDown ZFace");
            this.b.command(4099);
            this.b.destroy();
            this.hostActivity = null;
        } catch (Throwable th) {
            VerifyLogCat.w(f5939a, "关闭zim人脸出现异常", th);
        }
    }

    public void notifyZFaceSucOnPoP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452d66", new Object[]{this});
        } else {
            notifyZFaceSuccess();
        }
    }

    public boolean handleZimMessage(MICRpcResponse mICRpcResponse) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c555d6a", new Object[]{this, mICRpcResponse})).booleanValue();
        }
        notifyZFaceSuccess();
        ZimMessageChannelCallback zimMessageChannelCallback = this.g;
        if (zimMessageChannelCallback != null) {
            this.g = null;
        } else {
            zimMessageChannelCallback = null;
        }
        if (zimMessageChannelCallback != null && mICRpcResponse != null) {
            String str = "";
            if (mICRpcResponse.verifySuccess) {
                i = 1000;
            } else if ("ZOLOZ_RETRY".equalsIgnoreCase(mICRpcResponse.verifyCode)) {
                str = mICRpcResponse.data;
                i = 3000;
                z = true;
            } else {
                i = 2006;
            }
            VerifyLogCat.i(f5939a, "[handleZimMessage]结果为 responseCode：" + i + "，responseData：" + str);
            Bundle bundle = new Bundle();
            bundle.putInt(ZimMessageChannel.K_RPC_RES_CODE, i);
            bundle.putString(ZimMessageChannel.K_RPC_RES, str);
            zimMessageChannelCallback.onResult(bundle);
        }
        return z;
    }

    public void notifyZFaceSuccess() {
        ZimMessageChannelCallback zimMessageChannelCallback;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83acdfc", new Object[]{this});
        } else if (!this.e.get() || this.f.getAndSet(true)) {
            VerifyLogCat.i(f5939a, "2D人脸【非收银台场景，或者本地没有成功，或者已告知过人脸成功，则忽略】");
        } else {
            if (this.mDataHelper.isPoPMode()) {
                zimMessageChannelCallback = this.h;
                this.h = null;
            } else {
                zimMessageChannelCallback = this.g;
                this.g = null;
            }
            if (zimMessageChannelCallback == null) {
                return;
            }
            SystemClock.elapsedRealtime();
            VerifyLogCat.i(f5939a, "不需要延时");
            Bundle bundle = new Bundle();
            bundle.putInt(ZimMessageChannel.K_RPC_RES_CODE, 1000);
            bundle.putString(ZimMessageChannel.K_RPC_RES, "");
            zimMessageChannelCallback.onResult(bundle);
        }
    }

    public static boolean isSameVerifyIdCallAgain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e266cfd3", new Object[]{str})).booleanValue();
        }
        try {
            if (l.contains(str)) {
                VerifyLogCat.i(f5939a, "相同vid再次调用");
                return true;
            }
        } catch (Throwable th) {
            VerifyLogCat.w(f5939a, "isSameVerifyIdCallAgain异常", th);
        }
        return false;
    }

    public void unRegisterReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c98172", new Object[]{this});
        } else if (this.k == null) {
        } else {
            LocalBroadcastManager.getInstance(MicroModuleContext.getInstance().getContext()).unregisterReceiver(this.k);
        }
    }

    public void cancelVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a442e29a", new Object[]{this});
            return;
        }
        ZIMFacadeProxy zIMFacadeProxy = this.m;
        if (zIMFacadeProxy == null) {
            return;
        }
        zIMFacadeProxy.cancel();
    }

    public static /* synthetic */ void access$1100(ZFaceChecker zFaceChecker, boolean z, Object obj, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b801072", new Object[]{zFaceChecker, new Boolean(z), obj, str, new Integer(i), str2});
        } else {
            zFaceChecker.mDataHelper.buildRequestDataBase(zFaceChecker.type, z, obj, str, i, str2);
        }
    }

    public static /* synthetic */ void access$1200(ZFaceChecker zFaceChecker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f82a5ce0", new Object[]{zFaceChecker});
            return;
        }
        try {
            if (!zFaceChecker.mDataHelper.isPoPMode()) {
                VerifyLogCat.i(f5939a, "非PoP模式，不用记录");
                return;
            }
            String verifyId = zFaceChecker.getVerifyId();
            if (TextUtils.isEmpty(verifyId)) {
                return;
            }
            l.add(verifyId);
        } catch (Throwable th) {
            VerifyLogCat.w(f5939a, "添加结果记录list异常", th);
        }
    }

    public static /* synthetic */ void access$1900(ZFaceChecker zFaceChecker, final ZIMResponse zIMResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44480d6", new Object[]{zFaceChecker, zIMResponse});
            return;
        }
        if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.openOldAlert)) && zFaceChecker.mDataHelper.isPluginMode) {
            if (TextUtils.equals(zFaceChecker.mDataHelper.mPlugin.getActConf("supportEmbedVi"), "Y")) {
                VerifyLogCat.i(f5939a, "ZFACE supportEmbedVi CANCLE_TO_PWD");
                zFaceChecker.mDataHelper.logFpResBehavior("CANCLE_ZFACE_TO_PWD", "zface");
                zFaceChecker.a("", zIMResponse);
                return;
            }
            String actConf = zFaceChecker.mDataHelper.mPlugin.getActConf(BaseFBPlugin.ACT_CONF.supportRetain);
            if (!TextUtils.isEmpty(actConf) && "Y".equalsIgnoreCase(actConf)) {
                zFaceChecker.mDataHelper.logFpResBehavior("CANCLE_ZFACE", "REMOVE_ALERT");
                zFaceChecker.updateVerifyStatusWithScene(BaseFBPlugin.VERIFY_STATUS.abort, LoginConstant.FETCH_IV_FAIL_CANCEL);
                zFaceChecker.mDataHelper.notifyResult(new DefaultModuleResult("1003"));
                return;
            }
        }
        String string = zFaceChecker.hostActivity.getResources().getString(R.string.go_pwd_pay);
        if (zFaceChecker.mDataHelper.multiBio && zFaceChecker.mDataHelper.hasNextBio()) {
            String nextBioType = zFaceChecker.mDataHelper.getNextBioType();
            if (nextBioType.equalsIgnoreCase(DataHelper.FP_TYPE_VALUE)) {
                string = zFaceChecker.hostActivity.getResources().getString(R.string.go_fp_pay);
            } else if (nextBioType.equalsIgnoreCase(DataHelper.FACEID_TYPE_VALUE)) {
                string = zFaceChecker.hostActivity.getResources().getString(R.string.go_faceid_pay);
            }
        }
        zFaceChecker.hostActivity.alert((String) null, zFaceChecker.getResources().getString(R.string.face_really_wanna_leave), string, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                VerifyLogCat.i(ZFaceChecker.access$500(), "【用户选择切密码】");
                if (ZFaceChecker.access$2100(ZFaceChecker.this, "CANCLE_TO_BIO", 0)) {
                    return;
                }
                ZFaceChecker.access$2200(ZFaceChecker.this, "", zIMResponse);
            }
        }, zFaceChecker.getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                VerifyLogCat.i(ZFaceChecker.access$500(), "【用户选择放弃】");
                ZFaceChecker.this.updateVerifyStatus(BaseFBPlugin.VERIFY_STATUS.abort);
                ZFaceChecker.access$2300(ZFaceChecker.this).notifyResult(new DefaultModuleResult("1003"));
            }
        }, (Boolean) false);
    }

    public static /* synthetic */ boolean access$2100(ZFaceChecker zFaceChecker, String str, int i) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("902083f", new Object[]{zFaceChecker, str, new Integer(i)})).booleanValue();
        }
        if (!zFaceChecker.mDataHelper.multiBio || !zFaceChecker.mDataHelper.hasNextBio()) {
            return false;
        }
        final String str2 = "";
        if (DataHelper.FP_TYPE_VALUE.equalsIgnoreCase(zFaceChecker.mDataHelper.getNextBioType())) {
            string = zFaceChecker.getString(R.string.vi_to_fp_product);
        } else {
            string = DataHelper.FACEID_TYPE_VALUE.equalsIgnoreCase(zFaceChecker.mDataHelper.getNextBioType()) ? zFaceChecker.getString(R.string.vi_to_faceid_product) : str2;
        }
        if (i == 100) {
            str2 = zFaceChecker.getString(R.string.vi_no_camera_premission) + zFaceChecker.getString(R.string.vi_camera_for_face) + string;
        } else if (i == 1200) {
            str2 = String.format(zFaceChecker.getString(R.string.vi_a_fail), zFaceChecker.getString(R.string.vi_product_zface)) + string;
        }
        zFaceChecker.mDataHelper.mulitiSourceTo = "zface2" + zFaceChecker.mDataHelper.getNextBioType();
        zFaceChecker.mDataHelper.logMultiBioBehavior(str, "zface", zFaceChecker.mDataHelper.getNextBioType());
        zFaceChecker.mDataHelper.parseNextBio();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.module.zface.ZFaceChecker.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (ZFaceChecker.access$100(ZFaceChecker.this).isFP()) {
                        ZFaceChecker.access$200(ZFaceChecker.this).errorForFp = str2;
                    } else {
                        ZFaceChecker.access$300(ZFaceChecker.this).showNewToast(str2, 0);
                    }
                }
                ZFaceChecker.access$400(ZFaceChecker.this).handleBio();
            }
        });
        zFaceChecker.updateVerifyStatus("end");
        return true;
    }
}
