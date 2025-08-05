package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.view.c;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.bootimage.linked.h;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
public class sro {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<sre> f33869a = new LinkedList<>();
    private sre b;

    static {
        kge.a(2002027550);
    }

    public sro(srq srqVar) {
        a();
        a(srqVar);
    }

    public void a(srk srkVar, int i, srr srrVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d8a5cf", new Object[]{this, srkVar, new Integer(i), srrVar, new Integer(i2)});
            return;
        }
        kej.a("2ARCH_DispatcherCenter", "onStart currentIndex: " + i2);
        h.b("").c();
        if (a(i2)) {
            kej.a("2ARCH_DispatcherCenter", "onStart: businessBootImage isInvalid handle next");
            if (srrVar == null) {
                return;
            }
            srrVar.a();
            return;
        }
        List<JSONObject> a2 = srkVar.a(this.b.a());
        if (a2.isEmpty()) {
            kej.a("2ARCH_DispatcherCenter", "onStart: data null:" + this.b.a());
            if (srrVar == null) {
                return;
            }
            srrVar.a();
            return;
        }
        kej.a("2ARCH_DispatcherCenter", "onStart BusinessCode " + this.b.a());
        if (srrVar != null) {
            srrVar.b();
        }
        this.b.b(a2, i);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= this.f33869a.size()) {
            kej.a("2ARCH_DispatcherCenter", "onStart reSet currentIndex: " + i);
            return false;
        }
        this.b = this.f33869a.get(i);
        return this.b == null;
    }

    public void a(BootImageInfo bootImageInfo, c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac3bf80a", new Object[]{this, bootImageInfo, cVar, new Integer(i)});
            return;
        }
        kej.a("2ARCH_DispatcherCenter", "onCreateView: ");
        sre sreVar = this.b;
        if (sreVar == null) {
            kej.a("2ARCH_DispatcherCenter", "onCreateView business bootImage null: ");
        } else {
            sreVar.a(bootImageInfo, cVar, i);
        }
    }

    public void a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("603694e4", new Object[]{this, cVar, new Integer(i)});
            return;
        }
        kej.a("2ARCH_DispatcherCenter", "onViewShown: ");
        sre sreVar = this.b;
        if (sreVar == null) {
            kej.a("2ARCH_DispatcherCenter", "onCreateView business bootImage null: ");
        } else {
            sreVar.a(cVar, i);
        }
    }

    public void a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        kej.a("2ARCH_DispatcherCenter", "onTerminate : ");
        sre sreVar = this.b;
        if (sreVar == null) {
            return;
        }
        sreVar.onTerminate(i, i2, i3);
    }

    public void a(srk srkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea014717", new Object[]{this, srkVar, new Integer(i)});
            return;
        }
        kej.a("2ARCH_DispatcherCenter", "onDownLoad: ");
        a(tiq.BIZ_CODE, srkVar, i);
        a("TopView", srkVar, i);
        a("Market", srkVar, i);
    }

    private void a(String str, srk srkVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7658a8d", new Object[]{this, str, srkVar, new Integer(i)});
            return;
        }
        List<JSONObject> a2 = srkVar.a(str);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        Iterator<sre> it = this.f33869a.iterator();
        while (it.hasNext()) {
            sre next = it.next();
            if (TextUtils.equals(next.a(), str)) {
                next.a(a2, i);
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b();
        this.f33869a.add(new srj());
        this.f33869a.add(new srh());
    }

    private void b() {
        if (!kel.j()) {
            return;
        }
        try {
            kej.a("2ARCH_DispatcherCenter", "registerTopShowBootImage start create TopShowBootImage. ");
            this.f33869a.add((sre) Class.forName("com.taobao.mmad.TopShowBootImage").newInstance());
            kej.a("2ARCH_DispatcherCenter", "registerTopShowBootImage create end. ");
        } catch (Throwable th) {
            kej.a("2ARCH_DispatcherCenter", "registerTopShowBootImage error: ", th);
            Log.e("BootImage", "registerTopShowBootImage error:" + th);
            th.printStackTrace();
        }
    }

    private void a(srq srqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4d13a6", new Object[]{this, srqVar});
            return;
        }
        Iterator<sre> it = this.f33869a.iterator();
        while (it.hasNext()) {
            it.next().a(srqVar);
        }
    }
}
