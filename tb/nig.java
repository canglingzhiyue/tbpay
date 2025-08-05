package tb;

import android.util.SparseIntArray;
import com.alibaba.ability.impl.photo.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.disk.e;
import com.taobao.phenix.cache.disk.i;

/* loaded from: classes.dex */
public class nig implements nid<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final SparseIntArray f31478a = new SparseIntArray(4);
    private boolean b;
    private e c;

    static {
        kge.a(188204822);
        kge.a(-1709620101);
    }

    public nig() {
        this.f31478a.put(17, 83886080);
        this.f31478a.put(34, b.MAX_IMAGE_SIZE);
        this.f31478a.put(51, 31457280);
        this.f31478a.put(68, b.MAX_IMAGE_SIZE);
        this.f31478a.put(85, 20971520);
        this.f31478a.put(102, b.MAX_IMAGE_SIZE);
    }

    public nig a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nig) ipChange.ipc$dispatch("531f8caf", new Object[]{this, eVar});
        }
        com.taobao.tcommon.core.b.b(!this.b, "DiskCacheBuilder has been built, not allow with() now");
        this.c = eVar;
        return this;
    }

    public nig a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nig) ipChange.ipc$dispatch("faa56a32", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        com.taobao.tcommon.core.b.b(!this.b, "DiskCacheBuilder has been built, not allow maxSize() now");
        this.f31478a.put(i, i2);
        return this;
    }

    public synchronized e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("32b268f1", new Object[]{this});
        } else if (this.b) {
            return this.c;
        } else {
            if (this.c == null) {
                this.c = new i();
                niw.c("DiskCache", "use default non-operation DiskCacheSupplier, cause not implement a custom DiskCacheSupplier", new Object[0]);
            }
            this.b = true;
            com.taobao.tcommon.core.b.a(this.c.a(17), "DiskCache for the priority(TOP_USED_1) cannot be null");
            for (com.taobao.phenix.cache.disk.b bVar : this.c.a()) {
                bVar.a(this.f31478a.get(bVar.b(), 0));
            }
            return this.c;
        }
    }
}
