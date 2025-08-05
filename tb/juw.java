package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.f;
import com.taobao.android.weex.i;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes6.dex */
public class juw implements i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentLinkedQueue<f> f29795a = new ConcurrentLinkedQueue<>();
    private WeexInstance b;

    static {
        kge.a(1492328324);
        kge.a(-842462063);
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        }
    }

    public juw(WeexInstance weexInstance) {
        this.b = weexInstance;
    }

    @Override // com.taobao.android.weex.i
    public WeexInstance a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("a4315c0c", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.weex.i
    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("973f16ce", new Object[]{this, fVar});
        } else {
            this.f29795a.add(fVar);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Iterator<f> it = this.f29795a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Iterator<f> it = this.f29795a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Iterator<f> it = this.f29795a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Iterator<f> it = this.f29795a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        Iterator<f> it = this.f29795a.iterator();
        while (it.hasNext()) {
            it.next().a(i, i2, intent);
        }
    }
}
