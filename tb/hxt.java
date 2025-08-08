package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.android.order.bundle.helper.d;
import com.taobao.android.order.bundle.search.common.b;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class hxt extends b implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<TextView> b;
    private View c;

    static {
        kge.a(-685481242);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(hxt hxtVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public hxt(Activity activity) {
        super(activity);
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : R.layout.babel_search_history_holder;
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null || !(view instanceof ViewGroup)) {
        } else {
            this.b = new ArrayList();
            this.c = view.findViewById(R.id.history_ll_two);
            a((ViewGroup) view, this.b);
        }
    }

    @Override // com.taobao.android.order.bundle.search.common.b
    public void a(hxl hxlVar) {
        List<String> list;
        List<TextView> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecda0bfc", new Object[]{this, hxlVar});
        } else if (hxlVar != null && (hxlVar instanceof hxm) && (list = ((hxm) hxlVar).f28834a) != null && !list.isEmpty() && (list2 = this.b) != null && !list2.isEmpty()) {
            for (int i = 0; i < this.b.size(); i++) {
                TextView textView = this.b.get(i);
                if (i >= list.size()) {
                    textView.setText("");
                    textView.setVisibility(4);
                } else {
                    textView.setText(list.get(i));
                    textView.setVisibility(0);
                }
            }
            if (list.size() <= 3) {
                this.c.setVisibility(8);
            } else {
                this.c.setVisibility(0);
            }
        }
    }

    private void a(ViewGroup viewGroup, List<TextView> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6716bf98", new Object[]{this, viewGroup, list});
        } else if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TextView) {
                    childAt.setOnClickListener(this);
                    list.add((TextView) childAt);
                } else if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, list);
                }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view instanceof TextView)) {
        } else {
            a.a("SearchHistory", (Map<String, String>) null);
            String charSequence = ((TextView) view).getText().toString();
            d.b(this.f14568a, charSequence, null);
            if (!StringUtils.isEmpty(charSequence)) {
                hya a2 = hya.a(this.f14568a);
                if (charSequence.length() > 4) {
                    charSequence = charSequence.substring(0, 4);
                }
                a2.a(charSequence.trim());
            }
            if (l.e((Context) this.f14568a)) {
                return;
            }
            this.f14568a.finish();
        }
    }
}
