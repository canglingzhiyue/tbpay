package com.taobao.mytaobao.aura;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.aura.Container;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/mytaobao/aura/AuraFragment;", "Landroid/support/v4/app/Fragment;", "()V", "auraContainer", "Lcom/taobao/message/lab/comfrm/aura/Container;", "isFirst", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onResume", "registerService", "renderAura", "contentView", "Landroid/widget/FrameLayout;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public class AuraFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap _$_findViewCache;
    private Container auraContainer;
    private boolean isFirst = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Event build = new Event.Build("onSystemConfigurationsChanged").build();
            Container access$getAuraContainer$p = AuraFragment.access$getAuraContainer$p(AuraFragment.this);
            if (access$getAuraContainer$p == null) {
                return;
            }
            access$getAuraContainer$p.postEvent(build);
        }
    }

    static {
        kge.a(-213837411);
    }

    public static /* synthetic */ Object ipc$super(AuraFragment auraFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode != 462397159) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDestroyView();
            return null;
        }
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void registerService(Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1485a1", new Object[]{this, container});
        } else {
            q.c(container, "container");
        }
    }

    public static final /* synthetic */ Container access$getAuraContainer$p(AuraFragment auraFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Container) ipChange.ipc$dispatch("f02cff15", new Object[]{auraFragment}) : auraFragment.auraContainer;
    }

    public static final /* synthetic */ void access$setAuraContainer$p(AuraFragment auraFragment, Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e7b73d", new Object[]{auraFragment, container});
        } else {
            auraFragment.auraContainer = container;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, inflater, viewGroup, bundle});
        }
        q.c(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        renderAura(frameLayout);
        return frameLayout;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        Container container = this.auraContainer;
        if (container != null) {
            container.postEvent(new Event.Build("onDisappear").build());
        }
        Container container2 = this.auraContainer;
        if (container2 != null) {
            container2.dispose();
        }
        this.auraContainer = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    private final void renderAura(FrameLayout frameLayout) {
        String string;
        Bundle arguments;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907adba3", new Object[]{this, frameLayout});
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString(MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE)) == null || (arguments = getArguments()) == null || (string2 = arguments.getString("dxEngineBiz")) == null) {
            return;
        }
        String str = Login.getNick() + Login.getUserId();
        Bundle arguments3 = getArguments();
        Object obj = arguments3 != null ? arguments3.get("props") : null;
        if (!(obj instanceof JSONObject)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.auraContainer = new Container(requireActivity(), string, null, str, jSONObject);
        WidgetRenderImpl.RenderConfig renderConfig = new WidgetRenderImpl.RenderConfig();
        renderConfig.dxEngineBizType = string2;
        renderConfig.reUseKey = string2;
        Container container = this.auraContainer;
        if (container == null) {
            q.a();
        }
        container.setRenderConfig(renderConfig);
        Container container2 = this.auraContainer;
        if (container2 == null) {
            q.a();
        }
        registerService(container2);
        Container container3 = this.auraContainer;
        if (container3 == null) {
            q.a();
        }
        container3.postEvent(new Event.Build(StdActions.PAUSE_RENDER).build());
        Container container4 = this.auraContainer;
        if (container4 == null) {
            q.a();
        }
        container4.start(frameLayout);
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        Event build = new Event.Build("onAppear").build();
        Container container = this.auraContainer;
        if (container != null) {
            container.postEvent(build);
        }
        if (!this.isFirst) {
            return;
        }
        this.isFirst = false;
        View view = getView();
        if (view == null) {
            return;
        }
        view.postDelayed(new a(), 100L);
    }
}
