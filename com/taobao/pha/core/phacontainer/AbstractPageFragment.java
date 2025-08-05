package com.taobao.pha.core.phacontainer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.ui.fragment.PHABaseFragment;
import tb.kge;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public abstract class AbstractPageFragment extends PHABaseFragment implements c, e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    private long mAppInstanceId;
    public String mSubPageAppearNavigationType;
    public String mSubPageDisappearNavigationType;

    public static /* synthetic */ Object ipc$super(AbstractPageFragment abstractPageFragment, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void evaluateSourceCodeToPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103dd97c", new Object[]{this, str});
        }
    }

    static {
        kge.a(-1664078015);
        kge.a(415810824);
        kge.a(-1210681162);
        TAG = AbstractPageFragment.class.getSimpleName();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.mAppInstanceId = arguments.getLong("AppControllerInstanceId");
    }

    public AppController getAppController() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("e0095b36", new Object[]{this}) : AppController.b(this.mAppInstanceId);
    }

    public JSONObject getPageEventData(PageModel pageModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1bcfc6b6", new Object[]{this, pageModel, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        if (pageModel != null) {
            jSONObject.put("url", (Object) pageModel.getUrl());
            jSONObject.put("key", (Object) pageModel.key);
            jSONObject.put("type", (Object) (pageModel._type == null ? "web" : pageModel._type));
            if (z) {
                if (!TextUtils.isEmpty(this.mSubPageAppearNavigationType)) {
                    jSONObject.put("navigationType", (Object) this.mSubPageAppearNavigationType);
                    this.mSubPageAppearNavigationType = null;
                }
            } else if (!TextUtils.isEmpty(this.mSubPageDisappearNavigationType)) {
                jSONObject.put("navigationType", (Object) this.mSubPageDisappearNavigationType);
                this.mSubPageDisappearNavigationType = null;
            }
        }
        return jSONObject;
    }

    public void sendEventToPHAWorker(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f60e7", new Object[]{this, str, obj});
            return;
        }
        AppController appController = getAppController();
        if (appController == null) {
            ngr.b(TAG, "appController shouldn't be null");
        } else if (appController.E() != null) {
            appController.E().a(str, obj, "native", "AppWorker");
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", (Object) str);
            appController.P().a((String) null, new com.taobao.pha.core.error.a(PHAErrorType.REFERENCE_ERROR, "eventDispatcher is null", jSONObject));
        }
    }

    public void sendEventToPageView(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb0a478", new Object[]{this, str, obj, str2});
            return;
        }
        try {
            String a2 = ngn.a(str, obj, str2);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            evaluateSourceCodeToPage(a2);
        } catch (Throwable th) {
            String str3 = TAG;
            ngr.b(str3, "SendEventToPageView with error: " + th.toString());
        }
    }

    public void regulateTabBarVisibility() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b467b59e", new Object[]{this});
            return;
        }
        AppController appController = getAppController();
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof ViewPagerFragment) || !(((ViewPagerFragment) parentFragment).getCurrentFragment() instanceof LazyPageFragment) || appController == null || appController.v() == null) {
            return;
        }
        appController.v().a(0, 0);
    }

    @Override // com.taobao.pha.core.phacontainer.e
    public void setAppearNavigationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554790b6", new Object[]{this, str});
        } else {
            this.mSubPageAppearNavigationType = str;
        }
    }

    @Override // com.taobao.pha.core.phacontainer.e
    public void setDisappearNavigationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3eb080", new Object[]{this, str});
        } else {
            this.mSubPageDisappearNavigationType = str;
        }
    }
}
