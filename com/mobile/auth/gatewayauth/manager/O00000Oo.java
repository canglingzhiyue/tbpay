package com.mobile.auth.gatewayauth.manager;

import android.content.Context;
import android.text.TextUtils;
import com.mobile.auth.O0OOo;
import com.mobile.auth.O0o00;
import com.mobile.auth.OO000OO;
import com.mobile.auth.OO0oO;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import com.mobile.auth.gatewayauth.network.UTSharedPreferencesHelper;
import com.nirvana.tools.requestqueue.strategy.ThreadStrategy;
import tb.dax;
import tb.dba;

/* loaded from: classes4.dex */
public class O00000Oo {
    private Context O000000o;
    private OO0oO O00000Oo;
    private VendorSdkInfoManager O00000o;
    private volatile ConfigRule O00000o0;

    public O00000Oo(Context context, VendorSdkInfoManager vendorSdkInfoManager, O00000o o00000o) {
        this.O000000o = context.getApplicationContext();
        this.O00000o0 = UTSharedPreferencesHelper.readSDKConfig(this.O000000o);
        this.O00000o = vendorSdkInfoManager;
        this.O00000Oo = o00000o.O000000o();
        if (this.O00000o0 != null) {
            this.O00000Oo.O000000o(this.O00000o0);
        }
    }

    static /* synthetic */ ConfigRule O000000o(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O00000o0;
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

    static /* synthetic */ ConfigRule O000000o(O00000Oo o00000Oo, ConfigRule configRule) {
        try {
            o00000Oo.O00000o0 = configRule;
            return configRule;
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

    static /* synthetic */ OO0oO O00000Oo(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O00000Oo;
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

    static /* synthetic */ Context O00000o0(O00000Oo o00000Oo) {
        try {
            return o00000Oo.O000000o;
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

    private boolean O0000oO() {
        try {
            return this.O00000o0 != null;
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

    private boolean O0000oOO() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getAuth_token().getIs_limited())) {
                return false;
            }
            return this.O00000o0.getAuth_token().getLimit_time_hour() > 0;
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

    private boolean O0000oOo() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getLogin_token().getIs_limited())) {
                return false;
            }
            return this.O00000o0.getLogin_token().getLimit_time_hour() > 0;
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

    private boolean O0000oo() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getGet_vendor_list().getIs_limited())) {
                return false;
            }
            return this.O00000o0.getGet_vendor_list().getLimit_time_hour() > 0;
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

    private boolean O0000oo0() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getSls().getIs_limited())) {
                return false;
            }
            return this.O00000o0.getSls().getLimit_time_hour() > 0;
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

