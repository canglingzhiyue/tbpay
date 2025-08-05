package com.taobao.infoflow.core.subservice.biz.staytime.impl;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.io.Serializable;
import tb.kge;
import tb.ldf;
import tb.ldl;
import tb.ljh;
import tb.ljr;
import tb.ljs;

/* loaded from: classes.dex */
public class StayTimeWaiter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Long f17396a;
    private StayTimeModel b;

    static {
        kge.a(-1165817420);
    }

    public void a(ljs ljsVar) {
        StayTimeModel stayTimeModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        this.b = new StayTimeModel();
        StayTimeModel.access$102(this.b, System.nanoTime());
        int[] d = d(ljsVar);
        if (d == null || (stayTimeModel = this.b) == null) {
            return;
        }
        StayTimeModel.access$202(stayTimeModel, d[0]);
        StayTimeModel.access$302(this.b, d[0]);
        StayTimeModel.access$402(this.b, d[1]);
        StayTimeModel.access$502(this.b, d[1]);
    }

    public void a(ljs ljsVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a7fa321", new Object[]{this, ljsVar, new Long(j)});
            return;
        }
        ljr a2 = ljsVar.a();
        String c = a2.c();
        String a3 = a2.a();
        JSONObject c2 = c(ljsVar);
        StayTimeModel stayTimeModel = this.b;
        if (stayTimeModel == null || StayTimeModel.access$100(stayTimeModel) == 0) {
            ldf.d("StayTimeWaiter", "it has no enterTime with " + c + "_" + a3 + ", so this commitLeave is abandon.");
            return;
        }
        if (j > 0) {
            StayTimeModel.access$602(this.b, j);
        } else {
            StayTimeModel.access$602(this.b, System.nanoTime());
        }
        long access$600 = ((StayTimeModel.access$600(this.b) - StayTimeModel.access$100(this.b)) + 500000) / 1000000;
        Long l = this.f17396a;
        if (l != null && access$600 < l.longValue()) {
            return;
        }
        if (c2 == null) {
            c2 = new JSONObject();
        }
        int[] d = d(ljsVar);
        if (d != null) {
            StayTimeModel.access$302(this.b, d[0]);
            StayTimeModel.access$402(this.b, d[1]);
        }
        StayTimeModel stayTimeModel2 = this.b;
        StayTimeModel.access$502(stayTimeModel2, Math.max(StayTimeModel.access$500(stayTimeModel2), StayTimeModel.access$400(this.b)));
        c2.put("enterFirstPos", (Object) Integer.valueOf(StayTimeModel.access$200(this.b)));
        c2.put("leaveFirstPos", (Object) Integer.valueOf(StayTimeModel.access$300(this.b)));
        c2.put("leaveLastPos", (Object) Integer.valueOf(StayTimeModel.access$400(this.b)));
        c2.put("maxScrollPos", (Object) Integer.valueOf(StayTimeModel.access$500(this.b)));
        ldl.a(c, 2002, a3, null, String.valueOf(access$600), ljh.a(c, c2));
        this.b = null;
    }

    public void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
        } else {
            this.f17396a = l;
        }
    }

    private JSONObject c(ljs ljsVar) {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f7a2b825", new Object[]{this, ljsVar});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService != null && (containerData = iContainerDataService.getContainerData()) != null && (base = containerData.getBase()) != null) {
            return base.getStayTimeParams();
        }
        return null;
    }

    private int[] d(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("10188a1e", new Object[]{this, ljsVar});
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.getVisiblePositionRange();
        }
        return null;
    }

    /* loaded from: classes7.dex */
    public static class StayTimeModel implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private long endTime;
        private int enterFirstPos;
        private int leaveFirstPos;
        private int leaveLastPos;
        private int maxScrollPos;
        private long startTime;

        static {
            kge.a(1819289331);
            kge.a(1028243835);
        }

        private StayTimeModel() {
        }

        public static /* synthetic */ long access$100(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cccabc08", new Object[]{stayTimeModel})).longValue() : stayTimeModel.startTime;
        }

        public static /* synthetic */ long access$102(StayTimeModel stayTimeModel, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3c6ef362", new Object[]{stayTimeModel, new Long(j)})).longValue();
            }
            stayTimeModel.startTime = j;
            return j;
        }

        public static /* synthetic */ int access$200(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("92f544c8", new Object[]{stayTimeModel})).intValue() : stayTimeModel.enterFirstPos;
        }

        public static /* synthetic */ int access$202(StayTimeModel stayTimeModel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b957eff", new Object[]{stayTimeModel, new Integer(i)})).intValue();
            }
            stayTimeModel.enterFirstPos = i;
            return i;
        }

        public static /* synthetic */ int access$300(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("591fcd89", new Object[]{stayTimeModel})).intValue() : stayTimeModel.leaveFirstPos;
        }

        public static /* synthetic */ int access$302(StayTimeModel stayTimeModel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3abc0e5e", new Object[]{stayTimeModel, new Integer(i)})).intValue();
            }
            stayTimeModel.leaveFirstPos = i;
            return i;
        }

        public static /* synthetic */ int access$400(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1f4a564a", new Object[]{stayTimeModel})).intValue() : stayTimeModel.leaveLastPos;
        }

        public static /* synthetic */ int access$402(StayTimeModel stayTimeModel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("39e29dbd", new Object[]{stayTimeModel, new Integer(i)})).intValue();
            }
            stayTimeModel.leaveLastPos = i;
            return i;
        }

        public static /* synthetic */ int access$500(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e574df0b", new Object[]{stayTimeModel})).intValue() : stayTimeModel.maxScrollPos;
        }

        public static /* synthetic */ int access$502(StayTimeModel stayTimeModel, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("39092d1c", new Object[]{stayTimeModel, new Integer(i)})).intValue();
            }
            stayTimeModel.maxScrollPos = i;
            return i;
        }

        public static /* synthetic */ long access$600(StayTimeModel stayTimeModel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab9f67cd", new Object[]{stayTimeModel})).longValue() : stayTimeModel.endTime;
        }

        public static /* synthetic */ long access$602(StayTimeModel stayTimeModel, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("382fc03d", new Object[]{stayTimeModel, new Long(j)})).longValue();
            }
            stayTimeModel.endTime = j;
            return j;
        }
    }
}
