package com.taobao.android.detail.ttdetail.performance;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AsyncViewManager";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, String> f10778a;
    private static final Map<String, d> b;
    private static final ArrayList<Integer> c;
    private b d;

    static {
        kge.a(-576683770);
        f10778a = new ConcurrentHashMap(1);
        b = new ConcurrentHashMap(1);
        c = new ArrayList<Integer>() { // from class: com.taobao.android.detail.ttdetail.performance.PreRenderManager$1
            {
                add(Integer.valueOf(R.layout.tt_detail_horizontal_page_manager));
                add(Integer.valueOf(R.layout.tt_detail_page_manager));
                add(Integer.valueOf(R.layout.tt_detail_action_bar_search_v3));
                add(Integer.valueOf(R.layout.tt_detail_action_bar_search_v3));
                add(Integer.valueOf(R.layout.tt_detail_main_screen_container));
                add(Integer.valueOf(R.layout.tt_detail_gallery_container));
                add(Integer.valueOf(R.layout.tt_detail_frame_component));
                add(Integer.valueOf(R.layout.tt_detail_image_component));
                add(Integer.valueOf(R.layout.tt_detail_video_controller));
                add(Integer.valueOf(R.layout.tt_detail_dinamicx_component));
                add(Integer.valueOf(R.layout.tt_detail_pull_start_holder));
                add(Integer.valueOf(R.layout.tt_detail_pull_end_tips));
                add(Integer.valueOf(R.layout.tt_detail_replace_live_float));
                add(Integer.valueOf(R.layout.tt_taodetail_loading_mask));
                add(Integer.valueOf(R.layout.tt_detail_container_divider));
                add(Integer.valueOf(R.layout.tt_detail_container_divider));
                add(Integer.valueOf(R.layout.tt_detail_horizontal_page_manager_pad));
                add(Integer.valueOf(R.layout.tt_detail_divider_with_text_and_icon));
                add(Integer.valueOf(R.layout.tt_detail_image_component));
                add(Integer.valueOf(R.layout.tt_detail_mini_video_drag_wrapper));
                add(Integer.valueOf(R.layout.tt_detail_mini_video_container));
                add(Integer.valueOf(R.layout.tt_detail_biz_mini_video));
                add(Integer.valueOf(R.layout.tt_detail_hint_banner));
                add(Integer.valueOf(R.layout.tt_detail_indication_container));
                add(Integer.valueOf(R.layout.tt_detail_industry_divider));
                add(Integer.valueOf(R.layout.tt_detail_lightoff_container));
                add(Integer.valueOf(R.layout.tt_detail_weex1_component));
                add(Integer.valueOf(R.layout.tt_detail_weex2_component));
            }
        };
    }

    private d(Context context) {
        this.d = new b(context);
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.d.a(c, viewGroup);
        }
    }

    public View a(Context context, int i, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("d7c2f1a4", new Object[]{this, context, new Integer(i), viewGroup}) : this.d.a(context, i, viewGroup);
    }

    public View a(Context context, int i, ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2ad690f4", new Object[]{this, context, new Integer(i), viewGroup, new Boolean(z)});
        }
        View a2 = this.d.a(context, i, viewGroup);
        return (!z || a2 != null) ? a2 : LayoutInflater.from(context).inflate(i, viewGroup, false);
    }

    public static d a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("28630a41", new Object[]{str}) : b.get(str);
    }

    public static d a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4adacbd3", new Object[]{context});
        }
        String str = f10778a.get(Integer.valueOf(context.hashCode()));
        if (str == null) {
            return null;
        }
        return b.get(str);
    }

    public static void a(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf0e14", new Object[]{eyxVar});
            return;
        }
        int hashCode = eyxVar.g().hashCode();
        String a2 = eyxVar.e().a();
        f10778a.put(Integer.valueOf(hashCode), a2);
        a(a2, eyxVar.g());
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            a(str, f.a());
        }
    }

    private static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e7fbd6", new Object[]{str, context});
        } else if (b.get(str) != null) {
        } else {
            b.put(str, new d(context));
        }
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            b.remove(str);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        String remove = f10778a.remove(Integer.valueOf(context.hashCode()));
        if (remove == null) {
            return;
        }
        c(remove);
    }
}
