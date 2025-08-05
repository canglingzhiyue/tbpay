package com.taobao.message.conversation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.android.tbuprofen.mock.RuntimeMockUtils;
import com.taobao.message.kit.util.BizTagUtil;
import com.taobao.message.kit.util.GcUtil;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.lab.comfrm.aura.INeedContainerCompat;
import com.taobao.message.lab.comfrm.inner2.Container;
import com.taobao.message.lab.comfrm.inner2.INeedContainer;
import com.taobao.message.sp.category.SimpleMessageTabHostV2;
import com.taobao.message.uikit.util.ApmTraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.monitor.procedure.o;
import com.taobao.search.common.util.i;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import java.util.Map;
import tb.esr;
import tb.fjp;
import tb.gso;
import tb.kge;

/* loaded from: classes7.dex */
public class MessageTabFragment extends TBBaseFragment implements BizTagUtil.BizTag, INeedContainerCompat, INeedContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout contentView;
    private IMessageTabHost mTabHost;

    public static /* synthetic */ Object ipc$super(MessageTabFragment messageTabFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.message.kit.util.BizTagUtil.BizTag
    public int bizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("156e9b08", new Object[]{this})).intValue() : esr.MESSAGE_TAB;
    }

    @Override // com.taobao.message.kit.util.BizTagUtil.BizTag
    public String bizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b850f77b", new Object[]{this}) : fjp.ERROR_CODE_RECOMMEND_FAIL_EXCEED_MAX_COUNT;
    }

    @Override // com.taobao.message.kit.util.BizTagUtil.BizTag
    public String dxSubBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1be84158", new Object[]{this});
        }
        return null;
    }

    static {
        kge.a(1577884687);
        kge.a(234413929);
        kge.a(-502487741);
        kge.a(-1651577922);
        TBErrorViewService.register();
    }

    private IMessageTabHost getEndNode(IMessageTabHost iMessageTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMessageTabHost) ipChange.ipc$dispatch("e04b8b08", new Object[]{this, iMessageTabHost});
        }
        if (iMessageTabHost == null) {
            return null;
        }
        return iMessageTabHost.getInner() == null ? iMessageTabHost : getEndNode(iMessageTabHost.getInner());
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        ApmTraceUtil.onSubTaskBegin(this, i.b.MEASURE_ONCREATE);
        super.onCreate(bundle);
        TraceUtil.beginSection(i.b.MEASURE_ONCREATE);
        ADaemon.boostCpu(2);
        RuntimeMockUtils.a(367001600L);
        TraceUtil.beginSection("installContextResource");
        ApmTraceUtil.onSubTaskBegin(this, "installContextResource");
        k.a().c(getActivity(), "taobao_wangxin");
        ApmTraceUtil.onSubTaskSuccess(this, "installContextResource", (Map<String, Object>) null);
        TraceUtil.endTrace();
        ApmTraceUtil.onSubTaskBegin(this, i.b.MEASURE_ONCREATE);
        GcUtil.record(o.f18229a.a(this));
        ApplicationUtil.setApplication(Globals.getApplication());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("ampPageSession", o.f18229a.a(this).c());
        this.mTabHost.onArguments(getArguments());
        this.mTabHost.onCreate(bundle);
        setUTPageName("Page_MsgCenter");
        gso.a();
        TraceUtil.endTrace();
        ApmTraceUtil.onSubTaskSuccess(this, i.b.MEASURE_ONCREATE, (Map<String, Object>) null);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        TraceUtil.beginSection("onAttach");
        ApmTraceUtil.onSubTaskBegin(this, "onAttach");
        GcUtil.beginRecord(o.f18229a.a(this));
        this.mTabHost = new SimpleMessageTabHostV2();
        this.mTabHost.onAttach(context);
        TraceUtil.endTrace();
        ApmTraceUtil.onSubTaskSuccess(this, "onAttach", (Map<String, Object>) null);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        TraceUtil.beginSection("onCreateView");
        ApmTraceUtil.onSubTaskBegin(this, "onCreateView");
        if (this.contentView == null) {
            this.contentView = new FrameLayout(getActivity());
            this.mRootView = this.contentView;
        }
        View onCreateView = this.mTabHost.onCreateView(layoutInflater, this.contentView, bundle);
        if (this.contentView.getChildCount() > 0) {
            if (onCreateView != this.contentView.getChildAt(0)) {
                this.contentView.removeAllViews();
                this.contentView.addView(onCreateView, new FrameLayout.LayoutParams(-1, -1));
            }
        } else {
            this.contentView.addView(onCreateView, new FrameLayout.LayoutParams(-1, -1));
        }
        ApmTraceUtil.onSubTaskSuccess(this, "onCreateView", (Map<String, Object>) null);
        TraceUtil.endTrace();
        return this.mRootView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        TraceUtil.beginSection("onViewCreated");
        ApmTraceUtil.onSubTaskBegin(this, "onViewCreated");
        this.mTabHost.onViewCreated(view, bundle);
        ApmTraceUtil.onSubTaskSuccess(this, "onViewCreated", (Map<String, Object>) null);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TraceUtil.beginSection("onResume");
        super.onResume();
        ApmTraceUtil.onSubTaskBegin(this, "onResume");
        this.mTabHost.onResume();
        ApmTraceUtil.onSubTaskSuccess(this, "onResume", (Map<String, Object>) null);
        TraceUtil.endTrace();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TraceUtil.beginSection("onPause");
        super.onPause();
        this.mTabHost.onPause();
        TraceUtil.endTrace();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mTabHost.onDestroy();
        GcUtil.endRecord(o.f18229a.a(this));
    }

    @Override // com.taobao.message.lab.comfrm.inner2.INeedContainer
    public Container getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("c9eae533", new Object[]{this});
        }
        IMessageTabHost endNode = getEndNode(this.mTabHost);
        if (!(endNode instanceof INeedContainer)) {
            return null;
        }
        return ((INeedContainer) endNode).getContainer();
    }

    @Override // com.taobao.message.lab.comfrm.aura.INeedContainerCompat
    public <T> T getContainerCompat(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("17a9f3c9", new Object[]{this, cls});
        }
        IMessageTabHost endNode = getEndNode(this.mTabHost);
        if (!(endNode instanceof INeedContainerCompat)) {
            return null;
        }
        return (T) ((INeedContainerCompat) endNode).getContainerCompat(cls);
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        GcUtil.endRecord(o.f18229a.a(this));
    }
}
