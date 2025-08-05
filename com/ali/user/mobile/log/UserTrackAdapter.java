package com.ali.user.mobile.log;

import android.app.Activity;
import android.util.Log;
import com.ali.user.mobile.app.constant.UTConstant;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.UserTrackService;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Properties;
import tb.kge;

/* loaded from: classes2.dex */
public class UserTrackAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean DEBUG;
    private static final String TAG;

    static {
        kge.a(-2090028126);
        boolean isDebug = Debuggable.isDebug();
        DEBUG = isDebug;
        TAG = isDebug ? "login.UserTrackAdapter" : UserTrackAdapter.class.getSimpleName();
    }

    public static void sendUT(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c7ab78", new Object[]{str});
        } else {
            sendUT(UTConstant.PageName.UT_PAGE_EXTEND, str, null);
        }
    }

    public static void sendUT(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf5e742", new Object[]{str, str2});
        } else {
            sendUT(str, str2, null);
        }
    }

    public static void sendExtendUT(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1022a3fc", new Object[]{str, str2});
        } else {
            sendUT(UTConstant.PageName.UT_PAGE_EXTEND, str, str2, null);
        }
    }

    public static void sendExtendUT(String str, String str2, String str3, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b633942", new Object[]{str, str2, str3, properties});
        } else {
            sendUT(UTConstant.PageName.UT_PAGE_EXTEND, str, str2, str3, properties);
        }
    }

    public static void sendUT(String str, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca72c74", new Object[]{str, properties});
        } else {
            sendUT(UTConstant.PageName.UT_PAGE_EXTEND, str, properties);
        }
    }

    public static void sendUT(String str, String str2, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ca14be", new Object[]{str, str2, properties});
        } else {
            sendUT(str, str2, null, properties);
        }
    }

    public static void sendUT(String str, String str2, String str3, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6433e88", new Object[]{str, str2, str3, properties});
        } else {
            sendUT(str, str2, str3, null, properties);
        }
    }

    public static void sendUT(String str, String str2, String str3, String str4, Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9549d2", new Object[]{str, str2, str3, str4, properties});
            return;
        }
        try {
            if (getUserTrackService() == null) {
                return;
            }
            getUserTrackService().sendUT(str, str2, str3, str4, properties);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void sendUserTrack(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5264f72", new Object[]{str, str2, map});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendUserTrack(str, str2, map);
        }
    }

    public static void sendControlUT(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9c9742f", new Object[]{str, str2});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendControlUT(str, str2);
        }
    }

    public static void sendControlUT(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e19039", new Object[]{str, str2, str3});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendControlUT(str, str2, str3);
        }
    }

    public static void control(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164e0d03", new Object[]{str, str2, str3, map});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendControlUT(str, str2, str3, null, map);
        }
    }

    public static void control(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1cb279", new Object[]{str, str2, str3, str4, map});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendControlUT(str, str2, str3, str4, map);
        }
    }

    public static void control(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f357d60d", new Object[]{str, str2, map});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendControlUT(str, str2, null, null, map);
        }
    }

    public static void control(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd654678", new Object[]{str, str2});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendControlUT(str, str2, null, null, null);
        }
    }

    public static void UIShown(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9467f8", new Object[]{str, str2});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().UIShown(str, str2);
        }
    }

    public static void sendControlUT(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d98b22c", new Object[]{str, str2, str3, map});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendControlUT(str, str2, str3, map);
        }
    }

    public static void sendControlUT(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431bf62", new Object[]{str, str2, str3, str4, map});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().sendControlUT(str, str2, str3, str4, map);
        }
    }

    public static void skipPage(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd3613c7", new Object[]{activity});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().skipPage(activity);
        }
    }

    public static void pageDisAppear(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7fccd8d", new Object[]{activity});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().pageDisAppear(activity);
        }
    }

    public static void updatePageName(Activity activity, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d91b77f", new Object[]{activity, str, map});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().updatePageName(activity, str, map);
        }
    }

    public static void updatePageName(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca06ef46", new Object[]{activity, str});
        } else if (getUserTrackService() == null) {
        } else {
            getUserTrackService().updatePageName(activity, str, null);
        }
    }

    private static UserTrackService getUserTrackService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserTrackService) ipChange.ipc$dispatch("bfdc239c", new Object[0]);
        }
        UserTrackService userTrackService = (UserTrackService) ServiceFactory.getService(UserTrackService.class);
        if (userTrackService == null && DEBUG) {
            Log.e(TAG, "UserTrackService is null!");
        }
        return userTrackService;
    }
}
