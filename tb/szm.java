package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class szm extends com.taobao.android.detail.ttdetail.communication.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f33971a;

    /* loaded from: classes5.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33972a;
        public String b;
        public View c;
        public float d;
        public float e;
        public boolean f;
        public String g;
        public String h;
        public String i;
        public String j;

        static {
            kge.a(-1554610548);
        }

        public a(int i, String str, String str2, View view, float f, float f2) {
            this.f33972a = i;
            this.b = str;
            this.j = str2;
            this.c = view;
            this.d = f;
            this.e = f2;
        }
    }

    static {
        kge.a(848596810);
    }

    public szm(int i, String str, String str2, View view, float f, float f2) {
        this.f33971a = new a(i, str, str2, view, f, f2);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f33971a.f = z;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f33971a.g = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f33971a.h = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f33971a.i = str;
        }
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5943643a", new Object[]{this}) : this.f33971a;
    }
}
