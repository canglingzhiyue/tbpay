package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.android.detail.ttdetail.widget.video.NormalVideoView;
import com.taobao.taobao.R;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes4.dex */
public class q extends p implements com.taobao.android.detail.ttdetail.widget.draglayout.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DragDismissLayout d;
    private boolean e;

    static {
        kge.a(-251872409);
        kge.a(1089283267);
    }

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        if (str.hashCode() == 98379892) {
            return new Boolean(super.i());
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.k
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "DarkFrame_industry";
    }

    public q(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.p
    public View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (this.e && view == null) {
            view = this.mView;
            this.e = false;
        }
        if (view == null || view.getId() != R.id.ddl_video_component) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_lightoff_video_component, (ViewGroup) null);
        }
        this.d = (DragDismissLayout) view.findViewById(R.id.ddl_video_component);
        NormalVideoView normalVideoView = (NormalVideoView) view.findViewById(R.id.vv_video_content);
        normalVideoView.bindData(this.mComponentData, this.mDetailContext);
        normalVideoView.setOnUserClickPlay(this.b);
        this.d.setTargetView(normalVideoView);
        this.f10556a = normalVideoView;
        return view;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.p
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        boolean i = super.i();
        if (!i) {
            getComponentView(null);
            this.e = true;
            if (super.i()) {
                this.f10556a.hideCoverImage();
            }
        }
        return i;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.p
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.p
    public void h() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        boolean b = com.taobao.android.detail.ttdetail.widget.video.a.a().b(this.mContext);
        if (!com.taobao.android.detail.ttdetail.utils.n.a(this.mContext, (Feature) this.mDetailContext.a().a(Feature.class)) && !b) {
            z = false;
        }
        if (!z) {
            return;
        }
        b(false);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            return;
        }
        DragDismissLayout dragDismissLayout = this.d;
        if (dragDismissLayout == null) {
            return;
        }
        dragDismissLayout.setTargetViewInitScreenLocation(rect);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public void a(DragDismissLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723ee8f3", new Object[]{this, aVar});
            return;
        }
        DragDismissLayout dragDismissLayout = this.d;
        if (dragDismissLayout == null) {
            return;
        }
        dragDismissLayout.setPullListener(aVar);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        DragDismissLayout dragDismissLayout = this.d;
        if (dragDismissLayout == null) {
            return;
        }
        dragDismissLayout.startEnterAnimation();
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        DragDismissLayout dragDismissLayout = this.d;
        if (dragDismissLayout == null) {
            return false;
        }
        return dragDismissLayout.startExitAnimation();
    }
}
