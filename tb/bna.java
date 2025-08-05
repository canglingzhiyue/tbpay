package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.android.ultron.trade.presenter.c;
import com.alibaba.android.ultron.trade.utils.i;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class bna implements bok, bol {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COMPONENT = "component";
    public static final String KEY_EXTRA_PARAMS = "extraParams";
    public static final String KEY_INDEX_MODE = "indexMode";
    public static final String KEY_TRIGGER_VIEW = "triggerView";
    public static final String KEY_VIEW = "view";
    public static final String KEY_VIEW_PARAMS = "viewParams";

    /* renamed from: a  reason: collision with root package name */
    private Context f25992a;
    private c b;
    private bmz c;
    private boolean d = false;
    private Map<String, List<bmy>> e = new HashMap();
    private IDMComponent f;
    private String g;
    private String h;
    private a i;

    /* loaded from: classes2.dex */
    public interface a {
    }

    static {
        kge.a(-1513030608);
        kge.a(-1834858427);
        kge.a(-1969390164);
    }

    public bna(c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("presenter can not be null");
        }
        this.b = cVar;
        this.f25992a = this.b.m();
    }

    private List<bmy> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{this, str});
        }
        List<bmy> list = this.e.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.e.put(str, arrayList);
        return arrayList;
    }

    public void a(String str, bmy bmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21f25454", new Object[]{this, str, bmyVar});
        } else if (str == null || bmyVar == null) {
        } else {
            List<bmy> a2 = a(str);
            if (a2.contains(bmyVar)) {
                return;
            }
            a2.add(bmyVar);
        }
    }

    public void c(String str, bmy bmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc3e4d6", new Object[]{this, str, bmyVar});
        } else if (str == null || bmyVar == null) {
        } else {
            a(str).remove(bmyVar);
        }
    }

    public void b(String str, bmy bmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36db1c95", new Object[]{this, str, bmyVar});
        } else if (str == null || bmyVar == null) {
        } else {
            List<bmy> a2 = a(str);
            a2.clear();
            a2.add(bmyVar);
        }
    }

    public bmz a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmz) ipChange.ipc$dispatch("f02d96f", new Object[]{this}) : new bmz().a(this.f25992a).a(this.b);
    }

    @Override // tb.bol
    public void a(View view, String str, Object obj, Object obj2, Object obj3, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("595ecc62", new Object[]{this, view, str, obj, obj2, obj3, arrayList});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_INDEX_MODE, false);
        a(view, str, obj, obj2, obj3, arrayList, hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    @Override // tb.bok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r24, java.lang.String r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28, java.util.ArrayList r29, java.util.Map r30) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bna.a(android.view.View, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.util.ArrayList, java.util.Map):void");
    }

    private b a(b bVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("392512a2", new Object[]{this, bVar, jSONObject, str});
        }
        if (bVar == null) {
            return null;
        }
        try {
            if (bVar.getFields() != null && jSONObject != null) {
                return new DMEvent(bVar.getType(), (JSONObject) jph.a(jSONObject, JSONObject.parseObject(bVar.getFields().toString()), str), bVar.getComponents(), bVar instanceof DMEvent ? ((DMEvent) bVar).getOption() : 0);
            }
            return null;
        } catch (Exception e) {
            UnifyLog.d("TradeEventHandler", "deepCloneAndParseNewEvent error=" + e.getMessage());
            return bVar;
        }
    }

    public void a(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20852e9", new Object[]{this, bmzVar});
            return;
        }
        String b = bmzVar.b();
        if (b == null || this.d) {
            return;
        }
        List<bmy> list = this.e.get(b);
        if (list == null) {
            UnifyLog.a(this.b.s(), "TradeEventHandler", "dispatchEvent", b, "", UnifyLog.EventType.ERROR, c(bmzVar));
            i.a(bmzVar);
            return;
        }
        for (bmy bmyVar : list) {
            if (bmyVar != null) {
                bmyVar.a(bmzVar);
            }
        }
    }

    private String c(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5cc00815", new Object[]{this, bmzVar}) : (bmzVar == null || bmzVar.c() == null) ? "" : String.valueOf(bmzVar.c().getFields());
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        bmz bmzVar = this.c;
        if (bmzVar != null && "openUrl".equalsIgnoreCase(bmzVar.b())) {
            a(a().a("openUrlResult").a(bmzVar.c()).a("activityRequestCode", Integer.valueOf(i)).a("activityResultCode", Integer.valueOf(i2)).a("activityResultData", intent).a("openUrlEvent", bmzVar));
        } else if (bmzVar != null && "autoJumpOpenUrl".equalsIgnoreCase(bmzVar.b())) {
            a(a().a("autoJumpOpenUrlResult").a(bmzVar.c()).a("activityRequestCode", Integer.valueOf(i)).a("activityResultCode", Integer.valueOf(i2)).a("activityResultData", intent).a("openUrlEvent", bmzVar));
        }
        if (bmzVar != null && "openPopupWindow".equalsIgnoreCase(bmzVar.b())) {
            return;
        }
        c();
    }

    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
        } else {
            this.c = bmzVar;
        }
    }

    public bmz b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bmz) ipChange.ipc$dispatch("16b47ece", new Object[]{this}) : this.c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = true;
        this.f25992a = null;
        Map<String, List<bmy>> map = this.e;
        if (map == null) {
            return;
        }
        map.clear();
    }

    public void a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a050eeb6", new Object[]{this, iDMComponent, str});
            return;
        }
        this.f = iDMComponent;
        this.g = str;
    }

    @Deprecated
    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797573d0", new Object[]{this, str, aVar});
            return;
        }
        this.h = str;
        this.i = aVar;
    }
}
