package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.npr;

/* loaded from: classes8.dex */
public final class nwh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "NegativeFeedbackRequest";

    /* renamed from: a  reason: collision with root package name */
    private npn f31805a;

    /* loaded from: classes8.dex */
    public static final class b implements iud<nno> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.iud
        public /* bridge */ /* synthetic */ void a(nno nnoVar) {
        }
    }

    static {
        kge.a(1874277213);
        Companion = new a(null);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1690808731);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final void a(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5944a8b", new Object[]{this, activity, map});
            return;
        }
        q.c(activity, "activity");
        npn npnVar = this.f31805a;
        if (npnVar != null && !npnVar.b()) {
            npnVar.a();
        }
        this.f31805a = new npr.b().a(new nwi(map)).a().a().a(new b(), new npj(TAG));
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        npn npnVar = this.f31805a;
        if (npnVar != null && !npnVar.b()) {
            npnVar.a();
        }
        this.f31805a = null;
    }
}
