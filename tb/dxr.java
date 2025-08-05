package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.aura.s;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.i;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class dxr implements dxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Activity f27069a;
    public com.taobao.android.detail.core.aura.presenter.a b;
    public IAURAPluginCenter[] c;

    static {
        kge.a(318231292);
        kge.a(2094163202);
    }

    @Override // tb.dxu
    public s a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("3c3eac55", new Object[]{this});
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static class a extends aqq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final aqq f27070a;
        private final ViewGroup b;

        static {
            kge.a(-566732622);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 90991720) {
                super.a();
                return null;
            } else if (hashCode == 112764847) {
                super.a((c) objArr[0]);
                return null;
            } else if (hashCode != 744952192) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a((b) objArr[0]);
                return null;
            }
        }

        public a(ViewGroup viewGroup, aqq aqqVar) {
            this.f27070a = aqqVar;
            this.b = viewGroup;
        }

        @Override // tb.aqq
        public void a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                return;
            }
            i.d(j.a("AURABuildDefaultPageCallback"), "aura callback onNext start");
            super.a(cVar);
            Serializable b = cVar.b();
            if (!(b instanceof AURARenderOutput)) {
                return;
            }
            if (this.b != null) {
                View view = ((AURARenderOutput) b).getView();
                this.b.removeAllViews();
                this.b.addView(view, new ViewGroup.LayoutParams(-1, -2));
            }
            aqq aqqVar = this.f27070a;
            if (aqqVar != null) {
                aqqVar.a(cVar);
            }
            i.d(j.a("AURABuildDefaultPageCallback"), "aura callback onNext end");
        }

        @Override // tb.aqq, tb.aqs
        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c671180", new Object[]{this, bVar});
                return;
            }
            super.a(bVar);
            aqq aqqVar = this.f27070a;
            if (aqqVar != null) {
                aqqVar.a(bVar);
            }
            String a2 = j.a("AURABuildDefaultPageCallback");
            i.d(a2, "aura callback onError=" + bVar);
        }

        @Override // tb.aqq
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            aqq aqqVar = this.f27070a;
            if (aqqVar != null) {
                aqqVar.a();
            }
            i.d(j.a("AURABuildDefaultPageCallback"), "aura callback onCompleted");
        }
    }
}
