package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.DefaultFluidInstance;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import kotlin.jvm.internal.q;

/* loaded from: classes5.dex */
public final class shk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final shk INSTANCE;
    public static final String TAG = "InvalidContentHelper";

    /* loaded from: classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f33582a;
        public final /* synthetic */ Integer b;

        public a(FluidContext fluidContext, Integer num) {
            this.f33582a = fluidContext;
            this.b = num;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IFeedsListService iFeedsListService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ICardService iCardService = (ICardService) this.f33582a.getService(ICardService.class);
            Integer valueOf = iCardService != null ? Integer.valueOf(iCardService.getCurrentActiveCellPosition()) : null;
            spz.c(shk.TAG, "NewContentErrorStatus 延迟时间到，执行自动下滑，activePosition=" + valueOf + "; currentIndex=" + this.b);
            if (!q.a(valueOf, this.b)) {
                return;
            }
            FluidContext fluidContext = this.f33582a;
            if (((DefaultFluidInstance) fluidContext) == null || (iFeedsListService = (IFeedsListService) fluidContext.getService(IFeedsListService.class)) == null) {
                return;
            }
            iFeedsListService.publicNextVideo();
        }
    }

    static {
        kge.a(1573425119);
        INSTANCE = new shk();
    }

    private shk() {
    }

    public final void a(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb920272", new Object[]{this, fluidContext, aVar});
            return;
        }
        q.d(fluidContext, "fluidContext");
        if (!sjv.a()) {
            return;
        }
        Integer num = null;
        MediaContentDetailData.Content f = (aVar == null || (a2 = aVar.a()) == null) ? null : a2.f();
        b.a(fluidContext, f != null ? f.errorType : null, f != null ? f.errorUtpairs : null);
        spz.c(TAG, "NewContentErrorStatus 异常内容，即将执行自动下滑");
        IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
        if (iDataService != null) {
            num = Integer.valueOf(iDataService.getIndexOfList(aVar));
        }
        FluidService service = fluidContext.getService(IDataService.class);
        q.a(service);
        q.b(service, "fluidContext.getService<…ataService::class.java)!!");
        int totalCount = ((IDataService) service).getTotalCount();
        q.a(num);
        if (num.intValue() < totalCount - 1) {
            spz.c(TAG, "NewContentErrorStatus 存在下一坑内容，直接 执行自动下滑");
            IFeedsListService iFeedsListService = (IFeedsListService) fluidContext.getService(IFeedsListService.class);
            if (iFeedsListService == null) {
                return;
            }
            iFeedsListService.publicNextVideo();
            return;
        }
        int b = sjv.b();
        spz.c(TAG, "NewContentErrorStatus 不存在下一坑内容，延后 执行自动下滑, delayTime=" + b);
        sii.mHandler.postDelayed(new a(fluidContext, num), (long) b);
    }
}
