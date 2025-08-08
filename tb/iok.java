package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.i;
import com.taobao.android.detail.ttdetail.data.meta.DetailAdjustModel;
import com.taobao.android.detail.ttdetail.lightoff.DXFloatContainer;
import com.taobao.android.detail.ttdetail.utils.a;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.p;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.util.SystemBarDecorator;

/* loaded from: classes5.dex */
public class iok {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PRICE_SECTION = "lightPriceSection";

    /* renamed from: a  reason: collision with root package name */
    private eyx f29186a;
    private DXFloatContainer b;
    private View c;
    private eyy d;
    private int e = gbg.a();
    private int f;

    static {
        kge.a(388239663);
    }

    public static /* synthetic */ View a(iok iokVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6e48e7c1", new Object[]{iokVar, view});
        }
        iokVar.c = view;
        return view;
    }

    public static /* synthetic */ DXFloatContainer a(iok iokVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXFloatContainer) ipChange.ipc$dispatch("6e2a8e76", new Object[]{iokVar}) : iokVar.b;
    }

    public static /* synthetic */ void a(iok iokVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e46cb0", new Object[]{iokVar, new Integer(i)});
        } else {
            iokVar.a(i);
        }
    }

    public iok(eyx eyxVar, DXFloatContainer dXFloatContainer) {
        this.f29186a = eyxVar;
        this.b = dXFloatContainer;
    }

    public void a(eyy eyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf8273", new Object[]{this, eyyVar});
        } else {
            this.d = eyyVar;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        e();
        this.b.setOnSizeChangeListener(new DXFloatContainer.a() { // from class: tb.iok.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.lightoff.DXFloatContainer.a
            public void a(int i, final int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                } else {
                    iok.a(iok.this).post(new Runnable() { // from class: tb.iok.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                iok.a(iok.this, i2);
                            }
                        }
                    });
                }
            }
        });
    }

    private void a(int i) {
        JSONObject d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        eyy eyyVar = this.d;
        if (eyyVar == null || (d = eyyVar.d()) == null || d.isEmpty()) {
            return;
        }
        int statusBarHeight = SystemBarDecorator.SystemBarConfig.getStatusBarHeight(f.a());
        this.f = View.MeasureSpec.makeMeasureSpec((i - statusBarHeight) - p.a(this.b), 1073741824);
        ezh f = this.f29186a.f();
        p.a(f, d, new iol(this, f, statusBarHeight));
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6a0ce0e", new Object[]{this, iVar});
            return;
        }
        a(a.a(iVar));
        d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        eyy eyyVar = this.d;
        if (eyyVar == null || eyyVar.e() == null || this.c == null) {
            return;
        }
        p.a(this.f29186a.f(), (DXRootView) this.c, eyyVar.e(), this.e, this.f);
    }

    private int a(String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        eyy eyyVar = this.d;
        if (eyyVar == null || eyyVar.e() == null || eyyVar.d() == null || (jSONObject = eyyVar.d().getJSONObject("skuBar")) == null || jSONObject.isEmpty() || (jSONArray = jSONObject.getJSONArray("skuContents")) == null || jSONArray.isEmpty()) {
            return -1;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.size(); i3++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
            if (jSONObject2 != null) {
                if (i2 == -1 && Boolean.parseBoolean(jSONObject2.getString("isSelected"))) {
                    i2 = i3;
                }
                if (a(jSONObject2.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH), str)) {
                    jSONObject2.put("isSelected", (Object) Boolean.TRUE.toString());
                    i = i3;
                } else {
                    jSONObject2.put("isSelected", (Object) Boolean.FALSE.toString());
                }
            }
        }
        jSONObject.put(g.KEY_SELECTED_INDEX, (Object) String.valueOf(Math.max(i, 0)));
        JSONObject jSONObject3 = jSONObject.getJSONObject("mainPic");
        if (jSONObject3 != null) {
            jSONObject3.put("isSelected", (Object) (i != -1 ? Boolean.FALSE : Boolean.TRUE).toString());
        }
        return i;
    }

    private static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (str2 == null) {
            return StringUtils.isEmpty(str);
        }
        return StringUtils.equals(str2, str);
    }

    private void e() {
        JSONObject d;
        JSONObject jSONObject;
        DetailAdjustModel detailAdjustModel;
        JSONArray adjustModel;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        eyy eyyVar = this.d;
        if (eyyVar == null || (d = eyyVar.d()) == null || d.isEmpty() || (jSONObject = d.getJSONObject("bottomBar")) == null) {
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(KEY_PRICE_SECTION);
        if ((jSONObject3 != null && !jSONObject3.isEmpty()) || (detailAdjustModel = (DetailAdjustModel) this.f29186a.a().a(DetailAdjustModel.class)) == null || (adjustModel = detailAdjustModel.getAdjustModel()) == null) {
            return;
        }
        int size = adjustModel.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject4 = adjustModel.getJSONObject(i);
            if (jSONObject4 != null && !jSONObject4.isEmpty() && (jSONObject2 = jSONObject4.getJSONObject(KEY_PRICE_SECTION)) != null && !jSONObject2.isEmpty()) {
                String string = jSONObject4.getString(com.taobao.android.detail.core.aura.observer.a.KEY_PROP_PATH);
                if (StringUtils.isEmpty(jSONObject4.getString("skuId")) && StringUtils.isEmpty(string)) {
                    jSONObject.put(KEY_PRICE_SECTION, (Object) jSONObject2);
                    return;
                }
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.setVisibility(4);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.b.setVisibility(0);
        }
    }
}
