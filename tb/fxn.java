package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;

/* loaded from: classes5.dex */
public class fxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f28192a;
    private String b;
    private boolean c;

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fxn f28193a;

        static {
            kge.a(523696726);
            f28193a = new fxn();
        }

        public static /* synthetic */ fxn a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fxn) ipChange.ipc$dispatch("f04d2c2", new Object[0]) : f28193a;
        }
    }

    static {
        kge.a(-800010455);
    }

    private fxn() {
        this.f28192a = false;
        this.b = "-1";
        this.c = false;
    }

    public static fxn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fxn) ipChange.ipc$dispatch("f04d2c2", new Object[0]) : a.a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Context i = DinamicXEngine.i();
        if (i == null) {
            return;
        }
        int identifier = i.getResources().getIdentifier("ttid", "string", i.getPackageName());
        if (identifier <= 0) {
            this.b = "-1";
            this.f28192a = false;
            this.c = true;
            return;
        }
        this.b = i.getString(identifier);
        this.f28192a = "212200".equals(this.b);
        this.c = true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!this.c) {
            b();
        }
        return this.f28192a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        if (!this.c) {
            b();
        }
        return this.b;
    }
}
