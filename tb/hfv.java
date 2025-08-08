package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.comments.ICommentsProxy;
import com.taobao.android.live.plugin.proxy.e;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.ChatMessage;

/* loaded from: classes5.dex */
public class hfv implements ICommentsProxy.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ADD_ONE;
    public static final int DYNAMIC_COMMON;
    public static final String ENHANCED_TYPE_QUESTION_ANSWER = "questionAnswer";
    public static final int GENERAL_ACTION;
    public static final String KEY_ADD_ONE = "addOne";
    public static final int NEW_FOLLOW;
    public static final int OLD_FOLLOW;
    public static final int QUESTION_ANSWER;
    public static final int SHARE;
    public static final int TXT;

    /* renamed from: tb.hfv$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28601a = new int[ChatMessage.MessageType.values().length];

        static {
            try {
                f28601a[ChatMessage.MessageType.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28601a[ChatMessage.MessageType.TXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(-161499749);
        kge.a(-1190534108);
        NEW_FOLLOW = hfw.Class_Verify_Code + 10086;
        SHARE = hfw.Class_Verify_Code + 10087;
        TXT = hfw.Class_Verify_Code + 10088;
        OLD_FOLLOW = hfw.Class_Verify_Code + 10089;
        ADD_ONE = hfw.Class_Verify_Code + 10090;
        GENERAL_ACTION = hfw.Class_Verify_Code + d.MSG_TYPE_PRODUCT_LIST_WITH_PM;
        QUESTION_ANSWER = hfw.Class_Verify_Code + d.MSG_TYPE_PRODUCT_LIST_WITH_CDN;
        DYNAMIC_COMMON = hfw.Class_Verify_Code + d.MSG_TYPE_PRODUCT_LIST_WITH_CDN_INVALID;
    }

    public static int a(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4873572", new Object[]{chatMessage})).intValue();
        }
        if (chatMessage.chatItemCommonData != null && !StringUtils.isEmpty(chatMessage.chatItemCommonData.bizType)) {
            return DYNAMIC_COMMON;
        }
        if (chatMessage.renders != null && !chatMessage.renders.isEmpty()) {
            String str = chatMessage.renders.get(aw.PARAM_CHAT_RENDERS_ENHANCE);
            if ("follow".equals(str)) {
                return NEW_FOLLOW;
            }
            if ("share".equals(str)) {
                return SHARE;
            }
            if (KEY_ADD_ONE.equals(str)) {
                return ADD_ONE;
            }
            if ("generalAction".equals(str)) {
                return GENERAL_ACTION;
            }
            if (ply.L() && ENHANCED_TYPE_QUESTION_ANSWER.equals(str)) {
                return QUESTION_ANSWER;
            }
        }
        if (AnonymousClass1.f28601a[chatMessage.mType.ordinal()] == 1) {
            return OLD_FOLLOW;
        }
        return TXT;
    }

    @Override // com.taobao.android.live.plugin.proxy.comments.ICommentsProxy.a
    public String getEnhancedTypeQuestionAnswer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5dc720f", new Object[]{this});
        }
        e.c("ChatItemViewTypeManager: class: " + getClass().getName() + ", pluginEnv: " + hkm.a());
        return ENHANCED_TYPE_QUESTION_ANSWER;
    }
}
