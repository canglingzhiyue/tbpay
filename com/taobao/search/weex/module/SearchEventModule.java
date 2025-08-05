package com.taobao.search.weex.module;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.search.common.util.q;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.j;
import com.taobao.search.sf.o;
import com.taobao.search.sf.weex.module.a;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXRenderStrategy;
import com.ut.mini.l;
import tb.jyx;
import tb.kge;

/* loaded from: classes8.dex */
public class SearchEventModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "searchEvent";
    private static final String TAG = "SearchEventModule";
    private a bizImpl = new a();

    static {
        kge.a(-313305419);
    }

    public static /* synthetic */ Object ipc$super(SearchEventModule searchEventModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @JSMethod(uiThread = true)
    public void clickAuction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2af08e", new Object[]{this, jSONObject});
        }
    }

    @JSMethod(uiThread = true)
    public void search(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626126a1", new Object[]{this, jSONObject});
        } else if (!(this.mWXSDKInstance instanceof d)) {
        } else {
            this.bizImpl.a(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void searchOption(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d5792c", new Object[]{this, jSONObject});
        } else if (!(this.mWXSDKInstance instanceof d)) {
        } else {
            this.bizImpl.b(this.mWXSDKInstance, this.mWXSDKInstance.O(), jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void utClickLog(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686053ce", new Object[]{this, jSONObject});
        } else {
            a.a(jSONObject);
        }
    }

    @JSMethod(uiThread = true)
    public void jumpToTab(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd53f3d", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            q.b(TAG, "options参数为空");
        } else if (this.mWXSDKInstance == null || !(this.mWXSDKInstance.O() instanceof BaseResultActivity)) {
        } else {
            ((BaseResultActivity) this.mWXSDKInstance.O()).b("jumpToTab", jSONObject, null, null);
        }
    }

    @JSMethod(uiThread = true)
    public void popSearchDoor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed5fae", new Object[]{this});
            return;
        }
        Context O = this.mWXSDKInstance.O();
        if (!(O instanceof SearchDoorActivity)) {
            return;
        }
        ((SearchDoorActivity) O).finish();
    }

    @JSMethod(uiThread = true)
    public void searchDoorHideSoftInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9524414f", new Object[]{this});
            return;
        }
        Context O = this.mWXSDKInstance.O();
        if (!(O instanceof Activity)) {
            q.b(TAG, "无法获取到当前activity");
        }
        ((InputMethodManager) O.getSystemService("input_method")).hideSoftInputFromWindow(((Activity) O).getWindow().getDecorView().getWindowToken(), 0);
    }

    @JSMethod(uiThread = true)
    public void goToSrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b286da9b", new Object[]{this, jSONObject});
        } else {
            postEvent("goToSrp", jSONObject);
        }
    }

    @JSMethod
    public void commitAppmonitorAvailableJSError(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("904dd6e3", new Object[]{this, jSONObject});
            return;
        }
        o.a(j.f19452a).a().a(jSONObject.getString("tItemType"), jSONObject.getString(jyx.DIMENSION_JSVERSION), l.getInstance().getCurrentPageName(), 2.0d, jSONObject.getString("errorMsg"), this.mWXSDKInstance.L() == WXRenderStrategy.DATA_RENDER_BINARY);
    }

    @JSMethod
    public void requestCompassWithParams(JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587f4e5a", new Object[]{this, jSONObject, jSCallback, jSCallback2});
        } else if (jSONObject == null || jSCallback == null) {
        } else {
            jSCallback.invoke(new JSONObject());
        }
    }

    private boolean checkInstanceAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4fbe5817", new Object[]{this})).booleanValue();
        }
        if (this.mWXSDKInstance instanceof d) {
            return true;
        }
        q.b(TAG, "当前实例不是NxWeexInstance，不能使用该module");
        return false;
    }

    private void postEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3afb65", new Object[]{this, str, jSONObject});
        } else if (TextUtils.isEmpty(str)) {
            q.b(TAG, "event为空");
        } else if (!checkInstanceAvailable()) {
            q.b(TAG, str + ": instance不支持");
        } else {
            d.a a2 = ((d) this.mWXSDKInstance).a();
            if (a2 == null) {
                q.b(TAG, str + ": eventListener为空");
                return;
            }
            a2.a(str, jSONObject, null, null);
        }
    }
}
