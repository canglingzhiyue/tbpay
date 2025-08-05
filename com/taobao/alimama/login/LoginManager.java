package com.taobao.alimama.login;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.tao.remotebusiness.login.h;
import com.taobao.utils.ILoginInfoGetter;
import com.taobao.utils.LoginInfo;
import tb.kge;

/* loaded from: classes.dex */
public class LoginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile ILoginInfoGetter f8436a;

    static {
        kge.a(1538249062);
    }

    public static ILoginInfoGetter a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILoginInfoGetter) ipChange.ipc$dispatch("94068eaf", new Object[0]);
        }
        if (f8436a == null) {
            f8436a = new DefaultGetter();
        }
        return f8436a;
    }

    public static void a(ILoginInfoGetter iLoginInfoGetter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1397842f", new Object[]{iLoginInfoGetter});
        } else {
            f8436a = iLoginInfoGetter;
        }
    }

    /* loaded from: classes.dex */
    public static class DefaultGetter implements ILoginInfoGetter {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String PREF_KEY = "login_info";
        private LoginInfo mCurrentLoginInfo;
        private a mStorageHelper;

        static {
            kge.a(-1004001330);
            kge.a(-1980187734);
        }

        private DefaultGetter() {
            this.mCurrentLoginInfo = new LoginInfo();
            this.mStorageHelper = new a();
        }

        /* loaded from: classes.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private LoginInfo f8437a;

            static {
                kge.a(-1647549314);
            }

            private a() {
            }

            public static /* synthetic */ LoginInfo a(a aVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (LoginInfo) ipChange.ipc$dispatch("3d57d0b1", new Object[]{aVar}) : aVar.a();
            }

            public static /* synthetic */ void a(a aVar, LoginInfo loginInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f9afe6f7", new Object[]{aVar, loginInfo});
                } else {
                    aVar.a(loginInfo);
                }
            }

            private void a(LoginInfo loginInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("43bfe3b1", new Object[]{this, loginInfo});
                    return;
                }
                this.f8437a = loginInfo;
                SharedPreferencesUtils.putString(DefaultGetter.PREF_KEY, JSON.toJSONString(loginInfo));
            }

            private LoginInfo a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (LoginInfo) ipChange.ipc$dispatch("b35854b7", new Object[]{this});
                }
                if (this.f8437a == null) {
                    try {
                        String string = SharedPreferencesUtils.getString(DefaultGetter.PREF_KEY, "");
                        if (!TextUtils.isEmpty(string)) {
                            this.f8437a = (LoginInfo) JSON.parseObject(string, LoginInfo.class);
                        }
                    } catch (Exception unused) {
                    }
                }
                return this.f8437a;
            }
        }

        private void refreshLoginInfoFromMtop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d883e955", new Object[]{this});
                return;
            }
            LoginInfo from = LoginInfo.from(h.a());
            if (from.isValid() && !from.equals(this.mCurrentLoginInfo)) {
                a.a(this.mStorageHelper, from);
            }
            this.mCurrentLoginInfo = from;
        }

        @Override // com.taobao.utils.ILoginInfoGetter
        public LoginInfo getLoginUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginInfo) ipChange.ipc$dispatch("b92fe5cc", new Object[]{this});
            }
            refreshLoginInfoFromMtop();
            return this.mCurrentLoginInfo;
        }

        @Override // com.taobao.utils.ILoginInfoGetter
        public LoginInfo getLastLoginUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginInfo) ipChange.ipc$dispatch("94461882", new Object[]{this});
            }
            refreshLoginInfoFromMtop();
            if (this.mCurrentLoginInfo.isValid()) {
                return this.mCurrentLoginInfo;
            }
            return a.a(this.mStorageHelper);
        }
    }
}
