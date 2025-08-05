package com.taobao.uikit.extend.component.unify.Dialog;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.utils.TintHelper;
import tb.kge;

/* loaded from: classes9.dex */
public class TBDialogDefaultAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final TBMaterialDialog dialog;
    private final GravityEnum itemGravity;
    private final int layout;

    /* renamed from: com.taobao.uikit.extend.component.unify.Dialog.TBDialogDefaultAdapter$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType = new int[TBMaterialDialog.ListType.values().length];

        static {
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[TBMaterialDialog.ListType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[TBMaterialDialog.ListType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        kge.a(1130579032);
    }

    public static /* synthetic */ Object ipc$super(TBDialogDefaultAdapter tBDialogDefaultAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35312b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public TBDialogDefaultAdapter(TBMaterialDialog tBMaterialDialog, int i) {
        this.dialog = tBMaterialDialog;
        this.layout = i;
        this.itemGravity = tBMaterialDialog.mBuilder.itemsGravity;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (this.dialog.mBuilder.items == null) {
            return 0;
        }
        return this.dialog.mBuilder.items.length;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.dialog.mBuilder.items[i];
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.dialog.getContext()).inflate(this.layout, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.uik_mdTitle);
        int i2 = AnonymousClass1.$SwitchMap$com$taobao$uikit$extend$component$unify$Dialog$TBMaterialDialog$ListType[this.dialog.listType.ordinal()];
        if (i2 == 1) {
            RadioButton radioButton = (RadioButton) view.findViewById(R.id.uik_mdControl);
            boolean z = this.dialog.mBuilder.selectedIndex == i;
            TintHelper.setTint(radioButton, this.dialog.mBuilder.widgetColor);
            radioButton.setChecked(z);
        } else if (i2 == 2) {
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.uik_mdControl);
            boolean contains = this.dialog.selectedIndicesList.contains(Integer.valueOf(i));
            TintHelper.setTint(checkBox, this.dialog.mBuilder.widgetColor);
            checkBox.setChecked(contains);
        }
        textView.setText(this.dialog.mBuilder.items[i].getText());
        TBSimpleListItemType type = this.dialog.mBuilder.items[i].getType();
        if (type != null) {
            if (type == TBSimpleListItemType.NORMAL) {
                textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.uik_mdListItemNormal));
            } else if (type == TBSimpleListItemType.ALERT) {
                textView.setTextColor(ContextCompat.getColor(view.getContext(), R.color.uik_mdListItemAlert));
            }
        } else {
            textView.setTextColor(this.dialog.mBuilder.itemColor);
        }
        view.setTag(i + ":" + this.dialog.mBuilder.items[i]);
        ViewGroup viewGroup2 = (ViewGroup) view;
        setupGravity(viewGroup2);
        if (this.dialog.mBuilder.itemIds != null) {
            if (i < this.dialog.mBuilder.itemIds.length) {
                view.setId(this.dialog.mBuilder.itemIds[i]);
            } else {
                view.setId(-1);
            }
        }
        if (Build.VERSION.SDK_INT >= 21 && viewGroup2.getChildCount() == 2) {
            if (viewGroup2.getChildAt(0) instanceof CompoundButton) {
                viewGroup2.getChildAt(0).setBackground(null);
            } else if (viewGroup2.getChildAt(1) instanceof CompoundButton) {
                viewGroup2.getChildAt(1).setBackground(null);
            }
        }
        return view;
    }

    private void setupGravity(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2bf157", new Object[]{this, viewGroup});
            return;
        }
        ((LinearLayout) viewGroup).setGravity(this.itemGravity.getGravityInt() | 16);
        if (viewGroup.getChildCount() != 2) {
            return;
        }
        if (this.itemGravity == GravityEnum.END && !isRTL() && (viewGroup.getChildAt(0) instanceof CompoundButton)) {
            CompoundButton compoundButton = (CompoundButton) viewGroup.getChildAt(0);
            viewGroup.removeView(compoundButton);
            TextView textView = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView);
            textView.setPadding(textView.getPaddingRight(), textView.getPaddingTop(), textView.getPaddingLeft(), textView.getPaddingBottom());
            viewGroup.addView(textView);
            viewGroup.addView(compoundButton);
        } else if (this.itemGravity != GravityEnum.START || !isRTL() || !(viewGroup.getChildAt(1) instanceof CompoundButton)) {
        } else {
            CompoundButton compoundButton2 = (CompoundButton) viewGroup.getChildAt(1);
            viewGroup.removeView(compoundButton2);
            TextView textView2 = (TextView) viewGroup.getChildAt(0);
            viewGroup.removeView(textView2);
            textView2.setPadding(textView2.getPaddingRight(), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
            viewGroup.addView(compoundButton2);
            viewGroup.addView(textView2);
        }
    }

    private boolean isRTL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ff933d6b", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 17 && this.dialog.getBuilder().getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
