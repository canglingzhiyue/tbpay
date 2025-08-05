package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class plj implements plh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f32752a;
    private Map<String, String> b;
    private Context c;
    private pkx d;
    private a e;
    public String f;

    static {
        kge.a(124715315);
        kge.a(-1190468086);
    }

    public plj(Context context, a aVar) {
        this.f = null;
        this.c = context;
        this.e = aVar;
        a aVar2 = this.e;
        if (aVar2 != null) {
            this.f = aVar2.G();
        }
        this.d = new pkx(context);
    }

    @Override // tb.plh
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f32752a = str;
        }
    }

    @Override // tb.plh
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        JSONArray jSONArray;
        VideoInfo u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (this.f32752a == null) {
        } else {
            ChatMessage chatMessage = new ChatMessage();
            chatMessage.mContent = this.f32752a;
            if (cgl.i() != null) {
                chatMessage.mUserNick = cgl.i().b();
                chatMessage.mUserId = v.c(cgl.i().a());
                chatMessage.mUserIcon = cgl.i().e();
            }
            chatMessage.mTimestamp = cgl.j().a();
            LiveDetailMessinfoResponseData liveDetailMessinfoResponseData = null;
            a aVar = this.e;
            if (aVar != null && aVar.d() != null) {
                liveDetailMessinfoResponseData = this.e.d().f();
            }
            if (liveDetailMessinfoResponseData != null && !TextUtils.isEmpty(liveDetailMessinfoResponseData.snsNick)) {
                chatMessage.mUserNick = liveDetailMessinfoResponseData.snsNick;
            }
            if (liveDetailMessinfoResponseData != null && liveDetailMessinfoResponseData.visitorIdentity != null) {
                chatMessage.renders = (HashMap) liveDetailMessinfoResponseData.visitorIdentity.clone();
            } else {
                VideoInfo u2 = poy.u(this.e);
                if (u2 != null && u2.visitorIdentity != null) {
                    chatMessage.renders = (HashMap) u2.visitorIdentity.clone();
                }
            }
            if (chatMessage.renders == null) {
                chatMessage.renders = new HashMap<>();
            }
            if (!poy.J(this.e) && (u = poy.u(this.e)) != null && u.commentIcons != null) {
                chatMessage.renders.put("comment_icons", JSON.toJSONString(u.commentIcons));
            }
            a(chatMessage);
            if (this.b != null) {
                chatMessage.renders.putAll(this.b);
            }
            chatMessage.scrollToMsg = true;
            if (netResponse != null && netResponse.getBytedata() != null) {
                try {
                    JSONObject optJSONObject = new JSONObject(new String(netResponse.getBytedata())).optJSONObject("data");
                    if (this.d.a(optJSONObject)) {
                        return;
                    }
                    if (chatMessage.renders != null && chatMessage.renders.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER) != null) {
                        optJSONObject.put(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER, chatMessage.renders.get(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER));
                    }
                    chatMessage.mExtraParams = optJSONObject;
                    new pky().a(chatMessage);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("tbNick");
                        if (!TextUtils.isEmpty(optString)) {
                            chatMessage.mUserNick = optString;
                        }
                        chatMessage.isOnScreen = optJSONObject.optBoolean("show", true);
                        JSONObject jSONObject = optJSONObject.getJSONObject("ext");
                        if (jSONObject != null && (jSONArray = jSONObject.getJSONArray(ChatMessage.KEY_MEDAL_LIST_DT)) != null) {
                            chatMessage.renders.put(ChatMessage.KEY_MEDAL_LIST_TB, jSONArray.toString());
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            ddw.a().a(xkw.EVENT_ADD_ITEM, chatMessage, this.f);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (netResponse != null && !TextUtils.isEmpty(netResponse.getRetMsg())) {
            d.a(this.c, netResponse.getRetMsg(), 17);
        } else {
            Context context = this.c;
            d.a(context, context.getString(R.string.taolive_send_comments_failed), 17);
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    private void a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d487357f", new Object[]{this, chatMessage});
            return;
        }
        String d = com.taobao.taolive.room.ui.fanslevel.a.a().d();
        VideoInfo u = poy.u(this.e);
        if (u != null && u.broadCaster != null && !u.broadCaster.follow) {
            d = "0";
        }
        if (chatMessage == null || chatMessage.renders == null || TextUtils.isEmpty(d)) {
            return;
        }
        chatMessage.renders.put(com.taobao.taolive.room.ui.fanslevel.a.FANS_LEVEL_RENDER, d);
    }
}
