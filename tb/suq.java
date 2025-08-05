package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.sur;

/* loaded from: classes8.dex */
public final class suq extends sur {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROWSERTASK_BALANCE_UPDATE = "GIMSG_browserTaskBalanceUpdate";
    public static final String BROWSER_BADGE_COUNTDOWN_FINISHED_ARGS_TASK_TYPE = "relatedTaskType";
    public static final String BROWSER_BADGE_COUNTDOWN_FINISHED_NAME = "GIMSG_browserBadgeCountdownFinished";
    public static final String BROWSE_TASK_STATE_CHANGE_ARGS_PAGE_URL_QUERY = "pageUrlQuery";
    public static final String BROWSE_TASK_STATE_CHANGE_ARGS_STATE = "state";
    public static final String BROWSE_TASK_STATE_CHANGE_ARGS_TASK_TYPE = "taskType";
    public static final String BROWSE_TASK_STATE_CHANGE_NAME = "GIMSG_browseStateChange";
    public static final String BROWSE_WITHDRAW_BUBBLE_HIDDEN_NAME = "GIMSG_browseWithdrawBubbleHidden";
    public static final a Companion;
    public static final String GET_BROWSE_TASK_STATE_ARGS_TASK_TYPE = "taskType";
    public static final String GET_BROWSE_TASK_STATE_CALLBACK_PAGE_URL_QUERY = "pageUrlQuery";
    public static final String GET_BROWSE_TASK_STATE_CALLBACK_STATE = "state";
    public static final String GET_BROWSE_TASK_STATE_NAME = "GIMSG_getBrowseState";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA = "data";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER = "browserBadge";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM = "bottomComponent";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM_RIGHT_MARGIN = "centerRightMargin";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_BOTTOM_TOP_MARGIN = "centerTopMargin";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR = "circularProgressBar";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR_RIGHT_MARGIN = "circleCenterRightMargin";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_CIRCULAR_TOP_MARGIN = "circleCenterTopMargin";
    public static final String GET_INTERACT_LOCAL_CONFIG_CALLBACK_DATA_BROWSER_ENABLE = "enableNativeVersion";
    public static final String GET_INTERACT_LOCAL_CONFIG_NAME = "GIMSG_getInteractLocalConfig";
    public static final String GET_INTERACT_REMOTE_CONFIG_CALLBACK_DATA = "data";
    public static final String GET_INTERACT_REMOTE_CONFIG_CALLBACK_SUCCESS = "success";
    public static final String GET_INTERACT_REMOTE_CONFIG_NAME = "GIMSG_getInteractRemoteConfig";
    public static final String GET_NATIVE_LEFT_BUBBLE_STATE_NAME = "GIMSG_getNativeLeftBubbleState";
    public static final String H5_INTERACTION_COMPONENT_RENDER_FINISHED_NAME = "GIMSG_h5interactionComponentRenderFinished";
    public static final String H5_TASK_STATE_CHANGE_ARGS_STATE = "state";
    public static final String H5_TASK_STATE_CHANGE_ARGS_TASK_TYPE = "taskType";
    public static final String H5_TASK_STATE_CHANGE_NAME = "GIMSG_taskStateChange";
    public static final String HIDE_EXTRA_BROWSER_BADGE_NAME = "GIMSG_hideExtraBrowserBadge";
    public static final String INTERACTION_NEW_USER_UPGRADED_NAME = "GIMSG_interactionNewUserUpgrade";
    public static final String INTERACTION_NEW_USER_UPGRADE_POP_RENDERED_NAME = "GIMSG_interactionNewUserUpgradePopRendered";
    public static final String INTERACTION_TASK_COMPLETED_ARGS_ACCOUNT_AMOUNT = "accountAmount";
    public static final String INTERACTION_TASK_COMPLETED_NAME = "GIMSG_interactionTaskCompleted";
    public static final String INTERACTION_TASK_PANEL_BROWSER_BUTTON_CLICKED_NAME = "GIMSG_interactionTaskPanelBrowserButtonClicked";
    public static final String INTERACT_REMOTE_CONFIG_CHANGE_ARGS_DATA = "data";
    public static final String INTERACT_REMOTE_CONFIG_CHANGE_ARGS_SUCCESS = "success";
    public static final String INTERACT_REMOTE_CONFIG_CHANGE_NAME = "GIMSG_interactRemoteConfigChange";
    public static final String IS_BROWSER_BADGE_COUNTDOWN_FINISHED_NAME = "GIMSG_isBrowserBadgeCountdownFinished";
    public static final String IS_INTERACTION_NEW_USER_UPGRADED_NAME = "GIMSG_isInteractionNewUserUpgraded";
    public static final String IS_SHOW_EXTRA_BROWSER_BADGE_NAME = "GIMSG_isShowExtraBrowserBadge";
    public static final String IS_SHOW_INTERACTION_TASK_PANEL_NAME = "GIMSG_isShowInteractionTaskPanel";
    public static final String NATIVE_LEFT_BUBBLE_STATE_CHANGE_ARGS_STATE = "state";
    public static final String NATIVE_LEFT_BUBBLE_STATE_CHANGE_NAME = "GIMSG_nativeLeftBubbleStateChange";
    public static final String REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE = "triggerType";
    public static final String REFRESH_BROWSER_BADGE_DATA_NAME = "GIMSG_refreshBrowserBadgeData";
    public static final String REGISTER_MESSAGES_NAME = "GIMSG_registerMessages";
    public static final String REGISTER_OR_UNREGISTER_MESSAGES_ARGS_MESSAGE_NAMES = "messageNames";
    public static final String REGISTER_OR_UNREGISTER_MESSAGES_ARGS_TARGET = "target";
    public static final String SET_DELEGATE_H5_AREAS_ARGS_AREAS = "areas";
    public static final String SET_DELEGATE_H5_AREAS_ARGS_AREAS_HEIGHT = "height";
    public static final String SET_DELEGATE_H5_AREAS_ARGS_AREAS_WIDTH = "width";
    public static final String SET_DELEGATE_H5_AREAS_ARGS_AREAS_X = "x";
    public static final String SET_DELEGATE_H5_AREAS_ARGS_AREAS_Y = "y";
    public static final String SET_DELEGATE_H5_AREAS_NAME = "GIMSG_setDelegateH5Areas";
    public static final String SHOW_EXTRA_BROWSER_BADGE_NAME = "GIMSG_showExtraBrowserBadge";
    public static final String SHOW_INTERACTION_TASK_PANEL_ARGS_FROM = "from";
    public static final String SHOW_INTERACTION_TASK_PANEL_ARGS_FROM_CLICK = "clickBrowserBadge";
    public static final String SHOW_INTERACTION_TASK_PANEL_NAME = "GIMSG_showInteractionTaskPanel";
    public static final String UNREGISTER_MESSAGES_NAME = "GIMSG_unregisterMessages";
    public static final String WEB_VIEW_RELOAD_NAME = "GIMSG_webViewReload";

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f33911a;

