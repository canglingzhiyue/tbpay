package com.taobao.android.live.plugin.atype.flexalocal.profile;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardResponseData;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.utils.y;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.gbg;
import tb.hhs;
import tb.hkk;
import tb.kge;
import tb.pmd;

/* loaded from: classes6.dex */
public class a extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f13968a;
    private List<LiveAvatarInfoCardResponseData.SimpleContent> b = new ArrayList();
    private boolean c;
    private String d;
    private com.taobao.alilive.aliliveframework.frame.a e;
    private String f;

    /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.profile.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static class C0535a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TUrlImageView f13971a;

        static {
            kge.a(-1945463816);
        }

        public C0535a(View view) {
            super(view);
            this.f13971a = (TUrlImageView) view.findViewById(R.id.personal_mini_icon_footer);
        }
    }

    /* loaded from: classes6.dex */
    public static class b extends RecyclerView.ViewHolder {
        static {
            kge.a(1086234946);
        }

        public b(View view) {
            super(view);
        }
    }

    static {
        kge.a(1245513720);
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4844976", new Object[]{aVar}) : aVar.f;
    }

    public static /* synthetic */ Context b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e8d22441", new Object[]{aVar}) : aVar.f13968a;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("c6dbedd", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ String d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("95f04b79", new Object[]{aVar}) : aVar.d;
    }

    public a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context) {
        this.e = aVar;
        this.f13968a = context;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (i == 0) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_avatar_card_item_layout_flexalocal, (ViewGroup) null));
        }
        if (i == 1) {
            return new C0535a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.live_avatar_layout_mini_user_video_list_footer_flexalocal, viewGroup, false));
        }
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_avatar_card_item_layout_flexalocal, (ViewGroup) null));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (viewHolder instanceof b) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            float f = 147.5f;
            float f2 = 117.0f;
            if (y.e(this.f13968a)) {
                DinamicXEngine c = hhs.a().c();
                Context context = this.f13968a;
                if (!hkk.I()) {
                    f2 = 107.0f;
                }
                layoutParams.width = gbg.a(c, context, f2);
                DinamicXEngine c2 = hhs.a().c();
                Context context2 = this.f13968a;
                if (!hkk.I()) {
                    f = 135.0f;
                }
                layoutParams.height = gbg.a(c2, context2, f);
            } else {
                if (!hkk.I()) {
                    f2 = 107.0f;
                }
                layoutParams.width = d.b(f2);
                if (!hkk.I()) {
                    f = 135.0f;
                }
                layoutParams.height = d.b(f);
            }
            viewHolder.itemView.setLayoutParams(layoutParams);
            final DXRootView createDX = f.m().createDX(this.f13968a, hkk.I() ? LiveAvatarNewView.VIDEO_ITEM_AVATAR_CONTAINER_DX_TEMPLATE_NAME2 : LiveAvatarNewView.VIDEO_ITEM_AVATAR_CONTAINER_DX_TEMPLATE_NAME);
            if (createDX == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) viewHolder.itemView;
            viewGroup.removeAllViews();
            viewGroup.addView(createDX);
            LiveAvatarInfoCardResponseData.SimpleContent simpleContent = this.b.get(i);
            simpleContent.sourceType = this.d;
            f.m().renderDX(createDX, JSON.parseObject(JSONObject.toJSONString(simpleContent)));
            if (hkk.ah()) {
                viewHolder.itemView.post(new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = viewHolder.itemView.getLayoutParams();
                        int i2 = createDX.getLayoutParams().width;
                        if (i2 <= layoutParams2.width) {
                            return;
                        }
                        layoutParams2.width = i2;
                        viewHolder.itemView.setLayoutParams(layoutParams2);
                    }
                });
            }
            if (simpleContent == null) {
                return;
            }
            c.b(this.e, simpleContent.type, this.d);
        } else if (!(viewHolder instanceof C0535a)) {
        } else {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.profile.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (TextUtils.isEmpty(a.a(a.this))) {
                    } else {
                        pmd.a().r().a(a.b(a.this), a.a(a.this), null);
                        c.f(a.c(a.this), a.d(a.this));
                    }
                }
            });
            ((C0535a) viewHolder).f13971a.setImageUrl(hkk.r());
            ViewGroup.LayoutParams layoutParams2 = viewHolder.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
            }
            if (y.e(this.f13968a)) {
                layoutParams2.width = y.f(this.f13968a);
            } else {
                layoutParams2.width = d.c() - d.b(18.0f);
            }
            layoutParams2.height = d.b(45.0f);
            viewHolder.itemView.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : (!this.c || i != this.b.size()) ? 0 : 1;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<LiveAvatarInfoCardResponseData.SimpleContent> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        if (this.c && (list = this.b) != null) {
            return list.size() + 1;
        }
        List<LiveAvatarInfoCardResponseData.SimpleContent> list2 = this.b;
        if (list2 != null) {
            return list2.size();
        }
        return 0;
    }

    public void a(List<LiveAvatarInfoCardResponseData.SimpleContent> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6e0ee3", new Object[]{this, list, str});
            return;
        }
        this.d = str;
        this.b.clear();
        this.b.addAll(list);
        notifyDataSetChanged();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c = false;
        }
    }
}
