package com.taobao.uikit.actionbar;

import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;

/* loaded from: classes9.dex */
public class TBPublicMenuAdapter extends RecyclerView.Adapter<ViewHolder> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBPublicMenu mMenu;
    private OnItemClickListener mOnItemClickListener;

    /* renamed from: com.taobao.uikit.actionbar.TBPublicMenuAdapter$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode = new int[TBPublicMenuItem.MessageMode.values().length];

        static {
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.DOT_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.DOT_WITH_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface OnItemClickListener {
        void onItemClick(TBPublicMenuItem tBPublicMenuItem);
    }

    /* loaded from: classes9.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TUrlImageView mIconImageView;
        public TIconFontTextView mIconView;
        public TextView mMessageView;
        public TextView mTitleView;

        static {
            kge.a(-1020862674);
        }

        public ViewHolder(View view) {
            super(view);
            this.mIconView = (TIconFontTextView) view.findViewById(R.id.uik_public_menu_item_icon);
            this.mIconImageView = (TUrlImageView) view.findViewById(R.id.uik_public_menu_item_image);
            this.mTitleView = (TextView) view.findViewById(R.id.uik_public_menu_item_title);
            this.mMessageView = (TextView) view.findViewById(R.id.uik_public_menu_item_message);
        }
    }

    static {
        kge.a(511479399);
        kge.a(-1201612728);
    }

    public TBPublicMenuAdapter(TBPublicMenu tBPublicMenu) {
        this.mMenu = tBPublicMenu;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff06f31", new Object[]{this, onItemClickListener});
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
        onItemClickListener.onItemClick((TBPublicMenuItem) view.getTag());
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("e115f0b4", new Object[]{this, viewGroup, new Integer(i)});
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uik_public_menu_item_new, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(inflate);
        inflate.setOnClickListener(this);
        return viewHolder;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        TBPublicMenuItem tBPublicMenuItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fedffd64", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        if (i < TBPublicMenu.sPublicMenus.size()) {
            tBPublicMenuItem = TBPublicMenu.sPublicMenus.get(i);
        } else {
            tBPublicMenuItem = i < TBPublicMenu.sPublicMenus.size() + this.mMenu.mExtraMenus.size() ? this.mMenu.mExtraMenus.get(i - TBPublicMenu.sPublicMenus.size()) : null;
        }
        viewHolder.itemView.setTag(tBPublicMenuItem);
        if (tBPublicMenuItem == null) {
            return;
        }
        if (!TextUtils.isEmpty(tBPublicMenuItem.mIconUrl)) {
            viewHolder.mIconView.setVisibility(8);
            viewHolder.mIconImageView.setVisibility(0);
            viewHolder.mIconImageView.setImageDrawable(null);
            viewHolder.mIconImageView.setImageUrl(tBPublicMenuItem.mIconUrl);
            viewHolder.mIconView.setText("");
        } else if (tBPublicMenuItem.mIconDrawable != null) {
            viewHolder.mIconView.setVisibility(8);
            viewHolder.mIconImageView.setVisibility(0);
            viewHolder.mIconImageView.setImageDrawable(tBPublicMenuItem.mIconDrawable);
            viewHolder.mIconView.setText("");
        } else if (!TextUtils.isEmpty(tBPublicMenuItem.mTitle)) {
            viewHolder.mIconView.setVisibility(0);
            viewHolder.mIconImageView.setVisibility(8);
            if (tBPublicMenuItem.getTitle().length() >= 2 && tBPublicMenuItem.getTitle().charAt(1) == ':') {
                viewHolder.mIconView.setText(tBPublicMenuItem.getTitle().substring(0, tBPublicMenuItem.getTitle().indexOf(":")));
            } else {
                viewHolder.mIconView.setText("");
            }
            viewHolder.mIconImageView.setImageDrawable(null);
            viewHolder.mIconView.setVisibility(0);
            viewHolder.mIconImageView.setVisibility(8);
        } else {
            viewHolder.mIconImageView.setImageDrawable(null);
            viewHolder.mIconView.setText("");
        }
        viewHolder.mIconView.invalidate();
        viewHolder.mIconImageView.invalidate();
        if (!TextUtils.isEmpty(tBPublicMenuItem.getTitle())) {
            if (tBPublicMenuItem.getTitle().length() >= 2 && tBPublicMenuItem.getTitle().charAt(1) == ':') {
                viewHolder.mTitleView.setText(tBPublicMenuItem.getTitle().substring(tBPublicMenuItem.getTitle().indexOf(":") + 1, tBPublicMenuItem.getTitle().length()));
            } else {
                viewHolder.mTitleView.setText(tBPublicMenuItem.getTitle());
            }
        } else {
            viewHolder.mTitleView.setText("");
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewHolder.mMessageView.getLayoutParams();
        if (tBPublicMenuItem.getMessageMode() == null) {
            viewHolder.mMessageView.setText("");
            viewHolder.mMessageView.setVisibility(8);
            return;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[tBPublicMenuItem.getMessageMode().ordinal()];
        if (i2 == 1) {
            if (TextUtils.isEmpty(tBPublicMenuItem.mMessage) || "0".equals(tBPublicMenuItem.mMessage)) {
                return;
            }
            viewHolder.mMessageView.setVisibility(0);
            viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_dot_bg);
            layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_dot_height);
            layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_dot_width);
            layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_margin_left);
            viewHolder.mMessageView.setLayoutParams(layoutParams);
            viewHolder.mMessageView.setText("");
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                viewHolder.mMessageView.setText("");
                viewHolder.mMessageView.setVisibility(8);
            } else if (!TextUtils.isEmpty(tBPublicMenuItem.mMessage)) {
                viewHolder.mMessageView.setVisibility(0);
                viewHolder.mMessageView.setText(tBPublicMenuItem.mMessage);
                viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_more_bg);
                layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_text_width);
                layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_text_margin_left);
                viewHolder.mMessageView.setLayoutParams(layoutParams);
                viewHolder.mMessageView.setVisibility(0);
            } else {
                viewHolder.mMessageView.setText("");
                viewHolder.mMessageView.setVisibility(8);
            }
        } else {
            try {
                int intValue = Integer.valueOf(tBPublicMenuItem.mMessage).intValue();
                if (intValue > 99) {
                    viewHolder.mMessageView.setVisibility(0);
                    if (Build.MANUFACTURER.equals("Xiaomi")) {
                        viewHolder.mMessageView.setText("•••");
                    } else {
                        viewHolder.mMessageView.setText("···");
                    }
                    viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_more_bg);
                    layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                    layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_two_width);
                    layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_margin_left);
                    viewHolder.mMessageView.setLayoutParams(layoutParams);
                } else if (intValue >= 10) {
                    viewHolder.mMessageView.setVisibility(0);
                    viewHolder.mMessageView.setText(String.valueOf(intValue));
                    viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_more_bg);
                    layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                    layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_two_width);
                    layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_margin_left);
                    viewHolder.mMessageView.setLayoutParams(layoutParams);
                } else if (intValue > 0) {
                    viewHolder.mMessageView.setVisibility(0);
                    viewHolder.mMessageView.setText(String.valueOf(intValue));
                    viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_dot_bg);
                    layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                    layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_width);
                    layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_margin_left);
                    viewHolder.mMessageView.setLayoutParams(layoutParams);
                } else {
                    viewHolder.mMessageView.setVisibility(8);
                }
            } catch (NumberFormatException unused) {
                viewHolder.mMessageView.setText("");
                viewHolder.mMessageView.setVisibility(8);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : TBPublicMenu.sPublicMenus.size() + this.mMenu.mExtraMenus.size();
    }

    /* loaded from: classes9.dex */
    public static class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean includeEdge;
        private int spacing;
        private int spanCount;

        static {
            kge.a(-1707893885);
        }

        public GridSpacingItemDecoration(int i, int i2, boolean z) {
            this.spanCount = i;
            this.spacing = i2;
            this.includeEdge = z;
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                return;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int i = this.spanCount;
            int i2 = childAdapterPosition % i;
            if (this.includeEdge) {
                int i3 = this.spacing;
                rect.left = i3 - ((i2 * i3) / i);
                rect.right = ((i2 + 1) * i3) / i;
                if (childAdapterPosition < i) {
                    rect.top = i3;
                }
                rect.bottom = this.spacing;
                return;
            }
            int i4 = this.spacing;
            rect.left = (i2 * i4) / i;
            rect.right = i4 - (((i2 + 1) * i4) / i);
            if (childAdapterPosition < i) {
                return;
            }
            rect.top = i4;
        }
    }
}
