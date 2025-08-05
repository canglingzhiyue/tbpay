package com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.app.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.alibaba.android.aura.b;
import com.alibaba.android.umf.taobao.adapter.widget.floatview.NUTFloatViewManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.arc;
import tb.ard;
import tb.bar;
import tb.bau;
import tb.bbb;
import tb.bpp;
import tb.bqd;
import tb.bqe;
import tb.brz;
import tb.bsa;
import tb.bse;
import tb.bsf;
import tb.bsh;
import tb.bsl;
import tb.bsm;
import tb.bsn;
import tb.bsq;
import tb.kge;

/* loaded from: classes2.dex */
public class NUTFragmentFloatContainer extends AppCompatDialogFragment implements bse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private NUTFloatViewManager.Builder mBuilder;
    private bsm mContentRender;
    private bse.b mDismissListener;
    private bsq mFloatStyle;
    private bsh mFloatViewsAssembler;
    private bse.d mShowListener;
    private final String TAG = "NUTFragmentFloatContainer";
    private final bsf mAnimationCenter = new bsf();
    private final List<bse.a> mOnCloseInterceptors = new ArrayList();
    private final String FRAGMENT_TAG = "NUTFragmentFloatContainer";

    static {
        kge.a(1098194642);
        kge.a(113024113);
    }

    public static /* synthetic */ Object ipc$super(NUTFragmentFloatContainer nUTFragmentFloatContainer, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 937454072:
                super.dismissAllowingStateLoss();
                return null;
            case 1639966335:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ boolean access$000(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db72bf1c", new Object[]{nUTFragmentFloatContainer})).booleanValue() : nUTFragmentFloatContainer.dispatchOnCloseClick();
    }

    public static /* synthetic */ void access$100(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae299f7", new Object[]{nUTFragmentFloatContainer});
        } else {
            nUTFragmentFloatContainer.callSuperDismissAllowingStateLoss();
        }
    }

    public static /* synthetic */ bsh access$200(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bsh) ipChange.ipc$dispatch("f7852d99", new Object[]{nUTFragmentFloatContainer}) : nUTFragmentFloatContainer.getFloatViewsAssembler();
    }

    public static /* synthetic */ NUTFloatViewManager.Builder access$300(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NUTFloatViewManager.Builder) ipChange.ipc$dispatch("d4daa0b0", new Object[]{nUTFragmentFloatContainer}) : nUTFragmentFloatContainer.mBuilder;
    }

    public static /* synthetic */ bse.d access$400(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bse.d) ipChange.ipc$dispatch("f26c643e", new Object[]{nUTFragmentFloatContainer}) : nUTFragmentFloatContainer.mShowListener;
    }

    public static /* synthetic */ bsf access$500(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bsf) ipChange.ipc$dispatch("50ac221e", new Object[]{nUTFragmentFloatContainer}) : nUTFragmentFloatContainer.mAnimationCenter;
    }

    public static /* synthetic */ bsq access$600(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bsq) ipChange.ipc$dispatch("c3b91fb4", new Object[]{nUTFragmentFloatContainer}) : nUTFragmentFloatContainer.mFloatStyle;
    }

    public static /* synthetic */ FragmentManager access$700(NUTFragmentFloatContainer nUTFragmentFloatContainer, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FragmentManager) ipChange.ipc$dispatch("4c0749f5", new Object[]{nUTFragmentFloatContainer, fragmentActivity}) : nUTFragmentFloatContainer.getFragmentManagerOfTarget(fragmentActivity);
    }

    public static /* synthetic */ void access$801(NUTFragmentFloatContainer nUTFragmentFloatContainer, FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a2ee6a", new Object[]{nUTFragmentFloatContainer, fragmentManager, str});
        } else {
            super.show(fragmentManager, str);
        }
    }

    public static /* synthetic */ void access$901(NUTFragmentFloatContainer nUTFragmentFloatContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f78778e", new Object[]{nUTFragmentFloatContainer});
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    private bsh getFloatViewsAssembler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsh) ipChange.ipc$dispatch("61b84570", new Object[]{this});
        }
        bsh bshVar = this.mFloatViewsAssembler;
        if (bshVar != null) {
            return bshVar;
        }
        if (this.mBuilder != null) {
            Boolean g = this.mFloatStyle.g();
            if (g != null && g.booleanValue()) {
                this.mFloatViewsAssembler = new bsl();
            } else {
                this.mFloatViewsAssembler = new a();
            }
        } else {
            reportBuilderNPEError();
            this.mFloatViewsAssembler = new a();
        }
        this.mFloatViewsAssembler.a(new bse.a() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bse.a
            public boolean a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : NUTFragmentFloatContainer.access$000(NUTFragmentFloatContainer.this);
            }
        });
        this.mFloatViewsAssembler.a(new bse.b() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bse.b
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (z) {
                    NUTFragmentFloatContainer.access$100(NUTFragmentFloatContainer.this);
                } else {
                    NUTFragmentFloatContainer.this.dismissFloat();
                }
            }
        });
        return this.mFloatViewsAssembler;
    }

    private void reportBuilderNPEError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70072c53", new Object[]{this});
            return;
        }
        try {
            arc.a().a("NUTFragmentFloatContainer", "getFloatViewsAssembler", "mBuilder is null");
            bpp.a().logError("AURAMonitor", "NUTFloat", PopStrategy.IDENTIFIER_FLOAT, null, "nut-builder-npe", "mBuilder is null", new HashMap(), com.alibaba.android.umbrella.link.export.a.a("mBuilder is null"));
            bpp.a().commitFailure(PopStrategy.IDENTIFIER_FLOAT, "AURAMonitor", "1.0", "AURAMonitor", "NUTFloat", new HashMap(), "nut-builder-npe", "mBuilder is null");
        } catch (Exception e) {
            arc.a().c("NUTFragmentFloatContainer", "reportBuilderNpeError-exception", e.getMessage());
        }
    }

    @Override // tb.bse
    public void setConfigBuilder(NUTFloatViewManager.Builder builder, bsq bsqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7026ef3d", new Object[]{this, builder, bsqVar});
            return;
        }
        ard a2 = arc.a();
        a2.a("NUTFragmentFloatContainer", "setConfigBuilder", "builder=" + builder);
        this.mBuilder = builder;
        this.mFloatStyle = bsqVar;
    }

    @Override // tb.bse
    public void setContentRender(bsm bsmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab592ae8", new Object[]{this, bsmVar});
        } else {
            this.mContentRender = bsmVar;
        }
    }

    @Override // tb.bse
    public void setContentViewAnimation(brz brzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f09375", new Object[]{this, brzVar});
        } else {
            this.mAnimationCenter.a(brzVar);
        }
    }

    @Override // tb.bse
    public void setBackgroundAnimation(brz brzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8119c1", new Object[]{this, brzVar});
        } else {
            this.mAnimationCenter.b(brzVar);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.NUTFloatViewTheme_Dialog_Transparent);
    }

    private boolean dispatchOnCloseClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f7ebb54", new Object[]{this})).booleanValue();
        }
        Iterator<bse.a> it = this.mOnCloseInterceptors.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().a()) {
                z = true;
            }
            if (bar.a("auraRemoveCloseClickListenerWhenDispatch", false)) {
                it.remove();
            }
        }
        return z;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : getFloatViewsAssembler().a(getContext());
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
        } else {
            super.onViewCreated(view, bundle);
        }
    }

    @Override // android.support.v7.app.AppCompatDialogFragment, android.support.v4.app.DialogFragment
    /* renamed from: onCreateDialog */
    public Dialog mo1438onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("cc7a75a5", new Object[]{this, bundle});
        }
        h hVar = new h(getContext(), getTheme()) { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Dialog
            public void onBackPressed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88afc63", new Object[]{this});
                } else if (NUTFragmentFloatContainer.access$200(NUTFragmentFloatContainer.this).d() || NUTFragmentFloatContainer.access$000(NUTFragmentFloatContainer.this)) {
                } else {
                    NUTFragmentFloatContainer.this.dismissFloat();
                }
            }
        };
        Window window = hVar.getWindow();
        if (window != null) {
            window.clearFlags(131072);
            window.setSoftInputMode(3);
        }
        return hVar;
    }

    private boolean showToView(final FragmentActivity fragmentActivity) {
        bsm bsmVar;
        NUTFloatViewManager.Builder builder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350fa83", new Object[]{this, fragmentActivity})).booleanValue();
        }
        if (!this.mAnimationCenter.a() && (bsmVar = this.mContentRender) != null && (builder = this.mBuilder) != null) {
            return bsmVar.a(fragmentActivity, builder.getFloatParams(), new bsn() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (NUTFragmentFloatContainer.access$300(NUTFragmentFloatContainer.this) != null && NUTFragmentFloatContainer.access$300(NUTFragmentFloatContainer.this).getRenderListener() == null) {
                    }
                }

                private void b(b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("aa3ecd81", new Object[]{this, bVar});
                        return;
                    }
                    if (NUTFragmentFloatContainer.access$300(NUTFragmentFloatContainer.this) != null && NUTFragmentFloatContainer.access$300(NUTFragmentFloatContainer.this).getRenderListener() == null) {
                    }
                }

                private void b(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                    } else {
                        NUTFragmentFloatContainer.access$500(NUTFragmentFloatContainer.this).a(view, NUTFragmentFloatContainer.access$200(NUTFragmentFloatContainer.this).a(), new bsa() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.bsa
                            public void a() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else if (NUTFragmentFloatContainer.access$400(NUTFragmentFloatContainer.this) == null) {
                                } else {
                                    NUTFragmentFloatContainer.access$400(NUTFragmentFloatContainer.this);
                                }
                            }

                            @Override // tb.bsa
                            public void b() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("57a83e9", new Object[]{this});
                                } else {
                                    NUTFragmentFloatContainer.this.dismissFloat();
                                }
                            }
                        });
                    }
                }

                @Override // tb.bsn
                public void a(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    } else if (a(fragmentActivity) || NUTFragmentFloatContainer.this.isAdded()) {
                    } else {
                        NUTFragmentFloatContainer.access$200(NUTFragmentFloatContainer.this).a(view, NUTFragmentFloatContainer.access$600(NUTFragmentFloatContainer.this));
                        try {
                            NUTFragmentFloatContainer nUTFragmentFloatContainer = NUTFragmentFloatContainer.this;
                            FragmentManager access$700 = NUTFragmentFloatContainer.access$700(NUTFragmentFloatContainer.this, fragmentActivity);
                            NUTFragmentFloatContainer.access$801(nUTFragmentFloatContainer, access$700, "NUTFragmentFloatContainer" + System.currentTimeMillis());
                        } catch (IllegalStateException e) {
                            ard a2 = arc.a();
                            a2.b("显示浮层报错:" + e.getMessage(), arc.a.a().b("NUTFragmentFloatContainer").b());
                        }
                        com.alibaba.android.aura.service.render.widget.roundcornerlayout.b b = NUTFragmentFloatContainer.access$200(NUTFragmentFloatContainer.this).b();
                        if (b instanceof View) {
                            b((View) b);
                        } else {
                            bqe.a().c("NUTFragmentFloatContainer", "onRenderSuccess#contentWrapperLayout is null");
                        }
                        a();
                    }
                }

                @Override // tb.bsn
                public void a(b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                        return;
                    }
                    if (bVar.d() == 0) {
                        NUTFragmentFloatContainer.this.dismissFloat();
                    }
                    bqd a2 = bqe.a();
                    a2.c("NUTFragmentFloatContainer", "onRenderFailed#error=" + bVar);
                    b(bVar);
                }

                private boolean a(Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
                    }
                    if (!(context instanceof Activity)) {
                        return false;
                    }
                    return ((Activity) context).isFinishing();
                }
            });
        }
        return false;
    }

    private FragmentManager getFragmentManagerOfTarget(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("925aa3a", new Object[]{this, fragmentActivity});
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        List<Fragment> fragments = supportFragmentManager.getFragments();
        return bau.a(fragments) ? supportFragmentManager : fragments.get(0).getChildFragmentManager();
    }

    @Override // tb.bse
    public boolean showFloat(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c358026", new Object[]{this, context})).booleanValue();
        }
        if (isAdded()) {
            bqe.a().c("NUTFragmentFloatContainer", "showFloat#float is already showing");
            return false;
        } else if (context instanceof FragmentActivity) {
            return showToView((FragmentActivity) context);
        } else {
            bqe.a().c("NUTFragmentFloatContainer", "showFloat#make sure context is FragmentActivity");
            return false;
        }
    }

    @Override // tb.bse
    public boolean dismissFloat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd82c17d", new Object[]{this})).booleanValue() : startContentDismissAnimation();
    }

    @Override // tb.bse
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        bsm bsmVar = this.mContentRender;
        if (bsmVar != null) {
            bsmVar.a();
            this.mContentRender = null;
        }
        this.mOnCloseInterceptors.clear();
    }

    private boolean startContentDismissAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("897e93fc", new Object[]{this})).booleanValue() : this.mAnimationCenter.a(new bsa() { // from class: com.alibaba.android.umf.taobao.adapter.widget.floatview.container.impl.dialogfragment.NUTFragmentFloatContainer.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.bsa
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    NUTFragmentFloatContainer.access$100(NUTFragmentFloatContainer.this);
                }
            }

            @Override // tb.bsa
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else if (NUTFragmentFloatContainer.this.getFragmentManager() == null) {
                } else {
                    NUTFragmentFloatContainer.access$100(NUTFragmentFloatContainer.this);
                }
            }
        });
    }

    private void callSuperDismissAllowingStateLoss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafc8055", new Object[]{this});
            return;
        }
        bbb.a(getView());
        try {
            access$901(this);
        } catch (Exception unused) {
            arc.a().b("浮层消失时报错", arc.a.a().b("NUTFragmentFloatContainer").b());
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        NUTFloatViewManager.Builder builder = this.mBuilder;
        if (builder != null && builder.isInternalRecycleOnDismiss()) {
            destroy();
        }
        getFloatViewsAssembler().c();
        bse.b bVar = this.mDismissListener;
        if (bVar == null) {
            return;
        }
        bVar.a(false);
    }

    @Override // tb.bse
    public void setOnDismissListener(bse.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79f2b82", new Object[]{this, bVar});
        } else {
            this.mDismissListener = bVar;
        }
    }

    @Override // tb.bse
    public void setOnShowListener(bse.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b32d95", new Object[]{this, dVar});
        } else {
            this.mShowListener = dVar;
        }
    }

    @Override // tb.bse
    public void addOnCloseListener(bse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e457f2", new Object[]{this, aVar});
        } else if (this.mOnCloseInterceptors.contains(aVar)) {
        } else {
            this.mOnCloseInterceptors.add(aVar);
        }
    }

    public void removeOnCloseListener(bse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f7b66ef", new Object[]{this, aVar});
        } else {
            this.mOnCloseInterceptors.remove(aVar);
        }
    }

    @Override // tb.bse
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        this.mFloatViewsAssembler.b(this.mFloatStyle);
        showToView(getActivity());
    }

    @Override // android.support.v4.app.DialogFragment
    @Deprecated
    public int show(FragmentTransaction fragmentTransaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0b16ee1", new Object[]{this, fragmentTransaction, str})).intValue();
        }
        showFloat(getContext());
        return -1;
    }

    @Override // android.support.v4.app.DialogFragment
    @Deprecated
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bfe67f", new Object[]{this, fragmentManager, str});
        } else {
            showFloat(getContext());
        }
    }

    @Override // android.support.v4.app.DialogFragment
    @Deprecated
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else {
            dismissFloat();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    @Deprecated
    public void dismissAllowingStateLoss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e069f8", new Object[]{this});
        } else {
            dismissFloat();
        }
    }
}
