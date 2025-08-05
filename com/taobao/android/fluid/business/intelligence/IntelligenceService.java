package com.taobao.android.fluid.business.intelligence;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import java.util.List;
import tb.jcq;
import tb.jcr;
import tb.jcs;
import tb.kge;
import tb.obu;

/* loaded from: classes5.dex */
public class IntelligenceService implements IIntelligenceService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IIntelligenceService";
    private jcq mBehaviorManager;
    private jcr mBehaviorXManager;
    private final FluidContext mFluidContext;
    private final String TAG = "IntelligenceService";
    private a reorderContentBridge = null;
    private b smartMobileBroadcastHandler = null;
    private final jcs mIntelligenceServiceConfig = new jcs();

    static {
        kge.a(2137482941);
        kge.a(-749994778);
    }

    private List getBufferList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7205d16c", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public IntelligenceService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    @Override // com.taobao.android.fluid.business.intelligence.IIntelligenceService
    public jcs getConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jcs) ipChange.ipc$dispatch("feb873cd", new Object[]{this}) : this.mIntelligenceServiceConfig;
    }

    @Override // com.taobao.android.fluid.business.intelligence.IIntelligenceService
    public jcq getBehaviorManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jcq) ipChange.ipc$dispatch("1f1648e2", new Object[]{this}) : this.mBehaviorManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    @Override // com.taobao.android.fluid.business.intelligence.IIntelligenceService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getBehaviorInput(boolean r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.fluid.business.intelligence.IntelligenceService.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r2 = 1
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            r1[r2] = r3
            java.lang.String r7 = "a8ae5707"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            return r7
        L1b:
            com.taobao.android.fluid.core.FluidContext r0 = r6.mFluidContext
            java.lang.Class<com.taobao.android.fluid.framework.data.IDataService> r1 = com.taobao.android.fluid.framework.data.IDataService.class
            com.taobao.android.fluid.core.FluidService r0 = r0.getService(r1)
            com.taobao.android.fluid.framework.data.IDataService r0 = (com.taobao.android.fluid.framework.data.IDataService) r0
            tb.skk r0 = r0.getConfig()
            tb.skl r0 = r0.j()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r0.J
            r3 = 0
            if (r1 == 0) goto L77
            java.lang.String r1 = "config"
            if (r7 == 0) goto L57
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.J
            java.lang.String r4 = "videoReRank"
            java.lang.Object r0 = r0.get(r4)
            boolean r4 = r0 instanceof java.util.Map
            if (r4 == 0) goto L77
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r0.get(r1)
            if (r4 == 0) goto L78
            boolean r5 = r4 instanceof java.lang.String
            if (r5 != 0) goto L78
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)
            r0.put(r1, r4)
            goto L78
        L57:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.J
            java.lang.String r4 = "dynamicRecommend"
            java.lang.Object r0 = r0.get(r4)
            boolean r4 = r0 instanceof java.util.Map
            if (r4 == 0) goto L77
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r0.get(r1)
            if (r4 == 0) goto L78
            boolean r5 = r4 instanceof java.lang.String
            if (r5 != 0) goto L78
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r4)
            r0.put(r1, r4)
            goto L78
        L77:
            r0 = r3
        L78:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.List r4 = r6.getItemList()
            if (r7 == 0) goto L87
            java.util.List r3 = r6.getBufferList()
        L87:
            if (r4 == 0) goto L8d
            int r2 = r4.size()
        L8d:
            if (r4 == 0) goto L90
            goto L95
        L90:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L95:
            if (r3 == 0) goto L9a
            r4.addAll(r3)
        L9a:
            java.lang.String r7 = com.alibaba.fastjson.JSON.toJSONString(r4)
            java.lang.String r3 = "itemList"
            r1.put(r3, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "unExposeCount"
            r1.put(r2, r7)
            if (r0 == 0) goto Lb2
            r1.putAll(r0)
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.business.intelligence.IntelligenceService.getBehaviorInput(boolean):java.lang.Object");
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        this.reorderContentBridge = new a(this.mFluidContext);
        this.mBehaviorXManager = new jcr(this.mFluidContext);
        this.mBehaviorManager = new jcq();
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this.mBehaviorXManager);
        if (obu.i()) {
            return;
        }
        this.smartMobileBroadcastHandler = new b(this.mFluidContext);
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this.smartMobileBroadcastHandler);
    }

    private List getItemList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("c2c777b9", new Object[]{this}) : ((IDataService) this.mFluidContext.getService(IDataService.class)).getUnExposeItems();
    }

    public static void throwErrorCode(FluidContext fluidContext, int i, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e93c310", new Object[]{fluidContext, new Integer(i), str, th});
        } else if (fluidContext == null) {
        } else {
            com.taobao.android.fluid.core.b bVar = new com.taobao.android.fluid.core.b(com.taobao.android.fluid.core.b.PREFIX_FLUID_INTELLIGENCE_SERVICE + String.valueOf(i), str);
            if (th != null) {
                FluidException.throwException(fluidContext, com.taobao.android.fluid.core.b.SERVICE_CONSTRUCTOR_ERROR, th);
            } else {
                FluidException.throwException(fluidContext, bVar, str);
            }
        }
    }
}
