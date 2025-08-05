package com.taobao.android.detail.ttdetail.performance;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10777a;
    private eyx b;
    private View c;

    static {
        kge.a(1654065668);
    }

    public c(Context context, eyx eyxVar, View view) {
        this.f10777a = context;
        this.b = eyxVar;
        this.c = view;
    }

    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 24) {
            return e();
        }
        if (i == 25) {
            return f();
        }
        return false;
    }

    private ViewGroup c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6e13476b", new Object[]{this});
        }
        ViewStub viewStub = (ViewStub) this.c.findViewById(R.id.vs_performance_view_container);
        if (viewStub != null) {
            return (ViewGroup) viewStub.inflate();
        }
        return (ViewGroup) this.c.findViewById(R.id.performance_view_container);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : c().getVisibility() == 0;
    }

    private List<Map.Entry<String, Long>> a(Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{this, map});
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.addAll(map.entrySet());
        return a(arrayList);
    }

    private List<Map.Entry<String, Long>> a(List<Map.Entry<String, Long>> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list}) : a(list, 0, list.size() - 1);
    }

    private List<Map.Entry<String, Long>> a(List<Map.Entry<String, Long>> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e42839ae", new Object[]{this, list, new Integer(i), new Integer(i2)});
        }
        if (i < i2) {
            int b = b(list, i, i2);
            a(list, i, b - 1);
            a(list, b + 1, i2);
        }
        return list;
    }

    private int b(List<Map.Entry<String, Long>> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64a030ad", new Object[]{this, list, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i + 1;
        int i4 = i3;
        while (i3 <= i2) {
            if (list.get(i3).getValue().longValue() < list.get(i).getValue().longValue()) {
                c(list, i3, i4);
                i4++;
            }
            i3++;
        }
        int i5 = i4 - 1;
        c(list, i, i5);
        return i5;
    }

    private void c(List<Map.Entry<String, Long>> list, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed1c9fb", new Object[]{this, list, new Integer(i), new Integer(i2)});
            return;
        }
        list.set(i, list.get(i2));
        list.set(i2, list.get(i));
    }

    private boolean e() {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        if (Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sShowPerformancePanel)) || d()) {
            return false;
        }
        ViewGroup c = c();
        Map<String, Long> b = av.b(this.b);
        if (b != null) {
            ViewGroup viewGroup = (ViewGroup) c.findViewById(R.id.performance_view_real_container);
            viewGroup.removeAllViews();
            long j = -1;
            long j2 = -1;
            for (Map.Entry<String, Long> entry : a(b)) {
                View inflate = LayoutInflater.from(this.f10777a).inflate(R.layout.tt_detail_performance_display_item, c, false);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_performance_delta);
                long longValue = entry.getValue().longValue();
                ((TextView) inflate.findViewById(R.id.tv_performance_stage)).setText(entry.getKey());
                ((TextView) inflate.findViewById(R.id.tv_performance_value)).setText(String.valueOf(longValue));
                textView.setText(j <= 0 ? "0" : String.valueOf(longValue - j));
                if (j2 <= 0) {
                    j2 = longValue;
                }
                viewGroup.addView(inflate);
                j = longValue;
            }
            Map<String, Long> c2 = av.c(this.b);
            String str = (c2 == null || (l = c2.get("lastDxRender")) == null) ? "dx耗时: -1" : "dx耗时: " + l;
            String str2 = "preRt: -1";
            Map<String, Long> d = av.d(this.b);
            String str3 = "sRt: -1";
            if (d != null) {
                Long l2 = d.get("preSRT");
                if (l2 != null) {
                    str2 = "preSRt: " + l2;
                }
                Long l3 = d.get("SRT");
                if (l3 != null) {
                    str3 = "sRt: " + l3;
                }
            }
            ((TextView) this.c.findViewById(R.id.tv_pre_server_rt_time)).setText(str2);
            ((TextView) this.c.findViewById(R.id.tv_server_rt_time)).setText(str3);
            ((TextView) this.c.findViewById(R.id.tv_dx_total_time)).setText(str);
            ((TextView) this.c.findViewById(R.id.tv_tt_detail_total_time)).setText("总耗时: " + (j - j2));
        }
        c.setVisibility(0);
        return true;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        if (Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sShowPerformancePanel)) || !d()) {
            return false;
        }
        c().setVisibility(8);
        return true;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            av.e(this.b);
        }
    }
}
