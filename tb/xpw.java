package tb;

import android.view.View;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.ext.p;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.b;
import com.taobao.android.order.core.subscriber.data.OperateFields;
import com.taobao.android.order.core.subscriber.widget.g;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class xpw extends p implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "arrowMoreClick";

    /* renamed from: a  reason: collision with root package name */
    public g f34463a;
    public e b;
    public ArrayList<OperateFields> l;

    static {
        kge.a(1970792925);
        kge.a(-1201612728);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-92876773701590212";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if (!spk.a(iro.ORANGE_KEY_MY_TAOBAO, "enableHandleArrowMoreClick", true)) {
        } else {
            if (eVar == null) {
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "ultronEvent is null");
                return;
            }
            this.b = eVar;
            JSONObject fields = eVar.d().getFields();
            if (fields == null) {
                bkd.a(getClass().getSimpleName(), "EVENT_CHAIN_PARAMS_VALID_ERROR", "ultronEvent is null");
                return;
            }
            h();
            try {
                this.l = new ArrayList<>();
                hzy.a("ArrowMoreClickSubscriber", "onHandleEventChain", fields.toJSONString());
                this.l = (ArrayList) JSONArray.parseArray(fields.get("moreValues").toString(), OperateFields.class);
                ArrayList<OperateFields> arrayList = this.l;
                if (arrayList.isEmpty()) {
                    return;
                }
                HashMap hashMap = (HashMap) eVar.d("bizParams");
                if (!(hashMap.get("nativeView") instanceof View)) {
                    return;
                }
                View view = (View) hashMap.get("nativeView");
                if (view == null) {
                    bkd.a(getClass().getSimpleName(), "RECYCLER_VIEW_HOLDER_IS_NULL", "RECYCLER_VIEW_HOLDER_IS_NULL");
                    return;
                }
                hzy.a("ArrowMoreClickSubscriber", "load popWinodw", arrayList.toString());
                this.f34463a = new g(eVar.a(), arrayList, this);
                this.f34463a.a(view);
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
        try {
            h();
            b.a(this.b, ((OperateFields) view.getTag()).getEvent());
        } catch (Exception unused) {
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        g gVar = this.f34463a;
        if (gVar == null || !gVar.a()) {
            return;
        }
        this.f34463a.b();
        this.f34463a = null;
    }
}
