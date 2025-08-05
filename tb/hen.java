package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.au;
import com.taobao.taopai.media.m;

/* loaded from: classes5.dex */
public class hen {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28575a;
    private final m b;

    static {
        kge.a(-1901659121);
    }

    public hen() {
        this.b = au.a() ? new m() : null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.equals(str, this.f28575a)) {
        } else {
            b(str);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.b == null) {
        } else {
            if (!TextUtils.isEmpty(str)) {
                this.b.a(str);
                this.b.e(true);
                this.b.a(true);
                this.b.b(true);
                this.b.b(0);
            } else {
                this.b.a();
            }
            this.f28575a = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        m mVar = this.b;
        if (mVar == null) {
            return;
        }
        mVar.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == null) {
        } else {
            b(this.f28575a);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        m mVar = this.b;
        if (mVar == null) {
            return;
        }
        mVar.b();
    }
}
