package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.sur;

/* loaded from: classes8.dex */
public final class suz extends sur {
    public static final String ARGS_ARGS = "args";
    public static final String ARGS_NAME = "name";
    public static final String ARGS_SESSION_ID = "id";
    public static final String ARGS_SESSION_ID_DEFAULT = "-1";
    public static final String CARD_DATA_CHANGE_ARGS_ID = "id";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE = "type";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_COLLECTION = "COLLECTION";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_EXT = "EXT";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_GG_GAME = "ggGame";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_LIVE = "LIVE";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_PICTURE_ALBUM = "PICTURE_ALBUM";
    public static final String CARD_DATA_CHANGE_ARGS_TYPE_VIDEO = "VIDEO";
    public static final String CARD_DATA_CHANGE_NAME = "VSMSG_activeCardDataChange";
    public static final a Companion;
    public static final String FIRST_FRAME_RENDER_FINISH_NAME = "VSMSG_firstFrameRenderFinish";
    public static final String GET_CARD_DATA_CALLBACK_DATA = "data";
    public static final String GET_CARD_DATA_CALLBACK_DATA_ID = "id";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE = "type";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_COLLECTION = "COLLECTION";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_EXT = "EXT";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_GG_GAME = "ggGame";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_LIVE = "LIVE";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_PICTURE_ALBUM = "PICTURE_ALBUM";
    public static final String GET_CARD_DATA_CALLBACK_DATA_TYPE_VIDEO = "VIDEO";
    public static final String GET_CARD_DATA_NAME = "VSMSG_getActiveCardData";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE = "state";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE_PAUSE = "pause";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_FINISH = "finished";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE_PROGRESS_UPDATE = "timeUpdate";
    public static final String VIDEO_STATE_CHANGE_ARGS_STATE_START = "play";
    public static final String VIDEO_STATE_CHANGE_NAME = "VSMSG_videoStateChanged";

    static {
        kge.a(205795517);
        Companion = new a(null);
    }

    public /* synthetic */ suz(String str, JSONObject jSONObject, long j, String str2, String str3, sur.a aVar, o oVar) {
        this(str, jSONObject, j, str2, str3, aVar);
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-751823931);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final suz a(JSONObject args, long j, String sender, String receiver, sur.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (suz) ipChange.ipc$dispatch("be19fe3b", new Object[]{this, args, new Long(j), sender, receiver, aVar});
            }
            q.d(args, "args");
            q.d(sender, "sender");
            q.d(receiver, "receiver");
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessage", "解析视频Tab消息实体，timestamp=" + j + "，sender=" + sender + "，receiver=" + receiver);
            if ((q.a((Object) sender, (Object) "Interact") && q.a((Object) receiver, (Object) "Interact")) || ((!q.a((Object) sender, (Object) "Interact")) && (!q.a((Object) receiver, (Object) "Interact")))) {
                return null;
            }
            Object obj = args.get("name");
            if (!(obj instanceof String)) {
                com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessage", "解析视频Tab消息实体，name无效");
                return null;
            }
            if (args.get("id") == null) {
                args.put((JSONObject) "id", "-1");
            }
            return new suz((String) obj, args, j, sender, receiver, aVar, null);
        }

        public final suz a(JSONObject messageJSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (suz) ipChange.ipc$dispatch("2906dea6", new Object[]{this, messageJSONObject});
            }
            q.d(messageJSONObject, "messageJSONObject");
            com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessage", "解析视频Tab消息实体");
            Object obj = messageJSONObject.get("args");
            Object obj2 = messageJSONObject.get("timestamp");
            Object obj3 = messageJSONObject.get("sender");
            Object obj4 = messageJSONObject.get(sur.KEY_RECEIVER);
            if (!(obj instanceof JSONObject) || !(obj2 instanceof Long) || !(obj3 instanceof String) || !(obj4 instanceof String)) {
                com.taobao.tab2interact.core.utils.a.b(this, "ShortVideoTabMessage", "解析视频Tab消息实体，messageJSONObject参数无效");
                return null;
            }
            return a((JSONObject) obj, ((Number) obj2).longValue(), (String) obj3, (String) obj4, null);
        }
    }

    private suz(String str, JSONObject jSONObject, long j, String str2, String str3, sur.a aVar) {
        super(str, jSONObject, j, str2, str3, aVar);
    }
}
