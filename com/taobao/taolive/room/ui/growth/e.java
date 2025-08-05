package com.taobao.taolive.room.ui.growth;

import android.taobao.windvane.util.m;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.aej;
import tb.aek;
import tb.ael;
import tb.ddw;
import tb.kge;
import tb.pqj;
import tb.xkw;

/* loaded from: classes8.dex */
public class e implements aek {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f21725a;
    private JSONObject b;
    private com.taobao.alilive.aliliveframework.frame.a c;

    static {
        kge.a(-897930054);
        kge.a(1845411121);
    }

    @Override // tb.aek
    public ael onEvent(int i, aej aejVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ael) ipChange.ipc$dispatch("786a51d8", new Object[]{this, new Integer(i), aejVar, objArr});
        }
        if (3005 == i && (objArr[0] instanceof String)) {
            try {
                JSONObject b = pqj.b((String) objArr[0]);
                String str = (String) b.get("event");
                if ("TaoliveRoomSubscribeStateNotify".equals(str)) {
                    if (this.b != null && this.c != null) {
                        ddw.a().a(xkw.EVENT_RANK_LIVE_QUERY_GROWTH_DATA, null, this.c.G());
                    } else {
                        a(b);
                    }
                } else if ("taoLiveAnchorStartNotify".equals(str)) {
                    a(b);
                }
            } catch (Throwable th) {
                m.e("SubscriberSuccessListener", th.toString());
            }
        }
        return null;
    }

    private void a(JSONObject jSONObject) {
        View view;
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!Boolean.parseBoolean(jSONObject.getJSONObject("param").getString("subscribeState")) || (view = this.f21725a.get()) == null || !(view.getParent() instanceof ViewGroup) || (viewGroup = (ViewGroup) view.getParent()) == null) {
        } else {
            viewGroup.removeAllViews();
            viewGroup.setPadding(0, 0, 0, 0);
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f21725a = new WeakReference<>(view);
        }
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e1a533", new Object[]{this, aVar, jSONObject});
            return;
        }
        this.b = jSONObject;
        this.c = aVar;
    }
}
