package com.taobao.android.detail.ttdetail.component.module;

import android.content.Context;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bq;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.taobao.R;
import tb.eyx;
import tb.ezc;
import tb.kge;

/* loaded from: classes4.dex */
public class i extends h implements com.taobao.android.detail.ttdetail.widget.draglayout.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final j e;

    static {
        kge.a(45902005);
        kge.a(1089283267);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        if (str.hashCode() == -1231124429) {
            super.a((d) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.h
    public float p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fcce7", new Object[]{this})).floatValue();
        }
        return 1.0f;
    }

    public i(Context context, eyx eyxVar, ezc ezcVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, ezcVar, dataEntryArr);
        this.e = new j(-1, -1, 17);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.o
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69e8833", new Object[]{this, dVar});
        } else if (n() > 0) {
        } else {
            super.a(dVar);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.h
    public View a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : LayoutInflater.from(this.mContext).inflate(R.layout.tt_detail_lightoff_frame_component, (ViewGroup) null);
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.h
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        int n = n();
        for (int i2 = 0; i2 < n; i2++) {
            String a2 = bq.a(a(i2));
            if (!StringUtils.isEmpty(a2)) {
                com.taobao.android.detail.ttdetail.behavior.b.a(this.mContext, a2, i);
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : this.e;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab835131", new Object[]{this, rect});
            return;
        }
        d a2 = a(0);
        if (!(a2 instanceof com.taobao.android.detail.ttdetail.widget.draglayout.b)) {
            return;
        }
        ((com.taobao.android.detail.ttdetail.widget.draglayout.b) a2).a(rect);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public void a(DragDismissLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723ee8f3", new Object[]{this, aVar});
            return;
        }
        d a2 = a(0);
        if (!(a2 instanceof com.taobao.android.detail.ttdetail.widget.draglayout.b)) {
            return;
        }
        ((com.taobao.android.detail.ttdetail.widget.draglayout.b) a2).a(aVar);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        d a2 = a(0);
        if (!(a2 instanceof com.taobao.android.detail.ttdetail.widget.draglayout.b)) {
            return;
        }
        ((com.taobao.android.detail.ttdetail.widget.draglayout.b) a2).l();
    }

    @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        d a2 = a(0);
        if (!(a2 instanceof com.taobao.android.detail.ttdetail.widget.draglayout.b)) {
            return false;
        }
        return ((com.taobao.android.detail.ttdetail.widget.draglayout.b) a2).m();
    }
}
