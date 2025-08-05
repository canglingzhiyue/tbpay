package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.io.SharedPreferencesUtils;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.LoginInfo;
import com.taobao.alimama.services.d;
import com.taobao.tao.remotebusiness.login.h;

/* loaded from: classes4.dex */
public class dht implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LoginInfo f26766a = new LoginInfo();
    private a b = new a();

    static {
        kge.a(748142213);
        kge.a(1847459410);
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private LoginInfo f26767a;

        static {
            kge.a(129717095);
        }

        private a() {
        }

        public static /* synthetic */ LoginInfo a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LoginInfo) ipChange.ipc$dispatch("3c416eba", new Object[]{aVar}) : aVar.a();
        }

        public static /* synthetic */ void a(a aVar, LoginInfo loginInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dff0dd54", new Object[]{aVar, loginInfo});
            } else {
                aVar.a(loginInfo);
            }
        }

        private void a(LoginInfo loginInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60bd94d7", new Object[]{this, loginInfo});
                return;
            }
            this.f26767a = loginInfo;
            SharedPreferencesUtils.putString("login_info", JSON.toJSONString(loginInfo));
        }

        private LoginInfo a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoginInfo) ipChange.ipc$dispatch("d50e3ad7", new Object[]{this});
            }
            if (this.f26767a == null) {
                try {
                    String string = SharedPreferencesUtils.getString("login_info", "");
                    if (!TextUtils.isEmpty(string)) {
                        this.f26767a = (LoginInfo) JSON.parseObject(string, LoginInfo.class);
                    }
                } catch (Exception unused) {
                }
            }
            return this.f26767a;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        LoginInfo from = LoginInfo.from(h.a());
        if (from.isValid() && !from.equals(this.f26766a)) {
            a.a(this.b, from);
        }
        this.f26766a = from;
    }

    @Override // com.taobao.alimama.services.d
    public LoginInfo b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginInfo) ipChange.ipc$dispatch("ba4fa998", new Object[]{this});
        }
        c();
        if (this.f26766a.isValid()) {
            return this.f26766a;
        }
        return a.a(this.b);
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : IBaseService.Names.SERVICE_LOGIN.name();
    }
}
