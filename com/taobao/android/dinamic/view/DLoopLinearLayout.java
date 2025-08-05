package com.taobao.android.dinamic.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.d;
import com.taobao.android.dinamic.j;
import com.taobao.android.dinamic.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.fnk;
import tb.fpd;
import tb.fpq;
import tb.kge;

/* loaded from: classes5.dex */
public class DLoopLinearLayout extends DLinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DLoopLinearLayout";
    public final a recycledPool;
    private Map<Integer, b> templateViews;
    private int viewTypeFlag;

    /* loaded from: classes5.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f11770a;
        public View b;
        public String c;
        public String d;

        static {
            kge.a(-937950473);
        }

        public b() {
        }
    }

    static {
        kge.a(1663450688);
    }

    public static /* synthetic */ Object ipc$super(DLoopLinearLayout dLoopLinearLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 64333381:
                return super.getChildAt(((Number) objArr[0]).intValue());
            case 1273305472:
                super.removeViewAt(((Number) objArr[0]).intValue());
                return null;
            case 1502719299:
                return new Integer(super.getChildCount());
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public DLoopLinearLayout(Context context) {
        super(context);
        this.viewTypeFlag = 0;
        this.templateViews = new LinkedHashMap();
        this.recycledPool = new a();
    }

    public DLoopLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.viewTypeFlag = 0;
        this.templateViews = new LinkedHashMap();
        this.recycledPool = new a();
    }

    public DLoopLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.viewTypeFlag = 0;
        this.templateViews = new LinkedHashMap();
        this.recycledPool = new a();
    }

    public Map<Integer, b> cloneTemplateViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c1908a73", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.templateViews);
        return linkedHashMap;
    }

    public void setTemplateViews(Map<Integer, b> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9898f60c", new Object[]{this, map});
        } else {
            this.templateViews = map;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
            return;
        }
        view.setLayoutParams(layoutParams);
        addViewInfo(view);
        removeBindList(view);
    }

    private void removeBindList(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("930e32ec", new Object[]{this, view});
            return;
        }
        ArrayList<View> arrayList = (ArrayList) getTag(j.TAG_DINAMIC_BIND_DATA_LIST);
        fpq fpqVar = (fpq) view.getTag(j.PROPERTY_KEY);
        if (!fpqVar.c.isEmpty() || !fpqVar.d.isEmpty()) {
            arrayList.remove(view);
        }
        if (!isViewGroup(view)) {
            return;
        }
        recursiveViewTree(view, arrayList);
    }

    private boolean isViewGroup(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("465d6a1f", new Object[]{this, view})).booleanValue();
        }
        if (view instanceof DLoopLinearLayout) {
            return false;
        }
        return (view instanceof DLinearLayout) || (view instanceof DFrameLayout);
    }

    private void recursiveViewTree(View view, ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1972c54", new Object[]{this, view, arrayList});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            fpq fpqVar = (fpq) childAt.getTag(j.PROPERTY_KEY);
            if (fpqVar != null && (!fpqVar.c.isEmpty() || !fpqVar.d.isEmpty())) {
                arrayList.remove(childAt);
            }
            if (isViewGroup(childAt)) {
                recursiveViewTree(childAt, arrayList);
            }
        }
    }

    private void addViewInfo(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab2d1b7", new Object[]{this, view});
            return;
        }
        for (Map.Entry<Integer, b> entry : this.templateViews.entrySet()) {
            if (view == entry.getValue().b) {
                return;
            }
        }
        fpq a2 = l.a(view);
        b bVar = new b();
        bVar.b = view;
        bVar.f11770a = this.viewTypeFlag;
        bVar.d = a2.f28098a;
        if (a2.b.containsKey("dFilter")) {
            bVar.c = String.valueOf(a2.b.get("dFilter"));
        } else {
            bVar.c = a2.c.get("dFilter");
        }
        this.templateViews.put(Integer.valueOf(bVar.f11770a), bVar);
        view.setTag(j.VIEW_TYPE_KEY, Integer.valueOf(bVar.f11770a));
        this.viewTypeFlag++;
    }

    public void bindListData(fpd fpdVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86851f13", new Object[]{this, fpdVar, list});
        } else {
            bindChildView(fpdVar, list);
        }
    }

    public void bindChildView(fpd fpdVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fc9fff2", new Object[]{this, fpdVar, list});
        } else if (this.templateViews.size() == 0 || list == null || list.size() == 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                recyleView(childCount);
            }
        } else {
            if (getChildCount() > list.size()) {
                for (int childCount2 = getChildCount() - 1; childCount2 >= list.size(); childCount2--) {
                    recyleView(childCount2);
                }
            }
            d a2 = d.a(fpdVar.b());
            Object a3 = fpdVar.a();
            for (int i = 0; i < list.size(); i++) {
                fpdVar.a(getBindData(list.get(i)));
                int itemViewType = getItemViewType(fpdVar);
                if (itemViewType == -1) {
                    super.addView(new CompatibleView(getContext(), "no view match data"), i);
                } else {
                    View view = null;
                    if (i < getChildCount()) {
                        View childAt = getChildAt(i);
                        Integer num = (Integer) childAt.getTag(j.VIEW_TYPE_KEY);
                        if (num == null || itemViewType != num.intValue()) {
                            recyleView(i);
                        } else {
                            view = childAt;
                        }
                    }
                    if (view == null) {
                        view = getCacheView(itemViewType);
                        if (view == null) {
                            com.taobao.android.dinamic.view.b a4 = a2.a(this.templateViews.get(Integer.valueOf(itemViewType)).b, getContext(), fpdVar);
                            View e = a4.e();
                            e.setTag(j.TAG_ROOT_VIEW_RESULT, a4);
                            e.setTag(j.VIEW_TYPE_KEY, Integer.valueOf(itemViewType));
                            view = e;
                        }
                        super.addView(view, i, view.getLayoutParams());
                    }
                    com.taobao.android.dinamic.view.b bVar = (com.taobao.android.dinamic.view.b) view.getTag(j.TAG_ROOT_VIEW_RESULT);
                    if (bVar != null) {
                        a2.a(bVar.f(), fpdVar);
                    }
                }
            }
            fpdVar.a(a3);
        }
    }

    private Object getBindData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3036ff52", new Object[]{this, obj});
        }
        if (!(obj instanceof String)) {
            return obj;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", obj);
        return jSONObject;
    }

    private View getCacheView(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3c4066ed", new Object[]{this, new Integer(i)}) : this.recycledPool.a(i);
    }

    public int getItemViewType(fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3739af8", new Object[]{this, fpdVar})).intValue();
        }
        for (Map.Entry<Integer, b> entry : this.templateViews.entrySet()) {
            b value = entry.getValue();
            if (value.c == null) {
                if (this.templateViews.size() == 1) {
                    return value.f11770a;
                }
            } else if ("true".equals(value.c)) {
                return value.f11770a;
            } else {
                Object a2 = fnk.a(value.c, value.d, fpdVar);
                if (a2 != null && (((a2 instanceof Boolean) && ((Boolean) a2).booleanValue()) || ((a2 instanceof String) && "true".equals(a2.toString())))) {
                    return value.f11770a;
                }
            }
        }
        return -1;
    }

    private void recyleView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4827d8d5", new Object[]{this, new Integer(i)});
        } else if (i >= super.getChildCount()) {
        } else {
            View childAt = super.getChildAt(i);
            super.removeViewAt(i);
            Integer num = (Integer) childAt.getTag(j.VIEW_TYPE_KEY);
            if (num == null) {
                return;
            }
            this.recycledPool.a(num.intValue(), childAt);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private SparseArray<ArrayList<View>> f11769a = new SparseArray<>();
        private SparseIntArray b = new SparseIntArray();

        static {
            kge.a(-2001111626);
        }

        public View a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
            }
            ArrayList<View> arrayList = this.f11769a.get(i);
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            int size = arrayList.size() - 1;
            View view = arrayList.get(size);
            arrayList.remove(size);
            return view;
        }

        public void a(int i, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11131157", new Object[]{this, new Integer(i), view});
                return;
            }
            ArrayList<View> b = b(i);
            if (this.b.get(i) <= b.size()) {
                return;
            }
            b.add(view);
        }

        private ArrayList<View> b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("b2faef14", new Object[]{this, new Integer(i)});
            }
            ArrayList<View> arrayList = this.f11769a.get(i);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f11769a.put(i, arrayList);
                if (this.b.indexOfKey(i) < 0) {
                    this.b.put(i, 10);
                }
            }
            return arrayList;
        }
    }
}
