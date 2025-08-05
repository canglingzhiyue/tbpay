package com.taobao.android.fluid.business.undermode.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.undermode.IUnderageModeService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.CommonResponseOutDo;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jun;
import tb.kge;
import tb.riy;
import tb.spz;

/* loaded from: classes5.dex */
public final class UnderageTimelimitHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final UnderageTimelimitHelper INSTANCE;
    public static final String TAG = "UnderageModeHelper";

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f12410a;

    /* loaded from: classes5.dex */
    public static final class UnderageModeResponse extends CommonResponseOutDo<UnderageModeResponseInfo> {
        static {
            kge.a(1588746864);
        }
    }

    static {
        kge.a(-1528750849);
        INSTANCE = new UnderageTimelimitHelper();
        f12410a = new Handler(Looper.getMainLooper());
    }

    private UnderageTimelimitHelper() {
    }

    public final Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : f12410a;
    }

    public final void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{this, fluidContext});
            return;
        }
        q.d(fluidContext, "fluidContext");
        if (!com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.a()) {
            spz.c("UnderageModeHelper", "checkLimitAndPending -- 非青少年模式 ");
            return;
        }
        Context context = fluidContext.getContext();
        if (context == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
        Activity activity = (Activity) context;
        if (b.INSTANCE.a(activity)) {
            spz.c("UnderageModeHelper", "checkLimitAndPending -- 时间锁关闭，无需check，当天不限制 ");
            return;
        }
        UnderageModeRequestInfo underageModeRequestInfo = new UnderageModeRequestInfo(null, null, 3, null);
        spz.c("UnderageModeHelper", "checkLimitAndPending - start request");
        FluidSDK.getMTopAdapter().send(underageModeRequestInfo, new a(fluidContext, activity), UnderageModeResponse.class);
    }

    /* loaded from: classes5.dex */
    public static final class a implements IMTopAdapter.b<UnderageModeResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FluidContext f12411a;
        public final /* synthetic */ Activity b;

        /* renamed from: com.taobao.android.fluid.business.undermode.helper.UnderageTimelimitHelper$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class RunnableC0488a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0488a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UnderageTimelimitHelper.INSTANCE.a(a.this.f12411a);
                }
            }
        }

        public a(FluidContext fluidContext, Activity activity) {
            this.f12411a = fluidContext;
            this.b = activity;
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void a(MtopResponse mtopResponse, UnderageModeResponse underageModeResponse) {
            jun config;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("917392c4", new Object[]{this, mtopResponse, underageModeResponse});
                return;
            }
            if ((underageModeResponse != null ? (UnderageModeResponseInfo) underageModeResponse.data : null) == null) {
                return;
            }
            UnderageModeResponseInfo underageModeResponseInfo = (UnderageModeResponseInfo) underageModeResponse.data;
            spz.c("UnderageModeHelper", "checkLimitAndPending - onSuccess " + underageModeResponseInfo);
            if (underageModeResponseInfo == null) {
                return;
            }
            if (underageModeResponseInfo.getLimit()) {
                com.taobao.android.fluid.business.undermode.helper.a.INSTANCE.a(this.f12411a, this.b, underageModeResponseInfo.getLimitReasonType());
                return;
            }
            IUnderageModeService iUnderageModeService = (IUnderageModeService) this.f12411a.getService(IUnderageModeService.class);
            if (iUnderageModeService != null && (config = iUnderageModeService.getConfig()) != null) {
                config.b(false);
            }
            UnderageTimelimitHelper.INSTANCE.a().postDelayed(new RunnableC0488a(), Math.max(underageModeResponseInfo.getRemainSeconds() * 1000, 60000L));
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void a(MtopResponse response) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, response});
                return;
            }
            q.d(response, "response");
            spz.c("UnderageModeHelper", "checkLimitAndPending - onError  response=" + response.getRetMsg());
        }
    }

    public final void b(FluidContext fluidContext) {
        jun config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{this, fluidContext});
            return;
        }
        q.d(fluidContext, "fluidContext");
        spz.c("UnderageModeHelper", "resetUnderageMode - 后台停止下次检查青少年模式");
        f12410a.removeCallbacksAndMessages(null);
        IUnderageModeService iUnderageModeService = (IUnderageModeService) fluidContext.getService(IUnderageModeService.class);
        if (iUnderageModeService == null || (config = iUnderageModeService.getConfig()) == null) {
            return;
        }
        config.b(false);
    }

    /* loaded from: classes5.dex */
    public static final class UnderageModeRequestInfo implements IMTOPDataObject {
        private final String API_NAME;
        private final String VERSION;

        static {
            kge.a(-879475890);
            kge.a(-350052935);
        }

        public UnderageModeRequestInfo() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ UnderageModeRequestInfo copy$default(UnderageModeRequestInfo underageModeRequestInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = underageModeRequestInfo.API_NAME;
            }
            if ((i & 2) != 0) {
                str2 = underageModeRequestInfo.VERSION;
            }
            return underageModeRequestInfo.copy(str, str2);
        }

        public final String component1() {
            return this.API_NAME;
        }

        public final String component2() {
            return this.VERSION;
        }

        public final UnderageModeRequestInfo copy(String API_NAME, String VERSION) {
            q.d(API_NAME, "API_NAME");
            q.d(VERSION, "VERSION");
            return new UnderageModeRequestInfo(API_NAME, VERSION);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof UnderageModeRequestInfo)) {
                    return false;
                }
                UnderageModeRequestInfo underageModeRequestInfo = (UnderageModeRequestInfo) obj;
                return q.a((Object) this.API_NAME, (Object) underageModeRequestInfo.API_NAME) && q.a((Object) this.VERSION, (Object) underageModeRequestInfo.VERSION);
            }
            return true;
        }

        public int hashCode() {
            String str = this.API_NAME;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.VERSION;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "UnderageModeRequestInfo(API_NAME=" + this.API_NAME + ", VERSION=" + this.VERSION + riy.BRACKET_END_STR;
        }

        public UnderageModeRequestInfo(String API_NAME, String VERSION) {
            q.d(API_NAME, "API_NAME");
            q.d(VERSION, "VERSION");
            this.API_NAME = API_NAME;
            this.VERSION = VERSION;
        }

        public final String getAPI_NAME() {
            return this.API_NAME;
        }

        public /* synthetic */ UnderageModeRequestInfo(String str, String str2, int i, o oVar) {
            this((i & 1) != 0 ? "mtop.taobao.content.detail.underage.timelimit" : str, (i & 2) != 0 ? "1.0" : str2);
        }

        public final String getVERSION() {
            return this.VERSION;
        }
    }

    /* loaded from: classes5.dex */
    public static final class UnderageModeResponseInfo implements IMTOPDataObject {
        private boolean limit;
        private String limitReasonType;
        private int remainSeconds;
        private int timeRangeFrom;
        private int timeRangeTo;
        private int viewLimitMinutes;

        static {
            kge.a(-1337820354);
            kge.a(-350052935);
        }

        public static /* synthetic */ UnderageModeResponseInfo copy$default(UnderageModeResponseInfo underageModeResponseInfo, boolean z, int i, int i2, int i3, int i4, String str, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z = underageModeResponseInfo.limit;
            }
            if ((i5 & 2) != 0) {
                i = underageModeResponseInfo.remainSeconds;
            }
            int i6 = i;
            if ((i5 & 4) != 0) {
                i2 = underageModeResponseInfo.timeRangeFrom;
            }
            int i7 = i2;
            if ((i5 & 8) != 0) {
                i3 = underageModeResponseInfo.timeRangeTo;
            }
            int i8 = i3;
            if ((i5 & 16) != 0) {
                i4 = underageModeResponseInfo.viewLimitMinutes;
            }
            int i9 = i4;
            if ((i5 & 32) != 0) {
                str = underageModeResponseInfo.limitReasonType;
            }
            return underageModeResponseInfo.copy(z, i6, i7, i8, i9, str);
        }

        public final boolean component1() {
            return this.limit;
        }

        public final int component2() {
            return this.remainSeconds;
        }

        public final int component3() {
            return this.timeRangeFrom;
        }

        public final int component4() {
            return this.timeRangeTo;
        }

        public final int component5() {
            return this.viewLimitMinutes;
        }

        public final String component6() {
            return this.limitReasonType;
        }

        public final UnderageModeResponseInfo copy(boolean z, int i, int i2, int i3, int i4, String limitReasonType) {
            q.d(limitReasonType, "limitReasonType");
            return new UnderageModeResponseInfo(z, i, i2, i3, i4, limitReasonType);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof UnderageModeResponseInfo)) {
                    return false;
                }
                UnderageModeResponseInfo underageModeResponseInfo = (UnderageModeResponseInfo) obj;
                return this.limit == underageModeResponseInfo.limit && this.remainSeconds == underageModeResponseInfo.remainSeconds && this.timeRangeFrom == underageModeResponseInfo.timeRangeFrom && this.timeRangeTo == underageModeResponseInfo.timeRangeTo && this.viewLimitMinutes == underageModeResponseInfo.viewLimitMinutes && q.a((Object) this.limitReasonType, (Object) underageModeResponseInfo.limitReasonType);
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.limit;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = ((((((((i * 31) + this.remainSeconds) * 31) + this.timeRangeFrom) * 31) + this.timeRangeTo) * 31) + this.viewLimitMinutes) * 31;
            String str = this.limitReasonType;
            return i3 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "UnderageModeResponseInfo(limit=" + this.limit + ", remainSeconds=" + this.remainSeconds + ", timeRangeFrom=" + this.timeRangeFrom + ", timeRangeTo=" + this.timeRangeTo + ", viewLimitMinutes=" + this.viewLimitMinutes + ", limitReasonType=" + this.limitReasonType + riy.BRACKET_END_STR;
        }

        public UnderageModeResponseInfo(boolean z, int i, int i2, int i3, int i4, String limitReasonType) {
            q.d(limitReasonType, "limitReasonType");
            this.limit = z;
            this.remainSeconds = i;
            this.timeRangeFrom = i2;
            this.timeRangeTo = i3;
            this.viewLimitMinutes = i4;
            this.limitReasonType = limitReasonType;
        }

        public final boolean getLimit() {
            return this.limit;
        }

        public final void setLimit(boolean z) {
            this.limit = z;
        }

        public final int getRemainSeconds() {
            return this.remainSeconds;
        }

        public final void setRemainSeconds(int i) {
            this.remainSeconds = i;
        }

        public final int getTimeRangeFrom() {
            return this.timeRangeFrom;
        }

        public final void setTimeRangeFrom(int i) {
            this.timeRangeFrom = i;
        }

        public final int getTimeRangeTo() {
            return this.timeRangeTo;
        }

        public final void setTimeRangeTo(int i) {
            this.timeRangeTo = i;
        }

        public final int getViewLimitMinutes() {
            return this.viewLimitMinutes;
        }

        public final void setViewLimitMinutes(int i) {
            this.viewLimitMinutes = i;
        }

        public /* synthetic */ UnderageModeResponseInfo(boolean z, int i, int i2, int i3, int i4, String str, int i5, o oVar) {
            this((i5 & 1) != 0 ? false : z, (i5 & 2) == 0 ? i : 0, (i5 & 4) != 0 ? 22 : i2, (i5 & 8) != 0 ? 6 : i3, (i5 & 16) != 0 ? 40 : i4, (i5 & 32) != 0 ? "" : str);
        }

        public final String getLimitReasonType() {
            return this.limitReasonType;
        }

        public final void setLimitReasonType(String str) {
            q.d(str, "<set-?>");
            this.limitReasonType = str;
        }

        public UnderageModeResponseInfo() {
            this(false, 0, 0, 0, 0, null, 62, null);
        }
    }
}
