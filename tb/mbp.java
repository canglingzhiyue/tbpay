package tb;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.linkmanager.AfcLifeCycleCenter;
import com.taobao.linkmanager.afc.utils.TFCCommonUtils;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.mbf;

/* loaded from: classes7.dex */
public class mbp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f31026a = new AtomicBoolean(false);
    private final List<a> b = new CopyOnWriteArrayList();

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final mbp f31032a;

        static {
            kge.a(100418988);
            f31032a = new mbp();
        }

        public static /* synthetic */ mbp a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mbp) ipChange.ipc$dispatch("f07af03", new Object[0]) : f31032a;
        }
    }

    static {
        kge.a(1409511129);
    }

    public static /* synthetic */ List a(mbp mbpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a248b52a", new Object[]{mbpVar}) : mbpVar.b;
    }

    public static /* synthetic */ AtomicBoolean b(mbp mbpVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("de6531be", new Object[]{mbpVar}) : mbpVar.f31026a;
    }

    public static mbp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mbp) ipChange.ipc$dispatch("f07af03", new Object[0]) : b.a();
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f31031a;
        private final int b;
        private final mbf.a c;
        private final Map<String, String> d;

        static {
            kge.a(1734501593);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ade6a040", new Object[]{aVar}) : aVar.f31031a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f9a78a94", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ Map c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f2add397", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ mbf.a d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mbf.a) ipChange.ipc$dispatch("19713d5", new Object[]{aVar}) : aVar.c;
        }

        public a(String str, int i, Map<String, String> map, mbf.a aVar) {
            this.f31031a = str;
            this.b = i;
            this.d = map;
            this.c = aVar;
        }
    }

    public synchronized boolean a(Uri uri, String str, String str2, int i, mbf.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("238cddb6", new Object[]{this, uri, str, str2, new Integer(i), aVar})).booleanValue();
        }
        c.a("linkx", "DialogController.showConfirmDialog.");
        final HashMap hashMap = new HashMap();
        hashMap.put("scheme", uri != null ? String.valueOf(uri.getScheme()) : "");
        hashMap.put("host", uri != null ? String.valueOf(uri.getHost()) : "");
        hashMap.put("url", uri != null ? uri.toString() : "");
        Activity currentActivity = AfcLifeCycleCenter.instance().getCurrentActivity();
        if (currentActivity == null) {
            c.a("linkx", "DialogController.showConfirmDialog.topActivity=null.pass.");
            com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str, String.valueOf(i), hashMap);
            return true;
        }
        c.a("linkx", "DialogController.showConfirmDialog.topActivity=" + currentActivity.getComponentName());
        final Dialog dialog = new Dialog(currentActivity);
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window == null) {
            c.a("linkx", "DialogController.showConfirmDialog.window=null.pass.");
            com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", str, String.valueOf(i), hashMap);
            return true;
        }
        this.b.add(new a(str, i, hashMap, aVar));
        if (this.f31026a.compareAndSet(false, true)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            View inflate = View.inflate(currentActivity, R.layout.flout_confirm_dialog, null);
            dialog.setContentView(inflate);
            dialog.setCanceledOnTouchOutside(false);
            inflate.findViewById(R.id.confirm_yes).setOnClickListener(new View.OnClickListener() { // from class: tb.mbp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    c.a("linkx", "DialogController.showConfirmDialog.onClick.允许跳出");
                    for (a aVar2 : mbp.a(mbp.this)) {
                        if (aVar2 != null) {
                            com.taobao.flowcustoms.afc.utils.b.a("flow_out_success", a.a(aVar2), String.valueOf(a.b(aVar2)), a.c(aVar2));
                            com.taobao.flowcustoms.afc.utils.b.a("flow_out_alert_ok", a.a(aVar2), String.valueOf(a.b(aVar2)), a.c(aVar2));
                            a.d(aVar2).a(true);
                        }
                    }
                    dialog.dismiss();
                }
            });
            inflate.findViewById(R.id.confirm_no).setOnClickListener(new View.OnClickListener() { // from class: tb.mbp.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        dialog.cancel();
                    }
                }
            });
            if (!TextUtils.isEmpty(str2)) {
                String string = Globals.getApplication().getResources().getString(R.string.afc_flout_toast);
                if (!TextUtils.isEmpty(string)) {
                    ((TextView) inflate.findViewById(R.id.confirm_title)).setText(string + str2);
                }
            }
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: tb.mbp.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                        return;
                    }
                    c.a("linkx", "DialogController.showConfirmDialog.onClick.拒绝跳出");
                    for (a aVar2 : mbp.a(mbp.this)) {
                        if (aVar2 != null) {
                            com.taobao.flowcustoms.afc.utils.b.a("flow_out_alert_cancel", a.a(aVar2), String.valueOf(a.b(aVar2)), a.c(aVar2));
                            hashMap.put("type", "cancel");
                            com.taobao.flowcustoms.afc.utils.b.a("flow_out_fail", a.a(aVar2), String.valueOf(a.b(aVar2)), a.c(aVar2));
                            a.d(aVar2).a(false);
                        }
                    }
                }
            });
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: tb.mbp.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    c.a("linkx", "DialogController.showConfirmDialog.onDismiss");
                    mbp.b(mbp.this).set(false);
                    mbp.a(mbp.this).clear();
                }
            });
            dialog.show();
            window.setLayout((int) TFCCommonUtils.a(290.0f), -2);
            com.taobao.flowcustoms.afc.utils.b.a("flow_out_show_alert", str, String.valueOf(i), hashMap);
        }
        return false;
    }
}
