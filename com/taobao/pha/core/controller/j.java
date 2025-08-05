package com.taobao.pha.core.controller;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.p;
import com.taobao.pha.core.ui.fragment.AppFragment;
import com.taobao.pha.core.ui.fragment.SubFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18722a;
    private final AppController b;
    private ValueAnimator d;
    private final List<k> c = new ArrayList();
    private int e = 0;

    public static /* synthetic */ List a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bd63423e", new Object[]{jVar}) : jVar.c;
    }

    public static /* synthetic */ void a(j jVar, FragmentManager fragmentManager, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7701ce84", new Object[]{jVar, fragmentManager, new Boolean(z), str});
        } else {
            jVar.a(fragmentManager, z, str);
        }
    }

    public static /* synthetic */ AppController b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("1e7d8e7a", new Object[]{jVar}) : jVar.b;
    }

    static {
        kge.a(-1055891593);
        f18722a = j.class.getSimpleName();
    }

    public List<k> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.c;
    }

    public j(AppController appController) {
        this.b = appController;
    }

    public boolean a(PageModel pageModel) {
        PageModel pageModel2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("737dfcc0", new Object[]{this, pageModel})).booleanValue();
        }
        if (PHAContainerType.MINIAPP.equals(this.b.p())) {
            return c(pageModel);
        }
        if (!d()) {
            return false;
        }
        try {
            Object json = JSONObject.toJSON(pageModel);
            if ((json instanceof JSON) && (pageModel2 = (PageModel) JSONObject.toJavaObject((JSON) json, PageModel.class)) != null) {
                return c(pageModel2, 1);
            }
        } catch (Exception e) {
            ngr.b(f18722a, ngn.a(e));
        }
        return false;
    }

    private boolean c(PageModel pageModel) {
        FragmentManager i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("824866fe", new Object[]{this, pageModel})).booleanValue();
        }
        if (!d()) {
            return false;
        }
        try {
            Object json = JSONObject.toJSON(pageModel);
            if (!(json instanceof JSON) || ((PageModel) JSONObject.toJavaObject((JSON) json, PageModel.class)) == null || (i = i()) == null) {
                return false;
            }
            Fragment instantiate = Fragment.instantiate(this.b.C(), SubFragment.class.getName());
            i.beginTransaction().replace(R.id.tab_page_container, instantiate, instantiate.getClass().getSimpleName()).commitNowAllowingStateLoss();
            k b = this.b.Q().b(pageModel);
            com.taobao.pha.core.phacontainer.c c = b.c();
            if (c == null) {
                return false;
            }
            if (this.b.q() != null) {
                this.b.q().a(pageModel);
            }
            if (c instanceof com.taobao.pha.core.phacontainer.e) {
                ((com.taobao.pha.core.phacontainer.e) c).setAppearNavigationType("push");
            }
            FragmentManager childFragmentManager = instantiate.getChildFragmentManager();
            if (c instanceof Fragment) {
                childFragmentManager.beginTransaction().add(R.id.pha_sub_container, (Fragment) c, "sub_page_fragment_" + this.c.size()).commitNowAllowingStateLoss();
                this.c.add(b);
            }
            return true;
        } catch (Exception e) {
            ngr.b(f18722a, ngn.a(e));
        }
        return false;
    }

    public k b(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("220e4abb", new Object[]{this, pageModel});
        }
        if (TextUtils.isEmpty(pageModel.backgroundColor) && this.b.u() != null) {
            pageModel.backgroundColor = this.b.u().backgroundColor;
            ManifestModel.setUpLayoutIndex(this.b.u(), pageModel, this.b.t());
        }
        pageModel.setSubPage(true);
        return new k(this.b, pageModel);
    }

    public k b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("ae5f26d", new Object[]{this});
        }
        if (this.c.size() <= 0) {
            return null;
        }
        List<k> list = this.c;
        return list.get(list.size() - 1);
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.e != 0) {
        } else {
            this.e = 2;
            ngr.b(f18722a, "navigator source inner");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e != 0) {
        } else {
            this.e = 1;
            ngr.b(f18722a, "navigator source outer");
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e != 1;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e != 2;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.b.D().back();
    }

    public boolean a(PageModel pageModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc420dcb", new Object[]{this, pageModel, new Integer(i)})).booleanValue();
        }
        if (!d()) {
            return false;
        }
        int j = j();
        int size = this.c.size();
        if (size >= j) {
            String str = f18722a;
            ngr.b(str, "current page size " + size);
            return false;
        }
        boolean c = c(pageModel, i);
        if (c) {
            h();
        }
        return c;
    }

    private boolean c(PageModel pageModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6c4eb4d", new Object[]{this, pageModel, new Integer(i)})).booleanValue();
        }
        final FragmentManager i2 = i();
        if (i2 == null) {
            return false;
        }
        Fragment r = this.b.r();
        if (!(r instanceof AppFragment)) {
            return false;
        }
        String url = pageModel.getUrl();
        if (!TextUtils.isEmpty(url) && !this.b.D().isTrustedUrl(url)) {
            return false;
        }
        ((AppFragment) r).addSubPageContainer();
        final k b = b(pageModel);
        com.taobao.pha.core.phacontainer.c c = b.c();
        if (c == null) {
            return false;
        }
        if (this.b.q() != null) {
            this.b.q().a(pageModel);
        }
        if (c instanceof com.taobao.pha.core.phacontainer.e) {
            ((com.taobao.pha.core.phacontainer.e) c).setAppearNavigationType("push");
        }
        String str = "sub_page_fragment_" + this.c.size();
        FragmentTransaction beginTransaction = i2.beginTransaction();
        if (i == 1) {
            beginTransaction.setCustomAnimations(R.anim.sub_fragment_slide_in, 0, 0, R.anim.sub_fragment_slide_out);
        }
        beginTransaction.add(R.id.pha_sub_page_container, (Fragment) c, str).addToBackStack(str).commitAllowingStateLoss();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.pha.core.controller.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                j.a(j.this, i2, false, "push");
                j.a(j.this).add(b);
            }
        }, a(i));
        return true;
    }

    public boolean b(PageModel pageModel, int i) {
        final FragmentManager i2;
        int size;
        k b;
        com.taobao.pha.core.phacontainer.c c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1837c8c", new Object[]{this, pageModel, new Integer(i)})).booleanValue();
        }
        if (!d() || (i2 = i()) == null || (size = this.c.size()) <= 0) {
            return false;
        }
        final Fragment findFragmentByTag = i2.findFragmentByTag("sub_page_fragment_" + (size - 1));
        if (findFragmentByTag == null || (c = (b = b(pageModel)).c()) == null) {
            return false;
        }
        String url = pageModel.getUrl();
        if (!TextUtils.isEmpty(url) && !this.b.D().isTrustedUrl(url)) {
            return false;
        }
        if (findFragmentByTag instanceof com.taobao.pha.core.phacontainer.e) {
            ((com.taobao.pha.core.phacontainer.e) findFragmentByTag).setDisappearNavigationType("redirectTo");
        }
        if (c instanceof com.taobao.pha.core.phacontainer.e) {
            ((com.taobao.pha.core.phacontainer.e) c).setAppearNavigationType("redirectTo");
        }
        int size2 = this.c.size() - 1;
        String str = "sub_page_fragment_" + size2;
        FragmentTransaction beginTransaction = i2.beginTransaction();
        if (i == 1) {
            beginTransaction.setCustomAnimations(R.anim.sub_fragment_slide_in, 0, 0, R.anim.sub_fragment_slide_out);
        }
        beginTransaction.add(R.id.pha_sub_page_container, (Fragment) c, str).addToBackStack(str).commitAllowingStateLoss();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.pha.core.controller.j.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FragmentTransaction beginTransaction2 = i2.beginTransaction();
                beginTransaction2.remove(findFragmentByTag);
                beginTransaction2.commitAllowingStateLoss();
            }
        }, a(i));
        this.c.remove(size2);
        this.c.add(b);
        h();
        return true;
    }

    public JSONObject g() {
        com.taobao.pha.core.phacontainer.c c;
        com.taobao.pha.core.phacontainer.c c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        if (!d()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        k w = this.b.w();
        if (w != null && (c2 = w.c()) != null && c2.mo1202getPageModel() != null) {
            jSONArray.add((JSONObject) JSONObject.toJSON(c2.mo1202getPageModel()));
        }
        for (k kVar : this.c) {
            if (kVar != null && (c = kVar.c()) != null && c.mo1202getPageModel() != null) {
                jSONArray.add((JSONObject) JSONObject.toJSON(c.mo1202getPageModel()));
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pages", (Object) jSONArray);
        h();
        return jSONObject;
    }

    public boolean a(int i, int i2) {
        final FragmentManager i3;
        ValueAnimator valueAnimator;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!d() || (i3 = i()) == null) {
            return false;
        }
        int size = this.c.size();
        if (i == 0 || size <= 0 || ((valueAnimator = this.d) != null && valueAnimator.isRunning())) {
            return false;
        }
        int i5 = size - 1;
        Fragment findFragmentByTag = i3.findFragmentByTag("sub_page_fragment_" + i5);
        if (findFragmentByTag != null && findFragmentByTag.getView() != null) {
            if (i < 0 || i > size) {
                i = size;
            }
            while (true) {
                i4 = size - i;
                if (i5 < i4) {
                    break;
                }
                this.c.remove(i5);
                i5--;
            }
            for (int i6 = size - 2; i6 >= i4; i6--) {
                Fragment findFragmentByTag2 = i3.findFragmentByTag("sub_page_fragment_" + i6);
                if (findFragmentByTag2 != null && findFragmentByTag2.getView() != null) {
                    findFragmentByTag2.getView().setVisibility(4);
                }
            }
            if (findFragmentByTag instanceof com.taobao.pha.core.phacontainer.e) {
                ((com.taobao.pha.core.phacontainer.e) findFragmentByTag).setDisappearNavigationType("pop");
            }
            a(i3, true, "pop");
            final String str = "sub_page_fragment_" + i4;
            final View view = findFragmentByTag.getView();
            final int width = view.getWidth();
            this.d = ValueAnimator.ofInt(0, width);
            this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.pha.core.controller.j.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                    view.setTranslationX(intValue);
                    if (intValue < width) {
                        return;
                    }
                    view.setVisibility(4);
                    i3.popBackStackImmediate(str, 1);
                    if (j.a(j.this).size() != 0) {
                        return;
                    }
                    Fragment r = j.b(j.this).r();
                    if (r instanceof AppFragment) {
                        ((AppFragment) r).removeSubPageContainer();
                    }
                    j.b(j.this).U();
                }
            });
            this.d.setDuration(a(i2));
            this.d.start();
            h();
            return true;
        }
        return false;
    }

    private FragmentManager i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("bfbdb0d7", new Object[]{this});
        }
        Fragment r = this.b.r();
        if (r == null) {
            return null;
        }
        return r.getChildFragmentManager();
    }

    private void a(FragmentManager fragmentManager, boolean z, String str) {
        k w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9de7a5", new Object[]{this, fragmentManager, new Boolean(z), str});
            return;
        }
        if (this.c.size() > 0) {
            w = b();
        } else {
            w = this.b.w();
        }
        com.taobao.pha.core.phacontainer.c cVar = null;
        if (w != null) {
            cVar = w.c();
        }
        if (!(cVar instanceof Fragment)) {
            return;
        }
        Fragment fragment = (Fragment) cVar;
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        FragmentManager fragmentManager2 = fragment.getFragmentManager();
        if (fragmentManager2 != null) {
            beginTransaction = fragmentManager2.beginTransaction();
        }
        if (z) {
            if (fragment instanceof com.taobao.pha.core.phacontainer.e) {
                ((com.taobao.pha.core.phacontainer.e) fragment).setAppearNavigationType(str);
            }
            beginTransaction.show(fragment);
        } else {
            if (fragment instanceof com.taobao.pha.core.phacontainer.e) {
                ((com.taobao.pha.core.phacontainer.e) fragment).setDisappearNavigationType(str);
            }
            beginTransaction.hide(fragment);
        }
        beginTransaction.commitAllowingStateLoss();
    }

    private int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(p.c().a("max_sub_page_size"));
        } catch (Throwable th) {
            th.printStackTrace();
            return 10;
        }
    }

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i != 1) {
            return 0;
        }
        try {
            Integer valueOf = Integer.valueOf(this.b.r().getResources().getInteger(17694721));
            if (valueOf != null) {
                return valueOf.intValue();
            }
            return 500;
        } catch (Throwable th) {
            ngr.b(f18722a, ngn.a(th));
            return 0;
        }
    }
}
