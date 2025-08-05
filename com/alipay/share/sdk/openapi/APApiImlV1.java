package com.alipay.share.sdk.openapi;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;
import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.SendMessageToZFB;
import com.alipay.share.sdk.openapi.algorithm.MD5;
import com.alipay.share.sdk.openapi.channel.APMessageAct;
import com.alipay.share.sdk.plugin.APVersionCheck;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class APApiImlV1 implements IAPApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f6182a;
    private String b;
    private boolean c;

    public APApiImlV1(Context context, String str) {
        this(context, str, false);
    }

    public APApiImlV1(Context context, String str, boolean z) {
        this.f6182a = context;
        this.b = str;
        this.c = z;
    }

    @Override // com.alipay.share.sdk.openapi.IAPApi
    public boolean isZFBAppInstalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62c913b0", new Object[]{this})).booleanValue();
        }
        try {
            PackageInfo packageInfo = this.f6182a.getPackageManager().getPackageInfo("com.eg.android.AlipayGphone", 64);
            if (packageInfo != null) {
                if (a(packageInfo.signatures)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.alipay.share.sdk.openapi.IAPApi
    public final boolean handleIntent(Intent intent, IAPAPIEventHandler iAPAPIEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8b3d130", new Object[]{this, intent, iAPAPIEventHandler})).booleanValue();
        }
        String stringExtra = intent.getStringExtra(Constant.EXTRA_MESSAGE_CONTENT);
        int intExtra = intent.getIntExtra(Constant.EXTRA_MESSAGE_SDK_VERSION, 0);
        String stringExtra2 = intent.getStringExtra(Constant.EXTRA_MESSAGE_APP_PACKAGE_NAME);
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            byte[] byteArrayExtra = intent.getByteArrayExtra(Constant.EXTRA_MESSAGE_CHECK_SUM);
            StringBuffer stringBuffer = new StringBuffer();
            if (stringExtra != null) {
                stringBuffer.append(stringExtra);
            }
            stringBuffer.append(intExtra);
            stringBuffer.append(stringExtra2);
            stringBuffer.append("alipay");
            if (!a(byteArrayExtra, MD5.getMessageDigest(stringBuffer.toString().substring(1, 9).getBytes()).getBytes())) {
                Log.e("APSDK.ZFBApiImlV1", "checksum fail");
                return false;
            }
            int intExtra2 = intent.getIntExtra(Constant.EXTRA_COMMAND_TYPE, 0);
            if (intExtra2 == 1) {
                iAPAPIEventHandler.onResp(new SendMessageToZFB.Resp(intent.getExtras()));
                return true;
            } else if (intExtra2 == 2) {
                iAPAPIEventHandler.onResp(new SendMessageToZFB.Resp(intent.getExtras()));
                return true;
            } else if (intExtra2 == 3) {
                iAPAPIEventHandler.onReq(new SendMessageToZFB.Req(intent.getExtras()));
                return true;
            } else if (intExtra2 != 4) {
                return false;
            } else {
                iAPAPIEventHandler.onReq(new SendMessageToZFB.Req(intent.getExtras()));
                return true;
            }
        }
        Log.e("APSDK.ZFBApiImlV1", "invalid argument");
        return false;
    }

    @Override // com.alipay.share.sdk.openapi.IAPApi
    public boolean isZFBSupportAPI() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9a947322", new Object[]{this})).booleanValue() : getZFBVersionCode() >= 77;
    }

    @Override // com.alipay.share.sdk.openapi.IAPApi
    public int getZFBVersionCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7165613f", new Object[]{this})).intValue() : new APVersionCheck(this.f6182a).getZFBAppVersionCode();
    }

    @Override // com.alipay.share.sdk.openapi.IAPApi
    public boolean openZFBApp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b441a080", new Object[]{this})).booleanValue();
        }
        if (!isZFBAppInstalled()) {
            Log.e("APSDK.ZFBApiImlV1", "open Alipay app failed, not installed or signature check failed");
            return false;
        }
        try {
            this.f6182a.startActivity(this.f6182a.getPackageManager().getLaunchIntentForPackage("com.eg.android.AlipayGphone"));
            return true;
        } catch (Exception e) {
            Log.e("APSDK.ZFBApiImlV1", "start Alipay Main Activity fail, exception = " + e.getMessage());
            return false;
        }
    }

    @Override // com.alipay.share.sdk.openapi.IAPApi
    public boolean sendReq(BaseReq baseReq) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bdd463e", new Object[]{this, baseReq})).booleanValue();
        }
        if (!a("com.eg.android.AlipayGphone")) {
            Log.e("APSDK.ZFBApiImlV1", "sendReq failed for alipay app signature check failed");
            return false;
        } else if (!baseReq.a()) {
            Log.e("APSDK.ZFBApiImlV1", "sendReq checkArgs fail");
            return false;
        } else {
            Bundle bundle = new Bundle();
            baseReq.toBundle(bundle);
            Context context = this.f6182a;
            return APMessageAct.sendToZFB(context, Constant.SEND_REQUEST_CONTENT_APPID + this.b, bundle);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (!this.c) {
            return true;
        }
        try {
            return a(this.f6182a.getPackageManager().getPackageInfo(str, 64).signatures);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private boolean a(Signature[] signatureArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4578bce4", new Object[]{this, signatureArr})).booleanValue();
        }
        if (!this.c) {
            return true;
        }
        for (Signature signature : signatureArr) {
            String charsString = signature.toCharsString();
            String str = "check signature:" + charsString;
            if (charsString.equals("30820244308201ad02044b28a3c9300d06092a864886f70d01010405003068310b300906035504061302636e3110300e060355040813076265696a696e673110300e060355040713076265696a696e67310f300d060355040a1306616c69706179310f300d060355040b1306616c69706179311330110603550403130a73686971756e2e7368693020170d3039313231363039303932395a180f32303531303131303039303932395a3068310b300906035504061302636e3110300e060355040813076265696a696e673110300e060355040713076265696a696e67310f300d060355040a1306616c69706179310f300d060355040b1306616c69706179311330110603550403130a73686971756e2e73686930819f300d06092a864886f70d010101050003818d0030818902818100b6cbad6cbd5ed0d209afc69ad3b7a617efaae9b3c47eabe0be42d924936fa78c8001b1fd74b079e5ff9690061dacfa4768e981a526b9ca77156ca36251cf2f906d105481374998a7e6e6e18f75ca98b8ed2eaf86ff402c874cca0a263053f22237858206867d210020daa38c48b20cc9dfd82b44a51aeb5db459b22794e2d6490203010001300d06092a864886f70d010104050003818100b6b5e3854b2d5daaa02d127195d13a1927991176047982feaa3d1625740788296443e9000fe14dfe6701d7e86be06b9282e68d4eff32b19d48555b8a0838a6e146238f048aca986715d7eab0fb445796bbd19360a7721b8d99ba04581af957a290c47302055f813862f3c40b840e95898e72a1de03b6257a1acad4b482cd815c")) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb72cc3a", new Object[]{bArr, bArr2})).booleanValue();
        }
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            if (bArr.length != bArr2.length) {
                Log.e("APSDK.ZFBApiImlV1", "checkSumConsistent fail, length is different");
                return false;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            return true;
        }
        Log.e("APSDK.ZFBApiImlV1", "checkSumConsistent fail, invalid arguments");
        return false;
    }
}
