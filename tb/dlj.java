package tb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.utils.c;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class dlj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Dialog> f26833a;
    private dlt b = null;

    static {
        kge.a(1080688555);
    }

    public static /* synthetic */ dlt a(dlj dljVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlt) ipChange.ipc$dispatch("bd9efa4", new Object[]{dljVar}) : dljVar.b;
    }

    public void a(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5396921", new Object[]{this, dialog});
        } else {
            this.f26833a = new WeakReference<>(dialog);
        }
    }

    public Dialog a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("28547927", new Object[]{this});
        }
        WeakReference<Dialog> weakReference = this.f26833a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e7fbd6", new Object[]{this, str, context});
            return;
        }
        View inflate = View.inflate(context, R.layout.ability_kit_loading, null);
        if (!TextUtils.isEmpty(str)) {
            ((TextView) inflate.findViewById(R.id.mega_loading_text)).setText(str);
        }
        a(inflate, context);
    }

    public void a(final JSONObject jSONObject, final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefc1940", new Object[]{this, jSONObject, context});
            return;
        }
        this.b = dlb.d();
        if (this.b == null || dmr.g()) {
            a(jSONObject.getString("message"), context);
        } else {
            this.b.a("loading", jSONObject, context, new dls() { // from class: tb.dlj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dls
                public void onEvent(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9589844c", new Object[]{this, str});
                    }
                }

                @Override // tb.dls
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                        return;
                    }
                    FrameLayout frameLayout = new FrameLayout(context);
                    if (view.getLayoutParams() != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
                        layoutParams.gravity = 17;
                        view.setLayoutParams(layoutParams);
                    } else {
                        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    frameLayout.addView(view);
                    dlj.this.a(frameLayout, context);
                }

                @Override // tb.dls
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    View inflate = View.inflate(context, R.layout.ability_kit_loading, null);
                    String string = jSONObject.getString("message");
                    if (!TextUtils.isEmpty(string)) {
                        ((TextView) inflate.findViewById(R.id.mega_loading_text)).setText(string);
                    }
                    dlj.this.a(inflate, context);
                }
            });
        }
    }

    public void a(View view, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597e739e", new Object[]{this, view, context});
            return;
        }
        try {
            boolean l = dmr.l();
            final Dialog dialog = new Dialog(context, R.style.Dialog_Status_Container);
            dialog.setContentView(view);
            Window window = dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = -1;
            attributes.height = -1;
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            if (!l) {
                b();
                dialog.setCancelable(false);
            }
            int a2 = a(context);
            int c = dms.c(context);
            int i = a2 - c;
            if (a2 > 0 && c > 0 && i > 0) {
                dialog.getWindow().setLayout(-1, i);
            }
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tb.dlj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                    } else if (dialogInterface == null) {
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            });
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tb.dlj.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    Dialog dialog2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                    } else if (dlj.a(dlj.this) == null || dmr.g() || (dialog2 = dialog) == null) {
                    } else {
                        try {
                            Context context2 = dialog2.getContext();
                            if (context2 instanceof ContextThemeWrapper) {
                                dlj.a(dlj.this).a(((ContextThemeWrapper) context2).getBaseContext());
                            } else {
                                dlj.a(dlj.this).a(context2);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
            dialog.show();
            a(dialog);
        } catch (Throwable th) {
            c cVar = c.INSTANCE;
            cVar.a("AbilityKit", "showLoading error = " + th);
        }
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Dialog a2 = a();
        if (a2 == null) {
            return;
        }
        try {
            if (!a2.isShowing()) {
                return;
            }
            a2.dismiss();
        } catch (Throwable th) {
            c cVar = c.INSTANCE;
            cVar.a("AbilityKit", "hideLoading error = " + th);
        }
    }
}
