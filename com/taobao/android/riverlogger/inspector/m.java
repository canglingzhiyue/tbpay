package com.taobao.android.riverlogger.inspector;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.util.Set;
import tb.kge;

/* loaded from: classes6.dex */
public class m extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static SharedPreferences g;
    private final String b;
    private boolean c;
    private k d;
    private com.taobao.android.riverlogger.h e;
    private int v_ = 0;

    static {
        kge.a(921920127);
    }

    public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012643660:
                super.c((String) objArr[0]);
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 98379888:
                super.i();
                return null;
            case 552676517:
                super.a(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(m mVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a8fe1ee", new Object[]{mVar, new Integer(i)})).intValue();
        }
        mVar.v_ = i;
        return i;
    }

    public static /* synthetic */ k a(m mVar, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("375a36ce", new Object[]{mVar, kVar});
        }
        mVar.d = kVar;
        return kVar;
    }

    public static /* synthetic */ void a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ecad208", new Object[]{mVar});
        } else {
            mVar.k();
        }
    }

    public static /* synthetic */ int b(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e546bfc", new Object[]{mVar})).intValue();
        }
        int i = mVar.v_;
        mVar.v_ = i + 1;
        return i;
    }

    public static /* synthetic */ int c(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4dde05fd", new Object[]{mVar})).intValue() : mVar.v_;
    }

    public static m a(SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("93af653a", new Object[]{sharedPreferences});
        }
        if (sharedPreferences == null) {
            return null;
        }
        g = sharedPreferences;
        String string = sharedPreferences.getString("server", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        m mVar = new m(string);
        mVar.a(true);
        Set<String> stringSet = g.getStringSet("enabled", null);
        if (stringSet != null) {
            mVar.f.addAll(stringSet);
        }
        return mVar;
    }

    public m(String str) {
        this.b = str;
        j();
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.b;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void a(com.taobao.android.riverlogger.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f42255", new Object[]{this, hVar});
        } else {
            this.e = hVar;
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        m();
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void e() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        if (!this.c || (sharedPreferences = g) == null) {
            return;
        }
        sharedPreferences.edit().remove("server").remove("enabled").apply();
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        super.i();
        m();
    }

    private void m() {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!this.c || (sharedPreferences = g) == null) {
        } else {
            sharedPreferences.edit().putString("server", this.b).putStringSet("enabled", this.f).apply();
        }
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        super.c(str);
        k kVar = this.d;
        if (kVar == null) {
            return;
        }
        kVar.a();
    }

    private k j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("e3619767", new Object[]{this});
        }
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    l();
                }
            }
        }
        return this.d;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.taobao.android.riverlogger.h hVar = this.e;
        if (hVar == null) {
            return;
        }
        this.e = null;
        hVar.a(true, null);
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        super.a(i, str);
        com.taobao.android.riverlogger.h hVar = this.e;
        if (hVar == null) {
            return;
        }
        this.e = null;
        hVar.a(false, str);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.d = new k(URI.create(this.b), new n() { // from class: com.taobao.android.riverlogger.inspector.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.riverlogger.inspector.n
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    m.a(m.this);
                }
            }

            @Override // com.taobao.android.riverlogger.inspector.n
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                m.a(m.this, 0);
                m.this.d(str);
            }

            @Override // com.taobao.android.riverlogger.inspector.n
            public void b(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str});
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "WebSocket error";
                }
                m.this.a(-1, str);
                m.a(m.this, (k) null);
            }

            @Override // com.taobao.android.riverlogger.inspector.n
            public void a(int i, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
                    return;
                }
                m.b(m.this);
                if (i == 4040) {
                    str = "Debug page is closed";
                } else if (TextUtils.isEmpty(str)) {
                    str = "WebSocket closed";
                }
                m.this.a(i, str);
                if (i == 4040) {
                    m.this.c(str);
                } else if (m.c(m.this) >= 3) {
                    m.this.c("connect failed");
                }
                m.a(m.this, (k) null);
            }
        });
        if (!this.f14907a) {
            return;
        }
        f();
    }

    @Override // com.taobao.android.riverlogger.inspector.c
    public void a(String str, MessagePriority messagePriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c3e794", new Object[]{this, str, messagePriority});
            return;
        }
        k j = j();
        if (j == null) {
            return;
        }
        j.a(str, messagePriority);
    }
}
