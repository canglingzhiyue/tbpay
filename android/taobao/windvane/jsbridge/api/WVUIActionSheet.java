package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.weex.weex.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUIActionSheet extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUIActionSheet";
    private String _index;
    private android.taobao.windvane.view.a mPopupWindowController;
    private WVCallBackContext mCallback = null;
    private View.OnClickListener popupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.jsbridge.api.WVUIActionSheet.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            r rVar = new r();
            rVar.a("type", (String) view.getTag());
            rVar.a(i.INDEX_KEY, WVUIActionSheet.access$000(WVUIActionSheet.this));
            if (m.a()) {
                m.b(WVUIActionSheet.TAG, "ActionSheet: click: 8.5.0");
            }
            WVUIActionSheet.access$100(WVUIActionSheet.this).a(true);
            rVar.b();
            if (WVUIActionSheet.access$200(WVUIActionSheet.this) == null) {
                return;
            }
            WVUIActionSheet.access$200(WVUIActionSheet.this).success(rVar);
            WVUIActionSheet.access$200(WVUIActionSheet.this).fireEvent("wv.actionsheet", rVar.d());
        }
    };

    static {
        kge.a(1013088616);
    }

    public static /* synthetic */ String access$000(WVUIActionSheet wVUIActionSheet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("11abb722", new Object[]{wVUIActionSheet}) : wVUIActionSheet._index;
    }

    public static /* synthetic */ android.taobao.windvane.view.a access$100(WVUIActionSheet wVUIActionSheet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.taobao.windvane.view.a) ipChange.ipc$dispatch("983c5f0b", new Object[]{wVUIActionSheet}) : wVUIActionSheet.mPopupWindowController;
    }

    public static /* synthetic */ WVCallBackContext access$200(WVUIActionSheet wVUIActionSheet) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("b892efd3", new Object[]{wVUIActionSheet}) : wVUIActionSheet.mCallback;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!"show".equals(str)) {
            return false;
        }
        show(wVCallBackContext, str2);
        return true;
    }

    public synchronized void show(WVCallBackContext wVCallBackContext, String str) {
        String optString;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2dc1cb", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String[] strArr2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                optString = jSONObject.optString("title");
                this._index = jSONObject.optString(i.INDEX_KEY);
                JSONArray optJSONArray = jSONObject.optJSONArray("buttons");
                if (optJSONArray != null) {
                    if (optJSONArray.length() > 8) {
                        m.d(TAG, "WVUIDialog: ActionSheet is too long, limit 8");
                        r rVar = new r();
                        rVar.a("HY_PARAM_ERR");
                        rVar.a("msg", "ActionSheet is too long. limit 8");
                        wVCallBackContext.error(rVar);
                        return;
                    }
                    strArr2 = new String[optJSONArray.length()];
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        strArr2[i] = optJSONArray.optString(i);
                    }
                }
                strArr = strArr2;
            } catch (JSONException unused) {
                m.e(TAG, "WVUIDialog: param parse to JSON error, param=" + str);
                r rVar2 = new r();
                rVar2.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar2);
                return;
            }
        } else {
            optString = null;
            strArr = null;
        }
        this.mCallback = wVCallBackContext;
        try {
            this.mPopupWindowController = new android.taobao.windvane.view.a(this.mContext, this.mWebView.getView(), optString, strArr, this.popupClickListener);
            this.mPopupWindowController.a();
            m.b(TAG, "ActionSheet: show");
        } catch (Exception e) {
            m.d(TAG, e.getMessage());
            r rVar3 = new r();
            rVar3.a("errMsg", e.getMessage());
            wVCallBackContext.error(rVar3);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.mCallback = null;
        }
    }
}
