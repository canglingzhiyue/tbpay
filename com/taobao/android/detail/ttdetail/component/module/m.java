package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.android.detail.ttdetail.widget.photoview.PhotoView;
import com.taobao.taobao.R;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes4.dex */
public class m extends l implements com.taobao.android.detail.ttdetail.widget.draglayout.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PhotoView f10552a;
    private DragDismissLayout b;
    private com.taobao.android.detail.ttdetail.widget.photoview.f d;
    private View.OnLongClickListener e;

    static {
        kge.a(-2058190201);
        kge.a(1089283267);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.k
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "DarkFrame_industry";
    }

    public m(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.d = new com.taobao.android.detail.ttdetail.widget.photoview.f() { // from class: com.taobao.android.detail.ttdetail.component.module.m.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.photoview.f
            public void a(ImageView imageView, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("652bbda2", new Object[]{this, imageView, new Float(f), new Float(f2)});
                } else {
                    com.taobao.android.detail.ttdetail.communication.c.a(m.this.mContext, new com.taobao.android.detail.ttdetail.bizmessage.a());
                }
            }
        };
        this.e = new View.OnLongClickListener() { // from class: com.taobao.android.detail.ttdetail.component.module.m.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                com.taobao.android.detail.ttdetail.communication.c.a(m.this.mContext, new com.taobao.android.detail.ttdetail.bizmessage.c(com.taobao.android.detail.ttdetail.utils.l.a(m.this.d()), view.getRootView()));
                com.taobao.android.detail.ttdetail.utils.m.b(2101, "Page_Detail_LongPress_DarkPage_industry", com.taobao.android.detail.ttdetail.utils.m.a(m.this.mDetailContext.a()));
                return true;
            }
        };
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.l
    public View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.ddl_image_component) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_lightoff_image_component, (ViewGroup) null);
        }
        this.b = (DragDismissLayout) view.findViewById(R.id.ddl_image_component);
        PhotoView photoView = (PhotoView) view.findViewById(R.id.pv_image_content);
        com.taobao.android.detail.ttdetail.utils.q.a(photoView, com.taobao.android.detail.ttdetail.utils.l.a(d()));
        this.b.setTargetView(photoView);
        photoView.setOnLongClickListener(this.e);
        photoView.setOnPhotoTapListener(this.d);
        this.f10552a = photoView;
        return view;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            return;
        }
        DragDismissLayout dragDismissLayout = this.b;
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
        DragDismissLayout dragDismissLayout = this.b;
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
        DragDismissLayout dragDismissLayout = this.b;
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
        DragDismissLayout dragDismissLayout = this.b;
        if (dragDismissLayout == null) {
            return false;
        }
        return dragDismissLayout.startExitAnimation();
    }
}
