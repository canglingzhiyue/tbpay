package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.global.setting.data.b;
import com.taobao.global.setting.data.c;
import com.taobao.global.setting.util.d;
import com.taobao.global.setting.util.e;
import com.taobao.global.setting.util.h;

/* loaded from: classes7.dex */
public class ksy extends b implements kta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f30299a;
    private String b;
    private e c;

    public static /* synthetic */ Object ipc$super(ksy ksyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ksy(Context context, String str) {
        this.f30299a = context;
        this.b = str;
        this.c = e.a(context.getApplicationContext());
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (a(this.b)) {
            return true;
        }
        Nav.from(this.f30299a).toUri("http://m.taobao.com/go/mytaobaocommonsettings");
        return false;
    }

    @Override // tb.kta
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!b()) {
        } else {
            this.c.a("Global_App_Auto_Play_Video", z);
            ssl.a("Global_App_Auto_Play_Video", Boolean.valueOf(z));
        }
    }

    @Override // tb.kta
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!b()) {
        } else {
            this.c.a("Global_App_Is_TaoPassWord_Cut", z);
        }
    }

    @Override // tb.kta
    public void a(int i) {
        SharedPreferences a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!b() || (a2 = this.c.a()) == null) {
        } else {
            SharedPreferences.Editor edit = a2.edit();
            edit.putInt("Global_App_Video_Play_Network_Type", i);
            if (i != 0) {
                z = false;
            }
            edit.putBoolean("Global_App_Auto_Play_Video", z);
            edit.commit();
            ssl.a("Global_App_Video_Play_Network_Type", Integer.valueOf(i));
            ssl.a("Global_App_Auto_Play_Video", Boolean.valueOf(z));
        }
    }

    @Override // tb.kta
    public <T> void a(String str, String str2, T t, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79512611", new Object[]{this, str, str2, t, cVar});
        } else if (!d.a(str, str2)) {
            d.a(cVar, 261, "bizName and key cannot be empty!");
        } else {
            try {
                a(str2, t);
                d.a(cVar, (Object) null);
                ssl.a(str2, t);
                AppMonitor.Counter.commit(h.PAGE_NAME, h.ARG1_CHANGE_SETTING_STATE, h.a(str, str2, t), 1.0d);
            } catch (IllegalArgumentException e) {
                d.a(cVar, 261, e.getMessage());
            }
        }
    }

    @Override // tb.kta
    public <T> void b(String str, String str2, T t, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efc8292", new Object[]{this, str, str2, t, cVar});
        } else if (com.taobao.global.setting.d.a().b()) {
        } else {
            if (!d.a(str, str2)) {
                d.a(cVar, 261, "bizName and key cannot be empty!");
                return;
            }
            try {
                if (!com.taobao.global.setting.d.a().b() && "liveMute".equals(str2)) {
                    str2 = "mute";
                }
                com.taobao.global.setting.data.d.a().b(str2, t);
                d.a(cVar, (Object) null);
                AppMonitor.Counter.commit(h.PAGE_NAME, h.ARG1_CHANGE_LIFE_CICLE_SETTING_STATE, h.a(str, str2, t), 1.0d);
            } catch (IllegalArgumentException e) {
                d.a(cVar, 261, e.getMessage());
            }
        }
    }

    private <T> void a(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, t});
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("key cannot be empty!");
        } else {
            SharedPreferences.Editor edit = d.a().edit();
            if (t instanceof Integer) {
                edit.putInt(str, ((Integer) t).intValue());
            } else if (t instanceof String) {
                edit.putString(str, String.valueOf(t));
            } else if (t instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) t).booleanValue());
            } else {
                edit.apply();
                throw new IllegalArgumentException("the type of value must be one of the Integer, String or Boolean!");
            }
            edit.apply();
            ssk.a(str, t);
        }
    }
}
