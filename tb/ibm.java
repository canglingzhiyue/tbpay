package tb;

import android.app.Activity;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.android.order.core.subscriber.data.OperateFields;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.android.ultron.datamodel.imp.b;
import com.taobao.android.ultron.datamodel.imp.g;
import com.taobao.android.weex_framework.util.a;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class ibm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f28893a;

    static {
        kge.a(-460885974);
    }

    public static Button a(Context context, OperateFields operateFields, int i, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("624f5a68", new Object[]{context, operateFields, new Integer(i), onClickListener});
        }
        Button button = (Button) LayoutInflater.from(context).inflate(R.layout.order_list_item_button, (ViewGroup) null);
        button.setFocusable(false);
        button.setText(operateFields.getName());
        if (onClickListener != null) {
            button.setOnClickListener(onClickListener);
        }
        button.setVisibility(0);
        button.setTag(operateFields);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, context.getResources().getDimensionPixelSize(R.dimen.operate_btn_height));
        layoutParams.leftMargin = i;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public static int a(Context context) {
        WindowManager windowManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        int i = f28893a;
        if (i != 0) {
            return i;
        }
        if (context == null || (windowManager = (WindowManager) context.getSystemService(a.ATOM_EXT_window)) == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        int i2 = point.y;
        f28893a = i2;
        return i2;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue() : ((WindowManager) context.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getHeight();
    }

    public static float c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb8e", new Object[]{context})).floatValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 2.0f;
        }
        return displayMetrics.density;
    }

    public static boolean a(List<JSONObject> list, jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f45f6f8", new Object[]{list, jnyVar})).booleanValue();
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (JSONObject jSONObject : list) {
            g gVar = new g();
            if (jnyVar instanceof b) {
                try {
                    gVar.a((b) jnyVar, jSONObject, null);
                } catch (Throwable th) {
                    iaa.a((Context) null, "ParseService-ERROR", th.toString(), (Map<String, String>) null);
                    th.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean a(jny jnyVar) {
        JSONObject z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efbcbb07", new Object[]{jnyVar})).booleanValue();
        }
        if (!bxd.d() || !(jnyVar instanceof b) || (z = ((b) jnyVar).z()) == null) {
            return false;
        }
        return Boolean.parseBoolean(z.getString("degrade"));
    }

    public static void a(String str, final ibk ibkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d42e0f0", new Object[]{str, ibkVar});
        } else {
            com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: tb.ibm.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if ((succPhenixEvent != null && succPhenixEvent.getDrawable() == null) || succPhenixEvent.isIntermediate()) {
                        ibk.this.a(new Exception(com.alibaba.ability.localization.b.a(R.string.app_load_failed)));
                        return true;
                    }
                    ibk.this.a(succPhenixEvent.getUrl(), succPhenixEvent.getDrawable().getBitmap());
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: tb.ibm.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    ibk ibkVar2 = ibk.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("加载失败，phenix fail code is ");
                    sb.append(failPhenixEvent != null ? Integer.valueOf(failPhenixEvent.getResultCode()) : "-1");
                    ibkVar2.a(new Exception(sb.toString()));
                    return true;
                }
            }).fetch();
        }
    }

    public static String a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e721362", new Object[]{str, jSONObject});
        }
        if (StringUtils.isEmpty(str) || jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && !StringUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public static int a(Activity activity) {
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (activity != null && b(activity) && (identifier = activity.getResources().getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
            return activity.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        View view = null;
        if (Build.VERSION.SDK_INT >= 21) {
            view = activity.findViewById(16908336);
        }
        return (view == null || 8 == view.getVisibility() || 4 == view.getVisibility()) ? false : true;
    }

    public static boolean a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a1860ab", new Object[]{viewGroup})).booleanValue();
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ImageView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && a((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            fxe.a(runnable);
        }
    }

    public static Intent d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("e9148136", new Object[]{context});
        }
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
        } else if (Build.VERSION.SDK_INT >= 21) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        } else if (Build.VERSION.SDK_INT == 19) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
        } else {
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        }
        return intent;
    }

    public static boolean e(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).areNotificationsEnabled();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            try {
                String packageName = context.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                return ((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static JSONObject a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8b1423", new Object[]{eVar});
        }
        Object i = eVar == null ? null : eVar.i();
        if (!(i instanceof DMEvent)) {
            return null;
        }
        return ((DMEvent) i).getFields();
    }
}
