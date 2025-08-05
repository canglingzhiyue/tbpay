package com.taobao.themis.open.permission.auth.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.open.permission.auth.model.AuthTextModel;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/SingleAuthAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/taobao/themis/open/permission/auth/ui/SingleAuthAdapter$BaseViewHolder;", "authTextList", "", "Lcom/taobao/themis/open/permission/auth/model/AuthTextModel;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "Landroid/view/ViewGroup;", com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.VIEW_TYPE, "BaseViewHolder", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class g extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<AuthTextModel> f22712a;

    static {
        kge.a(-1892691878);
    }

    public g(List<AuthTextModel> authTextList) {
        q.d(authTextList, "authTextList");
        this.f22712a = authTextList;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, aVar, new Integer(i)});
        } else {
            a(aVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.taobao.themis.open.permission.auth.ui.g$a, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public a a(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("462573ce", new Object[]{this, parent, new Integer(i)});
        }
        q.d(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tms_auth_dialog_single_item, parent, false);
        q.b(inflate, "LayoutInflater.from(pare…ngle_item, parent, false)");
        return new a(inflate);
    }

    public void a(a holder, int i) {
        String string;
        String string2;
        String string3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a63409", new Object[]{this, holder, new Integer(i)});
            return;
        }
        q.d(holder, "holder");
        AuthTextModel authTextModel = this.f22712a.get(i);
        holder.a().setText(authTextModel.getAuthText());
        holder.b().setText(authTextModel.getAuthSceneDesc());
        if (q.a((Object) com.taobao.themis.open.permission.auth.b.CONST_SCOPE_USERINFO, (Object) authTextModel.getScopeName())) {
            if (authTextModel.getAuthInfo() != null) {
                holder.c().setVisibility(0);
                JSONObject authInfo = authTextModel.getAuthInfo();
                if (authInfo != null && (string3 = authInfo.getString("userAvatar")) != null) {
                    holder.e().addFeature(new RoundFeature());
                    holder.e().setImageUrl(string3);
                }
                JSONObject authInfo2 = authTextModel.getAuthInfo();
                if (authInfo2 != null && (string2 = authInfo2.getString("userFuzzNick")) != null) {
                    holder.f().setText(string2);
                }
            } else {
                holder.c().setVisibility(8);
            }
        }
        if (!q.a((Object) "scope.getPhoneNumber", (Object) authTextModel.getScopeName())) {
            return;
        }
        JSONObject authInfo3 = authTextModel.getAuthInfo();
        if (authInfo3 != null && (string = authInfo3.getString("userFuzzMobilePhone")) != null) {
            holder.d().setVisibility(0);
            holder.g().setText(string);
            return;
        }
        holder.d().setVisibility(8);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f22712a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/SingleAuthAdapter$BaseViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mLayoutPhone", "Landroid/widget/RelativeLayout;", "getMLayoutPhone", "()Landroid/widget/RelativeLayout;", "setMLayoutPhone", "(Landroid/widget/RelativeLayout;)V", "mLayoutUser", "getMLayoutUser", "setMLayoutUser", "mTvPhoneNumber", "Landroid/widget/TextView;", "getMTvPhoneNumber", "()Landroid/widget/TextView;", "setMTvPhoneNumber", "(Landroid/widget/TextView;)V", "mUserAvatar", "Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "getMUserAvatar", "()Lcom/taobao/uikit/extend/feature/view/TUrlImageView;", "setMUserAvatar", "(Lcom/taobao/uikit/extend/feature/view/TUrlImageView;)V", "mUserNick", "getMUserNick", "setMUserNick", "tvAuthContent", "getTvAuthContent", "setTvAuthContent", "tvTitle", "getTvTitle", "setTvTitle", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private TextView f22713a;
        private TextView b;
        private RelativeLayout c;
        private RelativeLayout d;
        private TUrlImageView e;
        private TextView f;
        private TextView g;

        static {
            kge.a(-2080775156);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            q.d(view, "view");
            View findViewById = view.findViewById(R.id.tv_auth_title);
            q.b(findViewById, "view.findViewById(R.id.tv_auth_title)");
            this.f22713a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tv_auth_content);
            q.b(findViewById2, "view.findViewById(R.id.tv_auth_content)");
            this.b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.layout_avatar);
            q.b(findViewById3, "view.findViewById(R.id.layout_avatar)");
            this.c = (RelativeLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.layout_phone);
            q.b(findViewById4, "view.findViewById(R.id.layout_phone)");
            this.d = (RelativeLayout) findViewById4;
            View findViewById5 = view.findViewById(R.id.iv_user_info_avatar);
            q.b(findViewById5, "view.findViewById(R.id.iv_user_info_avatar)");
            this.e = (TUrlImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.iv_user_info_nick);
            q.b(findViewById6, "view.findViewById(R.id.iv_user_info_nick)");
            this.f = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.phone_number);
            q.b(findViewById7, "view.findViewById(R.id.phone_number)");
            this.g = (TextView) findViewById7;
        }

        public final TextView a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce905cdc", new Object[]{this}) : this.f22713a;
        }

        public final TextView b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("f7e0415d", new Object[]{this}) : this.b;
        }

        public final RelativeLayout c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("5c8de2fa", new Object[]{this}) : this.c;
        }

        public final RelativeLayout d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RelativeLayout) ipChange.ipc$dispatch("c366a2bb", new Object[]{this}) : this.d;
        }

        public final TUrlImageView e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TUrlImageView) ipChange.ipc$dispatch("46acda10", new Object[]{this}) : this.e;
        }

        public final TextView f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("9d1fd361", new Object[]{this}) : this.f;
        }

        public final TextView g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("c66fb7e2", new Object[]{this}) : this.g;
        }
    }
}
