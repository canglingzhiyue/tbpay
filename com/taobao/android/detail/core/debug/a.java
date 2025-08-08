package com.taobao.android.detail.core.debug;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.taobao.windvane.export.adapter.ILocalizationService;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int KEY_CLOSE_NEW_SKU = -1;
    public static final int KEY_MAIN_MTOP_DEFAULT = 1;
    public static final String PREFERENCES_DEBUG_TOOLS_NAME = "SKU_DebugTools";
    public static final String PREFERENCES_NEW_SKU_MODE_KEY = "sku_mode";

    public static /* synthetic */ boolean a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d511021d", new Object[]{context, str, new Integer(i)})).booleanValue() : b(context, str, i);
    }

    public static /* synthetic */ void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a588c435", new Object[]{context});
        } else {
            n(context);
        }
    }

    public static /* synthetic */ void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6356fd4", new Object[]{context});
        } else {
            p(context);
        }
    }

    static {
        kge.a(-860795351);
        emu.a("com.taobao.android.detail.core.debug.DebugTools");
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : context != null && a(context) && b(context, -1) == 0;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : context != null && a(context) && b(context, -1) == 1;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : context != null && a(context) && b(context, -1) == 2;
    }

    public static void e(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
        } else if (context == null || !a(context)) {
        } else {
            String[] strArr = {"强制NewDetail", "强制WebView引擎\n(冷起失效)"};
            int c = c(context, "new_detail_mode", 0);
            boolean o = o(context);
            boolean[] zArr = new boolean[2];
            zArr[0] = c == 1;
            zArr[1] = o;
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974393);
            builder.setTitle("Debug调试工具");
            builder.setMultiChoiceItems(strArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: com.taobao.android.detail.core.debug.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                public void onClick(DialogInterface dialogInterface, int i, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4add8c27", new Object[]{this, dialogInterface, new Integer(i), new Boolean(z)});
                    } else if (i == 0) {
                        a.a(context, "new_detail_mode", z ? 1 : 0);
                    } else if (i != 1) {
                    } else {
                        a.l(context);
                    }
                }
            });
            builder.setPositiveButton(ILocalizationService.CONFIRM, new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail.core.debug.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    }
                }
            });
            builder.show();
        }
    }

    private static void n(Context context) {
        try {
            Field declaredField = Class.forName("com.alibaba.android.ultron.engine.a").getDeclaredField("useWebViewEngine");
            declaredField.setAccessible(true);
            declaredField.set(null, true);
        } catch (Throwable unused) {
            if (context == null) {
                return;
            }
            Toast.makeText(context, "webview enable failed", 0).show();
        }
    }

    private static boolean o(Context context) {
        try {
            Field declaredField = Class.forName("com.alibaba.android.ultron.engine.a").getDeclaredField("useWebViewEngine");
            declaredField.setAccessible(true);
            return ((Boolean) declaredField.get(null)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void p(Context context) {
        try {
            Field declaredField = Class.forName("tb.jdj").getDeclaredField("mForceNewSKU");
            declaredField.setAccessible(true);
            declaredField.set(null, true);
        } catch (Throwable unused) {
            if (context == null) {
                return;
            }
            Toast.makeText(context, "h5 outer enable failed", 0).show();
        }
    }

    public static void f(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
        } else if (context == null || !a(context)) {
        } else {
            int b = b(context, -1);
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974393);
            builder.setTitle("Debug调试工具");
            builder.setSingleChoiceItems(new String[]{"全量老版SKU", "全量新版SKU\n(H5外投冷起失效)", "JSI调试SKU"}, b, new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail.core.debug.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    a.a(context, i);
                    if (i != 1) {
                        return;
                    }
                    a.m(context);
                }
            });
            builder.setPositiveButton(ILocalizationService.CONFIRM, new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail.core.debug.a.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    }
                }
            });
            builder.show();
        }
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue() : context != null && a(context) && c(context, "get_detail_interface", 1) == 1;
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue() : context != null && a(context) && c(context, "get_detail_interface", 1) == 2;
    }

    public static void i(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a382c158", new Object[]{context});
        } else if (context == null || !a(context)) {
        } else {
            int c = c(context, "get_detail_interface", 1);
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974393);
            builder.setTitle("Debug调试工具");
            builder.setSingleChoiceItems(new String[]{"线上用户模式: Orange", "强制新: data.get", "强制老: getDetail"}, c, new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail.core.debug.a.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        a.a(context, "get_detail_interface", i);
                    }
                }
            });
            builder.setPositiveButton(ILocalizationService.CONFIRM, new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail.core.debug.a.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    }
                }
            });
            builder.show();
        }
    }

    public static void j(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42f6cf7", new Object[]{context});
        } else if (context == null || !a(context)) {
        } else {
            int c = c(context, "is_final_ultron", 1);
            AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974393);
            builder.setTitle("终态协议模式");
            builder.setSingleChoiceItems(new String[]{"非终态", "终态"}, c, new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail.core.debug.a.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        a.a(context, "is_final_ultron", i);
                    }
                }
            });
            builder.setPositiveButton(ILocalizationService.CONFIRM, new DialogInterface.OnClickListener() { // from class: com.taobao.android.detail.core.debug.a.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    }
                }
            });
            builder.show();
        }
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4dc189a", new Object[]{context})).booleanValue() : context != null && a(context) && c(context, "is_final_ultron", 1) == 1;
    }

    public static boolean a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("258f9aa7", new Object[]{context, new Integer(i)})).booleanValue() : b(context, PREFERENCES_NEW_SKU_MODE_KEY, i);
    }

    private static boolean b(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d49a9c1e", new Object[]{context, str, new Integer(i)})).booleanValue();
        }
        if (context == null || StringUtils.isEmpty(str)) {
            return false;
        }
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences(PREFERENCES_DEBUG_TOOLS_NAME, 0).edit();
        edit.putInt(str, i);
        edit.apply();
        return true;
    }

    public static int b(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a7862d7", new Object[]{context, new Integer(i)})).intValue() : c(context, PREFERENCES_NEW_SKU_MODE_KEY, i);
    }

    private static int c(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d424360e", new Object[]{context, str, new Integer(i)})).intValue() : (context == null || StringUtils.isEmpty(str)) ? i : context.getApplicationContext().getSharedPreferences(PREFERENCES_DEBUG_TOOLS_NAME, 0).getInt(str, i);
    }
}
