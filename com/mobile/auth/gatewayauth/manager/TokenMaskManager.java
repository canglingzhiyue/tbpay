package com.mobile.auth.gatewayauth.manager;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.mobile.auth.O0Oo00;
import com.mobile.auth.O0o;
import com.mobile.auth.OO000o;
import com.mobile.auth.OO00OO;
import com.mobile.auth.OO0oO;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.ResultCode;
import com.mobile.auth.gatewayauth.manager.O000000o;
import com.mobile.auth.gatewayauth.manager.base.Cache;
import com.mobile.auth.gatewayauth.manager.base.CacheKey;
import com.mobile.auth.gatewayauth.model.LoginPhoneInfo;
import com.mobile.auth.gatewayauth.network.UTSharedPreferencesHelper;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.mobile.auth.gatewayauth.utils.TokenGenerator;
import com.mobile.auth.ooO0Ooo;
import com.nirvana.tools.jsoner.a;
import com.nirvana.tools.jsoner.d;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import tb.czf;
import tb.czg;
import tb.czk;
import tb.czn;
import tb.czp;
import tb.dax;
import tb.dba;

/* loaded from: classes4.dex */
public class TokenMaskManager {
    private O00000Oo O000000o;
    private SystemManager O00000Oo;
    private VendorSdkInfoManager O00000o;
    private O00000o O00000o0;
    private O0000OOo O00000oO;
    private TokenGenerator O00000oo;
    private OO0oO O0000O0o;
    private czf O0000Ooo;
    private czf O0000o0;
    private czf O0000o00;
    private czf O0000o0O;
    private czg O0000o0o;
    private volatile Map<String, LoginPhoneInfo> O0000OOo = new ConcurrentHashMap();
    private volatile Cache<LoginPhoneInfo> O0000Oo0 = null;
    private volatile LruCache<String, Cache<String>> O0000Oo = new LruCache<>(10);
    private volatile LruCache<String, Cache<String>> O0000OoO = new LruCache<>(10);

