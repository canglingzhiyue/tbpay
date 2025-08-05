package com.taobao.android.shop.activity;

import android.content.ClipboardManager;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.weex.BarChart;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class PerfPanelFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static List<Pair<Long, Long>> mHistoryActivityPrepare;
    public static List<Pair<Long, Long>> mHistoryFetchMtop;
    public static List<Pair<Long, Long>> mHistoryFrameJSLoad;
    public static List<Pair<Long, Long>> mHistoryFrameJSRender;
    public static List<Pair<Long, Long>> mHistoryInnerJSLoad;
    public static List<Pair<Long, Long>> mHistoryInnerJSRender;
    public static List<Pair<Long, Long>> mHistoryPagedataCdn;
    public static List<Pair<Long, Long>> mHistoryRouter;
    public static List<Pair<Long, Long>> mHistoryTotal;
    private static boolean sBackgroundTransparent;
    private static boolean sIsShowAvg;
    private BarChart mBarChart;
    private View mClose;
    private TextView mDesc;
    private Spinner mPreviousCompare;
    private CheckBox mShowAvg;
    private CheckBox mShowReportLog;
    private CheckBox mShowUrl;
    private TextView mUrlText;
    private CheckBox mUseOnlineJS;
    private CheckBox mUseWeexSDKBackThread;
    private View mWholePanel;
    private int mCompare = -1;
    private View.OnClickListener toggleBackgroundTransparent = new View.OnClickListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (PerfPanelFragment.access$700()) {
                PerfPanelFragment.access$800(PerfPanelFragment.this).setBackgroundColor(PerfPanelFragment.this.getResources().getColor(17170443));
                PerfPanelFragment.access$702(false);
            } else {
                PerfPanelFragment.access$800(PerfPanelFragment.this).setBackgroundColor(Color.parseColor("#80FFFFFF"));
                PerfPanelFragment.access$702(true);
            }
        }
    };

    public static /* synthetic */ Object ipc$super(PerfPanelFragment perfPanelFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue();
        }
        sIsShowAvg = z;
        return z;
    }

    public static /* synthetic */ void access$100(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ffadbd6", new Object[]{perfPanelFragment});
        } else {
            perfPanelFragment.refreshChart();
        }
    }

    public static /* synthetic */ CheckBox access$200(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CheckBox) ipChange.ipc$dispatch("9ad473fa", new Object[]{perfPanelFragment}) : perfPanelFragment.mShowAvg;
    }

    public static /* synthetic */ String access$300(PerfPanelFragment perfPanelFragment, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87f3822a", new Object[]{perfPanelFragment, str, str2, str3}) : perfPanelFragment.colorKey(str, str2, str3);
    }

    public static /* synthetic */ TextView access$400(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("93b66f8d", new Object[]{perfPanelFragment}) : perfPanelFragment.mUrlText;
    }

    public static /* synthetic */ BarChart access$500(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BarChart) ipChange.ipc$dispatch("a0fca2b8", new Object[]{perfPanelFragment}) : perfPanelFragment.mBarChart;
    }

    public static /* synthetic */ int access$602(PerfPanelFragment perfPanelFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d74e38f9", new Object[]{perfPanelFragment, new Integer(i)})).intValue();
        }
        perfPanelFragment.mCompare = i;
        return i;
    }

    public static /* synthetic */ boolean access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f21a642", new Object[0])).booleanValue() : sBackgroundTransparent;
    }

    public static /* synthetic */ boolean access$702(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b87d8598", new Object[]{new Boolean(z)})).booleanValue();
        }
        sBackgroundTransparent = z;
        return z;
    }

    public static /* synthetic */ View access$800(PerfPanelFragment perfPanelFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("71abe01f", new Object[]{perfPanelFragment}) : perfPanelFragment.mWholePanel;
    }

    static {
        kge.a(-486888847);
        sBackgroundTransparent = true;
        sIsShowAvg = false;
        mHistoryTotal = new ArrayList();
        mHistoryRouter = new ArrayList();
        mHistoryActivityPrepare = new ArrayList();
        mHistoryFetchMtop = new ArrayList();
        mHistoryFrameJSLoad = new ArrayList();
        mHistoryFrameJSRender = new ArrayList();
        mHistoryPagedataCdn = new ArrayList();
        mHistoryInnerJSLoad = new ArrayList();
        mHistoryInnerJSRender = new ArrayList();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle}) : layoutInflater.inflate(R.layout.debug_perf_panel, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.mWholePanel = view.findViewById(R.id.perf_panel);
        this.mShowAvg = (CheckBox) view.findViewById(R.id.is_show_avg);
        this.mShowReportLog = (CheckBox) view.findViewById(R.id.is_show_report_log);
        this.mUseWeexSDKBackThread = (CheckBox) view.findViewById(R.id.is_use_weexsdk_back_tread);
        this.mUseOnlineJS = (CheckBox) view.findViewById(R.id.is_use_online_js);
        this.mBarChart = (BarChart) view.findViewById(R.id.bar_chart);
        this.mDesc = (TextView) view.findViewById(R.id.desc);
        this.mClose = view.findViewById(R.id.close);
        this.mPreviousCompare = (Spinner) view.findViewById(R.id.previous_compare);
        this.mShowUrl = (CheckBox) view.findViewById(R.id.show_url);
        this.mUrlText = (TextView) view.findViewById(R.id.url);
        this.mWholePanel.setOnClickListener(this.toggleBackgroundTransparent);
        view.findViewById(R.id.title_area).setOnClickListener(this.toggleBackgroundTransparent);
        getActivity();
        saveData();
        if (!sBackgroundTransparent) {
            this.mWholePanel.setBackgroundColor(getResources().getColor(17170443));
        }
        this.mShowAvg.setChecked(sIsShowAvg);
        if (sIsShowAvg) {
            CheckBox checkBox = this.mShowAvg;
            checkBox.setText("显示平均值(" + mHistoryTotal.size() + "次)");
        }
        this.mShowAvg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                PerfPanelFragment.access$002(z);
                PerfPanelFragment.access$100(PerfPanelFragment.this);
                CheckBox access$200 = PerfPanelFragment.access$200(PerfPanelFragment.this);
                access$200.setText("显示平均值(" + PerfPanelFragment.mHistoryTotal.size() + "次)");
            }
        });
        this.mShowReportLog.setChecked(ShopRenderActivity.sDebugEndableJSReport);
        this.mShowReportLog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                PerfPanelFragment.this.getActivity();
                ShopRenderActivity.sDebugEndableJSReport = z;
            }
        });
        this.mUseWeexSDKBackThread.setChecked(ShopRenderActivity.sDebugDisableWeexSDKBackThread);
        this.mUseWeexSDKBackThread.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                PerfPanelFragment.this.getActivity();
                ShopRenderActivity.sDebugDisableWeexSDKBackThread = z;
            }
        });
        this.mShowUrl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                } else if (!z) {
                    PerfPanelFragment.access$400(PerfPanelFragment.this).setVisibility(8);
                    PerfPanelFragment.access$500(PerfPanelFragment.this).setVisibility(0);
                } else {
                    ShopRenderActivity shopRenderActivity = (ShopRenderActivity) PerfPanelFragment.this.getActivity();
                    ((ClipboardManager) PerfPanelFragment.this.getActivity().getSystemService("clipboard")).setText(shopRenderActivity.mBundleUrl + "\n\n" + shopRenderActivity.mTargetInnerUrl);
                    String access$300 = PerfPanelFragment.access$300(PerfPanelFragment.this, PerfPanelFragment.access$300(PerfPanelFragment.this, PerfPanelFragment.access$300(PerfPanelFragment.this, shopRenderActivity.mBundleUrl + "<p>" + shopRenderActivity.mTargetInnerUrl + "<p>已经复制到剪贴板", "shopId=", "#FF0000"), "sellerId=", "#00FF00"), "shop_navi=", "#0000FF");
                    PerfPanelFragment.access$400(PerfPanelFragment.this).setVisibility(0);
                    PerfPanelFragment.access$400(PerfPanelFragment.this).setText(Html.fromHtml(access$300));
                    PerfPanelFragment.access$500(PerfPanelFragment.this).setVisibility(8);
                }
            }
        });
        this.mUseOnlineJS.setChecked(ShopRenderActivity.sDebugUseOnlineJS);
        this.mUseOnlineJS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                PerfPanelFragment.this.getActivity();
                ShopRenderActivity.sDebugUseOnlineJS = z;
            }
        });
        this.mClose.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    ((ShopRenderActivity) PerfPanelFragment.this.getActivity()).hidePerfPanel();
                }
            }
        });
        this.mDesc.setText(new StringBuilder().toString());
        ArrayList arrayList = new ArrayList();
        for (int i = -1; i < mHistoryTotal.size(); i++) {
            HashMap hashMap = new HashMap();
            if (i == -1) {
                hashMap.put("index", "对比以前数据");
            } else {
                hashMap.put("index", "对比第 " + String.valueOf(i + 1) + " 次");
            }
            arrayList.add(hashMap);
        }
        this.mPreviousCompare.setAdapter((SpinnerAdapter) new SimpleAdapter(getActivity(), arrayList, R.layout.debug_perf_spinner, new String[]{"index"}, new int[]{R.id.index}));
        this.mPreviousCompare.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.taobao.android.shop.activity.PerfPanelFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c3d2c76", new Object[]{this, adapterView});
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view2, int i2, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cb0d7f99", new Object[]{this, adapterView, view2, new Integer(i2), new Long(j)});
                    return;
                }
                PerfPanelFragment.access$602(PerfPanelFragment.this, i2 - 1);
                PerfPanelFragment.access$100(PerfPanelFragment.this);
            }
        });
        refreshChart();
    }

    private String colorKey(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40447a9f", new Object[]{this, str, str2, str3});
        }
        StringBuilder sb = new StringBuilder();
        do {
            int indexOf = str.indexOf(str2, i);
            if (indexOf != -1) {
                int length = str.indexOf("&", str2.length() + indexOf) == -1 ? str.length() : str.indexOf("&", str2.length() + indexOf);
                sb.append(str.substring(i, str2.length() + indexOf));
                sb.append("<font color='" + str3 + "'>");
                sb.append(str.substring(indexOf + str2.length(), length));
                sb.append("</font>");
                i = length;
            } else {
                sb.append(str.substring(i, str.length()));
                i = str.length();
            }
        } while (i < str.length());
        return sb.toString();
    }

    /* loaded from: classes6.dex */
    public class ShopDebugFeature implements CompoundButton.OnCheckedChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(501520684);
            kge.a(1381311248);
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
            }
        }

        private ShopDebugFeature() {
        }
    }

    private void saveData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
            return;
        }
        ShopRenderActivity shopRenderActivity = (ShopRenderActivity) getActivity();
        Pair<Long, Long> pair = (shopRenderActivity.mTotalCost >= 10000 || shopRenderActivity.mTotalCost <= 0) ? new Pair<>(0L, 0L) : new Pair<>(0L, Long.valueOf(shopRenderActivity.mTotalCost));
        Pair<Long, Long> pair2 = (shopRenderActivity.mRouterCost >= 10000 || shopRenderActivity.mRouterCost <= 0) ? new Pair<>(0L, 0L) : new Pair<>(0L, Long.valueOf(shopRenderActivity.mRouterCost));
        Pair<Long, Long> pair3 = new Pair<>(Long.valueOf(shopRenderActivity.mActivityPrepareCostBegin), Long.valueOf(shopRenderActivity.mActivityPrepareCost));
        Pair<Long, Long> pair4 = new Pair<>(Long.valueOf(shopRenderActivity.mDataPrefetchCostBegin), Long.valueOf(shopRenderActivity.mDataPrefetchCost));
        Pair<Long, Long> pair5 = new Pair<>(Long.valueOf(shopRenderActivity.mFrameJSLoadCostBegin), Long.valueOf(shopRenderActivity.mFrameJSLoadCost));
        Pair<Long, Long> pair6 = new Pair<>(Long.valueOf(shopRenderActivity.mFrameJSRenderCostBegin), Long.valueOf(shopRenderActivity.mFrameJSRenderCost));
        Pair<Long, Long> pair7 = new Pair<>(Long.valueOf(shopRenderActivity.mPagedataCostBegin), Long.valueOf(shopRenderActivity.mPagedataCost));
        Pair<Long, Long> pair8 = new Pair<>(Long.valueOf(shopRenderActivity.mInnerJSLoadCostBegin), Long.valueOf(shopRenderActivity.mInnerJSLoadCost));
        Pair<Long, Long> pair9 = new Pair<>(Long.valueOf(shopRenderActivity.mInnerJSRenderCostBegin), Long.valueOf(shopRenderActivity.mInnerJSRenderCost));
        mHistoryTotal.add(pair);
        mHistoryRouter.add(pair2);
        mHistoryActivityPrepare.add(pair3);
        mHistoryFetchMtop.add(pair4);
        mHistoryFrameJSLoad.add(pair5);
        mHistoryFrameJSRender.add(pair6);
        mHistoryPagedataCdn.add(pair7);
        mHistoryInnerJSLoad.add(pair8);
        mHistoryInnerJSRender.add(pair9);
    }

    private void refreshChart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a85d0ca", new Object[]{this});
            return;
        }
        int i = this.mCompare;
        ArrayList arrayList = new ArrayList();
        arrayList.add("Total");
        arrayList.add("router");
        arrayList.add("activityCreate");
        arrayList.add("fetchMtop");
        arrayList.add("frameJSLoad");
        arrayList.add("frameJSRender");
        arrayList.add("pagedataCdn");
        arrayList.add("InnerJSLoad");
        arrayList.add("InnerJSRender");
        if (-1 == i) {
            this.mBarChart.setSectionsAndColumnTitles(new ArrayList(Arrays.asList("时间轴 (从 点击 到 首页的onRenderFinish)")), arrayList);
            this.mBarChart.addTiming(0, 0, getLast(mHistoryTotal), getAvg(mHistoryTotal));
            this.mBarChart.addTiming(0, 1, getLast(mHistoryRouter), getAvg(mHistoryRouter));
            this.mBarChart.addTiming(0, 2, getLast(mHistoryActivityPrepare), getAvg(mHistoryActivityPrepare));
            this.mBarChart.addTiming(0, 3, getLast(mHistoryFetchMtop), getAvg(mHistoryFetchMtop));
            this.mBarChart.addTiming(0, 4, getLast(mHistoryFrameJSLoad), getAvg(mHistoryFrameJSLoad));
            this.mBarChart.addTiming(0, 5, getLast(mHistoryFrameJSRender), getAvg(mHistoryFrameJSRender));
            this.mBarChart.addTiming(0, 6, getLast(mHistoryPagedataCdn), getAvg(mHistoryPagedataCdn));
            this.mBarChart.addTiming(0, 7, getLast(mHistoryInnerJSLoad), getAvg(mHistoryInnerJSLoad));
            this.mBarChart.addTiming(0, 8, getLast(mHistoryInnerJSRender), getAvg(mHistoryInnerJSRender));
            this.mBarChart.requestLayout();
            this.mBarChart.invalidate();
        } else if (i < 0 || i >= mHistoryTotal.size()) {
        } else {
            arrayList.remove("ApmFrameVisible");
            arrayList.remove("ApmFrameInteractive");
            arrayList.remove("ApmInnerVisible");
            arrayList.remove("ApmInnerInteractive");
            this.mBarChart.setSectionsAndColumnTitles(new ArrayList(Arrays.asList("时间轴 (从 点击 到 首页的onRenderFinish)", "对比组")), arrayList);
            this.mBarChart.addTiming(0, 0, getLast(mHistoryTotal), getAvg(mHistoryTotal));
            this.mBarChart.addTiming(0, 1, getLast(mHistoryRouter), getAvg(mHistoryRouter));
            this.mBarChart.addTiming(0, 2, getLast(mHistoryActivityPrepare), getAvg(mHistoryActivityPrepare));
            this.mBarChart.addTiming(0, 3, getLast(mHistoryFetchMtop), getAvg(mHistoryFetchMtop));
            this.mBarChart.addTiming(0, 4, getLast(mHistoryFrameJSLoad), getAvg(mHistoryFrameJSLoad));
            this.mBarChart.addTiming(0, 5, getLast(mHistoryFrameJSRender), getAvg(mHistoryFrameJSRender));
            this.mBarChart.addTiming(0, 6, getLast(mHistoryPagedataCdn), getAvg(mHistoryPagedataCdn));
            this.mBarChart.addTiming(0, 7, getLast(mHistoryInnerJSLoad), getAvg(mHistoryInnerJSLoad));
            this.mBarChart.addTiming(0, 8, getLast(mHistoryInnerJSRender), getAvg(mHistoryInnerJSRender));
            this.mBarChart.addTiming(1, 0, getOne(mHistoryTotal, i), getAvg(mHistoryTotal));
            this.mBarChart.addTiming(1, 1, getOne(mHistoryRouter, i), getAvg(mHistoryRouter));
            this.mBarChart.addTiming(1, 2, getOne(mHistoryActivityPrepare, i), getAvg(mHistoryActivityPrepare));
            this.mBarChart.addTiming(1, 3, getOne(mHistoryFetchMtop, i), getAvg(mHistoryFetchMtop));
            this.mBarChart.addTiming(1, 4, getOne(mHistoryFrameJSLoad, i), getAvg(mHistoryFrameJSLoad));
            this.mBarChart.addTiming(1, 5, getOne(mHistoryFrameJSRender, i), getAvg(mHistoryFrameJSRender));
            this.mBarChart.addTiming(1, 6, getOne(mHistoryPagedataCdn, i), getAvg(mHistoryPagedataCdn));
            this.mBarChart.addTiming(1, 7, getOne(mHistoryInnerJSLoad, i), getAvg(mHistoryInnerJSLoad));
            this.mBarChart.addTiming(1, 8, getOne(mHistoryInnerJSRender, i), getAvg(mHistoryInnerJSRender));
            this.mBarChart.requestLayout();
            this.mBarChart.invalidate();
        }
    }

    private Pair<Float, Float> getAvg(List<Pair<Long, Long>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("f25fbe5e", new Object[]{this, list});
        }
        Long l = 0L;
        Long l2 = 0L;
        for (Pair<Long, Long> pair : list) {
            l = Long.valueOf(l.longValue() + ((Long) pair.first).longValue());
            l2 = Long.valueOf(l2.longValue() + ((Long) pair.second).longValue());
        }
        if (sIsShowAvg) {
            return new Pair<>(Float.valueOf(l.floatValue() / list.size()), Float.valueOf(l2.floatValue() / list.size()));
        }
        return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    private Pair<Long, Long> getLast(List<Pair<Long, Long>> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("adf279ce", new Object[]{this, list}) : list.get(list.size() - 1);
    }

    private Pair<Long, Long> getOne(List<Pair<Long, Long>> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ebea2ee5", new Object[]{this, list, new Integer(i)});
        }
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return new Pair<>(0L, 0L);
    }
}
