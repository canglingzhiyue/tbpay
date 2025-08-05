package tb;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.i;

/* loaded from: classes.dex */
public class oiy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "home.commUtils";
    private lbq b;
    private LayoutInflater d;
    private ViewGroup e;
    private boolean f;
    private boolean g;
    private String h;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static oiy f32109a;

        static {
            kge.a(-2147110573);
            f32109a = new oiy();
        }

        public static /* synthetic */ oiy a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (oiy) ipChange.ipc$dispatch("f08b31f", new Object[0]) : f32109a;
        }
    }

    static {
        kge.a(665366005);
    }

    private oiy() {
    }

    public static oiy a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oiy) ipChange.ipc$dispatch("f08b31f", new Object[0]) : a.a();
    }

    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a95cf9", new Object[]{this, layoutInflater, viewGroup});
            return;
        }
        this.d = layoutInflater;
        this.e = viewGroup;
    }

    public LayoutInflater d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutInflater) ipChange.ipc$dispatch("ae04e1bd", new Object[]{this}) : this.d;
    }

    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this}) : this.e;
    }

    public void a(lbq lbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f279af3d", new Object[]{this, lbqVar});
        } else {
            this.b = lbqVar;
        }
    }

    public lbq b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbq) ipChange.ipc$dispatch("16b8e022", new Object[]{this}) : this.b;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f = true;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.h = i.a();
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.h;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.g;
    }
}
