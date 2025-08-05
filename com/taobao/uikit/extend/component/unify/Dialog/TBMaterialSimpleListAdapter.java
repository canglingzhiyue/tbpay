package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes9.dex */
public class TBMaterialSimpleListAdapter extends ArrayAdapter<TBMaterialSimpleListItem> implements TBDialogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBMaterialDialog dialog;

    static {
        kge.a(-1919364234);
        kge.a(964087813);
    }

    public static /* synthetic */ Object ipc$super(TBMaterialSimpleListAdapter tBMaterialSimpleListAdapter, String str, Object... objArr) {
        if (str.hashCode() == 662623122) {
            return super.getView(((Number) objArr[0]).intValue(), (View) objArr[1], (ViewGroup) objArr[2]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
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

    public TBMaterialSimpleListAdapter(Context context) {
        super(context, R.layout.uik_md_simplelist_item, 16908310);
    }

    @Override // com.taobao.uikit.extend.component.unify.Dialog.TBDialogAdapter
    public void setDialog(TBMaterialDialog tBMaterialDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1effa7f", new Object[]{this, tBMaterialDialog});
        } else {
            this.dialog = tBMaterialDialog;
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        View view2 = super.getView(i, view, viewGroup);
        if (this.dialog != null) {
            TBMaterialSimpleListItem item = getItem(i);
            ImageView imageView = (ImageView) view2.findViewById(16908294);
            if (item.getIcon() != null) {
                imageView.setImageDrawable(item.getIcon());
                imageView.setPadding(item.getIconPadding(), item.getIconPadding(), item.getIconPadding(), item.getIconPadding());
                imageView.getBackground().setColorFilter(item.getBackgroundColor(), PorterDuff.Mode.SRC_ATOP);
            } else {
                imageView.setVisibility(8);
            }
            TextView textView = (TextView) view2.findViewById(16908310);
            textView.setTextColor(this.dialog.getBuilder().getItemColor());
            textView.setText(item.getContent());
        }
        return view2;
    }
}
