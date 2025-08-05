package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lgt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String B_FACE_TAB_CONTROLLER_NOT_INIT = "BFaceTabControllerNotInit";
    public static final String FAILURE_FEATURE_TYPE = "outLinkProcess";
    public static final String HOME_PAGE_VIEW_NOT_CREATE = "homePageViewNotCreate";
    public static final String LEAVE_HOME_PAGE = "leaveHomePage";
    public static final String MAIN_BIZ_NAME = "Page_Home_OuterLink";
    public static final String NULL_RECOMMEND_PARAMS = "nullRecmdParams";
    public static final String OUT_LINK_PARSE_PARAMS_END = "outLinkParseParamsEnd";
    public static final String OUT_LINK_PROCESS_END = "outLinkProcessEnd";
    public static final String OUT_LINK_PROCESS_START = "outLinkProcessStart";
    public static final String OUT_LINK_SUCCESS_FEATURE_TYPE = "outLinkScrollToBFaceEnd";
    public static final String OUT_LINK_TRIGGER = "outLinkTrigger";
    public static final String SCROLL_TO_B_FACE = "scrollTo_BFace";
    public static final String SCROLL_TO_RECOMMEND = "scrollTo_recmd";
    public static final String SCROLL_TO_RECOMMEND_ERROR_CODE = "notFoundInfoFlowCardStartBizCode";
    public static final String SCROLL_TO_RECOMMEND_WITH_REQUEST = "scrollTo_recmdWithRequest";
    public static final String SCROLL_TO_SECOND_FLOOR = "scrollTo_secondFloor";
    public static final String TAG_VERSION = "2.0";
    public static final String TRIGGER_FULL_REQUEST = "triggerFullRequest";

    static {
        kge.a(-430227052);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            ldk.a(str, str2, "2.0", MAIN_BIZ_NAME, null, null);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            ldk.a(FAILURE_FEATURE_TYPE, str, "2.0", MAIN_BIZ_NAME, null, null, str2, null);
        }
    }
}