    public /* synthetic */ suq(String str, JSONObject jSONObject, long j, sur.a aVar, o oVar) {
        this(str, jSONObject, j, aVar);
    }

    public static final /* synthetic */ List a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[0]) : f33911a;
    }

    /* loaded from: classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1053923434);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final suq a(String name, JSONObject jSONObject, long j, sur.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (suq) ipChange.ipc$dispatch("54e9c9ae", new Object[]{this, name, jSONObject, new Long(j), aVar});
            }
            q.d(name, "name");
            com.taobao.tab2interact.core.utils.a.b(this, "InteractMessage", "解析互动消息实体，name=" + name + "，args=" + jSONObject + "，timestamp=" + j);
            if (!a(name)) {
                com.taobao.tab2interact.core.utils.a.b(this, "InteractMessage", "解析互动消息实体，非互动消息名");
                return null;
            }
            return new suq(name, jSONObject, j, aVar, null);
        }

        public final suq a(JSONObject messageJSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (suq) ipChange.ipc$dispatch("2906dd8f", new Object[]{this, messageJSONObject});
            }
            q.d(messageJSONObject, "messageJSONObject");
            com.taobao.tab2interact.core.utils.a.b(this, "InteractMessage", "解析互动消息实体，messageJSONObject=" + messageJSONObject);
            Object obj = messageJSONObject.get("name");
            Object obj2 = messageJSONObject.get("args");
            Object obj3 = messageJSONObject.get("timestamp");
            if (!(obj instanceof String) || ((!(obj2 instanceof JSONObject) && obj2 != null) || !(obj3 instanceof Long))) {
                com.taobao.tab2interact.core.utils.a.b(this, "InteractMessage", "解析互动消息实体，messageJSONObject参数无效");
                return null;
            }
            return a((String) obj, (JSONObject) obj2, ((Number) obj3).longValue(), null);
        }

        public final boolean a(String name) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, name})).booleanValue();
            }
            q.d(name, "name");
            return suq.a().contains(name);
        }
    }

    private suq(String str, JSONObject jSONObject, long j, sur.a aVar) {
        super(str, jSONObject, j, "Interact", "Interact", aVar);
    }

    static {
        kge.a(1344229282);
        Companion = new a(null);
        f33911a = p.b(GET_INTERACT_REMOTE_CONFIG_NAME, INTERACT_REMOTE_CONFIG_CHANGE_NAME, GET_INTERACT_LOCAL_CONFIG_NAME, SET_DELEGATE_H5_AREAS_NAME, WEB_VIEW_RELOAD_NAME, REGISTER_MESSAGES_NAME, UNREGISTER_MESSAGES_NAME, SHOW_EXTRA_BROWSER_BADGE_NAME, HIDE_EXTRA_BROWSER_BADGE_NAME, INTERACTION_NEW_USER_UPGRADED_NAME, SHOW_INTERACTION_TASK_PANEL_NAME, BROWSER_BADGE_COUNTDOWN_FINISHED_NAME, IS_SHOW_EXTRA_BROWSER_BADGE_NAME, IS_INTERACTION_NEW_USER_UPGRADED_NAME, IS_SHOW_INTERACTION_TASK_PANEL_NAME, IS_BROWSER_BADGE_COUNTDOWN_FINISHED_NAME, REFRESH_BROWSER_BADGE_DATA_NAME, H5_INTERACTION_COMPONENT_RENDER_FINISHED_NAME, INTERACTION_TASK_COMPLETED_NAME, INTERACTION_TASK_COMPLETED_ARGS_ACCOUNT_AMOUNT, INTERACTION_NEW_USER_UPGRADE_POP_RENDERED_NAME, INTERACTION_TASK_PANEL_BROWSER_BUTTON_CLICKED_NAME, BROWSE_WITHDRAW_BUBBLE_HIDDEN_NAME, BROWSERTASK_BALANCE_UPDATE, BROWSE_TASK_STATE_CHANGE_NAME, GET_BROWSE_TASK_STATE_NAME, H5_TASK_STATE_CHANGE_NAME, NATIVE_LEFT_BUBBLE_STATE_CHANGE_NAME, GET_NATIVE_LEFT_BUBBLE_STATE_NAME);
    }
}
