package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.o;
import com.taobao.taolive.uikit.api.TBLiveBaseComponentView;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

/* loaded from: classes8.dex */
public class psd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<WeakReference<pry>> f32849a = new LinkedList<>();
    private LinkedList<WeakReference<TBLiveBaseComponentView>> b = new LinkedList<>();

    static {
        kge.a(-2138217103);
    }

    public void a(pry pryVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa322cc1", new Object[]{this, pryVar});
            return;
        }
        a();
        this.f32849a.addLast(new WeakReference<>(pryVar));
    }

    public void b(pry pryVar) {
        pry pryVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b53342", new Object[]{this, pryVar});
            return;
        }
        for (int i = 0; i < this.f32849a.size(); i++) {
            WeakReference<pry> weakReference = this.f32849a.get(i);
            if (weakReference != null && (pryVar2 = weakReference.get()) != null && pryVar2 == pryVar) {
                this.f32849a.remove(weakReference);
            }
        }
    }

    public void a(TBLiveBaseComponentView tBLiveBaseComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1356a676", new Object[]{this, tBLiveBaseComponentView});
        } else {
            this.b.addLast(new WeakReference<>(tBLiveBaseComponentView));
        }
    }

    public void b(TBLiveBaseComponentView tBLiveBaseComponentView) {
        TBLiveBaseComponentView tBLiveBaseComponentView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240c7337", new Object[]{this, tBLiveBaseComponentView});
            return;
        }
        for (int i = 0; i < this.f32849a.size(); i++) {
            WeakReference<TBLiveBaseComponentView> weakReference = this.b.get(i);
            if (weakReference != null && (tBLiveBaseComponentView2 = weakReference.get()) != null && tBLiveBaseComponentView2 == tBLiveBaseComponentView) {
                this.b.remove(weakReference);
            }
        }
    }

    private void a() {
        WeakReference<pry> removeFirst;
        pry pryVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f32849a.size() <= o.K() || (removeFirst = this.f32849a.removeFirst()) == null || (pryVar = removeFirst.get()) == null) {
        } else {
            pryVar.h();
        }
    }

    public void a(boolean z) {
        TBLiveBaseComponentView tBLiveBaseComponentView;
        pry pryVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        LinkedList<WeakReference<pry>> linkedList = this.f32849a;
        if (linkedList != null && linkedList.size() > 0) {
            LinkedList linkedList2 = (LinkedList) this.f32849a.clone();
            for (int i = 0; i < linkedList2.size(); i++) {
                WeakReference weakReference = (WeakReference) linkedList2.get(i);
                if (weakReference != null && (pryVar = (pry) weakReference.get()) != null) {
                    pryVar.c(z);
                }
            }
            this.f32849a.clear();
        }
        LinkedList<WeakReference<TBLiveBaseComponentView>> linkedList3 = this.b;
        if (linkedList3 == null || linkedList3.size() <= 0) {
            return;
        }
        LinkedList linkedList4 = (LinkedList) this.b.clone();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            WeakReference weakReference2 = (WeakReference) linkedList4.get(i2);
            if (weakReference2 != null && (tBLiveBaseComponentView = (TBLiveBaseComponentView) weakReference2.get()) != null) {
                tBLiveBaseComponentView.destroy();
            }
        }
        this.b.clear();
    }
}
