package com.taobao.relationship.mtop.removefollow;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.mtop.b;
import com.taobao.relationship.mtop.removefollow.RemoveFollowResponse;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import java.util.HashMap;
import tb.kge;
import tb.nlv;
import tb.nlw;
import tb.nmf;
import tb.nmj;

/* loaded from: classes7.dex */
public class a implements a.InterfaceC0830a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.relationship.mtop.a f18976a;
    private WVCallBackContext b;
    private nlv c;

    static {
        kge.a(1634916521);
        kge.a(-1545242362);
    }

    public a(com.taobao.relationship.mtop.a aVar) {
        this.f18976a = aVar;
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
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("followedId", (Object) Long.valueOf(bVar.b));
        jSONObject.put("accountType", (Object) Integer.valueOf(bVar.c));
        jSONObject.put("originBiz", (Object) bVar.f);
        jSONObject.put("originPage", (Object) bVar.g);
        jSONObject.put("originFlag", (Object) bVar.h);
        jSONObject.put("type", (Object) Integer.valueOf(bVar.d));
        if (!TextUtils.isEmpty(bVar.i)) {
            jSONObject.put("extra", (Object) bVar.i);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("followData", (Object) jSONObject);
        a.b bVar2 = new a.b(null, "native");
        bVar2.a(bVar);
        com.taobao.tao.flexbox.layoutmanager.actionservice.a.c().a(nmf.ACTION_SERVICE_REMOVEFOLLOW, bVar2, jSONObject2, this);
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
            RemoveFollowResponse.RemoveFollowData removeFollowData = (RemoveFollowResponse.RemoveFollowData) JSON.parseObject(obj.toString(), RemoveFollowResponse.RemoveFollowData.class);
            if (this.f18976a != null) {
                HashMap<String, Object> hashMap = new HashMap<>();
                if (!TextUtils.isEmpty(removeFollowData.toastMsg)) {
                    hashMap.put("toast", removeFollowData.toastMsg);
                }
                if (!TextUtils.isEmpty(removeFollowData.followExtra)) {
                    hashMap.put(nmf.PARAMS_MTOP_RESULT_EXTRA, removeFollowData.followExtra);
                }
                this.f18976a.onBusSuccess(nmf.MTOP_REMOVEFOLLOW, bVar2.b, bVar2.c, hashMap);
            }
            if (this.b != null) {
                r rVar = new r();
                if (!TextUtils.isEmpty(removeFollowData.followExtra)) {
                    rVar.a(nmf.PARAMS_MTOP_RESULT_EXTRA, removeFollowData.followExtra);
                }
                if (bVar2.m) {
                    if (TextUtils.isEmpty(removeFollowData.toastMsg)) {
                        nmj.a("已取消关注");
                    } else {
                        nmj.a(removeFollowData.toastMsg);
                    }
                }
                this.b.success(rVar);
            }
            if (this.c == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(removeFollowData.followExtra)) {
                jSONObject.put(nmf.PARAMS_MTOP_RESULT_EXTRA, (Object) removeFollowData.followExtra);
            }
            if (bVar2.m) {
                if (TextUtils.isEmpty(removeFollowData.toastMsg)) {
                    nmj.a("已取消关注");
                } else {
                    nmj.a(removeFollowData.toastMsg);
                }
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
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", cVar.f19948a);
            hashMap.put("errorMsg", cVar.b);
            if (this.b != null) {
                if (bVar2.m) {
                    nmj.a("取消关注失败");
                }
                r rVar = new r();
                rVar.a("errorMessage", cVar.b);
                this.b.error(rVar);
            }
            if (this.c == null) {
                return;
            }
            if (bVar2.m) {
                nmj.a("取消关注失败");
            }
            this.c.onResult(nlw.b("errorMessage", cVar.b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