    public TokenMaskManager(O00000Oo o00000Oo, SystemManager systemManager, O00000o o00000o, O0000OOo o0000OOo, VendorSdkInfoManager vendorSdkInfoManager) {
        this.O000000o = o00000Oo;
        this.O00000Oo = systemManager;
        this.O00000o0 = o00000o;
        this.O0000O0o = this.O00000o0.O000000o();
        this.O00000o = vendorSdkInfoManager;
        this.O00000oO = o0000OOo;
        this.O00000oo = new TokenGenerator(this.O0000O0o, this.O00000Oo, this.O00000o);
        this.O0000o0o = czg.a(this.O00000Oo.O00000oO());
        O00000Oo();
        com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TokenMaskManager.O000000o(TokenMaskManager.this);
                    TokenMaskManager.O00000Oo(TokenMaskManager.this);
                    TokenMaskManager.O00000o0(TokenMaskManager.this);
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                    }
                }
            }
        });
    }

    static /* synthetic */ String O000000o(TokenMaskManager tokenMaskManager, String str, String str2, boolean z) {
        try {
            return tokenMaskManager.O000000o(str, str2, z);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private String O000000o(String str, CacheKey cacheKey, long j) {
        try {
            return popToken(str, cacheKey, this.O0000Ooo, this.O0000Oo, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private String O000000o(String str, String str2, CacheKey cacheKey, long j) {
        try {
            return popToken(str, cacheKey, this.O0000o00, this.O0000OoO, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private String O000000o(String str, String str2, boolean z) {
        try {
            O000000o O000000o = this.O00000oO.O000000o(str2);
            LoginPhoneInfo O000000o2 = O000000o(this.O00000Oo.getSimCacheKey(false, str2));
            return this.O00000oo.O000000o(this.O00000Oo.O00000oO(), EncryptUtils.generateAesKey(), str, str2, z, O000000o.O000000o(), O000000o.O00000Oo(), this.O00000Oo.O00000Oo(str2), this.O00000o.O00000o(), O000000o2 != null ? O000000o2.getPhoneNumber() : null);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    static /* synthetic */ void O000000o(TokenMaskManager tokenMaskManager) {
        try {
            tokenMaskManager.O00000o0();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(TokenMaskManager tokenMaskManager, CacheKey cacheKey, LoginPhoneInfo loginPhoneInfo, String str) {
        try {
            tokenMaskManager.O000000o(cacheKey, loginPhoneInfo, str);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O000000o(TokenMaskManager tokenMaskManager, String str, String str2, CacheKey cacheKey, String str3, long j) {
        try {
            tokenMaskManager.O00000Oo(str, str2, cacheKey, str3, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private synchronized void O000000o(CacheKey cacheKey, LoginPhoneInfo loginPhoneInfo, String str) {
        if (loginPhoneInfo == null) {
            return;
        }
        if (O00000Oo(cacheKey)) {
            cacheKey = this.O00000Oo.getSimCacheKey(false, str);
        }
        if (O00000Oo(cacheKey)) {
            return;
        }
        if (cacheKey.isLocalIp()) {
            this.O0000Oo0 = Cache.newIpCache().O000000o(cacheKey.getKey()).O000000o((Cache.O000000o) loginPhoneInfo).O000000o(System.currentTimeMillis() + 86400000).O000000o();
            com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        TokenMaskManager.O0000O0o(TokenMaskManager.this).a(TokenMaskManager.O00000oo(TokenMaskManager.this).encryptContent(TokenMaskManager.O00000oO(TokenMaskManager.this).toJson().toString()));
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } else {
            try {
                this.O0000OOo.put(cacheKey.getKey(), loginPhoneInfo);
                final JSONObject jSONObject = new JSONObject();
                for (Map.Entry<String, LoginPhoneInfo> entry : this.O0000OOo.entrySet()) {
                    jSONObject.put(entry.getKey(), a.a(entry.getValue(), (List<Field>) null));
                }
                com.mobile.auth.gatewayauth.utils.O0000O0o.O000000o(new Runnable() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.8
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            TokenMaskManager.O0000OOo(TokenMaskManager.this).a(TokenMaskManager.O00000oo(TokenMaskManager.this).encryptContent(jSONObject.toString()));
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                });
            } catch (Exception e) {
                this.O0000O0o.O00000o("Cache mask error!", czp.a(e));
            }
        }
    }

    private synchronized void O000000o(String str, String str2, CacheKey cacheKey, String str3, long j) {
        if (StringUtils.isEmpty(str3)) {
            return;
        }
        if (O00000Oo(cacheKey)) {
            cacheKey = this.O00000Oo.getSimCacheKey(false, str2);
        }
        if (O00000Oo(cacheKey)) {
            return;
        }
        Cache cache = this.O0000OoO.get(str);
        if (cache == null) {
            cache = Cache.newIpCache().O000000o();
            this.O0000OoO.put(str, cache);
        }
        cache.setKey(cacheKey.getKey());
        cache.setValue(O000000o(str3, str2, false));
        cache.setExpiredTime(j);
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Cache<String>> entry : this.O0000OoO.snapshot().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue().toJson());
            }
        } catch (Exception e) {
            this.O0000O0o.O00000o("Cache verify token error!", czp.a(e));
        }
        this.O0000o00.a(this.O00000Oo.encryptContent(jSONObject.toString()));
    }

    private boolean O000000o(String str, String str2, long j) {
        try {
            if (this.O0000Oo != null) {
                return O000000o(str, str2, this.O0000Oo, j);
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private synchronized boolean O000000o(String str, String str2, LruCache<String, Cache<String>> lruCache, long j) {
        try {
            if (StringUtils.isEmpty(str)) {
                return false;
            }
            return this.O00000Oo.O000000o(str2, lruCache.get(str), j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    private void O00000Oo() {
        try {
            czf a2 = this.O0000o0o.a("key_handler_login_token");
            this.O0000Ooo = a2;
            if (a2 == null) {
                this.O0000Ooo = this.O0000o0o.a("key_handler_login_token", (String) new czk(1, true, "AUTH_APP_INFO", UTSharedPreferencesHelper.LOGIN_TOKEN_KEY));
            }
            czf a3 = this.O0000o0o.a("key_handler_verify_token");
            this.O0000o00 = a3;
            if (a3 == null) {
                this.O0000o00 = this.O0000o0o.a("key_handler_verify_token", (String) new czk(1, true, "AUTH_APP_INFO", UTSharedPreferencesHelper.VERIFY_TOKEN_KEY));
            }
            czf a4 = this.O0000o0o.a("key_handler_imsi_mask");
            this.O0000o0 = a4;
            if (a4 == null) {
                this.O0000o0 = this.O0000o0o.a("key_handler_imsi_mask", (String) new czk(1, true, "AUTH_APP_INFO", UTSharedPreferencesHelper.MASK_IMSI_KEY));
            }
            czf a5 = this.O0000o0o.a("key_handler_ip_mask");
            this.O0000o0O = a5;
            if (a5 != null) {
                return;
            }
            this.O0000o0O = this.O0000o0o.a("key_handler_ip_mask", (String) new czk(1, true, "AUTH_APP_INFO", UTSharedPreferencesHelper.MASK_LOCAL_IP_KEY));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O00000Oo(TokenMaskManager tokenMaskManager) {
        try {
            tokenMaskManager.O00000o();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ void O00000Oo(TokenMaskManager tokenMaskManager, String str, String str2, CacheKey cacheKey, String str3, long j) {
        try {
            tokenMaskManager.O000000o(str, str2, cacheKey, str3, j);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private synchronized void O00000Oo(String str, String str2, CacheKey cacheKey, String str3, long j) {
        if (!StringUtils.isEmpty(str3) || !O00000Oo(cacheKey)) {
            Cache cache = this.O0000Oo.get(str);
            if (cache == null) {
                cache = Cache.newIpCache().O000000o();
                this.O0000Oo.put(str, cache);
            }
            cache.setKey(cacheKey.getKey());
            cache.setValue(O000000o(str3, str2, true));
            cache.setExpiredTime(j);
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, Cache<String>> entry : this.O0000Oo.snapshot().entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue().toJson());
                }
            } catch (Exception e) {
                this.O0000O0o.O00000o("Cache login token error!", czp.a(e));
            }
            this.O0000Ooo.a(this.O00000Oo.encryptContent(jSONObject.toString()));
        }
    }

    private boolean O00000Oo(CacheKey cacheKey) {
        if (cacheKey != null) {
            try {
                return StringUtils.isEmpty(cacheKey.getKey());
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return false;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return false;
                }
            }
        }
        return true;
    }

    private boolean O00000Oo(String str, String str2, long j) {
        try {
            if (this.O0000OoO != null) {
                return O000000o(str, str2, this.O0000OoO, j);
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    static /* synthetic */ OO0oO O00000o(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O0000O0o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void O00000o() {
        try {
            String decryptContent = this.O00000Oo.decryptContent(this.O0000Ooo.a());
            HashMap hashMap = null;
            if (!StringUtils.isEmpty(decryptContent)) {
                JSONObject jSONObject = new JSONObject(decryptContent);
                if (jSONObject.length() > 0) {
                    hashMap = new HashMap(jSONObject.length());
                }
                Iterator<String> keys = jSONObject.keys();
                d<String> dVar = new d<String>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.5
                };
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Cache.fromJson(jSONObject.optJSONObject(next), dVar));
                }
            }
            if (hashMap != null) {
                this.O0000Oo.evictAll();
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.O0000Oo.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            this.O0000O0o.O00000o("loadLoginTokenFromDisk failed!", czp.a(e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void O00000o0() {
        Cache<LoginPhoneInfo> cache;
        try {
            String decryptContent = this.O00000Oo.decryptContent(this.O0000o0.a());
            cache = null;
            if (!StringUtils.isEmpty(decryptContent)) {
                JSONObject jSONObject = new JSONObject(decryptContent);
                Iterator<String> keys = jSONObject.keys();
                if (jSONObject.length() > 0) {
                    this.O0000OOo = new ConcurrentHashMap(jSONObject.length());
                }
                while (keys != null && keys.hasNext()) {
                    String next = keys.next();
                    this.O0000OOo.put(next, a.a(jSONObject.optJSONObject(next), new LoginPhoneInfo(), (List<Field>) null));
                }
            }
            String decryptContent2 = this.O00000Oo.decryptContent(this.O0000o0O.a());
            if (!StringUtils.isEmpty(decryptContent2)) {
                cache = Cache.fromJson(new JSONObject(decryptContent2), new d<LoginPhoneInfo>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.4
                });
            }
        } catch (Exception e) {
            this.O0000O0o.O00000o("loadMaskFromDisk error!", czp.a(e));
        }
        if (cache != null) {
            this.O0000Oo0 = cache;
        } else {
            UTSharedPreferencesHelper.putAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.MASK_LOCAL_IP_KEY, "");
        }
    }

    static /* synthetic */ void O00000o0(TokenMaskManager tokenMaskManager) {
        try {
            tokenMaskManager.O00000oO();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ Cache O00000oO(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O0000Oo0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void O00000oO() {
        try {
            String decryptContent = this.O00000Oo.decryptContent(this.O0000o00.a());
            HashMap hashMap = null;
            if (!StringUtils.isEmpty(decryptContent)) {
                JSONObject jSONObject = new JSONObject(decryptContent);
                if (jSONObject.length() > 0) {
                    hashMap = new HashMap(jSONObject.length());
                }
                Iterator<String> keys = jSONObject.keys();
                d<String> dVar = new d<String>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.6
                };
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Cache.fromJson(jSONObject.optJSONObject(next), dVar));
                }
            }
            if (hashMap != null) {
                this.O0000OoO.evictAll();
                for (Map.Entry entry : hashMap.entrySet()) {
                    this.O0000OoO.put(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {
            this.O0000O0o.O00000o("loadVerifyTokenFromDisk failed!", czp.a(e));
        }
    }

    static /* synthetic */ SystemManager O00000oo(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private synchronized void O00000oo() {
        try {
            if (this.O0000OOo != null) {
                this.O0000OOo.clear();
            }
            UTSharedPreferencesHelper.clearAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.MASK_IMSI_KEY);
            if (this.O0000Oo0 != null) {
                this.O0000Oo0.clear();
            }
            UTSharedPreferencesHelper.clearAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.MASK_LOCAL_IP_KEY);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ czf O0000O0o(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O0000o0O;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private synchronized void O0000O0o() {
        try {
            if (this.O0000Oo != null) {
                this.O0000Oo.evictAll();
            }
            UTSharedPreferencesHelper.clearAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.LOGIN_TOKEN_KEY);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    static /* synthetic */ czf O0000OOo(TokenMaskManager tokenMaskManager) {
        try {
            return tokenMaskManager.O0000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private synchronized void O0000OOo() {
        try {
            if (this.O0000OoO != null) {
                this.O0000OoO.evictAll();
            }
            UTSharedPreferencesHelper.clearAppInfo(this.O00000Oo.O00000oO(), UTSharedPreferencesHelper.VERIFY_TOKEN_KEY);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    private synchronized String popToken(String str, CacheKey cacheKey, czf czfVar, LruCache<String, Cache<String>> lruCache, long j) {
        if (O00000Oo(cacheKey)) {
            return null;
        }
        if (!O000000o(str, cacheKey.getKey(), lruCache, j)) {
            this.O0000O0o.O000000o("There's no valid token!");
            return null;
        }
        Cache<String> cache = lruCache.get(str);
        if (cache != null) {
            try {
                if (cache.getKey() != null && cache.getKey().equals(cacheKey.getKey())) {
                    lruCache.remove(str);
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, Cache<String>> entry : lruCache.snapshot().entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue().toJson());
                    }
                    String jSONObject2 = jSONObject.toString();
                    czfVar.a(czn.b(jSONObject2, this.O00000Oo.O000000o() + this.O00000Oo.O00000Oo()));
                    return cache.getValue();
                }
            } catch (Exception e) {
                this.O0000O0o.O00000o("pop token failed!", czp.a(e));
                return null;
            }
        }
        return null;
    }

    private void requestMask(long j, String str, final RequestCallback<OO000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, CacheKey cacheKey, String str2, int i, final String str3, final String str4) {
        try {
            if (this.O000000o.O000000o(i)) {
                requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
                return;
            }
            this.O000000o.O00000Oo(i);
            com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "addLimitCount", System.currentTimeMillis());
            dba.a().a(new O0o(new O0Oo00(this.O00000oO, str, j, str3) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.12
                @Override // com.mobile.auth.O0Oo00
                public void O000000o(RequestCallback requestCallback2, O000000o o000000o) {
                    try {
                        o000000o.O000000o(requestCallback2, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o());
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, new dax<OO000o>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.11
                public void O000000o(OO000o oO000o) {
                    try {
                        if (oO000o.O000000o()) {
                            requestCallback.onSuccess(oO000o);
                            return;
                        }
                        com.mobile.auth.gatewayauth.manager.base.O00000Oo O00000Oo = oO000o.O00000Oo();
                        if (O00000Oo == null) {
                            O00000Oo = com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                        }
                        requestCallback.onError(O00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // tb.dax
                public /* synthetic */ void onResult(OO000o oO000o) {
                    try {
                        O000000o(oO000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, j, str3));
            com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "createCallable", System.currentTimeMillis());
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public LoginPhoneInfo O000000o(CacheKey cacheKey) {
        try {
            if (O00000Oo(cacheKey)) {
                return null;
            }
            return (!cacheKey.isLocalIp() || this.O0000Oo0 == null || !cacheKey.getKey().equals(this.O0000Oo0.getKey())) ? this.O0000OOo.get(cacheKey.getKey()) : this.O0000Oo0.getValue();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public synchronized void O000000o() {
        try {
            for (O000000o o000000o : this.O00000oO.O000000o()) {
                o000000o.O00000o0();
            }
            O00000oo();
            O0000O0o();
            O0000OOo();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(long j, final String str, final RequestCallback<com.mobile.auth.gatewayauth.manager.base.O00000Oo, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, CacheKey cacheKey, long j2, String str2, String str3, String str4) {
        if (requestCallback == null) {
            return;
        }
        try {
            String O000000o = O000000o(str2, str, cacheKey, j2);
            com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "tokenCache", System.currentTimeMillis());
            if (!StringUtils.isEmpty(O000000o)) {
                requestCallback.onSuccess(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o().O000000o(true).O00000o0(O000000o).O000000o());
                this.O0000O0o.O000000o("Get VerifyToken from cache!");
            } else if (this.O000000o.O00000o()) {
                requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
            } else {
                this.O000000o.O00000oO();
                com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "addLimitCount", System.currentTimeMillis());
                dba.a().a(new ooO0Ooo(this.O00000oO, new dax<OO00OO>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.2
                    public void O000000o(OO00OO oo00oo) {
                        try {
                            TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update VerifyToken from network!");
                            if (oo00oo.O000000o()) {
                                oo00oo.O00000Oo().O000000o(TokenMaskManager.O000000o(TokenMaskManager.this, oo00oo.O00000Oo().O00000o(), str, false));
                                requestCallback.onSuccess(oo00oo.O00000Oo());
                                return;
                            }
                            com.mobile.auth.gatewayauth.manager.base.O00000Oo O00000Oo = oo00oo.O00000Oo();
                            if (O00000Oo == null) {
                                O00000Oo = com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                            }
                            requestCallback.onError(O00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // tb.dax
                    public /* synthetic */ void onResult(OO00OO oo00oo) {
                        try {
                            O000000o(oo00oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, j, str, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o()));
                com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "createCallable", System.currentTimeMillis());
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(long j, final String str, final RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, final CacheKey cacheKey, final String str2, long j2, int i, final String str3, final String str4) {
        if (requestCallback == null) {
            return;
        }
        try {
            if (this.O000000o.O000000o(i)) {
                requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
                return;
            }
            this.O000000o.O00000Oo(i);
            dba.a().a(new O0o(new O0Oo00(this.O00000oO, str, j, str3) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.14
                @Override // com.mobile.auth.O0Oo00
                public void O000000o(RequestCallback requestCallback2, O000000o o000000o) {
                    try {
                        o000000o.O00000Oo(requestCallback2, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o());
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, new dax<OO000o>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.13
                public void O000000o(OO000o oO000o) {
                    try {
                        TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update LoginToken from network!");
                        if (oO000o.O000000o()) {
                            oO000o.O00000Oo().O000000o(Math.min(System.currentTimeMillis() + 86400000, oO000o.O00000Oo().O00000oo()));
                            TokenMaskManager.O000000o(TokenMaskManager.this, str2, str, cacheKey, oO000o.O00000Oo().O00000o(), oO000o.O00000Oo().O00000oo());
                            requestCallback.onSuccess("false");
                            return;
                        }
                        com.mobile.auth.gatewayauth.manager.base.O00000Oo O00000Oo = oO000o.O00000Oo();
                        if (O00000Oo == null) {
                            O00000Oo = com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                        }
                        requestCallback.onError(O00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // tb.dax
                public /* synthetic */ void onResult(OO000o oO000o) {
                    try {
                        O000000o(oO000o);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, j, str3));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000Oo(long j, final String str, final RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, final CacheKey cacheKey, long j2, final String str2, String str3, String str4) {
        if (requestCallback == null) {
            return;
        }
        try {
            if (O00000Oo(str2, cacheKey.getKey(), j2)) {
                requestCallback.onSuccess("true");
                this.O0000O0o.O000000o("Update VerifyToken from cache!");
            } else if (this.O000000o.O00000o()) {
                requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
            } else {
                this.O000000o.O00000oO();
                dba.a().a(new ooO0Ooo(this.O00000oO, new dax<OO00OO>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.3
                    public void O000000o(OO00OO oo00oo) {
                        try {
                            TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update VerifyToken from network!");
                            if (oo00oo.O000000o()) {
                                oo00oo.O00000Oo().O000000o(Math.min(System.currentTimeMillis() + 86400000, oo00oo.O00000Oo().O00000oo()));
                                TokenMaskManager.O00000Oo(TokenMaskManager.this, str2, str, cacheKey, oo00oo.O00000Oo().O00000o(), oo00oo.O00000Oo().O00000oo());
                                requestCallback.onSuccess("false");
                                return;
                            }
                            com.mobile.auth.gatewayauth.manager.base.O00000Oo O00000Oo = oo00oo.O00000Oo();
                            if (O00000Oo == null) {
                                O00000Oo = com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                            }
                            requestCallback.onError(O00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // tb.dax
                    public /* synthetic */ void onResult(OO00OO oo00oo) {
                        try {
                            O000000o(oo00oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, j, str, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o()));
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000Oo(long j, final String str, final RequestCallback<com.mobile.auth.gatewayauth.manager.base.O00000Oo, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, CacheKey cacheKey, String str2, long j2, int i, final String str3, final String str4) {
        if (requestCallback == null) {
            return;
        }
        try {
            String O000000o = O000000o(str2, cacheKey, j2);
            com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "tokenCache", System.currentTimeMillis());
            if (!StringUtils.isEmpty(O000000o)) {
                this.O0000O0o.O000000o("Get LoginToken from cache!");
                requestCallback.onSuccess(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o().O00000o0(O000000o).O000000o(true).O000000o());
            } else if (this.O000000o.O000000o(i)) {
                requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_LIMIT, "该功能已达最大调用次数"));
            } else {
                this.O000000o.O00000Oo(i);
                com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "addLimitCount", System.currentTimeMillis());
                dba.a().a(new O0o(new O0Oo00(this.O00000oO, str, j, str3) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.16
                    @Override // com.mobile.auth.O0Oo00
                    public void O000000o(RequestCallback requestCallback2, O000000o o000000o) {
                        try {
                            o000000o.O00000Oo(requestCallback2, O000000o.O00000Oo.O000000o().O000000o(str3).O00000Oo(str4).O000000o());
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, new dax<OO000o>(ThreadStrategy.SAME_WITH_CALLABLE, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.15
                    public void O000000o(OO000o oO000o) {
                        try {
                            TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update LoginToken from network!");
                            if (oO000o.O000000o()) {
                                oO000o.O00000Oo().O000000o(TokenMaskManager.O000000o(TokenMaskManager.this, oO000o.O00000Oo().O00000o(), str, true));
                                requestCallback.onSuccess(oO000o.O00000Oo());
                                return;
                            }
                            com.mobile.auth.gatewayauth.manager.base.O00000Oo O00000Oo = oO000o.O00000Oo();
                            if (O00000Oo == null) {
                                O00000Oo = com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                            }
                            requestCallback.onError(O00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // tb.dax
                    public /* synthetic */ void onResult(OO000o oO000o) {
                        try {
                            O000000o(oO000o);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, j, str3));
                com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "createCallable", System.currentTimeMillis());
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void updateMask(long j, final String str, final RequestCallback<com.mobile.auth.gatewayauth.manager.base.O00000Oo, com.mobile.auth.gatewayauth.manager.base.O00000Oo> requestCallback, final CacheKey cacheKey, int i, final String str2, String str3, String str4) {
        if (requestCallback == null) {
            return;
        }
        try {
            if (this.O000000o.O00000o0()) {
                requestCallback.onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(Constant.CODE_ERROR_FUNCTION_DEMOTE, "系统维护，功能不可用"));
                return;
            }
            LoginPhoneInfo O000000o = O000000o(cacheKey);
            com.mobile.auth.gatewayauth.utils.O00000o0.O000000o().O000000o(str3, "maskCache", System.currentTimeMillis());
            final CacheKey vendorCacheKey = this.O00000Oo.getVendorCacheKey(str);
            long O000000o2 = O00000o0.O000000o(str);
            OO0oO oO0oO = this.O0000O0o;
            String[] strArr = new String[3];
            StringBuilder sb = new StringBuilder();
            sb.append("HasMaskCache:");
            sb.append(O000000o != null);
            strArr[0] = sb.toString();
            strArr[1] = ", SimKey:";
            strArr[2] = cacheKey.toString();
            oO0oO.O000000o(strArr);
            if (O000000o == null) {
                requestMask(j, str, new RequestCallback<OO000o, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.10
                    public void O000000o(OO000o oO000o) {
                        try {
                            LoginPhoneInfo build = LoginPhoneInfo.newLoginPhoneInfo().protocolName(oO000o.O00000o0().O00000oO()).protocolUrl(oO000o.O00000o0().O00000oo()).phoneNumber(oO000o.O00000o0().O00000Oo()).build();
                            TokenMaskManager.O000000o(TokenMaskManager.this, cacheKey, build, str);
                            requestCallback.onSuccess(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o().O000000o(false).O000000o(build).O000000o());
                            oO000o.O00000Oo().O000000o(Math.min(System.currentTimeMillis() + 86400000, oO000o.O00000Oo().O00000oo()));
                            if (StringUtils.isEmpty(oO000o.O00000Oo().O00000o())) {
                                return;
                            }
                            TokenMaskManager.O000000o(TokenMaskManager.this, str2, str, vendorCacheKey, oO000o.O00000Oo().O00000o(), oO000o.O00000Oo().O00000oo());
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo) {
                        if (o00000Oo == null) {
                            try {
                                o00000Oo = com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o(ResultCode.CODE_ERROR_UNKNOWN_FAIL, "未知异常");
                            } catch (Throwable th) {
                                try {
                                    ExceptionProcessor.processException(th);
                                    return;
                                } catch (Throwable th2) {
                                    ExceptionProcessor.processException(th2);
                                    return;
                                }
                            }
                        }
                        requestCallback.onError(o00000Oo);
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo) {
                        try {
                            O000000o(o00000Oo);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }

                    @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                    public /* synthetic */ void onSuccess(OO000o oO000o) {
                        try {
                            O000000o(oO000o);
                        } catch (Throwable th) {
                            try {
                                ExceptionProcessor.processException(th);
                            } catch (Throwable th2) {
                                ExceptionProcessor.processException(th2);
                            }
                        }
                    }
                }, cacheKey, str2, i, str3, str4);
                return;
            }
            requestCallback.onSuccess(com.mobile.auth.gatewayauth.manager.base.O00000Oo.O000000o().O000000o(true).O000000o(O000000o).O000000o());
            if (Constant.VENDOR_CMCC.equals(str) || O000000o(str2, vendorCacheKey.getKey(), O000000o2)) {
                return;
            }
            O000000o(j, str, new RequestCallback<String, com.mobile.auth.gatewayauth.manager.base.O00000Oo>() { // from class: com.mobile.auth.gatewayauth.manager.TokenMaskManager.9
                public void O000000o(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo) {
                    try {
                        OO0oO O00000o = TokenMaskManager.O00000o(TokenMaskManager.this);
                        String[] strArr2 = new String[2];
                        strArr2[0] = "Update LoginToken failed when update mask!";
                        strArr2[1] = o00000Oo == null ? "" : o00000Oo.toString();
                        O00000o.O00000o(strArr2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                public void O000000o(String str5) {
                    try {
                        TokenMaskManager.O00000o(TokenMaskManager.this).O000000o("Update LoginToken success when update mask!");
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onError(com.mobile.auth.gatewayauth.manager.base.O00000Oo o00000Oo) {
                    try {
                        O000000o(o00000Oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // com.mobile.auth.gatewayauth.manager.RequestCallback
                public /* synthetic */ void onSuccess(String str5) {
                    try {
                        O000000o(str5);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, vendorCacheKey, str2, O000000o2, i, str3, str4);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }
}
