package tb;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;

/* loaded from: classes9.dex */
public class qop {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void a(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628634d8", new Object[]{activity, view});
        } else {
            b(activity, view);
        }
    }

    public static void a(final Activity activity, String str, String str2, String str3, String str4, String str5, String str6, final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9334a086", new Object[]{activity, str, str2, str3, str4, str5, str6, bridgeCallback});
        } else if (activity == null || activity.isFinishing()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = ILocalizationService.CONFIRM;
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: tb.qop.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    if (dialogInterface != null && !activity.isFinishing()) {
                        dialogInterface.dismiss();
                    }
                    bridgeCallback.sendBridgeResponse(null);
                }
            };
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                TMSLogger.c("DialogAbility", "empty title and message");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            if (!TextUtils.isEmpty(str)) {
                builder.setTitle(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.setMessage(str2);
            }
            builder.setPositiveButton(str3, onClickListener);
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            if (create == null) {
                return;
            }
            create.show();
        }
    }

    public static void a(final Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("535d66fc", new Object[]{activity, str, str2, str3, str4, str5, str6, str7, bridgeCallback});
        } else if (activity == null || activity.isFinishing()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = ILocalizationService.CONFIRM;
            }
            if (TextUtils.isEmpty(str4)) {
                str4 = ILocalizationService.CANCEL;
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: tb.qop.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    if (dialogInterface != null && !activity.isFinishing()) {
                        dialogInterface.dismiss();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ok", (Object) true);
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            };
            DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() { // from class: tb.qop.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    if (dialogInterface != null && !activity.isFinishing()) {
                        dialogInterface.dismiss();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ok", (Object) false);
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            };
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                TMSLogger.c("DialogAbility", "empty title and message");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            if (!TextUtils.isEmpty(str)) {
                builder.setTitle(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.setMessage(str2);
            }
            builder.setPositiveButton(str3, onClickListener);
            builder.setNegativeButton(str4, onClickListener2);
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            if (create == null) {
                return;
            }
            create.show();
        }
    }

    public static void b(final Activity activity, String str, String str2, String str3, String str4, String str5, String str6, String str7, final BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ab8ddb", new Object[]{activity, str, str2, str3, str4, str5, str6, str7, bridgeCallback});
        } else if (activity == null || activity.isFinishing()) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else {
            String str8 = TextUtils.isEmpty(str3) ? ILocalizationService.CONFIRM : str3;
            String str9 = TextUtils.isEmpty(str4) ? ILocalizationService.CANCEL : str4;
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                TMSLogger.c("DialogAbility", "empty title and message");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            final EditText editText = new EditText(activity);
            if (!TextUtils.isEmpty(str)) {
                builder.setTitle(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                builder.setMessage(str2);
            }
            builder.setPositiveButton(str8, new DialogInterface.OnClickListener() { // from class: tb.qop.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    Activity activity2 = activity;
                    qop.a(activity2, activity2.getWindow().getDecorView());
                    String obj = editText.getText().toString();
                    if (dialogInterface != null && !activity.isFinishing()) {
                        dialogInterface.dismiss();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("inputValue", (Object) obj);
                    jSONObject.put("ok", (Object) true);
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            });
            builder.setNegativeButton(str9, new DialogInterface.OnClickListener() { // from class: tb.qop.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    Activity activity2 = activity;
                    qop.a(activity2, activity2.getWindow().getDecorView());
                    if (dialogInterface != null && !activity.isFinishing()) {
                        dialogInterface.dismiss();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("inputValue", (Object) "");
                    jSONObject.put("ok", (Object) false);
                    bridgeCallback.sendJSONResponse(jSONObject);
                }
            });
            builder.setCancelable(false);
            AlertDialog create = builder.create();
            create.setView(editText, a(activity, 15), 0, a(activity, 15), 0);
            create.show();
        }
    }

    private static void b(Activity activity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfdc277", new Object[]{activity, view});
            return;
        }
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (inputMethodManager == null) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Throwable th) {
            TMSLogger.b("DialogAbility", "hideKeyboard exception!", th);
        }
    }

    private static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue();
        }
        if (context != null) {
            return (int) (i * context.getResources().getDisplayMetrics().density);
        }
        return 0;
    }
}
