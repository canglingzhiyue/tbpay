package com.taobao.android.detail.ttdetail.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.c;
import com.taobao.android.detail.ttdetail.utils.at;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.HashMap;
import java.util.Map;
import tb.eyx;
import tb.fgl;
import tb.kge;
import tb.mrm;
import tb.pir;
import tb.pkw;

/* loaded from: classes4.dex */
public class DetailUpdateDataReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private eyx f10512a;
    private c b;
    private a c;

    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void a(Map<String, String> map);
    }

    static {
        kge.a(1107370580);
    }

    public static /* synthetic */ Object ipc$super(DetailUpdateDataReceiver detailUpdateDataReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public DetailUpdateDataReceiver(eyx eyxVar, c cVar, a aVar) {
        this.f10512a = eyxVar;
        this.b = cVar;
        this.c = aVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String a3 = this.f10512a.e().a();
        String stringExtra = intent.getStringExtra("skuToken");
        boolean equals = TextUtils.equals(intent.getStringExtra("from"), "appletBridge");
        i.a("DetailUpdateDataReceiver", "onReceive skuToken=" + stringExtra + ", fromApplet=" + equals);
        if (!a3.equals(stringExtra) && !equals) {
            i.a("DetailUpdateDataReceiver", "skuToken不相等，containerToken=" + a3);
            return;
        }
        if (Boolean.parseBoolean(intent.getStringExtra("updateWithCustomApi"))) {
            a2 = b(intent);
        } else {
            a2 = a(intent);
        }
        if (a2 == null) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("areaChangedByUser");
        if (!TextUtils.isEmpty(stringExtra2)) {
            a2.put("areaChangedByUser", stringExtra2);
        }
        i.a("DetailUpdateDataReceiver", "onUpdateDetail");
        this.c.a(a2);
        if ("true".equalsIgnoreCase(intent.getStringExtra("forbidLoading"))) {
            return;
        }
        this.b.d();
    }

    private Map<String, String> a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{this, intent});
        }
        if (!TextUtils.equals((String) this.f10512a.e().a("requestItemId"), intent.getStringExtra(fgl.ORIGINALITEMID))) {
            return null;
        }
        String stringExtra = intent.getStringExtra(fgl.TARGETITEMID);
        pir pirVar = (pir) this.f10512a.a().a(pkw.PARSER_ID);
        boolean a2 = at.a(pirVar);
        boolean b = at.b(pirVar);
        if (a2 && !b) {
            String c = at.c(pirVar);
            if (!TextUtils.isEmpty(c)) {
                stringExtra = c;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DetailCoreActivity.DETAIL_ITEM_ID, stringExtra);
        String stringExtra2 = intent.getStringExtra(mrm.KEY_AREA_ID);
        if (!TextUtils.isEmpty(stringExtra2)) {
            hashMap.put(mrm.KEY_AREA_ID, stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("addressId");
        this.c.a(stringExtra3);
        if (!TextUtils.isEmpty(stringExtra3)) {
            hashMap.put("addressId", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("params");
        if (!TextUtils.isEmpty(stringExtra4)) {
            hashMap.put("params", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("relatedAuctionParams");
        if (!TextUtils.isEmpty(stringExtra5)) {
            hashMap.put("relatedAuctionParams", stringExtra5);
        }
        return hashMap;
    }

    private Map<String, String> b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db54185b", new Object[]{this, intent});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("apiInfo", intent.getStringExtra("apiInfo"));
        hashMap.put("headerInfo", intent.getStringExtra("headerInfo"));
        hashMap.put("data", intent.getStringExtra("data"));
        hashMap.put("updateWithCustomApi", intent.getStringExtra("updateWithCustomApi"));
        hashMap.put("streamMode", intent.getStringExtra("streamMode"));
        return hashMap;
    }
}
