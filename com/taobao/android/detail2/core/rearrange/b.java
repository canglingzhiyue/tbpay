package com.taobao.android.detail2.core.rearrange;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.detail2.core.framework.data.DetailDataManager;
import com.taobao.android.detail2.core.framework.data.model.d;
import com.taobao.android.detail2.core.framework.data.net.recommend.RecRequestParamsV2;
import java.util.List;
import tb.fjt;
import tb.flx;
import tb.fly;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements flx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SOLUTION_NAME = "newdetailRerank";

    /* renamed from: a */
    private fly.b f11682a;
    private fly.a b;
    private Context c;
    private com.taobao.android.detail2.core.framework.b d;
    private d f;
    private int e = 0;
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: com.taobao.android.detail2.core.rearrange.RearrangeRequestImpl$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            JSONObject jSONObject2 = (JSONObject) intent.getSerializableExtra("event");
            if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("bizArgsMap")) == null) {
                return;
            }
            String string = jSONObject.getString("feedToken");
            String string2 = jSONObject.getString("nid");
            if (b.a(b.this) == null || !b.a(b.this).a(string, string2)) {
                return;
            }
            b.this.a(string2);
        }
    };

    static {
        kge.a(2093629051);
        kge.a(561064525);
    }

    public static /* synthetic */ fly.a a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fly.a) ipChange.ipc$dispatch("1b4966ba", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ int b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55411c2e", new Object[]{bVar})).intValue();
        }
        int i = bVar.e;
        bVar.e = i + 1;
        return i;
    }

    public static /* synthetic */ fly.b c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fly.b) ipChange.ipc$dispatch("3cb5005b", new Object[]{bVar}) : bVar.f11682a;
    }

    public static /* synthetic */ d d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("4655a253", new Object[]{bVar}) : bVar.f;
    }

    public b(com.taobao.android.detail2.core.framework.b bVar) {
        this.d = bVar;
        com.taobao.android.detail2.core.framework.b bVar2 = this.d;
        if (bVar2 != null) {
            this.c = bVar2.g();
        }
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(com.taobao.android.behavix.d.b()).registerReceiver(this.g, new IntentFilter("BehaviX_nd_realtime_rec_goods"));
        LocalBroadcastManager.getInstance(com.taobao.android.behavix.d.b()).registerReceiver(this.g, new IntentFilter("BehaviX_nd_realtime_rec_video"));
        fjt.a(fjt.TAG_REARRANGE, "端智能注册完成");
    }

    /* loaded from: classes5.dex */
    public class a extends com.taobao.android.detail2.core.framework.data.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public String f11683a;

        static {
            kge.a(-1740437403);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -936327841) {
                return new Boolean(super.a(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), (JSONObject) objArr[2], (List) objArr[3], ((Number) objArr[4]).intValue(), ((Boolean) objArr[5]).booleanValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(String str) {
            b.this = r1;
            this.f11683a = str;
        }

        @Override // com.taobao.android.detail2.core.framework.data.a, com.taobao.android.detail2.core.framework.data.DetailDataManager.a
        public boolean a(boolean z, int i, JSONObject jSONObject, List<d> list, int i2, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c830c55f", new Object[]{this, new Boolean(z), new Integer(i), jSONObject, list, new Integer(i2), new Boolean(z2)})).booleanValue();
            }
            b.b(b.this);
            if (b.c(b.this) != null) {
                b.c(b.this).a(b.d(b.this), list, this.f11683a);
            }
            return super.a(z, i, jSONObject, list, i2, z2);
        }

        @Override // com.taobao.android.detail2.core.framework.data.a, com.taobao.android.detail2.core.framework.data.DetailDataManager.a
        public void a(boolean z, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            } else if (b.c(b.this) == null) {
            } else {
                b.c(b.this).a(i2, "");
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        DetailDataManager.LimitedQueue limitedQueue = new DetailDataManager.LimitedQueue(100);
        DetailDataManager.LimitedQueue limitedQueue2 = new DetailDataManager.LimitedQueue(100);
        DetailDataManager.LimitedQueue<String> a2 = this.b.a();
        DetailDataManager.LimitedQueue<String> b = this.b.b();
        d c = this.b.c();
        if (c == null) {
            return;
        }
        int i = c.f + 1;
        if (i > a2.size()) {
            i = a2.size();
        }
        if (i > b.size()) {
            i = b.size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            limitedQueue.add(a2.get(i2));
            limitedQueue2.add(b.get(i2));
        }
        jSONObject.put("realExposedItemIds", (Object) limitedQueue.getAppendString());
        jSONObject.put("realExposedCardSubType", (Object) limitedQueue2.getAppendString());
    }

    @Override // tb.flx
    public void a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.f = this.b.c();
        String feature = BUFS.getFeature(new BUFS.QueryArgs(), c().a(), c().b(), c().c());
        RecRequestParamsV2 recRequestParamsV2 = new RecRequestParamsV2();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bxFeature", (Object) feature);
        jSONObject.put("queryCurrNid", (Object) str);
        jSONObject.put("sub_request_page", (Object) Integer.valueOf(this.e));
        jSONObject.put("realTimeRequest", "true");
        a(jSONObject);
        List<d> d = this.b.d();
        if (d != null) {
            i = d.size();
        }
        jSONObject.put("replacedCount", (Object) Integer.valueOf(i));
        recRequestParamsV2.addBizParams(jSONObject);
        this.b.a(recRequestParamsV2, new a(str));
    }

    private com.taobao.android.detail2.core.rearrange.a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail2.core.rearrange.a) ipChange.ipc$dispatch("c07e4f7f", new Object[]{this}) : this.d.h().W();
    }

    @Override // tb.flx
    public void a(fly.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fe48c7", new Object[]{this, bVar});
        } else {
            this.f11682a = bVar;
        }
    }

    @Override // tb.flx
    public void a(fly.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8fdd468", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    @Override // tb.flx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(com.taobao.android.behavix.d.b()).unregisterReceiver(this.g);
        fjt.a(fjt.TAG_REARRANGE, "端智能取消注册完成");
    }
}
