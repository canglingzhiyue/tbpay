package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.quickcomment.bean.QuickCommReport;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class hft implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final String f28599a;
    private final hfs b;
    private ViewGroup c;
    private QuickCommReport d;
    private TextView e;
    private TextView f;

    /* renamed from: lambda$q732ucN2QUlflTw_-8VcPbjP_b8 */
    public static /* synthetic */ void m2443lambda$q732ucN2QUlflTw_8VcPbjP_b8(hft hftVar, String str) {
        hftVar.e(str);
    }

    static {
        kge.a(-698492958);
        kge.a(-1201612728);
        kge.a(331346405);
        f28599a = hft.class.getSimpleName();
    }

    public hft(hfs hfsVar) {
        this.b = hfsVar;
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        this.c = viewGroup;
        if (viewGroup == null) {
            return;
        }
        this.e = (TextView) this.c.findViewById(R.id.taolive_first_quick_comm);
        this.f = (TextView) this.c.findViewById(R.id.taolive_second_quick_comm);
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            hfo.a(new Runnable() { // from class: tb.-$$Lambda$hft$q732ucN2QUlflTw_-8VcPbjP_b8
                @Override // java.lang.Runnable
                public final void run() {
                    hft.m2443lambda$q732ucN2QUlflTw_8VcPbjP_b8(hft.this, str);
                }
            });
        }
    }

    public /* synthetic */ void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        String str2 = f28599a;
        q.c(str2, "[updateQuickCommBubble] commentListString:" + str);
        if (!v.f(str)) {
            d(str);
        } else {
            b();
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d = (QuickCommReport) pqj.a(str, QuickCommReport.class);
        }
    }

    public QuickCommReport a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QuickCommReport) ipChange.ipc$dispatch("f916b5c", new Object[]{this}) : this.d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        CharSequence text = ((TextView) view).getText();
        String charSequence = text != null ? text.toString() : "";
        this.b.editQuickCommonBubbleText(charSequence);
        phg.a().a("Comment_Convenient", (Map<String, String>) c(charSequence));
    }

    private HashMap<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("bd4def17", new Object[]{this, str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        QuickCommReport quickCommReport = this.d;
        if (quickCommReport != null) {
            hashMap.put("item_id", quickCommReport.itemId);
            hashMap.put("content_guide", this.d.guideText);
            hashMap.put("content_convenient", str);
        }
        return hashMap;
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        List list = null;
        if (!v.f(str)) {
            list = (List) pqj.a(str, new TypeReference<LinkedList<String>>() { // from class: tb.hft.1
                {
                    hft.this = this;
                }
            }, new Feature[0]);
        }
        if (list == null || list.isEmpty() || this.c == null) {
            return;
        }
        b();
        if (list.size() == 1) {
            a(this.e, (String) list.get(0));
            return;
        }
        a(this.e, (String) list.get(0));
        a(this.f, (String) list.get(1));
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        TextView textView = this.e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    private void a(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccae9a6", new Object[]{this, textView, str});
            return;
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || textView == null) {
            return;
        }
        viewGroup.setVisibility(0);
        textView.setText(str);
        textView.setVisibility(0);
        textView.setOnClickListener(this);
        phg.a().a("Comment_Convenient", c(str));
    }
}
