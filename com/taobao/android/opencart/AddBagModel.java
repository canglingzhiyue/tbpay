package com.taobao.android.opencart;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;
import tb.hvh;

/* loaded from: classes6.dex */
public class AddBagModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String cartFrom;
    private JSONObject clientExParams;
    @JSONField(serialize = false)
    private b endRect;
    private String exParams;
    private String itemId;
    @JSONField(serialize = false)
    private boolean openUrlInDetail;
    @JSONField(serialize = false)
    private String pic;
    private long quantity;
    @JSONField(serialize = false)
    private String requestId;
    private boolean showSKU;
    private String skuId;
    @JSONField(serialize = false)
    private b startRect;

    public static /* synthetic */ b access$1002(AddBagModel addBagModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c4b597ad", new Object[]{addBagModel, bVar});
        }
        addBagModel.startRect = bVar;
        return bVar;
    }

    public static /* synthetic */ String access$102(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5492293f", new Object[]{addBagModel, str});
        }
        addBagModel.itemId = str;
        return str;
    }

    public static /* synthetic */ b access$1102(AddBagModel addBagModel, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("cf8a9f2e", new Object[]{addBagModel, bVar});
        }
        addBagModel.endRect = bVar;
        return bVar;
    }

    public static /* synthetic */ boolean access$1202(AddBagModel addBagModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65a83ab1", new Object[]{addBagModel, new Boolean(z)})).booleanValue();
        }
        addBagModel.openUrlInDetail = z;
        return z;
    }

    public static /* synthetic */ String access$202(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc0e0300", new Object[]{addBagModel, str});
        }
        addBagModel.skuId = str;
        return str;
    }

    public static /* synthetic */ long access$302(AddBagModel addBagModel, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca919623", new Object[]{addBagModel, new Long(j)})).longValue();
        }
        addBagModel.quantity = j;
        return j;
    }

    public static /* synthetic */ String access$402(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b05b682", new Object[]{addBagModel, str});
        }
        addBagModel.cartFrom = str;
        return str;
    }

    public static /* synthetic */ String access$502(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2819043", new Object[]{addBagModel, str});
        }
        addBagModel.exParams = str;
        return str;
    }

    public static /* synthetic */ String access$602(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd6a04", new Object[]{addBagModel, str});
        }
        addBagModel.requestId = str;
        return str;
    }

    public static /* synthetic */ boolean access$702(AddBagModel addBagModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8b83a47", new Object[]{addBagModel, new Boolean(z)})).booleanValue();
        }
        addBagModel.showSKU = z;
        return z;
    }

    public static /* synthetic */ JSONObject access$802(AddBagModel addBagModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fc42c780", new Object[]{addBagModel, jSONObject});
        }
        addBagModel.clientExParams = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ String access$902(AddBagModel addBagModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9070f747", new Object[]{addBagModel, str});
        }
        addBagModel.pic = str;
        return str;
    }

    private AddBagModel() {
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this}) : this.itemId;
    }

    public String getSkuId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c61a6d7", new Object[]{this}) : this.skuId;
    }

    public long getQuantity() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9453dfc", new Object[]{this})).longValue() : this.quantity;
    }

    public String getCartFrom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4cd1f699", new Object[]{this}) : this.cartFrom;
    }

    public String getExParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1145f0ca", new Object[]{this}) : this.exParams;
    }

    public String getRequestId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91478625", new Object[]{this}) : this.requestId;
    }

    public Map<String, Object> getClientExParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b8315df6", new Object[]{this}) : this.clientExParams;
    }

    public boolean isShowSKU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b42d9e1", new Object[]{this})).booleanValue() : this.showSKU;
    }

    public String getPic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9c154925", new Object[]{this}) : this.pic;
    }

    public b getStartRect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8ee9075a", new Object[]{this}) : this.startRect;
    }

    public b getEndRect() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("7dc94613", new Object[]{this}) : this.endRect;
    }

    public boolean isOpenUrlInDetail() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de55b13c", new Object[]{this})).booleanValue() : this.openUrlInDetail;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f14480a;
        private String b;
        private int c = 1;
        private String d;
        private String e;
        private boolean f;
        private String g;
        private JSONObject h;

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("68fd3a76", new Object[]{this, str});
            }
            this.f14480a = str;
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b6bcb277", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81462e9f", new Object[]{this, new Integer(i)});
            }
            this.c = i;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("47c2a78", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c5f31930", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("523ba279", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9ffb1a7a", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2b236aa1", new Object[]{this, map});
            }
            this.h = new JSONObject(map);
            return this;
        }

        public AddBagModel a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AddBagModel) ipChange.ipc$dispatch("3d1dcfc9", new Object[]{this});
            }
            b();
            AddBagModel addBagModel = new AddBagModel();
            AddBagModel.access$102(addBagModel, this.f14480a);
            AddBagModel.access$202(addBagModel, this.b);
            AddBagModel.access$302(addBagModel, this.c);
            AddBagModel.access$402(addBagModel, this.d);
            AddBagModel.access$502(addBagModel, this.e);
            AddBagModel.access$602(addBagModel, this.g);
            AddBagModel.access$702(addBagModel, this.f);
            AddBagModel.access$802(addBagModel, this.h);
            try {
                AddBagModel.access$902(addBagModel, this.h.getString("pic"));
                AddBagModel.access$1002(addBagModel, a(this.h.getJSONObject("startRect")));
                AddBagModel.access$1102(addBagModel, a(this.h.getJSONObject("endRect")));
                if (this.h.containsKey("openUrlInDetail")) {
                    AddBagModel.access$1202(addBagModel, ((Boolean) this.h.get("openUrlInDetail")).booleanValue());
                }
            } catch (Exception unused) {
            }
            return addBagModel;
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.f14480a)) {
            } else {
                hvh.a("AddBagModel", "netRequest", "", "necessary itemId miss", "");
            }
        }

        private b a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c66e5e6b", new Object[]{this, jSONObject});
            }
            b bVar = new b();
            b.a(bVar, jSONObject.getFloat("x").floatValue());
            b.b(bVar, jSONObject.getFloat("y").floatValue());
            b.c(bVar, jSONObject.getFloat("width").floatValue());
            b.d(bVar, jSONObject.getFloat("height").floatValue());
            return bVar;
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private float f14481a;
        private float b;
        private float c;
        private float d;

        public static /* synthetic */ float a(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19d26e45", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.f14481a = f;
            return f;
        }

        public static /* synthetic */ float b(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("195c0846", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.b = f;
            return f;
        }

        public static /* synthetic */ float c(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("18e5a247", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.c = f;
            return f;
        }

        public static /* synthetic */ float d(b bVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("186f3c48", new Object[]{bVar, new Float(f)})).floatValue();
            }
            bVar.d = f;
            return f;
        }

        public b(float f, float f2, float f3, float f4) {
            this.f14481a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public b() {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "CartRect{x=" + this.f14481a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + '}';
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6ce8b74b", new Object[]{this}) : new b(this.f14481a, this.b, this.c, this.d);
        }

        public float b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.f14481a;
        }

        public void a(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            } else {
                this.f14481a = f;
            }
        }

        public float c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5a", new Object[]{this})).floatValue() : this.b;
        }

        public void b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            } else {
                this.b = f;
            }
        }

        public float d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2db", new Object[]{this})).floatValue() : this.c;
        }

        public void c(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b3996", new Object[]{this, new Float(f)});
            } else {
                this.c = f;
            }
        }

        public float e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue() : this.d;
        }

        public void d(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad401235", new Object[]{this, new Float(f)});
            } else {
                this.d = f;
            }
        }
    }
}
