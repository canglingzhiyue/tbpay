package tb;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.tao.Globals;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.PanelStyleModel;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b;
import com.taobao.uikit.extend.component.unify.Toast.TBToast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class thx extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements a, thv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f34104a;
    private boolean b;
    private List<JSONObject> c;
    private PanelStyleModel d;
    private final a e;
    private boolean h;
    private final Map<String, List<JSONObject>> g = new LinkedHashMap();
    private final tia f = new tia();

    static {
        kge.a(76254851);
        kge.a(1692223149);
        kge.a(1717401112);
    }

    public static /* synthetic */ Object ipc$super(thx thxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        }
    }

    public thx(a aVar) {
        this.e = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : this.f.a(viewGroup, i, this, this);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (viewHolder instanceof tid) {
            tid tidVar = (tid) viewHolder;
            ((StaggeredGridLayoutManager.LayoutParams) tidVar.itemView.getLayoutParams()).setFullSpan(true);
            tidVar.a(this.c.get(i));
        }
        if (!(viewHolder instanceof tic)) {
            return;
        }
        ((tic) viewHolder).a(this.c.get(i), this.d);
        c(this.c.get(i));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<JSONObject> list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        List<JSONObject> list = this.c;
        if (list != null && (jSONObject = list.get(i)) != null) {
            return jSONObject.getIntValue(b.VIEW_TYPE);
        }
        return 0;
    }

    @Override // tb.thv
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
        } else {
            jSONObject2.put(b.IS_CLICK, (Object) true);
            this.e.d();
        }
    }

    @Override // tb.thv
    public void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        this.e.i();
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
            return;
        }
        String string = jSONObject2.getString(b.CURRENT_MENU_CODE);
        if (!b(jSONObject, string)) {
            return;
        }
        int indexOf = this.c.indexOf(jSONObject);
        this.c.remove(indexOf);
        notifyItemRemoved(indexOf);
        a(jSONObject, string);
        a(jSONObject2.getString(b.MENU_CODE), indexOf);
    }

    public void a(List<JSONObject> list, PanelStyleModel panelStyleModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("354c9120", new Object[]{this, list, panelStyleModel});
            return;
        }
        this.c = list;
        this.d = panelStyleModel;
        this.h = false;
        a(list);
    }

    public int c(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{this, str})).intValue();
        }
        for (int i = 0; i < this.c.size(); i++) {
            JSONObject jSONObject2 = this.c.get(i);
            if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("content")) != null && TextUtils.equals(str, jSONObject.getString(e.KEY_TAB_ID))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b(true);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            b(false);
        }
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.f34104a;
    }

    @Override // com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        b(false);
        this.h = b.a(h());
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.h;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        this.e.i();
        return this.f34104a && this.b;
    }

    @Override // tb.thv
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void a(int i, int i2) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e.i();
        List<JSONObject> list = this.c;
        if (list == null) {
            return;
        }
        JSONObject jSONObject3 = list.get(i);
        JSONObject jSONObject4 = this.c.get(i2);
        if (jSONObject3 == null || jSONObject4 == null || (jSONObject = jSONObject3.getJSONObject("content")) == null || !jSONObject.getBooleanValue(b.IS_EDITABLE) || (jSONObject2 = jSONObject4.getJSONObject("content")) == null || !jSONObject2.getBooleanValue(b.IS_EDITABLE)) {
            return;
        }
        String string = jSONObject.getString(b.CURRENT_MENU_CODE);
        String string2 = jSONObject2.getString(b.CURRENT_MENU_CODE);
        if (!TextUtils.equals(string, b.MY_CHANNEL) || !TextUtils.equals(string2, b.MY_CHANNEL)) {
            return;
        }
        this.c.remove(i);
        this.c.add(i2, jSONObject3);
        notifyItemMoved(i, i2);
        a("Page_Home_Button-categoryTab-adjust", jSONObject.getString(e.KEY_TAB_ID), i, i2);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f34104a = z;
        Pair<Integer, Integer> b = b(b.MY_CHANNEL);
        if (((Integer) b.first).intValue() == -1) {
            return;
        }
        notifyItemRangeChanged(((Integer) b.first).intValue(), ((Integer) b.second).intValue());
        for (int i = 0; i < this.c.size(); i++) {
            JSONObject jSONObject = this.c.get(i);
            if (jSONObject != null && jSONObject.getIntValue(b.VIEW_TYPE) == 0) {
                notifyItemChanged(i);
            }
        }
        j();
        if (z) {
            this.e.a();
        } else {
            this.e.b();
        }
    }

    private void a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("content")) == null) {
        } else {
            String string = jSONObject2.getString(b.MENU_CODE);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            boolean equals = TextUtils.equals(b.MY_CHANNEL, str);
            if (!equals) {
                string = b.MY_CHANNEL;
            }
            jSONObject2.put(b.CURRENT_MENU_CODE, (Object) string);
            a(equals ? "Page_Home_Button-categoryTab-delete" : "Page_Home_Button-categoryTab-add", jSONObject2.getString(e.KEY_TAB_ID), 0, 0);
            Pair<Integer, Integer> b = b(string);
            if (((Integer) b.second).intValue() == -1) {
                while (true) {
                    if (i2 >= this.c.size()) {
                        i = -1;
                        break;
                    } else if (TextUtils.equals(string, this.c.get(i2).getString(b.MENU_CODE))) {
                        i = i2 + 1;
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                i = ((Integer) b.second).intValue() + 1;
            }
            if (i == -1) {
                return;
            }
            this.c.add(i, jSONObject);
            notifyItemInserted(i);
        }
    }

    private boolean b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("493da635", new Object[]{this, jSONObject, str})).booleanValue();
        }
        if (!TextUtils.equals(str, b.MY_CHANNEL)) {
            return true;
        }
        JSONObject a2 = a(str);
        int i = 7;
        String str2 = "频道不能再少了哦~";
        if (a2 != null) {
            if (!TextUtils.isEmpty(a2.getString(b.MIN_NUMS_WARNING))) {
                str2 = a2.getString(b.MIN_NUMS_WARNING);
            }
            if (a2.getIntValue(b.MY_CHANNEL_MIN_NUMS) != 0) {
                i = a2.getIntValue(b.MY_CHANNEL_MIN_NUMS);
            }
        }
        if (g() > i) {
            return true;
        }
        TBToast.makeText(Globals.getApplication(), str2, 0L).show();
        return false;
    }

    private JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{this, str});
        }
        JSONObject jSONObject = null;
        for (JSONObject jSONObject2 : this.c) {
            if (jSONObject2.getIntValue(b.VIEW_TYPE) == 1 && TextUtils.equals(jSONObject2.getString(b.MENU_CODE), str)) {
                jSONObject = jSONObject2;
            }
        }
        return jSONObject;
    }

    private void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (!TextUtils.equals(str, b.MY_CHANNEL) && !TextUtils.isEmpty(str)) {
            Pair<Integer, Integer> b = b(str);
            if (((Integer) b.first).intValue() == -1 && ((Integer) b.second).intValue() == -1) {
                int i2 = i + 1;
                if (b(str, i2) == -1) {
                    return;
                }
                notifyItemInserted(i2);
                return;
            }
            for (int intValue = ((Integer) b.first).intValue(); intValue <= ((Integer) b.second).intValue(); intValue++) {
                JSONObject jSONObject = this.c.get(intValue);
                if (jSONObject != null && jSONObject.getIntValue(b.VIEW_TYPE) == 3) {
                    this.c.remove(intValue);
                    notifyItemRemoved(intValue);
                    return;
                }
            }
        }
    }

    private int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        Pair<Integer, Integer> b = b(b.MY_CHANNEL);
        return (((Integer) b.second).intValue() - ((Integer) b.first).intValue()) + 1;
    }

    private void a(List<JSONObject> list) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.g.clear();
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (JSONObject jSONObject2 : list) {
            int intValue = jSONObject2.getIntValue(b.VIEW_TYPE);
            if (intValue == 1) {
                this.g.put(jSONObject2.getString(b.MENU_CODE), new ArrayList());
                hashMap.put(jSONObject2.getString(b.MENU_CODE), jSONObject2);
            }
            if (intValue == 2 && (jSONObject = jSONObject2.getJSONObject("content")) != null) {
                String string = jSONObject.getString(b.CURRENT_MENU_CODE);
                if (hashMap.containsKey(string)) {
                    Integer num = (Integer) linkedHashMap.get(string);
                    linkedHashMap.put(string, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                }
            }
        }
        for (String str : hashMap.keySet()) {
            Integer num2 = (Integer) linkedHashMap.get(str);
            if (num2 == null || num2.intValue() == 0) {
                b(str, this.c.indexOf(hashMap.get(str)) + 1);
            }
        }
    }

    private int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{this, str, new Integer(i)})).intValue();
        }
        JSONObject a2 = a(str);
        if (a2 == null) {
            return -1;
        }
        String string = a2.getString(b.ALL_ADDED_TEXT);
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(string)) {
            string = "已全部添加到“我的频道”";
        }
        jSONObject.put(b.ALL_ADDED_TEXT, (Object) string);
        jSONObject.put(b.VIEW_TYPE, (Object) 3);
        jSONObject.put(b.ALL_ADDED_TEXT_COLOR, (Object) Integer.valueOf(b.a(a2.getString(b.ALL_ADDED_TEXT_COLOR), "#999999")));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(b.CURRENT_MENU_CODE, (Object) str);
        jSONObject.put("content", (Object) jSONObject2);
        if (!a(i)) {
            return -1;
        }
        this.c.add(i, jSONObject);
        return i;
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        Pair<Integer, Integer> b = b(b.MY_CHANNEL);
        if (i >= ((Integer) b.first).intValue() - 1 && i <= ((Integer) b.second).intValue()) {
            return false;
        }
        boolean z = false;
        for (int i2 = i - 1; i2 < i + 1; i2++) {
            if (i2 <= this.c.size() - 1) {
                JSONObject jSONObject = this.c.get(i2);
                if (jSONObject == null || jSONObject.getIntValue(b.VIEW_TYPE) == 3) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }

    private Map<String, List<JSONObject>> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this});
        }
        Set<Map.Entry<String, List<JSONObject>>> entrySet = this.g.entrySet();
        for (int i = 0; i < this.c.size(); i++) {
            JSONObject jSONObject = this.c.get(i);
            String d = b.d(this.c.get(i));
            for (Map.Entry<String, List<JSONObject>> entry : entrySet) {
                if (TextUtils.equals(d, entry.getKey())) {
                    entry.getValue().add(jSONObject);
                }
            }
        }
        return this.g;
    }

    private Pair<Integer, Integer> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4f8080fd", new Object[]{this, str});
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < this.c.size(); i3++) {
            if (TextUtils.equals(b.d(this.c.get(i3)), str)) {
                if (i == -1) {
                    i = i3;
                }
                i2 = i3;
            }
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.c.size(); i++) {
            JSONObject jSONObject = this.c.get(i);
            if (jSONObject != null && jSONObject.getIntValue(b.VIEW_TYPE) == 1) {
                notifyItemChanged(i);
            }
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            String str = this.d.panelExposureArg1;
            if (TextUtils.isEmpty(str) || (jSONObject2 = jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM)) == null) {
                return;
            }
            jSONObject2.put("arg1", (Object) str);
            jSONObject.put("isTracked", (Object) false);
            kss.b(jSONObject);
        }
    }

    private void a(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69987edc", new Object[]{this, str, str2, new Integer(i), new Integer(i2)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(e.KEY_TAB_ID, (Object) str2);
        jSONObject.put("from", (Object) Integer.valueOf(i));
        jSONObject.put("to", (Object) Integer.valueOf(i2));
        kss.a("Page_Home", 2101, str, "", "", jSONObject);
    }
}
