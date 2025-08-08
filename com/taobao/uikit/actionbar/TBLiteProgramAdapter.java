package com.taobao.uikit.actionbar;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes9.dex */
public class TBLiteProgramAdapter extends RecyclerView.Adapter<ViewHolder> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBPublicMenu mMenu;
    private OnItemClickListener mOnItemClickListener;

    /* loaded from: classes9.dex */
    public interface OnItemClickListener {
        void onItemClick(View view, int i);
    }

    /* loaded from: classes9.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TUrlImageView mIconView;
        public TextView mTitleView;

        static {
            kge.a(251822460);
        }

        public ViewHolder(View view) {
            super(view);
            this.mIconView = (TUrlImageView) view.findViewById(R.id.uik_lite_program_icon);
            this.mTitleView = (TextView) view.findViewById(R.id.uik_lite_program_title);
        }
    }

    static {
        kge.a(936333529);
        kge.a(-1201612728);
    }

    public TBLiteProgramAdapter(TBPublicMenu tBPublicMenu) {
        this.mMenu = tBPublicMenu;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7edd3813", new Object[]{this, onItemClickListener});
        } else {
            this.mOnItemClickListener = onItemClickListener;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        OnItemClickListener onItemClickListener = this.mOnItemClickListener;
        if (onItemClickListener == null) {
            return;
        }
        onItemClickListener.onItemClick(view, ((Integer) view.getTag()).intValue());
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("7e0a0138", new Object[]{this, viewGroup, new Integer(i)});
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uik_lite_program_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        inflate.setOnClickListener(this);
        return viewHolder;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbc501c", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        TBPublicMenuItem tBPublicMenuItem = this.mMenu.mExtensionMenu != null ? this.mMenu.mExtensionMenu.get(i) : null;
        if (tBPublicMenuItem == null) {
            return;
        }
        if (!StringUtils.isEmpty(tBPublicMenuItem.getIconUrl())) {
            viewHolder.mIconView.setImageDrawable(null);
            viewHolder.mIconView.setImageUrl(tBPublicMenuItem.getIconUrl());
        } else if (tBPublicMenuItem.getIconDrawable() != null) {
            viewHolder.mIconView.setImageDrawable(tBPublicMenuItem.getIconDrawable());
        } else {
            viewHolder.mIconView.setImageDrawable(null);
        }
        viewHolder.mIconView.invalidate();
        viewHolder.mTitleView.setText(tBPublicMenuItem.getTitle());
        viewHolder.itemView.setTag(Integer.valueOf(i));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        TBPublicMenu tBPublicMenu = this.mMenu;
        if (tBPublicMenu != null && tBPublicMenu.mExtensionMenu != null) {
            return this.mMenu.mExtensionMenu.size();
        }
        return 0;
    }

    /* loaded from: classes9.dex */
    public static class LiteItemDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int space;

        static {
            kge.a(-500487620);
        }

        public LiteItemDecoration(int i) {
            this.space = i;
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else if (recyclerView.getLayoutManager() == null || recyclerView.getChildAdapterPosition(view) == state.getItemCount() - 1) {
            } else {
                rect.right = this.space;
            }
        }
    }
}
