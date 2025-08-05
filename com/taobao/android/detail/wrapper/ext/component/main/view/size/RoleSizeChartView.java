package com.taobao.android.detail.wrapper.ext.component.main.view.size;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.ext.component.desc.viewholder.adapter.size.a;
import com.taobao.android.detail.wrapper.request.size.model.RoleSize;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes5.dex */
public class RoleSizeChartView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mAdapter;
    private Context mContext;
    public RecyclerView mSizeChart;
    public TextView mTvMeasureButton;
    public TextView mTvTip;
    public TextView mTvTitle;
    private View.OnClickListener onClickListener;

    static {
        kge.a(-1633726855);
    }

    public static /* synthetic */ Object ipc$super(RoleSizeChartView roleSizeChartView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RoleSizeChartView(Context context) {
        super(context);
        init(context);
    }

    public RoleSizeChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public RoleSizeChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.view.size.RoleSizeChartView");
        setOrientation(1);
        this.mContext = context;
        View inflate = View.inflate(context, R.layout.x_detail_include_my_size_chart, this);
        this.mTvTitle = (TextView) inflate.findViewById(R.id.tv_my_size_chart_title);
        this.mTvTip = (TextView) inflate.findViewById(R.id.tv_my_size_chart_tip);
        this.mTvMeasureButton = (TextView) inflate.findViewById(R.id.tv_enter_measure);
        this.mSizeChart = (RecyclerView) inflate.findViewById(R.id.rv_my_size_chart);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        this.mSizeChart.setLayoutManager(linearLayoutManager);
    }

    private void hideMeasureButtonOrNot(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7daa285b", new Object[]{this, textView});
        } else if (textView == null) {
        } else {
            textView.setVisibility(8);
            try {
                String a2 = epj.h().a("android_detail", "use_camera_measure", "false");
                if (TextUtils.isEmpty(a2) || !Boolean.parseBoolean(a2)) {
                    return;
                }
                textView.setVisibility(0);
            } catch (Exception e) {
                i.a("Detail-SKU", "fail to parse orange", e);
            }
        }
    }

    public void setMeasureOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c50eb1", new Object[]{this, onClickListener});
            return;
        }
        this.onClickListener = onClickListener;
        this.mTvMeasureButton.setOnClickListener(onClickListener);
    }

    public void fillData(RoleSize roleSize) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243e2c29", new Object[]{this, roleSize});
        } else if (roleSize == null || roleSize.data == null || roleSize.data.isEmpty()) {
        } else {
            this.mTvTitle.setText(roleSize.title == null ? "" : roleSize.title);
            if (TextUtils.isEmpty(roleSize.tip)) {
                this.mTvTip.setVisibility(8);
            } else {
                this.mTvTip.setText(roleSize.tip);
                this.mTvTip.setVisibility(0);
            }
            if (TextUtils.isEmpty(roleSize.arTitle)) {
                this.mTvMeasureButton.setVisibility(8);
            } else {
                this.mTvMeasureButton.setVisibility(0);
                this.mTvMeasureButton.setText(roleSize.arTitle);
            }
            hideMeasureButtonOrNot(this.mTvMeasureButton);
            this.mAdapter = new a(this.mContext);
            this.mAdapter.a(this.mSizeChart);
            this.mAdapter.a(roleSize.data);
            this.mSizeChart.setAdapter(this.mAdapter);
        }
    }

    public void switchMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a495696", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    public HashMap<String, String> getWritableData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4f36180a", new Object[]{this});
        }
        a aVar = this.mAdapter;
        if (aVar == null) {
            return null;
        }
        List<RoleSize.SizeDo> a2 = aVar.a();
        HashMap<String, String> hashMap = new HashMap<>();
        if (a2 == null) {
            return hashMap;
        }
        for (RoleSize.SizeDo sizeDo : a2) {
            hashMap.put(sizeDo.key, sizeDo.value);
        }
        return hashMap;
    }

    public boolean isModified() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad43ed1e", new Object[]{this})).booleanValue();
        }
        a aVar = this.mAdapter;
        return aVar != null && aVar.b();
    }
}
