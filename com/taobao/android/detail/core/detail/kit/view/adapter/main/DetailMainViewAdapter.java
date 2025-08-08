package com.taobao.android.detail.core.detail.kit.view.adapter.main;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.l;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.tstudio.TStudioHelper;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.eap;
import tb.ear;
import tb.eaz;
import tb.ecu;
import tb.emu;
import tb.eoz;
import tb.epv;
import tb.fvb;
import tb.fve;
import tb.kge;

/* loaded from: classes4.dex */
public class DetailMainViewAdapter extends BaseAdapter implements l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailMainViewAdapter";
    public Activity mActivity;
    public HashMap<Integer, c> mComponentMap = new HashMap<>();
    public List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> mDataSource;

    static {
        kge.a(571687074);
        kge.a(1523133239);
    }

    public static /* synthetic */ Object ipc$super(DetailMainViewAdapter detailMainViewAdapter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : i;
    }

    public DetailMainViewAdapter(Activity activity) {
        this.mActivity = activity;
        emu.a("com.taobao.android.detail.core.detail.kit.view.adapter.main.DetailMainViewAdapter");
    }

    public void setDataSource(List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88534c5f", new Object[]{this, list});
            return;
        }
        this.mDataSource = list;
        for (c cVar : this.mComponentMap.values()) {
            cVar.a();
        }
        this.mComponentMap.clear();
        if (ecu.H) {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar : this.mDataSource) {
                    if (bVar instanceof com.taobao.android.detail.core.model.viewmodel.main.c) {
                        arrayList.add(((com.taobao.android.detail.core.model.viewmodel.main.c) bVar).d);
                        arrayList2.add(((com.taobao.android.detail.core.model.viewmodel.main.c) bVar).dmComponent);
                    }
                }
                TStudioHelper.a().a((List<? extends Object>) arrayList2);
            } catch (Throwable unused) {
            }
        }
        if (!eaz.a(this.mActivity)) {
            downLoadDinamicTemplate();
        } else {
            downLoadDinamicTemplateV3();
        }
    }

    public HashSet<c> getComponentList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("7ef7a5a9", new Object[]{this}) : new HashSet<>(this.mComponentMap.values());
    }

    public c getComponentByPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8f48e1ee", new Object[]{this, new Integer(i)});
        }
        HashMap<Integer, c> hashMap = this.mComponentMap;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(Integer.valueOf(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list = this.mDataSource;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        if (i >= this.mDataSource.size() || (list = this.mDataSource) == null) {
            return null;
        }
        return list.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        eap a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = j.a(TAG);
        i.d(a3, "getView at " + i + " start ");
        if (view == null) {
            com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) getItem(i);
            g a4 = n.a(this.mActivity);
            if (a4 == null) {
                throw new IllegalArgumentException("DetailMainViewAdapter : detailSdk not create");
            }
            if (bVar.component != null && bVar.component.key != null && bVar.component.ruleId != null) {
                String a5 = j.a(TAG);
                i.d(a5, "getView key: " + bVar.component.key + " ruleId:" + bVar.component.ruleId);
            }
            c<com.taobao.android.detail.datasdk.model.viewmodel.main.b> cVar = null;
            if (!epv.c || (a2 = ((DetailCoreActivity) this.mActivity).y().u().a((com.taobao.android.detail.core.async.c<com.taobao.android.detail.datasdk.model.viewmodel.main.b>) bVar)) == null) {
                view2 = view;
            } else {
                view2 = a2.j();
                if (view2 != null) {
                    setViewLayoutParams(view2);
                    View wrapperItemView = getWrapperItemView(view, view2);
                    a2.i();
                    view2 = wrapperItemView;
                    cVar = a2;
                }
            }
            if (cVar == null) {
                cVar = a4.a(this.mActivity, bVar);
                if (cVar == null) {
                    return getEmptyView(this.mActivity);
                }
                View a6 = cVar.a((c<com.taobao.android.detail.datasdk.model.viewmodel.main.b>) bVar, viewGroup);
                if (a6 == null) {
                    a6 = getEmptyView(this.mActivity);
                } else {
                    setViewLayoutParams(a6);
                }
                view = getWrapperItemView(view, a6);
                cVar.b(bVar);
            } else {
                view = view2;
            }
            view.setTag(cVar);
            this.mComponentMap.put(Integer.valueOf(i), cVar);
        } else {
            Object tag = view.getTag();
            if (tag instanceof eap) {
                eap eapVar = (eap) tag;
                com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar2 = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) getItem(i);
                if ((!eapVar.d() || bVar2.isNeedRedraw()) && (bVar2 instanceof com.taobao.android.detail.core.model.viewmodel.main.c)) {
                    view = getWrapperItemView(view, redraw(view, eapVar, bVar2, viewGroup));
                }
            } else if (tag instanceof c) {
                c cVar2 = (c) tag;
                com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar3 = (com.taobao.android.detail.datasdk.model.viewmodel.main.b) getItem(i);
                if (bVar3.isNeedRedraw()) {
                    view = getWrapperItemView(view, redraw(view, cVar2, bVar3, viewGroup));
                }
            }
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        String a7 = j.a(TAG);
        i.d(a7, "getView cost " + (currentTimeMillis2 - currentTimeMillis) + "ms");
        return view;
    }

    private View getWrapperItemView(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2b2270de", new Object[]{this, view, view2});
        }
        i.d(TAG, "getWrapperItemView");
        if (view == null) {
            view = new WrapperViewGroup(this.mActivity);
            view.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
        }
        if (!(view instanceof ViewGroup)) {
            return view2;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        viewGroup.removeAllViews();
        viewGroup.addView(view2);
        return view;
    }

    private View redraw(View view, c cVar, com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3e60709e", new Object[]{this, view, cVar, bVar, viewGroup});
        }
        bVar.resetRedraw();
        View a2 = cVar.a((c) bVar, viewGroup);
        cVar.b(bVar);
        setViewLayoutParams(a2);
        a2.setTag(cVar);
        return a2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aaed7894", new Object[]{this})).intValue() : getCount();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        HashMap<Integer, c> hashMap = this.mComponentMap;
        if (hashMap == null) {
            return;
        }
        for (c cVar : hashMap.values()) {
            cVar.a();
        }
        this.mComponentMap.clear();
    }

    private void setViewLayoutParams(View view) {
        AbsListView.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903ae1f4", new Object[]{this, view});
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = new AbsListView.LayoutParams(-1, -2);
        } else {
            layoutParams = new AbsListView.LayoutParams(layoutParams2);
        }
        view.setLayoutParams(layoutParams);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view).setDescendantFocusability(393216);
    }

    private View getEmptyView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7bc574c7", new Object[]{this, context});
        }
        View view = new View(context);
        view.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        return view;
    }

    private void downLoadDinamicTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdd6a28", new Object[]{this});
        } else if (getCount() != 0) {
            ArrayList arrayList = new ArrayList();
            for (com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar : this.mDataSource) {
                if (bVar instanceof com.taobao.android.detail.core.model.viewmodel.main.c) {
                    com.taobao.android.detail.core.model.viewmodel.main.c cVar = (com.taobao.android.detail.core.model.viewmodel.main.c) bVar;
                    DinamicTemplate dinamicTemplate = new DinamicTemplate();
                    dinamicTemplate.templateUrl = cVar.d.b;
                    dinamicTemplate.name = cVar.d.f9766a;
                    dinamicTemplate.version = cVar.d.d;
                    arrayList.add(dinamicTemplate);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            ear.b().a(arrayList, new b(this));
        }
    }

    private void downLoadDinamicTemplateV3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6009fa05", new Object[]{this});
        } else if (getCount() != 0) {
            bd bdVar = null;
            ArrayList arrayList = new ArrayList();
            Activity activity = this.mActivity;
            if (activity instanceof DetailCoreActivity) {
                bdVar = ((DetailCoreActivity) activity).d;
            }
            if (bdVar == null) {
                return;
            }
            for (com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar : this.mDataSource) {
                if (bVar instanceof com.taobao.android.detail.core.model.viewmodel.main.c) {
                    com.taobao.android.detail.core.model.viewmodel.main.c cVar = (com.taobao.android.detail.core.model.viewmodel.main.c) bVar;
                    DXTemplateItem dXTemplateItem = new DXTemplateItem();
                    dXTemplateItem.c = cVar.d.b;
                    dXTemplateItem.f11925a = cVar.d.f9766a;
                    try {
                        dXTemplateItem.b = Long.parseLong(cVar.d.d);
                        if (eaz.a(this.mActivity) && !StringUtils.isEmpty(cVar.d.c)) {
                            dXTemplateItem.c = cVar.d.c;
                        }
                        arrayList.add(dXTemplateItem);
                    } catch (Exception e) {
                        i.a(TAG, "Fail to parse template version", e);
                    }
                }
            }
            bdVar.a(new a(this));
            if (arrayList.isEmpty()) {
                return;
            }
            bdVar.a(arrayList);
        }
    }

    @Override // com.taobao.android.detail.core.open.l
    public eoz getMessageChannel(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eoz) ipChange.ipc$dispatch("ed3ce113", new Object[]{this, str});
        }
        List<com.taobao.android.detail.datasdk.model.viewmodel.main.b> list = this.mDataSource;
        if (list != null && str != null) {
            for (com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar : list) {
                if (str.equals(bVar.getkey())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    /* loaded from: classes4.dex */
    public static class b implements com.taobao.android.dinamic.tempate.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DetailMainViewAdapter> f9554a;

        static {
            kge.a(1250663258);
            kge.a(1959141503);
        }

        public b(DetailMainViewAdapter detailMainViewAdapter) {
            this.f9554a = new WeakReference<>(detailMainViewAdapter);
        }

        @Override // com.taobao.android.dinamic.tempate.a
        public void a(com.taobao.android.dinamic.tempate.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fab23079", new Object[]{this, bVar});
                return;
            }
            if (ecu.h && bVar != null) {
                i.d("detail_dinamic", "dinamic downloader callback");
                Iterator<DinamicTemplate> it = bVar.b.iterator();
                while (it.hasNext()) {
                    i.d("detail_dinamic", "this time template: " + it.next().toString());
                }
            }
            if (bVar == null || bVar.b.size() <= 0 || this.f9554a.get() == null) {
                return;
            }
            this.f9554a.get().notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements fve {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DetailMainViewAdapter> f9553a;

        static {
            kge.a(1548281830);
            kge.a(-1579893205);
        }

        public a(DetailMainViewAdapter detailMainViewAdapter) {
            this.f9553a = new WeakReference<>(detailMainViewAdapter);
        }

        @Override // tb.fve
        public void onNotificationListener(fvb fvbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
            } else if (fvbVar == null || fvbVar.f28139a.size() <= 0 || this.f9553a.get() == null) {
            } else {
                this.f9553a.get().notifyDataSetChanged();
            }
        }
    }
}
