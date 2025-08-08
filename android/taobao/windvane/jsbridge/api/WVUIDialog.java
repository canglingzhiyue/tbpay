package android.taobao.windvane.jsbridge.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.weex.weex.i;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUIDialog extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUIDialog";
    private String _index;
    private String identifier;
    private WVCallBackContext mCallback = null;
    private String okBtnText = "";
    private String cancelBtnText = "";
    public DialogInterface.OnClickListener confirmClickListener = new DialogInterface.OnClickListener() { // from class: android.taobao.windvane.jsbridge.api.WVUIDialog.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            r rVar = new r();
            String access$000 = i == -1 ? WVUIDialog.access$000(WVUIDialog.this) : i == -2 ? WVUIDialog.access$100(WVUIDialog.this) : "";
            rVar.a("type", access$000);
            rVar.a(i.INDEX_KEY, WVUIDialog.access$200(WVUIDialog.this));
            if (m.a()) {
                m.b(WVUIDialog.TAG, "click: " + access$000);
            }
            rVar.b();
            if (WVUIDialog.access$300(WVUIDialog.this) == null) {
                return;
            }
            WVUIDialog.access$300(WVUIDialog.this).fireEvent("wv.dialog", rVar.d());
            WVUIDialog.access$300(WVUIDialog.this).success(rVar);
        }
    };

    static {
        kge.a(349615433);
    }

    public static /* synthetic */ String access$000(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e08ced7f", new Object[]{wVUIDialog}) : wVUIDialog.okBtnText;
    }

    public static /* synthetic */ String access$100(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a798d480", new Object[]{wVUIDialog}) : wVUIDialog.cancelBtnText;
    }

    public static /* synthetic */ String access$200(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ea4bb81", new Object[]{wVUIDialog}) : wVUIDialog._index;
    }

    public static /* synthetic */ WVCallBackContext access$300(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("48ccaf75", new Object[]{wVUIDialog}) : wVUIDialog.mCallback;
    }

    public static /* synthetic */ String access$400(WVUIDialog wVUIDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fcbc8983", new Object[]{wVUIDialog}) : wVUIDialog.identifier;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (this.mContext instanceof Activity) {
            this.mCallback = wVCallBackContext;
            if ("alert".equals(str)) {
                alert(wVCallBackContext, str2);
            } else if (!"confirm".equals(str)) {
                return false;
            } else {
                confirm(wVCallBackContext, str2);
            }
        } else {
            r rVar = new r();
            rVar.a("error", "Context must be Activity!!!");
            wVCallBackContext.error(rVar);
        }
        return true;
    }

    public synchronized void alert(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a71cd6a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                builder.setTitle(jSONObject.optString("title", "提示"));
                builder.setMessage(jSONObject.optString("message"));
                this.okBtnText = jSONObject.optString("okbutton");
                this.identifier = jSONObject.optString("identifier");
                builder.setPositiveButton(this.okBtnText, new a());
            } catch (JSONException unused) {
                m.e(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                r rVar = new r();
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return;
            }
        }
        this.mCallback = wVCallBackContext;
        try {
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        } catch (Throwable unused2) {
        }
        m.b(TAG, "alert: show");
    }

    public synchronized void confirm(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6699dce", new Object[]{this, wVCallBackContext, str});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.mContext);
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                builder.setTitle(jSONObject.optString("title", ""));
                builder.setMessage(jSONObject.optString("message"));
                this.okBtnText = jSONObject.optString("okbutton");
                builder.setPositiveButton(this.okBtnText, this.confirmClickListener);
                this.cancelBtnText = jSONObject.optString("canclebutton");
                builder.setNegativeButton(this.cancelBtnText, this.confirmClickListener);
                this._index = jSONObject.optString(i.INDEX_KEY);
            } catch (JSONException unused) {
                m.e(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                r rVar = new r();
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return;
            }
        }
        this.mCallback = wVCallBackContext;
        try {
            AlertDialog create = builder.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        } catch (Throwable unused2) {
        }
        m.b(TAG, "confirm: show");
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mCallback = null;
        this.cancelBtnText = "";
        this.okBtnText = "";
    }

    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1131831797);
            kge.a(-1224357004);
        }

        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else if (WVUIDialog.access$300(WVUIDialog.this) == null) {
            } else {
                r rVar = new r();
                if (!StringUtils.isEmpty(WVUIDialog.access$400(WVUIDialog.this))) {
                    rVar.a("identifier", WVUIDialog.access$400(WVUIDialog.this));
                }
                rVar.b();
                if (WVUIDialog.access$300(WVUIDialog.this) == null) {
                    return;
                }
                WVUIDialog.access$300(WVUIDialog.this).fireEvent("WV.Event.Alert", rVar.d());
                WVUIDialog.access$300(WVUIDialog.this).success(rVar);
            }
        }
    }
}
