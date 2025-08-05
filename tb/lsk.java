package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.a;
import com.taobao.bootimage.linked.c;
import com.taobao.bootimage.linked.f;
import com.taobao.bootimage.linked.h;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class lsk implements lss {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "com.taobao.tao.TBMainActivity";
    public static final String KEY_OAID = "oaid";
    public static final String SPLASH_BUSINESS_TAG = "splash_business";

    /* renamed from: a  reason: collision with root package name */
    private lso f30892a;
    private lsq b;
    private lsl c;
    private final IContainerDataService<?> d;
    private final IContainerDataService.c e;
    private c f;
    private kqk h;
    private final List<kqn> i = new ArrayList();
    private final f g = new f() { // from class: tb.lsk.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.bootimage.linked.f
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (lsk.a(lsk.this) != null) {
                return lsk.a(lsk.this).f();
            }
            return false;
        }
    };

    static {
        kge.a(-1448778041);
        kge.a(2002375801);
    }

    public static /* synthetic */ lsl a(lsk lskVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lsl) ipChange.ipc$dispatch("4ab6184d", new Object[]{lskVar}) : lskVar.c;
    }

    public lsk(ljs ljsVar) {
        a(ljsVar);
        this.d = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.e = g();
        a(this.d, this.e);
    }

    @Override // tb.lss
    public void a(IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2453afd3", new Object[]{this, iContainerDataModel});
            return;
        }
        try {
            if (this.f30892a != null && this.f30892a.b(iContainerDataModel.getBase())) {
                d();
                b(iContainerDataModel);
                return;
            }
            ldf.d(SPLASH_BUSINESS_TAG, "onUpdateSplashData-> no need update.");
        } catch (Throwable th) {
            ldf.d(SPLASH_BUSINESS_TAG, "onUpdateSplashData->  onUpdateSplashData-> error：" + Log.getStackTraceString(th));
        }
    }

    @Override // tb.lss
    public boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        for (kqn kqnVar : this.i) {
            if (kqnVar.g()) {
                z = true;
            }
        }
        ldf.d(SPLASH_BUSINESS_TAG, "expendTopViewRecord");
        for (kqn kqnVar2 : this.i) {
            kqnVar2.h();
        }
        return z;
    }

    @Override // tb.lss
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        kqk kqkVar = this.h;
        if (kqkVar != null) {
            kqkVar.f();
        }
        b(this.d, this.e);
        h();
    }

    private void b(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24715b2", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null || !base.isRemote()) {
        } else {
            JSONObject a2 = this.f30892a.a(base);
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("onUpdateSplashData-> update success, splashData is null:");
            if (a2 != null) {
                z = false;
            }
            sb.append(z);
            strArr[0] = sb.toString();
            ldf.d(SPLASH_BUSINESS_TAG, strArr);
            h.a(BIZ_NAME).a(a2);
        }
    }

    private void a(IContainerDataService<?> iContainerDataService, IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a494ef89", new Object[]{this, iContainerDataService, cVar});
        } else if (iContainerDataService == null) {
        } else {
            iContainerDataService.addRequestBizParamsCreator(cVar);
        }
    }

    private void b(IContainerDataService<?> iContainerDataService, IContainerDataService.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab42c8a", new Object[]{this, iContainerDataService, cVar});
        } else if (iContainerDataService == null) {
        } else {
            iContainerDataService.removeRequestBizParamsCreator(cVar);
        }
    }

    private IContainerDataService.c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService.c) ipChange.ipc$dispatch("47f53421", new Object[]{this}) : new IContainerDataService.c() { // from class: tb.lsk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.c
            public Map<String, String> a(lli lliVar, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Map) ipChange2.ipc$dispatch("add74dce", new Object[]{this, lliVar, str});
                }
                String a2 = luu.a(Globals.getApplication());
                if (TextUtils.isEmpty(a2)) {
                    ldf.d("SplashBusinessController", "oaid is null");
                    return null;
                }
                HashMap hashMap = new HashMap(1);
                hashMap.put("oaid", a2);
                return hashMap;
            }
        };
    }

    @Override // tb.lss
    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        lsl lslVar = this.c;
        if (lslVar != null) {
            return lslVar.i();
        }
        return null;
    }

    @Override // tb.lss
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64060b15", new Object[]{this, aVar});
            return;
        }
        c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.a(aVar);
    }

    @Override // tb.lss
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8454374", new Object[]{this, aVar});
            return;
        }
        c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.b(aVar);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c cVar = this.f;
        if (cVar == null) {
            return;
        }
        cVar.a(this.g);
    }

    private void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        this.f30892a = new lso(ljsVar);
        this.b = new lsq(ljsVar, this.f30892a);
        this.c = new lsl(new lsm(ljsVar));
        this.h = new kqk(ljsVar);
        this.f = h.b(BIZ_NAME);
        this.f.a(this.b);
        this.f.a(this.c);
        this.f.a(this.h);
        this.i.add(this.c);
        this.i.add(this.h);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        c cVar = this.f;
        if (cVar == null) {
            return;
        }
        lsq lsqVar = this.b;
        if (lsqVar != null) {
            cVar.b(lsqVar);
        }
        lsl lslVar = this.c;
        if (lslVar != null) {
            this.f.b(lslVar);
        }
        kqk kqkVar = this.h;
        if (kqkVar != null) {
            this.f.b(kqkVar);
            this.h = null;
        }
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.a((f) null);
        }
        this.i.clear();
    }
}
