package com.taobao.mytaobao.biztool;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.ept;
import tb.gbg;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/taobao/mytaobao/biztool/MyToolViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "dstViewType", "", "dstVHWidth", "dstVHHeight", "(Landroid/view/View;III)V", "data", "Lcom/alibaba/fastjson/JSONObject;", "ivAction", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "ivBg", ept.SUB_BIND_VIEW, "", "delClickListener", "Landroid/view/View$OnClickListener;", "canRemove", "", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class b extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TUrlImageView f18364a;
    private final TUrlImageView b;
    private JSONObject c;
    private final int d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View.OnClickListener b;

        public a(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (!b.this.a()) {
            } else {
                this.b.onClick(view);
            }
        }
    }

    static {
        kge.a(-1873890181);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, int i, int i2, int i3) {
        super(view);
        q.c(view, "view");
        this.d = i;
        View findViewById = this.itemView.findViewById(R.id.ivBg);
        if (findViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.f18364a = (TUrlImageView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.ivAction);
        if (findViewById2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.b = (TUrlImageView) findViewById2;
        View itemView = this.itemView;
        q.a((Object) itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        View itemView2 = this.itemView;
        q.a((Object) itemView2, "itemView");
        itemView2.setLayoutParams(layoutParams);
        if (this.d == 0) {
            this.b.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN015PRwuk1RRVsWPLHYC_!!6000000002108-2-tps-54-54.png");
        } else {
            this.b.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01rWQC74297foYwhurq_!!6000000008021-2-tps-54-54.png");
        }
        ViewGroup.LayoutParams layoutParams2 = this.f18364a.getLayoutParams();
        if (layoutParams2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        int b = gbg.b(Globals.getApplication(), 3.0f);
        int b2 = gbg.b(Globals.getApplication(), 6.0f);
        marginLayoutParams.setMargins(b, 0, b, b2);
        this.f18364a.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams3 = this.b.getLayoutParams();
        if (layoutParams3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams2.setMargins(0, b2, gbg.b(Globals.getApplication(), 9.0f), 0);
        this.b.setLayoutParams(marginLayoutParams2);
    }

    public final void a(JSONObject data, View.OnClickListener delClickListener) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25bd7b1", new Object[]{this, data, delClickListener});
            return;
        }
        q.c(data, "data");
        q.c(delClickListener, "delClickListener");
        this.c = data;
        String string = data.getString("pic");
        if (string != null) {
            this.f18364a.setImageUrl(string);
        }
        this.b.setOnClickListener(new a(delClickListener));
        TUrlImageView tUrlImageView = this.b;
        if (!a()) {
            i = 8;
        }
        tUrlImageView.setVisibility(i);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.c;
        return q.a((Object) (jSONObject != null ? jSONObject.getString("canRemove") : null), (Object) "true");
    }
}
