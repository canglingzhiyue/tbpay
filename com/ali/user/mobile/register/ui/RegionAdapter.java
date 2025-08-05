package com.ali.user.mobile.register.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.model.RegionInfo;
import com.ali.user.mobile.ui.widget.AUPinnedHeaderListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class RegionAdapter extends BaseAdapter implements AUPinnedHeaderListView.PinnedHeaderAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<RegionInfo> list;
    private Context mContext;
    private RegionInfo mCurrentRegion;
    private boolean textNumberTogether;

    /* loaded from: classes2.dex */
    public class ViewHolder {
        public LinearLayout mHeaderLayout;
        public TextView mHeaderText;
        public View mRegionDivider;
        public View mRegionDivider2;
        public TextView mRegionNubmerText;
        public ImageView mRegionSelectIcon;
        public TextView mRegiontNameText;

        static {
            kge.a(-494002607);
        }

        public ViewHolder() {
        }
    }

    static {
        kge.a(-205166812);
        kge.a(1494728634);
    }

    @Override // com.ali.user.mobile.ui.widget.AUPinnedHeaderListView.PinnedHeaderAdapter
    public void configurePinnedHeader(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b734660", new Object[]{this, view, new Integer(i), new Integer(i2)});
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    @Override // com.ali.user.mobile.ui.widget.AUPinnedHeaderListView.PinnedHeaderAdapter
    public int getPinnedHeaderState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7debeb9", new Object[]{this, new Integer(i)})).intValue();
        }
        return 0;
    }

    public void setTextNumberTogether(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9802633b", new Object[]{this, new Boolean(z)});
        } else {
            this.textNumberTogether = z;
        }
    }

    public RegionAdapter(Context context, List<RegionInfo> list) {
        this.list = null;
        this.list = list;
        this.mContext = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.list.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)}) : this.list.get(i);
    }

    public void setSelectedItem(RegionInfo regionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff833ed6", new Object[]{this, regionInfo});
        } else {
            this.mCurrentRegion = regionInfo;
        }
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        View inflate = LayoutInflater.from(DataProviderFactory.getApplicationContext()).inflate(R.layout.aliuser_region, (ViewGroup) null);
        ViewHolder viewHolder = new ViewHolder();
        viewHolder.mHeaderLayout = (LinearLayout) inflate.findViewById(R.id.contact_item_head);
        viewHolder.mHeaderText = (TextView) inflate.findViewById(R.id.contact_item_header_text);
        viewHolder.mRegiontNameText = (TextView) inflate.findViewById(R.id.region_name);
        viewHolder.mRegionNubmerText = (TextView) inflate.findViewById(R.id.region_number);
        viewHolder.mRegionSelectIcon = (ImageView) inflate.findViewById(R.id.region_select);
        viewHolder.mRegionDivider = inflate.findViewById(R.id.aliuser_region_divider);
        viewHolder.mRegionDivider2 = inflate.findViewById(R.id.aliuser_region_divider2);
        RegionInfo regionInfo = this.list.get(i);
        if (regionInfo.isDisplayLetter) {
            viewHolder.mHeaderLayout.setVisibility(0);
            if (!this.textNumberTogether) {
                viewHolder.mHeaderLayout.setBackgroundColor(this.mContext.getResources().getColor(R.color.aliuser_region_bg_color));
            } else {
                viewHolder.mRegionDivider.setVisibility(0);
            }
            viewHolder.mHeaderText.setText(regionInfo.character);
            inflate.setBackgroundColor(-1);
        } else {
            viewHolder.mHeaderLayout.setVisibility(8);
            if (this.textNumberTogether) {
                viewHolder.mRegionDivider.setVisibility(8);
            }
        }
        if (this.textNumberTogether) {
            TextView textView = viewHolder.mRegiontNameText;
            textView.setText(regionInfo.name + "      (" + regionInfo.code + riy.BRACKET_END_STR);
            viewHolder.mRegionDivider2.setVisibility(0);
        } else {
            viewHolder.mRegionDivider2.setVisibility(8);
            viewHolder.mRegiontNameText.setText(regionInfo.name);
            viewHolder.mRegionNubmerText.setText(regionInfo.code);
        }
        RegionInfo regionInfo2 = this.mCurrentRegion;
        if (regionInfo2 != null && !TextUtils.isEmpty(regionInfo2.domain) && this.mCurrentRegion.domain.equals(regionInfo.domain)) {
            viewHolder.mRegionSelectIcon.setVisibility(0);
        } else {
            viewHolder.mRegionNubmerText.setTextColor(this.mContext.getResources().getColor(R.color.aliuser_color_light_gray));
            viewHolder.mRegiontNameText.setTextColor(this.mContext.getResources().getColor(R.color.aliuser_color_black));
            viewHolder.mRegionSelectIcon.setVisibility(4);
        }
        if (viewHolder.mRegionSelectIcon.getVisibility() == 0) {
            viewHolder.mRegiontNameText.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            viewHolder.mRegiontNameText.setTypeface(Typeface.defaultFromStyle(0));
        }
        return inflate;
    }
}
