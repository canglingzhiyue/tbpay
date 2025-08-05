package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.TimeShiftContentFrame;
import com.taobao.taolive.movehighlight.utils.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public class pft extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a c;
    private Context d;
    private List<JSONObject> e;
    private com.taobao.alilive.aliliveframework.frame.a g;
    private int f = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32606a = false;
    public int b = 0;

    /* loaded from: classes8.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes8.dex */
    public class b extends RecyclerView.ViewHolder {
        static {
            kge.a(39817876);
        }

        public b(View view) {
            super(view);
        }
    }

    static {
        kge.a(2052357694);
    }

    public static /* synthetic */ Object ipc$super(pft pftVar, String str, Object... objArr) {
        if (str.hashCode() == -1079446313) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(pft pftVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3753415c", new Object[]{pftVar, new Integer(i)})).intValue();
        }
        pftVar.f = i;
        return i;
    }

    public static /* synthetic */ com.taobao.alilive.aliliveframework.frame.a a(pft pftVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("16d6f48f", new Object[]{pftVar}) : pftVar.g;
    }

    public pft(Context context, List<JSONObject> list, com.taobao.alilive.aliliveframework.frame.a aVar) {
        this.d = context;
        this.g = aVar;
        if (this.e == null) {
            this.e = new ArrayList();
        }
        a(list);
    }

    public void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (this.e != null && list != null) {
            for (JSONObject jSONObject : list) {
                if (!a(jSONObject)) {
                    this.e.add(jSONObject);
                }
            }
            notifyDataSetChanged();
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            for (JSONObject jSONObject2 : this.e) {
                if (jSONObject2 != null && jSONObject2.getString("timeMovingId") != null && jSONObject.getString("timeMovingId") != null && jSONObject2.getString("timeMovingId").equals(jSONObject.getString("timeMovingId"))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public RecyclerView.ViewHolder mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)});
        }
        List<JSONObject> list = this.e;
        if (list != null && list.size() == 1) {
            return a("highlight_content_single");
        }
        return a("highlight_content_list_item");
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, viewHolder, new Integer(i)});
        } else if (i >= this.e.size()) {
        } else {
            a(i);
            final JSONObject jSONObject = this.e.get(i);
            if (jSONObject == null) {
                return;
            }
            if (i == TimeShiftContentFrame.selectedPosition) {
                jSONObject.put("isSelected", (Object) true);
            } else {
                jSONObject.put("isSelected", (Object) false);
            }
            pfx.a().a((DXRootView) viewHolder.itemView, (JSONObject) jSONObject.clone(), this.g);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: tb.pft.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    pfb.a(pft.a(pft.this)).e().a(jSONObject);
                    TimeShiftContentFrame.selectedPosition = i;
                    pft.this.notifyDataSetChanged();
                    o.a(pft.a(pft.this), "timeshiftlayer-tocontent", (String) null);
                }
            });
            o.a(this.g, "Show-timeshift-contentlist", (HashMap<String, String>) null);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.e.size();
    }

    private b a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("2e94acd8", new Object[]{this, str});
        }
        DXRootView a2 = pfx.a().a(this.d, str);
        if (a2 == null) {
            return new b(new View(this.d));
        }
        return new b(a2);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa8f4d7", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: tb.pft.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == 2142696127) {
                    super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v7.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView2, new Integer(i)});
                    return;
                }
                pft.a(pft.this, i);
                super.onScrollStateChanged(recyclerView2, i);
            }
        });
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.c == null || i != Math.max((getItemCount() - 1) - this.b, 0) || this.f == 0 || this.f32606a) {
        } else {
            this.f32606a = true;
            this.c.a();
        }
    }

    public void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a34c26", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        this.c = aVar;
        this.b = i;
    }
}
