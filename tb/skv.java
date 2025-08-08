package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.mtop.d;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.remote.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;

/* loaded from: classes5.dex */
public class skv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_DELETED = -1;
    public static final String ERROR_CODE_I_007 = "I_007";
    public static final String ERROR_CODE_I_008 = "I_008";
    public static final int ERROR_CODE_PRIVACY_1 = 1;
    public static final int ERROR_CODE_PRIVACY_1000 = -1000;
    public static final int ERROR_CODE_PRIVACY_1001 = -1001;
    public static final int ERROR_CODE_PRIVACY_1002 = -1002;
    public static final int ERROR_CODE_PRIVACY_1003 = -1003;
    public static final int ERROR_CODE_PRIVACY_2 = -2;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33665a;
    private final slb b = new slb();
    private final slu c;
    private final jqu d;

    /* loaded from: classes5.dex */
    public interface a {
        void onResult(d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar);

        void onStartRequest();
    }

    /* loaded from: classes5.dex */
    public interface b {
        void onResult(d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar, d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar2);

        void onStartRequest(int i);
    }

    static {
        kge.a(-942303311);
    }

    public static /* synthetic */ FluidContext a(skv skvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("48c6290e", new Object[]{skvVar}) : skvVar.f33665a;
    }

    public skv(FluidContext fluidContext) {
        this.f33665a = fluidContext;
        this.b.a(new sky(this.f33665a, this));
        this.b.a(new slc(this.f33665a, this));
        this.c = new slu();
        this.d = new jqu();
    }

    public void a(a.C0494a c0494a, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eac4db", new Object[]{this, c0494a, aVar});
        } else if (c0494a == null) {
        } else {
            spz.c("DetailRequestManager", "fetchContentDetail, id:" + c0494a.d() + ",args:" + c0494a.f());
            if (((ISceneConfigService) this.f33665a.getService(ISceneConfigService.class)).getSessionParams() == null) {
                oce.a(this.f33665a.getContext(), "参数错误，请检查参数");
                a(aVar, sls.a("SessionParams is missing", (String) null));
                return;
            }
            spz.c("DetailRequestManager", "onStartFetch");
            if (aVar != null) {
                aVar.onStartRequest();
            }
            new skz(this.f33665a, this, 0, c0494a, aVar).a(c0494a, aVar);
        }
    }

    public void a(a.C0494a c0494a, a.C0494a c0494a2, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e9a478", new Object[]{this, c0494a, c0494a2, bVar});
            return;
        }
        final d[] dVarArr = new d[2];
        final boolean[] zArr = new boolean[2];
        String str = null;
        String d = c0494a != null ? c0494a.d() : null;
        if (c0494a2 != null) {
            str = c0494a2.d();
        }
        zArr[0] = !StringUtils.isEmpty(d);
        zArr[1] = !StringUtils.isEmpty(str) && !StringUtils.equals(d, str);
        if (zArr[0]) {
            a(c0494a, new a() { // from class: tb.skv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.skv.a
                public void onResult(d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1227a278", new Object[]{this, dVar});
                        return;
                    }
                    IDataService iDataService = (IDataService) skv.a(skv.this).getService(IDataService.class);
                    if (iDataService != null) {
                        iDataService.onResult(dVar);
                    }
                    d[] dVarArr2 = dVarArr;
                    dVarArr2[0] = dVar;
                    if (bVar == null) {
                        return;
                    }
                    if (dVarArr2[1] == null && zArr[1]) {
                        return;
                    }
                    b bVar2 = bVar;
                    d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>>[] dVarArr3 = dVarArr;
                    bVar2.onResult(dVarArr3[0], dVarArr3[1]);
                }

                @Override // tb.skv.a
                public void onStartRequest() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("adbafdd3", new Object[]{this});
                        return;
                    }
                    IDataService iDataService = (IDataService) skv.a(skv.this).getService(IDataService.class);
                    if (iDataService != null) {
                        iDataService.onStartRequest();
                    }
                    b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.onStartRequest(0);
                }
            });
        }
        if (!zArr[1]) {
            return;
        }
        a(c0494a2, new a() { // from class: tb.skv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.skv.a
            public void onResult(d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1227a278", new Object[]{this, dVar});
                    return;
                }
                IDataService iDataService = (IDataService) skv.a(skv.this).getService(IDataService.class);
                if (iDataService != null) {
                    iDataService.onResult(dVar);
                }
                d[] dVarArr2 = dVarArr;
                dVarArr2[1] = dVar;
                if (bVar == null) {
                    return;
                }
                if (dVarArr2[0] == null && zArr[0]) {
                    return;
                }
                b bVar2 = bVar;
                d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>>[] dVarArr3 = dVarArr;
                bVar2.onResult(dVarArr3[0], dVarArr3[1]);
            }

            @Override // tb.skv.a
            public void onStartRequest() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("adbafdd3", new Object[]{this});
                    return;
                }
                IDataService iDataService = (IDataService) skv.a(skv.this).getService(IDataService.class);
                if (iDataService != null) {
                    iDataService.onStartRequest();
                }
                b bVar2 = bVar;
                if (bVar2 == null) {
                    return;
                }
                bVar2.onStartRequest(1);
            }
        });
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f33665a.getContext();
    }

    public slb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (slb) ipChange.ipc$dispatch("16bc3274", new Object[]{this}) : this.b;
    }

    public slu c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (slu) ipChange.ipc$dispatch("1e6dda20", new Object[]{this}) : this.c;
    }

    public jqu d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jqu) ipChange.ipc$dispatch("261b7aed", new Object[]{this}) : this.d;
    }

    public void a(a aVar, d<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5681fafe", new Object[]{this, aVar, dVar});
            return;
        }
        spz.c("DetailRequestManager", "notifyContentDetailCallback");
        if (aVar != null) {
            aVar.onResult(dVar);
        }
        skl j = ((IDataService) this.f33665a.getService(IDataService.class)).getConfig().j();
        boolean equalsIgnoreCase = "video".equalsIgnoreCase(this.f33665a.getInstanceConfig().getTab3CardType());
        if (j == null || !equalsIgnoreCase) {
            return;
        }
        ohh.b("tab2FrameworkRefactor", Boolean.valueOf(j.al));
    }
}
