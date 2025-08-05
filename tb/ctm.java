package tb;

import android.graphics.RectF;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class ctm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIM_BIG_CARD = 1;
    public static final int ANIM_SMALL_CARD = 0;
    public static final a Companion;
    public static final int OPTION_ADD = 0;
    public static final int OPTION_HIDE = 2;
    public static final int OPTION_REFRESH = 4;
    public static final int OPTION_REMOVE = 1;
    public static final int OPTION_SHOW = 3;

    /* renamed from: a  reason: collision with root package name */
    private int f26517a;
    private ctl b;
    private com.etao.feimagesearch.ui.coordinatorcard.a c;
    private JSONObject d;
    private int e;
    private RectF f;
    private String g;

    static {
        kge.a(25999545);
        Companion = new a(null);
    }

    public ctm(String cardRectFKey) {
        q.c(cardRectFKey, "cardRectFKey");
        this.g = cardRectFKey;
        this.f26517a = -1;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.g;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-103034687);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public final int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f26517a;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f26517a = i;
        }
    }

    public final void a(ctl ctlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e41972dd", new Object[]{this, ctlVar});
        } else {
            this.b = ctlVar;
        }
    }

    public final ctl b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctl) ipChange.ipc$dispatch("16b50bc2", new Object[]{this}) : this.b;
    }

    public final void a(com.etao.feimagesearch.ui.coordinatorcard.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e823f53", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public final com.etao.feimagesearch.ui.coordinatorcard.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.ui.coordinatorcard.a) ipChange.ipc$dispatch("6f27fa95", new Object[]{this}) : this.c;
    }

    public final JSONObject d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this}) : this.d;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e;
    }

    public final RectF f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("abec9cda", new Object[]{this});
        }
        if (this.f == null) {
            this.f = cov.a(this.g, 1, 1);
        }
        return this.f;
    }
}
