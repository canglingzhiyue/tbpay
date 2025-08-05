package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.task.Coordinator;
import com.taobao.android.weex_framework.p;
import com.taobao.android.xsearchplugin.muise.a;
import com.taobao.downgrade.Downgrade;
import com.taobao.downgrade.DowngradeStrategy;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.m3.image.M3ImageView;
import com.taobao.search.m3.widget.M3ListContainer;
import com.taobao.search.m3.widget.M3WfContainer;
import com.taobao.search.performance.PreloadCardContainer;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ipj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout d;
    private ViewGroup e;
    private boolean g;

    /* renamed from: a  reason: collision with root package name */
    private boolean f29206a = false;
    private Map<String, List<p>> b = new HashMap();
    private Map<String, p> c = new HashMap();
    private List<RelativeLayout> f = new ArrayList();
    private List<M3WfContainer> h = new ArrayList(11);
    private List<M3ListContainer> i = new ArrayList(11);

    static {
        kge.a(2050479620);
    }

    public static /* synthetic */ List a(ipj ipjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("48c04dd2", new Object[]{ipjVar}) : ipjVar.f;
    }

    public static /* synthetic */ List b(ipj ipjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("39915531", new Object[]{ipjVar}) : ipjVar.h;
    }

    public static /* synthetic */ List c(ipj ipjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2a625c90", new Object[]{ipjVar}) : ipjVar.i;
    }

    public ipj() {
        boolean z = false;
        if (r.bw() && r.e("preMount")) {
            z = true;
        }
        this.g = z;
    }

    public void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (Build.VERSION.SDK_INT < 26 || !r.e("reloadTab")) {
        } else {
            DowngradeStrategy downgradeStrategy = Downgrade.getInstance().getDowngradeStrategy("search");
            if (downgradeStrategy == null || !TextUtils.equals("degrade", downgradeStrategy.getTacticsPerformance())) {
                z = false;
            }
            final Handler handler = new Handler(Looper.getMainLooper());
            Coordinator.execute(new i() { // from class: tb.ipj.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    FrameLayout frameLayout = new FrameLayout(activity);
                    LayoutInflater from = LayoutInflater.from(activity);
                    for (int i = 0; i < 6; i++) {
                        final RelativeLayout relativeLayout = (RelativeLayout) from.inflate(R.layout.tbsearch_custom_tab, (ViewGroup) frameLayout, false);
                        handler.post(new Runnable() { // from class: tb.ipj.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ipj.a(ipj.this).add(relativeLayout);
                                }
                            }
                        });
                    }
                }
            });
            if (!u.c() && !z) {
                return;
            }
            Coordinator.execute(new i() { // from class: tb.ipj.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    M3ImageView.updateLimitScale();
                    for (int i = 0; i < 11; i++) {
                        final M3WfContainer m3WfContainer = new M3WfContainer(activity);
                        handler.post(new Runnable() { // from class: tb.ipj.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ipj.b(ipj.this).add(m3WfContainer);
                                }
                            }
                        });
                    }
                    for (int i2 = 0; i2 < 11; i2++) {
                        final M3ListContainer m3ListContainer = new M3ListContainer(activity);
                        handler.post(new Runnable() { // from class: tb.ipj.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    ipj.c(ipj.this).add(m3ListContainer);
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public M3WfContainer d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3WfContainer) ipChange.ipc$dispatch("c2860f86", new Object[]{this});
        }
        if (!this.h.isEmpty()) {
            return this.h.remove(0);
        }
        return null;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (view instanceof M3WfContainer) {
            this.h.add((M3WfContainer) view);
        } else if (!(view instanceof M3ListContainer)) {
        } else {
            this.i.add((M3ListContainer) view);
        }
    }

    public M3ListContainer e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M3ListContainer) ipChange.ipc$dispatch("3241a956", new Object[]{this});
        }
        if (!this.i.isEmpty()) {
            return this.i.remove(0);
        }
        return null;
    }

    public RelativeLayout c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("5c8de2fa", new Object[]{this});
        }
        if (!this.f.isEmpty()) {
            return this.f.remove(0);
        }
        return null;
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (!this.g) {
        } else {
            this.d = new PreloadCardContainer(viewGroup.getContext());
            this.e = viewGroup;
            viewGroup.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public void a(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a655d35", new Object[]{this, str, str2, aVar});
        } else if (aVar == null || aVar.e() != null) {
        } else {
            List<p> list = this.b.get(str + str2);
            if (list == null || list.isEmpty()) {
                return;
            }
            p remove = list.remove(0);
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                frameLayout.removeView(remove.getRenderRoot());
            }
            aVar.b(remove);
        }
    }

    public void b(String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e136f6", new Object[]{this, str, str2, aVar});
        } else if (aVar == null || aVar.e() != null) {
        } else {
            p remove = this.c.remove(str + str2);
            if (remove == null) {
                return;
            }
            FrameLayout frameLayout = this.d;
            if (frameLayout != null) {
                frameLayout.removeView(remove.getRenderRoot());
            }
            aVar.b(remove);
        }
    }

    public void b(String str, String str2, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaa3c230", new Object[]{this, str, str2, pVar});
        } else if (pVar == null) {
        } else {
            if (this.f29206a) {
                pVar.destroy();
                return;
            }
            this.c.put(str + str2, pVar);
            FrameLayout frameLayout = this.d;
            if (frameLayout == null) {
                return;
            }
            frameLayout.addView(pVar.getRenderRoot());
        }
    }

    public void a(String str, String str2, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a27091", new Object[]{this, str, str2, pVar});
        } else if (pVar == null) {
        } else {
            if (this.f29206a) {
                pVar.destroy();
                return;
            }
            String str3 = str + str2;
            List<p> list = this.b.get(str3);
            if (list == null) {
                list = new ArrayList<>(6);
                this.b.put(str3, list);
            }
            list.add(pVar);
            FrameLayout frameLayout = this.d;
            if (frameLayout == null) {
                return;
            }
            frameLayout.addView(pVar.getRenderRoot());
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        return this.c.containsKey(str + str2);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (Map.Entry<String, p> entry : this.c.entrySet()) {
            entry.getValue().destroy();
        }
        this.c.clear();
    }

    public void a() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.e;
        if (viewGroup != null && (frameLayout = this.d) != null) {
            viewGroup.removeView(frameLayout);
            this.d.removeAllViews();
        }
        this.f29206a = true;
        for (Map.Entry<String, List<p>> entry : this.b.entrySet()) {
            List<p> value = entry.getValue();
            if (value != null) {
                for (p pVar : value) {
                    pVar.destroy();
                }
                value.clear();
            }
        }
        this.b.clear();
    }
}
