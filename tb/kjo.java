package tb;

import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.detail.rate.view.SkuDialog;
import com.taobao.detail.rate.view.c;
import com.taobao.detail.rate.vivid.ability.d;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J4\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160 2\u0006\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J$\u0010#\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00162\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160 H\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J@\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020\u0012H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/taobao/detail/rate/vivid/manager/RateSkuManager;", "", "()V", "defaultSkuData", "Lcom/alibaba/fastjson/JSONArray;", "getDefaultSkuData", "()Lcom/alibaba/fastjson/JSONArray;", "setDefaultSkuData", "(Lcom/alibaba/fastjson/JSONArray;)V", "iSkuSelectListener", "Lcom/taobao/detail/rate/view/ISkuSelectListener;", "mSkuDialog", "Lcom/taobao/detail/rate/view/SkuDialog;", "getMSkuDialog", "()Lcom/taobao/detail/rate/view/SkuDialog;", "setMSkuDialog", "(Lcom/taobao/detail/rate/view/SkuDialog;)V", "selectListener", "Lcom/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility$SelectListener;", "selectedSku", "", "", "", "selectedSkuName", "skuSet", "", "calcSkuDisable", "", "index", "isContainSku", "", "sku", "", MspEventTypes.ACTION_STRING_VID, "source", "isSelectedSku", "resetSkuData", "showSkuDialog", bgp.FRAGMENT, "Landroid/support/v4/app/Fragment;", "requestSkuData", "selectSKU", "Lcom/alibaba/fastjson/JSONObject;", "itemData", "defaultItemData", DataReceiveMonitor.CB_LISTENER, "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public class kjo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SkuDialog f30123a;
    private JSONArray b;
    private d.c d;
    private Set<String> c = new LinkedHashSet();
    private Map<Integer, String> e = new LinkedHashMap();
    private Map<Integer, String> f = new LinkedHashMap();
    private com.taobao.detail.rate.view.d g = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u000b0\u000bH\n¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "index", "", MspDBHelper.BizEntry.COLUMN_NAME_PID, "", "kotlin.jvm.PlatformType", "isSelected", "", aw.PARAM_SEARCH_KEYWORD_POS, "result", "", "onSelect"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a implements com.taobao.detail.rate.view.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.detail.rate.view.d
        public final void a(int i, String str, boolean z, int i2, Object obj) {
            boolean z2;
            int i3;
            boolean z3 = z;
            int i4 = i2;
            IpChange ipChange = $ipChange;
            int i5 = 0;
            boolean z4 = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2879c4f0", new Object[]{this, new Integer(i), str, new Boolean(z3), new Integer(i4), obj});
            } else if (!(obj instanceof JSONObject)) {
                if (!(obj instanceof String)) {
                    return;
                }
                if (!n.a("confirm", obj.toString(), true)) {
                    if (!n.a(DMComponent.RESET, obj.toString(), true)) {
                        return;
                    }
                    kjo.d(kjo.this);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                if (kjo.a(kjo.this) != null) {
                    if (!kjo.a(kjo.this).isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (Map.Entry entry : kjo.a(kjo.this).entrySet()) {
                            sb.append((String) entry.getValue());
                            sb.append("#");
                        }
                        z2 = true;
                        jSONObject.put((JSONObject) "vids", sb.substring(0, sb.length() - 1));
                    } else {
                        z2 = true;
                    }
                    if (kjo.b(kjo.this).isEmpty() ^ z2) {
                        StringBuilder sb2 = new StringBuilder();
                        for (Map.Entry entry2 : kjo.b(kjo.this).entrySet()) {
                            sb2.append((String) entry2.getValue());
                            sb2.append("#");
                        }
                        jSONObject.put((JSONObject) "name", sb2.substring(0, sb2.length() - 1));
                    }
                }
                d.c c = kjo.c(kjo.this);
                if (c == null) {
                    return;
                }
                c.a(jSONObject);
            } else {
                JSONArray a2 = kjo.this.a();
                if (a2 == null) {
                    return;
                }
                JSONObject jSONObject2 = a2.getJSONObject(i);
                if ((jSONObject2 != null ? jSONObject2.getJSONArray("values") : null) != null) {
                    JSONArray values = jSONObject2.getJSONArray("values");
                    q.b(values, "values");
                    int size = values.size();
                    while (i5 < size) {
                        JSONObject jSONObject3 = values.getJSONObject(i5);
                        if (jSONObject3 != null) {
                            if (i4 != i5) {
                                i3 = size;
                                jSONObject3.put((JSONObject) gbk.TYPE_SELECTED, (String) false);
                            } else if (z3) {
                                jSONObject3.put((JSONObject) gbk.TYPE_SELECTED, (String) Boolean.valueOf(z4));
                                Map a3 = kjo.a(kjo.this);
                                Integer valueOf = Integer.valueOf(i);
                                JSONObject jSONObject4 = (JSONObject) obj;
                                String string = jSONObject4.getString(MspEventTypes.ACTION_STRING_VID);
                                i3 = size;
                                q.b(string, "result.getString(\"vid\")");
                                a3.put(valueOf, string);
                                Map b = kjo.b(kjo.this);
                                Integer valueOf2 = Integer.valueOf(i);
                                String string2 = jSONObject4.getString("name");
                                q.b(string2, "result.getString(\"name\")");
                                b.put(valueOf2, string2);
                            } else {
                                i3 = size;
                                jSONObject3.put((JSONObject) gbk.TYPE_SELECTED, (String) false);
                                kjo.a(kjo.this).remove(Integer.valueOf(i));
                                kjo.b(kjo.this).remove(Integer.valueOf(i));
                            }
                            values.set(i5, jSONObject3);
                        } else {
                            i3 = size;
                        }
                        i5++;
                        size = i3;
                        z3 = z;
                        i4 = i2;
                        z4 = true;
                    }
                    jSONObject2.put((JSONObject) "values", (String) values);
                    a2.set(i, jSONObject2);
                }
                kjo.a(kjo.this, i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "init", "com/taobao/detail/rate/vivid/manager/RateSkuManager$showSkuDialog$1$1"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;

        public b(JSONObject jSONObject) {
            this.b = jSONObject;
        }

        @Override // com.taobao.detail.rate.view.c
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                kjo.a(kjo.this, -1);
            }
        }
    }

    public static final /* synthetic */ Map a(kjo kjoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("83e3461d", new Object[]{kjoVar}) : kjoVar.e;
    }

    public static final /* synthetic */ void a(kjo kjoVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3561061b", new Object[]{kjoVar, new Integer(i)});
        } else {
            kjoVar.a(i);
        }
    }

    public static final /* synthetic */ Map b(kjo kjoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("bd3456de", new Object[]{kjoVar}) : kjoVar.f;
    }

    public static final /* synthetic */ d.c c(kjo kjoVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.c) ipChange.ipc$dispatch("2d678a12", new Object[]{kjoVar}) : kjoVar.d;
    }

    public static final /* synthetic */ void d(kjo kjoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcbdbd6b", new Object[]{kjoVar});
        } else {
            kjoVar.b();
        }
    }

    public final JSONArray a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("dc1f20d6", new Object[]{this}) : this.b;
    }

    public void a(Fragment fragment, JSONArray jSONArray, JSONObject jSONObject, JSONArray jSONArray2, JSONObject jSONObject2, d.c listener) {
        rwb a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99650c30", new Object[]{this, fragment, jSONArray, jSONObject, jSONArray2, jSONObject2, listener});
            return;
        }
        q.d(fragment, "fragment");
        q.d(listener, "listener");
        this.d = listener;
        this.b = jSONArray2;
        if (jSONArray != null) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                q.b(jSONObject3, "requestSkuData.getJSONObject(index)");
                if (jSONObject3.getIntValue("count") > 0 && !TextUtils.isEmpty(jSONObject3.getString("skuStr"))) {
                    Set<String> set = this.c;
                    String string = jSONObject3.getString("skuStr");
                    q.b(string, "item.getString(\"skuStr\")");
                    set.add(string);
                }
            }
        }
        if (this.f30123a == null) {
            this.f30123a = new SkuDialog();
            SkuDialog skuDialog = this.f30123a;
            if (skuDialog != null) {
                skuDialog.setItemInfo(jSONObject2);
                skuDialog.setSkuSelectListener(this.g);
                skuDialog.setiSkuInitListener(new b(jSONObject2));
            }
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            b();
        } else {
            String vids = jSONObject.getString("vids");
            String names = jSONObject.getString("name");
            q.b(vids, "vids");
            Object[] array = n.b((CharSequence) vids, new String[]{"#"}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                q.b(names, "names");
                Object[] array2 = n.b((CharSequence) names, new String[]{"#"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    this.e.clear();
                    this.f.clear();
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        this.e.put(Integer.valueOf(i2), strArr[i2]);
                        this.f.put(Integer.valueOf(i2), strArr2[i2]);
                    }
                    if (jSONArray2 != null && (a2 = p.a((Collection<?>) jSONArray2)) != null) {
                        Iterator<Integer> it = a2.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObject4 = jSONArray2.getJSONObject(((ae) it).b());
                            if ((jSONObject4 != null ? jSONObject4.getJSONArray("values") : null) != null) {
                                JSONArray values = jSONObject4.getJSONArray("values");
                                q.b(values, "values");
                                int size2 = values.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    JSONObject jSONObject5 = values.getJSONObject(i3);
                                    if (jSONObject5 != null) {
                                        jSONObject5.put((JSONObject) gbk.TYPE_SELECTED, (String) Boolean.valueOf(this.e.containsValue(jSONObject5.getString(MspEventTypes.ACTION_STRING_VID))));
                                    }
                                    values.set(i3, jSONObject5);
                                }
                            }
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        SkuDialog skuDialog2 = this.f30123a;
        if (skuDialog2 != null) {
            skuDialog2.setData(this.b);
        }
        SkuDialog skuDialog3 = this.f30123a;
        if (skuDialog3 == null) {
            return;
        }
        skuDialog3.show(fragment.getFragmentManager(), "SKU_DIALOG");
    }

    private final void a(int i) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.f30123a != null && this.c.size() != 0 && (jSONArray = this.b) != null) {
            int size = jSONArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i != i2) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    ArrayList arrayList = new ArrayList();
                    if (jSONObject != null && (jSONArray2 = jSONObject.getJSONArray("values")) != null && jSONArray2.size() > 0) {
                        int size2 = jSONArray2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                            if (jSONObject2 != null) {
                                String vid = jSONObject2.getString(MspEventTypes.ACTION_STRING_VID);
                                q.b(vid, "vid");
                                if (!a(vid, this.e)) {
                                    Iterator<String> it = this.c.iterator();
                                    boolean z = false;
                                    while (it.hasNext() && !(z = a(this.e, vid, it.next(), i2))) {
                                    }
                                    if (!z) {
                                        arrayList.add(Integer.valueOf(i3));
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        SkuDialog skuDialog = this.f30123a;
                        if (skuDialog != null) {
                            skuDialog.setCanSelect(i2, false, arrayList);
                        }
                    } else {
                        SkuDialog skuDialog2 = this.f30123a;
                        if (skuDialog2 != null) {
                            skuDialog2.setCanSelect(i2, false, new ArrayList());
                        }
                    }
                }
            }
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        SkuDialog skuDialog = this.f30123a;
        if (skuDialog != null) {
            skuDialog.resetSelectTag();
        }
        this.e.clear();
        this.f.clear();
        if (this.b == null) {
            this.b = new JSONArray();
        }
        JSONArray jSONArray = this.b;
        if (jSONArray == null) {
            return;
        }
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if ((jSONObject != null ? jSONObject.getJSONArray("values") : null) != null) {
                JSONArray values = jSONObject.getJSONArray("values");
                q.b(values, "values");
                int size2 = values.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject2 = values.getJSONObject(i2);
                    if (jSONObject2 != null) {
                        jSONObject2.put((JSONObject) gbk.TYPE_SELECTED, (String) false);
                    }
                    values.set(i2, jSONObject2);
                }
            }
        }
    }

    private final boolean a(String str, Map<Integer, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20476517", new Object[]{this, str, map})).booleanValue();
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (q.a((Object) entry.getValue(), (Object) str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean a(Map<Integer, String> map, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d860cc76", new Object[]{this, map, str, str2, new Integer(i)})).booleanValue();
        }
        String str3 = str2;
        if (!n.b((CharSequence) str3, (CharSequence) str, false, 2, (Object) null)) {
            return false;
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            String value = entry.getValue();
            if (i != intValue && !n.b((CharSequence) str3, (CharSequence) value, false, 2, (Object) null)) {
                z = false;
            }
        }
        return z;
    }
}
