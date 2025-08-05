package com.taobao.themis.open.permission.auth.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import com.taobao.themis.open.permission.auth.model.DomainItemEntity;
import com.taobao.themis.open.permission.auth.model.ResourceItemEntity;
import com.taobao.themis.open.permission.auth.model.ScopeEntity;
import com.taobao.themis.open.permission.auth.model.ScopeSettingEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter$BaseViewHolder;", "entityList", "", "Lcom/taobao/themis/open/permission/auth/model/ScopeSettingEntity;", "scopeClickListener", "Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter$ScopeClickListener;", "(Ljava/util/List;Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter$ScopeClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_SOURCE_PARENT, "Landroid/view/ViewGroup;", com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.b.VIEW_TYPE, "BaseViewHolder", "ScopeClickListener", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class f extends RecyclerView.Adapter<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<ScopeSettingEntity> f22707a;
    private final b b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter$ScopeClickListener;", "", "onDomainClick", "", "groupPosition", "", "childPosition", "onResourceClick", "domainPosition", "onScopeClick", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface b {
        void a(int i, int i2);

        void a(int i, int i2, int i3);

        void b(int i, int i2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a b;
        public final /* synthetic */ int c;

        public c(a aVar, int i) {
            this.b = aVar;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                f.a(f.this).a(this.b.getAdapterPosition(), this.c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a b;
        public final /* synthetic */ int c;

        public d(a aVar, int i) {
            this.b = aVar;
            this.c = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                f.a(f.this).b(this.b.getAdapterPosition(), this.c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public e(a aVar, int i, int i2) {
            this.b = aVar;
            this.c = i;
            this.d = i2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            b a2 = f.a(f.this);
            if (a2 == null) {
                return;
            }
            a2.a(this.b.getAdapterPosition(), this.c, this.d);
        }
    }

    static {
        kge.a(-1145281472);
    }

    public static final /* synthetic */ b a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a50d02ca", new Object[]{fVar}) : fVar.b;
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

    /* JADX WARN: Type inference failed for: r4v6, types: [android.support.v7.widget.RecyclerView$ViewHolder, com.taobao.themis.open.permission.auth.ui.f$a] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public f(List<ScopeSettingEntity> entityList, b scopeClickListener) {
        q.d(entityList, "entityList");
        q.d(scopeClickListener, "scopeClickListener");
        this.f22707a = entityList;
        this.b = scopeClickListener;
    }

    public a a(ViewGroup parent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4624ff6f", new Object[]{this, parent, new Integer(i)});
        }
        q.d(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tms_view_authorize_item_scope, parent, false);
        q.b(inflate, "LayoutInflater.from(pare…tem_scope, parent, false)");
        return new a(inflate);
    }

    public void a(a holder, int i) {
        List<DomainItemEntity> domainItems;
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ebff8c8", new Object[]{this, holder, new Integer(i)});
            return;
        }
        q.d(holder, "holder");
        ScopeSettingEntity scopeSettingEntity = this.f22707a.get(i);
        if (q.a((Object) "top", (Object) scopeSettingEntity.getType()) || q.a((Object) "platform", (Object) scopeSettingEntity.getType())) {
            holder.a().setText(scopeSettingEntity.getTitle());
            holder.b().removeAllViews();
            List<ScopeEntity> scopes = scopeSettingEntity.getScopes();
            if (scopes == null || !(!scopes.isEmpty())) {
                return;
            }
            List<ScopeEntity> scopes2 = scopeSettingEntity.getScopes();
            q.a(scopes2);
            int size = scopes2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View inflate = LayoutInflater.from(holder.b().getContext()).inflate(R.layout.tms_view_authorize_item, (ViewGroup) holder.b(), false);
                q.b(inflate, "LayoutInflater.from(hold…lder.mScopeLayout, false)");
                TextView tvName = (TextView) inflate.findViewById(R.id.tms_scope_name);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.tms_switch_view);
                q.b(tvName, "tvName");
                List<ScopeEntity> scopes3 = scopeSettingEntity.getScopes();
                q.a(scopes3);
                tvName.setText(scopes3.get(i2).getDisplayName());
                holder.b().addView(inflate);
                imageView.setOnClickListener(new c(holder, i2));
                List<ScopeEntity> scopes4 = scopeSettingEntity.getScopes();
                q.a(scopes4);
                if (scopes4.get(i2).getStatus()) {
                    imageView.setImageResource(R.drawable.tms_authorize_set_on);
                } else {
                    imageView.setImageResource(R.drawable.tms_authorize_set_off);
                }
            }
        } else if (q.a((Object) "resource", (Object) scopeSettingEntity.getType()) && (domainItems = scopeSettingEntity.getDomainItems()) != null && (!domainItems.isEmpty())) {
            List<DomainItemEntity> domainItems2 = scopeSettingEntity.getDomainItems();
            q.a(domainItems2);
            int size2 = domainItems2.size();
            int i3 = 0;
            while (i3 < size2) {
                List<DomainItemEntity> domainItems3 = scopeSettingEntity.getDomainItems();
                q.a(domainItems3);
                DomainItemEntity domainItemEntity = domainItems3.get(i3);
                holder.a().setText(domainItemEntity.getTipLabel());
                View inflate2 = LayoutInflater.from(holder.b().getContext()).inflate(R.layout.tms_view_authorize_item_domain, holder.b(), z);
                q.b(inflate2, "LayoutInflater.from(hold…                        )");
                TextView tvName2 = (TextView) inflate2.findViewById(R.id.tms_scope_name);
                ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.tms_switch_view);
                q.b(tvName2, "tvName");
                tvName2.setText(domainItemEntity.getDomainName());
                holder.b().removeAllViews();
                holder.b().addView(inflate2);
                if (domainItemEntity.isAuthed()) {
                    imageView2.setImageResource(R.drawable.tms_authorize_set_on);
                } else {
                    imageView2.setImageResource(R.drawable.tms_authorize_set_off);
                }
                imageView2.setOnClickListener(new d(holder, i3));
                LinearLayout mResourceLayout = (LinearLayout) inflate2.findViewById(R.id.layout_resource);
                q.b(mResourceLayout, "mResourceLayout");
                int i4 = z ? 1 : 0;
                int i5 = z ? 1 : 0;
                int i6 = z ? 1 : 0;
                int i7 = z ? 1 : 0;
                mResourceLayout.setVisibility(i4);
                mResourceLayout.removeAllViews();
                if (domainItemEntity.isAuthed()) {
                    List<ResourceItemEntity> resourceItems = domainItemEntity.getResourceItems();
                    if (resourceItems != null && (resourceItems.isEmpty() ^ z2) == z2) {
                        List<ResourceItemEntity> resourceItems2 = domainItemEntity.getResourceItems();
                        q.a(resourceItems2);
                        int size3 = resourceItems2.size();
                        int i8 = 0;
                        while (i8 < size3) {
                            List<ResourceItemEntity> resourceItems3 = domainItemEntity.getResourceItems();
                            q.a(resourceItems3);
                            ResourceItemEntity resourceItemEntity = resourceItems3.get(i8);
                            View inflate3 = LayoutInflater.from(mResourceLayout.getContext()).inflate(R.layout.tms_view_subscribe_item, mResourceLayout, z);
                            q.b(inflate3, "LayoutInflater.from(mRes…                        )");
                            View lineView = inflate3.findViewById(R.id.tms_top_split);
                            q.b(lineView, "lineView");
                            lineView.setVisibility(8);
                            TextView resourceTitle = (TextView) inflate3.findViewById(R.id.tms_subscribe_name);
                            ImageView imageView3 = (ImageView) inflate3.findViewById(R.id.tms_switch_view);
                            imageView3.setOnClickListener(new e(holder, i3, i8));
                            q.b(resourceTitle, "resourceTitle");
                            resourceTitle.setText(resourceItemEntity.getName());
                            if (resourceItemEntity.isAuthed()) {
                                imageView3.setImageResource(R.drawable.tms_subscribe_auth_check);
                            } else {
                                imageView3.setImageResource(R.drawable.tms_subscribe_auth_uncheck);
                            }
                            mResourceLayout.addView(inflate3);
                            i8++;
                            z = false;
                        }
                    }
                } else {
                    mResourceLayout.setVisibility(8);
                }
                i3++;
                z = false;
                z2 = true;
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f22707a.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/open/permission/auth/ui/ScopeAdapter$BaseViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mScopeLayout", "Landroid/widget/LinearLayout;", "getMScopeLayout", "()Landroid/widget/LinearLayout;", "setMScopeLayout", "(Landroid/widget/LinearLayout;)V", "tvTitle", "Landroid/widget/TextView;", "getTvTitle", "()Landroid/widget/TextView;", "setTvTitle", "(Landroid/widget/TextView;)V", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private TextView f22708a;
        private LinearLayout b;

        static {
            kge.a(-1721612442);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            q.d(view, "view");
            View findViewById = view.findViewById(R.id.setting_desc);
            q.b(findViewById, "view.findViewById(R.id.setting_desc)");
            this.f22708a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.layout_scope);
            q.b(findViewById2, "view.findViewById(R.id.layout_scope)");
            this.b = (LinearLayout) findViewById2;
        }

        public final TextView a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("ce905cdc", new Object[]{this}) : this.f22708a;
        }

        public final LinearLayout b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("e3daedc0", new Object[]{this}) : this.b;
        }
    }
}
