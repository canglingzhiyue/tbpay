package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/taobao/android/icart/broadcast/wvprocessor/impl/CartWVTriggerEventProcessor;", "Lcom/taobao/android/icart/broadcast/wvprocessor/ICartWVProcessor;", "()V", "process", "", "presenter", "Lcom/alibaba/android/icart/core/ICartPresenter;", "params", "Lcom/alibaba/fastjson/JSONObject;", "callback", "Landroid/taobao/windvane/jsbridge/WVCallBackContext;", "Companion", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes5.dex */
public final class tpj implements tph {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String actionType = "requestSubProtocol#triggerEvent";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/taobao/android/icart/broadcast/wvprocessor/impl/CartWVTriggerEventProcessor$process$tradeEvent$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f34251a;
        public final /* synthetic */ IDMComponent b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ bbz e;
        public final /* synthetic */ WVCallBackContext f;
        public final /* synthetic */ String g;

        public b(String str, IDMComponent iDMComponent, String str2, Ref.ObjectRef objectRef, bbz bbzVar, WVCallBackContext wVCallBackContext, String str3) {
            this.f34251a = str;
            this.b = iDMComponent;
            this.c = str2;
            this.d = objectRef;
            this.e = bbzVar;
            this.f = wVCallBackContext;
            this.g = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            jny O = this.e.O();
            if (!(O instanceof com.taobao.android.ultron.datamodel.imp.b)) {
                this.f.error("状态错误");
                return;
            }
            WVCallBackContext wVCallBackContext = this.f;
            r rVar = r.RET_SUCCESS;
            rVar.a("protocol", ipo.INSTANCE.a(((com.taobao.android.ultron.datamodel.imp.b) O).M(), this.g));
            t tVar = t.INSTANCE;
            wVCallBackContext.success(rVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/taobao/android/icart/broadcast/wvprocessor/impl/CartWVTriggerEventProcessor$process$tradeEvent$1$2"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f34252a;
        public final /* synthetic */ IDMComponent b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ bbz e;
        public final /* synthetic */ WVCallBackContext f;
        public final /* synthetic */ String g;

        public c(String str, IDMComponent iDMComponent, String str2, Ref.ObjectRef objectRef, bbz bbzVar, WVCallBackContext wVCallBackContext, String str3) {
            this.f34252a = str;
            this.b = iDMComponent;
            this.c = str2;
            this.d = objectRef;
            this.e = bbzVar;
            this.f = wVCallBackContext;
            this.g = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f.error();
            }
        }
    }

    static {
        kge.a(216523077);
        kge.a(-929190291);
        Companion = new a(null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/android/icart/broadcast/wvprocessor/impl/CartWVTriggerEventProcessor$Companion;", "", "()V", "actionType", "", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes5.dex */
    public static final class a {
        static {
            kge.a(-126436787);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.taobao.android.ultron.common.model.b] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, com.taobao.android.ultron.common.model.b, java.lang.Object] */
    @Override // tb.tph
    public boolean a(bbz presenter, JSONObject params, WVCallBackContext callback) {
        String string;
        String string2;
        String string3;
        String string4;
        IDMComponent b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19963093", new Object[]{this, presenter, params, callback})).booleanValue();
        }
        q.d(presenter, "presenter");
        q.d(params, "params");
        q.d(callback, "callback");
        JSONObject jSONObject = params.getJSONObject("exParams");
        if (jSONObject == null || (string = jSONObject.getString("componentKey")) == null || (string2 = jSONObject.getString("eventArea")) == null || (string3 = jSONObject.getString("eventType")) == null || (string4 = params.getString("renderRoot")) == null || (b2 = presenter.O().b(string)) == null) {
            return false;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (com.taobao.android.ultron.common.model.b) 0;
        List<com.taobao.android.ultron.common.model.b> list = b2.getEventMap().get(string2);
        if (list == null) {
            return false;
        }
        Iterator<com.taobao.android.ultron.common.model.b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.taobao.android.ultron.common.model.b event = it.next();
            q.b(event, "event");
            if (q.a((Object) string3, (Object) event.getType())) {
                objectRef.element = event;
                break;
            }
        }
        if (((com.taobao.android.ultron.common.model.b) objectRef.element) == null) {
            return false;
        }
        bmz I = presenter.I();
        q.b(I, "this");
        I.a(string3);
        I.a(b2);
        I.c(string2);
        I.a((com.taobao.android.ultron.common.model.b) objectRef.element);
        I.a("requestSuccessCallback", new b(string3, b2, string2, objectRef, presenter, callback, string4));
        I.a("requestFailCallback", new c(string3, b2, string2, objectRef, presenter, callback, string4));
        q.b(I, "presenter.buildTradeEven…\n            })\n        }");
        presenter.F().a(I);
        return true;
    }
}
