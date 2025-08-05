package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.mly;

/* loaded from: classes.dex */
public class mlv implements mly.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f31098a = false;
    private final Application b;
    private SharedPreferences.Editor c;

    @Override // tb.mly.a
    public /* synthetic */ mly.a a(Map<String, ?> map) {
        return mly.a.CC.$default$a(this, map);
    }

    @Override // tb.mly.a
    public /* synthetic */ mly.a b(String str, String str2) {
        return mly.a.CC.$default$b(this, str, str2);
    }

    public mlv(Application application) {
        this.b = application;
    }

    @Override // tb.mly.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c.commit();
        this.c = null;
        this.f31098a = false;
    }

    @Override // tb.mly.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f31098a;
    }

    @Override // tb.mly.a
    public mly.a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly.a) ipChange.ipc$dispatch("3a4f87b3", new Object[]{this, str, str2});
        }
        c();
        this.f31098a = true;
        this.c.putString(str, str2);
        return this;
    }

    @Override // tb.mly.a
    public mly.a a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly.a) ipChange.ipc$dispatch("52211b0d", new Object[]{this, str, new Boolean(z)});
        }
        c();
        this.f31098a = true;
        this.c.putBoolean(str, z);
        return this;
    }

    @Override // tb.mly.a
    public mly.a a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly.a) ipChange.ipc$dispatch("cf551fbe", new Object[]{this, str, new Integer(i)});
        }
        c();
        this.f31098a = true;
        this.c.putInt(str, i);
        return this;
    }

    @Override // tb.mly.a
    public mly.a a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly.a) ipChange.ipc$dispatch("d706c51d", new Object[]{this, str, new Long(j)});
        }
        c();
        this.f31098a = true;
        this.c.putLong(str, j);
        return this;
    }

    @Override // tb.mly.a
    public mly.a a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly.a) ipChange.ipc$dispatch("b8402fa1", new Object[]{this, str, new Float(f)});
        }
        c();
        this.f31098a = true;
        this.c.putFloat(str, f);
        return this;
    }

    @Override // tb.mly.a
    public mly.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly.a) ipChange.ipc$dispatch("29ccf5bd", new Object[]{this, str});
        }
        throw new RuntimeException("The method that cannot be called directly: DomainUnifiedEditor.incrementInt(@NonNull String key)");
    }

    @Override // tb.mly.a
    public mly.a b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly.a) ipChange.ipc$dispatch("54de811e", new Object[]{this, str, new Long(j)});
        }
        throw new RuntimeException("The method that cannot be called directly: DomainUnifiedEditor.incrementLong(@NonNull String key, int delta)");
    }

    @Override // tb.mly.a
    public mly.a c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mly.a) ipChange.ipc$dispatch("1da2d3f1", new Object[]{this, str, str2});
        }
        c();
        this.f31098a = true;
        String string = mlz.a((Context) this.b).getString(str, null);
        if (string != null) {
            str2 = string + "," + str2;
        }
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (str2.charAt(i2) == ',') {
                i++;
            }
        }
        if (i >= 100) {
            return this;
        }
        this.c.putString(str, str2);
        return this;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c != null) {
        } else {
            this.c = mlz.a((Context) this.b).edit();
        }
    }
}
