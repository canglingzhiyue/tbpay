package tb;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.util.ArrayMap;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AliServiceFindedCallback;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.search.common.util.q;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.mmd.util.e;
import com.taobao.search.sf.a;
import com.taobao.search.sf.datasource.c;
import com.taobao.taobao.R;
import tb.isu;
import tb.isv;

/* loaded from: classes8.dex */
public class nvv extends nvu<AuctionBaseBean> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ise<irq, nvv> CREATOR;

    /* renamed from: a  reason: collision with root package name */
    private AuctionBaseBean f31794a;
    private TextView b;
    private giu c;
    private giu d;
    private git e;

    public static /* synthetic */ Object ipc$super(nvv nvvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.iut
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : "InshopSearchLongPressLayer";
    }

    public static /* synthetic */ AuctionBaseBean a(nvv nvvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AuctionBaseBean) ipChange.ipc$dispatch("b675ebcb", new Object[]{nvvVar}) : nvvVar.f31794a;
    }

    public static /* synthetic */ void a(nvv nvvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f0c3aa", new Object[]{nvvVar, new Boolean(z)});
        } else {
            nvvVar.a(z);
        }
    }

    public static /* synthetic */ TextView b(nvv nvvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("17fbda5f", new Object[]{nvvVar}) : nvvVar.b;
    }

    public static /* synthetic */ git c(nvv nvvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (git) ipChange.ipc$dispatch("73e60608", new Object[]{nvvVar}) : nvvVar.e;
    }

    public static /* synthetic */ giu d(nvv nvvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (giu) ipChange.ipc$dispatch("5b87dc86", new Object[]{nvvVar}) : nvvVar.c;
    }

    public static /* synthetic */ giu e(nvv nvvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (giu) ipChange.ipc$dispatch("4329b2e5", new Object[]{nvvVar}) : nvvVar.d;
    }

    static {
        kge.a(2057700256);
        kge.a(-1201612728);
        CREATOR = new ise<irq, nvv>() { // from class: tb.nvv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public nvv a(irq irqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (nvv) ipChange.ipc$dispatch("f4d88528", new Object[]{this, irqVar}) : new nvv(irqVar.c, irqVar.d, (a) irqVar.e, irqVar.f, irqVar.g);
            }
        };
    }

    private nvv(Activity activity, ium iumVar, a aVar, ViewGroup viewGroup, iur iurVar) {
        super(activity, iumVar, aVar, viewGroup, iurVar);
        this.c = new giu() { // from class: tb.nvv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.giu
            public void onFavSuccess(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
                    return;
                }
                nvv.a(nvv.this).isCollected = true;
                Toast.makeText(nvv.this.getActivity(), b.a(R.string.app_congratulations_collection_success), 0).show();
            }

            @Override // tb.giu
            public void onFavError(int i, String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
                    return;
                }
                nvv.a(nvv.this).isCollected = false;
                Toast.makeText(nvv.this.getActivity(), b.a(R.string.app_favorite_fail), 0).show();
            }

            @Override // tb.giu
            public void onFavSystemError(int i, String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
                    return;
                }
                nvv.a(nvv.this).isCollected = false;
                Toast.makeText(nvv.this.getActivity(), b.a(R.string.app_favorite_fail), 0).show();
            }
        };
        this.d = new giu() { // from class: tb.nvv.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.giu
            public void onFavSuccess(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
                    return;
                }
                nvv.a(nvv.this).isCollected = false;
                Toast.makeText(nvv.this.getActivity(), b.a(R.string.app_cancel_favorite_fail), 0).show();
            }

            @Override // tb.giu
            public void onFavError(int i, String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
                    return;
                }
                nvv.a(nvv.this, true);
                Toast.makeText(nvv.this.getActivity(), b.a(R.string.app_cancel_favorite_fail), 0).show();
            }

            @Override // tb.giu
            public void onFavSystemError(int i, String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
                    return;
                }
                nvv.a(nvv.this, true);
                Toast.makeText(nvv.this.getActivity(), b.a(R.string.app_cancel_favorite_fail), 0).show();
            }
        };
        this.e = new git() { // from class: tb.nvv.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.git
            public void a(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                }
            }

            @Override // tb.git
            public void b(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
                }
            }

            @Override // tb.git
            public void a(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                } else if (nvv.a(nvv.this) == null) {
                } else {
                    nvv.a(nvv.this).isCollected = z;
                    nvv nvvVar = nvv.this;
                    nvvVar.a(nvv.b(nvvVar), z, b.a(R.string.app_already_collected), "#ff5000", b.a(R.string.app_favorite), "#051b28");
                }
            }
        };
        subscribeScopeEvent(this, "childPageWidget");
        getModel().d().subscribe(this);
    }

    public void a(AuctionBaseBean auctionBaseBean, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30119208", new Object[]{this, auctionBaseBean, viewGroup});
            return;
        }
        a();
        this.f31794a = auctionBaseBean;
        a(auctionBaseBean.itemId);
        a(auctionBaseBean);
        a(viewGroup);
        b();
    }

    private void a(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe470c9", new Object[]{this, auctionBaseBean});
        } else if (!auctionBaseBean.isCollected) {
            this.b = a(b.a(R.string.app_favorite), -1, -1, -16777216, this);
        } else {
            this.b = a(b.a(R.string.app_already_collected), -1, -1, Color.parseColor("#051b28"), this);
        }
    }

    private void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            AliAdaptServiceManager.getInstance().findAliAdaptService(giw.class, new AliServiceFindedCallback<giw>() { // from class: tb.nvv.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.adapt.api.AliServiceFindedCallback
                public /* synthetic */ void onServiceFinded(giw giwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9cd135b1", new Object[]{this, giwVar});
                    } else {
                        a(giwVar);
                    }
                }

                public void a(giw giwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea56d2e3", new Object[]{this, giwVar});
                    } else if (giwVar == null) {
                        q.a("InshopSearchLongPressLayer", "favorite service is null");
                    } else {
                        giwVar.setBizCode("search_app");
                        giwVar.isFavoriteItem(str, nvv.c(nvv.this));
                    }
                }
            });
        }
    }

    @Override // tb.nvu, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view instanceof TextView)) {
            a();
        } else if (StringUtils.isEmpty(Login.getSid())) {
            Login.login(true);
        } else {
            c d = getModel().d();
            String charSequence = ((TextView) view).getText().toString();
            if (!StringUtils.equals(charSequence, b.a(R.string.app_favorite)) && !StringUtils.equals(charSequence, b.a(R.string.app_already_collected))) {
                return;
            }
            a(this.b, !this.f31794a.isCollected, b.a(R.string.app_already_collected), "#ff5000", b.a(R.string.app_favorite), "#051b28");
            e();
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("item_id", this.f31794a.itemId);
            arrayMap.put("seller_id", d.getParamValue("sellerId"));
            if (this.f31794a.isCollected) {
                e.a("MoreFavoriteCancel", (ArrayMap<String, String>) arrayMap);
            } else {
                e.a("MoreFavorite", (ArrayMap<String, String>) arrayMap);
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f31794a.isCollected) {
            c(this.f31794a.itemId);
        } else {
            b(this.f31794a.itemId);
        }
    }

    private void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            AliAdaptServiceManager.getInstance().findAliAdaptService(giw.class, new AliServiceFindedCallback<giw>() { // from class: tb.nvv.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.adapt.api.AliServiceFindedCallback
                public /* synthetic */ void onServiceFinded(giw giwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9cd135b1", new Object[]{this, giwVar});
                    } else {
                        a(giwVar);
                    }
                }

                public void a(giw giwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea56d2e3", new Object[]{this, giwVar});
                    } else if (giwVar == null) {
                        q.a("InshopSearchLongPressLayer", "favorite service is null");
                    } else {
                        giwVar.setBizCode("search_app");
                        giwVar.addFavoriteItem(str, nvv.d(nvv.this));
                    }
                }
            });
        }
    }

    private void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            AliAdaptServiceManager.getInstance().findAliAdaptService(giw.class, new AliServiceFindedCallback<giw>() { // from class: tb.nvv.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.adapt.api.AliServiceFindedCallback
                public /* synthetic */ void onServiceFinded(giw giwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9cd135b1", new Object[]{this, giwVar});
                    } else {
                        a(giwVar);
                    }
                }

                public void a(giw giwVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ea56d2e3", new Object[]{this, giwVar});
                    } else if (giwVar == null) {
                        q.a("InshopSearchLongPressLayer", "favorite service is null");
                    } else {
                        giwVar.setBizCode("search_app");
                        giwVar.deleteFavoriteItem(str, nvv.e(nvv.this));
                    }
                }
            });
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(this.b, z, b.a(R.string.app_already_collected), "#ff5000", b.a(R.string.app_favorite), "#051b28");
        }
    }

    public void onEventMainThread(isu.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4858e929", new Object[]{this, eVar});
        } else {
            a();
        }
    }

    public void onEventMainThread(isv.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a0c64ab", new Object[]{this, bVar});
        } else if (!bVar.a()) {
        } else {
            a();
        }
    }
}
