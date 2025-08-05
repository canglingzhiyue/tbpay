package com.alipay.module.face.helper;

import android.text.TextUtils;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.module.common.FaceDetectUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class VIZIMCallback implements ZIMCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String b = "VIZIMCallback";

    /* renamed from: a  reason: collision with root package name */
    public FaceCertHelper f6127a;

    public VIZIMCallback(FaceCertHelper faceCertHelper) {
        this.f6127a = faceCertHelper;
    }

    @Override // com.alipay.mobile.security.zim.api.ZIMCallback
    public boolean response(ZIMResponse zIMResponse) {
        HashMap hashMap;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60fd2bfb", new Object[]{this, zIMResponse})).booleanValue();
        }
        FaceCertHelper faceCertHelper = this.f6127a;
        if (faceCertHelper.f.getAndSet(true)) {
            VerifyLogCat.w("FaceCertHelper", "Bio has already callback and do nothing");
        } else {
            if (zIMResponse == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                hashMap.put("code", String.valueOf(zIMResponse.code));
                hashMap.put("reason", zIMResponse.reason);
                hashMap.put("subCode", zIMResponse.subCode);
                hashMap.put("msg", zIMResponse.msg);
                if (zIMResponse.extInfo != null) {
                    hashMap.put("bioFaceRes", zIMResponse.extInfo.get(ZIMFacade.KEY_BIO_ACTION));
                }
            }
            faceCertHelper.a("UC-MobileIC-160316-2", "mdsdswkjhd", hashMap);
            VerifyLogCat.d("FaceCertHelper", "faceResult: " + zIMResponse + ", token:" + faceCertHelper.b);
            String str = "1006";
            if (zIMResponse == null || faceCertHelper.b == null) {
                VerifyLogCat.w("FaceCertHelper", "ZIMResponse or token is null");
                MicroModuleContext.getInstance().notifyAndFinishModule(faceCertHelper.f6115a, faceCertHelper.b, faceCertHelper.d.getModuleName(), new DefaultModuleResult(str));
            } else if (1000 == zIMResponse.code) {
                faceCertHelper.a(zIMResponse);
            } else {
                try {
                    String str2 = zIMResponse.extInfo.get(ZIMFacade.KEY_BIO_ACTION);
                    VerifyLogCat.i("FaceCertHelper", "ZIM 回调数据：" + str2);
                    i = Integer.valueOf(str2).intValue();
                } catch (Throwable th) {
                    VerifyLogCat.e("FaceCertHelper", th);
                    i = 0;
                }
                if (303 == i) {
                    faceCertHelper.b();
                } else if (2006 == zIMResponse.code) {
                    faceCertHelper.a(zIMResponse);
                } else if (1003 == zIMResponse.code && 100 == i) {
                    try {
                        faceCertHelper.e.putString(ZimMessageChannel.K_RPC_RES_CODE, "1003");
                        faceCertHelper.e.putString(ZIMFacade.KEY_BIO_ACTION, "100");
                    } catch (Throwable th2) {
                        VerifyLogCat.e("FaceCertHelper", th2);
                    }
                    faceCertHelper.a(zIMResponse);
                } else {
                    if (1001 != zIMResponse.code) {
                        str = "1003";
                    }
                    DefaultModuleResult defaultModuleResult = new DefaultModuleResult(str);
                    HashMap<String, Object> hashMap2 = new HashMap<>();
                    hashMap2.put("faceResult", Integer.valueOf(i));
                    hashMap2.put("faceMemo", FaceDetectUtils.a(i));
                    if (!TextUtils.isEmpty(faceCertHelper.g)) {
                        hashMap2.put("desensName", faceCertHelper.g);
                    }
                    if (zIMResponse.extInfo != null) {
                        hashMap2.putAll(zIMResponse.extInfo);
                    }
                    defaultModuleResult.setExtInfo(hashMap2);
                    VerifyLogCat.i("FaceCertHelper", "ZIMResponse success = false");
                    MicroModuleContext.getInstance().notifyAndFinishModule(faceCertHelper.f6115a, faceCertHelper.b, faceCertHelper.d.getModuleName(), defaultModuleResult);
                }
            }
        }
        if (zIMResponse != null && (1000 == zIMResponse.code || 2006 == zIMResponse.code)) {
            VerifyLogCat.i(b, "response() 核身返回false，告之人脸不主动销毁");
            return false;
        }
        VerifyLogCat.i(b, "人脸可以主动销毁");
        return true;
    }
}
