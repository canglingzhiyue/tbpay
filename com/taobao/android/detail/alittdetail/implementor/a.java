package com.taobao.android.detail.alittdetail.implementor;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.ao;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.megadesign.viewpager.CustomTabLayout;
import com.taobao.android.stdpop.api.PopGravity;
import com.taobao.android.stdpop.api.b;
import com.taobao.android.stdpop.api.viewpager.a;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.detail.rate.d;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.kvr;
import tb.mqw;
import tb.mqx;
import tb.scr;

/* loaded from: classes4.dex */
public class a implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openPopDialog";

    /* renamed from: a  reason: collision with root package name */
    private FragmentActivity f9354a;
    private eyx b;
    private RuntimeAbilityParam[] c;
    private List<d> d;
    private long e;

    static {
        kge.a(-237503445);
        kge.a(1967244270);
    }

    public static /* synthetic */ List a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a326ebdb", new Object[]{aVar}) : aVar.d;
    }

    public a(Context context, eyx eyxVar) {
        if (context instanceof FragmentActivity) {
            this.f9354a = (FragmentActivity) context;
        }
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        i.a("OpenPopDialogImplementor", e.RECORD_EXECUTE);
        this.e = System.currentTimeMillis();
        if (aVar == null) {
            i.a("OpenPopDialogImplementor", "event is null");
            return false;
        }
        JSONObject b = aVar.b();
        if (b == null) {
            i.a("OpenPopDialogImplementor", "fields is null");
            return false;
        } else if (this.f9354a == null) {
            i.a("OpenPopDialogImplementor", "mActivity is null");
            return false;
        } else if ("true".equalsIgnoreCase(b.getString("needLogin")) && !ao.c()) {
            ao.a(true);
            i.a("OpenPopDialogImplementor", "need login");
            return false;
        } else {
            this.c = runtimeAbilityParamArr;
            JSONArray jSONArray = b.getJSONArray("bizDataList");
            if (jSONArray == null || jSONArray.isEmpty()) {
                i.a("OpenPopDialogImplementor", "bizDataList is empty");
                return false;
            }
            JSONObject jSONObject = b.getJSONObject(c.KEY_POP_CONFIG);
            this.d = new ArrayList();
            if (jSONArray.size() == 1) {
                a(jSONObject, jSONArray.getJSONObject(0));
            } else {
                a(jSONObject, jSONArray);
            }
            return true;
        }
    }

    private void a(JSONObject jSONObject, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f94b4b0", new Object[]{this, jSONObject, jSONArray});
            return;
        }
        com.taobao.android.stdpop.api.d dVar = new com.taobao.android.stdpop.api.d();
        dVar.a(jSONObject.getFloatValue("maxHeight"));
        dVar.a(jSONObject.getBooleanValue("panEnable"));
        dVar.a(jSONObject.getString("backgroundColor"));
        dVar.a(a(jSONObject.getString("gravity")));
        String string = jSONObject.getString("defaultIndex");
        int parseInt = StringUtils.isEmpty(string) ? 0 : Integer.parseInt(string);
        dVar.a(parseInt);
        if (jSONObject.getBooleanValue("showBottomBar")) {
            dVar.a(new b(0.0f, 0.0f, 0.0f, (float) a()));
        }
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                i.a("OpenPopDialogImplementor", "bizData is empty");
            } else {
                if (jSONObject2.getBooleanValue("useBizData")) {
                    jSONObject2 = c(jSONObject2);
                }
                if (jSONObject2 == null || jSONObject2.isEmpty()) {
                    i.a("OpenPopDialogImplementor", "bizDataParams is empty");
                } else {
                    String string2 = jSONObject2.getString("renderType");
                    if (StringUtils.isEmpty(string2)) {
                        i.a("OpenPopDialogImplementor", "renderType is empty");
                    } else {
                        com.taobao.android.stdpop.api.viewpager.a aVar = null;
                        if (StringUtils.equals(string2, "Native")) {
                            aVar = a(jSONObject2, size, i, parseInt);
                        } else if (StringUtils.equals(string2, "Weex2.0") || StringUtils.equals(string2, "H5")) {
                            aVar = a(jSONObject2);
                        }
                        if (aVar != null) {
                            arrayList.add(aVar);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            i.a("OpenPopDialogImplementor", "panelPageUrlInfoList is empty");
            return;
        }
        i.a("OpenPopDialogImplementor", "多tab评价fragment解析耗时 time=" + (System.currentTimeMillis() - currentTimeMillis));
        scr a2 = dVar.a(this.f9354a, arrayList, new com.taobao.android.stdpop.api.a() { // from class: com.taobao.android.detail.alittdetail.implementor.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 40303496) {
                    super.a((JSONObject) objArr[0]);
                    return null;
                } else if (hashCode != 1673107495) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.b((JSONObject) objArr[0]);
                    return null;
                }
            }

            @Override // com.taobao.android.stdpop.api.a, tb.scq
            public void a(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                } else {
                    super.a(jSONObject3);
                }
            }

            @Override // com.taobao.android.stdpop.api.a, tb.scq
            public void b(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject3});
                } else {
                    super.b(jSONObject3);
                }
            }
        }, new CustomTabLayout.a() { // from class: com.taobao.android.detail.alittdetail.implementor.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.megadesign.viewpager.CustomTabLayout.a
            public void a(int i2, int i3) {
                d dVar2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i2), new Integer(i3)});
                } else if (i2 < 0 || i2 > a.a(a.this).size() - 1) {
                } else {
                    d dVar3 = (d) a.a(a.this).get(i2);
                    if (dVar3 != null) {
                        dVar3.a(Integer.valueOf(i2), Integer.valueOf(i3));
                    }
                    if (i3 < 0 || i3 > a.a(a.this).size() - 1 || (dVar2 = (d) a.a(a.this).get(i3)) == null) {
                        return;
                    }
                    dVar2.b(Integer.valueOf(i2), Integer.valueOf(i3));
                }
            }
        });
        i.a("OpenPopDialogImplementor", "open multiTab popDialog isSuccess=" + a2.f33478a + ", errorCode=" + a2.b + ", errorMsg=" + a2.c);
    }

    private com.taobao.android.stdpop.api.viewpager.a a(JSONObject jSONObject, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.stdpop.api.viewpager.a) ipChange.ipc$dispatch("e4e2e07f", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        String string = jSONObject.getString("title");
        if (StringUtils.isEmpty(string)) {
            i.a("OpenPopDialogImplementor", "title is empty");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("detailClientParams");
        if (jSONObject2 != null && !jSONObject2.isEmpty() && RateNode.TAG.equals(jSONObject2.getString("bizId"))) {
            return new a.C0585a(string).a(b(jSONObject2, i, i2, i3).a()).a();
        }
        return null;
    }

    private com.taobao.android.stdpop.api.viewpager.a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.stdpop.api.viewpager.a) ipChange.ipc$dispatch("7788adac", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("url");
        if (StringUtils.isEmpty(string2)) {
            i.a("OpenPopDialogImplementor", "url is empty");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("exParams");
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2.getJSONObject("content");
        }
        return new a.C0585a(string).a(string2).a(jSONObject3).a();
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
        } else if (jSONObject2 == null || jSONObject2.isEmpty()) {
            i.a("OpenPopDialogImplementor", "bizData is empty");
        } else {
            if (jSONObject2.getBooleanValue("useBizData")) {
                jSONObject2 = c(jSONObject2);
            }
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                i.a("OpenPopDialogImplementor", "bizDataParams is empty");
                return;
            }
            String string = jSONObject2.getString("renderType");
            if (StringUtils.isEmpty(string)) {
                i.a("OpenPopDialogImplementor", "renderType is empty");
            } else if (StringUtils.equals(string, "Native")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("detailClientParams");
                if (jSONObject3 == null || jSONObject3.isEmpty() || !RateNode.TAG.equals(jSONObject3.getString("bizId"))) {
                    return;
                }
                a(b(jSONObject3, 1, 0, 0), jSONObject, jSONObject2);
            } else if (!StringUtils.equals(string, "Weex2.0")) {
            } else {
                b(jSONObject, jSONObject2);
            }
        }
    }

    private d b(final JSONObject jSONObject, int i, int i2, int i3) {
        mqw a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("da676c49", new Object[]{this, jSONObject, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        com.taobao.android.detail.ttdetail.handler.event.a aVar = new com.taobao.android.detail.ttdetail.handler.event.a(new JSONObject() { // from class: com.taobao.android.detail.alittdetail.implementor.OpenPopDialogImplementor$3
            {
                put("fields", (Object) jSONObject);
            }
        });
        boolean z = i2 == i3;
        if (z) {
            a2 = mqx.a(aVar, true, this.e, this.c);
        } else {
            a2 = mqx.a(aVar, true, this.e, new RuntimeAbilityParam[0]);
        }
        a2.b(i > 1 ? mqw.POP_MULTI_TAB : "pop");
        a2.a(i);
        a2.b(z);
        d a3 = mqx.a(this.b, a2);
        a3.a(Integer.valueOf(i2));
        this.d.add(a3);
        FragmentActivity fragmentActivity = this.f9354a;
        if (fragmentActivity instanceof kvr) {
            kvr kvrVar = (kvr) fragmentActivity;
            if (kvrVar.e()) {
                a3.a(kvrVar.f().get(i2));
            }
        }
        return a3;
    }

    private void a(d dVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff9d6f77", new Object[]{this, dVar, jSONObject, jSONObject2});
            return;
        }
        com.taobao.android.stdpop.api.c b = b(jSONObject);
        if (b == null) {
            return;
        }
        b.b("DetailCommentFragment");
        b.a(jSONObject2.getString("title"));
        b.a(dVar.b());
        scr a2 = b.a(this.f9354a, dVar.a(), new com.taobao.android.stdpop.api.a() { // from class: com.taobao.android.detail.alittdetail.implementor.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 40303496) {
                    super.a((JSONObject) objArr[0]);
                    return null;
                } else if (hashCode != 1673107495) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.b((JSONObject) objArr[0]);
                    return null;
                }
            }

            @Override // com.taobao.android.stdpop.api.a, tb.scq
            public void a(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                } else {
                    super.a(jSONObject3);
                }
            }

            @Override // com.taobao.android.stdpop.api.a, tb.scq
            public void b(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject3});
                } else {
                    super.b(jSONObject3);
                }
            }
        });
        i.a("OpenPopDialogImplementor", "open singleTab popFragment isSuccess=" + a2.f33478a + ", errorCode=" + a2.b + ", errorMsg=" + a2.c);
    }

    private void b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("525e83a9", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        com.taobao.android.stdpop.api.c b = b(jSONObject);
        if (b == null) {
            return;
        }
        b.a(jSONObject2.getString("title"));
        String string = jSONObject2.getString("url");
        if (StringUtils.isEmpty(string)) {
            i.a("OpenPopDialogImplementor", "url is empty");
            return;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("exParams");
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject3 != null) {
            jSONObject4 = jSONObject3.getJSONObject("content");
        }
        b.a(this.f9354a, string, new com.taobao.android.stdpop.api.a() { // from class: com.taobao.android.detail.alittdetail.implementor.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 40303496) {
                    super.a((JSONObject) objArr[0]);
                    return null;
                } else if (hashCode != 1673107495) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.b((JSONObject) objArr[0]);
                    return null;
                }
            }

            @Override // com.taobao.android.stdpop.api.a, tb.scq
            public void a(JSONObject jSONObject5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject5});
                } else {
                    super.a(jSONObject5);
                }
            }

            @Override // com.taobao.android.stdpop.api.a, tb.scq
            public void b(JSONObject jSONObject5) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject5});
                } else {
                    super.b(jSONObject5);
                }
            }
        }, jSONObject4);
    }

    private com.taobao.android.stdpop.api.c b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.stdpop.api.c) ipChange.ipc$dispatch("d272f058", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        com.taobao.android.stdpop.api.c cVar = new com.taobao.android.stdpop.api.c();
        cVar.a(jSONObject.getFloatValue("maxHeight"));
        cVar.a(jSONObject.getBooleanValue("panEnable"));
        cVar.c(jSONObject.getString("backgroundColor"));
        cVar.a(a(jSONObject.getString("gravity")));
        if (jSONObject.getBooleanValue("showBottomBar")) {
            cVar.a(new b(0.0f, 0.0f, 0.0f, (float) a()));
        }
        return cVar;
    }

    private JSONObject c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b45647e6", new Object[]{this, jSONObject});
        }
        JSONObject b = com.taobao.android.detail.ttdetail.utils.d.b(this.b);
        if (b != null) {
            return b.getJSONObject(jSONObject.getString("bizDataKey"));
        }
        return null;
    }

    private long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
        }
        View findViewById = this.f9354a.findViewById(R.id.ll_tt_detail_bottom_bar);
        if (findViewById == null) {
            return 0L;
        }
        return f.b(findViewById.getHeight());
    }

    private PopGravity a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopGravity) ipChange.ipc$dispatch("df738933", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 4;
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            return PopGravity.BOTTOM;
        }
        if (c == 1) {
            return PopGravity.TOP;
        }
        if (c == 2) {
            return PopGravity.LEFT;
        }
        if (c == 3) {
            return PopGravity.RIGHT;
        }
        if (c == 4) {
            return PopGravity.CENTER;
        }
        return null;
    }
}
