package com.taobao.android.detail.core.perf;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.perf.widget.BarChart;
import com.taobao.android.detail.core.performance.o;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import tb.emu;
import tb.epv;
import tb.kge;

/* loaded from: classes4.dex */
public class PerfTimelineFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BarChart mBarChart;
    private TextView mDesc;
    private TextView mTextView;

    static {
        kge.a(475843163);
    }

    public static /* synthetic */ Object ipc$super(PerfTimelineFragment perfTimelineFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static PerfTimelineFragment getInstance(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerfTimelineFragment) ipChange.ipc$dispatch("a7ff03ac", new Object[]{jSONObject});
        }
        PerfTimelineFragment perfTimelineFragment = new PerfTimelineFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("protocol", jSONObject);
        perfTimelineFragment.setArguments(bundle);
        return perfTimelineFragment;
    }

    public PerfTimelineFragment() {
        emu.a("com.taobao.android.detail.core.perf.PerfTimelineFragment");
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : layoutInflater.inflate(R.layout.x_detail_perf_timeline, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.mBarChart = (BarChart) view.findViewById(R.id.bar_chart);
        this.mTextView = (TextView) view.findViewById(R.id.title);
        this.mDesc = (TextView) view.findViewById(R.id.desc);
        TextView textView = this.mTextView;
        Object[] objArr = new Object[1];
        objArr[0] = epv.f27513a ? "极速版" : "非极速版";
        textView.setText(String.format("详情性能大盘(%s)", objArr));
        this.mDesc.setText("DAsyncView:" + epv.c + ";DSkuModel:" + epv.d + ";DUltronCache:" + epv.e + ";");
        Map<String, Integer> dataFilter = dataFilter(o.a().b());
        this.mBarChart.setSectionsAndColumnTItles(new ArrayList(Arrays.asList("详情性能大盘")), new ArrayList(dataFilter.keySet()));
        int i = 0;
        for (Map.Entry<String, Integer> entry : dataFilter.entrySet()) {
            this.mBarChart.addTiming(0, i, entry.getValue().intValue());
            i++;
        }
    }

    private Map<String, Integer> dataFilter(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e0d41e51", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if (!StringUtils.isEmpty(value) && isNumeric(value)) {
                    hashMap.put(entry.getKey(), Integer.valueOf(value));
                }
            }
        }
        return hashMap;
    }

    public boolean isNumeric(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b5c88d8", new Object[]{this, str})).booleanValue() : Pattern.compile("[0-9]*").matcher(str).matches();
    }
}
