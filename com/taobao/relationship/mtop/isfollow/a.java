package com.taobao.relationship.mtop.isfollow;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.mtop.b;
import com.taobao.relationship.mtop.isfollow.FollowDetailResponse;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import java.util.HashMap;
import tb.kge;
import tb.nlv;
import tb.nlw;
import tb.nmf;
import tb.nmg;

/* loaded from: classes7.dex */
public class a implements a.InterfaceC0830a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.relationship.mtop.a f18975a;
    private WVCallBackContext b;
    private nlv c;

    static {
        kge.a(-1449867828);
        kge.a(-1545242362);
    }

    public a(com.taobao.relationship.mtop.a aVar) {
        this.f18975a = aVar;
    }

    public a(WVCallBackContext wVCallBackContext) {
        this.b = wVCallBackContext;
    }

    public a(nlv nlvVar) {
        this.c = nlvVar;
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6bf238", new Object[]{this, bVar});
        } else if (nmg.b()) {
            a(bVar.b, bVar.c);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("followedId", (Object) Long.valueOf(bVar.b));
            jSONObject.put("accountType", (Object) Integer.valueOf(bVar.c));
            jSONObject.put("type", (Object) Integer.valueOf(bVar.d));
            if (!TextUtils.isEmpty(bVar.i)) {
                jSONObject.put("extra", (Object) bVar.i);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("followData", (Object) jSONObject);
            a.b bVar2 = new a.b(null, "native");
            bVar2.a(bVar);
            com.taobao.tao.flexbox.layoutmanager.actionservice.a.c().a(nmf.ACTION_SERVICE_ISFOLLOW, bVar2, jSONObject2, this);
        }
    }

    private void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        String str = "degreeFollowQuery, pubAccountId =" + j + ", accountType = " + i;
        if (this.f18975a != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(nmf.PARAMS_MTOP_RESULT_ISFOLLOW, false);
            this.f18975a.onBusSuccess(nmf.MTOP_ISFOLLOW, j, i, hashMap);
        }
        if (this.b != null) {
            r rVar = new r();
            rVar.a("followState", "false");
            this.b.success(rVar);
        }
        nlv nlvVar = this.c;
        if (nlvVar == null) {
            return;
        }
        nlvVar.onResult(nlw.a("followState", "0"));
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.InterfaceC0830a
    public void a(a.b bVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349f918d", new Object[]{this, bVar, obj});
            return;
        }
        try {
            b bVar2 = (b) bVar.c;
            FollowDetailResponse.FollowDetail followDetail = (FollowDetailResponse.FollowDetail) JSON.parseObject(obj.toString(), FollowDetailResponse.FollowDetail.class);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(nmf.PARAMS_MTOP_RESULT_ISFOLLOW, Boolean.valueOf(followDetail.follow));
            hashMap.put(nmf.PARAMS_MTOP_RESULT_EXTRA, followDetail.followExtra);
            if (this.f18975a != null) {
                this.f18975a.onBusSuccess(nmf.MTOP_ISFOLLOW, bVar2.b, bVar2.c, hashMap);
            }
            if (this.b != null) {
                r rVar = new r();
                if (!TextUtils.isEmpty(followDetail.followExtra)) {
                    rVar.a(nmf.PARAMS_MTOP_RESULT_EXTRA, followDetail.followExtra);
                }
                if (followDetail.follow) {
                    rVar.a("followState", "true");
                    this.b.success(rVar);
                } else {
                    rVar.a("followState", "false");
                    this.b.success(rVar);
                }
            }
            if (this.c == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(followDetail.followExtra)) {
                jSONObject.put(nmf.PARAMS_MTOP_RESULT_EXTRA, (Object) followDetail.followExtra);
            }
            if (followDetail.follow) {
                jSONObject.put("followState", (Object) "1");
            } else {
                jSONObject.put("followState", (Object) "0");
            }
            this.c.onResult(nlw.a(jSONObject));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.actionservice.a.InterfaceC0830a
    public void a(a.b bVar, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a090d9", new Object[]{this, bVar, cVar});
            return;
        }
        try {
            b bVar2 = (b) bVar.c;
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("errorCode", cVar.f19948a);
            hashMap.put("errorMsg", cVar.b);
            if (this.f18975a != null) {
                this.f18975a.onBusFail(nmf.MTOP_ISFOLLOW, bVar2.b, bVar2.c, hashMap);
            }
            if (this.b != null) {
                r rVar = new r();
                rVar.a("errorMessage", cVar.b);
                this.b.error(rVar);
            }
            if (this.c == null) {
                return;
            }
            this.c.onResult(nlw.b("errorMessage", cVar.b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
