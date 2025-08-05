package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.template.ComponentModel;
import java.util.List;

/* loaded from: classes5.dex */
public class fbd extends epf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27734a;
    public String b;
    public List<a> c;
    public int d;
    public int e;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27736a;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(-1275047116);
        }
    }

    static {
        kge.a(1774738515);
    }

    @Override // tb.epf
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public fbd(ComponentModel componentModel) {
        super(componentModel);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewmodel.GoodsMatchingViewModel");
    }

    @Override // tb.epf
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("goodsmatchingList");
        if (jSONArray == null) {
            return;
        }
        this.f27734a = jSONObject.getString("machingTitle");
        this.b = jSONObject.getString(eby.KEY_PIC_URL);
        JSONObject jSONObject2 = jSONObject.getJSONObject("size");
        if (jSONObject2 != null) {
            this.d = jSONObject2.getIntValue("height");
            this.e = jSONObject2.getIntValue("width");
        }
        if (this.d <= 0 || this.e <= 0) {
            this.d = 1;
            this.e = 1;
        }
        this.c = epw.a(jSONArray, new epy<a>() { // from class: tb.fbd.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r4v3, types: [tb.fbd$a, java.lang.Object] */
            @Override // tb.epy
            public /* synthetic */ a b(Object obj) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("eeb6464d", new Object[]{this, obj}) : a(obj);
            }

            public a a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (a) ipChange2.ipc$dispatch("532e80bd", new Object[]{this, obj});
                }
                JSONObject jSONObject3 = (JSONObject) obj;
                a aVar = new a();
                aVar.f27736a = jSONObject3.getString(eby.KEY_PIC_URL);
                aVar.b = jSONObject3.getString("itemId");
                aVar.c = jSONObject3.getString("jumpUrl");
                aVar.d = jSONObject3.getString("title");
                aVar.e = jSONObject3.getString("price");
                return aVar;
            }
        });
    }
}
