package tb;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.wrapper.request.size.model.SizeChartItemModel;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class fas extends b<fbg> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_FIRST_COLUMN_WIDTH;
    public static final int DEFAULT_HEIGHT;
    public static final int DEFAULT_TEXT_PADDING;
    public static final int DEFAULT_TEXT_SIZE;
    public static final int DEFAULT_WIDTH;
    private RelativeLayout k;
    private RecyclerView l;
    private RecyclerView m;
    private View n;
    private TextView o;
    private ArrayList<SizeChartItemModel> p;
    private faz q;
    private fay r;

    public static /* synthetic */ Object ipc$super(fas fasVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* bridge */ /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* bridge */ /* synthetic */ void b(fbg fbgVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(fbg fbgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6bb1652", new Object[]{this, fbgVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbg fbgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbgVar})).booleanValue() : b2(fbgVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbg fbgVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbgVar}) : a2(fbgVar);
    }

    static {
        kge.a(-279868889);
        DEFAULT_WIDTH = epo.b(75);
        DEFAULT_FIRST_COLUMN_WIDTH = epo.b(90);
        DEFAULT_HEIGHT = epo.b(38);
        DEFAULT_TEXT_SIZE = epo.b(10);
        DEFAULT_TEXT_PADDING = epo.b(5);
    }

    public fas(Activity activity) {
        super(activity);
        this.k = (RelativeLayout) View.inflate(activity, R.layout.x_detail_desc_measures_layout, null);
        this.m = (RecyclerView) this.k.findViewById(R.id.titleColumn);
        this.l = (RecyclerView) this.k.findViewById(R.id.dataColumn);
        this.n = this.k.findViewById(R.id.shadow);
        this.o = (TextView) this.k.findViewById(R.id.container_title);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.SizeChartViewHolder");
    }

    private void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.setOverScrollMode(2);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<SizeChartItemModel> arrayList = this.p;
        if (arrayList == null || arrayList.isEmpty() || this.p.get(0).rowData == null) {
            return;
        }
        int size = this.p.get(0).rowData.size();
        if (i < 0 || i >= size) {
            return;
        }
        faz fazVar = this.q;
        if (fazVar != null) {
            fazVar.a(i, true);
        }
        fay fayVar = this.r;
        if (fayVar == null) {
            return;
        }
        fayVar.d(i);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbg fbgVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9fe12ecf", new Object[]{this, fbgVar});
        }
        this.p = fbgVar.f27742a;
        ArrayList<SizeChartItemModel> arrayList = this.p;
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.g);
        }
        if (!TextUtils.isEmpty(fbgVar.b)) {
            this.o.setText(fbgVar.b);
            this.o.setVisibility(0);
        }
        int size = this.p.get(0).rowData.size() + 1;
        int i2 = DEFAULT_HEIGHT * size;
        int i3 = (this.p.get(0).maxLength * DEFAULT_TEXT_SIZE) + (DEFAULT_TEXT_PADDING << 1);
        int i4 = DEFAULT_FIRST_COLUMN_WIDTH;
        if (i4 > i3) {
            i3 = i4;
        }
        this.q = new faz(this.g, this.p.get(0));
        this.q.b(i3);
        this.m.setLayoutManager(new LinearLayoutManager(this.g, 1, false));
        a(this.m, i3, i2);
        this.m.setAdapter(this.q);
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 1; i5 < this.p.size(); i5++) {
            SizeChartItemModel sizeChartItemModel = this.p.get(i5);
            if (sizeChartItemModel != null && sizeChartItemModel.rowData != null) {
                int size2 = sizeChartItemModel.rowData.size();
                int i6 = size2;
                while (true) {
                    i = size - 1;
                    if (i6 >= i) {
                        break;
                    }
                    sizeChartItemModel.rowData.add("");
                    i6++;
                }
                for (int i7 = size2 - 1; i7 >= i; i7--) {
                    sizeChartItemModel.rowData.remove(i7);
                }
            }
            arrayList2.add(sizeChartItemModel);
        }
        this.r = new fay(this.g, arrayList2);
        if (!arrayList2.isEmpty()) {
            int width = ((((WindowManager) this.g.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getWidth() - i3) - this.n.getLayoutParams().width) / arrayList2.size();
            int i8 = DEFAULT_WIDTH;
            if (width < i8) {
                width = i8;
            }
            int size3 = arrayList2.size();
            int width2 = this.l.getWidth();
            if (width2 > 0 && size3 * width < width2) {
                width = width2 / size3;
            }
            this.r.a(width);
        }
        this.r.b(i2);
        this.l.setLayoutManager(new LinearLayoutManager(this.g, 0, false));
        a(this.l, -2, i2);
        this.l.setAdapter(this.r);
        return this.k;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.n;
        if (view == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        faz fazVar = this.q;
        if (fazVar == null) {
            return;
        }
        fazVar.a(!z);
    }
}
