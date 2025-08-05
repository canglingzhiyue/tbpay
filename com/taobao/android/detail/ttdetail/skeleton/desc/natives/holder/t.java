package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.SizeChartItemModel;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.kge;
import tb.syo;
import tb.syp;

/* loaded from: classes5.dex */
public class t extends e<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_FIRST_COLUMN_WIDTH;
    public static final int DEFAULT_HEIGHT;
    public static final int DEFAULT_TEXT_PADDING;
    public static final int DEFAULT_TEXT_SIZE;
    public static final int DEFAULT_WIDTH;
    private RelativeLayout g;
    private RecyclerView h;
    private RecyclerView i;
    private View j;
    private TextView k;
    private ArrayList<SizeChartItemModel> l;
    private syp m;
    private syo n;

    public static /* synthetic */ Object ipc$super(t tVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* bridge */ /* synthetic */ void b(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.t tVar) {
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    public boolean b2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a26175", new Object[]{this, tVar})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ boolean a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.t tVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cded6523", new Object[]{this, tVar})).booleanValue() : b2(tVar);
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e
    public /* synthetic */ View c(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.t tVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("a0b54ca3", new Object[]{this, tVar}) : a2(tVar);
    }

    static {
        kge.a(525426989);
        DEFAULT_WIDTH = com.taobao.android.detail.ttdetail.utils.f.a(75.0f);
        DEFAULT_FIRST_COLUMN_WIDTH = com.taobao.android.detail.ttdetail.utils.f.a(90.0f);
        DEFAULT_HEIGHT = com.taobao.android.detail.ttdetail.utils.f.a(38.0f);
        DEFAULT_TEXT_SIZE = com.taobao.android.detail.ttdetail.utils.f.a(10.0f);
        DEFAULT_TEXT_PADDING = com.taobao.android.detail.ttdetail.utils.f.a(5.0f);
    }

    public t(Context context) {
        super(context);
        this.g = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_measures_layout, (ViewGroup) null);
        this.i = (RecyclerView) this.g.findViewById(R.id.titleColumn);
        this.h = (RecyclerView) this.g.findViewById(R.id.dataColumn);
        this.j = this.g.findViewById(R.id.shadow);
        this.k = (TextView) this.g.findViewById(R.id.container_title);
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

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.t tVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b73482f2", new Object[]{this, tVar});
        }
        this.l = tVar.f10893a;
        ArrayList<SizeChartItemModel> arrayList = this.l;
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.f10821a);
        }
        if (!TextUtils.isEmpty(tVar.b)) {
            this.k.setText(tVar.b);
            this.k.setVisibility(0);
        }
        int size = this.l.get(0).rowData.size() + 1;
        int i2 = DEFAULT_HEIGHT * size;
        int i3 = (this.l.get(0).maxLength * DEFAULT_TEXT_SIZE) + (DEFAULT_TEXT_PADDING << 1);
        int i4 = DEFAULT_FIRST_COLUMN_WIDTH;
        if (i4 > i3) {
            i3 = i4;
        }
        this.m = new syp(this.f10821a, this.l.get(0));
        this.m.b(i3);
        this.i.setLayoutManager(new LinearLayoutManager(this.f10821a, 1, false));
        a(this.i, i3, i2);
        this.i.setAdapter(this.m);
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 1; i5 < this.l.size(); i5++) {
            SizeChartItemModel sizeChartItemModel = this.l.get(i5);
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
        this.n = new syo(this.f10821a, arrayList2);
        if (!arrayList2.isEmpty()) {
            int width = ((((WindowManager) this.f10821a.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getWidth() - i3) - this.j.getLayoutParams().width) / arrayList2.size();
            int i8 = DEFAULT_WIDTH;
            if (width < i8) {
                width = i8;
            }
            int size3 = arrayList2.size();
            int width2 = this.h.getWidth();
            if (width2 > 0 && size3 * width < width2) {
                width = width2 / size3;
            }
            this.n.a(width);
        }
        this.n.b(i2);
        this.h.setLayoutManager(new LinearLayoutManager(this.f10821a, 0, false));
        a(this.h, -2, i2);
        this.h.setAdapter(this.n);
        return this.g;
    }
}
