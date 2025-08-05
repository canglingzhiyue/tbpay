package com.alipay.security.mobile.fingerprint.vendor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import com.alipay.security.mobile.agent.AlipayAuthenticator;
import com.alipay.security.mobile.agent.AuthenticatorLock;
import com.alipay.security.mobile.agent.Version;
import com.alipay.security.mobile.alipayauthenticatorservice.bracelet.util.DeviceInfoUtil;
import com.alipay.security.mobile.auth.AbstractAuthenticator;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import tb.riy;

/* loaded from: classes3.dex */
public class VendorFingerPrint extends AbstractAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_UI_STATUS_ACTION = "com.alipay.security.mobile.alipayauthenticatorservice.broadcast.UI_STATUS_ACTION";
    private static final String KEY_DEVICEID = "deviceid";
    private static final String SECURITY_PREFERENCE = "securitypreference00";
    public static final String UI_STATUS_VALUE = "com.alipay.security.mobile.alipayauthenticatorservice.broadcast.UI_STATUS_VALUE";
    public static int minVersion = 6;
    public static int updateVersion = 7;
    private String packageName;
    private int protocalType;
    private int protocalVersion;
    private String serverUrl;
    private int vendor;
    private int mResult = 101;
    private Object lock = new Object();
    private String mCachedDeviceId = "";
    private int mUserStatusCache = 2;
    private long mUserStatusValid = 0;
    private String mLastUserID = "";
    private int mFingerPrintNumberCache = 6;
    private long mFingerPrintNumberValid = 0;

    /* loaded from: classes3.dex */
    public interface InitCallback {
        void callback(int i);
    }

    public static /* synthetic */ Object ipc$super(VendorFingerPrint vendorFingerPrint, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    public void doAuthenticate(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffdad8b3", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    public void doDeregister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5585984", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator
    public void doRegister(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86a1f25", new Object[]{this, authenticatorMessage, authenticatorCallback});
        }
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        }
    }

    public static /* synthetic */ Context access$000(VendorFingerPrint vendorFingerPrint) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d405f6ed", new Object[]{vendorFingerPrint}) : vendorFingerPrint.context;
    }

    public static /* synthetic */ int access$102(VendorFingerPrint vendorFingerPrint, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("100eb824", new Object[]{vendorFingerPrint, new Integer(i)})).intValue();
        }
        vendorFingerPrint.mResult = i;
        return i;
    }

    public static /* synthetic */ Object access$200(VendorFingerPrint vendorFingerPrint) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dddae2df", new Object[]{vendorFingerPrint}) : vendorFingerPrint.lock;
    }

    public VendorFingerPrint(int i, int i2, int i3, String str, String str2) {
        this.vendor = -1;
        this.protocalType = -1;
        this.protocalVersion = -1;
        this.packageName = null;
        this.serverUrl = null;
        this.vendor = i;
        this.protocalType = i2;
        this.protocalVersion = i3;
        this.packageName = str;
        this.serverUrl = str2;
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void process(AuthenticatorMessage authenticatorMessage, AuthenticatorCallback authenticatorCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cb5a824", new Object[]{this, authenticatorMessage, authenticatorCallback});
            return;
        }
        AuthenticatorLOG.fpInfo("VendorFingerPrint.processAsyn enter [type:" + authenticatorMessage.getType() + riy.ARRAY_END_STR);
        new Thread(new VendorFingerPrintsOperation(authenticatorMessage, authenticatorCallback, this.vendor)).start();
        if (authenticatorMessage.getType() == 3) {
            if (Version.readServiceVersion(this.context) < minVersion) {
                CommonUtils.notifyUpdate(this.context, "alipays://platformapi/startApp?appId=20000082", this.serverUrl);
                return;
            } else {
                new Thread(new Runnable() { // from class: com.alipay.security.mobile.fingerprint.vendor.VendorFingerPrint.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            AuthenticatorMessage authenticatorMessage2 = new AuthenticatorMessage();
                            authenticatorMessage2.setType(17);
                            String process = VendorFingerPrint.this.process(authenticatorMessage2);
                            if (CommonUtils.isBlank(process)) {
                                return;
                            }
                            CommonUtils.notifyUpdate(VendorFingerPrint.access$000(VendorFingerPrint.this), "alipays://platformapi/startApp?appId=20000082", process);
                        } catch (Exception e) {
                            AuthenticatorLOG.error(e);
                        }
                    }
                }).start();
                return;
            }
        }
        this.mUserStatusCache = 2;
        this.mUserStatusValid = 0L;
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public String process(AuthenticatorMessage authenticatorMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f121a629", new Object[]{this, authenticatorMessage});
        }
        if (authenticatorMessage == null) {
            return null;
        }
        AuthenticatorLOG.fpInfo("VendorFingerPrint.process enter [type:" + authenticatorMessage.getType() + riy.ARRAY_END_STR);
        Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, authenticatorMessage.getType());
        bundle.putInt(AuthenticatorMessage.KEY_VENDOR_TYPE, this.vendor);
        Bundle process = AlipayAuthenticator.Instance().process(bundle);
        if (process == null) {
            return null;
        }
        String string = process.getString(AuthenticatorMessage.KEY_MESSAGE);
        if (authenticatorMessage.getType() == 17 && CommonUtils.isBlank(string)) {
            int readServiceVersion = Version.readServiceVersion(this.context);
            if (readServiceVersion < updateVersion) {
                return this.serverUrl;
            }
            if (this.packageName.equals("com.alipay.security.mobile.authentication.huawei") && readServiceVersion < 10) {
                return this.serverUrl;
            }
        }
        AuthenticatorLOG.fpInfo("VendorFingerPrint.process exit [result:" + string + riy.ARRAY_END_STR);
        return string;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public String getDeviceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            String fingerprintDeviceIDCache = AuthenticatorCache.getInstance().getFingerprintDeviceIDCache();
            if (!CommonUtils.isBlank(fingerprintDeviceIDCache)) {
                return fingerprintDeviceIDCache;
            }
            if (CommonUtils.isBlank(this.mCachedDeviceId)) {
                this.mCachedDeviceId = getDeviceIdInternal();
            }
            return this.mCachedDeviceId;
        }
    }

    private String getDeviceIdInternal() {
        byte[] byteArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("525e1a15", new Object[]{this});
        }
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(SECURITY_PREFERENCE, 0);
        String string = sharedPreferences.getString(KEY_DEVICEID, null);
        if (string != null) {
            return string;
        }
        if (this.protocalVersion == 2) {
            String imei = DeviceInfoUtil.getIMEI(this.context);
            if (imei != null && imei.trim().length() > 11) {
                String sha_hash = sha_hash(imei);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(KEY_DEVICEID, sha_hash);
                edit.commit();
                return sha_hash;
            }
            Random random = new Random();
            String sha_hash2 = sha_hash(Build.MODEL + random.nextLong());
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putString(KEY_DEVICEID, sha_hash2);
            edit2.commit();
            return sha_hash2;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, 12);
        bundle.putInt(AuthenticatorMessage.KEY_VENDOR_TYPE, this.vendor);
        Bundle process = AlipayAuthenticator.Instance().process(bundle);
        if (process == null || (byteArray = process.getByteArray("DEVICEID")) == null) {
            return null;
        }
        String encodeToString = Base64.encodeToString(byteArray, 2);
        SharedPreferences.Editor edit3 = sharedPreferences.edit();
        edit3.putString(KEY_DEVICEID, encodeToString);
        edit3.commit();
        return encodeToString;
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        Intent intent = new Intent(BROADCAST_UI_STATUS_ACTION);
        intent.putExtra(UI_STATUS_VALUE, 0);
        intent.setPackage(this.packageName);
        this.context.sendBroadcast(intent);
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public AuthInfo getAuthInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuthInfo) ipChange.ipc$dispatch("5ac464a", new Object[]{this}) : new AuthInfo(Constants.TYPE_FINGERPRINT, this.vendor, this.protocalType, this.protocalVersion, Build.MODEL, this.serverUrl);
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public int checkUserStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e76e2389", new Object[]{this, str})).intValue();
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            AuthenticatorLOG.fpInfo("checkUserStatus enter [userID:" + str + riy.ARRAY_END_STR);
            int fingerprintUserStatusCache = AuthenticatorCache.getInstance().getFingerprintUserStatusCache(str);
            if (fingerprintUserStatusCache != -100) {
                AuthenticatorLOG.fpInfo("checkUserStatus exit [status:" + fingerprintUserStatusCache + "] [from cache]");
                return fingerprintUserStatusCache;
            } else if (this.mUserStatusValid > System.currentTimeMillis() && str != null && str.equals(this.mLastUserID)) {
                AuthenticatorLOG.fpInfo("checkUserStatus exit [status:" + this.mUserStatusCache + "] [from cache]");
                return this.mUserStatusCache;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                this.mUserStatusCache = checkUserStatusInternal(str);
                this.mUserStatusValid = System.currentTimeMillis() + 5000;
                this.mLastUserID = str;
                AuthenticatorLOG.fpInfo("checkUserStatus exit [status:" + this.mUserStatusCache + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + riy.ARRAY_END_STR);
                return this.mUserStatusCache;
            }
        }
    }

    private int checkUserStatusInternal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a1b45a6", new Object[]{this, str})).intValue();
        }
        Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, 14);
        bundle.putString(AuthenticatorMessage.KEY_USERID, str);
        bundle.putInt(AuthenticatorMessage.KEY_VENDOR_TYPE, this.vendor);
        Bundle process = AlipayAuthenticator.Instance().process(bundle);
        if (process == null) {
            return -1;
        }
        int i = process.getInt(AuthenticatorMessage.KEY_USERSTATUS);
        String str2 = "AuthenticatorMessage user status result:" + i;
        return i;
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public int registedFingerPrintNumber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f7fc392", new Object[]{this})).intValue();
        }
        if (this.protocalVersion == 2) {
            return 1;
        }
        AuthenticatorLOG.fpInfo("registedFingerPrintNumber enter []");
        int fingerprintNumberCache = AuthenticatorCache.getInstance().getFingerprintNumberCache();
        if (fingerprintNumberCache != -100) {
            AuthenticatorLOG.fpInfo("registedFingerPrintNumber exit [number:" + fingerprintNumberCache + "] [from cache]");
            return fingerprintNumberCache;
        } else if (this.mFingerPrintNumberValid > System.currentTimeMillis()) {
            AuthenticatorLOG.fpInfo("registedFingerPrintNumber exit [number:" + this.mFingerPrintNumberCache + "] [from cache]");
            return this.mFingerPrintNumberCache;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            this.mFingerPrintNumberCache = registedFingerPrintNumberInternal();
            this.mFingerPrintNumberValid = System.currentTimeMillis() + 5000;
            AuthenticatorLOG.fpInfo("registedFingerPrintNumber exit [number:" + this.mFingerPrintNumberCache + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + riy.ARRAY_END_STR);
            return this.mFingerPrintNumberCache;
        }
    }

    private int registedFingerPrintNumberInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("281a9fef", new Object[]{this})).intValue();
        }
        Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, 13);
        bundle.putInt(AuthenticatorMessage.KEY_VENDOR_TYPE, this.vendor);
        Bundle process = AlipayAuthenticator.Instance().process(bundle);
        if (process != null) {
            return process.getInt(AuthenticatorMessage.FINGERPRINTS_NUM);
        }
        return 0;
    }

    @Override // com.alipay.security.mobile.auth.AbstractAuthenticator, com.alipay.security.mobile.auth.IAuthenticator
    public void prapareKeyPair() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7a9a6dd", new Object[]{this});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(AuthenticatorMessage.KEY_OPERATIONT_TYPE, 15);
        bundle.putInt(AuthenticatorMessage.KEY_VENDOR_TYPE, this.vendor);
        AlipayAuthenticator.Instance().process(bundle);
    }

    @Override // com.alipay.security.mobile.auth.IAuthenticator
    public int init(Context context, AuthenticatorCallback authenticatorCallback, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("531a0767", new Object[]{this, context, authenticatorCallback, str})).intValue();
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            AuthenticatorLOG.fpInfo("VendorFingerPrint_init enter [userID:" + str + "] [model:" + Build.MODEL + riy.ARRAY_END_STR);
            if (context != null) {
                context = context.getApplicationContext();
            }
            Version.SERVICE_PACKAGE_NAME = this.packageName;
            Version.agentVersionCode = 2;
            this.context = context;
            this.mResult = AlipayAuthenticator.Instance().init(context, new InitCallback() { // from class: com.alipay.security.mobile.fingerprint.vendor.VendorFingerPrint.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.security.mobile.fingerprint.vendor.VendorFingerPrint.InitCallback
                public void callback(int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5331c237", new Object[]{this, new Integer(i2)});
                        return;
                    }
                    VendorFingerPrint.access$102(VendorFingerPrint.this, i2);
                    synchronized (VendorFingerPrint.access$200(VendorFingerPrint.this)) {
                        VendorFingerPrint.access$200(VendorFingerPrint.this).notify();
                    }
                }
            });
            synchronized (this.lock) {
                try {
                    if (this.mResult == 100) {
                        this.lock.wait(2000L);
                    }
                } catch (InterruptedException unused) {
                }
            }
            if (this.mResult == 122) {
                this.mResult = 100;
            }
            if (this.mResult == 100 && Version.readServiceVersion(context) < minVersion) {
                this.mResult = 127;
            }
            AuthenticatorLOG.fpInfo("VendorFingerPrint_init exit [result:" + this.mResult + riy.ARRAY_END_STR);
            i = this.mResult;
        }
        return i;
    }

    private String sha_hash(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92bbde4e", new Object[]{this, str});
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            String str2 = "";
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                str2 = hexString.length() == 1 ? str2 + "0" + hexString : str2 + hexString;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }
}
