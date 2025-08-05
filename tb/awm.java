package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* loaded from: classes2.dex */
public class awm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f25651a;
    private DXRootView b;
    private AURARenderComponent c;
    private JSONObject d;
    private b e;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f25653a;
        public int b;

        static {
            kge.a(254929833);
        }
    }

    static {
        kge.a(1129659584);
    }

    public static /* synthetic */ int a(awm awmVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a758695", new Object[]{awmVar, new Integer(i)})).intValue();
        }
        awmVar.f25651a = i;
        return i;
    }

    public static /* synthetic */ AURARenderComponent a(awm awmVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("b822de85", new Object[]{awmVar, aURARenderComponent});
        }
        awmVar.c = aURARenderComponent;
        return aURARenderComponent;
    }

    public static /* synthetic */ JSONObject a(awm awmVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9c0dc1af", new Object[]{awmVar, jSONObject});
        }
        awmVar.d = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ DXRootView a(awm awmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("46d2ca36", new Object[]{awmVar}) : awmVar.b;
    }

    public static /* synthetic */ DXRootView a(awm awmVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("675f4a95", new Object[]{awmVar, dXRootView});
        }
        awmVar.b = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ b a(awm awmVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b23ace55", new Object[]{awmVar, bVar});
        }
        awmVar.e = bVar;
        return bVar;
    }

    public static /* synthetic */ AURARenderComponent b(awm awmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("1b4126ed", new Object[]{awmVar}) : awmVar.c;
    }

    public static /* synthetic */ JSONObject c(awm awmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f2068a3", new Object[]{awmVar}) : awmVar.d;
    }

    private awm() {
        this.e = new b();
    }

    public DXRootView a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("a106546f", new Object[]{this}) : this.b;
    }

    public AURARenderComponent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AURARenderComponent) ipChange.ipc$dispatch("931e7d94", new Object[]{this}) : this.c;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.e.f25653a;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e.b;
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private b b = new b();

        /* renamed from: a  reason: collision with root package name */
        private awm f25652a = new awm();

        static {
            kge.a(1750291351);
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc4c5b17", new Object[]{this, new Integer(i)});
            }
            awm.a(this.f25652a, i);
            return this;
        }

        public a a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9fbf0c89", new Object[]{this, dXRootView});
            }
            awm.a(this.f25652a, dXRootView);
            return this;
        }

        public a a(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c24189df", new Object[]{this, aURARenderComponent});
            }
            awm.a(this.f25652a, aURARenderComponent);
            return this;
        }

        public a a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e4288dca", new Object[]{this, jSONObject});
            }
            awm.a(this.f25652a, jSONObject);
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2627c558", new Object[]{this, new Integer(i)});
            }
            this.b.f25653a = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("80032f99", new Object[]{this, new Integer(i)});
            }
            this.b.b = i;
            return this;
        }

        public awm a() throws NullPointerException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (awm) ipChange.ipc$dispatch("f028907", new Object[]{this});
            }
            if (awm.a(this.f25652a) == null) {
                throw new NullPointerException("rootView不能为空");
            }
            if (awm.b(this.f25652a) == null) {
                throw new NullPointerException("component不能为空");
            }
            if (awm.c(this.f25652a) == null) {
                throw new NullPointerException("dxFields不能为空");
            }
            awm.a(this.f25652a, this.b);
            return this.f25652a;
        }
    }
}
