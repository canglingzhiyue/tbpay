package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.ability.localization.b;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.core.subscriber.data.OperateFields;
import com.taobao.android.order.core.subscriber.widget.c;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class iap extends p implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "moreClickV2";

    /* renamed from: a  reason: collision with root package name */
    public c f28880a;
    public e b;
    public ArrayList<OperateFields> l;

    static {
        kge.a(639695482);
        kge.a(-1201612728);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-3518449732871602506";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (eVar == null) {
            bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "ultronEvent is null");
        } else {
            this.b = eVar;
            JSONObject fields = eVar.d().getFields();
            if (fields == null) {
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "ultronEvent is null");
                return;
            }
            h();
            try {
                JSONObject jSONObject = fields.containsKey("suborderop") ? fields.getJSONObject("suborderop") : fields;
                this.l = new ArrayList<>();
                hzy.a("ShowMoreOrderOpSubscrib", "onHandleEventChain", jSONObject.toJSONString());
                this.l = (ArrayList) JSONArray.parseArray(jSONObject.get("values").toString(), OperateFields.class);
                String string = fields.getString("maxShow");
                int parseInt = StringUtils.isEmpty(string) ? 3 : Integer.parseInt(string);
                if (b.c()) {
                    parseInt = 2;
                }
                if (this.l != null && this.l.size() > parseInt) {
                    ArrayList<OperateFields> arrayList = this.l;
                    ArrayList arrayList2 = new ArrayList(arrayList.subList(parseInt, arrayList.size()));
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    bkd.a(getClass().getSimpleName(), "onHandleEventChain", "size 正常匹配");
                    HashMap hashMap = (HashMap) eVar.d("bizParams");
                    if (!(hashMap.get("nativeView") instanceof View)) {
                        return;
                    }
                    View view = (View) hashMap.get("nativeView");
                    if (view == null) {
                        bkd.a(getClass().getSimpleName(), "RECYCLER_VIEW_HOLDER_IS_NULL", "RECYCLER_VIEW_HOLDER_IS_NULL");
                        return;
                    }
                    hzy.a("ShowMoreOrderOpSubscrib", "load popWinodw", arrayList2.toString());
                    this.f28880a = new c(eVar.a(), arrayList2, this);
                    this.f28880a.a(view);
                    return;
                }
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_CODES_SMALL_ERROR", "codes list small than " + parseInt);
            } catch (Throwable th) {
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_TRY_EXCEPTION_ERROR", bkd.a(th));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        h();
        Object tag = view.getTag();
        if (tag instanceof OperateFields) {
            String event = ((OperateFields) tag).getEvent();
            e eVar = this.b;
            if (eVar == null || eVar.d() == null || this.b.d().getEvents() == null || com.taobao.android.adam.common.b.a(this.b, event)) {
                return;
            }
            b(this.b, bki.a(this.b.d(), event), null);
            return;
        }
        bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_TRY_EXCEPTION_ERROR", "tag is null Or cast error" + tag);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        c cVar = this.f28880a;
        if (cVar == null || !cVar.a()) {
            return;
        }
        this.f28880a.b();
        this.f28880a = null;
    }
}
