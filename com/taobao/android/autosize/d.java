package com.taobao.android.autosize;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.config.a;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;
import tb.hun;
import tb.scq;
import tb.scs;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
        } else if (a(context, null, intent, -1, false)) {
        } else {
            context.startActivity(intent);
        }
    }

    public static void a(Activity activity, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5695c26c", new Object[]{activity, intent, new Integer(i)});
        } else if (a(activity, null, intent, i, true)) {
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static void a(Fragment fragment, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8424b8dc", new Object[]{fragment, intent, new Integer(i)});
        } else if (a(fragment.getActivity(), fragment, intent, i, true)) {
        } else {
            fragment.startActivityForResult(intent, i);
        }
    }

    public static boolean a(Context context, Fragment fragment, Intent intent, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6a8c284", new Object[]{context, fragment, intent, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        if (!l.d(context) && !l.b(context)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. isFoldDevice=" + l.d(context) + " isTablet=" + l.b(context));
            return false;
        } else if (a.a().j() && l.d(context)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. Orange force all activity to open in full screen on fold device.");
            return false;
        } else if (a.a().k() && l.b(context)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. Orange force all activity to open in full screen on tablet device.");
            return false;
        } else if (a.a().i()) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. Orange force all activity to open in full screen.");
            return false;
        } else if (l.b(a(context, fragment))) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. isEasyGoOpen=true, fromActivity=" + a(context, fragment));
            return false;
        } else if (intent.getBooleanExtra("from_browser", false)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. from_browser=true, fromActivity=" + a(context, fragment));
            return false;
        } else if (context.getSharedPreferences(a(context.getPackageName()), 0).getBoolean("fullScreenOpenView", false)) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. Users set the page in Settings to open in full screen.");
            return false;
        } else {
            ComponentName b = b(context, intent);
            if (b != null && !StringUtils.isEmpty(b.getPackageName()) && !StringUtils.equals(b.getPackageName(), a(context))) {
                TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. jump other app, packageName = " + b.getPackageName());
                return false;
            }
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(com.taobao.android.detail.ttdetail.utils.e.LARGE_SCREEN_STYLE_KEY);
                if ("fullscreen".equals(queryParameter)) {
                    TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. The url carries large screen parameters.");
                    return false;
                } else if ("split".equals(queryParameter)) {
                    a(context, fragment, intent, b, i, z);
                    return true;
                }
            }
            if (data != null && hun.a().a(context, data)) {
                TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. The url is required by orange to be opened on a large screen.");
                return false;
            } else if (hun.a().a(context, b)) {
                TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open fail. The component is required by orange to be opened on a large screen.");
                return false;
            } else {
                a(context, fragment, intent, b, i, z);
                return true;
            }
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String userId = Login.getUserId();
        return StringUtils.isEmpty(userId) ? str.concat("_NotLogin") : str.concat("_").concat(userId);
    }

    private static ComponentName b(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComponentName) ipChange.ipc$dispatch("bcd6ff5b", new Object[]{context, intent});
        }
        try {
            ComponentName component = intent.getComponent();
            return component != null ? component : intent.resolveActivity(context.getPackageManager());
        } catch (Exception e) {
            TLog.loge("TBAutoSize.ActivityRoutePadCompat", "getComponent: ", e);
            return null;
        }
    }

    private static Activity a(Context context, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("3ca86996", new Object[]{context, fragment});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (fragment != null && fragment.getActivity() != null) {
            return fragment.getActivity();
        }
        return null;
    }

    private static void a(Context context, Fragment fragment, Intent intent, ComponentName componentName, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4817eab1", new Object[]{context, fragment, intent, componentName, new Integer(i), new Boolean(z)});
            return;
        }
        if (i >= 0 || z) {
            intent.putExtra("stdPopShowWithCode", i);
        }
        a(intent.getData(), intent);
        a(intent, componentName);
        TLog.loge("TBAutoSize.ActivityRoutePadCompat", "Pad pop mode pae open success. stdPopShowWithCode=" + i + ", stdPopModal=" + intent.getBooleanExtra("stdPopModal", false) + ", stdPopRecreateOnSysChanged=" + intent.getBooleanExtra("stdPopRecreateOnSysChanged", false));
        if (fragment != null) {
            scs.a(context, intent, fragment, new scq() { // from class: com.taobao.android.autosize.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.scq
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    }
                }

                @Override // tb.scq
                public void b(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
                    }
                }
            });
        } else {
            scs.a(context, intent, new scq() { // from class: com.taobao.android.autosize.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.scq
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    }
                }

                @Override // tb.scq
                public void b(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
                    }
                }
            });
        }
    }

    private static void a(Uri uri, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec32209c", new Object[]{uri, intent});
        } else if (uri == null) {
            intent.putExtra("stdPopModal", true);
        } else {
            String queryParameter = uri.getQueryParameter("largescreenmask");
            if ("true".equals(queryParameter)) {
                intent.putExtra("stdPopModal", true);
            } else if ("false".equals(queryParameter)) {
                intent.putExtra("stdPopModal", false);
            } else {
                intent.putExtra("stdPopModal", true);
            }
        }
    }

    private static void a(Intent intent, ComponentName componentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ae55aa", new Object[]{intent, componentName});
        } else if (intent == null || componentName == null || !"com.taobao.android.detail.wrapper.activity.DetailActivity".equals(componentName.getClassName())) {
        } else {
            intent.putExtra("stdPopRecreateOnSysChanged", true);
        }
    }

    private static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context != null) {
            return context.getPackageName();
        }
        return null;
    }
}
