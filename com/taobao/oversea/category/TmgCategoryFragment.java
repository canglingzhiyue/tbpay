package com.taobao.oversea.category;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.taobao.windvane.extra.uc.WVUCWebViewFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.WeexFragment;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.g;
import com.taobao.android.weex_framework.p;
import com.taobao.tao.TBBaseFragment;
import com.taobao.taobao.R;

/* loaded from: classes7.dex */
public class TmgCategoryFragment extends TBBaseFragment implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View rootView;
    private String weexUrl = "https://assets-tmw.taobao.com/app/tmall-ovs-rax/tmg-en-category/home?wh_weex=true&weex_mode=dom&wx_navbar_hidden=true&wx_navbar_transparent=true&is_loading=1&_wx_statusbar_hidden=hidden_dark_text";
    private String h5Url = "https://assets-tmw.taobao.com/app/tmall-ovs-rax/tmg-en-category/home?wx_navbar_hidden=true&wx_navbar_transparent=true&is_loading=1&disableNav=YES&_wx_statusbar_hidden=true";

    public static /* synthetic */ Object ipc$super(TmgCategoryFragment tmgCategoryFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1860817453) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
    }

    @Override // com.taobao.tao.TBBaseFragment
    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : "PAGE_OVS_CATEGORY";
    }

    @Override // com.taobao.android.weex_framework.g
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onFatalException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd71451", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onForeground(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fafc624", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onJSException(p pVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831fc52e", new Object[]{this, pVar, new Integer(i), str});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onPrepareSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9635d60b", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63c5f14", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRefreshSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd7e3df", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderSuccess(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdf238", new Object[]{this, pVar});
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    private Fragment createWeexFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("26fc5ff6", new Object[]{this});
        }
        WeexFragment weexFragment = null;
        try {
            weexFragment = WeexFragment.newInstance(this.weexUrl, this.weexUrl, null, null, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("renderMode", (Object) UltronTradeHybridInstanceRenderMode.TEXTURE);
            Bundle arguments = weexFragment.getArguments();
            if (arguments != null) {
                arguments.putString("config", jSONObject.toString());
                weexFragment.setArguments(arguments);
            }
            weexFragment.setRenderListener(this);
        } catch (Exception unused) {
        }
        return weexFragment;
    }

    private Fragment createWebFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("a6250d11", new Object[]{this});
        }
        WVUCWebViewFragment wVUCWebViewFragment = new WVUCWebViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url", this.h5Url);
        wVUCWebViewFragment.setArguments(bundle);
        return wVUCWebViewFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        getChildFragmentManager().beginTransaction().replace(R.id.rootView, createWeexFragment()).addToBackStack(null).commit();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.rootView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_tmg_discovery, viewGroup, false);
        return this.rootView;
    }

    @Override // com.taobao.android.weex_framework.g
    public void onRenderFailed(p pVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4253181b", new Object[]{this, pVar, new Integer(i), str, new Boolean(z)});
        } else {
            getChildFragmentManager().beginTransaction().replace(R.id.rootView, createWebFragment()).addToBackStack(null).commit();
        }
    }
}
