package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newsetting.d;
import com.taobao.mytaobao.newsetting.e;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class mvi extends RecyclerView.ViewHolder implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f31281a;
    public View b;
    public ViewGroup c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TIconFontTextView h;
    public View i;
    public int j;
    public List<TextView> k;

    static {
        kge.a(1362343186);
        kge.a(-894912271);
    }

    @Override // com.taobao.mytaobao.newsetting.e
    public List<ViewGroup> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        return null;
    }

    public mvi(View view) {
        super(view);
        this.j = 1;
        this.f31281a = view.findViewById(R.id.pay_setting_page_item_divider_narrow);
        this.b = view.findViewById(R.id.pay_setting_page_item_group_divider);
        this.c = (ViewGroup) view.findViewById(R.id.pay_setting_page_item);
        this.d = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_name);
        this.e = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_subtitle);
        this.f = (TextView) view.findViewById(R.id.tv_pay_setting_page_item_desc);
        this.h = (TIconFontTextView) view.findViewById(R.id.if_pay_setting_page_item_arrow);
        this.i = view.findViewById(R.id.pay_btn_red_dot);
        d();
        d.a().a(this, view.getContext());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.k = new ArrayList();
        this.k.add(this.d);
        this.k.add(this.e);
        this.k.add(this.f);
    }

    @Override // com.taobao.mytaobao.newsetting.e
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.j;
    }

    @Override // com.taobao.mytaobao.newsetting.e
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.j = i;
        }
    }

    @Override // com.taobao.mytaobao.newsetting.e
    public List<TextView> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.k;
    }
}
