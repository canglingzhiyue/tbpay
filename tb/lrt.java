package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.taobao.subservice.biz.smartloadingservice.impl.biz.cache.a;

/* loaded from: classes7.dex */
public class lrt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lrv f30874a;
    private lrw b;

    static {
        kge.a(-1087740355);
    }

    public lrt(ljs ljsVar) {
        a aVar = new a(ljsVar);
        this.f30874a = new lrv(ljsVar, aVar);
        this.b = new lrw(ljsVar, aVar);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        lrw lrwVar = this.b;
        if (lrwVar != null) {
            return lrwVar.a();
        }
        ldf.d("SmartLoadingController", "mRequestController == null");
        return false;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        lrv lrvVar = this.f30874a;
        if (lrvVar == null) {
            return;
        }
        lrvVar.a(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        lrv lrvVar = this.f30874a;
        if (lrvVar == null) {
            return;
        }
        lrvVar.a();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        lrv lrvVar = this.f30874a;
        if (lrvVar == null) {
            return;
        }
        lrvVar.b();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        lrv lrvVar = this.f30874a;
        if (lrvVar == null) {
            return;
        }
        lrvVar.a(i);
    }
}
