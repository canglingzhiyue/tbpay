package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.request.b;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.base.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class fbw extends c<fcg> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String g;
    public static String h;
    public static String i;
    private Context j;
    private fcg k;
    private VesselView l;
    private FrameLayout m;
    private int n;
    private rgu o;

    public static /* synthetic */ Object ipc$super(fbw fbwVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context a(fbw fbwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5c858db5", new Object[]{fbwVar}) : fbwVar.f9568a;
    }

    public static /* synthetic */ void a(fbw fbwVar, Map map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18ba2e", new Object[]{fbwVar, map, aVar});
        } else {
            fbwVar.a(map, aVar);
        }
    }

    public static /* synthetic */ FrameLayout b(fbw fbwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("bcbbf5db", new Object[]{fbwVar}) : fbwVar.m;
    }

    public static /* synthetic */ void c(fbw fbwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54562bf", new Object[]{fbwVar});
        } else {
            fbwVar.f();
        }
    }

    public static /* synthetic */ Context d(fbw fbwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("977d0838", new Object[]{fbwVar}) : fbwVar.j;
    }

    public static /* synthetic */ fcg e(fbw fbwVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fcg) ipChange.ipc$dispatch("ca14b99b", new Object[]{fbwVar}) : fbwVar.k;
    }

    static {
        kge.a(-309793097);
        g = "method";
        h = "show";
        i = "hide";
    }

    public fbw(Context context) {
        super(context);
        this.o = new rgu() { // from class: tb.fbw.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgu
            public void onLoadFinish(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c38c0593", new Object[]{this, view});
                }
            }

            @Override // tb.rgu
            public void onLoadStart() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f829aa04", new Object[]{this});
                } else if (!ecu.h) {
                } else {
                    Toast.makeText(fbw.a(fbw.this), "onLoad", 0).show();
                }
            }

            @Override // tb.rgu
            public void onLoadError(rgy rgyVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d36981b6", new Object[]{this, rgyVar});
                    return;
                }
                fbw.b(fbw.this).setVisibility(8);
                fbw.c(fbw.this);
                Context d = fbw.d(fbw.this);
                String str = "";
                String str2 = fbw.e(fbw.this) != null ? fbw.e(fbw.this).c : str;
                if (fbw.e(fbw.this) != null) {
                    str = fbw.e(fbw.this).f27791a;
                }
                ecg.d(d, str2, str, rgyVar.f33150a, rgyVar.b);
            }

            @Override // tb.rgu
            public void onDowngrade(rgy rgyVar, Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("775d4b7c", new Object[]{this, rgyVar, map});
                    return;
                }
                fbw.b(fbw.this).setVisibility(8);
                fbw.c(fbw.this);
            }
        };
        this.j = context;
        this.m = new FrameLayout(context);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.WeexVesselViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup}) : this.m;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(fcg fcgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e846274e", new Object[]{this, fcgVar});
            return;
        }
        this.k = fcgVar;
        if (fcgVar == null) {
            return;
        }
        c();
        this.l.loadUrl(b(fcgVar));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.l.onDestroy();
        this.j = null;
    }

    private String b(fcg fcgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54463eb1", new Object[]{this, fcgVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", fcgVar.c);
        hashMap.put("sellerId", fcgVar.d);
        hashMap.put(b.f9819a, b.b);
        new HashMap();
        return a(fcgVar.f27791a, hashMap);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.l == null) {
            this.l = new VesselView(this.j);
        }
        if (!TextUtils.isEmpty(((fcg) this.c).f27791a)) {
            this.l.setLayoutParams(new FrameLayout.LayoutParams(-1, this.n));
        }
        this.l.setDowngradeEnable(false);
        this.l.setOnLoadListener(this.o);
        this.l.setVesselViewCallback(new rgw() { // from class: tb.fbw.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rgw
            public void a(Map<String, Object> map, a aVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
                } else {
                    fbw.a(fbw.this, map, aVar);
                }
            }
        });
    }

    private void a(Map<String, Object> map, a aVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab6dfe3", new Object[]{this, map, aVar});
        } else if (map == null || !map.containsKey(g) || (obj = map.get(g)) == null || !(obj instanceof String)) {
        } else {
            String str = (String) obj;
            if (h.equals(str)) {
                d();
            }
            if (!i.equals(str)) {
                return;
            }
            e();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.l.getParent() == null) {
            this.m.addView(this.l);
        }
        this.n = (int) (((this.k.b * 2.0d) / 750.0d) * epo.b);
        this.l.setLayoutParams(new FrameLayout.LayoutParams(-1, this.n));
        this.m.setLayoutParams(new AbsListView.LayoutParams(-1, this.n));
        this.m.setVisibility(0);
        this.m.requestLayout();
        f();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.m.setVisibility(8);
        f();
    }

    private void f() {
        dya y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Context context = this.j;
        if (!(context instanceof DetailCoreActivity) || (y = ((DetailCoreActivity) context).y()) == null || y.k == null) {
            return;
        }
        y.k.d();
    }

    private String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{this, str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (map != null && map.size() > 0) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            if (str.contains("?")) {
                sb.append("&");
            } else {
                sb.append("?");
            }
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append(next.getKey());
                sb.append("=");
                sb.append(next.getValue());
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        }
        String sb2 = sb.toString();
        String[] split = sb2.split("_wx_tpl=");
        return (split == null || split.length < 2) ? sb2 : split[1];
    }
}
