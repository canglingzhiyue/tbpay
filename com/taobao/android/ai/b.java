package com.taobao.android.ai;

import android.support.v7.widget.RecyclerView;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ai.a;
import com.taobao.android.ai.api.IAfterBuyAiApi;
import com.taobao.android.ai.behavir.cache.a;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.Map;
import tb.kge;
import tb.ldf;
import tb.mto;
import tb.ope;
import tb.osm;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9014a;
    private final com.taobao.android.ai.a b;
    private IAfterBuyAiApi c;
    private final a.InterfaceC0347a d;

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f9016a;

        static {
            kge.a(-1549475381);
            f9016a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("cc8d6cb", new Object[0]) : f9016a;
        }
    }

    static {
        kge.a(178360429);
    }

    public static /* synthetic */ IAfterBuyAiApi a(b bVar, IAfterBuyAiApi iAfterBuyAiApi) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAfterBuyAiApi) ipChange.ipc$dispatch("6923fa0b", new Object[]{bVar, iAfterBuyAiApi});
        }
        bVar.c = iAfterBuyAiApi;
        return iAfterBuyAiApi;
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2ef90b", new Object[]{bVar});
        } else {
            bVar.h();
        }
    }

    public static /* synthetic */ void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dda1615", new Object[]{bVar, str});
        } else {
            bVar.c(str);
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("cc8d6cb", new Object[0]) : a.a();
    }

    private b() {
        this.f9014a = "afterbuyai_remote_bundle";
        this.d = new a.InterfaceC0347a() { // from class: com.taobao.android.ai.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.ai.a.InterfaceC0347a
            public void a(IAfterBuyAiApi iAfterBuyAiApi) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1600ac4f", new Object[]{this, iAfterBuyAiApi});
                    return;
                }
                ldf.d("AfterBuyAi", "远程化加载成功");
                b.a(b.this, iAfterBuyAiApi);
            }

            @Override // com.taobao.android.ai.a.InterfaceC0347a
            public void a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                ldf.d("AfterBuyAi", "远程化加载失败，errorMsg ： " + str);
                b.a(b.this);
                b.a(b.this, str);
            }
        };
        this.b = new com.taobao.android.ai.a(this.d);
        this.b.a(Globals.getApplication());
    }

    public void a(osm osmVar, ope opeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e779e17b", new Object[]{this, osmVar, opeVar});
            return;
        }
        ldf.d("AfterBuyAi", "init ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.init(osmVar, opeVar);
        } else {
            this.b.a(Globals.getApplication());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ldf.d("AfterBuyAi", "updateContainerType ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.updateContainerType();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ldf.d("AfterBuyAi", "updateContainer ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.updateContainer();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ldf.d("AfterBuyAi", "resetAiRefreshDeltaData ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.resetAiRefreshDeltaData(str);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ldf.d("AfterBuyAi", "registerBehavirSolution ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.registerBehavirSolution();
        } else {
            this.b.a(Globals.getApplication());
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ldf.d("AfterBuyAi", "unRegisterBehavirSolution ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.unRegisterBehavirSolution();
    }

    public void a(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc8472e", new Object[]{this, str, awesomeGetContainerData});
            return;
        }
        ldf.d("AfterBuyAi", "preloadModel ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi != null) {
            iAfterBuyAiApi.preloadModel(str, awesomeGetContainerData);
        } else {
            this.b.a(Globals.getApplication());
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ldf.d("AfterBuyAi", "checkConfig ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.checkConfig();
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        ldf.d("AfterBuyAi", "addAISolutionBizParam ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.addAISolutionBizParam(str, map);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ldf.d("AfterBuyAi", "clearMemoryBufferList ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.clearMemoryBufferList(str);
    }

    public void a(boolean z, String str, a.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360c5a9a", new Object[]{this, new Boolean(z), str, aVar});
            return;
        }
        ldf.d("AfterBuyAi", "initDiskBufferListToMemory ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.initDiskBufferListToMemory(z, str, aVar);
    }

    public void a(String str, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43713360", new Object[]{this, str, recyclerView});
            return;
        }
        ldf.d("AfterBuyAi", "aiRefreshInsert ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.aiRefreshInsert(str, recyclerView);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ldf.d("AfterBuyAi", "clearBufferList ");
        IAfterBuyAiApi iAfterBuyAiApi = this.c;
        if (iAfterBuyAiApi == null) {
            return;
        }
        iAfterBuyAiApi.clearBufferList();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            AppMonitor.register("AfterBuyAi", "afterbuyai_remote_bundle", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            AppMonitor.Stat.commit("AfterBuyAi", "afterbuyai_remote_bundle", DimensionValueSet.create().setValue("stat", "loading").setValue("success", "false").setValue("errorCode", "-1").setValue("errorMsg", str), MeasureValueSet.create().setValue("cost", mto.a.GEO_NOT_SUPPORT));
        }
    }
}
