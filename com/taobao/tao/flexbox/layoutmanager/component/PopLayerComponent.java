package com.taobao.tao.flexbox.layoutmanager.component;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaPositionType;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ai;
import com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogl;
import tb.ogs;
import tb.ohd;

/* loaded from: classes8.dex */
public class PopLayerComponent extends e implements ai, com.taobao.tao.flexbox.layoutmanager.core.s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View anchor;
    private FlatViewGroup anchorView;
    private a animationDialog;
    private Window animationDialogWindow;
    private boolean canBeDrag;
    private com.taobao.tao.flexbox.layoutmanager.core.m containerFlexNode;
    private int[] lastTouchDownXY = new int[2];
    private b mPopLayerAnimation;
    private boolean showInBottom;
    private String src;
    private PopupWindow window;

    static {
        kge.a(52727746);
        kge.a(-1420926486);
        kge.a(724366362);
    }

    public static /* synthetic */ Object ipc$super(PopLayerComponent popLayerComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 672946423) {
            super.calculateLayout(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
            return null;
        } else if (hashCode == 1446611556) {
            super.bindEvent();
            return null;
        } else if (hashCode != 2127624665) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDetach();
            return null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean isDoubleClickSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a243ded", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int[] access$000(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a0b315c0", new Object[]{popLayerComponent}) : popLayerComponent.lastTouchDownXY;
    }

    public static /* synthetic */ FlatViewGroup access$100(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FlatViewGroup) ipChange.ipc$dispatch("b4a70376", new Object[]{popLayerComponent}) : popLayerComponent.anchorView;
    }

    public static /* synthetic */ ogl access$1200(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("4f2d96bd", new Object[]{popLayerComponent}) : popLayerComponent.viewParams;
    }

    public static /* synthetic */ ogl access$1300(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("2d20fc9c", new Object[]{popLayerComponent}) : popLayerComponent.viewParams;
    }

    public static /* synthetic */ boolean access$1400(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74c3e11b", new Object[]{popLayerComponent})).booleanValue() : popLayerComponent.canBeDrag;
    }

    public static /* synthetic */ String access$1500(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aba05f88", new Object[]{popLayerComponent}) : popLayerComponent.src;
    }

    public static /* synthetic */ void access$200(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a80ada6", new Object[]{popLayerComponent});
        } else {
            popLayerComponent.unwatchPageLifecycle();
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$300(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("47676077", new Object[]{popLayerComponent}) : popLayerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$400(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("907e6716", new Object[]{popLayerComponent}) : popLayerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$500(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("d9956db5", new Object[]{popLayerComponent}) : popLayerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$600(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("22ac7454", new Object[]{popLayerComponent}) : popLayerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$700(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("6bc37af3", new Object[]{popLayerComponent}) : popLayerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$800(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("b4da8192", new Object[]{popLayerComponent}) : popLayerComponent.node;
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.core.aa access$900(PopLayerComponent popLayerComponent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.core.aa) ipChange.ipc$dispatch("fdf18831", new Object[]{popLayerComponent}) : popLayerComponent.node;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.component.e, com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        PopLayerContainerView popLayerContainerView = new PopLayerContainerView(context);
        popLayerContainerView.bindComponent(this);
        return popLayerContainerView;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onViewCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6b63ab", new Object[]{this});
        } else {
            watchPageLifecycle();
        }
    }

    private void watchPageLifecycle() {
        ab.e S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6782793", new Object[]{this});
            return;
        }
        if (oeb.ca()) {
            S = this.node.k().A().S();
        } else {
            S = this.node.S();
        }
        S.a("onpageappear", this);
        S.a("onpagedisappear", this);
    }

    private void unwatchPageLifecycle() {
        ab.e S;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47e4d6c", new Object[]{this});
            return;
        }
        if (oeb.ca()) {
            S = this.node.k().A().S();
        } else {
            S = this.node.S();
        }
        S.b("onpageappear", this);
        S.b("onpagedisappear", this);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void bindEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56398a64", new Object[]{this});
            return;
        }
        super.bindEvent();
        if (getComponentClickListener() != null || ((c) this.viewParams).d) {
            return;
        }
        this.view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    view.destroyDrawingCache();
                    view.buildDrawingCache();
                    if (Color.alpha(view.getDrawingCache().getPixel(PopLayerComponent.access$000(PopLayerComponent.this)[0], PopLayerComponent.access$000(PopLayerComponent.this)[1])) >= 200) {
                        return;
                    }
                    PopLayerComponent.this.dismiss();
                } catch (Exception unused) {
                    PopLayerComponent.this.dismiss();
                }
            }
        });
        this.view.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    PopLayerComponent.access$000(PopLayerComponent.this)[0] = (int) motionEvent.getX();
                    PopLayerComponent.access$000(PopLayerComponent.this)[1] = (int) motionEvent.getY();
                }
                return false;
            }
        });
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public boolean onAfterAddToLayoutTree(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d5828a", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (getFlexBoxNode().l() == YogaPositionType.ABSOLUTE) {
            if (this.containerFlexNode == null) {
                this.containerFlexNode = com.taobao.tao.flexbox.layoutmanager.core.m.a();
            }
            ab.h c2 = this.node.c();
            this.containerFlexNode.a(c2.b());
            this.containerFlexNode.b(c2.d());
            getFlexBoxNode().a(this.containerFlexNode, 0);
        }
        return z;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void calculateLayout(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281c58f7", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.core.m mVar = this.containerFlexNode;
        if (mVar != null) {
            mVar.a(f, f2);
        } else {
            super.calculateLayout(f, f2);
        }
    }

    public b getPopAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("260d8bd5", new Object[]{this}) : this.mPopLayerAnimation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        a aVar = this.animationDialog;
        if (aVar != null) {
            aVar.dismiss();
        } else {
            PopupWindow popupWindow = this.window;
            if (popupWindow != null) {
                popupWindow.dismiss();
            } else {
                b bVar = this.mPopLayerAnimation;
                if (bVar != 0) {
                    bVar.b(getView(), new b.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                            }
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                            }
                        }

                        @Override // com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.b.a
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            PopLayerComponent.access$100(PopLayerComponent.this).removeView(PopLayerComponent.this.getView());
                            PopLayerComponent.access$200(PopLayerComponent.this);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                                return;
                            }
                            PopLayerComponent.access$100(PopLayerComponent.this).removeView(PopLayerComponent.this.getView());
                            PopLayerComponent.access$200(PopLayerComponent.this);
                        }
                    });
                }
            }
        }
        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PopLayerComponent.access$400(PopLayerComponent.this).k().d(PopLayerComponent.access$300(PopLayerComponent.this));
                }
            }
        });
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        a aVar = this.animationDialog;
        if (aVar != null) {
            aVar.a();
            return;
        }
        b bVar = this.mPopLayerAnimation;
        if (bVar == 0) {
            return;
        }
        bVar.a((View) getView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View] */
    public void show(View view, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab720346", new Object[]{this, view, new Boolean(z)});
            return;
        }
        this.canBeDrag = true;
        this.anchor = view;
        this.showInBottom = z;
        if (!(view.getContext() instanceof Activity) || ((Activity) view.getContext()).isFinishing()) {
            return;
        }
        if (z) {
            this.animationDialog = new a(view.getContext(), ((c) this.viewParams).c ? R.style.popup_menu_dialog_dim_style : R.style.popup_menu_dialog_style);
            this.animationDialog.a(new b(ogs.a(((c) this.viewParams).f20019a), ogs.b(((c) this.viewParams).f20019a), true));
            if (((c) this.viewParams).d) {
                this.animationDialog.setCanceledOnTouchOutside(false);
                this.animationDialog.setCancelable(false);
            } else {
                this.animationDialog.setCanceledOnTouchOutside(true);
            }
            this.animationDialog.a(((c) this.viewParams).d);
            this.animationDialog.setContentView((View) getView());
            this.animationDialogWindow = this.animationDialog.getWindow();
            IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
            if ((view.getContext() instanceof Activity) && w != null && w.c((Activity) view.getContext())) {
                WindowManager.LayoutParams attributes = this.animationDialogWindow.getAttributes();
                attributes.x = ohd.b(ab.a()) / 4;
                this.animationDialogWindow.setAttributes(attributes);
            }
            if (StringUtils.equals(((c) this.viewParams).f20019a, "none")) {
                this.animationDialogWindow.setWindowAnimations(R.style.TNodePopLayer);
            }
            if (StringUtils.equals("nothing", ((c) this.viewParams).e)) {
                this.animationDialogWindow.setSoftInputMode(48);
            } else if (StringUtils.equals(Constants.Name.RESIZE, ((c) this.viewParams).e)) {
                this.animationDialogWindow.setSoftInputMode(16);
            } else if (StringUtils.equals("pan", ((c) this.viewParams).e)) {
                this.animationDialogWindow.setSoftInputMode(32);
            }
            this.animationDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
                        return;
                    }
                    PopLayerComponent popLayerComponent = PopLayerComponent.this;
                    popLayerComponent.sendMessage(130, PopLayerComponent.access$500(popLayerComponent), "onpageappear", null, null, null);
                }
            });
            this.animationDialog.show();
            WindowManager.LayoutParams attributes2 = this.animationDialogWindow.getAttributes();
            attributes2.width = this.measureResult.f20361a;
            attributes2.height = this.measureResult.b;
            attributes2.gravity = 80;
            if (Build.VERSION.SDK_INT >= 23) {
                z2 = oec.a(view.getContext(), ((Activity) view.getContext()).getWindow().getDecorView().getRootWindowInsets());
            }
            if (z2) {
                this.animationDialogWindow.getDecorView().setSystemUiVisibility(1280);
                if (Build.VERSION.SDK_INT >= 28) {
                    attributes2.layoutInDisplayCutoutMode = 1;
                }
            }
            attributes2.flags = 1280 | attributes2.flags;
            this.animationDialogWindow.setAttributes(attributes2);
            this.animationDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                        return;
                    }
                    PopLayerComponent.access$200(PopLayerComponent.this);
                    PopLayerComponent popLayerComponent = PopLayerComponent.this;
                    popLayerComponent.sendMessage(130, PopLayerComponent.access$600(popLayerComponent), "onpagedisappear", null, null, null);
                    PopLayerComponent popLayerComponent2 = PopLayerComponent.this;
                    popLayerComponent2.sendMessage(Component.MSG_FLAG_DISAPPEAR, PopLayerComponent.access$700(popLayerComponent2), "ondestroy", null, null, null);
                }
            });
            return;
        }
        this.window = new PopupWindow((View) getView(), this.measureResult.f20361a, this.measureResult.b);
        this.window.setOutsideTouchable(true);
        this.window.showAsDropDown(view, view.getWidth() - this.measureResult.f20361a, -view.getHeight());
        this.window.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                PopLayerComponent.access$200(PopLayerComponent.this);
                PopLayerComponent popLayerComponent = PopLayerComponent.this;
                popLayerComponent.sendMessage(130, PopLayerComponent.access$800(popLayerComponent), "onpagedisappear", null, null, null);
                PopLayerComponent popLayerComponent2 = PopLayerComponent.this;
                popLayerComponent2.sendMessage(Component.MSG_FLAG_DISAPPEAR, PopLayerComponent.access$900(popLayerComponent2), "ondestroy", null, null, null);
            }
        });
        sendMessage(130, this.node, "onpageappear", null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View] */
    public void showInTargetView(FlatViewGroup flatViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506b442", new Object[]{this, flatViewGroup});
            return;
        }
        this.canBeDrag = false;
        this.anchorView = flatViewGroup;
        flatViewGroup.addPopLayerView(getNode(), getFlexBoxNode().m());
        this.mPopLayerAnimation = new b(ogs.a(((c) this.viewParams).f20019a), ogs.b(((c) this.viewParams).f20019a), false);
        this.mPopLayerAnimation.a(getView(), null);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleTNodeMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, com.taobao.tao.flexbox.layoutmanager.core.aa aaVar2, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30d88851", new Object[]{this, aaVar, aaVar2, str, str2, map, bVar})).booleanValue();
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2055736715) {
            if (hashCode == -1263645693 && str.equals("onpageappear")) {
                c2 = 0;
            }
        } else if (str.equals("onpagedisappear")) {
            c2 = 1;
        }
        if (c2 == 0) {
            if (sendPageLifeCycleMessage(aaVar, map)) {
                sendMessage(130, this.node, "onpageappear", null, null, null);
            }
        } else if (c2 == 1 && sendPageLifeCycleMessage(aaVar, map)) {
            sendMessage(130, this.node, "onpagedisappear", null, null, null);
        }
        return false;
    }

    private boolean sendPageLifeCycleMessage(com.taobao.tao.flexbox.layoutmanager.core.aa aaVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("878f246", new Object[]{this, aaVar, map})).booleanValue();
        }
        if (aaVar == this.node) {
            return false;
        }
        if (!oeb.a("fixPopLayerLifecycleMsg", true)) {
            return true;
        }
        return StringUtils.equals(oec.a(map.get("type"), "page"), "page");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.s
    public boolean onHandleMessage(aa.e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4492e532", new Object[]{this, eVar})).booleanValue() : onHandleTNodeMessage(eVar.f20300a, eVar.b, eVar.c, null, eVar.d, eVar.e);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /* renamed from: generateViewParams */
    public ogl mo1260generateViewParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ogl) ipChange.ipc$dispatch("36baa12b", new Object[]{this}) : new c();
    }

    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            this.src = str;
        }
    }

    /* loaded from: classes8.dex */
    public class c extends ogl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean b;

        /* renamed from: a  reason: collision with root package name */
        public String f20019a = "bottom";
        public boolean c = true;
        public boolean d = false;
        public String e = "";

        static {
            kge.a(-1955149203);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1185345197) {
                super.a((Context) objArr[0], (HashMap) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public c() {
        }

        @Override // tb.ogl
        public void a(Context context, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
                return;
            }
            super.a(context, hashMap);
            Object obj = hashMap.get("pop-direction");
            if (obj != null) {
                this.f20019a = (String) obj;
            }
            if ("bottom".equals(this.f20019a)) {
                this.b = oec.a(hashMap.get("drop-down"), true);
            }
            this.c = oec.a(hashMap.get("enable-dim"), true);
            this.e = oec.a(hashMap.get("soft-input-mode"), "");
            this.d = oec.a(hashMap.get("enable-transfer-event"), false);
        }
    }

    /* loaded from: classes8.dex */
    public class a extends Dialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View b;
        private b c;
        private boolean d;

        static {
            kge.a(458688746);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1373052399:
                    super.dismiss();
                    return null;
                case -340027132:
                    super.show();
                    return null;
                case 921927566:
                    super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                    return null;
                case 1683598447:
                    super.setContentView((View) objArr[0]);
                    return null;
                case 1770587104:
                    super.setContentView(((Number) objArr[0]).intValue());
                    return null;
                case 2075560917:
                    return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public static /* synthetic */ void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbf0fb38", new Object[]{aVar});
            } else {
                super.dismiss();
            }
        }

        public static /* synthetic */ void b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2fce239", new Object[]{aVar});
            } else {
                super.dismiss();
            }
        }

        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbf16f97", new Object[]{this, bVar});
            } else {
                this.c = bVar;
            }
        }

        public a(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (this.d && !dispatchTouchEvent && (this.b.getContext() instanceof Activity)) {
                ((Activity) this.b.getContext()).dispatchTouchEvent(motionEvent);
            }
            return dispatchTouchEvent;
        }

        @Override // android.app.Dialog
        public void setContentView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
                return;
            }
            super.setContentView(view);
            this.b = view;
        }

        @Override // android.app.Dialog
        public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
                return;
            }
            super.setContentView(view, layoutParams);
            this.b = view;
        }

        @Override // android.app.Dialog
        public void setContentView(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
                return;
            }
            super.setContentView(i);
            this.b = LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null);
        }

        @Override // android.app.Dialog
        public void show() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
                return;
            }
            super.show();
            this.c.a(this.b, null);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.c.a(this.b);
            }
        }

        @Override // android.app.Dialog, android.content.DialogInterface
        public void dismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            } else {
                this.c.b(this.b, new b.a() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                        }
                    }

                    @Override // com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.b.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            a.a(a.this);
                        }
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        } else {
                            a.b(a.this);
                        }
                    }
                });
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Animation f20016a = ogs.a("bottom");
        private Animation b = ogs.b("bottom");
        private boolean c;

        /* loaded from: classes8.dex */
        public interface a extends Animation.AnimationListener {
            void a();
        }

        static {
            kge.a(1395940706);
        }

        public b(Animation animation, Animation animation2, boolean z) {
            a(animation);
            b(animation2);
            this.c = z;
        }

        private void a(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae1d2928", new Object[]{this, animation});
            } else {
                this.f20016a = animation;
            }
        }

        private void b(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("771e2069", new Object[]{this, animation});
            } else {
                this.b = animation;
            }
        }

        private void a(View view, Animation animation, final a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83acc7bc", new Object[]{this, view, animation, aVar});
            } else if (view == null || animation == null) {
                if (aVar == null) {
                    return;
                }
                aVar.a();
            } else {
                animation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation2});
                            return;
                        }
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.onAnimationStart(animation2);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation2});
                            return;
                        }
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.onAnimationEnd(animation2);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation2});
                            return;
                        }
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.onAnimationRepeat(animation2);
                    }
                });
                view.clearAnimation();
                view.startAnimation(animation);
            }
        }

        private void b(View view, Animation animation, a aVar) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("723f539b", new Object[]{this, view, animation, aVar});
            } else if (this.c) {
                a(view, animation, aVar);
            } else if (!(view instanceof ViewGroup)) {
            } else {
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        return;
                    }
                    a(viewGroup.getChildAt(i), animation, aVar);
                    i++;
                }
            }
        }

        public void a(View view, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ea87b7c", new Object[]{this, view, aVar});
            } else {
                b(view, this.f20016a, aVar);
            }
        }

        public void b(View view, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e68af1b", new Object[]{this, view, aVar});
            } else {
                b(view, this.b, aVar);
            }
        }

        public void a(final View view) {
            int scrollY;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (view == null || (scrollY = view.getScrollY()) == 0) {
            } else {
                ValueAnimator ofInt = ValueAnimator.ofInt(scrollY, 0);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        } else {
                            view.setScrollY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    }
                });
                ofInt.setDuration(300L);
                ofInt.start();
            }
        }
    }

    /* loaded from: classes8.dex */
    public class PopLayerContainerView extends FlatViewGroup {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final int DISMISS_SCROLL_OFFSET;
        private int mDownY;
        private boolean mIsBeingDragged;

        static {
            kge.a(-1183386204);
        }

        public static /* synthetic */ Object ipc$super(PopLayerContainerView popLayerContainerView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode != -1447998406) {
                if (hashCode != -407533570) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            }
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }

        public PopLayerContainerView(Context context) {
            super(context);
            this.DISMISS_SCROLL_OFFSET = ohd.b(ab.f20303a, 65);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
            }
            if (((c) PopLayerComponent.access$1200(PopLayerComponent.this)).b) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.mDownY = (int) motionEvent.getRawY();
                    this.mIsBeingDragged = false;
                } else if (action == 2) {
                    if (this.mIsBeingDragged) {
                        return true;
                    }
                    int rawY = ((int) motionEvent.getRawY()) - this.mDownY;
                    if (Math.abs(rawY) > ViewConfiguration.getTouchSlop()) {
                        if (canScroll(this, false, -rawY, (int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                            this.mIsBeingDragged = false;
                            return false;
                        }
                        this.mIsBeingDragged = true;
                    }
                }
                return this.mIsBeingDragged;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
            if (r0 != 3) goto L14;
         */
        @Override // com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouchEvent(android.view.MotionEvent r12) {
            /*
                r11 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.PopLayerContainerView.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L1c
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r1[r3] = r11
                r1[r4] = r12
                java.lang.String r12 = "a9b14c3a"
                java.lang.Object r12 = r0.ipc$dispatch(r12, r1)
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                return r12
            L1c:
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent r0 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.this
                tb.ogl r0 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.access$1300(r0)
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent$c r0 = (com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.c) r0
                boolean r0 = r0.b
                if (r0 == 0) goto La2
                int r0 = r12.getAction()
                if (r0 == 0) goto L9f
                if (r0 == r4) goto L78
                if (r0 == r2) goto L37
                r1 = 3
                if (r0 == r1) goto L78
                goto La1
            L37:
                float r0 = r12.getRawY()
                int r1 = r11.mDownY
                float r1 = (float) r1
                float r0 = r0 - r1
                int r0 = (int) r0
                boolean r1 = r11.mIsBeingDragged
                if (r1 != 0) goto L64
                int r1 = java.lang.Math.abs(r0)
                int r2 = android.view.ViewConfiguration.getTouchSlop()
                if (r1 <= r2) goto L64
                r7 = 0
                int r8 = -r0
                float r1 = r12.getRawX()
                int r9 = (int) r1
                float r12 = r12.getRawY()
                int r10 = (int) r12
                r5 = r11
                r6 = r11
                boolean r12 = r5.canScroll(r6, r7, r8, r9, r10)
                if (r12 != 0) goto L64
                r11.mIsBeingDragged = r4
            L64:
                boolean r12 = r11.mIsBeingDragged
                if (r12 == 0) goto La1
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent r12 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.this
                boolean r12 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.access$1400(r12)
                if (r12 == 0) goto La1
                if (r0 >= 0) goto L73
                r0 = 0
            L73:
                int r12 = -r0
                r11.scrollTo(r3, r12)
                goto La1
            L78:
                float r0 = r12.getRawY()
                int r1 = r11.mDownY
                float r1 = (float) r1
                float r0 = r0 - r1
                int r0 = (int) r0
                if (r0 <= 0) goto L93
                int r12 = r11.DISMISS_SCROLL_OFFSET
                if (r0 <= r12) goto L8d
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent r12 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.this
                r12.dismiss()
                goto La1
            L8d:
                com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent r12 = com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.this
                r12.resume()
                goto La1
            L93:
                int r12 = r12.getAction()
                if (r12 != r4) goto La1
                if (r0 != 0) goto La1
                r11.performClick()
                goto La1
            L9f:
                r11.mIsBeingDragged = r3
            La1:
                return r4
            La2:
                boolean r12 = super.onTouchEvent(r12)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.component.PopLayerComponent.PopLayerContainerView.onTouchEvent(android.view.MotionEvent):boolean");
        }

        private boolean canScroll(View view, boolean z, int i, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                int childCount = viewGroup.getChildCount() - 1;
                while (childCount >= 0) {
                    View childAt = viewGroup.getChildAt(childCount);
                    if (childAt == null || (i5 = i2 + scrollX) < childAt.getLeft() || i5 >= childAt.getRight() * childAt.getScaleX() || (i6 = i3 + scrollY) < childAt.getTop() || i6 >= childAt.getBottom()) {
                        i4 = childCount;
                    } else {
                        i4 = childCount;
                        if (canScroll(childAt, true, i, (int) ((i5 - childAt.getLeft()) / childAt.getScaleX()), i6 - childAt.getTop())) {
                            return true;
                        }
                    }
                    childCount = i4 - 1;
                }
            }
            return z && view.canScrollVertically(i);
        }

        public String getSrc() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2bd8590b", new Object[]{this}) : PopLayerComponent.access$1500(PopLayerComponent.this);
        }
    }
}
