package com.taobao.android.tab2liveroom.liveroom.topAvatar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.StringUtils;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarResult;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundFeature;
import java.util.List;
import tb.kge;
import tb.ogg;
import tb.ohd;

/* loaded from: classes6.dex */
public class LiveAvatarAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<LiveAvatarResult.LiveAccount> f15307a;
    private LiveAvatarViewHolder.OnItemClickListener b;
    private boolean c = false;

    static {
        kge.a(-76707399);
    }

    public static /* synthetic */ Object ipc$super(LiveAvatarAdapter liveAvatarAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -955520525) {
            super.onViewAttachedToWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        } else if (hashCode != 1216347414) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewDetachedFromWindow((RecyclerView.ViewHolder) objArr[0]);
            return null;
        }
    }

    public LiveAvatarAdapter(List<LiveAvatarResult.LiveAccount> list) {
        this.f15307a = list;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : new LiveAvatarViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tab2_liveroom_live_avatar_cell, viewGroup, false));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (!(viewHolder instanceof LiveAvatarViewHolder)) {
        } else {
            LiveAvatarViewHolder liveAvatarViewHolder = (LiveAvatarViewHolder) viewHolder;
            Context context = liveAvatarViewHolder.b.getContext();
            if (this.f15307a.get(i) == null || this.f15307a.get(i).status == null) {
                ogg.a("LiveAvatarAdapter", "onBindViewHolder " + this.f15307a.get(i));
                return;
            }
            liveAvatarViewHolder.c.setText(this.f15307a.get(i).accountNick);
            liveAvatarViewHolder.b.setImageUrl(this.f15307a.get(i).avatarUrl);
            a(context, liveAvatarViewHolder, this.f15307a.get(i));
            if (liveAvatarViewHolder.b.findFeature(RoundFeature.class) == null) {
                liveAvatarViewHolder.b.addFeature(new RoundFeature());
            }
            LiveAvatarViewHolder.OnItemClickListener onItemClickListener = this.b;
            if (onItemClickListener != null) {
                liveAvatarViewHolder.a(onItemClickListener);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("index", (Object) Integer.valueOf(i));
            if (StringUtils.equals(this.f15307a.get(i).specialType, b.MORE_LIVE)) {
                b.a(2201, "Show-Tab2MoreLive", jSONObject);
                return;
            }
            jSONObject.put("is_reddot", (Object) (StringUtils.isEmpty(this.f15307a.get(i).topParams) ? "0" : "1"));
            if (this.f15307a.get(i).accountLiveTag != null) {
                jSONObject.put("pushReason", (Object) this.f15307a.get(i).accountLiveTag.pushReason);
            }
            b.a(2201, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Avatars_Show", jSONObject);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.f15307a.size()) {
        } else {
            this.f15307a.remove(i);
            notifyItemRemoved(i);
            if (i >= this.f15307a.size()) {
                return;
            }
            notifyItemRangeChanged(i, this.f15307a.size() - i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70be9f3", new Object[]{this, viewHolder});
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder instanceof LiveAvatarViewHolder)) {
            return;
        }
        LiveAvatarViewHolder liveAvatarViewHolder = (LiveAvatarViewHolder) viewHolder;
        if (liveAvatarViewHolder.f15308a == null) {
            return;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        if (adapterPosition < this.f15307a.size() && adapterPosition > 0 && StringUtils.equals(this.f15307a.get(adapterPosition).specialType, b.MORE_LIVE)) {
            return;
        }
        ExpandingCircleView expandingCircleView = (ExpandingCircleView) liveAvatarViewHolder.f15308a.findViewById(R.id.tab2_live_room_avatar_cell_image_animation);
        Context context = liveAvatarViewHolder.f15308a.getContext();
        if (expandingCircleView == null) {
            expandingCircleView = new ExpandingCircleView(context);
            expandingCircleView.setId(R.id.tab2_live_room_avatar_cell_image_animation);
            expandingCircleView.setStaticRadius(ohd.b(context, 23));
            expandingCircleView.setExpandingRadius(ohd.b(context, 30));
            liveAvatarViewHolder.f15308a.addView(expandingCircleView, 0, a(ohd.b(context, 60), ohd.b(context, 60), 49, 0, -2, 0, 0));
        }
        expandingCircleView.setVisibility(0);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        ExpandingCircleView expandingCircleView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ffd16", new Object[]{this, viewHolder});
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof LiveAvatarViewHolder)) {
            return;
        }
        LiveAvatarViewHolder liveAvatarViewHolder = (LiveAvatarViewHolder) viewHolder;
        if (liveAvatarViewHolder.f15308a == null || (expandingCircleView = (ExpandingCircleView) liveAvatarViewHolder.f15308a.findViewById(R.id.tab2_live_room_avatar_cell_image_animation)) == null) {
            return;
        }
        expandingCircleView.setVisibility(4);
    }

    private void a(Context context, LiveAvatarViewHolder liveAvatarViewHolder, LiveAvatarResult.LiveAccount liveAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17173e91", new Object[]{this, context, liveAvatarViewHolder, liveAccount});
        } else if (StringUtils.equals(liveAccount.specialType, b.MORE_LIVE)) {
            if (liveAvatarViewHolder.f15308a.findViewById(R.id.tab2_live_room_avatar_cell_status_text_image) != null) {
                liveAvatarViewHolder.f15308a.removeView(liveAvatarViewHolder.f15308a.findViewById(R.id.tab2_live_room_avatar_cell_status_text_image));
            }
            liveAvatarViewHolder.e.setVisibility(8);
        } else if (this.c) {
            if (liveAccount.accountLiveTag != null) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(Color.parseColor(liveAccount.accountLiveTag.backgroundColor));
                shapeDrawable.setShape(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null));
                liveAvatarViewHolder.e.setBackground(shapeDrawable);
                liveAvatarViewHolder.e.setText(liveAccount.accountLiveTag.tagName);
                liveAvatarViewHolder.e.setTextColor(Color.parseColor(liveAccount.accountLiveTag.fontColor));
                liveAvatarViewHolder.e.setVisibility(0);
            }
            if (liveAvatarViewHolder.f15308a.findViewById(R.id.tab2_live_room_avatar_cell_status_text_image) == null) {
                return;
            }
            liveAvatarViewHolder.f15308a.removeView(liveAvatarViewHolder.f15308a.findViewById(R.id.tab2_live_room_avatar_cell_status_text_image));
        } else {
            if (liveAvatarViewHolder.f15308a.findViewById(R.id.tab2_live_room_avatar_cell_status_text_image) == null) {
                TUrlImageView tUrlImageView = new TUrlImageView(context);
                tUrlImageView.setId(R.id.tab2_live_room_avatar_cell_status_text_image);
                tUrlImageView.setImageUrl(liveAccount.status.tagPic);
                liveAvatarViewHolder.f15308a.addView(tUrlImageView, a(ohd.b(context, 32), ohd.b(context, 13), 49, 0, ohd.b(context, 39) + 2, 0, 0));
            }
            liveAvatarViewHolder.e.setVisibility(8);
        }
    }

    private static FrameLayout.LayoutParams a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("b8bcf8c4", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.gravity = i3;
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        layoutParams.rightMargin = i6;
        layoutParams.bottomMargin = i7;
        return layoutParams;
    }

    public void a(LiveAvatarViewHolder.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53d5272", new Object[]{this, onItemClickListener});
        } else {
            this.b = onItemClickListener;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.f15307a.size();
    }

    public List<LiveAvatarResult.LiveAccount> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f15307a;
    }

    /* loaded from: classes6.dex */
    public static class LiveAvatarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public FrameLayout f15308a;
        public TUrlImageView b;
        public TextView c;
        private OnItemClickListener d;
        public TextView e;

        /* loaded from: classes6.dex */
        public interface OnItemClickListener {
            void a(int i);
        }

        static {
            kge.a(-76910047);
            kge.a(-1201612728);
        }

        public void a(OnItemClickListener onItemClickListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e53d5272", new Object[]{this, onItemClickListener});
            } else {
                this.d = onItemClickListener;
            }
        }

        public LiveAvatarViewHolder(View view) {
            super(view);
            this.f15308a = (FrameLayout) view;
            this.b = (TUrlImageView) view.findViewById(R.id.avatar_cell_image);
            this.c = (TextView) view.findViewById(R.id.avatar_cell_title);
            this.e = (TextView) view.findViewById(R.id.tab2_live_room_avatar_new_status_text);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.d.a(getAdapterPosition());
            }
        }
    }
}
