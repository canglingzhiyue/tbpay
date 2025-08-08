package com.taobao.tbliveinteractive.business.task;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ju.track.server.JTrackParams;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.tbliveinteractive.e;
import tb.cgl;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f22103a;
    private String b;
    private b c = new b(new d() { // from class: com.taobao.tbliveinteractive.business.task.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // com.taobao.taolive.sdk.adapter.network.d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (!(netBaseOutDo instanceof MtopTaobaoGiuliaIntimacyActionEventResponse)) {
            } else {
                TLiveMsg tLiveMsg = new TLiveMsg();
                tLiveMsg.type = 10015;
                tLiveMsg.data = ((MtopTaobaoGiuliaIntimacyActionEventResponse) netBaseOutDo).mo1437getData().getBytes();
                tLiveMsg.topic = a.a(a.this);
                a.b(a.this).f().dispatchUserPowerMessage(tLiveMsg);
            }
        }
    });
    private com.taobao.alilive.aliliveframework.frame.a d;
    private e e;

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("307d2c95", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("36313de1", new Object[]{aVar}) : aVar.d;
    }

    static {
        kge.a(-1246495036);
        f22103a = a.class.getSimpleName();
    }

    public a(com.taobao.alilive.aliliveframework.frame.a aVar, e eVar) {
        this.d = aVar;
        this.e = eVar;
    }

    public void a(String str, JSONObject jSONObject, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d241820f", new Object[]{this, str, jSONObject, videoInfo});
            return;
        }
        if (pmd.a().q() != null && pmd.a().q().c() && videoInfo != null && videoInfo.broadCaster != null) {
            this.c.a(str, jSONObject.toString(), a(videoInfo).toString(), "970", videoInfo.broadCaster.accountId + "_1_" + videoInfo.liveId);
        }
        if (StringUtils.isEmpty(str)) {
            return;
        }
        a("TBLiveWVPlugin.Event.actionReport", a(str, jSONObject, a(videoInfo)));
    }

    public void a(String str, JSONObject jSONObject, String str2, FandomInfo fandomInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a777f3a5", new Object[]{this, str, jSONObject, str2, fandomInfo});
            return;
        }
        if (pmd.a().q() != null && pmd.a().q().c() && fandomInfo != null && fandomInfo.broadCaster != null) {
            this.b = fandomInfo.topic;
            this.c.a(str, fandomInfo.broadCaster.accountId, fandomInfo.id, str2);
        }
        if (StringUtils.isEmpty(str)) {
            return;
        }
        a("TBLiveWVPlugin.Event.actionReport", a(str, jSONObject, a((VideoInfo) null)));
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        e eVar = this.e;
        if (eVar == null) {
            return;
        }
        eVar.a(str, str2);
    }

    private JSONObject a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bb11d085", new Object[]{this, videoInfo});
        }
        JSONObject jSONObject = new JSONObject();
        if (videoInfo != null && videoInfo.broadCaster != null) {
            jSONObject.put("activityId", (Object) videoInfo.liveId);
            jSONObject.put("broadcasterId", (Object) videoInfo.broadCaster.accountId);
        }
        if (cgl.i() != null) {
            jSONObject.put("userId", (Object) cgl.i().a());
        }
        return jSONObject;
    }

    private String a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df21392e", new Object[]{this, str, jSONObject, jSONObject2});
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("action", (Object) str);
        jSONObject3.put("params", (Object) jSONObject);
        jSONObject3.put(JTrackParams.TRACK_PARAMS, (Object) jSONObject2);
        return jSONObject3.toString();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b bVar = this.c;
        if (bVar != null) {
            bVar.a();
        }
        this.e = null;
    }
}
