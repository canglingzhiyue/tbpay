package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.a;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class lsd implements lss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30890a;
    private lsk b;
    private a d = null;
    private final Map<lss, a> e = new ConcurrentHashMap();
    private final AtomicBoolean c = new AtomicBoolean(false);

    static {
        kge.a(-2147479202);
        kge.a(2002375801);
    }

    public lsd(ljs ljsVar) {
        this.f30890a = ljsVar;
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter -> MicroserviceTopViewCreator()");
    }

    @Override // tb.lss
    public void a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
        } else if (this.c.get()) {
        } else {
            this.c.set(true);
            if (this.b == null) {
                this.b = new lsk(this.f30890a);
            }
            a(this.b, this.d);
            this.b.a(iContainerDataModel);
            this.c.set(false);
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter#onUpdateSplashData ");
        }
    }

    @Override // tb.lss
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b != null) {
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter#expendTopViewRecord -> expendTopViewRecord ");
            return this.b.a();
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter#expendTopViewRecord -> false ");
        return false;
    }

    @Override // tb.lss
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        lsk lskVar = this.b;
        if (lskVar == null) {
            return;
        }
        lskVar.b();
    }

    @Override // tb.lss
    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        if (this.b == null) {
            return null;
        }
        ldf.d(lsk.SPLASH_BUSINESS_TAG, "MicroserviceTopViewResponderCenter#getAdSearchBoxMergeData -> ");
        return this.b.c();
    }

    @Override // tb.lss
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64060b15", new Object[]{this, aVar});
        } else {
            a(this.b, aVar);
        }
    }

    @Override // tb.lss
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8454374", new Object[]{this, aVar});
            return;
        }
        lsk lskVar = this.b;
        if (lskVar == null) {
            return;
        }
        lskVar.b(aVar);
        this.e.remove(this.b);
        this.d = null;
    }

    private void a(lss lssVar, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bd9eb71", new Object[]{this, lssVar, aVar});
        } else if (aVar == null) {
        } else {
            if (lssVar == null) {
                this.d = aVar;
            } else if (this.e.containsKey(lssVar) && this.e.containsValue(aVar)) {
            } else {
                lssVar.a(aVar);
                this.e.put(lssVar, aVar);
            }
        }
    }
}
