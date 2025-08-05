package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.e;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nrs extends nqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    public static final int LIST_STUB_HEIGHT;

    public static /* synthetic */ Object ipc$super(nrs nrsVar, String str, Object... objArr) {
        if (str.hashCode() == 1701559371) {
            super.a((HashMap) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.nqm, tb.itd
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "MuiseSuggestCellViewHolder";
    }

    /* loaded from: classes7.dex */
    public static final class a {
        static {
            kge.a(-7680596);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrs(Activity activity, ium parent, ListStyle style, ViewGroup viewGroup, int i, e eVar) {
        super(activity, parent, style, viewGroup, i, eVar);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(style, "style");
    }

    static {
        kge.a(-1042559132);
        Companion = new a(null);
        LIST_STUB_HEIGHT = j.a(41.0f);
    }

    @Override // tb.nqm, com.taobao.android.xsearchplugin.muise.b
    public int a(MuiseBean muiseBean) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b508794", new Object[]{this, muiseBean})).intValue() : LIST_STUB_HEIGHT;
    }

    @Override // tb.nqm
    public void a(HashMap<String, Object> status) {
        String str;
        SearchDoorContext a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, status});
            return;
        }
        q.c(status, "status");
        super.a(status);
        HashMap<String, Object> hashMap = status;
        hashMap.put("index", Integer.valueOf(getAdapterPosition()));
        e j = j();
        if (j == null || (a2 = j.a()) == null || (str = a2.b()) == null) {
            str = "";
        }
        hashMap.put("keyword", str);
        Activity activity = getActivity();
        q.a((Object) activity, "activity");
        hashMap.put(noa.KEY_TB_2024, String.valueOf(poq.a(activity)));
    }

    @Override // tb.nqm, com.taobao.android.xsearchplugin.muise.b
    public void ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab470dad", new Object[]{this});
            return;
        }
        View itemView = this.itemView;
        q.a((Object) itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        View itemView2 = this.itemView;
        q.a((Object) itemView2, "itemView");
        layoutParams.height = itemView2.getMeasuredHeight();
        a((nrs) this.s, m());
    }
}
