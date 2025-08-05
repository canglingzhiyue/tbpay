package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.data.b;
import com.taobao.global.setting.data.c;
import com.taobao.global.setting.data.e;
import com.taobao.global.setting.data.f;
import com.taobao.global.setting.mtop.model.UserProfile;
import com.taobao.login4android.api.Login;

/* loaded from: classes7.dex */
public class ktd extends b implements ktb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f30300a;
    private e b = e.a();
    private f c = new f();

    public static /* synthetic */ Object ipc$super(ktd ktdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ktd(String str) {
        this.f30300a = str;
    }

    private boolean b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfb6f66", new Object[]{this, cVar})).booleanValue();
        }
        if (a()) {
            return true;
        }
        cVar.a(257, "用户未登录！");
        return false;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        boolean b = this.b.b();
        Log.e("GlobalSetting", " ~ provider check enableLocalCacheUserProfile :" + b);
        if (!b) {
            this.b.c("Global_User_Profile" + Login.getUserId());
        }
        return b;
    }

    private UserProfile c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserProfile) ipChange.ipc$dispatch("ab824f2", new Object[]{this});
        }
        Object d = this.b.d("Global_User_Profile" + Login.getUserId());
        if (d == null) {
            return null;
        }
        try {
            return (UserProfile) d;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // tb.ktb
    public void a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5903e56b", new Object[]{this, str, cVar});
        } else if (!b(cVar)) {
        } else {
            UserProfile userProfile = null;
            if (b()) {
                userProfile = c();
            }
            if (userProfile != null) {
                cVar.a(userProfile);
            } else {
                this.c.a(str, cVar);
            }
        }
    }
}
