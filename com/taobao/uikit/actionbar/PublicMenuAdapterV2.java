package com.taobao.uikit.actionbar;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.effects.c;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes9.dex */
public class PublicMenuAdapterV2 extends RecyclerView.Adapter<ViewHolder> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<TBPublicMenuItem> dataSet;
    private RecyclerView.OnScrollListener onScrollListener;
    private List<TBPublicMenu.TBOnPublicMenuClickListener> customizeListeners = new ArrayList();
    private List<TBPublicMenu.TBOnPublicMenuClickListener> menuListeners = new ArrayList();
    private TBPublicMenuItemObserver mObserver = null;
    private ItemAction itemAction = null;

    /* renamed from: com.taobao.uikit.actionbar.PublicMenuAdapterV2$2  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {
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
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.IMG_TIPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[TBPublicMenuItem.MessageMode.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class GlobalizationViewHolder extends ViewHolder {
        static {
            kge.a(1914898207);
        }

        public GlobalizationViewHolder(View view) {
            super(view);
            if (this.mTitleView != null) {
                this.mTitleView.setLines(2);
                this.mTitleView.setSingleLine(false);
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface ItemAction {
        void onItemExposure(TBPublicMenuItem tBPublicMenuItem);
    }

    /* loaded from: classes9.dex */
    public interface OnItemClickListener {
        void onItemClick(TBPublicMenuItem tBPublicMenuItem);
    }

    static {
        kge.a(2119511025);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(PublicMenuAdapterV2 publicMenuAdapterV2, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ List access$000(PublicMenuAdapterV2 publicMenuAdapterV2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("82747912", new Object[]{publicMenuAdapterV2}) : publicMenuAdapterV2.dataSet;
    }

    public void setItemAction(ItemAction itemAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24b767b3", new Object[]{this, itemAction});
        } else {
            this.itemAction = itemAction;
        }
    }

    public void addOnItemCLickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bda2466", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.menuListeners.add(tBOnPublicMenuClickListener);
        }
    }

    public void clearOnItemClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e614fb3d", new Object[]{this});
        } else {
            this.menuListeners.clear();
        }
    }

    public void addCustomizeCLickListener(TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e221a235", new Object[]{this, tBOnPublicMenuClickListener});
        } else {
            this.customizeListeners.add(tBOnPublicMenuClickListener);
        }
    }

    public void clearCustomizeClickListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af594db4", new Object[]{this});
        } else {
            this.customizeListeners.clear();
        }
    }

    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2b5b5", new Object[]{this, onScrollListener});
        } else {
            this.onScrollListener = onScrollListener;
        }
    }

    public RecyclerView.OnScrollListener getOnScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.OnScrollListener) ipChange.ipc$dispatch("85fdf90b", new Object[]{this}) : this.onScrollListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        UTWrapper.closeByButton = true;
        for (TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener : this.menuListeners) {
            tBOnPublicMenuClickListener.onPublicMenuItemClicked((TBPublicMenuItem) view.getTag());
        }
        for (TBPublicMenu.TBOnPublicMenuClickListener tBOnPublicMenuClickListener2 : this.customizeListeners) {
            tBOnPublicMenuClickListener2.onPublicMenuItemClicked((TBPublicMenuItem) view.getTag());
        }
    }

    public void setDataSet(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5f420e", new Object[]{this, list});
        } else if (list == null) {
        } else {
            this.dataSet = list;
            notifyDataSetChanged();
        }
    }

    public void setDataSet(List<TBPublicMenuItem> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89b286", new Object[]{this, list, new Boolean(z)});
            return;
        }
        if (list != null) {
            this.dataSet = list;
            notifyDataSetChanged();
        }
        if (!z) {
            return;
        }
        bindObserverToItems(list);
    }

    private void bindObserverToItems(List<TBPublicMenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb80feca", new Object[]{this, list});
            return;
        }
        if (this.mObserver == null) {
            this.mObserver = new TBPublicMenuItemObserver() { // from class: com.taobao.uikit.actionbar.PublicMenuAdapterV2.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenuItemObserver
                public void onItemDataChanged(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a1f93487", new Object[]{this, tBPublicMenuItem});
                    } else if (!PublicMenuAdapterV2.access$000(PublicMenuAdapterV2.this).contains(tBPublicMenuItem)) {
                    } else {
                        PublicMenuAdapterV2.this.notifyDataSetChanged();
                    }
                }
            };
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            if (!tBPublicMenuItem.isAddByUikit()) {
                tBPublicMenuItem.setDataChangeObserver(this.mObserver);
            }
        }
    }

    public void removeAllExternalObservers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9949dc", new Object[]{this});
            return;
        }
        List<TBPublicMenuItem> list = this.dataSet;
        if (list == null) {
            return;
        }
        for (TBPublicMenuItem tBPublicMenuItem : list) {
            tBPublicMenuItem.resetDataChangeObserver();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder viewHolder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("2a8c8f3e", new Object[]{this, viewGroup, new Integer(i)});
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uik_public_menu_panel_item, viewGroup, false);
        if (b.c()) {
            viewHolder = new GlobalizationViewHolder(inflate);
        } else {
            viewHolder = new ViewHolder(inflate);
        }
        inflate.setOnClickListener(this);
        return viewHolder;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb5a9a", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        TBPublicMenuItem tBPublicMenuItem = i < this.dataSet.size() ? this.dataSet.get(i) : null;
        viewHolder.itemView.setTag(tBPublicMenuItem);
        if (tBPublicMenuItem == null) {
            return;
        }
        if (tBPublicMenuItem.isVisible()) {
            ItemAction itemAction = this.itemAction;
            if (itemAction != null) {
                itemAction.onItemExposure(tBPublicMenuItem);
            }
            viewHolder.setVisibility(0);
        } else {
            viewHolder.setVisibility(8);
        }
        if (!StringUtils.isEmpty(tBPublicMenuItem.mIconUrl)) {
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
        } else if (!StringUtils.isEmpty(tBPublicMenuItem.mTitle)) {
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
        if (!StringUtils.isEmpty(tBPublicMenuItem.getTitle())) {
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
            viewHolder.mMessageImg.setVisibility(8);
            return;
        }
        int i2 = AnonymousClass2.$SwitchMap$com$taobao$uikit$actionbar$TBPublicMenuItem$MessageMode[tBPublicMenuItem.getMessageMode().ordinal()];
        if (i2 == 1) {
            if (StringUtils.isEmpty(tBPublicMenuItem.mMessage) || "0".equals(tBPublicMenuItem.mMessage)) {
                return;
            }
            viewHolder.mMessageView.setVisibility(0);
            viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_dot_bg);
            viewHolder.mMessageImg.setVisibility(8);
            layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_dot_height);
            layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_dot_width);
            layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_margin_left);
            viewHolder.mMessageView.setLayoutParams(layoutParams);
            viewHolder.mMessageView.setText("");
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (!StringUtils.isEmpty(tBPublicMenuItem.mMessage)) {
                    viewHolder.mMessageImg.setVisibility(8);
                    viewHolder.mMessageView.setVisibility(0);
                    viewHolder.mMessageView.setText(tBPublicMenuItem.mMessage);
                    viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_more_bg);
                    layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                    layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_text_width);
                    layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_text_margin_left);
                    viewHolder.mMessageView.setLayoutParams(layoutParams);
                    viewHolder.mMessageView.setVisibility(0);
                    return;
                }
                viewHolder.mMessageView.setText("");
                viewHolder.mMessageView.setVisibility(8);
                viewHolder.mMessageImg.setVisibility(8);
            } else if (i2 != 4) {
                if (i2 == 5) {
                    viewHolder.mMessageImg.setVisibility(8);
                    viewHolder.mMessageView.setText("");
                    viewHolder.mMessageView.setVisibility(8);
                    return;
                }
                viewHolder.mMessageImg.setVisibility(8);
                viewHolder.mMessageView.setText("");
                viewHolder.mMessageView.setVisibility(8);
            } else {
                viewHolder.mMessageImg.setVisibility(0);
                if (tBPublicMenuItem.getImageTipUri() != null && !tBPublicMenuItem.getImageTipUri().isEmpty()) {
                    viewHolder.mMessageImg.setImageDrawable(null);
                    viewHolder.mMessageImg.setImageUrl(tBPublicMenuItem.getImageTipUri());
                } else if (tBPublicMenuItem.getImageTipResource() != null) {
                    viewHolder.mMessageImg.setImageResource(tBPublicMenuItem.getImageTipResource().intValue());
                }
                viewHolder.mMessageView.setText("");
                viewHolder.mMessageView.setVisibility(8);
            }
        } else {
            try {
                int intValue = Integer.valueOf(tBPublicMenuItem.mMessage).intValue();
                if (intValue > 99) {
                    viewHolder.mMessageView.setVisibility(0);
                    viewHolder.mMessageImg.setVisibility(8);
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
                    viewHolder.mMessageImg.setVisibility(8);
                    viewHolder.mMessageView.setVisibility(0);
                    viewHolder.mMessageView.setText(String.valueOf(intValue));
                    viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_more_bg);
                    layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                    layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_two_width);
                    layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_margin_left);
                    viewHolder.mMessageView.setLayoutParams(layoutParams);
                } else if (intValue > 0) {
                    viewHolder.mMessageImg.setVisibility(8);
                    viewHolder.mMessageView.setVisibility(0);
                    viewHolder.mMessageView.setText(String.valueOf(intValue));
                    viewHolder.mMessageView.setBackgroundResource(R.drawable.uik_action_message_dot_bg);
                    layoutParams.height = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_height);
                    layoutParams.width = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_one_width);
                    layoutParams.leftMargin = (int) viewHolder.itemView.getResources().getDimension(R.dimen.uik_public_menu_message_margin_left);
                    viewHolder.mMessageView.setLayoutParams(layoutParams);
                } else {
                    viewHolder.mMessageView.setVisibility(8);
                    viewHolder.mMessageImg.setVisibility(8);
                }
            } catch (NumberFormatException unused) {
                viewHolder.mMessageView.setText("");
                viewHolder.mMessageView.setVisibility(8);
                viewHolder.mMessageImg.setVisibility(8);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<TBPublicMenuItem> list = this.dataSet;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* loaded from: classes9.dex */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int mDefaultHeight;
        public int mDefaultWeight;
        public TUrlImageView mIconImageView;
        public TIconFontTextView mIconView;
        public TUrlImageView mMessageImg;
        public TextView mMessageView;
        public TextView mTitleView;

        static {
            kge.a(-1535293596);
        }

        public ViewHolder(View view) {
            super(view);
            this.mDefaultHeight = -1;
            this.mDefaultWeight = -1;
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            this.mDefaultHeight = layoutParams.height;
            this.mDefaultWeight = layoutParams.width;
            this.mIconView = (TIconFontTextView) view.findViewById(R.id.uik_public_menu_item_icon);
            this.mIconImageView = (TUrlImageView) view.findViewById(R.id.uik_public_menu_item_image);
            this.mIconImageView.setPhenixOptions(new PhenixOptions().bitmapProcessors(new c()));
            this.mTitleView = (TextView) view.findViewById(R.id.uik_public_menu_item_title);
            this.mMessageView = (TextView) view.findViewById(R.id.uik_public_menu_item_message);
            this.mMessageImg = (TUrlImageView) view.findViewById(R.id.uik_public_menu_item_message_img);
        }

        public void setVisibility(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a5aa2c8", new Object[]{this, new Integer(i)});
                return;
            }
            this.itemView.setVisibility(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.itemView.getLayoutParams();
            if (i == 0) {
                layoutParams.height = this.mDefaultHeight;
                layoutParams.width = this.mDefaultWeight;
            } else {
                layoutParams.height = 0;
                layoutParams.width = 0;
            }
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    /* loaded from: classes9.dex */
    public static class SpacesItemDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Resources mResources;

        static {
            kge.a(1714838691);
        }

        public static /* synthetic */ Object ipc$super(SpacesItemDecoration spacesItemDecoration, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public SpacesItemDecoration(Resources resources) {
            this.mResources = resources;
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else if (recyclerView.getChildAdapterPosition(view) != 0) {
            } else {
                rect.left = dpToPx(6);
            }
        }

        private int dpToPx(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("11e1c020", new Object[]{this, new Integer(i)})).intValue() : Math.round(this.mResources.getDisplayMetrics().density * i);
        }
    }
}
