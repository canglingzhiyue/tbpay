package com.taobao.ask;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import tb.kge;

/* loaded from: classes6.dex */
public class ASK_CONST {
    public static final String ANSWERED_URL_DEFAULT_VALUE = "https://h5.m.taobao.com/tnode/index.htm?tnode=page_askdetail%40ugc%3fpangesture%3dpullrightexit%26navbarHide%3dtrue%26immersive%3dtrue&from=answer";
    public static final String ANSWERED_URL_KEY = "answerPublish_answeredRedirectUrl";
    public static final String ANSWER_PUBLISH_DEGRADE_URL_DEFAULT_VALUE = "https://web.m.taobao.com/app/mtb/ask-everyone/answer?pha=true&disableNav=YES";
    public static final String ANSWER_PUBLISH_DEGRADE_URL_KEY = "answerPublish_degradedUrl";
    public static final String KEY_CACHE_DATA_ID = "cacheDataId";
    public static final String KEY_CALL_FROM_WINDVANE = "callFromWindvane";
    public static final String KEY_CONTAINER_ID = "nativeContainerId";
    public static final String KEY_DEGRADE_WHEN_ANSWERD = "degradeWhenAnswerd";
    public static final String KEY_IS_IMMERSIVE = "isImmersive";
    public static final String KEY_IS_URL_PROCESSED = "isUrlProcessed";
    public static final String KEY_ITEM_ID = "itemId";
    public static final String KEY_QUESTION_ID = "questionId";
    public static final String KEY_SCENE = "scene";
    public static final String KEY_SESSION_ID = "sessionId";
    public static final String KEY_TNODE_TIME = "tnodeTime";
    public static final String KEY_TNODE_URL = "tnode";
    public static final String LOG_TAG = "ASK";
    public static final String PUBLISH_PRIVATE_URL = "https://h5.m.taobao.com/ask-everyone/private/publish.htm?";
    public static final String PUBLISH_PUBLIC_URL = "https://h5.m.taobao.com/ask-everyone/publish.htm?";
    public static final String TNODE_URL_ANSWER_PUBLISH = "http://h5.m.taobao.com/tnode/index.htm?tnode=page_askanswerpublish";
    public static final String TNODE_URL_QUESTION_PUBLISH = "http://h5.m.taobao.com/tnode/index.htm?tnode=page_askquestionpublish";

    /* loaded from: classes6.dex */
    public enum ERROR {
        USER_CANCELED(com.alibaba.ability.impl.photo.b.ERROR_CODE_USER_CANCELED, ""),
        INVALID_PARAMS("INVALID_PARAMS", ""),
        PUBLISHER_DEGRADED("PUBLISHER_DEGRADED", ""),
        RENDER_ERROR(DXMonitorConstant.RENDER_ERROR, ""),
        PUB_MTOP_FAILED("PUB_MTOP_FAILED", "");
        
        private String code;
        private String message;

        ERROR(String str, String str2) {
            this.code = str;
            this.message = str2;
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", (Object) this.code);
            jSONObject.put("message", (Object) this.message);
            return jSONObject;
        }
    }

    static {
        kge.a(2126089844);
    }
}
