package com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl;

import android.content.Context;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.protocol.subservice.biz.IVideoCardAnimationService;
import tb.kge;
import tb.ldf;
import tb.lfq;

/* loaded from: classes7.dex */
public class b extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHVIDEOANIMATION_HVIDEOANIMATION = 7071829940837222382L;

    /* renamed from: a  reason: collision with root package name */
    private int f17557a;

    static {
        kge.a(2000726044);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    public static /* synthetic */ int a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("516e8fcf", new Object[]{bVar})).intValue() : bVar.f17557a;
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1681629939);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new b();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new b();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new HVideoAnimationView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof b)) {
            return;
        }
        this.f17557a = dXWidgetNode.getCornerRadius();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        ldf.d("VideoAnimationWidgetNode", "onRenderView HVideoAnimationView: " + view);
        if (!(view instanceof HVideoAnimationView)) {
            ldf.d("VideoAnimationWidgetNode", "onRenderView: not HVideoAnimationView");
            return;
        }
        IVideoCardAnimationService iVideoCardAnimationService = (IVideoCardAnimationService) lfq.a(getDXRuntimeContext()).a(IVideoCardAnimationService.class);
        if (iVideoCardAnimationService == null || !iVideoCardAnimationService.enableShow()) {
            ldf.d("VideoAnimationWidgetNode", "onRenderView: videoCardAnimationService null 或 不可展示");
            view.setVisibility(8);
            return;
        }
        ldf.d("VideoAnimationWidgetNode", "onRenderView: prepare play:" + this.f17557a);
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                        return;
                    }
                    ldf.d("VideoAnimationWidgetNode", "onRenderView: 设置圆角 :" + b.a(b.this));
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) b.a(b.this));
                }
            });
            view.setClipToOutline(true);
        }
        HVideoAnimationView hVideoAnimationView = (HVideoAnimationView) view;
        hVideoAnimationView.setLoop(false);
        hVideoAnimationView.setVideoPath(iVideoCardAnimationService.getLocalVideoPath());
        hVideoAnimationView.setCoverImage(iVideoCardAnimationService.getFirstFrameImagePath());
    }
}
