package com.network.diagnosis.product;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes4.dex */
public class ContentView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context mContext;

    public ContentView(Context context) {
        super(context);
        this.mContext = context;
    }

    public ContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
    }

    public void setContent(List<Pair<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1cdfaf", new Object[]{this, list});
            return;
        }
        removeAllViews();
        int i = 0;
        while (i < list.size()) {
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.mContext).inflate(R.layout.network_diagnosis_result, (ViewGroup) null);
            int i2 = i + 1;
            ((TextView) linearLayout.findViewById(R.id.content_seq)).setText(String.format("%02d", Integer.valueOf(i2)));
            Pair<String, String> pair = list.get(i);
            ((TextView) linearLayout.findViewById(R.id.content_title)).setText((CharSequence) pair.first);
            ((TextView) linearLayout.findViewById(R.id.content_info)).setText((CharSequence) pair.second);
            addView(linearLayout);
            i = i2;
        }
        invalidate();
    }
}
