package com.taobao.android.live.plugin.atype.flexalocal.comments.chat;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.utils.p;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.phg;
import tb.pmd;

/* loaded from: classes5.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CopyOnWriteArrayList<JSONObject> b = new CopyOnWriteArrayList<>();

    static {
        kge.a(-1322392083);
    }

    public void a(TBLiveDataModel tBLiveDataModel, ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8f55b8", new Object[]{this, tBLiveDataModel, chatMessage});
        } else if (!p.o() || chatMessage == null || tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || !"1".equals(tBLiveDataModel.mVideoInfo.roomStatus)) {
        } else {
            if (this.b.size() >= p.p()) {
                b();
            }
            HashMap<String, String> hashMap = chatMessage.renders;
            com.taobao.taolive.sdk.utils.e w = pmd.a().w();
            if (hashMap == null || w == null || "follow".equals(hashMap.get(aw.PARAM_CHAT_RENDERS_ENHANCE)) || "share".equals(hashMap.get(aw.PARAM_CHAT_RENDERS_ENHANCE))) {
                return;
            }
            long j = chatMessage.mTimestamp;
            long j2 = chatMessage.mReceivedTimestamp;
            long a2 = w.a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("commentId", (Object) chatMessage.mCommentId);
            jSONObject.put("revDelay", (Object) Long.valueOf(j2 - j));
            jSONObject.put("displayDelay", (Object) Long.valueOf(a2 - j2));
            jSONObject.put("totalDelay", (Object) Long.valueOf(a2 - j));
            jSONObject.put(RemoteMessageConst.SEND_TIME, (Object) Long.valueOf(j));
            jSONObject.put("revTime", (Object) Long.valueOf(j2));
            jSONObject.put("displayTime", (Object) Long.valueOf(a2));
            this.b.add(jSONObject);
        }
    }

    public void b() {
        CopyOnWriteArrayList<JSONObject> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!p.o() || (copyOnWriteArrayList = this.b) == null || copyOnWriteArrayList.isEmpty()) {
        } else {
            String str = null;
            try {
                str = URLEncoder.encode(JSON.toJSONString(this.b), "utf-8");
            } catch (Exception unused) {
            }
            this.b.clear();
            if (StringUtils.isEmpty(str)) {
                return;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("comments", str);
            phg.a().a("LiveCommentExposes", hashMap);
        }
    }
}