    private boolean O0000ooO() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getLogin_page().getIs_limited())) {
                return false;
            }
            return this.O00000o0.getLogin_page().getLimit_time_hour() > 0;
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

    private boolean O0000ooo() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getLogin_phone().getIs_limited())) {
                return false;
            }
            return this.O00000o0.getLogin_phone().getLimit_time_hour() > 0;
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

    private boolean O00oOooO() {
        try {
            if (!Boolean.parseBoolean(this.O00000o0.getGet_config().getIs_limited())) {
                return false;
            }
            return this.O00000o0.getGet_config().getLimit_time_hour() > 0;
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

    public void O000000o(final RequestCallback<ConfigRule, Void> requestCallback) {
        try {
            if (O0000oO0()) {
                requestCallback.onError(null);
                return;
            }
            O0000o();
            dba.a().a(new O0o00(new dax<OO000OO>(ThreadStrategy.THREAD, 2000L) { // from class: com.mobile.auth.gatewayauth.manager.O00000Oo.1
                public void O000000o(OO000OO oo000oo) {
                    try {
                        if (oo000oo.O000000o() == null) {
                            requestCallback.onError(null);
                            return;
                        }
                        ConfigRule O000000o = oo000oo.O000000o();
                        if (O00000Oo.O000000o(O00000Oo.this) == null || !O00000Oo.O000000o(O00000Oo.this).toString().equals(O000000o.toString())) {
                            O00000Oo.O000000o(O00000Oo.this, O000000o);
                            O00000Oo.O00000Oo(O00000Oo.this).O000000o(O00000Oo.O000000o(O00000Oo.this));
                            UTSharedPreferencesHelper.clearLimitCount(O00000Oo.O00000o0(O00000Oo.this));
                            UTSharedPreferencesHelper.saveSDKConfig(O00000Oo.O00000o0(O00000Oo.this), O00000Oo.O000000o(O00000Oo.this).toJsonString());
                        }
                        requestCallback.onSuccess(O00000Oo.O000000o(O00000Oo.this));
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }

                @Override // tb.dax
                public /* synthetic */ void onResult(OO000OO oo000oo) {
                    try {
                        O000000o(oo000oo);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            }, new O0OOo(this.O000000o, this.O00000o, this.O00000Oo), 5000L, OO000OO.class));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O000000o() {
        try {
            if (!O0000oO()) {
                return false;
            }
            return Boolean.parseBoolean(this.O00000o0.getIs_demoted());
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

    public boolean O000000o(int i) {
        try {
            switch (i) {
                case 1:
                    return O0000OOo();
                case 2:
                    return O0000Oo();
                case 3:
                    return O0000o0o();
                case 4:
                    return O00000o();
                case 5:
                    return O00000oo();
                case 6:
                    return O0000o0();
                case 7:
                    return O0000Ooo();
            }
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000Oo(int i) {
        try {
            switch (i) {
                case 1:
                    O0000Oo0();
                    return;
                case 2:
                    O0000OoO();
                    return;
                case 3:
                    O0000o();
                    return;
                case 4:
                    O00000oO();
                    return;
                case 5:
                    O0000O0o();
                    return;
                case 6:
                    O0000o0O();
                    return;
                case 7:
                    O0000o00();
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O00000Oo() {
        try {
            if (!O0000oO()) {
                return false;
            }
            if (!O000000o()) {
                if (!Boolean.parseBoolean(this.O00000o0.getIs_auth_demoted())) {
                    return false;
                }
            }
            return true;
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

    public boolean O00000o() {
        try {
            if (!O0000oO() || !O0000oOO()) {
                return false;
            }
            return UTSharedPreferencesHelper.readAuthTokenLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getAuth_token().getLimit_time_hour())) >= this.O00000o0.getAuth_token().getLimit_count();
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

    public boolean O00000o0() {
        try {
            if (!O0000oO()) {
                return false;
            }
            if (!O000000o()) {
                if (!Boolean.parseBoolean(this.O00000o0.getIs_login_demoted())) {
                    return false;
                }
            }
            return true;
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

    public void O00000oO() {
        try {
            if (!O0000oO() || !O0000oOO()) {
                return;
            }
            UTSharedPreferencesHelper.saveAuthTokenLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getAuth_token().getLimit_time_hour()));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O00000oo() {
        try {
            if (!O0000oO() || !O0000oOo()) {
                return false;
            }
            return UTSharedPreferencesHelper.readLoginTokenLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getLogin_token().getLimit_time_hour())) >= this.O00000o0.getLogin_token().getLimit_count();
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

    public void O0000O0o() {
        try {
            if (!O0000oO() || !O0000oOo()) {
                return;
            }
            UTSharedPreferencesHelper.saveLoginTokenLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getLogin_token().getLimit_time_hour()));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O0000OOo() {
        try {
            if (!O0000oO() || !O0000oo0()) {
                return false;
            }
            return UTSharedPreferencesHelper.readSLSLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getSls().getLimit_time_hour())) >= this.O00000o0.getSls().getLimit_count();
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

    public boolean O0000Oo() {
        try {
            if (!O0000oO() || !O0000oo()) {
                return false;
            }
            return UTSharedPreferencesHelper.readVendorLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getGet_vendor_list().getLimit_time_hour())) >= this.O00000o0.getGet_vendor_list().getLimit_count();
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

    public void O0000Oo0() {
        try {
            if (!O0000oO() || !O0000oo0()) {
                return;
            }
            UTSharedPreferencesHelper.saveSLSLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getSls().getLimit_time_hour()));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O0000OoO() {
        try {
            if (!O0000oO() || !O0000oo()) {
                return;
            }
            UTSharedPreferencesHelper.saveVendorLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getGet_vendor_list().getLimit_time_hour()));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O0000Ooo() {
        try {
            if (!O0000oO() || !O0000ooO()) {
                return false;
            }
            return UTSharedPreferencesHelper.readLoginPageLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getLogin_page().getLimit_time_hour())) >= this.O00000o0.getLogin_page().getLimit_count();
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

    public void O0000o() {
        try {
            if (!O0000oO() || !O00oOooO()) {
                return;
            }
            UTSharedPreferencesHelper.saveConfigLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getGet_config().getLimit_time_hour()));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O0000o0() {
        try {
            if (!O0000oO() || !O0000ooo()) {
                return false;
            }
            return UTSharedPreferencesHelper.readLoginPhoneLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getLogin_phone().getLimit_time_hour())) >= this.O00000o0.getLogin_phone().getLimit_count();
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

    public void O0000o00() {
        try {
            if (!O0000oO() || !O0000ooO()) {
                return;
            }
            UTSharedPreferencesHelper.saveLoginPageLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getLogin_page().getLimit_time_hour()));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O0000o0O() {
        try {
            if (!O0000oO() || !O0000ooo()) {
                return;
            }
            UTSharedPreferencesHelper.saveLoginPhoneLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getLogin_phone().getLimit_time_hour()));
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public boolean O0000o0o() {
        try {
            if (!O0000oO() || !O00oOooO()) {
                return false;
            }
            return UTSharedPreferencesHelper.readConfigLimitCount(this.O000000o, com.mobile.auth.gatewayauth.utils.O000000o.O000000o(this.O00000o0.getGet_config().getLimit_time_hour())) >= this.O00000o0.getGet_config().getLimit_count();
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

    public boolean O0000oO0() {
        try {
            String readSDKConfigLimitFlag = UTSharedPreferencesHelper.readSDKConfigLimitFlag(this.O000000o);
            if ((!TextUtils.isEmpty(readSDKConfigLimitFlag) && com.mobile.auth.gatewayauth.utils.O000000o.O000000o(readSDKConfigLimitFlag)) || UTSharedPreferencesHelper.readSDKConfigCloseFlag(this.O000000o)) {
                return true;
            }
            return O0000o0o();
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
}
