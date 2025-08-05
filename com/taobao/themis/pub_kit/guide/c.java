package com.taobao.themis.pub_kit.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.basic.TMSLogger;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DISFAVOR_SUCCESS_TYPE = 2;
    public static final int FAVOR_SUCCESS_TYPE = 1;

    /* renamed from: a  reason: collision with root package name */
    public static Pair<String, String> f22789a;
    public static String b;
    public static String c;
    public static String d;

    static {
        kge.a(-911097710);
        f22789a = new Pair<>("添加成功，可在首页二楼查看", "还可以在消息中查看频道最新动态");
        b = "已取消添加";
        c = "取消添加失败，请重试";
        d = "添加失败，请重试";
    }

    public static void a(final Context context, final View view, final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d55405b", new Object[]{context, view, new Integer(i), str});
        } else if (!(context instanceof Activity) || ((Activity) context).isFinishing() || view == null) {
        } else {
            com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: com.taobao.themis.pub_kit.guide.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    int i2 = i;
                    if (i2 == 1) {
                        str2 = (String) c.f22789a.first;
                    } else if (i2 != 2) {
                        return;
                    } else {
                        str2 = c.b + str;
                    }
                    View inflate = View.inflate(context, R.layout.tms_pub_favor_change_tips_layout, null);
                    ((TextView) inflate.findViewById(R.id.title)).setText(str2);
                    Display defaultDisplay = ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    if (Build.VERSION.SDK_INT >= 17) {
                        defaultDisplay.getRealMetrics(displayMetrics);
                    } else {
                        defaultDisplay.getMetrics(displayMetrics);
                    }
                    defaultDisplay.getMetrics(new DisplayMetrics());
                    final PopupWindow popupWindow = new PopupWindow(context);
                    popupWindow.setContentView(inflate);
                    popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                    popupWindow.setOutsideTouchable(true);
                    popupWindow.setFocusable(false);
                    popupWindow.setClippingEnabled(false);
                    popupWindow.setHeight(-2);
                    popupWindow.setWidth(-2);
                    inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.themis.pub_kit.guide.c.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                            } else if (!popupWindow.isShowing()) {
                            } else {
                                popupWindow.dismiss();
                            }
                        }
                    });
                    try {
                        popupWindow.showAtLocation(view, 81, 0, displayMetrics.heightPixels / 10);
                        com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: com.taobao.themis.pub_kit.guide.c.1.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (!popupWindow.isShowing()) {
                                } else {
                                    popupWindow.dismiss();
                                }
                            }
                        }, 3000L);
                    } catch (Exception e) {
                        TMSLogger.b("PubFavorChangeToast", "showFavorSuccessWindow: failed with exception ", e);
                    }
                }
            });
        }
    }

    public static void a(final Context context, final View view, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8935e9bc", new Object[]{context, view, str});
        } else if (view == null || context == null) {
        } else {
            com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: com.taobao.themis.pub_kit.guide.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Rect rect = new Rect();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).getGlobalVisibleRect(rect);
                    }
                    Rect rect2 = new Rect();
                    Context context2 = context;
                    if (context2 instanceof Activity) {
                        ((Activity) context2).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                    }
                    int i = rect2.top;
                    Toast makeText = Toast.makeText(context.getApplicationContext(), str, 0);
                    Point point = new Point();
                    View view2 = makeText.getView();
                    if (view2 == null) {
                        return;
                    }
                    ((WindowManager) view2.getContext().getApplicationContext().getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getSize(point);
                    makeText.getView().setBackgroundResource(R.drawable.tms_pub_favor_toast_background);
                    try {
                        ((TextView) makeText.getView().findViewById(16908299)).setTextColor(-1);
                    } catch (Exception e) {
                        TMSLogger.b("PubFavorChangeToast", "toast: ", e);
                    }
                    makeText.setGravity(48, 0, rect.bottom - i);
                    makeText.show();
                }
            });
        }
    }
}
