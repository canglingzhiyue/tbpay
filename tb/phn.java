package tb;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taolive.room.business.commission.request.OuterTraceInfo;
import com.taobao.taolive.room.business.commission.request.OuterTraceLocalInfo;
import com.taobao.taolive.room.business.commission.request.OuterTraceResponse;
import com.taobao.taolive.room.business.commission.request.a;
import com.taobao.taolive.room.utils.ae;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.o;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class phn implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "OuterTraceLogic";

    /* renamed from: a  reason: collision with root package name */
    private a f32650a;
    private e b;

    static {
        kge.a(-897786689);
        kge.a(-797454141);
    }

    public phn(e eVar) {
        this.b = eVar;
    }

    public void a(VideoInfo videoInfo) {
        OuterTraceLocalInfo outerTraceLocalInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead9f965", new Object[]{this, videoInfo});
        } else if (o.x()) {
            a("send");
            if (this.b == null || videoInfo == null) {
                return;
            }
            String str = "1";
            if (!videoInfo.roomStatus.equals(str)) {
                a("send not live");
                return;
            }
            String str2 = videoInfo.liveId;
            String R = poy.R(this.b);
            String p = poz.p(n.b(this.b));
            JSONObject jSONObject = null;
            String str3 = (this.b.r() == null || this.b.r().initParams == null) ? null : this.b.r().initParams.get(aw.PARAM_TCP_OUTER_PARAM);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject = new JSONObject();
                jSONObject.put(aw.PARAM_TCP_OUTER_PARAM, (Object) str3);
                a("send from url outerTraceContext = " + jSONObject);
            }
            if (jSONObject == null) {
                String a2 = ae.a(TAG);
                if (!TextUtils.isEmpty(a2) && (outerTraceLocalInfo = (OuterTraceLocalInfo) JSON.parseObject(a2, OuterTraceLocalInfo.class)) != null && outerTraceLocalInfo.localCacheContext != null && !outerTraceLocalInfo.localCacheContext.isEmpty()) {
                    for (int i = 0; i < outerTraceLocalInfo.localCacheContext.size(); i++) {
                        OuterTraceLocalInfo.LocalOuterParam localOuterParam = outerTraceLocalInfo.localCacheContext.get(i);
                        if (localOuterParam != null && System.currentTimeMillis() <= localOuterParam.expireTime) {
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            jSONObject.put(localOuterParam.key, (Object) localOuterParam.value);
                        }
                    }
                }
                a("send from cache outerTraceContext = " + jSONObject);
                str = "2";
            }
            String str4 = str;
            JSONObject jSONObject2 = jSONObject;
            if (jSONObject2 == null) {
                return;
            }
            this.f32650a = new a(this);
            this.f32650a.a(str4, str2, jSONObject2, R, "enterLive", p);
            a(jSONObject2, str4, str2, R, "enterLive", p);
            a("send getUrlList outerTraceContext = " + jSONObject2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!o.x()) {
        } else {
            a(DMComponent.RESET);
            a aVar = this.f32650a;
            if (aVar == null) {
                return;
            }
            aVar.a();
            this.f32650a = null;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        a("onSuccess");
        if (!(netBaseOutDo instanceof OuterTraceResponse)) {
            return;
        }
        OuterTraceInfo mo1437getData = ((OuterTraceResponse) netBaseOutDo).mo1437getData();
        long currentTimeMillis = System.currentTimeMillis();
        if (mo1437getData == null || mo1437getData.result == null || mo1437getData.result.localCacheContext == null) {
            return;
        }
        OuterTraceLocalInfo outerTraceLocalInfo = new OuterTraceLocalInfo();
        outerTraceLocalInfo.localCacheContext = new ArrayList();
        for (int i2 = 0; i2 < mo1437getData.result.localCacheContext.size(); i2++) {
            OuterTraceInfo.OuterParam outerParam = mo1437getData.result.localCacheContext.get(i2);
            if (outerParam != null) {
                outerTraceLocalInfo.localCacheContext.add(new OuterTraceLocalInfo.LocalOuterParam(outerParam.expireTime + currentTimeMillis, outerParam.key, outerParam.value));
            }
        }
        String jSONString = JSON.toJSONString(outerTraceLocalInfo);
        ae.a(TAG, jSONString);
        a("onSuccess cacheStr = " + jSONString);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            a("onError");
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            a("onSystemError");
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (pmd.a().m() == null) {
        } else {
            pnj m = pmd.a().m();
            StringBuilder sb = new StringBuilder();
            e eVar = this.b;
            sb.append(eVar != null ? eVar.j() : "");
            sb.append(" - ");
            sb.append(str);
            m.b(TAG, sb.toString());
        }
    }

    private void a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e8c17a", new Object[]{this, jSONObject, str, str2, str3, str4, str5});
        } else if (this.b == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("liveToken", this.b.j());
            hashMap.put(RVStartParams.KEY_FROM_TYPE, str);
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str2);
            hashMap.put("outerTraceContext", jSONObject.toJSONString());
            hashMap.put("entryLiveSource", str3);
            hashMap.put("actionSource", str4);
            hashMap.put(pqq.KEY_LIVE_SOURCE, str5);
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", "outerTraceMonitor", hashMap);
        }
    }
}
