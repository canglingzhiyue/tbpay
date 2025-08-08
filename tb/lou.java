package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.a;
import com.taobao.vessel.utils.VesselType;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes7.dex */
public class lou {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f30782a;
    private TUrlImageView b;
    private TBErrorView c;
    private VesselView d;
    private boolean e = false;
    private llj f;
    private Context g;

    static {
        kge.a(432524914);
    }

    public static /* synthetic */ llj a(lou louVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llj) ipChange.ipc$dispatch("fcde63d6", new Object[]{louVar}) : louVar.f;
    }

    public static /* synthetic */ void a(lou louVar, Map map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c64bc5", new Object[]{louVar, map, aVar});
        } else {
            louVar.a(map, aVar);
        }
    }

    public static /* synthetic */ void a(lou louVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7324494e", new Object[]{louVar, new Boolean(z)});
        } else {
            louVar.a(z);
        }
    }

    public static /* synthetic */ boolean b(lou louVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("550212f1", new Object[]{louVar, new Boolean(z)})).booleanValue();
        }
        louVar.e = z;
        return z;
    }

    public lou(Context context) {
        this.g = context;
    }

    public ViewGroup a(llj lljVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bd86aa7", new Object[]{this, lljVar});
        }
        this.f = lljVar;
        if (this.f30782a == null) {
            z = true;
        }
        if (z) {
            this.f30782a = (ViewGroup) LayoutInflater.from(this.g).inflate(R.layout.newuser_multi_tab_loading, (ViewGroup) null);
            this.b = (TUrlImageView) this.f30782a.findViewById(R.id.tab_loading);
            this.c = b(this.f30782a);
            this.d = a(this.f30782a);
        }
        a(z, this.d, lljVar);
        a(true);
        return this.f30782a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VesselView vesselView = this.d;
        if (vesselView != null) {
            vesselView.onDestroy();
            this.d = null;
        }
        if (this.f30782a != null) {
            this.f30782a = null;
        }
        if (this.b == null) {
            return;
        }
        this.b = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f30782a;
        if (viewGroup == null || !(viewGroup.getParent() instanceof FrameLayout)) {
            return;
        }
        ((FrameLayout) this.f30782a.getParent()).removeAllViews();
    }

    private VesselView a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("9b302b1d", new Object[]{this, viewGroup});
        }
        VesselView vesselView = (VesselView) viewGroup.findViewById(R.id.tab_vessel);
        vesselView.setDowngradeEnable(false);
        vesselView.setVesselViewCallback(c());
        vesselView.setOnLoadListener(d());
        return vesselView;
    }

    private TBErrorView b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("a16b481", new Object[]{this, viewGroup});
        }
        TBErrorView tBErrorView = (TBErrorView) viewGroup.findViewById(R.id.tab_error);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        tBErrorView.setStatus(TBErrorView.Status.STATUS_ERROR);
        tBErrorView.setTitle(ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
        tBErrorView.setSubTitle("别紧张，试试看刷新页面~");
        tBErrorView.setButton(TBErrorView.ButtonType.BUTTON_LEFT, "刷新", new View.OnClickListener() { // from class: tb.lou.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                lou.a(lou.this, true);
                lou louVar = lou.this;
                louVar.a(lou.a(louVar));
            }
        });
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 0);
        return tBErrorView;
    }

    private rgw c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rgw) ipChange.ipc$dispatch("1e6d533a", new Object[]{this}) : new rgw() { // from class: tb.lou.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgw
            public void a(Map<String, Object> map, a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                    return;
                }
                lou.b(lou.this, false);
                lou.a(lou.this, map, aVar);
            }
        };
    }

    private void a(Map<String, Object> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
        } else if (map == null || !(map.get("event") instanceof String)) {
        } else {
            String str = (String) map.get("event");
            if (StringUtils.isEmpty(str)) {
                return;
            }
            if ("TBHomeWeexGetTabInfo".equals(str) && aVar != null) {
                aVar.invoke(this.f.c().b().getInnerMap());
            } else if (!"TBHomeWeexRenderFinished".equals(str)) {
            } else {
                a(this.f.c(), map);
            }
        }
    }

    private void a(llk llkVar, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957a3fd8", new Object[]{this, llkVar, map});
            return;
        }
        Map<String, Object> innerMap = llkVar.b().getInnerMap();
        String str = innerMap.get(e.KEY_TAB_ID) instanceof String ? (String) innerMap.get(e.KEY_TAB_ID) : "";
        if (str == null || !str.equals(map.get(e.KEY_TAB_ID))) {
            z = false;
        }
        if (!z) {
            return;
        }
        this.c.setVisibility(4);
        this.b.setVisibility(4);
    }

    private rgu d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rgu) ipChange.ipc$dispatch("261ef85b", new Object[]{this}) : new rgu() { // from class: tb.lou.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                }
            }

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c38c0593", new Object[]{this, view});
                }
            }

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f829aa04", new Object[]{this});
                }
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                    return;
                }
                lou.a(lou.this, false);
                lou.b(lou.this, true);
            }
        };
    }

    private void a(boolean z, VesselView vesselView, llj lljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b49562c0", new Object[]{this, new Boolean(z), vesselView, lljVar});
        } else if (z || this.e) {
            vesselView.loadUrl(VesselType.Weex, lljVar.a(), null);
        } else {
            vesselView.fireEvent("TBHomeNativeTabChanged", lljVar.c().b().getInnerMap());
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.b.setVisibility(0);
            this.c.setVisibility(4);
        } else {
            this.b.setVisibility(4);
            this.c.setVisibility(0);
        }
    }
}
