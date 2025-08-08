package com.taobao.android.dinamic;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.view.CompatibleView;
import com.taobao.android.dinamic.view.DFrameLayout;
import com.taobao.android.dinamic.view.DLinearLayout;
import com.taobao.android.dinamic.view.DLoopLinearLayout;
import com.taobao.android.dinamic.view.a;
import com.taobao.android.dinamic.view.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import tb.fni;
import tb.fpa;
import tb.fpb;
import tb.fpd;
import tb.fph;
import tb.fpn;
import tb.fpq;
import tb.fpy;
import tb.fqi;
import tb.fuw;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DViewGenerator";

    /* renamed from: a  reason: collision with root package name */
    private String f11736a;
    private ArrayDeque<View> b = new ArrayDeque<>(16);

    static {
        kge.a(-1735319011);
    }

    public static /* synthetic */ String a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("615ff75a", new Object[]{dVar}) : dVar.f11736a;
    }

    public d(String str) {
        this.f11736a = "default";
        this.f11736a = str;
    }

    public static d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("c5827002", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return e.a("default").f11752a;
        }
        return e.a(str).f11752a;
    }

    public b a(Context context, ViewGroup viewGroup, DinamicTemplate dinamicTemplate, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("fbef96cb", new Object[]{this, context, viewGroup, dinamicTemplate, obj});
        }
        long nanoTime = System.nanoTime();
        if (context == null || dinamicTemplate == null || !dinamicTemplate.checkValid()) {
            b bVar = new b(this.f11736a);
            bVar.a((View) null);
            bVar.a(dinamicTemplate);
            bVar.b().a(a.ERROR_CODE_TEMPLATE_INFO_ERROR, dinamicTemplate != null ? dinamicTemplate.toString() : "context=null or exactTemplate=null");
            a(bVar, System.nanoTime() - nanoTime);
            return bVar;
        }
        a(dinamicTemplate);
        b bVar2 = new b(this.f11736a);
        XmlPullParser a2 = fph.a(this.f11736a, dinamicTemplate, bVar2);
        long nanoTime2 = System.nanoTime();
        if (a2 != null) {
            try {
                bVar2.a(dinamicTemplate);
                bVar2.a(new ArrayList<>(20));
                fpd.a aVar = new fpd.a();
                aVar.a(bVar2);
                aVar.a(this.f11736a);
                aVar.a(obj);
                View inflate = i.a(context, aVar.a()).inflate(a2, (ViewGroup) null);
                if (inflate instanceof CompatibleView) {
                    a(bVar2, System.nanoTime() - nanoTime2);
                    return bVar2;
                }
                fpn.a(inflate, viewGroup);
                fpq fpqVar = (fpq) inflate.getTag(j.PROPERTY_KEY);
                Object obj2 = fpqVar.b.get(f.c);
                Object obj3 = fpqVar.b.get(f.d);
                if (obj2 != null) {
                    dinamicTemplate.setCompilerVersion(String.valueOf(obj2));
                } else {
                    dinamicTemplate.setCompilerVersion(f.b);
                }
                if (obj3 != null) {
                    dinamicTemplate.setInterpreterVersion(String.valueOf(obj3));
                } else {
                    dinamicTemplate.setInterpreterVersion(f.b);
                }
                inflate.setTag("dinamicRootView");
                inflate.setTag(j.TAG_ROOT_VIEW_RESULT, bVar2);
                bVar2.a(inflate);
                a(bVar2, System.nanoTime() - nanoTime2);
                return bVar2;
            } catch (Throwable th) {
                bVar2.a(dinamicTemplate);
                bVar2.b().a("other", "inflateViewFailed");
                fpa.a(TAG, this.f11736a + "infalte dinamic view failed", th);
                a(bVar2, System.nanoTime() - nanoTime2);
                return bVar2;
            }
        }
        bVar2.a(dinamicTemplate);
        bVar2.b().a(a.ERROR_CODE_TEMPLATE_NOT_FOUND, dinamicTemplate.toString());
        a(bVar2, System.nanoTime() - nanoTime2);
        return bVar2;
    }

    public b a(Context context, ViewGroup viewGroup, DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f208262f", new Object[]{this, context, viewGroup, dinamicTemplate}) : a(context, viewGroup, dinamicTemplate, (Object) null);
    }

    public b a(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1efd81e8", new Object[]{this, view, obj, obj2}) : a(view, obj, false, obj2);
    }

    public b a(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("befa8e8c", new Object[]{this, view, obj}) : a(view, obj, false, (Object) null);
    }

    private void a(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbc25672", new Object[]{this, dinamicTemplate});
        } else if (c.a().c() == null || !fpb.a()) {
        } else {
            c.a().c().a(this.f11736a, dinamicTemplate);
        }
    }

    private void b(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1565f73", new Object[]{this, dinamicTemplate});
        } else if (c.a().c() == null || !fpb.a()) {
        } else {
            c.a().c().b(this.f11736a, dinamicTemplate);
        }
    }

    private void a(final b bVar, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdf2d16", new Object[]{this, bVar, new Long(j)});
        } else if (c.a().b() == null || !fpb.a()) {
        } else {
            fpb.f28086a.a(new Runnable() { // from class: com.taobao.android.dinamic.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (e.a()) {
                        fpa.a(e.TAG, "createView template=" + bVar.a() + "consumimg=" + (j / 1000000.0d));
                    }
                    c.a().b().a(d.a(d.this), bVar.a(), bVar.c(), bVar.c() ? null : bVar.b(), j / 1000000.0d);
                }
            });
        }
    }

    private b a(View view, Object obj, boolean z, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("11713ff0", new Object[]{this, view, obj, new Boolean(z), obj2});
        }
        if (view == null || obj == null) {
            b bVar = new b(this.f11736a);
            bVar.b().a("other", "binddata rootView or data is null");
            return bVar;
        }
        b bVar2 = (b) view.getTag(j.TAG_ROOT_VIEW_RESULT);
        if (bVar2 == null) {
            View findViewWithTag = view.findViewWithTag("dinamicRootView");
            if (findViewWithTag == null) {
                b bVar3 = new b(this.f11736a);
                bVar3.b().a("other", "binddata rootView or data is null");
                return bVar3;
            }
            bVar2 = (b) findViewWithTag.getTag(j.TAG_ROOT_VIEW_RESULT);
            if (bVar2 == null) {
                b bVar4 = new b(this.f11736a);
                bVar4.b().a("other", "binddata rootView or data is null");
                return bVar4;
            }
        }
        b(bVar2.a());
        fpd.a aVar = new fpd.a();
        aVar.a(obj2);
        aVar.a(this.f11736a);
        aVar.a(bVar2);
        aVar.b(obj);
        aVar.c(obj);
        return a(aVar.a());
    }

    private b a(fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("54153f84", new Object[]{this, fpdVar});
        }
        long nanoTime = System.nanoTime();
        b c = fpdVar.c();
        Iterator<View> it = c.f().iterator();
        while (it.hasNext()) {
            View next = it.next();
            try {
                g.a(next, fpdVar);
            } catch (Throwable unused) {
                a b = c.b();
                b.a("other", next.getClass() + "bind data failed;");
            }
        }
        b(c, System.nanoTime() - nanoTime);
        return c;
    }

    private void b(final b bVar, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("887f5817", new Object[]{this, bVar, new Long(j)});
        } else if (c.a().b() == null || !fpb.a()) {
        } else {
            fpb.f28086a.a(new Runnable() { // from class: com.taobao.android.dinamic.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (e.a()) {
                        fpa.a(e.TAG, "bindData template=" + bVar.a() + "consuming=" + (j / 1000000.0d));
                    }
                    c.a().b().b(d.a(d.this), bVar.a(), bVar.d(), bVar.d() ? null : bVar.b(), j / 1000000.0d);
                }
            });
        }
    }

    public void a(ArrayList<View> arrayList, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de49398", new Object[]{this, arrayList, fpdVar});
            return;
        }
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            View next = it.next();
            try {
                g.a(next, fpdVar);
            } catch (Throwable unused) {
                a b = fpdVar.c().b();
                b.a("other", next.getClass() + "bind data failed;");
            }
        }
    }

    private boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        if ("noneNeedBindChild".equals(view.getTag()) || (view instanceof DLoopLinearLayout)) {
            return false;
        }
        return (view instanceof DLinearLayout) || (view instanceof DFrameLayout);
    }

    public b a(View view, Context context, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("977be33a", new Object[]{this, view, context, fpdVar});
        }
        b bVar = new b(this.f11736a);
        bVar.a(new ArrayList<>(20));
        View a2 = k.a(context, view, bVar, fpdVar);
        if (a2 == null) {
            bVar.a((View) null);
            return bVar;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            a2.setLayoutParams(layoutParams);
        }
        if (!(view instanceof ViewGroup)) {
            bVar.a(a2);
            return bVar;
        }
        a(context, view, a2, bVar, fpdVar);
        bVar.a(a2);
        return bVar;
    }

    private void a(Context context, View view, View view2, b bVar, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c77530c", new Object[]{this, context, view, view2, bVar, fpdVar});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            View a2 = k.a(context, childAt, bVar, fpdVar);
            if (a2 != null) {
                ((ViewGroup) view2).addView(a2, childAt.getLayoutParams());
                if (a(childAt)) {
                    a(context, childAt, a2, bVar, fpdVar);
                }
            }
        }
    }

    public void a(Context context, List<DinamicTemplate> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9773151", new Object[]{this, context, list});
        } else if (!fqi.n(this.f11736a) || context == null || list == null || list.size() == 0) {
        } else {
            com.taobao.android.dinamic.dinamic.f.a(new fni(context, this.f11736a, list));
        }
    }

    public b b(Context context, ViewGroup viewGroup, DinamicTemplate dinamicTemplate, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3a83526a", new Object[]{this, context, viewGroup, dinamicTemplate, obj});
        }
        if (dinamicTemplate == null || context == null) {
            return null;
        }
        b a2 = fpy.a().a(context, dinamicTemplate, this.f11736a);
        if (a2 == null) {
            return a(context, viewGroup, dinamicTemplate, obj);
        }
        fuw.d("命中2.0预加载view:  " + dinamicTemplate.toString());
        return a2;
    }
}
