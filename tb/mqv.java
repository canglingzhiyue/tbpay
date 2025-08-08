package tb;

import android.content.Context;
import android.support.design.widget.TabLayout;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.utils.d;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes4.dex */
public class mqv implements iyw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f31208a;
    private eyx b;
    private eyq c;
    private boolean d;
    private TabLayout e;

    static {
        kge.a(814824851);
        kge.a(191274323);
    }

    public static /* synthetic */ boolean a(mqv mqvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f5042e4a", new Object[]{mqvVar})).booleanValue() : mqvVar.d;
    }

    public static /* synthetic */ eyq b(mqv mqvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyq) ipChange.ipc$dispatch("77484142", new Object[]{mqvVar}) : mqvVar.c;
    }

    public mqv(Context context, eyx eyxVar, eyq eyqVar) {
        this.f31208a = context;
        this.b = eyxVar;
        this.c = eyqVar;
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = (TabLayout) LayoutInflater.from(this.f31208a).inflate(R.layout.tt_detail_default_gallery_indicator, (ViewGroup) this.c.d(), true).findViewById(R.id.tl_indicator_container);
        this.e.addOnTabSelectedListener(new TabLayout.b() { // from class: tb.mqv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.design.widget.TabLayout.b
            public void onTabReselected(TabLayout.d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("802b1091", new Object[]{this, dVar});
                }
            }

            @Override // android.support.design.widget.TabLayout.b
            public void onTabUnselected(TabLayout.d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fbd0156b", new Object[]{this, dVar});
                }
            }

            @Override // android.support.design.widget.TabLayout.b
            public void onTabSelected(TabLayout.d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e6b72ea4", new Object[]{this, dVar});
                } else if (mqv.a(mqv.this)) {
                } else {
                    mqv.b(mqv.this).b(((ezf) dVar.a()).a());
                }
            }
        });
    }

    @Override // tb.iyw
    public void a(List<ezf> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.e.removeAllTabs();
        this.d = d.a((Feature) this.b.a().a(Feature.class));
        if (this.d) {
            this.e.setVisibility(8);
        } else if (list == null || list.isEmpty() || list.size() == 1) {
            this.e.setVisibility(8);
        } else {
            String i = this.c.i();
            String h = this.c.h();
            int j = this.c.j();
            for (ezf ezfVar : list) {
                String b = ezfVar.b();
                if (j > 1 && StringUtils.equals(ezfVar.a(), i) && !StringUtils.isEmpty(h)) {
                    b = b + "·" + h;
                }
                TabLayout tabLayout = this.e;
                tabLayout.addTab(tabLayout.newTab().a(R.layout.tt_detail_frame_indicator_item).a((CharSequence) b).a(ezfVar));
            }
            this.e.setVisibility(0);
        }
    }

    @Override // tb.iyw
    public void a(String str) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!this.d) {
            String h = this.c.h();
            int j = this.c.j();
            int tabCount = this.e.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabLayout.d tabAt = this.e.getTabAt(i);
                if (tabAt != null) {
                    ezf ezfVar = (ezf) tabAt.a();
                    if (StringUtils.equals(ezfVar.a(), str)) {
                        if (j > 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(ezfVar.b());
                            sb.append(!StringUtils.isEmpty(h) ? "·" + h : "");
                            b = sb.toString();
                        } else {
                            b = ezfVar.b();
                        }
                        if (!StringUtils.equals(tabAt.e(), b)) {
                            tabAt.a((CharSequence) b);
                            final View b2 = tabAt.b();
                            if (b2 != null) {
                                b2.post(new Runnable() { // from class: tb.mqv.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange2 = $ipChange;
                                        if (ipChange2 instanceof IpChange) {
                                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                        } else {
                                            b2.requestLayout();
                                        }
                                    }
                                });
                            }
                        }
                        if (!tabAt.g()) {
                            tabAt.f();
                        }
                    } else {
                        tabAt.a((CharSequence) ezfVar.b());
                    }
                }
            }
        }
    }

    @Override // tb.iyw
    public View getIndicatorView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ef110827", new Object[]{this}) : this.e;
    }
}
