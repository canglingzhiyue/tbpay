package com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.CollectionParams;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.taobao.R;
import tb.dzh;
import tb.eei;
import tb.emu;
import tb.eno;
import tb.fcx;
import tb.fcy;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends eei<fcy> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ItemFavouriteView";

    /* renamed from: a  reason: collision with root package name */
    public Context f11155a;
    public View b;
    public WaitingView c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;
    private CollectionParams i;
    private boolean j;

    static {
        kge.a(-1518662677);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.eei
    public String getFullClassName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7324d71b", new Object[]{this}) : "com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.ItemFavouriteView";
    }

    public static /* synthetic */ CollectionParams a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CollectionParams) ipChange.ipc$dispatch("c16611", new Object[]{fVar}) : fVar.i;
    }

    public static /* synthetic */ void a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b40c73", new Object[]{fVar, new Boolean(z)});
        } else {
            fVar.a(z);
        }
    }

    @Override // tb.eei, com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event}) : a((fcy) event);
    }

    public f(Context context, View view, WaitingView waitingView) {
        com.taobao.android.detail.core.utils.i.a(TAG, TAG);
        this.j = !com.taobao.android.detail.core.detail.kit.utils.c.b();
        this.f11155a = context;
        this.b = view;
        this.c = waitingView;
        this.i = CollectionParams.NORMAL;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else if (TStudioHelper.a().a(null, view2, null, false)) {
                } else {
                    com.taobao.android.detail.core.utils.i.a(f.TAG, "mTVFav onClick");
                    if (CollectionParams.NORMAL == f.a(f.this)) {
                        dzh.a(f.this.f11155a, f.this.g, String.valueOf(f.this.h));
                    } else {
                        dzh.b(f.this.f11155a, f.this.g, String.valueOf(f.this.h));
                    }
                    f fVar = f.this;
                    if (f.a(fVar) != CollectionParams.NORMAL) {
                        z = false;
                    }
                    f.a(fVar, z);
                }
            }
        });
        a(CollectionParams.NORMAL, view);
        a();
        emu.a("com.taobao.android.detail.wrapper.ext.component.bottombar.viewholder.ItemFavouriteView");
    }

    public void a(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd745434", new Object[]{this, str, str2, str3, str4, new Long(j)});
            return;
        }
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = j;
    }

    public void a(CollectionParams collectionParams, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d0cedce", new Object[]{this, collectionParams, view});
            return;
        }
        this.i = collectionParams;
        TextView textView = (TextView) view.findViewById(R.id.fav_title);
        if (collectionParams == CollectionParams.NORMAL) {
            view.setClickable(true);
            TextView textView2 = (TextView) view.findViewById(R.id.fav_icon);
            textView2.setVisibility(0);
            if (this.j) {
                textView2.setText(textView2.getContext().getText(R.string.taodetail_iconfont_fav));
                textView2.setTextColor(com.taobao.android.detail.core.utils.c.a("#999999"));
                textView.setText("收藏");
            } else {
                textView2.setText(textView2.getContext().getText(R.string.tmall_iconfont_fav));
                textView2.setTextColor(com.taobao.android.detail.core.utils.c.a("#666666"));
            }
            this.c.setVisibility(4);
        } else if (collectionParams == CollectionParams.WAITING) {
            view.setClickable(false);
        } else {
            view.setClickable(true);
            TextView textView3 = (TextView) view.findViewById(R.id.fav_icon);
            textView3.setVisibility(0);
            if (this.j) {
                textView3.setText(textView3.getContext().getText(R.string.taodetail_iconfont_fav_done));
                textView3.setTextColor(com.taobao.android.detail.core.utils.c.a("#ff5000"));
                textView.setText("已收藏");
            } else {
                textView3.setText(this.f11155a.getResources().getText(R.string.tmall_iconfont_fav_done));
                textView3.setTextColor(this.f11155a.getResources().getColor(R.color.detail_bottom_icon_fav_done));
            }
            this.c.setVisibility(4);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.core.event.params.b bVar = new com.taobao.android.detail.core.event.params.b(this.f, this.d, z);
        if (z) {
            int[] iArr = new int[2];
            this.b.getLocationOnScreen(iArr);
            bVar.e = iArr[0] + (this.b.getWidth() / 2);
            bVar.f = iArr[1];
        }
        com.taobao.android.detail.core.utils.i.a(TAG, "postEvent DoFavEvent sellerId : " + this.f + ", itemId: " + this.d + ", isAdd:" + z);
        com.taobao.android.trade.event.f.a(this.f11155a).a(new fcx(bVar));
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            com.taobao.android.trade.event.f.a(this.f11155a).a(eno.a(fcy.class), this);
        }
    }

    public i a(fcy fcyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("19de16b3", new Object[]{this, fcyVar});
        }
        if (fcyVar == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        a(fcyVar.f27813a, this.b);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }
}
