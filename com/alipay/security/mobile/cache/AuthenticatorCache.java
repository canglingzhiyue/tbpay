package com.alipay.security.mobile.cache;

import android.content.Context;
import com.alipay.security.mobile.agent.AuthenticatorLock;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.util.CommonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class AuthenticatorCache {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_CACHE = -100;
    public static final long MAX_CACHE_TIME = 172800000;
    public static final long MIN_CACHE_TIME = 5000;
    private static AuthenticatorCache sInstance = new AuthenticatorCache();
    private long mCacheTime = 5000;
    private Map<String, Long> mFingerprintUserStatusValid = new HashMap();
    private Map<String, Integer> mFingerprintUserStatusCache = new HashMap();
    private long mFingerprintNumberValid = 0;
    private int mFingerprintNumberCache = -100;
    private String mFingerprintDeviceIDCache = null;
    private Map<String, Long> mBraceletUserStatusValid = new HashMap();
    private Map<String, Integer> mBraceletUserStatusCache = new HashMap();
    private String mBraceletDeviceIDCache = null;
    private String mCachedUserID = null;
    private Context mCachedContext = null;

    public static /* synthetic */ long access$000(AuthenticatorCache authenticatorCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a4081f4d", new Object[]{authenticatorCache})).longValue() : authenticatorCache.mCacheTime;
    }

    public static /* synthetic */ Context access$100(AuthenticatorCache authenticatorCache) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("231a1b0", new Object[]{authenticatorCache}) : authenticatorCache.mCachedContext;
    }

    public static /* synthetic */ void access$200(AuthenticatorCache authenticatorCache, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38db551b", new Object[]{authenticatorCache, context, str});
        } else {
            authenticatorCache.refreshFingerprintCache(context, str);
        }
    }

    public static /* synthetic */ void access$300(AuthenticatorCache authenticatorCache, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c41c45c", new Object[]{authenticatorCache, context, str});
        } else {
            authenticatorCache.refreshBraceletCache(context, str);
        }
    }

    private AuthenticatorCache() {
    }

    public static synchronized AuthenticatorCache getInstance() {
        synchronized (AuthenticatorCache.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AuthenticatorCache) ipChange.ipc$dispatch("ddfdce32", new Object[0]);
            }
            return sInstance;
        }
    }

    private IAuthenticator create(Context context, int i) {
        IAuthenticator create;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("8b63650b", new Object[]{this, context, new Integer(i)});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            create = AuthenticatorFactory.create(context.getApplicationContext(), i);
        }
        return create;
    }

    private void refreshFingerprintCache(Context context, String str) {
        IAuthenticator create;
        int init;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76392d92", new Object[]{this, context, str});
            return;
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            if (CommonUtils.isBlank(str)) {
                str = this.mCachedUserID;
            }
            Context applicationContext = context.getApplicationContext();
            try {
                create = create(applicationContext, 1);
                init = create.init(applicationContext, new AuthenticatorCallback() { // from class: com.alipay.security.mobile.cache.AuthenticatorCache.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                        }
                    }
                }, str);
            } catch (Exception e) {
                AuthenticatorLOG.error(e);
            }
            if (init != 111 && init != 105 && init != 106 && init != 126) {
                clearFingerprintCacheAll();
                this.mFingerprintNumberCache = create.registedFingerPrintNumber();
                this.mFingerprintNumberValid = System.currentTimeMillis() + this.mCacheTime;
                this.mFingerprintDeviceIDCache = create.getDeviceId();
                if (!CommonUtils.isBlank(str)) {
                    this.mFingerprintUserStatusCache.put(str, Integer.valueOf(create.checkUserStatus(str)));
                    this.mFingerprintUserStatusValid.put(str, Long.valueOf(System.currentTimeMillis() + this.mCacheTime));
                    this.mCachedUserID = str;
                }
            }
        }
    }

    private void refreshBraceletCache(Context context, String str) {
        IAuthenticator create;
        int init;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81e008c", new Object[]{this, context, str});
            return;
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            if (CommonUtils.isBlank(str)) {
                str = this.mCachedUserID;
            }
            Context applicationContext = context.getApplicationContext();
            try {
                create = create(applicationContext, 2);
                init = create.init(applicationContext, new AuthenticatorCallback() { // from class: com.alipay.security.mobile.cache.AuthenticatorCache.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                    public void callback(AuthenticatorResponse authenticatorResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                        }
                    }
                }, str);
            } catch (Exception e) {
                AuthenticatorLOG.error(e);
            }
            if (init != 111 && init != 105 && init != 106 && init != 126) {
                clearBraceletCacheAll();
                this.mBraceletDeviceIDCache = create.getDeviceId();
                if (!CommonUtils.isBlank(str)) {
                    this.mBraceletUserStatusCache.put(str, Integer.valueOf(create.checkUserStatus(str)));
                    this.mBraceletUserStatusValid.put(str, Long.valueOf(System.currentTimeMillis() + this.mCacheTime));
                    this.mCachedUserID = str;
                }
            }
        }
    }

    public void refreshCache(Context context, final String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a85ee0", new Object[]{this, context, str, new Long(j)});
            return;
        }
        if (context != null) {
            this.mCachedContext = context.getApplicationContext();
        }
        if (this.mCachedContext == null) {
            return;
        }
        long j2 = this.mCacheTime;
        if (j2 > j) {
            j = j2;
        }
        this.mCacheTime = j;
        new Thread(new Runnable() { // from class: com.alipay.security.mobile.cache.AuthenticatorCache.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (AuthenticatorLock.INIT_LOCK) {
                    try {
                        AuthenticatorLOG.fpInfo("refreshCache enter [userID:" + str + "] [cachetime:" + AuthenticatorCache.access$000(AuthenticatorCache.this) + riy.ARRAY_END_STR);
                        long currentTimeMillis = System.currentTimeMillis();
                        AuthenticatorCache.access$200(AuthenticatorCache.this, AuthenticatorCache.access$100(AuthenticatorCache.this), str);
                        AuthenticatorCache.access$300(AuthenticatorCache.this, AuthenticatorCache.access$100(AuthenticatorCache.this), str);
                        AuthenticatorLOG.fpInfo("refreshCache exit [] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + riy.ARRAY_END_STR);
                    } catch (Exception e) {
                        AuthenticatorLOG.error(e);
                    }
                }
            }
        }).start();
    }

    public void clearFingerprintCacheAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c1d79bd", new Object[]{this});
            return;
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            this.mFingerprintUserStatusCache.clear();
            this.mFingerprintUserStatusValid.clear();
            this.mFingerprintNumberCache = -100;
            this.mFingerprintNumberValid = 0L;
        }
    }

    public void clearBraceletCacheAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63628db", new Object[]{this});
            return;
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            this.mBraceletUserStatusCache.clear();
            this.mBraceletUserStatusValid.clear();
        }
    }

    public void clearFingerprintUserStatusCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5eea15", new Object[]{this});
            return;
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            this.mFingerprintUserStatusCache.clear();
            this.mFingerprintUserStatusValid.clear();
        }
    }

    public void clearBraceletUserStatusCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11569d37", new Object[]{this});
            return;
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            this.mBraceletUserStatusCache.clear();
            this.mBraceletUserStatusValid.clear();
        }
    }

    public int getFingerprintUserStatusCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7b3db9b", new Object[]{this, str})).intValue();
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            if (CommonUtils.isBlank(str)) {
                return -100;
            }
            if (this.mFingerprintUserStatusValid.size() != 0 && this.mFingerprintUserStatusCache.size() != 0) {
                if (this.mFingerprintUserStatusValid.containsKey(str) && this.mFingerprintUserStatusCache.containsKey(str)) {
                    if (this.mFingerprintUserStatusValid.get(str).longValue() < System.currentTimeMillis()) {
                        return -100;
                    }
                    return this.mFingerprintUserStatusCache.get(str).intValue();
                }
                return -100;
            }
            return -100;
        }
    }

    public int getFingerprintNumberCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89000025", new Object[]{this})).intValue();
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            if (this.mFingerprintNumberValid < System.currentTimeMillis()) {
                return -100;
            }
            return this.mFingerprintNumberCache;
        }
    }

    public String getFingerprintDeviceIDCache() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b49efd6", new Object[]{this});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            str = this.mFingerprintDeviceIDCache;
        }
        return str;
    }

    public int getBraceletUserStatusCache(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51ee48cb", new Object[]{this, str})).intValue();
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            if (CommonUtils.isBlank(str)) {
                return -100;
            }
            if (this.mBraceletUserStatusValid.size() != 0 && this.mBraceletUserStatusCache.size() != 0) {
                if (this.mBraceletUserStatusValid.containsKey(str) && this.mBraceletUserStatusCache.containsKey(str)) {
                    if (this.mBraceletUserStatusValid.get(str).longValue() < System.currentTimeMillis()) {
                        return -100;
                    }
                    return this.mBraceletUserStatusCache.get(str).intValue();
                }
                return -100;
            }
            return -100;
        }
    }

    public String getBraceletDeviceIDCache() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11fa10a6", new Object[]{this});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            str = this.mBraceletDeviceIDCache;
        }
        return str;
    }
}
